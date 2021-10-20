// **********************************************
// Rettifiche
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Rettifiche extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RETTIFICHE_ANNODOC = 0;
  private static int PFL_RETTIFICHE_NUMERODOC = 1;
  private static int PFL_RETTIFICHE_TRATTAMENTOI = 2;
  private static int PFL_RETTIFICHE_ATTIVITANAC = 3;
  private static int PFL_RETTIFICHE_INFODOC = 4;
  private static int PFL_RETTIFICHE_RIEPILOGOIVA = 5;
  private static int PFL_RETTIFICHE_IMPORTO = 6;
  private static int PFL_RETTIFICHE_IMPORTOIVA = 7;
  private static int PFL_RETTIFICHE_IMPORTIVAIST = 8;
  private static int PFL_RETTIFICHE_DATAREG = 9;
  private static int PFL_RETTIFICHE_DESCRIZIONE = 10;
  private static int PFL_RETTIFICHE_FATTORE1 = 11;
  private static int PFL_RETTIFICHE_CENTRO1 = 12;
  private static int PFL_RETTIFICHE_COMPETENZDAL = 13;
  private static int PFL_RETTIFICHE_COMPETENZAAL = 14;
  private static int PFL_RETTIFICHE_PROGETTOID = 15;
  private static int PFL_RETTIFICHE_LABEL = 16;
  private static int PFL_RETTIFICHE_LABELFATTORE = 17;
  private static int PFL_RETTIFICHE_LABELCENTRO = 18;
  private static int PFL_RETTIFICHE_LABELCOMPETE = 19;
  private static int PFL_RETTIFICHE_FATTORE = 20;
  private static int PFL_RETTIFICHE_CENTRO = 21;
  private static int PFL_RETTIFICHE_PROGETTO = 22;
  private static int PFL_RETTIFICHE_STATO = 23;
  private static int PFL_RETTIFICHE_FATANNPRONAC = 24;
  private static int PFL_RETTIFICHE_FATNUMPRONAC = 25;
  private static int PFL_RETTIFICHE_FATANNPROFAT = 26;
  private static int PFL_RETTIFICHE_FATNUMPROFAT = 27;
  private static int PFL_RETTIFICHE_APRIDOCUMENT = 28;
  private static int PFL_RETTIFICHE_APRIFATTORE = 29;
  private static int PFL_RETTIFICHE_APRICENTRO = 30;
  private static int PFL_RETTIFICHE_APRIPROGETID = 31;
  private static int PFL_RETTIFICHE_UTENTEINSERI = 32;
  private static int PFL_RETTIFICHE_DATAINSERIME = 33;
  private static int PFL_RETTIFICHE_UTENTULTIAGG = 34;
  private static int PFL_RETTIFICHE_DATAULTIMAGG = 35;
  private static int PFL_RETTIFICHE_PROGRESSIVO = 36;
  private static int PFL_RETTIFICHE_ETICHETTA = 37;
  private static int PFL_RETTIFICHE_TIPOREGISDEF = 38;
  private static int PFL_RETTIFICHE_TIPOBOLLADEF = 39;
  private static int PFL_RETTIFICHE_T04TIPBOLDEF = 40;
  private static int PFL_RETTIFICHE_T04ATTISBODE = 41;
  private static int PFL_RETTIFICHE_ANNODOCOLD = 42;
  private static int PFL_RETTIFICHE_NUMERODOCOLD = 43;
  private static int PFL_RETTIFICHE_ANNOPROGCOLL = 44;
  private static int PFL_RETTIFICHE_NUMEPROGCOLL = 45;

  private static int PPQRY_RETFAT1 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_CENTRI = 2;
  private static int PPQRY_PROGETTI = 3;
  private static int PPQRY_FAT = 4;
  private static int PPQRY_T04 = 5;


  IDPanel PAN_RETTIFICHE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM23(IMDB);
    Init_TBL_RETFAT(IMDB);
    //
    //
    Init_PQRY_RETFAT1(IMDB);
    Init_PQRY_RETFAT1_RS(IMDB);
    Init_QRY_CFASELINTV78(IMDB);
    Init_QRY_IMPECO3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM23(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM23, 13);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM23, "TBL_PARAM23");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO,1,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, "ROWNAMCODDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMCODDOC,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMESTORN, "ROWNAMESTORN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMESTORN,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMNUMDOC, "ROWNAMNUMDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMNUMDOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMDATDOC, "ROWNAMDATDOC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMDATDOC,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMCODBEN,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, "ROWNAMEFATTU");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMEFATTU,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMDATPRO, "ROWNAMDATPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMDATPRO,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, "ROWNAMIMPECO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMIMPECO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMRPPATT, "ROWNAMRPPATT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMRPPATT,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMEFORNI, "ROWNAMEFORNI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMEFORNI,5,250,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMEINFO, "ROWNAMEINFO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM23,IMDBDef2.FLD_PARAM23_ROWNAMEINFO,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM23, 0);
  }

  private static void Init_TBL_RETFAT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_RETFAT, 30);
    IMDB.set_TblCode(IMDBDef2.TBL_RETFAT, "TBL_RETFAT");
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_FAT, "FAT_ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_FAT, "FAT_NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_NAC, "FAT_ANNO_PROG_NAC");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_NAC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_NAC, "FAT_NUMERO_PROG_NAC");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_NAC,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COD_REC,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_EURO, "IMPORTO_EURO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_EURO,3,12,2);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ANNO_DOC_OLD, "ANNO_DOC_OLD");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ANNO_DOC_OLD,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_NUMERO_DOC_OLD, "NUMERO_DOC_OLD");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_NUMERO_DOC_OLD,5,20,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMESTATO, "ROWNAMESTATO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMESTATO,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_IVA_IST,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_TIPO_REGISTRO_DEF, "TIPO_REGISTRO_DEF");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_TIPO_REGISTRO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_TIPO_BOLLATO_DEF, "TIPO_BOLLATO_DEF");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_TIPO_BOLLATO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMANPRCO, "ROWNAMANPRCO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMANPRCO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMNUPRCO, "ROWNAMNUPRCO");
    IMDB.SetFldParams(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMNUPRCO,1,5,0);
  }

  private static void Init_PQRY_RETFAT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_RETFAT1, 32);
    IMDB.set_TblCode(IMDBDef10.PQRY_RETFAT1, "PQRY_RETFAT1");
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, "FAT_ANNO_PROG_NAC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, "FAT_NUMERO_PROG_NAC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRIDOCU, "RETFAPRIDOCU");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRIDOCU,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRIFATT, "RETFAPRIFATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRIFATT,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRICENT, "RETFAPRICENT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRICENT,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRPROID, "RETFAPRPROID");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_RETFAPRPROID,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, "FAT_ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, "FAT_NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, "ROWNAMESTATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, "TIPO_REGISTRO_DEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, "TIPO_BOLLATO_DEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ANNO_DOC_OLD, "ANNO_DOC_OLD");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ANNO_DOC_OLD,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC_OLD, "NUMERO_DOC_OLD");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC_OLD,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ROWNAMANPRCO, "ROWNAMANPRCO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ROWNAMANPRCO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ROWNAMNUPRCO, "ROWNAMNUPRCO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1,IMDBDef10.PQSL_RETFAT1_ROWNAMNUPRCO,1,5,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_RETFAT1, 0);
  }

  private static void Init_PQRY_RETFAT1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_RETFAT1_RS, 32);
    IMDB.set_TblCode(IMDBDef10.PQRY_RETFAT1_RS, "PQRY_RETFAT1_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, "FAT_ANNO_PROG_NAC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, "FAT_NUMERO_PROG_NAC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRIDOCU, "RETFAPRIDOCU");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRIDOCU,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRIFATT, "RETFAPRIFATT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRIFATT,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRICENT, "RETFAPRICENT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRICENT,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRPROID, "RETFAPRPROID");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_RETFAPRPROID,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, "FAT_ANNO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, "FAT_NUMERO_PROG_FAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, "ROWNAMESTATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, "TIPO_REGISTRO_DEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, "TIPO_BOLLATO_DEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ANNO_DOC_OLD, "ANNO_DOC_OLD");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ANNO_DOC_OLD,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC_OLD, "NUMERO_DOC_OLD");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_NUMERO_DOC_OLD,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ROWNAMANPRCO, "ROWNAMANPRCO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ROWNAMANPRCO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ROWNAMNUPRCO, "ROWNAMNUPRCO");
    IMDB.SetFldParams(IMDBDef10.PQRY_RETFAT1_RS,IMDBDef10.PQSL_RETFAT1_ROWNAMNUPRCO,1,5,0);
  }

  private static void Init_QRY_CFASELINTV78(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_CFASELINTV78, 1);
    IMDB.set_TblCode(IMDBDef10.QRY_CFASELINTV78, "QRY_CFASELINTV78");
    IMDB.set_FldCode(IMDBDef10.QRY_CFASELINTV78,IMDBDef10.QSL_CFASELINTV78_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef10.QRY_CFASELINTV78,IMDBDef10.QSL_CFASELINTV78_COUNT,1,19,0);
  }

  private static void Init_QRY_IMPECO3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.QRY_IMPECO3, 2);
    IMDB.set_TblCode(IMDBDef10.QRY_IMPECO3, "QRY_IMPECO3");
    IMDB.set_FldCode(IMDBDef10.QRY_IMPECO3,IMDBDef10.QSL_IMPECO3_IMPECOFATTOR, "IMPECOFATTOR");
    IMDB.SetFldParams(IMDBDef10.QRY_IMPECO3,IMDBDef10.QSL_IMPECO3_IMPECOFATTOR,5,16,0);
    IMDB.set_FldCode(IMDBDef10.QRY_IMPECO3,IMDBDef10.QSL_IMPECO3_IMPECOCENTRO, "IMPECOCENTRO");
    IMDB.SetFldParams(IMDBDef10.QRY_IMPECO3,IMDBDef10.QSL_IMPECO3_IMPECOCENTRO,5,16,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Rettifiche(MyWebEntryPoint w, IMDBObj imdb)
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
  public Rettifiche()
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
    FormIdx = MyGlb.FRM_RETTIFICHE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "81A6A5A0-E1C9-4394-BC50-318100BB1BBE";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 804;
    DesignHeight = 498;
    set_Caption(new IDVariant("Rettifiche"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 804;
    Frames[1].Height = 472;
    Frames[1].Caption = "Rettifiche";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 472;
    PAN_RETTIFICHE = new IDPanel(w, this, 1, "PAN_RETTIFICHE");
    Frames[1].Content = PAN_RETTIFICHE;
    PAN_RETTIFICHE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RETTIFICHE.VS = MainFrm.VisualStyleList;
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2ED7C8CC-D272-4972-95B3-AC3DE1307C4E");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 1652, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RETTIFICHE.InitStatus = 2;
    PAN_RETTIFICHE_Init();
    PAN_RETTIFICHE_InitFields();
    PAN_RETTIFICHE_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_NUOVO6+BaseCmdLinIdx)
      {
        Inserisci();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA55+BaseCmdLinIdx)
      {
        SalvaRettifiche();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCELLA1+BaseCmdLinIdx)
      {
        CancellaRettifica();
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
      if (IMDB.TblModified(IMDBDef2.TBL_RETFAT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETTIFICHE_RETFAT1();
      }
      PAN_RETTIFICHE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_RETTIFICHE.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETTIFICHE_FATTORE1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_RETTIFICHE.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETTIFICHE_CENTRO1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROGET && flRis && IdxPanelActived == PAN_RETTIFICHE.FrIndex)
    {
      if (IdxFieldActived ==PFL_RETTIFICHE_PROGETTOID) {
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
    return (obj instanceof Rettifiche);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Rettifiche.class.getName() : (Glb.ClassWithPackage(Rettifiche.class) ? Rettifiche.class.getName().substring(Rettifiche.class.getPackage().getName().length() + 1) : Rettifiche.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Rettifiche On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RETTIFICHE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RETTIFICHE);
      // 
      // Rettifiche On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // gestione fattore e date competenza
      // 
      {
        if ((IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0)))) && IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0).compareTo((new IDVariant("LI")), true)!=0)
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0)))
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMRPPATT, 0).equals((new IDVariant(1)), true))
            {
              PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            }
            else
            {
              PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            }
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
      }
      // 
      // gestione centro
      // 
      {
        if ((MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0)))) && IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0).compareTo((new IDVariant("LI")), true)!=0)
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0)))
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
      }
      if (!(PAN_RETTIFICHE.IsNewRow()) && IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0).compareTo((new IDVariant("I")), true)!=0)
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.NullValue((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_TRATTAMENTOI))),(new IDVariant(""))).equals((new IDVariant("")), true))
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.NullValue((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_ATTIVITANAC))),(new IDVariant(""))).equals((new IDVariant("P")), true))
        {
          PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          if ((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_T04ATTISBODE))).equals((new IDVariant("SI")), true) || (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0))) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0)))
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
        else
        {
          PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "RettificheOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifiche On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_RETTIFICHE_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifiche On Change Row Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_RETTIFICHE.GetNumRows())).compareTo((new IDVariant(0)), true)>=0)
      {
        // 
        // gestione fattore e date competenza
        // 
        {
          if (IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0).compareTo((new IDVariant("LI")), true)!=0)
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0)))
            {
              if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMRPPATT, 0).equals((new IDVariant(1)), true))
              {
                PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              }
              else
              {
                PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              }
              PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            else
            {
              PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
          }
          else
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        // 
        // gestione centro
        // 
        {
          if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0).compareTo((new IDVariant("LI")), true)!=0)
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0)))
            {
              PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            else
            {
              PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
          }
          else
          {
            PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "RettificheOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifiche On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_RETTIFICHE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifiche On Updating Row Event Body
      // Procedure Body
      // 
      if ((Column.equals((new IDVariant(PFL_RETTIFICHE_ANNODOC)), true) || Column.equals((new IDVariant(PFL_RETTIFICHE_NUMERODOC)), true)) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0),(new IDVariant(""))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC_OLD, 0),(new IDVariant(""))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC_OLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0))))
          {
            IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_ANNOPROG = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_NUMEROPROG = new IDVariant(0,IDVariant.INTEGER);
            v_ANNOPROG = (new IDVariant());
            v_NUMEROPROG = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1, ");
            SQL.append("  MAX(A.ANNO_PROG) as MAXFATANNPRO, ");
            SQL.append("  MAX(A.NUMERO_PROG) as MAXFATNUMPRO ");
            SQL.append("from ");
            SQL.append("  FAT A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODBEN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 1 AND (A.CODICE_DOC = 2 OR A.CODICE_DOC = 7)) OR ((" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 2 OR " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 7) AND A.CODICE_DOC = 1) OR (" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 3 AND (A.CODICE_DOC = 4 OR A.CODICE_DOC = 8)) OR ((" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 4 OR " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 8) AND A.CODICE_DOC = 3) OR (" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 5) OR (" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 6)) ");
            SQL.append("and   (((A.CODICE_DOC IN (1, 2, 5, 7)) AND ((A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(");
            SQL.append("( ");
            SQL.append("select ");
            SQL.append("  SUM(B.IMPORTO) ");
            SQL.append("from ");
            SQL.append("  LIQ B ");
            SQL.append("where (B.FAT_ANNO_PROG = A.ANNO_PROG) ");
            SQL.append("and   (B.FAT_NUMERO_PROG = A.NUMERO_PROG) ");
            SQL.append("and   (NOT ((B.ANNO_MAND IS NULL)) AND NOT ((B.NUMERO_MAND IS NULL))) ");
            SQL.append("), 0)) > 0)) OR ((A.CODICE_DOC IN (3, 4, 6, 8)) AND (A.IMPORTO + NVL(A.VARIAZIONI, 0) - NVL(A.IMPUTATO, 0)) > 0)) ");
            SQL.append("and   (A.ANNO_DOC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_DOC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
              v_ANNOPROG = QV.Get("MAXFATANNPRO", IDVariant.INTEGER) ;
              v_NUMEROPROG = QV.Get("MAXFATNUMPRO", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(1)), true))
            {
              if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("N")), true))
              {
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, new IDVariant(v_ANNOPROG));
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, new IDVariant(v_NUMEROPROG));
                if (PAN_RETTIFICHE.IsNewRow())
                {
                  IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
                  IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
                }
              }
              else
              {
                if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("S")), true))
                {
                  if (PAN_RETTIFICHE.IsNewRow())
                  {
                    IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
                    IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
                  }
                  IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, new IDVariant(v_ANNOPROG));
                  IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, new IDVariant(v_NUMEROPROG));
                }
              }
            }
            else
            {
              if (v_CONTATORE.compareTo((new IDVariant(1)), true)>0)
              {
                IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMCODBEN, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODBEN, 0));
                IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMCODDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0));
                IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMANNDOC, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0));
                IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMNUMDOC, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0));
                MainFrm.Show(MyGlb.FRM_DOCUMENTI, (new IDVariant(-1)).intValue(), this); 
              }
              else
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Documento non presente!", IDVariant.STRING));
                MainFrm.set_AlertMessage(v_SMS); 
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0, (new IDVariant()));
                return;
              }
            }
          }
          else
          {
            if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("N")), true))
            {
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, (new IDVariant()));
              if (PAN_RETTIFICHE.IsNewRow())
              {
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
              }
            }
            else
            {
              if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("S")), true))
              {
                if (PAN_RETTIFICHE.IsNewRow())
                {
                  IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
                  IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
                }
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, (new IDVariant()));
              }
            }
          }
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC_OLD, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0));
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC_OLD, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0));
        }
      }
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_UTENTE_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_DATA_INSERIMENTO, 0, IDL.Today());
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0)))
        {
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0, (new IDVariant("I")));
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0)))
        {
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0, (new IDVariant("U")));
        }
      }
      if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("S")), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
        // IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, (new IDVariant()));
        // IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, (new IDVariant()));
      }
      else
      {
        // IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, (new IDVariant()));
        // IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
        if ((Column.equals((new IDVariant(PFL_RETTIFICHE_FATANNPRONAC)), true) || Column.equals((new IDVariant(PFL_RETTIFICHE_FATNUMPRONAC)), true)) && FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0))))
          {
            if (IDL.NullValue((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_TRATTAMENTOI))),(new IDVariant(""))).equals((new IDVariant("")), true))
            {
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0, (new IDVariant()));
            }
            else
            {
              if ((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_ATTIVITANAC))).compareTo((new IDVariant("P")), true)!=0)
              {
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0, (new IDVariant()));
              }
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_RETTIFICHE_IMPORTO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_TRATTAMENTOI))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0))))
        {
          IDVariant v_VTOTIMPORNAC = new IDVariant(0,IDVariant.DECIMAL);
          IDVariant v_VSUMIVA = new IDVariant(0,IDVariant.DECIMAL);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MAX(A.IMPORTO) as MAXFATIMPORT, ");
          SQL.append("  SUM((B.IVA * DECODE(B.CODICE_DOC, A.CODICE_DOC, 1, -1))) as SIIEICDFCD11 ");
          SQL.append("from ");
          SQL.append("  FAT A, ");
          SQL.append("  IVA B ");
          SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NVL(B.TIPO_REGISTRO, -1) <> 3) ");
          SQL.append("and   (B.ANNO_PROG = A.ANNO_PROG) ");
          SQL.append("and   (B.NUMERO_PROG = A.NUMERO_PROG) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VTOTIMPORNAC = QV.Get("MAXFATIMPORT", IDVariant.DECIMAL) ;
            v_VSUMIVA = QV.Get("SIIEICDFCD11", IDVariant.DECIMAL) ;
          }
          QV.Close();
          // 
          // correzione caso division by 0
          // 
          if (v_VTOTIMPORNAC.compareTo((new IDVariant(0)), true)!=0)
          {
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0, IDL.Div(IDL.Mul(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0), v_VSUMIVA), v_VTOTIMPORNAC));
          }
          if ((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_ATTIVITANAC))).equals((new IDVariant("P")), true))
          {
            if (IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0).equals(v_VTOTIMPORNAC, true))
            {
              IDVariant v_VGETTOTIVAIS = null;
              v_VGETTOTIVAIS = (new IDVariant());
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  GET_TOT_IVA_IST(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GTIIRFAPNRRR ");
              SQL.append("from ");
              SQL.append("  DUAL A ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VGETTOTIVAIS = QV.Get("GTIIRFAPNRRR", IDVariant.DECIMAL) ;
              }
              QV.Close();
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, new IDVariant(v_VGETTOTIVAIS));
            }
            else
            {
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0));
            }
          }
          // 
          // OLD
          // 
          // {
            // if (IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0).equals(v_VTOTIMPORNAC, true))
            // {
            // }
            // else
            // {
              // IDVariant v_VCALCIMPOIVA = null;
              // v_VCALCIMPOIVA = (new IDVariant());
              // SQL = new StringBuffer();
              // SQL.append("select ");
              // SQL.append("  CALCOLA_IMPORTO_IVA(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CIIRFAPNRRRF ");
              // SQL.append("from ");
              // SQL.append("  DUAL A ");
              // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              // if (!QV.EOF()) QV.MoveNext();
              // if (!QV.EOF())
              // {
              //   v_VCALCIMPOIVA = QV.Get("CIIRFAPNRRRF", IDVariant.DECIMAL) ;
              // }
              // QV.Close();
              // if (!(IDL.IsNull(v_VCALCIMPOIVA)))
              // {
                // IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0, new IDVariant(v_VCALCIMPOIVA));
                // if ((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_ATTIVITANAC))).equals((new IDVariant("P")), true))
                // {
                  // IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, new IDVariant(v_VCALCIMPOIVA));
                // }
              // }
            // }
          // }
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_RETTIFICHE_TIPOREGISDEF)), true) || Column.equals((new IDVariant(PFL_RETTIFICHE_TIPOBOLLADEF)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0))))
        {
          if ((new IDVariant(PAN_RETTIFICHE.FieldText(PFL_RETTIFICHE_T04ATTISBODE))).equals((new IDVariant("SI")), true))
          {
            if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0))))
            {
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0));
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "RettificheOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifiche On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_RETTIFICHE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifiche On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(64)), true) || Command.equals((new IDVariant(32)), true))
      {
        RiempiRETFAT((new IDVariant(0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "RettificheOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Rettifiche After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_RETTIFICHE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Rettifiche After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0).equals((new IDVariant("I")), true))
      {
        PAN_RETTIFICHE.SetModified(MainFrm);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "RettificheAfterFind", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_PROGETTO_ID, 0, IMDB.Value(IMDBDef7.PQRY_PROGETTI6, IMDBDef7.PQSL_PROGETTI6_PROGETTO_ID, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DOCUMENTI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_ANNO_DOC, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC_OLD, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_ANNO_DOC, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_NUMERO_DOC, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC_OLD, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_NUMERO_DOC, 0));
        if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("N")), true))
        {
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_ANNO_PROG, 0));
          IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_NUMERO_PROG, 0));
          if (PAN_RETTIFICHE.IsNewRow())
          {
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("S")), true))
          {
            if (PAN_RETTIFICHE.IsNewRow())
            {
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
              IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
            }
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_ANNO_PROG, 0));
            IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_NUMERO_PROG, 0));
          }
        }
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMANPRCO, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_ANNO_PROG, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMNUPRCO, 0, IMDB.Value(IMDBDef10.PQRY_FAT19, IMDBDef10.PQSL_FAT19_NUMERO_PROG, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODBEN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEINFO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "UnloadEvent", _e);
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
    IDVariant v_DESCR = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Fattura: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      // 
      // E' una Fattura
      // 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(3)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0, (new IDVariant("S")));
      }
      else
      {
        // 
        // E' una Nota
        // 
        if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(2)), true) || IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(7)), true) || IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(8)), true))
        {
          IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0, (new IDVariant("N")));
        }
      }
      // 
      // Settaggio imputazione economica
      // 
      if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(6)), true) || IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0).equals((new IDVariant(8)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0, new IDVariant(MainFrm.MODAIMPUENTR));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0, new IDVariant(MainFrm.MODAIMPUSPES));
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as T03DESCRIZIO ");
      SQL.append("from ");
      SQL.append("  T03 A ");
      SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.STORNO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMESTORN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCR = QV.Get("T03DESCRIZIO", IDVariant.STRING) ;
      }
      QV.Close();
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      RiempiRETFAT((new IDVariant(-1)));
      PAN_RETTIFICHE.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_RETTIFICHE.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_RETTIFICHE.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMRPPATT, 0, MainFrm.FunctionRppAttiva());
      PAN_RETTIFICHE.set_FieldText(PFL_RETTIFICHE_ETICHETTA, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMDOC, 0))), (new IDVariant(" "))), (new IDVariant("del "))), MainFrm.Datetostring(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMDATDOC, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFORNI, 0)).stringValue());
      DisabilitaCampi();
      VisibilitaEconomica();
      PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_RETTIFICHE.set_ToolTip(Glb.OBJ_FIELD,PFL_RETTIFICHE_INFODOC,(new IDVariant("Info Doc.")).stringValue()); 
      PAN_RETTIFICHE.set_ToolTip(Glb.OBJ_FIELD,PFL_RETTIFICHE_RIEPILOGOIVA,(new IDVariant("Riepilogo IVA")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Fattore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMDATPRO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "ApriFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMDATPRO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "ApriCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Progetto ID
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriProgettoID ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Progetto ID Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "ApriProgettoID", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Documento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriDocumento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Documento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMCODBEN, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODBEN, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAM24, IMDBDef2.FLD_PARAM24_ROWNAMCODDOC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0));
      MainFrm.Show(MyGlb.FRM_DOCUMENTI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "ApriDocumento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi RETFAT
  // Explain which processing is carried out by this procedure
  // Load - Input
  // **********************************************************************
  public int RiempiRETFAT (IDVariant Load)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi RETFAT Body
      // Procedure Body
      // 
      RIEMPIRETFAT_RETFDELEROWS();
      RIEMPIRETFAT_RETFINSEROWS();
      if ((Load.booleanValue()))
      {
        IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
        RIEMPIRETFAT_CFASELINTV78();
        if (!IMDB.Eof(IMDBDef10.QRY_CFASELINTV78, 0))
        {
          v_CONTA = IMDB.Value(IMDBDef10.QRY_CFASELINTV78, IMDBDef10.QSL_CFASELINTV78_COUNT, 0, IDVariant.INTEGER) ;
        }
        if (v_CONTA.equals((new IDVariant(0)), true))
        {
          RIEMPIRETFAT_IMPECO3();
          while (!IMDB.Eof(IMDBDef10.QRY_IMPECO3, 0))
          {
            RIEMPIRETFAT_RETFINSEINTO();
            IMDB.TblMoveNext(IMDBDef10.QRY_IMPECO3, 0);
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "RiempiRETFAT", _e);
      return -1;
    }
  }

  // **********************************************************************
  // RETFAT: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMPIRETFAT_RETFDELEROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef2.TBL_RETFAT);
  }

  // **********************************************************************
  // RETFAT: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMPIRETFAT_RETFINSEROWS() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as RETFATPROGRE, ");
    SQL.append("  A.DESCRIZIONE as RETFATDESCRI, ");
    SQL.append("  A.IMPORTO as RETFATIMPORT, ");
    SQL.append("  A.D_DATA_REG as RETFDDATAREG, ");
    SQL.append("  A.FAT_ANNO_PROG_FAT as RETFATANPRFA, ");
    SQL.append("  A.FAT_NUMERO_PROG_FAT as RETFATNUPRFA, ");
    SQL.append("  A.FAT_ANNO_PROG_NAC as RETFATANPRNA, ");
    SQL.append("  A.FAT_NUMERO_PROG_NAC as RETFATNUPRNA, ");
    SQL.append("  A.COD_REC as RETFATCODREC, ");
    SQL.append("  A.FATTORE as RETFATFATTOR, ");
    SQL.append("  A.CENTRO as RETFATCENTRO, ");
    SQL.append("  A.COMPETENZA_DAL as RETFACOMPDAL, ");
    SQL.append("  A.COMPETENZA_AL as RETFACOMPEAL, ");
    SQL.append("  A.IMPORTO_EURO as RETFIMPOEURO, ");
    SQL.append("  A.PROGETTO_ID as RETFAPROGEID, ");
    SQL.append("  A.UTENTE_INSERIMENTO as RETFUTENINSE, ");
    SQL.append("  A.DATA_INSERIMENTO as RETFDATAINSE, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as RETUTEULTAGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as RETDATULTAGG, ");
    SQL.append("  B.ANNO_DOC as FATANNODOC1, ");
    SQL.append("  B.ANNO_DOC as FATANNODOC, ");
    SQL.append("  B.NUMERO_DOC as FATNUMERODO1, ");
    SQL.append("  B.NUMERO_DOC as FATNUMERODOC, ");
    SQL.append("  A.IMPORTO_IVA as RETFAIMPOIVA, ");
    SQL.append("  A.IMPORTO_IVA_IST as RETIMPIVAIST, ");
    SQL.append("  A.TIPO_REGISTRO_DEF as RETTIPREGDEF, ");
    SQL.append("  A.TIPO_BOLLATO_DEF as RETTIPBOLDEF, ");
    SQL.append("  B.ANNO_PROG as FATANNOPROG, ");
    SQL.append("  B.NUMERO_PROG as FATNUMERPROG ");
    SQL.append("from ");
    SQL.append("  RETFAT A, ");
    SQL.append("  FAT B ");
    SQL.append("where (B.ANNO_PROG(+) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N', A.FAT_ANNO_PROG_FAT, A.FAT_ANNO_PROG_NAC)) ");
    SQL.append("and   (B.NUMERO_PROG(+) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'N', A.FAT_NUMERO_PROG_FAT, A.FAT_NUMERO_PROG_NAC)) ");
    SQL.append("and   ((A.COD_REC IS NULL)) ");
    SQL.append("and   (DECODE(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'S', A.FAT_ANNO_PROG_FAT, A.FAT_ANNO_PROG_NAC) = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (DECODE(" + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'S', A.FAT_NUMERO_PROG_FAT, A.FAT_NUMERO_PROG_NAC) = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef2.TBL_RETFAT, 0);
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_PROGRESSIVO,0,RS.Get(1));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DESCRIZIONE,0,RS.Get(2));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_D_DATA_REG,0,new IDVariant(RS.Get(4),IDVariant.DATETIME));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_FAT,0,RS.Get(5));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_FAT,0,RS.Get(6));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_NAC,0,RS.Get(7));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_NAC,0,RS.Get(8));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COD_REC,0,RS.Get(9));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_FATTORE,0,RS.Get(10));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_CENTRO,0,RS.Get(11));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COMPETENZA_DAL,0,new IDVariant(RS.Get(12),IDVariant.DATETIME));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_COMPETENZA_AL,0,new IDVariant(RS.Get(13),IDVariant.DATETIME));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_EURO,0,RS.Get(14));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_PROGETTO_ID,0,RS.Get(15));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_UTENTE_INSERIMENTO,0,RS.Get(16));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DATA_INSERIMENTO,0,new IDVariant(RS.Get(17),IDVariant.DATETIME));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_UTENTE_ULTIMO_AGG,0,RS.Get(18));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_DATA_ULTIMO_AGG,0,new IDVariant(RS.Get(19),IDVariant.DATETIME));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ANNO_DOC,0,RS.Get(20));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ANNO_DOC_OLD,0,RS.Get(21));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_NUMERO_DOC,0,RS.Get(22));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_NUMERO_DOC_OLD,0,RS.Get(23));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_IVA,0,RS.Get(24));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_IMPORTO_IVA_IST,0,RS.Get(25));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_TIPO_REGISTRO_DEF,0,RS.Get(26));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_TIPO_BOLLATO_DEF,0,RS.Get(27));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMANPRCO,0,RS.Get(28));
      IMDB.set_Value(IMDBDef2.TBL_RETFAT,IMDBDef2.FLD_RETFAT_ROWNAMNUPRCO,0,RS.Get(29));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void RIEMPIRETFAT_CFASELINTV78() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_CFASELINTV78);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef2.TBL_RETFAT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_RETFAT, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
      IMDB.TblMoveNext(IMDBDef2.TBL_RETFAT, 0);
      if (IMDB.Eof(IMDBDef2.TBL_RETFAT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_RETFAT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef10.QRY_CFASELINTV78, 0);
              IMDB.set_Value(IMDBDef10.QRY_CFASELINTV78, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_CFASELINTV78, 0);
  }

  // **********************************************************************
  // IMP ECO
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void RIEMPIRETFAT_IMPECO3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.QRY_IMPECO3);
    IMDB.TblMoveFirst(IMDBDef2.TBL_IMPECO4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_IMPECO4, 0))
    {
      IMDB.TblAddNew(IMDBDef10.QRY_IMPECO3, 0);
      IMDB.TblLinkRow(IMDBDef10.QRY_IMPECO3, 0, IMDBDef2.TBL_IMPECO4, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_IMPECO3, 0, 0, IMDBDef2.TBL_IMPECO4, IMDBDef2.FLD_IMPECO4_FATTORE, 0);
      IMDB.TblLinkField(IMDBDef10.QRY_IMPECO3, 1, 0, IMDBDef2.TBL_IMPECO4, IMDBDef2.FLD_IMPECO4_CENTRO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_IMPECO4, 0);
      if (IMDB.Eof(IMDBDef2.TBL_IMPECO4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_IMPECO4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.QRY_IMPECO3, 0);
  }

  // **********************************************************************
  // RETFAT: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void RIEMPIRETFAT_RETFINSEINTO() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef2.TBL_RETFAT, 0);
    IMDB.set_Value(IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_FATTORE, 0, IMDB.Value(IMDBDef10.QRY_IMPECO3, IMDBDef10.QSL_IMPECO3_IMPECOFATTOR, 0));
    IMDB.set_Value(IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_CENTRO, 0, IMDB.Value(IMDBDef10.QRY_IMPECO3, IMDBDef10.QSL_IMPECO3_IMPECOCENTRO, 0));
    IMDB.set_Value(IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_IMPORTO, 0, (new IDVariant()));
    IMDB.set_Value(IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_D_DATA_REG, 0, IDL.Today());
    IMDB.set_Value(IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_ROWNAMESTATO, 0, (new IDVariant("I")));
  }

  // **********************************************************************
  // Salva Rettifiche
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SalvaRettifiche ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Salva Rettifiche Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_RETTIFICHE.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0)))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Inserire l'importo!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          return 0;
        }
        if (Controlli(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0), IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0)))
        {
          PAN_RETTIFICHE.PanelCommand(Glb.PCM_UPDATE);
        }
        else
        {
          return 0;
        }
        MainFrm.Cf4armDBObject.BeginTrans();
        IMDB.TblMoveFirst (IMDBDef10.PQRY_RETFAT1_RS, 0);
        while (!IMDB.Eof(IMDBDef10.PQRY_RETFAT1_RS, 0))
        {
          if (IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0).equals((new IDVariant("U")), true) || IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0).equals((new IDVariant("I")), true))
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0)))
            {
              IDVariant v_VGETATTIVDOC = new IDVariant(0,IDVariant.STRING);
              IDVariant v_VFATTRATTIVA = new IDVariant(0,IDVariant.STRING);
              IDVariant v_VFATIMPORTOT = new IDVariant(0,IDVariant.DECIMAL);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  GET_ATTIVITA_DOC(A.ANNO_PROG,A.NUMERO_PROG) as GEATDOFAPFNP, ");
              SQL.append("  A.TRATTAMENTO_IVA as FATTRATTAIVA, ");
              SQL.append("  A.IMPORTO + NVL(A.VARIAZIONI, 0) as FAIMNUVAFAV0 ");
              SQL.append("from ");
              SQL.append("  FAT A ");
              SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VGETATTIVDOC = QV.Get("GEATDOFAPFNP", IDVariant.STRING) ;
                v_VFATTRATTIVA = QV.Get("FATTRATTAIVA", IDVariant.STRING) ;
                v_VFATIMPORTOT = QV.Get("FAIMNUVAFAV0", IDVariant.DECIMAL) ;
              }
              QV.Close();
              if (!(IDL.IsNull(v_VFATTRATTIVA)) && v_VGETATTIVDOC.equals((new IDVariant("P")), true))
              {
                if (IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0).compareTo(v_VFATIMPORTOT, true)<0)
                {
                  IDVariant S = new IDVariant(0,IDVariant.STRING);
                  S = (new IDVariant("Tipo Bollato Def. obbligatorio per la fattura promiscua "));
                  MainFrm.set_AlertMessage(IDL.Add(S, IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0))); 
                  MainFrm.Cf4armDBObject.RollbackTrans();
                  PAN_RETTIFICHE.SetModified(MainFrm);
                  return 0;
                }
              }
            }
          }
          if (IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0).equals((new IDVariant("U")), true))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("update RETFAT set ");
              SQL.append("  DESCRIZIONE = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_DESCRIZIONE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  IMPORTO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  D_DATA_REG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  FAT_ANNO_PROG_FAT = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  FAT_NUMERO_PROG_FAT = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  FAT_ANNO_PROG_NAC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  FAT_NUMERO_PROG_NAC = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  COMPETENZA_DAL = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_COMPETENZA_DAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  COMPETENZA_AL = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_COMPETENZA_AL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  PROGETTO_ID = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_PROGETTO_ID, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  DATA_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_DATA_ULTIMO_AGG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  IMPORTO_IVA = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  IMPORTO_IVA_IST = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TIPO_REGISTRO_DEF = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TIPO_BOLLATO_DEF = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e16)
            {
              MainFrm.set_AlertMessage(new IDVariant(e16.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              PAN_RETTIFICHE.SetModified(MainFrm);
              return 0;
            }
          }
          if (IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_ROWNAMESTATO, 0).equals((new IDVariant("I")), true))
          {
            try
            {
              // SQL = new StringBuffer();
              // SQL.append("select ");
              // SQL.append("  MAX(A.PROGRESSIVO) + 1 as MAXRETPROUNO ");
              // SQL.append("from ");
              // SQL.append("  RETFAT A ");
              // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              // if (!QV.EOF()) QV.MoveNext();
              // if (!QV.EOF())
              // {
              //   v_PROGRESSIVO = QV.Get("MAXRETPROUNO", IDVariant.INTEGER) ;
              // }
              // QV.Close();
              SQL = new StringBuffer();
              SQL.append("insert into RETFAT ");
              SQL.append("( ");
              SQL.append("  PROGRESSIVO, ");
              SQL.append("  DESCRIZIONE, ");
              SQL.append("  IMPORTO, ");
              SQL.append("  D_DATA_REG, ");
              SQL.append("  FAT_ANNO_PROG_FAT, ");
              SQL.append("  FAT_NUMERO_PROG_FAT, ");
              SQL.append("  FAT_ANNO_PROG_NAC, ");
              SQL.append("  FAT_NUMERO_PROG_NAC, ");
              SQL.append("  FATTORE, ");
              SQL.append("  CENTRO, ");
              SQL.append("  COMPETENZA_DAL, ");
              SQL.append("  COMPETENZA_AL, ");
              SQL.append("  PROGETTO_ID, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO, ");
              SQL.append("  UTENTE_ULTIMO_AGG, ");
              SQL.append("  DATA_ULTIMO_AGG, ");
              SQL.append("  IMPORTO_IVA, ");
              SQL.append("  IMPORTO_IVA_IST, ");
              SQL.append("  TIPO_REGISTRO_DEF, ");
              SQL.append("  TIPO_BOLLATO_DEF ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  to_number(NULL), ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_DESCRIZIONE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_IMPORTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_D_DATA_REG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_COMPETENZA_DAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_COMPETENZA_AL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_PROGETTO_ID, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_UTENTE_INSERIMENTO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_DATA_INSERIMENTO, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_UTENTE_ULTIMO_AGG, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_DATA_ULTIMO_AGG, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA_IST, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_TIPO_REGISTRO_DEF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1_RS, IMDBDef10.PQSL_RETFAT1_TIPO_BOLLATO_DEF, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e20)
            {
              MainFrm.set_AlertMessage(new IDVariant(e20.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              PAN_RETTIFICHE.SetModified(MainFrm);
              return 0;
            }
          }
          IMDB.TblMoveNext(IMDBDef10.PQRY_RETFAT1_RS, 0);
        }
        MainFrm.Cf4armDBObject.CommitTrans();
        RiempiRETFAT((new IDVariant(0)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "SalvaRettifiche", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cancella Rettifica
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CancellaRettifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella Rettifica Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.BeginTrans();
      try
      {
        SQL = new StringBuffer();
        SQL.append("delete from RETFAT ");
        SQL.append("where (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      catch (Exception e3)
      {
        MainFrm.set_AlertMessage(new IDVariant(e3.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      RiempiRETFAT((new IDVariant(0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "CancellaRettifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Campi
  // Explain which processing is carried out by this procedure
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
      if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEINFO, 0).equals((new IDVariant("I")), true))
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI2+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMANDI2+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "DisabilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilita Economica
  // **********************************************************************
  public int VisibilitaEconomica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilita Economica Body
      // Procedure Body
      // 
      if (IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0))) && IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0).compareTo((new IDVariant("LI")), true)!=0)
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMRPPATT, 0).equals((new IDVariant(1)), true))
        {
          PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if ((MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0)))) && IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMIMPECO, 0).compareTo((new IDVariant("LI")), true)!=0)
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.SetFlags (Glb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_RETTIFICHE.set_ObjRect(Glb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_RETTIFICHE.ObjRect(Glb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "VisibilitaEconomica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli
  // Explain which processing is carried out by this procedure
  // p Importo - Input
  // p Stato Riga - Input
  // **********************************************************************
  public boolean Controlli (IDVariant pImporto, IDVariant pStatoRiga)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ANNO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODICEDOCRET1 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODICEDOCRET = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOPROG = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROPROG = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NLIQNNMANDAT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NLIQCONMANDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NIMPECO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Il documento ", IDVariant.STRING));
      v_MESSAGGIO1 = (new IDVariant(" è già stato liquidato.Si vuole rettificare l'importo della liquidazione?", IDVariant.STRING));
      // 
      // Controlli Body
      // Procedure Body
      // 
      IDVariant v_VNACTOTIMP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VNACTOTIVA = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VNACIVAPROP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VFATTOTIMP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VLIQIMP = null;
      v_VLIQIMP = (new IDVariant(0, IDVariant.DECIMAL));
      IDVariant v_VLIQIMPIVA = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VLIQIMPIVAIS = null;
      v_VLIQIMPIVAIS = (new IDVariant(0, IDVariant.DECIMAL));
      // 
      // EG. 26/03/2019 : Gestito errore "Division by zero"
      // con messaggio che blocca l'aggiornamento della liquidazione
      // EG. 17/05/2019 : Aggiornamento della liquidazione solo
      // in inserimento: valutare se permettere anche l'aggiornamento
      // della liquidazione in variazione positiva dell'importo
      // 
      v_SALVATO = (new IDVariant(-1));
      v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, IDL.ToString(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_NUMERO_DOC, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ANNO_DOC, 0))), v_MESSAGGIO1);
      v_ANNOPROG = IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0);
      v_NUMEROPROG = IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0);
      if (IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMEFATTU, 0).equals((new IDVariant("S")), true))
      {
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
        v_ANNO = IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0),(new IDVariant(0)));
        v_NUMERO = IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0),(new IDVariant(0)));
      }
      else
      {
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMANNPRO, 0));
        IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0, IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMNUMPRO, 0));
        v_ANNO = IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0),(new IDVariant(0)));
        v_NUMERO = IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0),(new IDVariant(0)));
      }
      v_CODICEDOCRET1 = IMDB.Value(IMDBDef2.TBL_PARAM23, IMDBDef2.FLD_PARAM23_ROWNAMCODDOC, 0);
      if (v_ANNO.equals((new IDVariant(0)), true) && v_NUMERO.equals((new IDVariant(0)), true))
      {
        v_CODICEDOCRET = (new IDVariant(0));
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE_DOC as FATCODICEDOC ");
        SQL.append("from ");
        SQL.append("  FAT A ");
        SQL.append("where (A.ANNO_PROG = " + IDL.CSql(v_ANNO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(v_NUMERO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CODICEDOCRET = QV.Get("FATCODICEDOC", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if ((v_CODICEDOCRET.equals((new IDVariant(3)), true) && v_CODICEDOCRET1.equals((new IDVariant(4)), true)) || (v_CODICEDOCRET.equals((new IDVariant(4)), true) && v_CODICEDOCRET1.equals((new IDVariant(3)), true)))
      {
        IDVariant v_NPRE = new IDVariant(0,IDVariant.INTEGER);
        // 
        // Ricerca presenza ordinativi collegati alla fattura
        // per avviso di non rettifica degli ordinativi
        // 
        // 
        if (v_CODICEDOCRET.equals((new IDVariant(3)), true) && v_CODICEDOCRET1.equals((new IDVariant(4)), true))
        {
          v_ANNOPROG = new IDVariant(v_ANNO);
          v_NUMEROPROG = new IDVariant(v_NUMERO);
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PRE A ");
        SQL.append("where (A.FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NPRE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NPRE.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("La rettifica viene registrata senza aggiornamento degli ordinativi presenti per il documento.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
        }
      }
      if (v_CODICEDOCRET.equals((new IDVariant(1)), true) && v_CODICEDOCRET1.equals((new IDVariant(2)), true))
      {
        v_ANNOPROG = new IDVariant(v_ANNO);
        v_NUMEROPROG = new IDVariant(v_NUMERO);
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A ");
      SQL.append("where (A.FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NLIQNNMANDAT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A ");
      SQL.append("where (A.FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NOT ((A.NUMERO_MAND IS NULL))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NLIQCONMANDA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A ");
      SQL.append("where (A.FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NLIQ = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NLIQ.equals((new IDVariant(1)), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ANNO_LIQ as ANNOLIQ, ");
        SQL.append("  A.NUMERO_LIQ as NUMEROLIQ ");
        SQL.append("from ");
        SQL.append("  LIQ A ");
        SQL.append("where (A.FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ANNOLIQ = QV.Get("ANNOLIQ", IDVariant.INTEGER) ;
          v_NUMEROLIQ = QV.Get("NUMEROLIQ", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  IMP_ECO A ");
        SQL.append("where (A.ANNO_LIQ = " + IDL.CSql(v_ANNOLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NIMPECO = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        // 
        // Calcolo totali nota e fattura
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MAX(A.IMPORTO) as MAXFATIMPORT, ");
        SQL.append("  SUM(B.IVA) as SUMIVA ");
        SQL.append("from ");
        SQL.append("  FAT A, ");
        SQL.append("  IVA B ");
        SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.TIPO_REGISTRO <> 3) ");
        SQL.append("and   (B.ANNO_PROG = A.ANNO_PROG) ");
        SQL.append("and   (B.NUMERO_PROG = A.NUMERO_PROG) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VNACTOTIMP = QV.Get("MAXFATIMPORT", IDVariant.DECIMAL) ;
          v_VNACTOTIVA = QV.Get("SUMIVA", IDVariant.DECIMAL) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_VNACTOTIMP)) && v_VNACTOTIMP.compareTo((new IDVariant(0)), true)!=0)
        {
          v_VNACIVAPROP = IDL.Div(IDL.Mul(pImporto, v_VNACTOTIVA), v_VNACTOTIMP);
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  SUM(A.IMPORTO) as SUMFATIMPORT ");
        SQL.append("from ");
        SQL.append("  FAT A ");
        SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VFATTOTIMP = QV.Get("SUMFATIMPORT", IDVariant.DECIMAL) ;
        }
        QV.Close();
        // 
        // Lettura dati liquidazione da modificare
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.IMPORTO as LIQIMPORTO, ");
        SQL.append("  A.IMPORTO_IVA as LIQIMPORTIVA, ");
        SQL.append("  A.IMPORTO_IVA_IST as LIQIMPIVAIST ");
        SQL.append("from ");
        SQL.append("  LIQ A ");
        SQL.append("where (A.FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VLIQIMP = QV.Get("LIQIMPORTO", IDVariant.DECIMAL) ;
          v_VLIQIMPIVA = QV.Get("LIQIMPORTIVA", IDVariant.DECIMAL) ;
          v_VLIQIMPIVAIS = QV.Get("LIQIMPIVAIST", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      else
      {
        if (v_NLIQ.equals((new IDVariant(0)), true))
        {
          v_NIMPECO = (new IDVariant(-1));
        }
        else
        {
          v_NIMPECO = (new IDVariant(2));
        }
      }
      if (v_CODICEDOCRET1.equals((new IDVariant(1)), true) || v_CODICEDOCRET1.equals((new IDVariant(2)), true))
      {
        // 
        // Le liquidazioni non vengono rettificate se
        // - esistono più liquidazioni
        // - ci sono più imputazioni economiche
        // - esistono dei mandati legati a liquidazioni della
        // fattura di acquisto
        // 
        if (v_NLIQ.compareTo((new IDVariant(1)), true)>0 || v_NIMPECO.compareTo((new IDVariant(1)), true)>0 || v_NLIQCONMANDA.compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("La rettifica viene registrata senza aggiornamento delle liquidazioni presenti nel documento.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          return v_SALVATO.booleanValue();
        }
        if (v_CODICEDOCRET.equals((new IDVariant(2)), true) && v_NLIQNNMANDAT.equals((new IDVariant(1)), true) && v_NIMPECO.compareTo((new IDVariant(1)), true)<=0 && pStatoRiga.equals((new IDVariant("I")), true))
        {
          // 
          // Richiesta se rettificare la liquidazione
          // 
          IDVariant B = null;
          B = (new IDVariant(MainFrm.MessageConfirmEx(v_MESSAGGIO)));
          if (IDL.IsNull(B))
          {
            return (new IDVariant(0)).booleanValue();
          }
          if (B.booleanValue())
          {
            try
            {
              if (v_VNACTOTIMP.equals((new IDVariant(0)), true))
              {
                IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
                v_VMSG = (new IDVariant("Dati iva sul documento collegato non compilati correttamente"));
                MainFrm.set_AlertMessage(v_VMSG); 
                return (new IDVariant(0)).booleanValue();
              }
              // 
              // Se importo da stornare superiore a quello presente
              // in liquidazione non faccio lo storno
              // 
              if (pImporto.compareTo(v_VLIQIMP, true)>=0)
              {
                IDVariant v_VMSGUPDLIQ = new IDVariant(0,IDVariant.STRING);
                v_VMSGUPDLIQ = (new IDVariant("Rettifica importo liquidazione non eseguito perchè importo da rettificare superiore a quello della liquidazione"));
                MainFrm.set_AlertMessage(v_VMSGUPDLIQ); 
                return (new IDVariant(0)).booleanValue();
              }
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  IMPORTO = LIQ.IMPORTO - " + IDL.CSql(pImporto, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  IMPORTO_IVA = CASE WHEN NOT ((LIQ.IMPORTO_IVA IS NULL)) THEN LIQ.IMPORTO_IVA - NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", CASE WHEN " + IDL.CSql(v_VFATTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = " + IDL.CSql(v_VNACTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN " + IDL.CSql(v_VNACTOTIVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE " + IDL.CSql(v_VNACIVAPROP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END) ELSE LIQ.IMPORTO_IVA END, ");
              SQL.append("  IMPORTO_IVA_IST = CASE WHEN NOT ((LIQ.IMPORTO_IVA_IST IS NULL)) THEN LIQ.IMPORTO_IVA - NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", CASE WHEN " + IDL.CSql(v_VFATTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = " + IDL.CSql(v_VNACTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN " + IDL.CSql(v_VNACTOTIVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE " + IDL.CSql(v_VNACIVAPROP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END) ELSE LIQ.IMPORTO_IVA_IST END ");
              SQL.append("where (FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              if (v_NIMPECO.equals((new IDVariant(1)), true))
              {
                SQL = new StringBuffer();
                SQL.append("update IMP_ECO set ");
                SQL.append("  IMPORTO = IMP_ECO.IMPORTO - " + IDL.CSql(pImporto, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ANNO_LIQ = " + IDL.CSql(v_ANNOLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
            catch (Exception e28)
            {
              MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(new IDVariant(e28.getMessage()))); 
              v_SALVATO = (new IDVariant(0));
              return v_SALVATO.booleanValue();
            }
            v_SALVATO = (new IDVariant(-1));
          }
          else
          {
            v_SALVATO = (new IDVariant(-1));
            return v_SALVATO.booleanValue();
          }
        }
        else
        {
          if (v_CODICEDOCRET.equals((new IDVariant(1)), true) && v_NLIQNNMANDAT.equals((new IDVariant(1)), true) && v_NIMPECO.compareTo((new IDVariant(1)), true)<=0 && pStatoRiga.equals((new IDVariant("I")), true))
          {
            IDVariant B = null;
            B = (new IDVariant(MainFrm.MessageConfirmEx(v_MESSAGGIO)));
            if (IDL.IsNull(B))
            {
              return (new IDVariant(0)).booleanValue();
            }
            if (B.booleanValue())
            {
              try
              {
                if (v_VNACTOTIMP.equals((new IDVariant(0)), true))
                {
                  IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
                  v_VMSG = (new IDVariant("Dati iva sul documento collegato non compilati correttamente"));
                  MainFrm.set_AlertMessage(v_VMSG); 
                  return (new IDVariant(0)).booleanValue();
                }
                // 
                // Se importo da stornare superiore a quello presente
                // in liquidazione non faccio lo storno
                // 
                if (pImporto.compareTo(v_VLIQIMP, true)>=0)
                {
                  IDVariant v_VMSGUPDLIQ = new IDVariant(0,IDVariant.STRING);
                  v_VMSGUPDLIQ = (new IDVariant("Rettifica importo liquidazione non eseguito perchè importo da rettificare superiore a quello della liquidazione"));
                  MainFrm.set_AlertMessage(v_VMSGUPDLIQ); 
                  return (new IDVariant(0)).booleanValue();
                }
                SQL = new StringBuffer();
                SQL.append("update LIQ set ");
                SQL.append("  IMPORTO = LIQ.IMPORTO - " + IDL.CSql(pImporto, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  IMPORTO_IVA = CASE WHEN NOT ((LIQ.IMPORTO_IVA IS NULL)) THEN LIQ.IMPORTO_IVA - NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", CASE WHEN " + IDL.CSql(v_VFATTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = " + IDL.CSql(v_VNACTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN " + IDL.CSql(v_VNACTOTIVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE " + IDL.CSql(v_VNACIVAPROP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END) ELSE LIQ.IMPORTO_IVA END, ");
                SQL.append("  IMPORTO_IVA_IST = CASE WHEN NOT ((LIQ.IMPORTO_IVA_IST IS NULL)) THEN LIQ.IMPORTO_IVA - NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", CASE WHEN " + IDL.CSql(v_VFATTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = " + IDL.CSql(v_VNACTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN " + IDL.CSql(v_VNACTOTIVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE " + IDL.CSql(v_VNACIVAPROP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END) ELSE LIQ.IMPORTO_IVA_IST END ");
                SQL.append("where (FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                if (v_NIMPECO.equals((new IDVariant(1)), true))
                {
                  SQL = new StringBuffer();
                  SQL.append("update IMP_ECO set ");
                  SQL.append("  IMPORTO = IMP_ECO.IMPORTO - " + IDL.CSql(pImporto, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                  SQL.append("where (ANNO_LIQ = " + IDL.CSql(v_ANNOLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
              }
              catch (Exception e43)
              {
                MainFrm.set_AlertMessage(new IDVariant(e43.getMessage())); 
                v_SALVATO = (new IDVariant(0));
                return v_SALVATO.booleanValue();
              }
              v_SALVATO = (new IDVariant(-1));
            }
            else
            {
              v_SALVATO = (new IDVariant(-1));
              return v_SALVATO.booleanValue();
            }
          }
        }
      }
      else
      {
        if (v_CODICEDOCRET.equals((new IDVariant(1)), true) || v_CODICEDOCRET.equals((new IDVariant(3)), true) || v_CODICEDOCRET.equals((new IDVariant(7)), true))
        {
          if (v_NLIQ.compareTo((new IDVariant(1)), true)>0 || v_NLIQCONMANDA.compareTo((new IDVariant(0)), true)!=0 || v_NIMPECO.compareTo((new IDVariant(1)), true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("La rettifica viene registrata senza aggiornamento delle liquidazioni presenti nel documento.", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            return v_SALVATO.booleanValue();
          }
        }
        if (v_CODICEDOCRET.equals((new IDVariant(0)), true) && v_NLIQNNMANDAT.equals((new IDVariant(1)), true) && v_NIMPECO.compareTo((new IDVariant(1)), true)<=0)
        {
          if (v_NLIQ.compareTo((new IDVariant(1)), true)>=0 || v_NIMPECO.compareTo((new IDVariant(1)), true)>0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("La rettifica viene registrata senza aggiornamento delle liquidazioni presenti nel documento.", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            return v_SALVATO.booleanValue();
          }
          IDVariant B = null;
          B = (new IDVariant(MainFrm.MessageConfirmEx(v_MESSAGGIO)));
          if (IDL.IsNull(B))
          {
            return (new IDVariant(0)).booleanValue();
          }
          if (MainFrm.MessageConfirm(v_MESSAGGIO))
          {
            try
            {
              IDVariant v_VTOTIMPORNAC = new IDVariant(0,IDVariant.DECIMAL);
              IDVariant v_VSUMIVANAC = new IDVariant(0,IDVariant.DECIMAL);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  MAX(A.IMPORTO) as MAXFATIMPORT, ");
              SQL.append("  SUM(B.IVA) as SUMIVA ");
              SQL.append("from ");
              SQL.append("  FAT A, ");
              SQL.append("  IVA B ");
              SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_NAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (B.TIPO_REGISTRO <> 3) ");
              SQL.append("and   (B.ANNO_PROG = A.ANNO_PROG) ");
              SQL.append("and   (B.NUMERO_PROG = A.NUMERO_PROG) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VTOTIMPORNAC = QV.Get("MAXFATIMPORT", IDVariant.DECIMAL) ;
                v_VSUMIVANAC = QV.Get("SUMIVA", IDVariant.DECIMAL) ;
              }
              QV.Close();
              IDVariant v_VFATORIGIMPO = new IDVariant(0,IDVariant.DECIMAL);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  SUM(A.IMPORTO) as SUMFATIMPORT ");
              SQL.append("from ");
              SQL.append("  FAT A ");
              SQL.append("where (A.ANNO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_PROG = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_NUMERO_PROG_FAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VFATORIGIMPO = QV.Get("SUMFATIMPORT", IDVariant.DECIMAL) ;
              }
              QV.Close();
              if (v_VTOTIMPORNAC.equals((new IDVariant(0)), true))
              {
                IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
                v_VMSG = (new IDVariant("Importo documento collegato uguale a zero"));
                MainFrm.set_AlertMessage(v_VMSG); 
                return (new IDVariant(0)).booleanValue();
              }
              IDVariant v_IVAPROP = null;
              v_IVAPROP = IDL.Div(IDL.Mul(pImporto, v_VSUMIVANAC), v_VTOTIMPORNAC);
              SQL = new StringBuffer();
              SQL.append("update LIQ set ");
              SQL.append("  IMPORTO = LIQ.IMPORTO - " + IDL.CSql(pImporto, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  IMPORTO_IVA = CASE WHEN NOT ((LIQ.IMPORTO_IVA IS NULL)) THEN LIQ.IMPORTO_IVA - NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", CASE WHEN " + IDL.CSql(v_VFATTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = " + IDL.CSql(v_VNACTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN " + IDL.CSql(v_VNACTOTIVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE " + IDL.CSql(v_VNACIVAPROP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END) ELSE LIQ.IMPORTO_IVA END, ");
              SQL.append("  IMPORTO_IVA_IST = CASE WHEN NOT ((LIQ.IMPORTO_IVA_IST IS NULL)) THEN LIQ.IMPORTO_IVA - NVL(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_IMPORTO_IVA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", CASE WHEN " + IDL.CSql(v_VFATTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = " + IDL.CSql(v_VNACTOTIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " THEN " + IDL.CSql(v_VNACTOTIVA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ELSE " + IDL.CSql(v_VNACIVAPROP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " END) ELSE LIQ.IMPORTO_IVA_IST END ");
              SQL.append("where (FAT_ANNO_PROG = " + IDL.CSql(v_ANNOPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (FAT_NUMERO_PROG = " + IDL.CSql(v_NUMEROPROG, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              if (v_NIMPECO.equals((new IDVariant(1)), true))
              {
                SQL = new StringBuffer();
                SQL.append("update IMP_ECO set ");
                SQL.append("  IMPORTO = IMP_ECO.IMPORTO - " + IDL.CSql(pImporto, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ANNO_LIQ = " + IDL.CSql(v_ANNOLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(v_NUMEROLIQ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
            catch (Exception e61)
            {
              MainFrm.set_AlertMessage(new IDVariant(e61.getMessage())); 
              v_SALVATO = (new IDVariant(0));
              return v_SALVATO.booleanValue();
            }
            v_SALVATO = (new IDVariant(-1));
          }
          else
          {
            v_SALVATO = (new IDVariant(-1));
            return v_SALVATO.booleanValue();
          }
        }
      }
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "Controlli", _e);
      return false;
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
      PAN_RETTIFICHE.PanelCommand(Glb.PCM_INSERT);
      IMDB.set_Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_D_DATA_REG, 0, IDL.Today());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "Inserisci", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMANPRCO, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMNUPRCO, 0));
      MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riepilogoiva
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Riepilogoiva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riepilogoiva Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_FAT_ANNO_PROG_NAC, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGANPRFA, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMANPRCO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARS83, IMDBDef2.FLD_PARS83_NOMOGGNUPRFA, 0, IMDB.Value(IMDBDef10.PQRY_RETFAT1, IMDBDef10.PQSL_RETFAT1_ROWNAMNUPRCO, 0));
      MainFrm.Show(MyGlb.FRM_RIEPILOGOIVA, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Rettifiche", "Riepilogoiva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // RETFAT
  // Primary record source for panel data
  // **********************************************************************
  private void RETTIFICHE_RETFAT1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_RETFAT1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_RETFAT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_RETFAT, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_RETFAT1_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_RETFAT1_RS, 0, IMDBDef2.TBL_RETFAT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 0, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_NAC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 1, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_NAC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 2, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_IMPORTO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 3, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_D_DATA_REG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 4, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 5, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_FATTORE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 6, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_CENTRO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 7, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_COMPETENZA_DAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 8, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_COMPETENZA_AL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 9, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_PROGETTO_ID, 0);
      IMDB.set_Value(IMDBDef10.PQRY_RETFAT1_RS, 10, 0, (new IDVariant("A")));
      IMDB.set_Value(IMDBDef10.PQRY_RETFAT1_RS, 11, 0, (new IDVariant("A")));
      IMDB.set_Value(IMDBDef10.PQRY_RETFAT1_RS, 12, 0, (new IDVariant("A")));
      IMDB.set_Value(IMDBDef10.PQRY_RETFAT1_RS, 13, 0, (new IDVariant("A")));
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 14, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 15, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_FAT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 16, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_ANNO_DOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 17, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_NUMERO_DOC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 18, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_UTENTE_INSERIMENTO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 19, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_DATA_INSERIMENTO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 20, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_UTENTE_ULTIMO_AGG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 21, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_DATA_ULTIMO_AGG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 22, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_ROWNAMESTATO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 23, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_PROGRESSIVO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 24, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_IMPORTO_IVA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 25, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_IMPORTO_IVA_IST, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 26, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_TIPO_REGISTRO_DEF, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 27, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_TIPO_BOLLATO_DEF, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 28, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_ANNO_DOC_OLD, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 29, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_NUMERO_DOC_OLD, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 30, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_ROWNAMANPRCO, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_RETFAT1_RS, 31, 0, IMDBDef2.TBL_RETFAT, IMDBDef2.FLD_RETFAT_ROWNAMNUPRCO, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_RETFAT, 0);
      if (IMDB.Eof(IMDBDef2.TBL_RETFAT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_RETFAT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_RETFAT1_RS, 0);
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
  private void PAN_RETTIFICHE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RETTIFICHE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RETTIFICHE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RETTIFICHE, Cancel);
    // Stub
  }

  private void PAN_RETTIFICHE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RETTIFICHE_NUMERODOC)
    {
      this.IdxPanelActived = this.PAN_RETTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDocumento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFICHE_INFODOC)
    {
      this.IdxPanelActived = this.PAN_RETTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFICHE_RIEPILOGOIVA)
    {
      this.IdxPanelActived = this.PAN_RETTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Riepilogoiva();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFICHE_FATTORE1)
    {
      this.IdxPanelActived = this.PAN_RETTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFICHE_CENTRO1)
    {
      this.IdxPanelActived = this.PAN_RETTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RETTIFICHE_PROGETTOID)
    {
      this.IdxPanelActived = this.PAN_RETTIFICHE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProgettoID();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RETTIFICHE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_RETTIFICHE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_RETTIFICHE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RETTIFICHE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RETTIFICHE_Init()
  {

    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_FIELD, 46);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, "C2084110-6BDE-4DA6-AC34-261582E1A61B");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, "Anno Doc");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, "47A8A109-14B3-4BA9-88E5-1877D7AB761A");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, "Numero Doc");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, "1A9B684D-6EC4-4985-963A-568D52DA0F06");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, "IVA");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.VIS_VISULOOUPCF4);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, "C65A9D05-3467-409C-B125-37021C6C22DE");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, "Att.");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.VIS_VISULOOUPCF4);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, "00D4F160-7233-4405-A24F-71A1B2F36876");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, "Info Doc");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.VIS_HYPLINIMLOU1);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, "9359EE26-56A5-47FF-B15C-58E463681F67");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, "Riepilogoiva");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.VIS_HYPLINIMLOU1);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "C722F916-2423-4F0A-AE1A-2B0E97D95177");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "Importo");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, "D9F893B0-822C-407A-AF8F-35A870CC2170");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, "Importo IVA");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, "2A4738C5-82EF-4D82-B6BA-120BB83C8385");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, "di cui IVA Ist.");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.VIS_NORFIECF4IMP);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "D62D5EC1-B9F8-43E3-A44B-9F0C7EDA1664");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "Data Reg");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "8A6FA9C9-8175-4162-842B-D0B2D02F2364");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "Descrizione");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, "50E506BA-C497-428A-BE0A-6F94EE3A42CF");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, "FATTORE");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, "E9955837-C155-4330-88CD-865B36F9D6AF");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, "CENTRO");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, "2CE88379-00DA-44E5-80F5-56815351C5FA");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, "COMPETENZA DAL");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, "DA5E1226-2A8C-4E9F-AD93-F0A868548A16");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, "COMPETENZA AL");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, "BA01C96D-A0C2-4CEF-A8D4-51037C53D820");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, "Obiettivo Operativo");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, "FBEA576C-8BE6-45B8-A6D1-EC485F196351");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, "Documento Collegato");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, "2A26CF25-00D5-4461-B025-9E5D3ECC102A");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, "Fattore");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, MyGlb.VIS_LABEVISUSTYL);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, "E3F9F6C9-DC6C-452B-9560-47BE9BD38277");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, "Centro");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, MyGlb.VIS_LABEVISUSTYL);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, "1125FD60-55A8-441A-87C4-92321EE99384");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, "Competenza");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, MyGlb.VIS_LABEVISUSTYL);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, "60A075F1-09FC-4F1E-89B8-CBC970DA7FB1");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, "Fattore");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.VIS_VISULOOUPCF4);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, "480FF27C-592D-4882-84BD-77015F47BD19");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, "Centro");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.VIS_VISULOOUPCF4);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, "D1B3E552-5B0A-4432-B7AA-5AE8C55D9732");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, "Obiettivo Operativo");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.VIS_VISULOOUPCF4);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, "4A6BFCA2-0A96-474F-BDED-346632C161F4");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, "Stato");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, "5331DB07-C98D-4FC4-8409-7B6DF54A28ED");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, "FAT ANNO PROG NAC");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, "2F2BFBBB-599F-490C-A8E0-DA7760B9BDB7");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, "FAT NUMERO PROG NAC");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, "B034894D-A464-496D-A04E-6C24A4412519");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, "FAT ANNO PROG FAT");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, "DFF1C075-6C5C-4356-8206-BC2FD94BC7BA");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, "FAT NUMERO PROG FAT");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, "384D3E53-0900-4A0F-9DF7-2B3D9123C09F");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, "Apri Documento");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, "B6EDAF8A-4F22-4235-9E64-B7F4742A7E37");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, "Apri Fattore");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, "829B3D36-1505-4A2E-95F3-A2FCB56EB830");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, "Apri Centro");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, "A28F3141-9F08-4F7D-852A-2BD3DA7176DA");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, "Apri Progetto ID");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, "3E1A2AF3-7D41-4627-8DE0-DD7B245621B0");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, "6991CD3D-774C-4615-A951-FB5FC36B3492");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, "DATA INSERIMENTO");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, "08658E5C-EDC5-4DDF-B23D-35058E43EBF8");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, "699332C1-9F0D-4B55-80D5-F1C3FC49BF5F");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, "6F3A103D-38BA-46EF-937E-CD88D8D52490");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, "PROGRESSIVO");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, 0 | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, "09D9352F-69FB-41C5-B9CE-2B9A0C57F89D");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, MyGlb.VIS_ETICHEGRASSE);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, "F2BE69BA-D34F-4864-8614-722BB8499EC7");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, "Tipo Registro Def.");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, "E3974BCB-6100-4DCB-B54D-608446D7126F");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, "Tipo Bollato Def.");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, "3AA26868-522B-40F6-A4F3-FF9352657D95");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, "Tipo Bollato Def.");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.VIS_VISULOOUPCF4);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, "224D9B23-2855-48D3-B9E9-1F2C4E541380");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, "T04 Attivita ISTTipo Bollato DEF");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.VIS_LOOKUPFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, "34D85445-F7A9-4961-9284-DDB87C6A5992");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, "ANNO DOC OLD");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, "951CE4D6-7291-4A37-A0DE-905DF21D9BF1");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, "NUMERO DOC OLD");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, "7D51482B-524F-45F1-B230-897D190D042B");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, "ANNO PROG COLLEGATO");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.VIS_NORMFIELPADR);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RETTIFICHE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, "D296C26C-60B2-4B5E-BE43-F51DF586CF09");
    PAN_RETTIFICHE.set_Header(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, "NUMERO PROG COLLEGATO");
    PAN_RETTIFICHE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, "");
    PAN_RETTIFICHE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_RETTIFICHE.SetFlags(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_RETTIFICHE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_LIST, 0, 68, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_LIST, 116);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_LIST, "Anno Doc");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_FORM, 136);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOC, MyGlb.PANEL_FORM, "Anno Doc");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_ANNODOC, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_ANNODOC, PPQRY_RETFAT1, "A.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_LIST, 44, 68, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_LIST, 128);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_LIST, "Numero Doc");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_FORM, 196, 76, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_FORM, 144);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOC, MyGlb.PANEL_FORM, "Numero Doc");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_NUMERODOC, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_NUMERODOC, PPQRY_RETFAT1, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_LIST, 152, 68, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_LIST, 124);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_LIST, "IVA");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_FORM, 4, 556, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_FORM, 140);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TRATTAMENTOI, MyGlb.PANEL_FORM, "IVA");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_TRATTAMENTOI, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_TRATTAMENTOI, PPQRY_FAT, "CASE WHEN (A.TRATTAMENTO_IVA IS NULL) THEN '' ELSE CASE WHEN A.TRATTAMENTO_IVA = 'SP' THEN 'SP' ELSE 'RC' END END", "FATTRATTAIVA", 5, 99, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_LIST, 184, 68, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_LIST, 92);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_LIST, "Att.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_FORM, 4, 580, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_FORM, 100);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ATTIVITANAC, MyGlb.PANEL_FORM, "Att.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_ATTIVITANAC, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_ATTIVITANAC, PPQRY_FAT, "GET_ATTIVITA_DOC(A.ANNO_PROG,A.NUMERO_PROG)", "ATTIVITANAC", 5, 99, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_LIST, 216, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_LIST, 80);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_LIST, "I. D.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_FORM, 4, 592, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_FORM, 80);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_INFODOC, MyGlb.PANEL_FORM, "Info Doc");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_INFODOC, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_INFODOC, PPQRY_FAT, "'I'", "FATINFODOC", 5, 1, 0, -13997);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_INFODOC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_LIST, 236, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_LIST, 104);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_LIST, "R.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_FORM, 4, 616, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_FORM, 104);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_RIEPILOGOIVA, MyGlb.PANEL_FORM, "Riepilogoiva");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_RIEPILOGOIVA, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_RIEPILOGOIVA, PPQRY_FAT, "'F'", "FATRIEPILOGO", 5, 1, 0, -13997);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_RIEPILOGOIVA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 256, 68, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 4, 100, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_IMPORTO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_IMPORTO, PPQRY_RETFAT1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_LIST, 336, 68, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo IVA");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 508, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo IVA");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_IMPORTOIVA, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_IMPORTOIVA, PPQRY_RETFAT1, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_LIST, 420, 68, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_LIST, 152);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_LIST, "di cui IVA Ist.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_FORM, 4, 532, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_FORM, 152);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_IMPORTIVAIST, MyGlb.PANEL_FORM, "di cui IVA Ist.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_IMPORTIVAIST, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_IMPORTIVAIST, PPQRY_RETFAT1, "A.IMPORTO_IVA_IST", "IMPORTO_IVA_IST", 3, 14, 2, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 504, 68, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_LIST, "Data Reg");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DATAREG, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DATAREG, PPQRY_RETFAT1, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 588, 68, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DESCRIZIONE, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DESCRIZIONE, PPQRY_RETFAT1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_LIST, 804, 68, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_LIST, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_LIST, "FATTORE");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_FORM, 4, 172, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_FORM, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE1, MyGlb.PANEL_FORM, "FATTORE");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_FATTORE1, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_FATTORE1, PPQRY_RETFAT1, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_LIST, 924, 68, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_LIST, 52);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_LIST, "CENTRO");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_FORM, 4, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_FORM, 52);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO1, MyGlb.PANEL_FORM, "CENTRO");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_CENTRO1, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_CENTRO1, PPQRY_RETFAT1, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_LIST, 1044, 68, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_LIST, "COMPETENZA DAL");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 220, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZDAL, MyGlb.PANEL_FORM, "COMPET. DAL");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_COMPETENZDAL, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_COMPETENZDAL, PPQRY_RETFAT1, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_LIST, 1124, 68, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_LIST, 92);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_LIST, "COMPETENZA AL");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_FORM, 92);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_COMPETENZAAL, MyGlb.PANEL_FORM, "COMPET. AL");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_COMPETENZAAL, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_COMPETENZAAL, PPQRY_RETFAT1, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_LIST, 1204, 68, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_FORM, 4, 268, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_FORM, 76);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTOID, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_PROGETTOID, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_PROGETTOID, PPQRY_RETFAT1, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, MyGlb.PANEL_LIST, 0, 32, 256, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, MyGlb.PANEL_FORM, 0, 0, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABEL, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_LABEL, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, MyGlb.PANEL_LIST, 804, 32, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, MyGlb.PANEL_FORM, 516, 0, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELFATTORE, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_LABELFATTORE, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_LABELFATTORE, -1, "", "LABELFATTORE", 0, 0, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, MyGlb.PANEL_LIST, 924, 32, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, MyGlb.PANEL_FORM, 524, 8, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCENTRO, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_LABELCENTRO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_LABELCENTRO, -1, "", "LABELCENTRO", 0, 0, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, MyGlb.PANEL_LIST, 1044, 32, 160, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, MyGlb.PANEL_FORM, 532, 16, 76, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_LABELCOMPETE, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_LABELCOMPETE, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_LABELCOMPETE, -1, "", "LABELCOMPETE", 0, 0, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_LIST, 76, 288, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_FORM, 4, 484, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_FORM, 124);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_FATTORE, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_FATTORE, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_LIST, 84, 312, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_LIST, 48);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_FORM, 4, 484, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_FORM, 116);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_CENTRO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_CENTRO, PPQRY_CENTRI, "A.DESCRIZIONE", "FATTCENTDESC", 5, 200, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_LIST, 12, 336, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_LIST, 120);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_FORM, 4, 484, 644, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_FORM, 132);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGETTO, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_PROGETTO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_PROGETTO, PPQRY_PROGETTI, "A.DESCRIZIONE", "FATTPROGDESC", 5, 100, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_LIST, 936, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_LIST, 36);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_FORM, 4, 700, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_FORM, 36);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_STATO, MyGlb.PANEL_FORM, "St.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_STATO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_STATO, PPQRY_RETFAT1, "A.ROWNAMESTATO", "ROWNAMESTATO", 5, 1, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_LIST, 936, 68, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_LIST, 116);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_LIST, "F. A. P. N.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_FORM, 4, 508, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_FORM, 116);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPRONAC, MyGlb.PANEL_FORM, "FAT ANN. PROG NAC");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_FATANNPRONAC, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_FATANNPRONAC, PPQRY_RETFAT1, "A.FAT_ANNO_PROG_NAC", "FAT_ANNO_PROG_NAC", 1, 4, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_LIST, 972, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_LIST, 128);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_LIST, "FAT NUM. PROG NAC");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_FORM, 4, 532, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_FORM, 128);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPRONAC, MyGlb.PANEL_FORM, "FAT NUM. PROG NAC");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_FATNUMPRONAC, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_FATNUMPRONAC, PPQRY_RETFAT1, "A.FAT_NUMERO_PROG_NAC", "FAT_NUMERO_PROG_NAC", 1, 5, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_LIST, 1036, 68, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_LIST, 112);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_LIST, "F. AN. PR. F.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_FORM, 4, 556, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_FORM, 112);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATANNPROFAT, MyGlb.PANEL_FORM, "FAT ANN. PRG. FAT");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_FATANNPROFAT, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_FATANNPROFAT, PPQRY_RETFAT1, "A.FAT_ANNO_PROG_FAT", "FAT_ANNO_PROG_FAT", 1, 4, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_LIST, 1072, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_LIST, 128);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_LIST, "FAT NUM. PROG FAT");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_FORM, 4, 580, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_FORM, 128);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_FATNUMPROFAT, MyGlb.PANEL_FORM, "FAT NUM. PROG FAT");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_FATNUMPROFAT, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_FATNUMPROFAT, PPQRY_RETFAT1, "A.FAT_NUMERO_PROG_FAT", "FAT_NUMERO_PROG_FAT", 1, 5, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_LIST, 84);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_LIST, "Apri Documento");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_FORM, 4, 604, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_FORM, 84);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIDOCUMENT, MyGlb.PANEL_FORM, "Apri Documento");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_APRIDOCUMENT, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_APRIDOCUMENT, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_APRIDOCUMENT, PPQRY_RETFAT1, "", "RETFAPRIDOCU", 5, 1, 0, -13997);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIDOCUMENT, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_LIST, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_LIST, "Apri Fattore");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_FORM, 4, 604, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_FORM, 68);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIFATTORE, MyGlb.PANEL_FORM, "Apri Fattore");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_APRIFATTORE, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_APRIFATTORE, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_APRIFATTORE, PPQRY_RETFAT1, "", "RETFAPRIFATT", 5, 1, 0, -13997);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIFATTORE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_LIST, 64);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_LIST, "Apri Centro");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_FORM, 4, 604, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_FORM, 64);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRICENTRO, MyGlb.PANEL_FORM, "Apri Centro");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_APRICENTRO, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_APRICENTRO, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_APRICENTRO, PPQRY_RETFAT1, "", "RETFAPRICENT", 5, 1, 0, -13997);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRICENTRO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_LIST, 88);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_LIST, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_LIST, "Apri Progetto ID");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_FORM, 4, 604, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_FORM, 88);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_APRIPROGETID, MyGlb.PANEL_FORM, "Apri Progetto ID");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_APRIPROGETID, -1, -1);
    PAN_RETTIFICHE.SetFieldUnbound(PFL_RETTIFICHE_APRIPROGETID, true);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_APRIPROGETID, PPQRY_RETFAT1, "", "RETFAPRPROID", 5, 1, 0, -13997);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_RETTIFICHE.SetValueListItem(PFL_RETTIFICHE_APRIPROGETID, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_LIST, 1176, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 604, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_UTENTEINSERI, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_UTENTEINSERI, PPQRY_RETFAT1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_LIST, 1296, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_FORM, 4, 628, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DATAINSERIME, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DATAINSERIME, PPQRY_RETFAT1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_LIST, 1404, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 652, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_UTENTULTIAGG, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_UTENTULTIAGG, PPQRY_RETFAT1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_LIST, 1516, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 676, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_DATAULTIMAGG, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_DATAULTIMAGG, PPQRY_RETFAT1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_LIST, 1620, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 724, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_PROGRESSIVO, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_PROGRESSIVO, PPQRY_RETFAT1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, MyGlb.PANEL_LIST, 0, 4, 788, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, MyGlb.PANEL_LIST, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, MyGlb.PANEL_FORM, 0, 4, 472, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, MyGlb.PANEL_FORM, 0);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ETICHETTA, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_ETICHETTA, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_ETICHETTA, -1, "", "ETICHETTA", 0, 0, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_LIST, 1172, 68, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_LIST, 164);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_LIST, "Tipo Registro Def.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_FORM, 4, 556, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_FORM, 164);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOREGISDEF, MyGlb.PANEL_FORM, "Tipo Registro Def.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_TIPOREGISDEF, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_TIPOREGISDEF, PPQRY_RETFAT1, "A.TIPO_REGISTRO_DEF", "TIPO_REGISTRO_DEF", 1, 2, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_LIST, 1172, 68, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_LIST, 156);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_LIST, "Tipo Bollato Def.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_FORM, 4, 580, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_FORM, 156);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_TIPOBOLLADEF, MyGlb.PANEL_FORM, "Tipo Bollato Def.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_TIPOBOLLADEF, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_TIPOBOLLADEF, PPQRY_RETFAT1, "A.TIPO_BOLLATO_DEF", "TIPO_BOLLATO_DEF", 1, 2, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_LIST, 1304, 68, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_LIST, 124);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_LIST, "Tipo Bollato Def.");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_FORM, 4, 556, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_FORM, 124);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_FORM, 2);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04TIPBOLDEF, MyGlb.PANEL_FORM, "Tipo Bollato Def.");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_T04TIPBOLDEF, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_T04TIPBOLDEF, PPQRY_T04, "TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "T04TIPOBOLL1", 5, 142, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_LIST, 188);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_LIST, "T04 Attivita ISTTipo Bollato DEF");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_FORM, 4, 640, 696, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_FORM, 188);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_T04ATTISBODE, MyGlb.PANEL_FORM, "T04 Attivita ISTTipo Bollato DEF");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_T04ATTISBODE, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_T04ATTISBODE, PPQRY_T04, "SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.TIPO_BOLLATO)", "ATTISTBOLDEF", 5, 99, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_LIST, 92);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_LIST, "ANNO DOC OLD");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_FORM, 4, 640, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_FORM, 92);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNODOCOLD, MyGlb.PANEL_FORM, "ANNO DOC OLD");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_ANNODOCOLD, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_ANNODOCOLD, PPQRY_RETFAT1, "A.ANNO_DOC_OLD", "ANNO_DOC_OLD", 1, 4, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_LIST, 108);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_LIST, "NUMERO DOC OLD");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_FORM, 4, 664, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_FORM, 108);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMERODOCOLD, MyGlb.PANEL_FORM, "NUMERO DOC OLD");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_NUMERODOCOLD, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_NUMERODOCOLD, PPQRY_RETFAT1, "A.NUMERO_DOC_OLD", "NUMERO_DOC_OLD", 5, 20, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_LIST, 1652, 68, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_LIST, 140);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_LIST, "ANNO PROG COLLEGATO");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_FORM, 4, 640, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_FORM, 140);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_ANNOPROGCOLL, MyGlb.PANEL_FORM, "ANNO PROG COLLEGATO");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_ANNOPROGCOLL, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_ANNOPROGCOLL, PPQRY_RETFAT1, "A.ROWNAMANPRCO", "ROWNAMANPRCO", 1, 4, 0, -13997);
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_LIST, 1652, 68, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_LIST, 156);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_LIST, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_LIST, "NUMERO PROG COLLEGATO");
    PAN_RETTIFICHE.SetRect(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_FORM, 4, 664, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RETTIFICHE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_FORM, 156);
    PAN_RETTIFICHE.SetNumRow(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_FORM, 1);
    PAN_RETTIFICHE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RETTIFICHE_NUMEPROGCOLL, MyGlb.PANEL_FORM, "NUMERO PROG COLLEGATO");
    PAN_RETTIFICHE.SetFieldPage(PFL_RETTIFICHE_NUMEPROGCOLL, -1, -1);
    PAN_RETTIFICHE.SetFieldPanel(PFL_RETTIFICHE_NUMEPROGCOLL, PPQRY_RETFAT1, "A.ROWNAMNUPRCO", "ROWNAMNUPRCO", 1, 5, 0, -13997);
  }

  private void PAN_RETTIFICHE_InitQueries()
  {
    StringBuffer SQL;

    PAN_RETTIFICHE.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   (A.DATA_VALIDITA >= ~~TBL_PARAM23.ROWNAMDATPRO~~ OR (A.DATA_VALIDITA IS NULL)) ");
    PAN_RETTIFICHE.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RETTIFICHE.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTCENTDESC ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   (A.DATA_VALIDITA >= ~~TBL_PARAM23.ROWNAMDATPRO~~ OR (A.DATA_VALIDITA IS NULL)) ");
    PAN_RETTIFICHE.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RETTIFICHE.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTPROGDESC ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~PROGETTO_ID~~) ");
    PAN_RETTIFICHE.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RETTIFICHE.SetMasterTable(PPQRY_PROGETTI, "PROGETTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN (A.TRATTAMENTO_IVA IS NULL) THEN '' ELSE CASE WHEN A.TRATTAMENTO_IVA = 'SP' THEN 'SP' ELSE 'RC' END END as FATTRATTAIVA, ");
    SQL.append("  GET_ATTIVITA_DOC(A.ANNO_PROG,A.NUMERO_PROG) as ATTIVITANAC, ");
    SQL.append("  'I' as FATINFODOC, ");
    SQL.append("  'F' as FATRIEPILOGO ");
    SQL.append("from ");
    SQL.append("  FAT A ");
    SQL.append("where (A.ANNO_PROG = ~~ROWNAMANPRCO~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~ROWNAMNUPRCO~~) ");
    PAN_RETTIFICHE.SetQuery(PPQRY_FAT, 0, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryDB(PPQRY_FAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RETTIFICHE.SetMasterTable(PPQRY_FAT, "FAT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04TIPOBOLL1, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.TIPO_BOLLATO) as ATTISTBOLDEF ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = ~~TIPO_REGISTRO_DEF~~) ");
    SQL.append("and   (A.TIPO_BOLLATO = ~~TIPO_BOLLATO_DEF~~) ");
    SQL.append("and   (TO_CHAR ( A.TIPO_REGISTRO ) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR('0', 1, 1)) IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.TIPO_REGISTRO ) || LPAD(TO_CHAR ( B.SERVIZIO ), 2, SUBSTR('0', 1, 1)) ");
    SQL.append("from ");
    SQL.append("  IVA B ");
    SQL.append("where (B.ANNO_PROG = ~~FAT_ANNO_PROG_NAC~~) ");
    SQL.append("and   (B.NUMERO_PROG = ~~FAT_NUMERO_PROG_NAC~~) ");
    SQL.append("and   (B.TIPO_REGISTRO = 1) ");
    SQL.append(")) ");
    SQL.append("and   (A.TIPO_REGISTRO = 1) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_RETTIFICHE.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_RETTIFICHE.SetMasterTable(PPQRY_T04, "T04");
    PAN_RETTIFICHE.SetQueryLKE(PPQRY_T04, PFL_RETTIFICHE_TIPOREGISDEF, "T04TIPOREGIS");
    PAN_RETTIFICHE.SetQueryLKE(PPQRY_T04, PFL_RETTIFICHE_TIPOBOLLADEF, "T04TIPOBOLLA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04TIPOBOLL1, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  SE_ATTIVITA_IST(A.TIPO_REGISTRO,A.TIPO_BOLLATO) as ATTISTBOLDEF ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (TO_CHAR ( A.TIPO_REGISTRO ) || LPAD(TO_CHAR ( A.TIPO_BOLLATO ), 2, SUBSTR('0', 1, 1)) IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  TO_CHAR ( B.TIPO_REGISTRO ) || LPAD(TO_CHAR ( B.SERVIZIO ), 2, SUBSTR('0', 1, 1)) ");
    SQL.append("from ");
    SQL.append("  IVA B ");
    SQL.append("where (B.ANNO_PROG = ~~FAT_ANNO_PROG_NAC~~) ");
    SQL.append("and   (B.NUMERO_PROG = ~~FAT_NUMERO_PROG_NAC~~) ");
    SQL.append("and   (B.TIPO_REGISTRO = 1) ");
    SQL.append(")) ");
    SQL.append("and   (A.TIPO_REGISTRO = 1) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_RETTIFICHE.SetQuery(PPQRY_T04, 1, SQL, -1, "");
    PAN_RETTIFICHE.SetQueryHeaderColumn(PPQRY_T04, "T04TIPOBOLL1", "T04 TIPO BOLLATO 1");
    PAN_RETTIFICHE.SetQueryHeaderColumn(PPQRY_T04, "ATTISTBOLDEF", "Attivita ISTTipo Bollato DEF");
    PAN_RETTIFICHE.SetIMDB(IMDB, "PQRY_RETFAT1", true);
    PAN_RETTIFICHE.set_SetString(MyGlb.MASTER_ROWNAME, "RETFAT");
    PAN_RETTIFICHE.SetQueryIMDB(PPQRY_RETFAT1, IMDBDef10.PQRY_RETFAT1_RS, IMDBDef2.TBL_RETFAT);
    JustLoaded = true;
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_ANNODOC, IMDBDef2.FLD_RETFAT_ANNO_DOC);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_NUMERODOC, IMDBDef2.FLD_RETFAT_NUMERO_DOC);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_IMPORTO, IMDBDef2.FLD_RETFAT_IMPORTO);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_IMPORTOIVA, IMDBDef2.FLD_RETFAT_IMPORTO_IVA);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_IMPORTIVAIST, IMDBDef2.FLD_RETFAT_IMPORTO_IVA_IST);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_DATAREG, IMDBDef2.FLD_RETFAT_D_DATA_REG);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_DESCRIZIONE, IMDBDef2.FLD_RETFAT_DESCRIZIONE);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_FATTORE1, IMDBDef2.FLD_RETFAT_FATTORE);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_CENTRO1, IMDBDef2.FLD_RETFAT_CENTRO);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_COMPETENZDAL, IMDBDef2.FLD_RETFAT_COMPETENZA_DAL);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_COMPETENZAAL, IMDBDef2.FLD_RETFAT_COMPETENZA_AL);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_PROGETTOID, IMDBDef2.FLD_RETFAT_PROGETTO_ID);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_STATO, IMDBDef2.FLD_RETFAT_ROWNAMESTATO);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_FATANNPRONAC, IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_NAC);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_FATNUMPRONAC, IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_NAC);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_FATANNPROFAT, IMDBDef2.FLD_RETFAT_FAT_ANNO_PROG_FAT);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_FATNUMPROFAT, IMDBDef2.FLD_RETFAT_FAT_NUMERO_PROG_FAT);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_UTENTEINSERI, IMDBDef2.FLD_RETFAT_UTENTE_INSERIMENTO);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_DATAINSERIME, IMDBDef2.FLD_RETFAT_DATA_INSERIMENTO);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_UTENTULTIAGG, IMDBDef2.FLD_RETFAT_UTENTE_ULTIMO_AGG);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_DATAULTIMAGG, IMDBDef2.FLD_RETFAT_DATA_ULTIMO_AGG);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_PROGRESSIVO, IMDBDef2.FLD_RETFAT_PROGRESSIVO);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_TIPOREGISDEF, IMDBDef2.FLD_RETFAT_TIPO_REGISTRO_DEF);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_TIPOBOLLADEF, IMDBDef2.FLD_RETFAT_TIPO_BOLLATO_DEF);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_ANNODOCOLD, IMDBDef2.FLD_RETFAT_ANNO_DOC_OLD);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_NUMERODOCOLD, IMDBDef2.FLD_RETFAT_NUMERO_DOC_OLD);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_ANNOPROGCOLL, IMDBDef2.FLD_RETFAT_ROWNAMANPRCO);
    PAN_RETTIFICHE.SetFieldPrimaryIndex(PFL_RETTIFICHE_NUMEPROGCOLL, IMDBDef2.FLD_RETFAT_ROWNAMNUPRCO);
    PAN_RETTIFICHE.SetMasterTable(0, "RETFAT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RETTIFICHE.Status() == 2)
    {
      int oldListQBE = PAN_RETTIFICHE.iUseListQBE;
      PAN_RETTIFICHE.iUseListQBE = 0;
      PAN_RETTIFICHE.PanelCommand(Glb.PCM_SEARCH);
      PAN_RETTIFICHE.PanelCommand(Glb.PCM_FIND);
      PAN_RETTIFICHE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_OnChangeRow();
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
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_RETTIFICHE) PAN_RETTIFICHE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
