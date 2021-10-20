// **********************************************
// Mandati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Mandati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FILTRIPANEL_LIQUIDAZIONE = 0;
  private static int GRP_FILTRIPANEL_MANDATI = 1;
  private static int GRP_FILTRIPANEL_NUMERO = 2;
  private static int GRP_FILTRIPANEL_DATA = 3;

  private static int PFL_FILTRIPANEL_NEWPANELLAB1 = 0;
  private static int PFL_FILTRIPANEL_NEWPANELABE2 = 1;
  private static int PFL_FILTRIPANEL_NEWPANELLAB2 = 2;
  private static int PFL_FILTRIPANEL_NEWPANELABE3 = 3;
  private static int PFL_FILTRIPANEL_NEWPANELLAB3 = 4;
  private static int PFL_FILTRIPANEL_NEWPANELABE4 = 5;
  private static int PFL_FILTRIPANEL_NEWPANELLAB4 = 6;
  private static int PFL_FILTRIPANEL_NEWPANELABE5 = 7;
  private static int PFL_FILTRIPANEL_DAL1 = 8;
  private static int PFL_FILTRIPANEL_AL1 = 9;
  private static int PFL_FILTRIPANEL_DAL = 10;
  private static int PFL_FILTRIPANEL_AL = 11;
  private static int PFL_FILTRIPANEL_NUMERO = 12;
  private static int PFL_FILTRIPANEL_ANNO = 13;
  private static int PFL_FILTRIPANEL_MANDATI = 14;
  private static int PFL_FILTRIPANEL_NONINSEINFLU = 15;

  private static int PPQRY_FILTRI2 = 0;


  IDPanel PAN_FILTRIPANEL;
  private static int GRP_MANDATI_MANDATO = 0;
  private static int GRP_MANDATI_DISTINTA = 1;
  private static int GRP_MANDATI_CAPITOLOART = 2;
  private static int GRP_MANDATI_IMPEGNO = 3;
  private static int GRP_MANDATI_INSERIMENTO = 4;
  private static int GRP_MANDATI_AGGIORNAMENT = 5;
  private static int GRP_MANDATI_NUOVOGRUPPO = 6;

  private static int PFL_MANDATI_MANDATO = 0;
  private static int PFL_MANDATI_DEL1 = 1;
  private static int PFL_MANDATI_NEWPANELLAB5 = 2;
  private static int PFL_MANDATI_IMPORTO1 = 3;
  private static int PFL_MANDATI_DISTINTA = 4;
  private static int PFL_MANDATI_DEL = 5;
  private static int PFL_MANDATI_NEWPANELABE6 = 6;
  private static int PFL_MANDATI_PAGATO1 = 7;
  private static int PFL_MANDATI_UFFICIO1 = 8;
  private static int PFL_MANDATI_BOLLO = 9;
  private static int PFL_MANDATI_TIPOVINCOLO = 10;
  private static int PFL_MANDATI_VOCEECON = 11;
  private static int PFL_MANDATI_VOCECODESEXP = 12;
  private static int PFL_MANDATI_NEWPANELABE7 = 13;
  private static int PFL_MANDATI_CAPITOLO1 = 14;
  private static int PFL_MANDATI_ARTICOLO1 = 15;
  private static int PFL_MANDATI_CAPITOLO = 16;
  private static int PFL_MANDATI_ARTICOLO = 17;
  private static int PFL_MANDATI_NEWPANELLAB6 = 18;
  private static int PFL_MANDATI_NUMEROIMP = 19;
  private static int PFL_MANDATI_ANNOIMP = 20;
  private static int PFL_MANDATI_NEWPANELABE1 = 21;
  private static int PFL_MANDATI_TRATTINLABEL = 22;
  private static int PFL_MANDATI_APRIINFOLABE = 23;
  private static int PFL_MANDATI_APRINFIMPLAB = 24;
  private static int PFL_MANDATI_SLASHLABEL = 25;
  private static int PFL_MANDATI_VINCDESCEXPR = 26;
  private static int PFL_MANDATI_ANNOMAND = 27;
  private static int PFL_MANDATI_MANDATOLABEL = 28;
  private static int PFL_MANDATI_DISTINTLABEL = 29;
  private static int PFL_MANDATI_UTENTE1 = 30;
  private static int PFL_MANDATI_DATA1 = 31;
  private static int PFL_MANDATI_UTENTE = 32;
  private static int PFL_MANDATI_DATA = 33;
  private static int PFL_MANDATI_NEWPANELLABE = 34;
  private static int PFL_MANDATI_VALUTA = 35;
  private static int PFL_MANDATI_IMPORTOLABEL = 36;
  private static int PFL_MANDATI_DETTAGMANDAT = 37;
  private static int PFL_MANDATI_DESCRIZIONE1 = 38;
  private static int PFL_MANDATI_COPERTURA = 39;

  private static int PPQRY_MAN7 = 0;

  private static int PPQRY_IMP1 = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_VOCIECONOMI1 = 3;

  private static int PPQRY_T54 = 4;
  private static int PPQRY_T61 = 5;
  private static int PPQRY_VINCOLI1 = 6;


  IDPanel PAN_MANDATI;
  private static int PFL_LIQUIDAZIONI_LIQUIDAZIONE = 0;
  private static int PFL_LIQUIDAZIONI_NUMEROLIQ = 1;
  private static int PFL_LIQUIDAZIONI_DDATAREG = 2;
  private static int PFL_LIQUIDAZIONI_APRILIQUEXPR = 3;
  private static int PFL_LIQUIDAZIONI_INFOLIQ = 4;
  private static int PFL_LIQUIDAZIONI_IMPORTO = 5;
  private static int PFL_LIQUIDAZIONI_IMPORTOIVA = 6;
  private static int PFL_LIQUIDAZIONI_IMPORTIVAIST = 7;
  private static int PFL_LIQUIDAZIONI_RITENUTE = 8;
  private static int PFL_LIQUIDAZIONI_PAGATO = 9;
  private static int PFL_LIQUIDAZIONI_BENEFICIARIO = 10;
  private static int PFL_LIQUIDAZIONI_NUMERODOC1 = 11;
  private static int PFL_LIQUIDAZIONI_DDATADOC = 12;
  private static int PFL_LIQUIDAZIONI_INFODOC = 13;
  private static int PFL_LIQUIDAZIONI_QUIETANZA = 14;
  private static int PFL_LIQUIDAZIONI_QUIEINFOEXPR = 15;
  private static int PFL_LIQUIDAZIONI_SEDEDEL = 16;
  private static int PFL_LIQUIDAZIONI_NUMERODEL = 17;
  private static int PFL_LIQUIDAZIONI_ANNODEL = 18;
  private static int PFL_LIQUIDAZIONI_PROGRTESORIE = 19;
  private static int PFL_LIQUIDAZIONI_DISTINTECNIC = 20;
  private static int PFL_LIQUIDAZIONI_UFFICIO2 = 21;
  private static int PFL_LIQUIDAZIONI_DESCRIZIONE = 22;
  private static int PFL_LIQUIDAZIONI_CGU = 23;
  private static int PFL_LIQUIDAZIONI_UFFICIO = 24;
  private static int PFL_LIQUIDAZIONI_NUMERODOC = 25;
  private static int PFL_LIQUIDAZIONI_ANNOLIQ = 26;
  private static int PFL_LIQUIDAZIONI_LIQULABEHEAD = 27;
  private static int PFL_LIQUIDAZIONI_DOCUHEADLABE = 28;
  private static int PFL_LIQUIDAZIONI_DELIHEADLABE = 29;
  private static int PFL_LIQUIDAZIONI_SOMMIMPOLABE = 30;
  private static int PFL_LIQUIDAZIONI_SOMMRITELABE = 31;
  private static int PFL_LIQUIDAZIONI_SOMMPAGALABE = 32;
  private static int PFL_LIQUIDAZIONI_QUIEHEADLABE = 33;
  private static int PFL_LIQUIDAZIONI_CODICE = 34;
  private static int PFL_LIQUIDAZIONI_ORDINAEXPRES = 35;
  private static int PFL_LIQUIDAZIONI_ORDINAEXPRE2 = 36;
  private static int PFL_LIQUIDAZIONI_NUMQUIETANZA = 37;
  private static int PFL_LIQUIDAZIONI_CODICE1 = 38;
  private static int PFL_LIQUIDAZIONI_PIANOCONTINT = 39;
  private static int PFL_LIQUIDAZIONI_CODICECOFOG = 40;
  private static int PFL_LIQUIDAZIONI_CODICEEUROPE = 41;
  private static int PFL_LIQUIDAZIONI_FINANZIAMENT = 42;
  private static int PFL_LIQUIDAZIONI_SOMIMPIVALAB = 43;
  private static int PFL_LIQUIDAZIONI_SOMIMPIVISLA = 44;
  private static int PFL_LIQUIDAZIONI_FATANNOPROG = 45;
  private static int PFL_LIQUIDAZIONI_FATNUMERPROG = 46;

  private static int PPQRY_LIQ17 = 0;


  IDPanel PAN_LIQUIDAZIONI;

  // Definition of Global Variables
  private IDVariant INIT = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant ANNULLVISIBI = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant VARIAZVISIBI = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant SOSTITVISIBI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_FILTRI2(IMDB);
    Init_PQRY_FILTRI2_RS(IMDB);
    Init_PQRY_MAN7(IMDB);
    Init_PQRY_LIQ17(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_FILTRI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_FILTRI2, 8);
    IMDB.set_TblCode(IMDBDef14.PQRY_FILTRI2, "PQRY_FILTRI2");
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMDAL, "ROWNAMNUMDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMENUMAL, "ROWNAMENUMAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMENUMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMDATDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMEDATAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMLIQ, "ROWNAMNUMLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMANNLIQ, "ROWNAMANNLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMANNLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_ROWNAMEMANDA,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_RONANOININFL, "RONANOININFL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2,IMDBDef14.PQSL_FILTRI2_RONANOININFL,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_FILTRI2, 0);
  }

  private static void Init_PQRY_FILTRI2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_FILTRI2_RS, 8);
    IMDB.set_TblCode(IMDBDef14.PQRY_FILTRI2_RS, "PQRY_FILTRI2_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMDAL, "ROWNAMNUMDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMENUMAL, "ROWNAMENUMAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMENUMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMDATDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMEDATAL,6,14,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMLIQ, "ROWNAMNUMLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMNUMLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMANNLIQ, "ROWNAMANNLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMANNLIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_ROWNAMEMANDA,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_RONANOININFL, "RONANOININFL");
    IMDB.SetFldParams(IMDBDef14.PQRY_FILTRI2_RS,IMDBDef14.PQSL_FILTRI2_RONANOININFL,5,2,0);
  }

  private static void Init_PQRY_MAN7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MAN7, 23);
    IMDB.set_TblCode(IMDBDef14.PQRY_MAN7, "PQRY_MAN7");
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_PAGATO, "PAGATO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_PAGATO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_NUMERO_ELENCO, "NUMERO_ELENCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_NUMERO_ELENCO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_D_DATA_ELENCO, "D_DATA_ELENCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_D_DATA_ELENCO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_RECVINDESEXP, "RECVINDESEXP");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_RECVINDESEXP,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_RECODETTMAND, "RECODETTMAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_RECODETTMAND,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_D_DATA_VALUTA, "D_DATA_VALUTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_D_DATA_VALUTA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_COPERTURA, "COPERTURA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MAN7,IMDBDef14.PQSL_MAN7_COPERTURA,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_MAN7, 0);
  }

  private static void Init_PQRY_LIQ17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ17, 38);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ17, "PQRY_LIQ17");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_PROGRESSIVO_TESO, "PROGRESSIVO_TESO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_PROGRESSIVO_TESO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_IMPORTO_PAGAM, "IMPORTO_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_IMPORTO_PAGAM,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECONUMEDOC1, "RECONUMEDOC1");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECONUMEDOC1,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECODISTTECN, "RECODISTTECN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECODISTTECN,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDDESCR1, "RECORDDESCR1");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDDESCR1,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDDESCRI, "RECORDDESCRI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECQUIINFEXP, "RECQUIINFEXP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECQUIINFEXP,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDUFFICI, "RECORDUFFICI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDUFFICI,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDFINANZ, "RECORDFINANZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDFINANZ,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDCGU, "RECORDCGU");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDCGU,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECAPRLIQEXP, "RECAPRLIQEXP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECAPRLIQEXP,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECOORDIEXPR, "RECOORDIEXPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECOORDIEXPR,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECOORDIEXP2, "RECOORDIEXP2");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECOORDIEXP2,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDCODIC1, "RECORDCODIC1");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORDCODIC1,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_PIANOCONTINT, "PIANOCONTINT");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_PIANOCONTINT,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQCODCOF, "RECLIQCODCOF");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQCODCOF,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQCODEUR, "RECLIQCODEUR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQCODEUR,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQIMPIVA, "RECLIQIMPIVA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQIMPIVA,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQIMIVIS, "RECLIQIMIVIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQIMIVIS,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORINFOLIQ, "RECORINFOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORINFOLIQ,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORINFODOC, "RECORINFODOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECORINFODOC,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQFAANPR, "RECLIQFAANPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQFAANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQFANUPR, "RECLIQFANUPR");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ17,IMDBDef14.PQSL_LIQ17_RECLIQFANUPR,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ17, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Mandati(MyWebEntryPoint w, IMDBObj imdb)
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
  public Mandati()
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
    FormIdx = MyGlb.FRM_MANDATI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "25E9A758-3508-4507-BD63-B8EA120BD1CA";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 996;
    DesignHeight = 518;
    set_Caption(new IDVariant("Mandati"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 996;
    Frames[1].Height = 492;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.097561;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 996;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri Panel";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_FILTRIPANEL = new IDPanel(w, this, 2, "PAN_FILTRIPANEL");
    Frames[2].Content = PAN_FILTRIPANEL;
    PAN_FILTRIPANEL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRIPANEL.VS = MainFrm.VisualStyleList;
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "995CAEBA-D239-4D6E-9670-D0DFEF5B8F02");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 4, 884, 136, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 0);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRIPANEL.InitStatus = 1;
    PAN_FILTRIPANEL_Init();
    PAN_FILTRIPANEL_InitFields();
    PAN_FILTRIPANEL_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 996;
    Frames[3].Height = 444;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.567568;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 996;
    Frames[4].Height = 252;
    Frames[4].Caption = "Mandati";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 252;
    PAN_MANDATI = new IDPanel(w, this, 4, "PAN_MANDATI");
    Frames[4].Content = PAN_MANDATI;
    PAN_MANDATI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANDATI.VS = MainFrm.VisualStyleList;
    PAN_MANDATI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 252-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CD529806-B5F1-4B6A-879F-F86B15CB43AD");
    PAN_MANDATI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1124, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATI.InitStatus = 1;
    PAN_MANDATI_Init();
    PAN_MANDATI_InitFields();
    PAN_MANDATI_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 996;
    Frames[5].Height = 192;
    Frames[5].Caption = "Liquidazioni";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 192;
    PAN_LIQUIDAZIONI = new IDPanel(w, this, 5, "PAN_LIQUIDAZIONI");
    Frames[5].Content = PAN_LIQUIDAZIONI;
    PAN_LIQUIDAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIONI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7B2ABEED-8B8C-4FE2-BBC7-9CEA1178D5C1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 2204, 76, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIONI.InitStatus = 2;
    PAN_LIQUIDAZIONI_Init();
    PAN_LIQUIDAZIONI_InitFields();
    PAN_LIQUIDAZIONI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA53+BaseCmdLinIdx)
      {
        SalvaMandati();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCELLA3+BaseCmdLinIdx)
      {
        DeleteMandati();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI15+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_PAGAMENTI1+BaseCmdLinIdx)
      {
        ApriFormPagamenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ANNULLI3+BaseCmdLinIdx)
      {
        ApriAnnulli();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VARIAZIONI2+BaseCmdLinIdx)
      {
        ApriVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SOSTITUZION3+BaseCmdLinIdx)
      {
        ApriSostituzioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ORDINACOLLEG+BaseCmdLinIdx)
      {
        OrdinativiCollegati();
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
      if (IMDB.TblModified(IMDBDef5.TBL_FILTRI6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MANDATI_FILTRI2();
      }
      PAN_FILTRIPANEL.UpdatePanel(MainFrm);
      PAN_MANDATI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCEVOCECCOFI && flRis && IdxPanelActived == PAN_MANDATI.FrIndex)
    {
      if (IdxFieldActived ==PFL_MANDATI_VOCEECON) {
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
    return (obj instanceof Mandati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Mandati.class.getName() : (Glb.ClassWithPackage(Mandati.class) ? Mandati.class.getName().substring(Mandati.class.getPackage().getName().length() + 1) : Mandati.class.getName()));
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Mandati", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      // 
      // imposto parametri di defaulkt per il pannello mandati
      // 
      {
        IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEMANDA, 0, (new IDVariant(3)));
        IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_RECODETTMAND, 0, (new IDVariant("SI")));
        if (IMDB.Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0).equals((new IDVariant("SI")), true))
        {
          PAN_MANDATI.set_Layout((new IDVariant(1)).intValue());
          PAN_FILTRIPANEL.set_Visible((new IDVariant(0)).booleanValue());
          PAN_MANDATI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
          INIT = (new IDVariant(0));
          if (ANNULLVISIBI.booleanValue() || VARIAZVISIBI.booleanValue() || SOSTITVISIBI.booleanValue())
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMENTI1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLI3+BaseCmdLinIdx, ANNULLVISIBI.booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_VARIAZIONI2+BaseCmdLinIdx, VARIAZVISIBI.booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SOSTITUZION3+BaseCmdLinIdx, SOSTITVISIBI.booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
        }
        else
        {
          INIT = (new IDVariant(-1));
          IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
          IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_FILTRI2, IMDBDef14.PQSL_FILTRI2_RONANOININFL, 0),(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
          {
            PAN_MANDATI.Freezed = (new IDVariant(-1)).booleanValue();
          }
        }
        PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_MANDATI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_MANDATI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_MANDATI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_MANDATI.ConfirmDelete = (new IDVariant(0)).booleanValue();
      }
      // 
      // imposto parametri del pannello liquidazioni
      // 
      {
        IDVariant v_NOMECAPTION1 = new IDVariant(0,IDVariant.STRING);
        v_NOMECAPTION1 = (new IDVariant("Dettagli Mandati", IDVariant.STRING));
        Frames[PAN_LIQUIDAZIONI.FrIndex].set_Caption(new IDVariant(v_NOMECAPTION1).stringValue());
        // 
        // gestione finanziamenti
        // 
        if (!(MainFrm.FINANZIAMENT.booleanValue()))
        {
          PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (MainFrm.MANDATCOPERT.equals((new IDVariant("SI")), true))
      {
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_COPERTURA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_COPERTURA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_VOCEECON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_VOCEECON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      Visibilit‡FunzioniAggiuntive();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVOCECCOFI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_VOCE_ECON, 0, IMDB.Value(IMDBDef7.PQRY_VOCIECONOMI4, IMDBDef7.PQSL_VOCIECONOMI4_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "EndModalEvent", _e);
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
      UNLOADEVENT_FILTRIDELETE();
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO1, IMDBDef6.FLD_PARAMEESPLO1_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO2, IMDBDef6.FLD_PARAMEESPLO2_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO4, IMDBDef6.FLD_PARAMEESPLO4_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO5, IMDBDef6.FLD_PARAMEESPLO5_PARAAGGDAFUO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMEESPLO6, IMDBDef6.FLD_PARAMEESPLO6_PARAAGGDAFUO, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Filtri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_FILTRIDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMNUMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMENUMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMNUMLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMANNLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEMANDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_RONANOININFL, 0, new IDVariant());
  }

  // **********************************************************************
  // Mandati On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: PuÚ essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_MANDATI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati On Command Event Body
      // Procedure Body
      // 
      // 
      // quando sono nello stato qbe posso cliccare su Find
      // 
      {
        if (Command.equals((new IDVariant(4)), true))
        {
          PAN_MANDATI.Freezed = (new IDVariant(0)).booleanValue();
        }
      }
      if (Command.equals((new IDVariant(2)), true) && (new IDVariant(PAN_MANDATI.Layout())).equals((new IDVariant(0)), true))
      {
        PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_MANDATI.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(1)), true))
      {
        // 
        // se il layout=Form sto per passare a List
        // 
        if ((new IDVariant(PAN_MANDATI.Layout())).equals((new IDVariant(1)), true))
        {
          if (IMDB.Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0).equals((new IDVariant("SI")), true))
          {
            PAN_MANDATI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
            PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
          }
          else
          {
            PAN_MANDATI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(-1)).booleanValue()); 
            PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
          }
          PAN_MANDATI.SetCommandEnabled((new IDVariant(32)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_MANDATI.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(-1)).booleanValue()); 
          FieldEnable((new IDVariant(0)));
          // 
          // abilito i campi del pannello Filtri
          // 
          {
            PAN_FILTRIPANEL.set_Locked((new IDVariant(0)).booleanValue());
          }
        }
        else
        {
          // 
          // altrimenti se sto per passare a layout=Form
          // 
          SettaImporto();
          PAN_MANDATI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_MANDATI.SetCommandEnabled((new IDVariant(32)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_MANDATI.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
          if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(0)), true)>0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
          {
            FieldEnable((new IDVariant(-1)));
          }
          // 
          // disabilito filtri del pannello Filtri
          // 
          {
            PAN_FILTRIPANEL.set_Locked((new IDVariant(-1)).booleanValue());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_MANDATI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati After Find Event Body
      // Procedure Body
      // 
      SettaImporto();
      if (INIT.booleanValue())
      {
        FieldEnable((new IDVariant(0)));
        PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
        INIT = (new IDVariant(0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento Ë in fase di esecuzione. Occorre utilizzare la propriet‡ Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo Ë veramente stato modificato, cioË il suo valore Ë diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo Ë stato modificato nell'ultima trasmissione del browser, ed Ë quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non Ë consigliabile utilizzare questo argomento perchË Ë presente solo per compatibilit‡ con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale Ë in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_MANDATI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_MANDATI_DISTINTA)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_ELENCO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_D_DATA_ELENCO, 0, (new IDVariant()));
        }
      }
      // 
      // gestione gruppo inserimento e aggiornamento
      // 
      {
        if (PAN_MANDATI.IsNewRow())
        {
          IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_DATA_INSERIMENTO, 0, IDL.Today());
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_UFFICIO, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0))))
        {
          if (IDL.NullValue(PAN_MANDATI.GetLastValue(PFL_MANDATI_UFFICIO1),(new IDVariant(""))).equals((new IDVariant("")), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_UFFICIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANDATI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_MANDATI);
      // 
      // Mandati On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // gestione tooltip
      // 
      {
        PAN_MANDATI.set_ToolTip(Glb.OBJ_FIELD,PFL_MANDATI_UFFICIO1,(new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_UFFICIO1))).stringValue()); 
        PAN_MANDATI.set_ToolTip(Glb.OBJ_FIELD,PFL_MANDATI_BOLLO,(new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_BOLLO))).stringValue()); 
        PAN_MANDATI.set_ToolTip(Glb.OBJ_FIELD,PFL_MANDATI_TIPOVINCOLO,(new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_TIPOVINCOLO))).stringValue()); 
        PAN_MANDATI.set_ToolTip(Glb.OBJ_FIELD,PFL_MANDATI_DESCRIZIONE1,(new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_DESCRIZIONE1))).stringValue()); 
        PAN_MANDATI.set_ToolTip(Glb.OBJ_FIELD,PFL_MANDATI_CAPITOLO1,(new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_CAPITOLO1))).stringValue()); 
        PAN_MANDATI.set_ToolTip(Glb.OBJ_FIELD,PFL_MANDATI_ARTICOLO1,(new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_ARTICOLO1))).stringValue()); 
        PAN_MANDATI.set_ToolTip(Glb.OBJ_FIELD,PFL_MANDATI_VOCECODESEXP,(new IDVariant(PAN_MANDATI.FieldText(PFL_MANDATI_VOCECODESEXP))).stringValue()); 
      }
      // 
      // gestione visualizzazione con layout form
      // 
      {
        if (IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ARTICOLO, 0).equals((new IDVariant(0)), true) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ARTICOLO, 0)))
        {
          PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati After Delete Event
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_MANDATI_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati After Delete Event Body
      // Procedure Body
      // 
      // PAN_MANDATI.set_Layout((new IDVariant(0)).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiAfterDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati After Insert Event
  // Evento notificato dopo il l'inserimento nel database
  // di una nuova riga del pannello.
  // **********************************************************************
  private void PAN_MANDATI_AfterInsert()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati After Insert Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiAfterInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati On Database Error Event
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
  private void PAN_MANDATI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_MANDATI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Mandati On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_MANDATI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_MANDATI.Status()).equals((new IDVariant(1)), true))
      {
        PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_NEWCOMMANS10+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0).equals((new IDVariant("SI")), true))
        {
          PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_NEWCOMMANS10+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if ((new IDVariant(PAN_MANDATI.Layout())).equals((new IDVariant(0)), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMENTI1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_VARIAZIONI2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SOSTITUZION3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA53+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          if (ANNULLVISIBI.booleanValue() || VARIAZVISIBI.booleanValue() || SOSTITVISIBI.booleanValue())
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMENTI1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLI3+BaseCmdLinIdx, ANNULLVISIBI.booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_VARIAZIONI2+BaseCmdLinIdx, VARIAZVISIBI.booleanValue());
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SOSTITUZION3+BaseCmdLinIdx, SOSTITVISIBI.booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA53+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          if (new IDVariant(PAN_MANDATI.Status()).equals((new IDVariant(3)), true))
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_MANDATI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati On Change Row Event Body
      // Procedure Body
      // 
      // 
      // gestione visibilit‡ dei comandi
      // 
      {
        if (PAN_MANDATI.IsNewRow())
        {
          PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          if (IMDB.Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0).equals((new IDVariant("SI")), true))
          {
            PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
          }
          else
          {
            PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Mandati On Change Layout Event
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout: E' un numero intero che rappresenta il nuovo layout che sta per essere applicato al pannello. Deve essere confrontato con i valori della lista LayoutValues (Form, List). - Input
  // Cancel: E' un parametro booleano di input/output che puÚ essere impostato a True per evitare che avvenga il cambio di layout. - Input/Output
  // **********************************************************************
  private void PAN_MANDATI_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Mandati On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(0)), true))
      {
        if (new IDVariant(PAN_MANDATI.Status()).compareTo((new IDVariant(1)), true)!=0)
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_NEWCOMMANS10+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA53+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMENTI1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLI3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_VARIAZIONI2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SOSTITUZION3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_NEWCOMMANS10+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        }
        if (IMDB.Value(IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMAPDAES, 0).equals((new IDVariant("SI")), true))
        {
          PAN_MANDATI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_MANDATI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
        PAN_MANDATI.SetCommandEnabled((new IDVariant(32)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_MANDATI.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(-1)).booleanValue()); 
        FieldEnable((new IDVariant(0)));
        // 
        // abilito i campi del pannello Filtri
        // 
        {
          PAN_FILTRIPANEL.set_Locked((new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_NEWCOMMANS10+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if (ANNULLVISIBI.booleanValue() || VARIAZVISIBI.booleanValue() || SOSTITVISIBI.booleanValue())
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_PAGAMENTI1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ANNULLI3+BaseCmdLinIdx, ANNULLVISIBI.booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_VARIAZIONI2+BaseCmdLinIdx, VARIAZVISIBI.booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SOSTITUZION3+BaseCmdLinIdx, SOSTITVISIBI.booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGGI72+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA53+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        if (new IDVariant(PAN_MANDATI.Status()).equals((new IDVariant(3)), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA3+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA3+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        SettaImporto();
        PAN_MANDATI.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_MANDATI.SetCommandEnabled((new IDVariant(32)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_MANDATI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_MANDATI.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
        if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(0)), true)>0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
        {
          FieldEnable((new IDVariant(-1)));
        }
        // 
        // disabilito filtri del pannello Filtri
        // 
        {
          PAN_FILTRIPANEL.set_Locked((new IDVariant(-1)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "MandatiOnChangeLayoutEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
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
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMIMPIVALAB, IDL.NullValue(IDL.ToString(PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_IMPORTOIVA)),(new IDVariant("0"))).stringValue());
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMIMPIVISLA, IDL.NullValue(IDL.ToString(PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_IMPORTIVAIST)),(new IDVariant("0"))).stringValue());
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_SOMMPAGALABE, IDL.NullValue(IDL.ToString(PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_PAGATO)),(new IDVariant("0"))).stringValue());
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
      MainFrm.ErrObj.ProcError ("Mandati", "LiquidazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
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
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_FINANZIAMENT,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_FINANZIAMENT))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_CGU,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_CGU))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_DESCRIZIONE,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_UFFICIO2,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_UFFICIO2))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_DISTINTECNIC,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_DISTINTECNIC))).stringValue()); 
      PAN_LIQUIDAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAZIONI_BENEFICIARIO,(new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_BENEFICIARIO))).stringValue()); 
      PAN_LIQUIDAZIONI.set_FieldText(PFL_LIQUIDAZIONI_QUIETANZA, (new IDVariant(PAN_LIQUIDAZIONI.FieldText(PFL_LIQUIDAZIONI_QUIETANZA))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "LiquidazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Field Enable
  // Enable:  - Input
  // **********************************************************************
  public int FieldEnable (IDVariant Enable)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Field Enable Body
      // Procedure Body
      // 
      // PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_MANDATO, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_DEL1, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_DISTINTA, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_DEL, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_PAGATO1, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_BOLLO, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_VOCEECON, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, (Enable.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, (Enable.booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      PAN_MANDATI.SetFlags (Glb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, (Enable.booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "FieldEnable", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Voce Econ
  // **********************************************************************
  public int ApriSceltaVoceEcon ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MYTITOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYCATEGORIA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYCODINTERVE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYCODTERZI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Voce Econ Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TITOLO as CAPTITOLO, ");
      SQL.append("  A.CATEGORIA as CAPCATEGORIA, ");
      SQL.append("  A.COD_INTERVENTO as CAPCODINTERV, ");
      SQL.append("  A.COD_TERZI as CAPCODTERZI ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_MYTITOLO = QV.Get("CAPTITOLO", IDVariant.INTEGER) ;
        v_MYCATEGORIA = QV.Get("CAPCATEGORIA", IDVariant.INTEGER) ;
        v_MYCODINTERVE = QV.Get("CAPCODINTERV", IDVariant.INTEGER) ;
        v_MYCODTERZI = QV.Get("CAPCODTERZI", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMTITOLO, 0, new IDVariant(v_MYTITOLO));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODINTE, 0, new IDVariant(v_MYCODINTERVE));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCATEGOR, 0, new IDVariant(v_MYCATEGORIA));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODTERZ, 0, new IDVariant(v_MYCODTERZI));
      MainFrm.Show(MyGlb.FRM_SCEVOCECCOFI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriSceltaVoceEcon", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlla Vincoli
  // controlli da fare prima di registrazione  una cancellazione
  // o di un aggiornamento. Se ritorna true significa che
  // l'operazione puÚ essere eseguita (eventualmente viene
  // mostra una finestra pop-up) altrimenti ritorna false
  // 
  // Update: sei i controlli riguardano l'update Ë true, altrimenti il controllo riguarda il delete - Input
  // Ord Collegati:  - Input
  // **********************************************************************
  public boolean ControllaVincoli (IDVariant Update, IDVariant OrdCollegati)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ESISTE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_LICENZA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG0 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_LICENZA = (new IDVariant("MIF", IDVariant.STRING));
      v_MSG1 = (new IDVariant("Mandato gi‡ trasmesso al tesoriere.", IDVariant.STRING));
      v_MSG2 = (new IDVariant("Mandato in Distinta.", IDVariant.STRING));
      // 
      // Controlla Vincoli Body
      // Procedure Body
      // 
      IDVariant v_CONCLUDELETE = new IDVariant(0,IDVariant.STRING);
      v_CONCLUDELETE = (new IDVariant("<BR/>Si conferma la cancellazione?"));
      IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
      v_MSG3 = (new IDVariant("Mandato collegato a ordinativo per compensazione"));
      IDVariant v_MSG6 = new IDVariant(0,IDVariant.STRING);
      v_MSG6 = (new IDVariant("Sono presenti Ordinativi collegati al Mandato."));
      v_ESISTE = (new IDVariant(MainFrm.FunzioneLicenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), v_LICENZA)));
      v_MSG0 = (new IDVariant());
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_D_DATA_ELENCO, 0))))
      {
        if (IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_D_DATA_MAND, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_D_DATA_ELENCO, 0), true)>0)
        {
          MainFrm.set_AlertMessage((new IDVariant("Data mandato superiore alla data della distinta"))); 
          return (new IDVariant(0)).booleanValue();
        }
      }
      if (v_ESISTE.booleanValue())
      {
        IDVariant v_NCOUMANDINVI = new IDVariant(0,IDVariant.INTEGER);
        // 
        // controollo se il mandato Ë gi‡ stato inviato
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  MAN_INF_STATO A ");
          SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NCOUMANDINVI = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NCOUMANDINVI.compareTo((new IDVariant(0)), true)>0)
          {
            v_MSG0 = IDL.Add(v_MSG0, v_MSG1);
          }
        }
      }
      // 
      // controllo se il mandato Ë stato incluso in distinta
      // 
      {
        IDVariant v_MYNUMEROELEN = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_MYANNOELENCO = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.NUMERO_ELENCO as MANNUMERELEN, ");
        SQL.append("  A.ANNO_ELENCO as MANANNOELENC ");
        SQL.append("from ");
        SQL.append("  MAN A ");
        SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_MYNUMEROELEN = QV.Get("MANNUMERELEN", IDVariant.INTEGER) ;
          v_MYANNOELENCO = QV.Get("MANANNOELENC", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_MYNUMEROELEN) && IDL.IsNull(v_MYANNOELENCO)))
        {
          v_MSG0 = IDL.Add(IDL.Add(v_MSG0, (new IDVariant("<BR/>"))), v_MSG2);
        }
      }
      // 
      // controllo mandato collegato con ordinativo commutazione
      // 
      {
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        if (!(Update.booleanValue()))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  MAN_ORD_COMPENSAZIONE A ");
          SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
          {
            v_MSG0 = IDL.Add(IDL.Add(v_MSG0, (new IDVariant("<BR/>"))), v_MSG3);
          }
        }
      }
      // 
      // Ordinativi collegati al Mandato
      // 
      {
        if (OrdCollegati.compareTo((new IDVariant(0)), true)>0)
        {
          v_MSG0 = IDL.Add(IDL.Add(v_MSG0, (new IDVariant("<BR/>"))), v_MSG6);
        }
      }
      if (!(IDL.IsNull(v_MSG0)))
      {
        IDVariant v_CONCLUSIONEU = new IDVariant(0,IDVariant.STRING);
        v_CONCLUSIONEU = (new IDVariant("<BR/>Si confermano le modifiche?", IDVariant.STRING));
        if (Update.booleanValue())
        {
          v_MSG0 = IDL.Add(IDL.Add(v_MSG0, (new IDVariant("<BR/>"))), v_CONCLUSIONEU);
        }
        else
        {
          v_MSG0 = IDL.Add(IDL.Add(v_MSG0, (new IDVariant("<BR/>"))), v_CONCLUDELETE);
        }
        if (MainFrm.MessageConfirm(v_MSG0))
        {
          return (new IDVariant(-1)).booleanValue();
        }
        else
        {
          return (new IDVariant(0)).booleanValue();
        }
      }
      else
      {
        if (Update.booleanValue())
        {
          return (new IDVariant(-1)).booleanValue();
        }
        else
        {
          if (MainFrm.MessageConfirm(v_CONCLUDELETE))
          {
            return (new IDVariant(-1)).booleanValue();
          }
          else
          {
            return (new IDVariant(0)).booleanValue();
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ControllaVincoli", _e);
      return false;
    }
  }

  // **********************************************************************
  // Apri Form Pagamenti
  // **********************************************************************
  public int ApriFormPagamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Gestione Movimenti non ammessa !", IDVariant.STRING));
      // 
      // Apri Form Pagamenti Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        // MainFrm.set_AlertMessage(v_MSG); 
        // return 0;
        IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ROWNAMEINFO, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ROWNAMEINFO, 0, (new IDVariant()));
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_NUMERO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_ANNO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_D_DATA_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_D_DATA_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAM1, IMDBDef5.FLD_PARAMEPAGAM1_IMPORTO, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_IMPORTO, 0));
      MainFrm.Show(MyGlb.FRM_PAGAMEMANDAT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriFormPagamenti", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriInfoVociBilancio", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_BENEFICIARIO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_RECORDCODIC1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI237, IMDBDef1.FLD_PARAMETRI237_NUM_QUIETANZA, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_NUM_QUIETANZA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_INFOQUIETANZ,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOQUIETANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriInfoQuietanza", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_IMP, 0));
      }
      if (IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
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
      MainFrm.ErrObj.ProcError ("Mandati", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazione
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liquidazione Body
      // Procedure Body
      // 
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_ANNO_LIQ, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_NUMERO_LIQ, 0));
        MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_ANNO_LIQ, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_NUMERO_LIQ, 0));
        MainFrm.Show(MyGlb.FRM_LIQUIDAZIONE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importo
  // **********************************************************************
  public int SettaImporto ()
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
      // Setta Importo Body
      // Procedure Body
      // 
      PAN_MANDATI.set_FieldText(PFL_MANDATI_IMPORTOLABEL, IDL.Add(v_IMPORTO, IDL.Format(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_IMPORTO, 0),(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "SettaImporto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva Mandati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SalvaMandati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Salva Mandati Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_MANDATI.Status()).equals((new IDVariant(3)), true))
      {
        // 
        // se non viene confermata l'operazione
        // 
        if (ControllaVincoli((new IDVariant(-1)), (new IDVariant(0))))
        {
          PAN_MANDATI.PanelCommand(Glb.PCM_UPDATE);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "SalvaMandati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Delete Mandati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DeleteMandati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Delete Mandati Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_ORDINACOLLEG = new IDVariant(0,IDVariant.STRING);
      IDVariant v_SULLORDINATI = new IDVariant(0,IDVariant.STRING);
      v_SULLORDINATI = (new IDVariant("Sull'ordinativo "));
      IDVariant v_SUGLIORDINAT = new IDVariant(0,IDVariant.STRING);
      v_SUGLIORDINAT = (new IDVariant("Sugli ordinativi "));
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
      v_AVVISO1 = (new IDVariant(" deve essere corretto manualmente il riferimento al mandato eliminato."));
      v_VCOUNT = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_ORD as ANNOORD, ");
      SQL.append("  A.NUMERO_ORD as NUMEROORD ");
      SQL.append("from ");
      SQL.append("  VISTA_MAN_ORD_COLLEGATI A ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.MOTIVO <> 'Compensazione') ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        v_VCOUNT = IDL.Add(v_VCOUNT, (new IDVariant(1)));
        v_ORDINACOLLEG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ORDINACOLLEG, IDL.ToString(C2.Get("NUMEROORD"))), (new IDVariant("/"))), IDL.ToString(C2.Get("ANNOORD"))), (new IDVariant(" ")));
        C2.MoveNext();
      }
      C2.Close();
      // 
      // se non viene confermata l'operazione
      // 
      if (ControllaVincoli((new IDVariant(0)), v_VCOUNT))
      {
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          SQL = new StringBuffer();
          SQL.append("update MAN set ");
          SQL.append("  SALTA_CONTROLLO_ORD = 'SI' ");
          SQL.append("where (ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        try
        {
          SQL = new StringBuffer();
          SQL.append("delete from MAN ");
          SQL.append("where (ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e6)
        {
          MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
          SQL = new StringBuffer();
          SQL.append("update MAN set ");
          SQL.append("  SALTA_CONTROLLO_ORD = NULL ");
          SQL.append("where (ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          return 0;
        }
        PAN_MANDATI.PanelCommand(Glb.PCM_REQUERY);
        PAN_MANDATI.set_Layout((new IDVariant(0)).intValue());
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          if (v_VCOUNT.equals((new IDVariant(1)), true))
          {
            v_AVVISO = new IDVariant(v_SULLORDINATI);
          }
          else
          {
            v_AVVISO = new IDVariant(v_SUGLIORDINAT);
          }
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_AVVISO, v_ORDINACOLLEG), v_AVVISO1)); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "DeleteMandati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Annulli
  // **********************************************************************
  public int ApriAnnulli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Annulli Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE2, IMDBDef6.FLD_FILTRITABLE2_ANNO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE2, IMDBDef6.FLD_FILTRITABLE2_NUMERO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0));
      MainFrm.Show(MyGlb.FRM_ANNULLMANDAT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriAnnulli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni
  // **********************************************************************
  public int ApriVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE3, IMDBDef6.FLD_FILTRITABLE3_ANNO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE3, IMDBDef6.FLD_FILTRITABLE3_NUMERO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0));
      MainFrm.Show(MyGlb.FRM_VARIAZMANDAT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Sostituzioni
  // **********************************************************************
  public int ApriSostituzioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Sostituzioni Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_ANNO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef6.TBL_FILTRITABLE4, IMDBDef6.FLD_FILTRITABLE4_NUMERO_MAND, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0));
      MainFrm.Show(MyGlb.FRM_SOSTITMANDAT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "ApriSostituzioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Funzioni Aggiuntive
  // **********************************************************************
  public int Visibilit‡FunzioniAggiuntive ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Funzioni Aggiuntive Body
      // Corpo Procedura
      // 
      if (MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))) && IDL.NullValue(MainFrm.DATA_INIZIO_MAND_INF,(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))).compareTo(IDL.Today(), true)<=0)
      {
        if (MainFrm.GESTIONE_ANNULLI.equals((new IDVariant("SI")), true))
        {
          ANNULLVISIBI = (new IDVariant(-1));
        }
        else
        {
          ANNULLVISIBI = (new IDVariant(0));
        }
        if (MainFrm.GESTIONE_VARIAZIONI.equals((new IDVariant("SI")), true))
        {
          VARIAZVISIBI = (new IDVariant(-1));
        }
        else
        {
          VARIAZVISIBI = (new IDVariant(0));
        }
        if (MainFrm.GESTIONE_SOSTITUZIONI.equals((new IDVariant("SI")), true))
        {
          SOSTITVISIBI = (new IDVariant(-1));
        }
        else
        {
          SOSTITVISIBI = (new IDVariant(0));
        }
      }
      else
      {
        ANNULLVISIBI = (new IDVariant(0));
        VARIAZVISIBI = (new IDVariant(0));
        SOSTITVISIBI = (new IDVariant(0));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "Visibilit‡FunzioniAggiuntive", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Liq
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoLiq ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Liq Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_ANNO_LIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_NUMERO_LIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "InfoLiq", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_RECLIQFAANPR, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ17, IMDBDef14.PQSL_LIQ17_RECLIQFANUPR, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ordinativi Collegati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int OrdinativiCollegati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Collegati Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPANNMA, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_ANNO_MAND, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARS, IMDBDef5.FLD_PARS_NOMOGGPNUMMA, 0, IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_NUMERO_MAND, 0));
      MainFrm.Show(MyGlb.FRM_ORDINACOLLEG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Mandati", "OrdinativiCollegati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri
  // Primary record source for panel data
  // **********************************************************************
  private void MANDATI_FILTRI2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_FILTRI2_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_FILTRI6, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_FILTRI6, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_FILTRI2_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_FILTRI2_RS, 0, IMDBDef5.TBL_FILTRI6, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 0, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMNUMDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 1, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMENUMAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 2, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 3, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 4, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMNUMLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 5, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMANNLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 6, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_ROWNAMEMANDA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_FILTRI2_RS, 7, 0, IMDBDef5.TBL_FILTRI6, IMDBDef5.FLD_FILTRI6_RONANOININFL, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_FILTRI6, 0);
      if (IMDB.Eof(IMDBDef5.TBL_FILTRI6, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_FILTRI6, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_FILTRI2_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FILTRIPANEL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRIPANEL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRIPANEL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRIPANEL, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRIPANEL_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRIPANEL);
    // Stub
  }

  private void PAN_FILTRIPANEL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRIPANEL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRIPANEL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRIPANEL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANDATI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANDATI, Cancel);
    // Stub
  }

  private void PAN_MANDATI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_MANDATI_VOCEECON)
    {
      this.IdxPanelActived = this.PAN_MANDATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaVoceEcon();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MANDATI_APRIINFOLABE)
    {
      this.IdxPanelActived = this.PAN_MANDATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_MANDATI_APRINFIMPLAB)
    {
      this.IdxPanelActived = this.PAN_MANDATI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_MANDATI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_MANDATI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_MANDATI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_MAN7, IMDBDef14.PQSL_MAN7_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_MANDATI_IntValidateRow(Cancel);
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
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_APRILIQUEXPR)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriLiquidazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFOLIQ)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoLiq();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAZIONI_INFODOC)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
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
  private void PAN_FILTRIPANEL_Init()
  {

    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, "00ADF5D3-8198-4C11-8EB2-222BD3CF66A6");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, "Liquidazione");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, MyGlb.PANEL_FORM, 404, 3, 200, 41, 0, 0);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, 0, 70);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, 1, 13);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, 0, 4);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, 1, 4);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_LIQUIDAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, "0CC6729B-2404-4BEC-A49F-46CB2C6E4602");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, "Mandati");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, MyGlb.PANEL_FORM, 608, 3, 200, 41, 0, 0);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, 0, 46);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, 1, 13);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, 0, 4);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, 1, 4);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, "DFE03DB6-2716-42B8-95EF-B5369B242B5B");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, "Numero");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, MyGlb.PANEL_FORM, 4, 3, 164, 41, 0, 0);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, 0, 44);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, 1, 13);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, 0, 4);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, 1, 4);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, "C8F7DF27-2060-45CB-856E-23A94473AAA3");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, "Data");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, MyGlb.PANEL_FORM, 172, 3, 228, 41, 0, 0);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, 0, 27);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, 1, 13);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, 0, 4);
    PAN_FILTRIPANEL.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, 1, 4);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRIPANEL_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, "3EC1F62E-5CF5-4793-9EFC-797B4EC5FA0A");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, "8A200A62-34E3-44F7-BECE-C7DC6773BBA6");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, "3DC19455-9FB6-4244-AFE4-5133045B8964");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, "C049A0F3-8196-433E-A649-666B7F8F3EC9");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, "9C399231-7D60-4830-AE40-8E1CB00C5230");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, "49E2E43E-E54C-4B41-AB51-59066BCF2C45");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, "8DB198E5-2B59-442A-9CDC-9EB7EC3A4651");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, "7A3535D6-300B-4131-8B95-A79CB1522D8B");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, "704A5C16-FE30-4CF7-AF1A-ABEE8753BC3D");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, "Dal");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, "259125C9-A9FE-4D53-9323-08987166C010");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, "Al");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, "AF8446B1-56F5-4017-A300-200A0183583B");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, "Dal  ");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, "2DF0FDD6-3E36-4338-8D63-F39DC2654A9E");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, "Al  ");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, "5CC5029D-4B74-47CB-9CC2-0E0988829DEA");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, "Numero");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, "E66D55EB-CBDC-4CEB-9946-8ADF8731B501");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, "Anno");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, "A21AE0F9-E997-4F45-9E6C-547E65C32968");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, "Mandati");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, "DF66DE02-D88C-43B4-9F19-CC70DECF4D93");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, "Non in Flusso");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRIPANEL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, MyGlb.PANEL_LIST, 536, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, MyGlb.PANEL_FORM, 588, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELLAB1, -1, GRP_FILTRIPANEL_LIQUIDAZIONE);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, MyGlb.PANEL_LIST, 444, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, MyGlb.PANEL_FORM, 408, 28, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELABE2, -1, GRP_FILTRIPANEL_LIQUIDAZIONE);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, MyGlb.PANEL_LIST, 784, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, MyGlb.PANEL_FORM, 612, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB2, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELLAB2, -1, GRP_FILTRIPANEL_MANDATI);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELLAB2, -1, "", "NEWPANELLAB2", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, MyGlb.PANEL_LIST, 816, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, MyGlb.PANEL_FORM, 792, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELABE3, -1, GRP_FILTRIPANEL_MANDATI);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, MyGlb.PANEL_LIST, 84, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, MyGlb.PANEL_FORM, 8, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB3, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELLAB3, -1, GRP_FILTRIPANEL_NUMERO);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELLAB3, -1, "", "NEWPANELLAB3", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, MyGlb.PANEL_LIST, 116, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, MyGlb.PANEL_FORM, 152, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE4, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELABE4, -1, GRP_FILTRIPANEL_NUMERO);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELABE4, -1, "", "NEWPANELABE4", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, MyGlb.PANEL_LIST, 240, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, MyGlb.PANEL_FORM, 176, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELLAB4, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELLAB4, -1, GRP_FILTRIPANEL_DATA);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELLAB4, -1, "", "NEWPANELLAB4", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, MyGlb.PANEL_LIST, 292, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, MyGlb.PANEL_FORM, 384, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NEWPANELABE5, -1, GRP_FILTRIPANEL_DATA);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_LIST, 4, 4, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_LIST, 64);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_FORM, 24, 20, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_DAL1, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_DAL1, PPQRY_FILTRI2, "A.ROWNAMNUMDAL", "ROWNAMNUMDAL", 1, 5, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_LIST, 68, 4, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_LIST, 60);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_FORM, 100, 20, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_FORM, 20);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_AL1, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_AL1, PPQRY_FILTRI2, "A.ROWNAMENUMAL", "ROWNAMENUMAL", 1, 5, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_LIST, 0, 0, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_LIST, 52);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_LIST, "Dal  ");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_FORM, 184, 20, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_FORM, 28);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_DAL, MyGlb.PANEL_FORM, "Dal  ");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_DAL, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_DAL, PPQRY_FILTRI2, "A.ROWNAMDATDAL", "ROWNAMDATDAL", 6, 14, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_LIST, 0, 0, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_LIST, 44);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_LIST, "Al  ");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_FORM, 296, 20, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_FORM, 20);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_AL, MyGlb.PANEL_FORM, "Al  ");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_AL, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_AL, PPQRY_FILTRI2, "A.ROWNAMEDATAL", "ROWNAMEDATAL", 6, 14, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_LIST, 0, 0, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_LIST, 108);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_FORM, 412, 20, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_FORM, 52);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NUMERO, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NUMERO, PPQRY_FILTRI2, "A.ROWNAMNUMLIQ", "ROWNAMNUMLIQ", 1, 5, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_LIST, 0, 0, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_LIST, 96);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_FORM, 516, 20, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_ANNO, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_ANNO, PPQRY_FILTRI2, "A.ROWNAMANNLIQ", "ROWNAMANNLIQ", 1, 5, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_LIST, 0, 0, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_LIST, 48);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_FORM, 616, 20, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_FORM, 48);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_MANDATI, MyGlb.PANEL_FORM, "Mand.");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_MANDATI, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_MANDATI, PPQRY_FILTRI2, "A.ROWNAMEMANDA", "ROWNAMEMANDA", 1, 1, 0, -13997);
    PAN_FILTRIPANEL.SetValueListItem(PFL_FILTRIPANEL_MANDATI, (new IDVariant(1)), "Pagati", "", "", -1);
    PAN_FILTRIPANEL.SetValueListItem(PFL_FILTRIPANEL_MANDATI, (new IDVariant(0)), "Non Pagati", "", "", -1);
    PAN_FILTRIPANEL.SetValueListItem(PFL_FILTRIPANEL_MANDATI, (new IDVariant(3)), "Tutti", "", "", -1);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_LIST, 0, 0, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_LIST, 128);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_LIST, "Non in Flusso");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_FORM, 816, 20, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_FORM, 80);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_NONINSEINFLU, MyGlb.PANEL_FORM, "Non in Flusso");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_NONINSEINFLU, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_NONINSEINFLU, PPQRY_FILTRI2, "A.RONANOININFL", "RONANOININFL", 5, 2, 0, -13997);
    PAN_FILTRIPANEL.SetValueListItem(PFL_FILTRIPANEL_NONINSEINFLU, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_FILTRIPANEL.SetValueListItem(PFL_FILTRIPANEL_NONINSEINFLU, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_FILTRIPANEL_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTRIPANEL.SetIMDB(IMDB, "PQRY_FILTRI2", true);
    PAN_FILTRIPANEL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTRIPANEL.SetQueryIMDB(PPQRY_FILTRI2, IMDBDef14.PQRY_FILTRI2_RS, IMDBDef5.TBL_FILTRI6);
    JustLoaded = true;
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_DAL1, IMDBDef5.FLD_FILTRI6_ROWNAMNUMDAL);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_AL1, IMDBDef5.FLD_FILTRI6_ROWNAMENUMAL);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_DAL, IMDBDef5.FLD_FILTRI6_ROWNAMDATDAL);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_AL, IMDBDef5.FLD_FILTRI6_ROWNAMEDATAL);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_NUMERO, IMDBDef5.FLD_FILTRI6_ROWNAMNUMLIQ);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_ANNO, IMDBDef5.FLD_FILTRI6_ROWNAMANNLIQ);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_MANDATI, IMDBDef5.FLD_FILTRI6_ROWNAMEMANDA);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_NONINSEINFLU, IMDBDef5.FLD_FILTRI6_RONANOININFL);
    PAN_FILTRIPANEL.SetMasterTable(0, "FILTRI6");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_FILTRIPANEL.Status() == 2)
    {
      int oldListQBE = PAN_FILTRIPANEL.iUseListQBE;
      PAN_FILTRIPANEL.iUseListQBE = 0;
      PAN_FILTRIPANEL.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRIPANEL.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRIPANEL.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_MANDATI_Init()
  {

    PAN_MANDATI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANDATI.SetSize(MyGlb.OBJ_GROUP, 7);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, "C0AC2D8F-A593-41B2-B3AC-2A5186A4CB4C");
    PAN_MANDATI.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, "Mandato");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, MyGlb.PANEL_FORM, 24, 3, 264, 49, 0, 0);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, 0, 50);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, 1, 13);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, 0, 4);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, 1, 4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATI_MANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, "93306BC3-3583-4755-AF27-76756EC0121A");
    PAN_MANDATI.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, "Distinta");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, MyGlb.PANEL_LIST, 180, -9999, 100, 16, 0, 0);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, MyGlb.PANEL_FORM, 292, 3, 304, 49, 0, 0);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, 0, 44);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, 1, 13);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, 0, 4);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, 1, 4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATI_DISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, "C766FDA1-5DC5-4E9C-AE0A-86EE00C1EB41");
    PAN_MANDATI.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, "Capitolo Art.");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, MyGlb.PANEL_FORM, 24, 111, 572, 77, 0, 0);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, 0, 70);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, 1, 13);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, 0, 4);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, 1, 4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATI_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, "928E6EBE-CFA9-4667-BC7F-0ABEF4940C17");
    PAN_MANDATI.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, "Impegno");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, MyGlb.PANEL_LIST, 964, -9999, 92, 16, 0, 0);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, MyGlb.PANEL_FORM, 24, 55, 572, 53, 0, 0);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, 0, 51);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, 1, 13);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, 0, 4);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, 1, 4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATI_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, "9154E569-0392-42F7-9A41-FB67D1D8EA83");
    PAN_MANDATI.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, "Inserimento");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, "Inserimento");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, 0, 70);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, 1, 13);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, 0, 1);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, 1, 4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATI_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, "6FCD6B42-A9F7-4DB5-B6D6-27A2B16270E1");
    PAN_MANDATI.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, "Aggiornamento");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, 0, 88);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, 1, 13);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, 0, 1);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, 1, 4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATI_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, "86886594-1864-44A4-B093-4A7A1337F1DC");
    PAN_MANDATI.set_Header(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, "Nuovo Gruppo");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_MANDATI.SetRect(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, 0, 79);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, 1, 13);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, 0, 4);
    PAN_MANDATI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, 1, 4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_GROUP, GRP_MANDATI_NUOVOGRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_MANDATI.SetSize(MyGlb.OBJ_FIELD, 40);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, "D92174C7-4C85-4627-A77B-327B63362122");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, "Mandato");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_MANDATO, 0, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_MANDATO, 0, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, "9DBC49D1-E5B8-4EE1-9BBD-DBA8EA8867EC");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, "Del");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DEL1, 1, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DEL1, 1, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, "5DF013B4-738A-4FAE-96CF-A7D7B8DA9A2A");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELLAB5, 17, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELLAB5, 2, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, "8DCE9A54-D349-47EB-AA15-017899F9CD7A");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, "Importo");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_IMPORTO1, 18, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_IMPORTO1, 3, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, "24FAF111-9F66-4800-8FB7-9855AB48A9EA");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, "Distinta");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DISTINTA, 2, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DISTINTA, 4, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, "6635D326-FC8A-473E-918C-3C4B0D7AAB85");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, "Del ");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DEL, 3, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DEL, 5, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, "7F388D7F-1172-4189-968A-D415DDAAC77F");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELABE6, 19, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELABE6, 6, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, "EC74E5F8-965F-4F48-8C9B-F94C0A54DED7");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, "Pagato");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_PAGATO1, 20, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_PAGATO1, 7, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, "A972CA9C-BA27-4245-9721-C2097FB676BB");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, "Ufficio");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_UFFICIO1, 13, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_UFFICIO1, 8, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, "A4D5265F-88BB-4791-B0C0-47C88DCE1645");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, "Bollo");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, "t60 descrizione");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_BOLLO, 15, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_BOLLO, 9, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, "3673DB31-1382-40B4-AB31-F85EC273B47F");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, "Tipo Vincolo");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_TIPOVINCOLO, 14, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_TIPOVINCOLO, 10, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, "E104AE4A-8EAB-4B01-929A-55877BA47511");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, "Voce Econ.");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VOCEECON, 11, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VOCEECON, 11, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, "2F2E0138-6DF2-4F00-BD93-25789A8020B0");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, "VOCI ECONOMICHE Descrizione Expression");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VOCECODESEXP, 12, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VOCECODESEXP, 27, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, "4DF20D4A-E516-4BBA-8669-1B4ED14FE1E9");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELABE7, 21, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELABE7, 12, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, "9820CB5E-915B-41E6-8502-76430D3B425C");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, "Capitolo");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, "A GET DESCRIZIONE CAP (Sessione Esercizio, S, Record INTERVENTO [Mandati - Mandati], Record MAN CAPITOLO [Mandati - Mandati], ZERO)");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_CAPITOLO1, 9, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_CAPITOLO1, 13, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, "339FE880-D7FC-4866-B863-841EF32206DB");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, " Articolo");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, "A GET DESCRIZIONE CAP (Sessione Esercizio, S, Record INTERVENTO [Mandati - Mandati], Record MAN CAPITOLO [Mandati - Mandati], Record MAN ARTICOLO [Mandati - Mandati])");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ARTICOLO1, 10, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ARTICOLO1, 14, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, "9101462C-2CD2-4B1A-BEC5-BF70E0574B28");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, "Capitolo");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.VIS_NOFIINLUHLNB);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_CAPITOLO, 7, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_CAPITOLO, 15, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, "54E1F62D-F58F-40F1-A01F-5B5E52021DF3");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, " ");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ARTICOLO, 8, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ARTICOLO, 16, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, "24289A28-08A4-40D7-9E6D-0BC657665492");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELLAB6, 22, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELLAB6, 17, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, "CBA95A96-BBE7-47E9-AF1B-9CA9F0437516");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, "Numero");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NUMEROIMP, 4, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NUMEROIMP, 19, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, "FB0E1B53-9910-4E3A-B257-512818C69971");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, "Anno");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ANNOIMP, 5, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ANNOIMP, 20, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, "13CEEAED-B2B4-46C0-B334-9CB126D85185");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELABE1, 23, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELABE1, 18, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, "22E377A0-0FD3-4193-836E-082DC9F6ED01");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, "-");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_TRATTINLABEL, 24, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_TRATTINLABEL, 21, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, "D071456D-3976-47F4-A137-A255042FD666");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, MyGlb.VIS_STATICBUTTON);
    PAN_MANDATI.SetImage(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, 0, "info.gif", false);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_APRIINFOLABE, 25, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_APRIINFOLABE, 22, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, "4AA36757-5A5A-4F3F-9959-6DFE3A60FB8B");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, MyGlb.VIS_STATICBUTTON);
    PAN_MANDATI.SetImage(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, 0, "info.gif", false);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_APRINFIMPLAB, 26, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_APRINFIMPLAB, 23, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, "DBC40CF1-3262-4576-983A-711EAA105B2A");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, "/");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_SLASHLABEL, 27, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_SLASHLABEL, 24, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, "6841944E-986F-4F57-B75B-EB4E0B9CDC35");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, "Vincoli Descrizione Expression");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VINCDESCEXPR, 32, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VINCDESCEXPR, 32, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, "6F80538A-44D6-4C76-BC9F-FA2FE0818C1D");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, "ANNO MAND");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ANNOMAND, 33, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_ANNOMAND, 33, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, "F1919479-8444-4FED-87BA-389A67592E5B");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, "Mandato");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_MANDATOLABEL, 28, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_MANDATOLABEL, 25, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, "4404667F-8801-4BF4-8904-5B7C2537EA18");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, "Distinta");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DISTINTLABEL, 29, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DISTINTLABEL, 26, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, "D34B8FCC-60F5-4FE9-888C-E3F2AF0DBAD3");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, "Utente");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_UTENTE1, 34, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_UTENTE1, 34, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, "E9017E69-5520-4950-ABE1-95F86BA79C5C");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, "Data ");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DATA1, 35, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DATA1, 35, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, "A5CEAEF3-8E1B-450A-A791-645E06BA892B");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, "Utente");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_UTENTE, 36, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_UTENTE, 36, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, "B97D9FF0-5F13-4A06-A18C-D884A12D48F2");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, "Data");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DATA, 37, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DATA, 37, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, "11CAB733-CF2E-4A5E-BE3F-F8FB6B6090F1");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, "Text to show here");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, 0, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELLABE, 38, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_NEWPANELLABE, 38, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, "8DE6EB5E-55F7-4F49-BA51-D1185933CF6D");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, "Valuta");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VALUTA, 16, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_VALUTA, 28, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, "9B67B1FB-4D51-4157-9AB6-401D155EB5A5");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_IMPORTOLABEL, 30, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_IMPORTOLABEL, 29, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, "2E2DF723-77CE-43F9-B785-A8FEF4CD8A94");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, "Dettagli Mandato");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DETTAGMANDAT, 39, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DETTAGMANDAT, 39, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, "C08ED205-D772-49C4-8AB6-03A9E9301EB0");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, "Descrizione");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, "");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.VIS_VISULOOUPCF4);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DESCRIZIONE1, 6, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_DESCRIZIONE1, 30, MyGlb.PANEL_LIST);
    PAN_MANDATI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, "F8EB0776-6E14-4F0B-921D-AFD4DA385F35");
    PAN_MANDATI.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, "Mandato a Copertura");
    PAN_MANDATI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, "Mandato a Copertura");
    PAN_MANDATI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.VIS_CHECKSTYLE);
    PAN_MANDATI.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_COPERTURA, 31, MyGlb.PANEL_FORM);
    PAN_MANDATI.SetTabOrder(PFL_MANDATI_COPERTURA, 31, MyGlb.PANEL_LIST);
  }

  private void PAN_MANDATI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_LIST, 84);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_LIST, "Mand.");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_FORM, 28, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_FORM, 68);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATO, MyGlb.PANEL_FORM, "Mandato");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_MANDATO, -1, GRP_MANDATI_MANDATO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_MANDATO, PPQRY_MAN7, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_LIST, 40, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_LIST, 80);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_LIST, "Del");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_FORM, 144, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_FORM, 36);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL1, MyGlb.PANEL_FORM, "Del");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DEL1, -1, GRP_MANDATI_MANDATO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DEL1, PPQRY_MAN7, "A.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, MyGlb.PANEL_LIST, 208, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, MyGlb.PANEL_FORM, 272, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB5, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NEWPANELLAB5, -1, GRP_MANDATI_MANDATO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NEWPANELLAB5, -1, "", "NEWPANELLAB5", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_LIST, 100, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_FORM, 588, 108, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_FORM, 48);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTO1, MyGlb.PANEL_FORM, "Imp.");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_IMPORTO1, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_IMPORTO1, PPQRY_MAN7, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_LIST, 180, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_LIST, "Dist.");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_FORM, 296, 28, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_FORM, 84);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTA, MyGlb.PANEL_FORM, "Distinta");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DISTINTA, -1, GRP_MANDATI_DISTINTA);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DISTINTA, PPQRY_MAN7, "A.NUMERO_ELENCO", "NUMERO_ELENCO", 1, 5, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_LIST, 220, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_LIST, 88);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_LIST, "Del ");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_FORM, 452, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_FORM, 28);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DEL, MyGlb.PANEL_FORM, "Del ");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DEL, -1, GRP_MANDATI_DISTINTA);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DEL, PPQRY_MAN7, "A.D_DATA_ELENCO", "D_DATA_ELENCO", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, MyGlb.PANEL_LIST, 216, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, MyGlb.PANEL_FORM, 580, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE6, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NEWPANELABE6, -1, GRP_MANDATI_DISTINTA);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NEWPANELABE6, -1, "", "NEWPANELABE6", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_LIST, 280, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_LIST, 52);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_LIST, "Pagato");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_FORM, 236, 332, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_FORM, 52);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_PAGATO1, MyGlb.PANEL_FORM, "Pagato");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_PAGATO1, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_PAGATO1, PPQRY_MAN7, "A.PAGATO", "PAGATO", 3, 14, 2, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_LIST, 360, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_LIST, 52);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_LIST, "Ufficio");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_FORM, 48, 216, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_FORM, 48);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UFFICIO1, MyGlb.PANEL_FORM, "Ufficio");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_UFFICIO1, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_UFFICIO1, PPQRY_MAN7, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_LIST, 488, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_LIST, 84);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_FORM, 56, 240, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_BOLLO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_BOLLO, PPQRY_MAN7, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_LIST, 628, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_FORM, 280, 216, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_TIPOVINCOLO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_TIPOVINCOLO, PPQRY_MAN7, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_LIST, 768, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_LIST, "Voce Econ.");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_FORM, 28, 192, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCEECON, MyGlb.PANEL_FORM, "Voce Econ.");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_VOCEECON, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_VOCEECON, PPQRY_MAN7, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_LIST, 1188, 68, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_LIST, 216);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_LIST, "VOCI ECONOMICHE Descrizione Expression");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_FORM, 144, 192, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_FORM, 216);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VOCECODESEXP, MyGlb.PANEL_FORM, "VC. ECONOM. Descrizione Expression");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_VOCECODESEXP, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_VOCECODESEXP, PPQRY_VOCIECONOMI1, "DECODE(A.DESCRIZIONE, '', '', A.DESCRIZIONE)", "VOCECODESEXP", 5, 99, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, MyGlb.PANEL_LIST, 244, 148, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, MyGlb.PANEL_FORM, 28, 136, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE7, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NEWPANELABE7, -1, GRP_MANDATI_CAPITOLOART);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NEWPANELABE7, -1, "", "NEWPANELABE7", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_LIST, 1000, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_LIST, 160);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_FORM, 44, 140, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_FORM, 56);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_CAPITOLO1, -1, GRP_MANDATI_CAPITOLOART);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_CAPITOLO1, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0)", "ROWNAMDESCAP", 5, 99, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 264, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_LIST, 156);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_LIST, " Articolo");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_FORM, 48, 164, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_FORM, 52);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_ARTICOLO1, -1, GRP_MANDATI_CAPITOLOART);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_ARTICOLO1, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~)", "ROWNAMDESART", 5, 99, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_LIST, 808, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_FORM, 104, 116, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_CAPITOLO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_CAPITOLO, PPQRY_MAN7, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MANDATI.set_Alignment(PFL_MANDATI_CAPITOLO, 2);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_LIST, 940, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_LIST, " ");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_FORM, 248, 116, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ARTICOLO, MyGlb.PANEL_FORM, " ");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_ARTICOLO, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_ARTICOLO, PPQRY_MAN7, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, MyGlb.PANEL_LIST, 236, 140, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, MyGlb.PANEL_FORM, 28, 92, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLAB6, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NEWPANELLAB6, -1, GRP_MANDATI_IMPEGNO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NEWPANELLAB6, -1, "", "NEWPANELLAB6", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_LIST, 964, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_FORM, 100, 80, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_FORM, 52);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NUMEROIMP, -1, GRP_MANDATI_IMPEGNO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NUMEROIMP, PPQRY_MAN7, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_LIST, 1016, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_FORM, 164, 80, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_ANNOIMP, -1, GRP_MANDATI_IMPEGNO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_ANNOIMP, PPQRY_MAN7, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, MyGlb.PANEL_LIST, 244, 148, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, MyGlb.PANEL_FORM, 580, 90, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NEWPANELABE1, -1, GRP_MANDATI_IMPEGNO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, MyGlb.PANEL_LIST, 140, 316, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, MyGlb.PANEL_FORM, 228, 116, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_TRATTINLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_TRATTINLABEL, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_TRATTINLABEL, -1, "", "TRATTINLABEL", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, MyGlb.PANEL_LIST, 240, 260, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, MyGlb.PANEL_FORM, 296, 120, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_APRIINFOLABE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_APRIINFOLABE, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_APRIINFOLABE, -1, "", "APRIINFOLABE", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, MyGlb.PANEL_LIST, 248, 268, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, MyGlb.PANEL_FORM, 576, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_APRINFIMPLAB, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_APRINFIMPLAB, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_APRINFIMPLAB, -1, "", "APRINFIMPLAB", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, MyGlb.PANEL_LIST, 120, 148, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, MyGlb.PANEL_FORM, 144, 80, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_SLASHLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_SLASHLABEL, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_SLASHLABEL, -1, "", "SLASHLABEL", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_LIST, 1000, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_LIST, 152);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_LIST, "Vincoli Descrizione Expression");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_FORM, 24, 436, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_FORM, 152);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VINCDESCEXPR, MyGlb.PANEL_FORM, "Vinc. Descr. Expression");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_VINCDESCEXPR, -1, -1);
    PAN_MANDATI.SetFieldUnbound(PFL_MANDATI_VINCDESCEXPR, true);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_VINCDESCEXPR, PPQRY_MAN7, "1", "RECVINDESEXP", 1, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, 1000, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, 264, 388, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_ANNOMAND, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_ANNOMAND, PPQRY_MAN7, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_LIST, 0, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_FORM, 24, 4, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_MANDATOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_MANDATOLABEL, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_MANDATOLABEL, -1, "", "MANDATOLABEL", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, MyGlb.PANEL_LIST, 180, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, MyGlb.PANEL_FORM, 32, 12, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DISTINTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DISTINTLABEL, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DISTINTLABEL, -1, "", "DISTINTLABEL", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_LIST, 1204, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_FORM, 72, 312, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_FORM, 44);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE1, MyGlb.PANEL_FORM, "Uten.");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_UTENTE1, -1, GRP_MANDATI_INSERIMENTO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_UTENTE1, PPQRY_MAN7, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_LIST, 1204, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_LIST, "Data ");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_FORM, 184, 312, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_FORM, 32);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA1, MyGlb.PANEL_FORM, "Dt.");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DATA1, -1, GRP_MANDATI_INSERIMENTO);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DATA1, PPQRY_MAN7, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_LIST, 1204, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_FORM, 308, 312, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_FORM, 44);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_UTENTE, MyGlb.PANEL_FORM, "Uten.");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_UTENTE, -1, GRP_MANDATI_AGGIORNAMENT);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_UTENTE, PPQRY_MAN7, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_LIST, 1204, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_LIST, 100);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_FORM, 428, 312, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_FORM, 32);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DATA, MyGlb.PANEL_FORM, "Dt.");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DATA, -1, GRP_MANDATI_AGGIORNAMENT);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DATA, PPQRY_MAN7, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, MyGlb.PANEL_LIST, 496, 324, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, MyGlb.PANEL_FORM, 552, 320, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_NEWPANELLABE, -1, GRP_MANDATI_AGGIORNAMENT);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_LIST, 88);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_LIST, "Valuta");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_FORM, 300, 240, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_FORM, 56);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_VALUTA, MyGlb.PANEL_FORM, "Valuta");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_VALUTA, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_VALUTA, PPQRY_MAN7, "A.D_DATA_VALUTA", "D_DATA_VALUTA", 6, 19, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, MyGlb.PANEL_LIST, 588, 8, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, MyGlb.PANEL_FORM, 620, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_IMPORTOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_IMPORTOLABEL, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_IMPORTOLABEL, -1, "", "IMPORTOLABEL", 0, 0, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_LIST, 0, 36, 264, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_LIST, 92);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_LIST, 2);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_LIST, "Dettagli Mandato");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_FORM, 4, 292, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_FORM, 92);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_FORM, 2);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DETTAGMANDAT, MyGlb.PANEL_FORM, "Dettagli Mandato");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DETTAGMANDAT, -1, -1);
    PAN_MANDATI.SetFieldUnbound(PFL_MANDATI_DETTAGMANDAT, true);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DETTAGMANDAT, PPQRY_MAN7, "'NO'", "RECODETTMAND", 5, 2, 0, -13997);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_DETTAGMANDAT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_DETTAGMANDAT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_LIST, 952, 48, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_LIST, 100);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_FORM, 208, 80, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_FORM, 64);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descr.");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_DESCRIZIONE1, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_DESCRIZIONE1, PPQRY_IMP1, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_LIST, 1056, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_LIST, 76);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_LIST, "Mandato a Copertura");
    PAN_MANDATI.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_FORM, 444, 240, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_FORM, 128);
    PAN_MANDATI.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATI_COPERTURA, MyGlb.PANEL_FORM, "Mandato a Copertura");
    PAN_MANDATI.SetFieldPage(PFL_MANDATI_COPERTURA, -1, -1);
    PAN_MANDATI.SetFieldPanel(PFL_MANDATI_COPERTURA, PPQRY_MAN7, "A.COPERTURA", "COPERTURA", 5, 2, 0, -13997);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_COPERTURA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_MANDATI.SetValueListItem(PFL_MANDATI_COPERTURA, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_MANDATI_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANDATI.SetSize(MyGlb.OBJ_QUERY, 7);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~ANNO_IMP~~ AND A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_MANDATI.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_MANDATI.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATI.SetMasterTable(PPQRY_IMP1, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',0,0) as ROWNAMDESINT, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0) as ROWNAMDESCAP, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~) as ROWNAMDESART ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_MANDATI.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_MANDATI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATI.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
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
    SQL.append("and   (NVL(B.TITOLO, -1) = NVL(C.TITOLO, NVL(B.TITOLO, -1))) ");
    SQL.append("and   (NVL(B.CATEGORIA, -1) = NVL(C.CATEGORIA, NVL(B.CATEGORIA, -1))) ");
    SQL.append("and   (NVL(B.COD_INTERVENTO, -1) = NVL(C.COD_INTERVENTO, NVL(B.COD_INTERVENTO, -1))) ");
    SQL.append("and   (NVL(B.COD_TERZI, -1) = NVL(C.COD_TERZI, NVL(B.COD_TERZI, -1))) ");
    SQL.append("and   (C.E_S = 'S') ");
    PAN_MANDATI.SetQuery(PPQRY_VOCIECONOMI1, 0, SQL, -1, "");
    PAN_MANDATI.SetQueryDB(PPQRY_VOCIECONOMI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATI.SetMasterTable(PPQRY_VOCIECONOMI1, "VOCI_ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATI.SetQuery(PPQRY_T54, 0, SQL, PFL_MANDATI_UFFICIO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATI.SetQuery(PPQRY_T54, 1, SQL, PFL_MANDATI_UFFICIO1, "");
    PAN_MANDATI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATI.SetQuery(PPQRY_T61, 0, SQL, PFL_MANDATI_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATI.SetQuery(PPQRY_T61, 1, SQL, PFL_MANDATI_BOLLO, "");
    PAN_MANDATI.SetQueryDB(PPQRY_T61, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_MANDATI.SetQuery(PPQRY_VINCOLI1, 0, SQL, PFL_MANDATI_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  DECODE(A.SCADENZA, to_date(NULL), TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE, '*** VINCOLO SCADUTO *** ' || ' ' || '(' || TO_CHAR ( A.CODICE ) || ')') as VINCDESCEXPR ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA >= ~~D_DATA_MAND~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATI.SetQuery(PPQRY_VINCOLI1, 1, SQL, PFL_MANDATI_TIPOVINCOLO, "");
    PAN_MANDATI.SetQueryDB(PPQRY_VINCOLI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATI.SetIMDB(IMDB, "PQRY_MAN7", true);
    PAN_MANDATI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
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
    SQL.append("  A.BOLLO as BOLLO, ");
    SQL.append("  1 as RECVINDESEXP, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  'NO' as RECODETTMAND, ");
    SQL.append("  A.D_DATA_VALUTA as D_DATA_VALUTA, ");
    SQL.append("  A.COPERTURA as COPERTURA ");
    PAN_MANDATI.SetQuery(PPQRY_MAN7, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MAN A ");
    PAN_MANDATI.SetQuery(PPQRY_MAN7, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.D_DATA_MAND >= DECODE(~~TBL_FILTRI6.ROWNAMDATDAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~TBL_FILTRI6.ROWNAMDATDAL~~) AND A.D_DATA_MAND <= DECODE(~~TBL_FILTRI6.ROWNAMEDATAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~TBL_FILTRI6.ROWNAMEDATAL~~)) ");
    SQL.append("and   (A.NUMERO_MAND >= NVL(~~TBL_FILTRI6.ROWNAMNUMDAL~~, 1) AND A.NUMERO_MAND <= NVL(~~TBL_FILTRI6.ROWNAMENUMAL~~, 99999)) ");
    SQL.append("and   (A.ANNO_MAND = ~~TBL_FILTRI6.ROWNAMEESERC~~) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.ANNO_LIQ ");
    SQL.append("from ");
    SQL.append("  LIQ B ");
    SQL.append("where (B.ANNO_MAND = A.ANNO_MAND AND B.NUMERO_MAND = A.NUMERO_MAND AND B.ANNO_LIQ = DECODE(~~PQRY_FILTRI2.ROWNAMANNLIQ~~, to_number(NULL), B.ANNO_LIQ, ~~PQRY_FILTRI2.ROWNAMANNLIQ~~) AND B.NUMERO_LIQ = DECODE(~~PQRY_FILTRI2.ROWNAMNUMLIQ~~, to_number(NULL), B.NUMERO_LIQ, ~~PQRY_FILTRI2.ROWNAMNUMLIQ~~)) ");
    SQL.append("))) ");
    SQL.append("and   ((~~TBL_FILTRI6.ROWNAMEMANDA~~ = 1 AND A.IMPORTO = A.PAGATO) OR (~~TBL_FILTRI6.ROWNAMEMANDA~~ = 0 AND NOT (A.IMPORTO = NVL(A.PAGATO, -1))) OR ~~TBL_FILTRI6.ROWNAMEMANDA~~ = 3) ");
    SQL.append("and   ((~~PQRY_FILTRI2.RONANOININFL~~ IS NULL) OR (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  MAN_INF_TESTATA C ");
    SQL.append("where (C.ANNO_MAND = A.ANNO_MAND) ");
    SQL.append("and   (C.NUMERO_MAND = A.NUMERO_MAND) ");
    SQL.append("))))) ");
    PAN_MANDATI.SetQuery(PPQRY_MAN7, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDATI.SetQuery(PPQRY_MAN7, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDATI.SetQuery(PPQRY_MAN7, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND ");
    PAN_MANDATI.SetQuery(PPQRY_MAN7, 5, SQL, -1, "");
    PAN_MANDATI.SetQueryDB(PPQRY_MAN7, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATI.SetMasterTable(0, "MAN");
    PAN_MANDATI.AddToSortList(PFL_MANDATI_ANNOMAND, true);
    PAN_MANDATI.AddToSortList(PFL_MANDATI_MANDATO, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_MANDATI.Status() == 2)
    {
      int oldListQBE = PAN_MANDATI.iUseListQBE;
      PAN_MANDATI.iUseListQBE = 0;
      PAN_MANDATI.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANDATI.PanelCommand(Glb.PCM_FIND);
      PAN_MANDATI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LIQUIDAZIONI_Init()
  {

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_FIELD, 47);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, "690BFA71-77E9-40A6-BD28-8689637C19D6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, 0, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "A299A904-2147-4EA5-9419-A76C288FED3F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, "A8719AFE-8E5C-4527-ABE2-A18DB10EA6A8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, "D DATA REG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, "68185309-3611-49D3-ACD4-3059B468BD2A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, "Apri Liquidazione Expression");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, "A9235109-9E90-4B49-A48E-556670C75BC8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, "Info Liq");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "B05D1F92-CC74-4F40-8F53-9879B9017C92");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "Importo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "74014332-26A5-49C4-8F00-7BBA76CEA058");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "Importo IVA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, "112B2DE8-70E9-4181-9D21-14E1214CC943");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, "di cui IVA Ist.");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, "4D65BA9C-BDAE-4620-A6F0-A6F408BD32FD");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, "Ritenute");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, "E690D9EE-99AA-40BC-8129-733005F57127");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, "Pagato");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, "IMPORTO PAGAM");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "623B8AA3-C2CF-42B0-A613-3511AA7831F9");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "Beneficiario");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, "RAGIONE SOCIALE");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, "862B0708-FE1F-423B-B756-0D8596EFACA8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, "NUMERO DOC 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "1C2387F8-EBBB-42CA-AC85-9111A973EB19");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "D DATA DOC");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "CBF52410-5613-4F85-995E-B8AC39276C0A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "Info Doc");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "A52FFA95-5EA8-4A11-8A0C-D2E76EB92C41");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "Quietanza");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, "DF965219-E67B-4889-8A8A-92A71A7DD6F5");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, "Quietanza Info Expression");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, "Info");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.VIS_HYPELINKIMMA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "E506A47A-1845-4C04-B654-8D0610430598");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "SEDE DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "5F9B72F7-2BFF-4ADF-B224-528C62684519");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "NUMERO DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "CA1DC798-30DA-4771-AC15-CC733CD84237");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "ANNO DEL");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, "662C7AF2-A7F5-4AE7-BF9C-703ABFFE2710");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, "Progr. Tesoriere");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, "5CAECA95-7023-4B7D-A810-5370CFBE5C52");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, "Distinta Tecnica");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, "If (Is Null (LIQ NUMERO DISTINTA), \"\", LIQ TIPO DISTINTA + \" - \" + To String (LIQ NUMERO DISTINTA) + \" / \" + To String (LIQ ANNO DISTINTA))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, "9070BDA3-C177-45DF-84F9-2A7BE93F5504");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, "Ufficio");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, "If (Is Null (T53 CODICE), \"\", To String (T53 CODICE) + \" - \" + T53 DESCRIZIONE)");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "B7F1FBDF-F352-4389-93E3-E3EB9ECDE901");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "60918741-3A80-4E62-AD2D-6E19C67F72A7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "Cgu");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, "If (Is Null (LIQ CODICE GESTIONALE), \"\", To String (LIQ CODICE GESTIONALE) + \" - \" + To String (CODICI GESTIONALI DESCRIZIONE))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "4C2851B0-D78B-4D7D-A2AF-02DBF8E2B5C3");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "UFFICIO");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "760A6CF0-7655-45FD-8DD6-A32A6238D5FE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "NUMERO DOC");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "51CA3A06-A740-41F5-8640-1CD4552D30E4");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, "A983C11B-8710-4126-B2F1-ECC6A4ABC3B6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, "9C8C88E2-E8EF-4E5F-A218-411FD19D7C58");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, "Documento");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, "AECC38E9-7A40-42BD-88F5-8FBC152D0678");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, "Delibera");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, "AB85EEFC-BC99-4CB9-BDC8-C11A45895F53");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, "BB7370F8-3A1C-458C-ACD9-052F36771143");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, "A24DE293-325B-4F5A-A5FA-36878DFBB92E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, "8C1221F8-A2AB-43C0-B810-600BC4747546");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, "Quietanza");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, "ADBED094-CCDF-4E87-9760-8BD899813898");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, "CODICE");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, "37ACD5F9-09A2-4289-8226-84336386A6EE");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, "Ordinamento1 Expression");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, "Null Value (LIQ DIVERSO BEN, LIQ BENEFICIARIO)");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, "ACCADE3A-6738-4293-A2E3-AF409E6A0F8F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, "Ordinamento1 Expression 2");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, "If (Is Null (LIQ DIVERSO BEN), LIQ NUM QUIETANZA, LIQ NUM QUIETANZA DIV BEN)");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ORDINAEXPRE2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, "D7364391-376E-4FD3-BBC7-81D756B934E6");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, "NUM QUIETANZA");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, "C7BAADCF-5DC2-4CAE-AF77-954BA609C85E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, "CODICE 1");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, "195D0208-05E8-4A04-ACA9-8D01D57BEA3A");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, "Piano Conti Int.");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, "Piano Conti Integrato");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, "B8D60AE1-11A4-459E-9C6C-D10AD1ED0680");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, "Cofog");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, "6BABCAC7-8F83-4930-BC3E-8DC9C173CCC9");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, "Cod. Eu.");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "CC1371A6-F9D2-4C76-94F0-90F637CF434F");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, "If (Is Null (LIQ FINANZIAMENTO), \"\", To String (LIQ FINANZIAMENTO) + \" - \" + To String (FINANZIAMENTI DESCRIZIONE))");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, "43F8EA4D-4EA7-47B1-BF6E-D0F5846773E7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, "FDFF980B-D995-4823-A886-0A9518B319F9");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, MyGlb.VIS_CAMPTOTADISA);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "BD46A4FF-4F53-43F3-A9F2-6CC62E9A3269");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "FAT ANNO PROG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "24500C29-045A-49A4-BDE2-3CB66BFECBB8");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "FAT NUMERO PROG");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, 0 | MyGlb.FLD_ISOPT, -1);
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
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROLIQ, PPQRY_LIQ17, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, 40, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_LIST, "D DATA REG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATAREG, MyGlb.PANEL_FORM, "D DT. REG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DDATAREG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DDATAREG, PPQRY_LIQ17, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, 108, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_LIST, "A. L. E.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, 4, 664, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_APRILIQUEXPR, MyGlb.PANEL_FORM, "Apri Liquidazione Expression");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_APRILIQUEXPR, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_APRILIQUEXPR, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_APRILIQUEXPR, PPQRY_LIQ17, "'A'", "RECAPRLIQEXP", 5, 1, 0, -13997);
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
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_LIST, 128, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_LIST, 180);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_LIST, "I. L.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_FORM, 4, 832, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_FORM, 180);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFOLIQ, MyGlb.PANEL_FORM, "Info Liq");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFOLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFOLIQ, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFOLIQ, PPQRY_LIQ17, "'I'", "RECORINFOLIQ", 5, 1, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFOLIQ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 148, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTO, PPQRY_LIQ17, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 228, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo IVA");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 784, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo IVA");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTOIVA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTOIVA, PPQRY_LIQ17, "A.IMPORTO_IVA", "RECLIQIMPIVA", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, 308, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_LIST, "di cui IVA Ist.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, 4, 808, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTIVAIST, MyGlb.PANEL_FORM, "di cui IVA Ist.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTIVAIST, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTIVAIST, PPQRY_LIQ17, "A.IMPORTO_IVA_IST", "RECLIQIMIVIS", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, 388, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, 4, 244, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_RITENUTE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_RITENUTE, PPQRY_LIQ17, "A.RITENUTE", "RITENUTE", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, 468, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, 4, 340, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PAGATO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PAGATO, PPQRY_LIQ17, "A.IMPORTO_PAGAM", "IMPORTO_PAGAM", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 548, 40, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 52, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_BENEFICIARIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_BENEFICIARIO, PPQRY_LIQ17, "B.RAGIONE_SOCIALE_ESTESA", "REBERASOESES", 5, 60, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, 692, 40, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_LIST, "NUMERO DOC 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, 4, 364, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC1, MyGlb.PANEL_FORM, "NUM. DOC 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODOC1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODOC1, PPQRY_LIQ17, "C.NUMERO_DOC", "RECONUMEDOC1", 5, 20, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 780, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 4, 76, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DDATADOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DDATADOC, PPQRY_LIQ17, "C.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 848, 40, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_LIST, "I. D.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 4, 856, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_INFODOC, MyGlb.PANEL_FORM, "Info Doc");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_INFODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_INFODOC, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_INFODOC, PPQRY_LIQ17, "CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'I' ELSE '' END", "RECORINFODOC", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAZIONI.SetValueListItem(PFL_LIQUIDAZIONI_INFODOC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 868, 40, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 4, 100, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_QUIETANZA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_QUIETANZA, PPQRY_LIQ17, "D.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, 1052, 40, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, 136);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_LIST, "Q. I. E.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, 4, 496, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, 136);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEINFOEXPR, MyGlb.PANEL_FORM, "Quiet. Info Expression");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_QUIEINFOEXPR, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_QUIEINFOEXPR, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_QUIEINFOEXPR, PPQRY_LIQ17, "'I'", "RECQUIINFEXP", 5, 1, 0, -13997);
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
    PAN_LIQUIDAZIONI.set_ImageResizeMode(PFL_LIQUIDAZIONI_QUIEINFOEXPR, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1076, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 4, 148, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SEDEDEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SEDEDEL, PPQRY_LIQ17, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1116, 40, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 4, 172, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODEL, PPQRY_LIQ17, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1160, 40, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_LIST, "ANN. DEL");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 4, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODEL, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODEL, PPQRY_LIQ17, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, 1192, 40, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_LIST, "Progr. Tesoriere");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, 4, 292, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PROGRTESORIE, MyGlb.PANEL_FORM, "Progr. Tesoriere");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PROGRTESORIE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PROGRTESORIE, PPQRY_LIQ17, "A.PROGRESSIVO_TESO", "PROGRESSIVO_TESO", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, 1256, 40, 84, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_LIST, "Distinta Tecnica");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, 4, 388, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTECNIC, MyGlb.PANEL_FORM, "Distinta Tecnica");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DISTINTECNIC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_DISTINTECNIC, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DISTINTECNIC, PPQRY_LIQ17, "CASE WHEN (A.NUMERO_DISTINTA IS NULL) THEN '' ELSE A.TIPO_DISTINTA || ' - ' || TO_CHAR ( A.NUMERO_DISTINTA ) || ' / ' || TO_CHAR ( A.ANNO_DISTINTA ) END", "RECODISTTECN", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, 1340, 40, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_LIST, "Ufficio");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, 4, 568, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, 144);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO2, MyGlb.PANEL_FORM, "Ufficio");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UFFICIO2, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_UFFICIO2, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UFFICIO2, PPQRY_LIQ17, "CASE WHEN (E.CODICE IS NULL) THEN '' ELSE TO_CHAR ( E.CODICE ) || ' - ' || E.DESCRIZIONE END", "RECORDUFFICI", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1480, 40, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 460, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DESCRIZIONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DESCRIZIONE, PPQRY_LIQ17, "A.DESCRIZIONE", "RECORDDESCRI", 5, 140, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 1660, 40, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 4, 616, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CGU, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_CGU, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CGU, PPQRY_LIQ17, "CASE WHEN (A.CODICE_GESTIONALE IS NULL) THEN '' ELSE TO_CHAR ( A.CODICE_GESTIONALE ) || ' - ' || TO_CHAR ( F.DESCRIZIONE ) END", "RECORDCGU", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 2448, 72, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_LIST, "UFFICIO");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 4, 124, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_UFFICIO, MyGlb.PANEL_FORM, "UFFICIO");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_UFFICIO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_UFFICIO, PPQRY_LIQ17, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 2448, 72, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 4, 220, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODOC, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODOC, PPQRY_LIQ17, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 2448, 72, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 316, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOLIQ, PPQRY_LIQ17, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_LIST, 0, 4, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_FORM, 0, 8, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQULABEHEAD, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LIQULABEHEAD, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LIQULABEHEAD, -1, "", "LIQULABEHEAD", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_LIST, 692, 4, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_FORM, 560, 4, 200, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DOCUHEADLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DOCUHEADLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DOCUHEADLABE, -1, "", "DOCUHEADLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_LIST, 1076, 4, 116, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_FORM, 968, 68, 112, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DELIHEADLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DELIHEADLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DELIHEADLABE, -1, "", "DELIHEADLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_LIST, 148, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_FORM, 112, 252, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMIMPOLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMMIMPOLABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMMIMPOLABE, -1, "", "SOMMIMPOLABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_LIST, 388, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_FORM, 120, 260, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMRITELABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMMRITELABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMMRITELABE, -1, "", "SOMMRITELABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_LIST, 468, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_FORM, 128, 268, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMMPAGALABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMMPAGALABE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMMPAGALABE, -1, "", "SOMMPAGALABE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_QUIEHEADLABE, MyGlb.PANEL_LIST, 868, 4, 208, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CODICE, PPQRY_LIQ17, "E.CODICE", "CODICE", 1, 5, 0, -13997);
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
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ORDINAEXPRES, PPQRY_LIQ17, "NVL(A.DIVERSO_BEN, A.BENEFICIARIO)", "RECOORDIEXPR", 2, 19, 0, -13997);
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
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ORDINAEXPRE2, PPQRY_LIQ17, "CASE WHEN (A.DIVERSO_BEN IS NULL) THEN A.NUM_QUIETANZA ELSE A.NUM_QUIETANZA_DIV_BEN END", "RECOORDIEXP2", 1, 19, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, 2148, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_LIST, "NUM QUIETANZA");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 712, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMQUIETANZA, MyGlb.PANEL_FORM, "NUM QUIET.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMQUIETANZA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMQUIETANZA, PPQRY_LIQ17, "G.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, 2148, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_LIST, "CODICE 1");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, 4, 712, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, 48);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICE1, MyGlb.PANEL_FORM, "COD. 1");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CODICE1, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CODICE1, PPQRY_LIQ17, "G.CODICE", "RECORDCODIC1", 2, 15, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_LIST, 1840, 40, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_LIST, "Piano Conti Int.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_FORM, 4, 712, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_PIANOCONTINT, MyGlb.PANEL_FORM, "Piano Conti Int.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_PIANOCONTINT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_PIANOCONTINT, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_PIANOCONTINT, PPQRY_LIQ17, "NVL(TO_CHAR ( A.COD_LIVELLO_5 ), A_GET_COD_RICL_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') || '000')", "PIANOCONTINT", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_LIST, 1936, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_LIST, "Cofog");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_FORM, 4, 736, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICECOFOG, MyGlb.PANEL_FORM, "Cofog");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CODICECOFOG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CODICECOFOG, PPQRY_LIQ17, "A.CODICE_COFOG", "RECLIQCODCOF", 1, 3, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_LIST, 1976, 40, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Eu.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 760, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Eu.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_CODICEEUROPE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_CODICEEUROPE, PPQRY_LIQ17, "A.CODICE_EUROPEO", "RECLIQCODEUR", 1, 1, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 2028, 40, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 132);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 520, 564, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 132);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FINANZIAMENT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldUnbound(PFL_LIQUIDAZIONI_FINANZIAMENT, true);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FINANZIAMENT, PPQRY_LIQ17, "CASE WHEN (A.FINANZIAMENTO IS NULL) THEN '' ELSE TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || TO_CHAR ( H.DESCRIZIONE ) END", "RECORDFINANZ", 5, 99, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, MyGlb.PANEL_LIST, 228, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, MyGlb.PANEL_FORM, 120, 260, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVALAB, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMIMPIVALAB, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMIMPIVALAB, -1, "", "SOMIMPIVALAB", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, MyGlb.PANEL_LIST, 308, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, MyGlb.PANEL_FORM, 128, 268, 100, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_SOMIMPIVISLA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_SOMIMPIVISLA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_SOMIMPIVISLA, -1, "", "SOMIMPIVISLA", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 2184, 40, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_LIST, "FAT ANNO PROG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 4, 856, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATANNOPROG, MyGlb.PANEL_FORM, "FAT ANNO PROG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATANNOPROG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATANNOPROG, PPQRY_LIQ17, "A.FAT_ANNO_PROG", "RECLIQFAANPR", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 2184, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 116);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_LIST, "FAT NUMERO PROG");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 4, 880, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 116);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_FATNUMERPROG, MyGlb.PANEL_FORM, "FAT NUMERO PROG");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_FATNUMERPROG, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_FATNUMERPROG, PPQRY_LIQ17, "A.FAT_NUMERO_PROG", "RECLIQFANUPR", 1, 5, 0, -13997);
  }

  private void PAN_LIQUIDAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAZIONI.SetIMDB(IMDB, "PQRY_LIQ17", true);
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
    SQL.append("  'A' as RECAPRLIQEXP, ");
    SQL.append("  NVL(A.DIVERSO_BEN, A.BENEFICIARIO) as RECOORDIEXPR, ");
    SQL.append("  CASE WHEN (A.DIVERSO_BEN IS NULL) THEN A.NUM_QUIETANZA ELSE A.NUM_QUIETANZA_DIV_BEN END as RECOORDIEXP2, ");
    SQL.append("  G.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  G.CODICE as RECORDCODIC1, ");
    SQL.append("  NVL(TO_CHAR ( A.COD_LIVELLO_5 ), A_GET_COD_RICL_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') || '000') as PIANOCONTINT, ");
    SQL.append("  A.CODICE_COFOG as RECLIQCODCOF, ");
    SQL.append("  A.CODICE_EUROPEO as RECLIQCODEUR, ");
    SQL.append("  A.IMPORTO_IVA as RECLIQIMPIVA, ");
    SQL.append("  A.IMPORTO_IVA_IST as RECLIQIMIVIS, ");
    SQL.append("  'I' as RECORINFOLIQ, ");
    SQL.append("  CASE WHEN NOT ((A.FAT_ANNO_PROG IS NULL)) THEN 'I' ELSE '' END as RECORINFODOC, ");
    SQL.append("  A.FAT_ANNO_PROG as RECLIQFAANPR, ");
    SQL.append("  A.FAT_NUMERO_PROG as RECLIQFANUPR ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ17, 0, SQL, -1, "");
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
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ17, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BENEFICIARIO = G.CODICE(+)) ");
    SQL.append("and   (A.NUM_QUIETANZA = G.NUM_QUIETANZA(+)) ");
    SQL.append("and   (G.TIPO_QUIETANZA = D.CODICE(+)) ");
    SQL.append("and   (A.BENEFICIARIO = B.CODICE(+)) ");
    SQL.append("and   (A.FAT_ANNO_PROG = C.ANNO_PROG(+)) ");
    SQL.append("and   (A.FAT_NUMERO_PROG = C.NUMERO_PROG(+)) ");
    SQL.append("and   (A.FINANZIAMENTO = H.CODICE(+)) ");
    SQL.append("and   (A.ANNO_MAND = ~~PQRY_MAN7.ANNO_MAND~~ AND A.NUMERO_MAND = ~~PQRY_MAN7.NUMERO_MAND~~) ");
    SQL.append("and   (E.CODICE(+) = A.UFFICIO) ");
    SQL.append("and   (A.CODICE_GESTIONALE = F.CODICE(+)) ");
    SQL.append("and   (NVL(F.E_S, 'S') = 'S') ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ17, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ17, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ17, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 26, 27, 14, 1 ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQ17, 5, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_LIQ17, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(0, "LIQ");
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ORDINAEXPRES, true);
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ORDINAEXPRE2, true);
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_ANNOLIQ, true);
    PAN_LIQUIDAZIONI.AddToSortList(PFL_LIQUIDAZIONI_NUMEROLIQ, true);
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
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
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_ValidateRow(Cancel);
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_DynamicProperties();
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_DynamicProperties();
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_OnChangeLayout(NewLayout, Cancel);
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_OnChangeRow();
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
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_AfterInsert();
  }
  
  public void AfterUpdate(IDPanel SrcObj)
  {
  }

  public void AfterBlobUpdate(IDPanel SrcObj, IDVariant Column, IDVariant Size, IDVariant Extension)
  {
  }
  
  public void AfterDelete(IDPanel SrcObj)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_AfterFind(CmdFind);
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
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_MANDATI) PAN_MANDATI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
