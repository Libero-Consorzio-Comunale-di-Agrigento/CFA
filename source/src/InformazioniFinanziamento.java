// **********************************************
// Informazioni Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_FINANZIAMENT = 0;
  private static int PFL_PARAMETRI_DESCRIFINANZ = 1;
  private static int PFL_PARAMETRI_AL = 2;

  private static int PPQRY_PARAMETRI325 = 0;

  private static int PPQRY_FINANZIAMENT = 1;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_INFORMFINANZ;
  private static int PFL_ARCHIVIO_CODICE = 0;
  private static int PFL_ARCHIVIO_DESCRIZIONE = 1;
  private static int PFL_ARCHIVIO_RAGIONSOCIAL = 2;
  private static int PFL_ARCHIVIO_ENTE = 3;
  private static int PFL_ARCHIVIO_ANNOMUTUO = 4;
  private static int PFL_ARCHIVIO_NUMEROMUTUO = 5;
  private static int PFL_ARCHIVIO_NOTE1 = 6;
  private static int PFL_ARCHIVIO_IMPORTORIGIN = 7;
  private static int PFL_ARCHIVIO_SCADENZA = 8;
  private static int PFL_ARCHIVIO_LABELENTE = 9;
  private static int PFL_ARCHIVIO_BARRA = 10;
  private static int PFL_ARCHIVIO_MUTUO = 11;
  private static int PFL_ARCHIVIO_CATEGORIA = 12;
  private static int PFL_ARCHIVIO_DURATADESC = 13;
  private static int PFL_ARCHIVIO_ALLEGALCAPIT = 14;
  private static int PFL_ARCHIVIO_FINANZDISAVA = 15;
  private static int PFL_ARCHIVIO_FLESSIBILITA = 16;
  private static int PFL_ARCHIVIO_DIPARTIMENTO = 17;
  private static int PFL_ARCHIVIO_LEGGEREGIONA = 18;
  private static int PFL_ARCHIVIO_CAPITOREGION = 19;
  private static int PFL_ARCHIVIO_ATTOASSEGNAZ = 20;
  private static int PFL_ARCHIVIO_NOTAVUOTA = 21;
  private static int PFL_ARCHIVIO_NOTAPIENA = 22;
  private static int PFL_ARCHIVIO_SERVIZOPERAT = 23;
  private static int PFL_ARCHIVIO_SETTOROPERAT = 24;
  private static int PFL_ARCHIVIO_RENDALMEF = 25;

  private static int PPQRY_FINANZIAME19 = 0;


  IDPanel PAN_ARCHIVIO;
  private static int PFL_SITUAZIONE_PREVISINIZI1 = 0;
  private static int PFL_SITUAZIONE_VARIAZIONI1 = 1;
  private static int PFL_SITUAZIONE_PREVISATTUA1 = 2;
  private static int PFL_SITUAZIONE_ACCERTCOMPET = 3;
  private static int PFL_SITUAZIONE_DISPONIBILI1 = 4;
  private static int PFL_SITUAZIONE_VARIAZPROVV1 = 5;
  private static int PFL_SITUAZIONE_ACCERTRESIDU = 6;
  private static int PFL_SITUAZIONE_ORDINACOMPET = 7;
  private static int PFL_SITUAZIONE_RESIDUO1 = 8;
  private static int PFL_SITUAZIONE_TOTALE1 = 9;
  private static int PFL_SITUAZIONE_PREVISINIZIA = 10;
  private static int PFL_SITUAZIONE_VARIAZIONI = 11;
  private static int PFL_SITUAZIONE_PREVISATTUAL = 12;
  private static int PFL_SITUAZIONE_IMPEGNCOMPET = 13;
  private static int PFL_SITUAZIONE_DISPONIBILIT = 14;
  private static int PFL_SITUAZIONE_VARIAZPROVVI = 15;
  private static int PFL_SITUAZIONE_IMPEGNRESIDU = 16;
  private static int PFL_SITUAZIONE_SUBIMPEGNATO = 17;
  private static int PFL_SITUAZIONE_LIQUIDATO = 18;
  private static int PFL_SITUAZIONE_MANDATCOMPET = 19;
  private static int PFL_SITUAZIONE_RESIDUO2 = 20;
  private static int PFL_SITUAZIONE_TOTALE = 21;
  private static int PFL_SITUAZIONE_LABELENTRATA = 22;
  private static int PFL_SITUAZIONE_LABELSPESA = 23;
  private static int PFL_SITUAZIONE_APRPREINENFI = 24;
  private static int PFL_SITUAZIONE_APRELEVAENFI = 25;
  private static int PFL_SITUAZIONE_APRPREINSPFI = 26;
  private static int PFL_SITUAZIONE_APRACCDICOFI = 27;
  private static int PFL_SITUAZIONE_APRVARPRENFI = 28;
  private static int PFL_SITUAZIONE_APRACCARESFI = 29;
  private static int PFL_SITUAZIONE_APRORDDICOFI = 30;
  private static int PFL_SITUAZIONE_APRORDARESFI = 31;
  private static int PFL_SITUAZIONE_APRELEVASPFI = 32;
  private static int PFL_SITUAZIONE_APRIMPDICOFI = 33;
  private static int PFL_SITUAZIONE_APRVARPRSPFI = 34;
  private static int PFL_SITUAZIONE_APRIMPARESFI = 35;
  private static int PFL_SITUAZIONE_APRSUBIMPFIN = 36;
  private static int PFL_SITUAZIONE_APRILIQUIFIN = 37;
  private static int PFL_SITUAZIONE_APRMANDICOFI = 38;
  private static int PFL_SITUAZIONE_APRMANARESFI = 39;
  private static int PFL_SITUAZIONE_FINANZIAMEN1 = 40;

  private static int PPQRY_VISTATOTOPE3 = 0;


  IDPanel PAN_SITUAZIONE;
  private static int GRP_CASSA_MANDATI = 0;
  private static int GRP_CASSA_ORDINATIVI = 1;
  private static int GRP_CASSA_VARIAZIONI = 2;

  private static int PFL_CASSA_SALDOINICASS = 0;
  private static int PFL_CASSA_LABESALDINIZ = 1;
  private static int PFL_CASSA_SALDOINIPAG = 2;
  private static int PFL_CASSA_TOTMANPAGESE = 3;
  private static int PFL_CASSA_TOTMANEMEESE = 4;
  private static int PFL_CASSA_PAGRESIDUO = 5;
  private static int PFL_CASSA_PAGCOMPETENZ = 6;
  private static int PFL_CASSA_PAGAMEPRECE = 7;
  private static int PFL_CASSA_MANDPRECE = 8;
  private static int PFL_CASSA_RESIDUOMAND = 9;
  private static int PFL_CASSA_COMPETENMAND = 10;
  private static int PFL_CASSA_LABELTOTALE2 = 11;
  private static int PFL_CASSA_LABEESERPRE2 = 12;
  private static int PFL_CASSA_LABETOTAESE1 = 13;
  private static int PFL_CASSA_LABELCOMPET1 = 14;
  private static int PFL_CASSA_LABELRESIDU1 = 15;
  private static int PFL_CASSA_TOTAMANDEMES = 16;
  private static int PFL_CASSA_TOTAMANDPAGA = 17;
  private static int PFL_CASSA_APRMAEMAREFI = 18;
  private static int PFL_CASSA_APMAEMDICOFI = 19;
  private static int PFL_CASSA_APMAEMESPRFI = 20;
  private static int PFL_CASSA_APRPAGARESFI = 21;
  private static int PFL_CASSA_APRPAGDICOFI = 22;
  private static int PFL_CASSA_APRPAGESPRFI = 23;
  private static int PFL_CASSA_NEWPANELABE2 = 24;
  private static int PFL_CASSA_TOTORDRISESE = 25;
  private static int PFL_CASSA_TOTORDEMEESE = 26;
  private static int PFL_CASSA_INCPREC = 27;
  private static int PFL_CASSA_INCRES = 28;
  private static int PFL_CASSA_INCCOMPETENZ = 29;
  private static int PFL_CASSA_ORDPREC = 30;
  private static int PFL_CASSA_RESIDUOORD = 31;
  private static int PFL_CASSA_LABELRESIDUI = 32;
  private static int PFL_CASSA_LABELCOMPETE = 33;
  private static int PFL_CASSA_LABETOTAESER = 34;
  private static int PFL_CASSA_LABEESERPREC = 35;
  private static int PFL_CASSA_APROREMAREFI = 36;
  private static int PFL_CASSA_APOREMDICOFI = 37;
  private static int PFL_CASSA_APRRISARESFI = 38;
  private static int PFL_CASSA_APRRISDICOFI = 39;
  private static int PFL_CASSA_APOREMESPRFI = 40;
  private static int PFL_CASSA_APRRISESPRFI = 41;
  private static int PFL_CASSA_TOTAORDIRISC = 42;
  private static int PFL_CASSA_TOTAORDIEMES = 43;
  private static int PFL_CASSA_LABELTOTALE = 44;
  private static int PFL_CASSA_NEWPANELABE3 = 45;
  private static int PFL_CASSA_SALDORISCOSS = 46;
  private static int PFL_CASSA_SALDOEMESSI = 47;
  private static int PFL_CASSA_VARIACASSPRE = 48;
  private static int PFL_CASSA_VARIACASSESE = 49;
  private static int PFL_CASSA_VARIACASSTOT = 50;
  private static int PFL_CASSA_VARICASSPRE1 = 51;
  private static int PFL_CASSA_VARICASSESE1 = 52;
  private static int PFL_CASSA_VARICASSTOT1 = 53;
  private static int PFL_CASSA_APRIVARIRISC = 54;
  private static int PFL_CASSA_APRIVARIEMES = 55;
  private static int PFL_CASSA_APRVARESERIS = 56;
  private static int PFL_CASSA_APRVARESEEME = 57;
  private static int PFL_CASSA_APRVARPRERIS = 58;
  private static int PFL_CASSA_APRVARPREEME = 59;
  private static int PFL_CASSA_LABELTOTALE1 = 60;
  private static int PFL_CASSA_LABELESERCIZ = 61;
  private static int PFL_CASSA_LABEESERPRE1 = 62;
  private static int PFL_CASSA_NEWPANELABE1 = 63;
  private static int PFL_CASSA_LABELEMESSI = 64;
  private static int PFL_CASSA_LABELRISCOSS = 65;
  private static int PFL_CASSA_COMPETENZORD = 66;
  private static int PFL_CASSA_LABELEMESSI1 = 67;
  private static int PFL_CASSA_LABELRISCOS1 = 68;
  private static int PFL_CASSA_LABELEMESSI2 = 69;
  private static int PFL_CASSA_LABELPAGATI = 70;
  private static int PFL_CASSA_LABELSALDO = 71;
  private static int PFL_CASSA_SALDFINAEMES = 72;
  private static int PFL_CASSA_SALDFINARISC = 73;
  private static int PFL_CASSA_LABESALDFINA = 74;

  private static int PPQRY_VISTOTCASFI1 = 0;


  IDPanel PAN_CASSA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI33(IMDB);
    //
    //
    Init_PQRY_FINANZIAME19(IMDB);
    Init_PQRY_VISTATOTOPE3(IMDB);
    Init_PQRY_VISTOTCASFI1(IMDB);
    Init_PQRY_PARAMETRI325(IMDB);
    Init_PQRY_PARAMETRI325_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI33(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI33, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI33, "TBL_PARAMETRI33");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI33,IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, "PARACODIFINA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI33,IMDBDef1.FLD_PARAMETRI33_PARACODIFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI33,IMDBDef1.FLD_PARAMETRI33_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI33,IMDBDef1.FLD_PARAMETRI33_PARAMDATAAL,6,19,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI33, 0);
  }

  private static void Init_PQRY_FINANZIAME19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAME19, 29);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAME19, "PQRY_FINANZIAME19");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_CODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_ENTE, "ENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_ENTE,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_ANNO_MUTUO, "ANNO_MUTUO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_ANNO_MUTUO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_NUMERO_MUTUO, "NUMERO_MUTUO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_NUMERO_MUTUO,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_CATEGORIA,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_COD_ALLEGATO, "COD_ALLEGATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_COD_ALLEGATO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_IMPORTO_ORIG, "IMPORTO_ORIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_IMPORTO_ORIG,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_TIPO_DURATA, "TIPO_DURATA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_TIPO_DURATA,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_SCADENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_SALDO_INI_CASSA, "SALDO_INI_CASSA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_SALDO_INI_CASSA,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_SALDO_INI_TESORERIA, "SALDO_INI_TESORERIA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_SALDO_INI_TESORERIA,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_RAGIONE_SOCIALE_ESTESA, "RAGIONE_SOCIALE_ESTESA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_RAGIONE_SOCIALE_ESTESA,5,60,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINADURADESC, "FINADURADESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINADURADESC,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_DESC_ABB, "DESC_ABB");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_DESC_ABB,5,33,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINADISADESC, "FINADISADESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINADISADESC,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_COD_FIN_DISAV, "COD_FIN_DISAV");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_COD_FIN_DISAV,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_LEGGE_REG, "LEGGE_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_LEGGE_REG,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_CAPITOLO_REG, "CAPITOLO_REG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_CAPITOLO_REG,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_ATTO_ASS, "ATTO_ASS");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_ATTO_ASS,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_DIPARTIMENTO, "DIPARTIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_DIPARTIMENTO,5,150,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINASERVOPER, "FINASERVOPER");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINASERVOPER,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINASETTOPER, "FINASETTOPER");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINASETTOPER,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINANZFLESSI, "FINANZFLESSI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINANZFLESSI,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINANZCATEGO, "FINANZCATEGO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINANZCATEGO,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINAALLALCAP, "FINAALLALCAP");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINAALLALCAP,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINAFINADISA, "FINAFINADISA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINAFINADISA,5,99,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINARENALMEF, "FINARENALMEF");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAME19,IMDBDef8.PQSL_FINANZIAME19_FINARENALMEF,5,2,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAME19, 0);
  }

  private static void Init_PQRY_VISTATOTOPE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTATOTOPE3, 24);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTATOTOPE3, "PQRY_VISTATOTOPE3");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_INI_E, "PREVISIONE_INI_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_INI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARIAZIONI_E, "VARIAZIONI_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARIAZIONI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_ATT_E, "PREVISIONE_ATT_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_ATT_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ACCERTATO_COMP, "ACCERTATO_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ACCERTATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_DISPONIBILITA_E, "DISPONIBILITA_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_DISPONIBILITA_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARCOMPRO_E, "VARCOMPRO_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARCOMPRO_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ACCERTATO_RES, "ACCERTATO_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ACCERTATO_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ORDINATIVI_COMP, "ORDINATIVI_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ORDINATIVI_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ORDINATIVI_RES, "ORDINATIVI_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ORDINATIVI_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ORDINATIVI, "ORDINATIVI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_ORDINATIVI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_INI_S, "PREVISIONE_INI_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_INI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARIAZIONI_S, "VARIAZIONI_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARIAZIONI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_ATT_S, "PREVISIONE_ATT_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_PREVISIONE_ATT_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_IMPEGNATO_COMP, "IMPEGNATO_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_IMPEGNATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_DISPONIBILITA_S, "DISPONIBILITA_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_DISPONIBILITA_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARCOMPRO_S, "VARCOMPRO_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_VARCOMPRO_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_IMPEGNATO_RES, "IMPEGNATO_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_IMPEGNATO_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_SUBIMPEGNATO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_LIQUIDATO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_MANDATI_COMP, "MANDATI_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_MANDATI_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_MANDATI_RES, "MANDATI_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_MANDATI_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_MANDATI, "MANDATI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE3,IMDBDef8.PQSL_VISTATOTOPE3_MANDATI,2,15,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTATOTOPE3, 0);
  }

  private static void Init_PQRY_VISTOTCASFI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTOTCASFI1, 21);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTOTCASFI1, "PQRY_VISTOTCASFI1");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECSALINICAS, "RECSALINICAS");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECSALINICAS,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECSALINIPAG, "RECSALINIPAG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECSALINIPAG,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECOCOMPMAND, "RECOCOMPMAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECOCOMPMAND,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORESIMAND, "RECORESIMAND");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORESIMAND,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECOMANDPREC, "RECOMANDPREC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECOMANDPREC,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECOPAGAPREC, "RECOPAGAPREC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECOPAGAPREC,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORPAGCOMP, "RECORPAGCOMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORPAGCOMP,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORPAGRESI, "RECORPAGRESI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORPAGRESI,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTMAEMES, "RECTOTMAEMES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTMAEMES,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTMAPAES, "RECTOTMAPAES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTMAPAES,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORCOMPORD, "RECORCOMPORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORCOMPORD,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORRESIORD, "RECORRESIORD");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORRESIORD,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORORDPREC, "RECORORDPREC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORORDPREC,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORINCCOMP, "RECORINCCOMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORINCCOMP,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORDINCRES, "RECORDINCRES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORDINCRES,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORINCPREC, "RECORINCPREC");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECORINCPREC,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTOREMES, "RECTOTOREMES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTOREMES,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTORRIES, "RECTOTORRIES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECTOTORRIES,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASPRE, "RECVARCASPRE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASPRE,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASESE, "RECVARCASESE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASESE,3,28,6);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASTOT, "RECVARCASTOT");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTOTCASFI1,IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASTOT,3,28,6);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTOTCASFI1, 0);
  }

  private static void Init_PQRY_PARAMETRI325(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAMETRI325, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAMETRI325, "PQRY_PARAMETRI325");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAMETRI325,IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, "PARACODIFINA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAMETRI325,IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAMETRI325,IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAMETRI325,IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PARAMETRI325, 0);
  }

  private static void Init_PQRY_PARAMETRI325_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAMETRI325_RS, 2);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAMETRI325_RS, "PQRY_PARAMETRI325_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAMETRI325_RS,IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, "PARACODIFINA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAMETRI325_RS,IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAMETRI325_RS,IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAMETRI325_RS,IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL,6,19,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniFinanziamento()
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
    FormIdx = MyGlb.FRM_INFORMFINAN1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2EA7B53C-9B43-4DEF-ADBC-FACEFB9CCCDB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 636;
    DesignHeight = 686;
    set_Caption(new IDVariant("Informazioni Finanziamento"));
    //
    Frames = new AFrame[7];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 636;
    Frames[1].Height = 660;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0727273;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 636;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 636-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C5B65D06-26C2-484A-A6CE-098FF7BA7B67");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 648, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 636;
    Frames[3].Height = 612;
    Frames[3].Caption = "Informazioni Finanziamento";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 612;
    TAB_INFORMFINANZ = new OTabView(this);
    Frames[3].Content = TAB_INFORMFINANZ;
    TAB_INFORMFINANZ.iGuid = "EA65FEF3-A66F-410A-B93F-6269D3882CC4";
    TAB_INFORMFINANZ.SetItemCount(3);
    TAB_INFORMFINANZ.Placement = 1;
    TAB_INFORMFINANZ.FrIndex = 3;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Archivio";
    Frames[4].Parent = this;
    PAN_ARCHIVIO = new IDPanel(w, this, 4, "PAN_ARCHIVIO");
    Frames[4].Content = PAN_ARCHIVIO;
    PAN_ARCHIVIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ARCHIVIO.VS = MainFrm.VisualStyleList;
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 636-MyGlb.PAN_OFFS_X, 612-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CABEF948-B7DA-4C7D-8B90-EA749A2C0C77");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3936, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ARCHIVIO.InitStatus = 2;
    PAN_ARCHIVIO_Init();
    PAN_ARCHIVIO_InitFields();
    PAN_ARCHIVIO_InitQueries();
    TAB_INFORMFINANZ.SetItem(1, Frames[4], 0, "", "Archivio", "Dizionario dei Finanziamenti");
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Situazione";
    Frames[5].Parent = this;
    PAN_SITUAZIONE = new IDPanel(w, this, 5, "PAN_SITUAZIONE");
    Frames[5].Content = PAN_SITUAZIONE;
    PAN_SITUAZIONE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITUAZIONE.VS = MainFrm.VisualStyleList;
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 636-MyGlb.PAN_OFFS_X, 612-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "81F8ACD3-4D09-4AE9-A17C-4DA3AD1A97B5");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1576, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITUAZIONE.InitStatus = 1;
    PAN_SITUAZIONE_Init();
    PAN_SITUAZIONE_InitFields();
    PAN_SITUAZIONE_InitQueries();
    TAB_INFORMFINANZ.SetItem(2, Frames[5], 0, "", "Situazione", "");
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[6].InTabbed = true;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Cassa";
    Frames[6].Parent = this;
    PAN_CASSA = new IDPanel(w, this, 6, "PAN_CASSA");
    Frames[6].Content = PAN_CASSA;
    PAN_CASSA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CASSA.VS = MainFrm.VisualStyleList;
    PAN_CASSA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 636-MyGlb.PAN_OFFS_X, 612-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "401E3B4E-0B52-472D-9C1E-EE03D936BD34");
    PAN_CASSA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3288, 478, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CASSA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CASSA.InitStatus = 2;
    PAN_CASSA_Init();
    PAN_CASSA_InitFields();
    PAN_CASSA_InitQueries();
    TAB_INFORMFINANZ.SetItem(3, Frames[6], 0, "", "Cassa", "");
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI33, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFORMFINAN1_PARAMETRI325();
      }
      PAN_ARCHIVIO.UpdatePanel(MainFrm);
      PAN_SITUAZIONE.UpdatePanel(MainFrm);
      PAN_CASSA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCEFINIMPACC && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_FINANZIAMENT) {
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
    return (obj instanceof InformazioniFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniFinanziamento.class.getName() : (Glb.ClassWithPackage(InformazioniFinanziamento.class) ? InformazioniFinanziamento.class.getName().substring(InformazioniFinanziamento.class.getPackage().getName().length() + 1) : InformazioniFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Informazioni Finanziamento Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_INFORMFINANZ_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Informazioni Finanziamento Change Page Event Body
      // Procedure Body
      // 
      if (new IDVariant(TAB_INFORMFINANZ.SelectedPageIndex()).equals((new IDVariant(PAN_CASSA.FrIndex)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "InformazioniFinanziamentoChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Elenco Finanziamenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoFinanziamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Finanziamenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMES, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMCAPITOL, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMARTICOL, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMESERCIZ, 0, (new IDVariant(-1)));
      MainFrm.Show(MyGlb.FRM_SCEFINIMPACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriElencoFinanziamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Note
  // **********************************************************************
  public int ApriNote ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ANNOTAZIONI = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ANNOTAZIONI = (new IDVariant("Annotazioni", IDVariant.STRING));
      // 
      // Apri Note Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef8.PQRY_FINANZIAME19, IMDBDef8.PQSL_FINANZIAME19_NOTE, 0), v_ANNOTAZIONI, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Dipartimento
  // **********************************************************************
  public int ApriDipartimento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_INTESTAZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_INTESTAZIONE = (new IDVariant("Dipartimento", IDVariant.STRING));
      // 
      // Apri Dipartimento Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef8.PQRY_FINANZIAME19, IMDBDef8.PQSL_FINANZIAME19_DIPARTIMENTO, 0), v_INTESTAZIONE, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriDipartimento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti Di Competenza Fin
  // **********************************************************************
  public int ApriAccertamentiDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI40, IMDBDef1.FLD_PARAMETRI40_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEDICOMFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEDICOMFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriAccertamentiDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni Di Competenza Fin
  // **********************************************************************
  public int ApriImpegniDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMOPERA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMTIPO, 0, (new IDVariant("Finanziamento")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGDICOMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGDICOMPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriImpegniDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Provvisorie Entrata Fin
  // **********************************************************************
  public int ApriVariazioniProvvisorieEntrataFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Provvisorie Entrata Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVFINA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriVariazioniProvvisorieEntrataFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazione Provvisoria Spesa Fin
  // **********************************************************************
  public int ApriVariazioneProvvisoriaSpesaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazione Provvisoria Spesa Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI41, IMDBDef1.FLD_PARAMETRI41_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVFINA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriVariazioneProvvisoriaSpesaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti A Residuo Fin
  // **********************************************************************
  public int ApriAccertamentiAResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti A Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI42, IMDBDef1.FLD_PARAMETRI42_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEARESIFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEARESIFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriAccertamentiAResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriImpegniaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMOPERA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMTIPO, 0, (new IDVariant("Finanziamento")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGNARESID,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGNARESID, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriImpegniaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Sub Impegni Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriSubImpegniFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Sub Impegni Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI43, IMDBDef1.FLD_PARAMETRI43_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_SUBIMPEGFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SUBIMPEGFINA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriSubImpegniFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazioni Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriLiquidazioniFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liquidazioni Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI44, IMDBDef1.FLD_PARAMETRI44_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_LIQUIDFINANZ,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_LIQUIDFINANZ, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriLiquidazioniFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinatividiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI45, IMDBDef1.FLD_PARAMETRI45_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ORDIDICOMFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDIDICOMFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriOrdinatividiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI46, IMDBDef1.FLD_PARAMETRI46_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ORDIARESIFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDIARESIFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriOrdinativiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI47, IMDBDef1.FLD_PARAMETRI47_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_MANDDICOMFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDDICOMFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriMandatiDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI49, IMDBDef1.FLD_PARAMETRI49_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      MainFrm.UnloadForm(MyGlb.FRM_MANDARESIFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDARESIFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriMandatiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.Show(MyGlb.FRM_VARIAZFINANZ, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriElencoVariazioniSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI39, IMDBDef1.FLD_PARAMETRI39_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.Show(MyGlb.FRM_VARIAZFINANZ, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriElencoVariazioniEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZFINA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriPrevisioneInizialeSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE3, IMDBDef8.PQSL_VISTATOTOPE3_FINANZIAMENTO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI38, IMDBDef1.FLD_PARAMETRI38_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZFINA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZFINA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriPrevisioneInizialeEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Emessi A Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiEmessiAResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Emessi A Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_MANDATEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDATEMESSI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriMandatiEmessiAResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Emessi di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiEmessidiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Emessi di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI50, IMDBDef1.FLD_PARAMETRI50_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_MANDATEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANDATEMESSI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriMandatiEmessidiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati Emessi Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiEmessiEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati Emessi Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI51, IMDBDef1.FLD_PARAMETRI51_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_MANEMEESPRFI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_MANEMEESPRFI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriMandatiEmessiEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Pagamenti di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPagamentidiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Pagamenti di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_PAGAMENTI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PAGAMENTI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriPagamentidiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Pagamenti a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPagamentiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Pagamenti a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI52, IMDBDef1.FLD_PARAMETRI52_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_PAGAMENTI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PAGAMENTI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriPagamentiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Pagamenti Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPagamentiEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Pagamenti Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI53, IMDBDef1.FLD_PARAMETRI53_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_PAGESEPREFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PAGESEPREFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriPagamentiEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi Emessi a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiEmessiaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi Emessi a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_ORDINAEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDINAEMESSI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriOrdinativiEmessiaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi Emessi Di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiEmessiDiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi Emessi Di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI54, IMDBDef1.FLD_PARAMETRI54_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_ORDINAEMESSI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDINAEMESSI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriOrdinativiEmessiDiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riscossioni a Residuo Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriRiscossioniaResiduoFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riscossioni a Residuo Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMTIPO, 0, (new IDVariant("a Residuo")));
      MainFrm.UnloadForm(MyGlb.FRM_RISCOSSIONI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_RISCOSSIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriRiscossioniaResiduoFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riscossioni di Competenza Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriRiscossionidiCompetenzaFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riscossioni di Competenza Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI55, IMDBDef1.FLD_PARAMETRI55_PARAMTIPO, 0, (new IDVariant("di Competenza")));
      MainFrm.UnloadForm(MyGlb.FRM_RISCOSSIONI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_RISCOSSIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriRiscossionidiCompetenzaFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi Emessi Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiEmessiEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi Emessi Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI57, IMDBDef1.FLD_PARAMETRI57_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ORDEMEESPRFI,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ORDEMEESPRFI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriOrdinativiEmessiEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Riscossioni Esercizi Precedenti Fin
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriRiscossioniEserciziPrecedentiFin ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Riscossioni Esercizi Precedenti Fin Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI58, IMDBDef1.FLD_PARAMETRI58_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_RISESEPREFIN,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_RISESEPREFIN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriRiscossioniEserciziPrecedentiFin", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Precedenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniPrecedenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Precedenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMTIPO, 0, (new IDVariant("Precedenti")));
      MainFrm.Show(MyGlb.FRM_VARIAZIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriVariazioniPrecedenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Esercizio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniEsercizio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Esercizio Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMTIPO, 0, (new IDVariant("Esercizio")));
      MainFrm.Show(MyGlb.FRM_VARIAZIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriVariazioniEsercizio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Emessi
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniEmessi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Emessi Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMFINANZI, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMDATA, 0, IMDB.Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARAMDATAAL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI56, IMDBDef1.FLD_PARAMETRI56_PARAMTIPO, 0, (new IDVariant(" ")));
      MainFrm.Show(MyGlb.FRM_VARIAZIONI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ApriVariazioniEmessi", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARAMDATAAL, 0, IDL.Today());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (MainFrm.INTEGRAZIPBM.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEFINIMPACC)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef8.PQRY_PARAMETRI325, IMDBDef8.PQSL_PARAMETRI325_PARACODIFINA, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME10, IMDBDef7.PQSL_FINANZIAME10_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Finanziamento Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_FINANZIAMENT_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Finanziamento Validate Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ParametriFinanziamentoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Archivio On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ARCHIVIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ARCHIVIO);
      // 
      // Archivio On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FINANZIAME19, IMDBDef8.PQSL_FINANZIAME19_NOTE, 0))))
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_ARCHIVIO.set_ToolTip(Glb.OBJ_FIELD,PFL_ARCHIVIO_DIPARTIMENTO,IMDB.Value(IMDBDef8.PQRY_FINANZIAME19, IMDBDef8.PQSL_FINANZIAME19_DIPARTIMENTO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ArchivioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Archivio After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ARCHIVIO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Archivio After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(MainFrm.FunzioneLicenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), (new IDVariant("DIP"))))).equals((new IDVariant(-1)), true))
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ARCHIVIO.SetFlags (Glb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "ArchivioAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Cassa After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_CASSA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TOTMANDEMES = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_TOTMANDPAG = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_TOTORDEMES = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_TOTORDRISC = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SALDOEMESSI = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SALDORISCOSS = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SALDOFINALEE = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_SALDOFINALER = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Cassa After Find Event Body
      // Procedure Body
      // 
      v_TOTMANDEMES = new IDVariant(IDL.Add(IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECTOTMAEMES, 0), IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECOMANDPREC, 0)),IDVariant.DECIMAL);
      v_TOTMANDPAG = new IDVariant(IDL.Add(IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECTOTMAPAES, 0), IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECOPAGAPREC, 0)),IDVariant.DECIMAL);
      PAN_CASSA.set_FieldText(PFL_CASSA_TOTAMANDEMES, IDL.ToString(v_TOTMANDEMES).stringValue());
      PAN_CASSA.set_FieldText(PFL_CASSA_TOTAMANDPAGA, IDL.ToString(v_TOTMANDPAG).stringValue());
      v_TOTORDEMES = new IDVariant(IDL.Add(IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECTOTOREMES, 0), IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECORORDPREC, 0)),IDVariant.DECIMAL);
      v_TOTORDRISC = new IDVariant(IDL.Add(IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECTOTORRIES, 0), IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECORINCPREC, 0)),IDVariant.DECIMAL);
      PAN_CASSA.set_FieldText(PFL_CASSA_TOTAORDIEMES, IDL.ToString(v_TOTORDEMES).stringValue());
      PAN_CASSA.set_FieldText(PFL_CASSA_TOTAORDIRISC, IDL.ToString(v_TOTORDRISC).stringValue());
      v_SALDOEMESSI = new IDVariant(IDL.Sub(IDL.Add(IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECSALINICAS, 0), v_TOTORDEMES), v_TOTMANDEMES),IDVariant.DECIMAL);
      v_SALDORISCOSS = new IDVariant(IDL.Sub(IDL.Add(IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECSALINIPAG, 0), v_TOTORDRISC), v_TOTMANDPAG),IDVariant.DECIMAL);
      PAN_CASSA.set_FieldText(PFL_CASSA_SALDOEMESSI, IDL.ToString(v_SALDOEMESSI).stringValue());
      PAN_CASSA.set_FieldText(PFL_CASSA_SALDORISCOSS, IDL.ToString(v_SALDORISCOSS).stringValue());
      v_SALDOFINALEE = IDL.Add(v_SALDOEMESSI, IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASTOT, 0));
      v_SALDOFINALER = IDL.Add(v_SALDORISCOSS, IMDB.Value(IMDBDef8.PQRY_VISTOTCASFI1, IMDBDef8.PQSL_VISTOTCASFI1_RECVARCASTOT, 0));
      PAN_CASSA.set_FieldText(PFL_CASSA_SALDFINAEMES, IDL.ToString(v_SALDOFINALEE).stringValue());
      PAN_CASSA.set_FieldText(PFL_CASSA_SALDFINARISC, IDL.ToString(v_SALDOFINALER).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniFinanziamento", "CassaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void INFORMFINAN1_PARAMETRI325() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_PARAMETRI325_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI33, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI33, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_PARAMETRI325_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_PARAMETRI325_RS, 0, IMDBDef1.TBL_PARAMETRI33, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAMETRI325_RS, 0, 0, IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAMETRI325_RS, 1, 0, IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARAMDATAAL, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI33, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI33, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI33, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_PARAMETRI325_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoFinanziamenti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_FINANZIAMENT)
      {
        PFL_PARAMETRI_FINANZIAMENT_ValidateCell(Cancel);
      }
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

  private void TAB_INFORMFINANZ_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_INFORMFINANZ_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ARCHIVIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ARCHIVIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ARCHIVIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ARCHIVIO, Cancel);
    // Stub
  }

  private void PAN_ARCHIVIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ARCHIVIO_NOTAVUOTA)
    {
      this.IdxPanelActived = this.PAN_ARCHIVIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ARCHIVIO_NOTAPIENA)
    {
      this.IdxPanelActived = this.PAN_ARCHIVIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ARCHIVIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ARCHIVIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ARCHIVIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SITUAZIONE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITUAZIONE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITUAZIONE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITUAZIONE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITUAZIONE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SITUAZIONE);
    // Stub
  }

  private void PAN_SITUAZIONE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRPREINENFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRELEVAENFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRPREINSPFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRACCDICOFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAccertamentiDiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRVARPRENFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniProvvisorieEntrataFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRACCARESFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAccertamentiAResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRORDDICOFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinatividiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRORDARESFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinativiaResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRELEVASPFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRIMPDICOFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImpegniDiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRVARPRSPFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioneProvvisoriaSpesaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRIMPARESFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImpegniaResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRSUBIMPFIN)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSubImpegniFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRILIQUIFIN)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriLiquidazioniFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRMANDICOFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMandatiDiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITUAZIONE_APRMANARESFI)
    {
      this.IdxPanelActived = this.PAN_SITUAZIONE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMandatiaResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SITUAZIONE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITUAZIONE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITUAZIONE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CASSA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CASSA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CASSA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CASSA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CASSA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CASSA);
    // Stub
  }

  private void PAN_CASSA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CASSA_APRMAEMAREFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMandatiEmessiAResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APMAEMDICOFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMandatiEmessidiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APMAEMESPRFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMandatiEmessiEserciziPrecedentiFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRPAGARESFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPagamentiaResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRPAGDICOFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPagamentidiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRPAGESPRFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPagamentiEserciziPrecedentiFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APROREMAREFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinativiEmessiaResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APOREMDICOFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinativiEmessiDiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRRISARESFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriRiscossioniaResiduoFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRRISDICOFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriRiscossionidiCompetenzaFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APOREMESPRFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinativiEmessiEserciziPrecedentiFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRRISESPRFI)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriRiscossioniEserciziPrecedentiFin();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRIVARIRISC)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniEmessi();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRIVARIEMES)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniEmessi();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRVARESERIS)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniEsercizio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRVARESEEME)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniEsercizio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRVARPRERIS)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniPrecedenti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CASSA_APRVARPREEME)
    {
      this.IdxPanelActived = this.PAN_CASSA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniPrecedenti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CASSA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CASSA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CASSA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ARCHIVIO_Init()
  {

    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, "A697F7EE-4143-4CB6-A2CA-DFCF031C4988");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, "Codice");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, "24B32728-7129-48FD-AE8E-5AD82572E582");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, "Descrizione");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, "820FD656-49A9-40E9-B092-9B75DCC15AEB");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, "Ragione Sociale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, "F24B8392-20D7-4AD1-BFCD-4890CEB430A1");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, "Ente");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, "F72A9153-AA98-43B3-BAAB-BAFF2945EB00");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, "Anno Mutuo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, "341C4D80-D6CF-4C27-A322-58201C241A7A");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, "Numero Mutuo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, "6926FED8-40F5-4343-B6F3-1A310F062546");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, "Note");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, "8354DA23-5BD6-4F88-9CDD-716F33764032");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, "Importo Originale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, "CE0D7AE1-54AF-4B62-925D-FCAB249203B5");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, "Scadenza");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, "46C47449-DDD7-473F-B85C-6C2662BF1CBD");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, "Ente");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.VIS_VUOTONORMALE);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, "0F7835E7-2469-46B9-8EC1-116542231E22");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, "/");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, "6C9496D5-1B21-4A70-A30B-5CFDF81AE495");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, "Numero/Anno Mutuo");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.VIS_VUOTONORMALE);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, "137530A3-418C-4612-9B88-33D20F5B0400");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, "Categoria");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, "94DA44BA-D81A-4FC2-AD07-3C1AFC95F8D9");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, "Durata Desc");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, "169C2571-817E-4AA8-8B78-131EB8FCDF93");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, "Allegato al Capitolo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, "AB207B99-5DC5-44C5-B07F-B78B34E87A1F");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, "Finanziamento Disavanzo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, "8171E3D7-5FDD-4BF3-8535-C1F640A04265");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, "Flessibilità");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, "E66D88F3-5547-4479-A328-77A53B4597E2");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, "Dipartimento");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, "CEACFE81-0805-4DC0-B027-0AAA4B622A76");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, "Legge Regionale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, "582E26AA-3BC9-4B75-8E2C-3445A344E945");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, "Capitolo Regionale");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, "B6DE444F-E177-423B-B99D-981D95BCE8B4");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, "Atto Assegnazione");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, "BC288096-5672-4041-954E-E4ED941BFB2C");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.VIS_STATICBUTTON);
    PAN_ARCHIVIO.SetImage(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, 0, "nota bianca.gif", false);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, "677F89D5-270F-40A1-AA5E-0CAACD370AAC");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.VIS_STATICBUTTON);
    PAN_ARCHIVIO.SetImage(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, 0, "nota scritta.gif", false);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, "EB951E11-AD7A-438C-9D12-D243FFBD3BD0");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, "Servizio Operativo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, "If Equal (FINANZIAMENTI SERVIZIO OPERATIVO, null, \"\", Fill Left (To String (OPESER SERVIZIO), 6, \" \") + \" - \" + OPESER DESCRIZIONE)");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.VIS_NORMFIELPADR);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, "50DCC820-128A-4830-8B75-BC7E9F1B9BF9");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, "Settore Operativo");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, "If Equal (FINANZIAMENTI SETTORE OPERATIVO, null, \"\", Fill Left (To String (OPESET SETTORE), 6, \" \") + \" - \" + OPESET DESCRIZIONE)");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.VIS_NORMFIELPADR);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ARCHIVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, "EBD9624B-C73F-4AE9-8A9F-C82243D7FA63");
    PAN_ARCHIVIO.set_Header(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, "Da Rendicontare al MEF");
    PAN_ARCHIVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, "");
    PAN_ARCHIVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.VIS_CHECKSTYLE);
    PAN_ARCHIVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ARCHIVIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, 96, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, 68);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_CODICE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_CODICE, PPQRY_FINANZIAME19, "A.CODICE", "CODICE", 1, 5, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, 4, 184, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, 72, 28, 444, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, 92);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_DESCRIZIONE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_DESCRIZIONE, PPQRY_FINANZIAME19, "A.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 140);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 168, 68, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Rag. Sociale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_RAGIONSOCIAL, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_RAGIONSOCIAL, PPQRY_FINANZIAME19, "B.RAGIONE_SOCIALE_ESTESA", "RAGIONE_SOCIALE_ESTESA", 5, 60, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, 36);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_LIST, "Ente");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, 432, 68, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, 32);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ENTE, MyGlb.PANEL_FORM, "Ente");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ENTE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ENTE, PPQRY_FINANZIAME19, "A.ENTE", "ENTE", 1, 6, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, 76);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_LIST, "Ann. Mut.");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, 288, 92, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, 68);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ANNOMUTUO, MyGlb.PANEL_FORM, "Ann. Mut.");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ANNOMUTUO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ANNOMUTUO, PPQRY_FINANZIAME19, "A.ANNO_MUTUO", "ANNO_MUTUO", 1, 4, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, 92);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_LIST, "Numero Mutuo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, 168, 92, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, 80);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NUMEROMUTUO, MyGlb.PANEL_FORM, "Num. Mutuo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NUMEROMUTUO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NUMEROMUTUO, PPQRY_FINANZIAME19, "A.NUMERO_MUTUO", "NUMERO_MUTUO", 5, 10, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, 4, 208, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, 128);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, 100, 260, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, 64);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NOTE1, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NOTE1, PPQRY_FINANZIAME19, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_LIST, "Importo Originale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, 44, 116, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, 120);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_IMPORTORIGIN, MyGlb.PANEL_FORM, "Importo Originale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_IMPORTORIGIN, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_IMPORTORIGIN, PPQRY_FINANZIAME19, "A.IMPORTO_ORIG", "IMPORTO_ORIG", 3, 14, 2, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_LIST, "Scad.");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, 80, 188, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_SCADENZA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_SCADENZA, PPQRY_FINANZIAME19, "A.SCADENZA", "SCADENZA", 1, 4, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_LIST, 20, 68, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_FORM, 116, 68, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LABELENTE, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_LABELENTE, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_LABELENTE, -1, "", "LABELENTE", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_LIST, 184, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_FORM, 268, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_BARRA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_LIST, 28, 76, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_FORM, 56, 92, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_MUTUO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_MUTUO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_MUTUO, -1, "", "MUTUO", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, 56);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, 80, 140, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_CATEGORIA, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_CATEGORIA, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_CATEGORIA, PPQRY_FINANZIAME19, "DECODE(A.CATEGORIA, to_number(NULL), '', TO_CHAR ( A.CATEGORIA ) || ' - ' || C.DESCRIZIONE)", "FINANZCATEGO", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, 68);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_LIST, "Durata Desc");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, 68, 164, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DURATADESC, MyGlb.PANEL_FORM, "Durata Desc");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_DURATADESC, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_DURATADESC, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_DURATADESC, PPQRY_FINANZIAME19, "DECODE(A.TIPO_DURATA, 'A', 'Annuale', DECODE(A.TIPO_DURATA, 'P', 'Pluriennale', 'Nulla'))", "FINADURADESC", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_LIST, "Allegato al Capitolo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_FORM, 48, 212, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_FORM, 116);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ALLEGALCAPIT, MyGlb.PANEL_FORM, "Allegato al Capitolo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ALLEGALCAPIT, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_ALLEGALCAPIT, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ALLEGALCAPIT, PPQRY_FINANZIAME19, "DECODE(A.COD_ALLEGATO, to_number(NULL), '', TO_CHAR ( A.COD_ALLEGATO ) || ' - ' || D.DESC_ABB)", "FINAALLALCAP", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, 132);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_LIST, "Finanziamento Disavanzo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, 4, 236, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, 160);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FINANZDISAVA, MyGlb.PANEL_FORM, "Finanziamento Disavanzo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_FINANZDISAVA, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_FINANZDISAVA, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_FINANZDISAVA, PPQRY_FINANZIAME19, "DECODE(A.COD_FIN_DISAV, to_number(NULL), '', TO_CHAR ( A.COD_FIN_DISAV ) || ' - ' || E.DESCRIZIONE)", "FINAFINADISA", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, 56);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_LIST, "Flessibilità");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, 80, 284, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_FLESSIBILITA, MyGlb.PANEL_FORM, "Flessibilità");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_FLESSIBILITA, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_FLESSIBILITA, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_FLESSIBILITA, PPQRY_FINANZIAME19, "DECODE(A.FLESSIBILITA, to_number(NULL), '', H.CODICE || ' - ' || H.DESCRIZIONE)", "FINANZFLESSI", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, 0, 36, 380, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_LIST, "Dipartimento");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, 52, 308, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, 112);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_DIPARTIMENTO, MyGlb.PANEL_FORM, "Dipartimento");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_DIPARTIMENTO, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_DIPARTIMENTO, PPQRY_FINANZIAME19, "A.DIPARTIMENTO", "DIPARTIMENTO", 5, 150, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, 64);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_LIST, "Legge Regionale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, 48, 332, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, 116);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_LEGGEREGIONA, MyGlb.PANEL_FORM, "Legge Regionale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_LEGGEREGIONA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_LEGGEREGIONA, PPQRY_FINANZIAME19, "A.LEGGE_REG", "LEGGE_REG", 5, 50, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, 84);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_LIST, "Capitolo Regionale");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, 36, 356, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, 128);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_CAPITOREGION, MyGlb.PANEL_FORM, "Capitolo Regionale");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_CAPITOREGION, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_CAPITOREGION, PPQRY_FINANZIAME19, "A.CAPITOLO_REG", "CAPITOLO_REG", 5, 50, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 60);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_LIST, "Atto Assegnazione");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 36, 380, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 128);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_ATTOASSEGNAZ, MyGlb.PANEL_FORM, "Atto Assegnazione");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_ATTOASSEGNAZ, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_ATTOASSEGNAZ, PPQRY_FINANZIAME19, "A.ATTO_ASS", "ATTO_ASS", 5, 50, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_LIST, 472, 260, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_FORM, 500, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NOTAVUOTA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NOTAVUOTA, -1, "", "NOTAVUOTA", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_LIST, 480, 268, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_LIST, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_FORM, 500, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_FORM, 0);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_NOTAPIENA, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_NOTAPIENA, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_NOTAPIENA, -1, "", "NOTAPIENA", 0, 0, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, 8, 44, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_LIST, "Servizio Operativo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, 12, 412, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SERVIZOPERAT, MyGlb.PANEL_FORM, "Servizio Operativo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_SERVIZOPERAT, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_SERVIZOPERAT, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_SERVIZOPERAT, PPQRY_FINANZIAME19, "DECODE(A.SERVIZIO_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( G.SERVIZIO ), 6, SUBSTR(' ', 1, 1)) || ' - ' || G.DESCRIZIONE)", "FINASERVOPER", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_LIST, "Settore Operativo");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, 4, 404, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, 96);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, 2);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_SETTOROPERAT, MyGlb.PANEL_FORM, "Settore Operativo");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_SETTOROPERAT, -1, -1);
    PAN_ARCHIVIO.SetFieldUnbound(PFL_ARCHIVIO_SETTOROPERAT, true);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_SETTOROPERAT, PPQRY_FINANZIAME19, "DECODE(A.SETTORE_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( F.SETTORE ), 6, SUBSTR(' ', 1, 1)) || ' - ' || F.DESCRIZIONE)", "FINASETTOPER", 5, 99, 0, -13997);
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_LIST, 76);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_LIST, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_LIST, "Da Rendic. al MEF");
    PAN_ARCHIVIO.SetRect(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_FORM, 24, 404, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ARCHIVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_FORM, 140);
    PAN_ARCHIVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_FORM, 1);
    PAN_ARCHIVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ARCHIVIO_RENDALMEF, MyGlb.PANEL_FORM, "Da Rendicontare al MEF");
    PAN_ARCHIVIO.SetFieldPage(PFL_ARCHIVIO_RENDALMEF, -1, -1);
    PAN_ARCHIVIO.SetFieldPanel(PFL_ARCHIVIO_RENDALMEF, PPQRY_FINANZIAME19, "A.REND_AL_MEF", "FINARENALMEF", 5, 2, 0, -13997);
    PAN_ARCHIVIO.SetValueListItem(PFL_ARCHIVIO_RENDALMEF, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ARCHIVIO.SetValueListItem(PFL_ARCHIVIO_RENDALMEF, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_ARCHIVIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ARCHIVIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ARCHIVIO.SetIMDB(IMDB, "PQRY_FINANZIAME19", true);
    PAN_ARCHIVIO.set_SetString(MyGlb.MASTER_ROWNAME, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.ENTE as ENTE, ");
    SQL.append("  A.ANNO_MUTUO as ANNO_MUTUO, ");
    SQL.append("  A.NUMERO_MUTUO as NUMERO_MUTUO, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.COD_ALLEGATO as COD_ALLEGATO, ");
    SQL.append("  A.IMPORTO_ORIG as IMPORTO_ORIG, ");
    SQL.append("  A.TIPO_DURATA as TIPO_DURATA, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.SALDO_INI_CASSA as SALDO_INI_CASSA, ");
    SQL.append("  A.SALDO_INI_TESORERIA as SALDO_INI_TESORERIA, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  DECODE(A.TIPO_DURATA, 'A', 'Annuale', DECODE(A.TIPO_DURATA, 'P', 'Pluriennale', 'Nulla')) as FINADURADESC, ");
    SQL.append("  D.DESC_ABB as DESC_ABB, ");
    SQL.append("  E.DESCRIZIONE as FINADISADESC, ");
    SQL.append("  A.COD_FIN_DISAV as COD_FIN_DISAV, ");
    SQL.append("  A.LEGGE_REG as LEGGE_REG, ");
    SQL.append("  A.CAPITOLO_REG as CAPITOLO_REG, ");
    SQL.append("  A.ATTO_ASS as ATTO_ASS, ");
    SQL.append("  A.DIPARTIMENTO as DIPARTIMENTO, ");
    SQL.append("  DECODE(A.SERVIZIO_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( G.SERVIZIO ), 6, SUBSTR(' ', 1, 1)) || ' - ' || G.DESCRIZIONE) as FINASERVOPER, ");
    SQL.append("  DECODE(A.SETTORE_OPERATIVO, to_number(NULL), '', LPAD(TO_CHAR ( F.SETTORE ), 6, SUBSTR(' ', 1, 1)) || ' - ' || F.DESCRIZIONE) as FINASETTOPER, ");
    SQL.append("  DECODE(A.FLESSIBILITA, to_number(NULL), '', H.CODICE || ' - ' || H.DESCRIZIONE) as FINANZFLESSI, ");
    SQL.append("  DECODE(A.CATEGORIA, to_number(NULL), '', TO_CHAR ( A.CATEGORIA ) || ' - ' || C.DESCRIZIONE) as FINANZCATEGO, ");
    SQL.append("  DECODE(A.COD_ALLEGATO, to_number(NULL), '', TO_CHAR ( A.COD_ALLEGATO ) || ' - ' || D.DESC_ABB) as FINAALLALCAP, ");
    SQL.append("  DECODE(A.COD_FIN_DISAV, to_number(NULL), '', TO_CHAR ( A.COD_FIN_DISAV ) || ' - ' || E.DESCRIZIONE) as FINAFINADISA, ");
    SQL.append("  A.REND_AL_MEF as FINARENALMEF ");
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME19, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A, ");
    SQL.append("  BEN B, ");
    SQL.append("  CATEGORIE_FIN C, ");
    SQL.append("  T69 D, ");
    SQL.append("  FINANZIAMENTI_DISAV E, ");
    SQL.append("  OPESET F, ");
    SQL.append("  OPESER G, ");
    SQL.append("  FLESSIBILITA H ");
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME19, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ENTE = B.CODICE(+)) ");
    SQL.append("and   (A.CATEGORIA = C.CODICE(+)) ");
    SQL.append("and   (A.COD_ALLEGATO = D.CODICE(+)) ");
    SQL.append("and   (A.COD_FIN_DISAV = E.CODICE(+)) ");
    SQL.append("and   (A.SETTORE_OPERATIVO = F.SETTORE(+)) ");
    SQL.append("and   (A.SETTORE_OPERATIVO = G.SETTORE(+)) ");
    SQL.append("and   (A.SERVIZIO_OPERATIVO = G.SERVIZIO(+)) ");
    SQL.append("and   (A.FLESSIBILITA = H.CODICE(+)) ");
    SQL.append("and   (A.CODICE = ~~PQRY_PARAMETRI325.PARACODIFINA~~) ");
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME19, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME19, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME19, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ARCHIVIO.SetQuery(PPQRY_FINANZIAME19, 5, SQL, -1, "");
    PAN_ARCHIVIO.SetQueryDB(PPQRY_FINANZIAME19, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ARCHIVIO.SetMasterTable(0, "FINANZIAMENTI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ARCHIVIO.Status() == 2)
    {
      int oldListQBE = PAN_ARCHIVIO.iUseListQBE;
      PAN_ARCHIVIO.iUseListQBE = 0;
      PAN_ARCHIVIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ARCHIVIO.PanelCommand(Glb.PCM_FIND);
      PAN_ARCHIVIO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SITUAZIONE_Init()
  {

    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_FIELD, 41);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, "516509F3-6673-4E55-B0C7-F7DAA8891AB8");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, "Previsione Iniziale");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, "574511C2-5BCF-4542-BC86-C18FF3947F1E");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, "Variazioni");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, "6F1A77DB-D362-47C4-84F9-49B4BCFEDA3B");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, "Previsione Attuale");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, "3AC74268-C92D-426B-BB4A-99084C836D7F");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, "Accertato Competenza");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, "43103BDD-B6AC-4F06-992C-8D7271CDF15B");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, "Disponibilità");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, "F84B9873-ACF4-4DC1-B508-DCF84124B49E");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, "Variazioni Provvisorie");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, "CC393E80-09A7-42BE-85B1-7C925390564E");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, "Accertato Residuo");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, "A7415F30-18A2-4445-A3C4-16A911F52546");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, "Ordinativi Competenza");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, "0630256E-8565-474D-BB9C-11BEEB6D47DB");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, "Residuo");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, "EEE0E6F0-E000-41F5-A8B8-034165244842");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, "Totale");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, "C910F07B-1B49-4CAE-81D6-79C2908E9AAE");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, "Previsione Iniziale ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, "FD4E0DBC-96A3-4C68-9787-F464FE4426F5");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, "Variazioni ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, "A5B49FBD-CB98-4834-BFB2-BE7CFADE3DE5");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, "Previsione Attuale ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, "85563FF5-C87B-4A64-9702-A2257F877940");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, "Impegnato Competenza");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, "B9A4A7EA-B172-4F8D-9ACF-8D96CFA1AD25");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, "Disponibilità ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, "A493DA46-6F7C-4107-A94B-D2DD7E1FBF07");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, "Variazioni Provvisorie ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, "D120D2D3-2BDA-4046-B063-7AA1E8C3A7E1");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, "Impegnato Residuo");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, "65215541-D6CB-4875-9E2C-D2EF4B1CBA2D");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, "Sub Impegnato");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, "6E556C2F-ED81-407C-975F-DFD8C4E746FB");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, "Liquidato");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, "EF9DAB8F-9863-4CD5-AA65-21F062C4A24D");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, "Mandati Competenza");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, "216DDB80-5264-4DB3-BEFC-B22B1B9F9C9A");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, "Residuo ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, "6B51CEE9-E443-4E35-A9CD-08255F105D04");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, "Totale ");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, "F04DB910-64C5-4C83-979E-23F956F3DCE8");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, "Entrata");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, "5D3F5CF0-38B8-439B-B04D-16036065393D");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, "Spesa");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.VIS_VUOTOGRASSET);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, "6B49D2CE-9F17-4BC1-BC3B-D799918DE2FA");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, "F7D75CDD-086F-4153-869D-42E428F2AF92");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, "10BC55FC-8C8F-47EF-A87F-516020B25FCD");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, "AD72DAE0-76D1-474C-8E06-4F5B69CFAC4B");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, "0B67C281-46FE-4E2B-BDD4-7E820FE3A2E9");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, "3ADC4D80-7431-4CB8-A0C2-F360820E2D5B");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, "057431F3-B062-4D8D-B0A2-3B286A97CEC0");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, "796F46DA-903A-45A5-90C7-65FCDA3F2ADF");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, "53A0EF44-AE1D-4D1D-97CC-7639950FAF4A");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, "47C5288E-8EC0-4BC2-ABE9-E97C4177AF6A");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, "8EDD4056-4F94-4C5A-BD97-6F4921D1C58A");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, "01B22BAD-1D3A-4FBD-A8A5-9ED1C740FF97");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, "078942B4-96F4-486C-A428-355B78073954");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, "74AB1FCB-E67D-413E-91EB-B74C24E1621D");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, "6CC97786-1963-47AC-9982-55E8C9EF6484");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, "F72EB88A-FDE7-4DB2-AEB8-1A0271FE7622");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, MyGlb.VIS_STATICBUTTON);
    PAN_SITUAZIONE.SetImage(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, 0, "info.gif", false);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SITUAZIONE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, "A6639128-009D-4B60-B6EE-891095304EC5");
    PAN_SITUAZIONE.set_Header(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, "FINANZIAMENTO");
    PAN_SITUAZIONE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, "");
    PAN_SITUAZIONE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.VIS_NONNULLAFIEL);
    PAN_SITUAZIONE.SetFlags(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, 0, -1);
  }

  private void PAN_SITUAZIONE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, 96);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_LIST, "Previsione Iniziale");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, 32, 36, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, 116);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZI1, MyGlb.PANEL_FORM, "Previsione Iniziale");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISINIZI1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISINIZI1, PPQRY_VISTATOTOPE3, "A.PREVISIONE_INI_E", "PREVISIONE_INI_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_LIST, "Variazioni");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, 72, 60, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, 76);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI1, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZIONI1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZIONI1, PPQRY_VISTATOTOPE3, "A.VARIAZIONI_E", "VARIAZIONI_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_LIST, "Previsione Attuale");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, 32, 84, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, 116);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUA1, MyGlb.PANEL_FORM, "Previsione Attuale");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISATTUA1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISATTUA1, PPQRY_VISTATOTOPE3, "A.PREVISIONE_ATT_E", "PREVISIONE_ATT_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, 104);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_LIST, "Accer. Compet.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, 8, 108, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, 140);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTCOMPET, MyGlb.PANEL_FORM, "Accertato Competenza");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_ACCERTCOMPET, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_ACCERTCOMPET, PPQRY_VISTATOTOPE3, "A.ACCERTATO_COMP", "ACCERTATO_COMP", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, 60, 132, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, 88);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILI1, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPONIBILI1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPONIBILI1, PPQRY_VISTATOTOPE3, "A.DISPONIBILITA_E", "DISPONIBILITA_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_LIST, "Variazioni Provvisorie");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, 16, 156, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVV1, MyGlb.PANEL_FORM, "Variazioni Provvisorie");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROVV1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROVV1, PPQRY_VISTATOTOPE3, "A.VARCOMPRO_E", "VARCOMPRO_E", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_LIST, "Accertato Residuo");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_FORM, 16, 180, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_FORM, 132);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ACCERTRESIDU, MyGlb.PANEL_FORM, "Accertato Residuo");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_ACCERTRESIDU, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_ACCERTRESIDU, PPQRY_VISTATOTOPE3, "A.ACCERTATO_RES", "ACCERTATO_RES", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_LIST, "Ordin. Comp.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_FORM, 8, 252, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_FORM, 140);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_ORDINACOMPET, MyGlb.PANEL_FORM, "Ordinativi Competenza");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_ORDINACOMPET, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_ORDINACOMPET, PPQRY_VISTATOTOPE3, "A.ORDINATIVI_COMP", "ORDINATIVI_COMP", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_LIST, "Residuo");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_FORM, 80, 276, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_FORM, 68);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO1, MyGlb.PANEL_FORM, "Residuo");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_RESIDUO1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_RESIDUO1, PPQRY_VISTATOTOPE3, "A.ORDINATIVI_RES", "ORDINATIVI_RES", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_LIST, 68);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_LIST, "Totale");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_FORM, 88, 300, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_FORM, 60);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE1, MyGlb.PANEL_FORM, "Totale");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_TOTALE1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_TOTALE1, PPQRY_VISTATOTOPE3, "A.ORDINATIVI", "ORDINATIVI", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, 96);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_LIST, "Previsione Iniziale ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, 328, 36, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISINIZIA, MyGlb.PANEL_FORM, "Previsione Iniziale ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISINIZIA, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISINIZIA, PPQRY_VISTATOTOPE3, "A.PREVISIONE_INI_S", "PREVISIONE_INI_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, 368, 60, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, 80);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZIONI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZIONI, PPQRY_VISTATOTOPE3, "A.VARIAZIONI_S", "VARIAZIONI_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_LIST, "Previsione Attuale ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, 328, 84, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, 120);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_PREVISATTUAL, MyGlb.PANEL_FORM, "Previsione Attuale ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_PREVISATTUAL, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_PREVISATTUAL, PPQRY_VISTATOTOPE3, "A.PREVISIONE_ATT_S", "PREVISIONE_ATT_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, 100);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_LIST, "Impeg. Compet.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, 300, 108, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, 148);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNCOMPET, MyGlb.PANEL_FORM, "Impegnato Competenza");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_IMPEGNCOMPET, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_IMPEGNCOMPET, PPQRY_VISTATOTOPE3, "A.IMPEGNATO_COMP", "IMPEGNATO_COMP", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, 360, 132, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, 88);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_DISPONIBILIT, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_DISPONIBILIT, PPQRY_VISTATOTOPE3, "A.DISPONIBILITA_S", "DISPONIBILITA_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, 84);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_LIST, "Variaz. Provv.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, 312, 156, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_VARIAZPROVVI, MyGlb.PANEL_FORM, "Variazioni Provvisorie ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_VARIAZPROVVI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_VARIAZPROVVI, PPQRY_VISTATOTOPE3, "A.VARCOMPRO_S", "VARCOMPRO_S", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_LIST, "Impegnato Residuo");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_FORM, 320, 180, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_FORM, 128);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_IMPEGNRESIDU, MyGlb.PANEL_FORM, "Impegnato Residuo");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_IMPEGNRESIDU, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_IMPEGNRESIDU, PPQRY_VISTATOTOPE3, "A.IMPEGNATO_RES", "IMPEGNATO_RES", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_LIST, 88);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_LIST, "Sub Impegnato");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_FORM, 340, 204, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_FORM, 108);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_SUBIMPEGNATO, MyGlb.PANEL_FORM, "Sub Impegnato");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_SUBIMPEGNATO, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_SUBIMPEGNATO, PPQRY_VISTATOTOPE3, "A.SUBIMPEGNATO", "SUBIMPEGNATO", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_LIST, 64);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_LIST, "Liquidato");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_FORM, 344, 228, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_FORM, 104);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LIQUIDATO, MyGlb.PANEL_FORM, "Liquidato");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_LIQUIDATO, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_LIQUIDATO, PPQRY_VISTATOTOPE3, "A.LIQUIDATO", "LIQUIDATO", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_LIST, 88);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_LIST, "Mand. Compet.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_FORM, 312, 252, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_FORM, 136);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_MANDATCOMPET, MyGlb.PANEL_FORM, "Mandati Competenza");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_MANDATCOMPET, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_MANDATCOMPET, PPQRY_VISTATOTOPE3, "A.MANDATI_COMP", "MANDATI_COMP", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_LIST, 76);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_LIST, "Res.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_FORM, 340, 276, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_FORM, 108);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_RESIDUO2, MyGlb.PANEL_FORM, "Residuo ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_RESIDUO2, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_RESIDUO2, PPQRY_VISTATOTOPE3, "A.MANDATI_RES", "MANDATI_RES", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_LIST, 56);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_LIST, "Totale ");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_FORM, 384, 300, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_FORM, 64);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_TOTALE, MyGlb.PANEL_FORM, "Totale ");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_TOTALE, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_TOTALE, PPQRY_VISTATOTOPE3, "A.MANDATI", "MANDATI", 2, 15, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_LIST, 76, 12, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_FORM, 112, 12, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_LABELENTRATA, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_LABELENTRATA, -1, "", "LABELENTRATA", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_LIST, 84, 20, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_FORM, 404, 12, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_LABELSPESA, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_LABELSPESA, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_LABELSPESA, -1, "", "LABELSPESA", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_LIST, 228, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_FORM, 248, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINENFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRPREINENFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRPREINENFI, -1, "", "APRPREINENFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_LIST, 236, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_FORM, 248, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVAENFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRELEVAENFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRELEVAENFI, -1, "", "APRELEVAENFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_LIST, 244, 52, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_FORM, 548, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRPREINSPFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRPREINSPFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRPREINSPFI, -1, "", "APRPREINSPFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_FORM, 248, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRACCDICOFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRACCDICOFI, -1, "", "APRACCDICOFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_FORM, 248, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRENFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRVARPRENFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRVARPRENFI, -1, "", "APRVARPRENFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, MyGlb.PANEL_LIST, 268, 76, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, MyGlb.PANEL_FORM, 248, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRACCARESFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRACCARESFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRACCARESFI, -1, "", "APRACCARESFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, MyGlb.PANEL_LIST, 276, 84, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, MyGlb.PANEL_FORM, 248, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRORDDICOFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRORDDICOFI, -1, "", "APRORDDICOFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, MyGlb.PANEL_LIST, 284, 92, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, MyGlb.PANEL_FORM, 248, 280, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRORDARESFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRORDARESFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRORDARESFI, -1, "", "APRORDARESFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_FORM, 548, 64, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRELEVASPFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRELEVASPFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRELEVASPFI, -1, "", "APRELEVASPFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_FORM, 548, 112, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRIMPDICOFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRIMPDICOFI, -1, "", "APRIMPDICOFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_LIST, 268, 76, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_FORM, 548, 160, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRVARPRSPFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRVARPRSPFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRVARPRSPFI, -1, "", "APRVARPRSPFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, MyGlb.PANEL_LIST, 276, 84, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, MyGlb.PANEL_FORM, 548, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRIMPARESFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRIMPARESFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRIMPARESFI, -1, "", "APRIMPARESFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, MyGlb.PANEL_LIST, 284, 92, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, MyGlb.PANEL_FORM, 548, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRSUBIMPFIN, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRSUBIMPFIN, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRSUBIMPFIN, -1, "", "APRSUBIMPFIN", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, MyGlb.PANEL_LIST, 292, 100, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, MyGlb.PANEL_FORM, 548, 232, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRILIQUIFIN, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRILIQUIFIN, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRILIQUIFIN, -1, "", "APRILIQUIFIN", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, MyGlb.PANEL_LIST, 300, 108, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, MyGlb.PANEL_FORM, 548, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRMANDICOFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRMANDICOFI, -1, "", "APRMANDICOFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, MyGlb.PANEL_LIST, 308, 116, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, MyGlb.PANEL_LIST, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, MyGlb.PANEL_FORM, 548, 280, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, MyGlb.PANEL_FORM, 0);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_APRMANARESFI, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_APRMANARESFI, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_APRMANARESFI, -1, "", "APRMANARESFI", 0, 0, 0, -13997);
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_LIST, "FINANZ.");
    PAN_SITUAZIONE.SetRect(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 324, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITUAZIONE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_SITUAZIONE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_SITUAZIONE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITUAZIONE_FINANZIAMEN1, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_SITUAZIONE.SetFieldPage(PFL_SITUAZIONE_FINANZIAMEN1, -1, -1);
    PAN_SITUAZIONE.SetFieldPanel(PFL_SITUAZIONE_FINANZIAMEN1, PPQRY_VISTATOTOPE3, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
  }

  private void PAN_SITUAZIONE_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITUAZIONE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SITUAZIONE.SetIMDB(IMDB, "PQRY_VISTATOTOPE3", true);
    PAN_SITUAZIONE.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA TOT OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.PREVISIONE_INI_E as PREVISIONE_INI_E, ");
    SQL.append("  A.VARIAZIONI_E as VARIAZIONI_E, ");
    SQL.append("  A.PREVISIONE_ATT_E as PREVISIONE_ATT_E, ");
    SQL.append("  A.ACCERTATO_COMP as ACCERTATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_E as DISPONIBILITA_E, ");
    SQL.append("  A.VARCOMPRO_E as VARCOMPRO_E, ");
    SQL.append("  A.ACCERTATO_RES as ACCERTATO_RES, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.ORDINATIVI_COMP as ORDINATIVI_COMP, ");
    SQL.append("  A.ORDINATIVI_RES as ORDINATIVI_RES, ");
    SQL.append("  A.ORDINATIVI as ORDINATIVI, ");
    SQL.append("  A.PREVISIONE_INI_S as PREVISIONE_INI_S, ");
    SQL.append("  A.VARIAZIONI_S as VARIAZIONI_S, ");
    SQL.append("  A.PREVISIONE_ATT_S as PREVISIONE_ATT_S, ");
    SQL.append("  A.IMPEGNATO_COMP as IMPEGNATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_S as DISPONIBILITA_S, ");
    SQL.append("  A.VARCOMPRO_S as VARCOMPRO_S, ");
    SQL.append("  A.IMPEGNATO_RES as IMPEGNATO_RES, ");
    SQL.append("  A.SUBIMPEGNATO as SUBIMPEGNATO, ");
    SQL.append("  A.LIQUIDATO as LIQUIDATO, ");
    SQL.append("  A.MANDATI_COMP as MANDATI_COMP, ");
    SQL.append("  A.MANDATI_RES as MANDATI_RES, ");
    SQL.append("  A.MANDATI as MANDATI ");
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE3, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_TOT_FIN A ");
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE3, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~PQRY_PARAMETRI325.PARACODIFINA~~) ");
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE3, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE3, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE3, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SITUAZIONE.SetQuery(PPQRY_VISTATOTOPE3, 5, SQL, -1, "");
    PAN_SITUAZIONE.SetQueryDB(PPQRY_VISTATOTOPE3, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITUAZIONE.SetMasterTable(0, "VISTA_TOT_FIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITUAZIONE.Status() == 2)
    {
      int oldListQBE = PAN_SITUAZIONE.iUseListQBE;
      PAN_SITUAZIONE.iUseListQBE = 0;
      PAN_SITUAZIONE.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITUAZIONE.PanelCommand(Glb.PCM_FIND);
      PAN_SITUAZIONE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CASSA_Init()
  {

    PAN_CASSA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CASSA.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, "828AAF83-3484-4F12-B9DC-BBB2808382AC");
    PAN_CASSA.set_Header(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, "Mandati");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_CASSA.SetRect(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 148, 16, 0, 0);
    PAN_CASSA.SetRect(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, MyGlb.PANEL_FORM, 4, 31, 556, 149, 0, 0);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, 0, 46);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, 1, 13);
    PAN_CASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, 0, 4);
    PAN_CASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, 1, 4);
    PAN_CASSA.SetFlags(MyGlb.OBJ_GROUP, GRP_CASSA_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, "BB206929-1BFC-40F0-8471-3907C6967CB1");
    PAN_CASSA.set_Header(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, "Ordinativi");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_CASSA.SetRect(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 148, 16, 0, 0);
    PAN_CASSA.SetRect(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, MyGlb.PANEL_FORM, 4, 183, 556, 181, 0, 0);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, 0, 55);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, 1, 13);
    PAN_CASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, 0, 4);
    PAN_CASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, 1, 4);
    PAN_CASSA.SetFlags(MyGlb.OBJ_GROUP, GRP_CASSA_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, "9AFE0BD7-E856-4064-A63C-938565F05342");
    PAN_CASSA.set_Header(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, "Variazioni");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_CASSA.SetRect(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, MyGlb.PANEL_LIST, 0, -9999, 156, 16, 0, 0);
    PAN_CASSA.SetRect(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, MyGlb.PANEL_FORM, 4, 367, 556, 133, 0, 0);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, 0, 55);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, 1, 13);
    PAN_CASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, 0, 4);
    PAN_CASSA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, 1, 4);
    PAN_CASSA.SetFlags(MyGlb.OBJ_GROUP, GRP_CASSA_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CASSA.SetSize(MyGlb.OBJ_FIELD, 75);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, "A8DF33EA-8AC0-4170-AB8B-0A245FF1E77F");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, "Saldo Ini Cass");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, "Null Value (Max (VISTA TOT CASSA FIN SALDO INI CASSA), ZERO)");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, "8C8F3798-7BD4-4E1E-B8B9-D8BEF874F470");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, "Saldo Iniziale");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, "0C6720F6-0A4B-4FAC-A976-D1D3FCCA6527");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, "Saldo Ini Pag");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, "DF48530A-5543-41CA-BA5B-959A296826E8");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, "Totale Mand Pag Esercizio");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, "E9272CD1-1E88-4966-9DDF-0D477CD995F8");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, "Totale Mand Emessi Esercizio");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, "CF6420FA-C090-4A7B-A235-2C57431B7B61");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, "Pag Residuo");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, "8DA908F1-5E98-4146-B42F-1254A339B568");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, "Pag Competenza");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, "F0D4634E-5581-4CD9-A8B7-F6F9B0B91792");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, "Pagame Prece");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, "74649FEB-67BE-4F9B-8439-DB1B099AB11A");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, "Mand Prece");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, "406D7322-01B7-4DAE-B3DD-6B3DF000AC89");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, "Residuo Mand");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, "B20D437D-EFBA-45CE-9357-54EF52D2D1E9");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, "Competenza Mand");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, "7703D029-C833-4B6C-93DB-B21CC9BC9320");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, "Totale");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, "D4178C8A-3129-40EE-9545-963BFF9BBB47");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, "Esercizi Precedenti");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, "45F83C28-6F03-4C60-AFDD-0AC943164BF9");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, "Totale Esercizio");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, "B4DE8548-9B31-4632-8E6E-93D0134A984C");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, "Competenza");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, "DDC11649-4817-4EBE-A975-A3C785C78191");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, "Residui");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, "4EBAA978-1AF3-4B8A-80CE-C052149C7ECF");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, "99C0830C-B7B9-44E3-B6F7-299FFD63F15C");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, "077963A3-E256-4337-8428-B0DFC7F2F43C");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, "BA6BD92B-91FC-4B6F-A2F9-EE3DFB701A9E");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, "95BA42A8-3A19-4D82-A79D-C6C6D020354F");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, "CCE7C321-9457-44BB-99BF-8A6ED11CAEC5");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, "32B97B04-5F5C-4AC5-A436-84ECBEDFD4EC");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, "6D7936A8-C930-4C26-8D4D-AA10DAD417B5");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, "24044A95-8654-4E5C-B303-7CC45B20955D");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, "B307E1B0-1AC4-4CDE-BBB8-771E82CCD0AC");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, "Tot Ord Riscossi Esercizio");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, "8BF1BCC0-0D65-4BF7-9467-30DFBEB906A9");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, "Tot Ord Emessi Esercizio");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, "9199F69E-2F13-4906-9729-21DDFAFF22D2");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, "Inc Prec");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, "357736FB-5C6B-4A8D-821F-7AA1A6C6B25F");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, "Inc Res");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, "5C5A4078-F7D9-489B-8EFF-5ED027F4E350");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, "Inc Competenza");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, "B203A0E4-A27E-4A85-ADDA-7C524782432C");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, "Ord Prec");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, "22E48069-B20E-4881-BADA-716C16C473B8");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, "Residuo Ord");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, "204D07CA-6889-408C-9305-9FAC9795C712");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, "Residui");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, "78B90047-B148-4FFD-946F-642670FD1E95");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, "Competenza");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, "31554F48-B92C-4EDE-B181-106B59CC014B");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, "Totale Esercizio");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, "768D70C9-A4E9-4501-A85F-C7FD98D33D12");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, "Esercizi Precedenti");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, "BEEE1684-374B-41D5-BF47-BD223C840F3F");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, "F6E2F5DF-1AE3-49DD-A55C-F69ECC1F4EF1");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, "E86F89C6-6FE3-42B1-BCE1-E1BA905A350C");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, "EA089EC3-92AC-4B14-8985-088D2BB76916");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, "BB1838C6-80F2-46E2-87D1-753A7A289610");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, "0CDF27A4-E368-4902-AF7A-4F6962B0E326");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, "EF021017-E1FB-4CAB-A6B8-462F440AE9B2");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, "C8B71998-8D30-44D7-A124-9D1015B934A8");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, "1FC1CBEB-6D52-4258-AAF4-56E6E8F35336");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, "Totale");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, "D825D7C7-BAA4-4DAB-9D3E-191FC4A2475D");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, "22BBA91F-3361-4840-8371-ED5D28163768");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, "A52850C7-86BD-469A-9AC6-EF3DE0186018");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, "D8DADDA7-23DE-4983-85C9-9DEF56981213");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, "Variazioni Cassa Pre");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, "B615E4E6-5686-4C12-92B2-68AF7E135157");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, "Variazioni Cassa Ese");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, "E36D3B28-7396-4D92-BD19-FA4BD3FC6151");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, "Variazioni Cassa Tot");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, "FD99FCC5-FE7B-4788-ADE7-7A1347834F82");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, "Variazioni Cassa Pre 1");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, "0B4A4948-4037-482F-9B98-1D3EC7AFA7C5");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, "Variazioni Cassa Ese 1");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, "C4E9F0CD-E909-44CC-93EE-3850858D9882");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, "Variazioni Cassa Tot 1");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, "687EF255-4F0A-4E73-B3E0-1521CBF6958B");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, "69904EE8-3EE9-481D-9912-9965EE6DFD39");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, "50277673-C53B-4594-9AA9-7891BE1B97DD");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, "071479EE-8EB1-4DD5-A614-1ACD52013610");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, "7513E601-F67C-4E61-98E1-9379F210CE9A");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, "40DE76C0-6850-418B-9999-1F5B0388F8DE");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, MyGlb.VIS_STATICBUTTON);
    PAN_CASSA.SetImage(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, 0, "info.gif", false);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, "25329A13-B1D3-47F5-881F-0F9B27AF61DA");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, "Totale");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, "75EEA6E8-53A6-448B-9243-7493141F276E");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, "Esercizio");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, "6E5E3261-E49D-4C68-BD16-FD17C93BF4F0");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, "Esercizi Precedenti");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, "4DE53B44-EE58-4D19-8BC9-621D7FD1FDCE");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, "B97B41FB-B2DB-4229-946F-911AE2B1C726");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, "Emessi");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, MyGlb.VIS_VUOTOGRASSET);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, "E5F6E7FD-C486-405F-9D34-4117603754B1");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, "Riscossi");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, MyGlb.VIS_VUOTOGRASSET);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, "D293900E-2C1C-4FCE-8E94-FB5E9BE8BBC2");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, "Competenza Ord");
    PAN_CASSA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.VIS_NORFIECF4IMP);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, "77C4A9D3-6761-45F8-A138-98286F863AF6");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, "Emessi");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, MyGlb.VIS_VUOTOGRASSET);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, "0A027BF1-ED9F-4098-8782-A53658A7128C");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, "Riscossi");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, MyGlb.VIS_VUOTOGRASSET);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, "8D250371-D593-4AD8-833E-328B4BF0D6FF");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, "Emessi");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, MyGlb.VIS_VUOTOGRASSET);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, "EF9FDB59-8C24-4FD7-8184-503C04C582CC");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, "Pagati");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, MyGlb.VIS_VUOTOGRASSET);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, "4D838982-832F-4190-BD82-7F4B22EB4A0F");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, "Saldo");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, "A3AD6218-E1FB-459B-92D7-054124488865");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, "1ADF78C7-5B40-46EB-A3FE-4975A8328DFF");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, "");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, MyGlb.VIS_CAMPTOTADISA);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CASSA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, "311D8DB4-57A7-4830-B0C6-24F4BA7E712F");
    PAN_CASSA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, "Saldo Finale");
    PAN_CASSA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, MyGlb.VIS_VUOTONORMALE);
    PAN_CASSA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_CASSA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_LIST, 76);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_LIST, "Saldo Ini Cass");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_FORM, 180, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_FORM, 76);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINICASS, MyGlb.PANEL_FORM, "Sal. Ini Cass");
    PAN_CASSA.SetFieldPage(PFL_CASSA_SALDOINICASS, -1, -1);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_SALDOINICASS, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_SALDOINICASS, PPQRY_VISTOTCASFI1, "NVL(MAX(A.SALDO_INI_CASSA), 0)", "RECSALINICAS", 2, 19, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, MyGlb.PANEL_LIST, 128, 20, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, MyGlb.PANEL_FORM, 108, 4, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDINIZ, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABESALDINIZ, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABESALDINIZ, -1, "", "LABESALDINIZ", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_LIST, 72);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_LIST, "Saldo Ini Pag");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_FORM, 340, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_FORM, 72);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOINIPAG, MyGlb.PANEL_FORM, "Sal. Ini Pag");
    PAN_CASSA.SetFieldPage(PFL_CASSA_SALDOINIPAG, -1, -1);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_SALDOINIPAG, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_SALDOINIPAG, PPQRY_VISTOTCASFI1, "NVL(MAX(A.SALDO_INI_TESORERIA), 0)", "RECSALINIPAG", 2, 19, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_LIST, 132);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_LIST, "Tot. Mand Pag Esercizio");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_FORM, 340, 104, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_FORM, 132);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANPAGESE, MyGlb.PANEL_FORM, "Tot. Mnd. Pag Eserc.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTMANPAGESE, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_TOTMANPAGESE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTMANPAGESE, PPQRY_VISTOTCASFI1, "NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_COMP')), 0), 0)", "RECTOTMAPAES", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_LIST, 148);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_LIST, "Tot. Mnd. Emes. Esercizio");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_FORM, 176, 104, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_FORM, 148);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTMANEMEESE, MyGlb.PANEL_FORM, "Tot. Mnd. Emes. Esercizio");
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTMANEMEESE, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_TOTMANEMEESE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTMANEMEESE, PPQRY_VISTOTCASFI1, "NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_COMP')), 0), 0)", "RECTOTMAEMES", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_LIST, 68);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_LIST, "Pag Residuo");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_FORM, 340, 56, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_FORM, 68);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PAGRESIDUO, MyGlb.PANEL_FORM, "Pag Res.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_PAGRESIDUO, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_PAGRESIDUO, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_PAGRESIDUO, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_RES')), 0)", "RECORPAGRESI", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_LIST, 92);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_LIST, "Pag Competenza");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_FORM, 340, 80, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_FORM, 92);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PAGCOMPETENZ, MyGlb.PANEL_FORM, "Pag Compet.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_PAGCOMPETENZ, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_PAGCOMPETENZ, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_PAGCOMPETENZ, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_COMP')), 0)", "RECORPAGCOMP", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_LIST, 76);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_LIST, "Pagame Prece");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_FORM, 340, 128, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_FORM, 76);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_PAGAMEPRECE, MyGlb.PANEL_FORM, "Pag. Prece");
    PAN_CASSA.SetFieldPage(PFL_CASSA_PAGAMEPRECE, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_PAGAMEPRECE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_PAGAMEPRECE, PPQRY_VISTOTCASFI1, "NVL(MAX(A.PAGAMENTI_PREC), 0)", "RECOPAGAPREC", 2, 19, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_LIST, 64);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_LIST, "Mand Prece");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_FORM, 176, 128, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_FORM, 64);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_MANDPRECE, MyGlb.PANEL_FORM, "Mnd. Pr.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_MANDPRECE, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_MANDPRECE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_MANDPRECE, PPQRY_VISTOTCASFI1, "NVL(MAX(A.MANDATI_PREC), 0)", "RECOMANDPREC", 2, 19, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_LIST, 48);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_LIST, "Residuo Mand");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_FORM, 176, 56, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_FORM, 48);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOMAND, MyGlb.PANEL_FORM, "Res. M.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_RESIDUOMAND, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_RESIDUOMAND, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_RESIDUOMAND, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_RES')), 0)", "RECORESIMAND", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_LIST, 68);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_LIST, "Competenza Mand");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_FORM, 176, 80, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_FORM, 68);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENMAND, MyGlb.PANEL_FORM, "Cmp. Mnd.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_COMPETENMAND, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_COMPETENMAND, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_COMPETENMAND, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_COMP')), 0)", "RECOCOMPMAND", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, MyGlb.PANEL_LIST, 152, 44, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, MyGlb.PANEL_FORM, 120, 152, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE2, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELTOTALE2, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELTOTALE2, -1, "", "LABELTOTALE2", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, MyGlb.PANEL_LIST, 144, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, MyGlb.PANEL_FORM, 8, 128, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE2, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABEESERPRE2, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABEESERPRE2, -1, "", "LABEESERPRE2", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, MyGlb.PANEL_LIST, 136, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, MyGlb.PANEL_FORM, 76, 104, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESE1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABETOTAESE1, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABETOTAESE1, -1, "", "LABETOTAESE1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, MyGlb.PANEL_LIST, 128, 20, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, MyGlb.PANEL_FORM, 92, 80, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPET1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELCOMPET1, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELCOMPET1, -1, "", "LABELCOMPET1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, MyGlb.PANEL_LIST, 120, 12, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, MyGlb.PANEL_FORM, 116, 56, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDU1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELRESIDU1, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELRESIDU1, -1, "", "LABELRESIDU1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, MyGlb.PANEL_LIST, 204, 144, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, MyGlb.PANEL_FORM, 176, 152, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDEMES, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTAMANDEMES, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTAMANDEMES, -1, "", "TOTAMANDEMES", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, MyGlb.PANEL_LIST, 212, 152, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, MyGlb.PANEL_FORM, 340, 152, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAMANDPAGA, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTAMANDPAGA, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTAMANDPAGA, -1, "", "TOTAMANDPAGA", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, MyGlb.PANEL_LIST, 316, 44, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, MyGlb.PANEL_FORM, 284, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRMAEMAREFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRMAEMAREFI, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRMAEMAREFI, -1, "", "APRMAEMAREFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, MyGlb.PANEL_LIST, 324, 52, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, MyGlb.PANEL_FORM, 284, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APMAEMDICOFI, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APMAEMDICOFI, -1, "", "APMAEMDICOFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, MyGlb.PANEL_LIST, 332, 60, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, MyGlb.PANEL_FORM, 284, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APMAEMESPRFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APMAEMESPRFI, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APMAEMESPRFI, -1, "", "APMAEMESPRFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, MyGlb.PANEL_LIST, 324, 52, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, MyGlb.PANEL_FORM, 448, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGARESFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRPAGARESFI, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRPAGARESFI, -1, "", "APRPAGARESFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, MyGlb.PANEL_LIST, 332, 60, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, MyGlb.PANEL_FORM, 448, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRPAGDICOFI, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRPAGDICOFI, -1, "", "APRPAGDICOFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, MyGlb.PANEL_LIST, 340, 68, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, MyGlb.PANEL_FORM, 448, 132, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRPAGESPRFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRPAGESPRFI, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRPAGESPRFI, -1, "", "APRPAGESPRFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, MyGlb.PANEL_LIST, 480, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, MyGlb.PANEL_FORM, 544, 164, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_NEWPANELABE2, -1, GRP_CASSA_MANDATI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_LIST, 132);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_LIST, "Tot Ord Riscossi Esercizio");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_FORM, 340, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_FORM, 132);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDRISESE, MyGlb.PANEL_FORM, "Tot Ord Risc. Esercizio");
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTORDRISESE, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_TOTORDRISESE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTORDRISESE, PPQRY_VISTOTCASFI1, "NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_COMP')), 0), 0)", "RECTOTORRIES", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_LIST, 124);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_LIST, "Tot Ord Emessi Esercizio");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_FORM, 176, 256, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_FORM, 124);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_TOTORDEMEESE, MyGlb.PANEL_FORM, "Tot Ord Emes. Eserc.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTORDEMEESE, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_TOTORDEMEESE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTORDEMEESE, PPQRY_VISTOTCASFI1, "NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_COMP')), 0), 0)", "RECTOTOREMES", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_LIST, 48);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_LIST, "Inc Prec");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_FORM, 340, 280, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_FORM, 48);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INCPREC, MyGlb.PANEL_FORM, "Inc Prc.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_INCPREC, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_INCPREC, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_INCPREC, PPQRY_VISTOTCASFI1, "NVL(MAX(A.INCASSI_PREC), 0)", "RECORINCPREC", 2, 19, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_LIST, 44);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_LIST, "Inc Res");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_FORM, 340, 210, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_FORM, 44);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INCRES, MyGlb.PANEL_FORM, "In. Rs.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_INCRES, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_INCRES, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_INCRES, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_RES')), 0)", "RECORDINCRES", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_LIST, 88);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_LIST, "Inc Competenza");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_FORM, 340, 234, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_FORM, 88);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_INCCOMPETENZ, MyGlb.PANEL_FORM, "Inc Compet.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_INCCOMPETENZ, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_INCCOMPETENZ, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_INCCOMPETENZ, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_COMP')), 0)", "RECORINCCOMP", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_LIST, 52);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_LIST, "Ord Prec");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_FORM, 176, 279, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_FORM, 52);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_ORDPREC, MyGlb.PANEL_FORM, "Ord Prc.");
    PAN_CASSA.SetFieldPage(PFL_CASSA_ORDPREC, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_ORDPREC, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_ORDPREC, PPQRY_VISTOTCASFI1, "NVL(MAX(A.ORDINATIVI_PREC), 0)", "RECORORDPREC", 2, 19, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_LIST, 68);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_LIST, "Residuo Ord");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_FORM, 176, 208, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_FORM, 68);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_RESIDUOORD, MyGlb.PANEL_FORM, "Res. Ord");
    PAN_CASSA.SetFieldPage(PFL_CASSA_RESIDUOORD, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_RESIDUOORD, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_RESIDUOORD, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_RES')), 0)", "RECORRESIORD", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, MyGlb.PANEL_LIST, 112, 4, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, MyGlb.PANEL_FORM, 116, 208, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELRESIDUI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELRESIDUI, -1, "", "LABELRESIDUI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, MyGlb.PANEL_LIST, 120, 12, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, MyGlb.PANEL_FORM, 92, 232, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELCOMPETE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELCOMPETE, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELCOMPETE, -1, "", "LABELCOMPETE", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, MyGlb.PANEL_LIST, 128, 20, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, MyGlb.PANEL_FORM, 76, 256, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABETOTAESER, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABETOTAESER, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABETOTAESER, -1, "", "LABETOTAESER", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, MyGlb.PANEL_LIST, 136, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, MyGlb.PANEL_FORM, 8, 280, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPREC, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABEESERPREC, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABEESERPREC, -1, "", "LABEESERPREC", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, MyGlb.PANEL_LIST, 308, 36, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, MyGlb.PANEL_FORM, 284, 212, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APROREMAREFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APROREMAREFI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APROREMAREFI, -1, "", "APROREMAREFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, MyGlb.PANEL_LIST, 316, 44, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, MyGlb.PANEL_FORM, 284, 236, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APOREMDICOFI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APOREMDICOFI, -1, "", "APOREMDICOFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, MyGlb.PANEL_LIST, 324, 52, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, MyGlb.PANEL_FORM, 448, 212, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISARESFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRRISARESFI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRRISARESFI, -1, "", "APRRISARESFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, MyGlb.PANEL_LIST, 340, 68, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, MyGlb.PANEL_FORM, 448, 236, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISDICOFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRRISDICOFI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRRISDICOFI, -1, "", "APRRISDICOFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, MyGlb.PANEL_LIST, 332, 60, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, MyGlb.PANEL_FORM, 284, 284, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APOREMESPRFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APOREMESPRFI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APOREMESPRFI, -1, "", "APOREMESPRFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, MyGlb.PANEL_LIST, 348, 76, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, MyGlb.PANEL_FORM, 448, 284, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRRISESPRFI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRRISESPRFI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRRISESPRFI, -1, "", "APRRISESPRFI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, MyGlb.PANEL_LIST, 204, 144, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, MyGlb.PANEL_FORM, 340, 304, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIRISC, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTAORDIRISC, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTAORDIRISC, -1, "", "TOTAORDIRISC", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, MyGlb.PANEL_LIST, 196, 136, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, MyGlb.PANEL_FORM, 176, 304, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_TOTAORDIEMES, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_TOTAORDIEMES, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_TOTAORDIEMES, -1, "", "TOTAORDIEMES", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, MyGlb.PANEL_LIST, 144, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, MyGlb.PANEL_FORM, 120, 304, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELTOTALE, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELTOTALE, -1, "", "LABELTOTALE", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, MyGlb.PANEL_LIST, 548, 344, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, MyGlb.PANEL_FORM, 544, 348, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_NEWPANELABE3, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, MyGlb.PANEL_LIST, 212, 152, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, MyGlb.PANEL_FORM, 340, 340, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDORISCOSS, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_SALDORISCOSS, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_SALDORISCOSS, -1, "", "SALDORISCOSS", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, MyGlb.PANEL_LIST, 204, 144, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, MyGlb.PANEL_FORM, 176, 340, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDOEMESSI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_SALDOEMESSI, -1, GRP_CASSA_ORDINATIVI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_SALDOEMESSI, -1, "", "SALDOEMESSI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_LIST, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_LIST, "Variazioni Cassa Pre");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_FORM, 176, 394, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_FORM, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSPRE, MyGlb.PANEL_FORM, "Variaz. Cassa Pre");
    PAN_CASSA.SetFieldPage(PFL_CASSA_VARIACASSPRE, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_VARIACASSPRE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_VARIACASSPRE, PPQRY_VISTOTCASFI1, "CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC')", "RECVARCASPRE", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_LIST, 108);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_LIST, "Variazioni Cassa Ese");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_FORM, 176, 416, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_FORM, 108);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSESE, MyGlb.PANEL_FORM, "Variaz. Cassa Ese");
    PAN_CASSA.SetFieldPage(PFL_CASSA_VARIACASSESE, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_VARIACASSESE, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_VARIACASSESE, PPQRY_VISTOTCASFI1, "CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE')", "RECVARCASESE", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_LIST, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_LIST, "Variazioni Cassa Tot");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_FORM, 176, 440, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_FORM, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARIACASSTOT, MyGlb.PANEL_FORM, "Variaz. Cassa Tot");
    PAN_CASSA.SetFieldPage(PFL_CASSA_VARIACASSTOT, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_VARIACASSTOT, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_VARIACASSTOT, PPQRY_VISTOTCASFI1, "CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC') + CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE')", "RECVARCASTOT", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_LIST, 8, 44, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_LIST, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_LIST, "Variazioni Cassa Pre 1");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_FORM, 340, 394, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_FORM, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSPRE1, MyGlb.PANEL_FORM, "Variaz. Cas. Pre 1");
    PAN_CASSA.SetFieldPage(PFL_CASSA_VARICASSPRE1, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_VARICASSPRE1, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_VARICASSPRE1, PPQRY_VISTOTCASFI1, "CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC')", "RECVARCASPRE", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_LIST, 8, 44, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_LIST, 108);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_LIST, "Variazioni Cassa Ese 1");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_FORM, 340, 416, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_FORM, 108);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSESE1, MyGlb.PANEL_FORM, "Variaz. Cas. Ese 1");
    PAN_CASSA.SetFieldPage(PFL_CASSA_VARICASSESE1, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_VARICASSESE1, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_VARICASSESE1, PPQRY_VISTOTCASFI1, "CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE')", "RECVARCASESE", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_LIST, 8, 44, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_LIST, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_LIST, "Variazioni Cassa Tot 1");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_FORM, 340, 440, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_FORM, 104);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_VARICASSTOT1, MyGlb.PANEL_FORM, "Variaz. Cas. Tot 1");
    PAN_CASSA.SetFieldPage(PFL_CASSA_VARICASSTOT1, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_VARICASSTOT1, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_VARICASSTOT1, PPQRY_VISTOTCASFI1, "CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC') + CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE')", "RECVARCASTOT", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, MyGlb.PANEL_LIST, 328, 48, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, MyGlb.PANEL_FORM, 448, 444, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIRISC, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRIVARIRISC, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRIVARIRISC, -1, "", "APRIVARIRISC", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, MyGlb.PANEL_LIST, 320, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, MyGlb.PANEL_FORM, 284, 444, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRIVARIEMES, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRIVARIEMES, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRIVARIEMES, -1, "", "APRIVARIEMES", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, MyGlb.PANEL_LIST, 320, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, MyGlb.PANEL_FORM, 448, 420, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESERIS, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRVARESERIS, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRVARESERIS, -1, "", "APRVARESERIS", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, MyGlb.PANEL_LIST, 312, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, MyGlb.PANEL_FORM, 284, 420, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARESEEME, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRVARESEEME, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRVARESEEME, -1, "", "APRVARESEEME", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, MyGlb.PANEL_LIST, 312, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, MyGlb.PANEL_FORM, 448, 396, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPRERIS, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRVARPRERIS, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRVARPRERIS, -1, "", "APRVARPRERIS", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, MyGlb.PANEL_LIST, 304, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, MyGlb.PANEL_FORM, 284, 396, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_APRVARPREEME, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_APRVARPREEME, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_APRVARPREEME, -1, "", "APRVARPREEME", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, MyGlb.PANEL_LIST, 108, 20, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, MyGlb.PANEL_FORM, 120, 440, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELTOTALE1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELTOTALE1, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELTOTALE1, -1, "", "LABELTOTALE1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, MyGlb.PANEL_LIST, 100, 12, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, MyGlb.PANEL_FORM, 108, 416, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELESERCIZ, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELESERCIZ, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELESERCIZ, -1, "", "LABELESERCIZ", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, MyGlb.PANEL_LIST, 92, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, MyGlb.PANEL_FORM, 8, 392, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABEESERPRE1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABEESERPRE1, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABEESERPRE1, -1, "", "LABEESERPRE1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, MyGlb.PANEL_LIST, 552, 480, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, MyGlb.PANEL_FORM, 544, 484, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_NEWPANELABE1, -1, GRP_CASSA_VARIAZIONI);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, MyGlb.PANEL_LIST, 20, 20, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, MyGlb.PANEL_FORM, 176, 184, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELEMESSI, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELEMESSI, -1, "", "LABELEMESSI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, MyGlb.PANEL_LIST, 28, 28, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, MyGlb.PANEL_FORM, 340, 184, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOSS, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELRISCOSS, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELRISCOSS, -1, "", "LABELRISCOSS", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_LIST, 92);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_LIST, "Competenza Ord");
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_FORM, 176, 232, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_FORM, 92);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSA_COMPETENZORD, MyGlb.PANEL_FORM, "Compet. Ord");
    PAN_CASSA.SetFieldPage(PFL_CASSA_COMPETENZORD, -1, -1);
    PAN_CASSA.SetFieldUnbound(PFL_CASSA_COMPETENZORD, true);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_COMPETENZORD, PPQRY_VISTOTCASFI1, "NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_COMP')), 0)", "RECORCOMPORD", 3, 28, 6, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, MyGlb.PANEL_LIST, 36, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, MyGlb.PANEL_FORM, 176, 368, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELEMESSI1, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELEMESSI1, -1, "", "LABELEMESSI1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, MyGlb.PANEL_LIST, 28, 20, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, MyGlb.PANEL_FORM, 344, 368, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELRISCOS1, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELRISCOS1, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELRISCOS1, -1, "", "LABELRISCOS1", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, MyGlb.PANEL_LIST, 44, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, MyGlb.PANEL_FORM, 176, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELEMESSI2, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELEMESSI2, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELEMESSI2, -1, "", "LABELEMESSI2", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, MyGlb.PANEL_LIST, 36, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, MyGlb.PANEL_FORM, 340, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELPAGATI, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELPAGATI, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELPAGATI, -1, "", "LABELPAGATI", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, MyGlb.PANEL_LIST, 136, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, MyGlb.PANEL_FORM, 124, 340, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABELSALDO, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABELSALDO, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABELSALDO, -1, "", "LABELSALDO", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, MyGlb.PANEL_LIST, 212, 152, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, MyGlb.PANEL_FORM, 176, 476, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINAEMES, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_SALDFINAEMES, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_SALDFINAEMES, -1, "", "SALDFINAEMES", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, MyGlb.PANEL_LIST, 220, 160, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, MyGlb.PANEL_FORM, 340, 476, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_SALDFINARISC, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_SALDFINARISC, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_SALDFINARISC, -1, "", "SALDFINARISC", 0, 0, 0, -13997);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, MyGlb.PANEL_LIST, 144, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, MyGlb.PANEL_LIST, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, MyGlb.PANEL_LIST, 1);
    PAN_CASSA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, MyGlb.PANEL_FORM, 92, 476, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, MyGlb.PANEL_FORM, 0);
    PAN_CASSA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSA_LABESALDFINA, MyGlb.PANEL_FORM, 1);
    PAN_CASSA.SetFieldPage(PFL_CASSA_LABESALDFINA, -1, -1);
    PAN_CASSA.SetFieldPanel(PFL_CASSA_LABESALDFINA, -1, "", "LABESALDFINA", 0, 0, 0, -13997);
  }

  private void PAN_CASSA_InitQueries()
  {
    StringBuffer SQL;

    PAN_CASSA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CASSA.SetIMDB(IMDB, "PQRY_VISTOTCASFI1", true);
    PAN_CASSA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(MAX(A.SALDO_INI_CASSA), 0) as RECSALINICAS, ");
    SQL.append("  NVL(MAX(A.SALDO_INI_TESORERIA), 0) as RECSALINIPAG, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_COMP')), 0) as RECOCOMPMAND, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_RES')), 0) as RECORESIMAND, ");
    SQL.append("  NVL(MAX(A.MANDATI_PREC), 0) as RECOMANDPREC, ");
    SQL.append("  NVL(MAX(A.PAGAMENTI_PREC), 0) as RECOPAGAPREC, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_COMP')), 0) as RECORPAGCOMP, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_RES')), 0) as RECORPAGRESI, ");
    SQL.append("  NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'MAN_COMP')), 0), 0) as RECTOTMAEMES, ");
    SQL.append("  NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'PAG_COMP')), 0), 0) as RECTOTMAPAES, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_COMP')), 0) as RECORCOMPORD, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_RES')), 0) as RECORRESIORD, ");
    SQL.append("  NVL(MAX(A.ORDINATIVI_PREC), 0) as RECORORDPREC, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_COMP')), 0) as RECORINCCOMP, ");
    SQL.append("  NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_RES')), 0) as RECORDINCRES, ");
    SQL.append("  NVL(MAX(A.INCASSI_PREC), 0) as RECORINCPREC, ");
    SQL.append("  NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'ORD_COMP')), 0), 0) as RECTOTOREMES, ");
    SQL.append("  NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_RES')), 0), 0) + NVL(NVL(MAX(CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'INC_COMP')), 0), 0) as RECTOTORRIES, ");
    SQL.append("  CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC') as RECVARCASPRE, ");
    SQL.append("  CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE') as RECVARCASESE, ");
    SQL.append("  CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC') + CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE') as RECVARCASTOT ");
    PAN_CASSA.SetQuery(PPQRY_VISTOTCASFI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_TOT_CASSA_FIN A ");
    PAN_CASSA.SetQuery(PPQRY_VISTOTCASFI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~PQRY_PARAMETRI325.PARACODIFINA~~) ");
    PAN_CASSA.SetQuery(PPQRY_VISTOTCASFI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC'), ");
    SQL.append("  CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE'), ");
    SQL.append("  CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_PREC') + CF4WEB_GET_IMPORTI_FIN(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~PQRY_PARAMETRI325.PARACODIFINA~~,~~PQRY_PARAMETRI325.PARAMDATAAL~~,'VAR_ESE') ");
    PAN_CASSA.SetQuery(PPQRY_VISTOTCASFI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CASSA.SetQuery(PPQRY_VISTOTCASFI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CASSA.SetQuery(PPQRY_VISTOTCASFI1, 5, SQL, -1, "");
    PAN_CASSA.SetQueryDB(PPQRY_VISTOTCASFI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CASSA.SetMasterTable(0, "VISTA_TOT_CASSA_FIN");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CASSA.Status() == 2)
    {
      int oldListQBE = PAN_CASSA.iUseListQBE;
      PAN_CASSA.iUseListQBE = 0;
      PAN_CASSA.PanelCommand(Glb.PCM_SEARCH);
      PAN_CASSA.PanelCommand(Glb.PCM_FIND);
      PAN_CASSA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "6538A967-8459-4EA4-89C2-B49FBFE470E3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, "9DF92C67-E3B7-4A30-AF5A-0D43381BEF73");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "10AA5384-E624-4BB4-B9AE-55571F195A2D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finan.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 4, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_FINANZIAMENT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_FINANZIAMENT, PPQRY_PARAMETRI325, "A.PARACODIFINA", "PARACODIFINA", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 180, 4, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIFINANZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIFINANZ, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 504, 4, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI325, "A.PARAMDATAAL", "PARAMDATAAL", 6, 19, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~PARACODIFINA~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI325", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI325, IMDBDef8.PQRY_PARAMETRI325_RS, IMDBDef1.TBL_PARAMETRI33);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_FINANZIAMENT, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef1.FLD_PARAMETRI33_PARAMDATAAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI33");
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
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CASSA) PAN_CASSA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_ValidateRow(Cancel);
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_ValidateRow(Cancel);
    if (SrcObj == PAN_CASSA) PAN_CASSA_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_DynamicProperties();
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_DynamicProperties();
    if (SrcObj == PAN_CASSA) PAN_CASSA_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CASSA) PAN_CASSA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_AfterFind(CmdFind);
    if (SrcObj == PAN_CASSA) PAN_CASSA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ARCHIVIO) PAN_ARCHIVIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SITUAZIONE) PAN_SITUAZIONE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CASSA) PAN_CASSA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == TAB_INFORMFINANZ) TAB_INFORMFINANZ_Click(PreviousPage, Cancel);
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
