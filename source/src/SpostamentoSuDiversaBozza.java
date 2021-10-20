// **********************************************
// Spostamento Su Diversa Bozza
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SpostamentoSuDiversaBozza extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BOZZADESC_BOZZA = 0;
  private static int PFL_BOZZADESC_NEWEXPRESSIO = 1;

  private static int PPQRY_DUAL8 = 0;


  IDPanel PAN_BOZZADESC;
  private static int PFL_PARS_TIPO = 0;

  private static int PPQRY_PARS6 = 0;


  IDPanel PAN_PARS;
  private static int PFL_DETTDELLBOZZ_STATO1 = 0;
  private static int PFL_DETTDELLBOZZ_ES1 = 1;
  private static int PFL_DETTDELLBOZZ_CAPITOLO1 = 2;
  private static int PFL_DETTDELLBOZZ_ARTICOLO1 = 3;
  private static int PFL_DETTDELLBOZZ_VOCEPEGSMAL1 = 4;
  private static int PFL_DETTDELLBOZZ_CAPITOLOART = 5;
  private static int PFL_DETTDELLBOZZ_NUOVA1 = 6;
  private static int PFL_DETTDELLBOZZ_BILANCIO1 = 7;
  private static int PFL_DETTDELLBOZZ_DESCRIZIONE1 = 8;
  private static int PFL_DETTDELLBOZZ_SPOSTA = 9;
  private static int PFL_DETTDELLBOZZ_CODREC = 10;
  private static int PFL_DETTDELLBOZZ_PROPVARDETID = 11;
  private static int PFL_DETTDELLBOZZ_ESERCIZIO1 = 12;

  private static int PPQRY_POLPROVARDE1 = 0;


  IDPanel PAN_DETTDELLBOZZ;
  private static int PFL_ALTREBOZZE_BOZZAVARIAID = 0;
  private static int PFL_ALTREBOZZE_ESERCIZIO = 1;
  private static int PFL_ALTREBOZZE_DESCRIZIONE2 = 2;
  private static int PFL_ALTREBOZZE_URGENTE = 3;
  private static int PFL_ALTREBOZZE_DATALIMITE = 4;
  private static int PFL_ALTREBOZZE_UTENTEINSERI = 5;
  private static int PFL_ALTREBOZZE_DATAINSERIME = 6;
  private static int PFL_ALTREBOZZE_UTENTULTIAGG = 7;
  private static int PFL_ALTREBOZZE_DATAULTIMAGG = 8;
  private static int PFL_ALTREBOZZE_VAR1 = 9;

  private static int PPQRY_POLBOZZEVAR2 = 0;


  IDPanel PAN_ALTREBOZZE;
  private static int PFL_ELEVARPRSUBO_STATO = 0;
  private static int PFL_ELEVARPRSUBO_ES = 1;
  private static int PFL_ELEVARPRSUBO_CAPITOLO = 2;
  private static int PFL_ELEVARPRSUBO_ARTICOLO = 3;
  private static int PFL_ELEVARPRSUBO_VOCEPEGSMALL = 4;
  private static int PFL_ELEVARPRSUBO_CAPITOARTBIG = 5;
  private static int PFL_ELEVARPRSUBO_NUOVA = 6;
  private static int PFL_ELEVARPRSUBO_BILANCIO = 7;
  private static int PFL_ELEVARPRSUBO_DESCRIZIONE = 8;

  private static int PPQRY_POLPROVARD10 = 0;


  IDPanel PAN_ELEVARPRSUBO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IN7(IMDB);
    Init_TBL_PARS10(IMDB);
    Init_TBL_UNAQUOS(IMDB);
    //
    //
    Init_PQRY_DUAL8(IMDB);
    Init_PQRY_PARS6(IMDB);
    Init_PQRY_PARS6_RS(IMDB);
    Init_PQRY_POLPROVARDE1(IMDB);
    Init_PQRY_POLBOZZEVAR2(IMDB);
    Init_PQRY_POLPROVARD10(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IN7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IN7, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_IN7, "TBL_IN7");
    IMDB.set_FldCode(IMDBDef4.TBL_IN7,IMDBDef4.FLD_IN7_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef4.TBL_IN7,IMDBDef4.FLD_IN7_ROWNAMEBOZZA,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IN7, 0);
  }

  private static void Init_TBL_PARS10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS10, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS10, "TBL_PARS10");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS10,IMDBDef4.FLD_PARS10_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS10,IMDBDef4.FLD_PARS10_ROWNAMETIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS10, 0);
  }

  private static void Init_TBL_UNAQUOS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_UNAQUOS, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_UNAQUOS, "TBL_UNAQUOS");
    IMDB.set_FldCode(IMDBDef4.TBL_UNAQUOS,IMDBDef4.FLD_UNAQUOS_ROWNAMEBOOLE, "ROWNAMEBOOLE");
    IMDB.SetFldParams(IMDBDef4.TBL_UNAQUOS,IMDBDef4.FLD_UNAQUOS_ROWNAMEBOOLE,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_UNAQUOS, 0);
  }

  private static void Init_PQRY_DUAL8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_DUAL8, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_DUAL8, "PQRY_DUAL8");
    IMDB.set_FldCode(IMDBDef12.PQRY_DUAL8,IMDBDef12.PQSL_DUAL8_RECORNEWEXPR, "RECORNEWEXPR");
    IMDB.SetFldParams(IMDBDef12.PQRY_DUAL8,IMDBDef12.PQSL_DUAL8_RECORNEWEXPR,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_DUAL8, 0);
  }

  private static void Init_PQRY_PARS6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS6, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS6, "PQRY_PARS6");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS6,IMDBDef12.PQSL_PARS6_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS6,IMDBDef12.PQSL_PARS6_ROWNAMETIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS6, 0);
  }

  private static void Init_PQRY_PARS6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS6_RS, 1);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS6_RS, "PQRY_PARS6_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS6_RS,IMDBDef12.PQSL_PARS6_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS6_RS,IMDBDef12.PQSL_PARS6_ROWNAMETIPO,5,1,0);
  }

  private static void Init_PQRY_POLPROVARDE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARDE1, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARDE1, "PQRY_POLPROVARDE1");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_RECORDSTATO, "RECORDSTATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_RECORDSTATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_RECORDBILANC, "RECORDBILANC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_RECORDBILANC,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_PROPOSTA_VAR_DETT_ID, "PROPOSTA_VAR_DETT_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_PROPOSTA_VAR_DETT_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE1,IMDBDef12.PQSL_POLPROVARDE1_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARDE1, 0);
  }

  private static void Init_PQRY_POLBOZZEVAR2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLBOZZEVAR2, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLBOZZEVAR2, "PQRY_POLBOZZEVAR2");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_BOZZA_VARIAZIONE_ID, "BOZZA_VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_BOZZA_VARIAZIONE_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_URGENTE, "URGENTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_URGENTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DATA_LIMITE_PROPOSTE, "DATA_LIMITE_PROPOSTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DATA_LIMITE_PROPOSTE,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_RECORDVAR, "RECORDVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLBOZZEVAR2,IMDBDef12.PQSL_POLBOZZEVAR2_RECORDVAR,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLBOZZEVAR2, 0);
  }

  private static void Init_PQRY_POLPROVARD10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARD10, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARD10, "PQRY_POLPROVARD10");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_RECORDSTATO, "RECORDSTATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_RECORDSTATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_RECORDBILANC, "RECORDBILANC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_RECORDBILANC,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARD10,IMDBDef12.PQSL_POLPROVARD10_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARD10, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SpostamentoSuDiversaBozza(MyWebEntryPoint w, IMDBObj imdb)
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
  public SpostamentoSuDiversaBozza()
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
    FormIdx = MyGlb.FRM_SPOSSUDIVBOZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E0882679-A0B2-4CE8-AE67-49640A42D433";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 972;
    DesignHeight = 662;
    set_Caption(new IDVariant("Spostamento Su Diversa Bozza"));
    //
    Frames = new AFrame[10];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 972;
    Frames[1].Height = 636;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.100629;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 972;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Bozza Desc";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    PAN_BOZZADESC = new IDPanel(w, this, 2, "PAN_BOZZADESC");
    Frames[2].Content = PAN_BOZZADESC;
    PAN_BOZZADESC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BOZZADESC.VS = MainFrm.VisualStyleList;
    PAN_BOZZADESC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 972-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BOZZADESC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B73174CB-A1FA-4063-BB70-1F96E4855C54");
    PAN_BOZZADESC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZADESC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOZZADESC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BOZZADESC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BOZZADESC.InitStatus = 2;
    PAN_BOZZADESC_Init();
    PAN_BOZZADESC_InitFields();
    PAN_BOZZADESC_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 972;
    Frames[3].Height = 572;
    Frames[3].FormFactor = 0.452675;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 440;
    Frames[4].Height = 572;
    Frames[4].Vertical = true;
    Frames[4].FormFactor = 0.356643;
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[4].ChildFrame1 = Frames[5];
    Frames[5].Width = 440;
    Frames[5].Height = 204;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Pars";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 204;
    PAN_PARS = new IDPanel(w, this, 5, "PAN_PARS");
    Frames[5].Content = PAN_PARS;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 440-MyGlb.PAN_OFFS_X, 204-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7FACAF3B-D8D7-49E5-AB3A-540232AD5047");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[4].ChildFrame2 = Frames[6];
    Frames[6].Width = 440;
    Frames[6].Height = 368;
    Frames[6].Caption = "Dettagli Della Bozza";
    Frames[6].Parent = this;
    Frames[6].FixedHeight = 368;
    PAN_DETTDELLBOZZ = new IDPanel(w, this, 6, "PAN_DETTDELLBOZZ");
    Frames[6].Content = PAN_DETTDELLBOZZ;
    PAN_DETTDELLBOZZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTDELLBOZZ.VS = MainFrm.VisualStyleList;
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 440-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1E857A9A-6D6B-4435-944B-D5C626842589");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 508, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTDELLBOZZ.InitStatus = 2;
    PAN_DETTDELLBOZZ_Init();
    PAN_DETTDELLBOZZ_InitFields();
    PAN_DETTDELLBOZZ_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[3].ChildFrame2 = Frames[7];
    Frames[7].Width = 532;
    Frames[7].Height = 572;
    Frames[7].Vertical = true;
    Frames[7].FormFactor = 0.356643;
    Frames[8] = new AFrame(8);
    Frames[8].Parent = this;
    Frames[7].ChildFrame1 = Frames[8];
    Frames[8].Width = 532;
    Frames[8].Height = 204;
    Frames[8].Caption = "Altre Bozze";
    Frames[8].Parent = this;
    Frames[8].FixedHeight = 204;
    PAN_ALTREBOZZE = new IDPanel(w, this, 8, "PAN_ALTREBOZZE");
    Frames[8].Content = PAN_ALTREBOZZE;
    PAN_ALTREBOZZE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ALTREBOZZE.VS = MainFrm.VisualStyleList;
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 204-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ECDB8DFE-3F1B-4010-939D-EED60CD17223");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 372, 116, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ALTREBOZZE.InitStatus = 1;
    PAN_ALTREBOZZE_Init();
    PAN_ALTREBOZZE_InitFields();
    PAN_ALTREBOZZE_InitQueries();
    Frames[9] = new AFrame(9);
    Frames[9].Parent = this;
    Frames[7].ChildFrame2 = Frames[9];
    Frames[9].Width = 532;
    Frames[9].Height = 368;
    Frames[9].Caption = "Elenco Variazioni Presenti Sulla Bozza";
    Frames[9].Parent = this;
    Frames[9].FixedHeight = 368;
    PAN_ELEVARPRSUBO = new IDPanel(w, this, 9, "PAN_ELEVARPRSUBO");
    Frames[9].Content = PAN_ELEVARPRSUBO;
    PAN_ELEVARPRSUBO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELEVARPRSUBO.VS = MainFrm.VisualStyleList;
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 532-MyGlb.PAN_OFFS_X, 368-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "108FA16E-4EF4-447B-AB78-3A56AC8CA22B");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 492, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELEVARPRSUBO.InitStatus = 2;
    PAN_ELEVARPRSUBO_Init();
    PAN_ELEVARPRSUBO_InitFields();
    PAN_ELEVARPRSUBO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS10, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SPOSSUDIVBOZ_PARS6();
      }
      PAN_BOZZADESC.UpdatePanel(MainFrm);
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_DETTDELLBOZZ.UpdatePanel(MainFrm);
      PAN_ALTREBOZZE.UpdatePanel(MainFrm);
      PAN_ELEVARPRSUBO.UpdatePanel(MainFrm);
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
    return (obj instanceof SpostamentoSuDiversaBozza);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SpostamentoSuDiversaBozza.class.getName() : (Glb.ClassWithPackage(SpostamentoSuDiversaBozza.class) ? SpostamentoSuDiversaBozza.class.getName().substring(SpostamentoSuDiversaBozza.class.getPackage().getName().length() + 1) : SpostamentoSuDiversaBozza.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Sposta
  // **********************************************************************
  public int Sposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Sposta Body
      // Procedure Body
      // 
      v_COUNT = (new IDVariant(1));
      v_ERRORE = (new IDVariant(""));
      if (new IDVariant(PAN_ALTREBOZZE.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Errore, Bozza non salvata", IDVariant.STRING));
        if (new IDVariant(PAN_ALTREBOZZE.Status()).compareTo((new IDVariant(1)), true)!=0)
        {
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
          v_ERR1 = (new IDVariant("Nessuna bozza selezionata", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR1); 
        }
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_BOZZA_VARIAZIONE_ID, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Nessuna bozza selezionata", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      C8 = PAN_DETTDELLBOZZ.MasterRS();
      if (C8.size()>0) CurPos = C8.getRow(); else CurPos = 0;
      if (!C8.Bof()) PAN_DETTDELLBOZZ.GotoFirst();
      while (!PAN_DETTDELLBOZZ.RSEOF())
      {
        if (PAN_DETTDELLBOZZ.IsRowSelected(v_COUNT.intValue()))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update POL_PROPOSTE_VAR_DETT set ");
            SQL.append("  BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_BOZZA_VARIAZIONE_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(C8.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (PROPOSTA_VAR_DETT_ID = " + IDL.CSql(C8.Get("PROPOSTA_VAR_DETT_ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e11)
          {
            v_ERRORE = IDL.Add(IDL.Add(v_ERRORE, new IDVariant(e11.getMessage())), (new IDVariant("<BR/>")));
          }
        }
        v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
        PAN_DETTDELLBOZZ.GotoNext();
      }
      if (CurPos>0) C8.absolute(CurPos);
      if (v_ERRORE.compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(v_ERRORE); 
      }
      else
      {
        PAN_DETTDELLBOZZ.PanelCommand(Glb.PCM_REQUERY);
        PAN_ELEVARPRSUBO.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "Sposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Esiste Già Val
  // **********************************************************************
  public boolean EsisteGiàVal ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Esiste Già Val Body
      // Procedure Body
      // 
      v_RET = (new IDVariant(0));
      return v_RET.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "EsisteGiàVal", _e);
      return false;
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
    IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as POLBOZVARDES ");
      SQL.append("from ");
      SQL.append("  POL_BOZZE_VARIAZIONE A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_IN7, IMDBDef4.FLD_IN7_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESC = QV.Get("POLBOZVARDES", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_PARS10, IMDBDef4.FLD_PARS10_ROWNAMETIPO, 0, (new IDVariant("T")));
      PAN_BOZZADESC.set_FieldText(PFL_BOZZADESC_BOZZA, new IDVariant(v_DESC).stringValue());
      if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
      {
        PAN_DETTDELLBOZZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELEVARPRSUBO.SetFlags (Glb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTDELLBOZZ.SetFlags (Glb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELEVARPRSUBO.SetFlags (Glb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_DETTDELLBOZZ.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_DETTDELLBOZZ.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_DETTDELLBOZZ.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DETTDELLBOZZ.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELEVARPRSUBO.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_ELEVARPRSUBO.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ALTREBOZZE.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ALTREBOZZE.set_Collapsable((new IDVariant(0)).booleanValue());
      PAN_ALTREBOZZE.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Della Bozza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTDELLBOZZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTDELLBOZZ);
      // 
      // Dettagli Della Bozza On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTDELLBOZZ.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTDELLBOZZ_DESCRIZIONE1,(new IDVariant(PAN_DETTDELLBOZZ.FieldText(PFL_DETTDELLBOZZ_DESCRIZIONE1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "DettagliDellaBozzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Altre Bozze On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ALTREBOZZE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ALTREBOZZE);
      // 
      // Altre Bozze On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ALTREBOZZE.set_ToolTip(Glb.OBJ_FIELD,PFL_ALTREBOZZE_DESCRIZIONE2,(new IDVariant(PAN_ALTREBOZZE.FieldText(PFL_ALTREBOZZE_DESCRIZIONE2))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "AltreBozzeOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Altre Bozze Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_ALTREBOZZE_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Altre Bozze Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_DATA_ULTIMO_AGG, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "AltreBozzeBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Altre Bozze Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_ALTREBOZZE_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Altre Bozze Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef12.PQRY_POLBOZZEVAR2, IMDBDef12.PQSL_POLBOZZEVAR2_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "AltreBozzeBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Altre Bozze On Database Error Event
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
  private void PAN_ALTREBOZZE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_ALTREBOZZE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Altre Bozze On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "AltreBozzeOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Altre Bozze On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ALTREBOZZE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Altre Bozze On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ALTREBOZZE.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ALTREBOZZE.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "AltreBozzeOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni Presenti Sulla Bozza On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELEVARPRSUBO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELEVARPRSUBO);
      // 
      // Elenco Variazioni Presenti Sulla Bozza On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ELEVARPRSUBO.set_ToolTip(Glb.OBJ_FIELD,PFL_ELEVARPRSUBO_DESCRIZIONE,(new IDVariant(PAN_ELEVARPRSUBO.FieldText(PFL_ELEVARPRSUBO_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SpostamentoSuDiversaBozza", "ElencoVariazioniPresentiSullaBozzaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Primary record source for panel data
  // **********************************************************************
  private void SPOSSUDIVBOZ_PARS6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS6_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS10, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS10, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS6_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS6_RS, 0, IMDBDef4.TBL_PARS10, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS6_RS, 0, 0, IMDBDef4.TBL_PARS10, IMDBDef4.FLD_PARS10_ROWNAMETIPO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS10, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS10, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS10, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS6_RS, 0);
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
  private void PAN_BOZZADESC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BOZZADESC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BOZZADESC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BOZZADESC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BOZZADESC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BOZZADESC);
    // Stub
  }

  private void PAN_BOZZADESC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BOZZADESC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BOZZADESC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BOZZADESC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTDELLBOZZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTDELLBOZZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTDELLBOZZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTDELLBOZZ, Cancel);
    // Stub
  }

  private void PAN_DETTDELLBOZZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTDELLBOZZ_SPOSTA)
    {
      this.IdxPanelActived = this.PAN_DETTDELLBOZZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Sposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTDELLBOZZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTDELLBOZZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTDELLBOZZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ALTREBOZZE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ALTREBOZZE, Cancel);
    // Stub
  }

  private void PAN_ALTREBOZZE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ALTREBOZZE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ALTREBOZZE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ALTREBOZZE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELEVARPRSUBO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELEVARPRSUBO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELEVARPRSUBO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELEVARPRSUBO, Cancel);
    // Stub
  }

  private void PAN_ELEVARPRSUBO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ELEVARPRSUBO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELEVARPRSUBO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELEVARPRSUBO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BOZZADESC_Init()
  {

    PAN_BOZZADESC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BOZZADESC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BOZZADESC.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_BOZZADESC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, "AD77402B-02A1-42E9-B919-22D7BAD900E1");
    PAN_BOZZADESC.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, "");
    PAN_BOZZADESC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, MyGlb.VIS_ETICHEGRASSE);
    PAN_BOZZADESC.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_BOZZADESC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, "F50BA477-2DCC-4C8A-8BE1-1853FE670938");
    PAN_BOZZADESC.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, "New Expression");
    PAN_BOZZADESC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, "");
    PAN_BOZZADESC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZADESC.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_BOZZADESC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BOZZADESC.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, MyGlb.PANEL_LIST, 16, 8, 660, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZADESC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, MyGlb.PANEL_LIST, 0);
    PAN_BOZZADESC.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZADESC.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, MyGlb.PANEL_FORM, 8, 8, 668, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZADESC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, MyGlb.PANEL_FORM, 0);
    PAN_BOZZADESC.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZADESC_BOZZA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZADESC.SetFieldPage(PFL_BOZZADESC_BOZZA, -1, -1);
    PAN_BOZZADESC.SetFieldPanel(PFL_BOZZADESC_BOZZA, -1, "", "BOZZA", 0, 0, 0, -13997);
    PAN_BOZZADESC.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZADESC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_LIST, 84);
    PAN_BOZZADESC.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZADESC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_LIST, "New Expression");
    PAN_BOZZADESC.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_FORM, 4, 40, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZADESC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_FORM, 84);
    PAN_BOZZADESC.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZADESC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZADESC_NEWEXPRESSIO, MyGlb.PANEL_FORM, "New Expres.");
    PAN_BOZZADESC.SetFieldPage(PFL_BOZZADESC_NEWEXPRESSIO, -1, -1);
    PAN_BOZZADESC.SetFieldUnbound(PFL_BOZZADESC_NEWEXPRESSIO, true);
    PAN_BOZZADESC.SetFieldPanel(PFL_BOZZADESC_NEWEXPRESSIO, PPQRY_DUAL8, "1", "RECORNEWEXPR", 1, 19, 0, -13997);
  }

  private void PAN_BOZZADESC_InitQueries()
  {
    StringBuffer SQL;

    PAN_BOZZADESC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BOZZADESC.SetIMDB(IMDB, "PQRY_DUAL8", true);
    PAN_BOZZADESC.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as RECORNEWEXPR ");
    PAN_BOZZADESC.SetQuery(PPQRY_DUAL8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_BOZZADESC.SetQuery(PPQRY_DUAL8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZADESC.SetQuery(PPQRY_DUAL8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZADESC.SetQuery(PPQRY_DUAL8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZADESC.SetQuery(PPQRY_DUAL8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZADESC.SetQuery(PPQRY_DUAL8, 5, SQL, -1, "");
    PAN_BOZZADESC.SetQueryDB(PPQRY_DUAL8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZADESC.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BOZZADESC.Status() == 2)
    {
      int oldListQBE = PAN_BOZZADESC.iUseListQBE;
      PAN_BOZZADESC.iUseListQBE = 0;
      PAN_BOZZADESC.PanelCommand(Glb.PCM_SEARCH);
      PAN_BOZZADESC.PanelCommand(Glb.PCM_FIND);
      PAN_BOZZADESC.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, "E7DE609F-71C1-4785-B847-76C5BEBDC263");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, "Tipo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, 28);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, 0, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPO, PPQRY_PARS6, "A.ROWNAMETIPO", "ROWNAMETIPO", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPO, (new IDVariant("B")), "Bilancio", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPO, (new IDVariant("P")), "P.e.g.", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPO, (new IDVariant("T")), "Tutte", "", "", -1);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS6", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS6, IMDBDef12.PQRY_PARS6_RS, IMDBDef4.TBL_PARS10);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPO, IMDBDef4.FLD_PARS10_ROWNAMETIPO);
    PAN_PARS.SetMasterTable(0, "PARS10");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTDELLBOZZ_Init()
  {

    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, "C5D86EB4-78A0-40EC-9B12-B967F3090001");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, "Stato");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, "425F62E9-FB0D-4CD9-959B-B3C8639CA070");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, "E/S");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, "C2426C2D-2FFB-43EF-B786-DF23F55BD783");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, "CAPITOLO");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, "243BE268-5278-4F59-89F5-E1598B121EE2");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, "ARTICOLO");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, "F3BF4084-F040-44EE-8F74-7976CC4AF4AF");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, "Voce P.e.g.");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, "94003AE4-FA36-42E6-8B30-AAB225CA5305");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, "Capitolo/Art.");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, "49DE47FB-5AFD-4A55-AD7A-BD6C2E3724C1");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, "Nuova");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, "C8090CF8-CA6D-4817-BEEE-EDDBEC232167");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, "Bilancio");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, "F04BB034-CA28-485C-92B8-4DDE52E88F20");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, "Descrizione");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, "49E5FC30-4A5D-4F08-8835-869081C96043");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, "Sposta su altra bozza");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_DETTDELLBOZZ.SetImage(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, 0, "button_very_large.GIF", false);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, "812C0884-FADD-4816-99D2-08C7D7C4B29C");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, "COD REC");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, "ABA83BBB-985E-418B-A977-F33A6FA3962E");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, "PROPOSTA VAR DETT ID");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DETTDELLBOZZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, "2F05BA45-0931-4917-8F74-B210FE82D647");
    PAN_DETTDELLBOZZ.set_Header(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, "ESERCIZIO");
    PAN_DETTDELLBOZZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, "");
    PAN_DETTDELLBOZZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTDELLBOZZ.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, 0, -1);
  }

  private void PAN_DETTDELLBOZZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, 36);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_LIST, "Stato");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, 4, 4, 468, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, 36);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_STATO1, MyGlb.PANEL_FORM, "St.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_STATO1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldUnbound(PFL_DETTDELLBOZZ_STATO1, true);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_STATO1, PPQRY_POLPROVARDE1, "A.STATO", "RECORDSTATO", 5, 1, 0, -13997);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_STATO1, (new IDVariant()), "Faccina interrogativa", "", "smile_question.gif", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_STATO1, (new IDVariant("A")), "Faccina Verde", "", "smileverde.gif", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_STATO1, (new IDVariant("N")), "Faccina rossa", "", "smilerosso.gif", -1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_LIST, 40, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_LIST, 24);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_LIST, "E/S");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_FORM, 4, 52, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_FORM, 24);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_ES1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_ES1, PPQRY_POLPROVARDE1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_ES1, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_ES1, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_LIST, 92, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_FORM, 4, 100, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLO1, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_CAPITOLO1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_CAPITOLO1, PPQRY_POLPROVARDE1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_LIST, 196, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_LIST, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_LIST, "A.");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_FORM, 60);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ARTICOLO1, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_ARTICOLO1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_ARTICOLO1, PPQRY_POLPROVARDE1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, MyGlb.PANEL_LIST, 92, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, MyGlb.PANEL_LIST, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, MyGlb.PANEL_LIST, 2);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, MyGlb.PANEL_FORM, 140, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, MyGlb.PANEL_FORM, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_VOCEPEGSMAL1, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_VOCEPEGSMAL1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_VOCEPEGSMAL1, -1, "", "VOCEPEGSMAL1", 0, 0, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_LIST, 92, 0, 128, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_FORM, 148, 8, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_CAPITOLOART, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_LIST, 220, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_LIST, 92);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_LIST, "Nuova");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_FORM, 4, 148, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_FORM, 92);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_NUOVA1, MyGlb.PANEL_FORM, "Nuova");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_NUOVA1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_NUOVA1, PPQRY_POLPROVARDE1, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_NUOVA1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_NUOVA1, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_LIST, 264, 36, 52, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_LIST, 44);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_LIST, "Bilancio");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_FORM, 4, 172, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_FORM, 44);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_BILANCIO1, MyGlb.PANEL_FORM, "Bilan.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_BILANCIO1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldUnbound(PFL_DETTDELLBOZZ_BILANCIO1, true);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_BILANCIO1, PPQRY_POLPROVARDE1, "CASE WHEN A.VAR_BIL = 'SI' THEN 'SI' ELSE NULL END", "RECORDBILANC", 5, 99, 0, -13997);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_BILANCIO1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTDELLBOZZ.SetValueListItem(PFL_DETTDELLBOZZ_BILANCIO1, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_LIST, 316, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 220, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_DESCRIZIONE1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_DESCRIZIONE1, PPQRY_POLPROVARDE1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, MyGlb.PANEL_LIST, 0, 260, 168, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, MyGlb.PANEL_FORM, 8, 248, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_SPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_SPOSTA, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_SPOSTA, -1, "", "SPOSTA", 0, 0, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_LIST, 56);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_LIST, "COD REC");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_FORM, 4, 256, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_FORM, 56);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_CODREC, MyGlb.PANEL_FORM, "COD REC");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_CODREC, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_CODREC, PPQRY_POLPROVARDE1, "A.COD_REC", "COD_REC", 1, 1, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_LIST, 128);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_LIST, "PROPOSTA VAR DETT ID");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_FORM, 4, 280, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_FORM, 128);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_PROPVARDETID, MyGlb.PANEL_FORM, "PROP. VAR DETT ID");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_PROPVARDETID, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_PROPVARDETID, PPQRY_POLPROVARDE1, "A.PROPOSTA_VAR_DETT_ID", "PROPOSTA_VAR_DETT_ID", 3, 10, 0, -13997);
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_LIST, 64);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERC.");
    PAN_DETTDELLBOZZ.SetRect(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 256, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTDELLBOZZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_DETTDELLBOZZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_DETTDELLBOZZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTDELLBOZZ_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERC.");
    PAN_DETTDELLBOZZ.SetFieldPage(PFL_DETTDELLBOZZ_ESERCIZIO1, -1, -1);
    PAN_DETTDELLBOZZ.SetFieldPanel(PFL_DETTDELLBOZZ_ESERCIZIO1, PPQRY_POLPROVARDE1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
  }

  private void PAN_DETTDELLBOZZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTDELLBOZZ.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTDELLBOZZ.SetIMDB(IMDB, "PQRY_POLPROVARDE1", true);
    PAN_DETTDELLBOZZ.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STATO as RECORDSTATO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  CASE WHEN A.VAR_BIL = 'SI' THEN 'SI' ELSE NULL END as RECORDBILANC, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.COD_REC as COD_REC, ");
    SQL.append("  A.PROPOSTA_VAR_DETT_ID as PROPOSTA_VAR_DETT_ID, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.COD_REC = 2) ");
    SQL.append("and   (A.BOZZA_VARIAZIONE_ID = ~~TBL_IN7.ROWNAMEBOZZA~~) ");
    SQL.append("and   ((A.VARIAZIONE_ID IS NULL)) ");
    SQL.append("and   ((A.VAR_BIL = 'SI' AND ~~PQRY_PARS6.ROWNAMETIPO~~ = 'B') OR ((A.VAR_BIL IS NULL) AND ~~PQRY_PARS6.ROWNAMETIPO~~ = 'P') OR (~~PQRY_PARS6.ROWNAMETIPO~~ = 'T')) ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_DETTDELLBOZZ.SetQuery(PPQRY_POLPROVARDE1, 5, SQL, -1, "");
    PAN_DETTDELLBOZZ.SetQueryDB(PPQRY_POLPROVARDE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTDELLBOZZ.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    PAN_DETTDELLBOZZ.AddToSortList(PFL_DETTDELLBOZZ_ES1, true);
    PAN_DETTDELLBOZZ.AddToSortList(PFL_DETTDELLBOZZ_CAPITOLO1, true);
    PAN_DETTDELLBOZZ.AddToSortList(PFL_DETTDELLBOZZ_ARTICOLO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTDELLBOZZ.Status() == 2)
    {
      int oldListQBE = PAN_DETTDELLBOZZ.iUseListQBE;
      PAN_DETTDELLBOZZ.iUseListQBE = 0;
      PAN_DETTDELLBOZZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTDELLBOZZ.PanelCommand(Glb.PCM_FIND);
      PAN_DETTDELLBOZZ.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ALTREBOZZE_Init()
  {

    PAN_ALTREBOZZE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ALTREBOZZE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ALTREBOZZE.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, "D5849A6A-CC4D-4D25-83BD-4363472FA305");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, "BOZZA VARIAZIONE ID");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, "08426609-56FC-4E06-A19A-B492D90637F7");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, "ESERCIZIO");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, "6B362861-6FC8-41B3-BAD5-FACE31D248B7");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, "Descrizione");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, "97FC65D5-A9B3-4CD5-BEE5-741DEE3EEB9C");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, "Urgente");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.VIS_CHECKSTYLE);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, "4087D8D6-582A-454A-BBCF-77A320305756");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, "Data Limite");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.VIS_NORMALFIELDS);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, "E46205F2-9F35-47BD-B5AF-C6E2AD149DDB");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, "95A0B559-3BBC-4DDD-A163-58C09E99A620");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, "352955C6-D800-4067-A5F0-E1AF7B7F209B");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, "EBA1DD06-F255-4745-9197-28D915601BEC");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ALTREBOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, "5361C47A-E48A-45F3-8AC4-B42888FD9CA3");
    PAN_ALTREBOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, "Var");
    PAN_ALTREBOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, "");
    PAN_ALTREBOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.VIS_CHECKSTYLE);
    PAN_ALTREBOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ALTREBOZZE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_LIST, 120);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_LIST, "BOZZA VARIAZIONE ID");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_FORM, 120);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_BOZZAVARIAID, MyGlb.PANEL_FORM, "BOZ. VARIAZIONE ID");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_BOZZAVARIAID, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_BOZZAVARIAID, PPQRY_POLBOZZEVAR2, "A.BOZZA_VARIAZIONE_ID", "BOZZA_VARIAZIONE_ID", 3, 10, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_ESERCIZIO, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_ESERCIZIO, PPQRY_POLBOZZEVAR2, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_LIST, 0, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_LIST, 76);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 52, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_FORM, 76);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_FORM, 2);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_DESCRIZIONE2, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_DESCRIZIONE2, PPQRY_POLBOZZEVAR2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_LIST, 216, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_LIST, 56);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_LIST, "Urgente");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_FORM, 4, 88, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_FORM, 56);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_URGENTE, MyGlb.PANEL_FORM, "Urgente");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_URGENTE, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_URGENTE, PPQRY_POLBOZZEVAR2, "A.URGENTE", "URGENTE", 5, 2, 0, -13997);
    PAN_ALTREBOZZE.SetValueListItem(PFL_ALTREBOZZE_URGENTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ALTREBOZZE.SetValueListItem(PFL_ALTREBOZZE_URGENTE, (new IDVariant()), "Null", "", "", -1);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_LIST, 272, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_LIST, 128);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_LIST, "Data Limite");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_FORM, 4, 112, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_FORM, 128);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATALIMITE, MyGlb.PANEL_FORM, "Data Limite");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_DATALIMITE, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_DATALIMITE, PPQRY_POLBOZZEVAR2, "A.DATA_LIMITE_PROPOSTE", "DATA_LIMITE_PROPOSTE", 6, 19, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_LIST, 332, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 136, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_UTENTEINSERI, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_UTENTEINSERI, PPQRY_POLBOZZEVAR2, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_LIST, 332, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_FORM, 4, 160, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_DATAINSERIME, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_DATAINSERIME, PPQRY_POLBOZZEVAR2, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_LIST, 332, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 184, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_UTENTULTIAGG, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_UTENTULTIAGG, PPQRY_POLBOZZEVAR2, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_LIST, 332, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 208, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_DATAULTIMAGG, -1, -1);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_DATAULTIMAGG, PPQRY_POLBOZZEVAR2, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_LIST, 340, 36, 32, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_LIST, 24);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_LIST, 1);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_LIST, "Var");
    PAN_ALTREBOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_FORM, 4, 136, 456, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ALTREBOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_FORM, 24);
    PAN_ALTREBOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_FORM, 2);
    PAN_ALTREBOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ALTREBOZZE_VAR1, MyGlb.PANEL_FORM, "Vr.");
    PAN_ALTREBOZZE.SetFieldPage(PFL_ALTREBOZZE_VAR1, -1, -1);
    PAN_ALTREBOZZE.SetFieldUnbound(PFL_ALTREBOZZE_VAR1, true);
    PAN_ALTREBOZZE.SetFieldPanel(PFL_ALTREBOZZE_VAR1, PPQRY_POLBOZZEVAR2, "CASE WHEN POL_GET_SE_DETT_VAR(A.BOZZA_VARIAZIONE_ID) = 'SI' THEN 'SI' ELSE NULL END", "RECORDVAR", 5, 99, 0, -13997);
    PAN_ALTREBOZZE.SetValueListItem(PFL_ALTREBOZZE_VAR1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ALTREBOZZE.SetValueListItem(PFL_ALTREBOZZE_VAR1, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_ALTREBOZZE_InitQueries()
  {
    StringBuffer SQL;

    PAN_ALTREBOZZE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ALTREBOZZE.SetIMDB(IMDB, "PQRY_POLBOZZEVAR2", true);
    PAN_ALTREBOZZE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID as BOZZA_VARIAZIONE_ID, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.URGENTE as URGENTE, ");
    SQL.append("  A.DATA_LIMITE_PROPOSTE as DATA_LIMITE_PROPOSTE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  CASE WHEN POL_GET_SE_DETT_VAR(A.BOZZA_VARIAZIONE_ID) = 'SI' THEN 'SI' ELSE NULL END as RECORDVAR ");
    PAN_ALTREBOZZE.SetQuery(PPQRY_POLBOZZEVAR2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_BOZZE_VARIAZIONE A ");
    PAN_ALTREBOZZE.SetQuery(PPQRY_POLBOZZEVAR2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BOZZA_VARIAZIONE_ID <> ~~TBL_IN7.ROWNAMEBOZZA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
    SQL.append("and   (NOT ((B.PROGR_VARCOMPRO_1 IS NULL)) OR NOT ((B.PROGR_VARCOMPRO_2 IS NULL)) OR NOT ((B.PROGR_VARCOMPRO_3 IS NULL)) OR NOT ((B.PROGR_VARCOM_1 IS NULL)) OR NOT ((B.PROGR_VARCOM_2 IS NULL)) OR NOT ((B.PROGR_VARCOM_3 IS NULL))) ");
    SQL.append(")))) ");
    PAN_ALTREBOZZE.SetQuery(PPQRY_POLBOZZEVAR2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALTREBOZZE.SetQuery(PPQRY_POLBOZZEVAR2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ALTREBOZZE.SetQuery(PPQRY_POLBOZZEVAR2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID ");
    PAN_ALTREBOZZE.SetQuery(PPQRY_POLBOZZEVAR2, 5, SQL, -1, "");
    PAN_ALTREBOZZE.SetQueryDB(PPQRY_POLBOZZEVAR2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ALTREBOZZE.SetMasterTable(0, "POL_BOZZE_VARIAZIONE");
    PAN_ALTREBOZZE.AddToSortList(PFL_ALTREBOZZE_BOZZAVARIAID, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ALTREBOZZE.Status() == 2)
    {
      int oldListQBE = PAN_ALTREBOZZE.iUseListQBE;
      PAN_ALTREBOZZE.iUseListQBE = 0;
      PAN_ALTREBOZZE.PanelCommand(Glb.PCM_SEARCH);
      PAN_ALTREBOZZE.PanelCommand(Glb.PCM_FIND);
      PAN_ALTREBOZZE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ELEVARPRSUBO_Init()
  {

    PAN_ELEVARPRSUBO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELEVARPRSUBO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELEVARPRSUBO.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, "8E28C532-AADD-48A3-A84B-80777C68DE15");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, "Stato");
    PAN_ELEVARPRSUBO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, "");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, "EFBD35B5-B792-4D03-91B2-D50BC0EA3D9F");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, "E/S");
    PAN_ELEVARPRSUBO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, "");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, "084A2283-74F8-4778-A5A6-94D313DFF868");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, "CAPITOLO");
    PAN_ELEVARPRSUBO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, "");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, "6C4F1982-5513-4837-BB11-7B73E2D496D7");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, "ARTICOLO");
    PAN_ELEVARPRSUBO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, "");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, "922E8FD2-45C4-443C-9046-F9613BBE9673");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, "Voce P.e.g.");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, "D1AFAA9C-010F-4143-B4E8-80C6526A0AAB");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, "Capitolo/Art.");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, "5C18212A-C6C9-400A-B8CE-18F097F5AA90");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, "Nuova");
    PAN_ELEVARPRSUBO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, "");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.VIS_CHECKSTYLE);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, "2DD9D344-946A-4436-8D62-188859C3B59C");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, "Bilancio");
    PAN_ELEVARPRSUBO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, "");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELEVARPRSUBO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, "AE9EC42B-995A-4404-830D-3BDE8BC63EBE");
    PAN_ELEVARPRSUBO.set_Header(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, "Descrizione");
    PAN_ELEVARPRSUBO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, "");
    PAN_ELEVARPRSUBO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELEVARPRSUBO.SetFlags(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_ELEVARPRSUBO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_LIST, 36);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_LIST, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_FORM, 4, 4, 468, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_FORM, 36);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_FORM, 2);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_STATO, MyGlb.PANEL_FORM, "St.");
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_STATO, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldUnbound(PFL_ELEVARPRSUBO_STATO, true);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_STATO, PPQRY_POLPROVARD10, "A.STATO", "RECORDSTATO", 5, 1, 0, -13997);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_STATO, (new IDVariant()), "Faccina interrogativa", "", "smile_question.gif", -1);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_STATO, (new IDVariant("A")), "Faccina Verde", "", "smileverde.gif", -1);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_STATO, (new IDVariant("N")), "Faccina rossa", "", "smilerosso.gif", -1);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_LIST, 44, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_LIST, 24);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_LIST, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_LIST, "E/S");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_FORM, 4, 52, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_FORM, 24);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_FORM, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_ES, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_ES, PPQRY_POLPROVARD10, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_LIST, 88, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_FORM, 4, 100, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_CAPITOLO, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_CAPITOLO, PPQRY_POLPROVARD10, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_LIST, 200, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_ARTICOLO, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_ARTICOLO, PPQRY_POLPROVARD10, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, MyGlb.PANEL_LIST, 88, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, MyGlb.PANEL_LIST, 0);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, MyGlb.PANEL_LIST, 2);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, MyGlb.PANEL_FORM, 136, 0, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, MyGlb.PANEL_FORM, 0);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_VOCEPEGSMALL, MyGlb.PANEL_FORM, 2);
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_VOCEPEGSMALL, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_VOCEPEGSMALL, -1, "", "VOCEPEGSMALL", 0, 0, 0, -13997);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, MyGlb.PANEL_LIST, 88, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, MyGlb.PANEL_LIST, 0);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, MyGlb.PANEL_LIST, 2);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, MyGlb.PANEL_FORM, 144, 8, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, MyGlb.PANEL_FORM, 0);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_CAPITOARTBIG, MyGlb.PANEL_FORM, 2);
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_CAPITOARTBIG, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_CAPITOARTBIG, -1, "", "CAPITOARTBIG", 0, 0, 0, -13997);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_LIST, 224, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_LIST, 92);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_LIST, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_LIST, "Nuova");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_FORM, 4, 148, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_FORM, 92);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_FORM, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_NUOVA, MyGlb.PANEL_FORM, "Nuova");
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_NUOVA, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_NUOVA, PPQRY_POLPROVARD10, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_NUOVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_NUOVA, (new IDVariant()), "Null", "", "", -1);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_LIST, 268, 36, 52, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_LIST, 44);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_LIST, "Bilancio");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_FORM, 4, 172, 476, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_FORM, 44);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_FORM, 2);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_BILANCIO, MyGlb.PANEL_FORM, "Bilan.");
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_BILANCIO, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldUnbound(PFL_ELEVARPRSUBO_BILANCIO, true);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_BILANCIO, PPQRY_POLPROVARD10, "CASE WHEN A.VAR_BIL = 'SI' THEN 'SI' ELSE NULL END", "RECORDBILANC", 5, 99, 0, -13997);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_BILANCIO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELEVARPRSUBO.SetValueListItem(PFL_ELEVARPRSUBO_BILANCIO, (new IDVariant()), "Null", "", "", -1);
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_LIST, 320, 36, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELEVARPRSUBO.SetRect(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELEVARPRSUBO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ELEVARPRSUBO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELEVARPRSUBO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELEVARPRSUBO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ELEVARPRSUBO.SetFieldPage(PFL_ELEVARPRSUBO_DESCRIZIONE, -1, -1);
    PAN_ELEVARPRSUBO.SetFieldPanel(PFL_ELEVARPRSUBO_DESCRIZIONE, PPQRY_POLPROVARD10, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
  }

  private void PAN_ELEVARPRSUBO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELEVARPRSUBO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELEVARPRSUBO.SetIMDB(IMDB, "PQRY_POLPROVARD10", true);
    PAN_ELEVARPRSUBO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.STATO as RECORDSTATO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  CASE WHEN A.VAR_BIL = 'SI' THEN 'SI' ELSE NULL END as RECORDBILANC, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_ELEVARPRSUBO.SetQuery(PPQRY_POLPROVARD10, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_ELEVARPRSUBO.SetQuery(PPQRY_POLPROVARD10, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.COD_REC = 2) ");
    SQL.append("and   (A.BOZZA_VARIAZIONE_ID = ~~PQRY_POLBOZZEVAR2.BOZZA_VARIAZIONE_ID~~) ");
    PAN_ELEVARPRSUBO.SetQuery(PPQRY_POLPROVARD10, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELEVARPRSUBO.SetQuery(PPQRY_POLPROVARD10, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELEVARPRSUBO.SetQuery(PPQRY_POLPROVARD10, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELEVARPRSUBO.SetQuery(PPQRY_POLPROVARD10, 5, SQL, -1, "");
    PAN_ELEVARPRSUBO.SetQueryDB(PPQRY_POLPROVARD10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELEVARPRSUBO.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELEVARPRSUBO.Status() == 2)
    {
      int oldListQBE = PAN_ELEVARPRSUBO.iUseListQBE;
      PAN_ELEVARPRSUBO.iUseListQBE = 0;
      PAN_ELEVARPRSUBO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELEVARPRSUBO.PanelCommand(Glb.PCM_FIND);
      PAN_ELEVARPRSUBO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BOZZADESC) PAN_BOZZADESC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELEVARPRSUBO) PAN_ELEVARPRSUBO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZADESC) PAN_BOZZADESC_ValidateRow(Cancel);
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_ValidateRow(Cancel);
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_ValidateRow(Cancel);
    if (SrcObj == PAN_ELEVARPRSUBO) PAN_ELEVARPRSUBO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOZZADESC) PAN_BOZZADESC_DynamicProperties();
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_DynamicProperties();
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_DynamicProperties();
    if (SrcObj == PAN_ELEVARPRSUBO) PAN_ELEVARPRSUBO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZADESC) PAN_BOZZADESC_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELEVARPRSUBO) PAN_ELEVARPRSUBO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_BOZZADESC) PAN_BOZZADESC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTDELLBOZZ) PAN_DETTDELLBOZZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ALTREBOZZE) PAN_ALTREBOZZE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ELEVARPRSUBO) PAN_ELEVARPRSUBO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
