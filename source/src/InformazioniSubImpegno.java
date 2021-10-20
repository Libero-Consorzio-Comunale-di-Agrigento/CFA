// **********************************************
// Informazioni Sub Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniSubImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRVARI_IMPORTONEW = 0;
  private static int PFL_PARAMETRVARI_VISUALIMPORT = 1;

  private static int PPQRY_IMPORTTOTAL3 = 0;


  IDPanel PAN_PARAMETRVARI;
  private static int PAG_SUBIMPEGNO_ESTREMI = 0;
  private static int PAG_SUBIMPEGNO_ALTRIDATI = 1;

  private static int GRP_SUBIMPEGNO_PROVVEDIMENT = 0;
  private static int GRP_SUBIMPEGNO_VOCEPEG = 1;
  private static int GRP_SUBIMPEGNO_IMPEGNO = 2;
  private static int GRP_SUBIMPEGNO_INSERIMENTO = 3;
  private static int GRP_SUBIMPEGNO_AGGIORNAMENT = 4;

  private static int PFL_SUBIMPEGNO_DELIBERA1 = 0;
  private static int PFL_SUBIMPEGNO_NUMERODEL1 = 1;
  private static int PFL_SUBIMPEGNO_ANNODEL1 = 2;
  private static int PFL_SUBIMPEGNO_PROPOSTA1 = 3;
  private static int PFL_SUBIMPEGNO_NUMEROPROPO1 = 4;
  private static int PFL_SUBIMPEGNO_ANNOPROPOST1 = 5;
  private static int PFL_SUBIMPEGNO_TRATTINO4 = 6;
  private static int PFL_SUBIMPEGNO_SLASH = 7;
  private static int PFL_SUBIMPEGNO_SLASH1 = 8;
  private static int PFL_SUBIMPEGNO_TRATTINO3 = 9;
  private static int PFL_SUBIMPEGNO_INFODELIBERE = 10;
  private static int PFL_SUBIMPEGNO_INFOPROPOSTE = 11;
  private static int PFL_SUBIMPEGNO_SPAZIO1 = 12;
  private static int PFL_SUBIMPEGNO_OBBLIGATORIO = 13;
  private static int PFL_SUBIMPEGNO_CAPITOLO1 = 14;
  private static int PFL_SUBIMPEGNO_ARTICOLO1 = 15;
  private static int PFL_SUBIMPEGNO_SPAZIO = 16;
  private static int PFL_SUBIMPEGNO_IMPORTO = 17;
  private static int PFL_SUBIMPEGNO_DESCRIZIONE1 = 18;
  private static int PFL_SUBIMPEGNO_BENEFICIARI1 = 19;
  private static int PFL_SUBIMPEGNO_CGU = 20;
  private static int PFL_SUBIMPEGNO_DATAREG1 = 21;
  private static int PFL_SUBIMPEGNO_CAPITOLO = 22;
  private static int PFL_SUBIMPEGNO_ARTICOLO2 = 23;
  private static int PFL_SUBIMPEGNO_LABESOTTBENE = 24;
  private static int PFL_SUBIMPEGNO_SLASH2 = 25;
  private static int PFL_SUBIMPEGNO_INFOBILANCIO = 26;
  private static int PFL_SUBIMPEGNO_IMPDESCRIZIO = 27;
  private static int PFL_SUBIMPEGNO_NEWPANELLABE = 28;
  private static int PFL_SUBIMPEGNO_NEWPANELABE1 = 29;
  private static int PFL_SUBIMPEGNO_ANNO = 30;
  private static int PFL_SUBIMPEGNO_NUMEROIMPEGN = 31;
  private static int PFL_SUBIMPEGNO_SLASH3 = 32;
  private static int PFL_SUBIMPEGNO_INFOIMPEGNO = 33;
  private static int PFL_SUBIMPEGNO_RICLGESTDESC = 34;
  private static int PFL_SUBIMPEGNO_CODICECOFOG = 35;
  private static int PFL_SUBIMPEGNO_DESCCOFOG = 36;
  private static int PFL_SUBIMPEGNO_CODLIVELLO5 = 37;
  private static int PFL_SUBIMPEGNO_DESCLIVELLOV = 38;
  private static int PFL_SUBIMPEGNO_CODICEEUROPE = 39;
  private static int PFL_SUBIMPEGNO_NUMESUBIPROV = 40;
  private static int PFL_SUBIMPEGNO_ANNOSUBIPROV = 41;
  private static int PFL_SUBIMPEGNO_INFOSOGGETTO = 42;
  private static int PFL_SUBIMPEGNO_CAUSALE1 = 43;
  private static int PFL_SUBIMPEGNO_ZONA = 44;
  private static int PFL_SUBIMPEGNO_FATTORE = 45;
  private static int PFL_SUBIMPEGNO_CENTRO = 46;
  private static int PFL_SUBIMPEGNO_COMPETENZDAL = 47;
  private static int PFL_SUBIMPEGNO_AL = 48;
  private static int PFL_SUBIMPEGNO_IMPUTAECONOM = 49;
  private static int PFL_SUBIMPEGNO_CONTROPAPATR = 50;
  private static int PFL_SUBIMPEGNO_PROGECG4DESC = 51;
  private static int PFL_SUBIMPEGNO_FATTORDESCRI = 52;
  private static int PFL_SUBIMPEGNO_CENTRIDESCRI = 53;
  private static int PFL_SUBIMPEGNO_FATTORDESCR1 = 54;
  private static int PFL_SUBIMPEGNO_SELEZIONNOTE = 55;
  private static int PFL_SUBIMPEGNO_NOTAVUOTA = 56;
  private static int PFL_SUBIMPEGNO_NOTE1 = 57;
  private static int PFL_SUBIMPEGNO_COMUNE = 58;
  private static int PFL_SUBIMPEGNO_PROVINCIA = 59;
  private static int PFL_SUBIMPEGNO_SIGLAPROVINC = 60;
  private static int PFL_SUBIMPEGNO_UTENTEINSERI = 61;
  private static int PFL_SUBIMPEGNO_DATAINSERIME = 62;
  private static int PFL_SUBIMPEGNO_UTENTULTIAGG = 63;
  private static int PFL_SUBIMPEGNO_DATAULTIMAGG = 64;
  private static int PFL_SUBIMPEGNO_CUP = 65;
  private static int PFL_SUBIMPEGNO_CIG = 66;
  private static int PFL_SUBIMPEGNO_DATAREG = 67;
  private static int PFL_SUBIMPEGNO_RESPRESIDUI = 68;
  private static int PFL_SUBIMPEGNO_BENRAGIOSOCI = 69;
  private static int PFL_SUBIMPEGNO_NOTE2 = 70;
  private static int PFL_SUBIMPEGNO_FATTORITIPO = 71;
  private static int PFL_SUBIMPEGNO_TITOLOGIURI1 = 72;
  private static int PFL_SUBIMPEGNO_ANNOSUBIMP1 = 73;
  private static int PFL_SUBIMPEGNO_NUMEROSUBIM1 = 74;

  private static int PPQRY_IMP2 = 0;

  private static int PPQRY_RICLASSIGEST = 1;
  private static int PPQRY_BEN = 2;
  private static int PPQRY_SETTOROPERAT = 3;
  private static int PPQRY_SERVIZOPERAT = 4;
  private static int PPQRY_INTCAPART = 5;
  private static int PPQRY_FATTORI1 = 6;
  private static int PPQRY_CENTRI = 7;
  private static int PPQRY_FATTORI2 = 8;
  private static int PPQRY_COMUNI = 9;
  private static int PPQRY_PROVINCIE = 10;
  private static int PPQRY_PROGETTICG4 = 11;
  private static int PPQRY_COFOG = 12;
  private static int PPQRY_LIVELLOV = 13;
  private static int PPQRY_IMP1 = 14;
  private static int PPQRY_LIVELLOV1 = 15;

  private static int PPQRY_T58 = 16;
  private static int PPQRY_DUAL1 = 17;
  private static int PPQRY_DUAL = 18;


  IDPanel PAN_SUBIMPEGNO;
  private static int PFL_BENEFICIARIO_BENEFICIARIO = 0;

  private static int PPQRY_BENEFICIAR30 = 0;


  IDPanel PAN_BENEFICIARIO;

  // Definition of Global Variables
  private IDVariant SEPROPOANCOR = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI74(IMDB);
    Init_TBL_BENEFICIAR49(IMDB);
    Init_TBL_VALORICAP4(IMDB);
    Init_TBL_PERSONALIZZ4(IMDB);
    Init_TBL_IMPEGNI(IMDB);
    Init_TBL_CONSSVILUPPO(IMDB);
    Init_TBL_PARAMETRVAR4(IMDB);
    //
    //
    Init_PQRY_BENEFICIAR30(IMDB);
    Init_PQRY_BENEFICIAR30_RS(IMDB);
    Init_PQRY_IMPORTTOTAL3(IMDB);
    Init_PQRY_IMPORTTOTAL3_RS(IMDB);
    Init_PQRY_IMP2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI74(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI74, 9);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI74, "TBL_PARAMETRI74");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMUNIORG,1,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, "ROWNAMIMPRES");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMNUMIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, "ROWNAMANSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, "ROWNAMNUSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_RONAANIMPEIN, "RONAANIMPEIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_RONAANIMPEIN,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_RONANUIMPEIN, "RONANUIMPEIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI74,IMDBDef4.FLD_PARAMETRI74_RONANUIMPEIN,5,49,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI74, 0);
  }

  private static void Init_TBL_BENEFICIAR49(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_BENEFICIAR49, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_BENEFICIAR49, "TBL_BENEFICIAR49");
    IMDB.set_FldCode(IMDBDef4.TBL_BENEFICIAR49,IMDBDef4.FLD_BENEFICIAR49_ROWNAMRAGSOC, "ROWNAMRAGSOC");
    IMDB.SetFldParams(IMDBDef4.TBL_BENEFICIAR49,IMDBDef4.FLD_BENEFICIAR49_ROWNAMRAGSOC,5,60,0);
    IMDB.TblAddNew(IMDBDef4.TBL_BENEFICIAR49, 0);
  }

  private static void Init_TBL_VALORICAP4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VALORICAP4, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_VALORICAP4, "TBL_VALORICAP4");
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMETITOL, "ROWNAMETITOL");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMETITOL,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMECATEG,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMCODINT, "ROWNAMCODINT");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMCODINT,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMCODTER, "ROWNAMCODTER");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMCODTER,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMLIV4CA, "ROWNAMLIV4CA");
    IMDB.SetFldParams(IMDBDef4.TBL_VALORICAP4,IMDBDef4.FLD_VALORICAP4_ROWNAMLIV4CA,3,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_VALORICAP4, 0);
  }

  private static void Init_TBL_PERSONALIZZ4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PERSONALIZZ4, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_PERSONALIZZ4, "TBL_PERSONALIZZ4");
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISOBI, "ROWNAMVISOBI");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISOBI,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMPROFIN, "ROWNAMPROFIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMPROFIN,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISZON, "ROWNAMVISZON");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISZON,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMIMPOLD, "ROWNAMIMPOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMIMPOLD,3,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMPRIDOL, "ROWNAMPRIDOL");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMPRIDOL,5,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMCONOLD, "ROWNAMCONOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMCONOLD,5,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMOBIOLD, "ROWNAMOBIOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSONALIZZ4,IMDBDef4.FLD_PERSONALIZZ4_ROWNAMOBIOLD,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PERSONALIZZ4, 0);
  }

  private static void Init_TBL_IMPEGNI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_IMPEGNI, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_IMPEGNI, "TBL_IMPEGNI");
    IMDB.set_FldCode(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMIMPOLD, "ROWNAMIMPOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMIMPOLD,3,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMCONOLD, "ROWNAMCONOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMCONOLD,5,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMPRIDOL, "ROWNAMPRIDOL");
    IMDB.SetFldParams(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMPRIDOL,5,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMOBIOLD, "ROWNAMOBIOLD");
    IMDB.SetFldParams(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMOBIOLD,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMPROUNI, "ROWNAMPROUNI");
    IMDB.SetFldParams(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMPROUNI,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMRIECOL, "ROWNAMRIECOL");
    IMDB.SetFldParams(IMDBDef4.TBL_IMPEGNI,IMDBDef4.FLD_IMPEGNI_ROWNAMRIECOL,5,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_IMPEGNI, 0);
  }

  private static void Init_TBL_CONSSVILUPPO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_CONSSVILUPPO, 1);
    IMDB.set_TblCode(IMDBDef4.TBL_CONSSVILUPPO, "TBL_CONSSVILUPPO");
    IMDB.set_FldCode(IMDBDef4.TBL_CONSSVILUPPO,IMDBDef4.FLD_CONSSVILUPPO_ROWNAMCONSVI, "ROWNAMCONSVI");
    IMDB.SetFldParams(IMDBDef4.TBL_CONSSVILUPPO,IMDBDef4.FLD_CONSSVILUPPO_ROWNAMCONSVI,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_CONSSVILUPPO, 0);
  }

  private static void Init_TBL_PARAMETRVAR4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRVAR4, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRVAR4, "TBL_PARAMETRVAR4");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPNEW, "ROWNAMIMPNEW");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPNEW,3,15,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPVAR, "ROWNAMIMPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPVAR,3,15,2);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMECONTI, "ROWNAMECONTI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMECONTI,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMLASYEA, "ROWNAMLASYEA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMLASYEA,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEDELET, "ROWNAMEDELET");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEDELET,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEESERC,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEINDIC, "ROWNAMEINDIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRVAR4,IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEINDIC,1,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRVAR4, 0);
  }

  private static void Init_PQRY_BENEFICIAR30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_BENEFICIAR30, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_BENEFICIAR30, "PQRY_BENEFICIAR30");
    IMDB.set_FldCode(IMDBDef13.PQRY_BENEFICIAR30,IMDBDef13.PQSL_BENEFICIAR30_ROWNAMRAGSOC, "ROWNAMRAGSOC");
    IMDB.SetFldParams(IMDBDef13.PQRY_BENEFICIAR30,IMDBDef13.PQSL_BENEFICIAR30_ROWNAMRAGSOC,5,60,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_BENEFICIAR30, 0);
  }

  private static void Init_PQRY_BENEFICIAR30_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_BENEFICIAR30_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_BENEFICIAR30_RS, "PQRY_BENEFICIAR30_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_BENEFICIAR30_RS,IMDBDef13.PQSL_BENEFICIAR30_ROWNAMRAGSOC, "ROWNAMRAGSOC");
    IMDB.SetFldParams(IMDBDef13.PQRY_BENEFICIAR30_RS,IMDBDef13.PQSL_BENEFICIAR30_ROWNAMRAGSOC,5,60,0);
  }

  private static void Init_PQRY_IMPORTTOTAL3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMPORTTOTAL3, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMPORTTOTAL3, "PQRY_IMPORTTOTAL3");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPORTTOTAL3,IMDBDef13.PQSL_IMPORTTOTAL3_ROWNAMIMPNEW, "ROWNAMIMPNEW");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPORTTOTAL3,IMDBDef13.PQSL_IMPORTTOTAL3_ROWNAMIMPNEW,3,15,2);
    IMDB.TblAddNew(IMDBDef13.PQRY_IMPORTTOTAL3, 0);
  }

  private static void Init_PQRY_IMPORTTOTAL3_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMPORTTOTAL3_RS, 1);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMPORTTOTAL3_RS, "PQRY_IMPORTTOTAL3_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMPORTTOTAL3_RS,IMDBDef13.PQSL_IMPORTTOTAL3_ROWNAMIMPNEW, "ROWNAMIMPNEW");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMPORTTOTAL3_RS,IMDBDef13.PQSL_IMPORTTOTAL3_ROWNAMIMPNEW,3,15,2);
  }

  private static void Init_PQRY_IMP2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_IMP2, 42);
    IMDB.set_TblCode(IMDBDef13.PQRY_IMP2, "PQRY_IMP2");
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_TITOLO_GIURIDICO, "TITOLO_GIURIDICO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_TITOLO_GIURIDICO,5,60,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COD_IMP_ECO, "COD_IMP_ECO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COD_IMP_ECO,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COMUNE_ZONA, "COMUNE_ZONA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COMUNE_ZONA,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_PROVINCIA_ZONA, "PROVINCIA_ZONA");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_PROVINCIA_ZONA,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_RESPONSABILE_RES, "RESPONSABILE_RES");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_RESPONSABILE_RES,5,40,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_RILEVANTE_ECO, "RILEVANTE_ECO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_RILEVANTE_ECO,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_SUBIMP_OBBLIG, "SUBIMP_OBBLIG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_SUBIMP_OBBLIG,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPCIG, "IMPCIG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPCIG,5,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBCODCOF, "IMPSUBCODCOF");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBCODCOF,1,3,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBCODEUR, "IMPSUBCODEUR");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBCODEUR,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBCODLI5, "IMPSUBCODLI5");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBCODLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPNUMSUBPRO, "IMPNUMSUBPRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPNUMSUBPRO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPANNSUBPRO, "IMPANNSUBPRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPANNSUBPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPDATAREG1, "IMPDATAREG1");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPDATAREG1,6,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBUTEINS, "IMPSUBUTEINS");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBUTEINS,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBDATINS, "IMPSUBDATINS");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBDATINS,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBUTULAG, "IMPSUBUTULAG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBUTULAG,5,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBDAULAG, "IMPSUBDAULAG");
    IMDB.SetFldParams(IMDBDef13.PQRY_IMP2,IMDBDef13.PQSL_IMP2_IMPSUBDAULAG,6,19,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_IMP2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniSubImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniSubImpegno()
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
    FormIdx = MyGlb.FRM_INFORSUBIMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CB70A70F-71B0-41E6-AC9F-A1150856D780";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 892;
    DesignHeight = 662;
    set_Caption(new IDVariant("Informazioni Sub Impegno"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 892;
    Frames[1].Height = 636;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0754717;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 892;
    Frames[2].Height = 48;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Vari";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 48;
    PAN_PARAMETRVARI = new IDPanel(w, this, 2, "PAN_PARAMETRVARI");
    Frames[2].Content = PAN_PARAMETRVARI;
    PAN_PARAMETRVARI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRVARI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 892-MyGlb.PAN_OFFS_X, 48-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRVARI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AAF75CF5-05E3-436D-914D-F10F0BEC99B6");
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 72, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRVARI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRVARI.InitStatus = 2;
    PAN_PARAMETRVARI_Init();
    PAN_PARAMETRVARI_InitFields();
    PAN_PARAMETRVARI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 892;
    Frames[3].Height = 588;
    Frames[3].Caption = "Sub Impegno";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 588;
    PAN_SUBIMPEGNO = new IDPanel(w, this, 3, "PAN_SUBIMPEGNO");
    Frames[3].Content = PAN_SUBIMPEGNO;
    PAN_SUBIMPEGNO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SUBIMPEGNO.VS = MainFrm.VisualStyleList;
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 892-MyGlb.PAN_OFFS_X, 588-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C792DDA5-F24B-45AD-954D-E2E86A6C8271");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 4356, 1240, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SUBIMPEGNO.InitStatus = 2;
    PAN_SUBIMPEGNO_Init();
    PAN_SUBIMPEGNO_InitFields();
    PAN_SUBIMPEGNO_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_SUBIMPEGNO.SetSubFrame(PFL_SUBIMPEGNO_LABESOTTBENE,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Beneficiario";
    Frames[4].Parent = this;
    PAN_BENEFICIARIO = new IDPanel(w, this, 4, "PAN_BENEFICIARIO");
    Frames[4].Content = PAN_BENEFICIARIO;
    PAN_BENEFICIARIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BENEFICIARIO.VS = MainFrm.VisualStyleList;
    PAN_BENEFICIARIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "915E7871-1EE1-4F6B-A765-0E0E085D8BCB");
    PAN_BENEFICIARIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 440, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BENEFICIARIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BENEFICIARIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BENEFICIARIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BENEFICIARIO.InitStatus = 2;
    PAN_BENEFICIARIO_Init();
    PAN_BENEFICIARIO_InitFields();
    PAN_BENEFICIARIO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_ZONAVISIBIL3+BaseCmdLinIdx)
      {
        ZonaVisibile();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ZONA3+BaseCmdLinIdx)
      {
        Zona();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CERTDISUBIM1+BaseCmdLinIdx)
      {
        StampaCertificatoSubimpegno();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI16+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI89+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI16+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_VARIAZIONI3+BaseCmdLinIdx)
      {
        ApriVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FINANZIAMEN2+BaseCmdLinIdx)
      {
        ApriFinanziamenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DISPONIBILI1+BaseCmdLinIdx)
      {
        ApriDisponibilit‡();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ORDINIDISP1+BaseCmdLinIdx)
      {
        ApriBuoniDisp();
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
      if (IMDB.TblModified(IMDBDef4.TBL_BENEFICIAR49, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFORSUBIMPE_BENEFICIAR30();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRVAR4, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INFORSUBIMPE_IMPORTTOTAL3();
      }
      PAN_BENEFICIARIO.UpdatePanel(MainFrm);
      PAN_PARAMETRVARI.UpdatePanel(MainFrm);
      PAN_SUBIMPEGNO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_COMUNI_243 && flRis && IdxPanelActived == PAN_SUBIMPEGNO.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBIMPEGNO_ZONA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_SUBIMPEGNO.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBIMPEGNO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_SUBIMPEGNO.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBIMPEGNO_CENTRO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_SUBIMPEGNO.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBIMPEGNO_CONTROPAPATR) {
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
    return (obj instanceof InformazioniSubImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniSubImpegno.class.getName() : (Glb.ClassWithPackage(InformazioniSubImpegno.class) ? InformazioniSubImpegno.class.getName().substring(InformazioniSubImpegno.class.getPackage().getName().length() + 1) : InformazioniSubImpegno.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Zona Visibile
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ZonaVisibile ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Zona Visibile Body
      // Procedure Body
      // 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "ZonaVisibile", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Zona
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Zona ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Zona Body
      // Procedure Body
      // 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "Zona", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Obiettivo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Obiettivo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOMECOMANDO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Obiettivo Body
      // Procedure Body
      // 
      v_NOMECOMANDO = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("obiettivi")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "Obiettivo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Differenze CF4FDWEB
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DifferenzeCF4FDWEB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Differenze CF4FDWEB Body
      // Procedure Body
      // 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "DifferenzeCF4FDWEB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Esupd
  // Explain which processing is carried out by this procedure
  // Anno Imp - Input
  // Numero Imp - Input
  // **********************************************************************
  public IDVariant ControlloEsupd (IDVariant AnnoImp, IDVariant NumeroImp)
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
      // Controllo Esupd Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  IMP A ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NOT ((A.ANNO_PROPOSTA IS NULL))) ");
      SQL.append("and   ((A.ANNO_DEL IS NULL)) ");
      SQL.append("and   ((A.IMPEGNO_OBBLIG IS NULL)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_CONTATORE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "ControlloEsupd", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_SEDE_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposte
  // Explain which processing is carried out by this procedure
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Caption
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaCaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_RESIDUO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPEGNO = (new IDVariant("Sub-Impegno: ", IDVariant.STRING));
      v_RESIDUO = (new IDVariant("Sub-Residuo: ", IDVariant.STRING));
      // 
      // Setta Caption Body
      // Procedure Body
      // 
      IDVariant v_IMPORTATTUAL = new IDVariant(0,IDVariant.DECIMAL);
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_IMPEGNO, IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0))), (new IDVariant(" "))), (new IDVariant(" / "))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0))), MainFrm.ESERCIZIO));
        Frames[PAN_SUBIMPEGNO.FrIndex].set_Caption((new IDVariant("Impegno")).stringValue());
      }
      else
      {
        set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_RESIDUO, IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0))), (new IDVariant(" "))), (new IDVariant(" / "))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0))), MainFrm.ESERCIZIO));
        Frames[PAN_SUBIMPEGNO.FrIndex].set_Caption((new IDVariant("Residuo")).stringValue());
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.SALDO_INI, 0) + NVL(A.VARIAZIONI, 0) + NVL(A.VARIAZIONI_RES, 0) as NVESI0NVEV0N ");
      SQL.append("from ");
      SQL.append("  ESESUB A ");
      SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_IMPORTATTUAL = QV.Get("NVESI0NVEV0N", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPNEW, 0, new IDVariant(v_IMPORTATTUAL));
      SettaImporto(IMDB.Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPNEW, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SettaCaption", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Campi Cap
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int CampiCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTITOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPCATEGORIA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPINTERVENT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPTERZI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Campi Cap Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.TITOLO, to_number(NULL)) as NULVALCATINU, ");
      SQL.append("  NVL(A.CATEGORIA, to_number(NULL)) as NULVALCACANU, ");
      SQL.append("  NVL(A.COD_INTERVENTO, to_number(NULL)) as NUVACACOINNU, ");
      SQL.append("  NVL(A.COD_TERZI, to_number(NULL)) as NUVACACOTENU ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.E_S = 'S') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPTITOLO = QV.Get("NULVALCATINU", IDVariant.INTEGER) ;
        v_CAPCATEGORIA = QV.Get("NULVALCACANU", IDVariant.INTEGER) ;
        v_CAPINTERVENT = QV.Get("NUVACACOINNU", IDVariant.INTEGER) ;
        v_CAPTERZI = QV.Get("NUVACACOTENU", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_VALORICAP4, IMDBDef4.FLD_VALORICAP4_ROWNAMETITOL, 0, new IDVariant(v_CAPTITOLO));
      IMDB.set_Value(IMDBDef4.TBL_VALORICAP4, IMDBDef4.FLD_VALORICAP4_ROWNAMECATEG, 0, new IDVariant(v_CAPCATEGORIA));
      IMDB.set_Value(IMDBDef4.TBL_VALORICAP4, IMDBDef4.FLD_VALORICAP4_ROWNAMCODINT, 0, new IDVariant(v_CAPINTERVENT));
      IMDB.set_Value(IMDBDef4.TBL_VALORICAP4, IMDBDef4.FLD_VALORICAP4_ROWNAMCODTER, 0, new IDVariant(v_CAPTERZI));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "CampiCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Note
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneNote ()
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
      // Selezione Note Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NOTE, 0), v_ANNOTAZIONI, (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SelezioneNote", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Importo Varimp
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public IDVariant SelezionaImportoVarimp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTOVARIM = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Seleziona Importo Varimp Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(A.IMPORTO) as SUMVARSUIMPO ");
      SQL.append("from ");
      SQL.append("  VARSUB A ");
      SQL.append("where (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_VAR = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGRESSIVO > 0) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_IMPORTOVARIM = QV.Get("SUMVARSUIMPO", IDVariant.DECIMAL) ;
      }
      QV.Close();
      return v_IMPORTOVARIM;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SelezionaImportoVarimp", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Stampa Certificato Subimpegno
  // **********************************************************************
  public int StampaCertificatoSubimpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Certificato Subimpegno Body
      // Procedure Body
      // 
      IDVariant v_NOMECOMANDO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_DATAWINDOW = null;
      v_DATAWINDOW = (new IDVariant("Certificato_Subimpegno"));
      v_NOMECOMANDO = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_DATAWINDOW);
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_SUBIMP")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("NUMERO_SUBIMP")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0)));
      MainFrm.LanciaStampaJasper(v_NOMECOMANDO, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "StampaCertificatoSubimpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importo
  // Explain which processing is carried out by this procedure
  // Valore - Input
  // **********************************************************************
  public int SettaImporto (IDVariant Valore)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPORTO = (new IDVariant("Importo Attuale: ", IDVariant.STRING));
      // 
      // Setta Importo Body
      // Procedure Body
      // 
      PAN_PARAMETRVARI.set_FieldText(PFL_PARAMETRVARI_VISUALIMPORT, IDL.Add(v_IMPORTO, IDL.Format(IDL.NullValue(Valore,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SettaImporto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Esiste Variazione Non Esecutive
  // Explain which processing is carried out by this procedure
  // Capitolo - Input
  // Articolo - Input
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
      SQL.append("  VARCOM B ");
      SQL.append("where (B.E_S = 'S') ");
      SQL.append("and   (B.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((B.ANNO_DEL IS NULL)) ");
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
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "EsisteVariazioneNonEsecutive", _e);
      return new IDVariant();
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Tool Tip Info Sub Imp
  // **********************************************************************
  public int SettaToolTipInfoSubImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Tool Tip Info Sub Imp Body
      // Procedure Body
      // 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_CAPITOLO1,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_CAPITOLO1))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_ARTICOLO1,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_ARTICOLO1))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_RICLGESTDESC,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_RICLGESTDESC))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_IMPDESCRIZIO,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_IMPDESCRIZIO))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_ZONA,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_ZONA))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_PROGECG4DESC,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_PROGECG4DESC))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_FATTORDESCRI,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_FATTORDESCRI))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_CENTRIDESCRI,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_CENTRIDESCRI))).stringValue()); 
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_FATTORDESCR1,(new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_FATTORDESCR1))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SettaToolTipInfoSubImp", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0));
      if (IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Sub Impegno After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento Ë stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. PuÚ valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SUBIMPEGNO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Sub Impegno After Find Event Body
      // Procedure Body
      // 
      SettaCaption();
      if (PAN_SUBIMPEGNO.IsNewRow())
      {
        IMDB.set_Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_D_DATA_REG, 0, IDL.Today());
      }
      AbilitazioneVariazioni();
      Visibilit‡CampiFattoreCentro();
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SubImpegnoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Sub Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SUBIMPEGNO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SUBIMPEGNO);
      // 
      // Sub Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      SettaToolTipInfoSubImp();
      if (IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_CAPITOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ARTICOLO, 0).equals((new IDVariant(0)), true))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NOTE, 0))))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_RILEVANTE_ECO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_PROPOSTA, 0))))
        {
          PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_DEL, 0))))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0))))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_BENEFICIARIO, 0))))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SubImpegnoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Sub Impegno On Change Page Event
  // Evento notificato da pannello multi-pagina al cambiare
  // della pagina corrente.
  // New Page: E' un numero intero che rappresenta il numero della pagina in fase di attivazione. Deve essere confrontato con la propriet‡ Me delle pagine del pannello. - Input
  // Cancel: E' un parametro di uscita booleano. Se lo si imposta a True si impedisce il cambiamento di pagina. - Input/Output
  // **********************************************************************
  private void PAN_SUBIMPEGNO_OnChangePage(IDVariant NewPage,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Sub Impegno On Change Page Event Body
      // Procedure Body
      // 
      if (NewPage.equals((new IDVariant(PAG_SUBIMPEGNO_ALTRIDATI)), true))
      {
        CampiCap();
        IMDB.set_Value(IMDBDef4.TBL_BENEFICIAR49, IMDBDef4.FLD_BENEFICIAR49_ROWNAMRAGSOC, 0, (new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_BENRAGIOSOCI))));
        if (PAN_SUBIMPEGNO.IsNewRow())
        {
          IMDB.set_Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_D_DATA_REG, 0, IDL.Today());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SubImpegnoOnChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Sub Impegno On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_SUBIMPEGNO_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Sub Impegno On Change Row Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_BENEFICIAR49, IMDBDef4.FLD_BENEFICIAR49_ROWNAMRAGSOC, 0, (new IDVariant(PAN_SUBIMPEGNO.FieldText(PFL_SUBIMPEGNO_BENRAGIOSOCI))));
      IMDB.set_Value(IMDBDef4.TBL_VALORICAP4, IMDBDef4.FLD_VALORICAP4_ROWNAMLIV4CA, 0, new IDVariant(MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_CAPITOLO, 0), IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ARTICOLO, 0)),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SubImpegnoOnChangeRowEvent", _e);
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
    IDVariant v_TOOLTIP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TOOLTIP = (new IDVariant("Informazioni su Voce di Bilancio", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_ORDINIDISP = new IDVariant(0,IDVariant.STRING);
      v_ORDINIDISP = (new IDVariant("Ordini Disp."));
      IDVariant v_DISTINTELIQ = new IDVariant(0,IDVariant.STRING);
      v_DISTINTELIQ = (new IDVariant("Distinte Liq."));
      IDVariant v_ORDDISDISLIQ = new IDVariant(0,IDVariant.STRING);
      v_ORDDISDISLIQ = (new IDVariant("Ordini-Disp.-Dist. Liq."));
      PAN_SUBIMPEGNO.set_ToolTip(Glb.OBJ_FIELD,PFL_SUBIMPEGNO_INFOBILANCIO,v_TOOLTIP.stringValue()); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      Pers();
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEINDIC, 0, (new IDVariant(1)));
      PAN_SUBIMPEGNO.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SUBIMPEGNO.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      AutoSaveType = (new IDVariant("DENY")).stringValue();
      SEPROPOANCOR = (new IDVariant(-1));
      MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANZIAMEN2+BaseCmdLinIdx, MainFrm.FINANZIAMENT.booleanValue());
      if (MainFrm.TIPOORDINATI.equals((new IDVariant(3)), true) || MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true) || MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DISPONIBILI1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ORDINIDISP1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        if (MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true) && IDL.IsNull(MainFrm.ATTILIQ))
        {
          MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ORDINIDISP1+BaseCmdLinIdx, new IDVariant(v_ORDINIDISP).stringValue());
        }
        else if (IDL.IsNull(MainFrm.PROCEDUBUONI) && MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
        {
          MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ORDINIDISP1+BaseCmdLinIdx, new IDVariant(v_DISTINTELIQ).stringValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ORDINIDISP1+BaseCmdLinIdx, new IDVariant(v_ORDDISDISLIQ).stringValue());
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DISPONIBILI1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ORDINIDISP1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      if (MainFrm.RESPONSABRES.compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMLASYEA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMECONTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPVAR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPNEW, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISOBI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMPROFIN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISZON, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMIMPOLD, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Pers
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Pers ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOMECOMANDOZ = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECOMANDOO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECOMANDOP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Pers Body
      // Procedure Body
      // 
      v_NOMECOMANDOZ = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("zona")));
      v_NOMECOMANDOO = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("obiettivi")));
      v_NOMECOMANDOP = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("obiettivi")));
      if (v_NOMECOMANDOZ.equals((new IDVariant("zona_visibile")), true))
      {
        ZonaVisibile();
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISZON, 0, (new IDVariant(1)));
      }
      else
      {
        Zona();
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISZON, 0, (new IDVariant(0)));
      }
      if (v_NOMECOMANDOO.equals((new IDVariant("obiettivi_attiva")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISOBI, 0, (new IDVariant(1)));
        if (IMDB.Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISZON, 0).equals((new IDVariant(0)), true))
        {
          if (IMDB.Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISOBI, 0).equals((new IDVariant(1)), true))
          {
            PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMVISOBI, 0, (new IDVariant(0)));
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      v_NOMECOMANDOP = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("proposta_finope")));
      if (v_NOMECOMANDOP.equals((new IDVariant("proposta_finope_attiva")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMPROFIN, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PERSONALIZZ4, IMDBDef4.FLD_PERSONALIZZ4_ROWNAMPROFIN, 0, (new IDVariant("NO")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "Pers", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Se Esistonofinanziamenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean SeEsistonofinanziamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RETVAL = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Se Esistonofinanziamenti Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  FINANZIAMENTI A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        v_RETVAL = (new IDVariant(-1));
      }
      else
      {
        v_RETVAL = (new IDVariant(0));
      }
      return v_RETVAL.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SeEsistonofinanziamenti", _e);
      return false;
    }
  }

  // **********************************************************************
  // Abilitazione Variazioni
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AbilitazioneVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilitazione Variazioni Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "AbilitazioneVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilit‡ Campi Fattore Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Visibilit‡CampiFattoreCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NGE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilit‡ Campi Fattore Centro Body
      // Procedure Body
      // 
      v_RET = new IDVariant(MainFrm.RETVALT99);
      v_NGE = new IDVariant(MainFrm.GESTIOECONOM);
      if (v_NGE.compareTo((new IDVariant(-1)), true)!=0)
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (v_NGE.equals((new IDVariant(2)), true))
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBIMPEGNO.SetFlags (Glb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "Visibilit‡CampiFattoreCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattore
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore Body
      // Procedure Body
      // 
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SelezioneFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Centro
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Centro Body
      // Procedure Body
      // 
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SelezioneCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nota Vuota
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int NotaVuota ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nota Vuota Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "NotaVuota", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Fattore Contropartita
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneFattoreContropartita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Fattore Contropartita Body
      // Procedure Body
      // 
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, );
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "SelezioneFattoreContropartita", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni
  // Explain which processing is carried out by this procedure
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
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEIMPEG, 0, (new IDVariant("INFO")));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMDESUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_DESCRIZIONE, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_VARIAZIONI1, IMDBDef4.FLD_VARIAZIONI1_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_FORMVARISUBI, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "ApriVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Finanziamenti
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriFinanziamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_OPERA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Apri Finanziamenti Body
      // Procedure Body
      // 
      v_OPERA = (new IDVariant());
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI83, IMDBDef4.FLD_PARAMETRI83_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI83, IMDBDef4.FLD_PARAMETRI83_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.OPERA as IMPOPERA ");
      SQL.append("from ");
      SQL.append("  IMP A ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_OPERA = QV.Get("IMPOPERA", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_OPERA)))
      {
        IMDB.set_Value(IMDBDef4.TBL_OPERA8, IMDBDef4.FLD_OPERA8_ROWNAMEOPERA, 0, new IDVariant(v_OPERA));
      }
      MainFrm.Show(MyGlb.FRM_INFFINSUBIMP, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "ApriFinanziamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Disponibilit‡
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriDisponibilit‡ ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Disponibilit‡ Body
      // Procedure Body
      // 
      if (MainFrm.TIPOORDINATI.equals((new IDVariant(3)), true))
      {
        if (MainFrm.UfSubImpGe4Lk(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0)).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMIMSUIM, 0, (new IDVariant("S")));
          MainFrm.Show(MyGlb.FRM_DDISPONIMONO, (new IDVariant(2)).intValue(), this); 
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0));
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMIMSUIM, 0, (new IDVariant("S")));
          MainFrm.Show(MyGlb.FRM_CF4WIMPSDISP, (new IDVariant(2)).intValue(), this); 
        }
      }
      else
      {
        if (MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true))
        {
          if (MainFrm.UfSubImpGe4Lk(IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0)).equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI71, IMDBDef4.FLD_PARAMETRI71_ROWNAMIMSUIM, 0, (new IDVariant("S")));
            MainFrm.Show(MyGlb.FRM_DDISPONIMONO, (new IDVariant(0)).intValue(), this); 
          }
          else
          {
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_IMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_IMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0));
            IMDB.set_Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMIMSUIM, 0, (new IDVariant("S")));
            MainFrm.Show(MyGlb.FRM_CF4WIMPSDISP, (new IDVariant(0)).intValue(), this); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "ApriDisponibilit‡", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Buoni Disp
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriBuoniDisp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Buoni Disp Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI73, IMDBDef4.FLD_PARAMETRI73_ROWNAMANIMSU, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_ANNO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI73, IMDBDef4.FLD_PARAMETRI73_ROWNAMNUIMSU, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_NUMERO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI73, IMDBDef4.FLD_PARAMETRI73_ROWNAMIMSUIM, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_ORDINIDISPOS, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "ApriBuoniDisp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Soggetto
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef13.PQRY_IMP2, IMDBDef13.PQSL_IMP2_BENEFICIARIO, 0));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSubImpegno", "InfoSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Beneficiario
  // Primary record source for panel data
  // **********************************************************************
  private void INFORSUBIMPE_BENEFICIAR30() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_BENEFICIAR30_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_BENEFICIAR49, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_BENEFICIAR49, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_BENEFICIAR30_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_BENEFICIAR30_RS, 0, IMDBDef4.TBL_BENEFICIAR49, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_BENEFICIAR30_RS, 0, 0, IMDBDef4.TBL_BENEFICIAR49, IMDBDef4.FLD_BENEFICIAR49_ROWNAMRAGSOC, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_BENEFICIAR49, 0);
      if (IMDB.Eof(IMDBDef4.TBL_BENEFICIAR49, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_BENEFICIAR49, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_BENEFICIAR30_RS, 0);
  }

  // **********************************************************************
  // Importo Totale
  // Primary record source for panel data
  // **********************************************************************
  private void INFORSUBIMPE_IMPORTTOTAL3() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_IMPORTTOTAL3_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRVAR4, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRVAR4, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_IMPORTTOTAL3_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_IMPORTTOTAL3_RS, 0, IMDBDef4.TBL_PARAMETRVAR4, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_IMPORTTOTAL3_RS, 0, 0, IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPNEW, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRVAR4, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRVAR4, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRVAR4, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_IMPORTTOTAL3_RS, 0);
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
  private void PAN_PARAMETRVARI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRVARI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRVARI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRVARI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRVARI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRVARI);
    // Stub
  }

  private void PAN_PARAMETRVARI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRVARI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRVARI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRVARI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SUBIMPEGNO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SUBIMPEGNO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SUBIMPEGNO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SUBIMPEGNO, Cancel);
    // Stub
  }

  private void PAN_SUBIMPEGNO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_INFODELIBERE)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_INFOPROPOSTE)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_INFOBILANCIO)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_INFOSOGGETTO)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetto();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_ZONA)
    {
      IdxPanelActived = PAN_SUBIMPEGNO.FrIndex;
      IdxFieldActived = ColIndex.intValue();
        MainFrm.Show(MyGlb.FRM_COMUNI_243, 1, this);
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneFattoreContropartita();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_SELEZIONNOTE)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneNote();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPEGNO_NOTAVUOTA)
    {
      this.IdxPanelActived = this.PAN_SUBIMPEGNO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneNote();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SUBIMPEGNO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SUBIMPEGNO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SUBIMPEGNO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_BENEFICIARIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BENEFICIARIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BENEFICIARIO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BENEFICIARIO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet‡ visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BENEFICIARIO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_BENEFICIARIO);
    // Stub
  }

  private void PAN_BENEFICIARIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BENEFICIARIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BENEFICIARIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BENEFICIARIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BENEFICIARIO_Init()
  {

    PAN_BENEFICIARIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BENEFICIARIO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BENEFICIARIO.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_BENEFICIARIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, "DB0E37EE-5959-47D9-9083-38DAEC643E35");
    PAN_BENEFICIARIO.set_Header(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, "Beneficiario");
    PAN_BENEFICIARIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, "Beneficiario");
    PAN_BENEFICIARIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_BENEFICIARIO.SetFlags(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_BENEFICIARIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BENEFICIARIO.SetRect(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 440, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BENEFICIARIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_LIST, 84);
    PAN_BENEFICIARIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_BENEFICIARIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_BENEFICIARIO.SetRect(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_FORM, 12, 0, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BENEFICIARIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_FORM, 76);
    PAN_BENEFICIARIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_BENEFICIARIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BENEFICIARIO_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_BENEFICIARIO.SetFieldPage(PFL_BENEFICIARIO_BENEFICIARIO, -1, -1);
    PAN_BENEFICIARIO.SetFieldPanel(PFL_BENEFICIARIO_BENEFICIARIO, PPQRY_BENEFICIAR30, "A.ROWNAMRAGSOC", "ROWNAMRAGSOC", 5, 60, 0, -13997);
  }

  private void PAN_BENEFICIARIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_BENEFICIARIO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_BENEFICIARIO.SetIMDB(IMDB, "PQRY_BENEFICIAR30", true);
    PAN_BENEFICIARIO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_BENEFICIARIO.SetQueryIMDB(PPQRY_BENEFICIAR30, IMDBDef13.PQRY_BENEFICIAR30_RS, IMDBDef4.TBL_BENEFICIAR49);
    JustLoaded = true;
    PAN_BENEFICIARIO.SetFieldPrimaryIndex(PFL_BENEFICIARIO_BENEFICIARIO, IMDBDef4.FLD_BENEFICIAR49_ROWNAMRAGSOC);
    PAN_BENEFICIARIO.SetMasterTable(0, "BENEFICIAR49");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_BENEFICIARIO.Status() == 2)
    {
      int oldListQBE = PAN_BENEFICIARIO.iUseListQBE;
      PAN_BENEFICIARIO.iUseListQBE = 0;
      PAN_BENEFICIARIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_BENEFICIARIO.PanelCommand(Glb.PCM_FIND);
      PAN_BENEFICIARIO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRVARI_Init()
  {

    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, "00744476-211B-4778-B725-8FDBE2C8D463");
    PAN_PARAMETRVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, "Importo New");
    PAN_PARAMETRVARI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, "");
    PAN_PARAMETRVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAMETRVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRVARI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, "D2BABAEE-6A49-46C8-A136-1E229CB616D1");
    PAN_PARAMETRVARI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, "Importo");
    PAN_PARAMETRVARI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARAMETRVARI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRVARI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_LIST, "Importo New");
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_FORM, 16, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRVARI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_IMPORTONEW, MyGlb.PANEL_FORM, "Importo New");
    PAN_PARAMETRVARI.SetFieldPage(PFL_PARAMETRVARI_IMPORTONEW, -1, -1);
    PAN_PARAMETRVARI.SetFieldPanel(PFL_PARAMETRVARI_IMPORTONEW, PPQRY_IMPORTTOTAL3, "A.ROWNAMIMPNEW", "ROWNAMIMPNEW", 3, 15, 2, -13997);
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_LIST, 192, 8, 160, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRVARI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_FORM, 536, 4, 250, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRVARI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRVARI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRVARI_VISUALIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRVARI.SetFieldPage(PFL_PARAMETRVARI_VISUALIMPORT, -1, -1);
    PAN_PARAMETRVARI.SetFieldPanel(PFL_PARAMETRVARI_VISUALIMPORT, -1, "", "VISUALIMPORT", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRVARI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRVARI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRVARI.SetIMDB(IMDB, "PQRY_IMPORTTOTAL3", true);
    PAN_PARAMETRVARI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRVARI.SetQueryIMDB(PPQRY_IMPORTTOTAL3, IMDBDef13.PQRY_IMPORTTOTAL3_RS, IMDBDef4.TBL_PARAMETRVAR4);
    JustLoaded = true;
    PAN_PARAMETRVARI.SetFieldPrimaryIndex(PFL_PARAMETRVARI_IMPORTONEW, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMIMPNEW);
    PAN_PARAMETRVARI.SetMasterTable(0, "PARAMETRVAR4");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_PARAMETRVARI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRVARI.iUseListQBE;
      PAN_PARAMETRVARI.iUseListQBE = 0;
      PAN_PARAMETRVARI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRVARI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRVARI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SUBIMPEGNO_Init()
  {

    PAN_SUBIMPEGNO.SetSize(MyGlb.OBJ_PAGE, 2);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ESTREMI, "A882C10D-491B-4603-ABBD-921E7F7E80CD");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ESTREMI, "Estremi");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ESTREMI, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ESTREMI, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ESTREMI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ALTRIDATI, "CA4A64CF-4558-4A6D-BB2F-6D4E222F1E26");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ALTRIDATI, "Altri Dati");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ALTRIDATI, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ALTRIDATI, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_PAGE, PAG_SUBIMPEGNO_ALTRIDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBIMPEGNO.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, "BEDD4656-7D0B-4B5C-838E-81B39E1C8514");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, "Provvedimento");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 160, 616, 56, 0, 0);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, 0, 87);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, 1, 13);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, 0, 4);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, 1, 1);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, "BD36C7F0-1E5A-40BC-BC6C-6E1904EC6E33");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, "Capitolo/Art.");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, MyGlb.PANEL_LIST, 0, -9999, 356, 16, 0, 0);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, MyGlb.PANEL_FORM, 8, 75, 616, 77, 0, 0);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, 0, 60);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, 1, 13);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, 0, 4);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, 1, 4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, "728C26DC-2F9A-4367-ADD9-7B40233DA5EC");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, "Impegno");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 356, 16, 0, 0);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, MyGlb.PANEL_FORM, 8, 15, 616, 53, 0, 0);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, 0, 51);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, 1, 13);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, 0, 4);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, 1, 4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, "43BD68F4-B528-4ADF-BAA0-995344270057");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, "Inserimento");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, MyGlb.PANEL_LIST, 0, -9999, 128, 16, 0, 0);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, MyGlb.PANEL_FORM, 16, 267, 332, 49, 0, 0);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, 0, 70);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, 1, 13);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, 0, 4);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, 1, 4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, "B0FEB24A-891E-4D10-B191-C86CE128C254");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, "Aggiornamento");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, MyGlb.PANEL_LIST, 0, -9999, 124, 16, 0, 0);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, MyGlb.PANEL_FORM, 372, 267, 332, 49, 0, 0);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, 0, 88);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, 1, 13);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, 0, 4);
    PAN_SUBIMPEGNO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, 1, 4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBIMPEGNO_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBIMPEGNO.SetSize(MyGlb.OBJ_FIELD, 75);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, "BC9D580E-D77A-4472-A07E-4AB03A00A6A4");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, "Delibera");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, "Delibera - Sede del");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, "7CA1165A-B303-4698-91AF-DCA185EFE329");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, "NUMERO DEL");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, "FEAD7C6A-1318-4B70-9735-2FF6869D9925");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, "ANNO DEL");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, "Anno delibera");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, "839AFDAE-438E-430C-95B1-FD5839C39BF8");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, "Proposta");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, "Unita Proponente");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, "E3AFD438-567B-4A0A-8471-D6062133C6F8");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, "NUMERO PROPOSTA");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, "Numero Proposta");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, "23AE2FDE-5A0A-4C8A-AD86-D1D017F391C3");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, "ANNO PROPOSTA");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, "Anno Proposta");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, "2F14A7D4-950D-48FC-8FCF-A4A569943D40");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, "-");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, "9EE2C0BC-E7D9-417F-9419-38C5F11F1203");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, "/");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, "DE1435B2-51C0-415B-BEF8-C9B805C4E772");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, "/");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, "C0EC0491-781D-4D68-AB41-89C7642BFB17");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, "-");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, "C062C9D0-DA5C-4F52-BB76-5E3734E27BD1");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, MyGlb.VIS_STATICBUTTON);
    PAN_SUBIMPEGNO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, 0, "info.gif", false);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, "ABE2F2EC-C1BF-46FA-A551-21AE22D08622");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, MyGlb.VIS_STATICBUTTON);
    PAN_SUBIMPEGNO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, 0, "info.gif", false);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, "69D69E43-CC9D-4F5E-A5CE-8F670078ADD6");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, MyGlb.VIS_SFONEBORDTRA);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, "1F0E3F14-FA33-431E-B42D-96656377C76A");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, "Obbligatorio");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.VIS_CHECKSTYLE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, "BC3D3A81-BB73-41AA-B9A9-67574B81A758");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, "Capitolo");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, "Capitolo");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, "90044525-FC1B-4A68-AB93-D886E5A948AC");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, "Articolo");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, "Articolo");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, "61EB0CD1-BD71-4ED1-B7AC-96541F7F9047");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, MyGlb.VIS_SFONEBORDTRA);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, "9DA8035C-65EC-46A3-B6C1-5BB12A778319");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, "Importo");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, "Importo Iniziale dell'impegno");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, "B22031D5-140D-446B-9B92-88EA85237B54");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, "Descrizione");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, "Descrizione");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, "A48D7708-276C-4C27-8EC7-975F0F9352DD");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, "BENEFICIARIO");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, "Codice Beneficiario");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, "2344717F-D2DC-4302-9E62-E486BB413EC4");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, "Cgu");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, "Codice gestionale");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, "84DE0943-7BF0-4016-8803-885589139674");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, "Data Reg");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, "6EF9FAD0-57F0-40BB-8E1B-C74920DCB31B");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, "CAPITOLO");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, "38A548B0-0D0E-400D-91E9-3C127182E3AC");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, "ARTICOLO");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, "5F63AC4C-0810-4EB2-964B-AD415D88C408");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, "Text to show here");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, "FC030794-F7F7-46C6-A25F-4E96B2AF6728");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, "/");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, "A7F515D7-7F91-49BB-931B-7E95E43E3343");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, MyGlb.VIS_STATICBUTTON);
    PAN_SUBIMPEGNO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, 0, "info.gif", false);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, "FB26016F-40E3-4D1C-BF56-E69C8A2FBA9D");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, "IMP DESCRIZIONE");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, "809B43E4-4242-4AB1-A415-0570A1F73661");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, "BD313EB7-D835-481D-AA3B-73338E4A5309");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, "2D054522-D323-4193-A538-AF60642DB591");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, "Anno");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, "Anno Residuo");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, "99C81FE7-7DD4-48F7-B54E-80C27C7548F4");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, "Numero Impegno");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, "Numero Impegno");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, "8534B972-C723-43F8-A921-3F718B991489");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, "/");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, "E68FB09E-3CE8-424B-8785-37FE620174A0");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_SUBIMPEGNO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, 0, "info.gif", false);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, "1DFCD425-5CDD-4124-A1E3-8BF0344DD5B5");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, "RICLASSIFICAZIONI GEST Descrizione");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, "F04BC780-E3F9-429B-B2DA-B26953AC04B0");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, "Cod. Cofog");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, "496C1CF0-A447-44AB-972A-B8F7EEE78BB0");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, "DESC COFOG");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, "D7CBCCCB-651F-4C19-8A17-6BE2B1AD0F39");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, "Cod. V livello");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, "28F1939F-5D00-47E0-9406-83A88F5623F5");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, "DESC LIVELLO V");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, "1B12F7C3-011C-4112-8485-CC1B99F6C6C0");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, "Cod. Europeo");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, "F2AB1B49-62B1-4B1A-A9B2-854FC91F7E91");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, "Subimp. Provenienza");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, "8E3A7C0D-375D-4614-884D-40D8C343D83D");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, "/");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, "36777FBE-2575-4294-8DB5-2EB2C624574C");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SUBIMPEGNO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, 0, "info.gif", false);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, "53ACB09F-1EAF-48EB-8C1D-A9457BD853A3");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, "Causale");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, "Causale");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, "79ABB30A-D05A-4968-A8F6-73AB3CE33444");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, "Zona");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, "Denominazione del Comune <NLS>");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, "BB6DB0AC-3FCE-44EE-84AB-5933C2F40145");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, "Fattore");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, "fattore");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, "44C3FBFB-486D-477D-AB94-9192D55563AE");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, "Centro");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, "B13CFF3F-EB1D-46DE-A72B-9C7285B55594");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, "Competenza dal");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, "37E18D18-3DD0-465F-A185-891A2E171A37");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, "al");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, "E06F5F85-61A7-46CE-BE69-0A2587AE4FB7");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, "Imputazione Economica");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, "92AED31E-415D-429E-AAEB-1C7C5AB45328");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, "Contropartita Patr.");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, "E4830588-359E-4EE0-A270-DB7EF985A248");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, "PROGETTI CG4 DESCRIZIONE");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, "Descrizione");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, "00BACE47-8882-4EEB-A59A-63B61DA695A3");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, "E0112D97-9AD0-4240-80AD-0CB68D281669");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, "1C8D0E02-A8D4-4D8B-9A06-7FBAB833BFE1");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, "FATTORI DESCRIZIONE 1");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, "DAB2F17D-B51E-4D62-B754-AD5F97AB814C");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, MyGlb.VIS_STATICBUTTON);
    PAN_SUBIMPEGNO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, 0, "nota scritta.gif", false);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, "0E236D82-8296-4418-BC20-5CC734422534");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, MyGlb.VIS_STATICBUTTON);
    PAN_SUBIMPEGNO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, 0, "nota bianca.gif", false);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, "763F9647-BD8D-455D-BBF9-6FAFC055644E");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, "Note");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, "72336F0A-A8F1-4279-A206-15A4BFC6B6EC");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, "Comune");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, "B74167D9-087B-4CE2-9A84-2EB1FAE75011");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, "Provincia");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, "593D018B-46A8-4475-842C-1D57233D2050");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, "FD0E35F3-4457-40A2-8807-BE87B6B976B3");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, "Utente");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, "F59D62D6-589D-4121-B151-3A0ECB279E86");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, "Data");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, "3357A7AF-FDF0-4A72-A0A0-77EC0F7DAB08");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, "Utente");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, "64611BAD-9E0D-4706-8EFC-EDC63AE8B351");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, "Data");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, "C6AF6CBE-1D48-4B91-96F0-54F6EF0C82A0");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, "Cup");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, "83A27D26-2157-4389-B913-11AAE5ABF017");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, "Cig");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, "CA99A9A9-51EB-4565-8F93-F8BF8627C66C");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, "Data Reg.");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, "051F321D-3B7E-4FA0-BD89-EA13CDE6A6A0");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, "Resp. Residui");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, "41CCF9F7-5266-43E5-AFF5-5CE511C406DA");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, "BEN RAGIONE SOCIALE");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.VIS_LOOKUPFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, 0, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, "7A8EEC9F-4861-4156-AA10-78379CF058F7");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, "NOTE");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, "BEA4E4F8-2086-480A-9457-038268BCAB67");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, "FATTORI TIPO");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, "F27B7C35-A588-4D3A-B214-BDC71F9E2433");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, "TITOLO GIURIDICO");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.VIS_NORMFIELPADR);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, "6F9A701A-C671-4631-80C1-97BEF17C58B0");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, "ANNO SUBIMP");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SUBIMPEGNO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, "B98D612B-A22D-4EE5-B0A7-3E72F3684AA4");
    PAN_SUBIMPEGNO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, "NUMERO SUBIMP");
    PAN_SUBIMPEGNO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, "");
    PAN_SUBIMPEGNO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SUBIMPEGNO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_SUBIMPEGNO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_LIST, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_LIST, "Delib.");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_FORM, 32, 164, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DELIBERA1, MyGlb.PANEL_FORM, "Delibera");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DELIBERA1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DELIBERA1, PPQRY_IMP2, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_FORM, 156, 164, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMERODEL1, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NUMERODEL1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NUMERODEL1, PPQRY_IMP2, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_FORM, 224, 164, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNODEL1, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ANNODEL1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ANNODEL1, PPQRY_IMP2, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_LIST, 112);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_LIST, "Proposta");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_FORM, 300, 164, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROPOSTA1, MyGlb.PANEL_FORM, "Proposta");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_PROPOSTA1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_PROPOSTA1, PPQRY_IMP2, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_LIST, 108);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_LIST, "NUM. PROPOSTA");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_FORM, 496, 164, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_FORM, 108);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROPROPO1, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NUMEROPROPO1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NUMEROPROPO1, PPQRY_IMP2, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_LIST, 96);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_LIST, "ANN. PROPOSTA");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_FORM, 560, 164, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_FORM, 96);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOPROPOST1, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ANNOPROPOST1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ANNOPROPOST1, PPQRY_IMP2, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, MyGlb.PANEL_LIST, 112, 120, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, MyGlb.PANEL_FORM, 476, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO4, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_TRATTINO4, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_TRATTINO4, -1, "", "TRATTINO4", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, MyGlb.PANEL_LIST, 112, 120, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, MyGlb.PANEL_FORM, 204, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SLASH, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, MyGlb.PANEL_LIST, 120, 128, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, MyGlb.PANEL_FORM, 540, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SLASH1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SLASH1, -1, "", "SLASH1", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, MyGlb.PANEL_LIST, 104, 112, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, MyGlb.PANEL_FORM, 136, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TRATTINO3, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_TRATTINO3, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_TRATTINO3, -1, "", "TRATTINO3", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, MyGlb.PANEL_LIST, 252, 56, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, MyGlb.PANEL_FORM, 260, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFODELIBERE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_INFODELIBERE, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_INFODELIBERE, -1, "", "INFODELIBERE", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, MyGlb.PANEL_FORM, 596, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOPROPOSTE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_INFOPROPOSTE, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_INFOPROPOSTE, -1, "", "INFOPROPOSTE", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, MyGlb.PANEL_LIST, 324, 128, 116, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, MyGlb.PANEL_FORM, 608, 192, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SPAZIO1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SPAZIO1, -1, "", "SPAZIO1", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_LIST, 84);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_LIST, "Obbligatorio");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_FORM, 12, 192, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_OBBLIGATORIO, MyGlb.PANEL_FORM, "Obbligatorio");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_OBBLIGATORIO, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_PROVVEDIMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_OBBLIGATORIO, PPQRY_IMP2, "A.SUBIMP_OBBLIG", "SUBIMP_OBBLIG", 5, 2, 0, -13997);
    PAN_SUBIMPEGNO.SetValueListItem(PFL_SUBIMPEGNO_OBBLIGATORIO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SUBIMPEGNO.SetValueListItem(PFL_SUBIMPEGNO_OBBLIGATORIO, (new IDVariant()), "Null", "", "", -1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_LIST, 100);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_FORM, 12, 104, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CAPITOLO1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_VOCEPEG);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CAPITOLO1, PPQRY_INTCAPART, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0)", "CAPCAPITOLO", 5, 99, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_LIST, 100);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_FORM, 36, 128, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_FORM, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ARTICOLO1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_VOCEPEG);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ARTICOLO1, PPQRY_INTCAPART, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~)", "CAPARTICOLO", 5, 99, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, MyGlb.PANEL_LIST, 316, 120, 116, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, MyGlb.PANEL_FORM, 608, 100, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SPAZIO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SPAZIO, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_VOCEPEG);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SPAZIO, -1, "", "SPAZIO", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_FORM, 696, 16, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_IMPORTO, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_IMPORTO, PPQRY_IMP2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_FORM, 16, 228, 608, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_FORM, 76);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DESCRIZIONE1, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DESCRIZIONE1, PPQRY_IMP2, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_LIST, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_LIST, "BENEFIC.");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_FORM, 544, 280, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENEFICIARI1, MyGlb.PANEL_FORM, "BENEFIC.");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_BENEFICIARI1, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_BENEFICIARI1, PPQRY_IMP2, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_LIST, 112);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_FORM, 56, 332, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_FORM, 36);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CGU, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CGU, PPQRY_IMP2, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_LIST, 68);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_LIST, "Data Reg");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_FORM, 32, 428, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG1, MyGlb.PANEL_FORM, "Data Reg");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DATAREG1, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DATAREG1, PPQRY_IMP2, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_LIST, 8, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_FORM, 96, 80, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CAPITOLO, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CAPITOLO, PPQRY_IMP2, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_LIST, "ARTIC.");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_FORM, 256, 80, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ARTICOLO2, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ARTICOLO2, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ARTICOLO2, PPQRY_IMP2, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, MyGlb.PANEL_LIST, 28, 48, 356, 80, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, MyGlb.PANEL_LIST, 6);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, MyGlb.PANEL_FORM, 4, 280, 536, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_LABESOTTBENE, MyGlb.PANEL_FORM, 3);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_LABESOTTBENE, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_LABESOTTBENE, -1, "", "LABESOTTBENE", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, MyGlb.PANEL_LIST, 120, 128, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, MyGlb.PANEL_FORM, 236, 80, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH2, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SLASH2, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SLASH2, -1, "", "SLASH2", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, MyGlb.PANEL_FORM, 284, 84, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOBILANCIO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_INFOBILANCIO, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_INFOBILANCIO, -1, "", "INFOBILANCIO", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_LIST, "IMP DESCRIZIONE");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_FORM, 96, 44, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPDESCRIZIO, MyGlb.PANEL_FORM, "IMP DESCR.");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_IMPDESCRIZIO, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_IMPEGNO);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_IMPDESCRIZIO, PPQRY_IMP1, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, MyGlb.PANEL_LIST, 280, 204, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, MyGlb.PANEL_FORM, 608, 40, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NEWPANELLABE, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_IMPEGNO);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, MyGlb.PANEL_LIST, 288, 212, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, MyGlb.PANEL_FORM, 12, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NEWPANELABE1, PAG_SUBIMPEGNO_ESTREMI, GRP_SUBIMPEGNO_IMPEGNO);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_LIST, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_FORM, 160, 20, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_FORM, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ANNO, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ANNO, PPQRY_IMP2, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 72);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_LIST, "Numero Impegno");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 96, 20, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 72);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROIMPEGN, MyGlb.PANEL_FORM, "Num. Imp.");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NUMEROIMPEGN, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NUMEROIMPEGN, PPQRY_IMP2, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, MyGlb.PANEL_LIST, 128, 136, 32, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, MyGlb.PANEL_FORM, 140, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SLASH3, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SLASH3, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SLASH3, -1, "", "SLASH3", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, MyGlb.PANEL_LIST, 268, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, MyGlb.PANEL_FORM, 204, 24, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_INFOIMPEGNO, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_LIST, 192);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_LIST, "RICLASSIFICAZIONI GEST Descrizione");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_FORM, 168, 332, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_FORM, 192);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RICLGESTDESC, MyGlb.PANEL_FORM, "RICLASSIF. GEST Descrizione");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_RICLGESTDESC, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_RICLGESTDESC, PPQRY_RICLASSIGEST, "B.DESCRIZIONE", "RICLGESTDESC", 5, 200, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_LIST, "Cod. Cofog");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_FORM, 0, 356, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICECOFOG, MyGlb.PANEL_FORM, "Cod. Cofog");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CODICECOFOG, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CODICECOFOG, PPQRY_IMP2, "A.CODICE_COFOG", "IMPSUBCODCOF", 1, 3, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_LIST, 220);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_LIST, "DESC COFOG");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_FORM, 168, 356, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_FORM, 220);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCCOFOG, MyGlb.PANEL_FORM, "DESC COFOG");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DESCCOFOG, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DESCCOFOG, PPQRY_COFOG, "A.DESCRIZIONE", "NOOGVISTRIDE", 5, 300, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 380, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CODLIVELLO5, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CODLIVELLO5, PPQRY_IMP2, "A.COD_LIVELLO_5", "IMPSUBCODLI5", 3, 10, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_LIST, 220);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_LIST, "DESC LIVELLO V");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_FORM, 168, 380, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_FORM, 220);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DESCLIVELLOV, MyGlb.PANEL_FORM, "DESC LIVELLO V");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DESCLIVELLOV, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DESCLIVELLOV, PPQRY_LIVELLOV, "A.DESCRIZIONE", "NOOGVISTRIDE", 5, 300, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_FORM, -12, 404, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CODICEEUROPE, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CODICEEUROPE, PPQRY_IMP2, "A.CODICE_EUROPEO", "IMPSUBCODEUR", 1, 1, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_LIST, 0, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_LIST, 184);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_LIST, "Subimp. Provenienza");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_FORM, 628, 44, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_FORM, 128);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMESUBIPROV, MyGlb.PANEL_FORM, "Subimp. Provenienza");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NUMESUBIPROV, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NUMESUBIPROV, PPQRY_IMP2, "A.NUMERO_SUBIMP_PROVENIENZA", "IMPNUMSUBPRO", 1, 5, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_LIST, 164);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_LIST, "/");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_FORM, 808, 44, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_FORM, 16);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIPROV, MyGlb.PANEL_FORM, "/");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ANNOSUBIPROV, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ANNOSUBIPROV, PPQRY_IMP2, "A.ANNO_SUBIMP_PROVENIENZA", "IMPANNSUBPRO", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, MyGlb.PANEL_LIST, 636, 284, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, MyGlb.PANEL_FORM, 628, 284, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_INFOSOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_INFOSOGGETTO, PAG_SUBIMPEGNO_ESTREMI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_INFOSOGGETTO, -1, "", "INFOSOGGETTO", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_LIST, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_LIST, "Causale");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_FORM, 68, 40, 524, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_FORM, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CAUSALE1, MyGlb.PANEL_FORM, "Causale");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CAUSALE1, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CAUSALE1, PPQRY_IMP2, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_LIST, 140);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_LIST, "Zona");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_FORM, 84, 64, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_FORM, 40);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ZONA, MyGlb.PANEL_FORM, "Zona");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ZONA, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ZONA, PPQRY_COMUNI, "A.DENOMINAZIONE", "COMUNIDENOMI", 5, 40, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_FORM, 68, 88, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_FATTORE, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_FATTORE, PPQRY_IMP2, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_FORM, 72, 112, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CENTRO, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CENTRO, PPQRY_IMP2, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza dal");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_FORM, 24, 136, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza dal");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_COMPETENZDAL, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_COMPETENZDAL, PPQRY_IMP2, "A.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_LIST, 92);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_LIST, "al");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_FORM, 212, 136, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_FORM, 20);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_AL, MyGlb.PANEL_FORM, "al");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_AL, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_AL, PPQRY_IMP2, "A.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_LIST, 88);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_LIST, "Imputazione Economica");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_FORM, 320, 136, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_FORM, 112);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imput. Economica");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_IMPUTAECONOM, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_IMPUTAECONOM, PPQRY_IMP2, "A.RILEVANTE_ECO", "RILEVANTE_ECO", 5, 2, 0, -13997);
    PAN_SUBIMPEGNO.SetValueListItem(PFL_SUBIMPEGNO_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SUBIMPEGNO.SetValueListItem(PFL_SUBIMPEGNO_IMPUTAECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_LIST, 76);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_LIST, "Controp. Patr");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_FORM, 8, 160, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_FORM, 116);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CONTROPAPATR, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CONTROPAPATR, PPQRY_IMP2, "A.COD_IMP_ECO", "COD_IMP_ECO", 5, 8, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_LIST, 152);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_LIST, "PROGETTI CG4 DESCRIZIONE");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_FORM, 212, 64, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_FORM, 152);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROGECG4DESC, MyGlb.PANEL_FORM, "PROG. CG4 DESCRIZIONE");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_PROGECG4DESC, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_PROGECG4DESC, PPQRY_PROGETTICG4, "A.DESCRIZIONE", "PROGECG4DESC", 5, 140, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_FORM, 212, 88, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_FATTORDESCRI, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_FATTORDESCRI, PPQRY_FATTORI1, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_FORM, 212, 112, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CENTRIDESCRI, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_LIST, 124);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE 1");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_FORM, 212, 160, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_FORM, 124);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORDESCR1, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE 1");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_FATTORDESCR1, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_FATTORDESCR1, PPQRY_FATTORI2, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, MyGlb.PANEL_FORM, 576, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SELEZIONNOTE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SELEZIONNOTE, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SELEZIONNOTE, -1, "", "SELEZIONNOTE", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, MyGlb.PANEL_LIST, 572, 32, 24, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, MyGlb.PANEL_FORM, 576, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTAVUOTA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NOTAVUOTA, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NOTAVUOTA, -1, "", "NOTAVUOTA", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, MyGlb.PANEL_LIST, 612, 48, 64, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, MyGlb.PANEL_FORM, 536, 16, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NOTE1, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NOTE1, -1, "", "NOTE1", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_LIST, 84);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_LIST, "Comune");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_FORM, 4, 432, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_FORM, 84);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_COMUNE, MyGlb.PANEL_FORM, "Comune");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_COMUNE, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_COMUNE, PPQRY_IMP2, "A.COMUNE_ZONA", "COMUNE_ZONA", 1, 3, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_LIST, 96);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_LIST, "Provincia");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_FORM, 4, 456, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_FORM, 96);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_PROVINCIA, MyGlb.PANEL_FORM, "Provincia");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_PROVINCIA, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_PROVINCIA, PPQRY_IMP2, "A.PROVINCIA_ZONA", "PROVINCIA_ZONA", 1, 3, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, MyGlb.PANEL_LIST, 292, 96, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, MyGlb.PANEL_FORM, 552, 64, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_SIGLAPROVINC, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_SIGLAPROVINC, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_SIGLAPROVINC, -1, "", "SIGLAPROVINC", 0, 0, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_LIST, "Utente");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_FORM, 20, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_FORM, 60);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTEINSERI, MyGlb.PANEL_FORM, "Utente");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_UTENTEINSERI, PAG_SUBIMPEGNO_ALTRIDATI, GRP_SUBIMPEGNO_INSERIMENTO);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_UTENTEINSERI, PPQRY_IMP2, "A.UTENTE_INSERIMENTO", "IMPSUBUTEINS", 5, 8, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_LIST, "Data");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_FORM, 236, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_FORM, 36);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAINSERIME, MyGlb.PANEL_FORM, "Data");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DATAINSERIME, PAG_SUBIMPEGNO_ALTRIDATI, GRP_SUBIMPEGNO_INSERIMENTO);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DATAINSERIME, PPQRY_IMP2, "A.DATA_INSERIMENTO", "IMPSUBDATINS", 6, 19, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_LIST, "Utente");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_FORM, 376, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_FORM, 56);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_UTENTULTIAGG, MyGlb.PANEL_FORM, "Utente");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_UTENTULTIAGG, PAG_SUBIMPEGNO_ALTRIDATI, GRP_SUBIMPEGNO_AGGIORNAMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_UTENTULTIAGG, PPQRY_IMP2, "A.UTENTE_ULTIMO_AGG", "IMPSUBUTULAG", 5, 8, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_LIST, "Data");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_FORM, 592, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_FORM, 36);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAULTIMAGG, MyGlb.PANEL_FORM, "Data");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DATAULTIMAGG, PAG_SUBIMPEGNO_ALTRIDATI, GRP_SUBIMPEGNO_AGGIORNAMENT);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DATAULTIMAGG, PPQRY_IMP2, "A.DATA_ULTIMO_AGG", "IMPSUBDAULAG", 6, 19, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_LIST, 28);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_LIST, "Cup");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_FORM, 92, 16, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_FORM, 32);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CUP, MyGlb.PANEL_FORM, "Cup");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CUP, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CUP, PPQRY_IMP2, "A.CUP", "CUP", 5, 15, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_LIST, 28);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_FORM, 216, 16, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_FORM, 28);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_CIG, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_CIG, PPQRY_IMP2, "A.CIG", "IMPCIG", 5, 15, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_LIST, 136);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_FORM, 460, 136, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_FORM, 64);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_DATAREG, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_DATAREG, PPQRY_IMP2, "A.DATA_REG_ECONOMICA", "IMPDATAREG1", 6, 15, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_LIST, 104);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_LIST, "Resp. Residui");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_FORM, 28, 184, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_FORM, 96);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_RESPRESIDUI, MyGlb.PANEL_FORM, "Resp. Residui");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_RESPRESIDUI, PAG_SUBIMPEGNO_ALTRIDATI, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_RESPRESIDUI, PPQRY_IMP2, "A.RESPONSABILE_RES", "RESPONSABILE_RES", 5, 40, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_LIST, 124);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_LIST, "BEN RAGIONE SOCIALE");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_FORM, 4, 460, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_FORM, 124);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_BENRAGIOSOCI, MyGlb.PANEL_FORM, "BEN RAG. SOCIALE");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_BENRAGIOSOCI, -1, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_BENRAGIOSOCI, PPQRY_BEN, "A.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_LIST, 36);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_LIST, "NOTE");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_FORM, 4, 460, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_FORM, 36);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_FORM, 2);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NOTE2, MyGlb.PANEL_FORM, "NOTE");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NOTE2, -1, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NOTE2, PPQRY_IMP2, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_LIST, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_LIST, "FATTORI TIPO");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_FORM, 4, 460, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_FATTORITIPO, MyGlb.PANEL_FORM, "FATT. TIPO");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_FATTORITIPO, -1, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_FATTORITIPO, PPQRY_FATTORI1, "A.TIPO", "FATTORITIPO", 5, 1, 0, -13997);
    PAN_SUBIMPEGNO.SetValueListItem(PFL_SUBIMPEGNO_FATTORITIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_SUBIMPEGNO.SetValueListItem(PFL_SUBIMPEGNO_FATTORITIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_SUBIMPEGNO.SetValueListItem(PFL_SUBIMPEGNO_FATTORITIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_LIST, 104);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_LIST, "TITOLO GIURIDICO");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_FORM, 4, 444, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_FORM, 104);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_TITOLOGIURI1, MyGlb.PANEL_FORM, "TIT. GIURIDICO");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_TITOLOGIURI1, -1, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_TITOLOGIURI1, PPQRY_IMP2, "A.TITOLO_GIURIDICO", "TITOLO_GIURIDICO", 5, 60, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_LIST, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_LIST, "ANNO SUBIMP");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_FORM, 4, 424, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_ANNOSUBIMP1, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_ANNOSUBIMP1, -1, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_ANNOSUBIMP1, PPQRY_IMP2, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_LIST, 92);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_SUBIMPEGNO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_FORM, 4, 448, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPEGNO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_FORM, 92);
    PAN_SUBIMPEGNO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPEGNO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPEGNO_NUMEROSUBIM1, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_SUBIMPEGNO.SetFieldPage(PFL_SUBIMPEGNO_NUMEROSUBIM1, -1, -1);
    PAN_SUBIMPEGNO.SetFieldPanel(PFL_SUBIMPEGNO_NUMEROSUBIM1, PPQRY_IMP2, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
  }

  private void PAN_SUBIMPEGNO_InitQueries()
  {
    StringBuffer SQL;

    PAN_SUBIMPEGNO.SetSize(MyGlb.OBJ_QUERY, 19);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as RICLGESTDESC ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST A, ");
    SQL.append("  CODICI_GESTIONALI B, ");
    SQL.append("  RICLASSIFICAZIONI C ");
    SQL.append("where (B.CODICE = ~~CODICE_GESTIONALE~~) ");
    SQL.append("and   (B.CODICE = A.CODICE_GESTIONALE) ");
    SQL.append("and   (A.PROGR_RICLASSIFICAZIONI = C.PROGRESSIVO) ");
    SQL.append("and   (B.E_S = C.E_S) ");
    SQL.append("and   (A.E_S = C.E_S) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (C.TITOLO = ~~TBL_VALORICAP4.ROWNAMETITOL~~) ");
    SQL.append("and   (NVL(C.CATEGORIA, -1) = NVL(~~TBL_VALORICAP4.ROWNAMECATEG~~, -1)) ");
    SQL.append("and   (NVL(C.COD_INTERVENTO, -1) = NVL(~~TBL_VALORICAP4.ROWNAMCODINT~~, -1)) ");
    SQL.append("and   (NVL(C.COD_TERZI, -1) = NVL(~~TBL_VALORICAP4.ROWNAMCODTER~~, -1)) ");
    SQL.append("and   ((B.SCADENZA IS NULL) OR B.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_RICLASSIGEST, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_RICLASSIGEST, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_RICLASSIGEST, "RICLASSIFICAZIONI_GEST");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~BENEFICIARIO~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_BEN, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPESETDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESET A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_SETTOROPERAT, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_SETTOROPERAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_SETTOROPERAT, "OPESET");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPESERDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESER A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_SERVIZOPERAT, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_SERVIZOPERAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_SERVIZOPERAT, "OPESER");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,0) as CAPCAPITOLO, ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~CAPITOLO~~,~~ARTICOLO~~) as CAPARTICOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_INTCAPART, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_INTCAPART, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_INTCAPART, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI, ");
    SQL.append("  A.TIPO as FATTORITIPO ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~FATTORE~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TO_DATE('1900-01-01','YYYY-MM-DD')) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_FATTORI1, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_FATTORI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_FATTORI1, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~CENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TO_DATE('1900-01-01','YYYY-MM-DD')) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~COD_IMP_ECO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TO_DATE('1900-01-01','YYYY-MM-DD')) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_FATTORI2, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_FATTORI2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_FATTORI2, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROVINCIA_STATO as COMUPROVSTAT, ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI, ");
    SQL.append("  A.COMUNE as COMUNICOMUNE ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A ");
    SQL.append("where (A.PROVINCIA_STATO = ~~PROVINCIA_ZONA~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_COMUNI, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_COMUNI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_COMUNI, "AD4_COMUNI");
    PAN_SUBIMPEGNO.SetQueryLKE(PPQRY_COMUNI, PFL_SUBIMPEGNO_PROVINCIA, "COMUPROVSTAT");
    PAN_SUBIMPEGNO.SetQueryLKE(PPQRY_COMUNI, PFL_SUBIMPEGNO_COMUNE, "COMUNICOMUNE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROVINCIA_STATO as COMUPROVSTAT, ");
    SQL.append("  A.DENOMINAZIONE as COMUNIDENOMI, ");
    SQL.append("  A.COMUNE as COMUNICOMUNE ");
    SQL.append("from ");
    SQL.append("  AD4_COMUNI A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_COMUNI, 1, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryHeaderColumn(PPQRY_COMUNI, "COMUNIDENOMI", "COMUNI DENOMINAZIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DENOMINAZIONE as PROVINDENOMI ");
    SQL.append("from ");
    SQL.append("  AD4_PROVINCIE A ");
    SQL.append("where (A.PROVINCIA = ~~PROVINCIA_ZONA~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_PROVINCIE, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_PROVINCIE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_PROVINCIE, "AD4_PROVINCIE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PROGECG4DESC ");
    SQL.append("from ");
    SQL.append("  PROGETTI_CG4 A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_PROGETTICG4, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_PROGETTICG4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_PROGETTICG4, "PROGETTI_CG4");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOOGVISTRIDE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'COFOG') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~IMPSUBCODCOF~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 99999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_COFOG, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_COFOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_COFOG, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOOGVISTRIDE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~IMPSUBCODLI5~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 99999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_LIVELLOV, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_LIVELLOV, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_LIVELLOV, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_IMP1, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_IMP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_IMP1, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as LIVVVISTRIDE ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~PQRY_SUBIMP6.COD_LIVELLO_5~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 99999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((NVL(~~TBL_VALORICAP4.ROWNAMLIV4CA~~, 0) = 0 OR A.CODICE_PADRE = ~~TBL_VALORICAP4.ROWNAMLIV4CA~~)) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_LIVELLOV1, 0, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_LIVELLOV1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(PPQRY_LIVELLOV1, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T57DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T57 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_T58, 0, SQL, PFL_SUBIMPEGNO_CAUSALE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T57CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' ' || ' - ' || ' ' || A.DESCRIZIONE as T57DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T57 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_T58, 1, SQL, PFL_SUBIMPEGNO_CAUSALE1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPSUBUTEINS~~ as IMSUUTIISIS1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~IMPSUBUTEINS~~) as IMSUUTIISISI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~IMPSUBUTEINS~~ IS NULL))) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_SUBIMPEGNO_UTENTEINSERI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPSUBUTEINS~~ as IMSUUTIISIS1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~IMPSUBUTEINS~~) as IMSUUTIISISI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_SUBIMPEGNO_UTENTEINSERI, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPSUBUTULAG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~IMPSUBUTULAG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~IMPSUBUTULAG~~ IS NULL))) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_DUAL, 0, SQL, PFL_SUBIMPEGNO_UTENTULTIAGG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPSUBUTULAG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~IMPSUBUTULAG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_DUAL, 1, SQL, PFL_SUBIMPEGNO_UTENTULTIAGG, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetIMDB(IMDB, "PQRY_IMP2", true);
    PAN_SUBIMPEGNO.set_SetString(MyGlb.MASTER_ROWNAME, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.TITOLO_GIURIDICO as TITOLO_GIURIDICO, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.COD_IMP_ECO as COD_IMP_ECO, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.COMUNE_ZONA as COMUNE_ZONA, ");
    SQL.append("  A.PROVINCIA_ZONA as PROVINCIA_ZONA, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.RESPONSABILE_RES as RESPONSABILE_RES, ");
    SQL.append("  A.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  A.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  A.RILEVANTE_ECO as RILEVANTE_ECO, ");
    SQL.append("  A.SUBIMP_OBBLIG as SUBIMP_OBBLIG, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.CUP as CUP, ");
    SQL.append("  A.CIG as IMPCIG, ");
    SQL.append("  A.CODICE_COFOG as IMPSUBCODCOF, ");
    SQL.append("  A.CODICE_EUROPEO as IMPSUBCODEUR, ");
    SQL.append("  A.COD_LIVELLO_5 as IMPSUBCODLI5, ");
    SQL.append("  A.NUMERO_SUBIMP_PROVENIENZA as IMPNUMSUBPRO, ");
    SQL.append("  A.ANNO_SUBIMP_PROVENIENZA as IMPANNSUBPRO, ");
    SQL.append("  A.DATA_REG_ECONOMICA as IMPDATAREG1, ");
    SQL.append("  A.UTENTE_INSERIMENTO as IMPSUBUTEINS, ");
    SQL.append("  A.DATA_INSERIMENTO as IMPSUBDATINS, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as IMPSUBUTULAG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as IMPSUBDAULAG ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_IMP2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SUBIMP A ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_IMP2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_SUBIMP = ~~TBL_PARAMETRI74.ROWNAMANSUIM~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~TBL_PARAMETRI74.ROWNAMNUSUIM~~) ");
    PAN_SUBIMPEGNO.SetQuery(PPQRY_IMP2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SUBIMPEGNO.SetQuery(PPQRY_IMP2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SUBIMPEGNO.SetQuery(PPQRY_IMP2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SUBIMPEGNO.SetQuery(PPQRY_IMP2, 5, SQL, -1, "");
    PAN_SUBIMPEGNO.SetQueryDB(PPQRY_IMP2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPEGNO.SetMasterTable(0, "SUBIMP");
    //
    // Rieseguo la query se il pannello era gi‡ in stato DATA
    if (PAN_SUBIMPEGNO.Status() == 2)
    {
      int oldListQBE = PAN_SUBIMPEGNO.iUseListQBE;
      PAN_SUBIMPEGNO.iUseListQBE = 0;
      PAN_SUBIMPEGNO.PanelCommand(Glb.PCM_SEARCH);
      PAN_SUBIMPEGNO.PanelCommand(Glb.PCM_FIND);
      PAN_SUBIMPEGNO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BENEFICIARIO) PAN_BENEFICIARIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BENEFICIARIO) PAN_BENEFICIARIO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_ValidateRow(Cancel);
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BENEFICIARIO) PAN_BENEFICIARIO_DynamicProperties();
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_DynamicProperties();
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BENEFICIARIO) PAN_BENEFICIARIO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_OnChangePage(NewPage, Cancel);
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_OnChangeRow();
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
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_BENEFICIARIO) PAN_BENEFICIARIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRVARI) PAN_PARAMETRVARI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SUBIMPEGNO) PAN_SUBIMPEGNO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
