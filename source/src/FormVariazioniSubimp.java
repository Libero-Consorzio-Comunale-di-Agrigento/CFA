// **********************************************
// Form Variazioni Subimp
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FormVariazioniSubimp extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAZIONI_PROVVEDIMENT = 0;

  private static int PFL_VARIAZIONI_DESCRIZIONE2 = 0;
  private static int PFL_VARIAZIONI_IMPORTO3 = 1;
  private static int PFL_VARIAZIONI_DATA = 2;
  private static int PFL_VARIAZIONI_TIPOVARIAZIO = 3;
  private static int PFL_VARIAZIONI_DELIBERA2 = 4;
  private static int PFL_VARIAZIONI_NUMERODEL2 = 5;
  private static int PFL_VARIAZIONI_ANNODEL2 = 6;
  private static int PFL_VARIAZIONI_PROPOSTA2 = 7;
  private static int PFL_VARIAZIONI_NUMEROPROPO2 = 8;
  private static int PFL_VARIAZIONI_ANNOPROPOST2 = 9;
  private static int PFL_VARIAZIONI_TRATTINO2 = 10;
  private static int PFL_VARIAZIONI_BARRA2 = 11;
  private static int PFL_VARIAZIONI_BARRA3 = 12;
  private static int PFL_VARIAZIONI_TRATTINO1 = 13;
  private static int PFL_VARIAZIONI_SELEZIDELIBE = 14;
  private static int PFL_VARIAZIONI_SELEZIPROPOS = 15;
  private static int PFL_VARIAZIONI_INFODELIBER2 = 16;
  private static int PFL_VARIAZIONI_INFOPROPOST1 = 17;
  private static int PFL_VARIAZIONI_INFODELIBER1 = 18;
  private static int PFL_VARIAZIONI_DELIBERA = 19;
  private static int PFL_VARIAZIONI_INFODELIBERA = 20;
  private static int PFL_VARIAZIONI_PROPOSTA = 21;
  private static int PFL_VARIAZIONI_INFOPROPOSTA = 22;
  private static int PFL_VARIAZIONI_FINANZIAMENT = 23;
  private static int PFL_VARIAZIONI_ANNOESIGIBIL = 24;
  private static int PFL_VARIAZIONI_ANNOENTRATA = 25;
  private static int PFL_VARIAZIONI_IMPOTOTAVARI = 26;
  private static int PFL_VARIAZIONI_CODREC = 27;
  private static int PFL_VARIAZIONI_ANNOVAR = 28;
  private static int PFL_VARIAZIONI_ANNOIMP1 = 29;
  private static int PFL_VARIAZIONI_NUMEROIMP = 30;
  private static int PFL_VARIAZIONI_CAPITOLO = 31;
  private static int PFL_VARIAZIONI_ARTICOLO = 32;
  private static int PFL_VARIAZIONI_ANNOSUBIMP = 33;
  private static int PFL_VARIAZIONI_NUMEROSUBIMP = 34;
  private static int PFL_VARIAZIONI_SELEZISUBIMP = 35;
  private static int PFL_VARIAZIONI_LABELDELIBER = 36;
  private static int PFL_VARIAZIONI_LABELPROPOST = 37;
  private static int PFL_VARIAZIONI_ESTREMIMPEGN = 38;
  private static int PFL_VARIAZIONI_SUBIMPEGNO = 39;
  private static int PFL_VARIAZIONI_BARRA = 40;
  private static int PFL_VARIAZIONI_INFOSUBIMPEG = 41;
  private static int PFL_VARIAZIONI_INFOPEG = 42;
  private static int PFL_VARIAZIONI_BARRA1 = 43;
  private static int PFL_VARIAZIONI_CAPITOLOART = 44;
  private static int PFL_VARIAZIONI_INFOFINANZIA = 45;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 46;
  private static int PFL_VARIAZIONI_UTENTEINSERI = 47;
  private static int PFL_VARIAZIONI_DATAINSERIME = 48;
  private static int PFL_VARIAZIONI_UTENTULTIAGG = 49;
  private static int PFL_VARIAZIONI_DATAULTIMAGG = 50;

  private static int PPQRY_VARSUB7 = 0;

  private static int PPQRY_DEL = 1;
  private static int PPQRY_PROPOSTE = 2;

  private static int PPQRY_T55 = 3;
  private static int PPQRY_IMPFIN1 = 4;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VARIAZIONI1(IMDB);
    //
    //
    Init_PQRY_VARSUB7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VARIAZIONI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VARIAZIONI1, 18);
    IMDB.set_TblCode(IMDBDef4.TBL_VARIAZIONI1, "TBL_VARIAZIONI1");
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMPROVAR, "ROWNAMPROVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMPROVAR,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, "ROWNAMANSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, "ROWNAMNUSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMDESUIM, "ROWNAMDESUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMDESUIM,5,250,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEARTIC,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEIMPEG,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMINFUPD, "ROWNAMINFUPD");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMINFUPD,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROGR,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMCONPRO, "ROWNAMCONPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMCONPRO,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_RONANUVADAPR, "RONANUVADAPR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_RONANUVADAPR,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_RONANUVADAEL, "RONANUVADAEL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_RONANUVADAEL,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI1,IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef4.TBL_VARIAZIONI1, 0);
  }

  private static void Init_PQRY_VARSUB7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VARSUB7, 28);
    IMDB.set_TblCode(IMDBDef13.PQRY_VARSUB7, "PQRY_VARSUB7");
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_VARSINFODELI, "VARSINFODELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_VARSINFODELI,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_VARSINFOPROP, "VARSINFOPROP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_VARSINFOPROP,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA, "ANNO_ENTRATA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARSUB7,IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA,1,4,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VARSUB7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FormVariazioniSubimp(MyWebEntryPoint w, IMDBObj imdb)
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
  public FormVariazioniSubimp()
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
    FormIdx = MyGlb.FRM_FORMVARISUBI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2BB87B35-D62A-4B28-BA13-8F5DFADA682B";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 984;
    DesignHeight = 370;
    set_Caption(new IDVariant("Form Variazioni Subimp"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 984;
    Frames[1].Height = 344;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 344;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 984-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C6565DA3-5139-433A-A9DD-09159375979E");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 36, 1524, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 2;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_NUOVO9+BaseCmdLinIdx)
      {
        Inserisci();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA25+BaseCmdLinIdx)
      {
        Salva();
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
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VARIAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIONI_SELEZIDELIBE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_VARIAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIONI_SELEZIPROPOS) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUT && flRis && IdxPanelActived == PAN_VARIAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIONI_SELEZISUBIMP) {
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
    return (obj instanceof FormVariazioniSubimp);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FormVariazioniSubimp.class.getName() : (Glb.ClassWithPackage(FormVariazioniSubimp.class) ? FormVariazioniSubimp.class.getName().substring(FormVariazioniSubimp.class.getPackage().getName().length() + 1) : FormVariazioniSubimp.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Variazioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(8)), true) || Command.equals((new IDVariant(256)), true))
      {
        PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      }
      if (Command.equals((new IDVariant(1)), true))
      {
        if ((new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(0)), true) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_PROGRESSIVO, 0)))
        {
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni After Find Event Body
      // Procedure Body
      // 
      CalcolaTotaleVariazione();
      GestioneCampoFinanziamento();
      AbilitazioneCampiSeInfoOUpdate();
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_FINANZIAMENTO, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIONI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_PROGRESSIVO, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_PROGRESSIVO, 0, (new IDVariant()));
        }
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_VAR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_D_DATA_REG, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_D_DATA_REG, 0, MainFrm.Proponidatareginesercizio());
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMECAPIT, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEARTIC, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_IMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_IMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0));
        }
        else
        {
          if ((Column.equals((new IDVariant(PFL_VARIAZIONI_ANNOSUBIMP)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_NUMEROSUBIMP)), true)) && FieldWasModified.booleanValue())
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0))))
            {
              IDVariant v_VSUBIANNOIMP = new IDVariant(0,IDVariant.INTEGER);
              IDVariant v_VSUBINUMEIMP = new IDVariant(0,IDVariant.INTEGER);
              IDVariant v_VSUBIMPCAPIT = new IDVariant(0,IDVariant.DECIMAL);
              IDVariant v_VSUBIMPARTIC = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A.ANNO_IMP as SUBIMANNOIMP, ");
              SQL.append("  A.NUMERO_IMP as SUBIMNUMEIMP, ");
              SQL.append("  A.CAPITOLO as SUBIMPCAPITO, ");
              SQL.append("  A.ARTICOLO as SUBIMPARTICO ");
              SQL.append("from ");
              SQL.append("  SUBIMP A ");
              SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VSUBIANNOIMP = QV.Get("SUBIMANNOIMP", IDVariant.INTEGER) ;
                v_VSUBINUMEIMP = QV.Get("SUBIMNUMEIMP", IDVariant.INTEGER) ;
                v_VSUBIMPCAPIT = QV.Get("SUBIMPCAPITO", IDVariant.DECIMAL) ;
                v_VSUBIMPARTIC = QV.Get("SUBIMPARTICO", IDVariant.INTEGER) ;
              }
              QV.Close();
              IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_IMP, 0, new IDVariant(v_VSUBIANNOIMP));
              IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_IMP, 0, new IDVariant(v_VSUBINUMEIMP));
              IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0, new IDVariant(v_VSUBIMPCAPIT));
              IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0, new IDVariant(v_VSUBIMPARTIC));
            }
          }
        }
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_SUBIMP6, IMDBDef13.PQSL_SUBIMP6_ANNO_IMP, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_COD_REC, 0, (new IDVariant(2)));
        }
        else
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_COD_REC, 0, (new IDVariant(1)));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_ANNOESIGIBIL)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ESIGIBILITA, 0))))
        {
          if (IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ESIGIBILITA, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'Anno Entrata deve essere minore o uguale all'ann"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_ANNOENTRATA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA, 0))))
        {
          if (IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ESIGIBILITA, 0), true)>0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'Anno Entrata deve essere minore o uguale all'ann"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ENTRATA, 0, (new IDVariant()));
          }
        }
      }
      CalcolaTotaleVariazione();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni After Update Event
  // Evento notificato dopo il salvataggio sul database
  // di una riga modificata.
  // **********************************************************************
  private void PAN_VARIAZIONI_AfterUpdate()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni After Update Event Body
      // Procedure Body
      // 
      CalcolaTotaleVariazione();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniAfterUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni After Delete Event
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_VARIAZIONI_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni After Delete Event Body
      // Procedure Body
      // 
      CalcolaTotaleVariazione();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniAfterDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARIAZIONI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Change Row Event Body
      // Procedure Body
      // 
      GestioneCampoFinanziamento();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(0)), true))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_ESIGIBILITA, 0))))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0))))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (PAN_VARIAZIONI.IsNewRow() && (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0)) || IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0))))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_FINANZIAMENTO, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE2,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE2))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Database Error Event
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
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Variazioni On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SEDEPROPOSTA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANNOPROPOSTA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROPROPOS = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_MESSAGGIO1 = (new IDVariant("Attenzione! Descrizione superiore a 140 caratteri.", IDVariant.STRING));
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
      // 
      // Variazioni On Validate Row Event Body
      // Procedure Body
      // 
      v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_SEDE_DEL, 0));
      v_ANNODEL = IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_DEL, 0);
      v_NUMERODEL = IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, 0);
      v_SEDEPROPOSTA = IDL.Upper(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0));
      v_ANNOPROPOSTA = IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0);
      v_NUMEROPROPOS = IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0);
      MainFrm.ControlloProposte(v_SEDEPROPOSTA, v_ANNOPROPOSTA, v_NUMEROPROPOS);
      IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0, new IDVariant(v_SEDEPROPOSTA));
      IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROPOSTA));
      IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROPOS));
      MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
      IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
      IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
      if (IDL.Length((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE2)))).compareTo((new IDVariant(140)), true)>0)
      {
        MainFrm.set_AlertMessage(v_MESSAGGIO1); 
        PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_DESCRIZIONE2, IDL.SubStr((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE2))), (new IDVariant(1)), (new IDVariant(140))).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che può essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIONI_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(1)), true))
      {
        AbilitazioneCampiSeInfoOUpdate();
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA25+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        CalcolaTotaleVariazione();
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA25+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "VariazioniOnChangeLayoutEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTSUBIUOUT, IMDBDef7.PQSL_VISTSUBIUOUT_NUMERO_SUBIMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "EndModalEvent", _e);
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
    IDVariant v_TOOLTIP3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP5 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP6 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SUBIMPEGNO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIP3 = (new IDVariant("Selezione Delibera", IDVariant.STRING));
      v_TOOLTIP5 = (new IDVariant("Informazioni Delibera", IDVariant.STRING));
      v_TOOLTIP6 = (new IDVariant("Informazioni Proposta", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Variazioni", IDVariant.STRING));
      v_SUBIMPEGNO = (new IDVariant("Sub-impegno : ", IDVariant.STRING));
      v_TOOLTIP = (new IDVariant("Informazioni Sub-Impegno", IDVariant.STRING));
      v_TOOLTIP2 = (new IDVariant("Informazioni Voce di Bilancio", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      AutoSaveType = (new IDVariant("DENY")).stringValue();
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMDESUIM, 0)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as SUBIMPDESCRI ");
        SQL.append("from ");
        SQL.append("  SUBIMP A ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("SUBIMPDESCRI", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMDESUIM, 0, new IDVariant(v_DESCRIZIONE));
      }
      PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ESTREMIMPEGN, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SUBIMPEGNO, IDL.ToString(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMDESUIM, 0)).stringValue());
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOSUBIMPEG,v_TOOLTIP.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPEG,v_TOOLTIP2.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_SELEZIDELIBE,v_TOOLTIP3.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_SELEZIPROPOS,v_TOOLTIP3.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFODELIBER2,v_TOOLTIP5.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPROPOST1,v_TOOLTIP6.stringValue()); 
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMCONPRO, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMCONPRO, 0, (new IDVariant("NO")));
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO9+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      }
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "LoadEvent", _e);
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
      if (new IDVariant(PAN_VARIAZIONI.Status()).compareTo((new IDVariant(3)), true)!=0)
      {
        UNLOADEVENT_VARIAZDELETE();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_VARIAZDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMPROVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMDESUIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMECAPIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEARTIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEIMPEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMINFUPD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMCONPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_RONANUVADAPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_RONANUVADAEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROUO, 0, new IDVariant());
  }

  // **********************************************************************
  // Info Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "InfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "SelezioneProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "SelezioneDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Gestione Campo Finanziamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int GestioneCampoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Gestione Campo Finanziamento Body
      // Procedure Body
      // 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // if (PAN_VARIAZIONI.IsNewRow())
      // {
        // PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      // }
      // else
      // {
        // PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      // }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "GestioneCampoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Campi Se Info O Update
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AbilitazioneCampiSeInfoOUpdate ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Campi Se Info O Update Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEIMPEG, 0).equals((new IDVariant("INFO")), true) || IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEIMPEG, 0).equals((new IDVariant("INFORES")), true))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETVAR1+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROGR, 0))))
        {
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETVAR1+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_RONANUVADAPR, 0).equals((new IDVariant("SI")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "AbilitazioneCampiSeInfoOUpdate", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Sub Impegno
  // **********************************************************************
  public int SceltaSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Sub Impegno Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMPROUNI, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI124, IMDBDef1.FLD_PARAMETRI124_ROWNAMPROUNI, 0, IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEPROUO, 0),IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0)));
      }
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUT, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "SceltaSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "InfoSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Voci Bilancio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Finanziamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Finanziamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_FINANZIAMENTO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "InfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totale Variazione
  // **********************************************************************
  public int CalcolaTotaleVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMA = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Calcola Totale Variazione Body
      // Procedure Body
      // 
      v_SOMMA = PAN_VARIAZIONI.GetFieldSum(PFL_VARIAZIONI_IMPORTO3);
      PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_IMPOTOTAVARI, IDL.ToString(v_SOMMA).stringValue());
      if ((MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO, 0, false)!=null))
      {
        ((SubImpegno)MainFrm.GetForm(MyGlb.FRM_SUBIMPEGNO,0,true,this)).SettaCaption();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "CalcolaTotaleVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_VARIAZIONI.Status()).equals((new IDVariant(3)), true) && !(PAN_VARIAZIONI.IsPanelInError()))
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant());
        if (!(ControlliBloccantiENonBloccanti(v_MESSAGGIO)))
        {
          return 0;
        }
        else
        {
          if (!(IDL.IsNull(v_MESSAGGIO)))
          {
            if (!(MainFrm.MessageConfirm(v_MESSAGGIO)))
            {
              return 0;
            }
          }
          PAN_VARIAZIONI.PanelCommand(Glb.PCM_UPDATE);
        }
        if (new IDVariant(PAN_VARIAZIONI.Status()).equals((new IDVariant(2)), true))
        {
          PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Bloccanti E Non Bloccanti
  // Messaggio Non Bloccante:  - Input/Output
  // **********************************************************************
  public boolean ControlliBloccantiENonBloccanti (IDVariant MessaggioNonBloccante)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSNONBLOCC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPORTOOLD = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti E Non Bloccanti Body
      // Procedure Body
      // 
      v_MESSNONBLOCC = (new IDVariant());
      if (PAN_VARIAZIONI.IsNewRow())
      {
        v_IMPORTOOLD = (new IDVariant());
      }
      else
      {
        v_IMPORTOOLD = new IDVariant(IDL.ToFloat(IDL.NullValue(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3),(new IDVariant("0")))),IDVariant.DECIMAL);
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_IMPORTSUBIMP = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTVARFIN = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTFINTOT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTVARTOT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTOFIN = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_NUMFINANZ = new IDVariant(0,IDVariant.INTEGER);
        v_NUMFINANZ = (new IDVariant(0));
        IDVariant v_IMPORSUBITOT = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUSUFII0, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  SUBIMP_FIN A ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTOFIN = QV.Get("NUVASUSUFII0", IDVariant.DECIMAL) ;
          v_NUMFINANZ = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NUMFINANZ.compareTo((new IDVariant(0)), true)>0)
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.IMPORTO as SUBIMPIMPORT ");
          SQL.append("from ");
          SQL.append("  SUBIMP A ");
          SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTSUBIMP = QV.Get("SUBIMPIMPORT", IDVariant.DECIMAL) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(SUM(DECODE(A.FINANZIAMENTO, to_number(NULL), 0, A.IMPORTO)), 0) as NVSIEVFN0VI0, ");
          SQL.append("  NVL(SUM(A.IMPORTO), 0) as NULVASUVAIM0 ");
          SQL.append("from ");
          SQL.append("  VARSUB A ");
          SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NOT ((A.FINANZIAMENTO IS NULL))) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_IMPORTVARFIN = QV.Get("NVSIEVFN0VI0", IDVariant.DECIMAL) ;
            v_IMPORTVARTOT = QV.Get("NULVASUVAIM0", IDVariant.DECIMAL) ;
          }
          QV.Close();
          v_IMPORTFINTOT = IDL.Add(v_IMPORTOFIN, v_IMPORTVARFIN);
          v_IMPORSUBITOT = IDL.Add(v_IMPORTSUBIMP, v_IMPORTVARTOT);
          // 
          // Se la variazione attuale non ha il finanziamento la
          // considero solo nel totale impegno, altrimenti non la
          // considero perché dovrei aggiungerla ad entrambe
          // 
          if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_FINANZIAMENTO, 0)))
          {
            v_IMPORSUBITOT = IDL.Sub(IDL.Add(v_IMPORSUBITOT, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_IMPORTO, 0)), IDL.NullValue(v_IMPORTOOLD,(new IDVariant(0))));
          }
          if (v_IMPORSUBITOT.compareTo(v_IMPORTFINTOT, true)>0)
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Totale Finanziamenti inferiore all'importo definitivo del sub-impegno.", IDVariant.STRING));
            if (MainFrm.CONTRFINIMPE.equals((new IDVariant("SI")), true))
            {
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
              return (new IDVariant(0)).booleanValue();
            }
            else
            {
              v_MESSNONBLOCC = IDL.Add(IDL.Add(v_MESSNONBLOCC, v_MESSAGGIO), (new IDVariant("<BR/>")));
            }
          }
        }
      }
      if (IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_IMPORTO, 0).compareTo((new IDVariant(0)), true)>0 && IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_IMPORTO, 0).compareTo(IDL.ToFloat(IDL.NullValue(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3),(new IDVariant("0")))), true)!=0)
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.SUBIMPDI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_IMP, 0), IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_IMP, 0), IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0), (new IDVariant()), (new IDVariant()), (new IDVariant()), v_IMPORTOOLD, IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_IMPORTO, 0), (new IDVariant()), (new IDVariant()), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return (new IDVariant(0)).booleanValue();
        }
      }
      MessaggioNonBloccante.set(new IDVariant(v_MESSNONBLOCC));
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "ControlliBloccantiENonBloccanti", _e);
      return false;
    }
  }

  // **********************************************************************
  // Setta Valori Nuova Variazione Da Elenco
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaValoriNuovaVariazioneDaElenco ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Nuova Variazione Da Elenco Body
      // Procedure Body
      // 
      if (PAN_VARIAZIONI.IsNewRow())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_CAPITOLO, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMECAPIT, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ARTICOLO, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEARTIC, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_IMP, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_IMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_IMP, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_IMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0));
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0),(new IDVariant(""))).equals((new IDVariant("")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMUNIPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNPRO, 0));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "SettaValoriNuovaVariazioneDaElenco", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori Se Inserimento Da Proposte Determine
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaValoriSeInserimentoDaProposteDetermine ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Se Inserimento Da Proposte Determine Body
      // Procedure Body
      // 
      if (PAN_VARIAZIONI.IsNewRow())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0),(new IDVariant(""))).equals((new IDVariant("")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMUNIPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNPRO, 0));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "SettaValoriSeInserimentoDaProposteDetermine", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Nuova Riga Da Var Sub
  // **********************************************************************
  public int ProponiNuovaRigaDaVarSub ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Nuova Riga Da Var Sub Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_RONANUVADAEL, 0).equals((new IDVariant("SI")), true))
      {
        SettaValoriNuovaVariazioneDaElenco();
      }
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_RONANUVADAPR, 0).equals((new IDVariant("SI")), true))
      {
        SettaValoriSeInserimentoDaProposteDetermine();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "ProponiNuovaRigaDaVarSub", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Inserisci
  // **********************************************************************
  public int Inserisci ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inserisci Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_INSERT);
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, 0),(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, 0),(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0)
        {
          IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
          v_FINANZIAMENT = MainFrm.ContaSubimpfin(IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0));
          if (v_FINANZIAMENT.compareTo((new IDVariant(-1)), true)!=0)
          {
            IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
          }
        }
      }
      ProponiNuovaRigaDaVarSub();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioniSubimp", "Inserisci", _e);
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
  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIONI_SELEZIDELIBE)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_SELEZIPROPOS)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFODELIBER2)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPROPOST1)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFODELIBER1)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_SELEZISUBIMP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOFINANZIA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAZIONI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARSUB7, IMDBDef13.PQSL_VARSUB7_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "80082289-EBC7-47D9-B4CD-E8160C6FCD35");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "Provvedimento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.PANEL_FORM, 20, 131, 628, 57, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0, 87);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 51);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, "EE00369B-27A3-4946-9135-6DDF276CD305");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, "Descrizione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE2, 6, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE2, 0, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, "0E171120-6D98-4278-BAD5-395474543020");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO3, 4, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO3, 1, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "79055FFB-0603-4B54-9506-518008096DC5");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 5, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 2, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "02BCD645-7273-41FF-B47D-948E552A76AF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 7, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 3, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, "FAEF1207-DF8E-4923-BA91-7CACE92D2E3A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, "Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, "Sede del");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA2, 8, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA2, 4, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, "250E3D00-DDEC-4E64-9170-37D3BC1DD930");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, "NUMERO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL2, 9, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL2, 5, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, "C9429412-000B-4A6B-BC5F-103F39DD0FE9");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, "ANNO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL2, 10, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL2, 6, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, "D2DA8104-DD2F-4898-9A59-01550666F559");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, "Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA2, 11, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA2, 7, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, "8C96E4A9-4465-4BEC-8787-E8474361EC6F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, "NUMERO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPO2, 12, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPO2, 8, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, "2B6982A3-D6BE-45E9-8250-E987CF25B740");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, "ANNO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOST2, 13, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOST2, 9, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, "D6F2F7BA-3FDC-402E-AD52-1D58EEF7F12A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO2, 19, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO2, 10, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "2ECE6393-1571-4909-9F8C-F0A7D733D122");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 20, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 11, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "3111C4DB-14EE-4EDB-BC56-C966A6D3AC31");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 21, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 12, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "1F03C411-0365-4D82-B530-6E074D03FAD5");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 22, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 13, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, "8EA3DE0F-EAE9-451E-AE79-4AB7B7B502B2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIDELIBE, 23, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIDELIBE, 14, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, "64D19B0F-476E-4CB6-B7C6-F05C9608BCCF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIPROPOS, 24, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIPROPOS, 15, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, "5372A175-AC91-4E70-8BEC-63AD1505C87A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBER2, 25, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBER2, 16, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, "1666114F-EFD0-4FE3-ABBF-C6175F0BCC5D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOST1, 26, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOST1, 17, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, "1D73B6DD-0577-492D-B0A9-4D5B48B64BDE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBER1, 27, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBER1, 18, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "5EB19F57-B9AA-42FC-934E-1AB284CB4AD7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 28, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 19, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "3D289564-1AD7-45E2-8D02-DE2DB69204C4");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "Info Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "Informazioni Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 29, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 20, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "215AF6A3-785C-4D73-AACB-695F11006903");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 30, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 21, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "C281C86A-4E4C-4886-AE38-659223766500");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "Info Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "Informazioni Proposta");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOSTA, 31, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOSTA, 22, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "4639841D-348E-4796-ACF3-16F47DB744AF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZIAMENT, 15, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZIAMENT, 23, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "24828128-365A-4CB7-AC8F-B0225AE047FA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 14, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 43, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "A998889B-F07A-45DB-AB9E-4A00C2A7CFD2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "Anno Entrata");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRATA, 44, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRATA, 44, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "4E635EF2-755E-44D3-87E5-57F9BC30DA19");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "ddd");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.VIS_CAMPTOTADISA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 32, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 24, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "5C83A51D-83CE-4C3F-BF63-792EE6DDDDBE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "COD REC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, 0, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 45, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 45, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "516E81BE-B43A-449A-A90B-DC7D4C0E0327");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "ANNO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 16, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 25, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, "2F9393AA-8DF6-43E9-9F91-3E8E8D49A693");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, "ANNO IMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOIMP1, 17, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOIMP1, 26, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "B7D70D85-0F84-4522-8B0E-37A420A66744");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "NUMERO IMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROIMP, 18, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROIMP, 27, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "850ECF05-8563-45AE-A48F-455DFD4482CF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "CAPITOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 2, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 28, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "A2A2BC6C-C23A-4765-9075-C4CF488A31D3");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "ARTICOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "Articolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 3, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 29, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, "72AFE524-1C22-4C84-9E13-CA4A2786F9F1");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, "Anno Sub Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOSUBIMP, 1, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOSUBIMP, 30, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, "7768B975-0883-42FE-B09E-27CF3D63CDE1");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, "Numero Sub Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROSUBIMP, 0, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROSUBIMP, 31, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, "C4986FB4-BB22-4E75-AC4E-1BCD4C1566BF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZISUBIMP, 43, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZISUBIMP, 42, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, "0C56F987-DED5-473A-8BF6-069739EC7FDB");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, "Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELDELIBER, 33, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELDELIBER, 32, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, "1BFC17A4-A3B8-4BC5-9859-932F6801A8DF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, "Proposta");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELPROPOST, 34, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELPROPOST, 33, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, "E002F6E9-68DA-45D3-BBD0-D76244750682");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.VIS_ETICHEGRASSE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMIMPEGN, 35, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMIMPEGN, 34, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, "A111E407-FB39-48A8-9279-31197C767DAA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, "Sub-impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SUBIMPEGNO, 36, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SUBIMPEGNO, 35, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "E5D2F04F-ABD0-4AB4-A30C-CB000DAAB856");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 37, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 36, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, "F03D0888-5111-4154-8DBD-0822F941FC25");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOSUBIMPEG, 38, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOSUBIMPEG, 37, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "568F7392-F6BE-47F5-A75F-9326F05EFDDD");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 39, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 38, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, "8CB54DB4-8D7E-472A-B925-1363FAA73DF6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA1, 41, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA1, 40, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, "7731EF7D-0E2C-43C4-9414-6CD26BF9A07D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, "Capitolo/Art.");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLOART, 40, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLOART, 39, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, "2C7287AB-9FAB-48A4-AB2D-D35159FBF922");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOFINANZIA, 42, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOFINANZIA, 41, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "CA8EA1DE-4376-419C-95B5-5A7BD0BCD058");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 46, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 46, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "E4DA24EF-3E09-442B-BAD0-1D4735944743");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 47, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 47, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "75229425-15CC-4BCB-AF20-FAD58F2B1A6C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 48, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 48, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "BA3AC6FF-C716-470D-B020-6061785D00FE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 49, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 49, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "7A059951-1BB2-48E2-B327-A785E9CFA7B9");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 50, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 50, MyGlb.PANEL_LIST);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_LIST, 0, 72, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_FORM, 28, 60, 560, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE2, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE2, PPQRY_VARSUB7, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, 396, 72, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, 48, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO3, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO3, PPQRY_VARSUB7, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 480, 72, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 456, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATA, PPQRY_VARSUB7, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 576, 72, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 8, 96, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVARIAZIO, PPQRY_VARSUB7, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, 4, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, "Delibera");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, 48, 156, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DELIBERA2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DELIBERA2, PPQRY_VARSUB7, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 132, 292, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 172, 156, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMERODEL2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMERODEL2, PPQRY_VARSUB7, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 200, 292, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 240, 156, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNODEL2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNODEL2, PPQRY_VARSUB7, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_LIST, 300, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_LIST, "Prop.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_FORM, 316, 156, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA2, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROPOSTA2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROPOSTA2, PPQRY_VARSUB7, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, 424, 292, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, "NUM. PROPOSTA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, 508, 156, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROPROPO2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROPROPO2, PPQRY_VARSUB7, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, 492, 292, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, "ANN. PROPOSTA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, 572, 156, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOPROPOST2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOPROPOST2, PPQRY_VARSUB7, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 116, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 488, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO2, -1, "", "TRATTINO2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 188, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 552, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA2, -1, "", "BARRA2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 476, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 220, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA3, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA3, -1, "", "BARRA3", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 412, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 152, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO1, -1, "", "TRATTINO1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 252, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_FORM, 276, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SELEZIDELIBE, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SELEZIDELIBE, -1, "", "SELEZIDELIBE", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_LIST, 548, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_FORM, 608, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SELEZIPROPOS, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SELEZIPROPOS, -1, "", "SELEZIPROPOS", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_LIST, 272, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_FORM, 296, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELIBER2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELIBER2, -1, "", "INFODELIBER2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 564, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 628, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPROPOST1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPROPOST1, -1, "", "INFOPROPOST1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, MyGlb.PANEL_LIST, 280, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, MyGlb.PANEL_FORM, 24, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBER1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELIBER1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELIBER1, -1, "", "INFODELIBER1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 708, 72, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 4, 688, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DELIBERA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DELIBERA, PPQRY_DEL, "A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL )", "DELDELIBERA", 5, 459, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 848, 72, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 28);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, "I. Dl.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 4, 204, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 28);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, "Inf. Del.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELIBERA, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFODELIBERA, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELIBERA, PPQRY_VARSUB7, "DECODE(A.SEDE_DEL, NULL, NULL, 'E')", "VARSINFODELI", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFODELIBERA, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFODELIBERA, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 872, 72, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 4, 688, 540, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROPOSTA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROPOSTA, PPQRY_PROPOSTE, "A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO ) || ' / ' || TO_CHAR ( A.ANNO )", "PROPOSPROPOS", 5, 212, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 1092, 72, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, "I. Pr.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 4, 204, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, "Info Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPROPOSTA, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFOPROPOSTA, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPROPOSTA, PPQRY_VARSUB7, "DECODE(A.UNITA_PROPONENTE, NULL, NULL, 'E')", "VARSINFOPROP", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOPROPOSTA, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOPROPOSTA, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1116, 72, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 12, 224, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZIAMENT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZIAMENT, PPQRY_VARSUB7, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1380, 72, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 8, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBIL, PPQRY_VARSUB7, "A.ANNO_ESIGIBILITA", "ANNO_ESIGIBILITA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 1452, 72, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 152, 196, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOENTRATA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOENTRATA, PPQRY_VARSUB7, "A.ANNO_ENTRATA", "ANNO_ENTRATA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 396, 240, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_FORM, 372, 212, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPOTOTAVARI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPOTOTAVARI, -1, "", "IMPOTOTAVARI", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_LIST, "COD REC");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, 4, 204, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.PANEL_FORM, "COD REC");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODREC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODREC, PPQRY_VARSUB7, "A.COD_REC", "COD_REC", 1, 1, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 476, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, "ANNO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 624, 12, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, "ANN. VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOVAR, PPQRY_VARSUB7, "A.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_LIST, 536, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_FORM, 624, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP1, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOIMP1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOIMP1, PPQRY_VARSUB7, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 596, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 624, 60, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROIMP, PPQRY_VARSUB7, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 740, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 436, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, PPQRY_VARSUB7, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 800, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 556, 4, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARSUB7, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANNO SUBIMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 172, 4, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOSUBIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOSUBIMP, PPQRY_VARSUB7, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 108, 4, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUMERO SUBIMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROSUBIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROSUBIMP, PPQRY_VARSUB7, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, MyGlb.PANEL_LIST, 260, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, MyGlb.PANEL_FORM, 236, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZISUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SELEZISUBIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SELEZISUBIMP, -1, "", "SELEZISUBIMP", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 708, 36, 164, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 712, 216, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELDELIBER, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 872, 36, 244, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 720, 224, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELPROPOST, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0, 4, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 0, 0, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESTREMIMPEGN, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESTREMIMPEGN, -1, "", "ESTREMIMPEGN", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 4, 8, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 24, 4, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SUBIMPEGNO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SUBIMPEGNO, -1, "", "SUBIMPEGNO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 152, 8, 24, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 152, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 204, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 216, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOSUBIMPEG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOSUBIMPEG, -1, "", "INFOSUBIMPEG", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 212, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 592, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPEG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPEG, -1, "", "INFOPEG", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 160, 16, 24, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 536, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA1, -1, "", "BARRA1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 12, 16, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 348, 4, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLOART, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 220, 20, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_FORM, 592, 228, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOFINANZIA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOFINANZIA, -1, "", "INFOFINANZIA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 224, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARSUB7, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 224, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTEINSERI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTEINSERI, PPQRY_VARSUB7, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 248, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAINSERIME, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAINSERIME, PPQRY_VARSUB7, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 272, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTULTIAGG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTULTIAGG, PPQRY_VARSUB7, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 296, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAULTIMAGG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAULTIMAGG, PPQRY_VARSUB7, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL ) as DELDELIBERA ");
    SQL.append("from ");
    SQL.append("  DEL A ");
    SQL.append("where (A.ANNO_DEL = ~~ANNO_DEL~~) ");
    SQL.append("and   (A.NUMERO_DEL = ~~NUMERO_DEL~~) ");
    SQL.append("and   (A.SEDE_DEL = ~~SEDE_DEL~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DEL, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DEL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_DEL, "DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.UNITA_PROPONENTE || ' - ' || TO_CHAR ( A.NUMERO ) || ' / ' || TO_CHAR ( A.ANNO ) as PROPOSPROPOS ");
    SQL.append("from ");
    SQL.append("  PROPOSTE A ");
    SQL.append("where (A.ANNO = ~~ANNO_PROPOSTA~~) ");
    SQL.append("and   (A.UNITA_PROPONENTE = ~~UNITA_PROPONENTE~~) ");
    SQL.append("and   (A.NUMERO = ~~NUMERO_PROPOSTA~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_PROPOSTE, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_PROPOSTE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_PROPOSTE, "PROPOSTE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T55, 0, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T55, 1, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPSUBFINFIN, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as IMPFINESTFIN ");
    SQL.append("from ");
    SQL.append("  SUBIMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.ANNO_SUBIMP = ~~TBL_VARIAZIONI1.ROWNAMANSUIM~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~TBL_VARIAZIONI1.ROWNAMNUSUIM~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_IMPFIN1, 0, SQL, PFL_VARIAZIONI_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPSUBFINFIN, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as IMPFINESTFIN ");
    SQL.append("from ");
    SQL.append("  SUBIMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.ANNO_SUBIMP = ~~TBL_VARIAZIONI1.ROWNAMANSUIM~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~TBL_VARIAZIONI1.ROWNAMNUSUIM~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_IMPFIN1, 1, SQL, PFL_VARIAZIONI_FINANZIAMENT, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_IMPFIN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARSUB7", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "VARSUB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.COD_REC as COD_REC, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_ESIGIBILITA as ANNO_ESIGIBILITA, ");
    SQL.append("  DECODE(A.SEDE_DEL, NULL, NULL, 'E') as VARSINFODELI, ");
    SQL.append("  DECODE(A.UNITA_PROPONENTE, NULL, NULL, 'E') as VARSINFOPROP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ANNO_ENTRATA as ANNO_ENTRATA ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARSUB7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARSUB A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARSUB7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.NUMERO_SUBIMP = ~~TBL_VARIAZIONI1.ROWNAMNUSUIM~~) ");
    SQL.append("and   (A.ANNO_SUBIMP = ~~TBL_VARIAZIONI1.ROWNAMANSUIM~~) ");
    SQL.append("and   (A.ANNO_VAR = DECODE(~~TBL_VARIAZIONI1.ROWNAMEIMPEG~~, 'INFO', A.ANNO_VAR, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.PROGRESSIVO > 0) ");
    SQL.append("and   (~~TBL_VARIAZIONI1.ROWNAMCONPRO~~ = 'NO' OR (~~TBL_VARIAZIONI1.ROWNAMCONPRO~~ = 'SI' AND A.PROGRESSIVO = ~~TBL_VARIAZIONI1.ROWNAMEPROGR~~)) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARSUB7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARSUB7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARSUB7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARSUB7, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARSUB7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARSUB");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_DATA, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnChangeLayout(NewLayout, Cancel);
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnChangeRow();
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_AfterUpdate();
  }

  public void AfterBlobUpdate(IDPanel SrcObj, IDVariant Column, IDVariant Size, IDVariant Extension)
  {
  }
  
  public void AfterDelete(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
