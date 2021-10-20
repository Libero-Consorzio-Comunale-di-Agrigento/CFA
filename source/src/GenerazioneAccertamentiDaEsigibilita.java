// **********************************************
// Generazione Accertamenti Da Esigibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneAccertamentiDaEsigibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_DELIBERA = 0;
  private static int PFL_PARS_NUMERODEL = 1;
  private static int PFL_PARS_ANNODEL = 2;
  private static int PFL_PARS_ETICHSCELDEL = 3;
  private static int PFL_PARS_ETICHINFODEL = 4;
  private static int PFL_PARS_ANNOESIGIBI1 = 5;
  private static int PFL_PARS_PROGRUO = 6;

  private static int PPQRY_PARS55 = 0;

  private static int PPQRY_VARCOM = 1;


  IDPanel PAN_PARS;
  private static int PFL_VARIAZACCERT_CAPCODICSTRU = 0;
  private static int PFL_VARIAZACCERT_CODIPIANCONT = 1;
  private static int PFL_VARIAZACCERT_CAPITOLO = 2;
  private static int PFL_VARIAZACCERT_VARACCARTICO = 3;
  private static int PFL_VARIAZACCERT_INFOCAPITOLO = 4;
  private static int PFL_VARIAZACCERT_NUMEROACC = 5;
  private static int PFL_VARIAZACCERT_VARACANNOACC = 6;
  private static int PFL_VARIAZACCERT_INFOACCERTAM = 7;
  private static int PFL_VARIAZACCERT_ACCDESCRIZIO = 8;
  private static int PFL_VARIAZACCERT_ANNOESIGIBIL = 9;
  private static int PFL_VARIAZACCERT_IMPORTO = 10;
  private static int PFL_VARIAZACCERT_VARACCPROGRE = 11;
  private static int PFL_VARIAZACCERT_ACCPROUNIORG = 12;
  private static int PFL_VARIAZACCERT_TIPOVAR = 13;
  private static int PFL_VARIAZACCERT_TIPOVARIAZIO = 14;

  private static int PPQRY_VARIAZACCER1 = 0;

  private static int PPQRY_T55 = 1;


  IDPanel PAN_VARIAZACCERT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS65(IMDB);
    Init_TBL_VARIAZACCERT(IMDB);
    //
    //
    Init_PQRY_PARS55(IMDB);
    Init_PQRY_PARS55_RS(IMDB);
    Init_PQRY_VARIAZACCER1(IMDB);
    Init_PQRY_VARIAZACCER1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS65(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARS65, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARS65, "TBL_PARS65");
    IMDB.set_FldCode(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARS65,IMDBDef5.FLD_PARS65_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARS65, 0);
  }

  private static void Init_TBL_VARIAZACCERT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_VARIAZACCERT, 15);
    IMDB.set_TblCode(IMDBDef5.TBL_VARIAZACCERT, "TBL_VARIAZACCERT");
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_CODICE_STRUTTURA, "CODICE_STRUTTURA");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_CODICE_STRUTTURA,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NOMOGGTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef5.TBL_VARIAZACCERT,IMDBDef5.FLD_VARIAZACCERT_ANNO_DEL,1,4,0);
  }

  private static void Init_PQRY_PARS55(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARS55, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARS55, "PQRY_PARS55");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMEOGGPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55,IMDBDef14.PQSL_PARS55_NOMOGGANNDEL,1,4,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARS55, 0);
  }

  private static void Init_PQRY_PARS55_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARS55_RS, 5);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARS55_RS, "PQRY_PARS55_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMEOGGPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARS55_RS,IMDBDef14.PQSL_PARS55_NOMOGGANNDEL,1,4,0);
  }

  private static void Init_PQRY_VARIAZACCER1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_VARIAZACCER1, 14);
    IMDB.set_TblCode(IMDBDef14.PQRY_VARIAZACCER1, "PQRY_VARIAZACCER1");
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCACOST, "NOMOGGCACOST");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCACOST,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARART, "NOMOGGVARART");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARART,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_INFOCAPITOLO, "INFOCAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_INFOCAPITOLO,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGNUMACC, "NOMOGGNUMACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNACC, "NOMOGGANNACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_INFOACCERTAM, "INFOACCERTAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_INFOACCERTAM,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGACCDES, "NOMOGGACCDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGACCDES,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARPRO, "NOMOGGVARPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOOGACPRUNOR, "NOOGACPRUNOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOOGACPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGTIPVAR,1,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_VARIAZACCER1, 0);
  }

  private static void Init_PQRY_VARIAZACCER1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_VARIAZACCER1_RS, 14);
    IMDB.set_TblCode(IMDBDef14.PQRY_VARIAZACCER1_RS, "PQRY_VARIAZACCER1_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCACOST, "NOMOGGCACOST");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCACOST,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARART, "NOMOGGVARART");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARART,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_INFOCAPITOLO, "INFOCAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_INFOCAPITOLO,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGNUMACC, "NOMOGGNUMACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNACC, "NOMOGGANNACC");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_INFOACCERTAM, "INFOACCERTAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_INFOACCERTAM,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGACCDES, "NOMOGGACCDES");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGACCDES,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARPRO, "NOMOGGVARPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOOGACPRUNOR, "NOOGACPRUNOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOOGACPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VARIAZACCER1_RS,IMDBDef14.PQSL_VARIAZACCER1_NOMOGGTIPVAR,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneAccertamentiDaEsigibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneAccertamentiDaEsigibilita()
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
    FormIdx = MyGlb.FRM_GENEACCDAESI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B9B1FB06-2671-4E1E-B048-39C58DB1C7DD";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 872;
    DesignHeight = 594;
    set_Caption(new IDVariant("Generazione Accertamenti da Esigibilità"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 872;
    Frames[1].Height = 568;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.140845;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 872;
    Frames[2].Height = 80;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 80;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 872-MyGlb.PAN_OFFS_X, 80-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "29602028-D55D-4FE2-9A60-E8AD9EC3E6FD");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 676, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 872;
    Frames[3].Height = 488;
    Frames[3].Caption = "Variazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 488;
    PAN_VARIAZACCERT = new IDPanel(w, this, 3, "PAN_VARIAZACCERT");
    Frames[3].Content = PAN_VARIAZACCERT;
    PAN_VARIAZACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZACCERT.VS = MainFrm.VisualStyleList;
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 872-MyGlb.PAN_OFFS_X, 488-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4CFBB2B7-41D4-45DC-93E0-F0A3247E273A");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 832, 396, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZACCERT.InitStatus = 1;
    PAN_VARIAZACCERT_Init();
    PAN_VARIAZACCERT_InitFields();
    PAN_VARIAZACCERT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG159+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FA10+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG159+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAACCERT+BaseCmdLinIdx)
      {
        GenerazioneAccertamenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOANOMA3+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_ELEANOACCREI, 0, this);
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARS65, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEACCDAESI_PARS55();
      }
      if (IMDB.TblModified(IMDBDef5.TBL_VARIAZACCERT, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef14.PQRY_PARS55, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEACCDAESI_VARIAZACCER1();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_ETICHSCELDEL) {
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
    return (obj instanceof GenerazioneAccertamentiDaEsigibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneAccertamentiDaEsigibilita.class.getName() : (Glb.ClassWithPackage(GenerazioneAccertamentiDaEsigibilita.class) ? GenerazioneAccertamentiDaEsigibilita.class.getName().substring(GenerazioneAccertamentiDaEsigibilita.class.getPackage().getName().length() + 1) : GenerazioneAccertamentiDaEsigibilita.class.getName()));
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
      PAN_VARIAZACCERT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZACCERT.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZACCERT.Freezed = (new IDVariant(-1)).booleanValue();
      RiempiIMDB();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMEOGGEDELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMOGGANNESI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMEOGGPROUO, 0, new IDVariant());
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

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMEOGGEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_PARGENACDAES)), true))
        {
          if (IMDB.Value(IMDBDef5.TBL_PAR120, IMDBDef5.FLD_PAR120_NOMEOGGDAELA, 0).equals((new IDVariant("SI")), true))
          {
            IDVariant I = new IDVariant(0,IDVariant.INTEGER);
            IDVariant K = new IDVariant(0,IDVariant.INTEGER);
            K = (new IDVariant(0));
            IDVariant v_ANOMALIE = new IDVariant(0,IDVariant.STRING);
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.GENERAACCDAESIGIBILITAVACC(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.PQRY_PAR115, IMDBDef14.PQSL_PAR115_NOMEOGGEDELI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), I, K, v_ANOMALIE);
            if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            }
            else
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("Inseriti "));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("\n"))), S), ((I.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(I)), (new IDVariant(" "))), (new IDVariant("Accertamenti"))):(new IDVariant("nessun Accertamento")))), (new IDVariant(", "))), ((K.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(K)), (new IDVariant(" "))), (new IDVariant("Variazioni Accertamenti"))):(new IDVariant("nessuna Variazione Accertamento")))), ((v_ANOMALIE.equals((new IDVariant())))?(new IDVariant("")):IDL.Add(IDL.Add((new IDVariant("n/")), (new IDVariant("n/"))), (new IDVariant("Controllare l'elenco Anomalie")))))); 
              RiempiIMDB();
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Generazione Accertamenti
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GenerazioneAccertamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Generazione Accertamenti Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_ACC_DAESIG ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Nessun record selezionato"));
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      if (PAN_VARIAZACCERT.ShowMultipleSel())
      {
        IMDB.TblMoveFirst (IMDBDef14.PQRY_VARIAZACCER1_RS, 0);
        while (!IMDB.Eof(IMDBDef14.PQRY_VARIAZACCER1_RS, 0))
        {
          if (PAN_VARIAZACCERT.IsRowSelected(I.intValue()))
          {
            v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
            SQL = new StringBuffer();
            SQL.append("insert into WRK_GEN_ACC_DAESIG ");
            SQL.append("( ");
            SQL.append("  PROGR_SESSIONE, ");
            SQL.append("  PROGRESSIVO_VARIAZIONE, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1_RS, IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          I = IDL.Add(I, (new IDVariant(1)));
          IMDB.TblMoveNext(IMDBDef14.PQRY_VARIAZACCER1_RS, 0);
        }
        if (v_COUNT.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARPRO, 0)))
        {
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("insert into WRK_GEN_ACC_DAESIG ");
          SQL.append("( ");
          SQL.append("  PROGR_SESSIONE, ");
          SQL.append("  PROGRESSIVO_VARIAZIONE, ");
          SQL.append("  DATA_INSERIMENTO ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  TRUNC( SYSDATE ) ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
      }
      MainFrm.Show(MyGlb.FRM_PARGENACDAES, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "GenerazioneAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiIMDB ()
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
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_VARIACCEDELE();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as VARACCCAPITO, ");
      SQL.append("  A.ARTICOLO as VARACCARTICO, ");
      SQL.append("  A.NUMERO_ACC as VARACNUMEACC, ");
      SQL.append("  A.ANNO_ACC as VARACANNOACC, ");
      SQL.append("  B.DESCRIZIONE as ACCDESCRIZIO, ");
      SQL.append("  ABS(A.IMPORTO) as VARACCIMPORT, ");
      SQL.append("  A.ANNO_ESIGIBILITA as VARAANNOESIG, ");
      SQL.append("  A.PROGRESSIVO as VARACCPROGRE, ");
      SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as ACCPROUNIORG, ");
      SQL.append("  A.TIPO_VAR as VARACTIPOVAR ");
      SQL.append("from ");
      SQL.append("  VARACC A, ");
      SQL.append("  ACC B ");
      SQL.append("where (B.ANNO_ACC = A.ANNO_ACC) ");
      SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
      SQL.append("and   (A.IMPORTO < 0) ");
      SQL.append("and   ((A.ACC_GENERATO IS NULL)) ");
      SQL.append("and   (NOT ((A.ANNO_ESIGIBILITA IS NULL))) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      C2.setColUnbound(6,true);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IDVariant v_VVARCOMPROGR = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VVARCANNODEL = null;
        v_VVARCANNODEL = (new IDVariant());
        IDVariant v_VVARCNUMEDEL = null;
        v_VVARCNUMEDEL = (new IDVariant());
        IDVariant v_VVARCSEDEDEL = null;
        v_VVARCSEDEDEL = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.PROGRESSIVO) as MINVARCOPROG ");
        SQL.append("from ");
        SQL.append("  VARCOM A ");
        SQL.append("where (A.PROGRESSIVO_VARACC = " + IDL.CSql(C2.Get("VARACCPROGRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVARCOMPROGR = QV.Get("MINVARCOPROG", IDVariant.DECIMAL) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ANNO_DEL as VARCOANNODEL, ");
        SQL.append("  A.NUMERO_DEL as VARCONUMEDEL, ");
        SQL.append("  A.SEDE_DEL as VARCOSEDEDEL ");
        SQL.append("from ");
        SQL.append("  VARCOM A ");
        SQL.append("where (A.PROGRESSIVO = " + IDL.CSql(v_VVARCOMPROGR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVARCANNODEL = QV.Get("VARCOANNODEL", IDVariant.INTEGER) ;
          v_VVARCNUMEDEL = QV.Get("VARCONUMEDEL", IDVariant.INTEGER) ;
          v_VVARCSEDEDEL = QV.Get("VARCOSEDEDEL", IDVariant.STRING) ;
        }
        QV.Close();
        RIEMPIIMDB_VARACCINSINT(C2.Get("VARACCCAPITO"), C2.Get("VARACCARTICO"), C2.Get("VARACNUMEACC"), C2.Get("VARACANNOACC"), C2.Get("ACCDESCRIZIO"), C2.Get("VARACCIMPORT"), C2.Get("VARACCPROGRE"), C2.Get("VARAANNOESIG"), C2.Get("ACCPROUNIORG"), C2.Get("VARACTIPOVAR"), v_VVARCSEDEDEL, v_VVARCNUMEDEL, v_VVARCANNODEL);
        C2.MoveNext();
      }
      C2.Close();
      PAN_VARIAZACCERT.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Variazioni Accertamenti: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VARIACCEDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_VARIAZACCERT);
  }

  // **********************************************************************
  // Variazioni Accertamenti: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void RIEMPIIMDB_VARACCINSINT(IDVariant C2_VARACCCAPITO, IDVariant C2_VARACCARTICO, IDVariant C2_VARACNUMEACC, IDVariant C2_VARACANNOACC, IDVariant C2_ACCDESCRIZIO, IDVariant C2_VARACCIMPORT, IDVariant C2_VARACCPROGRE, IDVariant C2_VARAANNOESIG, IDVariant C2_ACCPROUNIORG, IDVariant C2_VARACTIPOVAR, IDVariant v_VVARCSEDEDEL, IDVariant v_VVARCNUMEDEL, IDVariant v_VVARCANNODEL) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef5.TBL_VARIAZACCERT, 0);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_CAPITOLO, 0, C2_VARACCCAPITO);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ARTICOLO, 0, C2_VARACCARTICO);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NUMERO_IMP, 0, C2_VARACNUMEACC);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_IMP, 0, C2_VARACANNOACC);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_DESCRIZIONE, 0, C2_ACCDESCRIZIO);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_IMPORTO, 0, C2_VARACCIMPORT);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_PROGRESSIVO, 0, C2_VARACCPROGRE);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_ESIGIBILITA, 0, C2_VARAANNOESIG);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA, 0, C2_ACCPROUNIORG);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NOMOGGTIPVAR, 0, C2_VARACTIPOVAR);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_SEDE_DEL, 0, v_VVARCSEDEDEL);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NUMERO_DEL, 0, v_VVARCNUMEDEL);
    IMDB.set_Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_DEL, 0, v_VVARCANNODEL);
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
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_TIPOVARIAZIO,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_TIPOVARIAZIO))).stringValue()); 
      PAN_VARIAZACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZACCERT_ACCDESCRIZIO,(new IDVariant(PAN_VARIAZACCERT.FieldText(PFL_VARIAZACCERT_ACCDESCRIZIO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "VariazioniAccertamentiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni Accertamenti On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZACCERT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Accertamenti On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_VARIAZACCERT.Freezed = (new IDVariant(0)).booleanValue();
        PAN_VARIAZACCERT_InitQueries();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_VARIAZACCERT.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "VariazioniAccertamentiOnCommand", _e);
    }
  }

  // **********************************************************************
  // Info Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGECAPI, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMOGGVARART, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Accertamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMOGGNUMACC, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMOGGANNACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef14.PQRY_VARIAZACCER1, IMDBDef14.PQSL_VARIAZACCER1_NOMOGGNUMACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARAMFILTRO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARAANNOESIG, 0, IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGANNESI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARPROUNIORG, 0, IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMEOGGPROUO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "EtichettaSceltaDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Info Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGANNDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGNUMDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMEOGGEDELI, 0));
      MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneAccertamentiDaEsigibilita", "EtichettaInfoDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENEACCDAESI_PARS55() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARS55_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARS65, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARS65, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARS55_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARS55_RS, 0, IMDBDef5.TBL_PARS65, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS55_RS, 0, 0, IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMOGGANNESI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS55_RS, 1, 0, IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMEOGGPROUO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS55_RS, 2, 0, IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMEOGGEDELI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS55_RS, 3, 0, IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARS55_RS, 4, 0, IMDBDef5.TBL_PARS65, IMDBDef5.FLD_PARS65_NOMOGGANNDEL, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARS65, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARS65, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARS65, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARS55_RS, 0);
  }

  // **********************************************************************
  // Variazioni Accertamenti
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENEACCDAESI_VARIAZACCER1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_VARIAZACCER1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_VARIAZACCERT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_VARIAZACCERT, 0))
    {
      if (IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_ESIGIBILITA, 0).equals(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGANNESI, 0),IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_ESIGIBILITA, 0)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA, 0),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMEOGGPROUO, 0),IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA, 0),(new IDVariant(-1)))), true))
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_SEDE_DEL, 0),(new IDVariant("X"))).equals(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMEOGGEDELI, 0),IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_SEDE_DEL, 0),(new IDVariant("X")))), true))
          {
            if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NUMERO_DEL, 0),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGNUMDEL, 0),IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NUMERO_DEL, 0),(new IDVariant(-1)))), true))
            {
              if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_DEL, 0),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARS55, IMDBDef14.PQSL_PARS55_NOMOGGANNDEL, 0),IDL.NullValue(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_DEL, 0),(new IDVariant(-1)))), true))
              {
                IMDB.TblAddNew(IMDBDef14.PQRY_VARIAZACCER1_RS, 0);
                IMDB.TblLinkRow(IMDBDef14.PQRY_VARIAZACCER1_RS, 0, IMDBDef5.TBL_VARIAZACCERT, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 0, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_CODICE_STRUTTURA, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 1, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NOMOGGCOPICO, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 2, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_CAPITOLO, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 3, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ARTICOLO, 0);
                IMDB.set_Value(IMDBDef14.PQRY_VARIAZACCER1_RS, 4, 0, ((!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_CAPITOLO, 0))))?(new IDVariant("I")):(new IDVariant())));
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 5, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NUMERO_IMP, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 6, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_IMP, 0);
                IMDB.set_Value(IMDBDef14.PQRY_VARIAZACCER1_RS, 7, 0, ((!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NUMERO_IMP, 0))))?(new IDVariant("I")):(new IDVariant())));
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 8, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_DESCRIZIONE, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 9, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_IMPORTO, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 10, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_ANNO_ESIGIBILITA, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 11, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_PROGRESSIVO, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 12, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA, 0);
                IMDB.TblLinkField(IMDBDef14.PQRY_VARIAZACCER1_RS, 13, 0, IMDBDef5.TBL_VARIAZACCERT, IMDBDef5.FLD_VARIAZACCERT_NOMOGGTIPVAR, 0);
              }
            }
          }
        }
      }
      IMDB.TblMoveNext(IMDBDef5.TBL_VARIAZACCERT, 0);
      if (IMDB.Eof(IMDBDef5.TBL_VARIAZACCERT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_VARIAZACCERT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_VARIAZACCER1_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHSCELDEL)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaDel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHINFODEL)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfoDel();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
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
    if (ColIndex.intValue() == PFL_VARIAZACCERT_INFOCAPITOLO)
    {
      this.IdxPanelActived = this.PAN_VARIAZACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZACCERT_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_VARIAZACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
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
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "7C5BDFF6-0D66-448D-8CE5-70791E7EA0E4");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "Delibera");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "80358E6D-069F-4C99-9D88-EFA0E7B8F953");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "-");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "83FDE17D-053C-4B66-935C-640AD7F0B861");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "F4DD73FC-AC80-40C0-A482-EB076EE65B82");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, "DBAA7D69-9EBF-44CE-B3CB-398F951D24D5");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, 0, "info.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "2564BE6C-088E-43D4-837C-4F9F06C825CA");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "Anno Esigibilità");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "CCF26EAA-734F-407C-A7C5-B656E740EE75");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 80, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARS.SetFieldPage(PFL_PARS_DELIBERA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DELIBERA, PPQRY_PARS55, "A.NOMEOGGEDELI", "NOMEOGGEDELI", 5, 255, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 184, 4, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMERODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMERODEL, PPQRY_PARS55, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 6, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 248, 4, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNODEL, PPQRY_PARS55, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 304, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 312, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHSCELDEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHSCELDEL, -1, "", "ETICHSCELDEL", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 312, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 332, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHINFODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHINFODEL, -1, "", "ETICHINFODEL", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 96);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, "Ann. Esig.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 24, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 112);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNOESIGIBI1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNOESIGIBI1, PPQRY_PARS55, "A.NOMOGGANNESI", "NOMOGGANNESI", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 16, 52, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_PROGRUO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PROGRUO, PPQRY_PARS55, "A.NOMEOGGPROUO", "NOMEOGGPROUO", 1, 8, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VARPROUNIORG, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCUO ");
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("group by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("order by 3, 1 ");
    PAN_PARS.SetQuery(PPQRY_VARCOM, 0, SQL, PFL_PARS_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VARPROUNIORG, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCUO ");
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    SQL.append("where (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("group by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("order by 3, 1 ");
    PAN_PARS.SetQuery(PPQRY_VARCOM, 1, SQL, PFL_PARS_PROGRUO, "");
    PAN_PARS.SetQueryDB(PPQRY_VARCOM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS55", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS55, IMDBDef14.PQRY_PARS55_RS, IMDBDef5.TBL_PARS65);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DELIBERA, IMDBDef5.FLD_PARS65_NOMEOGGEDELI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMERODEL, IMDBDef5.FLD_PARS65_NOMOGGNUMDEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNODEL, IMDBDef5.FLD_PARS65_NOMOGGANNDEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNOESIGIBI1, IMDBDef5.FLD_PARS65_NOMOGGANNESI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PROGRUO, IMDBDef5.FLD_PARS65_NOMEOGGPROUO);
    PAN_PARS.SetMasterTable(0, "PARS65");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIAZACCERT_Init()
  {

    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, "A7E7B2CF-BCEE-428F-9881-94DA404C31BC");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, "CAP CODICE STRUTTURA");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, "7CD53336-940A-49B9-8D73-6BF1EDFBFFCC");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, "CODICE PIANO CONTI");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, "A49E9ECE-D9CB-489E-8D0B-BEA337C18C00");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, "Capitolo");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, "0E87ED77-28AE-40E9-BCFA-23D567E5F02C");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, " ");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, "250B08A6-F1C6-4222-8D7D-AB21AC3474F6");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, " ");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, "5C7AEAFC-F1F4-4985-AF38-CBB684E2F588");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, "Accertamento");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, "95F73C30-B330-4810-A1C7-AFAFBA40DAF3");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, " ");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.VIS_HEADNOBORLEF);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, "6382DF29-0299-4882-8D65-063D7434D818");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, " ");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, "72D5724F-54E7-412F-8C04-8C1AB9DE1341");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, "Descrizione Accertamento");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, "0677D934-D472-4FBC-9334-8A4DC9A511D1");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, "01283CB6-4E79-4514-804E-781F60CEB6F1");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, "Importo");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, "65D413DC-DE20-47EB-9785-D7854FCFCE6C");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, "VARACC PROGRESSIVO");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, "A2679920-4A30-41D7-8D42-9F5942BF675E");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, "ACC PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, "121FA892-4190-4756-84F5-AAB30ED15363");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, "TIPO VAR");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, "F10E79E1-F583-4200-A6AA-109F2575350C");
    PAN_VARIAZACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, "");
    PAN_VARIAZACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_VARIAZACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_LIST, 148);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_LIST, "CP. COD. STR.");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPCODICSTRU, MyGlb.PANEL_FORM, "CAP COD. STRUTTURA");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_CAPCODICSTRU, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_CAPCODICSTRU, PPQRY_VARIAZACCER1, "A.CODICE_STRUTTURA", "NOMOGGCACOST", 5, 10, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_LIST, 4, 244, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_LIST, "CODICE PIANO CONTI");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_FORM, 4, 28, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CODIPIANCONT, MyGlb.PANEL_FORM, "CODICE PIANO CONTI");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_CODIPIANCONT, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_CODIPIANCONT, PPQRY_VARIAZACCER1, "A.NOMOGGCOPICO", "NOMOGGCOPICO", 9, 500, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_CAPITOLO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_CAPITOLO, PPQRY_VARIAZACCER1, "A.CAPITOLO", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_LIST, 128, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCARTICO, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_VARACCARTICO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_VARACCARTICO, PPQRY_VARIAZACCER1, "A.ARTICOLO", "NOMOGGVARART", 1, 2, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_LIST, 152, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_FORM, 4, 316, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOCAPITOLO, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_INFOCAPITOLO, -1, -1);
    PAN_VARIAZACCERT.SetFieldUnbound(PFL_VARIAZACCERT_INFOCAPITOLO, true);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_INFOCAPITOLO, PPQRY_VARIAZACCER1, "", "INFOCAPITOLO", 5, 99, 0, -13997);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOCAPITOLO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOCAPITOLO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOCAPITOLO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, 172, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_LIST, "Accert.");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_NUMEROACC, MyGlb.PANEL_FORM, "Accertamento");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_NUMEROACC, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_NUMEROACC, PPQRY_VARIAZACCER1, "A.NUMERO_IMP", "NOMOGGNUMACC", 1, 5, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_LIST, 240, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACANNOACC, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_VARACANNOACC, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_VARACANNOACC, PPQRY_VARIAZACCER1, "A.ANNO_IMP", "NOMOGGANNACC", 1, 4, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 280, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 340, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_INFOACCERTAM, -1, -1);
    PAN_VARIAZACCERT.SetFieldUnbound(PFL_VARIAZACCERT_INFOACCERTAM, true);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_INFOACCERTAM, PPQRY_VARIAZACCER1, "", "INFOACCERTAM", 5, 99, 0, -13997);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZACCERT.SetValueListItem(PFL_VARIAZACCERT_INFOACCERTAM, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_LIST, 300, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione Accertamento");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_FORM, 4, 148, 432, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione Accertamento");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_ACCDESCRIZIO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_ACCDESCRIZIO, PPQRY_VARIAZACCER1, "A.DESCRIZIONE", "NOMOGGACCDES", 5, 140, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 480, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 160);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 196, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_ANNOESIGIBIL, PPQRY_VARIAZACCER1, "A.ANNO_ESIGIBILITA", "NOMOGGANNESI", 1, 4, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, 544, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_IMPORTO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_IMPORTO, PPQRY_VARIAZACCER1, "A.IMPORTO", "NOMEOGGEIMPO", 3, 14, 2, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_LIST, 596, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_LIST, "VAR. PROG.");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_FORM, 4, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_VARACCPROGRE, MyGlb.PANEL_FORM, "VAR. PROGRESSIVO");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_VARACCPROGRE, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_VARACCPROGRE, PPQRY_VARIAZACCER1, "A.PROGRESSIVO", "NOMOGGVARPRO", 3, 10, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, 596, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, 208);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_LIST, "A. P. U. OR.");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, 4, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_ACCPROUNIORG, MyGlb.PANEL_FORM, "ACC PR. UN. ORGANIZ.");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_ACCPROUNIORG, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_ACCPROUNIORG, PPQRY_VARIAZACCER1, "A.PROGR_UNITA_ORGANIZZATIVA", "NOOGACPRUNOR", 1, 8, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_LIST, "TIPO VAR");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVAR, MyGlb.PANEL_FORM, "TIPO VAR");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_TIPOVAR, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_TIPOVAR, PPQRY_VARIAZACCER1, "A.NOMOGGTIPVAR", "NOMOGGTIPVAR", 1, 2, 0, -13997);
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_LIST, 652, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 292, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZACCERT_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZACCERT.SetFieldPage(PFL_VARIAZACCERT_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZACCERT.SetFieldPanel(PFL_VARIAZACCERT_TIPOVARIAZIO, PPQRY_T55, "A.DESCRIZIONE", "T55T56DESCRI", 5, 50, 0, -13997);
  }

  private void PAN_VARIAZACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZACCERT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T55T56DESCRI ");
    SQL.append("from ");
    SQL.append("  T56 A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPVAR~~) ");
    PAN_VARIAZACCERT.SetQuery(PPQRY_T55, 0, SQL, -1, "");
    PAN_VARIAZACCERT.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZACCERT.SetMasterTable(PPQRY_T55, "T56");
    PAN_VARIAZACCERT.SetIMDB(IMDB, "PQRY_VARIAZACCER1", true);
    PAN_VARIAZACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_VARIAZACCERT.SetQueryIMDB(PPQRY_VARIAZACCER1, IMDBDef14.PQRY_VARIAZACCER1_RS, IMDBDef5.TBL_VARIAZACCERT);
    JustLoaded = true;
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_CAPCODICSTRU, IMDBDef5.FLD_VARIAZACCERT_CODICE_STRUTTURA);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_CODIPIANCONT, IMDBDef5.FLD_VARIAZACCERT_NOMOGGCOPICO);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_CAPITOLO, IMDBDef5.FLD_VARIAZACCERT_CAPITOLO);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_VARACCARTICO, IMDBDef5.FLD_VARIAZACCERT_ARTICOLO);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_NUMEROACC, IMDBDef5.FLD_VARIAZACCERT_NUMERO_IMP);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_VARACANNOACC, IMDBDef5.FLD_VARIAZACCERT_ANNO_IMP);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_ACCDESCRIZIO, IMDBDef5.FLD_VARIAZACCERT_DESCRIZIONE);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_ANNOESIGIBIL, IMDBDef5.FLD_VARIAZACCERT_ANNO_ESIGIBILITA);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_IMPORTO, IMDBDef5.FLD_VARIAZACCERT_IMPORTO);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_VARACCPROGRE, IMDBDef5.FLD_VARIAZACCERT_PROGRESSIVO);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_ACCPROUNIORG, IMDBDef5.FLD_VARIAZACCERT_PROGR_UNITA_ORGANIZZATIVA);
    PAN_VARIAZACCERT.SetFieldPrimaryIndex(PFL_VARIAZACCERT_TIPOVAR, IMDBDef5.FLD_VARIAZACCERT_NOMOGGTIPVAR);
    PAN_VARIAZACCERT.SetMasterTable(0, "VARIAZACCERT");
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
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_VARIAZACCERT) PAN_VARIAZACCERT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
