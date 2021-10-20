// **********************************************
// Finanziamento Avanzo Di Amministrazione Simulato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentoAvanzoDiAmministrazioneSimulato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FINANZIAMENT_CAPITOLOART = 0;

  private static int PFL_FINANZIAMENT_PROGRESSIVO = 0;
  private static int PFL_FINANZIAMENT_INTESTALABEL = 1;
  private static int PFL_FINANZIAMENT_STANATTULABE = 2;
  private static int PFL_FINANZIAMENT_CAPITOLO1 = 3;
  private static int PFL_FINANZIAMENT_ARTICOLO = 4;
  private static int PFL_FINANZIAMENT_VOCEPEGLABEL = 5;
  private static int PFL_FINANZIAMENT_STANZIAMENTO = 6;
  private static int PFL_FINANZIAMENT_TOTALEFINANZ = 7;
  private static int PFL_FINANZIAMENT_CAPITOLO = 8;
  private static int PFL_FINANZIAMENT_ARTICOLO1 = 9;
  private static int PFL_FINANZIAMENT_APRVOCPEGFOR = 10;
  private static int PFL_FINANZIAMENT_IMPORTO = 11;
  private static int PFL_FINANZIAMENT_DISAVANZO = 12;
  private static int PFL_FINANZIAMENT_ESERCIZIO = 13;
  private static int PFL_FINANZIAMENT_E = 14;
  private static int PFL_FINANZIAMENT_S = 15;
  private static int PFL_FINANZIAMENT_CAPITOAVANZO = 16;
  private static int PFL_FINANZIAMENT_ARTICOAVANZO = 17;
  private static int PFL_FINANZIAMENT_UTENTEINSERI = 18;
  private static int PFL_FINANZIAMENT_DATAINSERIME = 19;
  private static int PFL_FINANZIAMENT_UTENTULTIAGG = 20;
  private static int PFL_FINANZIAMENT_DATAULTIMAGG = 21;
  private static int PFL_FINANZIAMENT_CAPARTLABLIS = 22;
  private static int PFL_FINANZIAMENT_BARRALABEL = 23;

  private static int PPQRY_FINAVA = 0;

  private static int PPQRY_DESCRVOCEPEG = 1;
  private static int PPQRY_STANZIAMENTO = 2;
  private static int PPQRY_TOTALEFINANZ = 3;


  IDPanel PAN_FINANZIAMENT;

  // Definition of Global Variables
  private IDVariant FASE = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI60(IMDB);
    Init_TBL_PARAMETRIOL6(IMDB);
    //
    //
    Init_PQRY_FINAVA(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI60(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI60, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI60, "TBL_PARAMETRI60");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARASTANATTU, "PARASTANATTU");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI60,IMDBDef6.FLD_PARAMETRI60_PARASTANATTU,3,14,2);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI60, 0);
  }

  private static void Init_TBL_PARAMETRIOL6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRIOL6, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRIOL6, "TBL_PARAMETRIOL6");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIOL6,IMDBDef6.FLD_PARAMETRIOL6_CAPITOLOOLD, "CAPITOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIOL6,IMDBDef6.FLD_PARAMETRIOL6_CAPITOLOOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIOL6,IMDBDef6.FLD_PARAMETRIOL6_ARTICOLOOLD, "ARTICOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIOL6,IMDBDef6.FLD_PARAMETRIOL6_ARTICOLOOLD,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRIOL6, 0);
  }

  private static void Init_PQRY_FINAVA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_FINAVA, 14);
    IMDB.set_TblCode(IMDBDef16.PQRY_FINAVA, "PQRY_FINAVA");
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_ARTICOLO_AVANZO, "ARTICOLO_AVANZO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_ARTICOLO_AVANZO,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_FIN_DISAVA, "FIN_DISAVA");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_FIN_DISAVA,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_E, "E");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_E,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_S, "S");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_S,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_CAPITOLO_AVANZO, "CAPITOLO_AVANZO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_CAPITOLO_AVANZO,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_FINAVA,IMDBDef16.PQSL_FINAVA_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_FINAVA, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentoAvanzoDiAmministrazioneSimulato(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentoAvanzoDiAmministrazioneSimulato()
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
    FormIdx = MyGlb.FRM_FINAVADIAMSI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "11D91D63-6A11-4CAD-8851-D44A684CA736";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 772;
    DesignHeight = 490;
    set_Caption(new IDVariant("Finanziamento Avanzo Di Amministrazione Simulato"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 772;
    Frames[1].Height = 464;
    Frames[1].Caption = "Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 464;
    PAN_FINANZIAMENT = new IDPanel(w, this, 1, "PAN_FINANZIAMENT");
    Frames[1].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 464-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8A3A16D4-DB53-4F0E-845C-4B6B926BE1FD");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 48, 324, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    if (CallerIdx == MyGlb.FRM_ELVOPECOSTSI && flRis && IdxPanelActived == PAN_FINANZIAMENT.FrIndex)
    {
      if (IdxFieldActived ==PFL_FINANZIAMENT_APRVOCPEGFOR) {
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
    return (obj instanceof FinanziamentoAvanzoDiAmministrazioneSimulato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentoAvanzoDiAmministrazioneSimulato.class.getName() : (Glb.ClassWithPackage(FinanziamentoAvanzoDiAmministrazioneSimulato.class) ? FinanziamentoAvanzoDiAmministrazioneSimulato.class.getName().substring(FinanziamentoAvanzoDiAmministrazioneSimulato.class.getPackage().getName().length() + 1) : FinanziamentoAvanzoDiAmministrazioneSimulato.class.getName()));
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
    IDVariant v_STANZIATTUAL = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Finanziamento", IDVariant.STRING));
      v_STANZIATTUAL = (new IDVariant("Stanziamento Attuale ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      FASE = MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (FASE.compareTo((new IDVariant(0)), true)>=0 && FASE.compareTo((new IDVariant(7)), true)<=0)
      {
        DisabilitaCampi();
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        DisabilitaCampi();
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_FINANZIAMENT.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_INTESTALABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo/Art.")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI60, IMDBDef6.FLD_PARAMETRI60_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI60, IMDBDef6.FLD_PARAMETRI60_PARAMARTICOL, 0))).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_STANATTULABE, IDL.Add(v_STANZIATTUAL, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRI60, IMDBDef6.FLD_PARAMETRI60_PARASTANATTU, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELVOPECOSTSI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_BIL3, IMDBDef7.PQSL_BIL3_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_BIL3, IMDBDef7.PQSL_BIL3_ARTICOLO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "EndModalEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "UnloadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoOnDatabaseErrorEvent", _e);
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
        if (PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_IMPORTO).compareTo(IMDB.Value(IMDBDef6.TBL_PARAMETRI60, IMDBDef6.FLD_PARAMETRI60_PARASTANATTU, 0), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Attenzione: La somma dei Finanziamenti è superiore allo stanziamento - Capitolo/Art. ", IDVariant.STRING));
          v_AVVISO = IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI60, IMDBDef6.FLD_PARAMETRI60_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI60, IMDBDef6.FLD_PARAMETRI60_PARAMARTICOL, 0)));
          MainFrm.set_AlertMessage(v_AVVISO); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
        if (IDL.ToFloat((new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_TOTALEFINANZ)))).compareTo(IDL.ToFloat((new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_STANZIAMENTO)))), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Attenzione: Finanziamento superiore allo stanziamento - Capitolo/Art. ", IDVariant.STRING));
          v_AVVISO = IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0)));
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
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoOnCommandEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoOnChangeLayoutEvent", _e);
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
      SettaGruppoVocePeg();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoOnChangeRowEvent", _e);
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
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_S, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_S, 0, (new IDVariant("S")));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO_AVANZO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO_AVANZO, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI60, IMDBDef6.FLD_PARAMETRI60_PARAMARTICOL, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_FINANZIAMENT_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_FINANZIAMENT_ARTICOLO1)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_CAPITOLOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_ARTICOLOOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0))))
          {
            if (MainFrm.ControlloBilancioSimulato(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("S")), IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0), IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0)).compareTo((new IDVariant(1)), true)!=0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Capitolo/Art. non valido", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
              IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0, (new IDVariant()));
              return;
            }
          }
          IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_CAPITOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_ARTICOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoOnUpdatingRowEvent", _e);
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
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_CAPITOLO1,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_CAPITOLO1))).stringValue()); 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ARTICOLO,(new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ARTICOLO))).stringValue()); 
      if (IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamento After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_FINANZIAMENT.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoAfterCommitEvent", _e);
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
      SettaParametriOld();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "FinanziamentoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Voce Peg
  // Explain which processing is carried out by this procedure
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI309, IMDBDef1.FLD_PARAMETRI309_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI309, IMDBDef1.FLD_PARAMETRI309_PARAMES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_ELVOPECOSTSI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "ApriVocePeg", _e);
      return -1;
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
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "AbilitaCampi", _e);
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
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "DisabilitaCampi", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_CAPITOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_ARTICOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_ARTICOLO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "SettaParametriOld", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_CAPITOLOOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRIOL6, IMDBDef6.FLD_PARAMETRIOL6_ARTICOLOOLD, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "AnnullaParametriOld", _e);
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
    IDVariant v_RISINT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ART = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Voce P.e.g. ", IDVariant.STRING));
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
        v_CAP = (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_CAPITOLO)));
        v_ART = (new IDVariant(PAN_FINANZIAMENT.FieldText(PFL_FINANZIAMENT_ARTICOLO1)));
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_GROUP,GRP_FINANZIAMENT_CAPITOLOART,IDL.Add(IDL.Add(IDL.Add(v_CAPTION, v_CAP), (new IDVariant(" / "))), v_ART).stringValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentoAvanzoDiAmministrazioneSimulato", "SettaGruppoVocePeg", _e);
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
    if (ColIndex.intValue() == PFL_FINANZIAMENT_APRVOCPEGFOR)
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
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_E, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_S, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_S, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO_AVANZO, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_FINAVA, IMDBDef16.PQSL_FINAVA_CAPITOLO_AVANZO, 0, (new IDVariant(999999)));
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
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, "44C13C91-B911-4D78-8A34-D286BD467A81");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, "Capitolo/Art.");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, "Capitolo/Art.");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, MyGlb.PANEL_LIST, 0, 319, 548, 97, 0, 0);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, MyGlb.PANEL_FORM, 12, 43, 544, 105, 0, 0);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 0, 67);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 1, 13);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 0, 4);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 1, 4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, "F28DDB02-EA72-4E2A-B3F6-A09990A1F752");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, "PROGRESSIVO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, "1D76B1DE-A06B-4CB6-9CA1-A4EEF7F1EB62");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, "760CB8CF-4768-487E-84C8-11EA8973B64C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.VIS_ETICGRASIMPO);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, "2DB26C89-066C-4AC6-B027-7451FCC9CB41");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, "Capitolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "5E53614E-C56F-4BBD-A8E3-D51EE5DF0679");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "Articolo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, "12BA9CBA-36D0-4510-AFB4-9C660C87D4C1");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.VIS_SFONEBORDTRA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, "C6550EB3-7F1A-4AAF-B764-D45907696A77");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, "Stanziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, "DF0462F1-AD44-4B1F-9D18-E8DC89612C99");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, "Totale Finanziato");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "0655D30D-4C8C-42FB-8905-211748F34EFB");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "CAPITOLO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, "9E5DCE56-2409-4121-9501-65DC696104BF");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, "ARTICOLO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, "D1167BFF-0576-4179-B9C2-86F60A89899B");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, MyGlb.VIS_STATICBUTTON);
    PAN_FINANZIAMENT.SetImage(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, 0, "wsearch1.gif", false);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "69F86DB6-C576-472C-BEBB-1EC7DD2444F3");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "Importo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, "F8E6A17F-B74A-4C05-9D69-3C86C08A19D2");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, "Disavanzo");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.VIS_CHECKSTYLE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "AD81499F-97A6-4E45-A119-E5670A26413B");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "ESERCIZIO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ESERCIZIO, 0, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, "E7C1D76F-67B5-472E-B976-8BC6D5607017");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, "E");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "A4CFB660-DBC2-4410-8600-7BAB55922D81");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "S");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, "E304254A-C565-4B18-A430-8AC5A067A3DE");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, "CAPITOLO AVANZO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, "8714629F-3BAA-4028-9FB7-47F4CFD3902E");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, "ARTICOLO AVANZO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.VIS_NONNULLAFIEL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, 0, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "E2500C16-5A2A-4A4D-B8F8-2404482E401D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "AB5C86EF-222B-4C78-B1D9-A6455B9A017A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "020AC68F-F69E-47F7-9EA4-85DED36029E4");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "D37754EA-ADF5-4E30-8280-50A605030854");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, "FAEC5EAC-5F31-41DE-A117-17287215CFFD");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, "Capitolo/Art.");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, MyGlb.VIS_LABEVISUSTYL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, "ED108E30-F12A-4F93-887B-3255C230E5ED");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, "/");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_LIST, 16, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_FORM, 12, 272, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PROGRESSIVO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PROGRESSIVO, PPQRY_FINAVA, "A.PROGRESSIVO", "PROGRESSIVO", 1, 10, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_LIST, 12, 8, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_FORM, 12, 8, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_INTESTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_INTESTALABEL, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_LIST, 316, 8, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_FORM, 320, 8, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANATTULABE, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_STANATTULABE, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_STANATTULABE, -1, "", "STANATTULABE", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_LIST, 36, 344, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_LIST, 56);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_FORM, 40, 76, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOLO1, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOLO1, PPQRY_DESCRVOCEPEG, "A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,~~S~~,~~CAPITOLO~~,0)", "CAPCAPITDESC", 5, 99, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 36, 368, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 56);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 44, 100, 508, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOLO, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOLO, PPQRY_DESCRVOCEPEG, "A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,~~S~~,~~CAPITOLO~~,~~ARTICOLO~~)", "CAPARTICDESC", 5, 99, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 268, 124, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 312, 68, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VOCEPEGLABEL, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_VOCEPEGLABEL, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, 4, 392, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, 88);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, 16, 124, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, 88);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziamento");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_STANZIAMENTO, -1, GRP_FINANZIAMENT_CAPITOLOART);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_STANZIAMENTO, PPQRY_STANZIAMENTO, "A.STN_INI_CO + A.VARIAZIONI_CO", "BILSTANZIAME", 3, 28, 6, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_LIST, 304, 392, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_LIST, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_LIST, "Totale Finanziato");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_FORM, 240, 124, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_FORM, 180);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_TOTALEFINANZ, MyGlb.PANEL_FORM, "Totale Finanziato");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_TOTALEFINANZ, -1, GRP_FINANZIAMENT_CAPITOLOART);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(B.IMPORTO), 0) ");
  SQL.append("from ");
  SQL.append("  FINALT B ");
  SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
  SQL.append("and   (B.S = 'S') ");
  SQL.append("and   (B.CAPITOLO_S = ~~CAPITOLO~~) ");
  SQL.append("and   (B.ARTICOLO_S = ~~ARTICOLO~~) ");
  SQL.append(") + ( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(C.IMPORTO), 0) ");
  SQL.append("from ");
  SQL.append("  FINAVA C ");
  SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
  SQL.append("and   (C.S = 'S') ");
  SQL.append("and   (C.CAPITOLO = ~~CAPITOLO~~) ");
  SQL.append("and   (C.ARTICOLO = ~~ARTICOLO~~) ");
  SQL.append("and   (C.PROGRESSIVO <> ~~PROGRESSIVO~~) ");
  SQL.append(") + NVL(~~IMPORTO~~, 0)");
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_TOTALEFINANZ, PPQRY_TOTALEFINANZ, SQL.toString(), "FINATOTAFINA", 3, 28, 6, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 16, 84, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 108, 48, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOLO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOLO, PPQRY_FINAVA, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_LIST, 132, 84, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_LIST, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_LIST, "AR.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_FORM, 244, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_FORM, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOLO1, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOLO1, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOLO1, PPQRY_FINAVA, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, MyGlb.PANEL_LIST, 264, 76, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, MyGlb.PANEL_FORM, 284, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_APRVOCPEGFOR, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_APRVOCPEGFOR, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_APRVOCPEGFOR, -1, "", "APRVOCPEGFOR", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 160, 84, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 568, 48, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 60);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_IMPORTO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_IMPORTO, PPQRY_FINAVA, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, 272, 84, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_LIST, "Disavanzo");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, 464, 160, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISAVANZO, MyGlb.PANEL_FORM, "Disavanzo");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DISAVANZO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DISAVANZO, PPQRY_FINAVA, "A.FIN_DISAVA", "FIN_DISAVA", 5, 2, 0, -13997);
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
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ESERCIZIO, PPQRY_FINAVA, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, 252, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, 16);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_LIST, "E");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_E, MyGlb.PANEL_FORM, "E");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_E, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_E, PPQRY_FINAVA, "A.E", "E", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 292, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 16);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_LIST, "S");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 4, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_S, MyGlb.PANEL_FORM, "S");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_S, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_S, PPQRY_FINAVA, "A.S", "S", 5, 1, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_LIST, 452, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_LIST, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_LIST, "CAPIT. AVANZO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPITOAVANZO, MyGlb.PANEL_FORM, "CAPITOLO AVANZO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPITOAVANZO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPITOAVANZO, PPQRY_FINAVA, "A.CAPITOLO_AVANZO", "CAPITOLO_AVANZO", 1, 6, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_LIST, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_LIST, "ART. AVN.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_FORM, 204, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_FORM, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ARTICOAVANZO, MyGlb.PANEL_FORM, "ARTICOLO AVANZO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ARTICOAVANZO, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ARTICOAVANZO, PPQRY_FINAVA, "A.ARTICOLO_AVANZO", "ARTICOLO_AVANZO", 1, 2, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 372, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_UTENTEINSERI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_UTENTEINSERI, PPQRY_FINAVA, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 444, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DATAINSERIME, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DATAINSERIME, PPQRY_FINAVA, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 540, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 136);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_UTENTULTIAGG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_UTENTULTIAGG, PPQRY_FINAVA, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 612, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 372, 28, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DATAULTIMAGG, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DATAULTIMAGG, PPQRY_FINAVA, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, MyGlb.PANEL_LIST, 16, 48, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, MyGlb.PANEL_FORM, 0, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CAPARTLABLIS, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CAPARTLABLIS, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CAPARTLABLIS, -1, "", "CAPARTLABLIS", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, MyGlb.PANEL_LIST, 24, 24, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, MyGlb.PANEL_FORM, 228, 48, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_BARRALABEL, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_BARRALABEL, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_BARRALABEL, -1, "", "BARRALABEL", 0, 0, 0, -13997);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,~~S~~,0,0) as CAPINTERDESC, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,~~S~~,~~CAPITOLO~~,0) as CAPCAPITDESC, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~ESERCIZIO~~,~~S~~,~~CAPITOLO~~,~~ARTICOLO~~) as CAPARTICDESC ");
    SQL.append("from ");
    SQL.append("  BPR A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI11.PARAENTRSPES~~, 'S', 'E', 'S')) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.STN_INI_CO + A.VARIAZIONI_CO > 0) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_DESCRVOCEPEG, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_DESCRVOCEPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_DESCRVOCEPEG, "BPR");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STN_INI_CO + A.VARIAZIONI_CO as BILSTANZIAME ");
    SQL.append("from ");
    SQL.append("  BPR A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_STANZIAMENTO, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_STANZIAMENTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_STANZIAMENTO, "BPR");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(B.IMPORTO), 0) ");
    SQL.append("from ");
    SQL.append("  FINALT B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.S = 'S') ");
    SQL.append("and   (B.CAPITOLO_S = ~~CAPITOLO~~) ");
    SQL.append("and   (B.ARTICOLO_S = ~~ARTICOLO~~) ");
    SQL.append(") + ( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(C.IMPORTO), 0) ");
    SQL.append("from ");
    SQL.append("  FINAVA C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.S = 'S') ");
    SQL.append("and   (C.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (C.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (C.PROGRESSIVO <> ~~PROGRESSIVO~~) ");
    SQL.append(") + NVL(~~IMPORTO~~, 0) as FINATOTAFINA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_TOTALEFINANZ, 0, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_TOTALEFINANZ, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(PPQRY_TOTALEFINANZ, "DUAL");
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_FINAVA", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "FINAVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.ARTICOLO_AVANZO as ARTICOLO_AVANZO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.FIN_DISAVA as FIN_DISAVA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.CAPITOLO_AVANZO as CAPITOLO_AVANZO, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINAVA, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FINAVA A ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINAVA, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI60.PARAENTRSPES~~, 'E', A.E, A.S) = ~~TBL_PARAMETRI60.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO_AVANZO = ~~TBL_PARAMETRI60.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO_AVANZO = ~~TBL_PARAMETRI60.PARAMARTICOL~~) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINAVA, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINAVA, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINAVA, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINAVA, 5, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINAVA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(0, "FINAVA");
    PAN_FINANZIAMENT.AddToSortList(PFL_FINANZIAMENT_PROGRESSIVO, true);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_AfterCommit(RowUpdated, RowError);
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
