// **********************************************
// Differenze Su Esercizi Successivi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DifferenzeSuEserciziSuccessivi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ENTRATASPESA = 0;

  private static int PPQRY_PARAMETRI591 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_DIFFSUESESUC_GRUPPOCAPITO = 0;
  private static int PFL_DIFFSUESESUC_ESERCIZIO = 1;
  private static int PFL_DIFFSUESESUC_ES = 2;
  private static int PFL_DIFFSUESESUC_CAPITOLO = 3;
  private static int PFL_DIFFSUESESUC_ARTICOLO = 4;
  private static int PFL_DIFFSUESESUC_DESCRIZIONE = 5;
  private static int PFL_DIFFSUESESUC_DESCRIABBREV = 6;
  private static int PFL_DIFFSUESESUC_ANNOTAZIONI = 7;
  private static int PFL_DIFFSUESESUC_APRINOTE = 8;
  private static int PFL_DIFFSUESESUC_CODICESTRUTT = 9;
  private static int PFL_DIFFSUESESUC_CODICEEUROPE = 10;
  private static int PFL_DIFFSUESESUC_ENTSPENONRIC = 11;
  private static int PFL_DIFFSUESESUC_COFOGSUCC = 12;
  private static int PFL_DIFFSUESESUC_IVLIVELLSUCC = 13;
  private static int PFL_DIFFSUESESUC_VLIVELLOSUCC = 14;
  private static int PFL_DIFFSUESESUC_TIPOVINCOLO = 15;
  private static int PFL_DIFFSUESESUC_FLESSIBILITA = 16;
  private static int PFL_DIFFSUESESUC_IVA = 17;
  private static int PFL_DIFFSUESESUC_CENTROCOSTO = 18;
  private static int PFL_DIFFSUESESUC_CONTRIBCOMU = 19;
  private static int PFL_DIFFSUESESUC_FUNZDEL = 20;
  private static int PFL_DIFFSUESESUC_STAMPADESMAN = 21;
  private static int PFL_DIFFSUESESUC_FONDORISCASS = 22;
  private static int PFL_DIFFSUESESUC_FATTORE = 23;
  private static int PFL_DIFFSUESESUC_CENTRO = 24;
  private static int PFL_DIFFSUESESUC_TITOLO = 25;
  private static int PFL_DIFFSUESESUC_CODTERZI = 26;
  private static int PFL_DIFFSUESESUC_CATEGORIA = 27;
  private static int PFL_DIFFSUESESUC_CODINTERVENT = 28;
  private static int PFL_DIFFSUESESUC_FUNZIONE = 29;
  private static int PFL_DIFFSUESESUC_SERVIZIO = 30;
  private static int PFL_DIFFSUESESUC_PROGRAMMA = 31;
  private static int PFL_DIFFSUESESUC_PROGETTO = 32;
  private static int PFL_DIFFSUESESUC_DESCRIZICORR = 33;
  private static int PFL_DIFFSUESESUC_DESCABBRCORR = 34;
  private static int PFL_DIFFSUESESUC_ANNOTAZICORR = 35;
  private static int PFL_DIFFSUESESUC_CODISTRUCORR = 36;
  private static int PFL_DIFFSUESESUC_CODIEUROCORR = 37;
  private static int PFL_DIFFSUESESUC_ENTSPENORICO = 38;
  private static int PFL_DIFFSUESESUC_COFOGCORR = 39;
  private static int PFL_DIFFSUESESUC_IVLIVELLCORR = 40;
  private static int PFL_DIFFSUESESUC_VLIVELLOCORR = 41;
  private static int PFL_DIFFSUESESUC_TIPOVINCCORR = 42;
  private static int PFL_DIFFSUESESUC_FLESSIBICORR = 43;
  private static int PFL_DIFFSUESESUC_IVACORR = 44;
  private static int PFL_DIFFSUESESUC_CENTCOSTCORR = 45;
  private static int PFL_DIFFSUESESUC_CONTCOMUCORR = 46;
  private static int PFL_DIFFSUESESUC_FUNZDELCORR = 47;
  private static int PFL_DIFFSUESESUC_STADESMANCOR = 48;
  private static int PFL_DIFFSUESESUC_FONRISCASCOR = 49;
  private static int PFL_DIFFSUESESUC_FATTORECORR = 50;
  private static int PFL_DIFFSUESESUC_CENTROCORR = 51;
  private static int PFL_DIFFSUESESUC_TITOLOCORR = 52;
  private static int PFL_DIFFSUESESUC_CATEGORICORR = 53;
  private static int PFL_DIFFSUESESUC_CODINTERCORR = 54;
  private static int PFL_DIFFSUESESUC_CODTERZICORR = 55;
  private static int PFL_DIFFSUESESUC_FUNZIONECORR = 56;
  private static int PFL_DIFFSUESESUC_SERVIZIOCORR = 57;
  private static int PFL_DIFFSUESESUC_PROGRAMMCORR = 58;
  private static int PFL_DIFFSUESESUC_PROGETTOCORR = 59;

  private static int PPQRY_CAP30 = 0;


  IDPanel PAN_DIFFSUESESUC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI590(IMDB);
    //
    //
    Init_PQRY_PARAMETRI591(IMDB);
    Init_PQRY_PARAMETRI591_RS(IMDB);
    Init_PQRY_CAP30(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI590(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI590, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI590, "TBL_PARAMETRI590");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI590,IMDBDef3.FLD_PARAMETRI590_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI590,IMDBDef3.FLD_PARAMETRI590_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI590,IMDBDef3.FLD_PARAMETRI590_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI590,IMDBDef3.FLD_PARAMETRI590_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI590,IMDBDef3.FLD_PARAMETRI590_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI590,IMDBDef3.FLD_PARAMETRI590_PARAMARTICOL,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI590, 0);
  }

  private static void Init_PQRY_PARAMETRI591(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI591, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI591, "PQRY_PARAMETRI591");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI591,IMDBDef11.PQSL_PARAMETRI591_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI591,IMDBDef11.PQSL_PARAMETRI591_PARAENTRSPES,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI591, 0);
  }

  private static void Init_PQRY_PARAMETRI591_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI591_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI591_RS, "PQRY_PARAMETRI591_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI591_RS,IMDBDef11.PQSL_PARAMETRI591_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI591_RS,IMDBDef11.PQSL_PARAMETRI591_PARAENTRSPES,5,1,0);
  }

  private static void Init_PQRY_CAP30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAP30, 64);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAP30, "PQRY_CAP30");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_GRUPPOCAPITO, "GRUPPOCAPITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_GRUPPOCAPITO,5,311,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOESERCORR, "RECOESERCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOESERCORR,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOESERSUCC, "RECOESERSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOESERSUCC,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORDESCORR, "RECORDESCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORDESCORR,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORDESSUCC, "RECORDESSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORDESSUCC,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCAPICORR, "RECOCAPICORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCAPICORR,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCAPISUCC, "RECOCAPISUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCAPISUCC,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOARTICORR, "RECOARTICORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOARTICORR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOARTISUCC, "RECOARTISUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOARTISUCC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECODESCCORR, "RECODESCCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECODESCCORR,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECODESCSUCC, "RECODESCSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECODESCSUCC,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECDESABBCOR, "RECDESABBCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECDESABBCOR,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECDESABBSUC, "RECDESABBSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECDESABBSUC,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOANNOCORR, "RECOANNOCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOANNOCORR,5,2000,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOANNOSUCC, "RECOANNOSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOANNOSUCC,5,2000,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_APRINOTE, "APRINOTE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_APRINOTE,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODSTRCOR, "RECCODSTRCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODSTRCOR,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODSTRSUC, "RECCODSTRSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODSTRSUC,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODEURCOR, "RECCODEURCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODEURCOR,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODEURSUC, "RECCODEURSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODEURSUC,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_REENSPNORICO, "REENSPNORICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_REENSPNORICO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_REENSPNORISU, "REENSPNORISU");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_REENSPNORISU,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_COFOGCORR, "COFOGCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_COFOGCORR,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_COFOGSUCC, "COFOGSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_COFOGSUCC,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_IVLIVELLCORR, "IVLIVELLCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_IVLIVELLCORR,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_IVLIVELLSUCC, "IVLIVELLSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_IVLIVELLSUCC,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_VLIVELLOCORR, "VLIVELLOCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_VLIVELLOCORR,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_VLIVELLOSUCC, "VLIVELLOSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_VLIVELLOSUCC,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECTIPVINCOR, "RECTIPVINCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECTIPVINCOR,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECTIPVINSUC, "RECTIPVINSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECTIPVINSUC,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFLESCORR, "RECOFLESCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFLESCORR,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFLESSUCC, "RECOFLESSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFLESSUCC,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORIVACORR, "RECORIVACORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORIVACORR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORIVASUCC, "RECORIVASUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECORIVASUCC,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCENCOSCOR, "RECCENCOSCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCENCOSCOR,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCENCOSSUC, "RECCENCOSSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCENCOSSUC,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCONCOMCOR, "RECCONCOMCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCONCOMCOR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCONCOMSUC, "RECCONCOMSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCONCOMSUC,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFUNDELCOR, "RECFUNDELCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFUNDELCOR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFUNDELSUC, "RECFUNDELSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFUNDELSUC,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECSTADEMACO, "RECSTADEMACO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECSTADEMACO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECSTADEMASU, "RECSTADEMASU");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECSTADEMASU,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFONRICACO, "RECFONRICACO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFONRICACO,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFONRICASU, "RECFONRICASU");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECFONRICASU,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFATTCORR, "RECOFATTCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFATTCORR,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFATTSUCC, "RECOFATTSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFATTSUCC,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCENTCORR, "RECOCENTCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCENTCORR,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCENTSUCC, "RECOCENTSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCENTSUCC,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOTITOCORR, "RECOTITOCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOTITOCORR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOTITOSUCC, "RECOTITOSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOTITOSUCC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODTERCOR, "RECCODTERCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODTERCOR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODTERSUC, "RECCODTERSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODTERSUC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCATECORR, "RECOCATECORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCATECORR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCATESUCC, "RECOCATESUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOCATESUCC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODINTCOR, "RECCODINTCOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODINTCOR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODINTSUC, "RECCODINTSUC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECCODINTSUC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFUNZCORR, "RECOFUNZCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFUNZCORR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFUNZSUCC, "RECOFUNZSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOFUNZSUCC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOSERVCORR, "RECOSERVCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOSERVCORR,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOSERVSUCC, "RECOSERVSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOSERVSUCC,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGCOR1, "RECOPROGCOR1");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGCOR1,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGSUC1, "RECOPROGSUC1");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGSUC1,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGCORR, "RECOPROGCORR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGCORR,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGSUCC, "RECOPROGSUCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP30,IMDBDef11.PQSL_CAP30_RECOPROGSUCC,5,4,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAP30, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DifferenzeSuEserciziSuccessivi(MyWebEntryPoint w, IMDBObj imdb)
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
  public DifferenzeSuEserciziSuccessivi()
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
    FormIdx = MyGlb.FRM_DIFFSUESESUC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7EB928AD-CEAE-48EF-8673-319A26770D57";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 912;
    DesignHeight = 486;
    set_Caption(new IDVariant("Differenze Su Esercizi Successivi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 912;
    Frames[1].Height = 460;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0695652;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 912;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 32;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 912-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F0101345-446A-4DC4-9F3F-374FC2072071");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 112, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
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
    Frames[3].Width = 912;
    Frames[3].Height = 428;
    Frames[3].Caption = "Differenze Su Esercizi Successivi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 428;
    PAN_DIFFSUESESUC = new IDPanel(w, this, 3, "PAN_DIFFSUESESUC");
    Frames[3].Content = PAN_DIFFSUESESUC;
    PAN_DIFFSUESESUC.set_GroupingEnabled(true);
    PAN_DIFFSUESESUC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DIFFSUESESUC.VS = MainFrm.VisualStyleList;
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 912-MyGlb.PAN_OFFS_X, 428-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C417248C-4046-4879-AC0D-01A079BFD3D9");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2496, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DIFFSUESESUC.InitStatus = 2;
    PAN_DIFFSUESESUC_Init();
    PAN_DIFFSUESESUC_InitFields();
    PAN_DIFFSUESESUC_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI590, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DIFFSUESESUC_PARAMETRI591();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DIFFSUESESUC.UpdatePanel(MainFrm);
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
    return (obj instanceof DifferenzeSuEserciziSuccessivi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DifferenzeSuEserciziSuccessivi.class.getName() : (Glb.ClassWithPackage(DifferenzeSuEserciziSuccessivi.class) ? DifferenzeSuEserciziSuccessivi.class.getName().substring(DifferenzeSuEserciziSuccessivi.class.getPackage().getName().length() + 1) : DifferenzeSuEserciziSuccessivi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_PARAMETRI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI591, IMDBDef11.PQSL_PARAMETRI591_PARAENTRSPES, 0).equals((new IDVariant("S")), true))
      {
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeSuEserciziSuccessivi", "ParametriAfterFind", _e);
    }
  }

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
      if (IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).equals((new IDVariant(-1)), true))
      {
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (IDL.NullValue(MainFrm.GESTIOECONOM,(new IDVariant(-1))).equals((new IDVariant(2)), true))
      {
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DIFFSUESESUC.SetFlags (Glb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_PARAMETRI.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAMETRI590, IMDBDef3.FLD_PARAMETRI590_PARAMCAPITOL, 0)))
      {
        PAN_DIFFSUESESUC.set_ShowGroups((new IDVariant(-1)).booleanValue());
        PAN_DIFFSUESESUC.ResetGroupList();
        PAN_DIFFSUESESUC.AddToGroupingList((new IDVariant(PFL_DIFFSUESESUC_GRUPPOCAPITO)).intValue(),(new IDVariant(-1)).booleanValue()); 
        PAN_PARAMETRI.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_PARAMETRI.set_Visible((new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI590, IMDBDef3.FLD_PARAMETRI590_PARAENTRSPES, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_CAPTIOENTRAT = new IDVariant(0,IDVariant.STRING);
        v_CAPTIOENTRAT = (new IDVariant("Entrata non ric."));
        PAN_DIFFSUESESUC.set_Header(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_ENTSPENONRIC, new IDVariant(v_CAPTIOENTRAT).stringValue());
      }
      else
      {
        IDVariant v_CAPTIONSPESA = new IDVariant(0,IDVariant.STRING);
        v_CAPTIONSPESA = (new IDVariant("Spesa non ric."));
        PAN_DIFFSUESESUC.set_Header(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_ENTSPENONRIC, new IDVariant(v_CAPTIONSPESA).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeSuEserciziSuccessivi", "Load", _e);
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
      MainFrm.ErrObj.ProcError ("DifferenzeSuEserciziSuccessivi", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI590, IMDBDef3.FLD_PARAMETRI590_PARAENTRSPES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI590, IMDBDef3.FLD_PARAMETRI590_PARAMCAPITOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI590, IMDBDef3.FLD_PARAMETRI590_PARAMARTICOL, 0, new IDVariant());
  }

  // **********************************************************************
  // Differenze Su Esercizi Successivi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DIFFSUESESUC_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DIFFSUESESUC);
      // 
      // Differenze Su Esercizi Successivi On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaTooltip();
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOESERSUCC, 0))))
      {
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECODESCSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECODESCCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_DESCRIZIONE,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_DESCRIZIONE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECDESABBSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECDESABBCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_DESCRIABBREV,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_DESCRIABBREV,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOANNOSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOANNOCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_ANNOTAZIONI,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_ANNOTAZIONI,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODSTRSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODSTRCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODICESTRUTT,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODICESTRUTT,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODEURSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODEURCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODICEEUROPE,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODICEEUROPE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_REENSPNORISU, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_REENSPNORICO, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_ENTSPENONRIC,new IDVariant(MyGlb.VIS_CHESTYSFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_ENTSPENONRIC,new IDVariant(MyGlb.VIS_CHECKSTYLE).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_COFOGSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_COFOGCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_COFOGSUCC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_COFOGSUCC,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_IVLIVELLSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_IVLIVELLCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_IVLIVELLSUCC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_IVLIVELLSUCC,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_VLIVELLOSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_VLIVELLOCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_VLIVELLOSUCC,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_VLIVELLOSUCC,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECTIPVINSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECTIPVINCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_TIPOVINCOLO,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_TIPOVINCOLO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOFLESSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOFLESCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FLESSIBILITA,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FLESSIBILITA,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECORIVASUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECORIVACORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_IVA,new IDVariant(MyGlb.VIS_CHESTYSFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_IVA,new IDVariant(MyGlb.VIS_CHECKSTYLE).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCENCOSSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCENCOSCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CENTROCOSTO,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CENTROCOSTO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCONCOMSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCONCOMCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CONTRIBCOMU,new IDVariant(MyGlb.VIS_CHESTYSFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CONTRIBCOMU,new IDVariant(MyGlb.VIS_CHECKSTYLE).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECFUNDELSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECFUNDELCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FUNZDEL,new IDVariant(MyGlb.VIS_CHESTYSFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FUNZDEL,new IDVariant(MyGlb.VIS_CHECKSTYLE).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECSTADEMASU, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECSTADEMACO, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_STAMPADESMAN,new IDVariant(MyGlb.VIS_CHESTYSFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_STAMPADESMAN,new IDVariant(MyGlb.VIS_CHECKSTYLE).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECFONRICASU, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECFONRICACO, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FONDORISCASS,new IDVariant(MyGlb.VIS_CHESTYSFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FONDORISCASS,new IDVariant(MyGlb.VIS_CHECKSTYLE).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOFATTSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOFATTCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FATTORE,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FATTORE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOCENTSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOCENTCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CENTRO,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CENTRO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOTITOSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOTITOCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_TITOLO,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_TITOLO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODTERSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODTERCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODTERZI,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODTERZI,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOCATESUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOCATECORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CATEGORIA,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CATEGORIA,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODINTSUC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECCODINTCOR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODINTERVENT,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_CODINTERVENT,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOFUNZSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOFUNZCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FUNZIONE,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_FUNZIONE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOSERVSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOSERVCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_SERVIZIO,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_SERVIZIO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOPROGSUC1, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOPROGCOR1, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_PROGRAMMA,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_PROGRAMMA,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOPROGSUCC, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOPROGCORR, 0), true)!=0)
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_PROGETTO,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_DIFFSUESESUC.set_VisualStyle(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_PROGETTO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeSuEserciziSuccessivi", "DifferenzeSuEserciziSuccessiviOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Setta Tooltip
  // **********************************************************************
  public int SettaTooltip ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tooltip Body
      // Corpo Procedura
      // 
      PAN_DIFFSUESESUC.set_ToolTip(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_DESCRIZIONE,(new IDVariant(PAN_DIFFSUESESUC.FieldText(PFL_DIFFSUESESUC_DESCRIZIONE))).stringValue()); 
      PAN_DIFFSUESESUC.set_ToolTip(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_DESCRIABBREV,(new IDVariant(PAN_DIFFSUESESUC.FieldText(PFL_DIFFSUESESUC_DESCRIABBREV))).stringValue()); 
      PAN_DIFFSUESESUC.set_ToolTip(Glb.OBJ_FIELD,PFL_DIFFSUESESUC_ANNOTAZIONI,(new IDVariant(PAN_DIFFSUESESUC.FieldText(PFL_DIFFSUESESUC_ANNOTAZIONI))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeSuEserciziSuccessivi", "SettaTooltip", _e);
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
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef11.PQRY_CAP30, IMDBDef11.PQSL_CAP30_RECOANNOSUCC, 0), v_ANNOTAZIONI, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DifferenzeSuEserciziSuccessivi", "ApriNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DIFFSUESESUC_PARAMETRI591() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI591_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI590, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI590, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI591_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI591_RS, 0, IMDBDef3.TBL_PARAMETRI590, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI591_RS, 0, 0, IMDBDef3.TBL_PARAMETRI590, IMDBDef3.FLD_PARAMETRI590_PARAENTRSPES, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI590, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI590, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI590, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI591_RS, 0);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DIFFSUESESUC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DIFFSUESESUC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DIFFSUESESUC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DIFFSUESESUC, Cancel);
    // Stub
  }

  private void PAN_DIFFSUESESUC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DIFFSUESESUC_APRINOTE)
    {
      this.IdxPanelActived = this.PAN_DIFFSUESESUC.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DIFFSUESESUC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DIFFSUESESUC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DIFFSUESESUC_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, "3EF5AB8B-27B3-4C2A-B6EF-13CBA499B112");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, "Entrata Spesa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, "Entrata Spesa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, 76, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, "Entrata Spesa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ENTRATASPESA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ENTRATASPESA, PPQRY_PARAMETRI591, "A.PARAENTRSPES", "PARAENTRSPES", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI591", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI591, IMDBDef11.PQRY_PARAMETRI591_RS, IMDBDef3.TBL_PARAMETRI590);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ENTRATASPESA, IMDBDef3.FLD_PARAMETRI590_PARAENTRSPES);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI590");
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

  private void PAN_DIFFSUESESUC_Init()
  {

    PAN_DIFFSUESESUC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DIFFSUESESUC.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DIFFSUESESUC.SetSize(MyGlb.OBJ_FIELD, 60);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, "6579584A-70E0-4846-9AC9-BF548C0DA30D");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, "Gruppo Capitolo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, "42B998C4-C213-4EB3-96D6-0DAE64250C41");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, "Esercizio");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, "7DDC2634-C692-419B-B4D5-D8689DC53787");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, "Parte");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, "519BEF92-EF72-44F6-93BB-6AD695CEA89B");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, "Capitolo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, "3A94C770-B86C-43ED-8202-ED0C5D7F0D72");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, "Articolo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, "2FB7AFD3-B62D-4B8A-9C6A-36F3022430CE");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, "Descrizione");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, "3FC734B3-FB17-4C37-8768-D9415CED05A2");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, "Descrizione Abbreviata");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, "3247F2C9-6933-4724-8633-718A3B3E271A");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, "Note");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, "600FFD4B-94D1-46A2-B147-9FD28AA4D508");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, " ");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.VIS_HYPELINKIMMA);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, "C2CA88AD-1189-4257-B516-28435B099E45");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, "Codice Struttura");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, "9F9A1BCE-FF74-47AB-8EA0-8C420D108BA3");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, "Codice Europeo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, "78A4E228-53C9-41B2-977F-9269FC4B3022");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, "Entrata non ric.");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.VIS_CHECKSTYLE);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, "BA70C99E-8B6A-4D9C-9C40-F586DC5D6957");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, "Cofog");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, "150FEEB9-05EC-4FA9-90F2-58B271C1BB31");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, "IV livello");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, "17AE776E-06AA-4A85-938E-3ED538ACA363");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, "V livello");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.VIS_INTE10NORFIE);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, "9166ACC2-1DA5-4EA1-A1AD-0EE1511726DE");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, "Tipo Vincolo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, "63FA7344-F2D5-4DA0-BAF5-44DCFFEA994A");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, "Flessibilità");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, "0BBC7978-EB72-4D2A-9F38-DE0ADD0B5BD8");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, "Ril. IVA");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.VIS_CHECKSTYLE);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, "FDEA1916-15DA-4237-B678-D7C82136F736");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, "Centro di Costo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, "37C233FC-F8CE-4B29-81FD-DE5493ECE3F3");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, "Contr. Comun.");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.VIS_CHECKSTYLE);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, "FCD990E2-BE6E-413F-B0AF-686195879B25");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, "Funz. Del.");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.VIS_CHECKSTYLE);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, "F15A9232-B58F-4967-9337-4662D7AA9BB0");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, "No Desc. Mandato");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.VIS_CHECKSTYLE);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, "C8240D1B-212D-45C0-84C5-E4C50B1EBCBD");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, "Fondo Ris. Cassa");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.VIS_CHECKSTYLE);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, "76DCAD5B-593D-437C-8E7A-5AB9AC68C7FA");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, "Fattore");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, "C909367C-C96E-45FB-BA6A-002E3C7FD6EB");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, "Centro");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, "6AB2730E-1EA3-40D0-9427-20539A0535D8");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, "Titolo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, "41DC2D52-C8C9-4D2A-8B00-F36A09F4EB84");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, "Cod. Terzi");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, "8966B862-8F69-4BE8-8DB2-8A379D2C524D");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, "Categoria");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, "4EE85E43-7871-4049-8950-50E404715D3E");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, "Cod. Intervento");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, "075EFF9A-ABBD-4F63-9A4F-CAA87E1DA8CD");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, "Funzione");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, "8E671EDC-EBE7-457F-A7F3-EFC9A320C21A");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, "Servizio");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, "B3CEFBBB-B72C-4359-973A-24B5CFB674F1");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, "Programma");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, "AF36A6C1-3F31-48C1-B3AE-E79F6E946149");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, "Obiettivo Operativo");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, "B1354CCA-30CD-42E5-8411-5A113C976309");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, "DESCRIZIONE Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, "CF46100C-FF82-4DCA-BDAC-033B19E7BF90");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, "DESCRIZIONE ABBREVIATA Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, "23E9289A-2C7A-4427-9C98-8B3CB84763E9");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, "ANNOTAZIONI Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, "3282C497-5107-4B77-89D4-C2DC5732EF99");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, "CODICE STRUTTURA Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, "4FED472C-D05F-4C70-BCE5-A8DCC947DC52");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, "CODICE EUROPEO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, "88ABCF16-7CD2-4AA2-A608-02375BBF58E0");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, "ENTRATA SPESA NON RIC Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, "505FAF15-0713-4C79-921D-3D3FBEBC5FAD");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, "COFOG Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, "D60131F9-8A77-40E2-96A9-584DB8D8F027");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, "IV LIVELLO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, "187CB521-CAA4-42A8-A079-841F7A3EFF8F");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, "V LIVELLO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, "EA8031EA-2BE8-41B6-BC05-492499800F61");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, "TIPO VINCOLO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, "4EEF8384-1F8B-4519-90D1-0B60DBF37004");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, "FLESSIBILITA Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, "74940DF4-77B6-4343-ABF7-FC279C9740F0");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, "IVA Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, "B34BDAD6-6EC5-4E79-88A2-3FBEFE6A5969");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, "CENTRO COSTO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, "B73DF990-162C-4FDA-B0AE-1F2D5E0D605C");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, "CONTRIB COMU Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, "C8B0AE4A-D51B-41B7-B446-BCE951BD3607");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, "FUNZ DEL Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, "F2DFB0B3-81B3-49F3-B70B-797805684012");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, "STAMPA DES MAN Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, "723125E4-B705-440A-AF73-88823EA4796D");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, "FONDO RIS CASSA Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, "AD2B15F2-AF6F-469C-B1EA-D153C517DCAD");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, "FATTORE Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, "3ABD150A-8556-46F6-BBD0-D2E3BC0AD6BE");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, "CENTRO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, "8CCC7727-DEE4-4587-B2EF-B5B09E17D382");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, "TITOLO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, "036371CC-FE0E-4D0A-B4E8-D1314E228A20");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, "CATEGORIA Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, "5637110F-C166-4C7F-8316-42118F24795A");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, "COD INTERVENTO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, "BE9BB1F6-3A8B-43AB-AF98-344509D76BFA");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, "COD TERZI Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, "0680F487-CA52-4409-A25E-214F0F8A4B25");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, "FUNZIONE Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, "F1448350-987C-4BEE-BC29-3F9894751403");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, "SERVIZIO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, "7DCC8260-BBB1-4FEA-BDC5-EA0E498457AD");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, "PROGRAMMA Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_DIFFSUESESUC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, "75F8A4BB-DF47-4013-A81E-294BD680B179");
    PAN_DIFFSUESESUC.set_Header(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, "PROGETTO Corr");
    PAN_DIFFSUESESUC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, "");
    PAN_DIFFSUESESUC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.VIS_NORMFIELPADR);
    PAN_DIFFSUESESUC.SetFlags(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DIFFSUESESUC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_LIST, 100);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_LIST, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_LIST, "Gruppo Capitolo");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_FORM, 4, 784, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_FORM, 100);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_FORM, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_GRUPPOCAPITO, MyGlb.PANEL_FORM, "Gruppo Capitolo");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_GRUPPOCAPITO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_GRUPPOCAPITO, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_GRUPPOCAPITO, PPQRY_CAP30, "'Capitolo di ' || DECODE(A.E_S, 'E', 'Entrata', 'S', 'Spesa') || ' ' || LPAD(TO_CHAR ( A.CAPITOLO ), 16, SUBSTR(' ', 1, 1)) || '/' || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR(' ', 1, 1))", "GRUPPOCAPITO", 5, 311, 0, -13999);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 136, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_ESERCIZIO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_ESERCIZIO, PPQRY_CAP30, "B.ESERCIZIO", "RECOESERSUCC", 1, 4, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_LIST, 60, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_LIST, 24);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_FORM, 4, 136, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_FORM, 24);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ES, MyGlb.PANEL_FORM, "Pr.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_ES, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_ES, PPQRY_CAP30, "B.E_S", "RECORDESSUCC", 5, 1, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_LIST, 104, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_LIST, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CAPITOLO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CAPITOLO, PPQRY_CAP30, "B.CAPITOLO", "RECOCAPISUCC", 3, 16, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_LIST, 220, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_ARTICOLO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_ARTICOLO, PPQRY_CAP30, "B.ARTICOLO", "RECOARTISUCC", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_LIST, 252, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 436, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_DESCRIZIONE, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_DESCRIZIONE, PPQRY_CAP30, "B.DESCRIZIONE", "RECODESCSUCC", 5, 140, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_LIST, 480, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_LIST, 144);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_LIST, "Descrizione Abbreviata");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_FORM, 4, 112, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_FORM, 144);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIABBREV, MyGlb.PANEL_FORM, "Descrizione Abbreviata");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_DESCRIABBREV, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_DESCRIABBREV, PPQRY_CAP30, "B.DESCRIZIONE_ABBREVIATA", "RECDESABBSUC", 5, 40, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_LIST, 664, 36, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_LIST, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_LIST, "Note");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_FORM, 4, 232, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_FORM, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_FORM, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZIONI, MyGlb.PANEL_FORM, "Note");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_ANNOTAZIONI, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_ANNOTAZIONI, PPQRY_CAP30, "B.ANNOTAZIONI", "RECOANNOSUCC", 5, 2000, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_LIST, 756, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_LIST, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_LIST, " ");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_FORM, 4, 760, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_APRINOTE, MyGlb.PANEL_FORM, " ");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_APRINOTE, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_APRINOTE, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_APRINOTE, PPQRY_CAP30, "DECODE(B.ANNOTAZIONI, NULL, 'N', 'P')", "APRINOTE", 5, 99, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_APRINOTE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_LIST, 780, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_LIST, 120);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_LIST, "Codice Struttura");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_FORM, 4, 136, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_FORM, 120);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICESTRUTT, MyGlb.PANEL_FORM, "Codice Struttura");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODICESTRUTT, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODICESTRUTT, PPQRY_CAP30, "B.CODICE_STRUTTURA", "RECCODSTRSUC", 5, 10, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_LIST, 844, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_LIST, "Codice Europeo");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 280, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODICEEUROPE, MyGlb.PANEL_FORM, "Codice Europeo");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODICEEUROPE, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODICEEUROPE, PPQRY_CAP30, "B.CODICE_EUROPEO", "RECCODEURSUC", 1, 1, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_LIST, 948, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_LIST, 148);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_LIST, "Entrata non ric.");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_FORM, 4, 304, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_FORM, 148);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENONRIC, MyGlb.PANEL_FORM, "Entrata non ric.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_ENTSPENONRIC, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_ENTSPENONRIC, PPQRY_CAP30, "B.ENTRATA_SPESA_NON_RIC", "REENSPNORISU", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_ENTSPENONRIC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_ENTSPENONRIC, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_LIST, 1000, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_LIST, 48);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_LIST, "Cofog");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_FORM, 4, 208, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_FORM, 48);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGSUCC, MyGlb.PANEL_FORM, "Cofog");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_COFOGSUCC, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_COFOGSUCC, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_COFOGSUCC, PPQRY_CAP30, "GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'COFOG')", "COFOGSUCC", 5, 99, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_LIST, 1044, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_LIST, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_LIST, "IV livello");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_FORM, 4, 160, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_FORM, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLSUCC, MyGlb.PANEL_FORM, "IV livello");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_IVLIVELLSUCC, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_IVLIVELLSUCC, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_IVLIVELLSUCC, PPQRY_CAP30, "GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO')", "IVLIVELLSUCC", 5, 99, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_LIST, 1132, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_LIST, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_LIST, "V livello");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_FORM, 4, 184, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOSUCC, MyGlb.PANEL_FORM, "V livello");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_VLIVELLOSUCC, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_VLIVELLOSUCC, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_VLIVELLOSUCC, PPQRY_CAP30, "GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO_5')", "VLIVELLOSUCC", 5, 99, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_LIST, 1228, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 328, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_FORM, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_TIPOVINCOLO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_TIPOVINCOLO, PPQRY_CAP30, "B.TIPO_VINCOLO", "RECTIPVINSUC", 1, 6, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_LIST, 1316, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_LIST, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_LIST, "Flessibilità");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_FORM, 4, 352, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_FORM, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBILITA, MyGlb.PANEL_FORM, "Flessibilità");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FLESSIBILITA, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FLESSIBILITA, PPQRY_CAP30, "B.FLESSIBILITA", "RECOFLESSUCC", 5, 4, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_LIST, 1400, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_LIST, 28);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_LIST, "Ril. IVA");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_FORM, 4, 376, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_FORM, 28);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVA, MyGlb.PANEL_FORM, "R. I.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_IVA, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_IVA, PPQRY_CAP30, "B.IVA", "RECORIVASUCC", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_IVA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_IVA, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_LIST, 1428, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_LIST, 92);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_LIST, "Centro di Costo");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_FORM, 4, 400, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_FORM, 92);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCOSTO, MyGlb.PANEL_FORM, "Centro di Costo");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CENTROCOSTO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CENTROCOSTO, PPQRY_CAP30, "B.CENTRO_COSTO", "RECCENCOSSUC", 5, 8, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_LIST, 1520, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_LIST, 96);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_LIST, "Contr. Comun.");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_FORM, 4, 424, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_FORM, 96);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTRIBCOMU, MyGlb.PANEL_FORM, "Contr. Comun.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CONTRIBCOMU, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CONTRIBCOMU, PPQRY_CAP30, "B.CONTRIB_COMU", "RECCONCOMSUC", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_CONTRIBCOMU, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_CONTRIBCOMU, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_LIST, 1572, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_LIST, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_LIST, "Funz. Del.");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_FORM, 4, 448, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDEL, MyGlb.PANEL_FORM, "Funz. Del.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FUNZDEL, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FUNZDEL, PPQRY_CAP30, "B.FUNZ_DEL", "RECFUNDELSUC", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FUNZDEL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FUNZDEL, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_LIST, 1612, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_LIST, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_LIST, "No Desc. Mandato");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_FORM, 4, 472, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_FORM, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STAMPADESMAN, MyGlb.PANEL_FORM, "No Desc. Mandato");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_STAMPADESMAN, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_STAMPADESMAN, PPQRY_CAP30, "B.STAMPA_DES_MAN", "RECSTADEMASU", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_STAMPADESMAN, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_STAMPADESMAN, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_LIST, 1672, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_LIST, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_LIST, "Fondo Ris. Cassa");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_FORM, 4, 496, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_FORM, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONDORISCASS, MyGlb.PANEL_FORM, "Fondo Ris. Cassa");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FONDORISCASS, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FONDORISCASS, PPQRY_CAP30, "B.FONDO_RIS_CASSA", "RECFONRICASU", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FONDORISCASS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FONDORISCASS, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_LIST, 1740, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_FORM, 4, 520, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FATTORE, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FATTORE, PPQRY_CAP30, "B.FATTORE", "RECOFATTSUCC", 5, 16, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_LIST, 1856, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_FORM, 4, 544, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CENTRO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CENTRO, PPQRY_CAP30, "B.CENTRO", "RECOCENTSUCC", 5, 16, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_LIST, 1972, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_LIST, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_FORM, 4, 568, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_FORM, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_TITOLO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_TITOLO, PPQRY_CAP30, "B.TITOLO", "RECOTITOSUCC", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_LIST, 2012, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_LIST, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_LIST, "Cod. Terzi");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_FORM, 4, 640, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_FORM, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZI, MyGlb.PANEL_FORM, "Cod. Terzi");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODTERZI, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODTERZI, PPQRY_CAP30, "B.COD_TERZI", "RECCODTERSUC", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_LIST, 2052, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_LIST, 76);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_FORM, 4, 592, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_FORM, 76);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CATEGORIA, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CATEGORIA, PPQRY_CAP30, "B.CATEGORIA", "RECOCATESUCC", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_LIST, 2116, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_LIST, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_LIST, "Cod. Intervento");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_FORM, 4, 616, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_FORM, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERVENT, MyGlb.PANEL_FORM, "Cod. Intervento");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODINTERVENT, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODINTERVENT, PPQRY_CAP30, "B.COD_INTERVENTO", "RECCODINTSUC", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_LIST, 2188, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_LIST, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_LIST, "Funzione");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_FORM, 4, 664, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_FORM, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONE, MyGlb.PANEL_FORM, "Funzione");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FUNZIONE, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FUNZIONE, PPQRY_CAP30, "B.FUNZIONE", "RECOFUNZSUCC", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_LIST, 2252, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_LIST, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_FORM, 4, 688, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_FORM, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_SERVIZIO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_SERVIZIO, PPQRY_CAP30, "B.SERVIZIO", "RECOSERVSUCC", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_LIST, 2316, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_LIST, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_FORM, 4, 712, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_FORM, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_PROGRAMMA, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_PROGRAMMA, PPQRY_CAP30, "B.PROGRAMMA", "RECOPROGSUC1", 5, 4, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_LIST, 2400, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_LIST, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_FORM, 4, 736, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_FORM, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTO, MyGlb.PANEL_FORM, "Ob. Oper.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_PROGETTO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_PROGETTO, PPQRY_CAP30, "B.PROGETTO", "RECOPROGSUCC", 5, 4, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_LIST, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_LIST, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_LIST, "DESCRIZIONE Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_FORM, 4, 784, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_FORM, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_FORM, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCRIZICORR, MyGlb.PANEL_FORM, "DESCRIZIONE Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_DESCRIZICORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_DESCRIZICORR, PPQRY_CAP30, "A.DESCRIZIONE", "RECODESCCORR", 5, 140, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_LIST, 156);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_LIST, "DESCRIZIONE ABBREVIATA Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_FORM, 4, 784, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_FORM, 156);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_DESCABBRCORR, MyGlb.PANEL_FORM, "DESCR. ABBREVIATA Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_DESCABBRCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_DESCABBRCORR, PPQRY_CAP30, "A.DESCRIZIONE_ABBREVIATA", "RECDESABBCOR", 5, 40, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_LIST, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_LIST, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_LIST, "ANNOTAZIONI Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_FORM, 4, 784, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_FORM, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_FORM, 2);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ANNOTAZICORR, MyGlb.PANEL_FORM, "ANNOTAZIONI Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_ANNOTAZICORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_ANNOTAZICORR, PPQRY_CAP30, "A.ANNOTAZIONI", "RECOANNOCORR", 5, 2000, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_LIST, 120);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_LIST, "CODICE STRUTTURA Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_FORM, 4, 784, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_FORM, 120);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODISTRUCORR, MyGlb.PANEL_FORM, "COD. STRUT. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODISTRUCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODISTRUCORR, PPQRY_CAP30, "A.CODICE_STRUTTURA", "RECCODSTRCOR", 5, 10, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_LIST, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_LIST, "CODICE EUROPEO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_FORM, 4, 784, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_FORM, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODIEUROCORR, MyGlb.PANEL_FORM, "COD. EUR. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODIEUROCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODIEUROCORR, PPQRY_CAP30, "A.CODICE_EUROPEO", "RECCODEURCOR", 1, 1, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_LIST, 148);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_LIST, "ENTRATA SPESA NON RIC Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_FORM, 4, 784, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_FORM, 148);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_ENTSPENORICO, MyGlb.PANEL_FORM, "ENTR. SP. NON RIC Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_ENTSPENORICO, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_ENTSPENORICO, PPQRY_CAP30, "A.ENTRATA_SPESA_NON_RIC", "REENSPNORICO", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_ENTSPENORICO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_ENTSPENORICO, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_LIST, 72);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_LIST, "COFOG Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_FORM, 4, 784, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_FORM, 72);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_COFOGCORR, MyGlb.PANEL_FORM, "COFOG Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_COFOGCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_COFOGCORR, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_COFOGCORR, PPQRY_CAP30, "GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'COFOG')", "COFOGCORR", 5, 99, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_LIST, 96);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_LIST, "IV LIVELLO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_FORM, 4, 784, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_FORM, 96);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVLIVELLCORR, MyGlb.PANEL_FORM, "IV LIVELLO Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_IVLIVELLCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_IVLIVELLCORR, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_IVLIVELLCORR, PPQRY_CAP30, "GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO')", "IVLIVELLCORR", 5, 99, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_LIST, 92);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_LIST, "V LIVELLO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_FORM, 4, 784, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_FORM, 92);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_VLIVELLOCORR, MyGlb.PANEL_FORM, "V LIVELLO Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_VLIVELLOCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldUnbound(PFL_DIFFSUESESUC_VLIVELLOCORR, true);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_VLIVELLOCORR, PPQRY_CAP30, "GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO_5')", "VLIVELLOCORR", 5, 99, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_LIST, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_LIST, "TIPO VINCOLO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_FORM, 4, 784, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_FORM, 88);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TIPOVINCCORR, MyGlb.PANEL_FORM, "TP. VINC. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_TIPOVINCCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_TIPOVINCCORR, PPQRY_CAP30, "A.TIPO_VINCOLO", "RECTIPVINCOR", 1, 6, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_LIST, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_LIST, "FLESSIBILITA Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_FORM, 4, 784, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_FORM, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FLESSIBICORR, MyGlb.PANEL_FORM, "FLESSIB. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FLESSIBICORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FLESSIBICORR, PPQRY_CAP30, "A.FLESSIBILITA", "RECOFLESCORR", 5, 4, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_LIST, 28);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_LIST, "IVA Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_FORM, 4, 784, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_FORM, 28);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_IVACORR, MyGlb.PANEL_FORM, "I. C.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_IVACORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_IVACORR, PPQRY_CAP30, "A.IVA", "RECORIVACORR", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_IVACORR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_IVACORR, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_LIST, 92);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_LIST, "CENTRO COSTO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_FORM, 4, 784, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_FORM, 92);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTCOSTCORR, MyGlb.PANEL_FORM, "CENT. COS. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CENTCOSTCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CENTCOSTCORR, PPQRY_CAP30, "A.CENTRO_COSTO", "RECCENCOSCOR", 5, 8, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_LIST, 96);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_LIST, "CONTRIB COMU Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_FORM, 4, 784, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_FORM, 96);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CONTCOMUCORR, MyGlb.PANEL_FORM, "CONT. CM. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CONTCOMUCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CONTCOMUCORR, PPQRY_CAP30, "A.CONTRIB_COMU", "RECCONCOMCOR", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_CONTCOMUCORR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_CONTCOMUCORR, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_LIST, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_LIST, "FUNZ DEL Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_FORM, 4, 784, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZDELCORR, MyGlb.PANEL_FORM, "FN. DL. Cr.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FUNZDELCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FUNZDELCORR, PPQRY_CAP30, "A.FUNZ_DEL", "RECFUNDELCOR", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FUNZDELCORR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FUNZDELCORR, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_LIST, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_LIST, "STAMPA DES MAN Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_FORM, 4, 784, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_FORM, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_STADESMANCOR, MyGlb.PANEL_FORM, "STM. DES MAN Crr.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_STADESMANCOR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_STADESMANCOR, PPQRY_CAP30, "A.STAMPA_DES_MAN", "RECSTADEMACO", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_STADESMANCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_STADESMANCOR, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_LIST, 8, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_LIST, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_LIST, "FONDO RIS CASSA Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_FORM, 12, 792, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_FORM, 108);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FONRISCASCOR, MyGlb.PANEL_FORM, "FON. RIS CAS. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FONRISCASCOR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FONRISCASCOR, PPQRY_CAP30, "A.FONDO_RIS_CASSA", "RECFONRICACO", 5, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FONRISCASCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DIFFSUESESUC.SetValueListItem(PFL_DIFFSUESESUC_FONRISCASCOR, (new IDVariant()), "Null", "", "", -1);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_LIST, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_LIST, "FATTORE Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_FORM, 4, 784, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_FORM, 60);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FATTORECORR, MyGlb.PANEL_FORM, "FATT. Crr.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FATTORECORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FATTORECORR, PPQRY_CAP30, "A.FATTORE", "RECOFATTCORR", 5, 16, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_LIST, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_LIST, "CENTRO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_FORM, 4, 784, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_FORM, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CENTROCORR, MyGlb.PANEL_FORM, "CNT. Cr.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CENTROCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CENTROCORR, PPQRY_CAP30, "A.CENTRO", "RECOCENTCORR", 5, 16, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_LIST, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_LIST, "TITOLO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_FORM, 4, 784, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_FORM, 52);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_TITOLOCORR, MyGlb.PANEL_FORM, "TIT. Crr.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_TITOLOCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_TITOLOCORR, PPQRY_CAP30, "A.TITOLO", "RECOTITOCORR", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_LIST, 76);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_LIST, "CATEGORIA Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_FORM, 4, 784, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_FORM, 76);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CATEGORICORR, MyGlb.PANEL_FORM, "CATEG. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CATEGORICORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CATEGORICORR, PPQRY_CAP30, "A.CATEGORIA", "RECOCATECORR", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_LIST, 8, 44, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_LIST, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_LIST, "COD INTERVENTO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_FORM, 12, 792, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_FORM, 104);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODINTERCORR, MyGlb.PANEL_FORM, "COD INTERV. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODINTERCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODINTERCORR, PPQRY_CAP30, "A.COD_INTERVENTO", "RECCODINTCOR", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_LIST, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_LIST, "COD TERZI Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_FORM, 4, 784, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_FORM, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_CODTERZICORR, MyGlb.PANEL_FORM, "C. TER. Cr.");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_CODTERZICORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_CODTERZICORR, PPQRY_CAP30, "A.COD_TERZI", "RECCODTERCOR", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_LIST, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_LIST, "FUNZIONE Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_FORM, 4, 784, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_FORM, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_FUNZIONECORR, MyGlb.PANEL_FORM, "FUNZ. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_FUNZIONECORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_FUNZIONECORR, PPQRY_CAP30, "A.FUNZIONE", "RECOFUNZCORR", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_LIST, 8, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_LIST, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_LIST, "SERVIZIO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_FORM, 12, 792, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_FORM, 64);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_SERVIZIOCORR, MyGlb.PANEL_FORM, "SERV. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_SERVIZIOCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_SERVIZIOCORR, PPQRY_CAP30, "A.SERVIZIO", "RECOSERVCORR", 1, 2, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_LIST, 8, 44, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_LIST, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_LIST, "PROGRAMMA Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_FORM, 12, 792, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_FORM, 84);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGRAMMCORR, MyGlb.PANEL_FORM, "PROGR. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_PROGRAMMCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_PROGRAMMCORR, PPQRY_CAP30, "A.PROGRAMMA", "RECOPROGCOR1", 5, 4, 0, -13997);
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_LIST, 8, 44, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_LIST, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_LIST, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_LIST, "PROGETTO Corr");
    PAN_DIFFSUESESUC.SetRect(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_FORM, 12, 792, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DIFFSUESESUC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_FORM, 68);
    PAN_DIFFSUESESUC.SetNumRow(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_FORM, 1);
    PAN_DIFFSUESESUC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DIFFSUESESUC_PROGETTOCORR, MyGlb.PANEL_FORM, "PROG. Corr");
    PAN_DIFFSUESESUC.SetFieldPage(PFL_DIFFSUESESUC_PROGETTOCORR, -1, -1);
    PAN_DIFFSUESESUC.SetFieldPanel(PFL_DIFFSUESESUC_PROGETTOCORR, PPQRY_CAP30, "A.PROGETTO", "RECOPROGCORR", 5, 4, 0, -13997);
  }

  private void PAN_DIFFSUESESUC_InitQueries()
  {
    StringBuffer SQL;

    PAN_DIFFSUESESUC.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DIFFSUESESUC.SetIMDB(IMDB, "PQRY_CAP30", true);
    PAN_DIFFSUESESUC.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'Capitolo di ' || DECODE(A.E_S, 'E', 'Entrata', 'S', 'Spesa') || ' ' || LPAD(TO_CHAR ( A.CAPITOLO ), 16, SUBSTR(' ', 1, 1)) || '/' || LPAD(TO_CHAR ( A.ARTICOLO ), 2, SUBSTR(' ', 1, 1)) as GRUPPOCAPITO, ");
    SQL.append("  A.ESERCIZIO as RECOESERCORR, ");
    SQL.append("  B.ESERCIZIO as RECOESERSUCC, ");
    SQL.append("  A.E_S as RECORDESCORR, ");
    SQL.append("  B.E_S as RECORDESSUCC, ");
    SQL.append("  A.CAPITOLO as RECOCAPICORR, ");
    SQL.append("  B.CAPITOLO as RECOCAPISUCC, ");
    SQL.append("  A.ARTICOLO as RECOARTICORR, ");
    SQL.append("  B.ARTICOLO as RECOARTISUCC, ");
    SQL.append("  A.DESCRIZIONE as RECODESCCORR, ");
    SQL.append("  B.DESCRIZIONE as RECODESCSUCC, ");
    SQL.append("  A.DESCRIZIONE_ABBREVIATA as RECDESABBCOR, ");
    SQL.append("  B.DESCRIZIONE_ABBREVIATA as RECDESABBSUC, ");
    SQL.append("  A.ANNOTAZIONI as RECOANNOCORR, ");
    SQL.append("  B.ANNOTAZIONI as RECOANNOSUCC, ");
    SQL.append("  DECODE(B.ANNOTAZIONI, NULL, 'N', 'P') as APRINOTE, ");
    SQL.append("  A.CODICE_STRUTTURA as RECCODSTRCOR, ");
    SQL.append("  B.CODICE_STRUTTURA as RECCODSTRSUC, ");
    SQL.append("  A.CODICE_EUROPEO as RECCODEURCOR, ");
    SQL.append("  B.CODICE_EUROPEO as RECCODEURSUC, ");
    SQL.append("  A.ENTRATA_SPESA_NON_RIC as REENSPNORICO, ");
    SQL.append("  B.ENTRATA_SPESA_NON_RIC as REENSPNORISU, ");
    SQL.append("  GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'COFOG') as COFOGCORR, ");
    SQL.append("  GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'COFOG') as COFOGSUCC, ");
    SQL.append("  GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO') as IVLIVELLCORR, ");
    SQL.append("  GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO') as IVLIVELLSUCC, ");
    SQL.append("  GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO_5') as VLIVELLOCORR, ");
    SQL.append("  GET_COD_RICL_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO,'MACRO_5') as VLIVELLOSUCC, ");
    SQL.append("  A.TIPO_VINCOLO as RECTIPVINCOR, ");
    SQL.append("  B.TIPO_VINCOLO as RECTIPVINSUC, ");
    SQL.append("  A.FLESSIBILITA as RECOFLESCORR, ");
    SQL.append("  B.FLESSIBILITA as RECOFLESSUCC, ");
    SQL.append("  A.IVA as RECORIVACORR, ");
    SQL.append("  B.IVA as RECORIVASUCC, ");
    SQL.append("  A.CENTRO_COSTO as RECCENCOSCOR, ");
    SQL.append("  B.CENTRO_COSTO as RECCENCOSSUC, ");
    SQL.append("  A.CONTRIB_COMU as RECCONCOMCOR, ");
    SQL.append("  B.CONTRIB_COMU as RECCONCOMSUC, ");
    SQL.append("  A.FUNZ_DEL as RECFUNDELCOR, ");
    SQL.append("  B.FUNZ_DEL as RECFUNDELSUC, ");
    SQL.append("  A.STAMPA_DES_MAN as RECSTADEMACO, ");
    SQL.append("  B.STAMPA_DES_MAN as RECSTADEMASU, ");
    SQL.append("  A.FONDO_RIS_CASSA as RECFONRICACO, ");
    SQL.append("  B.FONDO_RIS_CASSA as RECFONRICASU, ");
    SQL.append("  A.FATTORE as RECOFATTCORR, ");
    SQL.append("  B.FATTORE as RECOFATTSUCC, ");
    SQL.append("  A.CENTRO as RECOCENTCORR, ");
    SQL.append("  B.CENTRO as RECOCENTSUCC, ");
    SQL.append("  A.TITOLO as RECOTITOCORR, ");
    SQL.append("  B.TITOLO as RECOTITOSUCC, ");
    SQL.append("  A.COD_TERZI as RECCODTERCOR, ");
    SQL.append("  B.COD_TERZI as RECCODTERSUC, ");
    SQL.append("  A.CATEGORIA as RECOCATECORR, ");
    SQL.append("  B.CATEGORIA as RECOCATESUCC, ");
    SQL.append("  A.COD_INTERVENTO as RECCODINTCOR, ");
    SQL.append("  B.COD_INTERVENTO as RECCODINTSUC, ");
    SQL.append("  A.FUNZIONE as RECOFUNZCORR, ");
    SQL.append("  B.FUNZIONE as RECOFUNZSUCC, ");
    SQL.append("  A.SERVIZIO as RECOSERVCORR, ");
    SQL.append("  B.SERVIZIO as RECOSERVSUCC, ");
    SQL.append("  A.PROGRAMMA as RECOPROGCOR1, ");
    SQL.append("  B.PROGRAMMA as RECOPROGSUC1, ");
    SQL.append("  A.PROGETTO as RECOPROGCORR, ");
    SQL.append("  B.PROGETTO as RECOPROGSUCC ");
    PAN_DIFFSUESESUC.SetQuery(PPQRY_CAP30, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  CAP B ");
    PAN_DIFFSUESESUC.SetQuery(PPQRY_CAP30, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = NVL(~~TBL_PARAMETRI590.PARAENTRSPES~~, A.E_S)) ");
    SQL.append("and   (A.CAPITOLO = NVL(~~TBL_PARAMETRI590.PARAMCAPITOL~~, A.CAPITOLO)) ");
    SQL.append("and   (A.ARTICOLO = NVL(~~TBL_PARAMETRI590.PARAMARTICOL~~, A.ARTICOLO)) ");
    SQL.append("and   (B.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CAP C ");
    SQL.append("where (C.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.E_S = A.E_S) ");
    SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   ((NVL(A.DESCRIZIONE, '-1') <> NVL(C.DESCRIZIONE, '-1')) OR (NVL(A.DESCRIZIONE_ABBREVIATA, '-1') <> NVL(C.DESCRIZIONE_ABBREVIATA, '-1')) OR (NVL(A.ANNOTAZIONI, '-1') <> NVL(C.ANNOTAZIONI, '-1')) OR (NVL(A.CODICE_STRUTTURA, '-1') <> NVL(C.CODICE_STRUTTURA, '-1')) OR (NVL(A.CODICE_EUROPEO, -1) <> NVL(C.CODICE_EUROPEO, -1)) OR (NVL(A.ENTRATA_SPESA_NON_RIC, 'NO') <> NVL(C.ENTRATA_SPESA_NON_RIC, 'NO')) OR (NVL(A.TIPO_VINCOLO, -1) <> NVL(C.TIPO_VINCOLO, -1)) OR (NVL(A.FLESSIBILITA, '-1') <> NVL(C.FLESSIBILITA, '-1')) OR (NVL(A.IVA, 'NO') <> NVL(C.IVA, 'NO')) OR (NVL(A.CENTRO_COSTO, '-1') <> NVL(C.CENTRO_COSTO, '-1')) OR (NVL(A.CONTRIB_COMU, 'NO') <> NVL(C.CONTRIB_COMU, 'NO')) OR (NVL(A.FUNZ_DEL, 'NO') <> NVL(C.FUNZ_DEL, 'NO')) OR (NVL(A.STAMPA_DES_MAN, 'SI') <> NVL(C.STAMPA_DES_MAN, 'SI')) OR (NVL(A.FONDO_RIS_CASSA, 'NO') <> NVL(C.FONDO_RIS_CASSA, 'NO')) OR (NVL(A.FATTORE, '-1') <> NVL(C.FATTORE, '-1')) OR (NVL(A.CENTRO, '-1') <> NVL(C.CENTRO, '-1')) OR (NVL(A.TITOLO, -1) <> NVL(C.TITOLO, -1)) OR (NVL(A.COD_TERZI, -1) <> NVL(C.COD_TERZI, -1)) OR (NVL(A.CATEGORIA, -1) <> NVL(C.CATEGORIA, -1)) OR (NVL(A.COD_INTERVENTO, -1) <> NVL(C.COD_INTERVENTO, -1)) OR (NVL(A.FUNZIONE, -1) <> NVL(C.FUNZIONE, -1)) OR (NVL(A.SERVIZIO, -1) <> NVL(C.SERVIZIO, -1)) OR (NVL(A.PROGRAMMA, '-1') <> NVL(C.PROGRAMMA, '-1')) OR (NVL(A.PROGETTO, '-1') <> NVL(C.PROGETTO, '-1')) OR (NVL(GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'COFOG'), '-1') <> NVL(GET_COD_RICL_CAP(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO,'COFOG'), '-1')) OR (NVL(GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO'), '-1') <> NVL(GET_COD_RICL_CAP(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO,'MACRO'), '-1')) OR (NVL(GET_COD_RICL_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO,'MACRO_5'), '-1') <> NVL(GET_COD_RICL_CAP(C.ESERCIZIO,C.E_S,C.CAPITOLO,C.ARTICOLO,'MACRO_5'), '-1'))) ");
    SQL.append(")) OR NOT ((~~TBL_PARAMETRI590.PARAMCAPITOL~~ IS NULL))) ");
    PAN_DIFFSUESESUC.SetQuery(PPQRY_CAP30, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DIFFSUESESUC.SetQuery(PPQRY_CAP30, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DIFFSUESESUC.SetQuery(PPQRY_CAP30, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO, ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  B.ESERCIZIO ");
    PAN_DIFFSUESESUC.SetQuery(PPQRY_CAP30, 5, SQL, -1, "");
    PAN_DIFFSUESESUC.SetQueryDB(PPQRY_CAP30, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DIFFSUESESUC.SetMasterTable(0, "CAP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DIFFSUESESUC.Status() == 2)
    {
      int oldListQBE = PAN_DIFFSUESESUC.iUseListQBE;
      PAN_DIFFSUESESUC.iUseListQBE = 0;
      PAN_DIFFSUESESUC.PanelCommand(Glb.PCM_SEARCH);
      PAN_DIFFSUESESUC.PanelCommand(Glb.PCM_FIND);
      PAN_DIFFSUESESUC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DIFFSUESESUC) PAN_DIFFSUESESUC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DIFFSUESESUC) PAN_DIFFSUESESUC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DIFFSUESESUC) PAN_DIFFSUESESUC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DIFFSUESESUC) PAN_DIFFSUESESUC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DIFFSUESESUC) PAN_DIFFSUESESUC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
