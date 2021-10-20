// **********************************************
// Situazione Vincolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneVincolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPOVINCOLO = 0;

  private static int PPQRY_PARAMETRI16 = 0;

  private static int PPQRY_VINCOLI = 1;


  IDPanel PAN_PARAMETRI;
  private static int GRP_SITUAZVINCOL_ENTRATA = 0;
  private static int GRP_SITUAZVINCOL_SPESA = 1;

  private static int PFL_SITUAZVINCOL_STANZIAMENTO = 0;
  private static int PFL_SITUAZVINCOL_RESIDUI = 1;
  private static int PFL_SITUAZVINCOL_ORDINATIVI = 2;
  private static int PFL_SITUAZVINCOL_ACCERTATO = 3;
  private static int PFL_SITUAZVINCOL_COMPETENZA = 4;
  private static int PFL_SITUAZVINCOL_TOTALI = 5;
  private static int PFL_SITUAZVINCOL_COMPETENZA1 = 6;
  private static int PFL_SITUAZVINCOL_RESIDUI1 = 7;
  private static int PFL_SITUAZVINCOL_ACCERTATO1 = 8;
  private static int PFL_SITUAZVINCOL_STANZIAMENT1 = 9;
  private static int PFL_SITUAZVINCOL_COMPETENZA2 = 10;
  private static int PFL_SITUAZVINCOL_RESIDUI2 = 11;
  private static int PFL_SITUAZVINCOL_TOTALI1 = 12;
  private static int PFL_SITUAZVINCOL_COMPETENZA3 = 13;
  private static int PFL_SITUAZVINCOL_RESIDUI3 = 14;
  private static int PFL_SITUAZVINCOL_IMPEGNATO = 15;
  private static int PFL_SITUAZVINCOL_MANDATI = 16;
  private static int PFL_SITUAZVINCOL_IMPEGNATO1 = 17;

  private static int PPQRY_CF4WSITUVINC = 0;


  IDPanel PAN_SITUAZVINCOL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI19(IMDB);
    //
    //
    Init_PQRY_CF4WSITUVINC(IMDB);
    Init_PQRY_PARAMETRI16(IMDB);
    Init_PQRY_PARAMETRI16_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI19, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI19, "TBL_PARAMETRI19");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI19,IMDBDef4.FLD_PARAMETRI19_ROWNAMEVINCO, "ROWNAMEVINCO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI19,IMDBDef4.FLD_PARAMETRI19_ROWNAMEVINCO,1,6,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI19, 0);
  }

  private static void Init_PQRY_CF4WSITUVINC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_CF4WSITUVINC, 14);
    IMDB.set_TblCode(IMDBDef13.PQRY_CF4WSITUVINC, "PQRY_CF4WSITUVINC");
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_VINCOLO, "VINCOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_VINCOLO,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_STANZIAMENTO_E, "STANZIAMENTO_E");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_STANZIAMENTO_E,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ACC_COMP, "ACC_COMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ACC_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ACC_RES, "ACC_RES");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ACC_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ORD_TOT, "ORD_TOT");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ORD_TOT,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ORD_COMP, "ORD_COMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ORD_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ORD_RES, "ORD_RES");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_ORD_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_STANZIAMENTO_S, "STANZIAMENTO_S");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_STANZIAMENTO_S,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_IMP_COMP, "IMP_COMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_IMP_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_IMP_RES, "IMP_RES");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_IMP_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_MAND_TOT, "MAND_TOT");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_MAND_TOT,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_MAND_COMP, "MAND_COMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_MAND_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_MAND_RES, "MAND_RES");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WSITUVINC,IMDBDef13.PQSL_CF4WSITUVINC_MAND_RES,2,15,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_CF4WSITUVINC, 0);
  }

  private static void Init_PQRY_PARAMETRI16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI16, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI16, "PQRY_PARAMETRI16");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI16,IMDBDef13.PQSL_PARAMETRI16_ROWNAMEVINCO, "ROWNAMEVINCO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI16,IMDBDef13.PQSL_PARAMETRI16_ROWNAMEVINCO,1,6,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI16, 0);
  }

  private static void Init_PQRY_PARAMETRI16_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAMETRI16_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAMETRI16_RS, "PQRY_PARAMETRI16_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAMETRI16_RS,IMDBDef13.PQSL_PARAMETRI16_ROWNAMEVINCO, "ROWNAMEVINCO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAMETRI16_RS,IMDBDef13.PQSL_PARAMETRI16_ROWNAMEVINCO,1,6,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneVincolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneVincolo()
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
    FormIdx = MyGlb.FRM_SITUAZVINCOL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CB4B100C-B4A8-43C9-8041-4F0587388E34";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 346;
    set_Caption(new IDVariant("Situazione Vincolo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 320;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.175;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 676;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F35C580C-EAAC-4C74-AFBF-7E23140A26CB");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 676;
    Frames[3].Height = 264;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Situazione Vincolo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 264;
    PAN_SITUAZVINCOL = new IDPanel(w, this, 3, "PAN_SITUAZVINCOL");
    Frames[3].Content = PAN_SITUAZVINCOL;
    PAN_SITUAZVINCOL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZVINCOL.VS = MainFrm.VisualStyleList;
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E37BEB89-17E9-4150-AD91-438B21808224");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1240, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZVINCOL.InitStatus = 2;
    PAN_SITUAZVINCOL_Init();
    PAN_SITUAZVINCOL_InitFields();
    PAN_SITUAZVINCOL_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI19, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUAZVINCOL_PARAMETRI16();
      }
      PAN_SITUAZVINCOL.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioneVincolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneVincolo.class.getName() : (Glb.ClassWithPackage(SituazioneVincolo.class) ? SituazioneVincolo.class.getName().substring(SituazioneVincolo.class.getPackage().getName().length() + 1) : SituazioneVincolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Situazione Vincolo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SITUAZVINCOL_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Situazione Vincolo After Find Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAMETRI16, IMDBDef13.PQSL_PARAMETRI16_ROWNAMEVINCO, 0)))
      {
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SITUAZVINCOL.SetFlags (Glb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVincolo", "SituazioneVincoloAfterFindEvent", _e);
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
    IDVariant v_COMPETENZA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RESIDUI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STANZIAMENTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOTALI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_COMPETENZA = (new IDVariant("Competenza", IDVariant.STRING));
      v_RESIDUI = (new IDVariant("Residui", IDVariant.STRING));
      v_STANZIAMENTO = (new IDVariant("Stanziamento", IDVariant.STRING));
      v_TOTALI = (new IDVariant("Totali", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_COMPETENZA1, new IDVariant(v_COMPETENZA).stringValue());
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_RESIDUI1, new IDVariant(v_RESIDUI).stringValue());
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_STANZIAMENT1, new IDVariant(v_STANZIAMENTO).stringValue());
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_COMPETENZA2, new IDVariant(v_COMPETENZA).stringValue());
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_RESIDUI2, new IDVariant(v_RESIDUI).stringValue());
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_TOTALI1, new IDVariant(v_TOTALI).stringValue());
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_COMPETENZA3, new IDVariant(v_COMPETENZA).stringValue());
      PAN_SITUAZVINCOL.set_Header(Glb.OBJ_FIELD,PFL_SITUAZVINCOL_RESIDUI3, new IDVariant(v_RESIDUI).stringValue());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneVincolo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SITUAZVINCOL_PARAMETRI16() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAMETRI16_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI19, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI19, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAMETRI16_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAMETRI16_RS, 0, IMDBDef4.TBL_PARAMETRI19, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAMETRI16_RS, 0, 0, IMDBDef4.TBL_PARAMETRI19, IMDBDef4.FLD_PARAMETRI19_ROWNAMEVINCO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI19, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI19, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI19, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAMETRI16_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SITUAZVINCOL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZVINCOL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZVINCOL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZVINCOL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZVINCOL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SITUAZVINCOL);
    // Stub
  }

  private void PAN_SITUAZVINCOL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SITUAZVINCOL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZVINCOL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZVINCOL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITUAZVINCOL_Init()
  {

    PAN_SITUAZVINCOL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZVINCOL.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, "256632E0-E0A1-486E-BAA2-0155C6B6978B");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, "Entrata");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, MyGlb.VIS_GROSTYPERLAB);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, MyGlb.PANEL_LIST, 80, -9999, 600, 16, 0, 0);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, MyGlb.PANEL_FORM, 8, 7, 308, 213, 0, 0);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, 0, 42);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, 1, 13);
    PAN_SITUAZVINCOL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, 0, 4);
    PAN_SITUAZVINCOL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, 1, 4);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_ENTRATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, "6CB10165-51B0-45AE-A949-8E55A7D65CB0");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, "Spesa");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, MyGlb.VIS_GROSTYPERLAB);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, MyGlb.PANEL_LIST, 680, -9999, 640, 16, 0, 0);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, MyGlb.PANEL_FORM, 340, 7, 308, 213, 0, 0);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, 0, 34);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, 1, 13);
    PAN_SITUAZVINCOL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, 0, 4);
    PAN_SITUAZVINCOL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, 1, 4);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_GROUP, GRP_SITUAZVINCOL_SPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITUAZVINCOL.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, "2AA83F02-BD00-4620-A9E1-0E8A23FF072B");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, "Stanziamento");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, "Stanziamento");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, "325CE023-3A16-4FA8-8ACD-1431ABEBEA5A");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, "Residui");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, "3C3CF60E-F701-4D48-8FBA-AF9585080E0F");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, "Ordinativi:");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, "0CC82CBE-1D03-499D-B5DD-3F9CEC30CC43");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, "Accertato:");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, "3C312ED8-D662-47ED-A12B-8256C4A4A304");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, "Competenza");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, "9D4A62B3-7B37-4A03-A416-32A5A53184BA");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, "Totali");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, "76F5A48F-511C-46FE-8967-73046862825A");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, "Competenza 1");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, "4B420144-78E7-4AB6-8CEC-B3ECA30B9BF0");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, "Residui 1");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, "A61CC5E1-4755-4B0C-9E47-976D9C9DE5CD");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, MyGlb.VIS_SFONEBORDTRA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, "CE438052-52A1-4BF6-8B57-C18AC0D28E06");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, "Stanziamento 1");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, "D0A58615-521B-48F8-A9FB-608026CC5E74");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, "Competenza 2");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, "FAA41287-0529-48F4-BA7F-62A497DE3B08");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, "Residui 2");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, "0AC62110-F5FF-47EC-8B85-B93DBFF32E6A");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, "Totali 1");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, "E37E1918-6579-4587-8E53-B1D87DFDB7CF");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, "Competenza 3");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, "C29ED927-9AC4-402D-B24B-AAAB219B7A91");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, "Residui 3");
    PAN_SITUAZVINCOL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.VIS_CAMPTOTADISA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, "8420E1E0-D0F7-4A76-8428-CF4CEFC51F10");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, "Impegnato:");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, "DF634005-4152-4D12-ADCE-AF94F4985849");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, "Mandati:");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, MyGlb.VIS_VUOTONORMALE);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZVINCOL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, "22952E79-0F0F-4D5E-96A9-8B6FDE124D88");
    PAN_SITUAZVINCOL.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, "");
    PAN_SITUAZVINCOL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, MyGlb.VIS_SFONEBORDTRA);
    PAN_SITUAZVINCOL.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_SITUAZVINCOL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_LIST, 80, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_LIST, 96);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_FORM, 88, 32, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_FORM, 108);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_STANZIAMENTO, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_STANZIAMENTO, PPQRY_CF4WSITUVINC, "A.STANZIAMENTO_E", "STANZIAMENTO_E", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_LIST, 304, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_FORM, 120, 96, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_RESIDUI, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_RESIDUI, PPQRY_CF4WSITUVINC, "A.ACC_RES", "ACC_RES", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, MyGlb.PANEL_LIST, 12, 92, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, MyGlb.PANEL_FORM, 12, 136, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_ORDINATIVI, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_ORDINATIVI, -1, "", "ORDINATIVI", 0, 0, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, MyGlb.PANEL_LIST, 4, 84, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, MyGlb.PANEL_FORM, 12, 72, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_ACCERTATO, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_ACCERTATO, -1, "", "ACCERTATO", 0, 0, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_LIST, 200, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_LIST, 64);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_LIST, "Competenza");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_FORM, 96, 72, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_FORM, 100);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA, MyGlb.PANEL_FORM, "Competenza");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_COMPETENZA, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_COMPETENZA, PPQRY_CF4WSITUVINC, "A.ACC_COMP", "ACC_COMP", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_LIST, 408, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_LIST, 56);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_LIST, "Totali");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_FORM, 128, 184, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_FORM, 68);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI, MyGlb.PANEL_FORM, "Totali");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_TOTALI, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_TOTALI, PPQRY_CF4WSITUVINC, "A.ORD_TOT", "ORD_TOT", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_LIST, 504, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_LIST, 64);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_LIST, "Competenza 1");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_FORM, 96, 136, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_FORM, 100);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA1, MyGlb.PANEL_FORM, "Competenza 1");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_COMPETENZA1, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_COMPETENZA1, PPQRY_CF4WSITUVINC, "A.ORD_COMP", "ORD_COMP", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_LIST, 608, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_LIST, 52);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_LIST, "Residui 1");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_FORM, 120, 160, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI1, MyGlb.PANEL_FORM, "Residui 1");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_RESIDUI1, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_RESIDUI1, PPQRY_CF4WSITUVINC, "A.ORD_RES", "ORD_RES", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, MyGlb.PANEL_LIST, 12, 92, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, MyGlb.PANEL_FORM, 232, 208, 64, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_ACCERTATO1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_ACCERTATO1, -1, GRP_SITUAZVINCOL_ENTRATA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_ACCERTATO1, -1, "", "ACCERTATO1", 0, 0, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_LIST, 680, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_LIST, 96);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_LIST, "Stanziamento 1");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_FORM, 428, 32, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_FORM, 100);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_STANZIAMENT1, MyGlb.PANEL_FORM, "Stanziamento 1");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_STANZIAMENT1, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_STANZIAMENT1, PPQRY_CF4WSITUVINC, "A.STANZIAMENTO_S", "STANZIAMENTO_S", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_LIST, 808, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_LIST, "Competenza 2");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_FORM, 432, 72, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_FORM, 96);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA2, MyGlb.PANEL_FORM, "Competenza 2");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_COMPETENZA2, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_COMPETENZA2, PPQRY_CF4WSITUVINC, "A.IMP_COMP", "IMP_COMP", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_LIST, 920, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_LIST, 48);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_LIST, "Residui 2");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_FORM, 456, 96, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI2, MyGlb.PANEL_FORM, "Residui 2");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_RESIDUI2, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_RESIDUI2, PPQRY_CF4WSITUVINC, "A.IMP_RES", "IMP_RES", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_LIST, 1040, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_LIST, "Totali 1");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_FORM, 464, 184, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_TOTALI1, MyGlb.PANEL_FORM, "Totali 1");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_TOTALI1, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_TOTALI1, PPQRY_CF4WSITUVINC, "A.MAND_TOT", "MAND_TOT", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_LIST, 1136, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_LIST, 72);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_LIST, "Competenza 3");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_FORM, 432, 136, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_FORM, 96);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_COMPETENZA3, MyGlb.PANEL_FORM, "Competenza 3");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_COMPETENZA3, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_COMPETENZA3, PPQRY_CF4WSITUVINC, "A.MAND_COMP", "MAND_COMP", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_LIST, 1240, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_LIST, 60);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_LIST, "Residui 3");
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_FORM, 456, 160, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_FORM, 72);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_RESIDUI3, MyGlb.PANEL_FORM, "Residui 3");
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_RESIDUI3, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_RESIDUI3, PPQRY_CF4WSITUVINC, "A.MAND_RES", "MAND_RES", 2, 15, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, MyGlb.PANEL_LIST, 12, 92, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, MyGlb.PANEL_FORM, 344, 72, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_IMPEGNATO, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_IMPEGNATO, -1, "", "IMPEGNATO", 0, 0, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, MyGlb.PANEL_LIST, 20, 100, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, MyGlb.PANEL_FORM, 348, 136, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_MANDATI, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_MANDATI, -1, "", "MANDATI", 0, 0, 0, -13997);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, MyGlb.PANEL_LIST, 20, 100, 92, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZVINCOL.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, MyGlb.PANEL_FORM, 572, 208, 64, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZVINCOL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZVINCOL.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZVINCOL_IMPEGNATO1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZVINCOL.SetFieldPage(PFL_SITUAZVINCOL_IMPEGNATO1, -1, GRP_SITUAZVINCOL_SPESA);
    PAN_SITUAZVINCOL.SetFieldPanel(PFL_SITUAZVINCOL_IMPEGNATO1, -1, "", "IMPEGNATO1", 0, 0, 0, -13997);
  }

  private void PAN_SITUAZVINCOL_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZVINCOL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITUAZVINCOL.SetIMDB(IMDB, "PQRY_CF4WSITUVINC", true);
    PAN_SITUAZVINCOL.set_SetString(MyGlb.MASTER_ROWNAME, "CF4WEB SITUAZ VINCOLO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.VINCOLO as VINCOLO, ");
    SQL.append("  A.STANZIAMENTO_E as STANZIAMENTO_E, ");
    SQL.append("  A.ACC_COMP as ACC_COMP, ");
    SQL.append("  A.ACC_RES as ACC_RES, ");
    SQL.append("  A.ORD_TOT as ORD_TOT, ");
    SQL.append("  A.ORD_COMP as ORD_COMP, ");
    SQL.append("  A.ORD_RES as ORD_RES, ");
    SQL.append("  A.STANZIAMENTO_S as STANZIAMENTO_S, ");
    SQL.append("  A.IMP_COMP as IMP_COMP, ");
    SQL.append("  A.IMP_RES as IMP_RES, ");
    SQL.append("  A.MAND_TOT as MAND_TOT, ");
    SQL.append("  A.MAND_COMP as MAND_COMP, ");
    SQL.append("  A.MAND_RES as MAND_RES ");
    PAN_SITUAZVINCOL.SetQuery(PPQRY_CF4WSITUVINC, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF4WEB_SITUAZ_VINCOLO A ");
    PAN_SITUAZVINCOL.SetQuery(PPQRY_CF4WSITUVINC, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.VINCOLO = ~~PQRY_PARAMETRI16.ROWNAMEVINCO~~) ");
    PAN_SITUAZVINCOL.SetQuery(PPQRY_CF4WSITUVINC, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZVINCOL.SetQuery(PPQRY_CF4WSITUVINC, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZVINCOL.SetQuery(PPQRY_CF4WSITUVINC, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZVINCOL.SetQuery(PPQRY_CF4WSITUVINC, 5, SQL, -1, "");
    PAN_SITUAZVINCOL.SetQueryDB(PPQRY_CF4WSITUVINC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZVINCOL.SetMasterTable(0, "CF4WEB_SITUAZ_VINCOLO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZVINCOL.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZVINCOL.iUseListQBE;
      PAN_SITUAZVINCOL.iUseListQBE = 0;
      PAN_SITUAZVINCOL.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZVINCOL.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZVINCOL.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "04F5BD40-2B37-464D-BD6E-78F3C3D37308");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 104, 8, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVINCOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVINCOLO, PPQRY_PARAMETRI16, "A.ROWNAMEVINCO", "ROWNAMEVINCO", 1, 6, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEVINCO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_PARAMETRI_TIPOVINCOLO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI16", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI16, IMDBDef13.PQRY_PARAMETRI16_RS, IMDBDef4.TBL_PARAMETRI19);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVINCOLO, IMDBDef4.FLD_PARAMETRI19_ROWNAMEVINCO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI19");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SITUAZVINCOL) PAN_SITUAZVINCOL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZVINCOL) PAN_SITUAZVINCOL_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITUAZVINCOL) PAN_SITUAZVINCOL_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITUAZVINCOL) PAN_SITUAZVINCOL_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITUAZVINCOL) PAN_SITUAZVINCOL_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SITUAZVINCOL) PAN_SITUAZVINCOL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
