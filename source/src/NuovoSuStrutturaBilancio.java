// **********************************************
// Nuovo Su Struttura Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class NuovoSuStrutturaBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_NUOVO_INSERIMENTO = 0;
  private static int GRP_NUOVO_AGGIORNAMENT = 1;

  private static int PFL_NUOVO_STRUTTURAID = 0;
  private static int PFL_NUOVO_SCHEMSTRUTID = 1;
  private static int PFL_NUOVO_VALORE = 2;
  private static int PFL_NUOVO_ETICHETTA = 3;
  private static int PFL_NUOVO_DESCRIZIONE = 4;
  private static int PFL_NUOVO_CAPITOCOLLEG = 5;
  private static int PFL_NUOVO_TRASPARENTE = 6;
  private static int PFL_NUOVO_CONTABSPECIA = 7;
  private static int PFL_NUOVO_UTENTE1 = 8;
  private static int PFL_NUOVO_DATA1 = 9;
  private static int PFL_NUOVO_UTENTE = 10;
  private static int PFL_NUOVO_DATA = 11;
  private static int PFL_NUOVO_ES = 12;
  private static int PFL_NUOVO_LIVELLO = 13;
  private static int PFL_NUOVO_CODIPADRGERA = 14;
  private static int PFL_NUOVO_CODICE = 15;
  private static int PFL_NUOVO_CODICEGERARC = 16;
  private static int PFL_NUOVO_ESERCIZIO = 17;
  private static int PFL_NUOVO_TIPOSPESA = 18;
  private static int PFL_NUOVO_ESCLCONTDODI = 19;

  private static int PPQRY_BILSTRUTTUR2 = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_DUAL = 2;


  IDPanel PAN_NUOVO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN1(IMDB);
    Init_TBL_CODILIVESTAC(IMDB);
    //
    //
    Init_QRY_CODILIVESTA1(IMDB);
    Init_PQRY_BILSTRUTTUR2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_IN1, 10);
    IMDB.set_TblCode(IMDBDef1.TBL_IN1, "TBL_IN1");
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMDELIPA, "ROWNAMDELIPA");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMDELIPA,5,40,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMECAPTI, "ROWNAMECAPTI");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMECAPTI,5,49,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMELIVEL, "ROWNAMELIVEL");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMELIVEL,1,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMCOPAGE, "ROWNAMCOPAGE");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMCOPAGE,5,21,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMECODIC,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMCODGER, "ROWNAMCODGER");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMCODGER,5,21,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMSCSTID, "ROWNAMSCSTID");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMSCSTID,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMESTRID, "ROWNAMESTRID");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMESTRID,1,10,0);
    IMDB.set_FldCode(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMETIVAL, "ROWNAMETIVAL");
    IMDB.SetFldParams(IMDBDef1.TBL_IN1,IMDBDef1.FLD_IN1_ROWNAMETIVAL,5,49,0);
    IMDB.TblAddNew(IMDBDef1.TBL_IN1, 0);
  }

  private static void Init_TBL_CODILIVESTAC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_CODILIVESTAC, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_CODILIVESTAC, "TBL_CODILIVESTAC");
    IMDB.set_FldCode(IMDBDef1.TBL_CODILIVESTAC,IMDBDef1.FLD_CODILIVESTAC_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef1.TBL_CODILIVESTAC,IMDBDef1.FLD_CODILIVESTAC_NOMEOGGEPROG,1,9,0);
    IMDB.set_FldCode(IMDBDef1.TBL_CODILIVESTAC,IMDBDef1.FLD_CODILIVESTAC_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef1.TBL_CODILIVESTAC,IMDBDef1.FLD_CODILIVESTAC_NOMEOGGECODI,5,250,0);
  }

  private static void Init_QRY_CODILIVESTA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.QRY_CODILIVESTA1, 2);
    IMDB.set_TblCode(IMDBDef8.QRY_CODILIVESTA1, "QRY_CODILIVESTA1");
    IMDB.set_FldCode(IMDBDef8.QRY_CODILIVESTA1,IMDBDef8.QSL_CODILIVESTA1_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef8.QRY_CODILIVESTA1,IMDBDef8.QSL_CODILIVESTA1_NOMEOGGEPROG,1,9,0);
    IMDB.set_FldCode(IMDBDef8.QRY_CODILIVESTA1,IMDBDef8.QSL_CODILIVESTA1_NOMEOGGECODI, "NOMEOGGECODI");
    IMDB.SetFldParams(IMDBDef8.QRY_CODILIVESTA1,IMDBDef8.QSL_CODILIVESTA1_NOMEOGGECODI,5,250,0);
  }

  private static void Init_PQRY_BILSTRUTTUR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_BILSTRUTTUR2, 19);
    IMDB.set_TblCode(IMDBDef8.PQRY_BILSTRUTTUR2, "PQRY_BILSTRUTTUR2");
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_STRUTTURA_ID, "STRUTTURA_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_STRUTTURA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_SCHEMA_STRUTTURA_ID, "SCHEMA_STRUTTURA_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_SCHEMA_STRUTTURA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_VALORE, "VALORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_VALORE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_SE_CAPITOLI, "SE_CAPITOLI");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_SE_CAPITOLI,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_SE_TRASPARENTE, "SE_TRASPARENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_SE_TRASPARENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_LIVELLO, "LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_LIVELLO,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CODICE_PADRE_GERARCHIA, "CODICE_PADRE_GERARCHIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CODICE_PADRE_GERARCHIA,5,21,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CODICE,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CODICE_GERARCHIA, "CODICE_GERARCHIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CODICE_GERARCHIA,5,21,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_ESERCIZIO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CONTABILITA_SPECIALI, "CONTABILITA_SPECIALI");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_CONTABILITA_SPECIALI,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_TIPO_SPESA, "TIPO_SPESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_TIPO_SPESA,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_ESCLUSIONE_12, "ESCLUSIONE_12");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSTRUTTUR2,IMDBDef8.PQSL_BILSTRUTTUR2_ESCLUSIONE_12,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_BILSTRUTTUR2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public NuovoSuStrutturaBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public NuovoSuStrutturaBilancio()
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
    FormIdx = MyGlb.FRM_NUOVSUSTRBIL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BD9EFF83-2927-46E3-9AF3-73257E14753D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 608;
    DesignHeight = 342;
    set_Caption(new IDVariant("Nuovo Su Struttura Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 608;
    Frames[1].Height = 316;
    Frames[1].Caption = "Nuovo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_NUOVO = new IDPanel(w, this, 1, "PAN_NUOVO");
    Frames[1].Content = PAN_NUOVO;
    PAN_NUOVO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NUOVO.VS = MainFrm.VisualStyleList;
    PAN_NUOVO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FA216AD2-D1F1-4C03-818A-CB9FFD8A5454");
    PAN_NUOVO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1108, 316, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NUOVO.InitStatus = 2;
    PAN_NUOVO_Init();
    PAN_NUOVO_InitFields();
    PAN_NUOVO_InitQueries();
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
      PAN_NUOVO.UpdatePanel(MainFrm);
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
    return (obj instanceof NuovoSuStrutturaBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? NuovoSuStrutturaBilancio.class.getName() : (Glb.ClassWithPackage(NuovoSuStrutturaBilancio.class) ? NuovoSuStrutturaBilancio.class.getName().substring(NuovoSuStrutturaBilancio.class.getPackage().getName().length() + 1) : NuovoSuStrutturaBilancio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Calcolo Codici Da Albero
  // Codice Del Padre - Input
  // Formato - Input
  // **********************************************************************
  public IDVariant CalcoloCodiciDaAlbero (IDVariant CodiceDelPadre, IDVariant Formato)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcolo Codici Da Albero Body
      // Corpo Procedura
      // 
      CALCCODDAALB_CODLIVSTADEL();
      IDVariant v_RITORNO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_LIVELLO = null;
      v_LIVELLO = new IDVariant(IDL.Sub(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0), (new IDVariant(1))),IDVariant.FLOAT);
      IDVariant v_CODICE = null;
      v_CODICE = new IDVariant(CodiceDelPadre);
      IDVariant I = null;
      I = (new IDVariant(1));
      while (v_LIVELLO.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_VCODICE = null;
        v_VCODICE = (new IDVariant());
        IDVariant v_VCODICEPADRE = null;
        v_VCODICEPADRE = (new IDVariant());
        IDVariant v_VSECHIAVE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_VVALORE = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_VFORMATO = new IDVariant(0,IDVariant.FLOAT);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as VISSTRBILCOD, ");
        SQL.append("  A.CODICE_PADRE_GERARCHIA as VISTBICOPAGE, ");
        SQL.append("  NVL(A.SE_CHIAVE, 'NO') as NUVAVISTBSCN, ");
        SQL.append("  B.VALORE as BILSTRUTVALO, ");
        SQL.append("  A.FORMATO as VISSTRBILFOR ");
        SQL.append("from ");
        SQL.append("  VISTA_STRUTTURA_BIL A, ");
        SQL.append("  BIL_STRUTTURA B ");
        SQL.append("where (A.LIVELLO = " + IDL.CSql(v_LIVELLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.SOTTOLIVELLO = 1) ");
        SQL.append("and   (A.CODICE = " + IDL.CSql(v_CODICE, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.LIVELLO = A.LIVELLO) ");
        SQL.append("and   (B.CODICE = A.CODICE) ");
        SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
        SQL.append("and   (B.E_S = A.E_S) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCODICE = QV.Get("VISSTRBILCOD", IDVariant.INTEGER) ;
          v_VCODICEPADRE = QV.Get("VISTBICOPAGE", IDVariant.INTEGER) ;
          v_VSECHIAVE = QV.Get("NUVAVISTBSCN", IDVariant.STRING) ;
          v_VVALORE = QV.Get("BILSTRUTVALO", IDVariant.INTEGER) ;
          v_VFORMATO = QV.Get("VISSTRBILFOR", IDVariant.FLOAT) ;
        }
        QV.Close();
        if (v_VSECHIAVE.equals((new IDVariant("SI")), true))
        {
          CALCCODDAALB_CODLIVSTININ(I, v_VVALORE, v_VFORMATO);
          I = IDL.Add(I, (new IDVariant(1)));
        }
        v_CODICE = new IDVariant(v_VCODICEPADRE);
        v_LIVELLO = IDL.Sub(v_LIVELLO, (new IDVariant(1)));
      }
      CALCCODDAALB_CODILIVESTA1();
      while (!IMDB.Eof(IMDBDef8.QRY_CODILIVESTA1, 0))
      {
        v_RITORNO = IDL.Add(v_RITORNO, IMDB.Value(IMDBDef8.QRY_CODILIVESTA1, IMDBDef8.QSL_CODILIVESTA1_NOMEOGGECODI, 0));
        IMDB.TblMoveNext(IMDBDef8.QRY_CODILIVESTA1, 0);
      }
      return IDL.Add(v_RITORNO, IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_VALORE, 0)), Formato, (new IDVariant("0")), true));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "CalcoloCodiciDaAlbero", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Codici Livelli STACK: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void CALCCODDAALB_CODLIVSTADEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef1.TBL_CODILIVESTAC);
  }

  // **********************************************************************
  // Codici Livelli STACK: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void CALCCODDAALB_CODLIVSTININ(IDVariant I, IDVariant v_VVALORE, IDVariant v_VFORMATO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef1.TBL_CODILIVESTAC, 0);
    IMDB.set_Value(IMDBDef1.TBL_CODILIVESTAC, IMDBDef1.FLD_CODILIVESTAC_NOMEOGGEPROG, 0, I);
    IMDB.set_Value(IMDBDef1.TBL_CODILIVESTAC, IMDBDef1.FLD_CODILIVESTAC_NOMEOGGECODI, 0, IDL.FillLR(IDL.ToString(v_VVALORE), v_VFORMATO, (new IDVariant("0")), true));
  }

  // **********************************************************************
  // Codici Livelli STACK
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void CALCCODDAALB_CODILIVESTA1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.QRY_CODILIVESTA1);
    IMDB.TblMoveFirst(IMDBDef1.TBL_CODILIVESTAC, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_CODILIVESTAC, 0))
    {
      IMDB.TblAddNew(IMDBDef8.QRY_CODILIVESTA1, 0);
      IMDB.TblLinkRow(IMDBDef8.QRY_CODILIVESTA1, 0, IMDBDef1.TBL_CODILIVESTAC, 0);
      IMDB.TblLinkField(IMDBDef8.QRY_CODILIVESTA1, 0, 0, IMDBDef1.TBL_CODILIVESTAC, IMDBDef1.FLD_CODILIVESTAC_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef8.QRY_CODILIVESTA1, 1, 0, IMDBDef1.TBL_CODILIVESTAC, IMDBDef1.FLD_CODILIVESTAC_NOMEOGGECODI, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_CODILIVESTAC, 0);
      if (IMDB.Eof(IMDBDef1.TBL_CODILIVESTAC, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_CODILIVESTAC, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef8.QRY_CODILIVESTA1);
    IMDB.TblSortBy(IMDBDef8.QRY_CODILIVESTA1,0,false);
    IMDB.TblStartSort(IMDBDef8.QRY_CODILIVESTA1);
    IMDB.TblMoveFirst(IMDBDef8.QRY_CODILIVESTA1, 0);
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
    IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESCRLIVELLO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESCRLIVELLO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPT = (new IDVariant("Struttura Bilancio", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      Frames[PAN_NUOVO.FrIndex].set_Caption(new IDVariant(v_CAPT).stringValue());
      set_Caption(new IDVariant(v_CAPT));
      PAN_NUOVO.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IDL.Sub(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0), (new IDVariant(1))).compareTo((new IDVariant(0)), true)!=0)
      {
        PAN_NUOVO.set_FieldText(PFL_NUOVO_ETICHETTA, IDL.Add(IDL.Add((IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0).equals((new IDVariant("E")))? new IDVariant("Entrata") : IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0).equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant()), (new IDVariant(" - "))), IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMDELIPA, 0)).stringValue());
      }
      else
      {
        PAN_NUOVO.set_FieldText(PFL_NUOVO_ETICHETTA, IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMDELIPA, 0).stringValue());
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE_LIVELLO as BILSCHSTDELI ");
      SQL.append("from ");
      SQL.append("  BIL_SCHEMA_STRUTTURA A ");
      SQL.append("where (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCRLIVELLO1 = QV.Get("BILSCHSTDELI", IDVariant.STRING) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE_LIVELLO as BILSCHSTDELI ");
      SQL.append("from ");
      SQL.append("  BIL_SCHEMA_STRUTTURA A ");
      SQL.append("where (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCRLIVELLO = QV.Get("BILSCHSTDELI", IDVariant.STRING) ;
      }
      QV.Close();
      if (!(IDL.IsNull(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMESTRID, 0))))
      {
        PAN_NUOVO.set_Header(Glb.OBJ_FIELD,PFL_NUOVO_VALORE, new IDVariant(v_DESCRLIVELLO1).stringValue());
      }
      else
      {
        PAN_NUOVO.set_Header(Glb.OBJ_FIELD,PFL_NUOVO_VALORE, new IDVariant(v_DESCRLIVELLO).stringValue());
      }
      PAN_NUOVO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
      {
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "LoadEvent", _e);
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
      ((Struttura)MainFrm.GetForm(MyGlb.FRM_STRUTTURA,0)).TRE_STRUTTBILANC.Refresh(MainFrm, (new IDVariant("")), (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NUOVO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_NUOVO);
      // 
      // Nuovo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_NUOVO.IsNewRow()))
      {
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_VALORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_VALORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_SE_CAPITOLI, 0).equals((new IDVariant("SI")), true))
      {
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (((IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_E_S, 0).equals((new IDVariant("S")), true)) || IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true)) && ((IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_LIVELLO, 0).equals((new IDVariant(2)), true)) || IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0).equals((new IDVariant(2)), true)))
      {
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_NUOVO.SetFlags (Glb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "NuovoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovo Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_NUOVO_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CODICDELPADR = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODICE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CODICEGERARC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FORMATO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SECHIAVE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Nuovo Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_E_S, 0, IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0));
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_LIVELLO, 0, IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0));
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_SCHEMA_STRUTTURA_ID, 0, new IDVariant(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMSCSTID, 0),IDVariant.DECIMAL));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FORMATO as BILSCHSTRFOR, ");
      SQL.append("  A.SE_CHIAVE as BILSCHSTSECH ");
      SQL.append("from ");
      SQL.append("  BIL_SCHEMA_STRUTTURA A ");
      SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_FORMATO = QV.Get("BILSCHSTRFOR", IDVariant.INTEGER) ;
        v_SECHIAVE = QV.Get("BILSCHSTSECH", IDVariant.STRING) ;
      }
      QV.Close();
      IDVariant v_FORMATOPADRE = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FORMATO as BILSCHSTRFOR ");
      SQL.append("from ");
      SQL.append("  BIL_SCHEMA_STRUTTURA A ");
      SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_FORMATOPADRE = QV.Get("BILSCHSTRFOR", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as VISSTRBILCOD, ");
      SQL.append("  TO_CHAR ( A.CODICE ) || CASE WHEN " + IDL.CSql(v_SECHIAVE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'SI' THEN LPAD(TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_VALORE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), " + IDL.CSql(v_FORMATO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", SUBSTR('0', 1, 1)) ELSE NULL END as TSVSBCISCSFL, ");
      SQL.append("  CASE WHEN A.CODICE_GERARCHIA = '0' THEN NULL ELSE A.CODICE_GERARCHIA END || LPAD(TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_VALORE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), " + IDL.CSql(v_FORMATO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", SUBSTR('0', 1, 1)) as IVSBCG0NVSBC ");
      SQL.append("from ");
      SQL.append("  VISTA_STRUTTURA_BIL A ");
      SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_DAPASSARE, IMDBDef1.FLD_DAPASSARE_ROWNAMENTOSP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_DAPASSARE, IMDBDef1.FLD_DAPASSARE_ROWNAMELIVEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
      SQL.append("and   (A.SOTTOLIVELLO = CASE WHEN " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMELIVEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1 <> 0 THEN 1 ELSE 0 END) ");
      SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMECODIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICDELPADR = QV.Get("VISSTRBILCOD", IDVariant.INTEGER) ;
        v_CODICE = QV.Get("TSVSBCISCSFL", IDVariant.STRING) ;
        v_CODICEGERARC = QV.Get("IVSBCG0NVSBC", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_CODICE_PADRE_GERARCHIA, 0, ((IDL.ToString(v_CODICDELPADR).compareTo((new IDVariant("0")), true)!=0)?IDL.FillLR(IDL.ToString(v_CODICDELPADR), v_FORMATOPADRE, (new IDVariant("0")), true):(new IDVariant())));
      // IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_CODICE, 0, IDL.ToInteger(v_CODICE));
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_CODICE, 0, ((IDL.NullValue(IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_SE_CAPITOLI, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))?IDL.ToInteger(v_CODICE):IDL.ToInteger(CalcoloCodiciDaAlbero(v_CODICDELPADR, v_FORMATO))));
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_CODICE_GERARCHIA, 0, new IDVariant(v_CODICEGERARC));
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_ESERCIZIO, 0, new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "NuovoBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovo Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_NUOVO_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "NuovoBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovo On Database Error Event
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
  private void PAN_NUOVO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_UNIQUECOST = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_UNIQUECOST = (new IDVariant("ORA-00001", IDVariant.STRING));
      MainFrm.OnDBError(PAN_NUOVO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Nuovo On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      // if (IDL.SubStr(ErrorMessage, (new IDVariant(0)), (new IDVariant(9))).equals(v_UNIQUECOST, true))
      // {
        // MainFrm.set_AlertMessage(v_ERR); 
      // }
      // else
      // {
      // }
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "NuovoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovo On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_NUOVO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_NUOVO_CAPITOCOLLEG)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_SE_CAPITOLI, 0),(new IDVariant("N"))).compareTo((new IDVariant("SI")), true)!=0)
        {
          IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_CONTABILITA_SPECIALI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_TIPO_SPESA, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "NuovoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Nuovo After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_NUOVO_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo After Commit Body
      // Corpo Procedura
      // 
      if (RowsUpdated.compareTo((new IDVariant(0)), true)>0 && RowsInErrors.equals((new IDVariant(0)), true))
      {
        IDVariant v_STRUTTURA = null;
        v_STRUTTURA = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.STRUTTURA_ID as BILSTRUTTUID ");
        SQL.append("from ");
        SQL.append("  BIL_STRUTTURA A ");
        SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_DAPASSARE, IMDBDef1.FLD_DAPASSARE_ROWNAMENTOSP, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.LIVELLO = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_DAPASSARE, IMDBDef1.FLD_DAPASSARE_ROWNAMELIVEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_CODICE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.SCHEMA_STRUTTURA_ID = " + IDL.CSql(IMDB.Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMSCSTID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.VALORE = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_BILSTRUTTUR2, IMDBDef8.PQSL_BILSTRUTTUR2_VALORE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_STRUTTURA = QV.Get("BILSTRUTTUID", IDVariant.DECIMAL) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_STRUTTURA)))
        {
          IMDB.set_Value(IMDBDef1.TBL_IN1, IMDBDef1.FLD_IN1_ROWNAMESTRID, 0, new IDVariant(new IDVariant(v_STRUTTURA),IDVariant.INTEGER));
          PAN_NUOVO.PanelCommand(Glb.PCM_REQUERY);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "NuovoAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Nuovo After Delete
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_NUOVO_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo After Delete Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("NuovoSuStrutturaBilancio", "NuovoAfterDelete", _e);
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
  private void PAN_NUOVO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NUOVO, Cancel);
    // Stub
  }

  private void PAN_NUOVO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NUOVO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_NUOVO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_NUOVO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NUOVO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_NUOVO_Init()
  {

    PAN_NUOVO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NUOVO.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, "3DE795D4-F471-4785-BF26-63746A235CAF");
    PAN_NUOVO.set_Header(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, "Inserimento");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUOVO.SetRect(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_NUOVO.SetRect(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, MyGlb.PANEL_FORM, 12, 175, 268, 49, 0, 0);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, 0, 70);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, 1, 13);
    PAN_NUOVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, 0, 4);
    PAN_NUOVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, 1, 4);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_GROUP, GRP_NUOVO_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, "F2673E32-4E82-4714-99D1-DB9EBC4141F1");
    PAN_NUOVO.set_Header(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, "Aggiornamento");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_NUOVO.SetRect(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_NUOVO.SetRect(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, MyGlb.PANEL_FORM, 288, 175, 272, 49, 0, 0);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, 0, 88);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, 1, 13);
    PAN_NUOVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, 0, 4);
    PAN_NUOVO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, 1, 4);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_GROUP, GRP_NUOVO_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_NUOVO.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, "28EF3711-2E87-4593-BE43-7763A4FED899");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, "STRUTTURA ID");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, "071E5D22-36B6-4687-B572-6933A50BDD71");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, "SCHEMA STRUTTURA ID");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, 0, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, "DBA5290A-6635-4595-94B1-C3323397F766");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, "Valore");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, "203F472A-4E24-424A-BCAE-9EFEFBE282AC");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, MyGlb.VIS_ETICHEGRASSE);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, "0CF90A13-9549-4F2A-B08E-1E3B9F1F9BEA");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, "Descrizione");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, "DA4C86C7-E1E3-4B82-A839-722480903E55");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, "Capitoli collegabili");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.VIS_CHECKSTYLE);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, "F2CB6699-6FEF-49CA-A970-23D7934DCD76");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, "Trasparente");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, "2FB9D188-159D-4C59-9A62-68C430E281A7");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, "Contabilità Speciali");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.VIS_CHECKSTYLE);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, "786E0298-AD5C-4B67-B78C-FAD62B85F57D");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, "Utente");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, "6125F47B-A1B8-48C0-91F1-9484043F9537");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, "Data");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, "E2CBDBE4-C6EA-479D-90DF-3C2128AE5019");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, "Utente ");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, "A906325E-1E7C-4336-BE7A-8705E4019CF0");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, "Data ");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, "CF43A19C-4A07-4EC8-BDAE-228EB6D2FB43");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, "E S");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, 0, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, "6C959E42-A8C4-4736-8752-5CFF1ADD9DB5");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, "LIVELLO");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, 0, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, "0C39C4F3-914F-4D5B-AFC1-D212C62F5BCC");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, "CODICE PADRE GERARCHIA");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.VIS_NORMFIELPADR);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, "55A10A5A-26B1-499F-91F5-CBD180612754");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, "CODICE");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, 0, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, "9EC37CB7-DA07-477F-9220-397D2BA08F3F");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, "CODICE GERARCHIA");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, 0, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, "437BC457-2F52-4EF1-A278-3386E9BC2784");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, "ESERCIZIO");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, 0, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, "C17A1CAB-5565-484D-80A6-964F23463BE5");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, "Tipo Spesa");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_NUOVO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, "8A1A889E-C04E-495C-888C-824B99932E56");
    PAN_NUOVO.set_Header(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, "Esclusione Controllo Dodicesimi");
    PAN_NUOVO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, "");
    PAN_NUOVO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.VIS_CHECKSTYLE);
    PAN_NUOVO.SetFlags(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NUOVO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_LIST, 84);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_LIST, "STRUTTURA ID");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_FORM, 4, 4, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_FORM, 84);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_STRUTTURAID, MyGlb.PANEL_FORM, "STRUT. ID");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_STRUTTURAID, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_STRUTTURAID, PPQRY_BILSTRUTTUR2, "A.STRUTTURA_ID", "STRUTTURA_ID", 3, 10, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_LIST, 128);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_LIST, "SCHEMA STRUTTURA ID");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_FORM, 4, 28, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_FORM, 128);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_SCHEMSTRUTID, MyGlb.PANEL_FORM, "SCH. STRUTTURA ID");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_SCHEMSTRUTID, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_SCHEMSTRUTID, PPQRY_BILSTRUTTUR2, "A.SCHEMA_STRUTTURA_ID", "SCHEMA_STRUTTURA_ID", 3, 10, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_LIST, 48);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_LIST, "Valore");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_FORM, 4, 44, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_FORM, 128);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_VALORE, MyGlb.PANEL_FORM, "Valore");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_VALORE, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_VALORE, PPQRY_BILSTRUTTUR2, "A.VALORE", "VALORE", 1, 5, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, MyGlb.PANEL_LIST, 0, 4, 488, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, MyGlb.PANEL_LIST, 0);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, MyGlb.PANEL_FORM, 12, 4, 544, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, MyGlb.PANEL_FORM, 0);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ETICHETTA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_ETICHETTA, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_ETICHETTA, -1, "", "ETICHETTA", 0, 0, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_FORM, 44, 68, 448, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_DESCRIZIONE, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_DESCRIZIONE, PPQRY_BILSTRUTTUR2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_LIST, 72);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_LIST, "Capitoli collegabili");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_FORM, 16, 108, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_FORM, 116);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CAPITOCOLLEG, MyGlb.PANEL_FORM, "Capitoli collegabili");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_CAPITOCOLLEG, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_CAPITOCOLLEG, PPQRY_BILSTRUTTUR2, "A.SE_CAPITOLI", "SE_CAPITOLI", 5, 2, 0, -13997);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_CAPITOCOLLEG, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_CAPITOCOLLEG, (new IDVariant()), "Null", "", "", -1);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_LIST, 96);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_LIST, "Trasparente");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_FORM, 40, 132, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_FORM, 92);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_TRASPARENTE, MyGlb.PANEL_FORM, "Trasparente");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_TRASPARENTE, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_TRASPARENTE, PPQRY_BILSTRUTTUR2, "A.SE_TRASPARENTE", "SE_TRASPARENTE", 5, 2, 0, -13997);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_TRASPARENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_TRASPARENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_LIST, 140);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_LIST, "Contabilità Speciali");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_FORM, 24, 200, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_FORM, 140);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CONTABSPECIA, MyGlb.PANEL_FORM, "Contabilità Speciali");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_CONTABSPECIA, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_CONTABSPECIA, PPQRY_BILSTRUTTUR2, "A.CONTABILITA_SPECIALI", "CONTABILITA_SPECIALI", 5, 2, 0, -13997);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_CONTABSPECIA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_CONTABSPECIA, (new IDVariant()), "Null", "", "", -1);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_FORM, 16, 200, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_FORM, 52);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_UTENTE1, -1, GRP_NUOVO_INSERIMENTO);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_UTENTE1, PPQRY_BILSTRUTTUR2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_FORM, 164, 200, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_FORM, 40);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_DATA1, -1, GRP_NUOVO_INSERIMENTO);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_DATA1, PPQRY_BILSTRUTTUR2, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_FORM, 292, 200, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_FORM, 52);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_UTENTE, -1, GRP_NUOVO_AGGIORNAMENT);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_UTENTE, PPQRY_BILSTRUTTUR2, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_LIST, 100);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_FORM, 444, 200, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_FORM, 40);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_DATA, -1, GRP_NUOVO_AGGIORNAMENT);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_DATA, PPQRY_BILSTRUTTUR2, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_LIST, 24);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_FORM, 4, 280, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_FORM, 24);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_ES, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_ES, PPQRY_BILSTRUTTUR2, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_LIST, 48);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_LIST, "LIV.");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_FORM, 4, 280, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_FORM, 48);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_LIVELLO, MyGlb.PANEL_FORM, "LIV.");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_LIVELLO, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_LIVELLO, PPQRY_BILSTRUTTUR2, "A.LIVELLO", "LIVELLO", 1, 3, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_LIST, 148);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_LIST, "CODICE PADRE GERARCHIA");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_FORM, 4, 280, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_FORM, 148);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CODIPADRGERA, MyGlb.PANEL_FORM, "COD. PADRE GERARCHIA");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_CODIPADRGERA, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_CODIPADRGERA, PPQRY_BILSTRUTTUR2, "A.CODICE_PADRE_GERARCHIA", "CODICE_PADRE_GERARCHIA", 5, 21, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_FORM, 4, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_CODICE, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_CODICE, PPQRY_BILSTRUTTUR2, "A.CODICE", "CODICE", 1, 10, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_LIST, 112);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_LIST, "CODICE GERARCHIA");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_FORM, 4, 328, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_FORM, 112);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_CODICEGERARC, MyGlb.PANEL_FORM, "COD. GERARCHIA");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_CODICEGERARC, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_CODICEGERARC, PPQRY_BILSTRUTTUR2, "A.CODICE_GERARCHIA", "CODICE_GERARCHIA", 5, 21, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_FORM, 4, 308, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_ESERCIZIO, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_ESERCIZIO, PPQRY_BILSTRUTTUR2, "A.ESERCIZIO", "ESERCIZIO", 3, 10, 0, -13997);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_LIST, 76);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_LIST, "Tipo Spesa");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_FORM, 88, 224, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_FORM, 76);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_TIPOSPESA, MyGlb.PANEL_FORM, "Tipo Spesa");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_TIPOSPESA, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_TIPOSPESA, PPQRY_BILSTRUTTUR2, "A.TIPO_SPESA", "TIPO_SPESA", 5, 1, 0, -13997);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_TIPOSPESA, (new IDVariant("C")), "Corrente", "", "", -1);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_TIPOSPESA, (new IDVariant("I")), "di Investimento", "", "", -1);
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_LIST, 92);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_LIST, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_LIST, "Esclus. Contr. Dodicesimi");
    PAN_NUOVO.SetRect(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_FORM, 280, 132, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NUOVO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_FORM, 188);
    PAN_NUOVO.SetNumRow(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_FORM, 1);
    PAN_NUOVO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NUOVO_ESCLCONTDODI, MyGlb.PANEL_FORM, "Esclusione Controllo Dodicesimi");
    PAN_NUOVO.SetFieldPage(PFL_NUOVO_ESCLCONTDODI, -1, -1);
    PAN_NUOVO.SetFieldPanel(PFL_NUOVO_ESCLCONTDODI, PPQRY_BILSTRUTTUR2, "A.ESCLUSIONE_12", "ESCLUSIONE_12", 5, 2, 0, -13997);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_ESCLCONTDODI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_NUOVO.SetValueListItem(PFL_NUOVO_ESCLCONTDODI, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_NUOVO_InitQueries()
  {
    StringBuffer SQL;

    PAN_NUOVO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_NUOVO.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_NUOVO_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_NUOVO.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_NUOVO_UTENTE1, "");
    PAN_NUOVO.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_NUOVO.SetQuery(PPQRY_DUAL, 0, SQL, PFL_NUOVO_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_NUOVO.SetQuery(PPQRY_DUAL, 1, SQL, PFL_NUOVO_UTENTE, "");
    PAN_NUOVO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NUOVO.SetIMDB(IMDB, "PQRY_BILSTRUTTUR2", true);
    PAN_NUOVO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STRUTTURA_ID as STRUTTURA_ID, ");
    SQL.append("  A.SCHEMA_STRUTTURA_ID as SCHEMA_STRUTTURA_ID, ");
    SQL.append("  A.VALORE as VALORE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SE_CAPITOLI as SE_CAPITOLI, ");
    SQL.append("  A.SE_TRASPARENTE as SE_TRASPARENTE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.LIVELLO as LIVELLO, ");
    SQL.append("  A.CODICE_PADRE_GERARCHIA as CODICE_PADRE_GERARCHIA, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.CODICE_GERARCHIA as CODICE_GERARCHIA, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CONTABILITA_SPECIALI as CONTABILITA_SPECIALI, ");
    SQL.append("  A.TIPO_SPESA as TIPO_SPESA, ");
    SQL.append("  A.ESCLUSIONE_12 as ESCLUSIONE_12 ");
    PAN_NUOVO.SetQuery(PPQRY_BILSTRUTTUR2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_STRUTTURA A ");
    PAN_NUOVO.SetQuery(PPQRY_BILSTRUTTUR2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.STRUTTURA_ID = ~~TBL_IN1.ROWNAMESTRID~~) ");
    PAN_NUOVO.SetQuery(PPQRY_BILSTRUTTUR2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NUOVO.SetQuery(PPQRY_BILSTRUTTUR2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NUOVO.SetQuery(PPQRY_BILSTRUTTUR2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NUOVO.SetQuery(PPQRY_BILSTRUTTUR2, 5, SQL, -1, "");
    PAN_NUOVO.SetQueryDB(PPQRY_BILSTRUTTUR2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NUOVO.SetMasterTable(0, "BIL_STRUTTURA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NUOVO.Status() == 2)
    {
      int oldListQBE = PAN_NUOVO.iUseListQBE;
      PAN_NUOVO.iUseListQBE = 0;
      PAN_NUOVO.PanelCommand(Glb.PCM_SEARCH);
      PAN_NUOVO.PanelCommand(Glb.PCM_FIND);
      PAN_NUOVO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_NUOVO) PAN_NUOVO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
