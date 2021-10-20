// **********************************************
// Info Distinte Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InfoDistinteLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int GRP_DISTINTE_INSERIMENTO = 0;
  private static int GRP_DISTINTE_AGGIORNAMENT = 1;

  private static int PFL_DISTINTE_DISTINTA = 0;
  private static int PFL_DISTINTE_ANNO = 1;
  private static int PFL_DISTINTE_DATA1 = 2;
  private static int PFL_DISTINTE_IMPORTO1 = 3;
  private static int PFL_DISTINTE_STATO1 = 4;
  private static int PFL_DISTINTE_UTENTE1 = 5;
  private static int PFL_DISTINTE_DATA2 = 6;
  private static int PFL_DISTINTE_UTENTE = 7;
  private static int PFL_DISTINTE_DATA = 8;
  private static int PFL_DISTINTE_SCADENZADAL = 9;
  private static int PFL_DISTINTE_AL1 = 10;
  private static int PFL_DISTINTE_PROGUNITORGA = 11;
  private static int PFL_DISTINTE_UOCOMPETENZA = 12;
  private static int PFL_DISTINTE_BARRA5 = 13;
  private static int PFL_DISTINTE_SCADENZA = 14;
  private static int PFL_DISTINTE_DISTINTA1 = 15;
  private static int PFL_DISTINTE_TIPODIST = 16;
  private static int PFL_DISTINTE_FLAGLIQUIDAT = 17;
  private static int PFL_DISTINTE_ANNODEL = 18;
  private static int PFL_DISTINTE_NUMERODEL = 19;
  private static int PFL_DISTINTE_SEDEDEL = 20;
  private static int PFL_DISTINTE_ANNOIMP1 = 21;
  private static int PFL_DISTINTE_NUMEROIMP = 22;
  private static int PFL_DISTINTE_ANNOSUBIMP1 = 23;
  private static int PFL_DISTINTE_NUMEROSUBIMP = 24;
  private static int PFL_DISTINTE_LINKGDM = 25;
  private static int PFL_DISTINTE_SIOPEATTIARM = 26;

  private static int PPQRY_DISTINLIQUI8 = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_CF4WEBSTRUTT = 3;
  private static int PPQRY_ANAGUNITORGA = 4;


  IDPanel PAN_DISTINTE;
  private static int GRP_LIQUIDAZIONI_FINANZIAMENT = 0;
  private static int GRP_LIQUIDAZIONI_FATTORE = 1;
  private static int GRP_LIQUIDAZIONI_CENTRO = 2;
  private static int GRP_LIQUIDAZIONI_COMPETENZA = 3;

  private static int PFL_LIQUIDAZIONI_IMPORTO = 0;
  private static int PFL_LIQUIDAZIONI_FATTURA = 1;
  private static int PFL_LIQUIDAZIONI_DDATADOC = 2;
  private static int PFL_LIQUIDAZIONI_INFOFATTLIST = 3;
  private static int PFL_LIQUIDAZIONI_INFOFATTFORM = 4;
  private static int PFL_LIQUIDAZIONI_INSDAFATTURE = 5;
  private static int PFL_LIQUIDAZIONI_IMPEGNO = 6;
  private static int PFL_LIQUIDAZIONI_ANNOIMP = 7;
  private static int PFL_LIQUIDAZIONI_INFOIMP = 8;
  private static int PFL_LIQUIDAZIONI_SUBIMPEGNO = 9;
  private static int PFL_LIQUIDAZIONI_ANNOSUBIMP = 10;
  private static int PFL_LIQUIDAZIONI_INFOSUBIMP = 11;
  private static int PFL_LIQUIDAZIONI_FORNITORE = 12;
  private static int PFL_LIQUIDAZIONI_BENEFICIARIO = 13;
  private static int PFL_LIQUIDAZIONI_INFOFORNITOR = 14;
  private static int PFL_LIQUIDAZIONI_INFOSOGGETTI = 15;
  private static int PFL_LIQUIDAZIONI_QUIETANZA = 16;
  private static int PFL_LIQUIDAZIONI_DESCRIQUIETA = 17;
  private static int PFL_LIQUIDAZIONI_DESCRIZIONE = 18;
  private static int PFL_LIQUIDAZIONI_FATTURELABEL = 19;
  private static int PFL_LIQUIDAZIONI_FORNITOLABEL = 20;
  private static int PFL_LIQUIDAZIONI_ESTREMDISTIN = 21;
  private static int PFL_LIQUIDAZIONI_PROGRESSIVO = 22;
  private static int PFL_LIQUIDAZIONI_ANNOPROGFAT = 23;
  private static int PFL_LIQUIDAZIONI_NUMERPROGFAT = 24;
  private static int PFL_LIQUIDAZIONI_LABELIMPEGNO = 25;
  private static int PFL_LIQUIDAZIONI_LABELSUBIMPE = 26;
  private static int PFL_LIQUIDAZIONI_BARRA = 27;
  private static int PFL_LIQUIDAZIONI_BARRA1 = 28;
  private static int PFL_LIQUIDAZIONI_INFOIMPEGNO = 29;
  private static int PFL_LIQUIDAZIONI_BARRA2 = 30;
  private static int PFL_LIQUIDAZIONI_INFOSUBIMPEG = 31;
  private static int PFL_LIQUIDAZIONI_CIG = 32;
  private static int PFL_LIQUIDAZIONI_MOTIVESCLCIG = 33;
  private static int PFL_LIQUIDAZIONI_CUP = 34;
  private static int PFL_LIQUIDAZIONI_VOCEECONOMIC = 35;
  private static int PFL_LIQUIDAZIONI_RICVOCECOCOD = 36;
  private static int PFL_LIQUIDAZIONI_CGU = 37;
  private static int PFL_LIQUIDAZIONI_CODIGESTDESC = 38;
  private static int PFL_LIQUIDAZIONI_FINANZIAMENT = 39;
  private static int PFL_LIQUIDAZIONI_FINANZDESCRI = 40;
  private static int PFL_LIQUIDAZIONI_FATTORE = 41;
  private static int PFL_LIQUIDAZIONI_FATTORDESCRI = 42;
  private static int PFL_LIQUIDAZIONI_CENTRO = 43;
  private static int PFL_LIQUIDAZIONI_CENTRIDESCRI = 44;
  private static int PFL_LIQUIDAZIONI_LABEVOCEECON = 45;
  private static int PFL_LIQUIDAZIONI_LABELCGU = 46;
  private static int PFL_LIQUIDAZIONI_ANNODISTINTA = 47;
  private static int PFL_LIQUIDAZIONI_NUMERODISTIN = 48;
  private static int PFL_LIQUIDAZIONI_IMPRILEVAECO = 49;
  private static int PFL_LIQUIDAZIONI_SUBIMRILEECO = 50;
  private static int PFL_LIQUIDAZIONI_DAL = 51;
  private static int PFL_LIQUIDAZIONI_AL = 52;
  private static int PFL_LIQUIDAZIONI_LABELCOMPETE = 53;
  private static int PFL_LIQUIDAZIONI_UTENTEINSERI = 54;
  private static int PFL_LIQUIDAZIONI_DATAINSERIME = 55;
  private static int PFL_LIQUIDAZIONI_UTENTULTIAGG = 56;
  private static int PFL_LIQUIDAZIONI_DATAULTIMAGG = 57;
  private static int PFL_LIQUIDAZIONI_STATO = 58;
  private static int PFL_LIQUIDAZIONI_LABELQUIETAN = 59;
  private static int PFL_LIQUIDAZIONI_ETICHEFINANZ = 60;
  private static int PFL_LIQUIDAZIONI_ETICHEFATTOR = 61;
  private static int PFL_LIQUIDAZIONI_ETICHECENTRO = 62;

  private static int PPQRY_LIQDISTINTA1 = 0;

  private static int PPQRY_FAT = 1;
  private static int PPQRY_BEN = 2;
  private static int PPQRY_FATTORI = 3;
  private static int PPQRY_CENTRI = 4;
  private static int PPQRY_VOCIECONOMIC = 5;
  private static int PPQRY_CODICIGESTIO = 6;
  private static int PPQRY_FINANZIAMENT = 7;
  private static int PPQRY_IMP2 = 8;
  private static int PPQRY_IMP1 = 9;
  private static int PPQRY_QTN = 10;

  private static int PPQRY_ATTRIBUTIOPI = 11;


  IDPanel PAN_LIQUIDAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI412(IMDB);
    //
    //
    Init_PQRY_DISTINLIQUI8(IMDB);
    Init_PQRY_LIQDISTINTA1(IMDB);
    Init_PQRY_LIQDISTINTA1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI412(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI412, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI412, "TBL_PARAMETRI412");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI412,IMDBDef1.FLD_PARAMETRI412_PARANNDISFIL, "PARANNDISFIL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI412,IMDBDef1.FLD_PARAMETRI412_PARANNDISFIL,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI412,IMDBDef1.FLD_PARAMETRI412_PARNUMDISFIL, "PARNUMDISFIL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI412,IMDBDef1.FLD_PARAMETRI412_PARNUMDISFIL,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI412,IMDBDef1.FLD_PARAMETRI412_PARDATDISFIL, "PARDATDISFIL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI412,IMDBDef1.FLD_PARAMETRI412_PARDATDISFIL,6,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI412, 0);
  }

  private static void Init_PQRY_DISTINLIQUI8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_DISTINLIQUI8, 24);
    IMDB.set_TblCode(IMDBDef8.PQRY_DISTINLIQUI8, "PQRY_DISTINLIQUI8");
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_DATA_DISTINTA, "DATA_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_DATA_DISTINTA,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_STATO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_FLAG_LIQUIDATO, "FLAG_LIQUIDATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_FLAG_LIQUIDATO,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SCADENZA_DAL, "SCADENZA_DAL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SCADENZA_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SCADENZA_AL, "SCADENZA_AL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SCADENZA_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_RECORDIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_TIPO_DIST, "TIPO_DIST");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_TIPO_DIST,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_LINK_GDM, "LINK_GDM");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_LINK_GDM,5,500,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_PROGR_UO_COMPETENZA, "PROGR_UO_COMPETENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_PROGR_UO_COMPETENZA,1,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SIOPEATTIARM, "SIOPEATTIARM");
    IMDB.SetFldParams(IMDBDef8.PQRY_DISTINLIQUI8,IMDBDef8.PQSL_DISTINLIQUI8_SIOPEATTIARM,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_DISTINLIQUI8, 0);
  }

  private static void Init_PQRY_LIQDISTINTA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_LIQDISTINTA1, 33);
    IMDB.set_TblCode(IMDBDef8.PQRY_LIQDISTINTA1, "PQRY_LIQDISTINTA1");
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUINFALI, "LIFABUINFALI");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUINFALI,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINFO, "LIQFATBUINFO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINFO,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_PROG_FAT, "ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_PROG_FAT, "NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_VOCE_ECONOMICA, "VOCE_ECONOMICA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_VOCE_ECONOMICA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINIM, "LIQFATBUINIM");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINIM,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINSU, "LIQFATBUINSU");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINSU,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISTISTAT, "LIQDISTISTAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISTISTAT,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISINDAFA, "LIQDISINDAFA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISINDAFA,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUMOESCI, "LIFABUMOESCI");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUMOESCI,5,50,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_LIQDISTINTA1, 0);
  }

  private static void Init_PQRY_LIQDISTINTA1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 33);
    IMDB.set_TblCode(IMDBDef8.PQRY_LIQDISTINTA1_RS, "PQRY_LIQDISTINTA1_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUINFALI, "LIFABUINFALI");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUINFALI,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINFO, "LIQFATBUINFO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINFO,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_PROG_FAT, "ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_PROG_FAT, "NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_VOCE_ECONOMICA, "VOCE_ECONOMICA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_VOCE_ECONOMICA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINIM, "LIQFATBUINIM");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINIM,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINSU, "LIQFATBUINSU");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQFATBUINSU,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_DATA_INSERIMENTO,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISTISTAT, "LIQDISTISTAT");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISTISTAT,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISINDAFA, "LIQDISINDAFA");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIQDISINDAFA,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUMOESCI, "LIFABUMOESCI");
    IMDB.SetFldParams(IMDBDef8.PQRY_LIQDISTINTA1_RS,IMDBDef8.PQSL_LIQDISTINTA1_LIFABUMOESCI,5,50,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InfoDistinteLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public InfoDistinteLiquidazione()
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
    FormIdx = MyGlb.FRM_INFODISTLIQU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "15A424ED-A40E-46CE-9DA1-8265264472AF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 920;
    DesignHeight = 494;
    set_Caption(new IDVariant("Distinte Liquidazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 920;
    Frames[1].Height = 468;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 468;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "5179710D-2123-4254-8EC1-A0933892286D";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Distinte";
    Frames[2].Parent = this;
    PAN_DISTINTE = new IDPanel(w, this, 2, "PAN_DISTINTE");
    Frames[2].Content = PAN_DISTINTE;
    PAN_DISTINTE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINTE.VS = MainFrm.VisualStyleList;
    PAN_DISTINTE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 920-MyGlb.PAN_OFFS_X, 468-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6713A309-DDD5-448A-9F5B-A78DD3B6E545");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 12, 812, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINTE.InitStatus = 2;
    PAN_DISTINTE_Init();
    PAN_DISTINTE_InitFields();
    PAN_DISTINTE_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Distinte", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Liquidazioni";
    Frames[3].Parent = this;
    PAN_LIQUIDAZIONI = new IDPanel(w, this, 3, "PAN_LIQUIDAZIONI");
    Frames[3].Content = PAN_LIQUIDAZIONI;
    PAN_LIQUIDAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIONI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 920-MyGlb.PAN_OFFS_X, 468-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CAF3F386-6D5C-4C95-8997-10910B6BFB33");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 48, 3304, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIONI.InitStatus = 2;
    PAN_LIQUIDAZIONI_Init();
    PAN_LIQUIDAZIONI_InitFields();
    PAN_LIQUIDAZIONI_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Liquidazioni", "");
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
      if (IMDB.TblModified(IMDBDef7.TBL_LIQ_DISTINTA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFODISTLIQU_LIQDISTINTA1();
      }
      PAN_DISTINTE.UpdatePanel(MainFrm);
      PAN_LIQUIDAZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof InfoDistinteLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InfoDistinteLiquidazione.class.getName() : (Glb.ClassWithPackage(InfoDistinteLiquidazione.class) ? InfoDistinteLiquidazione.class.getName().substring(InfoDistinteLiquidazione.class.getPackage().getName().length() + 1) : InfoDistinteLiquidazione.class.getName()));
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (MainFrm.SCADENZADIST.equals((new IDVariant("SI")), true))
      {
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_AL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_AL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.MODAIMPUSPES.compareTo((new IDVariant("LI")), true)!=0)
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
        {
          PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (MainFrm.TIPO_MINF.equals((new IDVariant("OPI")), true))
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "LoadEvent", _e);
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
      // 
      // 
      // 
      // 
      UNLOADEVENT_LIQDISTIDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // LIQ DISTINTA: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_LIQDISTIDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef7.TBL_LIQ_DISTINTA);
  }

  // **********************************************************************
  // Tab Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_TAB_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_LABELSTRING = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_LABELSTRING = (new IDVariant("Distinta ", IDVariant.STRING));
      // 
      // Tab Change Page Event Body
      // Procedure Body
      // 
      if (PreviousPage.equals((new IDVariant(PAN_DISTINTE.FrIndex)), true))
      {
        PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_ESTREMDISTIN, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_LABELSTRING, IDL.ToString(IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_DISTINTA, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_ANNO_DISTINTA, 0))), (new IDVariant(" "))), (new IDVariant("del"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_DATA_DISTINTA, 0))).stringValue());
      }
      if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_LIQUIDAZIONI.FrIndex)), true))
      {
        RiempiIMDB();
        PAN_LIQUIDAZIONI.set_Layout((new IDVariant(0)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "TabChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Distinte On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINTE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISTINTE);
      // 
      // Distinte On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(10)), true))
      {
        if (MainFrm.SCADENZA_DISTINTA_O.equals((new IDVariant("SI")), true))
        {
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_AL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_AL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (PAN_DISTINTE.IsNewRow())
      {
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_STATO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_DATA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        if (IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(10)), true) || IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(20)), true))
        {
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_STATO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_STATO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_DATA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_DISTINTE.set_ToolTip(Glb.OBJ_FIELD,PFL_DISTINTE_UOCOMPETENZA,(new IDVariant(PAN_DISTINTE.FieldText(PFL_DISTINTE_UOCOMPETENZA))).stringValue()); 
      if (IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(10)), true) || IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(20)), true))
      {
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if ((IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(20)), true) || IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(25)), true) || IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_STATO, 0).equals((new IDVariant(30)), true)) && new IDVariant(PAN_DISTINTE.Status()).compareTo((new IDVariant(3)), true)!=0)
      {
        // 
        // pannello distinte
        // 
        {
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_AL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_DATA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_DISTINTE.SetFlags (Glb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "DistinteOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Distinte After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_DISTINTE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinte After Find Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_SIOPEATTIARM, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "DistinteAfterFind", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDAZIONI);
      // 
      // Liquidazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_FORNITORE,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_FORNITORE))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_DESCRIZIONE,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_DESCRIQUIETA,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_DESCRIQUIETA))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_RICVOCECOCOD,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_RICVOCECOCOD))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_CODIGESTDESC,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_CODIGESTDESC))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_FINANZDESCRI,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_FINANZDESCRI))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_FATTORDESCRI,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_FATTORDESCRI))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_CENTRIDESCRI,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_CENTRIDESCRI))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_MOTIVESCLCIG,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_MOTIVESCLCIG))).stringValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP, 0))))
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_SUBIMP, 0))))
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_PROG_FAT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_PROG_FAT, 0))))
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_BENEFICIARIO, 0))))
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      AbilitazioneFormList();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "LiquidazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni On Command Event Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      // 
      if (Command.equals((new IDVariant(64)), true) || Command.equals((new IDVariant(32)), true))
      {
        RiempiIMDB();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "LiquidazioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Info Fattura
  // **********************************************************************
  public int ApriInfoFattura ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Fattura Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_PROG_FAT, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_PROG_FAT, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "ApriInfoFattura", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Soggetto
  // **********************************************************************
  public int ApriInfoSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Soggetto Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_BENEFICIARIO, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_BENEFICIARIO, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "ApriInfoSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_IMP, 0));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_IMP, 0))))
      {
        if (IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_IMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
        }
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Imp
  // **********************************************************************
  public int InfoSubImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Imp Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef8.PQRY_LIQDISTINTA1, IMDBDef8.PQSL_LIQDISTINTA1_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMUNIORG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "InfoSubImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilitazione Form List
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AbilitazioneFormList ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Form List Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      if ((new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_IMPRILEVAECO))).equals((new IDVariant("SI")), true) || (new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_SUBIMRILEECO))).equals((new IDVariant("SI")), true))
      {
        if ((PAN_LIQUIDAZIONI.bFields(PFL_LIQUIDAZIONI_FATTORE).IsVisible(PAN_LIQUIDAZIONI.AttR) && PAN_LIQUIDAZIONI.bFields(PFL_LIQUIDAZIONI_FATTORE).IsPresent()))
        {
          if ((new IDVariant(PAN_LIQUIDAZIONI.Layout())).equals((new IDVariant(1)), true))
          {
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
        if ((PAN_LIQUIDAZIONI.bFields(PFL_LIQUIDAZIONI_CENTRO).IsVisible(PAN_LIQUIDAZIONI.AttR) && PAN_LIQUIDAZIONI.bFields(PFL_LIQUIDAZIONI_CENTRO).IsPresent()))
        {
          if ((new IDVariant(PAN_LIQUIDAZIONI.Layout())).equals((new IDVariant(1)), true))
          {
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "AbilitazioneFormList", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Procedure Body
      // 
      RIEMPIIMDB_LIQDISTIDELE();
      RIEMPIIMDB_LIQDISININSE();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InfoDistinteLiquidazione", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // LIQ DISTINTA: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIIMDB_LIQDISTIDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef7.TBL_LIQ_DISTINTA);
  }

  // **********************************************************************
  // LIQ DISTINTA: Insert into... select
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIIMDB_LIQDISININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as LIQDISTIPROG, ");
    SQL.append("  A.ANNO_DISTINTA as LIQANNODISTI, ");
    SQL.append("  A.NUMERO_DISTINTA as LIQNUMERDIST, ");
    SQL.append("  A.ANNO_PROG_FAT as LIQDISANPRFA, ");
    SQL.append("  A.NUMERO_PROG_FAT as LIQDISNUPRFA, ");
    SQL.append("  A.IMPORTO as LIQDISTIIMP1, ");
    SQL.append("  A.IMPORTO as LIQDISTIIMPO, ");
    SQL.append("  A.IMPORTO_IVA as LIQDISIMPIVA, ");
    SQL.append("  A.ANNO_IMP as LIQDISANNIMP, ");
    SQL.append("  A.NUMERO_IMP as LIQDISNUMIMP, ");
    SQL.append("  A.ANNO_SUBIMP as LIQDISANNSUB, ");
    SQL.append("  A.NUMERO_SUBIMP as LIQDISNUMSUB, ");
    SQL.append("  A.BENEFICIARIO as LIQDISTIBENE, ");
    SQL.append("  A.NUM_QUIETANZA as LIQDISNUMQUI, ");
    SQL.append("  A.VOCE_ECONOMICA as LIQDISVOCECO, ");
    SQL.append("  A.CODICE_GESTIONALE as LIQDISCODGES, ");
    SQL.append("  A.FINANZIAMENTO as LIQDISTIFINA, ");
    SQL.append("  A.FATTORE as LIQDISTIFATT, ");
    SQL.append("  A.CENTRO as LIQDISTICENT, ");
    SQL.append("  A.UTENTE_INSERIMENTO as LIQDISUTEINS, ");
    SQL.append("  A.DATA_INSERIMENTO as LIQDISDATINS, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as LIQDISUTULAG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as LIQDISDAULAG, ");
    SQL.append("  A.ANNO_LIQ as LIQDISANNLIQ, ");
    SQL.append("  A.NUMERO_LIQ as LIQDISNUMLIQ, ");
    SQL.append("  A.DESCRIZIONE as LIQDISTIDESC, ");
    SQL.append("  A.COMPETENZA_DAL as LIQDISCOMDAL, ");
    SQL.append("  A.COMPETENZA_AL as LIQDISTCOMAL, ");
    SQL.append("  A.CIG as LIQDISTINCIG, ");
    SQL.append("  A.CUP as LIQDISTINCUP, ");
    SQL.append("  A.CAMPO_LIBERO_1 as LIQDISCAMLI1, ");
    SQL.append("  A.CAMPO_LIBERO_2 as LIQDISCAMLI2, ");
    SQL.append("  A.ANNO_DEL as LIQDISANNDEL, ");
    SQL.append("  A.NUMERO_DEL as LIQDISNUMDEL, ");
    SQL.append("  A.SEDE_DEL as LIQDISSEDDEL, ");
    SQL.append("  A.MOTIVO_ESCLUSIONE_CIG as LIQDISMOESCI ");
    SQL.append("from ");
    SQL.append("  LIQ_DISTINTA A, ");
    SQL.append("  BEN B ");
    SQL.append("where (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_ANNO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_DISTINLIQUI8, IMDBDef8.PQSL_DISTINLIQUI8_NUMERO_DISTINTA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef7.TBL_LIQ_DISTINTA, 0);
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DISTINTA,0,RS.Get(2));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DISTINTA,0,RS.Get(3));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_PROG_FAT,0,RS.Get(4));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_PROG_FAT,0,RS.Get(5));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO,0,RS.Get(6));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_LIQDISIMPORI,0,RS.Get(7));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO_IVA,0,RS.Get(8));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_IMP,0,RS.Get(9));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_IMP,0,RS.Get(10));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_SUBIMP,0,RS.Get(11));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_SUBIMP,0,RS.Get(12));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_BENEFICIARIO,0,RS.Get(13));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUM_QUIETANZA,0,RS.Get(14));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_VOCE_ECONOMICA,0,RS.Get(15));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CODICE_GESTIONALE,0,RS.Get(16));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_FINANZIAMENTO,0,RS.Get(17));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_FATTORE,0,RS.Get(18));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CENTRO,0,RS.Get(19));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_INSERIMENTO,0,RS.Get(20));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DATA_INSERIMENTO,0,new IDVariant(RS.Get(21),IDVariant.DATETIME));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_ULTIMO_AGG,0,RS.Get(22));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DATA_ULTIMO_AGG,0,new IDVariant(RS.Get(23),IDVariant.DATETIME));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_LIQ,0,RS.Get(24));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_LIQ,0,RS.Get(25));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_DESCRIZIONE,0,RS.Get(26));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_DAL,0,RS.Get(27));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_AL,0,RS.Get(28));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CIG,0,RS.Get(29));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CUP,0,RS.Get(30));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CAMPO_LIBERO_1,0,new IDVariant(RS.Get(31),IDVariant.STRING));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_CAMPO_LIBERO_2,0,new IDVariant(RS.Get(32),IDVariant.STRING));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DEL,0,RS.Get(33));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DEL,0,RS.Get(34));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_SEDE_DEL,0,RS.Get(35));
      IMDB.set_Value(IMDBDef7.TBL_LIQ_DISTINTA,IMDBDef7.FLD_LIQ_DISTINTA_MOTIVO_ESCLUSIONE_CIG,0,RS.Get(36));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // LIQ DISTINTA
  // Primary record source for panel data
  // **********************************************************************
  private void INFODISTLIQU_LIQDISTINTA1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_LIQDISTINTA1_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_LIQ_DISTINTA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_LIQ_DISTINTA, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_LIQDISTINTA1_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_LIQDISTINTA1_RS, 0, IMDBDef7.TBL_LIQ_DISTINTA, 0);
      IMDB.set_Value(IMDBDef8.PQRY_LIQDISTINTA1_RS, 0, 0, ((!(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_PROG_FAT, 0))))?(new IDVariant("I")):(new IDVariant())));
      IMDB.set_Value(IMDBDef8.PQRY_LIQDISTINTA1_RS, 1, 0, ((IMDB.Value(IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_BENEFICIARIO, 0).equals((new IDVariant())))?(new IDVariant()):(new IDVariant("I"))));
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 2, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 3, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 4, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 5, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 6, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_NUM_QUIETANZA, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 7, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_BENEFICIARIO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 8, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_IMP, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 9, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_IMP, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 10, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_SUBIMP, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 11, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_SUBIMP, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 12, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_VOCE_ECONOMICA, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 13, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_CODICE_GESTIONALE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 14, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_FINANZIAMENTO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 15, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_FATTORE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 16, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_CENTRO, 0);
      IMDB.set_Value(IMDBDef8.PQRY_LIQDISTINTA1_RS, 17, 0, ((IMDB.Value(IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_LIQDISINDAFA, 0).equals((new IDVariant("SI")), true))?(new IDVariant("A")):((!(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_IMP, 0))))?(new IDVariant("I")):(new IDVariant()))));
      IMDB.set_Value(IMDBDef8.PQRY_LIQDISTINTA1_RS, 18, 0, ((IMDB.Value(IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_LIQDISINDAFA, 0).equals((new IDVariant("SI")), true))?(new IDVariant("A")):((!(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_SUBIMP, 0))))?(new IDVariant("I")):(new IDVariant()))));
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 19, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 20, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DISTINTA, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 21, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DISTINTA, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 22, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_DAL, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 23, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_AL, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 24, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_INSERIMENTO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 25, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_DATA_INSERIMENTO, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 26, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_ULTIMO_AGG, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 27, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_DATA_ULTIMO_AGG, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 28, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_LIQDISTISTAT, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 29, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_LIQDISINDAFA, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 30, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_CIG, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 31, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_CUP, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_LIQDISTINTA1_RS, 32, 0, IMDBDef7.TBL_LIQ_DISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_MOTIVO_ESCLUSIONE_CIG, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_LIQ_DISTINTA, 0);
      if (IMDB.Eof(IMDBDef7.TBL_LIQ_DISTINTA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_LIQ_DISTINTA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef8.PQRY_LIQDISTINTA1_RS);
    IMDB.TblSortBy(IMDBDef8.PQRY_LIQDISTINTA1_RS,2,true);
    IMDB.TblStartSort(IMDBDef8.PQRY_LIQDISTINTA1_RS);
    IMDB.TblMoveFirst(IMDBDef8.PQRY_LIQDISTINTA1_RS, 0);
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_TAB_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISTINTE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTINTE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINTE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINTE, Cancel);
    // Stub
  }

  private void PAN_DISTINTE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISTINTE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINTE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTINTE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAZIONI, Cancel);
    // Stub
  }

  private void PAN_LIQUIDAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOFATTLIST)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoFattura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOFATTFORM)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoFattura();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOIMP)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOSUBIMP)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOFORNITOR)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOSOGGETTI)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImp();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIDAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISTINTE_Init()
  {

    PAN_DISTINTE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINTE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, "59816996-3F04-463C-A862-50D764269F50");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, "Inserimento");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, MyGlb.PANEL_LIST, 4, 271, 224, 49, 0, 0);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, MyGlb.PANEL_FORM, 12, 203, 248, 49, 0, 0);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, 0, 70);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, 1, 13);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, 0, 4);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, 1, 4);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINTE_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, "2A3A1095-37D8-4F95-AF4B-06F059A2C756");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, "Aggiornamento");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, MyGlb.PANEL_LIST, 240, 271, 220, 49, 0, 0);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, MyGlb.PANEL_FORM, 268, 203, 248, 49, 0, 0);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, 0, 88);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, 1, 13);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, 0, 4);
    PAN_DISTINTE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, 1, 4);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINTE_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINTE.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, "916E5DE9-E395-4E88-A0AA-741BA7F4F5F0");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, "Distinta");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, "4B5DE92F-93EE-4961-B4A2-A35A3DB01061");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, "Anno");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, "91537BED-0368-4B5B-A642-4570998CE846");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, "Data");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, "5EDC7915-E878-4FB9-A2B6-FC51B0F5429E");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, "Importo");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, "618FCD01-F407-4EBF-ABC6-6307D6754EF1");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, "Stato");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, "12DB8441-551B-4A36-B168-EBF3CCDE1E94");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, "Utente");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, "6885D36E-7795-4237-AE87-866EA461FDD9");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, "Data");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, "7D829724-8ECD-4694-98B4-45514E0FAC34");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, "Utente");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, "D69BFE7C-B7E5-4E03-A495-7706E073ABE9");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, "Data");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, "8353EF7C-1901-4398-B765-8846DF903C91");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, "Scadenza Dal");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, "2AAD66EE-892F-474C-B07D-37D6C52EB6FF");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, "Al");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, "346A8657-5783-4E01-A8C0-C28BAF079F81");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, "U.O.");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, "6DE8530D-95FF-4450-ABAD-8A9D1191D8A9");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, "U.O. Competenza");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, "41AE9933-CDE2-4F90-9A1A-9D4E11CEC0C3");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, "/");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, MyGlb.VIS_VUOTONORMALE);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, "D4A98E5C-3DDC-4DB4-8DB5-82BED5431138");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, "Scadenza");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, MyGlb.VIS_LABEVISUSTYL);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, 0 | MyGlb.FLD_INLIST, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, "02A74843-1633-4598-A8A9-8272AA4DEEDA");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, "Distinta");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, MyGlb.VIS_LABEVISUSTYL);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, 0 | MyGlb.FLD_INLIST, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, "44ACBD5B-BFF1-4A27-B5DA-AA71A90434CA");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, "TIPO DIST");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, "Brief description of field content.");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.VIS_NONNULLAFIEL);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, 0, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, "17988293-65D1-4B42-A950-4FFC1484C987");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, "FLAG LIQUIDATO");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, "Brief description of field content.");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, "F0A3C59D-5ACA-4AEB-9C4B-376049B2F20B");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, "ANNO DEL");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, "3EEDDEF6-4584-4F16-8D2B-62918DF967E6");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, "NUMERO DEL");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, "57612CA8-8721-4834-AA34-5FB2B6F4A379");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, "SEDE DEL");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, "EDBCE2F9-9225-42ED-9B00-DD8C19E86605");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, "ANNO IMP");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, "52388FAC-14B4-41E5-810E-141F1EF5B4F9");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, "NUMERO IMP");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, "7688FD31-15C6-42E7-BA94-EAADFE1AFCBD");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, "ANNO SUBIMP");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, "1B80EAEA-280C-450B-B5A8-0E0185EC6DF2");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, "A4749641-3EC9-4A2B-A18C-B3EEB6014722");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, "LINK GDM");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_DISTINTE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, "BF77730D-F481-455C-854B-B27FF6612040");
    PAN_DISTINTE.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, "Siope Attivo Arm");
    PAN_DISTINTE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, "");
    PAN_DISTINTE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.VIS_NORMFIELPADR);
    PAN_DISTINTE.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISTINTE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_LIST, 4, 48, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_LIST, 104);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_LIST, "Distinta");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_FORM, 108, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_FORM, 52);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA, MyGlb.PANEL_FORM, "Distinta");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_DISTINTA, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_DISTINTA, PPQRY_DISTINLIQUI8, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 5, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, 56, 48, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, 88);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, 224, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, 84);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ANNO, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ANNO, PPQRY_DISTINLIQUI8, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_LIST, 96, 48, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_LIST, 88);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_FORM, 280, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_FORM, 36);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_DATA1, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_DATA1, PPQRY_DISTINLIQUI8, "A.DATA_DISTINTA", "DATA_DISTINTA", 6, 19, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_LIST, 180, 48, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_LIST, 84);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_FORM, 104, 60, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_FORM, 56);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_IMPORTO1, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(B.IMPORTO), 0) ");
  SQL.append("from ");
  SQL.append("  LIQ_DISTINTA B ");
  SQL.append("where (A.ANNO_DISTINTA = B.ANNO_DISTINTA) ");
  SQL.append("and   (A.NUMERO_DISTINTA = B.NUMERO_DISTINTA) ");
  SQL.append(")");
    PAN_DISTINTE.SetFieldUnbound(PFL_DISTINTE_IMPORTO1, true);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_IMPORTO1, PPQRY_DISTINLIQUI8, SQL.toString(), "RECORDIMPORT", 3, 28, 6, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_LIST, 304, 48, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_LIST, 44);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_LIST, "Stato");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_FORM, 116, 84, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_FORM, 44);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_STATO1, MyGlb.PANEL_FORM, "Stato");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_STATO1, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_STATO1, PPQRY_DISTINLIQUI8, "A.STATO", "STATO", 1, 2, 0, -13997);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO1, (new IDVariant(10)), "In preparazione", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO1, (new IDVariant(20)), "Completa", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO1, (new IDVariant(25)), "Inclusa in Atto", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO1, (new IDVariant(27)), "Liquidabile", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_STATO1, (new IDVariant(30)), "Liquidata", "", "", -1);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_LIST, 8, 296, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_LIST, 44);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_LIST, "Uten.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_FORM, 16, 228, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_UTENTE1, -1, GRP_DISTINTE_INSERIMENTO);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_UTENTE1, PPQRY_DISTINLIQUI8, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_LIST, 120, 296, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_LIST, 32);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_LIST, "Dt.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_FORM, 152, 228, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_FORM, 36);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA2, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_DATA2, -1, GRP_DISTINTE_INSERIMENTO);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_DATA2, PPQRY_DISTINLIQUI8, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_LIST, 244, 296, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_LIST, 44);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_LIST, "Uten.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_FORM, 272, 228, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_UTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_UTENTE, -1, GRP_DISTINTE_AGGIORNAMENT);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_UTENTE, PPQRY_DISTINLIQUI8, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, 356, 296, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, 32);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_LIST, "Dt.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, 408, 228, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, 36);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_DATA, -1, GRP_DISTINTE_AGGIORNAMENT);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_DATA, PPQRY_DISTINLIQUI8, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_LIST, 420, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_LIST, 84);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_LIST, "Scadenza Dal");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_FORM, 76, 108, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_FORM, 84);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZADAL, MyGlb.PANEL_FORM, "Scadenza Dal");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_SCADENZADAL, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_SCADENZADAL, PPQRY_DISTINLIQUI8, "A.SCADENZA_DAL", "SCADENZA_DAL", 6, 10, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_LIST, 500, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_LIST, 76);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_FORM, 276, 108, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_FORM, 36);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_AL1, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_AL1, PPQRY_DISTINLIQUI8, "A.SCADENZA_AL", "SCADENZA_AL", 6, 10, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_LIST, 620, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_LIST, "U.O.");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_FORM, 128, 132, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_FORM, 32);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_PROGUNITORGA, MyGlb.PANEL_FORM, "U.O.");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_PROGUNITORGA, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_PROGUNITORGA, PPQRY_DISTINLIQUI8, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_LIST, 580, 48, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_LIST, 132);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_LIST, "U.O. Competenza");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_FORM, 52, 156, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_FORM, 108);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_UOCOMPETENZA, MyGlb.PANEL_FORM, "U.O. Competenza");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_UOCOMPETENZA, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_UOCOMPETENZA, PPQRY_DISTINLIQUI8, "A.PROGR_UO_COMPETENZA", "PROGR_UO_COMPETENZA", 1, 8, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, MyGlb.PANEL_LIST, 120, 8, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, MyGlb.PANEL_LIST, 0);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, MyGlb.PANEL_FORM, 208, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, MyGlb.PANEL_FORM, 0);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_BARRA5, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_BARRA5, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_BARRA5, -1, "", "BARRA5", 0, 0, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, MyGlb.PANEL_LIST, 420, 12, 160, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, MyGlb.PANEL_LIST, 0);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, MyGlb.PANEL_LIST, 2);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, MyGlb.PANEL_FORM, 480, 12, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, MyGlb.PANEL_FORM, 0);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SCADENZA, MyGlb.PANEL_FORM, 2);
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_SCADENZA, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_SCADENZA, -1, "", "SCADENZA", 0, 0, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, MyGlb.PANEL_LIST, 4, 12, 92, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, MyGlb.PANEL_LIST, 0);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, MyGlb.PANEL_LIST, 2);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, MyGlb.PANEL_FORM, 4, 12, 88, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, MyGlb.PANEL_FORM, 0);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_DISTINTA1, MyGlb.PANEL_FORM, 2);
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_DISTINTA1, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_DISTINTA1, -1, "", "DISTINTA1", 0, 0, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_LIST, 60);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_LIST, "TIPO DIST");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_FORM, 4, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_FORM, 60);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_TIPODIST, MyGlb.PANEL_FORM, "TP. DIST");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_TIPODIST, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_TIPODIST, PPQRY_DISTINLIQUI8, "A.TIPO_DIST", "TIPO_DIST", 5, 1, 0, -13997);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_TIPODIST, (new IDVariant("B")), "Ordini", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_TIPODIST, (new IDVariant("D")), "Disposizioni", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_TIPODIST, (new IDVariant("L")), "Liquidazioni", "", "", -1);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_LIST, 580, 48, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_LIST, 92);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_LIST, "FLAG LIQUIDATO");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_FORM, 4, 248, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_FORM, 92);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_FLAGLIQUIDAT, MyGlb.PANEL_FORM, "FLG. LIQUID.");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_FLAGLIQUIDAT, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_FLAGLIQUIDAT, PPQRY_DISTINLIQUI8, "A.FLAG_LIQUIDATO", "FLAG_LIQUIDATO", 5, 2, 0, -13997);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_FLAGLIQUIDAT, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_DISTINTE.SetValueListItem(PFL_DISTINTE_FLAGLIQUIDAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_LIST, 580, 48, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_FORM, 4, 272, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ANNODEL, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ANNODEL, PPQRY_DISTINLIQUI8, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_LIST, 580, 48, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_LIST, "NUMERO DEL");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_FORM, 4, 296, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_NUMERODEL, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_NUMERODEL, PPQRY_DISTINLIQUI8, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_LIST, 580, 48, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_FORM, 4, 320, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_SEDEDEL, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_SEDEDEL, PPQRY_DISTINLIQUI8, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_LIST, 580, 48, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_LIST, 60);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_FORM, 4, 344, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_FORM, 60);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOIMP1, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ANNOIMP1, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ANNOIMP1, PPQRY_DISTINLIQUI8, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_LIST, 580, 48, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_FORM, 4, 368, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_NUMEROIMP, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_NUMEROIMP, PPQRY_DISTINLIQUI8, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_LIST, 580, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_LIST, 80);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_LIST, "ANNO SUBIMP");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_FORM, 4, 392, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_FORM, 80);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_ANNOSUBIMP1, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_ANNOSUBIMP1, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_ANNOSUBIMP1, PPQRY_DISTINLIQUI8, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_LIST, 580, 48, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 416, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_NUMEROSUBIMP, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_NUMEROSUBIMP, PPQRY_DISTINLIQUI8, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_LIST, 580, 48, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_LIST, 56);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_LIST, 2);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_LIST, "LINK GDM");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_FORM, 4, 248, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_FORM, 56);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_FORM, 2);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_LINKGDM, MyGlb.PANEL_FORM, "LINK GDM");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_LINKGDM, -1, -1);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_LINKGDM, PPQRY_DISTINLIQUI8, "A.LINK_GDM", "LINK_GDM", 5, 500, 0, -13997);
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_LIST, 104);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_LIST, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_LIST, "Siope Attivo Arm");
    PAN_DISTINTE.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_FORM, 4, 252, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINTE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_FORM, 104);
    PAN_DISTINTE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_FORM, 1);
    PAN_DISTINTE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINTE_SIOPEATTIARM, MyGlb.PANEL_FORM, "Siope Attivo Arm");
    PAN_DISTINTE.SetFieldPage(PFL_DISTINTE_SIOPEATTIARM, -1, -1);
    PAN_DISTINTE.SetFieldUnbound(PFL_DISTINTE_SIOPEATTIARM, true);
    PAN_DISTINTE.SetFieldPanel(PFL_DISTINTE_SIOPEATTIARM, PPQRY_DISTINLIQUI8, "GET_SIOPE_ATTIVO_ARM(NVL(A.ANNO_DISTINTA, ~~TBL_DATISESSIONE.SESSIOESERCI~~))", "SIOPEATTIARM", 5, 99, 0, -13997);
  }

  private void PAN_DISTINTE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINTE.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTININDIL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTININDILD ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_DISTINTE.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_DISTINTE_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as REUTININDIL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as REUTININDILD ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DISTINTE.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_DISTINTE_UTENTE1, "");
    PAN_DISTINTE.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as REUTAGINDIL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as REUTAGINDILD ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_DISTINTE.SetQuery(PPQRY_DUAL, 0, SQL, PFL_DISTINTE_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as REUTAGINDIL1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as REUTAGINDILD ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DISTINTE.SetQuery(PPQRY_DUAL, 1, SQL, PFL_DISTINTE_UTENTE, "");
    PAN_DISTINTE.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.DESCRIZIONE as CF4WSTRUDESC ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    PAN_DISTINTE.SetQuery(PPQRY_CF4WEBSTRUTT, 0, SQL, PFL_DISTINTE_PROGUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CF4STRPRUNOR, ");
    SQL.append("  A.DESCRIZIONE as CF4WSTRUDESC ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    PAN_DISTINTE.SetQuery(PPQRY_CF4WEBSTRUTT, 1, SQL, PFL_DISTINTE_PROGUNITORGA, "");
    PAN_DISTINTE.SetQueryDB(PPQRY_CF4WEBSTRUTT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORCFSPUO, ");
    SQL.append("  A.DESCRIZIONE as ANUNORCFSTDE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UO_COMPETENZA~~) ");
    SQL.append("and   (A.TIPO_STRUTTURA = 'COMP') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_DISTINTE.SetQuery(PPQRY_ANAGUNITORGA, 0, SQL, PFL_DISTINTE_UOCOMPETENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORCFSPUO, ");
    SQL.append("  A.DESCRIZIONE as ANUNORCFSTDE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA A ");
    SQL.append("where (A.TIPO_STRUTTURA = 'COMP') ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_DISTINTE.SetQuery(PPQRY_ANAGUNITORGA, 1, SQL, PFL_DISTINTE_UOCOMPETENZA, "");
    PAN_DISTINTE.SetQueryDB(PPQRY_ANAGUNITORGA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINTE.SetIMDB(IMDB, "PQRY_DISTINLIQUI8", true);
    PAN_DISTINTE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.DATA_DISTINTA as DATA_DISTINTA, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.FLAG_LIQUIDATO as FLAG_LIQUIDATO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.SCADENZA_DAL as SCADENZA_DAL, ");
    SQL.append("  A.SCADENZA_AL as SCADENZA_AL, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(B.IMPORTO), 0) ");
    SQL.append("from ");
    SQL.append("  LIQ_DISTINTA B ");
    SQL.append("where (A.ANNO_DISTINTA = B.ANNO_DISTINTA) ");
    SQL.append("and   (A.NUMERO_DISTINTA = B.NUMERO_DISTINTA) ");
    SQL.append(") as RECORDIMPORT, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.TIPO_DIST as TIPO_DIST, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.LINK_GDM as LINK_GDM, ");
    SQL.append("  A.PROGR_UO_COMPETENZA as PROGR_UO_COMPETENZA, ");
    SQL.append("  GET_SIOPE_ATTIVO_ARM(NVL(A.ANNO_DISTINTA, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) as SIOPEATTIARM ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DISTINTE_LIQUIDAZIONE A ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DISTINTA = ~~TBL_PARAMETRI412.PARANNDISFIL~~) ");
    SQL.append("and   (A.NUMERO_DISTINTA = ~~TBL_PARAMETRI412.PARNUMDISFIL~~) ");
    SQL.append("and   (A.DATA_DISTINTA = ~~TBL_PARAMETRI412.PARDATDISFIL~~) ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA ");
    PAN_DISTINTE.SetQuery(PPQRY_DISTINLIQUI8, 5, SQL, -1, "");
    PAN_DISTINTE.SetQueryDB(PPQRY_DISTINLIQUI8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINTE.SetMasterTable(0, "DISTINTE_LIQUIDAZIONE");
    PAN_DISTINTE.AddToSortList(PFL_DISTINTE_ANNO, true);
    PAN_DISTINTE.AddToSortList(PFL_DISTINTE_DISTINTA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINTE.Status() == 2)
    {
      int oldListQBE = PAN_DISTINTE.iUseListQBE;
      PAN_DISTINTE.iUseListQBE = 0;
      PAN_DISTINTE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINTE.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINTE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LIQUIDAZIONI_Init()
  {

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, "34405A0C-9A93-42CD-A7C6-6A08899189FE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, MyGlb.VIS_GROUSTYLLIST);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 2200, -9999, 324, 16, 0, 0);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 104, 256, 512, 28, 0, 0);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, 0, 83);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, 1, 13);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, 0, 4);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, 1, 1);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, "2D8F18C6-F08A-45C1-8837-D6972E08F049");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, "Fattore");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, MyGlb.VIS_GROUSTYLLIST);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_LIST, 2524, -9999, 312, 16, 0, 0);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_FORM, 104, 280, 512, 28, 0, 0);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, 0, 42);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, 1, 13);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, 0, 4);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, 1, 1);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, "26484729-E275-450E-8F56-84D74350F26B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, "Centro");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, MyGlb.VIS_GROUSTYLLIST);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_LIST, 2836, -9999, 312, 16, 0, 0);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_FORM, 104, 304, 512, 28, 0, 0);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, 0, 38);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, 1, 13);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, 0, 4);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, 1, 1);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, "45890A3F-E8E6-4095-A8DA-904AF3C98CEC");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, "Competenza");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, MyGlb.PANEL_LIST, 3148, -9999, 160, 16, 0, 0);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, MyGlb.PANEL_FORM, 108, 338, 264, 38, 0, 0);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, 0, 71);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, 1, 13);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, 0, 4);
    PAN_LIQUIDAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, 1, 2);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIONI_COMPETENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_FIELD, 63);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "B6EFB9C9-5986-47F1-92E4-0FCEDEAC9A9D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "Importo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_IMPORTO, 0, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_IMPORTO, 0, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, "F2189268-3516-42C2-8D09-0FFEB9E2C869");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, "Fattura");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTURA, 1, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTURA, 1, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "A82BF2AB-ECC9-41CA-BCE8-234B2C8867A6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "D DATA DOC");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DDATADOC, 2, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DDATADOC, 2, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, "85A91E6F-7F86-453A-B094-65685FBB9F69");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, "Info Fattura List");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOFATTLIST, 3, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOFATTLIST, 3, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, "8BF5F8A4-4796-4253-A079-E1C61E10D2C0");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIDAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, 0, "info.gif", false);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOFATTFORM, 45, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOFATTFORM, 45, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, "887792DE-65D1-4B92-B227-6B8807D912F2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, "INS DA FATTURE");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INSDAFATTURE, 50, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INSDAFATTURE, 50, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, "C019A98D-0F1C-4666-89B4-35D9EF5CF64C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, "Impegno");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_IMPEGNO, 4, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_IMPEGNO, 4, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "705F70AD-EEF2-4BA7-874D-DC10782D2DC1");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "ANNO IMP");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNOIMP, 5, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNOIMP, 5, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, "4C6D9E4A-8B85-4315-801B-285AD4C2B87D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, "Info Imp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, "If (LIQ DISTINTA INS DA FATTURE = \"SI\", Apri, If (not (Is Null (LIQ DISTINTA NUMERO IMP)), Info, \"\"))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOIMP, 6, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOIMP, 6, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, "CE1E974F-10D1-4403-B53B-83A0628B23F3");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, "Subimpegno");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_SUBIMPEGNO, 7, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_SUBIMPEGNO, 7, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "580A0ACE-EB69-43F8-BF84-3B40BE98E6AB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNOSUBIMP, 8, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNOSUBIMP, 8, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, "6BC4245F-5420-4567-918F-1E51AC28ECF4");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, "Info Subimp");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, "If (LIQ DISTINTA INS DA FATTURE = \"SI\", Apri, If (not (Is Null (LIQ DISTINTA NUMERO SUBIMP)), Info, \"\"))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOSUBIMP, 9, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOSUBIMP, 9, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, "0A44A7D6-B1EF-4B40-BE4D-86610FD06A8C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, "Fornitore");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FORNITORE, 10, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FORNITORE, 10, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "1D0A8C53-043C-4C98-8476-8C09B11C0AEB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "BENEFICIARIO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BENEFICIARIO, 11, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BENEFICIARIO, 11, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, "CE655547-AA39-428E-A3FC-97DA85C703AA");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, "Info Fornitore");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOFORNITOR, 12, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOFORNITOR, 12, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, "38DFCD94-A8D1-4AA8-A763-FF9E92B58949");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIDAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, 0, "info.gif", false);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOSOGGETTI, 13, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOSOGGETTI, 13, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "DCDCE7AD-AEAF-4C7B-B03E-1F726A161E49");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "Quietanza");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_QUIETANZA, 14, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_QUIETANZA, 14, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, "08C640D9-F4E7-4A0E-AC2D-B68F8CDA2895");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, "Descrizione Quietanza");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DESCRIQUIETA, 15, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DESCRIQUIETA, 15, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "82AEA613-B404-44A2-86A4-F21DC23D0DF4");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DESCRIZIONE, 16, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DESCRIZIONE, 16, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, "6C09FCF5-A1B5-4D26-95DD-0323DA1DD1AF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, "Fattura");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTURELABEL, 17, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTURELABEL, 17, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, "FEAFD232-82C7-4B0C-9DEB-FD3FBD842798");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, "Fornitore");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FORNITOLABEL, 18, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FORNITOLABEL, 18, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, "B7B1BA49-10E3-49F7-BEF5-527BEE28732F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, MyGlb.VIS_ETICHEGRASSE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ESTREMDISTIN, 19, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ESTREMDISTIN, 19, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, "E441FA27-5A5A-4AF1-B72C-1A052ABCE453");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_PROGRESSIVO, 51, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_PROGRESSIVO, 51, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, "9DA0C3A0-5767-4E46-ADC2-E078F2B5A568");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, "ANNO PROG FAT");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNOPROGFAT, 52, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNOPROGFAT, 52, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, "140700E2-749C-4842-907C-45A41780683B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, "NUMERO PROG FAT");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_NUMERPROGFAT, 53, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_NUMERPROGFAT, 53, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, "7FB36DDE-7AA4-434A-9A3C-66C87D32C8DE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, "Impegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELIMPEGNO, 20, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELIMPEGNO, 20, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, "F77A60E5-1A87-4C88-8C92-AE6FB58E34E7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, "Subimpegno");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELSUBIMPE, 21, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELSUBIMPE, 21, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, "FA737E79-4C27-4255-9294-A054CA28B61D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, "/");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BARRA, 22, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BARRA, 22, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, "41564FBD-D527-43DA-B7FB-C33C46D48264");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, "/");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BARRA1, 23, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BARRA1, 23, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, "FE11BA28-3B45-4148-8192-61D582B0FC3F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIDAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, 0, "info.gif", false);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOIMPEGNO, 24, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOIMPEGNO, 24, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, "F2D153AA-ECA1-4317-8D52-BBCC3163A1A8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, "/");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BARRA2, 25, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_BARRA2, 25, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, "BDF5F4A7-46E7-4FDF-97D7-2213D2D9CB04");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIDAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, 0, "info.gif", false);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOSUBIMPEG, 26, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_INFOSUBIMPEG, 26, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, "D61EBAE7-F267-4850-A5BB-52958A9810E8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, "Cig");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CIG, 27, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CIG, 27, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, "97E39E38-A010-458E-AD0A-4B1A594B13D5");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, "Esclusione Cig");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_MOTIVESCLCIG, 49, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_MOTIVESCLCIG, 49, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, "F2959F24-F896-4E35-8F6B-53D9EB6EF7EB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, "Cup");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CUP, 28, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CUP, 28, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, "38F13930-2327-4C11-BD51-F62F9FBFB2F2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, "Voce Economica");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_VOCEECONOMIC, 29, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_VOCEECONOMIC, 29, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, "45CA3F7E-F25B-4C33-8227-8318A61072ED");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, "RICLASSIFICAZIONI VOCI ECONOMICHE CODICE");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_RICVOCECOCOD, 30, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_RICVOCECOCOD, 30, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "1DA813C4-5D3D-4063-82A7-5E0C6C0EA7A3");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "Cgu");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CGU, 31, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CGU, 31, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, "0B87BA0C-A5CE-4C91-800F-951B8AF365DA");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CODIGESTDESC, 32, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CODIGESTDESC, 32, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "8EBAEC75-4D42-4A48-8979-C9DCCFD7D367");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "Codice");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FINANZIAMENT, 33, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FINANZIAMENT, 33, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, "464CD288-3DB7-417B-A928-C12D4228E63C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, "Descrizione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FINANZDESCRI, 34, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FINANZDESCRI, 34, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, "CC53889F-8A46-4EAD-9A08-D5A473852881");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, "Codice");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTORE, 35, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTORE, 35, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, "31156E59-0B8E-49A2-9BE7-9EE180609458");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, "Descrizione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTORDESCRI, 36, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_FATTORDESCRI, 36, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, "35ED9E31-BDB9-4341-8CFF-C6B5C6A66532");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, "Codice");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CENTRO, 37, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CENTRO, 37, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, "01622962-5486-432C-A4F4-5FAEB63FF7AD");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, "Descrizione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CENTRIDESCRI, 38, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_CENTRIDESCRI, 38, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, "50879CB1-882D-4CCA-BCEA-F21770EF2E8F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, "Voce Economica");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABEVOCEECON, 39, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABEVOCEECON, 39, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, "7A8242B7-02FA-48BC-A642-95A94BA793E7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, "Cgu");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELCGU, 40, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELCGU, 40, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "5401F2CC-C0FD-4160-8A7C-2B31568A8658");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "ANNO DISTINTA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNODISTINTA, 54, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ANNODISTINTA, 54, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "C3AF7639-2912-4DB1-BF97-50410F904B29");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "NUMERO DISTINTA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_NUMERODISTIN, 55, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_NUMERODISTIN, 55, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, "75DE9041-E0F3-4203-AA03-D199C511C7C7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, "IMP RILEVANTE ECO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_IMPRILEVAECO, 56, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_IMPRILEVAECO, 56, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, "AFE69B96-5824-4F42-9E50-44E174A45724");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, "SUBIMP RILEVANTE ECO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_SUBIMRILEECO, 57, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_SUBIMRILEECO, 57, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, "4D8A5009-23F0-4F91-BCFA-B7F3F97C458D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, "Dal");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DAL, 41, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DAL, 41, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, "BF14F528-4867-40A6-8402-3EAEEC54CA9C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, "Al");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_AL, 42, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_AL, 42, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, "37CAC1DB-371F-4222-B4A9-C8720E9FB79D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, "Competenza");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELCOMPETE, 43, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELCOMPETE, 43, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, "2F083A42-FB60-45E2-BB40-7F33A311DE31");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_UTENTEINSERI, 58, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_UTENTEINSERI, 58, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, "305F197D-3CA6-4FC9-8E34-44A33AA914A2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DATAINSERIME, 59, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DATAINSERIME, 59, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, "BC10A4C8-A911-4134-A3BE-116E711684F8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_UTENTULTIAGG, 60, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_UTENTULTIAGG, 60, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, "83AB8E68-9882-43C2-8627-06AFD736F66D");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DATAULTIMAGG, 61, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_DATAULTIMAGG, 61, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, "7594A6D8-B555-407C-A1EC-FC0F9A12BEDB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, "STATO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_STATO, 62, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_STATO, 62, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, "7921C6D3-1AAB-4F43-9AA0-D6F0CF2A19CD");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, "Quietanza");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELQUIETAN, 44, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_LABELQUIETAN, 44, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, "A5C77BE5-C5CE-47A8-BB10-395D1594E62A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, "Finanziamento");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ETICHEFINANZ, 46, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ETICHEFINANZ, 46, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, "EF73ACDD-D820-4BDF-B0F3-5DF82A9A9683");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, "Fattore");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ETICHEFATTOR, 47, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ETICHEFATTOR, 47, MyGlb.PANEL_LIST);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, "937B8E99-FB15-489B-9BB5-81B4D4317673");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, "Centro");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ETICHECENTRO, 48, MyGlb.PANEL_FORM);
    PAN_LIQUIDAZIONI.SetTabOrder(PFL_LIQUIDAZIONI_ETICHECENTRO, 48, MyGlb.PANEL_LIST);
  }

  private void PAN_LIQUIDAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 4, 84, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 48, 32, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTO, PPQRY_LIQDISTINTA1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_LIST, 128, 84, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_LIST, "Fattura");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_FORM, 52, 56, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_FORM, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURA, MyGlb.PANEL_FORM, "Fattura");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATTURA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATTURA, PPQRY_FAT, "A.NUMERO_DOC", "FATNUMERODOC", 5, 20, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 236, 84, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 288, 56, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DDATADOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DDATADOC, PPQRY_FAT, "A.D_DATA_DOC", "FATDDATADOC", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_LIST, 308, 84, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_LIST, "I. F. L.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_FORM, 4, 568, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTLIST, MyGlb.PANEL_FORM, "Info Fattura List");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOFATTLIST, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFOFATTLIST, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOFATTLIST, PPQRY_LIQDISTINTA1, "", "LIFABUINFALI", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFATTLIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, MyGlb.PANEL_LIST, 200, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, MyGlb.PANEL_FORM, 356, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFATTFORM, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOFATTFORM, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOFATTFORM, -1, "", "INFOFATTFORM", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_LIST, 328, 84, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_LIST, "IN. D. FTT.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_FORM, 4, 364, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INSDAFATTURE, MyGlb.PANEL_FORM, "INS DA FATT.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INSDAFATTURE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INSDAFATTURE, PPQRY_LIQDISTINTA1, "A.LIQDISINDAFA", "LIQDISINDAFA", 5, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 328, 84, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 44, 164, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPEGNO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPEGNO, PPQRY_LIQDISTINTA1, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 388, 84, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 172, 164, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOIMP, PPQRY_LIQDISTINTA1, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_LIST, 432, 84, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_LIST, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_LIST, "I. I.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_FORM, 4, 300, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_FORM, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMP, MyGlb.PANEL_FORM, "Info Imp");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFOIMP, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOIMP, PPQRY_LIQDISTINTA1, "", "LIQFATBUINIM", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOIMP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 452, 84, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_LIST, "Subimp.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 408, 164, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMPEGNO, MyGlb.PANEL_FORM, "Subimpegno");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SUBIMPEGNO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SUBIMPEGNO, PPQRY_LIQDISTINTA1, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 512, 84, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 572, 164, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOSUBIMP, PPQRY_LIQDISTINTA1, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_LIST, 556, 84, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_LIST, "I. S.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_FORM, 4, 348, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMP, MyGlb.PANEL_FORM, "Info Subimp");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOSUBIMP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFOSUBIMP, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOSUBIMP, PPQRY_LIQDISTINTA1, "", "LIQFATBUINSU", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOSUBIMP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_LIST, 576, 84, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_LIST, 140);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_LIST, "Fornitore");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_FORM, 40, 80, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITORE, MyGlb.PANEL_FORM, "Fornitore");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FORNITORE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FORNITORE, PPQRY_BEN, "A.RAGIONE_SOCIALE", "BENRAGIOSOCI", 5, 40, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 828, 84, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFIC.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 560, 80, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFIC.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BENEFICIARIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BENEFICIARIO, PPQRY_LIQDISTINTA1, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_LIST, 888, 84, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_LIST, "I. Fr.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_FORM, 4, 616, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOFORNITOR, MyGlb.PANEL_FORM, "Info Fornitore");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOFORNITOR, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFOFORNITOR, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOFORNITOR, PPQRY_LIQDISTINTA1, "", "LIQFATBUINFO", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOFORNITOR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, MyGlb.PANEL_LIST, 588, 60, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, MyGlb.PANEL_FORM, 616, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSOGGETTI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOSOGGETTI, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOSOGGETTI, -1, "", "INFOSOGGETTI", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 908, 84, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, "Quiet.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 36, 104, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_QUIETANZA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_QUIETANZA, PPQRY_LIQDISTINTA1, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_LIST, 956, 84, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_LIST, "Descrizione Quietanza");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_FORM, 152, 104, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIQUIETA, MyGlb.PANEL_FORM, "Descr. Quiet.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DESCRIQUIETA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DESCRIQUIETA, PPQRY_QTN, "B.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1180, 84, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 28, 128, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DESCRIZIONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DESCRIZIONE, PPQRY_LIQDISTINTA1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, MyGlb.PANEL_LIST, 128, 48, 200, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, MyGlb.PANEL_FORM, 0, 0, 220, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTURELABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATTURELABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATTURELABEL, -1, "", "FATTURELABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, MyGlb.PANEL_LIST, 576, 48, 332, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, MyGlb.PANEL_FORM, 8, 8, 220, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FORNITOLABEL, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FORNITOLABEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FORNITOLABEL, -1, "", "FORNITOLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, MyGlb.PANEL_LIST, 6, 8, 656, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, MyGlb.PANEL_FORM, 8, 4, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ESTREMDISTIN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ESTREMDISTIN, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ESTREMDISTIN, -1, "", "ESTREMDISTIN", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 988, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 560, 272, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PROGRESSIVO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PROGRESSIVO, PPQRY_LIQDISTINTA1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_LIST, 1068, 84, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_LIST, "ANNO PROG FAT");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_FORM, 4, 712, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOPROGFAT, MyGlb.PANEL_FORM, "ANN. PROG FAT");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOPROGFAT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOPROGFAT, PPQRY_LIQDISTINTA1, "A.ANNO_PROG_FAT", "ANNO_PROG_FAT", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_LIST, 1160, 84, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_LIST, "NUMERO PROG FAT");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_FORM, 4, 736, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERPROGFAT, MyGlb.PANEL_FORM, "NUM. PROG FAT");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERPROGFAT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERPROGFAT, PPQRY_LIQDISTINTA1, "A.NUMERO_PROG_FAT", "NUMERO_PROG_FAT", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, MyGlb.PANEL_LIST, 328, 48, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, MyGlb.PANEL_FORM, 796, 48, 104, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LABELIMPEGNO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LABELIMPEGNO, -1, "", "LABELIMPEGNO", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, MyGlb.PANEL_LIST, 452, 48, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, MyGlb.PANEL_FORM, 804, 56, 104, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LABELSUBIMPE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LABELSUBIMPE, -1, "", "LABELSUBIMPE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, MyGlb.PANEL_LIST, 176, 60, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, MyGlb.PANEL_FORM, 268, 56, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BARRA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, MyGlb.PANEL_LIST, 184, 68, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, MyGlb.PANEL_FORM, 152, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BARRA1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BARRA1, -1, "", "BARRA1", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 184, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 216, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOIMPEGNO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, MyGlb.PANEL_LIST, 192, 76, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, MyGlb.PANEL_FORM, 552, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BARRA2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BARRA2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BARRA2, -1, "", "BARRA2", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 192, 176, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 616, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOSUBIMPEG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOSUBIMPEG, -1, "", "INFOSUBIMPEG", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_LIST, 1424, 84, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_LIST, 28);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_FORM, 72, 188, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_FORM, 32);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CIG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CIG, PPQRY_LIQDISTINTA1, "A.CIG", "CIG", 5, 15, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_LIST, 3308, 84, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_LIST, 148);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_LIST, "Esclusione Cig");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_FORM, 228, 188, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MOTIVESCLCIG, MyGlb.PANEL_FORM, "Esclusione Cig");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_MOTIVESCLCIG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_MOTIVESCLCIG, PPQRY_LIQDISTINTA1, "A.MOTIVO_ESCLUSIONE_CIG", "LIFABUMOESCI", 5, 50, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_LIST, 1508, 84, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_LIST, 28);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_LIST, "Cup");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_FORM, 460, 188, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_FORM, 32);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CUP, MyGlb.PANEL_FORM, "Cup");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CUP, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CUP, PPQRY_LIQDISTINTA1, "A.CUP", "CUP", 5, 15, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_LIST, 1592, 84, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_LIST, "Vc. Econ.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_FORM, 4, 212, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_VOCEECONOMIC, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_VOCEECONOMIC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_VOCEECONOMIC, PPQRY_LIQDISTINTA1, "A.VOCE_ECONOMICA", "VOCE_ECONOMICA", 1, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_LIST, 1652, 84, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_LIST, 248);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_LIST, "RICLASSIFICAZIONI VOCI ECONOMICHE CODICE");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_FORM, 184, 212, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_FORM, 248);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RICVOCECOCOD, MyGlb.PANEL_FORM, "RICLASSIF. VOCI ECONOMICHE CODICE");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_RICVOCECOCOD, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_RICVOCECOCOD, PPQRY_VOCIECONOMIC, "A.DESCRIZIONE", "VOCIECONDESC", 5, 140, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 1896, 84, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 72, 236, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 32);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CGU, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CGU, PPQRY_LIQDISTINTA1, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_LIST, 1956, 84, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_LIST, 180);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_FORM, 184, 236, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_FORM, 180);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODIGESTDESC, MyGlb.PANEL_FORM, "COD. GESTIONALI DESCRIZIONE");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CODIGESTDESC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CODIGESTDESC, PPQRY_CODICIGESTIO, "A.DESCRIZIONE", "CODIGESTDESC", 5, 200, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 2200, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Codice");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 108, 260, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Codice");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FINANZIAMENT, -1, GRP_LIQUIDAZIONI_FINANZIAMENT);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FINANZIAMENT, PPQRY_LIQDISTINTA1, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, 2280, 84, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, 160);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, 184, 260, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, 160);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZDESCRI, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FINANZDESCRI, -1, GRP_LIQUIDAZIONI_FINANZIAMENT);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_LIST, 2524, 84, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_LIST, "Codice");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_FORM, 108, 284, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORE, MyGlb.PANEL_FORM, "Codice");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATTORE, -1, GRP_LIQUIDAZIONI_FATTORE);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATTORE, PPQRY_LIQDISTINTA1, "A.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_LIST, 2592, 84, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_FORM, 184, 284, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATTORDESCRI, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATTORDESCRI, -1, GRP_LIQUIDAZIONI_FATTORE);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_LIST, 2836, 84, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_LIST, "Codice");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_FORM, 108, 308, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRO, MyGlb.PANEL_FORM, "Codice");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CENTRO, -1, GRP_LIQUIDAZIONI_CENTRO);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CENTRO, PPQRY_LIQDISTINTA1, "A.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_LIST, 2904, 84, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_FORM, 184, 308, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CENTRIDESCRI, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CENTRIDESCRI, -1, GRP_LIQUIDAZIONI_CENTRO);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "FATTCENTDESC", 5, 200, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, MyGlb.PANEL_LIST, 1592, 48, 304, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, MyGlb.PANEL_FORM, 812, 64, 104, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABEVOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LABEVOCEECON, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LABEVOCEECON, -1, "", "LABEVOCEECON", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, MyGlb.PANEL_LIST, 1896, 48, 304, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, MyGlb.PANEL_FORM, 820, 72, 104, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCGU, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LABELCGU, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LABELCGU, -1, "", "LABELCGU", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 2848, 84, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, "ANNO DISTINTA");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 328, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, "ANN. DISTINTA");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODISTINTA, PPQRY_LIQDISTINTA1, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 2848, 84, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, "NUMERO DISTINTA");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 352, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, "NUM. DISTINTA");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODISTIN, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODISTIN, PPQRY_LIQDISTINTA1, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_LIST, "IMP RILEVANTE ECO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_FORM, 628, 160, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPRILEVAECO, MyGlb.PANEL_FORM, "IMP RILEV. ECO");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPRILEVAECO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPRILEVAECO, PPQRY_IMP2, "A.RILEVANTE_ECO", "IMPRILEVAECO", 5, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_IMPRILEVAECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_IMPRILEVAECO, (new IDVariant()), "Null", "", "", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_LIST, 128);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_LIST, "SUBIMP RILEVANTE ECO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_FORM, 608, 184, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_FORM, 128);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SUBIMRILEECO, MyGlb.PANEL_FORM, "SUB. RILEVANTE ECO");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SUBIMRILEECO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SUBIMRILEECO, PPQRY_IMP1, "A.RILEVANTE_ECO", "IMPSUBRILECO", 5, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_SUBIMRILEECO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_SUBIMRILEECO, (new IDVariant()), "Null", "", "", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_LIST, 3148, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_FORM, 112, 352, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DAL, -1, GRP_LIQUIDAZIONI_COMPETENZA);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DAL, PPQRY_LIQDISTINTA1, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_LIST, 3228, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_FORM, 236, 352, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_FORM, 40);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_AL, -1, GRP_LIQUIDAZIONI_COMPETENZA);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_AL, PPQRY_LIQDISTINTA1, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, MyGlb.PANEL_LIST, 3148, 48, 160, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, MyGlb.PANEL_FORM, 852, 104, 104, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELCOMPETE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LABELCOMPETE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LABELCOMPETE, -1, "", "LABELCOMPETE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 3056, 84, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 364, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UTENTEINSERI, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UTENTEINSERI, PPQRY_LIQDISTINTA1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 3176, 84, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 388, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DATAINSERIME, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DATAINSERIME, PPQRY_LIQDISTINTA1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 8, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 3284, 84, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 412, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UTENTULTIAGG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UTENTULTIAGG, PPQRY_LIQDISTINTA1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 3396, 84, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 436, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DATAULTIMAGG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DATAULTIMAGG, PPQRY_LIQDISTINTA1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_LIST, 3056, 84, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_LIST, 44);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_LIST, "STATO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_FORM, 596, 248, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_FORM, 44);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_STATO, MyGlb.PANEL_FORM, "STATO");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_STATO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_STATO, PPQRY_LIQDISTINTA1, "A.LIQDISTISTAT", "LIQDISTISTAT", 5, 1, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, MyGlb.PANEL_LIST, 908, 48, 272, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, MyGlb.PANEL_FORM, 820, 72, 104, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LABELQUIETAN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LABELQUIETAN, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LABELQUIETAN, -1, "", "LABELQUIETAN", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, MyGlb.PANEL_LIST, 12, 356, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, MyGlb.PANEL_FORM, 12, 260, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ETICHEFINANZ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ETICHEFINANZ, -1, "", "ETICHEFINANZ", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, MyGlb.PANEL_LIST, 20, 364, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, MyGlb.PANEL_FORM, 12, 284, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHEFATTOR, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ETICHEFATTOR, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ETICHEFATTOR, -1, "", "ETICHEFATTOR", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, MyGlb.PANEL_LIST, 28, 372, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, MyGlb.PANEL_FORM, 12, 308, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ETICHECENTRO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ETICHECENTRO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ETICHECENTRO, -1, "", "ETICHECENTRO", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIDAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_QUERY, 12);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_DOC as FATNUMERODOC, ");
    SQL.append("  A.D_DATA_DOC as FATDDATADOC ");
    SQL.append("from ");
    SQL.append("  FAT A ");
    SQL.append("where (A.ANNO_PROG = ~~ANNO_PROG_FAT~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~NUMERO_PROG_FAT~~) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_FAT, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_FAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_FAT, "FAT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE as BENRAGIOSOCI ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~BENEFICIARIO~~) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_BEN, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTCENTDESC ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VOCIECONDESC ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A ");
    SQL.append("where (A.CODICE = ~~VOCE_ECONOMICA~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_VOCIECONOMIC, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_VOCIECONOMIC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_VOCIECONOMIC, "VOCI_ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CODIGESTDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.CODICE = ~~CODICE_GESTIONALE~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_CODICIGESTIO, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_CODICIGESTIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_CODICIGESTIO, "CODICI_GESTIONALI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A, ");
    SQL.append("  IMP_FIN B ");
    SQL.append("where (B.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (B.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    SQL.append("and   (B.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   ((~~NUMERO_SUBIMP~~ IS NULL) AND (~~ANNO_SUBIMP~~ IS NULL)) ");
    SQL.append("and   (B.FINANZIAMENTO = A.CODICE) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  D.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SUBIMP_FIN C, ");
    SQL.append("  FINANZIAMENTI D ");
    SQL.append("where (C.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (C.NUMERO_SUBIMP = ~~NUMERO_SUBIMP~~) ");
    SQL.append("and   (C.ANNO_SUBIMP = ~~ANNO_SUBIMP~~) ");
    SQL.append("and   (NOT ((~~NUMERO_SUBIMP~~ IS NULL)) AND NOT ((~~ANNO_SUBIMP~~ IS NULL))) ");
    SQL.append("and   (C.FINANZIAMENTO = D.CODICE) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RILEVANTE_ECO as IMPRILEVAECO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_IMP2, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_IMP2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_IMP2, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RILEVANTE_ECO as IMPSUBRILECO ");
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    SQL.append("where (A.ANNO_SUBIMP = ~~ANNO_SUBIMP~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~NUMERO_SUBIMP~~) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_IMP1, "SUBIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (A.NUM_QUIETANZA = ~~NUM_QUIETANZA~~) ");
    SQL.append("and   (A.CODICE = ~~BENEFICIARIO~~) ");
    SQL.append("and   (A.TIPO_QUIETANZA = B.CODICE) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_QTN, 0, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_QTN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(PPQRY_QTN, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.CODICE = ~~LIFABUMOESCI~~) ");
    SQL.append("and   (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_ATTRIBUTIOPI, 0, SQL, PFL_LIQUIDAZIONI_MOTIVESCLCIG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_ATTRIBUTIOPI, 1, SQL, PFL_LIQUIDAZIONI_MOTIVESCLCIG, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_ATTRIBUTIOPI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetIMDB(IMDB, "PQRY_LIQDISTINTA1", true);
    PAN_LIQUIDAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ FATTURE BUONI");
    PAN_LIQUIDAZIONI.SetQueryIMDB(PPQRY_LIQDISTINTA1, IMDBDef8.PQRY_LIQDISTINTA1_RS, IMDBDef7.TBL_LIQ_DISTINTA);
    JustLoaded = true;
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_IMPORTO, IMDBDef7.FLD_LIQ_DISTINTA_IMPORTO);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_INSDAFATTURE, IMDBDef7.FLD_LIQ_DISTINTA_LIQDISINDAFA);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_IMPEGNO, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_IMP);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_ANNOIMP, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_IMP);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_SUBIMPEGNO, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_SUBIMP);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_ANNOSUBIMP, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_SUBIMP);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_BENEFICIARIO, IMDBDef7.FLD_LIQ_DISTINTA_BENEFICIARIO);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_QUIETANZA, IMDBDef7.FLD_LIQ_DISTINTA_NUM_QUIETANZA);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_DESCRIZIONE, IMDBDef7.FLD_LIQ_DISTINTA_DESCRIZIONE);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_PROGRESSIVO, IMDBDef7.FLD_LIQ_DISTINTA_PROGRESSIVO);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_ANNOPROGFAT, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_PROG_FAT);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_NUMERPROGFAT, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_PROG_FAT);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_CIG, IMDBDef7.FLD_LIQ_DISTINTA_CIG);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_MOTIVESCLCIG, IMDBDef7.FLD_LIQ_DISTINTA_MOTIVO_ESCLUSIONE_CIG);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_CUP, IMDBDef7.FLD_LIQ_DISTINTA_CUP);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_VOCEECONOMIC, IMDBDef7.FLD_LIQ_DISTINTA_VOCE_ECONOMICA);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_CGU, IMDBDef7.FLD_LIQ_DISTINTA_CODICE_GESTIONALE);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_FINANZIAMENT, IMDBDef7.FLD_LIQ_DISTINTA_FINANZIAMENTO);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_FATTORE, IMDBDef7.FLD_LIQ_DISTINTA_FATTORE);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_CENTRO, IMDBDef7.FLD_LIQ_DISTINTA_CENTRO);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_ANNODISTINTA, IMDBDef7.FLD_LIQ_DISTINTA_ANNO_DISTINTA);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_NUMERODISTIN, IMDBDef7.FLD_LIQ_DISTINTA_NUMERO_DISTINTA);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_DAL, IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_DAL);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_AL, IMDBDef7.FLD_LIQ_DISTINTA_COMPETENZA_AL);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_UTENTEINSERI, IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_INSERIMENTO);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_DATAINSERIME, IMDBDef7.FLD_LIQ_DISTINTA_DATA_INSERIMENTO);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_UTENTULTIAGG, IMDBDef7.FLD_LIQ_DISTINTA_UTENTE_ULTIMO_AGG);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_DATAULTIMAGG, IMDBDef7.FLD_LIQ_DISTINTA_DATA_ULTIMO_AGG);
    PAN_LIQUIDAZIONI.SetFieldPrimaryIndex(PFL_LIQUIDAZIONI_STATO, IMDBDef7.FLD_LIQ_DISTINTA_LIQDISTISTAT);
    PAN_LIQUIDAZIONI.SetMasterTable(0, "LIQ_DISTINTA");
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAZIONI.iUseListQBE;
      PAN_LIQUIDAZIONI.iUseListQBE = 0;
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_DynamicProperties();
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DISTINTE) PAN_DISTINTE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
