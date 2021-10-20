// **********************************************
// Dettagli Gruppo Movimenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettagliGruppoMovimenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_GRUPPOLABEL = 0;
  private static int PFL_PARAMETRI_IMPOTOTALABE = 1;
  private static int PFL_PARAMETRI_ANCHDETTEMES = 2;

  private static int PPQRY_PARAMETRI645 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_DETTAGGRUPPO_LIVELLOV = 0;
  private static int GRP_DETTAGGRUPPO_ECONOMICA = 1;
  private static int GRP_DETTAGGRUPPO_PROVVEDIMENT = 2;
  private static int GRP_DETTAGGRUPPO_MOVIMENTO = 3;

  private static int PFL_DETTAGGRUPPO_PROGRESSIVO = 0;
  private static int PFL_DETTAGGRUPPO_GRUPPO = 1;
  private static int PFL_DETTAGGRUPPO_CAPITOLOOLD = 2;
  private static int PFL_DETTAGGRUPPO_ARTICOLOOLD = 3;
  private static int PFL_DETTAGGRUPPO_CODICDEBIOLD = 4;
  private static int PFL_DETTAGGRUPPO_IMPORTO = 5;
  private static int PFL_DETTAGGRUPPO_CAPITOLO = 6;
  private static int PFL_DETTAGGRUPPO_ARTICOLO = 7;
  private static int PFL_DETTAGGRUPPO_BARRAVOCEPEG = 8;
  private static int PFL_DETTAGGRUPPO_APRICAPILIST = 9;
  private static int PFL_DETTAGGRUPPO_SCEVOCPEGLAB = 10;
  private static int PFL_DETTAGGRUPPO_INFOCAPILIST = 11;
  private static int PFL_DETTAGGRUPPO_INFVOCPEGDET = 12;
  private static int PFL_DETTAGGRUPPO_CODICEDEBITO = 13;
  private static int PFL_DETTAGGRUPPO_DEBITORE = 14;
  private static int PFL_DETTAGGRUPPO_APRIDEBILIST = 15;
  private static int PFL_DETTAGGRUPPO_SELEZISOGGET = 16;
  private static int PFL_DETTAGGRUPPO_INFODEBILIST = 17;
  private static int PFL_DETTAGGRUPPO_INFODEBIDETT = 18;
  private static int PFL_DETTAGGRUPPO_DESCRIZIONE = 19;
  private static int PFL_DETTAGGRUPPO_ETICCODVLIVE = 20;
  private static int PFL_DETTAGGRUPPO_CODLIVELLO5 = 21;
  private static int PFL_DETTAGGRUPPO_VISSTRRICDES = 22;
  private static int PFL_DETTAGGRUPPO_CODICEEUROPE = 23;
  private static int PFL_DETTAGGRUPPO_DATAREGISTRA = 24;
  private static int PFL_DETTAGGRUPPO_TIPOVINCOLO = 25;
  private static int PFL_DETTAGGRUPPO_FINANZIAMENT = 26;
  private static int PFL_DETTAGGRUPPO_OPERA = 27;
  private static int PFL_DETTAGGRUPPO_FATTORE = 28;
  private static int PFL_DETTAGGRUPPO_FATTORDESCRI = 29;
  private static int PFL_DETTAGGRUPPO_CENTRO = 30;
  private static int PFL_DETTAGGRUPPO_CENTRIDESCRI = 31;
  private static int PFL_DETTAGGRUPPO_COMPETENZDAL = 32;
  private static int PFL_DETTAGGRUPPO_AL = 33;
  private static int PFL_DETTAGGRUPPO_IMPUTAECONOM = 34;
  private static int PFL_DETTAGGRUPPO_DATAREGECONO = 35;
  private static int PFL_DETTAGGRUPPO_ETICHLABELSX = 36;
  private static int PFL_DETTAGGRUPPO_SEDEDEL = 37;
  private static int PFL_DETTAGGRUPPO_NUMERODEL = 38;
  private static int PFL_DETTAGGRUPPO_ANNODEL = 39;
  private static int PFL_DETTAGGRUPPO_UNITAPROPONE = 40;
  private static int PFL_DETTAGGRUPPO_NUMEROPROPOS = 41;
  private static int PFL_DETTAGGRUPPO_ANNOPROPOSTA = 42;
  private static int PFL_DETTAGGRUPPO_SCEGDELILABE = 43;
  private static int PFL_DETTAGGRUPPO_INFODELIBERA = 44;
  private static int PFL_DETTAGGRUPPO_SCEGPROPLABE = 45;
  private static int PFL_DETTAGGRUPPO_INFOPROPOSTA = 46;
  private static int PFL_DETTAGGRUPPO_ETICHLABELDX = 47;
  private static int PFL_DETTAGGRUPPO_NUMEMOVIEMES = 48;
  private static int PFL_DETTAGGRUPPO_BARRVOCEPEG1 = 49;
  private static int PFL_DETTAGGRUPPO_ANNOMOVIEMES = 50;
  private static int PFL_DETTAGGRUPPO_INFOMOVILIST = 51;
  private static int PFL_DETTAGGRUPPO_INFOMOVIMENT = 52;
  private static int PFL_DETTAGGRUPPO_UTENTEINSERI = 53;
  private static int PFL_DETTAGGRUPPO_DATAINSERIME = 54;
  private static int PFL_DETTAGGRUPPO_UTENTULTIAGG = 55;
  private static int PFL_DETTAGGRUPPO_DATAULTIMAGG = 56;
  private static int PFL_DETTAGGRUPPO_ANNOMOVIVAR = 57;
  private static int PFL_DETTAGGRUPPO_NUMERMOVIVAR = 58;
  private static int PFL_DETTAGGRUPPO_FATTORITIPO = 59;
  private static int PFL_DETTAGGRUPPO_TIPOMOVI = 60;

  private static int PPQRY_MOVIMEIMPORT = 0;

  private static int PPQRY_SOGGETTO = 1;
  private static int PPQRY_FATTORI = 2;
  private static int PPQRY_CENTRI = 3;
  private static int PPQRY_CODLIVELLO5 = 4;
  private static int PPQRY_APRIINFO = 5;

  private static int PPQRY_CODTRANSEURO = 6;
  private static int PPQRY_VINCOLI = 7;
  private static int PPQRY_BILFIN1 = 8;
  private static int PPQRY_BILFIN = 9;


  IDPanel PAN_DETTAGGRUPPO;

  // Definition of Global Variables
  private IDVariant NUOVOPROGRES = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant DUPLICA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI646(IMDB);
    //
    //
    Init_PQRY_MOVIMEIMPORT(IMDB);
    Init_PQRY_PARAMETRI645(IMDB);
    Init_PQRY_PARAMETRI645_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI646(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI646, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI646, "TBL_PARAMETRI646");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, "PARATIPOMOVI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARATIPOFILE, "PARATIPOFILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARATIPOFILE,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARANCDETEME, "PARANCDETEME");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI646,IMDBDef5.FLD_PARAMETRI646_PARANCDETEME,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI646, 0);
  }

  private static void Init_PQRY_MOVIMEIMPORT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_MOVIMEIMPORT, 37);
    IMDB.set_TblCode(IMDBDef14.PQRY_MOVIMEIMPORT, "PQRY_MOVIMEIMPORT");
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_GRUPPO, "GRUPPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_GRUPPO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_TIPO_MOVI, "TIPO_MOVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_TIPO_MOVI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPCAPOLD, "MOVIMPCAPOLD");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPCAPOLD,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPARTOLD, "MOVIMPARTOLD");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPARTOLD,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_MOVI_VAR, "NUMERO_MOVI_VAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_MOVI_VAR,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_VAR, "ANNO_MOVI_VAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_REGISTRAZIONE, "DATA_REGISTRAZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_REGISTRAZIONE,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO, "SOGGETTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO,3,38,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPSOGOLD, "MOVIMPSOGOLD");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPSOGOLD,3,28,6);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_IMPUTAZIONE_ECONOMICA, "IMPUTAZIONE_ECONOMICA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_IMPUTAZIONE_ECONOMICA,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_DAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_AL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_REG_ECONOMICA, "DATA_REG_ECONOMICA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_REG_ECONOMICA,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_DATA_ULTIMO_AGG,8,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_EMESSO, "ANNO_MOVI_EMESSO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_EMESSO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_MOVI_EMESSO, "NUMERO_MOVI_EMESSO");
    IMDB.SetFldParams(IMDBDef14.PQRY_MOVIMEIMPORT,IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_MOVI_EMESSO,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_MOVIMEIMPORT, 0);
  }

  private static void Init_PQRY_PARAMETRI645(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI645, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI645, "PQRY_PARAMETRI645");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARATIPOMOVI, "PARATIPOMOVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARATIPOMOVI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARANCDETEME, "PARANCDETEME");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645,IMDBDef14.PQSL_PARAMETRI645_PARANCDETEME,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI645, 0);
  }

  private static void Init_PQRY_PARAMETRI645_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI645_RS, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI645_RS, "PQRY_PARAMETRI645_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARATIPOMOVI, "PARATIPOMOVI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARATIPOMOVI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARANCDETEME, "PARANCDETEME");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI645_RS,IMDBDef14.PQSL_PARAMETRI645_PARANCDETEME,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettagliGruppoMovimenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettagliGruppoMovimenti()
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
    FormIdx = MyGlb.FRM_DETTGRUPMOVI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "835E7E8F-DFD7-4453-B1D0-196F1C10DC87";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1232;
    DesignHeight = 654;
    set_Caption(new IDVariant("Dettagli Gruppo Movimenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1232;
    Frames[1].Height = 628;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.101911;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1232;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1232-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "37D1B411-2B2A-4842-ABC3-03B13D7A4F86");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 168, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1232;
    Frames[3].Height = 564;
    Frames[3].Caption = "Dettagli Gruppo";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 564;
    PAN_DETTAGGRUPPO = new IDPanel(w, this, 3, "PAN_DETTAGGRUPPO");
    Frames[3].Content = PAN_DETTAGGRUPPO;
    PAN_DETTAGGRUPPO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGGRUPPO.VS = MainFrm.VisualStyleList;
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1232-MyGlb.PAN_OFFS_X, 564-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5AF5967F-A37B-43E6-BAE3-0704A3E97233");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 12, 1204, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGGRUPPO.InitStatus = 2;
    PAN_DETTAGGRUPPO_Init();
    PAN_DETTAGGRUPPO_InitFields();
    PAN_DETTAGGRUPPO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA58+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG189+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG188+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG189+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_IMPORTDAFIL1+BaseCmdLinIdx)
      {
        ImportdaFile();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIVALOCOM6+BaseCmdLinIdx)
      {
        ApriAggiornamentoValoriComuni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONTDISPPUR2+BaseCmdLinIdx)
      {
        ApriControlloDisponibilitàPuro();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSIONE+BaseCmdLinIdx)
      {
        ApriEmissione();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI646, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DETTGRUPMOVI_PARAMETRI645();
      }
      PAN_DETTAGGRUPPO.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_APRICAPILIST) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_SCEVOCPEGLAB) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_APRIDEBILIST) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_SELEZISOGGET) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_CODLIVELLO5) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_CENTRO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_SCEGDELILABE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_DETTAGGRUPPO.FrIndex)
    {
      if (IdxFieldActived ==PFL_DETTAGGRUPPO_SCEGPROPLABE) {
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
    return (obj instanceof DettagliGruppoMovimenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettagliGruppoMovimenti.class.getName() : (Glb.ClassWithPackage(DettagliGruppoMovimenti.class) ? DettagliGruppoMovimenti.class.getName().substring(DettagliGruppoMovimenti.class.getPackage().getName().length() + 1) : DettagliGruppoMovimenti.class.getName()));
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
    IDVariant v_PERSONALIZZA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_WINDOWPERS = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_WINDOW = (new IDVariant("w_grl", IDVariant.STRING));
      v_WINDOWPERS = (new IDVariant("w_grl_riv", IDVariant.STRING));
      v_CAPTION = (new IDVariant("Dettagli Gruppo ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_EMISSIONE = new IDVariant(0,IDVariant.STRING);
      v_EMISSIONE = (new IDVariant("Emissione "));
      set_Caption(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, (IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC")))? new IDVariant("Accertamenti") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("IMP")))? new IDVariant("Impegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("SUBIMP")))? new IDVariant("Subimpegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ORD")))? new IDVariant("Ordinativi") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("LIQ")))? new IDVariant("Liquidazioni") :  new IDVariant())), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0))));
      Frames[PAN_DETTAGGRUPPO.FrIndex].set_Caption(IDL.Add(v_CAPTION, (IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC")))? new IDVariant("Accertamenti") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("IMP")))? new IDVariant("Impegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("SUBIMP")))? new IDVariant("Subimpegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ORD")))? new IDVariant("Ordinativi") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("LIQ")))? new IDVariant("Liquidazioni") :  new IDVariant())).stringValue());
      VisibilitàFinanziaria();
      VisibilitàEconomica();
      PAN_DETTAGGRUPPO.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_GRUPPOLABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Gruppo")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARADESCGRUP, 0)).stringValue());
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_DETTAGGRUPPO.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_DETTAGGRUPPO.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOFILE, 0))))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_IMPORTDAFIL1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_IMPORTDAFIL1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_EMISSIONE+BaseCmdLinIdx, IDL.Add(v_EMISSIONE, (IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC")))? new IDVariant("Accertamenti") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("IMP")))? new IDVariant("Impegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("SUBIMP")))? new IDVariant("Subimpegni") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ORD")))? new IDVariant("Ordinativi") : IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("LIQ")))? new IDVariant("Liquidazioni") :  new IDVariant())).stringValue());
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC")), true))
      {
        IDVariant v_ACCERTAMENTO = new IDVariant(0,IDVariant.STRING);
        v_ACCERTAMENTO = (new IDVariant("Accertamento"));
        PAN_DETTAGGRUPPO.set_Header(Glb.OBJ_GROUP,GRP_DETTAGGRUPPO_MOVIMENTO,v_ACCERTAMENTO.stringValue()); 
        if (MainFrm.MODAIMPUENTR.equals((new IDVariant("AC")), true))
        {
          PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
        v_IMPEGNO = (new IDVariant("Impegno"));
        PAN_DETTAGGRUPPO.set_Header(Glb.OBJ_GROUP,GRP_DETTAGGRUPPO_MOVIMENTO,v_IMPEGNO.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPCAPOLD, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPARTOLD, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        ProponiDaCapitolo();
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_VAR, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_MOVI_VAR, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0),IDVariant.DECIMAL));
      }
      // 
      // 
      // 
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPSOGOLD, 0, new IDVariant(IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0),IDVariant.DECIMAL));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPSOGOLD, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGGVALCOMMOV)), true) && Result.booleanValue())
      {
        if (AggiornaValori())
        {
          PAN_DETTAGGRUPPO.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_IMPDAFILSUGR)), true))
      {
        PAN_DETTAGGRUPPO.PanelCommand(Glb.PCM_REQUERY);
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0),IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_EMISSIMOVIME)), true))
      {
        PAN_DETTAGGRUPPO.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "EndModalEvent", _e);
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
      UNLOADEVENT_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARADESCGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOFILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARANCDETEME, 0, new IDVariant());
  }

  // **********************************************************************
  // Dettagli Gruppo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGGRUPPO);
      // 
      // Dettagli Gruppo On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGGRUPPO.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGGRUPPO_DEBITORE,(new IDVariant(PAN_DETTAGGRUPPO.FieldText(PFL_DETTAGGRUPPO_DEBITORE))).stringValue()); 
      PAN_DETTAGGRUPPO.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGGRUPPO_DESCRIZIONE,(new IDVariant(PAN_DETTAGGRUPPO.FieldText(PFL_DETTAGGRUPPO_DESCRIZIONE))).stringValue()); 
      PAN_DETTAGGRUPPO.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGGRUPPO_VISSTRRICDES,(new IDVariant(PAN_DETTAGGRUPPO.FieldText(PFL_DETTAGGRUPPO_VISSTRRICDES))).stringValue()); 
      PAN_DETTAGGRUPPO.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGGRUPPO_CODICEEUROPE,(new IDVariant(PAN_DETTAGGRUPPO.FieldText(PFL_DETTAGGRUPPO_CODICEEUROPE))).stringValue()); 
      PAN_DETTAGGRUPPO.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGGRUPPO_TIPOVINCOLO,(new IDVariant(PAN_DETTAGGRUPPO.FieldText(PFL_DETTAGGRUPPO_TIPOVINCOLO))).stringValue()); 
      // 
      // 
      // 
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_EMESSO, 0)))
      {
        AbilitaCampi();
      }
      else
      {
        DisabilitaCampi();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo After Find Event Body
      // Procedure Body
      // 
      SettaTotale();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_DETTAGGRUPPO.PanelCommand(Glb.PCM_REQUERY);
        Cancel.set((new IDVariant(-1)));
      }
      if (Command.equals((new IDVariant(256)), true))
      {
        DUPLICA = (new IDVariant(-1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_GRUPPO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_GRUPPO, 0, new IDVariant(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_TIPO_MOVI, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_DATA_REGISTRAZIONE, 0, IDL.Today());
          if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
          {
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_DATA_REG_ECONOMICA, 0, IDL.Today());
          }
          if (IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC")), true) && MainFrm.MODAIMPUENTR.equals((new IDVariant("AC")), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_IMPUTAZIONE_ECONOMICA, 0, (new IDVariant("SI")));
          }
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_DATA_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_INSERIMENTO, 0)) || DUPLICA.booleanValue())
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_DATA_INSERIMENTO, 0, IDL.Today());
        }
        if (DUPLICA.booleanValue())
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPCAPOLD, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPARTOLD, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPSOGOLD, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO, 0));
          DUPLICA = (new IDVariant(0));
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0 || IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTAGGRUPPO_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_DETTAGGRUPPO_ARTICOLO)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPCAPOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPARTOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0))))
          {
            if (MainFrm.CapitoloPresente(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0)))
            {
              ProponiDaCapitolo();
            }
            else
            {
              IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0, (new IDVariant()));
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPCAPOLD, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_MOVIMPARTOLD, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTAGGRUPPO_FINANZIAMENT)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FINANZIAMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_OPERA, 0, (new IDVariant()));
        }
        else
        {
          ProponiOpera();
        }
      }
      // 
      // 
      // 
      // 
      if (Column.equals((new IDVariant(PFL_DETTAGGRUPPO_IMPORTO)), true))
      {
        SettaTotale();
      }
      if (Column.equals((new IDVariant(PFL_DETTAGGRUPPO_CODLIVELLO5)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  VISTA_STRUTTURA_RICL A, ");
          SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
          SQL.append("where (B.ESERCIZIO(+) = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.E_S(+) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
          SQL.append("and   (B.CAPITOLO(+) = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.ARTICOLO(+) = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.CODICE_TIPO_RICL(+) = 'MACRO') ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(B.ESERCIZIO_INIZIO(+), 0) AND NVL(B.ESERCIZIO_SCADENZA(+), 9999))) ");
          SQL.append("and   (A.CODICE_PADRE = NVL(B.CODICE(+), A.CODICE_PADRE)) ");
          SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
          SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
          SQL.append("and   (A.LIVELLO = 2) ");
          SQL.append("and   (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
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
            S = (new IDVariant("Codice V Livello inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0, (new IDVariant()));
          }
          else
          {
            if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(0)), true)>0)
            {
              if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE, 0)))
              {
                IDVariant v_VGETCODLIVE4 = new IDVariant(0,IDVariant.DECIMAL);
                v_VGETCODLIVE4 = (new IDVariant());
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  GET_COD_LIVELLO_4(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')," + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as GCL4SEIEPTMA ");
                SQL.append("from ");
                SQL.append("  DUAL A ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VGETCODLIVE4 = QV.Get("GCL4SEIEPTMA", IDVariant.DECIMAL) ;
                }
                QV.Close();
                IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE, 0, MainFrm.Getfattoreassociatoeconomica(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), new IDVariant(v_VGETCODLIVE4,IDVariant.INTEGER), new IDVariant(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0),IDVariant.INTEGER)));
              }
            }
          }
        }
      }
      if (Inserting.booleanValue() || ((Column.equals((new IDVariant(PFL_DETTAGGRUPPO_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_DETTAGGRUPPO_ARTICOLO)), true) || Column.equals((new IDVariant(PFL_DETTAGGRUPPO_IMPORTO)), true)) && FieldWasModified.booleanValue()))
      {
      }
      if (Column.equals((new IDVariant(PFL_DETTAGGRUPPO_FATTORE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE, 0))))
        {
          IDVariant v_VFATTORITIPO = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.TIPO as FATTORITIPO ");
          SQL.append("from ");
          SQL.append("  FATTORI A ");
          SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VFATTORITIPO = QV.Get("FATTORITIPO", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VFATTORITIPO.compareTo((new IDVariant("E")), true)!=0)
          {
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CENTRO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_DAL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_AL, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CENTRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_DAL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COMPETENZA_AL, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_DETTAGGRUPPO_SEDEDEL)), true) || Column.equals((new IDVariant(PFL_DETTAGGRUPPO_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_DETTAGGRUPPO_ANNODEL)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0)));
        }
        v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
      }
      if (Column.equals((new IDVariant(PFL_DETTAGGRUPPO_ANNOPROPOSTA)), true) || Column.equals((new IDVariant(PFL_DETTAGGRUPPO_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_DETTAGGRUPPO_UNITAPROPONE)), true))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0)));
        }
        v_UNITAPROP = IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA, 0);
        v_NUMEROPROP = new IDVariant(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA, 0),IDVariant.INTEGER);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA, 0, new IDVariant(new IDVariant(v_NUMEROPROP),IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROP));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo On Database Error Event
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
  private void PAN_DETTAGGRUPPO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_DETTAGGRUPPO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Dettagli Gruppo On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo On Change Status Event Body
      // Procedure Body
      // 
      VisibilitàComandi();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo Before Insert Event Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(MAX(A.PROGRESSIVO), 0) + 1 as NUVAMAMOIPZU ");
      SQL.append("from ");
      SQL.append("  MOVIMENTI_IMPORT A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        NUOVOPROGRES = QV.Get("NUVAMAMOIPZU", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_PROGRESSIVO, 0, new IDVariant(new IDVariant(NUOVOPROGRES),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_DETTAGGRUPPO_DEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_DETTAGGRUPPO.FieldText(PFL_DETTAGGRUPPO_DEBITORE))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Dettagli Gruppo On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettagli Gruppo On Change Row Body
      // Corpo Procedura
      // 
      // 
      // messo qui perchè si riferisce a visibilità di campi
      // in dettaglio anche nella visualizzazione in lista
      // 
      VisibilitàInfoDett();
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_EMESSO, 0)))
      {
        PAN_DETTAGGRUPPO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_DETTAGGRUPPO.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA58+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGGRUPPO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_DETTAGGRUPPO.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA58+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DettagliGruppoOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Info Soggetto
  // **********************************************************************
  public int InfoSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, new IDVariant(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO, 0),IDVariant.FLOAT));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "InfoSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo
  // **********************************************************************
  public int InfoCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Capitolo Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0))))
      {
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Debitore
  // **********************************************************************
  public int SceltaDebitore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Debitore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "SceltaDebitore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scegli Capitolo
  // **********************************************************************
  public int ScegliCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ScegliCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Fattore
  // **********************************************************************
  public int SceltaFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      if (MainFrm.FILTRFATTPCF.equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMFICOEC, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMEES, 0, ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMCODQUA, 0, MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0)));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMCODQUI, 0, new IDVariant(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0),IDVariant.INTEGER));
      }
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "SceltaFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Centro
  // **********************************************************************
  public int SceltaCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "SceltaCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Liv 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaLiv5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Liv 5 Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0)),IDVariant.DECIMAL));
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ApriSceltaLiv5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
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
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposte
  // **********************************************************************
  public int InfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, new IDVariant(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Movimento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoMovimento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Movimento Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_MOVI_EMESSO, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_EMESSO, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "InfoMovimento", _e);
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
    IDVariant v_CGU = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VINCOLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Capitolo Body
      // Procedure Body
      // 
      v_VOCEECONOMIC = (new IDVariant());
      v_VINCOLO = (new IDVariant());
      v_FATTORE = (new IDVariant());
      v_CENTRO = (new IDVariant());
      IDVariant v_VCAPCODIEURO = null;
      v_VCAPCODIEURO = (new IDVariant());
      IDVariant v_VCAPTOTFIN = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.VOCE_ECON as CAPVOCEECON, ");
      SQL.append("  A.TIPO_VINCOLO as CAPTIPOVINCO, ");
      SQL.append("  A.CODICE_GESTIONALE as CAPCODICGEST, ");
      SQL.append("  A.FATTORE as CAPFATTORE, ");
      SQL.append("  A.CENTRO as CAPCENTRO, ");
      SQL.append("  A.CODICE_EUROPEO as CAPCODICEURO, ");
      SQL.append("  CHECK_CAP_TOT_FIN(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as CCTFCECESCCC ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VOCEECONOMIC = QV.Get("CAPVOCEECON", IDVariant.INTEGER) ;
        v_VINCOLO = QV.Get("CAPTIPOVINCO", IDVariant.INTEGER) ;
        v_CGU = QV.Get("CAPCODICGEST", IDVariant.INTEGER) ;
        v_FATTORE = QV.Get("CAPFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("CAPCENTRO", IDVariant.STRING) ;
        v_VCAPCODIEURO = QV.Get("CAPCODICEURO", IDVariant.INTEGER) ;
        v_VCAPTOTFIN = QV.Get("CCTFCECESCCC", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_COD_LIVELLO_5, 0, new IDVariant(MainFrm.GetLiv5DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), ((IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC"))))?(new IDVariant("E")):(new IDVariant("S"))), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0)),IDVariant.DECIMAL));
      if (!(IDL.IsNull(v_VCAPCODIEURO)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CODICE_EUROPEO, 0, new IDVariant(v_VCAPCODIEURO));
      }
      if (!(IDL.IsNull(v_VINCOLO)))
      {
        if (!(MainFrm.ControlloVincoloScaduto(v_VINCOLO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_TIPO_VINCOLO, 0, new IDVariant(v_VINCOLO));
        }
      }
      if (!(IDL.IsNull(v_FATTORE)) && MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FATTORE, 0, new IDVariant(v_FATTORE));
        }
      }
      if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
      {
        if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CENTRO, 0, new IDVariant(v_CENTRO));
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
        SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_FINANZIAMENT = QV.Get("MINBILFINFIN", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_FINANZIAMENT)) && v_VCAPTOTFIN.equals((new IDVariant("SI")), true))
        {
          IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FINANZIAMENTO, 0, new IDVariant(v_FINANZIAMENT));
          v_OPERA = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(DISTINCT A.OPERA) as DISCOUBIFIOP, ");
          SQL.append("  MIN(A.OPERA) as MINBILFINOPE ");
          SQL.append("from ");
          SQL.append("  BIL_FIN A, ");
          SQL.append("  OPERE B ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (B.CODICE = A.OPERA) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NUMREC = QV.Get("DISCOUBIFIOP", IDVariant.INTEGER) ;
            v_OPERA = QV.Get("MINBILFINOPE", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_NUMREC.equals((new IDVariant(1)), true) || v_NUMREC.equals((new IDVariant(0)), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_OPERA, 0, new IDVariant(v_OPERA));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FINANZIAMENTO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_OPERA, 0, (new IDVariant()));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ProponiDaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Opera
  // **********************************************************************
  public int ProponiOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Opera Body
      // Procedure Body
      // 
      v_OPERA = (new IDVariant());
      IDVariant v_VCAPTOTFIN = new IDVariant(0,IDVariant.STRING);
      v_VCAPTOTFIN = (new IDVariant("NO"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(DISTINCT A.OPERA) as DISCOUBIFIOP, ");
      SQL.append("  MIN(A.OPERA) as MINBILFINOPE, ");
      SQL.append("  CHECK_CAP_TOT_FIN(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as CCTFBFEBFESB ");
      SQL.append("from ");
      SQL.append("  BIL_FIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("group by ");
      SQL.append("  CHECK_CAP_TOT_FIN(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("DISCOUBIFIOP", IDVariant.INTEGER) ;
        v_OPERA = QV.Get("MINBILFINOPE", IDVariant.INTEGER) ;
        v_VCAPTOTFIN = QV.Get("CCTFBFEBFESB", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_NUMREC.compareTo((new IDVariant(1)), true)<=0 && v_VCAPTOTFIN.equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_OPERA, 0, new IDVariant(v_OPERA));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_OPERA, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ProponiOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Totale
  // **********************************************************************
  public int SettaTotale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Totale Body
      // Procedure Body
      // 
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_IMPOTOTALABE, IDL.Add(IDL.Add(IDL.Add((new IDVariant("Totale")), (new IDVariant(":"))), (new IDVariant(" "))), IDL.Format(PAN_DETTAGGRUPPO.GetFieldSum(PFL_DETTAGGRUPPO_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm, (new IDVariant(",")), (new IDVariant(".")))).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "SettaTotale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Info Dett
  // **********************************************************************
  public int VisibilitàInfoDett ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Info Dett Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ARTICOLO, 0))))
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SOGGETTO, 0))))
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_SEDE_DEL, 0))))
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_UNITA_PROPONENTE, 0))))
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_NUMERO_MOVI_EMESSO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_MOVIMEIMPORT, IMDBDef14.PQSL_MOVIMEIMPORT_ANNO_MOVI_EMESSO, 0))))
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "VisibilitàInfoDett", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Economica
  // **********************************************************************
  public int VisibilitàEconomica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Economica Body
      // Procedure Body
      // 
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
        {
          PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "VisibilitàEconomica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Finanziaria
  // **********************************************************************
  public int VisibilitàFinanziaria ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Finanziaria Body
      // Procedure Body
      // 
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "VisibilitàFinanziaria", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Comandi
  // **********************************************************************
  public int VisibilitàComandi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Comandi Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DETTAGGRUPPO.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET30+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET30+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if (new IDVariant(PAN_DETTAGGRUPPO.Status()).equals((new IDVariant(2)), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG189+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG189+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "VisibilitàComandi", _e);
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
      if (new IDVariant(PAN_DETTAGGRUPPO.Status()).equals((new IDVariant(3)), true))
      {
        if (Controlli())
        {
          PAN_DETTAGGRUPPO.PanelCommand(Glb.PCM_UPDATE);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Emissione
  // **********************************************************************
  public int ApriEmissione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Emissione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARACODIGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI648, IMDBDef5.FLD_PARAMETRI648_PARATIPOMOVI, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0));
      MainFrm.Show(MyGlb.FRM_EMISSIMOVIME, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ApriEmissione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Controllo Disponibilità Puro
  // **********************************************************************
  public int ApriControlloDisponibilitàPuro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Controllo Disponibilità Puro Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.IMPORTMOVIMENTIDAFILEGRUPPICONTROLLOPURO(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_PSESSIONE = new IDVariant(0,IDVariant.STRING);
        v_PSESSIONE = (new IDVariant("P_SESSIONE"));
        IDVariant v_PGRUPPO = new IDVariant(0,IDVariant.STRING);
        v_PGRUPPO = (new IDVariant("P_GRUPPO"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Controllo_Disponibilita_Gruppo"));
        MainFrm.SetParametroStampaJasper(v_PSESSIONE, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PGRUPPO, IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0)));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ApriControlloDisponibilitàPuro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Aggiornamento Valori Comuni
  // **********************************************************************
  public int ApriAggiornamentoValoriComuni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Aggiornamento Valori Comuni Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DETTAGGRUPPO.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Ci sono modifiche in sospeso. Confermare o annullare.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      else
      {
        APRAGGVALCOM_VALCOMMOVDEL();
        IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0, (new IDVariant("ACC")));
        MainFrm.Show(MyGlb.FRM_AGGVALCOMMOV, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ApriAggiornamentoValoriComuni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Valori Comuni Mov: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void APRAGGVALCOM_VALCOMMOVDEL() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMTIPMOV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_ANNO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_NUMERO_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_SEDE_DEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKDES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_DESCRIZIONE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMCKTIVI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_TIPO_VINCOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_FATTORE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CENTRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_COMP_DAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_COMP_AL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALCOMIMPECO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKTRA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CODICE_COFOG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CODICE_EUROPEO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_COD_LIVELLO_5, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_VALOCOMCKCAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_CAPITOLO_OLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_ARTICOLO_OLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_FINANZIAMENTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_OPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_PROGR_UNITA_ORGANIZZATIVA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_BENEFICIARIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_VALORCOMUMOV, IMDBDef5.FLD_VALORCOMUMOV_NUM_QUIETANZA, 0, new IDVariant());
  }

  // **********************************************************************
  // Import da File
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ImportdaFile ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Import da File Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMGRUPPO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARADESCGRUP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARADESCGRUP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARATIPOMOVI, 0, IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI643, IMDBDef5.FLD_PARAMETRI643_PARAMFASE, 0, (new IDVariant("IMP_GRA")));
      MainFrm.Show(MyGlb.FRM_IMPDAFILSUGR, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "ImportdaFile", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli
  // **********************************************************************
  public boolean Controlli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Body
      // Corpo Procedura
      // 
      IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
      IDVariant v_CODEU = new IDVariant(0,IDVariant.INTEGER);
      v_CODEU = (new IDVariant(0));
      IDVariant v_CODQUINTO = new IDVariant(0,IDVariant.INTEGER);
      v_CODQUINTO = (new IDVariant(0));
      IDVariant I = new IDVariant(0,IDVariant.INTEGER);
      for (I = (new IDVariant(1)); I.compareTo((new IDVariant(PAN_DETTAGGRUPPO.NumRows)), true)<=0; I = IDL.Add(I, (new IDVariant(1))))
      {
        if (!(IDL.IsNull(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_GRUPPO,I.intValue()))))
        {
          IDVariant v_RIGA = new IDVariant(0,IDVariant.STRING);
          v_RIGA = (new IDVariant("Riga "));
          if ((IDL.IsNull(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_CAPITOLO,I.intValue())) && !(IDL.IsNull(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_ARTICOLO,I.intValue())))) || (!(IDL.IsNull(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_CAPITOLO,I.intValue()))) && IDL.IsNull(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_ARTICOLO,I.intValue()))))
          {
            IDVariant v_AVVISOVOCEPE = new IDVariant(0,IDVariant.STRING);
            v_AVVISOVOCEPE = (new IDVariant(": Dati Capitolo incompleti", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_RIGA, IDL.ToString(I)), v_AVVISOVOCEPE)); 
            return (new IDVariant(0)).booleanValue();
          }
          if (IDL.IsNull(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_CODLIVELLO5,I.intValue())))
          {
            IDVariant v_VFOUND = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_VCODICE = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_CAPITOLO = null;
            v_CAPITOLO = IDL.ToCurrency(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_CAPITOLO,I.intValue()));
            IDVariant v_ARTICOLO = null;
            v_ARTICOLO = IDL.ToInteger(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_ARTICOLO,I.intValue()));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.CODICE as VISSTRRICCOD ");
            SQL.append("from ");
            SQL.append("  VISTA_STRUTTURA_RICL A, ");
            SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
            SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
            SQL.append("and   (B.CAPITOLO = " + IDL.CSql(v_CAPITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.ARTICOLO = " + IDL.CSql(v_ARTICOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (B.CODICE_TIPO_RICL = 'MACRO') ");
            SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ACC', 'E', 'S')) ");
            SQL.append("and   (A.LIVELLO = 2) ");
            SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.CODICE_PADRE = B.CODICE)) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            v_VFOUND = (QV.RecordCount()!=0 ? IDVariant.TRUE : IDVariant.FALSE);
            if (!QV.EOF())
            {
              v_VCODICE = QV.Get("VISSTRRICCOD", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VFOUND.booleanValue())
            {
              v_CODQUINTO = IDL.Add(v_CODQUINTO, (new IDVariant(1)));
            }
          }
          if (IDL.IsNull(PAN_DETTAGGRUPPO.GetValueAt(PFL_DETTAGGRUPPO_CODICEEUROPE,I.intValue())))
          {
            v_CODEU = IDL.Add(v_CODEU, (new IDVariant(1)));
          }
        }
        else
        {
          I = (new IDVariant(PAN_DETTAGGRUPPO.NumRows));
        }
      }
      if (v_CODEU.compareTo((new IDVariant(0)), true)>0 || v_CODQUINTO.compareTo((new IDVariant(0)), true)>0)
      {
        v_ERRORE = IDL.Add((new IDVariant("Sono presenti dettagli ")), (new IDVariant("<br/>")));
      }
      if (v_CODQUINTO.compareTo((new IDVariant(0)), true)>0)
      {
        v_ERRORE = IDL.Add(IDL.Add(v_ERRORE, (new IDVariant("Senza codice V livello"))), (new IDVariant("<br/>")));
      }
      if (v_CODEU.compareTo((new IDVariant(0)), true)>0)
      {
        v_ERRORE = IDL.Add(v_ERRORE, (new IDVariant("Senza Codice Europeo")));
      }
      if (IDL.NullValue(v_ERRORE,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        if (!(MainFrm.MessageConfirm(v_ERRORE)))
        {
          return (new IDVariant(0)).booleanValue();
        }
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "Controlli", _e);
      return false;
    }
  }

  // **********************************************************************
  // Aggiorna Valori
  // **********************************************************************
  public boolean AggiornaValori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Aggiorna Valori Body
      // Procedure Body
      // 
      IDVariant v_PROPALTRCAMP = new IDVariant(0,IDVariant.INTEGER);
      try
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        C3 = PAN_DETTAGGRUPPO.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_DETTAGGRUPPO.GotoFirst();
        while (!PAN_DETTAGGRUPPO.RSEOF())
        {
          if (PAN_DETTAGGRUPPO.IsRowSelected(I.intValue()))
          {
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKDES, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update MOVIMENTI_IMPORT set ");
              SQL.append("  DESCRIZIONE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_DESCRIZIONE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALCOMCKTIVI, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update MOVIMENTI_IMPORT set ");
              SQL.append("  TIPO_VINCOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_TIPO_VINCOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKECO, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update MOVIMENTI_IMPORT set ");
              SQL.append("  FATTORE = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", MOVIMENTI_IMPORT.FATTORE), ");
              SQL.append("  CENTRO = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CENTRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", MOVIMENTI_IMPORT.CENTRO), ");
              SQL.append("  COMPETENZA_DAL = CASE WHEN NOT ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_DAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN CASE WHEN NOT ((MOVIMENTI_IMPORT.FATTORE IS NULL)) THEN " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_DAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ELSE MOVIMENTI_IMPORT.COMPETENZA_DAL END ELSE CASE WHEN MOVIMENTI_IMPORT.FATTORE <> " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " THEN to_date(NULL) ELSE MOVIMENTI_IMPORT.COMPETENZA_DAL END END, ");
              SQL.append("  COMPETENZA_AL = CASE WHEN NOT ((" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_AL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) THEN CASE WHEN NOT ((MOVIMENTI_IMPORT.FATTORE IS NULL)) THEN " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COMP_AL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ELSE MOVIMENTI_IMPORT.COMPETENZA_AL END ELSE CASE WHEN MOVIMENTI_IMPORT.FATTORE <> " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FATTORE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " THEN to_date(NULL) ELSE MOVIMENTI_IMPORT.COMPETENZA_AL END END, ");
              SQL.append("  IMPUTAZIONE_ECONOMICA = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALCOMIMPECO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", MOVIMENTI_IMPORT.IMPUTAZIONE_ECONOMICA) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKTRA, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update MOVIMENTI_IMPORT set ");
              SQL.append("  COD_LIVELLO_5 = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_COD_LIVELLO_5, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  CODICE_EUROPEO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CODICE_EUROPEO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_VALOCOMCKCAP, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update MOVIMENTI_IMPORT set ");
              SQL.append("  CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  FINANZIAMENTO = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_FINANZIAMENTO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  OPERA = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI647, IMDBDef14.PQSL_PARAMETRI647_OPERA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              v_PROPALTRCAMP = (new IDVariant(-1));
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_DETTAGGRUPPO.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      catch (Exception e10)
      {
        MainFrm.set_AlertMessage(new IDVariant(e10.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return (new IDVariant(0)).booleanValue();
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "AggiornaValori", _e);
      return false;
    }
  }

  // **********************************************************************
  // Abilita Campi
  // **********************************************************************
  public int AbilitaCampi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Campi Body
      // Procedure Body
      // 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      if (IDL.NullValue((new IDVariant(PAN_DETTAGGRUPPO.FieldText(PFL_DETTAGGRUPPO_FATTORITIPO))),(new IDVariant("E"))).equals((new IDVariant("E")), true))
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0).equals((new IDVariant("ACC")), true) && MainFrm.MODAIMPUENTR.compareTo((new IDVariant("AC")), true)!=0)
      {
        PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "AbilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disabilita Campi
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
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_DETTAGGRUPPO.SetFlags (Glb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettagliGruppoMovimenti", "DisabilitaCampi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void DETTGRUPMOVI_PARAMETRI645() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI645_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI646, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI646, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI645_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI645_RS, 0, IMDBDef5.TBL_PARAMETRI646, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI645_RS, 0, 0, IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARACODIGRUP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI645_RS, 1, 0, IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARADESCGRUP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI645_RS, 2, 0, IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARATIPOMOVI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI645_RS, 3, 0, IMDBDef5.TBL_PARAMETRI646, IMDBDef5.FLD_PARAMETRI646_PARANCDETEME, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI646, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI646, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI646, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI645_RS, 0);
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

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGGRUPPO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGGRUPPO, Cancel);
    // Stub
  }

  private void PAN_DETTAGGRUPPO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_APRICAPILIST)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_SCEVOCPEGLAB)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFOCAPILIST)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFVOCPEGDET)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_APRIDEBILIST)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_SELEZISOGGET)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFODEBILIST)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFODEBIDETT)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_CODLIVELLO5)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaLiv5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_SCEGDELILABE)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_SCEGPROPLABE)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFOMOVILIST)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMovimento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DETTAGGRUPPO_INFOMOVIMENT)
    {
      this.IdxPanelActived = this.PAN_DETTAGGRUPPO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoMovimento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DETTAGGRUPPO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DETTAGGRUPPO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGGRUPPO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGGRUPPO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTAGGRUPPO_Init()
  {

    PAN_DETTAGGRUPPO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGGRUPPO.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, "AD88EFAF-8A2B-4348-9B0E-D04157F3582B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, "Livello V");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, MyGlb.VIS_GROUSTYLLIST);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, MyGlb.PANEL_LIST, 768, -9999, 308, 16, 0, 0);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, MyGlb.PANEL_FORM, 40, 80, 688, 28, 0, 0);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, 0, 46);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, 1, 13);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, 0, 4);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, 1, 1);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_LIVELLOV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, "51C2C759-E634-43A0-90FD-422BE0224DCE");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, "Economica");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, MyGlb.PANEL_LIST, 4, 375, 704, 97, 0, 0);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, MyGlb.PANEL_FORM, 28, 207, 700, 97, 0, 0);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, 0, 60);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, 1, 13);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, 0, 4);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, 1, 4);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_ECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, "73257D32-9340-4771-AE83-3B2E692FE8EB");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, "Provvedimento");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, MyGlb.PANEL_LIST, 716, 275, 356, 73, 0, 0);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, MyGlb.PANEL_FORM, 28, 315, 700, 49, 0, 0);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, 0, 87);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, 1, 13);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, 0, 4);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, 1, 4);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, "D5D30512-26EE-46B1-8857-BB3F13A1983B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, "Movimento");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, MyGlb.PANEL_LIST, 1076, -9999, 128, 16, 0, 0);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, MyGlb.PANEL_FORM, 28, 375, 244, 49, 0, 0);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, 0, 64);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, 1, 13);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, 0, 4);
    PAN_DETTAGGRUPPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, 1, 4);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTAGGRUPPO_MOVIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTAGGRUPPO.SetSize(MyGlb.OBJ_FIELD, 61);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, "57175AC8-F7CF-494B-AAD2-61AD68E11BBA");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, "PROGRESSIVO");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, "492B1BF4-D5A3-4463-A911-093B4132D8E1");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, "GRUPPO");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, 0, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, "8577592C-9390-402D-9409-00B91285F38C");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, "Capitolo Old");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, "698C0DB9-3BEF-425A-89BF-4AEFF7B05C16");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, "Articolo Old");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, "314BD4CB-6A24-4436-8C9D-AD54BAD3E252");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, "Codice Debitore Old");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, "BB355032-1245-42AE-8789-34257A929C77");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, "Importo");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, "CF51EB97-E2A3-44AD-B0A1-A766F9549510");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, "Capitolo/Art.");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.VIS_NOFIINLUHELE);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, "5B588E52-EFCA-4DC4-9411-4A242156AE70");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, " ");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.VIS_NOFINOBOVEHE);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, "C99B6164-6E4F-4145-A259-958120F6151D");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, "/");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, "5CD9C3B5-AB8C-45D6-9B6F-E7940D37447E");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, " ");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, "99EA2164-F0CD-4526-B69B-A82349857E0F");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, 0, "wsearch.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, "EC92CC58-EE30-4E5B-8C99-1181F82E0F22");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, " ");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, "3AE54A90-8A5A-4092-BD7F-41CF1C6DF30B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, 0, "info.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, "299A25C0-1019-4B1D-B9DF-F9F15EEBBB55");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, "Codice Debitore");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, "108847C7-AB30-4E47-9D81-CF837E4C41D7");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, "Debitore");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, "B6EF2BE2-7841-4EC7-B4D7-879324B22179");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, " ");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, "D5A20BCB-B9E4-4A26-B9F0-2B8D3B261B62");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, 0, "wsearch1.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, "370D4F75-ACAB-4F8C-9F42-52883A6422D6");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, " ");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, "102A74FA-6D42-4A9D-8682-C5636662E359");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, 0, "info.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, "E4E2D8C5-0D1D-4109-BA9E-F53971F1D2C8");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, "Descrizione");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, "75A0C343-7D51-48FA-A052-9015D29510B4");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, "Cod. V Livello");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, MyGlb.VIS_VUOTOGRASSET);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, "640AA8A3-2362-4892-8A28-6D87C8AA7B49");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, "Codice");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, "D70C605F-5D20-417E-9766-C419CB207705");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, "Descrizione");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, "15E13DCC-88F2-4060-A685-F73F03C9CC0C");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, "Cod. Europeo");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, "2B8D88FF-5E7F-4C5E-B024-F3A021B7A928");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, "Data Reg.");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, "B20F325F-CD11-4C0C-8834-5FDAEFDDC654");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, "Tipo Vincolo");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, "D68E0CA7-79F2-4425-9CAF-99A9562D7269");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, "Finanziamento");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, "321EFD8E-3629-4429-A623-1B172EC739AC");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, "Opera");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, "9B28711B-D993-4340-9465-AF05E6C5FF12");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, "Fattore");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, "915C1C18-908E-4713-B638-EA0ABFE7907F");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, "12470F64-60D7-47E7-B1E0-66A80158D3E0");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, "Centro");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, "43638848-AEBA-4D14-BF15-6DC0973D559B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, "B947CFDA-FE2E-42E1-9D1B-E9865AEA7EE3");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, "Competenza Dal");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, "17D3D078-77BB-42A7-AC42-4529823BDC73");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, "Al");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, "A3AA8B55-788C-49E1-AA3F-FF9262F6E1A9");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, "Imput. Economica");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, "C3E13FCB-BAE2-4FF4-A1D7-31FE50B42D2F");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, "Data Reg. Economica");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, "6F9EC3BB-B388-457E-AD42-51EF45591568");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, MyGlb.VIS_VUOTOGRASSET);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, "B62F97C0-620F-434A-971F-58BA87F78201");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, "Delibera");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, "FCC7DC72-ADE3-45AB-8A11-F6E8A6F78455");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, "-");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, "66318E77-E534-4F5F-A1C9-BCC8C5E34EB8");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, "/");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, "7C18BF59-F0F3-4208-8A41-1CFAECBFA0AE");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, "Proposta");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, "3B6BB915-E8B2-49CA-8E4D-261F12F32FB5");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, "-");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.VIS_INTE10NORFIE);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, "3F23D526-CC47-4840-BD0D-3078398F60C3");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, "/");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, "B34C58DE-3059-4323-BA91-B8B2C3B5EA0B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, 0, "wsearch.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, "D89644AB-3771-447E-8DDF-87CD8ACD1707");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, 0, "info.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, "1BCDDD27-EF3F-4F2E-95D5-546DE58F2791");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, 0, "wsearch.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, "FBC2F5AB-3717-4E5A-B6C7-57558EADB48B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, 0, "info.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, "AC0F35B5-0833-4BC6-80F3-8E02D913577B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, MyGlb.VIS_VUOTOGRASSET);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, "7451DA04-7CF6-47D8-A441-0B712B973DA9");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, "Numero");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, "F2FE3A18-D6BE-480C-8A37-FA143D0246C8");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, "/");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, MyGlb.VIS_VUOTONORMALE);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, "1C52BC41-20E4-4C6E-BF9C-41FD6D517014");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, "Anno");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, "A7811CF4-7A94-489A-9DB6-5CDC9072AA02");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, " ");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.VIS_HYPELINKIMMA);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, "BA41EC2A-EBB4-4483-802C-03251F90CF1C");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, MyGlb.VIS_STATICBUTTON);
    PAN_DETTAGGRUPPO.SetImage(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, 0, "info.gif", false);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, "2776246E-DFE5-4533-AA97-5463E292A1C8");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, "FB59A138-5966-4CB7-B5FE-AE744F9D2A60");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, "DATA INSERIMENTO");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, "421003C6-F5C3-406C-9A49-91AD2D99853B");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, "A72CE300-6849-4AF9-B5A5-B6F140039266");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, "71E14727-BC66-4824-880F-2544A45717BD");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, "ANNO MOVI VAR");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, "458F5877-8E03-450A-B157-1CDE8CB7C07E");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, "NUMERO MOVI VAR");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, "15753DAF-FD53-482D-97D0-82DB61104D68");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, "FATTORI TIPO");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGGRUPPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, "460AE631-2F63-43BD-84F8-0F40073D54D0");
    PAN_DETTAGGRUPPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, "TIPO MOVI");
    PAN_DETTAGGRUPPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, "");
    PAN_DETTAGGRUPPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.VIS_NONNULLAFIEL);
    PAN_DETTAGGRUPPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, 0, -1);
  }

  private void PAN_DETTAGGRUPPO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_FORM, 564, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_PROGRESSIVO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_PROGRESSIVO, PPQRY_MOVIMEIMPORT, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_LIST, "GRUP.");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_GRUPPO, MyGlb.PANEL_FORM, "GRUPPO");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_GRUPPO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_GRUPPO, PPQRY_MOVIMEIMPORT, "A.GRUPPO", "GRUPPO", 3, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_LIST, 940, 48, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_LIST, "Capitolo Old");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_FORM, 600, 92, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLOOLD, MyGlb.PANEL_FORM, "Capitolo Old");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CAPITOLOOLD, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldUnbound(PFL_DETTAGGRUPPO_CAPITOLOOLD, true);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CAPITOLOOLD, PPQRY_MOVIMEIMPORT, "A.CAPITOLO", "MOVIMPCAPOLD", 3, 28, 6, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_LIST, 8, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_LIST, "Articolo Old");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_FORM, 12, 700, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLOOLD, MyGlb.PANEL_FORM, "Articolo Old");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ARTICOLOOLD, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldUnbound(PFL_DETTAGGRUPPO_ARTICOLOOLD, true);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ARTICOLOOLD, PPQRY_MOVIMEIMPORT, "A.ARTICOLO", "MOVIMPARTOLD", 1, 19, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_LIST, 120);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_LIST, "Codice Debitore Old");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_FORM, 4, 692, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICDEBIOLD, MyGlb.PANEL_FORM, "Codice Debitore Old");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CODICDEBIOLD, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldUnbound(PFL_DETTAGGRUPPO_CODICDEBIOLD, true);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CODICDEBIOLD, PPQRY_MOVIMEIMPORT, "A.SOGGETTO", "MOVIMPSOGOLD", 3, 28, 6, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_LIST, 0, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_FORM, 532, 12, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_IMPORTO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_IMPORTO, PPQRY_MOVIMEIMPORT, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_LIST, 108, 48, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_FORM, 44, 12, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CAPITOLO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CAPITOLO, PPQRY_MOVIMEIMPORT, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_LIST, 220, 48, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_LIST, " ");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_FORM, 256, 12, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ARTICOLO, MyGlb.PANEL_FORM, " ");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ARTICOLO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ARTICOLO, PPQRY_MOVIMEIMPORT, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, MyGlb.PANEL_LIST, 236, 24, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, MyGlb.PANEL_FORM, 240, 12, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRAVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_BARRAVOCEPEG, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_BARRAVOCEPEG, -1, "", "BARRAVOCEPEG", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_LIST, 248, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_LIST, 136);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_FORM, 4, 668, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_FORM, 136);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRICAPILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_APRICAPILIST, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_APRICAPILIST, PPQRY_APRIINFO, "DECODE(~~ANNO_MOVI_EMESSO~~, to_number(NULL), 'A', NULL)", "APRICAPILIST", 5, 99, 0, -13997);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRICAPILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, MyGlb.PANEL_LIST, 260, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, MyGlb.PANEL_FORM, 284, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEVOCPEGLAB, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_SCEVOCPEGLAB, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_SCEVOCPEGLAB, -1, "", "SCEVOCPEGLAB", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_LIST, 272, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_LIST, 136);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_FORM, 4, 692, 644, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_FORM, 136);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOCAPILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFOCAPILIST, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFOCAPILIST, PPQRY_APRIINFO, "DECODE(~~CAPITOLO~~, to_number(NULL), NULL, DECODE(~~ARTICOLO~~, to_number(NULL), NULL, 'I'))", "INFOCAPILIST", 5, 99, 0, -13997);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOCAPILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, MyGlb.PANEL_LIST, 268, 20, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, MyGlb.PANEL_FORM, 304, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFVOCPEGDET, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFVOCPEGDET, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFVOCPEGDET, -1, "", "INFVOCPEGDET", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_LIST, 732, 48, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_FORM, 4, 860, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEDEBITO, MyGlb.PANEL_FORM, "Cod. Deb.");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CODICEDEBITO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CODICEDEBITO, PPQRY_MOVIMEIMPORT, "A.SOGGETTO", "SOGGETTO", 3, 38, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_LIST, 296, 48, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_LIST, 124);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_FORM, 32, 36, 692, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_FORM, 96);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_DEBITORE, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_DEBITORE, PPQRY_SOGGETTO, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "BENDEBITORE", 5, 162, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_LIST, 484, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_LIST, 140);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_FORM, 4, 668, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_FORM, 140);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_APRIDEBILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_APRIDEBILIST, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_APRIDEBILIST, PPQRY_APRIINFO, "DECODE(~~ANNO_MOVI_EMESSO~~, to_number(NULL), 'A', NULL)", "APRIDEBILIST", 5, 99, 0, -13997);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_APRIDEBILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, MyGlb.PANEL_LIST, 580, 52, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, MyGlb.PANEL_FORM, 728, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SELEZISOGGET, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_SELEZISOGGET, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_SELEZISOGGET, -1, "", "SELEZISOGGET", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_LIST, 508, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_LIST, 140);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_FORM, 4, 692, 648, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_FORM, 140);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFODEBILIST, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFODEBILIST, PPQRY_APRIINFO, "DECODE(~~SOGGETTO~~, to_number(NULL), NULL, 'I')", "INFODEBILIST", 5, 99, 0, -13997);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFODEBILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, MyGlb.PANEL_LIST, 588, 60, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, MyGlb.PANEL_FORM, 747, 41, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODEBIDETT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFODEBIDETT, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFODEBIDETT, -1, "", "INFODEBIDETT", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_LIST, 532, 48, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_FORM, 52, 60, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_DESCRIZIONE, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_DESCRIZIONE, PPQRY_MOVIMEIMPORT, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, MyGlb.PANEL_LIST, 20, 112, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, MyGlb.PANEL_FORM, 44, 84, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICCODVLIVE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ETICCODVLIVE, -1, GRP_DETTAGGRUPPO_LIVELLOV);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ETICCODVLIVE, -1, "", "ETICCODVLIVE", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.set_Alignment(PFL_DETTAGGRUPPO_ETICCODVLIVE, 4);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_LIST, 768, 48, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_LIST, "Codice");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_FORM, 132, 84, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODLIVELLO5, MyGlb.PANEL_FORM, "Codice");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CODLIVELLO5, -1, GRP_DETTAGGRUPPO_LIVELLOV);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CODLIVELLO5, PPQRY_MOVIMEIMPORT, "A.COD_LIVELLO_5", "COD_LIVELLO_5", 3, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_LIST, 872, 48, 204, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_LIST, 220);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_FORM, 240, 84, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_FORM, 220);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_VISSTRRICDES, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_VISSTRRICDES, -1, GRP_DETTAGGRUPPO_LIVELLOV);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_VISSTRRICDES, PPQRY_CODLIVELLO5, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_LIST, 4, 276, 532, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_FORM, 24, 108, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CODICEEUROPE, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CODICEEUROPE, PPQRY_MOVIMEIMPORT, "A.CODICE_EUROPEO", "CODICE_EUROPEO", 1, 1, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_LIST, 544, 276, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_FORM, 520, 108, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_FORM, 116);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGISTRA, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_DATAREGISTRA, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_DATAREGISTRA, PPQRY_MOVIMEIMPORT, "A.DATA_REGISTRAZIONE", "DATA_REGISTRAZIONE", 6, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_LIST, 32, 300, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_FORM, 52, 132, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_TIPOVINCOLO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_TIPOVINCOLO, PPQRY_MOVIMEIMPORT, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_LIST, 16, 324, 688, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_FORM, 36, 156, 688, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_FINANZIAMENT, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_FINANZIAMENT, PPQRY_MOVIMEIMPORT, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_LIST, 64, 348, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_FORM, 84, 180, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_OPERA, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_OPERA, PPQRY_MOVIMEIMPORT, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_LIST, 56, 400, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_FORM, 64, 232, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_FATTORE, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_FATTORE, PPQRY_MOVIMEIMPORT, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_LIST, 252, 400, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_LIST, 136);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_FORM, 268, 232, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_FATTORDESCRI, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_LIST, 60, 424, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_FORM, 64, 256, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CENTRO, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CENTRO, PPQRY_MOVIMEIMPORT, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_LIST, 252, 424, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_LIST, 128);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_FORM, 268, 256, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_CENTRIDESCRI, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_LIST, 8, 448, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza Dal");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_FORM, 32, 280, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza Dal");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_COMPETENZDAL, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_COMPETENZDAL, PPQRY_MOVIMEIMPORT, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_LIST, 216, 448, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_LIST, 20);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_LIST, "Al");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_FORM, 224, 280, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_FORM, 20);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_AL, MyGlb.PANEL_FORM, "Al");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_AL, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_AL, PPQRY_MOVIMEIMPORT, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_LIST, 344, 448, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_LIST, 112);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_LIST, "Imput. Economica");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_FORM, 332, 280, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_FORM, 144);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imput. Economica");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_IMPUTAECONOM, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_IMPUTAECONOM, PPQRY_MOVIMEIMPORT, "A.IMPUTAZIONE_ECONOMICA", "IMPUTAZIONE_ECONOMICA", 5, 2, 0, -13997);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_IMPUTAECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_LIST, 488, 448, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_LIST, 128);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_LIST, "Data Reg. Economica");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_FORM, 504, 280, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_FORM, 128);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAREGECONO, MyGlb.PANEL_FORM, "Data Reg. Economica");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_DATAREGECONO, -1, GRP_DETTAGGRUPPO_ECONOMICA);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_DATAREGECONO, PPQRY_MOVIMEIMPORT, "A.DATA_REG_ECONOMICA", "DATA_REG_ECONOMICA", 6, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, MyGlb.PANEL_LIST, 736, 352, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, MyGlb.PANEL_FORM, 716, 352, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELSX, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ETICHLABELSX, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ETICHLABELSX, -1, "", "ETICHLABELSX", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_LIST, 724, 300, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_LIST, "Delibera");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_FORM, 32, 340, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_FORM, 96);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SEDEDEL, MyGlb.PANEL_FORM, "Delibera");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_SEDEDEL, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_SEDEDEL, PPQRY_MOVIMEIMPORT, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_LIST, 860, 300, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_LIST, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_FORM, 208, 340, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_NUMERODEL, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_NUMERODEL, PPQRY_MOVIMEIMPORT, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_LIST, 964, 300, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_LIST, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_FORM, 292, 340, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_FORM, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ANNODEL, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ANNODEL, PPQRY_MOVIMEIMPORT, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_LIST, 720, 324, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_LIST, 60);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_LIST, "Proposta");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_FORM, 400, 340, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_FORM, 60);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UNITAPROPONE, MyGlb.PANEL_FORM, "Proposta");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_UNITAPROPONE, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_UNITAPROPONE, PPQRY_MOVIMEIMPORT, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_LIST, 860, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_LIST, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_LIST, "-");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_FORM, 540, 340, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_FORM, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEROPROPOS, MyGlb.PANEL_FORM, "-");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_NUMEROPROPOS, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_NUMEROPROPOS, PPQRY_MOVIMEIMPORT, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 3, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 964, 324, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_LIST, "/");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 624, 340, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 16);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOPROPOSTA, MyGlb.PANEL_FORM, "/");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ANNOPROPOSTA, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ANNOPROPOSTA, PPQRY_MOVIMEIMPORT, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, MyGlb.PANEL_LIST, 1032, 304, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, MyGlb.PANEL_FORM, 356, 344, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_SCEGDELILABE, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_SCEGDELILABE, -1, "", "SCEGDELILABE", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, MyGlb.PANEL_LIST, 1052, 304, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, MyGlb.PANEL_FORM, 376, 344, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFODELIBERA, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, MyGlb.PANEL_LIST, 1032, 328, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, MyGlb.PANEL_FORM, 688, 344, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_SCEGPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_SCEGPROPLABE, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_SCEGPROPLABE, -1, "", "SCEGPROPLABE", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, MyGlb.PANEL_LIST, 1052, 328, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, MyGlb.PANEL_FORM, 708, 344, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFOPROPOSTA, -1, GRP_DETTAGGRUPPO_PROVVEDIMENT);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, MyGlb.PANEL_LIST, 744, 360, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, MyGlb.PANEL_FORM, 32, 408, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ETICHLABELDX, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ETICHLABELDX, -1, GRP_DETTAGGRUPPO_MOVIMENTO);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ETICHLABELDX, -1, "", "ETICHLABELDX", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_LIST, 1076, 48, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_LIST, 136);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_LIST, "Numero");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_FORM, 132, 400, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMEMOVIEMES, MyGlb.PANEL_FORM, "Numero");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_NUMEMOVIEMES, -1, GRP_DETTAGGRUPPO_MOVIMENTO);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_NUMEMOVIEMES, PPQRY_MOVIMEIMPORT, "A.NUMERO_MOVI_EMESSO", "NUMERO_MOVI_EMESSO", 1, 5, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, MyGlb.PANEL_LIST, 244, 32, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, MyGlb.PANEL_FORM, 184, 400, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_BARRVOCEPEG1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_BARRVOCEPEG1, -1, GRP_DETTAGGRUPPO_MOVIMENTO);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_BARRVOCEPEG1, -1, "", "BARRVOCEPEG1", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_LIST, 1132, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_LIST, 120);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_LIST, "Anno");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_FORM, 204, 400, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_FORM, 40);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIEMES, MyGlb.PANEL_FORM, "Anno");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ANNOMOVIEMES, -1, GRP_DETTAGGRUPPO_MOVIMENTO);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ANNOMOVIEMES, PPQRY_MOVIMEIMPORT, "A.ANNO_MOVI_EMESSO", "ANNO_MOVI_EMESSO", 1, 4, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_LIST, 1180, 48, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_LIST, 156);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_LIST, " ");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_FORM, 4, 424, 664, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_FORM, 156);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVILIST, MyGlb.PANEL_FORM, " ");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFOMOVILIST, -1, GRP_DETTAGGRUPPO_MOVIMENTO);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFOMOVILIST, PPQRY_APRIINFO, "DECODE(~~ANNO_MOVI_EMESSO~~, to_number(NULL), NULL, 'I')", "INFOMOVILIST", 5, 99, 0, -13997);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_INFOMOVILIST, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, MyGlb.PANEL_LIST, 596, 68, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, MyGlb.PANEL_FORM, 252, 404, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_INFOMOVIMENT, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_INFOMOVIMENT, -1, GRP_DETTAGGRUPPO_MOVIMENTO);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_INFOMOVIMENT, -1, "", "INFOMOVIMENT", 0, 0, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_LIST, 3180, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 394, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_UTENTEINSERI, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_UTENTEINSERI, PPQRY_MOVIMEIMPORT, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_LIST, 3252, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_FORM, 4, 394, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_DATAINSERIME, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_DATAINSERIME, PPQRY_MOVIMEIMPORT, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_LIST, 3348, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 394, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_UTENTULTIAGG, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_UTENTULTIAGG, PPQRY_MOVIMEIMPORT, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_LIST, 3420, 32, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 394, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_DATAULTIMAGG, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_DATAULTIMAGG, PPQRY_MOVIMEIMPORT, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 8, 19, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_LIST, 340, 48, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_LIST, "AN. MV. V.");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_FORM, 484, 32, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_ANNOMOVIVAR, MyGlb.PANEL_FORM, "AN. MV. V.");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_ANNOMOVIVAR, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_ANNOMOVIVAR, PPQRY_MOVIMEIMPORT, "A.ANNO_MOVI_VAR", "ANNO_MOVI_VAR", 1, 4, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_LIST, 292, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_LIST, "NUM. MV. VR.");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_FORM, 424, 32, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_NUMERMOVIVAR, MyGlb.PANEL_FORM, "NUM. MV. V.");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_NUMERMOVIVAR, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_NUMERMOVIVAR, PPQRY_MOVIMEIMPORT, "A.NUMERO_MOVI_VAR", "NUMERO_MOVI_VAR", 1, 5, 0, -13997);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_LIST, 940, 48, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_LIST, 88);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_LIST, "FATTORI TIPO");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_FORM, 4, 668, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_FORM, 88);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_FATTORITIPO, MyGlb.PANEL_FORM, "FATTORI TIPO");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_FATTORITIPO, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_FATTORITIPO, PPQRY_FATTORI, "A.TIPO", "FATTORITIPO", 5, 1, 0, -13997);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_FATTORITIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_FATTORITIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_DETTAGGRUPPO.SetValueListItem(PFL_DETTAGGRUPPO_FATTORITIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_LIST, 1532, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_LIST, "TIPO MOVI");
    PAN_DETTAGGRUPPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_FORM, 4, 336, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGGRUPPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGGRUPPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGGRUPPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGGRUPPO_TIPOMOVI, MyGlb.PANEL_FORM, "TIPO MOVI");
    PAN_DETTAGGRUPPO.SetFieldPage(PFL_DETTAGGRUPPO_TIPOMOVI, -1, -1);
    PAN_DETTAGGRUPPO.SetFieldPanel(PFL_DETTAGGRUPPO_TIPOMOVI, PPQRY_MOVIMEIMPORT, "A.TIPO_MOVI", "TIPO_MOVI", 5, 20, 0, -13997);
  }

  private void PAN_DETTAGGRUPPO_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGGRUPPO.SetSize(MyGlb.OBJ_QUERY, 10);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENDEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~SOGGETTO~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (NVL(A.D_SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_SOGGETTO, 0, SQL, -1, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_SOGGETTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGGRUPPO.SetMasterTable(PPQRY_SOGGETTO, "BEN");
    PAN_DETTAGGRUPPO.SetQueryLKE(PPQRY_SOGGETTO, PFL_DETTAGGRUPPO_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as BENDEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (NVL(A.D_SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_SOGGETTO, 1, SQL, -1, "");
    PAN_DETTAGGRUPPO.SetQueryHeaderColumn(PPQRY_SOGGETTO, "BENDEBITORE", "Debitore");
    PAN_DETTAGGRUPPO.SetQueryHeaderColumn(PPQRY_SOGGETTO, "CODICE_FISCALE", "Codice Fiscale");
    PAN_DETTAGGRUPPO.SetQueryVisibleColumn(PPQRY_SOGGETTO, "CODICE_FISCALE");
    PAN_DETTAGGRUPPO.SetQueryHeaderColumn(PPQRY_SOGGETTO, "PARTITA_IVA", "Partita IVA");
    PAN_DETTAGGRUPPO.SetQueryVisibleColumn(PPQRY_SOGGETTO, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI, ");
    SQL.append("  A.TIPO as FATTORITIPO ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR (A.DATA_VALIDITA >= TRUNC( SYSDATE ))) ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGGRUPPO.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR (A.DATA_VALIDITA >= TRUNC( SYSDATE ))) ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGGRUPPO.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES, ");
    SQL.append("  A.STRUTTURA_RICL_ID as VISTSTRRICID, ");
    SQL.append("  A.TIPO_RICL_ID as VISTVISTTIRI, ");
    SQL.append("  A.DES_LIVELLO as VISSTRRIDELI, ");
    SQL.append("  A.CODICE_TIPO_RICL as VISTVISTCOTR, ");
    SQL.append("  A.MAX_LIVELLO_RICL as VISTVISTMALR, ");
    SQL.append("  A.CONTROPARTITA as VISSTRRICCON ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A, ");
    SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
    SQL.append("where (B.ESERCIZIO(+) = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.E_S(+) = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("and   (B.CAPITOLO(+) = ~~CAPITOLO~~) ");
    SQL.append("and   (B.ARTICOLO(+) = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CODICE_TIPO_RICL(+) = 'MACRO') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(B.ESERCIZIO_INIZIO(+), 0) AND NVL(B.ESERCIZIO_SCADENZA(+), 9999))) ");
    SQL.append("and   (A.CODICE_PADRE = NVL(B.CODICE(+), A.CODICE_PADRE)) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN NVL(A.ESERCIZIO_INIZIO, 0) AND NVL(A.ESERCIZIO_SCADENZA, 9999))) ");
    SQL.append("and   (A.CODICE = ~~COD_LIVELLO_5~~) ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_CODLIVELLO5, 0, SQL, -1, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_CODLIVELLO5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGGRUPPO.SetMasterTable(PPQRY_CODLIVELLO5, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~ANNO_MOVI_EMESSO~~, to_number(NULL), 'A', NULL) as APRICAPILIST, ");
    SQL.append("  DECODE(~~CAPITOLO~~, to_number(NULL), NULL, DECODE(~~ARTICOLO~~, to_number(NULL), NULL, 'I')) as INFOCAPILIST, ");
    SQL.append("  DECODE(~~ANNO_MOVI_EMESSO~~, to_number(NULL), 'A', NULL) as APRIDEBILIST, ");
    SQL.append("  DECODE(~~SOGGETTO~~, to_number(NULL), NULL, 'I') as INFODEBILIST, ");
    SQL.append("  DECODE(~~ANNO_MOVI_EMESSO~~, to_number(NULL), NULL, 'I') as INFOMOVILIST ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~GRUPPO~~ IS NULL))) ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_APRIINFO, 0, SQL, -1, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_APRIINFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGGRUPPO.SetMasterTable(PPQRY_APRIINFO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CODTRAEURDES ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.CODICE = ~~CODICE_EUROPEO~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_CODTRANSEURO, 0, SQL, PFL_DETTAGGRUPPO_CODICEEUROPE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CODTRAEURDES ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.E_S = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_CODTRANSEURO, 1, SQL, PFL_DETTAGGRUPPO_CODICEEUROPE, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_CODTRANSEURO, MainFrm.Cf4armDBObject.DB, 4);
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
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_DETTAGGRUPPO_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_DETTAGGRUPPO_TIPOVINCOLO, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as BILFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_BILFIN1, 0, SQL, PFL_DETTAGGRUPPO_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as BILFINFINANZ, ");
    SQL.append("  TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CODICE = A.FINANZIAMENTO) ");
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_BILFIN1, 1, SQL, PFL_DETTAGGRUPPO_FINANZIAMENT, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_BILFIN1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as BILFINOPERA, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  OPERE B ");
    SQL.append("where (A.OPERA = ~~OPERA~~) ");
    SQL.append("and   ((~~NUMERO_MOVI_VAR~~ IS NULL)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (B.CODICE = A.OPERA) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  C.OPERA, ");
    SQL.append("  TO_CHAR ( C.OPERA ) || ' - ' || E.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  ESEA_OPE D, ");
    SQL.append("  OPERE E ");
    SQL.append("where (C.OPERA = ~~OPERA~~) ");
    SQL.append("and   (NOT ((~~NUMERO_MOVI_VAR~~ IS NULL))) ");
    SQL.append("and   (C.ANNO_ACC = ~~ANNO_MOVI_VAR~~) ");
    SQL.append("and   (C.NUMERO_ACC = ~~NUMERO_MOVI_VAR~~) ");
    SQL.append("and   (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.ANNO_ACC = C.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = C.NUMERO_ACC) ");
    SQL.append("and   (D.OPERA = C.OPERA) ");
    SQL.append("and   (D.FINANZIAMENTO = C.FINANZIAMENTO) ");
    SQL.append("and   ((D.SALDO_INI + D.VARIAZIONI + D.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (E.CODICE(+) = C.OPERA) ");
    SQL.append("order by 1 ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_BILFIN, 0, SQL, PFL_DETTAGGRUPPO_OPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as BILFINOPERA, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || B.DESCRIZIONE as BILFINDESCRI ");
    SQL.append("from ");
    SQL.append("  BIL_FIN A, ");
    SQL.append("  OPERE B ");
    SQL.append("where ((~~NUMERO_MOVI_VAR~~ IS NULL)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = DECODE(~~TBL_PARAMETRI646.PARATIPOMOVI~~, 'ACC', 'E', 'S')) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (B.CODICE = A.OPERA) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  C.OPERA, ");
    SQL.append("  TO_CHAR ( C.OPERA ) || ' - ' || E.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ACC_OPE C, ");
    SQL.append("  ESEA_OPE D, ");
    SQL.append("  OPERE E ");
    SQL.append("where (NOT ((~~NUMERO_MOVI_VAR~~ IS NULL))) ");
    SQL.append("and   (C.ANNO_ACC = ~~ANNO_MOVI_VAR~~) ");
    SQL.append("and   (C.NUMERO_ACC = ~~NUMERO_MOVI_VAR~~) ");
    SQL.append("and   (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.ANNO_ACC = C.ANNO_ACC) ");
    SQL.append("and   (D.NUMERO_ACC = C.NUMERO_ACC) ");
    SQL.append("and   (D.OPERA = C.OPERA) ");
    SQL.append("and   (D.FINANZIAMENTO = C.FINANZIAMENTO) ");
    SQL.append("and   ((D.SALDO_INI + D.VARIAZIONI + D.VARIAZIONI_RES) > 0) ");
    SQL.append("and   (E.CODICE(+) = C.OPERA) ");
    SQL.append("order by 1 ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_BILFIN, 1, SQL, PFL_DETTAGGRUPPO_OPERA, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_BILFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGGRUPPO.SetIMDB(IMDB, "PQRY_MOVIMEIMPORT", true);
    PAN_DETTAGGRUPPO.set_SetString(MyGlb.MASTER_ROWNAME, "MOVIMENTI IMPORT");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.GRUPPO as GRUPPO, ");
    SQL.append("  A.TIPO_MOVI as TIPO_MOVI, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.CAPITOLO as MOVIMPCAPOLD, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ARTICOLO as MOVIMPARTOLD, ");
    SQL.append("  A.NUMERO_MOVI_VAR as NUMERO_MOVI_VAR, ");
    SQL.append("  A.ANNO_MOVI_VAR as ANNO_MOVI_VAR, ");
    SQL.append("  A.DATA_REGISTRAZIONE as DATA_REGISTRAZIONE, ");
    SQL.append("  A.SOGGETTO as SOGGETTO, ");
    SQL.append("  A.SOGGETTO as MOVIMPSOGOLD, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.IMPUTAZIONE_ECONOMICA as IMPUTAZIONE_ECONOMICA, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.DATA_REG_ECONOMICA as DATA_REG_ECONOMICA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.COD_LIVELLO_5 as COD_LIVELLO_5, ");
    SQL.append("  A.CODICE_EUROPEO as CODICE_EUROPEO, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_MOVI_EMESSO as ANNO_MOVI_EMESSO, ");
    SQL.append("  A.NUMERO_MOVI_EMESSO as NUMERO_MOVI_EMESSO ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_MOVIMEIMPORT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MOVIMENTI_IMPORT A ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_MOVIMEIMPORT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.GRUPPO = ~~TBL_PARAMETRI646.PARACODIGRUP~~) ");
    SQL.append("and   (A.TIPO_MOVI = ~~TBL_PARAMETRI646.PARATIPOMOVI~~) ");
    SQL.append("and   ((A.ANNO_MOVI_EMESSO IS NULL) OR NVL(~~PQRY_PARAMETRI645.PARANCDETEME~~, 'NO') = 'SI') ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_MOVIMEIMPORT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_MOVIMEIMPORT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_MOVIMEIMPORT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_DETTAGGRUPPO.SetQuery(PPQRY_MOVIMEIMPORT, 5, SQL, -1, "");
    PAN_DETTAGGRUPPO.SetQueryDB(PPQRY_MOVIMEIMPORT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGGRUPPO.SetMasterTable(0, "MOVIMENTI_IMPORT");
    PAN_DETTAGGRUPPO.AddToSortList(PFL_DETTAGGRUPPO_CAPITOLO, true);
    PAN_DETTAGGRUPPO.AddToSortList(PFL_DETTAGGRUPPO_ARTICOLO, true);
    PAN_DETTAGGRUPPO.AddToSortList(PFL_DETTAGGRUPPO_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGGRUPPO.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGGRUPPO.iUseListQBE;
      PAN_DETTAGGRUPPO.iUseListQBE = 0;
      PAN_DETTAGGRUPPO.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGGRUPPO.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGGRUPPO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, "46D27396-A36D-4C8D-A1E4-E6C098FFEB6B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, "A3D46237-FC90-4991-8B99-EC8BAC6CF4DC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, "BFA9BCB3-EB8B-44B4-A0E7-A396DE3A7AE3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, "Anche Dettagli Emessi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_LIST, 4, 28, 432, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_FORM, 4, 4, 540, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_GRUPPOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_GRUPPOLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_GRUPPOLABEL, -1, "", "GRUPPOLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_LIST, 492, 28, 288, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_FORM, 608, 4, 168, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IMPOTOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IMPOTOTALABE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IMPOTOTALABE, -1, "", "IMPOTOTALABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_LIST, "Anche Dettagli Emessi");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, 4, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, 168);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHDETTEMES, MyGlb.PANEL_FORM, "Anche Dettagli Emessi");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANCHDETTEMES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANCHDETTEMES, PPQRY_PARAMETRI645, "A.PARANCDETEME", "PARANCDETEME", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHDETTEMES, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHDETTEMES, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI645", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI645, IMDBDef14.PQRY_PARAMETRI645_RS, IMDBDef5.TBL_PARAMETRI646);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANCHDETTEMES, IMDBDef5.FLD_PARAMETRI646_PARANCDETEME);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI646");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_OnChangeRow();
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
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_DETTAGGRUPPO) PAN_DETTAGGRUPPO_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
