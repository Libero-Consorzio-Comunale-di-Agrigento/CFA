// **********************************************
// Form Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FormVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAZIONI_PROVVEDIMENT = 0;
  private static int GRP_VARIAZIONI_VARIAZCRONOP = 1;
  private static int GRP_VARIAZIONI_INSERIMENTO = 2;
  private static int GRP_VARIAZIONI_AGGIORNAMENT = 3;

  private static int PFL_VARIAZIONI_DESCRIZIONE = 0;
  private static int PFL_VARIAZIONI_IMPORTO3 = 1;
  private static int PFL_VARIAZIONI_DATA = 2;
  private static int PFL_VARIAZIONI_TIPOVARIAZIO = 3;
  private static int PFL_VARIAZIONI_LABELVUOTA = 4;
  private static int PFL_VARIAZIONI_DELIBERA = 5;
  private static int PFL_VARIAZIONI_TRATTINO1 = 6;
  private static int PFL_VARIAZIONI_NUMERODEL = 7;
  private static int PFL_VARIAZIONI_BARRA3 = 8;
  private static int PFL_VARIAZIONI_ANNODEL = 9;
  private static int PFL_VARIAZIONI_SELEZIDELIBE = 10;
  private static int PFL_VARIAZIONI_INFODELIBERA = 11;
  private static int PFL_VARIAZIONI_INFODELILIST = 12;
  private static int PFL_VARIAZIONI_PROPOSTA = 13;
  private static int PFL_VARIAZIONI_TRATTINO2 = 14;
  private static int PFL_VARIAZIONI_NUMEROPROPOS = 15;
  private static int PFL_VARIAZIONI_BARRA2 = 16;
  private static int PFL_VARIAZIONI_ANNOPROPOSTA = 17;
  private static int PFL_VARIAZIONI_SELEZIPROPOS = 18;
  private static int PFL_VARIAZIONI_INFOPROPOST1 = 19;
  private static int PFL_VARIAZIONI_INFOPROPLIST = 20;
  private static int PFL_VARIAZIONI_ANNOESIGIBIL = 21;
  private static int PFL_VARIAZIONI_ANNOENTRATA = 22;
  private static int PFL_VARIAZIONI_FINANZIAMENT = 23;
  private static int PFL_VARIAZIONI_TIPOAVANZO = 24;
  private static int PFL_VARIAZIONI_CRONOPROGRAM = 25;
  private static int PFL_VARIAZIONI_ANNOESIGCRON = 26;
  private static int PFL_VARIAZIONI_ANNOENTRCRON = 27;
  private static int PFL_VARIAZIONI_FINANZDESTIN = 28;
  private static int PFL_VARIAZIONI_VARIBILAGENE = 29;
  private static int PFL_VARIAZIONI_IMPOTOTAVARI = 30;
  private static int PFL_VARIAZIONI_CODREC = 31;
  private static int PFL_VARIAZIONI_ANNOVAR = 32;
  private static int PFL_VARIAZIONI_ANNOIMP = 33;
  private static int PFL_VARIAZIONI_NUMEROIMP = 34;
  private static int PFL_VARIAZIONI_CAPITOLO1 = 35;
  private static int PFL_VARIAZIONI_ARTICOLO = 36;
  private static int PFL_VARIAZIONI_LABELDELIBER = 37;
  private static int PFL_VARIAZIONI_LABELPROPOST = 38;
  private static int PFL_VARIAZIONI_ESTREMIMPEGN = 39;
  private static int PFL_VARIAZIONI_IMPEGNO = 40;
  private static int PFL_VARIAZIONI_BARRA = 41;
  private static int PFL_VARIAZIONI_CAPITOLO = 42;
  private static int PFL_VARIAZIONI_BARRA1 = 43;
  private static int PFL_VARIAZIONI_INFOPEG = 44;
  private static int PFL_VARIAZIONI_INFOIMPEGNO = 45;
  private static int PFL_VARIAZIONI_SCELTAIMPEGN = 46;
  private static int PFL_VARIAZIONI_INFOFINANZIA = 47;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 48;
  private static int PFL_VARIAZIONI_VARIAZGENERA = 49;
  private static int PFL_VARIAZIONI_UTENTEINSERI = 50;
  private static int PFL_VARIAZIONI_DATAINSERIME = 51;
  private static int PFL_VARIAZIONI_UTENTULTIAGG = 52;
  private static int PFL_VARIAZIONI_DATAULTIMAGG = 53;
  private static int PFL_VARIAZIONI_T55GESTIAVAN = 54;
  private static int PFL_VARIAZIONI_T55MOTIVO = 55;

  private static int PPQRY_VARIMP12 = 0;

  private static int PPQRY_DEL = 1;
  private static int PPQRY_PROPOSTE = 2;
  private static int PPQRY_T55 = 3;
  private static int PPQRY_CRONOPROGRAM = 4;
  private static int PPQRY_VARPIANICRON = 5;

  private static int PPQRY_T56 = 6;
  private static int PPQRY_IMPFIN1 = 7;
  private static int PPQRY_TIPIAVANZO = 8;
  private static int PPQRY_TESTATCRONOP = 9;
  private static int PPQRY_FINANZIAMENT = 10;
  private static int PPQRY_DUAL1 = 11;
  private static int PPQRY_DUAL = 12;


  IDPanel PAN_VARIAZIONI;

  // Definition of Global Variables
  private IDVariant CFPEGATTIVO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VARIAZIONI5(IMDB);
    Init_TBL_ESTREMIMPEG1(IMDB);
    //
    //
    Init_PQRY_VARIMP12(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VARIAZIONI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VARIAZIONI5, 17);
    IMDB.set_TblCode(IMDBDef4.TBL_VARIAZIONI5, "TBL_VARIAZIONI5");
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONOLD, "ROWNAMCONOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONOLD,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMPRIDOL, "ROWNAMPRIDOL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMPRIDOL,5,9,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, "ROWNAMEIMPEG");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPCON, "ROWNAMIMPCON");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPCON,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO, "ROWNAMIMPPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOBI, "ROWNAMIMPOBI");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOBI,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOPE, "ROWNAMIMPOPE");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOPE,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMEPROGR,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONPRO, "ROWNAMCONPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONPRO,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIORG,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_RONANUVADAPR, "RONANUVADAPR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_RONANUVADAPR,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_RONANUVADAEL, "RONANUVADAEL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_RONANUVADAEL,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIONI5,IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_VARIAZIONI5, 0);
  }

  private static void Init_TBL_ESTREMIMPEG1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_ESTREMIMPEG1, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_ESTREMIMPEG1, "TBL_ESTREMIMPEG1");
    IMDB.set_FldCode(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMUNIOR1, "ROWNAMUNIOR1");
    IMDB.SetFldParams(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMUNIOR1,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR,5,250,0);
    IMDB.set_FldCode(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEARTIC,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEESER1, "ROWNAMEESER1");
    IMDB.SetFldParams(IMDBDef4.TBL_ESTREMIMPEG1,IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEESER1,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_ESTREMIMPEG1, 0);
  }

  private static void Init_PQRY_VARIMP12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VARIMP12, 31);
    IMDB.set_TblCode(IMDBDef13.PQRY_VARIMP12, "PQRY_VARIMP12");
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_COD_REC, "COD_REC");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_COD_REC,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_VARINFDELLIS, "VARINFDELLIS");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_VARINFDELLIS,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_VARINFPROLIS, "VARINFPROLIS");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_VARINFPROLIS,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_VARIAZIONE_GENERATA, "VARIAZIONE_GENERATA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_VARIAZIONE_GENERATA,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, "ANNO_ENTRATA");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA_CRONO, "ANNO_ESIGIBILITA_CRONO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA_CRONO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA_CRONO, "ANNO_ENTRATA_CRONO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA_CRONO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO_DESTINAZIONE, "FINANZIAMENTO_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIMP12,IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO_DESTINAZIONE,1,5,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VARIMP12, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FormVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public FormVariazioni()
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
    FormIdx = MyGlb.FRM_FORMVARIAZIO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5D53896C-925B-42A6-A910-B7E06C0ECE4C";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1100;
    DesignHeight = 558;
    set_Caption(new IDVariant("Form Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1100;
    Frames[1].Height = 532;
    Frames[1].Caption = "Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 532;
    PAN_VARIAZIONI = new IDPanel(w, this, 1, "PAN_VARIAZIONI");
    Frames[1].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1100-MyGlb.PAN_OFFS_X, 532-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7BC0FEFC-251B-4B6F-A91C-AC817B57F14F");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 32, 2332, 376, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
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
      if (CmdIdx==MyGlb.CMD_NUOVO8+BaseCmdLinIdx)
      {
        Inserisci();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SALVA6+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CANCELLA+BaseCmdLinIdx)
      {
        CancellaVariazione();
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
    if (CallerIdx == MyGlb.FRM_SCELTIMPEGUT && flRis && IdxPanelActived == PAN_VARIAZIONI.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAZIONI_SCELTAIMPEGN) {
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
    return (obj instanceof FormVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FormVariazioni.class.getName() : (Glb.ClassWithPackage(FormVariazioni.class) ? FormVariazioni.class.getName().substring(FormVariazioni.class.getPackage().getName().length() + 1) : FormVariazioni.class.getName()));
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
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(8)), true) || Command.equals((new IDVariant(256)), true))
      {
        if (Command.equals((new IDVariant(256)), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0, MainFrm.Proponidatareginesercizio());
        }
        PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      }
      if (Command.equals((new IDVariant(1)), true))
      {
        if ((new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(0)), true) && IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_PROGRESSIVO, 0)))
        {
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniOnCommandEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniAfterFindEvent", _e);
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

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_PROGRESSIVO, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_PROGRESSIVO, 0, (new IDVariant()));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      SettaValoriOnUpdating();
      CalcolaTotaleVariazione();
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_DELIBERA)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_ANNODEL)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0))))
        {
          v_SEDEDEL = IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0);
          v_ANNODEL = IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_PROPOSTA)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_VARIAZIONI_ANNOPROPOSTA)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0))))
        {
          v_SEDEPROPOSTA = IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0);
          v_ANNOPROPOSTA = IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0);
          v_NUMEROPROPOS = IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0);
          MainFrm.ControlloProposte(v_SEDEPROPOSTA, v_ANNOPROPOSTA, v_NUMEROPROPOS);
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0, new IDVariant(v_SEDEPROPOSTA));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROPOSTA));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROPOS));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_ANNOESIGIBIL)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0, (new IDVariant()));
        }
        else
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0))))
          {
            if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA, 0), true)>0)
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("L'anno entrata deve essere minore o uguale all'anno esigibilità"));
              MainFrm.set_AlertMessage(S); 
              IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0, (new IDVariant()));
            }
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_ANNOENTRATA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ESEFIN A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            S = (new IDVariant("Esercizio inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0, (new IDVariant()));
          }
          else
          {
            if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA, 0), true)>0)
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("L'anno entrata deve essere minore o uguale all'anno esigibilità"));
              MainFrm.set_AlertMessage(S); 
              IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0, (new IDVariant()));
            }
            if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0))))
            {
              if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), true)<0)
              {
                IDVariant S = new IDVariant(0,IDVariant.STRING);
                S = (new IDVariant("L'anno entrata deve essere maggiore o uguale all'anno impegno"));
                MainFrm.set_AlertMessage(S); 
                IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA, 0, (new IDVariant()));
              }
            }
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_TIPOVARIAZIO)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_VT55GESTAVAN = null;
        v_VT55GESTAVAN = (new IDVariant());
        IDVariant v_VT55MOTIVO = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(A.GESTIONE_AVANZO, 'NO') as NUVAT5GEAVNO, ");
        SQL.append("  A.MOTIVO as T55MOTIVO ");
        SQL.append("from ");
        SQL.append("  T55 A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_TIPO_VAR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VT55GESTAVAN = QV.Get("NUVAT5GEAVNO", IDVariant.STRING) ;
          v_VT55MOTIVO = QV.Get("T55MOTIVO", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_VT55GESTAVAN.equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_TIPO_AVANZO, 0, (new IDVariant()));
        }
        if (v_VT55MOTIVO.equals((new IDVariant("CFC")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA_CRONO, 0, (new IDVariant()));
        }
        else if (v_VT55MOTIVO.equals((new IDVariant("RCP")), true) || v_VT55MOTIVO.equals((new IDVariant("RCA")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO_DESTINAZIONE, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO_DESTINAZIONE, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAZIONI_FINANZIAMENT)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_CRONOPROGRAM))),(new IDVariant(""))).equals((new IDVariant("")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ENTRATA_CRONO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO_DESTINAZIONE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniAfterUpdateEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR5, IMDBDef4.FLD_PARAMETRVAR5_ROWNAMEDELET, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniAfterDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni After Insert Event
  // Evento notificato dopo il l'inserimento nel database
  // di una nuova riga del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_AfterInsert()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni After Insert Event Body
      // Procedure Body
      // 
      CalcolaTotaleVariazione();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniAfterInsertEvent", _e);
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
      if (PAN_VARIAZIONI.IsNewRow())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_VARIAZIONE_GENERATA, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniOnChangeRowEvent", _e);
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
      if ((new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(0)), true) || IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_VARIBILAGENE))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 || IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0).equals((new IDVariant("INFO")), true) || IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0).equals((new IDVariant("INFORES")), true))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_VARIAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_VARIAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_VARIAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_VARIAZIONI.set_ObjRect(Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_VARIAZIONI.ObjRect(Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      else
      {
        if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_RONANUVADAPR, 0).equals((new IDVariant("SI")), true) && PAN_VARIAZIONI.IsNewRow())
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_VARIAZIONE_GENERATA, 0).equals((new IDVariant("SI")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_ESIGIBILITA, 0))))
          {
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIODELIBE.booleanValue())
        {
          if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
          {
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_T55GESTIAVAN))),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_CRONOPROGRAM))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          if ((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_T55MOTIVO))).equals((new IDVariant("RCP")), true) || (new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_T55MOTIVO))).equals((new IDVariant("RCA")), true))
          {
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          if ((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_T55MOTIVO))).equals((new IDVariant("CFC")), true))
          {
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
            PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, (MainFrm.GESTIODELIBE.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_VARIBILAGENE))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_DESCRIZIONE,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOVARIAZIO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOVARIAZIO))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOAVANZO,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOAVANZO))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_CRONOPROGRAM,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_CRONOPROGRAM))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_FINANZDESTIN,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_FINANZDESTIN))).stringValue()); 
      if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0).compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPORTO3,new IDVariant(MyGlb.VIS_NORFIECFIMRO).intValue()); 
      }
      else
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPORTO3,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniOnDynamicPropertiesEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniOnDatabaseErrorEvent", _e);
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
    IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO1 = (new IDVariant("Attenzione! Descrizione superiore a 140 caratteri.", IDVariant.STRING));
      v_IMPEGNO = (new IDVariant("Impegno : ", IDVariant.STRING));
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
      // 
      // Variazioni On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0))))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0)) || IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0).equals((new IDVariant("")), true))
        {
          IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
          SQL.append("from ");
          SQL.append("  IMP A ");
          SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_DESCRIZIONE = QV.Get("IMPDESCRIZIO", IDVariant.STRING) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0, new IDVariant(v_DESCRIZIONE));
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0));
          if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
          {
            if (IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
            {
              IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0, (new IDVariant("I")));
            }
            else
            {
              IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0, (new IDVariant("R")));
            }
          }
          PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ESTREMIMPEGN, IDL.Add(v_IMPEGNO, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0)), IDL.Add((new IDVariant(" / ")), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0)), IDL.Add((new IDVariant(" - ")), IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0)))))).stringValue());
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0))))
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      SettaIntCapArt();
      if (IDL.Length((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE)))).compareTo((new IDVariant(140)), true)>0)
      {
        MainFrm.set_AlertMessage(v_MESSAGGIO1); 
        PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_DESCRIZIONE, IDL.SubStr((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_DESCRIZIONE))), (new IDVariant(1)), (new IDVariant(140))).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniOnValidateRowEvent", _e);
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
    IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPEGNO = (new IDVariant("Impegno : ", IDVariant.STRING));
      // 
      // Variazioni On Change Layout Event Body
      // Procedure Body
      // 
      if (NewLayout.equals((new IDVariant(1)), true))
      {
        AbilitazioneCampiSeInfoOUpdate();
        SettaValoriOnUpdating();
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA6+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0)))
        {
          IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
          SQL.append("from ");
          SQL.append("  IMP A ");
          SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_DESCRIZIONE = QV.Get("IMPDESCRIZIO", IDVariant.STRING) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0, new IDVariant(v_DESCRIZIONE));
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0));
          PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ESTREMIMPEGN, IDL.Add(v_IMPEGNO, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0)), IDL.Add((new IDVariant(" / ")), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0)), IDL.Add((new IDVariant(" - ")), IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0)))))).stringValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA6+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniOnChangeLayoutEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIONI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_DATA_ULTIMO_AGG, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "VariazioniBeforeInsert", _e);
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
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTIMPEGUT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTAIMPUOU1, IMDBDef7.PQSL_VISTAIMPUOU1_ARTICOLO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "EndModalEvent", _e);
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
    IDVariant v_TOOLTIP1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP5 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP6 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TOOLTIP7 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIP1 = (new IDVariant("Scelta Impegno", IDVariant.STRING));
      v_TOOLTIP = (new IDVariant("Informazioni Impegno", IDVariant.STRING));
      v_TOOLTIP2 = (new IDVariant("Informazioni Voce di Bilancio", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Variazioni", IDVariant.STRING));
      v_IMPEGNO = (new IDVariant("Impegno : ", IDVariant.STRING));
      v_TOOLTIP3 = (new IDVariant("Selezione Delibera", IDVariant.STRING));
      v_TOOLTIP5 = (new IDVariant("Informazioni Delibera", IDVariant.STRING));
      v_TOOLTIP6 = (new IDVariant("Informazioni Proposta", IDVariant.STRING));
      v_TOOLTIP7 = (new IDVariant("Informazioni Finanziamento", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      AutoSaveType = (new IDVariant("DENY")).stringValue();
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0)))
      {
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("IMPDESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0, new IDVariant(v_DESCRIZIONE));
      }
      PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_ESTREMIMPEGN, IDL.Add(v_IMPEGNO, IDL.Add(IDL.ToString(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0)), IDL.Add((new IDVariant(" / ")), IDL.Add(IDL.ToString(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0)), IDL.Add((new IDVariant(" - ")), IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0)))))).stringValue());
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_SCELTAIMPEGN,v_TOOLTIP1.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOIMPEGNO,v_TOOLTIP.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPEG,v_TOOLTIP2.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_SELEZIDELIBE,v_TOOLTIP3.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_SELEZIPROPOS,v_TOOLTIP3.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFODELIBERA,v_TOOLTIP5.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOPROPOST1,v_TOOLTIP6.stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_INFOFINANZIA,v_TOOLTIP7.stringValue()); 
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONPRO, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONPRO, 0, (new IDVariant("NO")));
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO8+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_VARIAZIONI.set_Layout((new IDVariant(1)).intValue());
      }
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      CFPEGATTIVO = MainFrm.CfpegAttivo();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "UnloadEvent", _e);
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
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0).equals((new IDVariant("INFO")), true) || IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0).equals((new IDVariant("INFORES")), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET16+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
      }
      else
      {
        if (new IDVariant(PAN_VARIAZIONI.Status()).equals((new IDVariant(1)), true))
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET16+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET16+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
          if (IDL.NullValue((new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_VARIBILAGENE))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_CANCELLA+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEPROGR, 0))))
        {
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
        }
        else
        {
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
          PAN_VARIAZIONI.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "AbilitazioneCampiSeInfoOUpdate", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMPRIDOL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPCON, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOPE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEDESCR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEPROGR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_RONANUVADAPR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_RONANUVADAEL, 0, (new IDVariant()));
      RESETTA_VARIAZDELETE();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "Resetta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Variazioni: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RESETTA_VARIAZDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMPRIDOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPCON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIORG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_RONANUVADAPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_RONANUVADAEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNPRO, 0, new IDVariant());
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "InfoDelibera", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "InfoProposta", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "SelezioneProposta", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "SelezioneDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "GestioneCampoFinanziamento", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "InfoFinanziamento", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "ApriInfoVociBilancio", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cmd Scelta Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CmdSceltaImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Scelta Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI680, IMDBDef1.FLD_PARAMETRI680_ROWNAMPROUNI, 0, IDL.NullValue(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMUNIOR1, 0),IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI680, IMDBDef1.FLD_PARAMETRI680_ROWNAMEESERC, 0, IDL.NullValue(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEESER1, 0),IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.Show(MyGlb.FRM_SCELTIMPEGUT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "CmdSceltaImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori On Updating
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaValoriOnUpdating ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori On Updating Body
      // Procedure Body
      // 
      if (PAN_VARIAZIONI.IsNewRow() && (new IDVariant(PAN_VARIAZIONI.Layout())).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_VAR, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0, MainFrm.Proponidatareginesercizio());
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0)) && IDL.NullValue(PAN_VARIAZIONI.GetLastValue(PFL_VARIAZIONI_FINANZIAMENT),(new IDVariant(""))).equals((new IDVariant("")), true))
        {
          ProponiFinanziamento();
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMECAPIT, 0));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEARTIC, 0));
        }
        if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo(IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_COD_REC, 0, (new IDVariant(2)));
        }
        else
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_COD_REC, 0, (new IDVariant(1)));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "SettaValoriOnUpdating", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Int Cap Art
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaIntCapArt ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Int Cap Art Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0))))
      {
        IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
        v_CAPITOLO = (new IDVariant());
        v_ARTICOLO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
        SQL.append("  A.ARTICOLO as IMPARTICOLO ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CAPITOLO = QV.Get("IMPCAPITOLO", IDVariant.DECIMAL) ;
          v_ARTICOLO = QV.Get("IMPARTICOLO", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_CAPITOLO)) && !(IDL.IsNull(v_ARTICOLO)))
        {
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMECAPIT, 0, new IDVariant(v_CAPITOLO));
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEARTIC, 0, new IDVariant(v_ARTICOLO));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "SettaIntCapArt", _e);
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
      if (v_SOMMA.compareTo((new IDVariant(0)), true)<0)
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPOTOTAVARI,new IDVariant(MyGlb.VIS_CAMTOTDISROS).intValue()); 
      }
      else
      {
        PAN_VARIAZIONI.set_VisualStyle(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPOTOTAVARI,new IDVariant(MyGlb.VIS_CAMPTOTADISA).intValue()); 
      }
      PAN_VARIAZIONI.set_FieldText(PFL_VARIAZIONI_IMPOTOTAVARI, IDL.ToString(v_SOMMA).stringValue());
      if (IDL.IsNull(IMDB.Value(IMDBDef4.TBL_PARAMETRVAR5, IMDBDef4.FLD_PARAMETRVAR5_ROWNAMAGGCAP, 0)))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR5, IMDBDef4.FLD_PARAMETRVAR5_ROWNAMAGGCAP, 0, (new IDVariant("SI")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "CalcolaTotaleVariazione", _e);
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
      MainFrm.ErrObj.ProcError ("FormVariazioni", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Variazioni Senza Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant ControlloVariazioniSenzaDelibera ()
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
      // Controllo Variazioni Senza Delibera Body
      // Procedure Body
      // 
      v_CONTATORE = (new IDVariant(0));
      if ((IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0)) || IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_SEDE_DEL, 0).equals((new IDVariant("")), true)) && (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0)) || IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0).equals((new IDVariant("")), true)))
      {
        v_CONTATORE = (new IDVariant(1));
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VARIMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.SEDE_DEL IS NULL) AND (A.UNITA_PROPONENTE IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      return v_CONTATORE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "ControlloVariazioniSenzaDelibera", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Esiste Variazione Non Esecutive
  // Explain which processing is carried out by this procedure
  // Capitolo:  - Input
  // Articolo:  - Input
  // **********************************************************************
  public IDVariant EsisteVariazioneNonEsecutive (IDVariant Capitolo, IDVariant Articolo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RETVAL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTA1 = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Esiste Variazione Non Esecutive Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      SQL.append("where (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  VARCOM B ");
      SQL.append("where (B.E_S = 'S') ");
      SQL.append("and   (B.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((B.ANNO_DEL IS NULL)) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA.equals((new IDVariant(0)), true))
      {
        v_RETVAL = (new IDVariant(0));
      }
      else
      {
        v_RETVAL = (new IDVariant(1));
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      SQL.append("where (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO B ");
      SQL.append("where (B.E_S = 'S') ");
      SQL.append("and   (B.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.IMPORTO < 0) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA1.equals((new IDVariant(0)), true))
      {
        v_RETVAL = new IDVariant(v_RETVAL);
      }
      else
      {
        v_RETVAL = IDL.Add(v_RETVAL, (new IDVariant(1)));
      }
      return v_RETVAL;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "EsisteVariazioneNonEsecutive", _e);
      return new IDVariant();
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
    IDVariant v_IMPORTOOLD = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ANNOINTROD = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_PROGETTIDOLD = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONSOLIDAOLD = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti E Non Bloccanti Body
      // Procedure Body
      // 
      IDVariant v_IMPORTOIMP = new IDVariant(0,IDVariant.DECIMAL);
      v_MESSNONBLOC = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.IMPORTO as SUBIMPIMPORT ");
      SQL.append("from ");
      SQL.append("  IMP A ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_IMPORTOIMP = QV.Get("SUBIMPIMPORT", IDVariant.DECIMAL) ;
      }
      QV.Close();
      if (MainFrm.FINANZIAMENT.equals((new IDVariant(-1)), true))
      {
        IDVariant v_IMPORTOFIN = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTVARFIN = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTFINTOT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_IMPORTVARTOT = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_IMPORTIMPTOT = new IDVariant(0,IDVariant.DECIMAL);
        v_NUMREC = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(A.IMPORTO), 0) as NUVASUIMFII0, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  IMP_FIN A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTOFIN = QV.Get("NUVASUIMFII0", IDVariant.DECIMAL) ;
          v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(DECODE(A.FINANZIAMENTO, to_number(NULL), 0, A.IMPORTO)), 0) as NVSIEVFN0VI0, ");
        SQL.append("  NVL(SUM(A.IMPORTO), 0) as NULVASUVAIM0 ");
        SQL.append("from ");
        SQL.append("  VARIMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTVARFIN = QV.Get("NVSIEVFN0VI0", IDVariant.DECIMAL) ;
          v_IMPORTVARTOT = QV.Get("NULVASUVAIM0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        // 
        // sele
        // 
        if (v_NUMREC.compareTo((new IDVariant(0)), true)>0)
        {
          v_IMPORTFINTOT = IDL.Add(v_IMPORTOFIN, v_IMPORTVARFIN);
          v_IMPORTIMPTOT = IDL.Add(v_IMPORTOIMP, v_IMPORTVARTOT);
          // 
          // Se la variazione attuale non ha il finanziamento la
          // considero solo nel totale impegno, altrimenti non la
          // considero perché dovrei aggiungerla ad entrambe
          // 
          if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0)))
          {
            v_IMPORTIMPTOT = IDL.Sub(IDL.Add(v_IMPORTIMPTOT, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0)), IDL.ToFloat(IDL.NullValue(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3),(new IDVariant("0")))));
          }
          if (v_IMPORTIMPTOT.compareTo(v_IMPORTFINTOT, true)>0)
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Totale Finanziamenti inferiore all'importo definitivo del impegno.", IDVariant.STRING));
            if (MainFrm.CONTRFINIMPE.equals((new IDVariant("SI")), true))
            {
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
              return (new IDVariant(0)).booleanValue();
            }
            else
            {
              v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
            }
          }
        }
      }
      if (ControlloVariazioniSenzaDelibera().compareTo((new IDVariant(0)), true)!=0)
      {
        IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
        v_MESSAGGIO = (new IDVariant("Sono presenti variazioni all'impegno senza delibera.", IDVariant.STRING));
        v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
      }
      if (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0).compareTo((new IDVariant(0)), true)>0 && (IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0).compareTo(IDL.ToFloat(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3)), true)!=0 || PAN_VARIAZIONI.IsNewRow()))
      {
        if (EsisteVariazioneNonEsecutive(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0)).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
          v_MESSAGGIO = (new IDVariant("Attenzione, sul Capitolo sono presenti variazioni non esecutive.", IDVariant.STRING));
          v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
        }
      }
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), true)!=0)
      {
        v_ANNOINTROD = IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0);
      }
      else
      {
        v_ANNOINTROD = (new IDVariant());
      }
      if (PAN_VARIAZIONI.IsNewRow())
      {
        v_IMPORTOOLD = (new IDVariant());
        v_PROGETTIDOLD = (new IDVariant());
        v_CONSOLIDAOLD = (new IDVariant());
      }
      else
      {
        v_IMPORTOOLD = new IDVariant(IDL.ToFloat(IDL.NullValue(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3),(new IDVariant("0")))),IDVariant.DECIMAL);
        v_PROGETTIDOLD = IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMPRIDOL, 0);
        v_CONSOLIDAOLD = IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMCONOLD, 0);
      }
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0).equals((new IDVariant("I")), true))
      {
        if ((IDL.ToFloat(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3)).compareTo(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0), true)!=0) || PAN_VARIAZIONI.IsNewRow())
        {
          // 
          // Controlli sui dodicesimi
          // 
          {
            IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_SEESCLU12CAP = new IDVariant(0,IDVariant.STRING);
            IDVariant v_MEXNONBLOC = new IDVariant(0,IDVariant.STRING);
            IDVariant v_VANNOIMPPROV = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_VIMPDAREISTN = new IDVariant(0,IDVariant.STRING);
            IDVariant v_VIMPCODLIVE5 = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_VIMPESCLUS12 = new IDVariant(0,IDVariant.STRING);
            v_MEXNONBLOC = (new IDVariant());
            v_SEESCLU12CAP = (new IDVariant());
            try
            {
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A_GET_SE_ESCLUSIONE_12(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",A.CAPITOLO,A.ARTICOLO,A.COD_LIVELLO_5,A.ANNO_IMP_PROVENIENZA,A.IMP_DA_REISCR_STN,A.ESCLUSIONE_12,A.D_DATA_REG) as AGSE1SEICIAI, ");
              SQL.append("  A.ANNO_IMP_PROVENIENZA as ANNOIMPPROVE, ");
              SQL.append("  A.IMP_DA_REISCR_STN as IMPDAREISSTN, ");
              SQL.append("  A.COD_LIVELLO_5 as IMPCODLIVEL5, ");
              SQL.append("  A.ESCLUSIONE_12 as IMPESCLUSI12 ");
              SQL.append("from ");
              SQL.append("  IMP A ");
              SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_SEESCLU12CAP = QV.Get("AGSE1SEICIAI", IDVariant.STRING) ;
                v_VANNOIMPPROV = QV.Get("ANNOIMPPROVE", IDVariant.INTEGER) ;
                v_VIMPDAREISTN = QV.Get("IMPDAREISSTN", IDVariant.STRING) ;
                v_VIMPCODLIVE5 = QV.Get("IMPCODLIVEL5", IDVariant.DECIMAL) ;
                v_VIMPESCLUS12 = QV.Get("IMPESCLUSI12", IDVariant.STRING) ;
              }
              QV.Close();
            }
            catch (Exception e20)
            {
              MainFrm.set_AlertMessage(new IDVariant(e20.getMessage())); 
              return (new IDVariant(0)).booleanValue();
            }
            if (IDL.NullValue(v_SEESCLU12CAP,(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0 && ((MainFrm.FASEBILANCIO.equals((new IDVariant(1)), true)) || (MainFrm.FASEBILANCIO.equals((new IDVariant(2)), true))))
            {
              v_CHECK = MainFrm.ChkControllo12(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), v_VANNOIMPPROV, v_VIMPDAREISTN, new IDVariant(v_VIMPCODLIVE5,IDVariant.INTEGER), v_VIMPESCLUS12, IDL.Month(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0)), new IDVariant(IDL.ToFloat(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3)),IDVariant.DECIMAL), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0), v_MEXNONBLOC);
              if (!(IDL.IsNull(v_MEXNONBLOC)))
              {
                v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MEXNONBLOC), (new IDVariant("<BR/>")));
              }
            }
          }
        }
      }
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0).equals((new IDVariant("I")), true))
      {
        IDVariant v_ESITO = new IDVariant(0,IDVariant.STRING);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.IMPDI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPCON, 0),(new IDVariant("C"))), (new IDVariant()), (new IDVariant()), (new IDVariant()), (new IDVariant()), (new IDVariant()), (new IDVariant()), v_IMPORTOOLD, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0), (new IDVariant()), (new IDVariant()), (new IDVariant()), (new IDVariant()), (new IDVariant()), (new IDVariant()), v_ANNOINTROD, (new IDVariant()), (new IDVariant()), (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
          v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(5)), (new IDVariant(5)));
          if (v_ERRORE.equals((new IDVariant("20998")), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            IDVariant v_POS1 = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_POS2 = new IDVariant(0,IDVariant.INTEGER);
            v_POS1 = IDL.Find(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("Consolidato")), (new IDVariant(0)));
            v_POS2 = IDL.Find(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("Sviluppo")), (new IDVariant(0)));
            if (v_POS1.compareTo((new IDVariant(0)), true)!=0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant(" Impegno superiore alla Disponibilità Consolidata ", IDVariant.STRING));
              S = new IDVariant(v_SMS);
            }
            else
            {
              if (v_POS2.compareTo((new IDVariant(0)), true)!=0)
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant(" Impegno superiore alla Disponibilità di Sviluppo ", IDVariant.STRING));
                S = new IDVariant(v_SMS);
              }
              else
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Impegno superiore alla Disponibilità", IDVariant.STRING));
                S = new IDVariant(v_SMS);
              }
            }
            v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, S), (new IDVariant("<BR/>")));
          }
          else
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            return (new IDVariant(0)).booleanValue();
          }
        }
        if (((IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO, 0),(new IDVariant("A"))).compareTo((new IDVariant("A")), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMPRIDOL, 0),(new IDVariant("A"))).compareTo((new IDVariant("A")), true)!=0) && !(PAN_VARIAZIONI.IsNewRow())) || (PAN_VARIAZIONI.IsNewRow() && IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO, 0),(new IDVariant("A"))).compareTo((new IDVariant("A")), true)!=0))
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          if (CFPEGATTIVO.booleanValue() && IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true) && !(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO, 0))))
          {
            MainFrm.Cf4armDBObject.POLCONTROLLODISPPROGOB(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(0)), IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPPRO, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOBI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), IDL.ToFloat(IDL.NullValue(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3),(new IDVariant("0")))), IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0),(new IDVariant(0))), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), (new IDVariant(0)), v_CONSOLIDAOLD, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPCON, 0), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("C")), (new IDVariant("X")), (new IDVariant("X")), (new IDVariant("X")), (new IDVariant("X")), (new IDVariant("VM")), (new IDVariant("P")));
          }
          // 
          // 
          // 
          // 
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
            v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(5)), (new IDVariant(5)));
            if (v_ERRORE.equals((new IDVariant("20998")), true))
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
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CONTROLLOIMPPURODI(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0), v_ESITO);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return (new IDVariant(0)).booleanValue();
        }
        else
        {
          if (IDL.NullValue(v_ESITO,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_ESITO), (new IDVariant("<BR/>")));
          }
        }
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.IMPDIRES(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0), v_ANNOINTROD);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
          v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(5)), (new IDVariant(5)));
          if (v_ERRORE.equals((new IDVariant("20998")), true))
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
      if (IDL.IsNull(v_ANNOINTROD))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CONTROLLODISPIMPPROV(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), v_IMPORTOIMP, IDL.Add(v_IMPORTOIMP, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0)));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
          v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(5)), (new IDVariant(5)));
          if (v_ERRORE.equals((new IDVariant("20998")), true))
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
      if (MainFrm.FINANZIAMENT.equals((new IDVariant(-1)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0),(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0)
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.CONTROLLODISPCOMPFIN(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
            v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(5)), (new IDVariant(5)));
            if (v_ERRORE.equals((new IDVariant("20998")), true))
            {
              v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
            }
            else
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              return (new IDVariant(0)).booleanValue();
            }
          }
          if (IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOPE, 0),(new IDVariant(-1))).compareTo((new IDVariant(-1)), true)!=0)
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.CONTROLLODISPCOMPOPE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOPE, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
              v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(5)), (new IDVariant(5)));
              if (v_ERRORE.equals((new IDVariant("20998")), true))
              {
                v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))), (new IDVariant("<BR/>")));
              }
              else
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                return (new IDVariant(0)).booleanValue();
              }
            }
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.IMPFINDI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0), IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMIMPOPE, 0), v_IMPORTOOLD, IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_IMPORTO, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
              v_ERRORE = IDL.SubStr((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())), (new IDVariant(5)), (new IDVariant(5)));
              if (v_ERRORE.equals((new IDVariant("20998")), true))
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
        else
        {
          // 
          // Finanziamento non indicato
          // 
          if (MainFrm.NumeroFinanziamenti(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), (new IDVariant(0)), (new IDVariant(0))).compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Sulla variazione non e' indicato il finanziamento.", IDVariant.STRING));
            if (MainFrm.CONTRFINIMPE.equals((new IDVariant("SI")), true))
            {
              MainFrm.set_AlertMessage(v_MESSAGGIO); 
              return (new IDVariant(0)).booleanValue();
            }
            else
            {
              v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MESSAGGIO), (new IDVariant("<BR/>")));
            }
          }
        }
      }
      MessaggioNonBloccante.set(new IDVariant(v_MESSNONBLOC));
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "ControlliBloccantiENonBloccanti", _e);
      return false;
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
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNPRO, 0));
        }
      }
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "SettaValoriSeInserimentoDaProposteDetermine", _e);
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
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMECAPIT, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMEARTIC, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMANNIMP, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0, IMDB.Value(IMDBDef4.TBL_ESTREMIMPEG1, IMDBDef4.FLD_ESTREMIMPEG1_ROWNAMNUMIMP, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMUNIPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMPRO, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNPRO, 0));
        }
      }
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_VARIAZIONI.SetFlags (Glb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "SettaValoriNuovaVariazioneDaElenco", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Nuova Riga Variazioni
  // **********************************************************************
  public int ProponiNuovaRigaVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Nuova Riga Variazioni Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_RONANUVADAPR, 0).equals((new IDVariant("SI")), true))
      {
        SettaValoriSeInserimentoDaProposteDetermine();
      }
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_RONANUVADAEL, 0).equals((new IDVariant("SI")), true))
      {
        SettaValoriNuovaVariazioneDaElenco();
      }
      SettaValoriOnUpdating();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "ProponiNuovaRigaVariazioni", _e);
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
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_INSERT);
      ProponiNuovaRigaVariazioni();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "Inserisci", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Finanziamento
  // **********************************************************************
  public int ProponiFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Finanziamento Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VFIN = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(A.FINANZIAMENTO) as MINIMPFINFIN ");
      SQL.append("from ");
      SQL.append("  IMP_FIN A ");
      SQL.append("where (A.ANNO_IMP = NVL(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   (A.NUMERO_IMP = NVL(" + IDL.CSql(IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_VFIN = QV.Get("MINIMPFINFIN", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_FINANZIAMENTO, 0, new IDVariant(v_VFIN));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "ProponiFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cancella Variazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CancellaVariazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella Variazione Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIONI5, IMDBDef4.FLD_VARIAZIONI5_ROWNAMEIMPEG, 0).equals((new IDVariant("I")), true))
      {
        // 
        // Controlli sui dodicesimi
        // 
        {
          IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_MEXNONBLOC = new IDVariant(0,IDVariant.STRING);
          IDVariant v_SEESCLU12CAP = new IDVariant(0,IDVariant.STRING);
          IDVariant v_MESSNONBLOC = null;
          v_MESSNONBLOC = (new IDVariant());
          v_MEXNONBLOC = (new IDVariant());
          v_SEESCLU12CAP = (new IDVariant());
          if (IDL.NullValue(v_SEESCLU12CAP,(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0 && ((MainFrm.FASEBILANCIO.equals((new IDVariant(1)), true)) || (MainFrm.FASEBILANCIO.equals((new IDVariant(2)), true))))
          {
            IDVariant v_VANNOIMPPROV = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_VIMPDAREISTN = new IDVariant(0,IDVariant.STRING);
            IDVariant v_VIMPCODLIVE5 = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_VIMPESCLUS12 = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A_GET_SE_ESCLUSIONE_12(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",A.CAPITOLO,A.ARTICOLO,A.COD_LIVELLO_5,A.ANNO_IMP_PROVENIENZA,A.IMP_DA_REISCR_STN,A.ESCLUSIONE_12,A.D_DATA_REG) as AGSE1SEICIAI, ");
            SQL.append("  A.ANNO_IMP_PROVENIENZA as ANNOIMPPROVE, ");
            SQL.append("  A.IMP_DA_REISCR_STN as IMPDAREISSTN, ");
            SQL.append("  A.COD_LIVELLO_5 as IMPCODLIVEL5, ");
            SQL.append("  A.ESCLUSIONE_12 as IMPESCLUSI12 ");
            SQL.append("from ");
            SQL.append("  IMP A ");
            SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_SEESCLU12CAP = QV.Get("AGSE1SEICIAI", IDVariant.STRING) ;
              v_VANNOIMPPROV = QV.Get("ANNOIMPPROVE", IDVariant.INTEGER) ;
              v_VIMPDAREISTN = QV.Get("IMPDAREISSTN", IDVariant.STRING) ;
              v_VIMPCODLIVE5 = QV.Get("IMPCODLIVEL5", IDVariant.DECIMAL) ;
              v_VIMPESCLUS12 = QV.Get("IMPESCLUSI12", IDVariant.STRING) ;
            }
            QV.Close();
            v_CHECK = MainFrm.ChkControllo12(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_ARTICOLO, 0), v_VANNOIMPPROV, v_VIMPDAREISTN, new IDVariant(v_VIMPCODLIVE5,IDVariant.INTEGER), v_VIMPESCLUS12, IDL.Month(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0)), new IDVariant(IDL.ToFloat(PAN_VARIAZIONI.GetOrgValue(PFL_VARIAZIONI_IMPORTO3)),IDVariant.DECIMAL), (new IDVariant()), IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0), v_MEXNONBLOC);
            if (!(IDL.IsNull(v_MEXNONBLOC)))
            {
              v_MESSNONBLOC = IDL.Add(IDL.Add(v_MESSNONBLOC, v_MEXNONBLOC), (new IDVariant("<BR/>")));
            }
          }
          if (!(IDL.IsNull(v_MESSNONBLOC)) && v_MESSNONBLOC.compareTo((new IDVariant("")), true)!=0)
          {
            if (!(MainFrm.MessageConfirm(IDL.Add(v_MESSNONBLOC, (new IDVariant("Si desidera registrare ugualmente?"))))))
            {
              return 0;
            }
          }
        }
      }
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_DELETE);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FormVariazioni", "CancellaVariazione", _e);
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
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFODELILIST)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_SELEZIPROPOS)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPROPOST1)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPROPLIST)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdSceltaImpegno();
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
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0)))
      {
        IMDB.set_Value(IMDBDef13.PQRY_VARIMP12, IMDBDef13.PQSL_VARIMP12_D_DATA_REG, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
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
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "46D64D1E-8486-4663-B475-530F0623B441");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "Provvedimento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.PANEL_LIST, 664, -9999, 364, 16, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, MyGlb.PANEL_FORM, 24, 127, 628, 57, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0, 87);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, "A92E2292-6DE7-4CB8-A97C-05C82D455E1F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, "Variazioni Cronoprogramma");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, MyGlb.PANEL_LIST, 1652, -9999, 680, 16, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, MyGlb.PANEL_FORM, 24, 271, 556, 121, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 0, 158);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_VARIAZCRONOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "5BD8B08F-2539-4C4C-AF82-7AC6B84AE3A7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "Inserimento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, MyGlb.PANEL_FORM, 40, 411, 304, 49, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0, 70);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "BFEA238F-5006-430D-991A-BEBA198B0765");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "Aggiornamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, MyGlb.PANEL_FORM, 364, 411, 300, 49, 0, 0);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0, 88);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 1, 13);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0, 4);
    PAN_VARIAZIONI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 1, 4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIONI_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 56);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "05F2897C-5F49-4F76-A075-480315D17949");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "Descrizione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE, 7, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DESCRIZIONE, 0, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, "B99B0710-57D7-4800-85D6-560266FB8A26");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO3, 4, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPORTO3, 1, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "0602B3ED-CC08-4789-808E-0945D2076220");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 5, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATA, 2, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "7FD7EA05-ED00-4D53-9539-FB1C4633EE89");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 8, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOVARIAZIO, 3, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, "4A78B2E6-D7EE-4845-8D6F-07CBBB1B4011");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELVUOTA, 31, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELVUOTA, 19, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "FBCFBFEA-4E21-4D02-BA6B-584EF4AF97EA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Delibera");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, "Sede del");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 9, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DELIBERA, 4, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "8E07417B-CBDA-4895-80C2-5A07AAF6973F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 26, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO1, 14, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "77A6973E-C07F-42D4-AD73-CADB9257A391");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "NUMERO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL, 10, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMERODEL, 5, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "EB2B84BA-6022-42EB-A021-39FC83285788");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 25, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA3, 13, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "4F5E48C2-7850-4409-86B0-665E8C128E7A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "ANNO DEL");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL, 11, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNODEL, 6, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, "B8E97976-3671-4612-B31B-6E13355FBE32");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIDELIBE, 27, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIDELIBE, 15, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "7BEEA302-DB3B-40DF-9F80-42A4E02FC5F1");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 29, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELIBERA, 17, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, "BD831E01-AE2A-4FCB-AB80-191F8B589E65");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, "Info Delibera List ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, "Informazioni Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELILIST, 22, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFODELILIST, 7, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "F9E771AD-DC05-49BC-88EC-05310052FAB7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "Proposta");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 12, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROPOSTA, 8, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, "C18A4BDD-6882-40B3-A88F-BD0886E1DF3B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, "-");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO2, 23, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TRATTINO2, 11, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "E1017163-FE25-4E28-A5DF-216AC498F4CB");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPOS, 13, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROPROPOS, 9, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "E5FACCB6-0EDD-430E-9A92-ADAE307E56D1");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 24, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA2, 12, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "C6DB8E64-78E6-43EA-804D-29AA45E1A16B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOSTA, 14, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOPROPOSTA, 10, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, "7C39C691-1C85-4462-AF46-807C1CAAA711");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIPROPOS, 28, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SELEZIPROPOS, 16, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, "5175AD73-FF2E-442E-95B4-790FFA5F5970");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOST1, 30, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPOST1, 18, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, "2B5E1B56-824F-44A0-BF75-133804766BD2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, "Info Proposta List ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, "Informazioni Proposta");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPLIST, 32, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPROPLIST, 20, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "BBF7C3CB-FAC0-4983-AE84-F57655432919");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 15, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGIBIL, 39, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "DE31BE00-2743-4BB4-B308-AF030B3812A3");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "Anno Entrata");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRATA, 16, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRATA, 40, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "4D835D0F-3A7D-4ECC-824D-B84337A7ABEC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "Finanziamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZIAMENT, 17, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZIAMENT, 21, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "8D0A58F1-0255-4A61-A1A3-70EF7BAC5ED9");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "Tipo Avanzo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOAVANZO, 45, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_TIPOAVANZO, 45, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, "A6D2FC10-6F61-40A2-87D5-E649D841FFB9");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, "Cronoprogramma");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CRONOPROGRAM, 46, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CRONOPROGRAM, 46, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, "E8A8B7B0-69FF-4FFD-B5C4-D0B1C432F03E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGCRON, 47, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOESIGCRON, 47, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, "8B502868-1F06-40FF-AD93-F7F4BDA77697");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, "Anno Entrata");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRCRON, 48, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOENTRCRON, 48, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, "172ABDFF-F3FE-47E3-BF08-1437174B6073");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, "Finanziamento di Destinazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZDESTIN, 49, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_FINANZDESTIN, 49, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, "DC3426C7-1AC0-4470-8E72-5BC7DD94B7C4");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, "Variazione Bilancio Generata");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIBILAGENE, 50, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIBILAGENE, 50, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "3C796F40-B868-436B-A8A7-8280665EFB75");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, "ddd");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.VIS_CAMPTOTADISA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 33, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPOTOTAVARI, 22, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "ACF62E3F-B223-41BE-B32E-D51C916519B1");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "COD REC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODREC, 0, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 51, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CODREC, 51, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "0587A74C-D546-40BB-912A-5CD51AE801FC");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "ANNO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 6, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOVAR, 23, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "896AA129-8969-453F-AE1F-88D610D40A69");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "ANNO IMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "Anno Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOIMP, 1, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ANNOIMP, 24, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "A10995A6-6521-47BB-BD71-F84918B99F57");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "NUMERO IMP");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, "Numero Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROIMP, 0, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_NUMEROIMP, 25, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "D10AB863-9462-46C0-A4BC-6C271236763B");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "CAPITOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "Capitolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO1, 2, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO1, 26, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "C925866C-8823-42F1-A929-13390A6D0827");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "ARTICOLO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "Articolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 3, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ARTICOLO, 27, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, "5D38C091-1961-42DA-A44F-CCD40B96F3E2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, "Delibera");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELDELIBER, 34, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELDELIBER, 28, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, "E80796CC-8A27-4F83-9ACE-534CF9758BF8");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, "Proposta");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.VIS_LABEVISUSTYL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELPROPOST, 35, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_LABELPROPOST, 29, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, "96D67D96-2361-4393-B8DA-78F53A6FE190");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.VIS_ETICHEGRASSE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMIMPEGN, 36, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_ESTREMIMPEGN, 30, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, "A118C5B3-4F0E-4179-94C2-5CE9D155513F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, "Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPEGNO, 37, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_IMPEGNO, 31, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "B93921EB-A524-4745-BF13-3FC36DAACECD");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 38, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA, 32, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "1F17DC7B-4944-400B-9140-5067A4166CC2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, "Capitolo");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.VIS_VUOTOGRASSET);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 39, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_CAPITOLO, 33, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, "23D24871-846D-4AE5-B969-9DDEDCDB269D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, "/");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA1, 40, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_BARRA1, 34, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "2F3735FB-6905-475B-BC75-8CCA1A40B36F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 41, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOPEG, 35, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, "3F3E70F5-16DD-46B0-9A56-B88AC179BC37");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOIMPEGNO, 42, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOIMPEGNO, 36, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, "82EE81CA-043D-41ED-AE39-D4C9B0664A3A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SCELTAIMPEGN, 43, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_SCELTAIMPEGN, 37, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, "ED0370FA-F30E-47A9-B867-9143A3971E17");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIAZIONI.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, 0, "info.gif", false);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOFINANZIA, 44, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_INFOFINANZIA, 38, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "5662D90B-C69D-467A-91F8-1409F9D2A05E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 52, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_PROGRESSIVO, 52, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, "66C3DB7A-75C5-44BB-944E-4AF7B43421D2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, "VARIAZIONE GENERATA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIAZGENERA, 53, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_VARIAZGENERA, 53, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "D62B83B8-9584-4E38-9497-A28BE6FAEB2C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "Utente");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 18, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTEINSERI, 41, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "849A991D-6CD3-432D-8233-1E3F376FBC54");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 19, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAINSERIME, 42, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "E0DC8FC2-5421-4F64-B6C6-744EA3FE7944");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "Utente");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 20, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_UTENTULTIAGG, 43, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "808F56AB-5615-4DE7-9960-CB79501BE81F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "Data");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 21, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_DATAULTIMAGG, 44, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, "A4EDDA31-A552-4B29-8BE9-45B073DE0186");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, "T55 GESTIONE AVANZO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.VIS_LOOKUPFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_T55GESTIAVAN, 54, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_T55GESTIAVAN, 54, MyGlb.PANEL_LIST);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, "7E60E826-0F15-4097-9808-AF9D06F086B7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, "T55 MOTIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_T55MOTIVO, 55, MyGlb.PANEL_FORM);
    PAN_VARIAZIONI.SetTabOrder(PFL_VARIAZIONI_T55MOTIVO, 55, MyGlb.PANEL_LIST);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 68, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 24, 64, 552, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCRIZIONE, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCRIZIONE, PPQRY_VARIMP12, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, 352, 68, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, 44, 40, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO3, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO3, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO3, PPQRY_VARIMP12, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 436, 68, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 436, 40, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATA, PPQRY_VARIMP12, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 532, 68, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 12, 100, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVARIAZIO, PPQRY_VARIMP12, "A.TIPO_VAR", "TIPO_VAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 280, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 28, 164, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELVUOTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELVUOTA, -1, "", "LABELVUOTA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 664, 68, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 52, 152, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DELIBERA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DELIBERA, PPQRY_VARIMP12, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 412, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 156, 152, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO1, -1, "", "TRATTINO1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 704, 68, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_LIST, "NUM. D.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 176, 152, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMERODEL, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMERODEL, PPQRY_VARIMP12, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 476, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 224, 152, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA3, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA3, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA3, -1, "", "BARRA3", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 752, 68, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_LIST, "A. D.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 244, 152, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNODEL, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNODEL, PPQRY_VARIMP12, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 252, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_FORM, 280, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SELEZIDELIBE, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SELEZIDELIBE, -1, "", "SELEZIDELIBE", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 272, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 300, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELIBERA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_LIST, 788, 68, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_LIST, "I. D. L.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_FORM, 4, 224, 512, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFODELILIST, MyGlb.PANEL_FORM, "Info Delibera List ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFODELILIST, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFODELILIST, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFODELILIST, PPQRY_VARIMP12, "DECODE(A.SEDE_DEL, NULL, NULL, 'E')", "VARINFDELLIS", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFODELILIST, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFODELILIST, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 812, 68, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 320, 152, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROPOSTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROPOSTA, PPQRY_VARIMP12, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 116, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 492, 152, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TRATTINO2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TRATTINO2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TRATTINO2, -1, "", "TRATTINO2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 920, 68, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_LIST, "NM. PR.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 512, 152, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROPROPOS, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROPROPOS, PPQRY_VARIMP12, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 188, 292, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 556, 152, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA2, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA2, -1, "", "BARRA2", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 968, 68, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. P.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 576, 152, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOPROPOSTA, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOPROPOSTA, PPQRY_VARIMP12, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_LIST, 548, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_FORM, 612, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SELEZIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SELEZIPROPOS, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SELEZIPROPOS, -1, "", "SELEZIPROPOS", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 564, 292, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 632, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPROPOST1, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPROPOST1, -1, "", "INFOPROPOST1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_LIST, 1004, 68, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_LIST, "I. P. L.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_FORM, 4, 252, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPROPLIST, MyGlb.PANEL_FORM, "Info Proposta List ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPROPLIST, -1, GRP_VARIAZIONI_PROVVEDIMENT);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFOPROPLIST, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPROPLIST, PPQRY_VARIMP12, "DECODE(A.UNITA_PROPONENTE, NULL, NULL, 'E')", "VARINFPROLIS", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOPROPLIST, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOPROPLIST, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1292, 68, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 192, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBIL, PPQRY_VARIMP12, "A.ANNO_ESIGIBILITA", "ANNO_ESIGIBILITA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 1360, 68, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 168, 192, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOENTRATA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOENTRATA, PPQRY_VARIMP12, "A.ANNO_ENTRATA", "ANNO_ENTRATA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1028, 68, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 16, 216, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZIAMENT, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZIAMENT, PPQRY_VARIMP12, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 1452, 68, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 24, 240, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOAVANZO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOAVANZO, PPQRY_VARIMP12, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, 1652, 68, 250, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, 144);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_LIST, "Cronoprogramma");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, 28, 296, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, 180);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRAM, MyGlb.PANEL_FORM, "Cronoprogramma");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CRONOPROGRAM, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CRONOPROGRAM, PPQRY_CRONOPROGRAM, "GET_DESC_OPERA_CRONO_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~)", "CRONOPROGRAM", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, 1902, 68, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, 152);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, 112, 320, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGCRON, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGCRON, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGCRON, PPQRY_VARIMP12, "A.ANNO_ESIGIBILITA_CRONO", "ANNO_ESIGIBILITA_CRONO", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, 1998, 68, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, 428, 320, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOENTRCRON, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOENTRCRON, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOENTRCRON, PPQRY_VARIMP12, "A.ANNO_ENTRATA_CRONO", "ANNO_ENTRATA_CRONO", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, 2082, 68, 250, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, 184);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_LIST, "Finanziamento di Destinazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, 28, 344, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, 180);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZDESTIN, MyGlb.PANEL_FORM, "Finanziamento di Destinazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZDESTIN, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZDESTIN, PPQRY_VARIMP12, "A.FINANZIAMENTO_DESTINAZIONE", "FINANZIAMENTO_DESTINAZIONE", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, 2332, 68, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, 344);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_LIST, "Variazione Bilancio Generata");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, 28, 368, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, 344);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIBILAGENE, MyGlb.PANEL_FORM, "Variazione Bilancio Generata");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_VARIBILAGENE, -1, GRP_VARIAZIONI_VARIAZCRONOP);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_VARIBILAGENE, PPQRY_VARPIANICRON, "DECODE(COUNT(*), 0, '', 'Variazione Bilancio Generata')", "VARIBILAGENE", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPOTOTAVARI, MyGlb.PANEL_LIST, 352, 416, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODREC, PPQRY_VARIMP12, "A.COD_REC", "COD_REC", 1, 1, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 476, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, "ANNO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 620, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, "ANN. VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOVAR, PPQRY_VARIMP12, "A.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 536, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 180, 8, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOIMP, PPQRY_VARIMP12, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 596, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 112, 8, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROIMP, PPQRY_VARIMP12, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 740, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 424, 8, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO1, PPQRY_VARIMP12, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 800, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 552, 8, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARIMP12, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 664, 32, 148, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 724, 208, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELDELIBER, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELDELIBER, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELDELIBER, -1, "", "LABELDELIBER", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 812, 32, 216, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 732, 216, 140, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_LABELPROPOST, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_LABELPROPOST, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_LABELPROPOST, -1, "", "LABELPROPOST", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0, 4, 576, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 0, 0, 516, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESTREMIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESTREMIMPEGN, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESTREMIMPEGN, -1, "", "ESTREMIMPEGN", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 16, 8, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 44, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPEGNO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPEGNO, -1, "", "IMPEGNO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 152, 8, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 160, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 24, 16, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 348, 8, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO, -1, "", "CAPITOLO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 160, 16, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 532, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_BARRA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_BARRA1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_BARRA1, -1, "", "BARRA1", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 588, 8, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 580, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOPEG, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOPEG, -1, "", "INFOPEG", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 596, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 224, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOIMPEGNO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 244, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_SCELTAIMPEGN, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 572, 300, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOFINANZIA, MyGlb.PANEL_FORM, 580, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARIMP12, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_LIST, "VARIAZIONE GENERATA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, 4, 248, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_VARIAZGENERA, MyGlb.PANEL_FORM, "VARIAZIONE GENERATA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_VARIAZGENERA, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_VARIAZGENERA, PPQRY_VARIMP12, "A.VARIAZIONE_GENERATA", "VARIAZIONE_GENERATA", 5, 2, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_VARIAZGENERA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_VARIAZGENERA, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 44, 436, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTEINSERI, -1, GRP_VARIAZIONI_INSERIMENTO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTEINSERI, PPQRY_VARIMP12, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 216, 436, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAINSERIME, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAINSERIME, -1, GRP_VARIAZIONI_INSERIMENTO);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAINSERIME, PPQRY_VARIMP12, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_LIST, "Utente");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 368, 436, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_UTENTULTIAGG, MyGlb.PANEL_FORM, "Utente");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_UTENTULTIAGG, -1, GRP_VARIAZIONI_AGGIORNAMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_UTENTULTIAGG, PPQRY_VARIMP12, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_LIST, "Data");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 548, 436, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 36);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DATAULTIMAGG, MyGlb.PANEL_FORM, "Data");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DATAULTIMAGG, -1, GRP_VARIAZIONI_AGGIORNAMENT);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DATAULTIMAGG, PPQRY_VARIMP12, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_LIST, "T55 GESTIONE AVANZO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_FORM, 4, 324, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55GESTIAVAN, MyGlb.PANEL_FORM, "T55 GESTIONE AVANZO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_T55GESTIAVAN, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_T55GESTIAVAN, PPQRY_T55, "A.GESTIONE_AVANZO", "T55GESTIAVAN", 5, 2, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_T55GESTIAVAN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_T55GESTIAVAN, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_LIST, "T55 MOTIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_FORM, 4, 460, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_T55MOTIVO, MyGlb.PANEL_FORM, "T55 MOTIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_T55MOTIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_T55MOTIVO, PPQRY_T55, "A.MOTIVO", "T55MOTIVO", 5, 3, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 13);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SEDE_DEL || ' - ' || TO_CHAR ( A.NUMERO_DEL ) || ' / ' || TO_CHAR ( A.ANNO_DEL ) as DELDELIBERA, ");
    SQL.append("  'E' as INFODEL ");
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
    SQL.append("  A.GESTIONE_AVANZO as T55GESTIAVAN, ");
    SQL.append("  A.MOTIVO as T55MOTIVO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T55, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_T55, "T55");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_DESC_OPERA_CRONO_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~) as CRONOPROGRAM ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("and   (A.MOTIVO IN ('RCA', 'RCP', 'CFC')) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_CRONOPROGRAM, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_CRONOPROGRAM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_CRONOPROGRAM, "T55");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(COUNT(*), 0, '', 'Variazione Bilancio Generata') as VARIBILAGENE ");
    SQL.append("from ");
    SQL.append("  VAR_PIANI_CRONOPROGRAMMI A ");
    SQL.append("where (A.PROGR_VARIMP_PROVENIENZA = ~~PROGRESSIVO~~) ");
    SQL.append("and   (A.VARIAZIONE_GENERATA = 'SI') ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARPIANICRON, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARPIANICRON, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_VARPIANICRON, "VAR_PIANI_CRONOPROGRAMMI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T56, 0, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T56, 1, SQL, PFL_VARIAZIONI_TIPOVARIAZIO, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_T56, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetQueryHeaderColumn(PPQRY_T56, "T55DESCRIZIO", "Descrizione");
    PAN_VARIAZIONI.SetQueryVisibleColumn(PPQRY_T56, "T55DESCRIZIO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as IMPFINESTFIN ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_IMPFIN1, 0, SQL, PFL_VARIAZIONI_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as IMPFINFINANZ, ");
    SQL.append("  LPAD(TO_CHAR ( A.FINANZIAMENTO ), 5, SUBSTR(' ', 1, 1)) || ' ' || ' - ' || ' ' || B.DESCRIZIONE as IMPFINESTFIN ");
    SQL.append("from ");
    SQL.append("  IMP_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_IMPFIN1, 1, SQL, PFL_VARIAZIONI_FINANZIAMENT, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_IMPFIN1, MainFrm.Cf4armDBObject.DB, 4);
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
    SQL.append("  A.ESERCIZIO_ENTRATA as TESCROESEENT, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO_ENTRATA ) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO_ENTRATA = ~~ANNO_ENTRATA_CRONO~~) ");
    SQL.append("and   (A.CRONOPROGRAMMA_ID = GET_CRONO_ID_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~)) ");
    SQL.append("and   (NOT ((A.ESERCIZIO_ENTRATA IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.ESERCIZIO_PLUR, ");
    SQL.append("  TO_CHAR ( B.ESERCIZIO_PLUR ) ");
    SQL.append("from ");
    SQL.append("  ENTRATE_CRONOPROGRAMMI B ");
    SQL.append("where (B.ESERCIZIO_PLUR = ~~ANNO_ENTRATA_CRONO~~) ");
    SQL.append("and   (B.CRONOPROGRAMMA_ID_SPESA = GET_CRONO_ID_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~)) ");
    SQL.append("and   (B.FINANZIAMENTO = DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, ~~FINANZIAMENTO~~, ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.FINANZIAMENTO_LIGHT ");
    SQL.append("from ");
    SQL.append("  IMP C ");
    SQL.append("where (C.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (C.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    SQL.append("))) ");
    SQL.append("order by 1 ");
    PAN_VARIAZIONI.SetQuery(PPQRY_TESTATCRONOP, 0, SQL, PFL_VARIAZIONI_ANNOENTRCRON, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO_ENTRATA as TESCROESEENT, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO_ENTRATA ) as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A ");
    SQL.append("where (A.CRONOPROGRAMMA_ID = GET_CRONO_ID_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~)) ");
    SQL.append("and   (NOT ((A.ESERCIZIO_ENTRATA IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.ESERCIZIO_PLUR, ");
    SQL.append("  TO_CHAR ( B.ESERCIZIO_PLUR ) ");
    SQL.append("from ");
    SQL.append("  ENTRATE_CRONOPROGRAMMI B ");
    SQL.append("where (B.CRONOPROGRAMMA_ID_SPESA = GET_CRONO_ID_DA_IMP(~~ANNO_IMP~~,~~NUMERO_IMP~~,~~ANNO_VAR~~,~~FINANZIAMENTO~~)) ");
    SQL.append("and   (B.FINANZIAMENTO = DECODE(" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, ~~FINANZIAMENTO~~, ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.FINANZIAMENTO_LIGHT ");
    SQL.append("from ");
    SQL.append("  IMP C ");
    SQL.append("where (C.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (C.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    SQL.append("))) ");
    SQL.append("order by 1 ");
    PAN_VARIAZIONI.SetQuery(PPQRY_TESTATCRONOP, 1, SQL, PFL_VARIAZIONI_ANNOENTRCRON, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_TESTATCRONOP, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO_DESTINAZIONE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_VARIAZIONI_FINANZDESTIN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_VARIAZIONI_FINANZDESTIN, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_VARIAZIONI_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_VARIAZIONI_UTENTEINSERI, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAUTULAGFOVV, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_VARIAZIONI_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as VAUTULAGFOVV, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_VARIAZIONI_UTENTULTIAGG, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARIMP12", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "VARIMP");
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
    SQL.append("  DECODE(A.SEDE_DEL, NULL, NULL, 'E') as VARINFDELLIS, ");
    SQL.append("  DECODE(A.UNITA_PROPONENTE, NULL, NULL, 'E') as VARINFPROLIS, ");
    SQL.append("  A.ANNO_ESIGIBILITA as ANNO_ESIGIBILITA, ");
    SQL.append("  A.VARIAZIONE_GENERATA as VARIAZIONE_GENERATA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ANNO_ENTRATA as ANNO_ENTRATA, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.ANNO_ESIGIBILITA_CRONO as ANNO_ESIGIBILITA_CRONO, ");
    SQL.append("  A.ANNO_ENTRATA_CRONO as ANNO_ENTRATA_CRONO, ");
    SQL.append("  A.FINANZIAMENTO_DESTINAZIONE as FINANZIAMENTO_DESTINAZIONE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP12, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARIMP A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP12, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.NUMERO_IMP = ~~TBL_VARIAZIONI5.ROWNAMNUMIMP~~) ");
    SQL.append("and   (A.ANNO_IMP = ~~TBL_VARIAZIONI5.ROWNAMANNIMP~~) ");
    SQL.append("and   (A.ANNO_VAR = DECODE(~~TBL_VARIAZIONI5.ROWNAMEIMPEG~~, 'INFO', A.ANNO_VAR, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    SQL.append("and   (A.PROGRESSIVO > 0) ");
    SQL.append("and   (~~TBL_VARIAZIONI5.ROWNAMCONPRO~~ = 'NO' OR (~~TBL_VARIAZIONI5.ROWNAMCONPRO~~ = 'SI' AND A.PROGRESSIVO = ~~TBL_VARIAZIONI5.ROWNAMEPROGR~~)) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP12, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP12, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP12, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_REG, ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARIMP12, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARIMP12, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARIMP");
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_AfterInsert();
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
