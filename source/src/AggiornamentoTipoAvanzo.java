// **********************************************
// Aggiornamento Tipo Avanzo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AggiornamentoTipoAvanzo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_TIPOVARIAZIO = 0;
  private static int PFL_PARAMETRI_SOLTIPVAPEAV = 1;

  private static int PPQRY_PARAMETRI649 = 0;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_TABBEDVIEW;
  private static int GRP_VARIAZIMPEGN_IMPEGNO1 = 0;

  private static int PFL_VARIAZIMPEGN_PROGRESSIVO1 = 0;
  private static int PFL_VARIAZIMPEGN_CAPITOLO1 = 1;
  private static int PFL_VARIAZIMPEGN_ARTICOLO1 = 2;
  private static int PFL_VARIAZIMPEGN_CAPDESCRIZI1 = 3;
  private static int PFL_VARIAZIMPEGN_CAPLIVELLO5 = 4;
  private static int PFL_VARIAZIMPEGN_ANNOVAR1 = 5;
  private static int PFL_VARIAZIMPEGN_NUMEROIMP1 = 6;
  private static int PFL_VARIAZIMPEGN_ANNOIMP1 = 7;
  private static int PFL_VARIAZIMPEGN_INFOIMP = 8;
  private static int PFL_VARIAZIMPEGN_DDATAREG1 = 9;
  private static int PFL_VARIAZIMPEGN_DESCRIZIONE1 = 10;
  private static int PFL_VARIAZIMPEGN_IMPORTO1 = 11;
  private static int PFL_VARIAZIMPEGN_TIPOVAR1 = 12;
  private static int PFL_VARIAZIMPEGN_TIPOAVANZO1 = 13;
  private static int PFL_VARIAZIMPEGN_DESCRIZIONU1 = 14;
  private static int PFL_VARIAZIMPEGN_TIPOVINCOLO1 = 15;
  private static int PFL_VARIAZIMPEGN_FINANZIAMEN1 = 16;
  private static int PFL_VARIAZIMPEGN_OPERA1 = 17;
  private static int PFL_VARIAZIMPEGN_PROGUNITORGA = 18;
  private static int PFL_VARIAZIMPEGN_UTENTEINSER1 = 19;
  private static int PFL_VARIAZIMPEGN_DATAINSERIM1 = 20;
  private static int PFL_VARIAZIMPEGN_UTENTULTIAG1 = 21;
  private static int PFL_VARIAZIMPEGN_DATAULTIMAG1 = 22;
  private static int PFL_VARIAZIMPEGN_GESTIOAVANZ1 = 23;

  private static int PPQRY_VARIMP7 = 0;

  private static int PPQRY_CAP1 = 1;
  private static int PPQRY_DUAL1 = 2;
  private static int PPQRY_IMP1 = 3;

  private static int PPQRY_T57 = 4;
  private static int PPQRY_TIPIAVANZO1 = 5;
  private static int PPQRY_VINCOLI1 = 6;
  private static int PPQRY_FINANZIAMEN1 = 7;
  private static int PPQRY_OPERE1 = 8;


  IDPanel PAN_VARIAZIMPEGN;
  private static int GRP_VARIAZACCERT_ACCERTAMENTO = 0;

  private static int PFL_VARIAZACCERT_PROGRESSIVO = 0;
  private static int PFL_VARIAZACCERT_CAPITOLO = 1;
  private static int PFL_VARIAZACCERT_ARTICOLO = 2;
  private static int PFL_VARIAZACCERT_CAPDESCRIZIO = 3;
  private static int PFL_VARIAZACCERT_CAPLIVELLO4 = 4;
  private static int PFL_VARIAZACCERT_ANNOVAR = 5;
  private static int PFL_VARIAZACCERT_NUMEROACC = 6;
  private static int PFL_VARIAZACCERT_ANNOACC = 7;
  private static int PFL_VARIAZACCERT_INFOACC = 8;
  private static int PFL_VARIAZACCERT_DDATAREG = 9;
  private static int PFL_VARIAZACCERT_DESCRIZIONE = 10;
  private static int PFL_VARIAZACCERT_IMPORTO = 11;
  private static int PFL_VARIAZACCERT_TIPOVAR = 12;
  private static int PFL_VARIAZACCERT_TIPOAVANZO = 13;
  private static int PFL_VARIAZACCERT_DESCRIZIONUO = 14;
  private static int PFL_VARIAZACCERT_TIPOVINCOLO = 15;
  private static int PFL_VARIAZACCERT_FINANZIAMENT = 16;
  private static int PFL_VARIAZACCERT_OPERA = 17;
  private static int PFL_VARIAZACCERT_UTENTEINSERI = 18;
  private static int PFL_VARIAZACCERT_DATAINSERIME = 19;
  private static int PFL_VARIAZACCERT_UTENTULTIAGG = 20;
  private static int PFL_VARIAZACCERT_DATAULTIMAGG = 21;
  private static int PFL_VARIAZACCERT_GESTIOAVANZO = 22;
  private static int PFL_VARIAZACCERT_ACCPROUNIORG = 23;

  private static int PPQRY_VARACC4 = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_ACC = 3;

  private static int PPQRY_T56 = 4;
  private static int PPQRY_TIPIAVANZO = 5;
  private static int PPQRY_VINCOLI = 6;
  private static int PPQRY_FINANZIAMENT = 7;
  private static int PPQRY_OPERE = 8;


  IDPanel PAN_VARIAZACCERT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI650(IMDB);
    //
    //
    Init_PQRY_PARAMETRI649(IMDB);
    Init_PQRY_PARAMETRI649_RS(IMDB);
    Init_PQRY_VARIMP7(IMDB);
    Init_PQRY_VARACC4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI650(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI650, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI650, "TBL_PARAMETRI650");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI650,IMDBDef4.FLD_PARAMETRI650_PARATIPOVARI, "PARATIPOVARI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI650,IMDBDef4.FLD_PARAMETRI650_PARATIPOVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI650,IMDBDef4.FLD_PARAMETRI650_PASOTIVAPEAV, "PASOTIVAPEAV");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI650,IMDBDef4.FLD_PARAMETRI650_PASOTIVAPEAV,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI650, 0);
  }

  private static void Init_PQRY_PARAMETRI649(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI649, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI649, "PQRY_PARAMETRI649");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI649,IMDBDef12.PQSL_PARAMETRI649_PARATIPOVARI, "PARATIPOVARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI649,IMDBDef12.PQSL_PARAMETRI649_PARATIPOVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI649,IMDBDef12.PQSL_PARAMETRI649_PASOTIVAPEAV, "PASOTIVAPEAV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI649,IMDBDef12.PQSL_PARAMETRI649_PASOTIVAPEAV,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI649, 0);
  }

  private static void Init_PQRY_PARAMETRI649_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI649_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI649_RS, "PQRY_PARAMETRI649_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI649_RS,IMDBDef12.PQSL_PARAMETRI649_PARATIPOVARI, "PARATIPOVARI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI649_RS,IMDBDef12.PQSL_PARAMETRI649_PARATIPOVARI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI649_RS,IMDBDef12.PQSL_PARAMETRI649_PASOTIVAPEAV, "PASOTIVAPEAV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI649_RS,IMDBDef12.PQSL_PARAMETRI649_PASOTIVAPEAV,5,2,0);
  }

  private static void Init_PQRY_VARIMP7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARIMP7, 20);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARIMP7, "PQRY_VARIMP7");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPGESTIO, "VARIMPGESTIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPGESTIO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPPRUNOR, "VARIMPPRUNOR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPPRUNOR,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_TIPO_VINCOLO,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPFINANZ, "VARIMPFINANZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPFINANZ,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPOPERA, "VARIMPOPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARIMP7,IMDBDef12.PQSL_VARIMP7_VARIMPOPERA,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARIMP7, 0);
  }

  private static void Init_PQRY_VARACC4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARACC4, 20);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARACC4, "PQRY_VARACC4");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCGESTIO, "VARACCGESTIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCGESTIO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCPRUNOR, "VARACCPRUNOR");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCPRUNOR,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARATIPOVINC, "VARATIPOVINC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARATIPOVINC,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCFINANZ, "VARACCFINANZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCFINANZ,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCOPERA, "VARACCOPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARACC4,IMDBDef12.PQSL_VARACC4_VARACCOPERA,1,19,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARACC4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AggiornamentoTipoAvanzo(MyWebEntryPoint w, IMDBObj imdb)
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
  public AggiornamentoTipoAvanzo()
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
    FormIdx = MyGlb.FRM_AGGITIPOAVA1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9AA3915F-C546-4597-B657-6BB421BB8A98";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1120;
    DesignHeight = 414;
    set_Caption(new IDVariant("Aggiornamento Tipo Avanzo"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1120;
    Frames[1].Height = 388;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0927835;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1120;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 36;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1120-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B07D85CA-E231-42BE-BAEE-61D28F79FFAC");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 96, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1120;
    Frames[3].Height = 352;
    Frames[3].Caption = "Tabbed View";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 352;
    TAB_TABBEDVIEW = new OTabView(this);
    Frames[3].Content = TAB_TABBEDVIEW;
    TAB_TABBEDVIEW.iGuid = "1B10354B-67EE-4A84-BF0F-B9D554C63D2D";
    TAB_TABBEDVIEW.SetItemCount(2);
    TAB_TABBEDVIEW.Placement = 1;
    TAB_TABBEDVIEW.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Variazioni Impegni";
    Frames[4].Parent = this;
    PAN_VARIAZIMPEGN = new IDPanel(w, this, 4, "PAN_VARIAZIMPEGN");
    Frames[4].Content = PAN_VARIAZIMPEGN;
    PAN_VARIAZIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1120-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7556B4D4-D939-4555-936B-0AD3CFAA69D0");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1890, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIMPEGN.InitStatus = 1;
    PAN_VARIAZIMPEGN_Init();
    PAN_VARIAZIMPEGN_InitFields();
    PAN_VARIAZIMPEGN_InitQueries();
    TAB_TABBEDVIEW.SetItem(1, Frames[4], 0, "", "Variazioni Impegni", "");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Variazioni Accertamenti";
    Frames[5].Parent = this;
    PAN_VARIAZACCERT = new IDPanel(w, this, 5, "PAN_VARIAZACCERT");
    Frames[5].Content = PAN_VARIAZACCERT;
    PAN_VARIAZACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZACCERT.VS = MainFrm.VisualStyleList;
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1120-MyGlb.PAN_OFFS_X, 352-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B44A2DD5-C422-4E4E-956C-9D84BF2C69E2");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1890, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZACCERT.InitStatus = 1;
    PAN_VARIAZACCERT_Init();
    PAN_VARIAZACCERT_InitFields();
    PAN_VARIAZACCERT_InitQueries();
    TAB_TABBEDVIEW.SetItem(2, Frames[5], 0, "", "Variazioni Accertamenti", "");
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
      if (CmdIdx==MyGlb.CMD_STAMPAIMPEGN+BaseCmdLinIdx)
      {
        StampaImpegni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZAGGIIMPE+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZAGGIIMP1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGGIIMPE+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGITIPOAVA1+BaseCmdLinIdx)
      {
        AggiornaTipoAvanzo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGTIPAVSUM1+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_AGGTIPAVSUMO, 0, this);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMPAACCERT+BaseCmdLinIdx)
      {
        StampaAccertamenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZAGGIACCE+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPFUNAGGACC+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGGIACCE+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGITIPOAVA2+BaseCmdLinIdx)
      {
        AggiornaTipoAvanzoAccertamenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGTIPAVSUMO+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_AGGTIPAVSUMO, 0, this);
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI650, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AGGITIPOAVA1_PARAMETRI649();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_VARIAZIMPEGN.UpdatePanel(MainFrm);
      PAN_VARIAZACCERT.UpdatePanel(MainFrm);
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
    return (obj instanceof AggiornamentoTipoAvanzo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AggiornamentoTipoAvanzo.class.getName() : (Glb.ClassWithPackage(AggiornamentoTipoAvanzo.class) ? AggiornamentoTipoAvanzo.class.getName().substring(AggiornamentoTipoAvanzo.class.getPackage().getName().length() + 1) : AggiornamentoTipoAvanzo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI650, IMDBDef4.FLD_PARAMETRI650_PARATIPOVARI, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI650, IMDBDef4.FLD_PARAMETRI650_PASOTIVAPEAV, 0, (new IDVariant("SI")));
      PAN_VARIAZIMPEGN.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZACCERT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIMPEGN.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZACCERT.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "Load", _e);
    }
  }

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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI650, IMDBDef4.FLD_PARAMETRI650_PARATIPOVARI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI650, IMDBDef4.FLD_PARAMETRI650_PASOTIVAPEAV, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;
    IDCachedRowSet C10;

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGGITIPOAVAN)), true) && Result.booleanValue() && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI653, IMDBDef12.PQSL_PARAMETRI653_PARATIPOAVAN, 0))))
      {
        IDVariant v_AGGIORNATO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant I = null;
        I = (new IDVariant(1));
        if (new IDVariant(TAB_TABBEDVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_VARIAZIMPEGN.FrIndex)), true))
        {
          C4 = PAN_VARIAZIMPEGN.MasterRS();
          if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
          if (!C4.Bof()) PAN_VARIAZIMPEGN.GotoFirst();
          while (!PAN_VARIAZIMPEGN.RSEOF())
          {
            if (PAN_VARIAZIMPEGN.IsRowSelected(I.intValue()) && C4.Get("VARIMPGESTIO").equals((new IDVariant("SI")), true))
            {
              v_AGGIORNATO = (new IDVariant(-1));
              try
              {
                SQL = new StringBuffer();
                SQL.append("update VARIMP set ");
                SQL.append("  TIPO_AVANZO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI653, IMDBDef12.PQSL_PARAMETRI653_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                SQL.append("where (PROGRESSIVO = " + IDL.CSql(C4.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              catch (Exception e7)
              {
                MainFrm.set_AlertMessage(new IDVariant(e7.getMessage())); 
                return;
              }
            }
            I = IDL.Add(I, (new IDVariant(1)));
            PAN_VARIAZIMPEGN.GotoNext();
          }
          if (CurPos>0) C4.absolute(CurPos);
          PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_REQUERY);
        }
        else
        {
          C10 = PAN_VARIAZACCERT.MasterRS();
          if (C10.size()>0) CurPos = C10.getRow(); else CurPos = 0;
          if (!C10.Bof()) PAN_VARIAZACCERT.GotoFirst();
          while (!PAN_VARIAZACCERT.RSEOF())
          {
            if (PAN_VARIAZACCERT.IsRowSelected(I.intValue()) && C10.Get("VARACCGESTIO").equals((new IDVariant("SI")), true))
            {
              v_AGGIORNATO = (new IDVariant(-1));
              try
              {
                SQL = new StringBuffer();
                SQL.append("update VARACC set ");
                SQL.append("  TIPO_AVANZO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI653, IMDBDef12.PQSL_PARAMETRI653_PARATIPOAVAN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                SQL.append("where (PROGRESSIVO = " + IDL.CSql(C10.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              catch (Exception e13)
              {
                MainFrm.set_AlertMessage(new IDVariant(e13.getMessage())); 
                return;
              }
            }
            I = IDL.Add(I, (new IDVariant(1)));
            PAN_VARIAZACCERT.GotoNext();
          }
          if (CurPos>0) C10.absolute(CurPos);
          PAN_VARIAZACCERT.PanelCommand(Glb.PCM_REQUERY);
        }
        if (!(v_AGGIORNATO.booleanValue()))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Non è stata selezionata nessuna riga aggiornabile"));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_UNITAORGANIZ)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = IDL.Add((new IDVariant("=")), IMDB.Value(IMDBDef7.PQRY_SO4ANAUNIORG, IMDBDef7.PQSL_SO4ANAUNIORG_SOANUNORCOUO, 0));
        if (new IDVariant(TAB_TABBEDVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_VARIAZIMPEGN.FrIndex)), true))
        {
          PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_FIND);
        }
        else
        {
          PAN_VARIAZACCERT.PanelCommand(Glb.PCM_FIND);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
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
      // Variazioni Impegni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_CAPDESCRIZI1,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_CAPDESCRIZI1))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_DESCRIZIONE1,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_DESCRIZIONE1))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TIPOVAR1,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_TIPOVAR1))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TIPOAVANZO1,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_TIPOAVANZO1))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TIPOVINCOLO1,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_TIPOVINCOLO1))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_FINANZIAMEN1,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_FINANZIAMEN1))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_OPERA1,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_OPERA1))).stringValue()); 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_VARIMPGESTIO, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZIMPEGN.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "VariazioniImpegniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegni On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Impegni On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_VARIAZIMPEGN.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETIMP1+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETIMP1+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "VariazioniImpegniOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegni On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
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
      // Variazioni Impegni On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_DATA_INSERIMENTO, 0, IDL.Today());
      }
      else
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_DATA_INSERIMENTO, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "VariazioniImpegniOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegni After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Impegni After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "VariazioniImpegniAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Variazioni Accertamenti On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZACCERT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZACCERT);
      // 
      // Variazioni Accertamenti On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_CAPDESCRIZIO,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_CAPDESCRIZIO))).stringValue()); 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_DESCRIZIONE,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_TIPOVAR,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_TIPOVAR))).stringValue()); 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_TIPOAVANZO,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_TIPOAVANZO))).stringValue()); 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_TIPOVINCOLO,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_TIPOVINCOLO))).stringValue()); 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_FINANZIAMENT,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_FINANZIAMENT))).stringValue()); 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_OPERA,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_OPERA))).stringValue()); 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_VARACC4, IMDBDef12.PQSL_VARACC4_VARACCGESTIO, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_VARIAZACCERT.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAZACCERT.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "VariazioniAccertamentiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni Accertamenti On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_VARIAZACCERT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Accertamenti On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_VARIAZACCERT.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETACC2+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETACC2+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "VariazioniAccertamentiOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Variazioni Accertamenti After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_VARIAZACCERT_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Accertamenti After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_VARIAZACCERT.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "VariazioniAccertamentiAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Apri Info Impegno
  // **********************************************************************
  public int ApriInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Impegno Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_ANNO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "ApriInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Impegni
  // **********************************************************************
  public int StampaImpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Impegni Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI652, IMDBDef4.FLD_PARAMETRI652_PARAMVARIAZI, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_VARPERTIPAVA, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "StampaImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Tipo Avanzo
  // **********************************************************************
  public int AggiornaTipoAvanzo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Tipo Avanzo Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_AGGITIPOAVAN, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "AggiornaTipoAvanzo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Acc
  // **********************************************************************
  public int ApriInfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Acc Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARACC4, IMDBDef12.PQSL_VARACC4_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARACC4, IMDBDef12.PQSL_VARACC4_ANNO_ACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef12.PQRY_VARACC4, IMDBDef12.PQSL_VARACC4_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef12.PQRY_VARACC4, IMDBDef12.PQSL_VARACC4_ANNO_ACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "ApriInfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Accertamenti
  // **********************************************************************
  public int StampaAccertamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Accertamenti Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI652, IMDBDef4.FLD_PARAMETRI652_PARAMVARIAZI, 0, (new IDVariant("A")));
      MainFrm.Show(MyGlb.FRM_VARPERTIPAVA, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "StampaAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Tipo Avanzo Accertamenti
  // **********************************************************************
  public int AggiornaTipoAvanzoAccertamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Tipo Avanzo Accertamenti Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_AGGITIPOAVAN, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "AggiornaTipoAvanzoAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Codice UO
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CodiceUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codice UO Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_UNITAORGANIZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AggiornamentoTipoAvanzo", "CodiceUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void AGGITIPOAVA1_PARAMETRI649() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI649_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI650, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI650, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI649_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI649_RS, 0, IMDBDef4.TBL_PARAMETRI650, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI649_RS, 0, 0, IMDBDef4.TBL_PARAMETRI650, IMDBDef4.FLD_PARAMETRI650_PARATIPOVARI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI649_RS, 1, 0, IMDBDef4.TBL_PARAMETRI650, IMDBDef4.FLD_PARAMETRI650_PASOTIVAPEAV, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI650, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI650, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI650, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI649_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void TAB_TABBEDVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

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
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_INFOIMP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAZIMPEGN_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_VARIMP7, IMDBDef12.PQSL_VARIMP7_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_VARIAZIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VARIAZACCERT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZACCERT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZACCERT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZACCERT, Cancel);
    // Stub
  }

  private void PAN_VARIAZACCERT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZACCERT_INFOACC)
    {
      this.IdxPanelActived = this.PAN_VARIAZACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZACCERT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZACCERT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZACCERT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "BC6F350F-EDF0-4853-9ACC-5A6CBA714223");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, "83B55EAE-F16B-460C-8F0A-B76D37E7D843");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, "Solo Tipi Variazione per Avanzo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Variaz.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 8, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVARIAZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVARIAZIO, PPQRY_PARAMETRI649, "A.PARATIPOVARI", "PARATIPOVARI", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVARIAZIO, (new IDVariant("A")), "Con Avanzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVARIAZIO, (new IDVariant("N")), "Senza Avanzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOVARIAZIO, (new IDVariant("T")), "Tutte", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_LIST, "S. T. Vr. p. A.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_FORM, 308, 8, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_FORM, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLTIPVAPEAV, MyGlb.PANEL_FORM, "Solo Tipi Variazione per Avanzo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLTIPVAPEAV, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLTIPVAPEAV, PPQRY_PARAMETRI649, "A.PASOTIVAPEAV", "PASOTIVAPEAV", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLTIPVAPEAV, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLTIPVAPEAV, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI649", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI649, IMDBDef12.PQRY_PARAMETRI649_RS, IMDBDef4.TBL_PARAMETRI650);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVARIAZIO, IMDBDef4.FLD_PARAMETRI650_PARATIPOVARI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLTIPVAPEAV, IMDBDef4.FLD_PARAMETRI650_PASOTIVAPEAV);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI650");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIAZIMPEGN_Init()
  {

    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, "D114A404-B6E4-40CD-A7CA-52CF64E2DA00");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, "Impegno");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, MyGlb.PANEL_LIST, 374, -9999, 124, 16, 0, 0);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, MyGlb.PANEL_FORM, 0, 3, 504, 253, 0, 0);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, 0, 51);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, 1, 13);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, 0, 4);
    PAN_VARIAZIMPEGN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, 1, 4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIMPEGN_IMPEGNO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, "C4E5CE43-0D6D-43A4-8293-66653FA2C002");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, "PROGRESSIVO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, "32EED78B-4B18-40A7-B0E9-74AEC694E7F0");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, "Capitolo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, "600786C8-A187-4519-A957-F12E10115F05");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, "Art.");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, "68FABFCB-2415-43F2-B82D-73DF27238160");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, "Descrione Capitolo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, "CDA99406-A2ED-4E48-B87D-FEBA1665DD48");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, "Livello IV");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, "24D91538-6ED4-4DC8-BBFD-7CB683C0B158");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, "Anno Var.");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, "3CC88BC5-F239-4808-99A9-582A8FA74FA9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, "Numero");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, "0ED927E9-67BB-4EB3-9816-8944FA4405A7");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, "Anno");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, "78AEC783-A1C3-4794-89FF-7F1779CE364C");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, " ");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, "Info Impegno");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_VERTICAL | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, "A7B7579A-080B-4F2E-843B-0EB0AAA4A29C");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, "Data Variazione");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, "D0B57298-39F4-4A42-9040-A7944D660CD4");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, "Descrizione Variazione");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, "4C039953-A663-423E-9FF7-2D84622C6DEB");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, "Importo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, "55116E59-783E-4517-B0AD-81E85391D550");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, "Tipo Variazione");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, "1864B895-DD25-4B98-A957-29772BD378FD");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, "Tipo Avanzo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, "483117CA-58C8-4FB2-8A26-5807E52F47F9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, "Unità Organizzativa");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, "A396D4D8-C7D8-4679-931E-52FC6170FDE2");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, "78AD50C6-2CBC-4597-9D4B-A2E63962D368");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, "Finanziamento");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, "B130516D-59A0-4CCA-96CF-8AB063F4B9CD");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, "Opera");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, "FAB9C15A-ED57-4F12-8414-26274CFA5157");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, "Unità Organizzativa");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, "54AA20C8-DC2F-4314-A36A-AB5D431117F9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, "11CBF52D-44C0-484D-A930-8FCF9EEC116E");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, "170533FC-8403-4F0E-BB1D-C408F813DCFB");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, "FD762950-ED4E-4D73-A9D6-0C75562F4F78");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, "007F6140-5AE4-49BE-A099-5D30CBA16B1A");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, "GESTIONE AVANZO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_LIST, 772, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGR.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_PROGRESSIVO1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_PROGRESSIVO1, PPQRY_VARIMP7, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_FORM, 348, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CAPITOLO1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CAPITOLO1, PPQRY_VARIMP7, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_LIST, 108, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_FORM, 4, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ARTICOLO1, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ARTICOLO1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ARTICOLO1, PPQRY_VARIMP7, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_LIST, 140, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_LIST, "Descrione Capitolo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_FORM, 4, 196, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPDESCRIZI1, MyGlb.PANEL_FORM, "Descrione Capitolo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CAPDESCRIZI1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CAPDESCRIZI1, PPQRY_CAP1, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_LIST, 260, 36, 70, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_LIST, "Livello IV");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_FORM, 4, 256, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPLIVELLO5, MyGlb.PANEL_FORM, "Livello IV");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CAPLIVELLO5, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CAPLIVELLO5, PPQRY_CAP1, "A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO')", "LIVELLO4", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_LIST, 330, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_LIST, "Anno Var.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_FORM, 212, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOVAR1, MyGlb.PANEL_FORM, "Anno Var.");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ANNOVAR1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ANNOVAR1, PPQRY_VARIMP7, "A.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_LIST, 374, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_LIST, "Numero");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_FORM, 348, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP1, MyGlb.PANEL_FORM, "Numero");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_NUMEROIMP1, -1, GRP_VARIAZIMPEGN_IMPEGNO1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_NUMEROIMP1, PPQRY_VARIMP7, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_LIST, 430, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_LIST, "Anno");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_FORM, 212, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOIMP1, MyGlb.PANEL_FORM, "Anno");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ANNOIMP1, -1, GRP_VARIAZIMPEGN_IMPEGNO1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ANNOIMP1, PPQRY_VARIMP7, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_LIST, 474, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_FORM, 4, 232, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_INFOIMP, -1, GRP_VARIAZIMPEGN_IMPEGNO1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_INFOIMP, PPQRY_DUAL1, "'I'", "INFOIMP", 5, 1, 0, -13997);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_LIST, 498, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_LIST, "Data Variazione");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_FORM, 212, 148, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DDATAREG1, MyGlb.PANEL_FORM, "Dt. Variazione");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DDATAREG1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DDATAREG1, PPQRY_VARIMP7, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_LIST, 578, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione Variazione");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 100, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione Variazione");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DESCRIZIONE1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DESCRIZIONE1, PPQRY_VARIMP7, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_LIST, 718, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_FORM, 388, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_IMPORTO1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_IMPORTO1, PPQRY_VARIMP7, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_LIST, 834, 36, 116, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_FORM, 244, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR1, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TIPOVAR1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TIPOVAR1, PPQRY_VARIMP7, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_LIST, 950, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_FORM, 396, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOAVANZO1, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TIPOAVANZO1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TIPOAVANZO1, PPQRY_VARIMP7, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_LIST, 1078, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_FORM, 4, 280, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DESCRIZIONU1, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DESCRIZIONU1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DESCRIZIONU1, PPQRY_IMP1, "DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1290, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_FORM, 4, 304, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVINCOLO1, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TIPOVINCOLO1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_TIPOVINCOLO1, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TIPOVINCOLO1, PPQRY_VARIMP7, "C.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_LIST, 1490, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 328, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_FINANZIAMEN1, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_FINANZIAMEN1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_FINANZIAMEN1, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_FINANZIAMEN1, PPQRY_VARIMP7, "DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, A.FINANZIAMENTO, C.FINANZIAMENTO_LIGHT)", "VARIMPFINANZ", 1, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_LIST, 1690, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_LIST, 48);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_FORM, 4, 352, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_OPERA1, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_OPERA1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_OPERA1, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_OPERA1, PPQRY_VARIMP7, "DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, C.OPERA, C.OPERA_LIGHT)", "VARIMPOPERA", 1, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, 1434, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 280, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_PROGUNITORGA, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_PROGUNITORGA, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_PROGUNITORGA, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_PROGUNITORGA, PPQRY_VARIMP7, "C.PROGR_UNITA_ORGANIZZATIVA", "VARIMPPRUNOR", 1, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_LIST, 4, 292, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 220, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTEINSER1, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UTENTEINSER1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UTENTEINSER1, PPQRY_VARIMP7, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_LIST, 4, 316, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_FORM, 244, 220, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAINSERIM1, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DATAINSERIM1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DATAINSERIM1, PPQRY_VARIMP7, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_LIST, 4, 340, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_UTENTULTIAG1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_UTENTULTIAG1, PPQRY_VARIMP7, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_LIST, 4, 364, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_FORM, 244, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_DATAULTIMAG1, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_DATAULTIMAG1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_DATAULTIMAG1, PPQRY_VARIMP7, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_LIST, "GESTIONE AVANZO");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_FORM, 4, 232, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_GESTIOAVANZ1, MyGlb.PANEL_FORM, "GESTIONE AVANZO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_GESTIOAVANZ1, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_GESTIOAVANZ1, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_GESTIOAVANZ1, PPQRY_VARIMP7, "D.GESTIONE_AVANZO", "VARIMPGESTIO", 5, 2, 0, -13997);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_GESTIOAVANZ1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_GESTIOAVANZ1, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_VARIAZIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO, ");
    SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') as LIVELLO4 ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_CAP1, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_CAP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_CAP1, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOIMP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ANNO_IMP~~ IS NULL))) ");
    SQL.append("and   (NOT ((~~NUMERO_IMP~~ IS NULL))) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as IMPFATPRUNOR, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  VARIMP B ");
    SQL.append("where (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~VARIMPPRUNOR~~, -1)) ");
    SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (B.ANNO_VAR < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((B.ANNO_ESIGIBILITA IS NULL)) ");
    SQL.append("and   (B.IMPORTO < 0) ");
    SQL.append("order by 2, 3 ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_IMP1, "IMP");
    PAN_VARIAZIMPEGN.SetQueryLKE(PPQRY_IMP1, PFL_VARIAZIMPEGN_PROGUNITORGA, "IMPFATPRUNOR");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as IMPFATPRUNOR, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  VARIMP B ");
    SQL.append("where (B.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (B.ANNO_VAR < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((B.ANNO_ESIGIBILITA IS NULL)) ");
    SQL.append("and   (B.IMPORTO < 0) ");
    SQL.append("order by 2, 3 ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_IMP1, 1, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryHeaderColumn(PPQRY_IMP1, "ORD1", "Ord1");
    PAN_VARIAZIMPEGN.SetQueryHeaderColumn(PPQRY_IMP1, "DESCRIZIONUO", "Descrizione UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_T57, 0, SQL, PFL_VARIAZIMPEGN_TIPOVAR1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_T57, 1, SQL, PFL_VARIAZIMPEGN_TIPOVAR1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_T57, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_TIPIAVANZO1, 0, SQL, PFL_VARIAZIMPEGN_TIPOAVANZO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_TIPIAVANZO1, 1, SQL, PFL_VARIAZIMPEGN_TIPOAVANZO1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_TIPIAVANZO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCDESCVINC ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VINCOLI1, 0, SQL, PFL_VARIAZIMPEGN_TIPOVINCOLO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCDESCVINC ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VINCOLI1, 1, SQL, PFL_VARIAZIMPEGN_TIPOVINCOLO1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_VINCOLI1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FINADESCFINA ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~VARIMPFINANZ~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_FINANZIAMEN1, 0, SQL, PFL_VARIAZIMPEGN_FINANZIAMEN1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FINADESCFINA ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_FINANZIAMEN1, 1, SQL, PFL_VARIAZIMPEGN_FINANZIAMEN1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_FINANZIAMEN1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZOPERA ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~VARIMPOPERA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_OPERE1, 0, SQL, PFL_VARIAZIMPEGN_OPERA1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZOPERA ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_OPERE1, 1, SQL, PFL_VARIAZIMPEGN_OPERA1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_OPERE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetIMDB(IMDB, "PQRY_VARIMP7", true);
    PAN_VARIAZIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "VARIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  D.GESTIONE_AVANZO as VARIMPGESTIO, ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA as VARIMPPRUNOR, ");
    SQL.append("  C.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, A.FINANZIAMENTO, C.FINANZIAMENTO_LIGHT) as VARIMPFINANZ, ");
    SQL.append("  DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, C.OPERA, C.OPERA_LIGHT) as VARIMPOPERA ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMP7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARIMP A, ");
    SQL.append("  IMP C, ");
    SQL.append("  T55 D ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMP7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (D.CODICE(+) = A.TIPO_VAR) ");
    SQL.append("and   (C.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (A.ANNO_VAR < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.ANNO_ESIGIBILITA IS NULL)) ");
    SQL.append("and   (A.IMPORTO < 0) ");
    SQL.append("and   ((~~PQRY_PARAMETRI649.PARATIPOVARI~~ = 'T') OR (~~PQRY_PARAMETRI649.PARATIPOVARI~~ = 'N' AND (A.TIPO_AVANZO IS NULL)) OR (~~PQRY_PARAMETRI649.PARATIPOVARI~~ = 'A' AND NOT ((A.TIPO_AVANZO IS NULL)))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI649.PASOTIVAPEAV~~ IS NULL) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  T55 B ");
    SQL.append("where (B.CODICE = A.TIPO_VAR) ");
    SQL.append("and   (NVL(B.GESTIONE_AVANZO, 'NO') = 'SI') ");
    SQL.append("))) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMP7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMP7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMP7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_VAR, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_VARIMP7, 5, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_VARIMP7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(0, "VARIMP");
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_CAPITOLO1, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_ARTICOLO1, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_ANNOVAR1, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_ANNOIMP1, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_NUMEROIMP1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIMPEGN.iUseListQBE;
      PAN_VARIAZIMPEGN.iUseListQBE = 0;
      PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIAZACCERT_Init()
  {

    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, "2F9E7EBD-FCBB-4587-A7F9-99B5B22F968B");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, "Accertamento");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 374, -9999, 124, 16, 0, 0);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 3, 504, 253, 0, 0);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, 0, 81);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, 1, 13);
    PAN_VARIAZACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, 0, 4);
    PAN_VARIAZACCERT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, 1, 4);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZACCERT_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, "075C6D77-C2AC-4DC8-8FB2-97D05F610C21");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, "2B0836B3-339D-4866-B639-EAE2231FD68D");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, "Capitolo");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, "B6985087-E51D-4E08-ADBD-E2B8ADFB27D7");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, "Art.");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, "5F314389-AF5E-4777-9B1B-EF80D33B764A");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, "Descrizione Capitolo");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, "C8417F8B-7795-49AF-8697-7F3CD220AAD4");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, "Livello IV");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, "08521AB0-B87C-440B-B296-9F600F64909A");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, "Anno Var.");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, "D7A83127-26DE-44D9-9113-352F8A3B424F");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, "Numero");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, "4C26E7CF-8322-4311-A627-A25B18A30C79");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, "Anno");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, "B087589E-F891-4F68-8EA7-E88D1EC41A7F");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, " ");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, "Info Accertamento");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, "918DB7BD-D819-4E5B-BE9D-7EF8CA95EC3E");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, "Data Variazione");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, "3387A24A-0ED2-4FB4-AA41-B05C6D28CC25");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, "Descrizione Variazione");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, "4BDFCBB8-E609-44A0-930C-F6B0A80380BE");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, "Importo");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, "24CE6B7B-7281-4079-ADA4-5DFE33709FBD");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, "Tipo Variazione");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, "C1B25919-DFB0-4813-9279-D0EDD9D3315A");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, "Tipo Avanzo");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, "010E08CE-E89F-4806-AE27-909F77256F91");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, "Unità Organizzativa");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, "46B63A52-B491-4149-993B-5314B7C8FD89");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, "Tipo Vincolo");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, "2FEBC6DA-DFFF-40CC-891A-EB65BA50EF6F");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, "Finanziamento");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, "EDAD2D0A-0BB9-426C-881D-B837D091C147");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, "Opera");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, "4D7141D5-9F3E-427D-9F70-E0077C400171");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, "ADD65D5C-186C-4085-8875-38727DC55CA4");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, "DC62CCCC-B416-4EB1-9820-7A56CEA48E17");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, "B8353A8C-D62C-4A9E-8958-544E4DB4EF54");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, "25AAB246-E2AB-40AE-B783-E5E79F8261B5");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, "GESTIONE AVANZO");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, "5DF20B4C-6D77-4170-B7E7-974D53E602EE");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, "ACC PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, 772, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_PROGRESSIVO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_PROGRESSIVO, PPQRY_VARACC4, "B.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, 348, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_CAPITOLO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_CAPITOLO, PPQRY_VARACC4, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_LIST, 108, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_ARTICOLO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_ARTICOLO, PPQRY_VARACC4, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_LIST, 140, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 196, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_CAPDESCRIZIO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_LIST, 260, 36, 70, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_LIST, "Livello IV");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_FORM, 4, 256, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPLIVELLO4, MyGlb.PANEL_FORM, "Livello IV");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_CAPLIVELLO4, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_CAPLIVELLO4, PPQRY_CAP, "A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO')", "LIVELLO4", 5, 99, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_LIST, 330, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_LIST, "Anno Var.");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_FORM, 212, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOVAR, MyGlb.PANEL_FORM, "Anno Var.");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_ANNOVAR, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_ANNOVAR, PPQRY_VARACC4, "B.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, 374, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, "Numero");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, 348, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, "Numero");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_NUMEROACC, -1, GRP_VARIAZACCERT_ACCERTAMENTO);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_NUMEROACC, PPQRY_VARACC4, "B.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_LIST, 430, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_LIST, "Anno");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_FORM, 212, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOACC, MyGlb.PANEL_FORM, "Anno");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_ANNOACC, -1, GRP_VARIAZACCERT_ACCERTAMENTO);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_ANNOACC, PPQRY_VARACC4, "B.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_LIST, 474, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_FORM, 4, 232, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACC, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_INFOACC, -1, GRP_VARIAZACCERT_ACCERTAMENTO);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_INFOACC, PPQRY_DUAL, "'I'", "INFOACC", 5, 1, 0, -13997);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_LIST, 498, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_LIST, "Data Variazione");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_FORM, 212, 148, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DDATAREG, MyGlb.PANEL_FORM, "Dt. Variazione");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_DDATAREG, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_DDATAREG, PPQRY_VARACC4, "B.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 578, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Variazione");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Variazione");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_DESCRIZIONE, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_DESCRIZIONE, PPQRY_VARACC4, "B.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, 718, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, 388, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_IMPORTO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_IMPORTO, PPQRY_VARACC4, "B.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, 834, 36, 116, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, 244, 76, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_TIPOVAR, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_TIPOVAR, PPQRY_VARACC4, "B.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, 950, 36, 128, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, 396, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_TIPOAVANZO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_TIPOAVANZO, PPQRY_VARACC4, "B.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_LIST, 1078, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 328, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DESCRIZIONUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_DESCRIZIONUO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_DESCRIZIONUO, PPQRY_ACC, "DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1290, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 352, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_TIPOVINCOLO, -1, -1);
    PAN_VARIAZACCERT.SetFieldUnbound(PFL_VARIAZACCERT_TIPOVINCOLO, true);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_TIPOVINCOLO, PPQRY_VARACC4, "C.TIPO_VINCOLO", "VARATIPOVINC", 1, 19, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 1490, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 376, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_FINANZIAMENT, -1, -1);
    PAN_VARIAZACCERT.SetFieldUnbound(PFL_VARIAZACCERT_FINANZIAMENT, true);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_FINANZIAMENT, PPQRY_VARACC4, "DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, C.FINANZIAMENTO, C.FINANZIAMENTO_LIGHT)", "VARACCFINANZ", 1, 19, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_LIST, 1690, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_FORM, 4, 400, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_OPERA, -1, -1);
    PAN_VARIAZACCERT.SetFieldUnbound(PFL_VARIAZACCERT_OPERA, true);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_OPERA, PPQRY_VARACC4, "DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, B.OPERA, C.OPERA_LIGHT)", "VARACCOPERA", 1, 19, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_LIST, 4, 292, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_UTENTEINSERI, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_UTENTEINSERI, PPQRY_VARACC4, "B.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_LIST, 4, 316, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_FORM, 244, 220, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_DATAINSERIME, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_DATAINSERIME, PPQRY_VARACC4, "B.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_LIST, 4, 340, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_FORM, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_UTENTULTIAGG, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_UTENTULTIAGG, PPQRY_VARACC4, "B.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_LIST, 4, 364, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_FORM, 244, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_DATAULTIMAGG, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_DATAULTIMAGG, PPQRY_VARACC4, "B.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_LIST, "GESTIONE AVANZO");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_FORM, 4, 232, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_GESTIOAVANZO, MyGlb.PANEL_FORM, "GESTIONE AVANZO");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_GESTIOAVANZO, -1, -1);
    PAN_VARIAZACCERT.SetFieldUnbound(PFL_VARIAZACCERT_GESTIOAVANZO, true);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_GESTIOAVANZO, PPQRY_VARACC4, "D.GESTIONE_AVANZO", "VARACCGESTIO", 5, 2, 0, -13997);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_GESTIOAVANZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_GESTIOAVANZO, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, 208);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, "ACC PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, 4, 328, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, 208);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, "ACC PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_ACCPROUNIORG, -1, -1);
    PAN_VARIAZACCERT.SetFieldUnbound(PFL_VARIAZACCERT_ACCPROUNIORG, true);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_ACCPROUNIORG, PPQRY_VARACC4, "C.PROGR_UNITA_ORGANIZZATIVA", "VARACCPRUNOR", 1, 19, 0, -13997);
  }

  private void PAN_VARIAZACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO, ");
    SQL.append("  A_GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') as LIVELLO4 ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZACCERT.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOACC ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ANNO_ACC~~ IS NULL))) ");
    SQL.append("and   (NOT ((~~NUMERO_ACC~~ IS NULL))) ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZACCERT.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as ACCFATPRUNOR, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  VARACC B ");
    SQL.append("where (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~VARACCPRUNOR~~, -1)) ");
    SQL.append("and   (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (B.ANNO_VAR < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((B.ANNO_ESIGIBILITA IS NULL)) ");
    SQL.append("order by 2, 3 ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZACCERT.SetMasterTable(PPQRY_ACC, "ACC");
    PAN_VARIAZACCERT.SetQueryLKE(PPQRY_ACC, PFL_VARIAZACCERT_ACCPROUNIORG, "ACCFATPRUNOR");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as ACCFATPRUNOR, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  VARACC B ");
    SQL.append("where (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (B.ANNO_VAR < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((B.ANNO_ESIGIBILITA IS NULL)) ");
    SQL.append("order by 2, 3 ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_ACC, 1, SQL, -1, "");
    PAN_VARIAZACCERT.SetQueryHeaderColumn(PPQRY_ACC, "ORD1", "Ord1");
    PAN_VARIAZACCERT.SetQueryHeaderColumn(PPQRY_ACC, "DESCRIZIONUO", "Descrizione UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_T56, 0, SQL, PFL_VARIAZACCERT_TIPOVAR, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T56CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_T56, 1, SQL, PFL_VARIAZACCERT_TIPOVAR, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_VARIAZACCERT_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_VARIAZACCERT_TIPOAVANZO, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~VARATIPOVINC~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_VARIAZACCERT_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_VARIAZACCERT_TIPOVINCOLO, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIVINCOL ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~VARACCFINANZ~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_VARIAZACCERT_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIVINCOL ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_VARIAZACCERT_FINANZIAMENT, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZOPERA7 ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~VARACCOPERA~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_OPERE, 0, SQL, PFL_VARIAZACCERT_OPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZOPERA7 ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_OPERE, 1, SQL, PFL_VARIAZACCERT_OPERA, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZACCERT.SetIMDB(IMDB, "PQRY_VARACC4", true);
    PAN_VARIAZACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "VARACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  B.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  B.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  B.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.IMPORTO as IMPORTO, ");
    SQL.append("  B.TIPO_VAR as TIPO_VAR, ");
    SQL.append("  B.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  B.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  B.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  B.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  B.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  D.GESTIONE_AVANZO as VARACCGESTIO, ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA as VARACCPRUNOR, ");
    SQL.append("  C.TIPO_VINCOLO as VARATIPOVINC, ");
    SQL.append("  DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, C.FINANZIAMENTO, C.FINANZIAMENTO_LIGHT) as VARACCFINANZ, ");
    SQL.append("  DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, B.OPERA, C.OPERA_LIGHT) as VARACCOPERA ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_VARACC4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARACC B, ");
    SQL.append("  ACC C, ");
    SQL.append("  T56 D ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_VARACC4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.ANNO_ACC = B.ANNO_ACC) ");
    SQL.append("and   (C.NUMERO_ACC = B.NUMERO_ACC) ");
    SQL.append("and   (D.CODICE(+) = B.TIPO_VAR) ");
    SQL.append("and   (B.ANNO_VAR < ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((B.ANNO_ESIGIBILITA IS NULL)) ");
    SQL.append("and   (((~~PQRY_PARAMETRI649.PARATIPOVARI~~ = 'T') OR (~~PQRY_PARAMETRI649.PARATIPOVARI~~ = 'N' AND (B.TIPO_AVANZO IS NULL)) OR (~~PQRY_PARAMETRI649.PARATIPOVARI~~ = 'A' AND NOT ((B.TIPO_AVANZO IS NULL))))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI649.PASOTIVAPEAV~~ IS NULL) OR EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("where (A.CODICE = B.TIPO_VAR) ");
    SQL.append("and   (NVL(A.GESTIONE_AVANZO, 'NO') = 'SI') ");
    SQL.append("))) ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_VARACC4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZACCERT.SetQuery(PPQRY_VARACC4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZACCERT.SetQuery(PPQRY_VARACC4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  B.ANNO_VAR, ");
    SQL.append("  B.ANNO_ACC, ");
    SQL.append("  B.NUMERO_ACC ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_VARACC4, 5, SQL, -1, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_VARACC4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZACCERT.SetMasterTable(0, "VARACC");
    PAN_VARIAZACCERT.AddToSortList(PFL_VARIAZACCERT_CAPITOLO, true);
    PAN_VARIAZACCERT.AddToSortList(PFL_VARIAZACCERT_ARTICOLO, true);
    PAN_VARIAZACCERT.AddToSortList(PFL_VARIAZACCERT_ANNOVAR, true);
    PAN_VARIAZACCERT.AddToSortList(PFL_VARIAZACCERT_ANNOACC, true);
    PAN_VARIAZACCERT.AddToSortList(PFL_VARIAZACCERT_NUMEROACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZACCERT.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZACCERT.iUseListQBE;
      PAN_VARIAZACCERT.iUseListQBE = 0;
      PAN_VARIAZACCERT.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZACCERT.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZACCERT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_DynamicProperties();
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnChangeStatus(OldStatus);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_AfterCommit(RowUpdated, RowError);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TABBEDVIEW) TAB_TABBEDVIEW_Click(PreviousPage, Cancel);
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
