// **********************************************
// Variazioni Acc
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniAcc extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAZIONI_PROVVEDIMENT = 0;
  private static int GRP_VARIAZIONI_INSERIMENTO = 1;
  private static int GRP_VARIAZIONI_AGGIORNAMENT = 2;

  private static int PFL_VARIAZIONI_DESCRIZIONE = 0;
  private static int PFL_VARIAZIONI_IMPORTO = 1;
  private static int PFL_VARIAZIONI_DATA = 2;
  private static int PFL_VARIAZIONI_TIPOVARIAZIO = 3;
  private static int PFL_VARIAZIONI_DELIBERA2 = 4;
  private static int PFL_VARIAZIONI_NUMERODEL2 = 5;
  private static int PFL_VARIAZIONI_ANNODEL2 = 6;
  private static int PFL_VARIAZIONI_PROPOSTA1 = 7;
  private static int PFL_VARIAZIONI_NUMEROPROPO2 = 8;
  private static int PFL_VARIAZIONI_ANNOPROPOST2 = 9;
  private static int PFL_VARIAZIONI_TRATTINO = 10;
  private static int PFL_VARIAZIONI_BARRA3 = 11;
  private static int PFL_VARIAZIONI_BARRA4 = 12;
  private static int PFL_VARIAZIONI_TRATTINO1 = 13;
  private static int PFL_VARIAZIONI_SELEZIDELIBE = 14;
  private static int PFL_VARIAZIONI_SELEZIPROPOS = 15;
  private static int PFL_VARIAZIONI_INFODELIBERA = 16;
  private static int PFL_VARIAZIONI_INFOPROPOSTA = 17;
  private static int PFL_VARIAZIONI_LABELVUOTA = 18;
  private static int PFL_VARIAZIONI_DELIBERA = 19;
  private static int PFL_VARIAZIONI_PROPOSTA = 20;
  private static int PFL_VARIAZIONI_ANNOESIGIBIL = 21;
  private static int PFL_VARIAZIONI_OPERA = 22;
  private static int PFL_VARIAZIONI_TIPOAVANZO = 23;
  private static int PFL_VARIAZIONI_IMPOTOTAVARI = 24;
  private static int PFL_VARIAZIONI_CODREC = 25;
  private static int PFL_VARIAZIONI_ANNOVAR = 26;
  private static int PFL_VARIAZIONI_CAPITOLO = 27;
  private static int PFL_VARIAZIONI_ARTICOLO = 28;
  private static int PFL_VARIAZIONI_ANNOACC = 29;
  private static int PFL_VARIAZIONI_NUMEROACC = 30;
  private static int PFL_VARIAZIONI_SCELTAACCERT = 31;
  private static int PFL_VARIAZIONI_ESTREMACCERT = 32;
  private static int PFL_VARIAZIONI_ESTREMACCER1 = 33;
  private static int PFL_VARIAZIONI_BARRA = 34;
  private static int PFL_VARIAZIONI_BARRA2 = 35;
  private static int PFL_VARIAZIONI_INFOACCERTAM = 36;
  private static int PFL_VARIAZIONI_INFOPEG = 37;
  private static int PFL_VARIAZIONI_ACCCAPITOLO = 38;
  private static int PFL_VARIAZIONI_ACCARTICOLO = 39;
  private static int PFL_VARIAZIONI_CAPITOLOART = 40;
  private static int PFL_VARIAZIONI_INFOOPERA = 41;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 42;
  private static int PFL_VARIAZIONI_UTENTEINSERI = 43;
  private static int PFL_VARIAZIONI_DATAINSERIME = 44;
  private static int PFL_VARIAZIONI_UTENTULTIAGG = 45;
  private static int PFL_VARIAZIONI_DATAULTIMAGG = 46;
  private static int PFL_VARIAZIONI_GESTIOAVANZO = 47;

  private static int PPQRY_VARACC = 0;

  private static int PPQRY_DEL = 1;
  private static int PPQRY_PROPOSTE = 2;
  private static int PPQRY_ACC = 3;
  private static int PPQRY_T55 = 4;

  private static int PPQRY_T56 = 5;
  private static int PPQRY_ACCOPE = 6;
  private static int PPQRY_TIPIAVANZO = 7;
  private static int PPQRY_DUAL1 = 8;
  private static int PPQRY_DUAL = 9;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables
  private IDVariant CFPEGATTIVO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VARIAZIONI2(IMDB);
    //
    //
    Init_PQRY_VARACC(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VARIAZIONI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VARIAZIONI2, 21);
    IMDB.set_TblCode(IMDBDef4.TBL_VARIAZIONI2, "TBL_VARIAZIONI2");
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROVAR, "ROWNAMPROVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROVAR,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMDESACC, "ROWNAMDESACC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMDESACC,5,250,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROACC, "ROWNAMPROACC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROACC,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_RONAPRACIDOL, "RONAPRACIDOL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_RONAPRACIDOL,5,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMFINACC, "ROWNAMFINACC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMFINACC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMTIPFOR, "ROWNAMTIPFOR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMTIPFOR,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROGR,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMCONPRO, "ROWNAMCONPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMCONPRO,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMINFUPD, "ROWNAMINFUPD");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMINFUPD,5,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMOBIACC, "ROWNAMOBIACC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMOBIACC,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_RONANUVADAEL, "RONANUVADAEL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_RONANUVADAEL,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_RONANUVADAPR, "RONANUVADAPR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_RONANUVADAPR,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROUO, "ROWNAMEPROUO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMANACPR, "ROWNAMANACPR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI2,IMDBDef4.FLD_VARIAZIONI2_ROWNAMANACPR,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_VARIAZIONI2, 0);
  }

  private static void Init_PQRY_VARACC(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_VARACC, 24);
    IMDB.set_TblCode(IMDBDef14.PQRY_VARACC, "PQRY_VARACC");
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARACC,IMDBDef14.PQSL_VARACC_TIPO_AVANZO,3,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_VARACC, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniAcc(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniAcc()
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
    FormIdx = MyGlb.FRM_VARIAZIONACC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "ECC1692C-F4FF-43DA-AC8D-CB56D7D2587B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 450;
    set_Caption(new IDVariant("Variazioni Acc"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 800;
    Frames[1].Height = 424;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 424;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 424-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C299E91A-CE44-48E8-9744-893D375145B3");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 28, 1392, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
      if (CmdIdx==MyGlb.CMD_NUOVO10+BaseCmdLinIdx)
      {
        Inserisci();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA26+BaseCmdLinIdx)
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
    if (CallerIdx == MyGlb.FRM_SCELTACCERUT && flRis && IdxPanelActived == PAN_VARIAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIONI_SCELTAACCERT) {
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
    return (obj instanceof VariazioniAcc);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniAcc.class.getName() : (Glb.ClassWithPackage(VariazioniAcc.class) ? VariazioniAcc.class.getName().substring(VariazioniAcc.class.getPackage().getName().length() + 1) : VariazioniAcc.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Selezione Delibera
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
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "SelezioneDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibera
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "InfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposta
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
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "SelezioneProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "InfoProposta", _e);
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
      v_SOMMA = PAN_VARIAZIONI.GetFieldSum(PFL_VARIAZIONI_IMPORTO);
      if (v_SOMMA.compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPOTOTAVARI,new IDVariant(MyGlb.VIS_CAMTOTDISROS).intValue()); 
      }
      else
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPOTOTAVARI,new IDVariant(MyGlb.VIS_CAMPTOTADISA).intValue()); 
      }
      PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_IMPOTOTAVARI, IDL.ToString(v_SOMMA).stringValue());
      IMDB.set_Value(IMDBDef7.TBL_AGGIOSUATTIV, IMDBDef7.FLD_AGGIOSUATTIV_AGGAGGIOTOTA, 0, (new IDVariant("SI")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "CalcolaTotaleVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI21, IMDBDef1.FLD_PARAMETRI21_PARAMOPERA, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_INFOSULLOPER, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "InfoOpera", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Accertamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Accertamento Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI345, IMDBDef1.FLD_PARAMETRI345_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI345, IMDBDef1.FLD_PARAMETRI345_ROWNAMPROUNI, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI345, IMDBDef1.FLD_PARAMETRI345_ROWNAMPROUNI, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0),IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROUO, 0)));
      }
      MainFrm.Show(MyGlb.FRM_SCELTACCERUT, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "SceltaAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Resetta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Resetta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Resetta Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONAPRACIDOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMDESACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROGR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMCONPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMINFUPD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONANUVADAEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONANUVADAPR, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "Resetta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Campi Se Info Update
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AbilitazioneCampiSeInfoUpdate ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Campi Se Info Update Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMINFUPD, 0).equals((new IDVariant("INFO")), true))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETVARI+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
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
        if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMEPROGR, 0))))
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
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETVARI+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONANUVADAPR, 0).equals((new IDVariant("SI")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "AbilitazioneCampiSeInfoUpdate", _e);
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
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Si desidera registrare ugualmente?", IDVariant.STRING));
            v_MESSAGGIO = IDL.Add(v_MESSAGGIO, v_AVVISO);
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
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "Salva", _e);
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
    IDVariant v_MESSNONBLOC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGMOVDI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPORTOOLD = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_CONSOLIDAOLD = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PROGETTIDOLD = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti E Non Bloccanti Body
      // Procedure Body
      // 
      v_MESSNONBLOC = (new IDVariant());
      v_MESSAGGMOVDI = (new IDVariant());
      if (MainFrm.FINANZIAMENT.equals((new IDVariant(-1)), true))
      {
        IDVariant v_IMPORTOACC = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTOOPERE = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTVARTOT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPOROPERTOT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_IMPORTVAROPE = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTACCTOT = new IDVariant(0,IDVariant.DECIMAL);
        v_NUMREC = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.IMPORTO as SUBACCACCORT ");
        SQL.append("from ");
        SQL.append("  ACC A ");
        SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTOACC = QV.Get("SUBACCACCORT", IDVariant.DECIMAL) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUACOPI0, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  ACC_OPE A ");
        SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTOOPERE = QV.Get("NUVASUACOPI0", IDVariant.DECIMAL) ;
          v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(DECODE(A.OPERA, to_number(NULL), 0, A.IMPORTO)), 0) as NVSIEVON0VI0, ");
        SQL.append("  NVL(SUM(A.IMPORTO), 0) as NULVASUVAIM0 ");
        SQL.append("from ");
        SQL.append("  VARACC A ");
        SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTVAROPE = QV.Get("NVSIEVON0VI0", IDVariant.DECIMAL) ;
          v_IMPORTVARTOT = QV.Get("NULVASUVAIM0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        if (v_NUMREC.compareTo((new IDVariant(0)), true)>0)
        {
          v_IMPOROPERTOT = IDL.Add(v_IMPORTOOPERE, v_IMPORTVAROPE);
          v_IMPORTACCTOT = IDL.Add(v_IMPORTOACC, v_IMPORTVARTOT);
          // 
          // Se la variazione attuale non ha l'opera la considero
          // solo nel totale accertamento
          //  altrimenti non la considero perché dovrei aggiungerla
          // ad entrambe
          // 
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0)))
          {
            v_IMPORTACCTOT = IDL.Sub(IDL.Add(v_IMPORTACCTOT, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0)), IDL.ToFloat(IDL.NullValue(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO),(new IDVariant("0")))));
          }
          if (v_IMPORTACCTOT.compareTo(IDL.NullValue(v_IMPOROPERTOT,(new IDVariant(0))), true)>0)
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Accertamento non completamente collegato all'opera.", IDVariant.STRING));
            v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
          }
        }
      }
      if (PAN_VARIAZIONI.IsNewRow())
      {
        v_IMPORTOOLD = (new IDVariant());
        v_CONSOLIDAOLD = (new IDVariant());
        v_PROGETTIDOLD = (new IDVariant());
        if (MainFrm.FINANZIAMENT.booleanValue())
        {
          if (MainFrm.TotaleRecordOpere(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0)).compareTo((new IDVariant(0)), true)>0 && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0)))
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Sono presenti previsioni di opera per l'accertamento. ", IDVariant.STRING));
            v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
          }
        }
      }
      else
      {
        v_IMPORTOOLD = new IDVariant(IDL.ToFloat(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO)),IDVariant.DECIMAL);
        v_CONSOLIDAOLD = (new IDVariant("C"));
        v_PROGETTIDOLD = IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONAPRACIDOL, 0);
      }
      if (MainFrm.Movdi((new IDVariant("VARACC")), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0), (new IDVariant()), ((IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))?(new IDVariant()):IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), (new IDVariant()), (new IDVariant()), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0), new IDVariant(IDL.ToFloat(IDL.NullValue(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO),(new IDVariant("0")))),IDVariant.DECIMAL), v_MESSAGGMOVDI).equals((new IDVariant(-1)), true))
      {
        return (new IDVariant(0)).booleanValue();
      }
      else
      {
        if (!(IDL.IsNull(v_MESSAGGMOVDI)))
        {
          v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGMOVDI), (new IDVariant("<BR/>")));
        }
      }
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMTIPFOR, 0).equals((new IDVariant("Accertamento")), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONAPRACIDOL, 0),(new IDVariant("N"))).compareTo((new IDVariant("N")), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROACC, 0),(new IDVariant("N"))).compareTo((new IDVariant("N")), true)!=0)
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROACC, 0))) && CFPEGATTIVO.booleanValue() && IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
          {
            MainFrm.Cf4armDBObject.POLCONTROLLODISPPROGOB(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(0)), IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMPROACC, 0), IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMOBIACC, 0),(new IDVariant(0))), (new IDVariant("E")), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0), IDL.NullValue(v_IMPORTOOLD,(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0),(new IDVariant(0))), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("X")), (new IDVariant("X")), (new IDVariant("X")), (new IDVariant("X")), (new IDVariant("VC")), (new IDVariant("P")));
          }
          // 
          // 
          // 
          // 
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(4)), (new IDVariant(6)));
            if (v_ERRORE.equals((new IDVariant("-20998")), true))
            {
              v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
            }
            else
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              return (new IDVariant(0)).booleanValue();
            }
          }
        }
        if (MainFrm.FINANZIAMENT.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMFINACC, 0))))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.ACCFINDI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMFINACC, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(4)), (new IDVariant(6)));
              if (v_ERRORE.equals((new IDVariant("-20998")), true))
              {
                IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
                v_MESSAGGIO = (new IDVariant("Attenzione! Accertamento superiore alla disponibilità del Finanziamento.", IDVariant.STRING));
                v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
              }
            }
          }
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0))))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.ACCOPEDI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMFINACC, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(4)), (new IDVariant(6)));
              if (v_ERRORE.equals((new IDVariant("-20998")), true))
              {
                v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
              }
              else
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                return (new IDVariant(0)).booleanValue();
              }
            }
          }
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANACPR, 0)))
        {
          IDVariant v_ESITO = new IDVariant(0,IDVariant.STRING);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.CONTROLLOACCPURODI(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0), v_ESITO);
          if (IDL.NullValue(v_ESITO,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_ESITO), (new IDVariant("<BR/>")));
          }
        }
      }
      MessaggioNonBloccante.set(new IDVariant(v_MESSNONBLOC));
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "ControlliBloccantiENonBloccanti", _e);
      return false;
    }
  }

  // **********************************************************************
  // Conta Acc Ope
  // Anno Acc:  - Input
  // Numero Acc:  - Input
  // Opera:  - Input/Output
  // **********************************************************************
  public IDVariant ContaAccOpe (IDVariant AnnoAcc, IDVariant NumeroAcc, IDVariant Opera)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Conta Acc Ope Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(A.OPERA) as MINACCOPEOPE ");
      SQL.append("from ");
      SQL.append("  ACC_OPE A ");
      SQL.append("where (A.ANNO_ACC = " + IDL.CSql(AnnoAcc, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(NumeroAcc, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_OPERA = QV.Get("MINACCOPEOPE", IDVariant.INTEGER) ;
      }
      QV.Close();
      Opera.set(new IDVariant(v_OPERA));
      return v_NUMREC;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "ContaAccOpe", _e);
      return new IDVariant();
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
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMUNIPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNPRO, 0));
        }
      }
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "SettaValoriSeInserimentoDaProposteDetermine", _e);
      return -1;
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
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMECAPIT, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMEARTIC, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMUNIPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNPRO, 0));
        }
      }
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "SettaValoriNuovaVariazioneDaElenco", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Nuova Riga Var Acc
  // **********************************************************************
  public int ProponiNuovaRigaVarAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Nuova Riga Var Acc Body
      // Corpo Procedura
      // 
      // 
      // 
      // 
      // 
      if (PAN_VARIAZIONI.IsNewRow() && (new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(1)), true))
      {
        IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
        if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0))))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0));
            IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0));
          }
          if (MainFrm.FINANZIAMENT.booleanValue())
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0))))
            {
              if (ContaAccOpe(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0), v_OPERA).equals((new IDVariant(1)), true))
              {
                IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0, new IDVariant(v_OPERA));
              }
            }
          }
        }
      }
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONANUVADAPR, 0).equals((new IDVariant("SI")), true))
      {
        SettaValoriSeInserimentoDaProposteDetermine();
      }
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_RONANUVADAEL, 0).equals((new IDVariant("SI")), true))
      {
        SettaValoriNuovaVariazioneDaElenco();
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "ProponiNuovaRigaVarAcc", _e);
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
      ProponiNuovaRigaVarAcc();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "Inserisci", _e);
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
    IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP5 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP6 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP7 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIP = (new IDVariant("Informazioni Accertamento", IDVariant.STRING));
      v_TOOLTIP2 = (new IDVariant("Informazioni Voce di Bilancio", IDVariant.STRING));
      v_TOOLTIP3 = (new IDVariant("Selezione Delibera", IDVariant.STRING));
      v_TOOLTIP5 = (new IDVariant("Informazioni Delibera", IDVariant.STRING));
      v_TOOLTIP6 = (new IDVariant("Informazioni Proposta", IDVariant.STRING));
      v_TOOLTIP7 = (new IDVariant("Informazioni Opera", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Accertamento : ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add((new IDVariant("Variazioni")), MainFrm.ESERCIZIO));
      AutoSaveType = (new IDVariant("DENY")).stringValue();
      PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ESTREMACCERT, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMDESACC, 0)).stringValue());
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOACCERTAM,v_TOOLTIP.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPEG,v_TOOLTIP2.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_SELEZIDELIBE,v_TOOLTIP3.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_SELEZIPROPOS,v_TOOLTIP3.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFODELIBERA,v_TOOLTIP5.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPROPOSTA,v_TOOLTIP6.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOOPERA,v_TOOLTIP7.stringValue()); 
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMCONPRO, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMCONPRO, 0, (new IDVariant("NO")));
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO10+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      }
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      CFPEGATTIVO = MainFrm.CfpegAttivo();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACCERUT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_VISTAACCUOU3, IMDBDef7.PQSL_VISTAACCUOU3_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_VISTAACCUOU3, IMDBDef7.PQSL_VISTAACCUOU3_NUMERO_ACC, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "EndModalEvent", _e);
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
      Resetta();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "UnloadEvent", _e);
    }
  }

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
    IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Event Body
      // Procedure Body
      // 
      v_CONFERMA = (new IDVariant(0));
      if (Command.equals((new IDVariant(8)), true) || Command.equals((new IDVariant(256)), true))
      {
        PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      }
      if (Command.equals((new IDVariant(16)), true) && IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMTIPFOR, 0).equals((new IDVariant("Accertamento")), true))
      {
        IDVariant v_MESSANONBLOC = new IDVariant(0,IDVariant.STRING);
        v_MESSANONBLOC = (new IDVariant());
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        // 
        // 
        // 
        // 
        if (MainFrm.FINANZIAMENT.booleanValue() && IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0).compareTo((new IDVariant(0)), true)<0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMFINACC, 0))))
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.ACCFINDI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMFINACC, 0), IDL.ToFloat(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO)), IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(4)), (new IDVariant(6)));
              if (v_ERRORE.equals((new IDVariant("-20998")), true))
              {
                IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
                v_MESSAGGIO = (new IDVariant("Attenzione! Accertamento superiore alla disponibilità del Finanziamento.", IDVariant.STRING));
                v_MESSANONBLOC = IDL.Add(IDL.Add(v_MESSANONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
              }
            }
          }
        }
        if (!(IDL.IsNull(v_MESSANONBLOC)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Si desidera registrare ugualmente?", IDVariant.STRING));
          v_MESSANONBLOC = IDL.Add(v_MESSANONBLOC, v_AVVISO);
          if (!(MainFrm.MessageConfirm(v_MESSANONBLOC)))
          {
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
      }
      if (Command.equals((new IDVariant(1)), true))
      {
        if ((new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(0)), true) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_PROGRESSIVO, 0)))
        {
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniOnCommandEvent", _e);
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
      AbilitazioneCampiSeInfoUpdate();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniAfterFindEvent", _e);
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
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniAfterDeleteEvent", _e);
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
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0))))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (PAN_VARIAZIONI.IsNewRow() && (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMNUMACC, 0))) || IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI2, IMDBDef4.FLD_VARIAZIONI2_ROWNAMANNACC, 0)))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_GESTIOAVANZO))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOVARIAZIO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOVARIAZIO))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOAVANZO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOAVANZO))).stringValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_IMPORTO, 0).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPORTO,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPORTO,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniOnDynamicPropertiesEvent", _e);
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
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniOnDatabaseErrorEvent", _e);
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
        AbilitazioneCampiSeInfoUpdate();
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA26+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        CalcolaTotaleVariazione();
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA26+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniOnChangeLayoutEvent", _e);
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
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniAfterUpdateEvent", _e);
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
    IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SEDEPROPOSTA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ANNOPROPOSTA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROPROPOS = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Attenzione! Descrizione superiore a 140 caratteri.", IDVariant.STRING));
      // 
      // Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_PROGRESSIVO, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_PROGRESSIVO, 0, (new IDVariant()));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_ACC, 0))))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_CAPITOLO, 0, IDL.ToCurrency((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_ACCCAPITOLO)))));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ARTICOLO, 0, IDL.ToInteger((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_ACCARTICOLO)))));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_VAR, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_VAR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_D_DATA_REG, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_D_DATA_REG, 0, MainFrm.Proponidatareginesercizio());
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_DELIBERA2)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_NUMERODEL2)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_ANNODEL2)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0))))
        {
          v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_PROPOSTA1)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_NUMEROPROPO2)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_ANNOPROPOST2)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0))))
        {
          v_SEDEPROPOSTA = IDL.Upper(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0));
          v_ANNOPROPOSTA = IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0);
          v_NUMEROPROPOS = IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0);
          MainFrm.ControlloProposte(v_SEDEPROPOSTA, v_ANNOPROPOSTA, v_NUMEROPROPOS);
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_UNITA_PROPONENTE, 0, new IDVariant(v_SEDEPROPOSTA));
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROPOSTA));
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROPOS));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_DESCRIZIONE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_DESCRIZIONE, 0))))
        {
          if (IDL.Length((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE)))).compareTo((new IDVariant(140)), true)>0)
          {
            MainFrm.set_AlertMessage(v_MESSAGGIO); 
            PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_DESCRIZIONE, IDL.SubStr((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))), (new IDVariant(1)), (new IDVariant(140))).stringValue());
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_TIPOVARIAZIO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_VT55GESTAVAN = null;
        v_VT55GESTAVAN = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(A.GESTIONE_AVANZO, 'NO') as NUVAT5GEAVNO ");
        SQL.append("from ");
        SQL.append("  T55 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_TIPO_VAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VT55GESTAVAN = QV.Get("NUVAT5GEAVNO", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_VT55GESTAVAN.equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_TIPO_AVANZO, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Opera Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_VARIAZIONI_OPERA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Opera Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARACC, IMDBDef14.PQSL_VARACC_OPERA, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniAcc", "VariazioniOperaValidateEvent", _e);
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
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

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
    if (ColIndex.intValue() == PFL_VARIAZIONI_LABELVUOTA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_SCELTAACCERT)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOOPERA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoOpera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAZIONI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_VARIAZIONI_OPERA)
      {
        PFL_VARIAZIONI_OPERA_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
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
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "E29ACD5B-F3EB-4868-B23A-B3B0E682FC28");
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
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "84648E5E-5E2E-4D46-9255-897126EA8A7E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "Inserimento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.PANEL_FORM, 92, 299, 272, 49, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0, 70);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "7287F354-3EF9-49FD-9F7F-01C2E2EA8A7A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "Aggiornamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.PANEL_FORM, 400, 299, 272, 49, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0, 88);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 48);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "53B3810E-07D6-465C-94AF-FB1116D8C6F6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "Descrizione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE, 6, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE, 0, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "965961B7-1709-4064-8948-30E6A10C3A36");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO, 4, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO, 1, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "F8C33C5C-BDE2-42B2-B68B-71FDDEEF272C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 5, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 2, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "78DDB516-E9AF-4D28-8B76-E889EB0CB01C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 7, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 3, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, "289C0737-B63D-4243-B1E4-4F31FFACE92D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, "Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, "Sede del");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA2, 8, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA2, 4, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, "0E9EBE2E-2885-45F8-B785-209EE21A289A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, "NUMERO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL2, 9, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL2, 5, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, "6538688E-4AD5-449E-B62A-F503162E822D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, "ANNO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL2, 10, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL2, 6, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, "193DC655-0AC5-4737-A3EC-F3D6F88F956E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, "Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA1, 11, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA1, 7, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, "D1CF9720-1B0E-4A0E-9ED2-3EFBB5181FFD");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, "NUMERO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPO2, 12, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPO2, 8, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, "42763372-CCA2-4725-BC9C-4135680BB0FC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, "ANNO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOST2, 13, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOST2, 9, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, "7F844609-22F6-48D3-B205-F180E97A4CDF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO, 18, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO, 10, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "56B8AC69-56CA-46B1-A756-668BE2F79D39");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 19, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 11, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, "7516CD38-D566-4E0E-85B2-4A9B647332D5");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA4, 20, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA4, 12, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "8B3BAD49-1DF5-4ED2-A396-413B915D1FEC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 21, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 13, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, "6C713968-7411-4088-87EF-4939CE9A0D39");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIDELIBE, 22, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIDELIBE, 14, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, "D77434CE-BCDD-4613-B647-31AC604B8B82");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIPROPOS, 23, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIPROPOS, 15, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "98D8CD0E-50CF-463E-9A8C-4B7EA7C43105");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 24, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 16, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "291F15B0-7496-4B9F-8B2A-D7B8B7A3AC74");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOSTA, 25, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOSTA, 17, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, "E11AA677-5BE3-4112-9143-E8D41501B597");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELVUOTA, 26, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELVUOTA, 18, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "DEBB2ED5-90A5-406A-A941-AF20E0AE56C5");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 27, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 19, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "5E10160B-18B9-49FB-AE13-E287D8DEEF53");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 28, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 20, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "368FC8D8-F66C-49AE-AC4F-D12693B068F6");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 39, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 39, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, "CA95D61A-405C-44FE-9A77-7AAB60708838");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, "Opera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_OPERA, 14, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_OPERA, 21, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "F11D9F65-80BB-4036-B88B-272213CE476D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "Tipo Avanzo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOAVANZO, 44, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOAVANZO, 44, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "B5E1174F-BD9C-4CFC-A082-79E1D7C3559B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.VIS_CAMPTOTADISA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 29, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 22, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "26AD5CC4-25DA-433C-AC37-33D9A8B4822F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "COD REC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, 0, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 45, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 45, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "5CFAD3FC-BCDD-4DC6-A54F-D4F1EF5F3521");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "ANNO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 15, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 23, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "81969C92-48C7-41B3-858A-A21B8963833F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "CAPITOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 16, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 24, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "11CE4C9D-77C5-4FA8-9A08-390DE3775C9F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "ARTICOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "Articolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 17, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 25, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, "9D1BE0E2-CD52-4B63-9FE6-CB1249FEE797");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, "ANNO ACC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, "Anno Accertamento");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOACC, 1, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOACC, 26, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, "8183988B-FD65-48CE-AD34-258E9D9F3F7D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, "NUMERO ACC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, "Numero Accertamento");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROACC, 0, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROACC, 27, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, "570E0FF5-90C1-473B-B799-3C0D5255AA39");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SCELTAACCERT, 38, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SCELTAACCERT, 38, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, "9F2F8D9F-D2DB-44AC-A1FF-B5C55116111C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, MyGlb.VIS_ETICHEGRASSE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMACCERT, 30, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMACCERT, 28, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, "3F4993CA-573B-4D57-A4B4-1BBB3649B0F4");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, "Accertamento");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMACCER1, 31, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMACCER1, 29, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "7B8ED838-614D-4533-A38E-AB83029BFE1C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 32, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 30, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "178AB45C-F6C9-4F27-8FA6-204229EA3BCC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 33, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 31, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, "B666AFB7-562C-413F-87C4-C976B4B78601");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOACCERTAM, 34, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOACCERTAM, 32, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "40B7C9F7-D0FD-46A8-9208-25B1961F53CE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 35, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 33, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, "D9D9CBC8-DF96-40BC-A863-AB67733E1103");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, "ACC CAPITOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_VERTICAL | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ACCCAPITOLO, 2, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ACCCAPITOLO, 34, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, "02ACCCA5-17D2-46D5-A471-AF2896711874");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, "ACC ARTICOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ACCARTICOLO, 3, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ACCARTICOLO, 35, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, "E19EF289-1B59-4BD1-9C3E-98B888681DA8");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, "Capitolo/Art.");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLOART, 36, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLOART, 36, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, "A093AFF8-9390-4AA3-8C49-E8B802AEEBBA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOOPERA, 37, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOOPERA, 37, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "EACC3885-E354-463F-B558-902058D96C55");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 46, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 46, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "78CF9942-323B-40CA-AD07-3D38B4A42368");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "Utente");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 40, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 40, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "3D5D6164-A605-49AB-A8DF-7B8BD55090BF");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 41, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 41, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "7CD7E616-A5BB-4489-8608-76EC99F17BA8");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "Utente");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 42, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 42, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "B15F64CC-394E-4753-A8B7-3EDBDCBFC629");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 43, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 43, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, "712251D0-668A-4FA2-AEC7-CCF3FBB89FAE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, "GESTIONE AVANZO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_GESTIOAVANZO, 47, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_GESTIOAVANZO, 47, MyGlb.PANEL_LIST);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 64, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 60, 540, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE, PPQRY_VARACC, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 264, 64, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 44, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_VARACC, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 372, 64, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 424, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATA, PPQRY_VARACC, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 452, 64, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 96, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVARIAZIO, PPQRY_VARACC, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, 4, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_LIST, "Delibera");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, 44, 156, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA2, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DELIBERA2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DELIBERA2, PPQRY_VARACC, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 132, 292, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 168, 156, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL2, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMERODEL2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMERODEL2, PPQRY_VARACC, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 200, 292, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 236, 156, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL2, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNODEL2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNODEL2, PPQRY_VARACC, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_LIST, 300, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_LIST, "Prop.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_FORM, 312, 156, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA1, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROPOSTA1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROPOSTA1, PPQRY_VARACC, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, 424, 292, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_LIST, "NUM. PROPOSTA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, 508, 156, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPO2, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROPROPO2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROPROPO2, PPQRY_VARACC, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, 492, 292, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_LIST, "ANN. PROPOSTA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, 572, 156, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOST2, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOPROPOST2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOPROPOST2, PPQRY_VARACC, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, MyGlb.PANEL_LIST, 116, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, MyGlb.PANEL_FORM, 488, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 188, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 552, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA3, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA3, -1, "", "BARRA3", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, MyGlb.PANEL_LIST, 476, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, MyGlb.PANEL_FORM, 216, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA4, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA4, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA4, -1, "", "BARRA4", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 412, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 148, 156, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO1, -1, "", "TRATTINO1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 252, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_FORM, 272, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 272, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 292, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELIBERA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 564, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 628, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPROPOSTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 280, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 24, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELVUOTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELVUOTA, -1, "", "LABELVUOTA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 584, 64, 112, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 4, 688, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DELIBERA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DELIBERA, PPQRY_DEL, "A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL )", "DELDELIBERA", 5, 459, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 696, 64, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 4, 688, 540, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROPOSTA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROPOSTA, PPQRY_PROPOSTE, "CASE WHEN NOT ((~~UNITA_PROPONENTE~~ IS NULL)) THEN ~~UNITA_PROPONENTE~~ || ' - ' || TO_CHAR ( ~~NUMERO_PROPOSTA~~ ) || ' / ' || TO_CHAR ( ~~ANNO_PROPOSTA~~ ) ELSE '' END", "PROPOSPROPOS", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1128, 64, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBIL, PPQRY_VARACC, "A.ANNO_ESIGIBILITA", "ANNO_ESIGIBILITA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, 908, 64, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, 52, 220, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OPERA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OPERA, PPQRY_VARACC, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 1192, 64, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 16, 244, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOAVANZO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOAVANZO, PPQRY_VARACC, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 264, 232, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODREC, PPQRY_VARACC, "A.COD_REC", "COD_REC", 1, 1, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 476, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, "ANNO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 652, 12, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, "ANN. VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOVAR, PPQRY_VARACC, "A.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 740, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 692, 76, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, PPQRY_VARACC, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 800, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 692, 104, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARACC, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, 176, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOACC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOACC, PPQRY_VARACC, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_LIST, "NUMERO ACC");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 104, 8, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROACC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROACC, PPQRY_VARACC, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, MyGlb.PANEL_LIST, 260, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, MyGlb.PANEL_FORM, 240, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAACCERT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SCELTAACCERT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SCELTAACCERT, -1, "", "SCELTAACCERT", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, MyGlb.PANEL_LIST, 0, 0, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, MyGlb.PANEL_FORM, 0, 0, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCERT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESTREMACCERT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESTREMACCERT, -1, "", "ESTREMACCERT", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, MyGlb.PANEL_LIST, 12, 8, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, MyGlb.PANEL_FORM, 12, 8, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMACCER1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESTREMACCER1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESTREMACCER1, -1, "", "ESTREMACCER1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 156, 8, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 156, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 172, 24, 16, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 504, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA2, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA2, -1, "", "BARRA2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, MyGlb.PANEL_LIST, 224, 8, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, MyGlb.PANEL_FORM, 220, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOACCERTAM, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOACCERTAM, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOACCERTAM, -1, "", "INFOACCERTAM", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 232, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 568, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPEG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPEG, -1, "", "INFOPEG", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_LIST, "ACC CAPITOLO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_FORM, 400, 8, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCCAPITOLO, MyGlb.PANEL_FORM, "ACC CAPIT.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ACCCAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ACCCAPITOLO, PPQRY_ACC, "A.CAPITOLO", "ACCCAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_LIST, "ACC ARTICOLO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_FORM, 524, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ACCARTICOLO, MyGlb.PANEL_FORM, "ACC ARTIC.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ACCARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ACCARTICOLO, PPQRY_ACC, "A.ARTICOLO", "ACCARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 20, 16, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 308, 8, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLOART, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLOART, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, MyGlb.PANEL_LIST, 572, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, MyGlb.PANEL_FORM, 568, 224, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOOPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOOPERA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOOPERA, -1, "", "INFOOPERA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARACC, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 96, 324, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTEINSERI, -1, GRP_VARIAZIONI_INSERIMENTO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTEINSERI, PPQRY_VARACC, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 236, 324, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAINSERIME, -1, GRP_VARIAZIONI_INSERIMENTO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAINSERIME, PPQRY_VARACC, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, "Utente");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 404, 324, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, "Utente");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTULTIAGG, -1, GRP_VARIAZIONI_AGGIORNAMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTULTIAGG, PPQRY_VARACC, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 544, 324, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAULTIMAGG, -1, GRP_VARIAZIONI_AGGIORNAMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAULTIMAGG, PPQRY_VARACC, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_LIST, 1392, 64, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_LIST, "GESTIONE AVANZO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_FORM, 4, 348, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_GESTIOAVANZO, MyGlb.PANEL_FORM, "GESTIONE AVANZO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_GESTIOAVANZO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_GESTIOAVANZO, PPQRY_T55, "A.GESTIONE_AVANZO", "T55GESTIAVAN", 5, 2, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_GESTIOAVANZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_GESTIOAVANZO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 10);
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
    SQL.append("  CASE WHEN NOT ((~~UNITA_PROPONENTE~~ IS NULL)) THEN ~~UNITA_PROPONENTE~~ || ' - ' || TO_CHAR ( ~~NUMERO_PROPOSTA~~ ) || ' / ' || TO_CHAR ( ~~ANNO_PROPOSTA~~ ) ELSE '' END as PROPOSPROPOS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_PROPOSTE, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_PROPOSTE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_PROPOSTE, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as ACCCAPITOLO, ");
    SQL.append("  A.ARTICOLO as ACCARTICOLO ");
    SQL.append("from ");
    SQL.append("  ACC A ");
    SQL.append("where (A.ANNO_ACC = ~~ANNO_ACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~NUMERO_ACC~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_ACC, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.GESTIONE_AVANZO as T55GESTIAVAN ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T55, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_T55, "T56");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T56DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T56, 0, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T56DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T56, 1, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as ACCOPEOPERA, ");
    SQL.append("  LPAD(TO_CHAR ( A.OPERA ), 5, SUBSTR(' ', 1, 1)) || ' - ' || B.DESCRIZIONE as ACCOPECODDES ");
    SQL.append("from ");
    SQL.append("  ACC_OPE A, ");
    SQL.append("  OPERE B ");
    SQL.append("where (A.OPERA = ~~OPERA~~) ");
    SQL.append("and   (A.OPERA = B.CODICE) ");
    SQL.append("and   (A.ANNO_ACC = ~~TBL_VARIAZIONI2.ROWNAMANNACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~TBL_VARIAZIONI2.ROWNAMNUMACC~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_ACCOPE, 0, SQL, PFL_VARIAZIONI_OPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as ACCOPEOPERA, ");
    SQL.append("  LPAD(TO_CHAR ( A.OPERA ), 5, SUBSTR(' ', 1, 1)) || ' - ' || B.DESCRIZIONE as ACCOPECODDES ");
    SQL.append("from ");
    SQL.append("  ACC_OPE A, ");
    SQL.append("  OPERE B ");
    SQL.append("where (A.OPERA = B.CODICE) ");
    SQL.append("and   (A.ANNO_ACC = ~~TBL_VARIAZIONI2.ROWNAMANNACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~TBL_VARIAZIONI2.ROWNAMNUMACC~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_ACCOPE, 1, SQL, PFL_VARIAZIONI_OPERA, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_ACCOPE, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_VARIAZIONI_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_VARIAZIONI_TIPOAVANZO, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as VAUTINVAACV1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as VAUTINVAACVA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_VARIAZIONI_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as VAUTINVAACV1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as VAUTINVAACVA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_VARIAZIONI_UTENTEINSERI, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAUTULAGVAA1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as VAUTULAGVAAV ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_VARIAZIONI_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAUTULAGVAA1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as VAUTULAGVAAV ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_VARIAZIONI_UTENTULTIAGG, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARACC", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "VARACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COD_REC as COD_REC, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ANNO_ESIGIBILITA as ANNO_ESIGIBILITA, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARACC, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARACC A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARACC, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_ACC = ~~TBL_VARIAZIONI2.ROWNAMANNACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~TBL_VARIAZIONI2.ROWNAMNUMACC~~) ");
    SQL.append("and   (A.ANNO_VAR = ~~TBL_DATISESSIONE.SESSIOESERCI~~ OR ~~TBL_VARIAZIONI2.ROWNAMINFUPD~~ = 'INFO') ");
    SQL.append("and   (A.PROGRESSIVO > 0) ");
    SQL.append("and   (~~TBL_VARIAZIONI2.ROWNAMCONPRO~~ = 'NO' OR (~~TBL_VARIAZIONI2.ROWNAMCONPRO~~ = 'SI' AND A.PROGRESSIVO = ~~TBL_VARIAZIONI2.ROWNAMEPROGR~~)) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARACC, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARACC, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARACC, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARACC, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARACC");
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_AfterCommit(RowUpdated, RowError);
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
