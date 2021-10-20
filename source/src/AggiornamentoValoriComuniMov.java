// **********************************************
// Aggiornamento Valori Comuni Mov
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoValoriComuniMov extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VALORCOMUMOV_DELIBERA = 0;
  private static int GRP_VALORCOMUMOV_CAPITOLO = 1;
  private static int GRP_VALORCOMUMOV_DESCRIZIONE = 2;
  private static int GRP_VALORCOMUMOV_TIPOVINCOLO = 3;
  private static int GRP_VALORCOMUMOV_CODITRANELEM = 4;
  private static int GRP_VALORCOMUMOV_ECONOMICA = 5;

  private static int PFL_VALORCOMUMOV_INTESTALABEL = 0;
  private static int PFL_VALORCOMUMOV_CKDELIBERA = 1;
  private static int PFL_VALORCOMUMOV_SEDEDEL = 2;
  private static int PFL_VALORCOMUMOV_TRATDELILABE = 3;
  private static int PFL_VALORCOMUMOV_NUMERODEL = 4;
  private static int PFL_VALORCOMUMOV_ANNODEL = 5;
  private static int PFL_VALORCOMUMOV_BARRDELILABE = 6;
  private static int PFL_VALORCOMUMOV_SCELDELIFORM = 7;
  private static int PFL_VALORCOMUMOV_CKCAPITOLO = 8;
  private static int PFL_VALORCOMUMOV_CAPITOLO = 9;
  private static int PFL_VALORCOMUMOV_ARTICOLO = 10;
  private static int PFL_VALORCOMUMOV_SCELTACAPITO = 11;
  private static int PFL_VALORCOMUMOV_CKDESCRIZION = 12;
  private static int PFL_VALORCOMUMOV_DESCRIZIONE = 13;
  private static int PFL_VALORCOMUMOV_CKTIPOVINCOL = 14;
  private static int PFL_VALORCOMUMOV_TIPOVINCOLO = 15;
  private static int PFL_VALORCOMUMOV_ETICHETTASF1 = 16;
  private static int PFL_VALORCOMUMOV_CKTRANS = 17;
  private static int PFL_VALORCOMUMOV_CODLIVELLO5 = 18;
  private static int PFL_VALORCOMUMOV_DUALDESCVLIV = 19;
  private static int PFL_VALORCOMUMOV_CODICECOFOG = 20;
  private static int PFL_VALORCOMUMOV_CODICEEUROPE = 21;
  private static int PFL_VALORCOMUMOV_DUALDESCCOFO = 22;
  private static int PFL_VALORCOMUMOV_CKECONOMICA = 23;
  private static int PFL_VALORCOMUMOV_FATTORE = 24;
  private static int PFL_VALORCOMUMOV_FATTORDESCRI = 25;
  private static int PFL_VALORCOMUMOV_CENTRO = 26;
  private static int PFL_VALORCOMUMOV_CENTRIDESCRI = 27;
  private static int PFL_VALORCOMUMOV_COMPDAL = 28;
  private static int PFL_VALORCOMUMOV_COMPAL = 29;
  private static int PFL_VALORCOMUMOV_IMPUTAECONOM = 30;
  private static int PFL_VALORCOMUMOV_CONFERMLABEL = 31;
  private static int PFL_VALORCOMUMOV_FINANZIAMENT = 32;
  private static int PFL_VALORCOMUMOV_OPERA = 33;
  private static int PFL_VALORCOMUMOV_PROGUNITORGA = 34;
  private static int PFL_VALORCOMUMOV_BENEFICIARIO = 35;
  private static int PFL_VALORCOMUMOV_NUMQUIETANZA = 36;

  private static int PPQRY_PARAMETRI647 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_CENTRI = 2;
  private static int PPQRY_DUAL = 3;

  private static int PPQRY_VINCOLI = 4;
  private static int PPQRY_CODTRANSEURO = 5;


  IDPanel PAN_VALORCOMUMOV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PARAMETRI647(IMDB);
    Init_PQRY_PARAMETRI647_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PARAMETRI647(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI647, 26);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI647, "PQRY_PARAMETRI647");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDEL, "VALOCOMCKDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDEL,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDES, "VALOCOMCKDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDES,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALCOMCKTIVI, "VALCOMCKTIVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALCOMCKTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKECO, "VALOCOMCKECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_COMP_DAL, "COMP_DAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_COMP_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_COMP_AL, "COMP_AL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_COMP_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALCOMIMPECO, "VALCOMIMPECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALCOMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKTRA, "VALOCOMCKTRA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKTRA,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKCAP, "VALOCOMCKCAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647,IMDBDef14.PQSL_PARAMETRI647_NUM_QUIETANZA,1,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI647, 0);
  }

  private static void Init_PQRY_PARAMETRI647_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI647_RS, 26);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI647_RS, "PQRY_PARAMETRI647_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDEL, "VALOCOMCKDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDEL,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDES, "VALOCOMCKDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDES,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALCOMCKTIVI, "VALCOMCKTIVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALCOMCKTIVI,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKECO, "VALOCOMCKECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_COMP_DAL, "COMP_DAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_COMP_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_COMP_AL, "COMP_AL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_COMP_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALCOMIMPECO, "VALCOMIMPECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALCOMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKTRA, "VALOCOMCKTRA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKTRA,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKCAP, "VALOCOMCKCAP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI647_RS,IMDBDef14.PQSL_PARAMETRI647_NUM_QUIETANZA,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoValoriComuniMov(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoValoriComuniMov()
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
    FormIdx = MyGlb.FRM_AGGVALCOMMOV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9959E7E8-80FF-47B4-8F20-CAA0D558FA96";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 510;
    set_Caption(new IDVariant("Aggiornamento Valori Comuni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 484;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Valori Comuni Mov";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 484;
    PAN_VALORCOMUMOV = new IDPanel(w, this, 1, "PAN_VALORCOMUMOV");
    Frames[1].Content = PAN_VALORCOMUMOV;
    PAN_VALORCOMUMOV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VALORCOMUMOV.VS = MainFrm.VisualStyleList;
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 888-MyGlb.PAN_OFFS_X, 484-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5D84F9BA-DF52-44FF-9A01-6A473A51772A");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3004, 568, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VALORCOMUMOV.InitStatus = 2;
    PAN_VALORCOMUMOV_Init();
    PAN_VALORCOMUMOV_InitFields();
    PAN_VALORCOMUMOV_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_VALORCOMUMOV, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGVALCOMMOV_PARAMETRI647();
      }
      PAN_VALORCOMUMOV.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VALORCOMUMOV.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMUMOV_SCELDELIFORM) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_VALORCOMUMOV.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMUMOV_SCELTACAPITO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_VALORCOMUMOV.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMUMOV_CODLIVELLO5) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACOFOG && flRis && IdxPanelActived == PAN_VALORCOMUMOV.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMUMOV_CODICECOFOG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_VALORCOMUMOV.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMUMOV_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_VALORCOMUMOV.FrIndex)
    {
      if (IdxFieldActived ==PFL_VALORCOMUMOV_CENTRO) {
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
    return (obj instanceof AggiornamentoValoriComuniMov);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoValoriComuniMov.class.getName() : (Glb.ClassWithPackage(AggiornamentoValoriComuniMov.class) ? AggiornamentoValoriComuniMov.class.getName().substring(AggiornamentoValoriComuniMov.class.getPackage().getName().length() + 1) : AggiornamentoValoriComuniMov.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0).equals((new IDVariant("ACC")), true))
      {
        PAN_VALORCOMUMOV.SetFlags (Glb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALORCOMUMOV.SetFlags (Glb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VALORCOMUMOV.SetFlags (Glb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VALORCOMUMOV.SetFlags (Glb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "LoadEvent", _e);
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
      PAN_VALORCOMUMOV.PanelCommand(Glb.PCM_UPDATE);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "UnloadEvent", _e);
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
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACOFOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, 0, IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC3, IMDBDef7.PQSL_VISTSTRURIC3_VISSTRRIPRCO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Comuni Mov On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VALORCOMUMOV_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Valori Comuni Mov On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_SEDEDEL)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_ANNODEL)), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0)));
        if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, 0))))
        {
          IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
          IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
          v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDEL, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDEL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_DESCRIZIONE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_DESCRIZIONE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDES, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDES, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_TIPOVINCOLO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_TIPO_VINCOLO, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALCOMCKTIVI, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALCOMCKTIVI, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_FATTORE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0))))
        {
          if (MainFrm.FattorePresente(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0), IDL.Today(), (new IDVariant(""))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Fattore non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0, PAN_VALORCOMUMOV.GetOrgValue(PFL_VALORCOMUMOV_FATTORE));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_CENTRO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0))))
        {
          if (MainFrm.CentriPresente(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0), IDL.Today()).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Centro non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0, PAN_VALORCOMUMOV.GetOrgValue(PFL_VALORCOMUMOV_CENTRO));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_FATTORE)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_CENTRO)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_COMPDAL)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_COMPAL)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_IMPUTAECONOM)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_DAL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_AL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALCOMIMPECO, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKECO, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKECO, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_CODLIVELLO5)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, 0))))
        {
          IDVariant v_VGETDESCR = new IDVariant(0,IDVariant.STRING);
          v_VGETDESCR = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  GET_DESCR_COD_5_LIVELLO(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GDC5LPCL5AVC ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VGETDESCR = QV.Get("GDC5LPCL5AVC", IDVariant.STRING) ;
          }
          QV.Close();
          if (IDL.NullValue(v_VGETDESCR,(new IDVariant(""))).equals((new IDVariant("")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Codice V Livello inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_CODICECOFOG)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  PROGRAMMI_COFOG A, ");
          SQL.append("  CAP B ");
          SQL.append("where (A.COFOG = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S = 'S') ");
          SQL.append("and   (B.CODICE_STRUTTURA = A.PROGRAMMA) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Codice Cofog inesistente o non previsto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VALORCOMUMOV_CODLIVELLO5)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_CODICECOFOG)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_CODICEEUROPE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_EUROPEO, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKTRA, 0, (new IDVariant("SI")));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKTRA, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_VALORCOMUMOV_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_VALORCOMUMOV_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        if ((IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO_OLD, 0),(new IDVariant(-1))), true)!=0) || (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO_OLD, 0),(new IDVariant(-1))), true)!=0))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0))))
          {
            ProponiDaCapitolo();
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKCAP, 0, (new IDVariant("SI")));
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKCAP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_OPERA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_PROGR_UNITA_ORGANIZZATIVA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_BENEFICIARIO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_NUM_QUIETANZA, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO_OLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO_OLD, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "ValoriComuniMovOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Valori Comuni Mov On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VALORCOMUMOV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VALORCOMUMOV);
      // 
      // Valori Comuni Mov On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VALORCOMUMOV.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMUMOV_DESCRIZIONE,(new IDVariant(PAN_VALORCOMUMOV.FieldText(PFL_VALORCOMUMOV_DESCRIZIONE))).stringValue()); 
      PAN_VALORCOMUMOV.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMUMOV_TIPOVINCOLO,(new IDVariant(PAN_VALORCOMUMOV.FieldText(PFL_VALORCOMUMOV_TIPOVINCOLO))).stringValue()); 
      PAN_VALORCOMUMOV.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMUMOV_FATTORDESCRI,(new IDVariant(PAN_VALORCOMUMOV.FieldText(PFL_VALORCOMUMOV_FATTORDESCRI))).stringValue()); 
      PAN_VALORCOMUMOV.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMUMOV_CENTRIDESCRI,(new IDVariant(PAN_VALORCOMUMOV.FieldText(PFL_VALORCOMUMOV_CENTRIDESCRI))).stringValue()); 
      PAN_VALORCOMUMOV.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMUMOV_DUALDESCVLIV,(new IDVariant(PAN_VALORCOMUMOV.FieldText(PFL_VALORCOMUMOV_DUALDESCVLIV))).stringValue()); 
      PAN_VALORCOMUMOV.set_ToolTip(Glb.OBJ_FIELD,PFL_VALORCOMUMOV_DUALDESCCOFO,(new IDVariant(PAN_VALORCOMUMOV.FieldText(PFL_VALORCOMUMOV_DUALDESCCOFO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "ValoriComuniMovOnDynamicPropertiesEvent", _e);
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
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Fattore
  // **********************************************************************
  public int ApriSceltaFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Fattore Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "ApriSceltaFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Centro
  // **********************************************************************
  public int ApriSceltaCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Centro Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "ApriSceltaCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // CODICE COFOG
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CODICECOFOG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // CODICE COFOG Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_SCELTACOFOG,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACOFOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "CODICECOFOG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // COD LIVELLO 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CODLIVELLO5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // COD LIVELLO 5 Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, ((IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0)),IDVariant.DECIMAL));
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "CODLIVELLO5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, ((IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "SceltaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Capitolo
  // **********************************************************************
  public int ProponiDaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Capitolo Body
      // Procedure Body
      // 
      IDVariant v_VCODEUROPEO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_LIVELLO5 = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VIMPUTAECONO = new IDVariant(0,IDVariant.STRING);
      v_LIVELLO5 = MainFrm.GetCodLiv5DaCapOUnico(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_VINCOLO as CAPTIPOVINCO, ");
      SQL.append("  A.FATTORE as CAPFATTORE, ");
      SQL.append("  A.CENTRO as CAPCENTRO, ");
      SQL.append("  A.CODICE_EUROPEO as CAPCODICEURO, ");
      SQL.append("  SE_IMPACC_RIL_ECO_DA_RICL(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')," + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(v_LIVELLO5, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CDSIREDRSEIE ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VINCOLO = QV.Get("CAPTIPOVINCO", IDVariant.INTEGER) ;
        v_FATTORE = QV.Get("CAPFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("CAPCENTRO", IDVariant.STRING) ;
        v_VCODEUROPEO = QV.Get("CAPCODICEURO", IDVariant.INTEGER) ;
        v_VIMPUTAECONO = QV.Get("CDSIREDRSEIE", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_EUROPEO, 0, new IDVariant(v_VCODEUROPEO));
      if (!(IDL.IsNull(v_LIVELLO5)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, 0, new IDVariant(v_LIVELLO5));
      }
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        if (!(IDL.IsNull(v_FATTORE)))
        {
          if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0, new IDVariant(v_FATTORE));
          }
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0))))
          {
            IDVariant v_VFATTORITIPO = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPO as FATTORITIPO ");
            SQL.append("from ");
            SQL.append("  FATTORI A ");
            SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VFATTORITIPO = QV.Get("FATTORITIPO", IDVariant.STRING) ;
            }
            QV.Close();
            if (v_VFATTORITIPO.compareTo((new IDVariant("E")), true)!=0)
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_DAL, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_AL, 0, (new IDVariant()));
            }
          }
        }
        if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0, new IDVariant(v_CENTRO));
          }
        }
        if (IDL.NullValue(v_VIMPUTAECONO,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALCOMIMPECO, 0, new IDVariant(v_VIMPUTAECONO));
        }
      }
      if (IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0).compareTo((new IDVariant("ACC")), true)!=0)
      {
        IDVariant v_VCOFOG = null;
        v_VCOFOG = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as VISRICCAPCOD ");
        SQL.append("from ");
        SQL.append("  VISTA_RICLASSIFICAZIONI_CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE_TIPO_RICL = 'COFOG') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOFOG = QV.Get("VISRICCAPCOD", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_VCOFOG)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, 0, new IDVariant(v_VCOFOG));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_COFOG, 0, MainFrm.CofogUnicoCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0)));
        }
      }
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        IDVariant v_FINANZIAMENT = new IDVariant(0,IDVariant.INTEGER);
        v_FINANZIAMENT = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINBILFINFIN ");
        SQL.append("from ");
        SQL.append("  BIL_FIN A, ");
        SQL.append("  FINANZIAMENTI B ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FINANZIAMENT = QV.Get("MINBILFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_FINANZIAMENT)))
        {
          IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
          v_OPERA = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIN(A.OPERA) as MINBILFINOPE ");
          SQL.append("from ");
          SQL.append("  BIL_FIN A, ");
          SQL.append("  OPERE B ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.CODICE = A.OPERA) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_OPERA = QV.Get("MINBILFINOPE", IDVariant.INTEGER) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_OPERA, 0, new IDVariant(v_OPERA));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_OPERA, 0, (new IDVariant()));
        }
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_PROGR_UNITA_ORGANIZZATIVA, 0, MainFrm.GetUOUnicaDaCap(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.FLOAT), ((IMDB.Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "ProponiDaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conferma
  // **********************************************************************
  public int Conferma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conferma Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoValoriComuniMov", "Conferma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void AGGVALCOMMOV_PARAMETRI647() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI647_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_VALORCOMUMOV, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_VALORCOMUMOV, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI647_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI647_RS, 0, IMDBDef5.TBL_VALORCOMUMOV, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 0, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 1, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 2, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 3, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 4, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDES, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 5, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 6, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMCKTIVI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 7, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_TIPO_VINCOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 8, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKECO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 9, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_FATTORE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 10, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CENTRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 11, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_COMP_DAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 12, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_COMP_AL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 13, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMIMPECO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 14, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKTRA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 15, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CODICE_COFOG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 16, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_COD_LIVELLO_5, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 17, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CODICE_EUROPEO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 18, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKCAP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 19, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 20, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 21, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_FINANZIAMENTO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 22, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_OPERA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 23, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_PROGR_UNITA_ORGANIZZATIVA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 24, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_BENEFICIARIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI647_RS, 25, 0, IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_NUM_QUIETANZA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_VALORCOMUMOV, 0);
      if (IMDB.Eof(IMDBDef5.TBL_VALORCOMUMOV, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_VALORCOMUMOV, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI647_RS, 0);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VALORCOMUMOV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VALORCOMUMOV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VALORCOMUMOV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VALORCOMUMOV, Cancel);
    // Stub
  }

  private void PAN_VALORCOMUMOV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VALORCOMUMOV_SCELDELIFORM)
    {
      this.IdxPanelActived = this.PAN_VALORCOMUMOV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMUMOV_SCELTACAPITO)
    {
      this.IdxPanelActived = this.PAN_VALORCOMUMOV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMUMOV_CODLIVELLO5)
    {
      this.IdxPanelActived = this.PAN_VALORCOMUMOV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CODLIVELLO5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMUMOV_CODICECOFOG)
    {
      this.IdxPanelActived = this.PAN_VALORCOMUMOV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CODICECOFOG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMUMOV_FATTORE)
    {
      this.IdxPanelActived = this.PAN_VALORCOMUMOV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMUMOV_CENTRO)
    {
      this.IdxPanelActived = this.PAN_VALORCOMUMOV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VALORCOMUMOV_CONFERMLABEL)
    {
      this.IdxPanelActived = this.PAN_VALORCOMUMOV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Conferma();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VALORCOMUMOV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VALORCOMUMOV_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VALORCOMUMOV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VALORCOMUMOV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VALORCOMUMOV_Init()
  {

    PAN_VALORCOMUMOV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VALORCOMUMOV.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, "413DE77F-2D79-43C9-ABCA-01DEFB38AAC9");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, "Delibera");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, MyGlb.PANEL_LIST, 0, -9999, 48, 16, 0, 0);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, MyGlb.PANEL_FORM, 388, 35, 236, 49, 0, 0);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, 0, 47);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, 1, 13);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, 0, 4);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, 1, 4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, "13DA8450-3A8F-4121-8A2C-F2F64FE713FC");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, "Capitolo");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_LIST, 0, -9999, 88, 16, 0, 0);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_FORM, 4, 39, 256, 49, 0, 0);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, 0, 46);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, 1, 13);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, 0, 4);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, 1, 4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, "25B27029-38FB-462D-A11C-2951BE03F7FE");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, "Descrizione");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_LIST, 0, -9999, 48, 16, 0, 0);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 91, 380, 49, 0, 0);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, 0, 65);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, 1, 13);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, 0, 4);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, 1, 4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, "4986DC72-D8C3-4660-8ABA-27A8E413E8D4");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, "Tipo Vincolo");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, -9999, 48, 16, 0, 0);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 143, 380, 49, 0, 0);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, 0, 67);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, 1, 13);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, 0, 4);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, 1, 4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, "7ABADA3B-E050-41DA-9977-1CE1F86F04D4");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, "Codici Trans. Elementare");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, "Codici Trans. Elementare");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, MyGlb.PANEL_LIST, 0, -9999, 504, 16, 0, 0);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, MyGlb.PANEL_FORM, 388, 91, 464, 101, 0, 0);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, 0, 139);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, 1, 13);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, 0, 4);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, 1, 4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_CODITRANELEM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, "E2C9B666-6571-4894-9BA5-831E5769E988");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, "Economica");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, MyGlb.VIS_GROUPSTYLE);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, MyGlb.PANEL_LIST, 0, -9999, 308, 16, 0, 0);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, MyGlb.PANEL_FORM, 4, 195, 848, 121, 0, 0);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, 0, 60);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, 1, 13);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, 0, 4);
    PAN_VALORCOMUMOV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, 1, 4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_GROUP, GRP_VALORCOMUMOV_ECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VALORCOMUMOV.SetSize(MyGlb.OBJ_FIELD, 37);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, "AB5B6F3A-11C6-42FF-BEB7-6BA28AB2C35E");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, "I valori indicati verranno valorizzati su tutte le righe selezionate. I campi considerati sono quelli selezionati tramite checkbox");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, "657981DD-59C7-4546-B510-D723C5E421B1");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, "CK DELIBERA");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, "C932BA47-3A18-4B10-9826-6EB956EFD13A");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, "SEDE DEL");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, "0DBA9C47-8172-4806-93A1-15DCDC7CA204");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, "-");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, "7866EA06-7784-4EB7-A7F8-F467CD2A7A39");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, "NUMERO DEL");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, "B88ADB10-7BD0-4E83-B005-853E41D95E34");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, "ANNO DEL");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, "B0FE7E10-399C-48BC-923F-A2E81A04FBB0");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, "/");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, "884F942F-0F8D-470C-B9BD-800A6EB85956");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, MyGlb.VIS_STATICBUTTON);
    PAN_VALORCOMUMOV.SetImage(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, 0, "wsearch1.gif", false);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, "B3C2BA45-A53D-48FA-9A41-01167545B791");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, "CK CAPITOLO");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, "544674F5-A67E-4E17-866A-6EAAFEAAD798");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, "CAPITOLO");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, "B2955B11-362B-4F8E-82C3-8CE470B65850");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, "/");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, "696EB5B4-6886-4EED-874D-45CE2FF2396C");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, MyGlb.VIS_STATICBUTTON);
    PAN_VALORCOMUMOV.SetImage(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, 0, "wsearch1.gif", false);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, "83462452-A1A0-439F-BB5F-86C21B19834C");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, "CK DESCRIZIONE");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, "A40ACCE3-8A0F-479B-A18A-575F3DE01612");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, "Descrizione");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, "313A9DA9-4600-412F-AB13-6917097EFC6D");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, "CK TIPO VINCOLO");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, "37D398D1-4D72-4191-9D28-882CA7AA8324");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, "48CD9916-D2B4-4283-9B20-61C797906CB5");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, "8724596B-654E-4F8F-AF66-6821742D4940");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, "CK TRANS");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, "01CCFEFB-7443-44E6-90A1-15F62144C08A");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, "Cod. V livello");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, "8CD48E76-265B-4FED-A778-311AC3E6C1DD");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, "DUAL Descr VLiv");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.VIS_VISULOOUPCF4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, "C3F03644-A439-44FB-976F-A70E77BAA489");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, "Cod. Cofog");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, "D30413F3-9B6B-45BE-A241-D4D7373357E1");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, "Cod. Europeo");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, "4BAD182B-BD48-4D85-8F38-F737B8A44C10");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, "DUAL Descr COFOG");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, "00554DEF-7136-43A9-9166-44DFE4A750F4");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, "CK ECONOMICA");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, "16630FC7-F495-4479-980F-E1FC2850E1A0");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, "Fattore");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, "A6F5A766-E851-47F0-924E-2C351747F0F2");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, "4F85A440-9CFF-4DF0-9FEB-F5EFFBA5AD22");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, "Centro");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, "FBA44C15-F835-41BE-A3B5-F0FA8683C98E");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, "39B9A1E4-8E86-464C-A223-EF04148C9CD1");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, "Competenza dal");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, "83024A10-451E-451A-939D-399288D7515B");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, "al");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.VIS_NORMALFIELDS);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, "6BC9BA5D-FE5E-411E-A44C-3BCAB2BE50FD");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, "Imputazione Economica");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, "F290F03F-FF72-4892-A7FA-9682F024313D");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, "Conferma");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_VALORCOMUMOV.SetImage(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, 0, "button1.gif", false);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, "38EC1C66-CFC3-46A9-B0F8-44D2641E0DFA");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, "FINANZIAMENTO");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, "F6BAD469-DF9D-424F-8CF1-411EB8836238");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, "OPERA");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, "A5CD8C10-2A19-46AF-B3EC-246F217F1909");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, "1151D674-326B-44C1-BD90-E43E3CB28500");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, "BENEFICIARIO");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.VIS_NORMFIELPADR);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VALORCOMUMOV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, "4C0E466C-5F9F-49B4-A415-698763D615D9");
    PAN_VALORCOMUMOV.set_Header(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_VALORCOMUMOV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, "");
    PAN_VALORCOMUMOV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.VIS_NORMFIELPADR);
    PAN_VALORCOMUMOV.SetFlags(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VALORCOMUMOV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, MyGlb.PANEL_LIST, 80, 8, 484, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, MyGlb.PANEL_FORM, 4, 8, 848, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_INTESTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_INTESTALABEL, -1, -1);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_LIST, 72);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_LIST, "CK DEL.");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_FORM, 392, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDELIBERA, MyGlb.PANEL_FORM, "CK DELIB.");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CKDELIBERA, -1, GRP_VALORCOMUMOV_DELIBERA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CKDELIBERA, PPQRY_PARAMETRI647, "A.VALOCOMCKDEL", "VALOCOMCKDEL", 5, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKDELIBERA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKDELIBERA, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_LIST, "SD. D.");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_FORM, 420, 60, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_SEDEDEL, -1, GRP_VALORCOMUMOV_DELIBERA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_SEDEDEL, PPQRY_PARAMETRI647, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, MyGlb.PANEL_LIST, 132, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, MyGlb.PANEL_FORM, 468, 60, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_TRATDELILABE, -1, GRP_VALORCOMUMOV_DELIBERA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_LIST, "NM. D.");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_FORM, 488, 60, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_NUMERODEL, -1, GRP_VALORCOMUMOV_DELIBERA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_NUMERODEL, PPQRY_PARAMETRI647, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_LIST, "AN. D.");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_FORM, 556, 60, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_ANNODEL, -1, GRP_VALORCOMUMOV_DELIBERA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_ANNODEL, PPQRY_PARAMETRI647, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, MyGlb.PANEL_LIST, 140, 72, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, MyGlb.PANEL_FORM, 536, 60, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_BARRDELILABE, -1, GRP_VALORCOMUMOV_DELIBERA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, MyGlb.PANEL_LIST, 292, 80, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, MyGlb.PANEL_FORM, 604, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELDELIFORM, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_SCELDELIFORM, -1, GRP_VALORCOMUMOV_DELIBERA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_SCELDELIFORM, -1, "", "SCELDELIFORM", 0, 0, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_LIST, 84);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_LIST, "CK CAPITOLO");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_FORM, 8, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKCAPITOLO, MyGlb.PANEL_FORM, "CK CAPITOLO");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CKCAPITOLO, -1, GRP_VALORCOMUMOV_CAPITOLO);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CKCAPITOLO, PPQRY_PARAMETRI647, "A.VALOCOMCKCAP", "VALOCOMCKCAP", 5, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKCAPITOLO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKCAPITOLO, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_FORM, 32, 64, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CAPITOLO, -1, GRP_VALORCOMUMOV_CAPITOLO);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CAPITOLO, PPQRY_PARAMETRI647, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_LIST, "/");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_FORM, 176, 64, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_FORM, 16);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ARTICOLO, MyGlb.PANEL_FORM, "/");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_ARTICOLO, -1, GRP_VALORCOMUMOV_CAPITOLO);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_ARTICOLO, PPQRY_PARAMETRI647, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, MyGlb.PANEL_LIST, 308, 96, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, MyGlb.PANEL_FORM, 240, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_SCELTACAPITO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_SCELTACAPITO, -1, GRP_VALORCOMUMOV_CAPITOLO);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_SCELTACAPITO, -1, "", "SCELTACAPITO", 0, 0, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_LIST, 92);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_LIST, "CK DSC.");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_FORM, 8, 116, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_FORM, 104);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKDESCRIZION, MyGlb.PANEL_FORM, "CK DESCRIZIONE");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CKDESCRIZION, -1, GRP_VALORCOMUMOV_DESCRIZIONE);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CKDESCRIZION, PPQRY_PARAMETRI647, "A.VALOCOMCKDES", "VALOCOMCKDES", 5, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKDESCRIZION, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKDESCRIZION, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 576, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_LIST, 104);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 116, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_DESCRIZIONE, -1, GRP_VALORCOMUMOV_DESCRIZIONE);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_DESCRIZIONE, PPQRY_PARAMETRI647, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_LIST, 96);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_LIST, "C. T. V.");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_FORM, 8, 168, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_FORM, 84);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTIPOVINCOL, MyGlb.PANEL_FORM, "CK TP. VINC.");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CKTIPOVINCOL, -1, GRP_VALORCOMUMOV_TIPOVINCOLO);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CKTIPOVINCOL, PPQRY_PARAMETRI647, "A.VALCOMCKTIVI", "VALCOMCKTIVI", 5, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKTIPOVINCOL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKTIPOVINCOL, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_LIST, "T. VN.");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_FORM, 32, 168, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_TIPOVINCOLO, MyGlb.PANEL_FORM, "TP. VINC.");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_TIPOVINCOLO, -1, GRP_VALORCOMUMOV_TIPOVINCOLO);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_TIPOVINCOLO, PPQRY_PARAMETRI647, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, MyGlb.PANEL_LIST, 656, 268, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, MyGlb.PANEL_FORM, 644, 116, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_ETICHETTASF1, -1, GRP_VALORCOMUMOV_CODITRANELEM);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_LIST, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_LIST, "CK TRANS");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_FORM, 392, 116, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKTRANS, MyGlb.PANEL_FORM, "CK TRANS");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CKTRANS, -1, GRP_VALORCOMUMOV_CODITRANELEM);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CKTRANS, PPQRY_PARAMETRI647, "A.VALOCOMCKTRA", "VALOCOMCKTRA", 5, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKTRANS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKTRANS, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_FORM, 412, 120, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_FORM, 80);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CODLIVELLO5, -1, GRP_VALORCOMUMOV_CODITRANELEM);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CODLIVELLO5, PPQRY_PARAMETRI647, "A.COD_LIVELLO_5", "COD_LIVELLO_5", 3, 10, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_LIST, 108);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_LIST, "DUAL Descr VLiv");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_FORM, 584, 120, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_FORM, 108);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCVLIV, MyGlb.PANEL_FORM, "DUAL Descr VLiv");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_DUALDESCVLIV, -1, GRP_VALORCOMUMOV_CODITRANELEM);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_DUALDESCVLIV, PPQRY_DUAL, "GET_DESCR_COD_5_LIVELLO(~~COD_LIVELLO_5~~,DECODE(~~TBL_VALORCOMUMOV.VALCOMTIPMOV~~, 'ACC', 'E', 'S'),~~TBL_DATISESSIONE.SESSIOESERCI~~)", "DESCRVLIVU", 5, 99, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_LIST, "Cod. Cofog");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_FORM, 424, 144, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_FORM, 68);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICECOFOG, MyGlb.PANEL_FORM, "Cod. Cofog");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CODICECOFOG, -1, GRP_VALORCOMUMOV_CODITRANELEM);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CODICECOFOG, PPQRY_PARAMETRI647, "A.CODICE_COFOG", "CODICE_COFOG", 1, 3, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_FORM, 412, 168, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_FORM, 80);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CODICEEUROPE, -1, GRP_VALORCOMUMOV_CODITRANELEM);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CODICEEUROPE, PPQRY_PARAMETRI647, "A.CODICE_EUROPEO", "CODICE_EUROPEO", 1, 1, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_LIST, 116);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_LIST, "DUAL Descr COFOG");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_FORM, 584, 144, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_FORM, 116);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_DUALDESCCOFO, MyGlb.PANEL_FORM, "DUAL Descr COFOG");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_DUALDESCCOFO, -1, GRP_VALORCOMUMOV_CODITRANELEM);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_DUALDESCCOFO, PPQRY_DUAL, "GET_DESCR_COD_COFOG(~~CODICE_COFOG~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,DECODE(~~TBL_VALORCOMUMOV.VALCOMTIPMOV~~, 'ACC', 'E', 'S'))", "DESCRCOFOG", 5, 99, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_LIST, 92);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_LIST, "CK ECONOMICA");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_FORM, 8, 220, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_FORM, 92);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CKECONOMICA, MyGlb.PANEL_FORM, "CK ECONOMICA");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CKECONOMICA, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CKECONOMICA, PPQRY_PARAMETRI647, "A.VALOCOMCKECO", "VALOCOMCKECO", 5, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKECONOMICA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_CKECONOMICA, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_FORM, 8, 244, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_FATTORE, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_FATTORE, PPQRY_PARAMETRI647, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_LIST, 136);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_FORM, 216, 244, 632, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_FORM, 136);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FATTORDESCRI, MyGlb.PANEL_FORM, "FATTORI DESCRIZIONE");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_FATTORDESCRI, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_FORM, 8, 268, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CENTRO, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CENTRO, PPQRY_PARAMETRI647, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_LIST, 128);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_FORM, 216, 268, 632, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_FORM, 128);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENTRI DESCRIZIONE");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CENTRIDESCRI, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_LIST, 68);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_LIST, "Comp. dal");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_FORM, 8, 292, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_FORM, 64);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPDAL, MyGlb.PANEL_FORM, "Comp. dal");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_COMPDAL, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_COMPDAL, PPQRY_PARAMETRI647, "A.COMP_DAL", "COMP_DAL", 6, 10, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_LIST, 60);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_LIST, "al");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_FORM, 184, 292, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_FORM, 28);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_COMPAL, MyGlb.PANEL_FORM, "al");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_COMPAL, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_COMPAL, PPQRY_PARAMETRI647, "A.COMP_AL", "COMP_AL", 6, 10, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_LIST, 0, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_LIST, 156);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_LIST, "Imputazione Economica");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_FORM, 324, 292, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_FORM, 156);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imputazione Economica");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_IMPUTAECONOM, -1, GRP_VALORCOMUMOV_ECONOMICA);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_IMPUTAECONOM, PPQRY_PARAMETRI647, "A.VALCOMIMPECO", "VALCOMIMPECO", 5, 2, 0, -13997);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VALORCOMUMOV.SetValueListItem(PFL_VALORCOMUMOV_IMPUTAECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, MyGlb.PANEL_LIST, 552, 336, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, MyGlb.PANEL_LIST, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, MyGlb.PANEL_FORM, 768, 416, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, MyGlb.PANEL_FORM, 0);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_CONFERMLABEL, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_CONFERMLABEL, -1, -1);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_CONFERMLABEL, -1, "", "CONFERMLABEL", 0, 0, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 524, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_FINANZIAMENT, -1, -1);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_FINANZIAMENT, PPQRY_PARAMETRI647, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_FORM, 4, 548, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_OPERA, -1, -1);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_OPERA, PPQRY_PARAMETRI647, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 452, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_PROGUNITORGA, -1, -1);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_PROGUNITORGA, PPQRY_PARAMETRI647, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_LIST, 88);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFICIARIO");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 452, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_FORM, 88);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFICIARIO");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_BENEFICIARIO, -1, -1);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_BENEFICIARIO, PPQRY_PARAMETRI647, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_VALORCOMUMOV.SetRect(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 476, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VALORCOMUMOV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_VALORCOMUMOV.SetNumRow(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_VALORCOMUMOV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VALORCOMUMOV_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIETANZA");
    PAN_VALORCOMUMOV.SetFieldPage(PFL_VALORCOMUMOV_NUMQUIETANZA, -1, -1);
    PAN_VALORCOMUMOV.SetFieldPanel(PFL_VALORCOMUMOV_NUMQUIETANZA, PPQRY_PARAMETRI647, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
  }

  private void PAN_VALORCOMUMOV_InitQueries()
  {
    StringBuffer SQL;

    PAN_VALORCOMUMOV.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_VALORCOMUMOV.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_VALORCOMUMOV.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORCOMUMOV.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
    PAN_VALORCOMUMOV.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_VALORCOMUMOV.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORCOMUMOV.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_DESCR_COD_5_LIVELLO(~~COD_LIVELLO_5~~,DECODE(~~TBL_VALORCOMUMOV.VALCOMTIPMOV~~, 'ACC', 'E', 'S'),~~TBL_DATISESSIONE.SESSIOESERCI~~) as DESCRVLIVU, ");
    SQL.append("  GET_DESCR_COD_COFOG(~~CODICE_COFOG~~,~~TBL_DATISESSIONE.SESSIOESERCI~~,DECODE(~~TBL_VALORCOMUMOV.VALCOMTIPMOV~~, 'ACC', 'E', 'S')) as DESCRCOFOG ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VALORCOMUMOV.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_VALORCOMUMOV.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORCOMUMOV.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMUMOV.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_VALORCOMUMOV_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMUMOV.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_VALORCOMUMOV_TIPOVINCOLO, "");
    PAN_VALORCOMUMOV.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.CODICE = ~~CODICE_EUROPEO~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_VALORCOMUMOV.VALCOMTIPMOV~~, 'ACC', 'E', 'S')) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMUMOV.SetQuery(PPQRY_CODTRANSEURO, 0, SQL, PFL_VALORCOMUMOV_CODICEEUROPE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.E_S = DECODE(~~TBL_VALORCOMUMOV.VALCOMTIPMOV~~, 'ACC', 'E', 'S')) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VALORCOMUMOV.SetQuery(PPQRY_CODTRANSEURO, 1, SQL, PFL_VALORCOMUMOV_CODICEEUROPE, "");
    PAN_VALORCOMUMOV.SetQueryDB(PPQRY_CODTRANSEURO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VALORCOMUMOV.SetIMDB(IMDB, "PQRY_PARAMETRI647", true);
    PAN_VALORCOMUMOV.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_VALORCOMUMOV.SetQueryIMDB(PPQRY_PARAMETRI647, IMDBDef14.PQRY_PARAMETRI647_RS, IMDBDef5.TBL_VALORCOMUMOV);
    JustLoaded = true;
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CKDELIBERA, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDEL);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_SEDEDEL, IMDBDef5.FLD_VALORCOMUMOV_SEDE_DEL);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_NUMERODEL, IMDBDef5.FLD_VALORCOMUMOV_NUMERO_DEL);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_ANNODEL, IMDBDef5.FLD_VALORCOMUMOV_ANNO_DEL);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CKCAPITOLO, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKCAP);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CAPITOLO, IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_ARTICOLO, IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CKDESCRIZION, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDES);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_DESCRIZIONE, IMDBDef5.FLD_VALORCOMUMOV_DESCRIZIONE);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CKTIPOVINCOL, IMDBDef5.FLD_VALORCOMUMOV_VALCOMCKTIVI);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_TIPOVINCOLO, IMDBDef5.FLD_VALORCOMUMOV_TIPO_VINCOLO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CKTRANS, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKTRA);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CODLIVELLO5, IMDBDef5.FLD_VALORCOMUMOV_COD_LIVELLO_5);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CODICECOFOG, IMDBDef5.FLD_VALORCOMUMOV_CODICE_COFOG);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CODICEEUROPE, IMDBDef5.FLD_VALORCOMUMOV_CODICE_EUROPEO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CKECONOMICA, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKECO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_FATTORE, IMDBDef5.FLD_VALORCOMUMOV_FATTORE);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_CENTRO, IMDBDef5.FLD_VALORCOMUMOV_CENTRO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_COMPDAL, IMDBDef5.FLD_VALORCOMUMOV_COMP_DAL);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_COMPAL, IMDBDef5.FLD_VALORCOMUMOV_COMP_AL);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_IMPUTAECONOM, IMDBDef5.FLD_VALORCOMUMOV_VALCOMIMPECO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_FINANZIAMENT, IMDBDef5.FLD_VALORCOMUMOV_FINANZIAMENTO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_OPERA, IMDBDef5.FLD_VALORCOMUMOV_OPERA);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_PROGUNITORGA, IMDBDef5.FLD_VALORCOMUMOV_PROGR_UNITA_ORGANIZZATIVA);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_BENEFICIARIO, IMDBDef5.FLD_VALORCOMUMOV_BENEFICIARIO);
    PAN_VALORCOMUMOV.SetFieldPrimaryIndex(PFL_VALORCOMUMOV_NUMQUIETANZA, IMDBDef5.FLD_VALORCOMUMOV_NUM_QUIETANZA);
    PAN_VALORCOMUMOV.SetMasterTable(0, "VALORCOMUMOV");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VALORCOMUMOV.Status() == 2)
    {
      int oldListQBE = PAN_VALORCOMUMOV.iUseListQBE;
      PAN_VALORCOMUMOV.iUseListQBE = 0;
      PAN_VALORCOMUMOV.PanelCommand(Glb.PCM_SEARCH);
      PAN_VALORCOMUMOV.PanelCommand(Glb.PCM_FIND);
      PAN_VALORCOMUMOV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VALORCOMUMOV) PAN_VALORCOMUMOV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALORCOMUMOV) PAN_VALORCOMUMOV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VALORCOMUMOV) PAN_VALORCOMUMOV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VALORCOMUMOV) PAN_VALORCOMUMOV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VALORCOMUMOV) PAN_VALORCOMUMOV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
