// **********************************************
// Finanziamento Altre Voci Peg Effettivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentoAltreVociPegEffettivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FINANZIAMENT_CAPITOLOART = 0;

  private static int PFL_FINANZIAMENT_INTESTALABEL = 0;
  private static int PFL_FINANZIAMENT_STANATTULABE = 1;
  private static int PFL_FINANZIAMENT_CAPITOLO = 2;
  private static int PFL_FINANZIAMENT_ARTICOLO = 3;
  private static int PFL_FINANZIAMENT_VOCEPEGLABEL = 4;
  private static int PFL_FINANZIAMENT_STANZIAMENTO = 5;
  private static int PFL_FINANZIAMENT_TOTALE = 6;
  private static int PFL_FINANZIAMENT_CAPITOLSPESA = 7;
  private static int PFL_FINANZIAMENT_ARTICOLSPESA = 8;
  private static int PFL_FINANZIAMENT_CAPITOENTRAT = 9;
  private static int PFL_FINANZIAMENT_ARTICOENTRAT = 10;
  private static int PFL_FINANZIAMENT_APRIVOCEPEG = 11;
  private static int PFL_FINANZIAMENT_ALLEGATO = 12;
  private static int PFL_FINANZIAMENT_IMPORTO = 13;
  private static int PFL_FINANZIAMENT_DISAVANZO = 14;
  private static int PFL_FINANZIAMENT_ESERCIZIO = 15;
  private static int PFL_FINANZIAMENT_E = 16;
  private static int PFL_FINANZIAMENT_S = 17;
  private static int PFL_FINANZIAMENT_UTENTEINSERI = 18;
  private static int PFL_FINANZIAMENT_DATAINSERIME = 19;
  private static int PFL_FINANZIAMENT_UTENTULTIAGG = 20;
  private static int PFL_FINANZIAMENT_DATAULTIMAGG = 21;
  private static int PFL_FINANZIAMENT_BARRLABEFORM = 22;

  private static int PPQRY_FINALT1 = 0;

  private static int PPQRY_DESCRVOCEPEG = 1;
  private static int PPQRY_STANZIAMENTO = 2;
  private static int PPQRY_TOTALEFINANZ = 3;

  private static int PPQRY_T69 = 4;


  IDPanel PAN_FINANZIAMENT;

  // Definition of Global Variables
  private IDVariant FASE = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI11(IMDB);
    Init_TBL_PARAMETRIOL3(IMDB);
    //
    //
    Init_PQRY_FINALT1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI11, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI11, "TBL_PARAMETRI11");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARASTANATTU, "PARASTANATTU");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI11,IMDBDef6.FLD_PARAMETRI11_PARASTANATTU,3,14,2);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI11, 0);
  }

  private static void Init_TBL_PARAMETRIOL3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRIOL3, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRIOL3, "TBL_PARAMETRIOL3");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIOL3,IMDBDef6.FLD_PARAMETRIOL3_CAPITOLOOLD, "CAPITOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIOL3,IMDBDef6.FLD_PARAMETRIOL3_CAPITOLOOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIOL3,IMDBDef6.FLD_PARAMETRIOL3_ARTICOLOOLD, "ARTICOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIOL3,IMDBDef6.FLD_PARAMETRIOL3_ARTICOLOOLD,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRIOL3, 0);
  }

  private static void Init_PQRY_FINALT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_FINALT1, 14);
    IMDB.set_TblCode(IMDBDef16.PQRY_FINALT1, "PQRY_FINALT1");
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_CAPITOLO_S, "CAPITOLO_S");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_CAPITOLO_S,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_ARTICOLO_S, "ARTICOLO_S");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_ARTICOLO_S,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_CAPITOLO_E, "CAPITOLO_E");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_CAPITOLO_E,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_ARTICOLO_E, "ARTICOLO_E");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_ARTICOLO_E,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_FIN_DISAVA, "FIN_DISAVA");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_FIN_DISAVA,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_E, "E");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_E,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_S, "S");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_S,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINALT1,IMDBDef16.PQSL_FINALT1_TIPO_STAMPA,1,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_FINALT1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentoAltreVociPegEffettivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentoAltreVociPegEffettivo()
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
    FormIdx = MyGlb.FRM_FINALTVOPEEF;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2A592EFA-8AC5-4F0B-915E-A6936BF60968";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 756;
    DesignHeight = 498;
    set_Caption(new IDVariant("Finanziamento Altre Voci Peg Effettivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 756;
    Frames[1].Height = 472;
    Frames[1].Caption = "Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 472;
    PAN_FINANZIAMENT = new IDPanel(w, this, 1, "PAN_FINANZIAMENT");
    Frames[1].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 756-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6A6C0394-59A4-4783-BB14-01ED4BD21D2F");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 12, 44, 656, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZIAMENT.InitStatus = 2;
    PAN_FINANZIAMENT_Init();
    PAN_FINANZIAMENT_InitFields();
    PAN_FINANZIAMENT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_NUOVO14+BaseCmdLinIdx)
      {
        Nuovo();
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
      PAN_FINANZIAMENT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_ELVOPECOSTEF && flRis && IdxPanelActived == PAN_FINANZIAMENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_FINANZIAMENT_APRIVOCEPEG) {
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
    return (obj instanceof FinanziamentoAltreVociPegEffettivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentoAltreVociPegEffettivo.class.getName() : (Glb.ClassWithPackage(FinanziamentoAltreVociPegEffettivo.class) ? FinanziamentoAltreVociPegEffettivo.class.getName().substring(FinanziamentoAltreVociPegEffettivo.class.getPackage().getName().length() + 1) : FinanziamentoAltreVociPegEffettivo.class.getName()));
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
    IDVariant v_TOTFINANZIAM = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOTFINANZIAT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_STANZIATTUAL = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Finanziamento", IDVariant.STRING));
      v_TOTFINANZIAM = (new IDVariant("Totale Finanziamenti", IDVariant.STRING));
      v_TOTFINANZIAT = (new IDVariant("Totale Finanziato", IDVariant.STRING));
      v_STANZIATTUAL = (new IDVariant("Stanziamento Attuale ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      FASE = MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (FASE.compareTo((new IDVariant(0)), true)>=0 && FASE.compareTo((new IDVariant(7)), true)<=0)
      {
        if ((new IDVariant(PAN_FINANZIAMENT.Layout())).equals((new IDVariant(0)), true))
        {
          DisabilitaCampi();
        }
        else
        {
          AbilitaCampi();
        }
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO14+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        DisabilitaCampi();
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO14+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S")), true))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_TOTALE, new IDVariant(v_TOTFINANZIAM).stringValue());
        PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_INTESTALABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo/Art.")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0))).stringValue());
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_TOTALE, new IDVariant(v_TOTFINANZIAT).stringValue());
        PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_INTESTALABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo/Art.")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0))).stringValue());
      }
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_STANATTULABE, IDL.Add(v_STANZIATTUAL, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARASTANATTU, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELVOPECOSTEF)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0, IMDB.Value(IMDBDef7.PQRY_BIL2, IMDBDef7.PQSL_BIL2_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0, IMDB.Value(IMDBDef7.PQRY_BIL2, IMDBDef7.PQSL_BIL2_ARTICOLO, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0, IMDB.Value(IMDBDef7.PQRY_BIL2, IMDBDef7.PQSL_BIL2_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0, IMDB.Value(IMDBDef7.PQRY_BIL2, IMDBDef7.PQSL_BIL2_ARTICOLO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "EndModalEvent", _e);
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

    try
    {
      TransCount = 0;
      // 
      // Unload Event Body
      // Procedure Body
      // 
      AnnullaParametriOld();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento On Change Row Event Body
      // Procedure Body
      // 
      VisibilitaVocePeg();
      SettaGruppoVocePeg();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "FinanziamentoOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento On Updating Row Event Body
      // Procedure Body
      // 
      if (PAN_FINANZIAMENT.IsNewRow())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S")), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_S, 0)))
          {
            IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_S, 0, (new IDVariant("S")));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0)))
          {
            IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0)))
          {
            IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0));
          }
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_E, 0)))
          {
            IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_E, 0, (new IDVariant("E")));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0)))
          {
            IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0)))
          {
            IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0));
          }
        }
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_FINANZIAMENT_CAPITOLSPESA)), true) || Column.equals((new IDVariant(PFL_FINANZIAMENT_ARTICOLSPESA)), true) || Column.equals((new IDVariant(PFL_FINANZIAMENT_CAPITOENTRAT)), true) || Column.equals((new IDVariant(PFL_FINANZIAMENT_ARTICOENTRAT)), true))
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("E")), true))
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_CAPITOLOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_ARTICOLOOLD, 0),(new IDVariant(-1))), true)!=0)
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0))))
            {
              if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("S")), IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0), IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0)).compareTo((new IDVariant(1)), true)!=0)
              {
                IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                v_AVVISO = (new IDVariant("Voce P.e.g. non valida", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_AVVISO); 
                IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0, (new IDVariant()));
                return;
              }
            }
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_CAPITOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0));
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_ARTICOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0));
          }
        }
        else
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_CAPITOLOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_ARTICOLOOLD, 0),(new IDVariant(-1))), true)!=0)
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0))))
            {
              if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("E")), IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0), IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0)).compareTo((new IDVariant(1)), true)!=0)
              {
                IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                v_AVVISO = (new IDVariant("Voce P.e.g. non valida", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_AVVISO); 
                IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0, (new IDVariant()));
                return;
              }
            }
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_CAPITOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0));
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_ARTICOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "FinanziamentoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento On Database Error Event
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
  private void PAN_FINANZIAMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_FINANZIAMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Finanziamento On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "FinanziamentoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(128)), true))
      {
        if (PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO).compareTo(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARASTANATTU, 0), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Attenzione: La somma dei Finanziamenti è superiore allo stanziamento - Capitolo/Art.  ", IDVariant.STRING));
          v_AVVISO = IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0)));
          MainFrm.set_AlertMessage(v_AVVISO); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        if (IDL.ToFloat((new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_TOTALE)))).compareTo(IDL.ToFloat((new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_STANZIAMENTO)))), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Attenzione: Finanziamento superiore allo stanziamento - Capitolo/Art. ", IDVariant.STRING));
          IDVariant v_CAP = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ART = new IDVariant(0,IDVariant.INTEGER);
          v_CAP = new IDVariant(((IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S"))))?IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0):IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0)),IDVariant.INTEGER);
          v_ART = ((IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S"))))?IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0):IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0));
          v_AVVISO = IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(v_CAP)), (new IDVariant(" / "))), IDL.ToString(v_ART));
          MainFrm.set_AlertMessage(v_AVVISO); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      if (Command.equals((new IDVariant(8)), true) || Command.equals((new IDVariant(256)), true))
      {
        if ((new IDVariant(PAN_FINANZIAMENT.Layout())).equals((new IDVariant(0)), true))
        {
          PAN_FINANZIAMENT.set_Layout((new IDVariant(1)).intValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "FinanziamentoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che può essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_FINANZIAMENT_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(0)), true))
      {
        DisabilitaCampi();
      }
      else
      {
        if (FASE.compareTo((new IDVariant(0)), true)>=0 && FASE.compareTo((new IDVariant(7)), true)<=0)
        {
          AbilitaCampi();
        }
        else
        {
          DisabilitaCampi();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "FinanziamentoOnChangeLayoutEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
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
      // Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_CAPITOLO,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_CAPITOLO))).stringValue()); 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ARTICOLO,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ARTICOLO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "FinanziamentoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento After Find Event Body
      // Procedure Body
      // 
      VisibilitaVocePeg();
      SettaParametriOld();
      // SettaGruppoVocePeg();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "FinanziamentoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Abilita Campi
  // **********************************************************************
  public int AbilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Campi Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "AbilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Campi
  // **********************************************************************
  public int DisabilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Campi Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "DisabilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce Peg
  // **********************************************************************
  public int ApriVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI308, IMDBDef1.FLD_PARAMETRI308_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI308, IMDBDef1.FLD_PARAMETRI308_PARAMES, 0, ((IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S"))))?(new IDVariant("E")):(new IDVariant("S"))));
      MainFrm.Show(MyGlb.FRM_ELVOPECOSTEF, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "ApriVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Voce Peg
  // **********************************************************************
  public int VisibilitaVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ART = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilita Voce Peg Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("E")), true))
      {
        v_CAP = new IDVariant(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0),IDVariant.INTEGER);
        v_ART = IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0);
      }
      else
      {
        v_CAP = new IDVariant(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0),IDVariant.INTEGER);
        v_ART = IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0);
      }
      // 
      // 
      // 
      // 
      if (v_CAP.equals((new IDVariant(0)), true))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_ART.equals((new IDVariant(0)), true))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "VisibilitaVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Parametri Old
  // **********************************************************************
  public int SettaParametriOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Parametri Old Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_CAPITOLOOLD, 0, ((IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S"))))?IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0):IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0)));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL3, IMDBDef6.FLD_PARAMETRIOL3_ARTICOLOOLD, 0, ((IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S"))))?IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0):IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "SettaParametriOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Parametri Old
  // **********************************************************************
  public int AnnullaParametriOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Parametri Old Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL2, IMDBDef6.FLD_PARAMETRIOL2_CAPITOLOOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL2, IMDBDef6.FLD_PARAMETRIOL2_ARTICOLOOLD, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "AnnullaParametriOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Gruppo Voce Peg
  // **********************************************************************
  public int SettaGruppoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ART = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Capitolo/Art. ", IDVariant.STRING));
      // 
      // Setta Gruppo Voce Peg Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_FINANZIAMENT.Layout())).equals((new IDVariant(1)), true))
      {
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_GROUP,GRP_FINANZIAMENT_CAPITOLOART,v_CAPTION.stringValue()); 
      }
      else
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("E")), true))
        {
          v_CAP = (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_CAPITOLSPESA)));
          v_ART = (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ARTICOLSPESA)));
        }
        else
        {
          v_CAP = (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_CAPITOENTRAT)));
          v_ART = (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ARTICOENTRAT)));
        }
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_GROUP,GRP_FINANZIAMENT_CAPITOLOART,IDL.Add(IDL.Add(IDL.Add(v_CAPTION, v_CAP), (new IDVariant(" / "))), v_ART).stringValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "SettaGruppoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Nuova Riga
  // **********************************************************************
  public int ProponiNuovaRiga ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Nuova Riga Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ESERCIZIO, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0).equals((new IDVariant("S")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_S, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_S, 0, (new IDVariant("S")));
        }
        // 
        // 
        // 
        // 
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_S, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_S, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0));
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_E, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_E, 0, (new IDVariant("E")));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_CAPITOLO_E, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_ARTICOLO_E, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "ProponiNuovaRiga", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Nuovo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Body
      // Corpo Procedura
      // 
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_INSERT);
      ProponiNuovaRiga();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAltreVociPegEffettivo", "Nuovo", _e);
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
  private void PAN_FINANZIAMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZIAMENT, Cancel);
    // Stub
  }

  private void PAN_FINANZIAMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FINANZIAMENT_APRIVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_FINANZIAMENT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FINANZIAMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FINANZIAMENT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZIAMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_E, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_S, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_FINALT1, IMDBDef16.PQSL_FINALT1_S, 0, (new IDVariant("S")));
      }
      if (Cancel.isFalse())
      {
        PAN_FINANZIAMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, "CBAA7012-DED4-4484-91CD-81FEB51DE9CB");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, "Capitolo/Art.");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, "Capitolo/Art.");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, MyGlb.PANEL_LIST, 0, 303, 548, 97, 0, 0);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, MyGlb.PANEL_FORM, 8, 43, 540, 105, 0, 0);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 0, 73);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 1, 13);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 0, 4);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 1, 4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, "0C3C93A1-4C07-4517-A1B9-A44084923FAF");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, "18E18B2B-308C-45B4-A4A2-141556C1029D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.VIS_ETICGRASIMPO);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "BA1BA9C3-66A5-4BBA-9AD1-48D76897BD7D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "Capitolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "C5009FA8-CFD1-4A74-B0DF-7D5BC1639347");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "Articolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, "7CC3C312-EF00-486F-BFDC-E8A9E984A0D2");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.VIS_SFONEBORDTRA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, "DE36B948-3A1E-4A9F-BC82-C7C63E7DDC3B");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, "Stanziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, "CA1B54DB-30C3-4989-BE2F-7184DDBB0214");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, "Totale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, "3B637D48-4CC0-45F5-B0E0-3B625F16B7D0");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, "Capitolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.VIS_NORFIEINTLUN);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, "D021C3D4-66BE-4122-83B9-2402D1537A63");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, "Art.");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, "37315C44-85D4-458A-85A9-A3B4E72417AA");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, "Capitolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.VIS_NORFIEINTLUN);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, "0D886F8D-875B-4BF3-84FA-29B3640D9A62");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, "Art.");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, "76AF4191-1F0E-48DA-953F-6527113918F2");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, 0, "wsearch1.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, "9F8B620E-1FE2-4BFE-AC1F-22D8A06818C7");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, "Allegato");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "799C1F02-714F-4D99-AC09-5F971F6EDC64");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "Importo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, "DD75C98E-E74F-468D-9027-6980B0158A77");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, "Disavanzo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.VIS_CHECKSTYLE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "C15F37FD-DDAD-4B45-88A2-7A3060334C12");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "ESERCIZIO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, "0F09C083-7D79-4000-9B05-5A8F3B973A59");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, "E");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "A8669C9F-8D5D-4531-A6FB-6BDFA43DA4EE");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "S");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "49C3F844-397E-46E2-93FE-A7B3B7855735");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "1A098E0A-33DF-4074-BA47-3BBDF0B9CC0C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "E2AF9B0B-C666-4B7F-9F2C-ABA8F638A9AF");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "10BC6DA3-E0C1-43D4-8D7D-F500CBCA507A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, "7A74A0F1-E1DD-466E-99DC-3CD811A6577A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, "/");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, MyGlb.VIS_VUOTONORMALE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_LIST, 12, 8, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_FORM, 16, 8, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_INTESTALABEL, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_LIST, 292, 8, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_FORM, 308, 8, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_STANATTULABE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_STANATTULABE, -1, "", "STANATTULABE", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 28, 328, 516, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 28, 76, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOLO, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOLO, PPQRY_DESCRVOCEPEG, "A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', 'S', 'E'),DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~),0)", "CAPCAPITDESC", 5, 99, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 28, 352, 516, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 32, 100, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOLO, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOLO, PPQRY_DESCRVOCEPEG, "A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', 'S', 'E'),DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~),DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~ARTICOLO_S~~, ~~ARTICOLO_E~~))", "CAPARTICDESC", 5, 99, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 364, 136, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 364, 68, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_VOCEPEGLABEL, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, 4, 376, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, 12, 124, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, 88);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_STANZIAMENTO, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_STANZIAMENTO, PPQRY_STANZIAMENTO, "A.STN_INI_CO + A.VARIAZIONI_CO", "BILSTANZIAME", 3, 28, 6, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_LIST, 268, 376, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_LIST, 144);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_LIST, "Totale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_FORM, 240, 124, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_FORM, 168);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALE, MyGlb.PANEL_FORM, "Totale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_TOTALE, -1, GRP_FINANZIAMENT_CAPITOLOART);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(B.IMPORTO), 0) ");
  SQL.append("from ");
  SQL.append("  FINALT B ");
  SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
  SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', B.S, B.E) = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', 'S', 'E')) ");
  SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', B.CAPITOLO_S, B.CAPITOLO_E) = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~)) ");
  SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', B.ARTICOLO_S, B.ARTICOLO_E) = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~ARTICOLO_S~~, ~~ARTICOLO_E~~)) ");
  SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', B.CAPITOLO_S, B.CAPITOLO_E) <> DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~)) ");
  SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', B.ARTICOLO_S, B.ARTICOLO_E) <> DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~ARTICOLO_S~~, ~~ARTICOLO_E~~)) ");
  SQL.append(") + DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(C.IMPORTO), 0) ");
  SQL.append("from ");
  SQL.append("  FINAVA C ");
  SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
  SQL.append("and   (C.S = 'S') ");
  SQL.append("and   (C.CAPITOLO = ~~CAPITOLO_S~~) ");
  SQL.append("and   (C.ARTICOLO = ~~ARTICOLO_S~~) ");
  SQL.append("), 0) + ~~IMPORTO~~");
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_TOTALE, PPQRY_TOTALEFINANZ, SQL.toString(), "FINATOTAFINA", 3, 28, 6, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_LIST, 12, 80, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_FORM, 180, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLSPESA, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOLSPESA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOLSPESA, PPQRY_FINALT1, "A.CAPITOLO_S", "CAPITOLO_S", 3, 16, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_LIST, 116, 80, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_LIST, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_LIST, "Art.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_FORM, 252, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_FORM, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLSPESA, MyGlb.PANEL_FORM, "Art.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOLSPESA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOLSPESA, PPQRY_FINALT1, "A.ARTICOLO_S", "ARTICOLO_S", 1, 6, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_LIST, 148, 80, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_FORM, 104, 48, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOENTRAT, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOENTRAT, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOENTRAT, PPQRY_FINALT1, "A.CAPITOLO_E", "CAPITOLO_E", 3, 16, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_LIST, 252, 80, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_LIST, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_LIST, "Art.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_FORM, 252, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_FORM, 72);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOENTRAT, MyGlb.PANEL_FORM, "Art.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOENTRAT, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOENTRAT, PPQRY_FINALT1, "A.ARTICOLO_E", "ARTICOLO_E", 1, 6, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, MyGlb.PANEL_LIST, 260, 52, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, MyGlb.PANEL_FORM, 280, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRIVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_APRIVOCEPEG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_APRIVOCEPEG, -1, "", "APRIVOCEPEG", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, 284, 80, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, 76);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_LIST, "Allegato");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, 40, 164, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ALLEGATO, MyGlb.PANEL_FORM, "Allegato");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ALLEGATO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ALLEGATO, PPQRY_FINALT1, "A.TIPO_STAMPA", "TIPO_STAMPA", 1, 2, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 484, 80, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 564, 48, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_IMPORTO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_IMPORTO, PPQRY_FINALT1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, 600, 80, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, "Disavanzo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, 456, 164, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, "Disavanzo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DISAVANZO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DISAVANZO, PPQRY_FINALT1, "A.FIN_DISAVA", "FIN_DISAVA", 5, 2, 0, -13997);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_DISAVANZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FINANZIAMENT.SetValueListItem(PFL_FINANZIAMENT_DISAVANZO, (new IDVariant()), "Null", "", "", -1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ESERCIZIO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ESERCIZIO, PPQRY_FINALT1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, 252, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, 16);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, "E");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, "E");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_E, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_E, PPQRY_FINALT1, "A.E", "E", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 292, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 16);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, "S");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 4, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, "S");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_S, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_S, PPQRY_FINALT1, "A.S", "S", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 372, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_UTENTEINSERI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_UTENTEINSERI, PPQRY_FINALT1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 444, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DATAINSERIME, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DATAINSERIME, PPQRY_FINALT1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 540, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_UTENTULTIAGG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_UTENTULTIAGG, PPQRY_FINALT1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 612, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 372, 28, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DATAULTIMAGG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DATAULTIMAGG, PPQRY_FINALT1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, MyGlb.PANEL_LIST, 48, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, MyGlb.PANEL_FORM, 232, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRLABEFORM, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_BARRLABEFORM, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_BARRLABEFORM, -1, "", "BARRLABEFORM", 0, 0, 0, -13997);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', 'S', 'E'),0,0) as CAPINTERDESC, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', 'S', 'E'),DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~),0) as CAPCAPITDESC, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', 'S', 'E'),DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~),DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~ARTICOLO_S~~, ~~ARTICOLO_E~~)) as CAPARTICDESC ");
    SQL.append("from ");
    SQL.append("  BIL A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', 'E', 'S')) ");
    SQL.append("and   (A.CAPITOLO = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~CAPITOLO_E~~, ~~CAPITOLO_S~~)) ");
    SQL.append("and   (A.ARTICOLO = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~ARTICOLO_E~~, ~~ARTICOLO_S~~)) ");
    SQL.append("and   (A.STN_INI_CO + A.VARIAZIONI_CO > 0) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_DESCRVOCEPEG, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_DESCRVOCEPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_DESCRVOCEPEG, "BIL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO as BILSTANZIAME ");
    SQL.append("from ");
    SQL.append("  BIL A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', 'E', 'S')) ");
    SQL.append("and   (A.CAPITOLO = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~CAPITOLO_E~~, ~~CAPITOLO_S~~)) ");
    SQL.append("and   (A.ARTICOLO = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~ARTICOLO_E~~, ~~ARTICOLO_S~~)) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_STANZIAMENTO, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_STANZIAMENTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_STANZIAMENTO, "BIL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(B.IMPORTO), 0) ");
    SQL.append("from ");
    SQL.append("  FINALT B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', B.S, B.E) = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', 'S', 'E')) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', B.CAPITOLO_S, B.CAPITOLO_E) = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~)) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', B.ARTICOLO_S, B.ARTICOLO_E) = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ~~ARTICOLO_S~~, ~~ARTICOLO_E~~)) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', B.CAPITOLO_S, B.CAPITOLO_E) <> DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~CAPITOLO_S~~, ~~CAPITOLO_E~~)) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', B.ARTICOLO_S, B.ARTICOLO_E) <> DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', ~~ARTICOLO_S~~, ~~ARTICOLO_E~~)) ");
    SQL.append(") + DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', ( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(C.IMPORTO), 0) ");
    SQL.append("from ");
    SQL.append("  FINAVA C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.S = 'S') ");
    SQL.append("and   (C.CAPITOLO = ~~CAPITOLO_S~~) ");
    SQL.append("and   (C.ARTICOLO = ~~ARTICOLO_S~~) ");
    SQL.append("), 0) + ~~IMPORTO~~ as FINATOTAFINA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_TOTALEFINANZ, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_TOTALEFINANZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_TOTALEFINANZ, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T69CODICE, ");
    SQL.append("  A.DESC_ABB as T69DESCABB ");
    SQL.append("from ");
    SQL.append("  T69 A ");
    SQL.append("where (A.CODICE = ~~TIPO_STAMPA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESC_ABB ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_T69, 0, SQL, PFL_FINANZIAMENT_ALLEGATO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T69CODICE, ");
    SQL.append("  A.DESC_ABB as T69DESCABB ");
    SQL.append("from ");
    SQL.append("  T69 A ");
    SQL.append("order by ");
    SQL.append("  A.DESC_ABB ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_T69, 1, SQL, PFL_FINANZIAMENT_ALLEGATO, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_T69, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_FINALT1", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "FINALT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO_S as CAPITOLO_S, ");
    SQL.append("  A.ARTICOLO_S as ARTICOLO_S, ");
    SQL.append("  A.CAPITOLO_E as CAPITOLO_E, ");
    SQL.append("  A.ARTICOLO_E as ARTICOLO_E, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.FIN_DISAVA as FIN_DISAVA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINALT1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FINALT A ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINALT1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', A.E, A.S) = ~~TBL_PARAMETRI11.PARAENTRSPES~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', A.CAPITOLO_E, A.CAPITOLO_S) = ~~TBL_PARAMETRI11.PARAMCAPITOL~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'E', A.ARTICOLO_E, A.ARTICOLO_S) = ~~TBL_PARAMETRI11.PARAMARTICOL~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINALT1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINALT1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINALT1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINALT1, 5, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINALT1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(0, "FINALT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FINANZIAMENT.Status() == 2)
    {
      int oldListQBE = PAN_FINANZIAMENT.iUseListQBE;
      PAN_FINANZIAMENT.iUseListQBE = 0;
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZIAMENT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnChangeLayout(NewLayout, Cancel);
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnChangeRow();
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnPanelCommand(Command, Cancel, UserOp);
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
