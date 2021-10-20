// **********************************************
// Informazione Finanziamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioneFinanziamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FINANZIAMENT_CODICEFINAZI = 0;
  private static int PFL_FINANZIAMENT_DESCRIFINANZ = 1;
  private static int PFL_FINANZIAMENT_S = 2;
  private static int PFL_FINANZIAMENT_INFOFINANZIA = 3;
  private static int PFL_FINANZIAMENT_IMPORTO = 4;
  private static int PFL_FINANZIAMENT_LABELFINANZI = 5;
  private static int PFL_FINANZIAMENT_ANNOIMP = 6;
  private static int PFL_FINANZIAMENT_NUMEROIMP = 7;
  private static int PFL_FINANZIAMENT_OPERA1 = 8;
  private static int PFL_FINANZIAMENT_CAPITOLO = 9;
  private static int PFL_FINANZIAMENT_ARTICOLO = 10;
  private static int PFL_FINANZIAMENT_IMPOTOTAFINA = 11;
  private static int PFL_FINANZIAMENT_NEWPANELLABE = 12;

  private static int PPQRY_IMPFIN1 = 0;

  private static int PPQRY_FINANZIAMENT = 1;


  IDPanel PAN_FINANZIAMENT;
  private static int PFL_OPERA_OPERA = 0;
  private static int PFL_OPERA_OPEREDESCRIZ = 1;
  private static int PFL_OPERA_CUP = 2;
  private static int PFL_OPERA_INFOOPERA = 3;

  private static int PPQRY_OPERA2 = 0;

  private static int PPQRY_OPERE = 1;


  IDPanel PAN_OPERA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_OPERA6(IMDB);
    Init_TBL_FINANZIAMEN7(IMDB);
    Init_TBL_PARAMETRI69(IMDB);
    //
    //
    Init_PQRY_IMPFIN1(IMDB);
    Init_PQRY_OPERA2(IMDB);
    Init_PQRY_OPERA2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_OPERA6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_OPERA6, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_OPERA6, "TBL_OPERA6");
    IMDB.set_FldCode(IMDBDef4.TBL_OPERA6,IMDBDef4.FLD_OPERA6_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef4.TBL_OPERA6,IMDBDef4.FLD_OPERA6_ROWNAMEOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef4.TBL_OPERA6, 0);
  }

  private static void Init_TBL_FINANZIAMEN7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FINANZIAMEN7, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_FINANZIAMEN7, "TBL_FINANZIAMEN7");
    IMDB.set_FldCode(IMDBDef4.TBL_FINANZIAMEN7,IMDBDef4.FLD_FINANZIAMEN7_ROWNAMIMPOLD, "ROWNAMIMPOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_FINANZIAMEN7,IMDBDef4.FLD_FINANZIAMEN7_ROWNAMIMPOLD,3,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FINANZIAMEN7, 0);
  }

  private static void Init_TBL_PARAMETRI69(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI69, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI69, "TBL_PARAMETRI69");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI69,IMDBDef4.FLD_PARAMETRI69_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI69,IMDBDef4.FLD_PARAMETRI69_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI69,IMDBDef4.FLD_PARAMETRI69_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI69,IMDBDef4.FLD_PARAMETRI69_ROWNAMNUMIMP,1,5,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI69, 0);
  }

  private static void Init_PQRY_IMPFIN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMPFIN1, 9);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMPFIN1, "PQRY_IMPFIN1");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_CAPITOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_S, "S");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_S,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_IMPFININFFIN, "IMPFININFFIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPFIN1,IMDBDef13.PQSL_IMPFIN1_IMPFININFFIN,5,99,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_IMPFIN1, 0);
  }

  private static void Init_PQRY_OPERA2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_OPERA2, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_OPERA2, "PQRY_OPERA2");
    IMDB.set_FldCode(IMDBDef13.PQRY_OPERA2,IMDBDef13.PQSL_OPERA2_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_OPERA2,IMDBDef13.PQSL_OPERA2_ROWNAMEOPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_OPERA2, 0);
  }

  private static void Init_PQRY_OPERA2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_OPERA2_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_OPERA2_RS, "PQRY_OPERA2_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_OPERA2_RS,IMDBDef13.PQSL_OPERA2_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef13.PQRY_OPERA2_RS,IMDBDef13.PQSL_OPERA2_ROWNAMEOPERA,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioneFinanziamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioneFinanziamenti()
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
    FormIdx = MyGlb.FRM_INFORMFINANZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "203AF33E-5581-4D77-8133-0EDACFEFF5F7";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 776;
    DesignHeight = 498;
    set_Caption(new IDVariant("Informazione Finanziamenti"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 776;
    Frames[1].Height = 472;
    Frames[1].Caption = "Finanziamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 472;
    PAN_FINANZIAMENT = new IDPanel(w, this, 1, "PAN_FINANZIAMENT");
    Frames[1].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 776-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AAD65F42-5664-4DD0-BBF4-315B2A95471D");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 8, 72, 660, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZIAMENT.InitStatus = 2;
    PAN_FINANZIAMENT_Init();
    PAN_FINANZIAMENT_InitFields();
    PAN_FINANZIAMENT_InitQueries();
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    PAN_FINANZIAMENT.SetSubFrame(PFL_FINANZIAMENT_NEWPANELLABE,2);
    Frames[2].set_SubFrame(true);
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Opera";
    Frames[2].Parent = this;
    PAN_OPERA = new IDPanel(w, this, 2, "PAN_OPERA");
    Frames[2].Content = PAN_OPERA;
    PAN_OPERA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OPERA.VS = MainFrm.VisualStyleList;
    PAN_OPERA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3D7C7471-8EAC-4EAE-95C9-5775AD6EC20E");
    PAN_OPERA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 636, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OPERA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OPERA.InitStatus = 2;
    PAN_OPERA_Init();
    PAN_OPERA_InitFields();
    PAN_OPERA_InitQueries();
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
    // Resetto il fuoco perchË le tabbed view lo possono modificare
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
      if (IMDB.TblModified(IMDBDef4.TBL_OPERA6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFORMFINANZ_OPERA2();
      }
      PAN_FINANZIAMENT.UpdatePanel(MainFrm);
      PAN_OPERA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCEFINIMPACC && flRis && IdxPanelActived == PAN_FINANZIAMENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_FINANZIAMENT_CODICEFINAZI) {
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
  // Torna TRUE se l'oggetto passato Ë una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof InformazioneFinanziamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioneFinanziamenti.class.getName() : (Glb.ClassWithPackage(InformazioneFinanziamenti.class) ? InformazioneFinanziamenti.class.getName().substring(InformazioneFinanziamenti.class.getPackage().getName().length() + 1) : InformazioneFinanziamenti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Finanziamenti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti After Find Event Body
      // Procedure Body
      // 
      CalcolaTotaleFinanziamento(v_IMPORTO);
      Visibilit‡SelezioneOpera();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "FinanziamentiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANZIAMENT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANZIAMENT);
      // 
      // Finanziamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_DESCRIFINANZ,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_DESCRIFINANZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "FinanziamentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Calcola Totale Finanziamento
  // Importo - Input/Output
  // **********************************************************************
  public int CalcolaTotaleFinanziamento (IDVariant Importo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMA = new IDVariant(0,IDVariant.DECIMAL);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Calcola Totale Finanziamento Body
      // Procedure Body
      // 
      // C2 = PAN_FINANZIAMENT.MasterRS();
      // if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      // if (!C2.Bof()) PAN_FINANZIAMENT.GotoFirst();
      // while (!PAN_FINANZIAMENT.RSEOF())
      // {
        // v_SOMMA = IDL.Add(v_SOMMA, C2.Get("IMPORTO"));
      //   PAN_FINANZIAMENT.GotoNext();
      // }
      // if (CurPos>0) C2.absolute(CurPos);
      // PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_IMPOTOTAFINA, IDL.ToString(v_SOMMA).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_IMPOTOTAFINA, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO)).stringValue());
      // Importo.set(new IDVariant(new IDVariant(v_SOMMA),IDVariant.INTEGER));
      Importo.set(new IDVariant(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO),IDVariant.INTEGER));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "CalcolaTotaleFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Descrizione Finanziamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DescrizioneFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Descrizione Finanziamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMES, 0, IMDB.Value(IMDBDef13.PQRY_IMP5, IMDBDef13.PQSL_IMP5_S, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_IMP5, IMDBDef13.PQSL_IMP5_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_IMP5, IMDBDef13.PQSL_IMP5_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, IMDB.Value(IMDBDef13.PQRY_IMP5, IMDBDef13.PQSL_IMP5_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCEFINIMPACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "DescrizioneFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Finanziamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezionaFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Finanziamento Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCEFINIMPACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "SelezionaFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Opera On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OPERA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_OPERA);
      // 
      // Opera On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_OPERA.set_ToolTip(Glb.OBJ_FIELD,PFL_OPERA_OPEREDESCRIZ,(new IDVariant(PAN_OPERA.FieldText(PFL_OPERA_OPEREDESCRIZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "OperaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Info Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI21, IMDBDef1.FLD_PARAMETRI21_PARAMOPERA, 0, IMDB.Value(IMDBDef13.PQRY_OPERA2, IMDBDef13.PQSL_OPERA2_ROWNAMEOPERA, 0));
      MainFrm.Show(MyGlb.FRM_INFOSULLOPER, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "ApriInfoOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Finanziamento
  // **********************************************************************
  public int ApriInfoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Finanziamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef13.PQRY_IMPFIN1, IMDBDef13.PQSL_IMPFIN1_FINANZIAMENTO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "ApriInfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Selezione Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Visibilit‡SelezioneOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Selezione Opera Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_OPERA2, IMDBDef13.PQSL_OPERA2_ROWNAMEOPERA, 0)))
      {
        PAN_OPERA.SetFlags (Glb.OBJ_FIELD, PFL_OPERA_INFOOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_OPERA.SetFlags (Glb.OBJ_FIELD, PFL_OPERA_INFOOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "Visibilit‡SelezioneOpera", _e);
      return -1;
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
      MainFrm.ErrObj.ProcError ("InformazioneFinanziamenti", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Opera
  // Primary record source for panel data
  // **********************************************************************
  private void INFORMFINANZ_OPERA2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_OPERA2_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_OPERA6, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_OPERA6, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_OPERA2_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_OPERA2_RS, 0, IMDBDef4.TBL_OPERA6, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_OPERA2_RS, 0, 0, IMDBDef4.TBL_OPERA6, IMDBDef4.FLD_OPERA6_ROWNAMEOPERA, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_OPERA6, 0);
      if (IMDB.Eof(IMDBDef4.TBL_OPERA6, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_OPERA6, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_OPERA2_RS, 0);
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
  // cioË quando viene portata in primo piano
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
  private void PAN_FINANZIAMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FINANZIAMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FINANZIAMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZIAMENT, Cancel);
    // Stub
  }

  private void PAN_FINANZIAMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FINANZIAMENT_CODICEFINAZI)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DescrizioneFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_FINANZIAMENT_INFOFINANZIA)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FINANZIAMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZIAMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMPFIN1, IMDBDef13.PQSL_IMPFIN1_S, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_IMPFIN1, IMDBDef13.PQSL_IMPFIN1_S, 0, (new IDVariant("S")));
      }
      if (Cancel.isFalse())
      {
        PAN_FINANZIAMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_OPERA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_OPERA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OPERA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OPERA, Cancel);
    // Stub
  }

  private void PAN_OPERA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_OPERA_INFOOPERA)
    {
      this.IdxPanelActived = this.PAN_OPERA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoOpera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_OPERA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OPERA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OPERA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, "13EA88A6-44A4-49F2-9A76-596F2AFF5631");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, "Codice Finaziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, "Codice Finaziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, "FF2BB046-8906-47D8-89F3-CD9D92F7F05D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "5F4B9BC7-61B9-4866-881E-59A605A99743");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "S");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "Informazioni su Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, 0 | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, "DB4A0BE5-A400-48C1-B2F2-6DD57B4A3138");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, " ");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.VIS_HYPELINKIMMA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "ABE76C34-7175-43D5-851D-2AD8B9CC2029");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "Importo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "Importo Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, "99AB9E89-196B-48CE-AE0D-9E3562AF9078");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, "Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.VIS_LABEVISUSTYL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, "EC659B66-5546-48E2-80F3-B21AF6A1BD9D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, "ANNO IMP");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, "CD10CED7-403B-41F1-8F6C-13B57DF90619");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, "NUMERO IMP");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, "AA2516FE-6AEB-4F0D-B2DC-8153EA35EA16");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, "OPERA");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "0D81A980-8EEB-4094-8437-2118B38948DD");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "CAPITOLO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "5A2FC479-443D-4F89-9687-58935974937A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "ARTICOLO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, "57EAB53A-A7E7-46F9-8A25-9FB16109E4C4");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, "ddd");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, "519F7F0A-6B54-41C1-B450-957C6AB85A65");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, 8, 108, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_LIST, "Cod. Finaziam.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, 112, 52, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINAZI, MyGlb.PANEL_FORM, "Cod. Finaziam.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CODICEFINAZI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CODICEFINAZI, PPQRY_IMPFIN1, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, 80, 108, 464, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, 160);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, 168, 220, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, 160);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DESCRIFINANZ, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DESCRIFINANZ, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 544, 108, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 16);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, "S");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 24, 400, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 16);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, "S");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_S, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_S, PPQRY_IMPFIN1, "A.S", "S", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_S, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_S, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_LIST, 544, 108, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_LIST, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_LIST, " ");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_FORM, 4, 424, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_FORM, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INFOFINANZIA, MyGlb.PANEL_FORM, " ");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_INFOFINANZIA, -1, -1);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_INFOFINANZIA, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_INFOFINANZIA, PPQRY_IMPFIN1, "DECODE(A.FINANZIAMENTO, to_number(NULL), NULL, 'I')", "IMPFININFFIN", 5, 99, 0, -13997);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_INFOFINANZIA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 568, 108, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_IMPORTO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_IMPORTO, PPQRY_IMPFIN1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 8, 72, 560, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 4, 76, 612, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABELFINANZI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABELFINANZI, -1, "", "LABELFINANZI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, 584, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, 4, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ANNOIMP, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ANNOIMP, PPQRY_IMPFIN1, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, 584, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, 4, 280, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_NUMEROIMP, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_NUMEROIMP, PPQRY_IMPFIN1, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_LIST, 584, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_LIST, 44);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_LIST, "OPERA");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_FORM, 4, 304, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_FORM, 44);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA1, MyGlb.PANEL_FORM, "OPERA");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_OPERA1, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_OPERA1, PPQRY_IMPFIN1, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 584, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 4, 352, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOLO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOLO, PPQRY_IMPFIN1, "A.CAPITOLO", "CAPITOLO", 1, 6, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 584, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 4, 376, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOLO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOLO, PPQRY_IMPFIN1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_LIST, 568, 316, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_FORM, 380, 220, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPOTOTAFINA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_IMPOTOTAFINA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_IMPOTOTAFINA, -1, "", "IMPOTOTAFINA", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, MyGlb.PANEL_LIST, 4, 4, 732, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, MyGlb.PANEL_LIST, 4);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, MyGlb.PANEL_FORM, 0, 4, 788, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_NEWPANELLABE, MyGlb.PANEL_FORM, 4);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_NEWPANELLABE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_IMPFIN1", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "IMP FIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.S as S, ");
    SQL.append("  DECODE(A.FINANZIAMENTO, to_number(NULL), NULL, 'I') as IMPFININFFIN ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_IMPFIN1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP_FIN A ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_IMPFIN1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_IMP = ~~TBL_PARAMETRI69.ROWNAMANNIMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~TBL_PARAMETRI69.ROWNAMNUMIMP~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_IMPFIN1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_IMPFIN1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_IMPFIN1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_IMPFIN1, 5, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_IMPFIN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(0, "IMP_FIN");
    PAN_FINANZIAMENT.AddToSortList(PFL_FINANZIAMENT_CODICEFINAZI, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_FINANZIAMENT.Status() == 2)
    {
      int oldListQBE = PAN_FINANZIAMENT.iUseListQBE;
      PAN_FINANZIAMENT.iUseListQBE = 0;
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZIAMENT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_OPERA_Init()
  {

    PAN_OPERA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OPERA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OPERA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_OPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, "6BABB04D-ADF2-4F3A-ABF4-BD23B346E215");
    PAN_OPERA.set_Header(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, "Opera");
    PAN_OPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, "");
    PAN_OPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_OPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, "35BBDCEE-7E95-4F94-97A9-8AC50D6EA589");
    PAN_OPERA.set_Header(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, "OPERE DESCRIZIONE");
    PAN_OPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, "");
    PAN_OPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_OPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_OPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, "B662CD7C-028D-4656-BA17-7826F3050867");
    PAN_OPERA.set_Header(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, "Cup");
    PAN_OPERA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, "");
    PAN_OPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.VIS_VISULOOUPCF4);
    PAN_OPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_OPERA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, "E7837FCE-7395-4A32-89F7-21EE9A6DE1CC");
    PAN_OPERA.set_Header(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, "");
    PAN_OPERA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, MyGlb.VIS_STATICBUTTON);
    PAN_OPERA.SetImage(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, 0, "info.gif", false);
    PAN_OPERA.SetFlags(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_OPERA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_LIST, 40);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_OPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_FORM, 0, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_OPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERA_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_OPERA.SetFieldPage(PFL_OPERA_OPERA, -1, -1);
    PAN_OPERA.SetFieldPanel(PFL_OPERA_OPERA, PPQRY_OPERA2, "A.ROWNAMEOPERA", "ROWNAMEOPERA", 1, 5, 0, -13997);
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_LIST, 112);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_LIST, 2);
    PAN_OPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_LIST, "OPERE DESCRIZIONE");
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_FORM, 128, 4, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_FORM, 112);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_OPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERA_OPEREDESCRIZ, MyGlb.PANEL_FORM, "OP. DESCRIZIONE");
    PAN_OPERA.SetFieldPage(PFL_OPERA_OPEREDESCRIZ, -1, -1);
    PAN_OPERA.SetFieldPanel(PFL_OPERA_OPEREDESCRIZ, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_LIST, 64);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_LIST, 1);
    PAN_OPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_LIST, "Cup");
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_FORM, 564, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_FORM, 32);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_FORM, 1);
    PAN_OPERA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OPERA_CUP, MyGlb.PANEL_FORM, "Cup");
    PAN_OPERA.SetFieldPage(PFL_OPERA_CUP, -1, -1);
    PAN_OPERA.SetFieldPanel(PFL_OPERA_CUP, PPQRY_OPERE, "A.CUP", "OPERECUP", 5, 15, 0, -13997);
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, MyGlb.PANEL_LIST, 628, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, MyGlb.PANEL_LIST, 0);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, MyGlb.PANEL_LIST, 1);
    PAN_OPERA.SetRect(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, MyGlb.PANEL_FORM, 544, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OPERA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, MyGlb.PANEL_FORM, 0);
    PAN_OPERA.SetNumRow(MyGlb.OBJ_FIELD, PFL_OPERA_INFOOPERA, MyGlb.PANEL_FORM, 1);
    PAN_OPERA.SetFieldPage(PFL_OPERA_INFOOPERA, -1, -1);
    PAN_OPERA.SetFieldPanel(PFL_OPERA_INFOOPERA, -1, "", "INFOOPERA", 0, 0, 0, -13997);
  }

  private void PAN_OPERA_InitQueries()
  {
    StringBuffer SQL;

    PAN_OPERA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ, ");
    SQL.append("  A.CUP as OPERECUP ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEOPERA~~) ");
    PAN_OPERA.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_OPERA.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OPERA.SetMasterTable(PPQRY_OPERE, "OPERE");
    PAN_OPERA.SetIMDB(IMDB, "PQRY_OPERA2", true);
    PAN_OPERA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_OPERA.SetQueryIMDB(PPQRY_OPERA2, IMDBDef13.PQRY_OPERA2_RS, IMDBDef4.TBL_OPERA6);
    JustLoaded = true;
    PAN_OPERA.SetFieldPrimaryIndex(PFL_OPERA_OPERA, IMDBDef4.FLD_OPERA6_ROWNAMEOPERA);
    PAN_OPERA.SetMasterTable(0, "OPERA6");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_OPERA.Status() == 2)
    {
      int oldListQBE = PAN_OPERA.iUseListQBE;
      PAN_OPERA.iUseListQBE = 0;
      PAN_OPERA.PanelCommand(Glb.PCM_SEARCH);
      PAN_OPERA.PanelCommand(Glb.PCM_FIND);
      PAN_OPERA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_OPERA) PAN_OPERA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
    if (SrcObj == PAN_OPERA) PAN_OPERA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
    if (SrcObj == PAN_OPERA) PAN_OPERA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_OPERA) PAN_OPERA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_OPERA) PAN_OPERA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
