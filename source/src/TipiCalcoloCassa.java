// **********************************************
// Tipi Calcolo Cassa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TipiCalcoloCassa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TABBEDVIEW;
  private static int PFL_TIPICALCOLO_TIPO = 0;
  private static int PFL_TIPICALCOLO_DESCRIZIONE = 1;
  private static int PFL_TIPICALCOLO_SEPERCENTUAL = 2;
  private static int PFL_TIPICALCOLO_TIPODEFAULT = 3;

  private static int PPQRY_BILTIPCALCAS = 0;


  IDPanel PAN_TIPICALCOLO;
  private static int PFL_CALCOPERCLAS_ESERCIZIO = 0;
  private static int PFL_CALCOPERCLAS_ES = 1;
  private static int PFL_CALCOPERCLAS_TITOLO = 2;
  private static int PFL_CALCOPERCLAS_TIPOLOMACROA = 3;
  private static int PFL_CALCOPERCLAS_TIPOCALCOLO = 4;
  private static int PFL_CALCOPERCLAS_UTENTEINSERI = 5;
  private static int PFL_CALCOPERCLAS_DATAINSERIME = 6;
  private static int PFL_CALCOPERCLAS_UTENTULTIAGG = 7;
  private static int PFL_CALCOPERCLAS_DATAULTIMAGG = 8;
  private static int PFL_CALCOPERCLAS_ETICLABEPARA = 9;
  private static int PFL_CALCOPERCLAS_PROGRESSIVO = 10;

  private static int PPQRY_BILTIPCACACL = 0;

  private static int PPQRY_VISTSTRURIC1 = 1;
  private static int PPQRY_VISTSTRURICL = 2;


  IDPanel PAN_CALCOPERCLAS;
  private static int PFL_PARAM_PARTE = 0;

  private static int PPQRY_PARAM130 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM131(IMDB);
    //
    //
    Init_PQRY_BILTIPCALCAS(IMDB);
    Init_PQRY_BILTIPCACACL(IMDB);
    Init_PQRY_PARAM130(IMDB);
    Init_PQRY_PARAM130_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM131(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM131, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM131, "TBL_PARAM131");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM131,IMDBDef3.FLD_PARAM131_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM131,IMDBDef3.FLD_PARAM131_PARAMPARTE,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM131, 0);
  }

  private static void Init_PQRY_BILTIPCALCAS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILTIPCALCAS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILTIPCALCAS, "PQRY_BILTIPCALCAS");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_TIPO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_SE_PERCENTUALE, "SE_PERCENTUALE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_SE_PERCENTUALE,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_TIPO_DEFAULT, "TIPO_DEFAULT");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCALCAS,IMDBDef11.PQSL_BILTIPCALCAS_TIPO_DEFAULT,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILTIPCALCAS, 0);
  }

  private static void Init_PQRY_BILTIPCACACL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILTIPCACACL, 10);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILTIPCACACL, "PQRY_BILTIPCACACL");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_TIPOLOGIA_MACROAGG, "TIPOLOGIA_MACROAGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_TIPOLOGIA_MACROAGG,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_TIPO_CALCOLO, "TIPO_CALCOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_TIPO_CALCOLO,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILTIPCACACL,IMDBDef11.PQSL_BILTIPCACACL_DATA_ULTIMO_AGG,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILTIPCACACL, 0);
  }

  private static void Init_PQRY_PARAM130(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM130, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM130, "PQRY_PARAM130");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM130,IMDBDef11.PQSL_PARAM130_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM130,IMDBDef11.PQSL_PARAM130_PARAMPARTE,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAM130, 0);
  }

  private static void Init_PQRY_PARAM130_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM130_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM130_RS, "PQRY_PARAM130_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM130_RS,IMDBDef11.PQSL_PARAM130_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM130_RS,IMDBDef11.PQSL_PARAM130_PARAMPARTE,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TipiCalcoloCassa(MyWebEntryPoint w, IMDBObj imdb)
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
  public TipiCalcoloCassa()
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
    FormIdx = MyGlb.FRM_TIPICALCCASS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FFA62840-7996-4FF1-8385-EF22AE8D35DD";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 760;
    DesignHeight = 426;
    set_Caption(new IDVariant("Tipi Calcolo Cassa"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 760;
    Frames[1].Height = 400;
    Frames[1].Caption = "Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 400;
    TAB_TABBEDVIEW = new OTabView(this);
    Frames[1].Content = TAB_TABBEDVIEW;
    TAB_TABBEDVIEW.iGuid = "A1CC4C8E-C8A1-4176-A546-4CE3CB0B4D1B";
    TAB_TABBEDVIEW.SetItemCount(2);
    TAB_TABBEDVIEW.Placement = 1;
    TAB_TABBEDVIEW.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Tipi Calcolo";
    Frames[2].Parent = this;
    PAN_TIPICALCOLO = new IDPanel(w, this, 2, "PAN_TIPICALCOLO");
    Frames[2].Content = PAN_TIPICALCOLO;
    PAN_TIPICALCOLO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TIPICALCOLO.VS = MainFrm.VisualStyleList;
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 400-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_TIPICALCOLO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "330D1E51-CF25-492E-9D40-6600725B7C34");
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 580, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_TIPICALCOLO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TIPICALCOLO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TIPICALCOLO.InitStatus = 2;
    PAN_TIPICALCOLO_Init();
    PAN_TIPICALCOLO_InitFields();
    PAN_TIPICALCOLO_InitQueries();
    TAB_TABBEDVIEW.SetItem(1, Frames[2], 0, "", "Tipi Calcolo", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Calcoli per Classificazioni";
    Frames[3].Parent = this;
    PAN_CALCOPERCLAS = new IDPanel(w, this, 3, "PAN_CALCOPERCLAS");
    Frames[3].Content = PAN_CALCOPERCLAS;
    PAN_CALCOPERCLAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CALCOPERCLAS.VS = MainFrm.VisualStyleList;
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 760-MyGlb.PAN_OFFS_X, 400-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "E0D1694E-5062-41A8-8853-55526CFCE3FF");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 56, 652, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CALCOPERCLAS.InitStatus = 1;
    PAN_CALCOPERCLAS_Init();
    PAN_CALCOPERCLAS_InitFields();
    PAN_CALCOPERCLAS_InitQueries();
    TAB_TABBEDVIEW.SetItem(2, Frames[3], 0, "", "Calcoli per Classificazioni", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_CALCOPERCLAS.SetSubFrame(PFL_CALCOPERCLAS_ETICLABEPARA,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Param";
    Frames[4].Parent = this;
    PAN_PARAM = new IDPanel(w, this, 4, "PAN_PARAM");
    Frames[4].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0B8B10EB-42DD-4A66-84C3-CA14BAC080A3");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG143+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG142+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG143+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPLSUALTESE+BaseCmdLinIdx)
      {
        DuplicaSuAltroEsercizio();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM131, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TIPICALCCASS_PARAM130();
      }
      PAN_TIPICALCOLO.UpdatePanel(MainFrm);
      PAN_CALCOPERCLAS.UpdatePanel(MainFrm);
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof TipiCalcoloCassa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TipiCalcoloCassa.class.getName() : (Glb.ClassWithPackage(TipiCalcoloCassa.class) ? TipiCalcoloCassa.class.getName().substring(TipiCalcoloCassa.class.getPackage().getName().length() + 1) : TipiCalcoloCassa.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAM130, IMDBDef11.PQSL_PARAM130_PARAMPARTE, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_TIPOLOGIA = new IDVariant(0,IDVariant.STRING);
        v_TIPOLOGIA = (new IDVariant("Tipologia"));
        PAN_CALCOPERCLAS.set_Header(Glb.OBJ_FIELD,PFL_CALCOPERCLAS_TIPOLOMACROA, new IDVariant(v_TIPOLOGIA).stringValue());
      }
      else
      {
        IDVariant v_MACROAGGREGA = new IDVariant(0,IDVariant.STRING);
        v_MACROAGGREGA = (new IDVariant("Macroaggregato"));
        PAN_CALCOPERCLAS.set_Header(Glb.OBJ_FIELD,PFL_CALCOPERCLAS_TIPOLOMACROA, new IDVariant(v_MACROAGGREGA).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "ParamOnDynamicProperties", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAM131, IMDBDef3.FLD_PARAM131_PARAMPARTE, 0, (new IDVariant("E")));
      PAN_CALCOPERCLAS.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "Load", _e);
    }
  }

  // **********************************************************************
  // Calcoli per Classificazioni On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CALCOPERCLAS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcoli per Classificazioni On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_E_S, 0, IMDB.Value(IMDBDef11.PQRY_PARAM130, IMDBDef11.PQSL_PARAM130_PARAMPARTE, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_TIPO_CALCOLO, 0, IMDB.Value(IMDBDef11.PQRY_BILTIPCALCAS, IMDBDef11.PQSL_BILTIPCALCAS_TIPO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_UTENTE_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_UTENTE_ULTIMO_AGG, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_DATA_ULTIMO_AGG, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILTIPCACACL, IMDBDef11.PQSL_BILTIPCACACL_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "CalcoliperClassificazioniOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Calcoli per Classificazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CALCOPERCLAS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CALCOPERCLAS);
      // 
      // Calcoli per Classificazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CALCOPERCLAS.set_ToolTip(Glb.OBJ_FIELD,PFL_CALCOPERCLAS_TITOLO,(new IDVariant(PAN_CALCOPERCLAS.FieldText(PFL_CALCOPERCLAS_TITOLO))).stringValue()); 
      PAN_CALCOPERCLAS.set_ToolTip(Glb.OBJ_FIELD,PFL_CALCOPERCLAS_TIPOLOMACROA,(new IDVariant(PAN_CALCOPERCLAS.FieldText(PFL_CALCOPERCLAS_TIPOLOMACROA))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "CalcoliperClassificazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Calcoli per Classificazioni On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number - Input
  // Error Message - Input
  // Native Error Number - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_CALCOPERCLAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CALCOPERCLAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Calcoli per Classificazioni On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "CalcoliperClassificazioniOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Calcoli per Classificazioni On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CALCOPERCLAS_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcoli per Classificazioni On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        IDVariant I = new IDVariant(0,IDVariant.INTEGER);
        for (I = (new IDVariant(1)); I.compareTo((new IDVariant(PAN_CALCOPERCLAS.NumRows)), true)<=0; I = IDL.Add(I, (new IDVariant(1))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_PROGRESSIVO = null;
          v_PROGRESSIVO = new IDVariant(((IDL.NullValue(PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_PROGRESSIVO,I.intValue()),(new IDVariant(""))).equals((new IDVariant(""))))?(new IDVariant()):IDL.ToFloat(PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_PROGRESSIVO,I.intValue()))),IDVariant.DECIMAL);
          IDVariant v_ESERCIZIO = null;
          v_ESERCIZIO = IDL.ToInteger(PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_ESERCIZIO,I.intValue()));
          IDVariant v_ES = null;
          v_ES = PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_ES,I.intValue());
          IDVariant v_TITOLO = null;
          v_TITOLO = IDL.ToInteger(PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_TITOLO,I.intValue()));
          IDVariant v_TIPMACRO = null;
          v_TIPMACRO = IDL.ToInteger(PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_TIPOLOMACROA,I.intValue()));
          if (IDL.NullValue(v_TITOLO,(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(v_TIPMACRO,(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  BIL_TIPI_CALC_CASSA_CLASSIF A ");
            SQL.append("where (A.PROGRESSIVO <> NVL(" + IDL.CSql(v_PROGRESSIVO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0)) ");
            SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(v_ESERCIZIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = " + IDL.CSql(v_ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.TITOLO = " + IDL.CSql(v_TITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.TIPOLOGIA_MACROAGG = " + IDL.CSql(v_TIPMACRO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Esiste già un Tipo di Calcolo associato al Titolo "));
              IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
              v_AVVISO2 = (new IDVariant(" e Tipologia/Macroaggregato "));
              v_AVVISO = IDL.Add(IDL.Add(IDL.Add(v_AVVISO, PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_TITOLO,I.intValue())), v_AVVISO2), PAN_CALCOPERCLAS.GetValueAt(PFL_CALCOPERCLAS_TIPOLOMACROA,I.intValue()));
              MainFrm.set_AlertMessage(v_AVVISO); 
              PAN_CALCOPERCLAS.set_SelectedRow(true, IDL.Sub(I, (new IDVariant(1))).intValue());
              Cancel.set((new IDVariant(-1)));
              return;
            }
          }
          else
          {
            I = IDL.Add((new IDVariant(PAN_CALCOPERCLAS.NumRows)), (new IDVariant(1)));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "CalcoliperClassificazioniOnCommand", _e);
    }
  }

  // **********************************************************************
  // Calcoli per Classificazioni After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_CALCOPERCLAS_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcoli per Classificazioni After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_CALCOPERCLAS.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "CalcoliperClassificazioniAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Tipi Calcolo On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TIPICALCOLO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_TIPICALCOLO);
      // 
      // Tipi Calcolo On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_TIPICALCOLO.set_ToolTip(Glb.OBJ_FIELD,PFL_TIPICALCOLO_DESCRIZIONE,(new IDVariant(PAN_TIPICALCOLO.FieldText(PFL_TIPICALCOLO_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "TipiCalcoloOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tipi Calcolo On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel - Input/Output
  // Skip - Input/Output
  // Error Number - Input
  // Error Message - Input
  // Native Error Number - Input
  // Panel Operation - Input
  // Doc - Input
  // **********************************************************************
  private void PAN_TIPICALCOLO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_TIPICALCOLO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Tipi Calcolo On Database Error Body
      // Corpo Procedura
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "TipiCalcoloOnDatabaseError", _e);
    }
  }

  // **********************************************************************
  // Duplica Su Altro Esercizio
  // **********************************************************************
  public int DuplicaSuAltroEsercizio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Duplica Su Altro Esercizio Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAM133, IMDBDef3.FLD_PARAM133_PARATIPODUPL, 0, (new IDVariant("TCC")));
      MainFrm.Show(MyGlb.FRM_DUPLSUALTESE, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TipiCalcoloCassa", "DuplicaSuAltroEsercizio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void TIPICALCCASS_PARAM130() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAM130_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM131, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM131, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAM130_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAM130_RS, 0, IMDBDef3.TBL_PARAM131, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM130_RS, 0, 0, IMDBDef3.TBL_PARAM131, IMDBDef3.FLD_PARAM131_PARAMPARTE, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM131, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM131, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM131, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAM130_RS, 0);
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
  private void TAB_TABBEDVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TIPICALCOLO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TIPICALCOLO, Cancel);
    // Stub
  }

  private void PAN_TIPICALCOLO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TIPICALCOLO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TIPICALCOLO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_TIPICALCOLO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CALCOPERCLAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CALCOPERCLAS, Cancel);
    // Stub
  }

  private void PAN_CALCOPERCLAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CALCOPERCLAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CALCOPERCLAS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CALCOPERCLAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CALCOPERCLAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_TIPICALCOLO_Init()
  {

    PAN_TIPICALCOLO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TIPICALCOLO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TIPICALCOLO.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_TIPICALCOLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, "825426AB-5CE0-4D92-AF10-207F11C21BB6");
    PAN_TIPICALCOLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, "Tipo");
    PAN_TIPICALCOLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, "");
    PAN_TIPICALCOLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICALCOLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_TIPICALCOLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, "1F8CF9E3-3EED-4D20-AEF4-22CDCA7469D3");
    PAN_TIPICALCOLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, "Descrizione");
    PAN_TIPICALCOLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, "");
    PAN_TIPICALCOLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_TIPICALCOLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_TIPICALCOLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, "D87C07D4-77D1-4197-A1A8-74CF39FF8952");
    PAN_TIPICALCOLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, "Se Perc.");
    PAN_TIPICALCOLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, "");
    PAN_TIPICALCOLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPICALCOLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TIPICALCOLO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, "E6AED1D3-2004-411D-A312-B798E7536F57");
    PAN_TIPICALCOLO.set_Header(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, "Default");
    PAN_TIPICALCOLO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, "");
    PAN_TIPICALCOLO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.VIS_CHECKSTYLE);
    PAN_TIPICALCOLO.SetFlags(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TIPICALCOLO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_FORM, 4, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_FORM, 112);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_TIPICALCOLO.SetFieldPage(PFL_TIPICALCOLO_TIPO, -1, -1);
    PAN_TIPICALCOLO.SetFieldPanel(PFL_TIPICALCOLO_TIPO, PPQRY_BILTIPCALCAS, "A.TIPO", "TIPO", 1, 2, 0, -13997);
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_LIST, 40, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_FORM, 112);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_TIPICALCOLO.SetFieldPage(PFL_TIPICALCOLO_DESCRIZIONE, -1, -1);
    PAN_TIPICALCOLO.SetFieldPanel(PFL_TIPICALCOLO_DESCRIZIONE, PPQRY_BILTIPCALCAS, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_LIST, 472, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_LIST, 100);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_LIST, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_LIST, "Se Perc.");
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_FORM, 112);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_FORM, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_SEPERCENTUAL, MyGlb.PANEL_FORM, "Se Perc.");
    PAN_TIPICALCOLO.SetFieldPage(PFL_TIPICALCOLO_SEPERCENTUAL, -1, -1);
    PAN_TIPICALCOLO.SetFieldPanel(PFL_TIPICALCOLO_SEPERCENTUAL, PPQRY_BILTIPCALCAS, "A.SE_PERCENTUALE", "SE_PERCENTUALE", 5, 2, 0, -13997);
    PAN_TIPICALCOLO.SetValueListItem(PFL_TIPICALCOLO_SEPERCENTUAL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPICALCOLO.SetValueListItem(PFL_TIPICALCOLO_SEPERCENTUAL, (new IDVariant()), "Null", "", "", -1);
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_LIST, 528, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_LIST, 88);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_LIST, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_LIST, "Default");
    PAN_TIPICALCOLO.SetRect(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TIPICALCOLO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_FORM, 112);
    PAN_TIPICALCOLO.SetNumRow(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_FORM, 1);
    PAN_TIPICALCOLO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TIPICALCOLO_TIPODEFAULT, MyGlb.PANEL_FORM, "Default");
    PAN_TIPICALCOLO.SetFieldPage(PFL_TIPICALCOLO_TIPODEFAULT, -1, -1);
    PAN_TIPICALCOLO.SetFieldPanel(PFL_TIPICALCOLO_TIPODEFAULT, PPQRY_BILTIPCALCAS, "A.TIPO_DEFAULT", "TIPO_DEFAULT", 5, 2, 0, -13997);
    PAN_TIPICALCOLO.SetValueListItem(PFL_TIPICALCOLO_TIPODEFAULT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_TIPICALCOLO.SetValueListItem(PFL_TIPICALCOLO_TIPODEFAULT, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_TIPICALCOLO_InitQueries()
  {
    StringBuffer SQL;

    PAN_TIPICALCOLO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TIPICALCOLO.SetIMDB(IMDB, "PQRY_BILTIPCALCAS", true);
    PAN_TIPICALCOLO.set_SetString(MyGlb.MASTER_ROWNAME, "BIL TIPI CALC CASSA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SE_PERCENTUALE as SE_PERCENTUALE, ");
    SQL.append("  A.TIPO_DEFAULT as TIPO_DEFAULT ");
    PAN_TIPICALCOLO.SetQuery(PPQRY_BILTIPCALCAS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_TIPI_CALC_CASSA A ");
    PAN_TIPICALCOLO.SetQuery(PPQRY_BILTIPCALCAS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICALCOLO.SetQuery(PPQRY_BILTIPCALCAS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICALCOLO.SetQuery(PPQRY_BILTIPCALCAS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICALCOLO.SetQuery(PPQRY_BILTIPCALCAS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TIPICALCOLO.SetQuery(PPQRY_BILTIPCALCAS, 5, SQL, -1, "");
    PAN_TIPICALCOLO.SetQueryDB(PPQRY_BILTIPCALCAS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TIPICALCOLO.SetMasterTable(0, "BIL_TIPI_CALC_CASSA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TIPICALCOLO.Status() == 2)
    {
      int oldListQBE = PAN_TIPICALCOLO.iUseListQBE;
      PAN_TIPICALCOLO.iUseListQBE = 0;
      PAN_TIPICALCOLO.PanelCommand(Glb.PCM_SEARCH);
      PAN_TIPICALCOLO.PanelCommand(Glb.PCM_FIND);
      PAN_TIPICALCOLO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CALCOPERCLAS_Init()
  {

    PAN_CALCOPERCLAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CALCOPERCLAS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CALCOPERCLAS.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, "6F93FD38-A930-4174-829A-D9376255D5ED");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, "ESERCIZIO");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, 0, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, "F759375F-F3F7-4DA4-AF3D-583DE4B73274");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, "E S");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, 0, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, "CCD27E05-9DBB-499B-9E37-48BB8C66FD2D");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, "Titolo");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, "14AFBE8A-8417-475C-B220-D4E12FD6E448");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, "TIPOLOGIA MACROAGG");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.VIS_NORMALFIELDS);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, "3C83D37F-F9CF-406E-A1FA-3EEDFB273694");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, "TIPO CALCOLO");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, 0, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, "DD06D640-E709-4B80-A843-CC31DB188A81");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, "C247453D-D251-45AB-841C-143A92348464");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, "5D2ABD84-1265-4118-86B8-4FF98A8F3D4E");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, "8D0B2241-33C4-4163-9085-C0C6463911C0");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, "1AC09A84-6CE2-4276-AD96-E840D8B43CD9");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, MyGlb.VIS_LABELFIELD);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CALCOPERCLAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, "F42EF912-8B3F-4FF8-9129-99E0B1D6F37B");
    PAN_CALCOPERCLAS.set_Header(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, "PROGRESSIVO");
    PAN_CALCOPERCLAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, "");
    PAN_CALCOPERCLAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CALCOPERCLAS.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_CALCOPERCLAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_LIST, 0, 92, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_ESERCIZIO, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_ESERCIZIO, PPQRY_BILTIPCACACL, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_LIST, 40, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_LIST, 24);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_LIST, "E S");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_FORM, 4, 28, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ES, MyGlb.PANEL_FORM, "E S");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_ES, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_ES, PPQRY_BILTIPCACACL, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CALCOPERCLAS.SetValueListItem(PFL_CALCOPERCLAS_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_CALCOPERCLAS.SetValueListItem(PFL_CALCOPERCLAS_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_LIST, 0, 92, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_LIST, 52);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_FORM, 4, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_TITOLO, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_TITOLO, PPQRY_BILTIPCACACL, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_LIST, 320, 92, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_LIST, 140);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_LIST, "TIPOLOGIA MACROAGG");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_FORM, 4, 76, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOLOMACROA, MyGlb.PANEL_FORM, "TIPOLOGIA MACROAGG");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_TIPOLOMACROA, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_TIPOLOMACROA, PPQRY_BILTIPCACACL, "A.TIPOLOGIA_MACROAGG", "TIPOLOGIA_MACROAGG", 1, 5, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_LIST, 184, 92, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_LIST, 88);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_LIST, "TP. CALC.");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_FORM, 4, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_TIPOCALCOLO, MyGlb.PANEL_FORM, "TIPO CALCOLO");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_TIPOCALCOLO, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_TIPOCALCOLO, PPQRY_BILTIPCACACL, "A.TIPO_CALCOLO", "TIPO_CALCOLO", 1, 5, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_LIST, 224, 92, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 124, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_UTENTEINSERI, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_UTENTEINSERI, PPQRY_BILTIPCACACL, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_LIST, 296, 92, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_FORM, 4, 148, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_DATAINSERIME, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_DATAINSERIME, PPQRY_BILTIPCACACL, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_LIST, 432, 92, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 172, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_UTENTULTIAGG, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_UTENTULTIAGG, PPQRY_BILTIPCACACL, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_LIST, 504, 92, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 196, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_FORM, 152);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_DATAULTIMAGG, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_DATAULTIMAGG, PPQRY_BILTIPCACACL, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, MyGlb.PANEL_LIST, 0, 12, 652, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, MyGlb.PANEL_LIST, 0);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, MyGlb.PANEL_LIST, 2);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, MyGlb.PANEL_FORM, 8, 12, 652, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, MyGlb.PANEL_FORM, 0);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_ETICLABEPARA, MyGlb.PANEL_FORM, 2);
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_ETICLABEPARA, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_ETICLABEPARA, -1, "", "ETICLABEPARA", 0, 0, 0, -13997);
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_LIST, 652, 92, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_CALCOPERCLAS.SetRect(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCOPERCLAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_CALCOPERCLAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_CALCOPERCLAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCOPERCLAS_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_CALCOPERCLAS.SetFieldPage(PFL_CALCOPERCLAS_PROGRESSIVO, -1, -1);
    PAN_CALCOPERCLAS.SetFieldPanel(PFL_CALCOPERCLAS_PROGRESSIVO, PPQRY_BILTIPCACACL, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_CALCOPERCLAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_CALCOPERCLAS.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISSTRRICCO1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~TITOLO~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAM130.PARAMPARTE~~) ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_VISTSTRURIC1, 0, SQL, PFL_CALCOPERCLAS_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISSTRRICCO1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAM130.PARAMPARTE~~) ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_VISTSTRURIC1, 1, SQL, PFL_CALCOPERCLAS_TITOLO, "");
    PAN_CALCOPERCLAS.SetQueryDB(PPQRY_VISTSTRURIC1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISSTRRICCO1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~TIPOLOGIA_MACROAGG~~) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAM130.PARAMPARTE~~) ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE_PADRE = ~~TITOLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, PFL_CALCOPERCLAS_TIPOLOMACROA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISSTRRICCO1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAM130.PARAMPARTE~~) ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE_PADRE = ~~TITOLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_VISTSTRURICL, 1, SQL, PFL_CALCOPERCLAS_TIPOLOMACROA, "");
    PAN_CALCOPERCLAS.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CALCOPERCLAS.SetIMDB(IMDB, "PQRY_BILTIPCACACL", true);
    PAN_CALCOPERCLAS.set_SetString(MyGlb.MASTER_ROWNAME, "BIL TIPI CALC CASSA CLASSIF");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.TIPOLOGIA_MACROAGG as TIPOLOGIA_MACROAGG, ");
    SQL.append("  A.TIPO_CALCOLO as TIPO_CALCOLO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_BILTIPCACACL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_TIPI_CALC_CASSA_CLASSIF A ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_BILTIPCACACL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~PQRY_PARAM130.PARAMPARTE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_CALCOLO = ~~PQRY_BILTIPCALCAS.TIPO~~) ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_BILTIPCACACL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CALCOPERCLAS.SetQuery(PPQRY_BILTIPCACACL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CALCOPERCLAS.SetQuery(PPQRY_BILTIPCACACL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_CALCOPERCLAS.SetQuery(PPQRY_BILTIPCACACL, 5, SQL, -1, "");
    PAN_CALCOPERCLAS.SetQueryDB(PPQRY_BILTIPCACACL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CALCOPERCLAS.SetMasterTable(0, "BIL_TIPI_CALC_CASSA_CLASSIF");
    PAN_CALCOPERCLAS.AddToSortList(PFL_CALCOPERCLAS_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CALCOPERCLAS.Status() == 2)
    {
      int oldListQBE = PAN_CALCOPERCLAS.iUseListQBE;
      PAN_CALCOPERCLAS.iUseListQBE = 0;
      PAN_CALCOPERCLAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_CALCOPERCLAS.PanelCommand(Glb.PCM_FIND);
      PAN_CALCOPERCLAS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "714608B5-61D5-4288-8722-4A84522D2038");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 40);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 0, 4, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM130, "A.PARAMPARTE", "PARAMPARTE", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM130", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM130, IMDBDef11.PQRY_PARAM130_RS, IMDBDef3.TBL_PARAM131);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef3.FLD_PARAM131_PARAMPARTE);
    PAN_PARAM.SetMasterTable(0, "PARAM131");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_TIPICALCOLO) PAN_TIPICALCOLO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CALCOPERCLAS) PAN_CALCOPERCLAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICALCOLO) PAN_TIPICALCOLO_ValidateRow(Cancel);
    if (SrcObj == PAN_CALCOPERCLAS) PAN_CALCOPERCLAS_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_TIPICALCOLO) PAN_TIPICALCOLO_DynamicProperties();
    if (SrcObj == PAN_CALCOPERCLAS) PAN_CALCOPERCLAS_DynamicProperties();
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_TIPICALCOLO) PAN_TIPICALCOLO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CALCOPERCLAS) PAN_CALCOPERCLAS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CALCOPERCLAS) PAN_CALCOPERCLAS_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CALCOPERCLAS) PAN_CALCOPERCLAS_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_TIPICALCOLO) PAN_TIPICALCOLO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CALCOPERCLAS) PAN_CALCOPERCLAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TABBEDVIEW) TAB_TABBEDVIEW_Click(PreviousPage, Cancel);
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
