// **********************************************
// Bozze Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BozzeVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BOZZE_ANCBOZASSAVA = 0;
  private static int PFL_BOZZE_ORDINAMENTO = 1;
  private static int PFL_BOZZE_BOZZA = 2;

  private static int PPQRY_PARS1 = 0;

  private static int PPQRY_POLBOZZEVARI = 1;


  IDPanel PAN_BOZZE;
  private static int GRP_BOZZEVARIAZI_VOCEPEG = 0;
  private static int GRP_BOZZEVARIAZI_IMPORTI = 1;

  private static int PFL_BOZZEVARIAZI_NOTA1 = 0;
  private static int PFL_BOZZEVARIAZI_NOTA2 = 1;
  private static int PFL_BOZZEVARIAZI_NOTA3 = 2;
  private static int PFL_BOZZEVARIAZI_NOTA4 = 3;
  private static int PFL_BOZZEVARIAZI_NOTA5 = 4;
  private static int PFL_BOZZEVARIAZI_STATO = 5;
  private static int PFL_BOZZEVARIAZI_ES = 6;
  private static int PFL_BOZZEVARIAZI_VOCEPEGLABEL = 7;
  private static int PFL_BOZZEVARIAZI_CAPITOLO1 = 8;
  private static int PFL_BOZZEVARIAZI_ARTICOLO1 = 9;
  private static int PFL_BOZZEVARIAZI_NUOVA = 10;
  private static int PFL_BOZZEVARIAZI_RISORSINTERV = 11;
  private static int PFL_BOZZEVARIAZI_CAPITOLO = 12;
  private static int PFL_BOZZEVARIAZI_ARTICOLO = 13;
  private static int PFL_BOZZEVARIAZI_TRATTINO = 14;
  private static int PFL_BOZZEVARIAZI_SLASH = 15;
  private static int PFL_BOZZEVARIAZI_APRIVOCEPEG = 16;
  private static int PFL_BOZZEVARIAZI_INFOVOCEPEG = 17;
  private static int PFL_BOZZEVARIAZI_VOCEPEGSMALL = 18;
  private static int PFL_BOZZEVARIAZI_CAPITOLOART = 19;
  private static int PFL_BOZZEVARIAZI_IMPORTO1 = 20;
  private static int PFL_BOZZEVARIAZI_IMPORTO2 = 21;
  private static int PFL_BOZZEVARIAZI_IMPORTO3 = 22;
  private static int PFL_BOZZEVARIAZI_NEWPANELLABE = 23;
  private static int PFL_BOZZEVARIAZI_PROPVARDETID = 24;
  private static int PFL_BOZZEVARIAZI_PROPOSTVARID = 25;
  private static int PFL_BOZZEVARIAZI_BOZZAVARIAID = 26;
  private static int PFL_BOZZEVARIAZI_UNITAORGANIZ = 27;
  private static int PFL_BOZZEVARIAZI_CONSSVIL = 28;
  private static int PFL_BOZZEVARIAZI_TIPOVAR = 29;
  private static int PFL_BOZZEVARIAZI_DESCRIZIONE1 = 30;
  private static int PFL_BOZZEVARIAZI_DESCRIZIONE = 31;
  private static int PFL_BOZZEVARIAZI_NOTE1 = 32;
  private static int PFL_BOZZEVARIAZI_VARBIL = 33;
  private static int PFL_BOZZEVARIAZI_UNITAORG = 34;
  private static int PFL_BOZZEVARIAZI_PROGETTO = 35;
  private static int PFL_BOZZEVARIAZI_OBIETTIVO = 36;
  private static int PFL_BOZZEVARIAZI_FATTORE = 37;
  private static int PFL_BOZZEVARIAZI_CENTRO = 38;
  private static int PFL_BOZZEVARIAZI_FINANZIAMENT = 39;
  private static int PFL_BOZZEVARIAZI_OPERA = 40;
  private static int PFL_BOZZEVARIAZI_VARIAZIONE = 41;
  private static int PFL_BOZZEVARIAZI_GENERATA = 42;
  private static int PFL_BOZZEVARIAZI_SCHEDOBIETID = 43;
  private static int PFL_BOZZEVARIAZI_VARIAZIONEID = 44;
  private static int PFL_BOZZEVARIAZI_ESLABEL = 45;

  private static int PPQRY_POLPROVARDE4 = 0;

  private static int PPQRY_POLSCHEDOBIE = 1;
  private static int PPQRY_POLVARBILPEG = 2;
  private static int PPQRY_DUAL = 3;

  private static int PPQRY_DUAL1 = 4;
  private static int PPQRY_VISTABILANUO = 5;
  private static int PPQRY_T54 = 6;


  IDPanel PAN_BOZZEVARIAZI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS3(IMDB);
    //
    //
    Init_PQRY_PARS1(IMDB);
    Init_PQRY_PARS1_RS(IMDB);
    Init_PQRY_POLPROVARDE4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS3, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS3, "TBL_PARS3");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_RONAANBOASAV, "RONAANBOASAV");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_RONAANBOASAV,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMEORDIN,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMEVISUA, "ROWNAMEVISUA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMEVISUA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMEBOZZA,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMCANINS, "ROWNAMCANINS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS3,IMDBDef3.FLD_PARS3_ROWNAMCANINS,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS3, 0);
  }

  private static void Init_PQRY_PARS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS1, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS1, "PQRY_PARS1");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS1,IMDBDef12.PQSL_PARS1_RONAANBOASAV, "RONAANBOASAV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS1,IMDBDef12.PQSL_PARS1_RONAANBOASAV,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS1,IMDBDef12.PQSL_PARS1_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS1,IMDBDef12.PQSL_PARS1_ROWNAMEORDIN,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS1,IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS1,IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA,1,10,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS1, 0);
  }

  private static void Init_PQRY_PARS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS1_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS1_RS, "PQRY_PARS1_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS1_RS,IMDBDef12.PQSL_PARS1_RONAANBOASAV, "RONAANBOASAV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS1_RS,IMDBDef12.PQSL_PARS1_RONAANBOASAV,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS1_RS,IMDBDef12.PQSL_PARS1_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS1_RS,IMDBDef12.PQSL_PARS1_ROWNAMEORDIN,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS1_RS,IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, "ROWNAMEBOZZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS1_RS,IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA,1,10,0);
  }

  private static void Init_PQRY_POLPROVARDE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLPROVARDE4, 33);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLPROVARDE4, "PQRY_POLPROVARDE4");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_1, "NOTA_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_1,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_2, "NOTA_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_2,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_3, "NOTA_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_3,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_4, "NOTA_4");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_4,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_5, "NOTA_5");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_NOTA_5,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_STATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_ISTITUZIONE_NC, "ISTITUZIONE_NC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_ISTITUZIONE_NC,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_DETT_ID, "PROPOSTA_VAR_DETT_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_DETT_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_ID, "PROPOSTA_VAR_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_BOZZA_VARIAZIONE_ID, "BOZZA_VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_BOZZA_VARIAZIONE_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORUNITORG, "RECORUNITORG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORUNITORG,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_CONS_SVILUPPO, "CONS_SVILUPPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_CONS_SVILUPPO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORDDESCRI,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORDNOTE, "RECORDNOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORDNOTE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_VAR_BIL, "VAR_BIL");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_VAR_BIL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_SCHEDA_OBIETTIVO_ID, "SCHEDA_OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_SCHEDA_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORDGENERA, "RECORDGENERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_RECORDGENERA,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_VARIAZIONE_ID, "VARIAZIONE_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_VARIAZIONE_ID,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLPROVARDE4,IMDBDef12.PQSL_POLPROVARDE4_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLPROVARDE4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BozzeVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public BozzeVariazione()
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
    FormIdx = MyGlb.FRM_BOZZEVARIAZI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "67E8EBD9-7D26-42F9-B1F5-21E6706D19FD";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 812;
    DesignHeight = 482;
    set_Caption(new IDVariant("Bozze Variazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 812;
    Frames[1].Height = 456;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.219298;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 812;
    Frames[2].Height = 100;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Bozze";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 100;
    PAN_BOZZE = new IDPanel(w, this, 2, "PAN_BOZZE");
    Frames[2].Content = PAN_BOZZE;
    PAN_BOZZE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BOZZE.VS = MainFrm.VisualStyleList;
    PAN_BOZZE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 100-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BOZZE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9543D10F-7003-44FB-92FF-89BDB7DBD1B1");
    PAN_BOZZE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 236, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BOZZE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOZZE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BOZZE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BOZZE.InitStatus = 2;
    PAN_BOZZE_Init();
    PAN_BOZZE_InitFields();
    PAN_BOZZE_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 812;
    Frames[3].Height = 356;
    Frames[3].Caption = "Bozze Variazione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 356;
    PAN_BOZZEVARIAZI = new IDPanel(w, this, 3, "PAN_BOZZEVARIAZI");
    Frames[3].Content = PAN_BOZZEVARIAZI;
    PAN_BOZZEVARIAZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BOZZEVARIAZI.VS = MainFrm.VisualStyleList;
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 812-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5CAB50EF-E83F-4EA4-A1AD-20A610CD1F03");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2116, 252, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BOZZEVARIAZI.InitStatus = 2;
    PAN_BOZZEVARIAZI_Init();
    PAN_BOZZEVARIAZI_InitFields();
    PAN_BOZZEVARIAZI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_MODIFICA3+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_INSERISCI1+BaseCmdLinIdx)
      {
        Ins();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FA1+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI83+BaseCmdSetIdx, "M" + (MyGlb.CMD_FA1+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VARIAZORIGIN+BaseCmdLinIdx)
      {
        FVariazioneOriginale();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_TOTALIBOZZA+BaseCmdLinIdx)
      {
        ApriTotaliBozza();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTRODISPO6+BaseCmdLinIdx)
      {
        ApriControlloDisponibilità();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTROQUADR1+BaseCmdLinIdx)
      {
        ApriControlloQuadratura();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENVARIBOZZ+BaseCmdLinIdx)
      {
        ApriStampaElencoVariazioniBozza();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELEPROSOSANN+BaseCmdLinIdx)
      {
        ApriElencoProposteSospeseAnnullate();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGITIPOVARI+BaseCmdLinIdx)
      {
        ApriAggiornamentoTipoVariazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIOBILAPEG+BaseCmdLinIdx)
      {
        ApriAggiornamentoBilancioVocePEG();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SPOSSUDIVBOZ+BaseCmdLinIdx)
      {
        ApriSpostamentoSuDiversaBozza();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ASSOBOZZAVAR+BaseCmdLinIdx)
      {
        ApriAssociazioneBozzaAVariazione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DISSBOZDAVAR+BaseCmdLinIdx)
      {
        ApriDissociaBozzaDaVariazione();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        BOZZEVARIAZI_PARS1();
      }
      PAN_BOZZE.UpdatePanel(MainFrm);
      PAN_BOZZEVARIAZI.UpdatePanel(MainFrm);
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
    return (obj instanceof BozzeVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BozzeVariazione.class.getName() : (Glb.ClassWithPackage(BozzeVariazione.class) ? BozzeVariazione.class.getName().substring(BozzeVariazione.class.getPackage().getName().length() + 1) : BozzeVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Note Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_NOTE1, IMDBDef4.FLD_NOTE1_ROWNAMENOTE1, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_NOTA_1, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE2, IMDBDef4.FLD_NOTE2_ROWNAMENOTE2, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_NOTA_2, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE3, IMDBDef4.FLD_NOTE3_ROWNAMENOTE3, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_NOTA_3, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE4, IMDBDef4.FLD_NOTE4_ROWNAMENOTE4, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_NOTA_4, 0));
      IMDB.set_Value(IMDBDef4.TBL_NOTE5, IMDBDef4.FLD_NOTE5_ROWNAMENOTE5, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_NOTA_5, 0));
      IMDB.set_Value(IMDBDef4.TBL_PAR34, IMDBDef4.FLD_PAR34_ROWNAMEMODIF, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SPECDIGITEST, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica
  // **********************************************************************
  public int Modifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_DETT_ID, 0)))
      {
        return 0;
      }
      if (new IDVariant(PAN_BOZZEVARIAZI.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Una o più Proposte non sono state salvate", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      // if (IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_STATO, 0).equals((new IDVariant("A")), true))
      // {
        // MainFrm.set_AlertMessage(v_ERR); 
        // return 0;
      // }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_BOZZA_VARIAZIONE_ID, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_STATO, 0))) || IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_STATO, 0).equals((new IDVariant("A")), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODIF, 0, (new IDVariant("NO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODIF, 0, (new IDVariant("SI")));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMVADEID, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_DETT_ID, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEINSER, 0, IMDB.Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMCANINS, 0));
      IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_PROGR_UNITA_ORGANIZZATIVA, 0));
      MainFrm.Show(MyGlb.FRM_INSAGGBOZVAR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ins
  // **********************************************************************
  public int Ins ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ins Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)))
      {
        return 0;
      }
      if (new IDVariant(PAN_BOZZEVARIAZI.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Una o più Proposte non sono state salvate", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_INSAGGBOZVAR, (new IDVariant(-1)).intValue(), this); 
      ((InserimentoAggiornamentoBozzeVariazione)MainFrm.GetForm(MyGlb.FRM_INSAGGBOZVAR,0)).PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_INSERT);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "Ins", _e);
      return -1;
    }
  }

  // **********************************************************************
  // F Variazione Originale
  // **********************************************************************
  public int FVariazioneOriginale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // F Variazione Originale Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEMODIF, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNADACORE1, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMVADEID, 0, new IDVariant(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_DETT_ID, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef3.TBL_PARS5, IMDBDef3.FLD_PARS5_ROWNAMEINSER, 0, IMDB.Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMCANINS, 0));
      IMDB.set_Value(IMDBDef3.TBL_PANNELLOUO, IMDBDef3.FLD_PANNELLOUO_ROWNAMEPROUO, 0, IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_PROGR_UNITA_ORGANIZZATIVA, 0));
      MainFrm.Show(MyGlb.FRM_INSAGGBOZVAR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "FVariazioneOriginale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Totali Bozza
  // **********************************************************************
  public int ApriTotaliBozza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Totali Bozza Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0))))
      {
        IMDB.set_Value(IMDBDef3.TBL_PAR64, IMDBDef3.FLD_PAR64_ROWNAMBOVAID, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
        MainFrm.Show(MyGlb.FRM_TOTALIBOZZA, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriTotaliBozza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Controllo Disponibilità
  // **********************************************************************
  public int ApriControlloDisponibilità ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Controllo Disponibilità Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0))))
      {
        IMDB.set_Value(IMDBDef3.TBL_IN2, IMDBDef3.FLD_IN2_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
        MainFrm.Show(MyGlb.FRM_PARCONDISRE1, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriControlloDisponibilità", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Controllo Quadratura
  // **********************************************************************
  public int ApriControlloQuadratura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Controllo Quadratura Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_PAR67, IMDBDef3.FLD_PAR67_ROWNAMBOVAID, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_CONTROQUADRA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriControlloQuadratura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Stampa Elenco Variazioni Bozza
  // **********************************************************************
  public int ApriStampaElencoVariazioniBozza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stampa Elenco Variazioni Bozza Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef3.TBL_IN3, IMDBDef3.FLD_IN3_ROWNAMBOVAID, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_ELENVARIBOZZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriStampaElencoVariazioniBozza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Proposte Sospese Annullate
  // **********************************************************************
  public int ApriElencoProposteSospeseAnnullate ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Proposte Sospese Annullate Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_IN4, IMDBDef4.FLD_IN4_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_PARELEPRSOAN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriElencoProposteSospeseAnnullate", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Aggiornamento Tipo Variazione
  // **********************************************************************
  public int ApriAggiornamentoTipoVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Aggiornamento Tipo Variazione Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_IN5, IMDBDef4.FLD_IN5_ROWNAMBOVAID, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_AGGITIPOVARI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriAggiornamentoTipoVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Aggiornamento Bilancio Voce P E G
  // **********************************************************************
  public int ApriAggiornamentoBilancioVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Aggiornamento Bilancio Voce P E G Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_IN6, IMDBDef4.FLD_IN6_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_AGGIOBILAPEG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriAggiornamentoBilancioVocePEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Spostamento Su Diversa Bozza
  // **********************************************************************
  public int ApriSpostamentoSuDiversaBozza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Spostamento Su Diversa Bozza Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_IN7, IMDBDef4.FLD_IN7_ROWNAMEBOZZA, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_SPOSSUDIVBOZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriSpostamentoSuDiversaBozza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Associazione Bozza A Variazione
  // **********************************************************************
  public int ApriAssociazioneBozzaAVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Apri Associazione Bozza A Variazione Body
      // Procedure Body
      // 
      // 
      // controlli
      // 
      {
        IDVariant v_CONTATORE1 = new IDVariant(0,IDVariant.INTEGER);
        v_CONTATORE = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 2) ");
        SQL.append("and   ((A.STATO IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Sulla bozza sono presenti variazioni non approvate. L'associazione non è possibile", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_PROPOSTE_VAR_DETT A ");
        SQL.append("where ((A.TIPO_VAR IS NULL)) ");
        SQL.append("and   (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.COD_REC = 2) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE1.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Sulla bozza sono presenti variazioni senza Tipo Variazione: l'associazione non è possibile", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
      }
      IMDB.set_Value(IMDBDef4.TBL_PARS11, IMDBDef4.FLD_PARS11_ROWNAMBOVAID, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_ASSOBOZZAVAR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriAssociazioneBozzaAVariazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dissocia Bozza Da Variazione
  // **********************************************************************
  public int ApriDissociaBozzaDaVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Dissocia Bozza Da Variazione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARS13, IMDBDef4.FLD_PARS13_ROWNAMBOVAID, 0, IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0));
      MainFrm.Show(MyGlb.FRM_DISSBOZDAVAR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "ApriDissociaBozzaDaVariazione", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_RONAANBOASAV, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMEORDIN, 0, (new IDVariant("V")));
      MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMEVISUA, 0, (new IDVariant("SI")));
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.set_FixedCols((new IDVariant(5)).intValue());
      }
      else
      {
        PAN_BOZZEVARIAZI.set_FixedCols((new IDVariant(4)).intValue());
        IMDB.set_Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMEVISUA, 0, (new IDVariant("NO")));
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_BOZZEVARIAZI.set_Header(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_IMPORTO1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).stringValue());
      PAN_BOZZEVARIAZI.set_Header(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_IMPORTO2, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))).stringValue());
      PAN_BOZZEVARIAZI.set_Header(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_IMPORTO3, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2)))).stringValue());
      PAN_BOZZEVARIAZI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_BOZZEVARIAZI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_BOZZEVARIAZI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMEBOZZA, 0, (new IDVariant()));
      if (IDL.IsNull(MainFrm.GESTIOECONOM))
      {
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BOZZEVARIAZI.SetFlags (Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BOZZE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BOZZE);
      // 
      // Bozze On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEORDIN, 0).equals((new IDVariant("V")), true))
      {
        PAN_BOZZEVARIAZI.ResetSortList();
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_ES, (new IDVariant(-1)).booleanValue()); 
        if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
        {
        }
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_CAPITOLO1, (new IDVariant(-1)).booleanValue()); 
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_ARTICOLO1, (new IDVariant(-1)).booleanValue()); 
        PAN_BOZZEVARIAZI.EnableSorting();
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEORDIN, 0).equals((new IDVariant("UV")), true))
      {
        PAN_BOZZEVARIAZI.ResetSortList();
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_UNITAORG, (new IDVariant(-1)).booleanValue()); 
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_ES, (new IDVariant(-1)).booleanValue()); 
        if (MainFrm.VisualizzaRisorsaIntevento(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))
        {
        }
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_CAPITOLO1, (new IDVariant(-1)).booleanValue()); 
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_ARTICOLO1, (new IDVariant(-1)).booleanValue()); 
        PAN_BOZZEVARIAZI.EnableSorting();
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEORDIN, 0).equals((new IDVariant("UI")), true))
      {
        PAN_BOZZEVARIAZI.ResetSortList();
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_UNITAORG, (new IDVariant(-1)).booleanValue()); 
        PAN_BOZZEVARIAZI.AddToSortList(PFL_BOZZEVARIAZI_PROPVARDETID, (new IDVariant(-1)).booleanValue()); 
        PAN_BOZZEVARIAZI.EnableSorting();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "BozzeOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_BOZZE_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_BOZZE, Cancel);
      // 
      // Bozze On Validate Row Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  POL_BOZZE_VARIAZIONE A, ");
      SQL.append("  POL_PROPOSTE_VAR_DETT B ");
      SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
      SQL.append("and   (NOT ((B.VARIAZIONE_ID IS NULL))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INSERISCI1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        IMDB.set_Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMCANINS, 0, (new IDVariant("SI")));
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_INSERISCI1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        IMDB.set_Value(IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMCANINS, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "BozzeOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Database Error Event
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
  private void PAN_BOZZEVARIAZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_BOZZEVARIAZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Bozze Variazione On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "BozzeVariazioneOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione After Find Event Body
      // Procedure Body
      // 
      PAN_BOZZEVARIAZI.set_ObjRect(Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_BOZZEVARIAZI.ObjRect(Glb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "BozzeVariazioneAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Bozze Variazione On Change Row Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  POL_PROPOSTE_VAR_DETT A ");
      SQL.append("where (A.PROPOSTA_VAR_DETT_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_POLPROVARDE4, IMDBDef12.PQSL_POLPROVARDE4_PROPOSTA_VAR_DETT_ID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.COD_REC = 1) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_VARIAZORIGIN+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_VARIAZORIGIN+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0)))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_TOTALIBOZZA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CONTRODISPO6+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CONTROQUADR1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELENVARIBOZZ+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELEPROSOSANN+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGITIPOVARI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIOBILAPEG+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SPOSSUDIVBOZ+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ASSOBOZZAVAR+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DISSBOZDAVAR+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        IDVariant v_COUNTER = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_TOTALIBOZZA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CONTRODISPO6+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CONTROQUADR1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELENVARIBOZZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELEPROSOSANN+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGITIPOVARI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SPOSSUDIVBOZ+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  POL_BOZZE_VARIAZIONE A, ");
        SQL.append("  POL_PROPOSTE_VAR_DETT B ");
        SQL.append("where (A.BOZZA_VARIAZIONE_ID = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARS1, IMDBDef12.PQSL_PARS1_ROWNAMEBOZZA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
        SQL.append("and   (B.COD_REC = 2) ");
        SQL.append("and   (NOT ((B.VARIAZIONE_ID IS NULL))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_COUNTER = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_COUNTER.compareTo((new IDVariant(0)), true)>0)
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGITIPOVARI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIOBILAPEG+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ASSOBOZZAVAR+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DISSBOZDAVAR+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGITIPOVARI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_AGGIOBILAPEG+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ASSOBOZZAVAR+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DISSBOZDAVAR+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "BozzeVariazioneOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Bozze Variazione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BOZZEVARIAZI);
      // 
      // Bozze Variazione On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_DESCRIZIONE,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_DESCRIZIONE))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_UNITAORG,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_UNITAORG))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_VARIAZIONE,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_VARIAZIONE))).stringValue()); 
      PAN_BOZZEVARIAZI.set_ToolTip(Glb.OBJ_FIELD,PFL_BOZZEVARIAZI_TIPOVAR,(new IDVariant(PAN_BOZZEVARIAZI.FieldText(PFL_BOZZEVARIAZI_TIPOVAR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BozzeVariazione", "BozzeVariazioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Primary record source for panel data
  // **********************************************************************
  private void BOZZEVARIAZI_PARS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS3, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS1_RS, 0, IMDBDef3.TBL_PARS3, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS1_RS, 0, 0, IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_RONAANBOASAV, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS1_RS, 1, 0, IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMEORDIN, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS1_RS, 2, 0, IMDBDef3.TBL_PARS3, IMDBDef3.FLD_PARS3_ROWNAMEBOZZA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS3, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS1_RS, 0);
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
  private void PAN_BOZZE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BOZZE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_BOZZE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BOZZE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BOZZE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BOZZE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BOZZEVARIAZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BOZZEVARIAZI, Cancel);
    // Stub
  }

  private void PAN_BOZZEVARIAZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_BOZZEVARIAZI_NOTE1)
    {
      this.IdxPanelActived = this.PAN_BOZZEVARIAZI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_BOZZEVARIAZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BOZZEVARIAZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BOZZEVARIAZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BOZZE_Init()
  {

    PAN_BOZZE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BOZZE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BOZZE.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_BOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, "8EA0E998-9991-4113-97D2-278BCEFDC18C");
    PAN_BOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, "Anche Bozze Associate A Variazione");
    PAN_BOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, "");
    PAN_BOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, "B9A63433-4BB3-493B-B17F-1F02B290EFF1");
    PAN_BOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, "Ordinamento");
    PAN_BOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, "");
    PAN_BOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_BOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, "4874A749-B65B-44DE-8766-BC7526C2DD79");
    PAN_BOZZE.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, "Bozza");
    PAN_BOZZE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, "");
    PAN_BOZZE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZE.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_BOZZE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_LIST, 180);
    PAN_BOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_LIST, "A. B. A. A V.");
    PAN_BOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_FORM, 4, 4, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_FORM, 228);
    PAN_BOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZE_ANCBOZASSAVA, MyGlb.PANEL_FORM, "Anche Bozze Associate A Variazione");
    PAN_BOZZE.SetFieldPage(PFL_BOZZE_ANCBOZASSAVA, -1, -1);
    PAN_BOZZE.SetFieldPanel(PFL_BOZZE_ANCBOZASSAVA, PPQRY_PARS1, "A.RONAANBOASAV", "RONAANBOASAV", 5, 2, 0, -13997);
    PAN_BOZZE.SetValueListItem(PFL_BOZZE_ANCBOZASSAVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZE.SetValueListItem(PFL_BOZZE_ANCBOZASSAVA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_BOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_LIST, 40, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_BOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_BOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_FORM, 112, 28, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_FORM, 120);
    PAN_BOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZE_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_BOZZE.SetFieldPage(PFL_BOZZE_ORDINAMENTO, -1, -1);
    PAN_BOZZE.SetFieldPanel(PFL_BOZZE_ORDINAMENTO, PPQRY_PARS1, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 5, 2, 0, -13997);
    PAN_BOZZE.SetValueListItem(PFL_BOZZE_ORDINAMENTO, (new IDVariant("V")), "Voce P.e.g.", "", "", -1);
    PAN_BOZZE.SetValueListItem(PFL_BOZZE_ORDINAMENTO, (new IDVariant("UV")), "Unità Org./Voce P.e.g.", "", "", -1);
    PAN_BOZZE.SetValueListItem(PFL_BOZZE_ORDINAMENTO, (new IDVariant("UI")), "Unità Org./Inserimento", "", "", -1);
    PAN_BOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_LIST, 36);
    PAN_BOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_LIST, "Bozza");
    PAN_BOZZE.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_FORM, 148, 52, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_FORM, 84);
    PAN_BOZZE.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZE_BOZZA, MyGlb.PANEL_FORM, "Bozza");
    PAN_BOZZE.SetFieldPage(PFL_BOZZE_BOZZA, -1, -1);
    PAN_BOZZE.SetFieldPanel(PFL_BOZZE_BOZZA, PPQRY_PARS1, "A.ROWNAMEBOZZA", "ROWNAMEBOZZA", 1, 10, 0, -13997);
  }

  private void PAN_BOZZE_InitQueries()
  {
    StringBuffer SQL;

    PAN_BOZZE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID as POBOPOBOBOVI, ");
    SQL.append("  A.DESCRIZIONE as POLBOZVARDES ");
    SQL.append("from ");
    SQL.append("  POL_BOZZE_VARIAZIONE A ");
    SQL.append("where (A.BOZZA_VARIAZIONE_ID = ~~ROWNAMEBOZZA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT B ");
    SQL.append("where (B.COD_REC = 2) ");
    SQL.append("and   (B.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
    SQL.append("and   (NVL(B.VARIAZIONE_ID, 0) = CASE WHEN ~~RONAANBOASAV~~ = 'SI' THEN 0 ELSE NVL(B.VARIAZIONE_ID, 0) END) ");
    SQL.append(")) OR NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT C ");
    SQL.append("where (C.COD_REC = 2) ");
    SQL.append("and   (C.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
    SQL.append(")))) ");
    SQL.append("order by ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID ");
    PAN_BOZZE.SetQuery(PPQRY_POLBOZZEVARI, 0, SQL, PFL_BOZZE_BOZZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID as POBOPOBOBOVI, ");
    SQL.append("  A.DESCRIZIONE as POLBOZVARDES ");
    SQL.append("from ");
    SQL.append("  POL_BOZZE_VARIAZIONE A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT B ");
    SQL.append("where (B.COD_REC = 2) ");
    SQL.append("and   (B.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
    SQL.append("and   (NVL(B.VARIAZIONE_ID, 0) = CASE WHEN ~~RONAANBOASAV~~ = 'SI' THEN 0 ELSE NVL(B.VARIAZIONE_ID, 0) END) ");
    SQL.append(")) OR NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  'X' ");
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT C ");
    SQL.append("where (C.COD_REC = 2) ");
    SQL.append("and   (C.BOZZA_VARIAZIONE_ID = A.BOZZA_VARIAZIONE_ID) ");
    SQL.append(")))) ");
    SQL.append("order by ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID ");
    PAN_BOZZE.SetQuery(PPQRY_POLBOZZEVARI, 1, SQL, PFL_BOZZE_BOZZA, "");
    PAN_BOZZE.SetQueryDB(PPQRY_POLBOZZEVARI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZE.SetIMDB(IMDB, "PQRY_PARS1", true);
    PAN_BOZZE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_BOZZE.SetQueryIMDB(PPQRY_PARS1, IMDBDef12.PQRY_PARS1_RS, IMDBDef3.TBL_PARS3);
    JustLoaded = true;
    PAN_BOZZE.SetFieldPrimaryIndex(PFL_BOZZE_ANCBOZASSAVA, IMDBDef3.FLD_PARS3_RONAANBOASAV);
    PAN_BOZZE.SetFieldPrimaryIndex(PFL_BOZZE_ORDINAMENTO, IMDBDef3.FLD_PARS3_ROWNAMEORDIN);
    PAN_BOZZE.SetFieldPrimaryIndex(PFL_BOZZE_BOZZA, IMDBDef3.FLD_PARS3_ROWNAMEBOZZA);
    PAN_BOZZE.SetMasterTable(0, "PARS3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BOZZE.Status() == 2)
    {
      int oldListQBE = PAN_BOZZE.iUseListQBE;
      PAN_BOZZE.iUseListQBE = 0;
      PAN_BOZZE.PanelCommand(Glb.PCM_SEARCH);
      PAN_BOZZE.PanelCommand(Glb.PCM_FIND);
      PAN_BOZZE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_BOZZEVARIAZI_Init()
  {

    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, "C9247703-955A-4DB2-8C6C-664CEAF101E2");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, "Voce P.e.g.");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, MyGlb.PANEL_LIST, 140, -9999, 168, 0, 0, 0);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, MyGlb.PANEL_FORM, 8, 56, 540, 100, 0, 0);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 0, 60);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 1, 13);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 0, 1);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 1, 1);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, "4E6E0627-4F62-45BC-94FE-6A473EA40DB1");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, "Importi");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, MyGlb.VIS_LABVISSTPEGR);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_LIST, 308, -9999, 324, 21, 0, 0);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, MyGlb.PANEL_FORM, 8, 183, 228, 97, 0, 0);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, 0, 43);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, 1, 13);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, 0, 4);
    PAN_BOZZEVARIAZI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, 1, 4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_GROUP, GRP_BOZZEVARIAZI_IMPORTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_FIELD, 46);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, "F509811A-841D-4CBC-9513-39392F8DD91A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, "NOTA 1");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, "79D8CBFB-6A0F-4A39-AAC5-9C9EDBBE3B7E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, "NOTA 2");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, "6EDD307B-38DC-4D28-969C-2F55F78E6D7F");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, "NOTA 3");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, "5A8FE3AB-1B0A-4234-B351-746934096156");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, "NOTA 4");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, "38A03BBB-0549-4C4C-9F60-670BA13CCC6B");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, "NOTA 5");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, "B0699F65-DF8E-4976-BE6F-10EC1BEFE74A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, "Stato");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, "C48590A7-0E93-4A3C-9E98-7F1B9D075D87");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, "E/S");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, "309A3441-394A-4D76-AAFF-A5D328B575F3");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, "Voce P.e.g.");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, MyGlb.VIS_VUOTOGRASSET);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, 0 | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, "04D30E77-85A8-4CEC-857D-753FC82D6744");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, "Capitolo");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, "6BE00545-6887-4D58-87C3-BEEC5E6EBA55");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, "Articolo");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, "75214835-0DAE-47BF-9C29-E48434DD2E0C");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, "Nuova");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, "374DCCC7-4FEA-4B7F-B490-2CD2900DC402");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, "Risorsa Intervento");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, "44CA2871-89B7-4A22-8DE9-7C3C37A920FF");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, "Capitolo  ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, "509C61BE-08B0-4E60-BB88-789731BCAEF3");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, "Articolo ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, "C0A3B11A-9FB4-42B5-99B3-4E2C15D7556D");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, "-");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, 0 | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, "EF6BE479-C15A-4799-BDA4-E71EA156A79E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, "/");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, 0 | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, "2005BDB7-D2D0-475E-A939-1BDD9B804549");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, 0, "wsearch1.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, "1815C082-3FFC-451D-93C0-EDE59C883167");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_BOZZEVARIAZI.SetImage(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, 0, "info.gif", false);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, "1F001AAE-045B-403E-B4A0-992141DC8E73");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, "Voce P.e.g.");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.VIS_LABEVISUSTYL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, "764765FB-609E-4EBB-9F2E-897610838E08");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, "Capitolo/Art.");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, "2CC983F4-AB19-4AEE-B578-9FB87DC4432A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, "IMPORTO 1");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, "1A0A40EA-6807-467A-B7D2-4CA67EA881CA");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, "IMPORTO 2");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, "DCAC6833-0109-4D59-A019-B33E123E229E");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, "IMPORTO 3");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, "72AAB6E4-F888-4A63-9FFA-93E715CDEE22");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, "Text to show here");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, MyGlb.VIS_LABELFIELD);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, 0 | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, "9A6BDD13-E8A0-4FCD-A129-3DA6EE4F4E42");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, "PROPOSTA VAR DETT ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, "5480FE81-CBF7-4CE2-B62C-12E186711A9F");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, "PROPOSTA VAR ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.VIS_NONNULLAFIEL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, 0, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, "FBC42A68-7BE8-4E62-851F-B0C15CAB06E4");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, "BOZZA VARIAZIONE ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, "09B3C02D-B0F1-4F8F-907C-6F5CEE30AB45");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, "Unità Organizzativa");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, "B5F2DB1D-1EAC-4164-A816-B5B0E22210E9");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, "Cons./Svil.");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, "E7256864-F6B7-4F7C-97D0-E8298C9D7987");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, "Tipo Var.");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, "E0B44510-88AA-43D3-9904-DD99CA6BE634");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, "Descrizione ");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, "7F5959E8-B3B7-4A50-9BD5-3DA6DB9C5BD3");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, "Descrizione");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, "58D2CFAB-2E07-4176-B239-386B50145356");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, "Note");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.VIS_HYPELINKIMMA);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, "8ECDF835-C031-4281-A593-815CE4068AA5");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, "Var.Bil.");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, "9903907A-471A-4BE3-98FE-8F4181E18ED7");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, "Unità Org");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, "EB6EF95A-B658-40FE-AEA7-2FE5D3419A5A");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, "Obiettivo Operativo");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, "E12152FA-564B-4645-ADA9-D152EF293DDA");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, "Obiettivo Gestionale");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, "97AC90B9-4E73-4E2D-A5E6-84B7AF9ECCAE");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, "Fattore");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, "6F0B15BF-3E8A-4396-A9EE-846FA3949277");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, "Centro");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, "5AB934F8-EE0D-45AB-9C11-7F420A9D1893");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, "Finanziamento");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, "41D8B9CD-30FC-46D4-A274-AE1936BA62C2");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, "Opera");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, "BFE0036B-5AAC-4B0A-BEEE-9C15CA170AE1");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, "Variazione");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.VIS_VISULOOUPCF4);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, "8509A4CA-A38C-4B53-A4F9-53694A560037");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, "Generata");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.VIS_CHECKSTYLE);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, "5655712D-853C-409C-864C-21938852F6E0");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, "67A3D4D8-9245-40DC-9725-B1A633F284C4");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, "VARIAZIONE ID");
    PAN_BOZZEVARIAZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, "");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.VIS_NORMFIELPADR);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BOZZEVARIAZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, "E86FCA24-8347-4C38-A859-EA75E42F84C0");
    PAN_BOZZEVARIAZI.set_Header(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, "E/S");
    PAN_BOZZEVARIAZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_BOZZEVARIAZI.SetFlags(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_BOZZEVARIAZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_LIST, "NOTA 1");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, 4, 256, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA1, MyGlb.PANEL_FORM, "NOTA 1");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA1, PPQRY_POLPROVARDE4, "A.NOTA_1", "NOTA_1", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_LIST, "NOTA 2");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, 4, 304, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA2, MyGlb.PANEL_FORM, "NOTA 2");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA2, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA2, PPQRY_POLPROVARDE4, "A.NOTA_2", "NOTA_2", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_LIST, "NOTA 3");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, 4, 352, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA3, MyGlb.PANEL_FORM, "NOTA 3");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA3, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA3, PPQRY_POLPROVARDE4, "A.NOTA_3", "NOTA_3", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, 32, 52, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_LIST, "NOTA 4");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, 4, 400, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA4, MyGlb.PANEL_FORM, "NOTA 4");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA4, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA4, PPQRY_POLPROVARDE4, "A.NOTA_4", "NOTA_4", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, 32, 52, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_LIST, "NOTA 5");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, 4, 448, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTA5, MyGlb.PANEL_FORM, "NOTA 5");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTA5, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTA5, PPQRY_POLPROVARDE4, "A.NOTA_5", "NOTA_5", 5, 400, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, 0, 52, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, 44);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, 76, 8, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, 36);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_STATO, MyGlb.PANEL_FORM, "St.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_STATO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_STATO, PPQRY_POLPROVARDE4, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_LIST, 92, 52, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_LIST, 24);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_LIST, "E/S");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_FORM, 88, 32, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_FORM, 24);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ES, MyGlb.PANEL_FORM, "E S");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ES, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ES, PPQRY_POLPROVARDE4, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, MyGlb.PANEL_LIST, 28, 56, 52, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, MyGlb.PANEL_FORM, 36, 60, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGLABEL, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VOCEPEGLABEL, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VOCEPEGLABEL, -1, "", "VOCEPEGLABEL", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, 140, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, 192, 60, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CAPITOLO1, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CAPITOLO1, PPQRY_POLPROVARDE4, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, 240, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_LIST, "Ar.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, 248, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ARTICOLO1, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ARTICOLO1, PPQRY_POLPROVARDE4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, 264, 52, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, 92);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_LIST, "Nuova");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, 312, 60, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, 40);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NUOVA, MyGlb.PANEL_FORM, "Nuov.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NUOVA, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NUOVA, PPQRY_POLPROVARDE4, "A.ISTITUZIONE_NC", "ISTITUZIONE_NC", 5, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NUOVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NUOVA, (new IDVariant()), "Null", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, 2164, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, 136);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_LIST, "Risorsa Intervento");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, 12, 84, 532, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, 100);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_RISORSINTERV, MyGlb.PANEL_FORM, "Ris. Intervento");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_RISORSINTERV, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_RISORSINTERV, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,0,0)", "DUALINTDESCR", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, 2164, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, 140);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo  ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, 56, 108, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo  ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CAPITOLO, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CAPITOLO, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,0)", "DUALCAPDESCR", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, 2164, 52, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, 136);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, 56, 132, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ARTICOLO, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ARTICOLO, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,~~ARTICOLO~~)", "DUALARTDESCR", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, MyGlb.PANEL_LIST, 164, 36, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, MyGlb.PANEL_FORM, 180, 60, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_TRATTINO, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_LIST, 172, 44, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_FORM, 236, 60, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_SLASH, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_LIST, 244, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_FORM, 272, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_APRIVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_APRIVOCEPEG, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_APRIVOCEPEG, -1, "", "APRIVOCEPEG", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_LIST, 252, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_FORM, 288, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_INFOVOCEPEG, -1, GRP_BOZZEVARIAZI_VOCEPEG);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_LIST, 140, 0, 72, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_LIST, 3);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_FORM, 232, 0, 80, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VOCEPEGSMALL, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VOCEPEGSMALL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VOCEPEGSMALL, -1, "", "VOCEPEGSMALL", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_LIST, 140, 0, 124, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_LIST, 3);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_FORM, 240, 8, 80, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CAPITOLOART, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_LIST, 308, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_FORM, 52, 208, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO1, MyGlb.PANEL_FORM, "IMP. 1");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_IMPORTO1, -1, GRP_BOZZEVARIAZI_IMPORTI);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_IMPORTO1, PPQRY_POLPROVARDE4, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, 416, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, 52, 232, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO2, MyGlb.PANEL_FORM, "IMP. 2");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_IMPORTO2, -1, GRP_BOZZEVARIAZI_IMPORTI);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_IMPORTO2, PPQRY_POLPROVARDE4, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, 524, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, 52, 256, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_IMPORTO3, MyGlb.PANEL_FORM, "IMP. 3");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_IMPORTO3, -1, GRP_BOZZEVARIAZI_IMPORTI);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_IMPORTO3, PPQRY_POLPROVARDE4, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, MyGlb.PANEL_LIST, 220, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, MyGlb.PANEL_FORM, 12, 212, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NEWPANELLABE, -1, GRP_BOZZEVARIAZI_IMPORTI);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, 316, 52, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, 128);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_LIST, "PROPOSTA VAR DETT ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, 4, 400, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, 128);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPVARDETID, MyGlb.PANEL_FORM, "PROP. VAR DETT ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PROPVARDETID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PROPVARDETID, PPQRY_POLPROVARDE4, "A.PROPOSTA_VAR_DETT_ID", "PROPOSTA_VAR_DETT_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_LIST, 316, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_LIST, 100);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_LIST, "PROPOSTA VAR ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_FORM, 4, 424, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_FORM, 100);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROPOSTVARID, MyGlb.PANEL_FORM, "PROP. VAR ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PROPOSTVARID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PROPOSTVARID, PPQRY_POLPROVARDE4, "A.PROPOSTA_VAR_ID", "PROPOSTA_VAR_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, 316, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_LIST, "BOZZA VARIAZIONE ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, 4, 448, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_BOZZAVARIAID, MyGlb.PANEL_FORM, "BOZ. VARIAZIONE ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_BOZZAVARIAID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_BOZZAVARIAID, PPQRY_POLPROVARDE4, "A.BOZZA_VARIAZIONE_ID", "BOZZA_VARIAZIONE_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 52, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_LIST, 164);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_FORM, 8, 160, 372, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_FORM, 104);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORGANIZ, MyGlb.PANEL_FORM, "Un. Organiz.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_UNITAORGANIZ, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_UNITAORGANIZ, PPQRY_POLPROVARDE4, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, 632, 52, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, 88);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_LIST, "Cons./Svil.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, 56, 288, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CONSSVIL, MyGlb.PANEL_FORM, "Cons Svil");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CONSSVIL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CONSSVIL, PPQRY_POLPROVARDE4, "A.CONS_SVILUPPO", "CONS_SVILUPPO", 5, 1, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_CONSSVIL, (new IDVariant("C")), "Consolidato", "", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_CONSSVIL, (new IDVariant("S")), "Sviluppo", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_LIST, 700, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Var.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_FORM, 60, 312, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Var.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_TIPOVAR, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_TIPOVAR, PPQRY_POLPROVARDE4, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, 0, 52, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione ");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, 40, 336, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione ");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_DESCRIZIONE1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_DESCRIZIONE1, PPQRY_POLPROVARDE4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 908, 52, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 280, 408, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_DESCRIZIONE, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_DESCRIZIONE, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_DESCRIZIONE, PPQRY_POLPROVARDE4, "SUBSTR(A.DESCRIZIONE, 1, 40)", "RECORDDESCRI", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, 1120, 52, 36, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, 32);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, 28, 312, 464, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, 32);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_NOTE1, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_NOTE1, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_NOTE1, PPQRY_POLPROVARDE4, "CASE WHEN (A.NOTA_1 IS NULL) AND (A.NOTA_2 IS NULL) AND (A.NOTA_3 IS NULL) AND (A.NOTA_4 IS NULL) AND (A.NOTA_5 IS NULL) THEN 'N' ELSE 'P' END", "RECORDNOTE", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_NOTE1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, 1156, 52, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_LIST, "Var.Bil.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, 68, 360, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, 48);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARBIL, MyGlb.PANEL_FORM, "Var.Bil.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VARBIL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VARBIL, PPQRY_POLPROVARDE4, "A.VAR_BIL", "VAR_BIL", 5, 2, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_VARBIL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_VARBIL, (new IDVariant()), "Null", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, 1204, 52, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_LIST, "Unità Org");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, 36, 216, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_UNITAORG, MyGlb.PANEL_FORM, "Un. Org");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_UNITAORG, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_UNITAORG, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_UNITAORG, PPQRY_POLPROVARDE4, "SUBSTR(ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), 1, 40)", "RECORUNITORG", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, 1416, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, 40, 384, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_PROGETTO, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_PROGETTO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_PROGETTO, PPQRY_POLPROVARDE4, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, 1496, 52, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, 124);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo Gestionale");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, 60, 504, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OBIETTIVO, MyGlb.PANEL_FORM, "Ob. Gest.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_OBIETTIVO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_OBIETTIVO, PPQRY_POLSCHEDOBIE, "B.CODICE", "POSCOBPOOBCO", 5, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_LIST, 1576, 52, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_FORM, 60, 408, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_FATTORE, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_FATTORE, PPQRY_POLPROVARDE4, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_LIST, 1640, 52, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_FORM, 64, 432, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_CENTRO, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_CENTRO, PPQRY_POLPROVARDE4, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, 1704, 52, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, 36, 456, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, 80);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_FINANZIAMENT, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_FINANZIAMENT, PPQRY_POLPROVARDE4, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, 1796, 52, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, 72, 480, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_OPERA, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_OPERA, PPQRY_POLPROVARDE4, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, 1848, 52, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, 184);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_LIST, "Variazione");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, 56, 530, 488, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, 60);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONE, MyGlb.PANEL_FORM, "Variaz.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VARIAZIONE, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VARIAZIONE, PPQRY_POLVARBILPEG, "SUBSTR(A.DESCRIZIONE, 1, 40)", "POLVARBIPEVA", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, 2060, 52, 56, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_LIST, "Gener.");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, 60, 560, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, 56);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_GENERATA, MyGlb.PANEL_FORM, "Gener.");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_GENERATA, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldUnbound(PFL_BOZZEVARIAZI_GENERATA, true);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_GENERATA, PPQRY_POLPROVARDE4, "CASE WHEN NOT ((A.PROGR_VARCOMPRO_1 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_2 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_3 IS NULL)) OR NOT ((A.PROGR_VARCOM_1 IS NULL)) OR NOT ((A.PROGR_VARCOM_2 IS NULL)) OR NOT ((A.PROGR_VARCOM_3 IS NULL)) THEN 'SI' ELSE NULL END", "RECORDGENERA", 5, 99, 0, -13997);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_GENERATA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_BOZZEVARIAZI.SetValueListItem(PFL_BOZZEVARIAZI_GENERATA, (new IDVariant()), "Null", "", "", -1);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, 1744, 52, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 808, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, 120);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCH. OBIETTIVO ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_SCHEDOBIETID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_SCHEDOBIETID, PPQRY_POLPROVARDE4, "A.SCHEDA_OBIETTIVO_ID", "SCHEDA_OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, 2164, 52, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, 84);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_LIST, "VARIAZIONE ID");
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, 4, 928, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, 84);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, 1);
    PAN_BOZZEVARIAZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_VARIAZIONEID, MyGlb.PANEL_FORM, "VARIAZ. ID");
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_VARIAZIONEID, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_VARIAZIONEID, PPQRY_POLPROVARDE4, "A.VARIAZIONE_ID", "VARIAZIONE_ID", 1, 4, 0, -13997);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, MyGlb.PANEL_LIST, 92, 0, 48, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, MyGlb.PANEL_LIST, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, MyGlb.PANEL_LIST, 3);
    PAN_BOZZEVARIAZI.SetRect(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, MyGlb.PANEL_FORM, 92, 0, 48, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BOZZEVARIAZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, MyGlb.PANEL_FORM, 0);
    PAN_BOZZEVARIAZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_BOZZEVARIAZI_ESLABEL, MyGlb.PANEL_FORM, 2);
    PAN_BOZZEVARIAZI.SetFieldPage(PFL_BOZZEVARIAZI_ESLABEL, -1, -1);
    PAN_BOZZEVARIAZI.SetFieldPanel(PFL_BOZZEVARIAZI_ESLABEL, -1, "", "ESLABEL", 0, 0, 0, -13997);
  }

  private void PAN_BOZZEVARIAZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_BOZZEVARIAZI.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CODICE as POSCOBPOOBCO ");
    SQL.append("from ");
    SQL.append("  POL_SCHEDE_OBIETTIVO A, ");
    SQL.append("  POL_OBIETTIVI B ");
    SQL.append("where (B.OBIETTIVO_ID = A.OBIETTIVO_ID) ");
    SQL.append("and   (A.SCHEDA_OBIETTIVO_ID = ~~SCHEDA_OBIETTIVO_ID~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLSCHEDOBIE, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLSCHEDOBIE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_POLSCHEDOBIE, "POL_SCHEDE_OBIETTIVO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 40) as POLVARBIPEVA ");
    SQL.append("from ");
    SQL.append("  POL_VARIAZIONI_BIL_PEG A ");
    SQL.append("where (A.VARIAZIONE_ID = ~~VARIAZIONE_ID~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLVARBILPEG, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLVARBILPEG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_POLVARBILPEG, "POL_VARIAZIONI_BIL_PEG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,0,0) as DUALINTDESCR, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,0) as DUALCAPDESCR, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~E_S~~,~~CAPITOLO~~,~~ARTICOLO~~) as DUALARTDESCR ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as DUALAPPROVAT, ");
    SQL.append("  'Approvata' as DUALAPPROVA1 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (A.DUMMY = ~~STATO~~) ");
    SQL.append("and   (NOT ((~~PROPOSTA_VAR_DETT_ID~~ IS NULL))) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  'N', ");
    SQL.append("  'Annullata' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (NOT ((~~PROPOSTA_VAR_DETT_ID~~ IS NULL))) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Attesa Appr.' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (NOT ((~~PROPOSTA_VAR_DETT_ID~~ IS NULL))) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_BOZZEVARIAZI_STATO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'A' as DUALAPPROVAT, ");
    SQL.append("  'Approvata' as DUALAPPROVA1 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~PROPOSTA_VAR_DETT_ID~~ IS NULL))) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  'N', ");
    SQL.append("  'Annullata' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (NOT ((~~PROPOSTA_VAR_DETT_ID~~ IS NULL))) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Attesa Appr.' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (NOT ((~~PROPOSTA_VAR_DETT_ID~~ IS NULL))) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_BOZZEVARIAZI_STATO, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIBIUOPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as VISBILUONEEX ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("order by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_VISTABILANUO, 0, SQL, PFL_BOZZEVARIAZI_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VIBIUOPRUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as VISBILUONEEX ");
    SQL.append("from ");
    SQL.append("  VISTA_BILANCIO_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.TIPO = 'O') ");
    SQL.append("order by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_VISTABILANUO, 1, SQL, PFL_BOZZEVARIAZI_UNITAORGANIZ, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_VISTABILANUO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_T54, 0, SQL, PFL_BOZZEVARIAZI_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_T54, 1, SQL, PFL_BOZZEVARIAZI_TIPOVAR, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetIMDB(IMDB, "PQRY_POLPROVARDE4", true);
    PAN_BOZZEVARIAZI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.NOTA_1 as NOTA_1, ");
    SQL.append("  A.NOTA_2 as NOTA_2, ");
    SQL.append("  A.NOTA_3 as NOTA_3, ");
    SQL.append("  A.NOTA_4 as NOTA_4, ");
    SQL.append("  A.NOTA_5 as NOTA_5, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ISTITUZIONE_NC as ISTITUZIONE_NC, ");
    SQL.append("  A.PROPOSTA_VAR_DETT_ID as PROPOSTA_VAR_DETT_ID, ");
    SQL.append("  A.COD_REC as COD_REC, ");
    SQL.append("  A.PROPOSTA_VAR_ID as PROPOSTA_VAR_ID, ");
    SQL.append("  A.BOZZA_VARIAZIONE_ID as BOZZA_VARIAZIONE_ID, ");
    SQL.append("  SUBSTR(ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), 1, 40) as RECORUNITORG, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  A.CONS_SVILUPPO as CONS_SVILUPPO, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 40) as RECORDDESCRI, ");
    SQL.append("  CASE WHEN (A.NOTA_1 IS NULL) AND (A.NOTA_2 IS NULL) AND (A.NOTA_3 IS NULL) AND (A.NOTA_4 IS NULL) AND (A.NOTA_5 IS NULL) THEN 'N' ELSE 'P' END as RECORDNOTE, ");
    SQL.append("  A.VAR_BIL as VAR_BIL, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as SCHEDA_OBIETTIVO_ID, ");
    SQL.append("  CASE WHEN NOT ((A.PROGR_VARCOMPRO_1 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_2 IS NULL)) OR NOT ((A.PROGR_VARCOMPRO_3 IS NULL)) OR NOT ((A.PROGR_VARCOM_1 IS NULL)) OR NOT ((A.PROGR_VARCOM_2 IS NULL)) OR NOT ((A.PROGR_VARCOM_3 IS NULL)) THEN 'SI' ELSE NULL END as RECORDGENERA, ");
    SQL.append("  A.VARIAZIONE_ID as VARIAZIONE_ID, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_PROPOSTE_VAR_DETT A ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BOZZA_VARIAZIONE_ID = ~~PQRY_PARS1.ROWNAMEBOZZA~~) ");
    SQL.append("and   (A.COD_REC = 2) ");
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BOZZEVARIAZI.SetQuery(PPQRY_POLPROVARDE4, 5, SQL, -1, "");
    PAN_BOZZEVARIAZI.SetQueryDB(PPQRY_POLPROVARDE4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BOZZEVARIAZI.SetMasterTable(0, "POL_PROPOSTE_VAR_DETT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BOZZEVARIAZI.Status() == 2)
    {
      int oldListQBE = PAN_BOZZEVARIAZI.iUseListQBE;
      PAN_BOZZEVARIAZI.iUseListQBE = 0;
      PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_BOZZEVARIAZI.PanelCommand(Glb.PCM_FIND);
      PAN_BOZZEVARIAZI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BOZZE) PAN_BOZZE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZE) PAN_BOZZE_ValidateRow(Cancel);
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOZZE) PAN_BOZZE_DynamicProperties();
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BOZZE) PAN_BOZZE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_OnChangeRow();
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
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BOZZE) PAN_BOZZE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_BOZZEVARIAZI) PAN_BOZZEVARIAZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
