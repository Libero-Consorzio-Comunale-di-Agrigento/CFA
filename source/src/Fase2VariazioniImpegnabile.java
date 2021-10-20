// **********************************************
// Fase 2 Variazioni Impegnabile
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Fase2VariazioniImpegnabile extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAZIMPEGN_CAPITOLOART = 0;
  private static int GRP_VARIAZIMPEGN_PROVVEDIMENT = 1;
  private static int GRP_VARIAZIMPEGN_INSERIMENTO = 2;
  private static int GRP_VARIAZIMPEGN_AGGIORNAMENT = 3;

  private static int PFL_VARIAZIMPEGN_VARIIMPELABE = 0;
  private static int PFL_VARIAZIMPEGN_PROGRESSIVO = 1;
  private static int PFL_VARIAZIMPEGN_ESERCIZIO = 2;
  private static int PFL_VARIAZIMPEGN_CAPITOLLABEL = 3;
  private static int PFL_VARIAZIMPEGN_DESCRICAPITO = 4;
  private static int PFL_VARIAZIMPEGN_ARTICOLLABEL = 5;
  private static int PFL_VARIAZIMPEGN_DESCRIARTICO = 6;
  private static int PFL_VARIAZIMPEGN_NEWPANELLABE = 7;
  private static int PFL_VARIAZIMPEGN_CAPITOLO = 8;
  private static int PFL_VARIAZIMPEGN_BARVOCPEGLAB = 9;
  private static int PFL_VARIAZIMPEGN_ARTICOLO = 10;
  private static int PFL_VARIAZIMPEGN_SCELTVOCEPEG = 11;
  private static int PFL_VARIAZIMPEGN_INFOVOCEPEG = 12;
  private static int PFL_VARIAZIMPEGN_VOCEPEGLABEL = 13;
  private static int PFL_VARIAZIMPEGN_DESCRIZIONE = 14;
  private static int PFL_VARIAZIMPEGN_IMPORTO = 15;
  private static int PFL_VARIAZIMPEGN_DATA = 16;
  private static int PFL_VARIAZIMPEGN_DELIBERLABEL = 17;
  private static int PFL_VARIAZIMPEGN_SEDEDEL = 18;
  private static int PFL_VARIAZIMPEGN_TRATDELILABE = 19;
  private static int PFL_VARIAZIMPEGN_NUMERODEL = 20;
  private static int PFL_VARIAZIMPEGN_BARRDELILABE = 21;
  private static int PFL_VARIAZIMPEGN_ANNODEL = 22;
  private static int PFL_VARIAZIMPEGN_SCELTADELIBE = 23;
  private static int PFL_VARIAZIMPEGN_INFODELIBERA = 24;
  private static int PFL_VARIAZIMPEGN_PROPOSTLABEL = 25;
  private static int PFL_VARIAZIMPEGN_UNITAPROPONE = 26;
  private static int PFL_VARIAZIMPEGN_TRATPROPLABE = 27;
  private static int PFL_VARIAZIMPEGN_NUMEROPROPOS = 28;
  private static int PFL_VARIAZIMPEGN_BARRPROPLABE = 29;
  private static int PFL_VARIAZIMPEGN_ANNOPROPOSTA = 30;
  private static int PFL_VARIAZIMPEGN_SCELTAPROPOS = 31;
  private static int PFL_VARIAZIMPEGN_INFOPROPOSTA = 32;
  private static int PFL_VARIAZIMPEGN_UNITAORGANIZ = 33;
  private static int PFL_VARIAZIMPEGN_S = 34;
  private static int PFL_VARIAZIMPEGN_UTENTINSLABE = 35;
  private static int PFL_VARIAZIMPEGN_UTENTEINSERI = 36;
  private static int PFL_VARIAZIMPEGN_DATAINSLABEL = 37;
  private static int PFL_VARIAZIMPEGN_DATAINSERIME = 38;
  private static int PFL_VARIAZIMPEGN_UTENTAGGLABE = 39;
  private static int PFL_VARIAZIMPEGN_UTENTULTIAGG = 40;
  private static int PFL_VARIAZIMPEGN_DATAAGGLABEL = 41;
  private static int PFL_VARIAZIMPEGN_DATAULTIMAGG = 42;
  private static int PFL_VARIAZIMPEGN_TOTVARLISLAB = 43;
  private static int PFL_VARIAZIMPEGN_TOTALISTVARI = 44;
  private static int PFL_VARIAZIMPEGN_TOTVARFORLAB = 45;
  private static int PFL_VARIAZIMPEGN_REGIVARILABE = 46;
  private static int PFL_VARIAZIMPEGN_INDIETRLABEL = 47;
  private static int PFL_VARIAZIMPEGN_OBIETTOPERAT = 48;
  private static int PFL_VARIAZIMPEGN_OBIETTGESTIO = 49;
  private static int PFL_VARIAZIMPEGN_FATTORE = 50;
  private static int PFL_VARIAZIMPEGN_CENTRO = 51;
  private static int PFL_VARIAZIMPEGN_SCHEDOBIETID = 52;
  private static int PFL_VARIAZIMPEGN_FATTORDESCRI = 53;
  private static int PFL_VARIAZIMPEGN_CENTRIDESCRI = 54;
  private static int PFL_VARIAZIMPEGN_PROGETTOID = 55;

  private static int PPQRY_VARIMPEGNAB1 = 0;

  private static int PPQRY_DESCRVOCEPEG = 1;
  private static int PPQRY_POLELENCOBFC = 2;
  private static int PPQRY_FATTORI = 3;
  private static int PPQRY_CENTRI = 4;

  private static int PPQRY_VISTABILANUO = 5;
  private static int PPQRY_DUAL1 = 6;
  private static int PPQRY_DUAL = 7;


  IDPanel PAN_VARIAZIMPEGN;

  // Definition of Global Variables
  private IDVariant RPPATTIVA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRIO13(IMDB);
    //
    //
    Init_PQRY_VARIMPEGNAB1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRIO13(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRIO13, 2);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRIO13, "TBL_PARAMETRIO13");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIO13,IMDBDef3.FLD_PARAMETRIO13_CAPITOLOOLD, "CAPITOLOOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIO13,IMDBDef3.FLD_PARAMETRIO13_CAPITOLOOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIO13,IMDBDef3.FLD_PARAMETRIO13_ARTICOLOOLD, "ARTICOLOOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIO13,IMDBDef3.FLD_PARAMETRIO13_ARTICOLOOLD,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRIO13, 0);
  }

  private static void Init_PQRY_VARIMPEGNAB1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARIMPEGNAB1, 25);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARIMPEGNAB1, "PQRY_VARIMPEGNAB1");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_S, "S");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_OBIETTOPERAT, "OBIETTOPERAT");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_OBIETTOPERAT,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_OBIETTGESTIO, "OBIETTGESTIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMPEGNAB1,IMDBDef12.PQSL_VARIMPEGNAB1_OBIETTGESTIO,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARIMPEGNAB1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Fase2VariazioniImpegnabile(MyWebEntryPoint w, IMDBObj imdb)
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
  public Fase2VariazioniImpegnabile()
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
    FormIdx = MyGlb.FRM_FASE2VARIIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "553E5B2C-2524-426A-A0B4-77473DEEF752";
    ResModeW = 1;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 732;
    DesignHeight = 662;
    set_Caption(new IDVariant("Fase 2 Variazioni Impegnabile"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
    Frames[1].Height = 636;
    Frames[1].Caption = "Variazioni Impegnabile";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 636;
    PAN_VARIAZIMPEGN = new IDPanel(w, this, 1, "PAN_VARIAZIMPEGN");
    Frames[1].Content = PAN_VARIAZIMPEGN;
    PAN_VARIAZIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 636-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4E70C9B5-9118-4638-A5BA-730ACAE227C6");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 48, 420, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIMPEGN.InitStatus = 2;
    PAN_VARIAZIMPEGN_Init();
    PAN_VARIAZIMPEGN_InitFields();
    PAN_VARIAZIMPEGN_InitQueries();
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
      PAN_VARIAZIMPEGN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_VARIAZIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIMPEGN_SCELTVOCEPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VARIAZIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIMPEGN_SCELTADELIBE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_VARIAZIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIMPEGN_SCELTAPROPOS) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_VARIAZIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIMPEGN_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_VARIAZIMPEGN.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIMPEGN_CENTRO) {
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
    return (obj instanceof Fase2VariazioniImpegnabile);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Fase2VariazioniImpegnabile.class.getName() : (Glb.ClassWithPackage(Fase2VariazioniImpegnabile.class) ? Fase2VariazioniImpegnabile.class.getName().substring(Fase2VariazioniImpegnabile.class.getPackage().getName().length() + 1) : Fase2VariazioniImpegnabile.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Info Voci Bilancio
  // **********************************************************************
  public int InfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "InfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Voce Peg
  // **********************************************************************
  public int ApriSceltaVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "ApriSceltaVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Old
  // **********************************************************************
  public int SettaOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Old Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO13, IMDBDef3.FLD_PARAMETRIO13_CAPITOLOOLD, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO13, IMDBDef3.FLD_PARAMETRIO13_ARTICOLOOLD, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "SettaOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Tootip
  // **********************************************************************
  public int SettaTootip ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tootip Body
      // Procedure Body
      // 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_DESCRICAPITO,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_DESCRICAPITO))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_DESCRIARTICO,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_DESCRIARTICO))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_DESCRIZIONE,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_UNITAORGANIZ,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_UNITAORGANIZ))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "SettaTootip", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Descrizioni Voce Peg
  // **********************************************************************
  public int Visibilit‡DescrizioniVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Descrizioni Voce Peg Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "Visibilit‡DescrizioniVocePeg", _e);
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
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "DisabilitaCampi", _e);
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
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "AbilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Registra Variazioni
  // **********************************************************************
  public int RegistraVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Si desidera registrare ugualmente?", IDVariant.STRING));
      // 
      // Registra Variazioni Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_VARIAZIMPEGN.Status()).equals((new IDVariant(3)), true))
      {
        if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0))) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0)))
        {
          IDVariant v_TIPO = new IDVariant(0,IDVariant.STRING);
          if (MainFrm.TipoFattore(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0), v_TIPO).compareTo((new IDVariant(-1)), true)!=0)
          {
            if (v_TIPO.equals((new IDVariant("E")), true))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Centro obbligatorio per fattore economico"));
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
          }
        }
        if (RPPATTIVA.booleanValue() && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGETTO_ID, 0))))
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(4)), (new IDVariant(6)));
            if (v_ERRORE.equals((new IDVariant("-20999")), true))
            {
              MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
              return 0;
            }
            else
            {
              if (v_ERRORE.equals((new IDVariant("-20998")), true))
              {
                v_CONFERMA = (new IDVariant(MainFrm.MessageConfirm(IDL.Add(IDL.Add(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant(" "))), v_MESSAGGIO))));
                if (!(v_CONFERMA.booleanValue()))
                {
                  return 0;
                }
              }
              else
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                return 0;
              }
            }
          }
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE, 0)))
        {
          IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_DEL, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_ANNO_DEL, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0));
        }
        PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_UPDATE);
        // if (new IDVariant(PAN_VARIAZIMPEGN.Status()).equals((new IDVariant(2)), true))
        // {
          // PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_REQUERY);
        // }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "RegistraVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Indietro
  // **********************************************************************
  public int Indietro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Indietro Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_VARIAZIMPEGN.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Attenzione. Le modifiche sulle variazioni andranno perse. Continuare?", IDVariant.STRING));
        if (!(MainFrm.MessageConfirm(v_AVVISO)))
        {
          return 0;
        }
        else
        {
          PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_CANCEL);
        }
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_FASE1ESTRPRO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "Indietro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Totale
  // **********************************************************************
  public int SettaTotale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TOTALEVARIAZ = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOTALEVARIAZ = (new IDVariant("Totale Variazioni ", IDVariant.STRING));
      // 
      // Setta Totale Body
      // Procedure Body
      // 
      PAN_VARIAZIMPEGN.set_FieldText(PFL_VARIAZIMPEGN_TOTALISTVARI, IDL.Format(PAN_VARIAZIMPEGN.GetFieldSum(PFL_VARIAZIMPEGN_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_VARIAZIMPEGN.set_FieldText(PFL_VARIAZIMPEGN_TOTVARFORLAB, IDL.Add(v_TOTALEVARIAZ, IDL.Format(PAN_VARIAZIMPEGN.GetFieldSum(PFL_VARIAZIMPEGN_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      if (PAN_VARIAZIMPEGN.GetFieldSum(PFL_VARIAZIMPEGN_IMPORTO).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIMPEGN.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TOTALISTVARI,new IDVariant(MyGlb.VIS_CAMTOTDISROS).intValue()); 
        PAN_VARIAZIMPEGN.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TOTVARFORLAB,new IDVariant(MyGlb.VIS_ETIGRAIMPROS).intValue()); 
      }
      else
      {
        PAN_VARIAZIMPEGN.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TOTALISTVARI,new IDVariant(MyGlb.VIS_CAMPTOTADISA).intValue()); 
        PAN_VARIAZIMPEGN.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TOTVARFORLAB,new IDVariant(MyGlb.VIS_ETICGRASIMPO).intValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "SettaTotale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0, (new IDVariant("SI")));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Info
  // **********************************************************************
  public int Visibilit‡Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Info Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0))))
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIODELIBE.booleanValue() && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0))))
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0))))
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "Visibilit‡Info", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi UO Unica
  // **********************************************************************
  public IDVariant ProponiUOUnica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMUO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_UO = new IDVariant(0,IDVariant.FLOAT);

    try
    {
      TransCount = 0;
      // 
      // Proponi UO Unica Body
      // Procedure Body
      // 
      v_NUMUO = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(DISTINCT A.PROGR_UNITA_ORGANIZZATIVA) as DICOVIBIUPUO, ");
      SQL.append("  MIN(A.PROGR_UNITA_ORGANIZZATIVA) as MIVIBIUOPRUO ");
      SQL.append("from ");
      SQL.append("  VISTA_BILANCIO_UO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO = 'O') ");
      SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= TRUNC( SYSDATE )) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMUO = QV.Get("DICOVIBIUPUO", IDVariant.INTEGER) ;
        v_UO = QV.Get("MIVIBIUOPRUO", IDVariant.FLOAT) ;
      }
      QV.Close();
      if (v_NUMUO.equals((new IDVariant(1)), true))
      {
        return new IDVariant(v_UO,IDVariant.INTEGER);
      }
      else
      {
        return (new IDVariant());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "ProponiUOUnica", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Apri Scelta Obiettivo
  // **********************************************************************
  public int ApriSceltaObiettivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Obiettivo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMARTICOL, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMUOIMPEG, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGR_UNITA_ORGANIZZATIVA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI352, IMDBDef1.FLD_PARAMETRI352_PARAMPROGEID, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGETTO_ID, 0));
      MainFrm.Show(MyGlb.FRM_SCEOBIVAFUBI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "ApriSceltaObiettivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "SelezioneFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "SelezioneCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Campi Fattore Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Visibilit‡CampiFattoreCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NGE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Campi Fattore Centro Body
      // Procedure Body
      // 
      v_RET = new IDVariant(MainFrm.RETVALT99);
      v_NGE = new IDVariant(MainFrm.GESTIOECONOM);
      if (v_RET.equals((new IDVariant(0)), true))
      {
        if (v_NGE.equals((new IDVariant(-1)), true))
        {
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_NGE.equals((new IDVariant(1)), true))
        {
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_NGE.equals((new IDVariant(2)), true))
        {
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "Visibilit‡CampiFattoreCentro", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Fase 2 - Variazioni Impegnabile", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_VARIAZIMPEGN.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIMPEGN.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIMPEGN.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      DisabilitaCampi();
      if (MainFrm.FunctionRppAttiva().equals((new IDVariant(1)), true))
      {
        RPPATTIVA = (new IDVariant(-1));
      }
      else
      {
        RPPATTIVA = (new IDVariant(0));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE, 0))))
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.GESTIODELIBE.booleanValue())
        {
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSCFPEATTI, 0).equals((new IDVariant(0)), true))
      {
      }
      Visibilit‡CampiFattoreCentro();
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: » un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercher‡ di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()) && IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue() && IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_PARAINFODELI, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      // if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPROGIND1)), true) && Result.booleanValue())
      // {
        // IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI4, IMDBDef7.PQSL_PROGETTI4_PROGETTO_ID, 0));
      // }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEOBIVAFUBI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SCHEDA_OBIETTIVO_ID, 0, IMDB.Value(IMDBDef7.PQRY_POLELENCOBFC, IMDBDef7.PQSL_POLELENCOBFC_SCHEDA_OBIETTIVO_ID, 0));
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_POLELENCOBFC, IMDBDef7.PQSL_POLELENCOBFC_FATTORE, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_POLELENCOBFC, IMDBDef7.PQSL_POLELENCOBFC_CENTRO, 0));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEPROCFATVA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI3, IMDBDef7.PQSL_PROGETTI3_PROGETTO_ID, 0));
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI3, IMDBDef7.PQSL_PROGETTI3_FATTORE, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI3, IMDBDef7.PQSL_PROGETTI3_CENTRO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegnabile After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Impegnabile After Find Event Body
      // Procedure Body
      // 
      SettaOld();
      SettaTotale();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "VariazioniImpegnabileAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegnabile On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Impegnabile On Change Row Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_VARIAZIMPEGN.Layout())).equals((new IDVariant(0)), true))
      {
        SettaOld();
      }
      else
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "VariazioniImpegnabileOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegnabile On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento Ë in fase di esecuzione. Occorre utilizzare la propriet‡ Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo Ë veramente stato modificato, cioË il suo valore Ë diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo Ë stato modificato nell'ultima trasmissione del browser, ed Ë quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non Ë consigliabile utilizzare questo argomento perchË Ë presente solo per compatibilit‡ con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale Ë in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Impegnabile On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_VARIAZIMPEGN_IMPORTO)), true))
      {
        SettaTotale();
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIMPEGN_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_VARIAZIMPEGN_ARTICOLO)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRIO13, IMDBDef3.FLD_PARAMETRIO13_CAPITOLOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRIO13, IMDBDef3.FLD_PARAMETRIO13_ARTICOLOOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0))))
          {
            IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGR_UNITA_ORGANIZZATIVA, 0, ProponiUOUnica());
          }
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO13, IMDBDef3.FLD_PARAMETRIO13_CAPITOLOOLD, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO13, IMDBDef3.FLD_PARAMETRIO13_ARTICOLOOLD, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIMPEGN_SEDEDEL)), true) || Column.equals((new IDVariant(PFL_VARIAZIMPEGN_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_VARIAZIMPEGN_ANNODEL)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0))))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0))))
          {
            IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
            v_DESCRIZIONE = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as DELDESCRIZIO ");
            SQL.append("from ");
            SQL.append("  DEL A ");
            SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_DESCRIZIONE = QV.Get("DELDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            if (IDL.IsNull(v_DESCRIZIONE) || v_DESCRIZIONE.equals((new IDVariant("")), true))
            {
              if (MainFrm.GESTIODELIBE.booleanValue())
              {
                if (IDL.IsNull(v_DESCRIZIONE))
                {
                  IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
                  v_MESSAGGIO = (new IDVariant("Delibera non Presente", IDVariant.STRING));
                  MainFrm.set_AlertMessage(v_MESSAGGIO); 
                  return;
                }
              }
              else
              {
                IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
                v_MESSAGGIO = (new IDVariant("Delibera non Esistente. Si desidera Inserirne una nuova ?", IDVariant.STRING));
                IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);
                v_CONFERMA = (new IDVariant(6, IDVariant.INTEGER));
                v_CONFERMA = (new IDVariant(MainFrm.MessageConfirm(v_MESSAGGIO)));
                if (v_CONFERMA.booleanValue())
                {
                  IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0));
                  IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0));
                  IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0));
                  IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0, (new IDVariant("Ins")));
                  MainFrm.Show(MyGlb.FRM_DELIBERA, (new IDVariant(-1)).intValue(), this); 
                }
                else
                {
                  return;
                }
              }
            }
          }
          else
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Dati Delibera Incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return;
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIMPEGN_UNITAPROPONE)), true) || Column.equals((new IDVariant(PFL_VARIAZIMPEGN_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_VARIAZIMPEGN_ANNOPROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0))))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0))))
          {
            IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
            v_DESCRIZIONE = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.OGGETTO as PROPOSOGGETT ");
            SQL.append("from ");
            SQL.append("  PROPOSTE A ");
            SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_DESCRIZIONE = QV.Get("PROPOSOGGETT", IDVariant.STRING) ;
            }
            QV.Close();
            if (MainFrm.GESTIODELIBE.booleanValue() && (IDL.IsNull(v_DESCRIZIONE) || v_DESCRIZIONE.equals((new IDVariant("")), true)))
            {
              if (IDL.IsNull(v_DESCRIZIONE))
              {
                IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
                v_MESSAGGIO = (new IDVariant("Proposta non Presente", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_MESSAGGIO); 
                return;
              }
            }
          }
          else
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Dati Proposta Incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return;
          }
        }
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_D_DATA_REG, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_D_DATA_REG, 0, IDL.Today());
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_DEL, 0, IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_ANNO_DEL, 0));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_NUMERO_PROPOSTA, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef3.TBL_PARAVARIIMPE, IMDBDef3.FLD_PARAVARIIMPE_ANNO_PROPOSTA, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_DATA_INSERIMENTO, 0, IDL.Today());
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_ULTIMO_AGG, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_DATA_ULTIMO_AGG, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      SettaTotale();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "VariazioniImpegnabileOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegnabile On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIMPEGN);
      // 
      // Variazioni Impegnabile On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaTootip();
      Visibilit‡DescrizioniVocePeg();
      Visibilit‡Info();
      if (IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_IMPORTO, 0).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIMPEGN.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_IMPORTO,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_VARIAZIMPEGN.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_IMPORTO,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "VariazioniImpegnabileOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegnabile On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che puÚ essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Impegnabile On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(0)), true))
      {
        DisabilitaCampi();
        PAN_VARIAZIMPEGN.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      else
      {
        AbilitaCampi();
        PAN_VARIAZIMPEGN.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "VariazioniImpegnabileOnChangeLayoutEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegnabile On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: PuÚ essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Si desidera registrare ugualmente?", IDVariant.STRING));
      // 
      // Variazioni Impegnabile On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(8)), true))
      {
        if ((new IDVariant(PAN_VARIAZIMPEGN.Layout())).equals((new IDVariant(0)), true))
        {
          PAN_VARIAZIMPEGN.set_Layout((new IDVariant(1)).intValue());
        }
      }
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_REQUERY);
      }
      if (Command.equals((new IDVariant(128)), true))
      {
        // 
        // controllo fattore centro
        // 
        {
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0))))
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  POL_ELENCO_PROG_FC A ");
            SQL.append("where (NOT ((A.FATTORE IS NULL))) ");
            SQL.append("and   (NOT ((A.CENTRO IS NULL))) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
            {
              v_CONTATORE = (new IDVariant(0));
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  POL_ELENCO_PROG_FC A ");
              SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ESERCIZIO >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_S, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ESERCIZIO_STN = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGR_UNITA_ORGANIZZATIVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NVL(A.PROGETTO_ID, '-1') = NVL(" + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_PROGETTO_ID, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", NVL(A.PROGETTO_ID, '-1'))) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_CONTATORE.equals((new IDVariant(0)), true))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Fattore o Centro diversi da quelli collegati al Progetto", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_SMS); 
              }
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "VariazioniImpegnabileOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegnabile On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java Ë l'errore nativo del database mentre in C# Ë l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non Ë stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_VARIAZIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Variazioni Impegnabile On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "VariazioniImpegnabileOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Provvedimento SEDE DEL Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_VARIAZIMPEGN_SEDEDEL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento SEDE DEL Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0).compareTo(IDL.Upper(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_SEDE_DEL, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "ProvvedimentoSEDEDELValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Provvedimento UNITA PROPONENTE Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo Ë necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_VARIAZIMPEGN_UNITAPROPONE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento UNITA PROPONENTE Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0).compareTo(IDL.Upper(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0)), true)!=0)
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_VARIMPEGNAB1, IMDBDef12.PQSL_VARIMPEGNAB1_UNITA_PROPONENTE, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2VariazioniImpegnabile", "ProvvedimentoUNITAPROPONENTEValidateEvent", _e);
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
  private void PAN_VARIAZIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIMPEGN, Cancel);
    // Stub
  }

  private void PAN_VARIAZIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_SCELTVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_SCELTADELIBE)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_SCELTAPROPOS)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_REGIVARILABE)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      RegistraVariazioni();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_INDIETRLABEL)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Indietro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_FATTORE)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_CENTRO)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCentro();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAZIMPEGN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_VARIAZIMPEGN_SEDEDEL)
      {
        PFL_VARIAZIMPEGN_SEDEDEL_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_VARIAZIMPEGN_UNITAPROPONE)
      {
        PFL_VARIAZIMPEGN_UNITAPROPONE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIMPEGN_Init()
  {

    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, "D944526B-6211-4CBD-BD0E-A7C764E90517");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, "Capitolo/Art");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, MyGlb.PANEL_FORM, 48, 43, 580, 81, 0, 0);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, 0, 70);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, 1, 13);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, 0, 4);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, 1, 4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, "446CC0B8-7880-43D1-A688-A469E32D2757");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, "Provvedimento");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, MyGlb.PANEL_FORM, 56, 195, 612, 49, 0, 0);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, 0, 87);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, 1, 13);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, 0, 4);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, 1, 4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, "F56896BB-F6DE-4CA0-8FE0-ADAA7280C8C9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, "Inserimento");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, MyGlb.PANEL_FORM, 60, 407, 288, 49, 0, 0);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, 0, 70);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, 1, 13);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, 0, 4);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, 1, 4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, "223F76F8-0734-4C8F-8BD5-E03C59028700");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, "Aggiornamento");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, MyGlb.PANEL_FORM, 360, 407, 288, 49, 0, 0);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, 0, 88);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, 1, 13);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, 0, 4);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, 1, 4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_FIELD, 56);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, "BF4B0497-2CBE-4629-94DC-33F9D07779EC");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, "Variazioni Impegnabile");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, "2B7F68D7-D6F4-407A-9FEF-AF71A4B16ADB");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, "chiave primaria della tabella");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, "4F0FF534-D4F3-43B6-ADDE-5E77A20649E5");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, "ESERCIZIO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, "Esercizio di riferimento derlla variazione");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, 0, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, "66E21378-FFBD-4EF5-9680-9B1CF17CD0E8");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, "Capitolo");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, "FAA8F1D1-0F48-46C1-9E6C-35F3A652FAE4");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, "Descrizione Capitolo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, "C48AC1C3-D66B-40F8-9A1F-B12FF4EF78A4");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, "Articolo");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, "5B6C1DC4-5098-4F75-A9AF-B7202F26BDDB");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, "Descrizione Articolo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, "56177B51-9C8A-4151-8B2C-B25BBB5B6BC9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, "BC5EB5F3-2489-4819-8885-A8CF01742E5C");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, "CAPITOLO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, "F1BDB84D-D227-44A9-99EF-02E0EBE197E2");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, "/");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, "336AB661-4AEC-4899-B82C-25FADCF974DF");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, "ARTICOLO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, "063838C8-8467-4EFA-9FAE-055EA0D37267");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, 0, "wsearch1.gif", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, "F1F27BB0-5C6B-454B-9111-B8C0D346D19D");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, 0, "info.gif", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, "3F414958-86E7-42E2-9781-2D602CE2E48C");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, "Capitolo/Art");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, "3561F6C8-DBBB-45D0-A393-9ED0114F28F6");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, "Descrizione");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, "57F61B48-BC2D-4D51-A853-9CD6EF3EC478");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, "Importo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, "D50F88A0-06C4-4598-B72E-99E888CE3446");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, "Data");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, "90184A79-2D01-4E07-B374-FB9C1F7B3E42");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, "Delibera");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, "8CC09B18-355F-4CC7-B038-3408FC16E009");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, "SEDE DEL");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, "8CCBEEBF-9ED6-4141-9811-1E042AC61F54");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, "-");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, "D8F3C475-F846-42C8-801B-A19D05A8041E");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, "NUMERO DEL");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, "237A64D3-DB58-4C04-9774-00164348C36E");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, "/");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, "92EB150B-6197-4B3F-82FB-950E3E1243B8");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, "ANNO DEL");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, "EC7DFDCA-C739-4AA5-BB1A-9BE323C762BD");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, 0, "wsearch1.gif", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, "10E38FE6-D48A-40E2-A144-213D5BC7A677");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, 0, "info.gif", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, "93A7601E-7231-41C0-8646-9160690502B5");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, "Proposta");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, "539D2FAF-061E-428D-8CAB-829DB490AFB4");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, "622669C6-BF22-480A-BB73-E9CA8AA137D0");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, "-");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, "037D4C6D-2E5D-451B-A45C-37BCA3420725");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, "894CA640-AFCE-460E-AA43-53A012C611E4");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, "/");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, "C8B326A9-A504-4FAF-BADB-B5412A03B8A0");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, "01587640-CCD9-400B-8003-D07FF0788FDB");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, 0, "wsearch1.gif", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, "0AB38AD3-F0CB-4931-9581-574EC3FD3CAD");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, 0, "info.gif", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, "0E19D075-DAF9-450E-9187-EDAB5D80323F");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, "Unit‡ Organizzativa");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, "FD73BB2A-20CC-4A73-92A0-A3E65C821BE4");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, "S");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, "Indicatore di spesa");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, 0, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, "B188C29F-4602-4E0F-B643-9C7D66D9BDA9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, "Utente");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, "3CACED86-1AF3-490A-80A1-88F8C27B168A");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, "13D39AEC-D8B0-4769-B412-18987A66C42D");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, "Data");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, "9FD6D0F1-43C8-4046-AB4C-D48874D56181");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, "DATA INSERIMENTO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, "DD078CF0-718D-4B30-9152-B2048FAA1AB0");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, "Utente");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, "AB46985B-CE7D-4808-A578-0804497A02C5");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, "73A4A55E-4C0F-4FCB-808C-3DB1D08B72DE");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, "Data");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, "7D3B882F-7B25-4D76-A0E1-C6BEABC56931");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, "743E0074-916F-4276-9E12-97B7C7A3AEAA");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, "Totale Variazioni");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, "3D09A4B3-DC40-4ABA-87A8-B3577A3E3E4B");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, MyGlb.VIS_CAMPTOTADISA);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, "EFC5B432-893E-47A3-AF0E-9B3FEA9FB078");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, "Totale Variazioni");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, MyGlb.VIS_ETICGRASIMPO);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, "8C6423C4-462A-49E3-A41D-2E13AF1540FB");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, "Registra Variazioni");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, 0, "button_large.GIF", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, "1316CAD9-12FE-45A1-BA72-048FB80DFE7B");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, "Indietro");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIMPEGN.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, 0, "button1.gif", false);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, "E268E3A8-93EB-4D23-8CBE-9B0AB1EBC663");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, "Obiettivo Operativo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, "6A08C363-5587-4197-9745-138B24A18B94");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, "Obiettivo Gestione");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, "7EDE5627-77E6-4620-A4F0-BEF55BF12438");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, "Fattore");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, "34771504-3723-4F68-AD2F-1B80BFB0A72D");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, "Centro");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, "5FE0389F-C367-45AE-8224-34DB741E5F91");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, "36A0926A-DF72-48DC-8694-CB4D342ADF87");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, "88401E96-7A5A-40BE-A565-10BEF50AD0F8");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, "39CD23C1-EC4E-469A-9510-73A42CFA7C71");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, "PROGETTO ID");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, MyGlb.PANEL_LIST, 16, 8, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, MyGlb.PANEL_FORM, 16, 8, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIIMPELABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_VARIIMPELABE, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_VARIIMPELABE, -1, "", "VARIIMPELABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_PROGRESSIVO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_PROGRESSIVO, PPQRY_VARIMPEGNAB1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 0, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 188, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ESERCIZIO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ESERCIZIO, PPQRY_VARIMPEGNAB1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, MyGlb.PANEL_LIST, 208, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, MyGlb.PANEL_FORM, 60, 76, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CAPITOLLABEL, -1, GRP_VARIAZIMPEGN_CAPITOLOART);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CAPITOLLABEL, -1, "", "CAPITOLLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_FORM, 128, 76, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRICAPITO, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DESCRICAPITO, -1, GRP_VARIAZIMPEGN_CAPITOLOART);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DESCRICAPITO, PPQRY_DESCRVOCEPEG, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0)", "CAPDESCRCAPI", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, MyGlb.PANEL_LIST, 216, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, MyGlb.PANEL_FORM, 60, 100, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ARTICOLLABEL, -1, GRP_VARIAZIMPEGN_CAPITOLOART);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ARTICOLLABEL, -1, "", "ARTICOLLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_LIST, 0, 84, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_LIST, "Descrizione Articolo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_FORM, 128, 100, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_FORM, 124);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIARTICO, MyGlb.PANEL_FORM, "Descrizione Articolo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DESCRIARTICO, -1, GRP_VARIAZIMPEGN_CAPITOLOART);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DESCRIARTICO, PPQRY_DESCRVOCEPEG, "DECODE(~~ARTICOLO~~, 0, NULL, A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~))", "CAPDESCRARTI", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, MyGlb.PANEL_LIST, 428, 52, 24, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, MyGlb.PANEL_FORM, 52, 68, 24, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_NEWPANELLABE, -1, GRP_VARIAZIMPEGN_CAPITOLOART);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 16, 84, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 144, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CAPITOLO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CAPITOLO, PPQRY_VARIMPEGNAB1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, MyGlb.PANEL_LIST, 200, 56, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, MyGlb.PANEL_FORM, 268, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARVOCPEGLAB, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_BARVOCPEGLAB, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_BARVOCPEGLAB, -1, "", "BARVOCPEGLAB", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 124, 84, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 288, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ARTICOLO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ARTICOLO, PPQRY_VARIMPEGNAB1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, MyGlb.PANEL_LIST, 612, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, MyGlb.PANEL_FORM, 316, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_SCELTVOCEPEG, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_SCELTVOCEPEG, -1, "", "SCELTVOCEPEG", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, MyGlb.PANEL_FORM, 336, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_INFOVOCEPEG, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, MyGlb.PANEL_LIST, 16, 48, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0, 48, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VOCEPEGLABEL, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_VOCEPEGLABEL, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 148, 84, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 48, 140, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DESCRIZIONE, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DESCRIZIONE, PPQRY_VARIMPEGNAB1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 336, 84, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 68, 164, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_IMPORTO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_IMPORTO, PPQRY_VARIMPEGNAB1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_LIST, 328, 84, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_FORM, 500, 164, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_FORM, 40);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DATA, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DATA, PPQRY_VARIMPEGNAB1, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, MyGlb.PANEL_LIST, 208, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, MyGlb.PANEL_FORM, 60, 220, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DELIBERLABEL, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 120, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 128, 220, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_SEDEDEL, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_SEDEDEL, PPQRY_VARIMPEGNAB1, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, MyGlb.PANEL_LIST, 200, 56, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, MyGlb.PANEL_FORM, 172, 220, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TRATDELILABE, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 120, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 192, 220, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_NUMERODEL, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_NUMERODEL, PPQRY_VARIMPEGNAB1, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, MyGlb.PANEL_LIST, 208, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, MyGlb.PANEL_FORM, 236, 220, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_BARRDELILABE, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 120, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 256, 220, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ANNODEL, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ANNODEL, PPQRY_VARIMPEGNAB1, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, MyGlb.PANEL_LIST, 620, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, MyGlb.PANEL_FORM, 292, 224, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTADELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_SCELTADELIBE, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_SCELTADELIBE, -1, "", "SCELTADELIBE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, MyGlb.PANEL_LIST, 612, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, MyGlb.PANEL_FORM, 312, 224, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_INFODELIBERA, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, MyGlb.PANEL_LIST, 216, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, MyGlb.PANEL_FORM, 332, 220, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROPOSTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_PROPOSTLABEL, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 328, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_LIST, "UN. PROP.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 396, 220, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UNITAPROPONE, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UNITAPROPONE, PPQRY_VARIMPEGNAB1, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, MyGlb.PANEL_LIST, 208, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, MyGlb.PANEL_FORM, 504, 220, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TRATPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TRATPROPLABE, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TRATPROPLABE, -1, "", "TRATPROPLABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 328, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 524, 220, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_NUMEROPROPOS, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_NUMEROPROPOS, PPQRY_VARIMPEGNAB1, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, MyGlb.PANEL_LIST, 216, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, MyGlb.PANEL_FORM, 572, 220, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_BARRPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_BARRPROPLABE, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_BARRPROPLABE, -1, "", "BARRPROPLABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 328, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PROP.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 592, 220, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ANNOPROPOSTA, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ANNOPROPOSTA, PPQRY_VARIMPEGNAB1, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, MyGlb.PANEL_LIST, 628, 48, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, MyGlb.PANEL_FORM, 628, 224, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCELTAPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_SCELTAPROPOS, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_SCELTAPROPOS, -1, "", "SCELTAPROPOS", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, MyGlb.PANEL_LIST, 620, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, MyGlb.PANEL_FORM, 648, 224, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_INFOPROPOSTA, -1, GRP_VARIAZIMPEGN_PROVVEDIMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_LIST, 480, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_LIST, 164);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Org.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_FORM, 4, 248, 620, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unit‡ Organizzativa");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UNITAORGANIZ, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UNITAORGANIZ, PPQRY_VARIMPEGNAB1, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_LIST, 328, 84, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_LIST, 16);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_LIST, "S");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_S, MyGlb.PANEL_FORM, "S");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_S, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_S, PPQRY_VARIMPEGNAB1, "A.S", "S", 5, 1, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, MyGlb.PANEL_LIST, 4, 348, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, MyGlb.PANEL_FORM, 64, 432, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTINSLABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UTENTINSLABE, -1, GRP_VARIAZIMPEGN_INSERIMENTO);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UTENTINSLABE, -1, "", "UTENTINSLABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_LIST, 520, 84, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_FORM, 116, 432, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UTENTEINSERI, -1, GRP_VARIAZIMPEGN_INSERIMENTO);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UTENTEINSERI, PPQRY_VARIMPEGNAB1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, MyGlb.PANEL_LIST, 12, 356, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, MyGlb.PANEL_FORM, 212, 432, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DATAINSLABEL, -1, GRP_VARIAZIMPEGN_INSERIMENTO);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DATAINSLABEL, -1, "", "DATAINSLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_LIST, 520, 84, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_FORM, 272, 432, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DATAINSERIME, -1, GRP_VARIAZIMPEGN_INSERIMENTO);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DATAINSERIME, PPQRY_VARIMPEGNAB1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, MyGlb.PANEL_LIST, 12, 356, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, MyGlb.PANEL_FORM, 364, 432, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTAGGLABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UTENTAGGLABE, -1, GRP_VARIAZIMPEGN_AGGIORNAMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UTENTAGGLABE, -1, "", "UTENTAGGLABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_LIST, 520, 84, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_FORM, 416, 432, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UTENTULTIAGG, -1, GRP_VARIAZIMPEGN_AGGIORNAMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UTENTULTIAGG, PPQRY_VARIMPEGNAB1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, MyGlb.PANEL_LIST, 20, 364, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, MyGlb.PANEL_FORM, 512, 432, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAAGGLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DATAAGGLABEL, -1, GRP_VARIAZIMPEGN_AGGIORNAMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DATAAGGLABEL, -1, "", "DATAAGGLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_LIST, 520, 84, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_FORM, 572, 432, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DATAULTIMAGG, -1, GRP_VARIAZIMPEGN_AGGIORNAMENT);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DATAULTIMAGG, PPQRY_VARIMPEGNAB1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, MyGlb.PANEL_LIST, 220, 296, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, MyGlb.PANEL_FORM, 332, 296, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARLISLAB, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TOTVARLISLAB, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TOTVARLISLAB, -1, "", "TOTVARLISLAB", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, MyGlb.PANEL_LIST, 332, 296, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, MyGlb.PANEL_FORM, 332, 300, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTALISTVARI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TOTALISTVARI, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TOTALISTVARI, -1, "", "TOTALISTVARI", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, MyGlb.PANEL_LIST, 324, 308, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, MyGlb.PANEL_FORM, 388, 372, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TOTVARFORLAB, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TOTVARFORLAB, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TOTVARFORLAB, -1, "", "TOTVARFORLAB", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, MyGlb.PANEL_LIST, 308, 328, 128, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, MyGlb.PANEL_FORM, 492, 464, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_REGIVARILABE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_REGIVARILABE, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_REGIVARILABE, -1, "", "REGIVARILABE", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, MyGlb.PANEL_LIST, 356, 344, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, MyGlb.PANEL_FORM, 404, 464, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INDIETRLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_INDIETRLABEL, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_INDIETRLABEL, -1, "", "INDIETRLABEL", 0, 0, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_FORM, 4, 272, 620, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTOPERAT, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_OBIETTOPERAT, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_OBIETTOPERAT, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_OBIETTOPERAT, PPQRY_VARIMPEGNAB1, "DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO')", "OBIETTOPERAT", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_LIST, "Obiettivo Gestione");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_FORM, 8, 296, 616, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OBIETTGESTIO, MyGlb.PANEL_FORM, "Obiettivo Gestione");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_OBIETTGESTIO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_OBIETTGESTIO, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_OBIETTGESTIO, PPQRY_VARIMPEGNAB1, "DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO')", "OBIETTGESTIO", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_FORM, 68, 320, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_FATTORE, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_FATTORE, PPQRY_VARIMPEGNAB1, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_FORM, 72, 344, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CENTRO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CENTRO, PPQRY_VARIMPEGNAB1, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, 124, 464, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCH. OBIETTIVO ID");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_SCHEDOBIETID, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_SCHEDOBIETID, PPQRY_VARIMPEGNAB1, "A.SCHEDA_OBIETTIVO_ID", "SCHEDA_OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_FORM, 204, 320, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_FATTORDESCRI, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_FORM, 204, 344, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CENTRIDESCRI, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, 4, 500, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGETTOID, MyGlb.PANEL_FORM, "PROGETTO ID");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_PROGETTOID, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_PROGETTOID, PPQRY_VARIMPEGNAB1, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
  }

  private void PAN_VARIAZIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_QUERY, 8);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0) as CAPDESCRCAPI, ");
    SQL.append("  DECODE(~~ARTICOLO~~, 0, NULL, A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~)) as CAPDESCRARTI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_DESCRVOCEPEG, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_DESCRVOCEPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_DESCRVOCEPEG, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DES_OBIETTIVO as POELOBFCDEOB ");
    SQL.append("from ");
    SQL.append("  POL_ELENCO_OB_FC A, ");
    SQL.append("  POL_SCHEDE_OBIETTIVO B ");
    SQL.append("where (B.SCHEDA_OBIETTIVO_ID = ~~SCHEDA_OBIETTIVO_ID~~) ");
    SQL.append("and   (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (NVL(A.PROGETTO_ID, '-1') = NVL(~~PROGETTO_ID~~, NVL(A.PROGETTO_ID, '-1'))) ");
    SQL.append("and   (A.ESERCIZIO_STN = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.SCHEDA_OBIETTIVO_ID = ~~SCHEDA_OBIETTIVO_ID~~) ");
    SQL.append("and   (B.SCHEDA_OBIETTIVO_ID = A.SCHEDA_OBIETTIVO_ID) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_POLELENCOBFC, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_POLELENCOBFC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_POLELENCOBFC, "POL_ELENCO_OB_FC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~D_DATA_REG~~) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~D_DATA_REG~~) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIBIUOPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as VISTBILUODES ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VISTABILANUO, 0, SQL, PFL_VARIAZIMPEGN_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIBIUOPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as VISTBILUODES ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VISTABILANUO, 1, SQL, PFL_VARIAZIMPEGN_UNITAORGANIZ, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_VISTABILANUO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as VAIMUIF2VIV1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as VAIMUIF2VIVI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_VARIAZIMPEGN_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as VAIMUIF2VIV1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as VAIMUIF2VIVI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_VARIAZIMPEGN_UTENTEINSERI, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAIUUAF2VIV1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as VAIUUAF2VIVI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_DUAL, 0, SQL, PFL_VARIAZIMPEGN_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAIUUAF2VIV1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as VAIUUAF2VIVI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_DUAL, 1, SQL, PFL_VARIAZIMPEGN_UTENTULTIAGG, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetIMDB(IMDB, "PQRY_VARIMPEGNAB1", true);
    PAN_VARIAZIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "VAR IMPEGNABILE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
    SQL.append("  DUP.GET_OBIETTIVO_OPERATIVO(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO') as OBIETTOPERAT, ");
    SQL.append("  DUP.GET_OBIETTIVO_GESTIONE(~~TBL_DATISESSIONE.SESSIOESERCI~~,A.S,A.CAPITOLO,A.ARTICOLO,TRUNC( SYSDATE ),'NO') as OBIETTGESTIO ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMPEGNAB1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VAR_IMPEGNABILE A ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMPEGNAB1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.SEDE_DEL, '-1') = NVL(~~TBL_PARAVARIIMPE.SEDE_DEL~~, DECODE(~~TBL_PARAVARIIMPE.UNITA_PROPONENTE~~, NULL, '-2', NVL(A.SEDE_DEL, '-1')))) ");
    SQL.append("and   (NVL(A.NUMERO_DEL, -1) = NVL(~~TBL_PARAVARIIMPE.NUMERO_DEL~~, DECODE(~~TBL_PARAVARIIMPE.UNITA_PROPONENTE~~, NULL, -2, NVL(A.NUMERO_DEL, -1)))) ");
    SQL.append("and   (NVL(A.ANNO_DEL, -1) = NVL(~~TBL_PARAVARIIMPE.ANNO_DEL~~, DECODE(~~TBL_PARAVARIIMPE.UNITA_PROPONENTE~~, NULL, -2, NVL(A.ANNO_DEL, -1)))) ");
    SQL.append("and   (NVL(A.UNITA_PROPONENTE, '-1') = NVL(~~TBL_PARAVARIIMPE.UNITA_PROPONENTE~~, DECODE(~~TBL_PARAVARIIMPE.SEDE_DEL~~, NULL, '-2', NVL(A.UNITA_PROPONENTE, '-1')))) ");
    SQL.append("and   (NVL(A.NUMERO_PROPOSTA, -1) = NVL(~~TBL_PARAVARIIMPE.NUMERO_PROPOSTA~~, DECODE(~~TBL_PARAVARIIMPE.SEDE_DEL~~, NULL, -2, NVL(A.NUMERO_PROPOSTA, -1)))) ");
    SQL.append("and   (NVL(A.ANNO_PROPOSTA, -1) = NVL(~~TBL_PARAVARIIMPE.ANNO_PROPOSTA~~, DECODE(~~TBL_PARAVARIIMPE.SEDE_DEL~~, NULL, -2, NVL(A.ANNO_PROPOSTA, -1)))) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMPEGNAB1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMPEGNAB1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMPEGNAB1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMPEGNAB1, 5, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_VARIMPEGNAB1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(0, "VAR_IMPEGNABILE");
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_VARIAZIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIMPEGN.iUseListQBE;
      PAN_VARIAZIMPEGN.iUseListQBE = 0;
      PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnChangeLayout(NewLayout, Cancel);
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnChangeRow();
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
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
