// **********************************************
// Informazione Mandato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioneMandato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int GRP_MANDATO_MANDATO = 0;
  private static int GRP_MANDATO_DISTINTA = 1;
  private static int GRP_MANDATO_CAPITOLOART = 2;
  private static int GRP_MANDATO_IMPEGNO = 3;
  private static int GRP_MANDATO_INSERIMENTO = 4;
  private static int GRP_MANDATO_AGGIORNAMENT = 5;

  private static int PFL_MANDATO_MANDATO = 0;
  private static int PFL_MANDATO_DEL1 = 1;
  private static int PFL_MANDATO_NEWPANELLAB1 = 2;
  private static int PFL_MANDATO_IMPORTO1 = 3;
  private static int PFL_MANDATO_DISTINTA = 4;
  private static int PFL_MANDATO_DEL = 5;
  private static int PFL_MANDATO_NEWPANELABE2 = 6;
  private static int PFL_MANDATO_PAGATO1 = 7;
  private static int PFL_MANDATO_UFFICIO1 = 8;
  private static int PFL_MANDATO_BOLLO1 = 9;
  private static int PFL_MANDATO_VOCEECON = 10;
  private static int PFL_MANDATO_VOCIECONDESC = 11;
  private static int PFL_MANDATO_TIPOVINCOLO1 = 12;
  private static int PFL_MANDATO_NEWPANELABE3 = 13;
  private static int PFL_MANDATO_CAPITOLO1 = 14;
  private static int PFL_MANDATO_ARTICOLO1 = 15;
  private static int PFL_MANDATO_CAPITOLO = 16;
  private static int PFL_MANDATO_ARTICOLO = 17;
  private static int PFL_MANDATO_NEWPANELLABE = 18;
  private static int PFL_MANDATO_NEWPANELABE1 = 19;
  private static int PFL_MANDATO_IMPEGNO = 20;
  private static int PFL_MANDATO_ANNOIMP = 21;
  private static int PFL_MANDATO_UFFICIO3 = 22;
  private static int PFL_MANDATO_BOLLO = 23;
  private static int PFL_MANDATO_TIPOVINCOLO = 24;
  private static int PFL_MANDATO_TRATTINLABEL = 25;
  private static int PFL_MANDATO_APRIINFOLABE = 26;
  private static int PFL_MANDATO_APRINFIMPLAB = 27;
  private static int PFL_MANDATO_SLASHLABEL = 28;
  private static int PFL_MANDATO_VINCDESCEXPR = 29;
  private static int PFL_MANDATO_ANNOMAND = 30;
  private static int PFL_MANDATO_T53EXPRESSIO = 31;
  private static int PFL_MANDATO_MANDATOLABEL = 32;
  private static int PFL_MANDATO_DISTINTLABEL = 33;
  private static int PFL_MANDATO_IMPEGNOLABEL = 34;
  private static int PFL_MANDATO_VOCPEGPANLAB = 35;
  private static int PFL_MANDATO_UTENTE1 = 36;
  private static int PFL_MANDATO_DATA1 = 37;
  private static int PFL_MANDATO_UTENTE = 38;
  private static int PFL_MANDATO_DATA = 39;
  private static int PFL_MANDATO_VALUTA = 40;
  private static int PFL_MANDATO_IMPORTOLABEL = 41;
  private static int PFL_MANDATO_DETTAGMANDAT = 42;
  private static int PFL_MANDATO_DESCRIZIONE1 = 43;
  private static int PFL_MANDATO_COPERTURA = 44;

  private static int PPQRY_MAN8 = 0;

  private static int PPQRY_IMP1 = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_VOCIECONOMIC = 3;
  private static int PPQRY_T53 = 4;
  private static int PPQRY_T60 = 5;
  private static int PPQRY_VINCOLI = 6;

  private static int PPQRY_T54 = 7;
  private static int PPQRY_T61 = 8;
  private static int PPQRY_VINCOLI1 = 9;


  IDPanel PAN_MANDATO;
  private static int PFL_LIQUIDAZIONI_LIQUIDAZIONE = 0;
  private static int PFL_LIQUIDAZIONI_NUMEROLIQ = 1;
  private static int PFL_LIQUIDAZIONI_DDATAREG = 2;
  private static int PFL_LIQUIDAZIONI_DESCRIZIONE = 3;
  private static int PFL_LIQUIDAZIONI_APRILIQUEXPR = 4;
  private static int PFL_LIQUIDAZIONI_IMPORTO = 5;
  private static int PFL_LIQUIDAZIONI_IMPORTOIVA = 6;
  private static int PFL_LIQUIDAZIONI_RITENUTE = 7;
  private static int PFL_LIQUIDAZIONI_PAGATO = 8;
  private static int PFL_LIQUIDAZIONI_BENEFICIARIO = 9;
  private static int PFL_LIQUIDAZIONI_NUMERODOC1 = 10;
  private static int PFL_LIQUIDAZIONI_DDATADOC = 11;
  private static int PFL_LIQUIDAZIONI_QUIETANZA = 12;
  private static int PFL_LIQUIDAZIONI_QUIEINFOEXPR = 13;
  private static int PFL_LIQUIDAZIONI_SEDEDEL = 14;
  private static int PFL_LIQUIDAZIONI_NUMERODEL = 15;
  private static int PFL_LIQUIDAZIONI_ANNODEL = 16;
  private static int PFL_LIQUIDAZIONI_PROGRTESORIE = 17;
  private static int PFL_LIQUIDAZIONI_DISTINTECNIC = 18;
  private static int PFL_LIQUIDAZIONI_UFFICIO2 = 19;
  private static int PFL_LIQUIDAZIONI_CGU = 20;
  private static int PFL_LIQUIDAZIONI_FINANZIAMENT = 21;
  private static int PFL_LIQUIDAZIONI_UFFICIO = 22;
  private static int PFL_LIQUIDAZIONI_NUMERODOC = 23;
  private static int PFL_LIQUIDAZIONI_ANNOLIQ = 24;
  private static int PFL_LIQUIDAZIONI_LIQULABEHEAD = 25;
  private static int PFL_LIQUIDAZIONI_DOCUHEADLABE = 26;
  private static int PFL_LIQUIDAZIONI_DELIHEADLABE = 27;
  private static int PFL_LIQUIDAZIONI_SOMMIMPOLABE = 28;
  private static int PFL_LIQUIDAZIONI_SOMMRITELABE = 29;
  private static int PFL_LIQUIDAZIONI_SOMMPAGALABE = 30;
  private static int PFL_LIQUIDAZIONI_QUIEHEADLABE = 31;
  private static int PFL_LIQUIDAZIONI_CODICE = 32;
  private static int PFL_LIQUIDAZIONI_ORDINAEXPRES = 33;
  private static int PFL_LIQUIDAZIONI_ORDINAEXPRE2 = 34;
  private static int PFL_LIQUIDAZIONI_NUMQUIETANZA = 35;
  private static int PFL_LIQUIDAZIONI_CODICE1 = 36;
  private static int PFL_LIQUIDAZIONI_SOMMRITELAB1 = 37;

  private static int PPQRY_LIQ9 = 0;


  IDPanel PAN_LIQUIDAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM52(IMDB);
    //
    //
    Init_PQRY_MAN8(IMDB);
    Init_PQRY_LIQ9(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM52(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAM52, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAM52, "TBL_PARAM52");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM52,IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, "ROWNAMANNMAN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM52,IMDBDef5.FLD_PARAM52_ROWNAMANNMAN,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAM52,IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, "ROWNAMNUMMAN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAM52,IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN,1,5,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAM52, 0);
  }

  private static void Init_PQRY_MAN8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MAN8, 25);
    IMDB.set_TblCode(IMDBDef14.PQRY_MAN8, "PQRY_MAN8");
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_PAGATO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_NUMERO_ELENCO, "NUMERO_ELENCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_NUMERO_ELENCO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_D_DATA_ELENCO, "D_DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_D_DATA_ELENCO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECORT53EXPR, "RECORT53EXPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECORT53EXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECORMANBOLL, "RECORMANBOLL");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECORMANBOLL,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECVINDESEXP, "RECVINDESEXP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECVINDESEXP,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECODETTMAND, "RECODETTMAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECODETTMAND,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_D_DATA_VALUTA, "D_DATA_VALUTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_D_DATA_VALUTA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECORDCOPERT, "RECORDCOPERT");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN8,IMDBDef14.PQSL_MAN8_RECORDCOPERT,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_MAN8, 0);
  }

  private static void Init_PQRY_LIQ9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ9, 30);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ9, "PQRY_LIQ9");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_IMPORTO_PAGAM, "IMPORTO_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_IMPORTO_PAGAM,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECONUMEDOC1, "RECONUMEDOC1");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECONUMEDOC1,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECODISTTECN, "RECODISTTECN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECODISTTECN,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDDESCR1, "RECORDDESCR1");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDDESCR1,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECQUIINFEXP, "RECQUIINFEXP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECQUIINFEXP,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDUFFICI, "RECORDUFFICI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDUFFICI,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDFINANZ, "RECORDFINANZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDFINANZ,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDCGU, "RECORDCGU");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDCGU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECAPRLIQEXP, "RECAPRLIQEXP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECAPRLIQEXP,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECOORDIEXPR, "RECOORDIEXPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECOORDIEXPR,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECOORDIEXP2, "RECOORDIEXP2");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECOORDIEXP2,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDCODIC1, "RECORDCODIC1");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECORDCODIC1,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECLIQIMPIVA, "RECLIQIMPIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ9,IMDBDef14.PQSL_LIQ9_RECLIQIMPIVA,3,14,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ9, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioneMandato(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioneMandato()
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
    FormIdx = MyGlb.FRM_INFORMMANDAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F192D781-6BF2-4497-8735-F7D577914507";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 752;
    DesignHeight = 410;
    set_Caption(new IDVariant("Informazione Mandato"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 752;
    Frames[1].Height = 384;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 384;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "BDF51D4C-A1CD-4C6B-9656-D293EC26944E";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Mandato";
    Frames[2].Parent = this;
    PAN_MANDATO = new IDPanel(w, this, 2, "PAN_MANDATO");
    Frames[2].Content = PAN_MANDATO;
    PAN_MANDATO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANDATO.VS = MainFrm.VisualStyleList;
    PAN_MANDATO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 752-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AB86EF43-CF53-43BA-BF59-4E5EA02CF6CF");
    PAN_MANDATO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 968, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATO.InitStatus = 2;
    PAN_MANDATO_Init();
    PAN_MANDATO_InitFields();
    PAN_MANDATO_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Mandato", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Liquidazioni";
    Frames[3].Parent = this;
    PAN_LIQUIDAZIONI = new IDPanel(w, this, 3, "PAN_LIQUIDAZIONI");
    Frames[3].Content = PAN_LIQUIDAZIONI;
    PAN_LIQUIDAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIONI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 752-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8645B122-D670-4AD0-BA73-2A51D324DF84");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 1900, 136, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (CmdIdx==MyGlb.CMD_FUNZIONI2+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIONI4+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIONI2+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PAGAMENTI+BaseCmdLinIdx)
      {
        InfoPagamenti();
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
      PAN_MANDATO.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioneMandato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioneMandato.class.getName() : (Glb.ClassWithPackage(InformazioneMandato.class) ? InformazioneMandato.class.getName().substring(InformazioneMandato.class.getPackage().getName().length() + 1) : InformazioneMandato.class.getName()));
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
      if (MainFrm.MANDATCOPERT.equals((new IDVariant("SI")), true))
      {
        PAN_MANDATO.SetFlags (Glb.OBJ_FIELD, PFL_MANDATO_COPERTURA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_MANDATO.SetFlags (Glb.OBJ_FIELD, PFL_MANDATO_COPERTURA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_MANDATO.SetFlags (Glb.OBJ_FIELD, PFL_MANDATO_VOCEECON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATO.SetFlags (Glb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_MANDATO.SetFlags (Glb.OBJ_FIELD, PFL_MANDATO_VOCEECON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATO.SetFlags (Glb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMANNMAN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAM52, IMDBDef5.FLD_PARAM52_ROWNAMNUMMAN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Mandato After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_MANDATO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPORTO = (new IDVariant("Importo: ", IDVariant.STRING));
      // 
      // Mandato After Find Event Body
      // Procedure Body
      // 
      PAN_MANDATO.set_FieldText(PFL_MANDATO_IMPORTOLABEL, IDL.Add(v_IMPORTO, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_IMPORTO, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "MandatoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Info Pagamenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoPagamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Pagamenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMANNMAN, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMNUMMAN, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_NUMERO_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_ROWNAMDATMAN, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_D_DATA_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAM53, IMDBDef5.FLD_PARAM53_IMPORTO, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_IMPORTO, 0));
      MainFrm.Show(MyGlb.FRM_INFOPAGAMAND, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "InfoPagamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazione Expression
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriLiquidazioneExpression ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liquidazione Expression Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ9, IMDBDef14.PQSL_LIQ9_ANNO_LIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ9, IMDBDef14.PQSL_LIQ9_NUMERO_LIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "ApriLiquidazioneExpression", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Liquidazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni After Find Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMIMPOLABE, IDL.NullValue(IDL.ToString(PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_IMPORTO)),(new IDVariant("0"))).stringValue());
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMRITELABE, IDL.NullValue(IDL.ToString(PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_RITENUTE)),(new IDVariant("0"))).stringValue());
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMPAGALABE, IDL.NullValue(IDL.ToString(PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_PAGATO)),(new IDVariant("0"))).stringValue());
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMRITELAB1, IDL.NullValue(IDL.ToString(PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_IMPORTOIVA)),(new IDVariant("0"))).stringValue());
      // 
      // controllo se ci sono etichette vuote (succede quando tutte le righe hanno la colonna null , della colonna di cui si fa colonna.Sum
      // 
      {
        if ((new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_SOMMIMPOLABE))).equals((new IDVariant("")), true))
        {
          PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMIMPOLABE, IDL.ToString((new IDVariant(0))).stringValue());
        }
        if ((new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_SOMMRITELABE))).equals((new IDVariant("")), true))
        {
          PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMRITELABE, IDL.ToString((new IDVariant(0))).stringValue());
        }
        if ((new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_SOMMPAGALABE))).equals((new IDVariant("")), true))
        {
          PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMPAGALABE, IDL.ToString((new IDVariant(0))).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "LiquidazioniAfterFindEvent", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Explain which processing is carried out by this procedure
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_ANNO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_NUMERO_IMP, 0));
      }
      if (IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Quietanza
  // **********************************************************************
  public int ApriInfoQuietanza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Quietanza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_BENEFICIARIO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ9, IMDBDef14.PQSL_LIQ9_RECORDCODIC1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_NUM_QUIETANZA, 0, IMDB.Value(IMDBDef14.PQRY_LIQ9, IMDBDef14.PQSL_LIQ9_NUM_QUIETANZA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_INFOQUIETANZ,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOQUIETANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioneMandato", "ApriInfoQuietanza", _e);
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
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_MANDATO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MANDATO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANDATO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANDATO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANDATO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MANDATO);
    // Stub
  }

  private void PAN_MANDATO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_MANDATO_APRIINFOLABE)
    {
      this.IdxPanelActived = this.PAN_MANDATO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MANDATO_APRINFIMPLAB)
    {
      this.IdxPanelActived = this.PAN_MANDATO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_MANDATO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MANDATO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_MAN8, IMDBDef14.PQSL_MAN8_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_MANDATO_IntValidateRow(Cancel);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_LIQUIDAZIONI);
    // Stub
  }

  private void PAN_LIQUIDAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_APRILIQUEXPR)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriLiquidazioneExpression();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_QUIEINFOEXPR)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoQuietanza();
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
  private void PAN_MANDATO_Init()
  {

    PAN_MANDATO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANDATO.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, "A0D939EA-C442-46C4-9053-5A198BCE15B1");
    PAN_MANDATO.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, "Mandato");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, MyGlb.PANEL_FORM, 24, 3, 248, 53, 0, 0);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, 0, 50);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, 1, 13);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, 0, 4);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, 1, 4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATO_MANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, "9601FF03-CCA9-48E6-8A7B-1D8074E15CE9");
    PAN_MANDATO.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, "Distinta");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, MyGlb.PANEL_LIST, 180, -9999, 100, 16, 0, 0);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, MyGlb.PANEL_FORM, 280, 3, 312, 53, 0, 0);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, 0, 44);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, 1, 13);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, 0, 4);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, 1, 4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATO_DISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, "7D32F0E5-7D24-4EEC-BA69-D1455DE549C5");
    PAN_MANDATO.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, "Capitolo/Art.");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, MyGlb.PANEL_FORM, 24, 103, 568, 77, 0, 0);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, 0, 73);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, 1, 13);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, 0, 4);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, 1, 4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATO_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, "9CBBFF5E-49A5-48DF-836D-C8D4A6B19677");
    PAN_MANDATO.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, "Impegno");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, MyGlb.PANEL_FORM, 24, 59, 568, 41, 0, 0);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, 0, 51);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, 1, 13);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, 0, 4);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, 1, 4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATO_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, "16848CF3-0127-4820-B151-C157E2172E57");
    PAN_MANDATO.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, "Inserimento");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, "Inserimento");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, 0, 70);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, 1, 13);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, 0, 1);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, 1, 4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATO_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, "3E0E229E-FE7C-44B7-8D08-5CF0BCB476F3");
    PAN_MANDATO.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, "Aggiornamento");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATO.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, 0, 88);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, 1, 13);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, 0, 1);
    PAN_MANDATO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, 1, 4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATO_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATO.SetSize(MyGlb.OBJ_FIELD, 45);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, "127EB2C8-28C9-4C78-9BA1-066EB6593DBD");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, "Mandato");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, "C7F35B9F-358A-4AC5-923C-7209EC1169AF");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, "Del");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, "93E94615-AB23-4D4C-A8DB-D84A04501FCB");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, "7CB210FA-225B-4FF9-A417-A5056A670559");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, "Importo");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, "5466014B-8B8D-4E70-8CF3-D5C4CBB9B577");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, "Distinta");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, "8598747D-B7D4-47DB-8EF7-2261164C5628");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, "Del ");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, "DB0ACF23-8457-44DA-8AFB-C5712EC6D661");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, "EF5DEF26-7215-4716-9421-964ECAFEFCA2");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, "Pagato");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, "75832C33-D769-4B0A-8FAD-9A500C897A13");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, "Ufficio   ");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, "CC2EF53B-1D95-4D87-AB3A-98F814449628");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, "Bollo ");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, "6646064F-3403-4375-80E7-BFAC7FD5D6FA");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, "Voce Econ.");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, "4F8201C7-6B95-4B62-8082-51A8AE683588");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, "VOCI ECONOMICHE Descrizione ");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, "95A1C6BB-2A83-4D4E-AAD2-CF9401D44A24");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, "Tipo Vincolo  ");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISDESCR, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, "2CC11734-1E6D-4BF9-859D-6E57BC97E7F7");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, "0E17820E-E18B-4075-8453-43F9103EF8D3");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, "Capitolo");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, "A GET DESCRIZIONE CAP (Sessione Esercizio, S, Record INTERVENTO [Informazione Mandato - Mandati], Record MAN CAPITOLO [Informazione Mandato - Mandati], ZERO)");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, "7E6A6DE4-C517-45FD-8A7B-99A60F919FAA");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, " Articolo");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, "A GET DESCRIZIONE CAP (Sessione Esercizio, S, Record INTERVENTO [Informazione Mandato - Mandati], Record MAN CAPITOLO [Informazione Mandato - Mandati], Record MAN ARTICOLO [Informazione Mandato - Mandati])");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, "70109C99-898E-40EE-B14C-F0F86780FC38");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, "CAPITOLO");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, "AD6B308B-AE21-406C-A67D-1D2C98340FD8");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, "ARTICOLO");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, "135336D0-613A-4670-B8F7-D4DD2B021D24");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, "DDFB4E37-DEA6-4C67-A129-BA99C351BFCB");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, "D5CED499-41E4-492E-875B-87ECEBE583FC");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, "Impegno");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, "995C5BD1-A34C-4D64-9625-B033440F656F");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, "ANNO IMP");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, "009CE5D1-10BC-4BDB-964E-0D29B31EB554");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, "Ufficio");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, "0C731BB4-1745-4E6A-826F-CF42C123F466");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, "Bollo");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, "t60 descrizione");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, "EE5B1510-6D81-4D2E-A015-342208852D8B");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, "Tipo Vincolo");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, "1B954506-0437-4F6B-95B3-514E83275537");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, "-");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, "A864CC51-6426-4424-9FB0-08427E1973D4");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, MyGlb.VIS_STATICBUTTON);
    PAN_MANDATO.SetImage(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, 0, "info.gif", false);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, "C9DF88B1-C69A-44F5-A730-B1CFE2E45DC6");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, MyGlb.VIS_STATICBUTTON);
    PAN_MANDATO.SetImage(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, 0, "info.gif", false);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, "FA3CB1AC-7CF8-444F-9369-F45E2F72A3EA");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, "/");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, "4F328D65-A884-453D-B682-A6E8BA7F7121");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, "Vincoli Descrizione Expression");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, "AE4226D8-63EA-42E9-8BAB-F713FC06B01B");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, "ANNO MAND");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, "85E4ABF1-485F-41AB-A65D-27C38B872A5A");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, "T53 Expression");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, "ED262E8B-19DE-4CA2-859F-77099A66EA65");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, "Mandato");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, 0 | MyGlb.FLD_INLIST, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, "9A4D75C7-AD25-4236-AF7B-7C656D6EA150");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, "Distinta");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, 0 | MyGlb.FLD_INLIST, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, "50A89783-4E83-49DC-987F-D6BAA4DDCC7E");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, "Impegno");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INLIST, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, "9B001B79-307B-43CE-957F-86223BFE7B3D");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, "Voce P.e.g ");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, 0 | MyGlb.FLD_INLIST, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, "98D6D650-71BF-4031-91DC-A4086B868124");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, "Utente");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, "42626C62-3591-4F50-9805-592B27954D7A");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, "Data ");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, "305A7261-C174-41CC-9B1B-3C44F6FD7237");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, "Utente");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, "0135D939-FFAF-4AD0-A5C2-FDADC02CC905");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, "Data");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, "4E58F129-6DED-4F05-BE38-B3CCB157307B");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, "Valuta");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, "8219D37D-ED86-4F0C-876C-7BA6DFACB849");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, "AC52CE2C-6E1D-44E6-B3A7-395777070CDB");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, "Dettagli Mandato");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, "ABA795E0-309D-428A-988C-1E991A3830A1");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, "Descrizione");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, "");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_MANDATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, "53E5ADEB-29CF-4635-A676-2321D6F49BD1");
    PAN_MANDATO.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, "Mandato a Copertura");
    PAN_MANDATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, "Mandato a Copertura");
    PAN_MANDATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.VIS_CHECKSTYLE);
    PAN_MANDATO.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MANDATO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_LIST, 84);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_LIST, "Mand.");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_FORM, 28, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_FORM, 68);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATO, MyGlb.PANEL_FORM, "Mandato");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_MANDATO, -1, GRP_MANDATO_MANDATO);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_MANDATO, PPQRY_MAN8, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_LIST, 40, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_LIST, 80);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_LIST, "Del");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_FORM, 140, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_FORM, 36);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL1, MyGlb.PANEL_FORM, "Del");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DEL1, -1, GRP_MANDATO_MANDATO);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DEL1, PPQRY_MAN8, "A.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, MyGlb.PANEL_LIST, 208, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, MyGlb.PANEL_FORM, 256, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_NEWPANELLAB1, -1, GRP_MANDATO_MANDATO);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_LIST, 100, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_FORM, 588, 108, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_FORM, 48);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTO1, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_IMPORTO1, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_IMPORTO1, PPQRY_MAN8, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_LIST, 180, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_LIST, "Dist.");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_FORM, 284, 28, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_FORM, 84);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTA, MyGlb.PANEL_FORM, "Distinta");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DISTINTA, -1, GRP_MANDATO_DISTINTA);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DISTINTA, PPQRY_MAN8, "A.NUMERO_ELENCO", "NUMERO_ELENCO", 1, 5, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_LIST, 220, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_LIST, 88);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_LIST, "Del ");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_FORM, 444, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_FORM, 28);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DEL, MyGlb.PANEL_FORM, "Del ");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DEL, -1, GRP_MANDATO_DISTINTA);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DEL, PPQRY_MAN8, "A.D_DATA_ELENCO", "D_DATA_ELENCO", 6, 19, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, MyGlb.PANEL_LIST, 216, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, MyGlb.PANEL_FORM, 576, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_NEWPANELABE2, -1, GRP_MANDATO_DISTINTA);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_LIST, 280, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_LIST, 52);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_LIST, "Pagato");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_FORM, 236, 332, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_FORM, 52);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_PAGATO1, MyGlb.PANEL_FORM, "Pagato");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_PAGATO1, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_PAGATO1, PPQRY_MAN8, "A.PAGATO", "PAGATO", 3, 14, 2, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_LIST, 360, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_LIST, 100);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_LIST, "Ufficio   ");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_FORM, 4, 284, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_FORM, 100);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO1, MyGlb.PANEL_FORM, "Ufficio   ");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_UFFICIO1, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_UFFICIO1, PPQRY_T53, "A.DESCRIZIONE", "T53DESCRIZIO", 5, 60, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_LIST, 480, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_LIST, 100);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_LIST, "Bollo ");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_FORM, 4, 284, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_FORM, 100);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO1, MyGlb.PANEL_FORM, "Bollo ");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_BOLLO1, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_BOLLO1, PPQRY_T60, "A.DESCRIZIONE", "T60DESCRIZIO", 5, 40, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_LIST, 600, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_LIST, "Voce Econ.");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_FORM, 36, 184, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_FORM, 72);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCEECON, MyGlb.PANEL_FORM, "Voce Econ.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_VOCEECON, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_VOCEECON, PPQRY_MAN8, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_LIST, 1188, 68, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_LIST, 216);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_LIST, "VOCI ECONOMICHE Descrizione ");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_FORM, 156, 184, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_FORM, 216);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCIECONDESC, MyGlb.PANEL_FORM, "VOCI ECONOMICHE Descrizione ");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_VOCIECONDESC, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_VOCIECONDESC, PPQRY_VOCIECONOMIC, "DECODE(A.DESCRIZIONE, '', '', A.DESCRIZIONE)", "VOCECODESEXP", 5, 99, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_LIST, 636, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_LIST, 120);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_LIST, "Tipo Vincolo  ");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_FORM, 4, 284, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_FORM, 120);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO1, MyGlb.PANEL_FORM, "Tipo Vincolo  ");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_TIPOVINCOLO1, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_TIPOVINCOLO1, PPQRY_VINCOLI, "A.DESCRIZIONE", "VINCOLDESCRI", 5, 50, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, MyGlb.PANEL_LIST, 244, 148, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, MyGlb.PANEL_FORM, 28, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_NEWPANELABE3, -1, GRP_MANDATO_CAPITOLOART);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_LIST, 1000, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_LIST, 160);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_FORM, 48, 132, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_CAPITOLO1, -1, GRP_MANDATO_CAPITOLOART);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_CAPITOLO1, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0)", "ROWNAMDESCAP", 5, 99, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 264, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_LIST, 156);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_LIST, " Articolo");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_FORM, 52, 156, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_FORM, 56);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO1, MyGlb.PANEL_FORM, " Articolo");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_ARTICOLO1, -1, GRP_MANDATO_CAPITOLOART);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_ARTICOLO1, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~)", "ROWNAMDESART", 5, 99, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_LIST, 808, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_FORM, 112, 108, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_CAPITOLO, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_CAPITOLO, PPQRY_MAN8, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_LIST, 852, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_FORM, 260, 108, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_ARTICOLO, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_ARTICOLO, PPQRY_MAN8, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, MyGlb.PANEL_LIST, 236, 140, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, MyGlb.PANEL_FORM, 28, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_NEWPANELLABE, -1, GRP_MANDATO_IMPEGNO);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, MyGlb.PANEL_LIST, 244, 148, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, MyGlb.PANEL_FORM, 576, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_NEWPANELABE1, -1, GRP_MANDATO_IMPEGNO);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_LIST, 872, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_LIST, 72);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_LIST, "Imp.");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_FORM, 100, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_IMPEGNO, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_IMPEGNO, PPQRY_MAN8, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_LIST, 912, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_LIST, "ANN. IMP");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_FORM, 164, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_ANNOIMP, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_ANNOIMP, PPQRY_MAN8, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_LIST, 544, 48, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_LIST, 52);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_LIST, "Ufficio");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_FORM, 60, 208, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_FORM, 48);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UFFICIO3, MyGlb.PANEL_FORM, "Ufficio");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_UFFICIO3, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_UFFICIO3, PPQRY_MAN8, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_LIST, 684, 48, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_LIST, 84);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_FORM, 68, 232, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_BOLLO, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_BOLLO, PPQRY_MAN8, "A.BOLLO", "RECORMANBOLL", 1, 2, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_LIST, 860, 48, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_FORM, 280, 208, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_TIPOVINCOLO, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_TIPOVINCOLO, PPQRY_MAN8, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, MyGlb.PANEL_LIST, 140, 316, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, MyGlb.PANEL_FORM, 240, 108, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_TRATTINLABEL, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, MyGlb.PANEL_LIST, 240, 260, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, MyGlb.PANEL_FORM, 308, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_APRIINFOLABE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_APRIINFOLABE, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_APRIINFOLABE, -1, "", "APRIINFOLABE", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, MyGlb.PANEL_LIST, 248, 268, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, MyGlb.PANEL_FORM, 568, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_APRINFIMPLAB, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_APRINFIMPLAB, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_APRINFIMPLAB, -1, "", "APRINFIMPLAB", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, MyGlb.PANEL_LIST, 120, 148, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, MyGlb.PANEL_FORM, 144, 68, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_SLASHLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_SLASHLABEL, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_SLASHLABEL, -1, "", "SLASHLABEL", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_LIST, 1000, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_LIST, 152);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_LIST, "Vincoli Descrizione Expression");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_FORM, 24, 436, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_FORM, 152);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VINCDESCEXPR, MyGlb.PANEL_FORM, "Vinc. Descr. Expression");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_VINCDESCEXPR, -1, -1);
    PAN_MANDATO.SetFieldUnbound(PFL_MANDATO_VINCDESCEXPR, true);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_VINCDESCEXPR, PPQRY_MAN8, "1", "RECVINDESEXP", 1, 19, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_LIST, 1000, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_FORM, 264, 388, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_ANNOMAND, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_ANNOMAND, PPQRY_MAN8, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_LIST, 1072, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_LIST, 84);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_LIST, "T53 Expression");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_FORM, 24, 388, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_FORM, 84);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_T53EXPRESSIO, MyGlb.PANEL_FORM, "T53 Expres.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_T53EXPRESSIO, -1, -1);
    PAN_MANDATO.SetFieldUnbound(PFL_MANDATO_T53EXPRESSIO, true);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_T53EXPRESSIO, PPQRY_MAN8, "1", "RECORT53EXPR", 1, 19, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, MyGlb.PANEL_LIST, 0, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, MyGlb.PANEL_FORM, 24, 4, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_MANDATOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_MANDATOLABEL, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_MANDATOLABEL, -1, "", "MANDATOLABEL", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, MyGlb.PANEL_LIST, 180, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, MyGlb.PANEL_FORM, 32, 12, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DISTINTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DISTINTLABEL, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 872, 0, 72, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 788, 8, 192, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPEGNOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_IMPEGNOLABEL, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, MyGlb.PANEL_LIST, 756, 0, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, MyGlb.PANEL_LIST, 2);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, MyGlb.PANEL_FORM, 780, 0, 192, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VOCPEGPANLAB, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_VOCPEGPANLAB, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_VOCPEGPANLAB, -1, "", "VOCPEGPANLAB", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_LIST, 1204, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_FORM, 72, 312, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_FORM, 44);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE1, MyGlb.PANEL_FORM, "Uten.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_UTENTE1, -1, GRP_MANDATO_INSERIMENTO);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_UTENTE1, PPQRY_MAN8, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_LIST, 1204, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_LIST, "Data ");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_FORM, 184, 312, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_FORM, 32);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA1, MyGlb.PANEL_FORM, "Dt.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DATA1, -1, GRP_MANDATO_INSERIMENTO);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DATA1, PPQRY_MAN8, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_LIST, 1204, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_FORM, 308, 312, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_FORM, 44);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_UTENTE, MyGlb.PANEL_FORM, "Uten.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_UTENTE, -1, GRP_MANDATO_AGGIORNAMENT);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_UTENTE, PPQRY_MAN8, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_LIST, 1204, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_LIST, 100);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_FORM, 428, 312, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_FORM, 32);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DATA, MyGlb.PANEL_FORM, "Dt.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DATA, -1, GRP_MANDATO_AGGIORNAMENT);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DATA, PPQRY_MAN8, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_LIST, 88);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_LIST, "Valuta");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_FORM, 304, 232, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_FORM, 52);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_VALUTA, MyGlb.PANEL_FORM, "Valuta");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_VALUTA, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_VALUTA, PPQRY_MAN8, "A.D_DATA_VALUTA", "D_DATA_VALUTA", 6, 19, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, MyGlb.PANEL_LIST, 588, 8, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, MyGlb.PANEL_FORM, 598, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_IMPORTOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_IMPORTOLABEL, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_IMPORTOLABEL, -1, "", "IMPORTOLABEL", 0, 0, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_LIST, 0, 36, 264, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_LIST, 92);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_LIST, 2);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_LIST, "Dettagli Mandato");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_FORM, 4, 292, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_FORM, 92);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_FORM, 2);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DETTAGMANDAT, MyGlb.PANEL_FORM, "Dettagli Mandato");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DETTAGMANDAT, -1, -1);
    PAN_MANDATO.SetFieldUnbound(PFL_MANDATO_DETTAGMANDAT, true);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DETTAGMANDAT, PPQRY_MAN8, "'NO'", "RECODETTMAND", 5, 2, 0, -13997);
    PAN_MANDATO.SetValueListItem(PFL_MANDATO_DETTAGMANDAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_MANDATO.SetValueListItem(PFL_MANDATO_DETTAGMANDAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_LIST, 952, 48, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_LIST, 100);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_FORM, 208, 68, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_FORM, 64);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descr.");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_DESCRIZIONE1, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_DESCRIZIONE1, PPQRY_IMP1, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_LIST, 76);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_LIST, "Mandato a Copertura");
    PAN_MANDATO.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_FORM, 440, 232, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_FORM, 128);
    PAN_MANDATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATO_COPERTURA, MyGlb.PANEL_FORM, "Mandato a Copertura");
    PAN_MANDATO.SetFieldPage(PFL_MANDATO_COPERTURA, -1, -1);
    PAN_MANDATO.SetFieldPanel(PFL_MANDATO_COPERTURA, PPQRY_MAN8, "A.COPERTURA", "RECORDCOPERT", 5, 2, 0, -13997);
    PAN_MANDATO.SetValueListItem(PFL_MANDATO_COPERTURA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_MANDATO.SetValueListItem(PFL_MANDATO_COPERTURA, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_MANDATO_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANDATO.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~ANNO_IMP~~ AND A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_MANDATO.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_MANDATO.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetMasterTable(PPQRY_IMP1, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0) as ROWNAMDESCAP, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~) as ROWNAMDESART ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_MANDATO.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_MANDATO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(A.DESCRIZIONE, '', '', A.DESCRIZIONE) as VOCECODESEXP ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A, ");
    SQL.append("  RICLASSIFICAZIONI B, ");
    SQL.append("  CAP C ");
    SQL.append("where (A.CODICE = ~~VOCE_ECON~~) ");
    SQL.append("and   (A.CODICE = B.VOCE_ECON) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (C.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(C.TITOLO, -1)) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(C.CATEGORIA, -1)) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(C.COD_INTERVENTO, -1)) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(C.COD_TERZI, -1)) ");
    SQL.append("and   (C.E_S = 'S') ");
    PAN_MANDATO.SetQuery(PPQRY_VOCIECONOMIC, 0, SQL, -1, "");
    PAN_MANDATO.SetQueryDB(PPQRY_VOCIECONOMIC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetMasterTable(PPQRY_VOCIECONOMIC, "VOCI_ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    PAN_MANDATO.SetQuery(PPQRY_T53, 0, SQL, -1, "");
    PAN_MANDATO.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetMasterTable(PPQRY_T53, "T53");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~RECORMANBOLL~~) ");
    PAN_MANDATO.SetQuery(PPQRY_T60, 0, SQL, -1, "");
    PAN_MANDATO.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetMasterTable(PPQRY_T60, "T60");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    PAN_MANDATO.SetQuery(PPQRY_VINCOLI, 0, SQL, -1, "");
    PAN_MANDATO.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetMasterTable(PPQRY_VINCOLI, "VINCOLI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATO.SetQuery(PPQRY_T54, 0, SQL, PFL_MANDATO_UFFICIO3, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATO.SetQuery(PPQRY_T54, 1, SQL, PFL_MANDATO_UFFICIO3, "");
    PAN_MANDATO.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~RECORMANBOLL~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATO.SetQuery(PPQRY_T61, 0, SQL, PFL_MANDATO_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATO.SetQuery(PPQRY_T61, 1, SQL, PFL_MANDATO_BOLLO, "");
    PAN_MANDATO.SetQueryDB(PPQRY_T61, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  DECODE(A.SCADENZA, to_date(NULL), TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE, '*** VINCOLO SCADUTO *** ' || ' ' || '(' || TO_CHAR ( A.CODICE ) || ')') as VINCDESCEXPR ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VINCOLO~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~D_DATA_MAND~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATO.SetQuery(PPQRY_VINCOLI1, 0, SQL, PFL_MANDATO_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  DECODE(A.SCADENZA, to_date(NULL), TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE, '*** VINCOLO SCADUTO *** ' || ' ' || '(' || TO_CHAR ( A.CODICE ) || ')') as VINCDESCEXPR ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~D_DATA_MAND~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATO.SetQuery(PPQRY_VINCOLI1, 1, SQL, PFL_MANDATO_TIPOVINCOLO, "");
    PAN_MANDATO.SetQueryDB(PPQRY_VINCOLI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetIMDB(IMDB, "PQRY_MAN8", true);
    PAN_MANDATO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.PAGATO as PAGATO, ");
    SQL.append("  A.NUMERO_ELENCO as NUMERO_ELENCO, ");
    SQL.append("  A.D_DATA_ELENCO as D_DATA_ELENCO, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  1 as RECORT53EXPR, ");
    SQL.append("  A.BOLLO as RECORMANBOLL, ");
    SQL.append("  1 as RECVINDESEXP, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.BOLLO as BOLLO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  'NO' as RECODETTMAND, ");
    SQL.append("  A.D_DATA_VALUTA as D_DATA_VALUTA, ");
    SQL.append("  A.COPERTURA as RECORDCOPERT ");
    PAN_MANDATO.SetQuery(PPQRY_MAN8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MAN A ");
    PAN_MANDATO.SetQuery(PPQRY_MAN8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MAND = ~~TBL_PARAM52.ROWNAMANNMAN~~) ");
    SQL.append("and   (A.NUMERO_MAND = ~~TBL_PARAM52.ROWNAMNUMMAN~~) ");
    PAN_MANDATO.SetQuery(PPQRY_MAN8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDATO.SetQuery(PPQRY_MAN8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDATO.SetQuery(PPQRY_MAN8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND ");
    PAN_MANDATO.SetQuery(PPQRY_MAN8, 5, SQL, -1, "");
    PAN_MANDATO.SetQueryDB(PPQRY_MAN8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATO.SetMasterTable(0, "MAN");
    PAN_MANDATO.AddToSortList(PFL_MANDATO_ANNOMAND, true);
    PAN_MANDATO.AddToSortList(PFL_MANDATO_MANDATO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MANDATO.Status() == 2)
    {
      int oldListQBE = PAN_MANDATO.iUseListQBE;
      PAN_MANDATO.iUseListQBE = 0;
      PAN_MANDATO.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANDATO.PanelCommand(Glb.PCM_FIND);
      PAN_MANDATO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LIQUIDAZIONI_Init()
  {

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_FIELD, 38);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, "F3A86AFB-CF56-4F2B-84A0-6673C8060345");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, 0, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "92299307-6856-4CBD-B5CE-0E79BBD9FB32");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, "9E512C1A-3999-4795-9F1F-AAB0FA16EDCC");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, "D DATA REG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "AFC7789B-CD85-44BD-9FA8-16E26B60E36F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, "6C8B4FCD-7DC4-4E98-B8BD-381702C2B18F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, "Apri Liquidazione Expression");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "1C31BC88-5B54-4AA5-A2E2-DFB912099ED9");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "Importo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "0D7ABA71-82C4-4D6E-8083-D98A2408D66E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "Importo IVA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, "55676485-6154-4946-88A9-8CEC0A7DF46F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, "Ritenute");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, "5E1A1D91-AEFF-4F43-A6B9-6EBF52425771");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, "Pagato");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, "IMPORTO PAGAM");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "7B4D3AC1-846C-43B3-BBCD-E6937ADE1F50");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "Beneficiario");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "RAGIONE SOCIALE");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, "89FF1D73-F680-4195-962F-071947EDDD39");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, "NUMERO DOC 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "2ABF9C74-69BC-4EE7-B52C-B8FA01A4AB6B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "D DATA DOC");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "982C4B4A-568F-49C7-8BD3-5F1263EE1642");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "Quietanza");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, "E814310D-E1B5-4821-9788-89E391B87ABB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, "Quietanza Info Expression");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "CD0199E1-16E8-4B69-9F8F-D2DECB3A9EA7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "SEDE DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "CB47EE5B-6CAD-470D-B8F4-AEEE8FD7CA5F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "NUMERO DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "1A4E2D55-80D2-475A-819D-7E55D9C47B46");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "ANNO DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, "3A64A43B-1D71-4F3C-B0A2-07B8F1075132");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, "Progr. Tesoriere");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, "32634BEF-820E-4E03-BDA3-5C7D2535E5DD");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, "Distinta Tecnica");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, "If (Is Null (LIQ NUMERO DISTINTA), \"\", LIQ TIPO DISTINTA + \" - \" + To String (LIQ NUMERO DISTINTA) + \" / \" + To String (LIQ ANNO DISTINTA))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, "0AAF0E2E-820F-4FA4-9EC5-9D264C4BB07B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, "Ufficio");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, "If (Is Null (T53 CODICE), \"\", To String (T53 CODICE) + \" - \" + T53 DESCRIZIONE)");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "C77A60C6-75E0-4A9D-B038-37187FC929E3");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "Cgu");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "If (Is Null (LIQ CODICE GESTIONALE), \"\", To String (LIQ CODICE GESTIONALE) + \" - \" + To String (CODICI GESTIONALI DESCRIZIONE))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "7BA3D669-7FF6-41E7-B088-083B2AC49AD4");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "If (Is Null (LIQ FINANZIAMENTO), \"\", To String (LIQ FINANZIAMENTO) + \" - \" + To String (FINANZIAMENTI DESCRIZIONE))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "1106AE0A-AB1D-42A4-B370-9B46DD69E972");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "UFFICIO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "30BFF677-8A32-4E9E-9F82-CDBB2D584E81");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "NUMERO DOC");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "4106C0E7-F659-4C4E-AB38-AA010C3A4516");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, "8898FB66-9DF7-4E7E-B630-380E73C811EE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, "A2CBAF18-063A-4AE0-9FF9-D24A3A4A8EBF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, "Documento");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, "1E1898F5-D128-4639-9FE3-BBF3D915CCBB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, "Delibera");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, "90B872A8-E155-4342-943C-A66956E42A61");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, "833C03E1-85F7-44F0-8B56-C82CCAAB9658");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, "DDB55651-17EE-43E8-9F78-5CBA8EE4653B");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, "1475AC75-A3D8-4372-AA01-02E65537520E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, "Quietanza");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, "C1627ECF-54DD-41EE-BF77-B697793350DF");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, "CODICE");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, "966511FA-2D87-4338-876C-2230B4B13A6F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, "Ordinamento1 Expression");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, "Null Value (LIQ DIVERSO BEN, LIQ BENEFICIARIO)");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, "0B986635-8EA2-4EB1-ABCF-F10A1A737837");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, "Ordinamento1 Expression 2");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, "If (Is Null (LIQ DIVERSO BEN), LIQ NUM QUIETANZA, LIQ NUM QUIETANZA DIV BEN)");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, "E7F1AF90-6608-4BE2-AC49-FC3121FC515C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, "EC665D36-F822-42D0-9E36-3642570956AD");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, "CODICE 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, "361EAF5B-04D2-485D-AA7F-A29F30E6D7D7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_LIQUIDAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_LIST, 8, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_FORM, 20, 8, 112, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LIQUIDAZIONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LIQUIDAZIONE, -1, "", "LIQUIDAZIONE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROLIQ, PPQRY_LIQ9, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, 40, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, "D DATA REG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, "D DT. REG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DDATAREG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DDATAREG, PPQRY_LIQ9, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 108, 40, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 460, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DESCRIZIONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DESCRIZIONE, PPQRY_LIQ9, "A.DESCRIZIONE", "RECORDDESCRI", 5, 140, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, 288, 40, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, "A. L. E.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, 4, 664, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, "Apri Liquidazione Expression");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_APRILIQUEXPR, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_APRILIQUEXPR, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_APRILIQUEXPR, PPQRY_LIQ9, "'I'", "RECAPRLIQEXP", 5, 1, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_APRILIQUEXPR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 312, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTO, PPQRY_LIQ9, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 392, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo IVA");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 712, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo IVA");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTOIVA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTOIVA, PPQRY_LIQ9, "A.IMPORTO_IVA", "RECLIQIMPIVA", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, 472, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, 4, 244, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_RITENUTE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_RITENUTE, PPQRY_LIQ9, "A.RITENUTE", "RITENUTE", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, 552, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, 4, 340, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PAGATO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PAGATO, PPQRY_LIQ9, "A.IMPORTO_PAGAM", "IMPORTO_PAGAM", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 632, 40, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 52, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BENEFICIARIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BENEFICIARIO, PPQRY_LIQ9, "B.RAGIONE_SOCIALE_ESTESA", "REBERASOESES", 5, 60, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, 776, 40, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, "NUMERO DOC 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, 4, 364, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, "NUM. DOC 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODOC1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODOC1, PPQRY_LIQ9, "C.NUMERO_DOC", "RECONUMEDOC1", 5, 20, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 864, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 4, 76, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DDATADOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DDATADOC, PPQRY_LIQ9, "C.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 932, 40, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 4, 100, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_QUIETANZA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_QUIETANZA, PPQRY_LIQ9, "D.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, 1116, 40, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, 136);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, "Q. I. E.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, 4, 496, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, 136);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, "Quiet. Info Expression");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_QUIEINFOEXPR, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_QUIEINFOEXPR, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_QUIEINFOEXPR, PPQRY_LIQ9, "'I'", "RECQUIINFEXP", 5, 1, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_QUIEINFOEXPR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1140, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 4, 148, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SEDEDEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SEDEDEL, PPQRY_LIQ9, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1180, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 4, 172, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODEL, PPQRY_LIQ9, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1224, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, "ANN. DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 4, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODEL, PPQRY_LIQ9, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, 1256, 40, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, "Progr. Tesoriere");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, 4, 292, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, "Progr. Tesoriere");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PROGRTESORIE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PROGRTESORIE, PPQRY_LIQ9, "A.PROGRESSIVO_TESO", "PROGRESSIVO_TESO", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, 1320, 40, 84, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, "Distinta Tecnica");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, 4, 388, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, "Distinta Tecnica");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DISTINTECNIC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_DISTINTECNIC, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DISTINTECNIC, PPQRY_LIQ9, "CASE WHEN (A.NUMERO_DISTINTA IS NULL) THEN '' ELSE A.TIPO_DISTINTA || ' - ' || TO_CHAR ( A.NUMERO_DISTINTA ) || ' / ' || TO_CHAR ( A.ANNO_DISTINTA ) END", "RECODISTTECN", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, 1404, 40, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, "Ufficio");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, 4, 568, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, "Ufficio");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UFFICIO2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_UFFICIO2, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UFFICIO2, PPQRY_LIQ9, "CASE WHEN (E.CODICE IS NULL) THEN '' ELSE TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE END", "RECORDUFFICI", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 1544, 40, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 4, 616, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CGU, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_CGU, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CGU, PPQRY_LIQ9, "CASE WHEN (A.CODICE_GESTIONALE IS NULL) THEN '' ELSE TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || TO_CHAR ( F.DESCRIZIONE ) END", "RECORDCGU", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1724, 40, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 132);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 520, 564, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 132);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FINANZIAMENT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_FINANZIAMENT, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FINANZIAMENT, PPQRY_LIQ9, "CASE WHEN (A.FINANZIAMENTO IS NULL) THEN '' ELSE TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || TO_CHAR ( H.DESCRIZIONE ) END", "RECORDFINANZ", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 2448, 72, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, "UFFICIO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 4, 124, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, "UFFICIO");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UFFICIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UFFICIO, PPQRY_LIQ9, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 2448, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 4, 220, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODOC, PPQRY_LIQ9, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 2448, 72, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 316, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOLIQ, PPQRY_LIQ9, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_LIST, 0, 4, 312, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_FORM, 0, 8, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LIQULABEHEAD, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LIQULABEHEAD, -1, "", "LIQULABEHEAD", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_LIST, 776, 4, 156, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_FORM, 560, 4, 200, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DOCUHEADLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DOCUHEADLABE, -1, "", "DOCUHEADLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_LIST, 1140, 4, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_FORM, 968, 68, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DELIHEADLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DELIHEADLABE, -1, "", "DELIHEADLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_LIST, 312, 148, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_FORM, 112, 252, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMMIMPOLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMMIMPOLABE, -1, "", "SOMMIMPOLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_LIST, 472, 148, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_FORM, 120, 260, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMMRITELABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMMRITELABE, -1, "", "SOMMRITELABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_LIST, 552, 148, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_FORM, 128, 268, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMMPAGALABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMMPAGALABE, -1, "", "SOMMPAGALABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.PANEL_LIST, 932, 4, 208, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.PANEL_FORM, 976, 76, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_QUIEHEADLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_QUIEHEADLABE, -1, "", "QUIEHEADLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_LIST, 1656, 72, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_FORM, 4, 520, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CODICE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CODICE, PPQRY_LIQ9, "E.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_LIST, 0, 72, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_LIST, 132);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_LIST, "Ordinamento1 Expression");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_FORM, 4, 712, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_FORM, 132);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.PANEL_FORM, "Ordinam. Expression");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ORDINAEXPRES, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_ORDINAEXPRES, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ORDINAEXPRES, PPQRY_LIQ9, "NVL(A.DIVERSO_BEN, A.BENEFICIARIO)", "RECOORDIEXPR", 2, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_LIST, 0, 72, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_LIST, 140);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_LIST, "Ordinamento1 Expression 2");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_FORM, 4, 712, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_FORM, 140);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.PANEL_FORM, "Ordinam. Expression 2");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ORDINAEXPRE2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_ORDINAEXPRE2, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ORDINAEXPRE2, PPQRY_LIQ9, "CASE WHEN (A.DIVERSO_BEN IS NULL) THEN A.NUM_QUIETANZA ELSE A.NUM_QUIETANZA_DIV_BEN END", "RECOORDIEXP2", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, 2148, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 712, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMQUIETANZA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMQUIETANZA, PPQRY_LIQ9, "G.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, 2148, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, "CODICE 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, 4, 712, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, 48);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, "COD. 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CODICE1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CODICE1, PPQRY_LIQ9, "G.CODICE", "RECORDCODIC1", 2, 15, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, MyGlb.PANEL_LIST, 392, 148, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, MyGlb.PANEL_FORM, 128, 268, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELAB1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMMRITELAB1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMMRITELAB1, -1, "", "SOMMRITELAB1", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIDAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAZIONI.SetIMDB(IMDB, "PQRY_LIQ9", true);
    PAN_LIQUIDAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
    SQL.append("  C.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  D.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.RITENUTE as RITENUTE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.PROGRESSIVO_TESO as PROGRESSIVO_TESO, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.IMPORTO_PAGAM as IMPORTO_PAGAM, ");
    SQL.append("  C.NUMERO_DOC as RECONUMEDOC1, ");
    SQL.append("  CASE WHEN (A.NUMERO_DISTINTA IS NULL) THEN '' ELSE A.TIPO_DISTINTA || ' - ' || TO_CHAR ( A.NUMERO_DISTINTA ) || ' / ' || TO_CHAR ( A.ANNO_DISTINTA ) END as RECODISTTECN, ");
    SQL.append("  E.DESCRIZIONE as RECORDDESCR1, ");
    SQL.append("  A.DESCRIZIONE as RECORDDESCRI, ");
    SQL.append("  'I' as RECQUIINFEXP, ");
    SQL.append("  CASE WHEN (E.CODICE IS NULL) THEN '' ELSE TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE END as RECORDUFFICI, ");
    SQL.append("  E.CODICE as CODICE, ");
    SQL.append("  CASE WHEN (A.FINANZIAMENTO IS NULL) THEN '' ELSE TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || TO_CHAR ( H.DESCRIZIONE ) END as RECORDFINANZ, ");
    SQL.append("  CASE WHEN (A.CODICE_GESTIONALE IS NULL) THEN '' ELSE TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || TO_CHAR ( F.DESCRIZIONE ) END as RECORDCGU, ");
    SQL.append("  'I' as RECAPRLIQEXP, ");
    SQL.append("  NVL(A.DIVERSO_BEN, A.BENEFICIARIO) as RECOORDIEXPR, ");
    SQL.append("  CASE WHEN (A.DIVERSO_BEN IS NULL) THEN A.NUM_QUIETANZA ELSE A.NUM_QUIETANZA_DIV_BEN END as RECOORDIEXP2, ");
    SQL.append("  G.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  G.CODICE as RECORDCODIC1, ");
    SQL.append("  A.IMPORTO_IVA as RECLIQIMPIVA ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ9, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  FAT C, ");
    SQL.append("  T02 D, ");
    SQL.append("  T53 E, ");
    SQL.append("  CODICI_GESTIONALI F, ");
    SQL.append("  QTN G, ");
    SQL.append("  FINANZIAMENTI H ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ9, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BENEFICIARIO = G.CODICE(+)) ");
    SQL.append("and   (A.NUM_QUIETANZA = G.NUM_QUIETANZA(+)) ");
    SQL.append("and   (G.TIPO_QUIETANZA = D.CODICE(+)) ");
    SQL.append("and   (A.BENEFICIARIO = B.CODICE(+)) ");
    SQL.append("and   (A.FAT_ANNO_PROG = C.ANNO_PROG(+)) ");
    SQL.append("and   (A.FAT_NUMERO_PROG = C.NUMERO_PROG(+)) ");
    SQL.append("and   (A.FINANZIAMENTO = H.CODICE(+)) ");
    SQL.append("and   (A.ANNO_MAND = ~~PQRY_MAN8.ANNO_MAND~~ AND A.NUMERO_MAND = ~~PQRY_MAN8.NUMERO_MAND~~) ");
    SQL.append("and   (E.CODICE(+) = C.UFFICIO_INVIO) ");
    SQL.append("and   (A.CODICE_GESTIONALE = F.CODICE(+)) ");
    SQL.append("and   (NVL(F.E_S, 'S') = 'S') ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ9, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ9, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ9, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 26, 27, 14, 1 ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ9, 5, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_LIQ9, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(0, "LIQ");
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ORDINAEXPRES, true);
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ORDINAEXPRE2, true);
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOLIQ, true);
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROLIQ, true);
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
    if (SrcObj == PAN_MANDATO) PAN_MANDATO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATO) PAN_MANDATO_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MANDATO) PAN_MANDATO_DynamicProperties();
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATO) PAN_MANDATO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MANDATO) PAN_MANDATO_AfterFind(CmdFind);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_MANDATO) PAN_MANDATO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
