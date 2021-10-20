// **********************************************
// Definizione Tipo Calcolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DefinizioneTipoCalcolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DEFTIPCATICA_INSERIMENTO1 = 0;
  private static int GRP_DEFTIPCATICA_AGGIORNAMEN1 = 1;

  private static int PFL_DEFTIPCATICA_TIPOLOCATEGO = 0;
  private static int PFL_DEFTIPCATICA_DESCRIZIONE1 = 1;
  private static int PFL_DEFTIPCATICA_TIPOCALCOLO1 = 2;
  private static int PFL_DEFTIPCATICA_ESCLUSO1 = 3;
  private static int PFL_DEFTIPCATICA_UTENTEINSER1 = 4;
  private static int PFL_DEFTIPCATICA_DATAINSERIM1 = 5;
  private static int PFL_DEFTIPCATICA_UTENTULTIAG1 = 6;
  private static int PFL_DEFTIPCATICA_DATAULTIMAG1 = 7;
  private static int PFL_DEFTIPCATICA_ESERCIZIO1 = 8;

  private static int PPQRY_FSCTIPCALCA1 = 0;

  private static int PPQRY_FSCTIPICALC1 = 1;
  private static int PPQRY_DUAL1 = 2;
  private static int PPQRY_DUAL2 = 3;


  IDPanel PAN_DEFTIPCATICA;
  private static int GRP_DEFTIPCALCAP_INSERIMENTO = 0;
  private static int GRP_DEFTIPCALCAP_AGGIORNAMENT = 1;

  private static int PFL_DEFTIPCALCAP_CAPITOLO = 0;
  private static int PFL_DEFTIPCALCAP_ARTICOLO = 1;
  private static int PFL_DEFTIPCALCAP_DESCRIZIONE = 2;
  private static int PFL_DEFTIPCALCAP_TIPOCALCOLO = 3;
  private static int PFL_DEFTIPCALCAP_ESCLUSO = 4;
  private static int PFL_DEFTIPCALCAP_UTENTEINSERI = 5;
  private static int PFL_DEFTIPCALCAP_DATAINSERIME = 6;
  private static int PFL_DEFTIPCALCAP_UTENTULTIAGG = 7;
  private static int PFL_DEFTIPCALCAP_DATAULTIMAGG = 8;
  private static int PFL_DEFTIPCALCAP_ETICHCAPIART = 9;
  private static int PFL_DEFTIPCALCAP_ETICHETSLASH = 10;
  private static int PFL_DEFTIPCALCAP_ESERCIZIO = 11;

  private static int PPQRY_FSCTIPCALCAP = 0;

  private static int PPQRY_FSCTIPICALCO = 1;
  private static int PPQRY_DUAL3 = 2;
  private static int PPQRY_DUAL = 3;


  IDPanel PAN_DEFTIPCALCAP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS45(IMDB);
    //
    //
    Init_PQRY_FSCTIPCALCA1(IMDB);
    Init_PQRY_FSCTIPCALCAP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS45(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS45, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS45, "TBL_PARS45");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS45,IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS45,IMDBDef3.FLD_PARS45_NOMOGGTIPCLA,12,3,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS45, 0);
  }

  private static void Init_PQRY_FSCTIPCALCA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FSCTIPCALCA1, 9);
    IMDB.set_TblCode(IMDBDef11.PQRY_FSCTIPCALCA1, "PQRY_FSCTIPCALCA1");
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_TIPOLOGIA_CATEGORIA, "TIPOLOGIA_CATEGORIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_TIPOLOGIA_CATEGORIA,1,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_TIPO_CALCOLO, "TIPO_CALCOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_TIPO_CALCOLO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_ESCLUSO, "ESCLUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_ESCLUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCA1,IMDBDef11.PQSL_FSCTIPCALCA1_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_FSCTIPCALCA1, 0);
  }

  private static void Init_PQRY_FSCTIPCALCAP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FSCTIPCALCAP, 10);
    IMDB.set_TblCode(IMDBDef11.PQRY_FSCTIPCALCAP, "PQRY_FSCTIPCALCAP");
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_TIPO_CALCOLO, "TIPO_CALCOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_TIPO_CALCOLO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_ESCLUSO, "ESCLUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_ESCLUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCTIPCALCAP,IMDBDef11.PQSL_FSCTIPCALCAP_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_FSCTIPCALCAP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DefinizioneTipoCalcolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public DefinizioneTipoCalcolo()
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
    FormIdx = MyGlb.FRM_DEFITIPOCALC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E03E6935-D175-4D6C-A7A1-3E5D64E2B196";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 916;
    DesignHeight = 942;
    set_Caption(new IDVariant("Definizione Tipo Calcolo"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 916;
    Frames[1].Height = 916;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.484716;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 916;
    Frames[2].Height = 444;
    Frames[2].Caption = "Definizione Tipo Calcolo";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 444;
    PAN_DEFTIPCATICA = new IDPanel(w, this, 2, "PAN_DEFTIPCATICA");
    Frames[2].Content = PAN_DEFTIPCATICA;
    PAN_DEFTIPCATICA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DEFTIPCATICA.VS = MainFrm.VisualStyleList;
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 916-MyGlb.PAN_OFFS_X, 444-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "95CEE00B-8377-4202-B793-F263500B0BE0");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 744, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DEFTIPCATICA.InitStatus = 2;
    PAN_DEFTIPCATICA_Init();
    PAN_DEFTIPCATICA_InitFields();
    PAN_DEFTIPCATICA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 916;
    Frames[3].Height = 472;
    Frames[3].Caption = "Definizione Tipo Calcolo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 472;
    PAN_DEFTIPCALCAP = new IDPanel(w, this, 3, "PAN_DEFTIPCALCAP");
    Frames[3].Content = PAN_DEFTIPCALCAP;
    PAN_DEFTIPCALCAP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DEFTIPCALCAP.VS = MainFrm.VisualStyleList;
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 916-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6B78BDFF-43BC-495E-A794-5BFC7B28C14E");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 852, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DEFTIPCALCAP.InitStatus = 2;
    PAN_DEFTIPCALCAP_Init();
    PAN_DEFTIPCALCAP_InitFields();
    PAN_DEFTIPCALCAP_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG7+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FA6+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG7+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIORNATIPO+BaseCmdLinIdx)
      {
        AggiornaTipoCalcolo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGIU1+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FA7+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGIU1+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGTIPCALCA1+BaseCmdLinIdx)
      {
        AggiornaTipoCalcolo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGCAPDEFTIP+BaseCmdLinIdx)
      {
        AggiornaCapitoliDefTipoCalcolo();
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
      PAN_DEFTIPCATICA.UpdatePanel(MainFrm);
      PAN_DEFTIPCALCAP.UpdatePanel(MainFrm);
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
    return (obj instanceof DefinizioneTipoCalcolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DefinizioneTipoCalcolo.class.getName() : (Glb.ClassWithPackage(DefinizioneTipoCalcolo.class) ? DefinizioneTipoCalcolo.class.getName().substring(DefinizioneTipoCalcolo.class.getPackage().getName().length() + 1) : DefinizioneTipoCalcolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS45, IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, 0, new IDVariant());
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
      if (IMDB.Value(IMDBDef3.TBL_PARS45, IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, 0).equals((new IDVariant("TIP")), true) || IMDB.Value(IMDBDef3.TBL_PARS45, IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, 0).equals((new IDVariant("CAT")), true))
      {
        if (IMDB.Value(IMDBDef3.TBL_PARS45, IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, 0).equals((new IDVariant("TIP")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Tipologia"));
          PAN_DEFTIPCATICA.set_Header(Glb.OBJ_FIELD,PFL_DEFTIPCATICA_TIPOLOCATEGO, new IDVariant(S).stringValue());
        }
        else
        {
          IDVariant T = new IDVariant(0,IDVariant.STRING);
          T = (new IDVariant("Categoria"));
          PAN_DEFTIPCATICA.set_Header(Glb.OBJ_FIELD,PFL_DEFTIPCATICA_TIPOLOCATEGO, new IDVariant(T).stringValue());
        }
        PAN_DEFTIPCALCAP.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_DEFTIPCATICA.set_Visible((new IDVariant(0)).booleanValue());
      }
      PAN_DEFTIPCATICA.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DEFTIPCALCAP.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DEFTIPCATICA.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DEFTIPCALCAP.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "Load", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo TIP CAT On Show Multiple Selection
  // Evento notificato dal pannello quando cambia lo stato
  // della proprietà ShowMultipleSelection
  // New Value: True se la multiselezione verrà mostrata, False altrimenti; questo valore verrà assegnato automaticamente alla proprietà ShowMultipleSelection del pannello alla fine della gestione dell'evento, a meno che questo non sia stato cancellato. - Input
  // Cancel: E' un parametro di uscita che può essere impostato a True per impedire che venga cambiato lo stato di visualizzazione della multiselezione. - Input/Output
  // User Operation: True se l'evento è scattato a causa di una azione dell'utente, False altrimenti. - Input
  // **********************************************************************
  private void PAN_DEFTIPCATICA_OnShowMultipleSelection(IDVariant NewValue, IDVariant Cancel, IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Definizione Tipo Calcolo TIP CAT On Show Multiple Selection Body
      // Corpo Procedura
      // 
      if (NewValue.equals((new IDVariant(0)), true) && UserOperation.booleanValue())
      {
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloTIPCATOnShowMultipleSelection", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo TIP CAT On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DEFTIPCATICA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DEFTIPCATICA);
      // 
      // Definizione Tipo Calcolo TIP CAT On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DEFTIPCATICA.set_ToolTip(Glb.OBJ_FIELD,PFL_DEFTIPCATICA_DESCRIZIONE1,(new IDVariant(PAN_DEFTIPCATICA.FieldText(PFL_DEFTIPCATICA_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloTIPCATOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo TIP CAT Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DEFTIPCATICA_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Definizione Tipo Calcolo TIP CAT Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCA1, IMDBDef11.PQSL_FSCTIPCALCA1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCA1, IMDBDef11.PQSL_FSCTIPCALCA1_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloTIPCATBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo TIP CAT On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DEFTIPCATICA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Definizione Tipo Calcolo TIP CAT On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_DEFTIPCATICA_TIPOCALCOLO1)), true) || Column.equals((new IDVariant(PFL_DEFTIPCATICA_ESCLUSO1)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FSCTIPCALCA1, IMDBDef11.PQSL_FSCTIPCALCA1_TIPO_CALCOLO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCA1, IMDBDef11.PQSL_FSCTIPCALCA1_ESCLUSO, 0, (new IDVariant()));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FSCTIPCALCA1, IMDBDef11.PQSL_FSCTIPCALCA1_ESCLUSO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCA1, IMDBDef11.PQSL_FSCTIPCALCA1_TIPO_CALCOLO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloTIPCATOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo CAP On Show Multiple Selection
  // Evento notificato dal pannello quando cambia lo stato
  // della proprietà ShowMultipleSelection
  // New Value: True se la multiselezione verrà mostrata, False altrimenti; questo valore verrà assegnato automaticamente alla proprietà ShowMultipleSelection del pannello alla fine della gestione dell'evento, a meno che questo non sia stato cancellato. - Input
  // Cancel: E' un parametro di uscita che può essere impostato a True per impedire che venga cambiato lo stato di visualizzazione della multiselezione. - Input/Output
  // User Operation: True se l'evento è scattato a causa di una azione dell'utente, False altrimenti. - Input
  // **********************************************************************
  private void PAN_DEFTIPCALCAP_OnShowMultipleSelection(IDVariant NewValue, IDVariant Cancel, IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Definizione Tipo Calcolo CAP On Show Multiple Selection Body
      // Corpo Procedura
      // 
      if (NewValue.equals((new IDVariant(0)), true) && UserOperation.booleanValue())
      {
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloCAPOnShowMultipleSelection", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo CAP On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DEFTIPCALCAP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DEFTIPCALCAP);
      // 
      // Definizione Tipo Calcolo CAP On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DEFTIPCALCAP.set_ToolTip(Glb.OBJ_FIELD,PFL_DEFTIPCALCAP_DESCRIZIONE,(new IDVariant(PAN_DEFTIPCALCAP.FieldText(PFL_DEFTIPCALCAP_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloCAPOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo CAP Before Update
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DEFTIPCALCAP_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Definizione Tipo Calcolo CAP Before Update Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCAP, IMDBDef11.PQSL_FSCTIPCALCAP_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCAP, IMDBDef11.PQSL_FSCTIPCALCAP_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloCAPBeforeUpdate", _e);
    }
  }

  // **********************************************************************
  // Definizione Tipo Calcolo CAP On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_DEFTIPCALCAP_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Definizione Tipo Calcolo CAP On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_DEFTIPCALCAP_TIPOCALCOLO)), true) || Column.equals((new IDVariant(PFL_DEFTIPCALCAP_ESCLUSO)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FSCTIPCALCAP, IMDBDef11.PQSL_FSCTIPCALCAP_TIPO_CALCOLO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCAP, IMDBDef11.PQSL_FSCTIPCALCAP_ESCLUSO, 0, (new IDVariant()));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_FSCTIPCALCAP, IMDBDef11.PQSL_FSCTIPCALCAP_ESCLUSO, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCTIPCALCAP, IMDBDef11.PQSL_FSCTIPCALCAP_TIPO_CALCOLO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "DefinizioneTipoCalcoloCAPOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Aggiorna Tipo Calcolo
  // **********************************************************************
  public int AggiornaTipoCalcolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C6;
    IDCachedRowSet C9;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Tipo Calcolo Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_DEFTIPCALCAP.Status()).equals((new IDVariant(3)), true) || new IDVariant(PAN_DEFTIPCATICA.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_PARS46, IMDBDef3.FLD_PARS46_NOMOGGTIPCLA, 0, IMDB.Value(IMDBDef3.TBL_PARS45, IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, 0));
      if ((MainFrm.GetForm(MyGlb.FRM_AGGITIPOCALC, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_AGGITIPOCALC,(new IDVariant(0)).booleanValue()); 
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      if (IMDB.Value(IMDBDef3.TBL_PARS45, IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, 0).equals((new IDVariant("TIP")), true) || IMDB.Value(IMDBDef3.TBL_PARS45, IMDBDef3.FLD_PARS45_NOMOGGTIPCLA, 0).equals((new IDVariant("CAT")), true))
      {
        C6 = PAN_DEFTIPCATICA.MasterRS();
        if (C6.size()>0) CurPos = C6.getRow(); else CurPos = 0;
        if (!C6.Bof()) PAN_DEFTIPCATICA.GotoFirst();
        while (!PAN_DEFTIPCATICA.RSEOF())
        {
          if (PAN_DEFTIPCATICA.IsRowSelected(I.intValue()))
          {
            v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
            AGGITIPOCALC_IMAGTICAINI1(C6.Get("TIPOLOGIA_CATEGORIA"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_DEFTIPCATICA.GotoNext();
        }
        if (CurPos>0) C6.absolute(CurPos);
      }
      else
      {
        C9 = PAN_DEFTIPCALCAP.MasterRS();
        if (C9.size()>0) CurPos = C9.getRow(); else CurPos = 0;
        if (!C9.Bof()) PAN_DEFTIPCALCAP.GotoFirst();
        while (!PAN_DEFTIPCALCAP.RSEOF())
        {
          if (PAN_DEFTIPCALCAP.IsRowSelected(I.intValue()))
          {
            v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
            AGGITIPOCALC_IMAGTICAININ(C9.Get("CAPITOLO"), C9.Get("ARTICOLO"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_DEFTIPCALCAP.GotoNext();
        }
        if (CurPos>0) C9.absolute(CurPos);
      }
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Nessun record selezionato"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Show(MyGlb.FRM_AGGITIPOCALC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "AggiornaTipoCalcolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Agg Tipo Calcolo: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void AGGITIPOCALC_IMAGTICAINI1(IDVariant C6_TIPOLOGIA_CATEGORIA) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_IMDAGGTIPCAL, 0);
    IMDB.set_Value(IMDBDef3.TBL_IMDAGGTIPCAL, IMDBDef3.FLD_IMDAGGTIPCAL_NOMOGGTIPCAT, 0, C6_TIPOLOGIA_CATEGORIA);
  }

  // **********************************************************************
  // IMDB Agg Tipo Calcolo: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void AGGITIPOCALC_IMAGTICAININ(IDVariant C9_CAPITOLO, IDVariant C9_ARTICOLO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_IMDAGGTIPCAL, 0);
    IMDB.set_Value(IMDBDef3.TBL_IMDAGGTIPCAL, IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGECAPI, 0, C9_CAPITOLO);
    IMDB.set_Value(IMDBDef3.TBL_IMDAGGTIPCAL, IMDBDef3.FLD_IMDAGGTIPCAL_NOMEOGGEARTI, 0, C9_ARTICOLO);
  }

  // **********************************************************************
  // Aggiorna Capitoli Def Tipo Calcolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornaCapitoliDefTipoCalcolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Capitoli Def Tipo Calcolo Body
      // Corpo Procedura
      // 
      IDVariant v_SMESSAGGIO = new IDVariant(0,IDVariant.STRING);
      // 
      //  
      // 
      if (new IDVariant(PAN_DEFTIPCALCAP.Status()).equals((new IDVariant(3)), true) || new IDVariant(PAN_DEFTIPCATICA.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      // 
      // Lancio della Procedure
      // 
      MainFrm.Cf4armDBObject.FSCAGGTIPICALCCAP(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), v_SMESSAGGIO);
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      PAN_DEFTIPCALCAP.PanelCommand(Glb.PCM_REQUERY);
      MainFrm.set_AlertMessage(v_SMESSAGGIO); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneTipoCalcolo", "AggiornaCapitoliDefTipoCalcolo", _e);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DEFTIPCATICA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DEFTIPCATICA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DEFTIPCATICA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DEFTIPCATICA, Cancel);
    // Stub
  }

  private void PAN_DEFTIPCATICA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DEFTIPCATICA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DEFTIPCATICA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DEFTIPCATICA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DEFTIPCATICA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DEFTIPCALCAP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DEFTIPCALCAP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DEFTIPCALCAP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DEFTIPCALCAP, Cancel);
    // Stub
  }

  private void PAN_DEFTIPCALCAP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DEFTIPCALCAP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DEFTIPCALCAP_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DEFTIPCALCAP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DEFTIPCALCAP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DEFTIPCATICA_Init()
  {

    PAN_DEFTIPCATICA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DEFTIPCATICA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, "CF7B8F91-9962-45BF-952F-8CF13184D446");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, "Inserimento");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, MyGlb.VIS_DEFAPANESTYL);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, MyGlb.PANEL_LIST, 64, 287, 300, 49, 0, 0);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, MyGlb.PANEL_FORM, 76, 227, 312, 49, 0, 0);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, 0, 70);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, 1, 13);
    PAN_DEFTIPCATICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, 0, 4);
    PAN_DEFTIPCATICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, 1, 4);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_INSERIMENTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, "26DEF08C-877F-4A9C-AB93-210773DCBAA9");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, "Aggiornamento");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, MyGlb.VIS_DEFAPANESTYL);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, MyGlb.PANEL_LIST, 388, 287, 296, 49, 0, 0);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, MyGlb.PANEL_FORM, 408, 227, 292, 49, 0, 0);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, 0, 88);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, 1, 13);
    PAN_DEFTIPCATICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, 0, 4);
    PAN_DEFTIPCATICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, 1, 4);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_GROUP, GRP_DEFTIPCATICA_AGGIORNAMEN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DEFTIPCATICA.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, "C5E26B63-3DAF-4AF5-9987-F25739E53D80");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, "Tipologia");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, "8F48166C-FF25-4360-A06C-505C02761064");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, "Descrizione");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, "78D4A748-94BB-4FB0-9E9D-1B26923914C2");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, "Tipo Calcolo");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, "9AEE2AF9-5268-4518-9E12-0EBD2E51016B");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, "Escluso");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.VIS_CHECKSTYLE);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, "59B919D8-785A-4C8C-A452-0274A272A25D");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, "Utente");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, "56B54DB7-B1E9-478A-B771-8CD52854C804");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, "Data");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, "78051F02-C8EF-46EE-8543-C8307C19A43E");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, "Utente");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, "0C35A850-F752-4093-9E82-25FF3C0BED1A");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, "Data");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCATICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, "ACC8E041-5B46-4BFD-9EC7-02C278CAE6CD");
    PAN_DEFTIPCATICA.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, "ESERCIZIO");
    PAN_DEFTIPCATICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, "");
    PAN_DEFTIPCATICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DEFTIPCATICA.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_DEFTIPCATICA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_LIST, 140);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_LIST, "Tipologia");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_FORM, 32, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_FORM, 84);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOLOCATEGO, MyGlb.PANEL_FORM, "Tipologia");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_TIPOLOCATEGO, -1, -1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_TIPOLOCATEGO, PPQRY_FSCTIPCALCA1, "A.TIPOLOGIA_CATEGORIA", "TIPOLOGIA_CATEGORIA", 1, 7, 0, -13997);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_LIST, 64, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_FORM, 32, 28, 368, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_DESCRIZIONE1, -1, -1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_DESCRIZIONE1, PPQRY_FSCTIPCALCA1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_LIST, 412, 36, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_LIST, 88);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_LIST, "Tipo Calcolo");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_FORM, 28, 64, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_FORM, 88);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_TIPOCALCOLO1, MyGlb.PANEL_FORM, "Tipo Calcolo");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_TIPOCALCOLO1, -1, -1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_TIPOCALCOLO1, PPQRY_FSCTIPCALCA1, "A.TIPO_CALCOLO", "TIPO_CALCOLO", 5, 2, 0, -13997);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_LIST, 692, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_LIST, 60);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_LIST, "Escluso");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_FORM, 56, 88, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_FORM, 60);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESCLUSO1, MyGlb.PANEL_FORM, "Escluso");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_ESCLUSO1, -1, -1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_ESCLUSO1, PPQRY_FSCTIPCALCA1, "A.ESCLUSO", "ESCLUSO", 5, 2, 0, -13997);
    PAN_DEFTIPCATICA.SetValueListItem(PFL_DEFTIPCATICA_ESCLUSO1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DEFTIPCATICA.SetValueListItem(PFL_DEFTIPCATICA_ESCLUSO1, (new IDVariant()), "Null", "", "", -1);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_LIST, 68, 312, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_LIST, 52);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_LIST, "Utente");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_FORM, 80, 252, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_FORM, 52);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTEINSER1, MyGlb.PANEL_FORM, "Utente");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_UTENTEINSER1, -1, GRP_DEFTIPCATICA_INSERIMENTO1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_UTENTEINSER1, PPQRY_FSCTIPCALCA1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_LIST, 244, 312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_LIST, 44);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_LIST, "Data");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_FORM, 268, 252, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_FORM, 40);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAINSERIM1, MyGlb.PANEL_FORM, "Data");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_DATAINSERIM1, -1, GRP_DEFTIPCATICA_INSERIMENTO1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_DATAINSERIM1, PPQRY_FSCTIPCALCA1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_LIST, 392, 312, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_LIST, 52);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_LIST, "Utente");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_FORM, 412, 252, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_FORM, 52);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_UTENTULTIAG1, MyGlb.PANEL_FORM, "Utente");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_UTENTULTIAG1, -1, GRP_DEFTIPCATICA_AGGIORNAMEN1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_UTENTULTIAG1, PPQRY_FSCTIPCALCA1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_LIST, 564, 312, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_LIST, 44);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_LIST, "Data");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_FORM, 580, 252, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_FORM, 40);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_DATAULTIMAG1, MyGlb.PANEL_FORM, "Data");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_DATAULTIMAG1, -1, GRP_DEFTIPCATICA_AGGIORNAMEN1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_DATAULTIMAG1, PPQRY_FSCTIPCALCA1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_DEFTIPCATICA.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 276, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCATICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_FORM, 68);
    PAN_DEFTIPCATICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCATICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCATICA_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_DEFTIPCATICA.SetFieldPage(PFL_DEFTIPCATICA_ESERCIZIO1, -1, -1);
    PAN_DEFTIPCATICA.SetFieldPanel(PFL_DEFTIPCATICA_ESERCIZIO1, PPQRY_FSCTIPCALCA1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
  }

  private void PAN_DEFTIPCATICA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DEFTIPCATICA.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("where (A.TIPO = ~~TIPO_CALCOLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPICALC1, 0, SQL, PFL_DEFTIPCATICA_TIPOCALCOLO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPICALC1, 1, SQL, PFL_DEFTIPCATICA_TIPOCALCOLO1, "");
    PAN_DEFTIPCATICA.SetQueryDB(PPQRY_FSCTIPICALC1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_DEFTIPCATICA_UTENTEINSER1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_DEFTIPCATICA_UTENTEINSER1, "");
    PAN_DEFTIPCATICA.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_DUAL2, 0, SQL, PFL_DEFTIPCATICA_UTENTULTIAG1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_DUAL2, 1, SQL, PFL_DEFTIPCATICA_UTENTULTIAG1, "");
    PAN_DEFTIPCATICA.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DEFTIPCATICA.SetIMDB(IMDB, "PQRY_FSCTIPCALCA1", true);
    PAN_DEFTIPCATICA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPOLOGIA_CATEGORIA as TIPOLOGIA_CATEGORIA, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_CALCOLO as TIPO_CALCOLO, ");
    SQL.append("  A.ESCLUSO as ESCLUSO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPCALCA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALC_CLASSIF A ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPCALCA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPCALCA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPCALCA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPCALCA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.TIPOLOGIA_CATEGORIA ");
    PAN_DEFTIPCATICA.SetQuery(PPQRY_FSCTIPCALCA1, 5, SQL, -1, "");
    PAN_DEFTIPCATICA.SetQueryDB(PPQRY_FSCTIPCALCA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DEFTIPCATICA.SetMasterTable(0, "FSC_TIPI_CALC_CLASSIF");
    PAN_DEFTIPCATICA.AddToSortList(PFL_DEFTIPCATICA_TIPOLOCATEGO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DEFTIPCATICA.Status() == 2)
    {
      int oldListQBE = PAN_DEFTIPCATICA.iUseListQBE;
      PAN_DEFTIPCATICA.iUseListQBE = 0;
      PAN_DEFTIPCATICA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DEFTIPCATICA.PanelCommand(Glb.PCM_FIND);
      PAN_DEFTIPCATICA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DEFTIPCALCAP_Init()
  {

    PAN_DEFTIPCALCAP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DEFTIPCALCAP.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, "1B6283BE-E7B7-4439-953D-52E6D1A29732");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, "Inserimento");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, MyGlb.PANEL_LIST, 64, 295, 300, 53, 0, 0);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, MyGlb.PANEL_FORM, 76, 227, 312, 49, 0, 0);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, 0, 70);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, 1, 13);
    PAN_DEFTIPCALCAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, 0, 4);
    PAN_DEFTIPCALCAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, 1, 4);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, "77F43DA2-A41B-4344-90C3-7978F5079F73");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, "Aggiornamento");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, MyGlb.PANEL_LIST, 388, 295, 296, 49, 0, 0);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, MyGlb.PANEL_FORM, 408, 227, 292, 49, 0, 0);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, 0, 88);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, 1, 13);
    PAN_DEFTIPCALCAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, 0, 4);
    PAN_DEFTIPCALCAP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, 1, 4);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_GROUP, GRP_DEFTIPCALCAP_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DEFTIPCALCAP.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, "E813911D-7C46-4E1E-AA00-B696F8DF0B45");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, "Capitolo");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, "BA7EA751-C8F8-4477-BFF9-B643B632C3EE");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, "Art.");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, "5DEAA3A3-0A27-4D0E-B4D7-662C61A570B5");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, "Descrizione");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, "FAB97B90-877C-4307-BC35-5A966FD56A99");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, "Tipo Calcolo");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, "9A533B11-621C-4FAA-9BF2-7F8EAC91442B");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, "Escluso");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.VIS_CHECKSTYLE);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, "1BCDB3F0-2653-40E4-A986-7F5A9422B48F");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, "Utente");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, "1C71314F-04E1-4FFB-8E4A-DD963FC87955");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, "Data");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, "E2F90F4D-432C-452F-910D-FC37E49A0D85");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, "Utente");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, "A82264F7-904A-4273-8D93-7543A237CE0E");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, "Data");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, "53AE50F5-EB83-40EF-9F8C-F74AE8E8182E");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, "Capitolo/Art.");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, MyGlb.VIS_VUOTONORMALE);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, "AC0F07AD-470F-4FAB-9642-5261A8FEB04E");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, "/");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DEFTIPCALCAP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, "21D587E5-BD80-4B21-A125-1F4F6499D510");
    PAN_DEFTIPCALCAP.set_Header(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, "ESERCIZIO");
    PAN_DEFTIPCALCAP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, "");
    PAN_DEFTIPCALCAP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DEFTIPCALCAP.SetFlags(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_DEFTIPCALCAP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_FORM, 52, 24, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_CAPITOLO, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_CAPITOLO, PPQRY_FSCTIPCALCAP, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_LIST, 140, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_FORM, 268, 24, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_FORM, 8);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ARTICOLO, MyGlb.PANEL_FORM, "A.");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_ARTICOLO, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_ARTICOLO, PPQRY_FSCTIPCALCAP, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_LIST, 172, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 48, 368, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_DESCRIZIONE, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_DESCRIZIONE, PPQRY_FSCTIPCALCAP, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_LIST, 520, 36, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_LIST, 88);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_LIST, "Tipo Calcolo");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_FORM, 28, 84, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_FORM, 88);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_TIPOCALCOLO, MyGlb.PANEL_FORM, "Tipo Calcolo");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_TIPOCALCOLO, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_TIPOCALCOLO, PPQRY_FSCTIPCALCAP, "A.TIPO_CALCOLO", "TIPO_CALCOLO", 5, 2, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_LIST, 800, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_LIST, 60);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_LIST, "Escluso");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_FORM, 56, 108, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_FORM, 60);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESCLUSO, MyGlb.PANEL_FORM, "Escluso");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_ESCLUSO, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_ESCLUSO, PPQRY_FSCTIPCALCAP, "A.ESCLUSO", "ESCLUSO", 5, 2, 0, -13997);
    PAN_DEFTIPCALCAP.SetValueListItem(PFL_DEFTIPCALCAP_ESCLUSO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DEFTIPCALCAP.SetValueListItem(PFL_DEFTIPCALCAP_ESCLUSO, (new IDVariant()), "Null", "", "", -1);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_LIST, 68, 324, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_LIST, 52);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_FORM, 80, 252, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_FORM, 52);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_UTENTEINSERI, -1, GRP_DEFTIPCALCAP_INSERIMENTO);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_UTENTEINSERI, PPQRY_FSCTIPCALCAP, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_LIST, 244, 320, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_LIST, 44);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_LIST, "Data");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_FORM, 268, 252, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_FORM, 40);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAINSERIME, MyGlb.PANEL_FORM, "Data");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_DATAINSERIME, -1, GRP_DEFTIPCALCAP_INSERIMENTO);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_DATAINSERIME, PPQRY_FSCTIPCALCAP, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_LIST, 392, 320, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_LIST, 52);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_LIST, "Utente");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_FORM, 412, 252, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_FORM, 52);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_UTENTULTIAGG, MyGlb.PANEL_FORM, "Utente");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_UTENTULTIAGG, -1, GRP_DEFTIPCALCAP_AGGIORNAMENT);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_UTENTULTIAGG, PPQRY_FSCTIPCALCAP, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_LIST, 564, 320, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_LIST, 44);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_LIST, "Data");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_FORM, 580, 252, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_FORM, 40);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_DATAULTIMAGG, MyGlb.PANEL_FORM, "Data");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_DATAULTIMAGG, -1, GRP_DEFTIPCALCAP_AGGIORNAMENT);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_DATAULTIMAGG, PPQRY_FSCTIPCALCAP, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, MyGlb.PANEL_LIST, 60, 312, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, MyGlb.PANEL_LIST, 0);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, MyGlb.PANEL_FORM, 20, 24, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, MyGlb.PANEL_FORM, 0);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHCAPIART, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_ETICHCAPIART, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_ETICHCAPIART, -1, "", "ETICHCAPIART", 0, 0, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, MyGlb.PANEL_LIST, 316, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, MyGlb.PANEL_LIST, 0);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, MyGlb.PANEL_FORM, 264, 24, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, MyGlb.PANEL_FORM, 0);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ETICHETSLASH, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_ETICHETSLASH, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_ETICHETSLASH, -1, "", "ETICHETSLASH", 0, 0, 0, -13997);
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_DEFTIPCALCAP.SetRect(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_FORM, 4, 276, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DEFTIPCALCAP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_DEFTIPCALCAP.SetNumRow(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DEFTIPCALCAP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DEFTIPCALCAP_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_DEFTIPCALCAP.SetFieldPage(PFL_DEFTIPCALCAP_ESERCIZIO, -1, -1);
    PAN_DEFTIPCALCAP.SetFieldPanel(PFL_DEFTIPCALCAP_ESERCIZIO, PPQRY_FSCTIPCALCAP, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
  }

  private void PAN_DEFTIPCALCAP_InitQueries()
  {
    StringBuffer SQL;

    PAN_DEFTIPCALCAP.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("where (A.TIPO = ~~TIPO_CALCOLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPICALCO, 0, SQL, PFL_DEFTIPCALCAP_TIPOCALCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as FSCTIPCALTIP, ");
    SQL.append("  A.ORDINAMENTO as FSCTIPCALORD, ");
    SQL.append("  A.DESCRIZIONE as FSCTIPCALDES ");
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALCOLO A ");
    SQL.append("order by ");
    SQL.append("  A.ORDINAMENTO ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPICALCO, 1, SQL, PFL_DEFTIPCALCAP_TIPOCALCOLO, "");
    PAN_DEFTIPCALCAP.SetQueryDB(PPQRY_FSCTIPICALCO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as RFTCCUIDTCD1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as RFTCCUIDTCDT ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_DUAL3, 0, SQL, PFL_DEFTIPCALCAP_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as RFTCCUIDTCD1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as RFTCCUIDTCDT ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_DUAL3, 1, SQL, PFL_DEFTIPCALCAP_UTENTEINSERI, "");
    PAN_DEFTIPCALCAP.SetQueryDB(PPQRY_DUAL3, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as RFTCCUUADTC1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as RFTCCUUADTCD ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_DUAL, 0, SQL, PFL_DEFTIPCALCAP_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as RFTCCUUADTC1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as RFTCCUUADTCD ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_DUAL, 1, SQL, PFL_DEFTIPCALCAP_UTENTULTIAGG, "");
    PAN_DEFTIPCALCAP.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DEFTIPCALCAP.SetIMDB(IMDB, "PQRY_FSCTIPCALCAP", true);
    PAN_DEFTIPCALCAP.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_CALCOLO as TIPO_CALCOLO, ");
    SQL.append("  A.ESCLUSO as ESCLUSO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPCALCAP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FSC_TIPI_CALC_CAP A ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPCALCAP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPCALCAP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPCALCAP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPCALCAP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_DEFTIPCALCAP.SetQuery(PPQRY_FSCTIPCALCAP, 5, SQL, -1, "");
    PAN_DEFTIPCALCAP.SetQueryDB(PPQRY_FSCTIPCALCAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DEFTIPCALCAP.SetMasterTable(0, "FSC_TIPI_CALC_CAP");
    PAN_DEFTIPCALCAP.AddToSortList(PFL_DEFTIPCALCAP_CAPITOLO, true);
    PAN_DEFTIPCALCAP.AddToSortList(PFL_DEFTIPCALCAP_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DEFTIPCALCAP.Status() == 2)
    {
      int oldListQBE = PAN_DEFTIPCALCAP.iUseListQBE;
      PAN_DEFTIPCALCAP.iUseListQBE = 0;
      PAN_DEFTIPCALCAP.PanelCommand(Glb.PCM_SEARCH);
      PAN_DEFTIPCALCAP.PanelCommand(Glb.PCM_FIND);
      PAN_DEFTIPCALCAP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DEFTIPCATICA) PAN_DEFTIPCATICA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DEFTIPCALCAP) PAN_DEFTIPCALCAP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DEFTIPCATICA) PAN_DEFTIPCATICA_ValidateRow(Cancel);
    if (SrcObj == PAN_DEFTIPCALCAP) PAN_DEFTIPCALCAP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DEFTIPCATICA) PAN_DEFTIPCATICA_DynamicProperties();
    if (SrcObj == PAN_DEFTIPCALCAP) PAN_DEFTIPCALCAP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DEFTIPCATICA) PAN_DEFTIPCATICA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DEFTIPCALCAP) PAN_DEFTIPCALCAP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DEFTIPCATICA) PAN_DEFTIPCATICA_BeforeUpdate(Cancel);
    if (SrcObj == PAN_DEFTIPCALCAP) PAN_DEFTIPCALCAP_BeforeUpdate(Cancel);
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
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DEFTIPCATICA) PAN_DEFTIPCATICA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DEFTIPCALCAP) PAN_DEFTIPCALCAP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_DEFTIPCATICA) PAN_DEFTIPCATICA_OnShowMultipleSelection(NewValue, Cancel, UserOperation);
    if (SrcObj == PAN_DEFTIPCALCAP) PAN_DEFTIPCALCAP_OnShowMultipleSelection(NewValue, Cancel, UserOperation);
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
