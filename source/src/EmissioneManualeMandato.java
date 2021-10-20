// **********************************************
// Emissione Manuale Mandato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneManualeMandato extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DATALIQUIDAZ = 0;
  private static int GRP_PARAMETRI_NUMLIQUIDAZI = 1;
  private static int GRP_PARAMETRI_SCADENPAGAME = 2;
  private static int GRP_PARAMETRI_ORDINAMENTO = 3;

  private static int PFL_PARAMETRI_DAL1 = 0;
  private static int PFL_PARAMETRI_AL1 = 1;
  private static int PFL_PARAMETRI_DAL2 = 2;
  private static int PFL_PARAMETRI_AL2 = 3;
  private static int PFL_PARAMETRI_DAL = 4;
  private static int PFL_PARAMETRI_AL = 5;
  private static int PFL_PARAMETRI_SOLLIQNODIFA = 6;
  private static int PFL_PARAMETRI_ORDINAMENTO = 7;
  private static int PFL_PARAMETRI_NUMERO = 8;
  private static int PFL_PARAMETRI_DATA2 = 9;
  private static int PFL_PARAMETRI_DISTINTA = 10;
  private static int PFL_PARAMETRI_DATA = 11;
  private static int PFL_PARAMETRI_TOTALINEMISS = 12;
  private static int PFL_PARAMETRI_COPERTURA = 13;

  private static int PPQRY_PARAMETRI341 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_EMISMANUMAND_DELIBERA = 0;
  private static int GRP_EMISMANUMAND_PROPOSTA = 1;
  private static int GRP_EMISMANUMAND_DISTINLIQUID = 2;
  private static int GRP_EMISMANUMAND_CONTABILE = 3;

  private static int PFL_EMISMANUMAND_NUMEROLIQ = 0;
  private static int PFL_EMISMANUMAND_ANNOLIQ = 1;
  private static int PFL_EMISMANUMAND_INFOLIQUIDAZ = 2;
  private static int PFL_EMISMANUMAND_DATA1 = 3;
  private static int PFL_EMISMANUMAND_BENEFICIARI1 = 4;
  private static int PFL_EMISMANUMAND_NUMERODOC = 5;
  private static int PFL_EMISMANUMAND_DDATADOC = 6;
  private static int PFL_EMISMANUMAND_DUALINFODOC = 7;
  private static int PFL_EMISMANUMAND_SCADENZA1 = 8;
  private static int PFL_EMISMANUMAND_QUIETANZA = 9;
  private static int PFL_EMISMANUMAND_IMPORTO = 10;
  private static int PFL_EMISMANUMAND_RITENUTE = 11;
  private static int PFL_EMISMANUMAND_CAPITOLO = 12;
  private static int PFL_EMISMANUMAND_ARTICOLO = 13;
  private static int PFL_EMISMANUMAND_NUMEROIMP = 14;
  private static int PFL_EMISMANUMAND_ANNOIMP = 15;
  private static int PFL_EMISMANUMAND_SEDEDEL = 16;
  private static int PFL_EMISMANUMAND_NUMERODEL = 17;
  private static int PFL_EMISMANUMAND_ANNODEL = 18;
  private static int PFL_EMISMANUMAND_INFOIMPEGNO = 19;
  private static int PFL_EMISMANUMAND_NUMEROSUBIMP = 20;
  private static int PFL_EMISMANUMAND_ANNOSUBIMP = 21;
  private static int PFL_EMISMANUMAND_SEDEDEL1 = 22;
  private static int PFL_EMISMANUMAND_NUMERODEL1 = 23;
  private static int PFL_EMISMANUMAND_ANNODEL1 = 24;
  private static int PFL_EMISMANUMAND_INFOSUBIMPEG = 25;
  private static int PFL_EMISMANUMAND_BOLLO1 = 26;
  private static int PFL_EMISMANUMAND_VOCEEC = 27;
  private static int PFL_EMISMANUMAND_CGU = 28;
  private static int PFL_EMISMANUMAND_TIPOVINCOLO1 = 29;
  private static int PFL_EMISMANUMAND_UFFICIO1 = 30;
  private static int PFL_EMISMANUMAND_SEDEDEL2 = 31;
  private static int PFL_EMISMANUMAND_NUMERODEL2 = 32;
  private static int PFL_EMISMANUMAND_ANNODEL2 = 33;
  private static int PFL_EMISMANUMAND_UNITAPROPONE = 34;
  private static int PFL_EMISMANUMAND_NUMEROPROPOS = 35;
  private static int PFL_EMISMANUMAND_ANNOPROPOSTA = 36;
  private static int PFL_EMISMANUMAND_DIVERSBENEFI = 37;
  private static int PFL_EMISMANUMAND_NUMERODISTIN = 38;
  private static int PFL_EMISMANUMAND_ANNODISTINTA = 39;
  private static int PFL_EMISMANUMAND_PIANOCONTINT = 40;
  private static int PFL_EMISMANUMAND_CODICECOFOG = 41;
  private static int PFL_EMISMANUMAND_CODICEEUROPE = 42;
  private static int PFL_EMISMANUMAND_FINANZIAMENT = 43;
  private static int PFL_EMISMANUMAND_INFOFINANZIA = 44;
  private static int PFL_EMISMANUMAND_LIQUIDALABEL = 45;
  private static int PFL_EMISMANUMAND_DOCUMENLABEL = 46;
  private static int PFL_EMISMANUMAND_CAPITOLOART = 47;
  private static int PFL_EMISMANUMAND_IMPEGNOLABEL = 48;
  private static int PFL_EMISMANUMAND_NUMEROIMPEGN = 49;
  private static int PFL_EMISMANUMAND_ANNOIMPEGNO = 50;
  private static int PFL_EMISMANUMAND_SUBIMPEGNQBE = 51;
  private static int PFL_EMISMANUMAND_ANNOMAND = 52;
  private static int PFL_EMISMANUMAND_OLDINEMISSIO = 53;
  private static int PFL_EMISMANUMAND_ANNOPROG = 54;
  private static int PFL_EMISMANUMAND_NUMEROPROG = 55;
  private static int PFL_EMISMANUMAND_UFFICIO = 56;
  private static int PFL_EMISMANUMAND_BOLLO = 57;
  private static int PFL_EMISMANUMAND_TIPOVINCOLO = 58;
  private static int PFL_EMISMANUMAND_BENEFICIARIO = 59;
  private static int PFL_EMISMANUMAND_CIG = 60;
  private static int PFL_EMISMANUMAND_LIQPARZ = 61;
  private static int PFL_EMISMANUMAND_NUMEROCONTAB = 62;
  private static int PFL_EMISMANUMAND_DATACONTABIL = 63;
  private static int PFL_EMISMANUMAND_SCADENZA = 64;

  private static int PPQRY_LIQ14 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_EMISMANUMAND;

  // Definition of Global Variables
  private IDVariant MANDATESISTE = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant DISTINTA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI301(IMDB);
    Init_TBL_FINANZIAME12(IMDB);
    //
    //
    Init_PQRY_LIQ14(IMDB);
    Init_PQRY_PARAMETRI341(IMDB);
    Init_PQRY_PARAMETRI341_RS(IMDB);
    Init_QRY_FINANZIAMEN4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI301(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI301, 13);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI301, "TBL_PARAMETRI301");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIDA, "ROWNAMDALIDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIDA,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIAL, "ROWNAMDALIAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIAL,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIDA, "ROWNAMNULIDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIDA,1,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIAL, "ROWNAMNULIAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIAL,1,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMSCADAL, "ROWNAMSCADAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMSCADAL,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMESCAAL, "ROWNAMESCAAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMESCAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_RONASOLINODF, "RONASOLINODF");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_RONASOLINODF,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMEORDIN,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMENUMER,1,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMEDATA,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMNUMDIS,1,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMDATDIS,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMECOPER, "ROWNAMECOPER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI301,IMDBDef5.FLD_PARAMETRI301_ROWNAMECOPER,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI301, 0);
  }

  private static void Init_TBL_FINANZIAME12(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_FINANZIAME12, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_FINANZIAME12, "TBL_FINANZIAME12");
    IMDB.set_FldCode(IMDBDef5.TBL_FINANZIAME12,IMDBDef5.FLD_FINANZIAME12_FINFINANZIAM, "FINFINANZIAM");
    IMDB.SetFldParams(IMDBDef5.TBL_FINANZIAME12,IMDBDef5.FLD_FINANZIAME12_FINFINANZIAM,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FINANZIAME12,IMDBDef5.FLD_FINANZIAME12_FINIMPORTO, "FINIMPORTO");
    IMDB.SetFldParams(IMDBDef5.TBL_FINANZIAME12,IMDBDef5.FLD_FINANZIAME12_FINIMPORTO,3,14,2);
  }

  private static void Init_PQRY_LIQ14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_LIQ14, 55);
    IMDB.set_TblCode(IMDBDef15.PQRY_LIQ14, "PQRY_LIQ14");
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIBERASOESES, "LIBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_D_SCADENZA, "D_SCADENZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_D_SCADENZA,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQSEDEDEL1, "LIQSEDEDEL1");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQSEDEDEL1,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERDEL1, "LIQNUMERDEL1");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERDEL1,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQANNODEL1, "LIQANNODEL1");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQANNODEL1,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQBOLLO, "LIQBOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQBOLLO,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQTIPOVINCO, "LIQTIPOVINCO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQTIPOVINCO,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQSEDEDEL2, "LIQSEDEDEL2");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQSEDEDEL2,5,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERDEL2, "LIQNUMERDEL2");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERDEL2,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQANNODEL2, "LIQANNODEL2");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQANNODEL2,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQUFFICIO, "LIQUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQUFFICIO,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQDIVERBENE, "LIQDIVERBENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQDIVERBENE,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERIMPE, "LIQNUMERIMPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERIMPE,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQANNOIMPEG, "LIQANNOIMPEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQANNOIMPEG,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQOLDINEMIS, "LIQOLDINEMIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQOLDINEMIS,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_BENEFICIARIO,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQCIG, "LIQCIG");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQCIG,5,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_PIANOCONTINT, "PIANOCONTINT");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_PIANOCONTINT,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQCODICCOFO, "LIQCODICCOFO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQCODICCOFO,1,3,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQCODICEURO, "LIQCODICEURO");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQCODICEURO,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQPARZ, "LIQPARZ");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQPARZ,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERCONT, "LIQNUMERCONT");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQNUMERCONT,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQDATACONTA, "LIQDATACONTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQDATACONTA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQQTNSCADEN, "LIQQTNSCADEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ14,IMDBDef15.PQSL_LIQ14_LIQQTNSCADEN,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_LIQ14, 0);
  }

  private static void Init_PQRY_PARAMETRI341(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI341, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI341, "PQRY_PARAMETRI341");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIDA, "ROWNAMDALIDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIDA,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIAL, "ROWNAMDALIAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIAL,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIDA, "ROWNAMNULIDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIDA,1,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIAL, "ROWNAMNULIAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIAL,1,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMSCADAL, "ROWNAMSCADAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMSCADAL,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMESCAAL, "ROWNAMESCAAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMESCAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_RONASOLINODF, "RONASOLINODF");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_RONASOLINODF,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEORDIN,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNUMDIS,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDATDIS,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMECOPER, "ROWNAMECOPER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341,IMDBDef15.PQSL_PARAMETRI341_ROWNAMECOPER,5,2,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI341, 0);
  }

  private static void Init_PQRY_PARAMETRI341_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI341_RS, 13);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI341_RS, "PQRY_PARAMETRI341_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIDA, "ROWNAMDALIDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIDA,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIAL, "ROWNAMDALIAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDALIAL,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIDA, "ROWNAMNULIDA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIDA,1,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIAL, "ROWNAMNULIAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNULIAL,1,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMSCADAL, "ROWNAMSCADAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMSCADAL,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMESCAAL, "ROWNAMESCAAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMESCAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_RONASOLINODF, "RONASOLINODF");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_RONASOLINODF,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEORDIN,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMNUMDIS,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMDATDIS,6,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMECOPER, "ROWNAMECOPER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI341_RS,IMDBDef15.PQSL_PARAMETRI341_ROWNAMECOPER,5,2,0);
  }

  private static void Init_QRY_FINANZIAMEN4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.QRY_FINANZIAMEN4, 2);
    IMDB.set_TblCode(IMDBDef15.QRY_FINANZIAMEN4, "QRY_FINANZIAMEN4");
    IMDB.set_FldCode(IMDBDef15.QRY_FINANZIAMEN4,IMDBDef15.QSL_FINANZIAMEN4_FINFINANZIAM, "FINFINANZIAM");
    IMDB.SetFldParams(IMDBDef15.QRY_FINANZIAMEN4,IMDBDef15.QSL_FINANZIAMEN4_FINFINANZIAM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.QRY_FINANZIAMEN4,IMDBDef15.QSL_FINANZIAMEN4_SOMMAIMPORTO, "SOMMAIMPORTO");
    IMDB.SetFldParams(IMDBDef15.QRY_FINANZIAMEN4,IMDBDef15.QSL_FINANZIAMEN4_SOMMAIMPORTO,3,28,6);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneManualeMandato(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneManualeMandato()
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
    FormIdx = MyGlb.FRM_EMISMANUMAND;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "95E2E74C-E7B7-41DD-B377-707A1314741C";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 824;
    DesignHeight = 586;
    set_Caption(new IDVariant("Emissione Manuale Mandato"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 824;
    Frames[1].Height = 560;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.335714;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 824;
    Frames[2].Height = 188;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 824;
    Frames[2].FixedHeight = 188;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 824-MyGlb.PAN_OFFS_X, 188-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F827B257-2129-4328-B677-56CCB0D08F1A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1076, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 824;
    Frames[3].Height = 372;
    Frames[3].Caption = "Emissione Manuale Mandato";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 372;
    PAN_EMISMANUMAND = new IDPanel(w, this, 3, "PAN_EMISMANUMAND");
    Frames[3].Content = PAN_EMISMANUMAND;
    PAN_EMISMANUMAND.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISMANUMAND.VS = MainFrm.VisualStyleList;
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 824-MyGlb.PAN_OFFS_X, 372-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6DB95AC8-AC99-4A30-B424-9DE9EF87A529");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3204, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISMANUMAND.InitStatus = 2;
    PAN_EMISMANUMAND_Init();
    PAN_EMISMANUMAND_InitFields();
    PAN_EMISMANUMAND_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SAVE1+BaseCmdLinIdx)
      {
        Save();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI301, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISMANUMAND_PARAMETRI341();
      }
      PAN_EMISMANUMAND.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneManualeMandato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneManualeMandato.class.getName() : (Glb.ClassWithPackage(EmissioneManualeMandato.class) ? EmissioneManualeMandato.class.getName().substring(EmissioneManualeMandato.class.getPackage().getName().length() + 1) : EmissioneManualeMandato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Info Liquidazione
  // **********************************************************************
  public int ApriInfoLiquidazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Liquidazione Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_LIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_NUMERO_LIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "ApriInfoLiquidazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "InfoVocePeg", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_NUMERO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Subimpegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoSubimpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Subimpegno Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_NUMERO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_NUMERO_SUBIMP, 0));
        if (IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "InfoSubimpegno", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_FINANZIAMENTO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_FINANZIAMENTO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "InfoFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Importo Totale
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SettaImportoTotale ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TOTALEIMPORT = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_TOT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      v_TOT = (new IDVariant("Totale: ", IDVariant.STRING));
      v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Setta Importo Totale Body
      // Procedure Body
      // 
      C2 = PAN_EMISMANUMAND.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_EMISMANUMAND.GotoFirst();
      while (!PAN_EMISMANUMAND.RSEOF())
      {
        if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA.intValue()))
        {
          v_TOTALEIMPORT = IDL.Add(v_TOTALEIMPORT, C2.Get("IMPORTO"));
        }
        v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
        PAN_EMISMANUMAND.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_TOTALINEMISS, IDL.Add(v_TOT, IDL.Format(IDL.NullValue(v_TOTALEIMPORT,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "SettaImportoTotale", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Abilita Disabilita Ricerca
  // Explain which processing is carried out by this procedure
  // Abilita - Input
  // **********************************************************************
  public int AbilitaDisabilitaRicerca (IDVariant Abilita)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Abilita Disabilita Ricerca Body
      // Procedure Body
      // 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DAL1, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AL1, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DAL2, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AL2, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DAL, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_AL, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "AbilitaDisabilitaRicerca", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc
  // Explain which processing is carried out by this procedure
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
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_PROG, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_NUMERO_PROG, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_ANNO_PROG, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_NUMERO_PROG, 0));
        MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Conferma Salvataggio
  // Explain which processing is carried out by this procedure
  // Messaggio:  - Input
  // **********************************************************************
  public boolean ConfermaSalvataggio (IDVariant Messaggio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Conferma Salvataggio Body
      // Procedure Body
      // 
      if (!(MainFrm.MessageConfirm(Messaggio)))
      {
        v_SALVATO = (new IDVariant(0));
        return v_SALVATO.booleanValue();
      }
      v_SALVATO = (new IDVariant(-1));
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "ConfermaSalvataggio", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli Bloccanti
  // Explain which processing is carried out by this procedure
  // Capitolo Out:  - Input/Output
  // Articolo Out:  - Input/Output
  // Anno Imp:  - Input/Output
  // Numero Imp:  - Input/Output
  // Tipo Vincolo:  - Input/Output
  // Bollo:  - Input/Output
  // Voce Economica:  - Input/Output
  // Ufficio 1:  - Input/Output
  // **********************************************************************
  public boolean ControlliBloccanti (IDVariant CapitoloOut, IDVariant ArticoloOut, IDVariant AnnoImp, IDVariant NumeroImp, IDVariant TipoVincolo, IDVariant Bollo, IDVariant VoceEconomica, IDVariant Ufficio1)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SALVARE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECON = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_BOLLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TIPOVINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DATAMAND = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_UFFICIO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MANDATOESIST = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_INTLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CAPLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ARTLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMIMPLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOIMPLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_BOLLOLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TIPOVINCOLOL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DATAMANDLIQ = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_UFFLIQ = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RIGA = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C17;

    try
    {
      TransCount = 0;
      // 
      // Controlli Bloccanti Body
      // Procedure Body
      // 
      v_RIGA = (new IDVariant(1));
      v_CAPITOLO = (new IDVariant());
      v_ARTICOLO = (new IDVariant());
      v_NUMEROIMP = (new IDVariant());
      v_ANNOIMP = (new IDVariant());
      v_VOCEECON = (new IDVariant());
      v_BOLLO = (new IDVariant());
      v_TIPOVINCOLO = (new IDVariant());
      v_DATAMAND = (new IDVariant());
      v_UFFICIO = (new IDVariant());
      v_INTLIQ = (new IDVariant());
      v_CAPLIQ = (new IDVariant());
      v_ARTLIQ = (new IDVariant());
      v_NUMIMPLIQ = (new IDVariant());
      v_ANNOIMPLIQ = (new IDVariant());
      v_VOCEECONLIQ = (new IDVariant());
      v_BOLLOLIQ = (new IDVariant());
      v_TIPOVINCOLOL = (new IDVariant());
      v_DATAMANDLIQ = (new IDVariant());
      v_UFFLIQ = (new IDVariant());
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0).equals((new IDVariant(0)), true) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0))))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Numero di Mandato non ammesso", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
        v_SALVARE = (new IDVariant(0));
        return v_SALVARE.booleanValue();
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0))))
      {
        // 
        // numerazione mandati
        // 
        {
          IDVariant v_NUMERO = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
          v_NUMERO = (new IDVariant());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.NUMERO as N03NUMERO, ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  N03 A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (UPPER(A.CODICE) = 'MAN') ");
          SQL.append("group by ");
          SQL.append("  A.NUMERO ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NUMERO = QV.Get("N03NUMERO", IDVariant.INTEGER) ;
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0 && v_NUMERO.compareTo(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0), true)<0)
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Numero di Mandato non ammesso (maggiore dell'ultimo mandato emesso)", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            v_SALVARE = (new IDVariant(0));
            return v_SALVARE.booleanValue();
          }
        }
      }
      // 
      // controllo esistenza mandato
      // 
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  A.CAPITOLO as MANCAPITOLO, ");
        SQL.append("  A.ARTICOLO as MANARTICOLO, ");
        SQL.append("  A.NUMERO_IMP as MANNUMEROIMP, ");
        SQL.append("  A.ANNO_IMP as MANANNOIMP, ");
        SQL.append("  A.VOCE_ECON as MANVOCEECON, ");
        SQL.append("  A.BOLLO as MANBOLLO, ");
        SQL.append("  A.TIPO_VINCOLO as MANTIPOVINCO, ");
        SQL.append("  A.D_DATA_MAND as MANDDATAMAND, ");
        SQL.append("  A.UFFICIO as MANUFFICIO ");
        SQL.append("from ");
        SQL.append("  MAN A ");
        SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO, ");
        SQL.append("  A.NUMERO_IMP, ");
        SQL.append("  A.ANNO_IMP, ");
        SQL.append("  A.VOCE_ECON, ");
        SQL.append("  A.BOLLO, ");
        SQL.append("  A.TIPO_VINCOLO, ");
        SQL.append("  A.D_DATA_MAND, ");
        SQL.append("  A.UFFICIO ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_CAPITOLO = QV.Get("MANCAPITOLO", IDVariant.DECIMAL) ;
          v_ARTICOLO = QV.Get("MANARTICOLO", IDVariant.INTEGER) ;
          v_NUMEROIMP = QV.Get("MANNUMEROIMP", IDVariant.INTEGER) ;
          v_ANNOIMP = QV.Get("MANANNOIMP", IDVariant.INTEGER) ;
          v_VOCEECON = QV.Get("MANVOCEECON", IDVariant.INTEGER) ;
          v_BOLLO = QV.Get("MANBOLLO", IDVariant.INTEGER) ;
          v_TIPOVINCOLO = QV.Get("MANTIPOVINCO", IDVariant.INTEGER) ;
          v_DATAMAND = QV.Get("MANDDATAMAND", IDVariant.DATETIME) ;
          v_UFFICIO = QV.Get("MANUFFICIO", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          v_MANDATOESIST = (new IDVariant(0));
          MANDATESISTE = (new IDVariant(0));
          if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA, 0)))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Data del mandato obbligatoria", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            v_SALVARE = (new IDVariant(0));
            return v_SALVARE.booleanValue();
          }
          else
          {
            if (IDL.Year(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
            {
              IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
              v_SMS = (new IDVariant("La data deve appartenere all'esercizio corrente ", IDVariant.STRING));
              MainFrm.set_AlertMessage(IDL.Add(v_SMS, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
              v_SALVARE = (new IDVariant(0));
              return v_SALVARE.booleanValue();
            }
          }
        }
        else
        {
          v_MANDATOESIST = (new IDVariant(-1));
          MANDATESISTE = (new IDVariant(-1));
        }
      }
      // 
      // controlli righe selezionate
      // 
      {
        IDVariant v_CONTEGGIORIG = new IDVariant(0,IDVariant.INTEGER);
        v_CONTEGGIORIG = (new IDVariant(1, IDVariant.INTEGER));
        IDVariant v_RIGHEELABORA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_BENEFICIARIO = null;
        v_BENEFICIARIO = (new IDVariant());
        IDVariant v_CIG = null;
        v_CIG = (new IDVariant());
        IDVariant v_RIGACONRITEN = new IDVariant(0,IDVariant.INTEGER);
        C17 = PAN_EMISMANUMAND.MasterRS();
        if (C17.size()>0) CurPos = C17.getRow(); else CurPos = 0;
        if (!C17.Bof()) PAN_EMISMANUMAND.GotoFirst();
        while (!PAN_EMISMANUMAND.RSEOF())
        {
          if (PAN_EMISMANUMAND.IsRowSelected(v_CONTEGGIORIG.intValue()))
          {
            if (MainFrm.DATAINIZSIOP.compareTo(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA, 0), true)<=0 && !(MainFrm.SIOPEATTIARM.booleanValue()))
            {
              if (IDL.IsNull(C17.Get("CODICE_GESTIONALE")))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Liquidazione ", IDVariant.STRING));
                IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
                v_SMS1 = (new IDVariant(": manca il Codice Gestionale", IDVariant.STRING));
                MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(C17.Get("NUMERO_LIQ"))), (new IDVariant(" "))), (new IDVariant("/"))), (new IDVariant(" "))), IDL.ToString(C17.Get("ANNO_LIQ"))), v_SMS1)); 
                v_SALVARE = (new IDVariant(0));
                return v_SALVARE.booleanValue();
              }
              else
              {
                IDVariant v_SCADENZA = new IDVariant(0,IDVariant.INTEGER);
                v_SCADENZA = (new IDVariant());
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.SCADENZA as CODIGESTSCAD ");
                SQL.append("from ");
                SQL.append("  CODICI_GESTIONALI A ");
                SQL.append("where (A.CODICE = " + IDL.CSql(C17.Get("CODICE_GESTIONALE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (A.E_S = 'S') ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_SCADENZA = QV.Get("CODIGESTSCAD", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (IDL.NullValue(v_SCADENZA,(new IDVariant(2999))).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
                {
                  IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                  v_SMS = (new IDVariant("Liquidazione ", IDVariant.STRING));
                  IDVariant v_SMS1 = new IDVariant(0,IDVariant.STRING);
                  v_SMS1 = (new IDVariant(": Codice Gestionale Scaduto", IDVariant.STRING));
                  MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_SMS, IDL.ToString(C17.Get("NUMERO_LIQ"))), (new IDVariant(" "))), (new IDVariant("/"))), (new IDVariant(" "))), IDL.ToString(C17.Get("ANNO_LIQ"))), v_SMS1)); 
                  v_SALVARE = (new IDVariant(0));
                  return v_SALVARE.booleanValue();
                }
              }
            }
            if ((C17.Get("LIQQTNSCADEN").compareTo(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA, 0), true)<0) && !(IDL.IsNull(C17.Get("LIQQTNSCADEN"))))
            {
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Liquidazione ")), IDL.ToString(C17.Get("NUMERO_LIQ"))), (new IDVariant(" "))), (new IDVariant("/"))), (new IDVariant(" "))), IDL.ToString(C17.Get("ANNO_LIQ"))), (new IDVariant(": Quietanza scaduta")))); 
              v_SALVARE = (new IDVariant(0));
              return v_SALVARE.booleanValue();
            }
            if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("C")), true))
            {
              if (!(IDL.IsNull(C17.Get("RITENUTE"))) && C17.Get("RITENUTE").compareTo((new IDVariant(0)), true)>0)
              {
                v_RIGACONRITEN = (new IDVariant(-1));
              }
              if (v_RIGHEELABORA.equals((new IDVariant(0)), true))
              {
                v_BENEFICIARIO = new IDVariant(new IDVariant(C17.Get("BENEFICIARIO")),IDVariant.INTEGER);
                v_CIG = new IDVariant(C17.Get("LIQCIG"));
              }
              else
              {
                if (v_BENEFICIARIO.compareTo(C17.Get("BENEFICIARIO"), true)!=0)
                {
                  IDVariant S = null;
                  S = (new IDVariant("Liquidazioni con beneficiari diversi"));
                  MainFrm.set_AlertMessage(S); 
                  v_SALVARE = (new IDVariant(0));
                  return v_SALVARE.booleanValue();
                }
                else
                {
                  if (v_RIGACONRITEN.booleanValue() && v_CIG.compareTo(C17.Get("LIQCIG"), true)!=0)
                  {
                    IDVariant S = null;
                    S = (new IDVariant("Liquidazioni con cig diversi"));
                    MainFrm.set_AlertMessage(S); 
                    v_SALVARE = (new IDVariant(0));
                    return v_SALVARE.booleanValue();
                  }
                }
              }
              v_RIGHEELABORA = IDL.Add(v_RIGHEELABORA, (new IDVariant(1)));
            }
            // 
            // procedura
            // 
            {
              IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
              if (v_RIGA.equals((new IDVariant(1)), true) && !(v_MANDATOESIST.booleanValue()))
              {
                v_CAPITOLO = new IDVariant(C17.Get("CAPITOLO"));
                v_ARTICOLO = new IDVariant(C17.Get("ARTICOLO"));
                v_NUMEROIMP = new IDVariant(C17.Get("NUMERO_IMP"));
                v_ANNOIMP = new IDVariant(C17.Get("ANNO_IMP"));
                v_VOCEECON = new IDVariant(C17.Get("VOCE_ECON"));
                v_BOLLO = new IDVariant(C17.Get("BOLLO"));
                v_TIPOVINCOLO = new IDVariant(C17.Get("TIPO_VINCOLO"));
                v_UFFICIO = new IDVariant(C17.Get("UFFICIO"));
                v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
              }
              if ((!(v_MANDATOESIST.booleanValue()) && v_RIGA.compareTo((new IDVariant(1)), true)>0) || v_MANDATOESIST.booleanValue())
              {
                v_ERRORE = (new IDVariant());
                MainFrm.Cf4armDBObject.CONTROLLOCONGRUENZAMAN(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_CAPITOLO, v_ARTICOLO, v_ANNOIMP, v_NUMEROIMP, v_VOCEECON, v_BOLLO, v_TIPOVINCOLO, v_UFFICIO, C17.Get("ANNO_LIQ"), C17.Get("NUMERO_LIQ"), v_ERRORE);
                if (v_ERRORE.compareTo((new IDVariant("")), true)!=0)
                {
                  MainFrm.set_AlertMessage(v_ERRORE); 
                  v_SALVARE = (new IDVariant(0));
                  return v_SALVARE.booleanValue();
                }
              }
              CapitoloOut.set(new IDVariant(new IDVariant(v_CAPITOLO),IDVariant.INTEGER));
              ArticoloOut.set(new IDVariant(v_ARTICOLO));
              AnnoImp.set(new IDVariant(v_ANNOIMP));
              NumeroImp.set(new IDVariant(v_NUMEROIMP));
              TipoVincolo.set(new IDVariant(v_TIPOVINCOLO));
              Bollo.set(new IDVariant(v_BOLLO));
              VoceEconomica.set(new IDVariant(v_VOCEECON));
              Ufficio1.set(new IDVariant(v_UFFICIO));
            }
          }
          v_CONTEGGIORIG = IDL.Add(v_CONTEGGIORIG, (new IDVariant(1)));
          PAN_EMISMANUMAND.GotoNext();
        }
        if (CurPos>0) C17.absolute(CurPos);
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0)))
      {
        MANDATESISTE = (new IDVariant(0));
      }
      if (IDL.NullValue(CapitoloOut,(new IDVariant(0))).equals((new IDVariant(0)), true))
      {
        v_SALVARE = (new IDVariant(0));
      }
      else
      {
        v_SALVARE = (new IDVariant(-1));
      }
      return v_SALVARE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "ControlliBloccanti", _e);
      return false;
    }
  }

  // **********************************************************************
  // Save
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Save ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TIPOVINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_BOLLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_UFFICIO = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C11;
    IDCachedRowSet C28;
    IDCachedRowSet C36;
    IDCachedRowSet C43;

    try
    {
      TransCount = 0;
      // 
      // Save Body
      // Procedure Body
      // 
      IDVariant v_NUMEMANDNULL = new IDVariant(0,IDVariant.INTEGER);
      if (ControlliBloccanti(v_CAPITOLO, v_ARTICOLO, v_ANNOIMP, v_NUMEROIMP, v_TIPOVINCOLO, v_BOLLO, v_VOCEECONOMIC, v_UFFICIO))
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        // 
        // salvataggio
        // 
        {
          IDVariant v_NUMEROMANDAT = new IDVariant(0,IDVariant.INTEGER);
          v_NUMEROMANDAT = (new IDVariant());
          if (!(MANDATESISTE.booleanValue()))
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0)))
            {
              MainFrm.Cf4armDBObject.ACHKNUMERAZIONE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("man")), v_NUMEROMANDAT);
              v_NUMEMANDNULL = (new IDVariant(-1));
              IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0, new IDVariant(v_NUMEROMANDAT));
            }
            try
            {
              IDVariant v_IMPORTO = null;
              v_IMPORTO = CalcolaSommaSelezionati();
              SQL = new StringBuffer();
              SQL.append("insert into MAN ");
              SQL.append("( ");
              SQL.append("  CAPITOLO, ");
              SQL.append("  ARTICOLO, ");
              SQL.append("  ANNO_IMP, ");
              SQL.append("  NUMERO_IMP, ");
              SQL.append("  TIPO_VINCOLO, ");
              SQL.append("  BOLLO, ");
              SQL.append("  VOCE_ECON, ");
              SQL.append("  ANNO_MAND, ");
              SQL.append("  NUMERO_MAND, ");
              SQL.append("  D_DATA_MAND, ");
              SQL.append("  NUMERO_ELENCO, ");
              SQL.append("  D_DATA_ELENCO, ");
              SQL.append("  UFFICIO, ");
              SQL.append("  IMPORTO, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO, ");
              SQL.append("  COPERTURA ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(v_CAPITOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_ARTICOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_ANNOIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_NUMEROIMP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_TIPOVINCOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_BOLLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_VOCEECONOMIC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEDATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMNUMDIS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_UFFICIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_IMPORTO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMECOPER, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e7)
            {
              MainFrm.set_AlertMessage(new IDVariant(e7.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              if (v_NUMEMANDNULL.booleanValue())
              {
                IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0, (new IDVariant()));
              }
              return 0;
            }
          }
          // 
          // controllo Finanziamenti
          // 
          {
            IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO = (new IDVariant("Finanziamento ", IDVariant.STRING));
            IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO1 = (new IDVariant(" in anticipazione.", IDVariant.STRING));
            IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_MESSAGGIO2 = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO2 = (new IDVariant("Registrare ugualmente?", IDVariant.STRING));
            IDVariant v_MESSAGGIO3 = new IDVariant(0,IDVariant.STRING);
            v_MESSAGGIO3 = (new IDVariant("Finanziamenti", IDVariant.STRING));
            IDVariant v_NUMERRORI = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
            v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
            C11 = PAN_EMISMANUMAND.MasterRS();
            if (C11.size()>0) CurPos = C11.getRow(); else CurPos = 0;
            if (!C11.Bof()) PAN_EMISMANUMAND.GotoFirst();
            while (!PAN_EMISMANUMAND.RSEOF())
            {
              if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA.intValue()) && !(IDL.IsNull(C11.Get("FINANZIAMENTO"))))
              {
                SAVE_FINAINSEVALU(C11.Get("FINANZIAMENTO"), C11.Get("IMPORTO"));
              }
              v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
              PAN_EMISMANUMAND.GotoNext();
            }
            if (CurPos>0) C11.absolute(CurPos);
            SAVE_FINANZIAMEN4();
            while (!IMDB.Eof(IMDBDef15.QRY_FINANZIAMEN4, 0))
            {
              IDVariant v_ERRORE = new IDVariant(0,IDVariant.INTEGER);
              MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
              MainFrm.Cf4armDBObject.CONTROLLODISPCASSAFIN(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.QRY_FINANZIAMEN4, IMDBDef15.QSL_FINANZIAMEN4_FINFINANZIAM, 0), (new IDVariant(0)), IMDB.Value(IMDBDef15.QRY_FINANZIAMEN4, IMDBDef15.QSL_FINANZIAMEN4_SOMMAIMPORTO, 0), v_ERRORE);
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                MainFrm.Cf4armDBObject.RollbackTrans();
                if (v_NUMEMANDNULL.booleanValue())
                {
                  IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0, (new IDVariant()));
                }
                SAVE_FINADELEROW1();
                return 0;
              }
              if (v_ERRORE.equals((new IDVariant(1)), true))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant("Finanziamento ", IDVariant.STRING));
                v_SEERRORE = (new IDVariant(-1));
                v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, ((v_MESSAGGIO.equals(v_SMS))?(new IDVariant("")):(new IDVariant(",")))), IDL.ToString(IMDB.Value(IMDBDef15.QRY_FINANZIAMEN4, IMDBDef15.QSL_FINANZIAMEN4_FINFINANZIAM, 0)));
                v_NUMERRORI = IDL.Add(v_NUMERRORI, (new IDVariant(1)));
              }
              IMDB.TblMoveNext(IMDBDef15.QRY_FINANZIAMEN4, 0);
            }
            if (v_SEERRORE.booleanValue())
            {
              IDVariant v_RISPOSTA = new IDVariant(0,IDVariant.INTEGER);
              v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_MESSAGGIO1), (new IDVariant("<BR/>"))), v_MESSAGGIO2);
              if (v_NUMERRORI.compareTo((new IDVariant(1)), true)>0)
              {
                v_MESSAGGIO = IDL.Replace(v_MESSAGGIO, (new IDVariant("Finanziamento")), v_MESSAGGIO3);
              }
              v_RISPOSTA = (new IDVariant(MainFrm.MessageConfirmEx(v_MESSAGGIO)));
              if (!(IDL.IsNull(v_RISPOSTA)))
              {
                if (v_RISPOSTA.booleanValue())
                {
                  SAVE_FINADELEROW2();
                }
                else
                {
                  PAN_EMISMANUMAND.SetModified(MainFrm);
                  MainFrm.Cf4armDBObject.RollbackTrans();
                  if (v_NUMEMANDNULL.booleanValue())
                  {
                    IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0, (new IDVariant()));
                  }
                  SAVE_FINADELEROW3();
                  return 0;
                }
              }
              else
              {
                if (v_NUMEMANDNULL.booleanValue())
                {
                  IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0, (new IDVariant()));
                }
                return 0;
              }
            }
            SAVE_FINADELEROWS();
          }
          IDVariant v_NUMERORIGA1 = new IDVariant(0,IDVariant.INTEGER);
          v_NUMERORIGA1 = (new IDVariant(1));
          // 
          // Controllo Codici Transazione Elementare 
          // 
          C28 = PAN_EMISMANUMAND.MasterRS();
          if (C28.size()>0) CurPos = C28.getRow(); else CurPos = 0;
          if (!C28.Bof()) PAN_EMISMANUMAND.GotoFirst();
          while (!PAN_EMISMANUMAND.RSEOF())
          {
            if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA1.intValue()))
            {
              IDVariant v_STATOCTE = new IDVariant(0,IDVariant.STRING);
              try
              {
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A_GET_ERRORE_COD_TRANS_LIQ(" + IDL.CSql(C28.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C28.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as AGEERCTLALNL ");
                SQL.append("from ");
                SQL.append("  DUAL A ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_STATOCTE = QV.Get("AGEERCTLALNL", IDVariant.STRING) ;
                }
                QV.Close();
              }
              catch (Exception e31)
              {
                MainFrm.set_AlertMessage(new IDVariant(e31.getMessage())); 
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
              if (!(IDL.IsNull(v_STATOCTE)))
              {
                MainFrm.set_AlertMessage((new IDVariant("Sono presenti liquidazioni con codici di transazione elementare non corretti"))); 
                MainFrm.Cf4armDBObject.RollbackTrans();
                return 0;
              }
            }
            v_NUMERORIGA1 = IDL.Add(v_NUMERORIGA1, (new IDVariant(1)));
            PAN_EMISMANUMAND.GotoNext();
          }
          if (CurPos>0) C28.absolute(CurPos);
          // 
          // aggiornamento liq
          // 
          {
            IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
            v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
            C36 = PAN_EMISMANUMAND.MasterRS();
            if (C36.size()>0) CurPos = C36.getRow(); else CurPos = 0;
            if (!C36.Bof()) PAN_EMISMANUMAND.GotoFirst();
            while (!PAN_EMISMANUMAND.RSEOF())
            {
              if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA.intValue()))
              {
                try
                {
                  SQL = new StringBuffer();
                  SQL.append("update LIQ set ");
                  SQL.append("  ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                  SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ) ");
                  SQL.append("where (ANNO_LIQ = " + IDL.CSql(C36.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C36.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                }
                catch (Exception e39)
                {
                  MainFrm.set_AlertMessage(new IDVariant(e39.getMessage())); 
                  MainFrm.Cf4armDBObject.RollbackTrans();
                  return 0;
                }
              }
              v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
              PAN_EMISMANUMAND.GotoNext();
            }
            if (CurPos>0) C36.absolute(CurPos);
          }
          if (ControlloOrdinativiAssociati())
          {
            // 
            // controlli sfondamento cassa
            // 
            {
              IDVariant I = null;
              I = (new IDVariant(1));
              IDVariant v_TROVATO = new IDVariant(0,IDVariant.INTEGER);
              C43 = PAN_EMISMANUMAND.MasterRS();
              if (C43.size()>0) CurPos = C43.getRow(); else CurPos = 0;
              if (!C43.Bof()) PAN_EMISMANUMAND.GotoFirst();
              while (!PAN_EMISMANUMAND.RSEOF())
              {
                if (PAN_EMISMANUMAND.IsRowSelected(I.intValue()))
                {
                  IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
                  SQL = new StringBuffer();
                  SQL.append("select ");
                  SQL.append("  COUNT(*) as COUNT1 ");
                  SQL.append("from ");
                  SQL.append("  BIL A ");
                  SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (A.E_S = 'S') ");
                  SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C43.Get("CAPITOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (A.ARTICOLO = " + IDL.CSql(C43.Get("ARTICOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                  SQL.append("and   (CONTROLLO_DISP_CASSA_VPRO_CAP(A.ESERCIZIO,A.CAPITOLO,A.ARTICOLO,'EM') < 0) ");
                  QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                  if (!QV.EOF()) QV.MoveNext();
                  if (!QV.EOF())
                  {
                    v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                  }
                  QV.Close();
                  if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
                  {
                    v_TROVATO = (new IDVariant(-1));
                    break;
                  }
                }
                I = IDL.Add(I, (new IDVariant(1)));
                PAN_EMISMANUMAND.GotoNext();
              }
              if (CurPos>0) C43.absolute(CurPos);
              if (v_TROVATO.booleanValue())
              {
                if (MainFrm.CONCASLIQEMI.equals((new IDVariant(1)), true))
                {
                  IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
                  v_S1 = (new IDVariant("Sono presenti record con disponibilità di cassa negativa."));
                  MainFrm.Cf4armDBObject.RollbackTrans();
                  MainFrm.set_AlertMessage(v_S1); 
                  return 0;
                }
                else
                {
                  IDVariant S = new IDVariant(0,IDVariant.STRING);
                  S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
                  IDVariant v_RISP = null;
                  v_RISP = (new IDVariant(MainFrm.MessageConfirmEx(S)));
                  if (IDL.IsNull(v_RISP))
                  {
                    if (v_NUMEMANDNULL.booleanValue())
                    {
                      IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0, (new IDVariant()));
                    }
                    MainFrm.Cf4armDBObject.RollbackTrans();
                    return 0;
                  }
                  if (v_RISP.equals((new IDVariant(-1)), true))
                  {
                    MainFrm.Cf4armDBObject.CommitTrans();
                  }
                  else
                  {
                    MainFrm.Cf4armDBObject.RollbackTrans();
                    return 0;
                  }
                }
              }
              else
              {
                MainFrm.Cf4armDBObject.CommitTrans();
              }
            }
            PAN_EMISMANUMAND.PanelCommand(Glb.PCM_CANCEL);
            PAN_EMISMANUMAND.PanelCommand(Glb.PCM_REQUERY);
          }
          else
          {
            if (v_NUMEMANDNULL.booleanValue())
            {
              IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0, (new IDVariant()));
            }
            MainFrm.Cf4armDBObject.RollbackTrans();
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "Save", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamenti: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void SAVE_FINAINSEVALU(IDVariant C11_FINANZIAMENTO, IDVariant C11_IMPORTO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef5.TBL_FINANZIAME12, 0);
    IMDB.set_Value(IMDBDef5.TBL_FINANZIAME12, IMDBDef5.FLD_FINANZIAME12_FINFINANZIAM, 0, C11_FINANZIAMENTO);
    IMDB.set_Value(IMDBDef5.TBL_FINANZIAME12, IMDBDef5.FLD_FINANZIAME12_FINIMPORTO, 0, C11_IMPORTO);
  }

  // **********************************************************************
  // Finanziamenti
  // Which data are you selecting?
  // **********************************************************************
  private void SAVE_FINANZIAMEN4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.QRY_FINANZIAMEN4);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef5.TBL_FINANZIAME12, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_FINANZIAME12, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.TblLinkRow(IMDBDef1.TMP_RECORDSET, 0, IMDBDef5.TBL_FINANZIAME12, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 0, 0, IMDBDef5.TBL_FINANZIAME12, IMDBDef5.FLD_FINANZIAME12_FINFINANZIAM, 0);
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 1, 0, IMDB.Value(IMDBDef5.TBL_FINANZIAME12, IMDBDef5.FLD_FINANZIAME12_FINIMPORTO, 0));
      IMDB.TblMoveNext(IMDBDef5.TBL_FINANZIAME12, 0);
      if (IMDB.Eof(IMDBDef5.TBL_FINANZIAME12, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_FINANZIAME12, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblSortBy(IMDBDef1.TMP_RECORDSET,0,true);
    IMDB.TblStartSort(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[2];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[2];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0);
          AggrBuff[1] = IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0))) AggrRowCount[1] = 1; else AggrRowCount[1] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          AggrNewGroup = AggrNewGroup || !AggrBuff[0].equals(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0));
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef15.QRY_FINANZIAMEN4, 0);
              IMDB.set_Value(IMDBDef15.QRY_FINANZIAMEN4, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef15.QRY_FINANZIAMEN4, 1, 0, AggrBuff[1]);
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0)))
              {
                AggrBuff[1] = IDL.Add(AggrBuff[1], IMDB.Value(IMDBDef1.TMP_RECORDSET, 1, 0));
                AggrRowCount[1]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef15.QRY_FINANZIAMEN4, 0);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SAVE_FINADELEROW1() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAME12);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SAVE_FINADELEROW2() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAME12);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SAVE_FINADELEROW3() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAME12);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SAVE_FINADELEROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAME12);
  }

  // **********************************************************************
  // Controllo Ordinativi Associati
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public boolean ControlloOrdinativiAssociati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_BENEFICIARIO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RIGA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SALVATO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTARIGHECO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROSUBIMP = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ANNOSUBIMPEG = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C5;
    IDCachedRowSet C14;
    IDCachedRowSet C23;
    IDCachedRowSet C30;

    try
    {
      TransCount = 0;
      v_RIGA = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Controllo Ordinativi Associati Body
      // Procedure Body
      // 
      if (MainFrm.GESTIONE_ORD_ASSOCIATI.equals((new IDVariant("SI")), true))
      {
        if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("B")), true))
        {
          IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
          v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
          // 
          // Submandato per beneficiario
          // 
          {
            C5 = PAN_EMISMANUMAND.MasterRS();
            if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
            if (!C5.Bof()) PAN_EMISMANUMAND.GotoFirst();
            while (!PAN_EMISMANUMAND.RSEOF())
            {
              if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA.intValue()))
              {
                if (C5.Get("RITENUTE").compareTo((new IDVariant(0)), true)!=0)
                {
                  if (v_RIGA.equals((new IDVariant(1)), true))
                  {
                    v_BENEFICIARIO = new IDVariant(new IDVariant(C5.Get("BENEFICIARIO")),IDVariant.INTEGER);
                  }
                  if (v_RIGA.compareTo((new IDVariant(1)), true)>0)
                  {
                    if (v_BENEFICIARIO.compareTo(C5.Get("BENEFICIARIO"), true)!=0)
                    {
                      IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                      v_SMS = (new IDVariant("Liquidazioni con ritenute con Beneficiario diverso", IDVariant.STRING));
                      MainFrm.set_AlertMessage(v_SMS); 
                      v_SALVATO = (new IDVariant(0));
                      return v_SALVATO.booleanValue();
                    }
                  }
                  v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
                }
              }
              v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
              PAN_EMISMANUMAND.GotoNext();
            }
            if (CurPos>0) C5.absolute(CurPos);
          }
        }
        if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("S")), true))
        {
          // 
          // Submandato per Beneficiario/Subimpegno
          // 
          {
            IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
            v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
            C14 = PAN_EMISMANUMAND.MasterRS();
            if (C14.size()>0) CurPos = C14.getRow(); else CurPos = 0;
            if (!C14.Bof()) PAN_EMISMANUMAND.GotoFirst();
            while (!PAN_EMISMANUMAND.RSEOF())
            {
              if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA.intValue()))
              {
                if (C14.Get("RITENUTE").compareTo((new IDVariant(0)), true)!=0)
                {
                  if (v_RIGA.equals((new IDVariant(1)), true))
                  {
                    v_BENEFICIARIO = new IDVariant(new IDVariant(C14.Get("BENEFICIARIO")),IDVariant.INTEGER);
                    v_NUMEROSUBIMP = new IDVariant(C14.Get("NUMERO_SUBIMP"));
                    v_ANNOSUBIMPEG = new IDVariant(C14.Get("ANNO_SUBIMP"));
                  }
                  if (v_RIGA.compareTo((new IDVariant(1)), true)>0)
                  {
                    if (v_BENEFICIARIO.compareTo(C14.Get("BENEFICIARIO"), true)!=0 || v_NUMEROSUBIMP.compareTo(C14.Get("NUMERO_SUBIMP"), true)!=0 || v_ANNOSUBIMPEG.compareTo(C14.Get("ANNO_SUBIMP"), true)!=0)
                    {
                      IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                      v_SMS = (new IDVariant("Liquidazioni con ritenute con Beneficiario/Subimpegno diversi", IDVariant.STRING));
                      MainFrm.set_AlertMessage(v_SMS); 
                      v_SALVATO = (new IDVariant(0));
                      return v_SALVATO.booleanValue();
                    }
                  }
                  v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
                }
              }
              v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
              PAN_EMISMANUMAND.GotoNext();
            }
            if (CurPos>0) C14.absolute(CurPos);
          }
        }
        if (MainFrm.TIPO_SUB_MAN.equals((new IDVariant("L")), true))
        {
          // 
          // Submandato per Liquidazione
          // 
          {
            IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
            v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
            C23 = PAN_EMISMANUMAND.MasterRS();
            if (C23.size()>0) CurPos = C23.getRow(); else CurPos = 0;
            if (!C23.Bof()) PAN_EMISMANUMAND.GotoFirst();
            while (!PAN_EMISMANUMAND.RSEOF())
            {
              if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA.intValue()))
              {
                if (C23.Get("RITENUTE").compareTo((new IDVariant(0)), true)!=0)
                {
                  v_CONTARIGHECO = IDL.Add(v_CONTARIGHECO, (new IDVariant(1)));
                  if (v_CONTARIGHECO.compareTo((new IDVariant(1)), true)>0)
                  {
                    IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                    v_SMS = (new IDVariant("Sono presenti più liquidazioni con ritenute", IDVariant.STRING));
                    MainFrm.set_AlertMessage(v_SMS); 
                    v_SALVATO = (new IDVariant(0));
                    return v_SALVATO.booleanValue();
                  }
                }
              }
              v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
              PAN_EMISMANUMAND.GotoNext();
            }
            if (CurPos>0) C23.absolute(CurPos);
          }
        }
        if (MANDATESISTE.booleanValue())
        {
          // 
          // Submandato per Liquidazione
          // 
          {
            IDVariant v_NUMERORIGA = new IDVariant(0,IDVariant.INTEGER);
            v_NUMERORIGA = (new IDVariant(1, IDVariant.INTEGER));
            C30 = PAN_EMISMANUMAND.MasterRS();
            if (C30.size()>0) CurPos = C30.getRow(); else CurPos = 0;
            if (!C30.Bof()) PAN_EMISMANUMAND.GotoFirst();
            while (!PAN_EMISMANUMAND.RSEOF())
            {
              if (PAN_EMISMANUMAND.IsRowSelected(v_NUMERORIGA.intValue()))
              {
                if (C30.Get("RITENUTE").compareTo((new IDVariant(0)), true)!=0)
                {
                  IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
                  MainFrm.Cf4armDBObject.CONTROLLOMANINFRITENUTE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0), C30.Get("ANNO_LIQ"), C30.Get("NUMERO_LIQ"), MainFrm.TIPO_SUB_MAN, v_ERRORE);
                  if (v_ERRORE.compareTo((new IDVariant("")), true)!=0)
                  {
                    MainFrm.set_AlertMessage(v_ERRORE); 
                    v_SALVATO = (new IDVariant(0));
                    return v_SALVATO.booleanValue();
                  }
                }
              }
              v_NUMERORIGA = IDL.Add(v_NUMERORIGA, (new IDVariant(1)));
              PAN_EMISMANUMAND.GotoNext();
            }
            if (CurPos>0) C30.absolute(CurPos);
          }
        }
      }
      v_SALVATO = (new IDVariant(-1));
      return v_SALVATO.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "ControlloOrdinativiAssociati", _e);
      return false;
    }
  }

  // **********************************************************************
  // Ordinamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Ordinamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinamento Body
      // Procedure Body
      // 
      PAN_EMISMANUMAND.EnableSorting();
      PAN_EMISMANUMAND.ResetSortList();
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEORDIN, 0).equals((new IDVariant("1")), true))
      {
        PAN_EMISMANUMAND.AddToSortList(PFL_EMISMANUMAND_ANNOIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_EMISMANUMAND.AddToSortList(PFL_EMISMANUMAND_NUMEROIMP, (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEORDIN, 0).equals((new IDVariant("2")), true))
        {
          PAN_EMISMANUMAND.AddToSortList(PFL_EMISMANUMAND_BENEFICIARI1, (new IDVariant(-1)).booleanValue()); 
        }
        else
        {
          PAN_EMISMANUMAND.AddToSortList(PFL_EMISMANUMAND_ANNOLIQ, (new IDVariant(-1)).booleanValue()); 
          PAN_EMISMANUMAND.AddToSortList(PFL_EMISMANUMAND_NUMEROLIQ, (new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "Ordinamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Somma Selezionati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public IDVariant CalcolaSommaSelezionati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Calcola Somma Selezionati Body
      // Corpo Procedura
      // 
      IDVariant v_SOMMA = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_RIGA = null;
      v_RIGA = (new IDVariant(1));
      C2 = PAN_EMISMANUMAND.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_EMISMANUMAND.GotoFirst();
      while (!PAN_EMISMANUMAND.RSEOF())
      {
        if (PAN_EMISMANUMAND.IsRowSelected(v_RIGA.intValue()) && C2.Get("LIQPARZ").equals((new IDVariant("SI")), true))
        {
          v_SOMMA = IDL.Add(v_SOMMA, C2.Get("IMPORTO"));
        }
        v_RIGA = IDL.Add(v_RIGA, (new IDVariant(1)));
        PAN_EMISMANUMAND.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      return v_SOMMA;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "CalcolaSommaSelezionati", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Emissione Manuale Mandato On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_EMISMANUMAND_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Manuale Mandato On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_EMISMANUMAND.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "EmissioneManualeMandatoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Manuale Mandato After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_EMISMANUMAND_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Manuale Mandato After Find Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMEORDIN, 0))))
      {
        SettaImportoTotale();
      }
      Ordinamento();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "EmissioneManualeMandatoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Manuale Mandato On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISMANUMAND_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_EMISMANUMAND);
      // 
      // Emissione Manuale Mandato On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_EMISMANUMAND.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUMAND_BENEFICIARI1,IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_LIBERASOESES, 0).stringValue()); 
      PAN_EMISMANUMAND.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUMAND_DIVERSBENEFI,IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_LIQDIVERBENE, 0).stringValue()); 
      PAN_EMISMANUMAND.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUMAND_QUIETANZA,IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_DESCRIZIONE, 0).stringValue()); 
      PAN_EMISMANUMAND.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUMAND_BOLLO1,IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_LIQBOLLO, 0).stringValue()); 
      PAN_EMISMANUMAND.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUMAND_UFFICIO1,IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_LIQUFFICIO, 0).stringValue()); 
      PAN_EMISMANUMAND.set_ToolTip(Glb.OBJ_FIELD,PFL_EMISMANUMAND_TIPOVINCOLO1,IMDB.Value(IMDBDef15.PQRY_LIQ14, IMDBDef15.PQSL_LIQ14_LIQTIPOVINCO, 0).stringValue()); 
      if (new IDVariant(PAN_EMISMANUMAND.Status()).equals((new IDVariant(3)), true))
      {
        AbilitaDisabilitaRicerca((new IDVariant(0)));
      }
      else
      {
        AbilitaDisabilitaRicerca((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "EmissioneManualeMandatoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Manuale Mandato On Change Selection Event
  // Evento notificato dal pannello quando in un pannello
  // con multi-selezione le righe selezionate cambiano.
  // Selected: E' un valore booleano che vale True se la riga per cui viene chiamato l'evento è stata selezionata. I dati della riga per cui viene chiamato l'evento sono disponibili, come al solito, nella tabella IMDB sottesa al pannello. - Input
  // Final: Questo evento viene chiamato per ogni riga per cui cambia lo stato di selezionato, più una volta al termine dell'operazione. Durante quest'ultima chiamata il parametro Final vale True. - Input
  // Cancel: Può essere impostato a True per evitare il cambio di selezione (vale solo se Final = false). - Input/Output
  // **********************************************************************
  private void PAN_EMISMANUMAND_OnChangeSelection(IDVariant Selected, IDVariant Final, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Manuale Mandato On Change Selection Event Body
      // Procedure Body
      // 
      SettaImportoTotale();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "EmissioneManualeMandatoOnChangeSelectionEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Numero Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_NUMERO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Numero Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0))))
      {
        IDVariant v_NUMEROELENCO = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_DDATAELENCO = new IDVariant(0,IDVariant.DATETIME);
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        v_DDATAELENCO = (new IDVariant());
        v_NUMEROELENCO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.NUMERO_ELENCO as MANNUMERELEN, ");
        SQL.append("  A.D_DATA_ELENCO as MANDDATAELEN, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  MAN A ");
        SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMENUMER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("group by ");
        SQL.append("  A.NUMERO_ELENCO, ");
        SQL.append("  A.D_DATA_ELENCO ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMEROELENCO = QV.Get("MANNUMERELEN", IDVariant.INTEGER) ;
          v_DDATAELENCO = QV.Get("MANDDATAELEN", IDVariant.DATETIME) ;
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMNUMDIS, 0, new IDVariant(v_NUMEROELENCO));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMDATDIS, 0, new IDVariant(v_DDATAELENCO));
          DISTINTA = (new IDVariant(0));
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMNUMDIS, 0, new IDVariant(v_NUMEROELENCO));
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI341, IMDBDef15.PQSL_PARAMETRI341_ROWNAMDATDIS, 0, new IDVariant(v_DDATAELENCO));
        }
        else
        {
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            DISTINTA = (new IDVariant(-1));
          }
        }
      }
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, (DISTINTA.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DATA, (DISTINTA.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "ParametriNumeroValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
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
      // Parametri After Find Event Body
      // Procedure Body
      // 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, (DISTINTA.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DATA, (DISTINTA.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "ParametriAfterFindEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Emissione Manuale Mandato", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      if (!(MainFrm.FINANZIAMENT.booleanValue()))
      {
        PAN_EMISMANUMAND.SetFlags (Glb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISMANUMAND.SetFlags (Glb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_EMISMANUMAND.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMENUMER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMEDATA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMNUMDIS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMDATDIS, 0, (new IDVariant()));
      DISTINTA = (new IDVariant(0));
      PAN_EMISMANUMAND.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_EMISMANUMAND.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_EMISMANUMAND.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_EMISMANUMAND.SetFlags (Glb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISMANUMAND.SetFlags (Glb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISMANUMAND.SetFlags (Glb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISMANUMAND.SetFlags (Glb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinamento Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_ORDINAMENTO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinamento Validate Event Body
      // Procedure Body
      // 
      Ordinamento();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneManualeMandato", "OrdinamentoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISMANUMAND_PARAMETRI341() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI341_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI301, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI301, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI341_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI341_RS, 0, IMDBDef5.TBL_PARAMETRI301, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 0, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIDA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 1, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 2, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIDA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 3, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 4, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMSCADAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 5, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMESCAAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 6, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_RONASOLINODF, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 7, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMEORDIN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 8, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMENUMER, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 9, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 10, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMNUMDIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 11, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMDATDIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI341_RS, 12, 0, IMDBDef5.TBL_PARAMETRI301, IMDBDef5.FLD_PARAMETRI301_ROWNAMECOPER, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI301, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI301, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI301, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI341_RS, 0);
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
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_ORDINAMENTO)
      {
        PFL_PARAMETRI_ORDINAMENTO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_NUMERO)
      {
        PFL_PARAMETRI_NUMERO_ValidateCell(Cancel);
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_EMISMANUMAND_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISMANUMAND, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISMANUMAND_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISMANUMAND, Cancel);
    // Stub
  }

  private void PAN_EMISMANUMAND_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISMANUMAND_INFOLIQUIDAZ)
    {
      this.IdxPanelActived = this.PAN_EMISMANUMAND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoLiquidazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISMANUMAND_DUALINFODOC)
    {
      this.IdxPanelActived = this.PAN_EMISMANUMAND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISMANUMAND_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_EMISMANUMAND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISMANUMAND_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_EMISMANUMAND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubimpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISMANUMAND_INFOFINANZIA)
    {
      this.IdxPanelActived = this.PAN_EMISMANUMAND.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISMANUMAND_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISMANUMAND_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISMANUMAND_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISMANUMAND_Init()
  {

    PAN_EMISMANUMAND.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISMANUMAND.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, "A6DCF417-D284-4DEB-94B6-0646CEA0E0A4");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, "Delibera");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, MyGlb.PANEL_LIST, 2064, -9999, 140, 16, 0, 0);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, MyGlb.PANEL_FORM, 0, 627, 124, 97, 0, 0);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, 0, 47);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, 1, 13);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, 0, 4);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, 1, 4);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, "785CF677-9280-4ADF-9FFA-6926AD6BD0D5");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, "Proposta");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, MyGlb.PANEL_LIST, 2204, -9999, 172, 16, 0, 0);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, MyGlb.PANEL_FORM, 0, 699, 164, 97, 0, 0);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, 0, 51);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, 1, 13);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, 0, 4);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, 1, 4);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, "11A3F695-4A7C-45A4-9802-5DAC8DBE4D03");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, "Distinta Liquidazione");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, MyGlb.PANEL_LIST, 2584, -9999, 132, 16, 0, 0);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, MyGlb.PANEL_FORM, 0, 771, 156, 73, 0, 0);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, 0, 117);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, 1, 13);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, 0, 4);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, 1, 4);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_DISTINLIQUID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, "69EF2B42-783F-4E3A-BE44-8882F9608019");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, "Contabile");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, MyGlb.PANEL_LIST, 3028, -9999, 176, 16, 0, 0);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, MyGlb.PANEL_FORM, 0, 1683, 192, 73, 0, 0);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, 0, 53);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, 1, 13);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, 0, 4);
    PAN_EMISMANUMAND.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, 1, 4);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISMANUMAND_CONTABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISMANUMAND.SetSize(MyGlb.OBJ_FIELD, 65);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, "6D2108C4-6D8E-41BF-917E-F46DE0E1E5F8");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, "NUMERO LIQ");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, "CEE0B23B-5617-4B71-B7A2-63654BAFCA27");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, "ANNO LIQ");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, "3535993D-6AC2-4D1B-AD10-DB212D9928EC");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, "Info Liquidazione");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.VIS_HYPLINIMLOU1);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, "2AE34EB1-C49F-4B6E-B222-35E68E42D508");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, "Data");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, "AD229001-9B6E-4D14-8C93-5DD19FC8C89F");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, "Beneficiario");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, "5EEF14CD-63C7-4E90-9876-E772380A9772");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, "NUMERO DOC");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, "4BFF8956-F7A4-4A32-BE70-D506FCCE0656");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, "D DATA DOC");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, "711CED8F-AD4E-4201-BDF2-D016330DB475");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, "DUAL Info Doc");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.VIS_HYPLINIMLOU1);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, "E087B251-E7F7-4337-979B-5C714C0AC2CA");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, "Scadenza");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, "Scadenza");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, "3B76BDB1-2D84-4F9B-A82D-EAA667D535A9");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, "Quietanza");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, "Quietanza");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, "F1F45554-5C65-4F59-BCAE-303B50085160");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, "Importo");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, "Importo");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, "34DFE189-4067-49AD-8A7F-29E38E684816");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, "Ritenute");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, "Ritenute");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, "7D2071E4-AA0D-4ACE-BBFC-5AFD7276BA00");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, "CAPITOLO");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, "6BEBE109-C46C-4FD0-8FF0-55CAF3DC0298");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, "ARTICOLO");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, "244291E4-2BF7-416B-B194-2DC4A46D1A52");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, "NUMERO IMP");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, "BBCD944B-E4AB-45BC-85C0-814BEE796624");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, "ANNO IMP");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, "9BC2128C-6515-4CD2-AFC8-4C05BFD070A4");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, "SEDE DEL");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, "D0D2310C-D1C1-4F94-8DF8-A77271FDDBE8");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, "NUMERO DEL");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, "78E74D9C-3F24-44EC-862B-4D05A3CC51CE");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, "ANNO DEL");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, "3AB2D0FA-C9E2-4BAA-A54C-948FB15BCC9B");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, "Info Impegno");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, "19F4E7D5-0FF8-49FF-A523-2B8FB6769D9B");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, "88C1823B-E873-47A8-949E-8269203B4A83");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, "AAFE229B-B6CB-4BA2-81F8-D2161DDF44CF");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, "SEDE DEL 1");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, "5811BF9C-3FD5-4500-B4DA-6B5D981062FF");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, "NUMERO DEL 1");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, "3B78F10C-B352-4D46-BB54-63EB0BB60A6D");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, "ANNO DEL 1");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, "2493B377-399C-4312-909D-7F5132D37FB2");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, "Info Sub Impegno");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.VIS_HYPLINIMLOU1);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, "25830749-A39E-401B-BB8A-D9F07E9C18A2");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, "Bollo");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, "Bollo");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, "F4F62253-416A-4CF3-B209-9CB76F5D1992");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, "Voce Ec.");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, "11678278-255B-4749-B6DF-6C66B0202A83");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, "Cgu");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, "Cgu");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, "8041A245-D8CB-4DEC-AB10-308E41EAB424");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, "483D7F82-0493-4FED-A98B-7429FEEF6110");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, "Ufficio");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, "Ufficio");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, "E9755A09-C294-4028-9F76-BDAC29994CC6");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, "Sede");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, "0F67B9EF-AB3E-419F-A2D1-E877740AEA3E");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, "Numero");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, "B1C8000B-D1D4-422E-A973-ECD4DCB9E9B0");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, "Anno");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, "5EB6DFE1-8462-482A-B785-99121D6FDC0C");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, "Unita Prop.");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, "FCAD07D8-D9B9-43F7-A061-7E1ABB3C0654");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, "Numero");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, "4CA3D553-F723-46A7-A450-2E410029F218");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, "Anno");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, "706C80FD-9F0A-4FDE-B29E-83C3F17819B8");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, "8CA6D943-585B-41BC-8722-10D535BA455E");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, "Numero");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, "4CB9B146-3465-4DDB-ADAC-8EF69FB4C172");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, "Anno");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, "24684EFD-9DC6-4C0E-9B24-F93D0F9D58B7");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, "Piano Conti Int.");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, "Piano Conti Int.");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, "3EB1866E-5DDA-4A18-83E5-3199CFBC3BE8");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, "Cofog");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, "B16CA8FC-BDBE-4C88-A18A-144089E25D07");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, "Cod. Eu.");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, "E0FA99AA-C95B-4705-94F6-7EA624540AA3");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, "Finanziamento");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.VIS_NOFINOBOVEHE);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, "7FF1F3A6-4B29-469B-B0E1-30FFE14A6917");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, " ");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.VIS_HYLIIMNOBOVH);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, "B3B639B3-1582-4509-9551-5E94D9BC6B8F");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, "Liquidazione");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, "73040D98-18A3-4B09-9F70-46C44B07A7DD");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, "Documento");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, "61C0041B-5AF7-49CB-9D36-6B41473A71D2");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, "Capitolo/Art.");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, "F793F0A8-C9D0-4439-99BB-01A308FF3AB9");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, "Impegno");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, "2292E7C7-8D34-45E5-A5E9-9343E1E281AF");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, "Numero Impegno");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, "If Equal (Row Name Ordinamento [Emissione Manuale Mandato - Parametri], Per Impegno, NUMERO IMP, Uno)");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, "2A285008-656E-47C3-80BD-1D642B35D9FC");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, "Anno Impegno");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, "If Equal (Row Name Ordinamento [Emissione Manuale Mandato - Parametri], Per Impegno, ANNO IMP, Uno)");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, "95634078-4C7A-48B8-B1E9-0596EAC8CC21");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, "Subimpegno");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, MyGlb.VIS_LABEVISUSTYL);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, "FBE98E2D-BD4E-4872-94C8-CC413A1627C6");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, "ANNO MAND");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, "3112D6F7-6ADD-4E5C-B238-73367D6B9A7E");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, "Old In Emissione");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, "If (not (Is Null (LIQ ANNO MAND)), SI, NO)");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, "29B390FF-B529-4C65-B91A-B6C9496E0E02");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, "ANNO PROG");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, "3CB37256-3A85-4C97-88C6-773A4A92C898");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, "NUMERO PROG");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, "FE8050D0-8D28-45F3-951D-109FA0B4822D");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, "UFFICIO");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, "74A7A8D0-11CC-41C2-8AB8-D4E65F654788");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, "BOLLO");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, "73431E3B-E677-4255-B9B4-F534013A2B20");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, "CC521D4B-16B6-4D79-9F27-00D7E75F895F");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, "BENEFICIARIO");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.VIS_NORFIEINTLUN);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, "D07093DA-5D95-43B9-AE35-4E64C0AAC41E");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, "CIG");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, "A054F2D0-BEF7-4636-AFF5-AACA6AE2AE71");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, "LIQ PARZ");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, "D415F9D0-5381-4722-B2EA-45EFEC021E06");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, "Numero ");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, "57ECB9CA-30C3-4F50-B856-BDC560A77DB7");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, "Data");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISMANUMAND.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, "F8039F6F-2A26-402D-8670-F2533AFB051A");
    PAN_EMISMANUMAND.set_Header(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, "SCADENZA");
    PAN_EMISMANUMAND.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, "");
    PAN_EMISMANUMAND.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISMANUMAND.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_EMISMANUMAND_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMEROLIQ, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMEROLIQ, PPQRY_LIQ14, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_LIST, 44, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNOLIQ, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNOLIQ, PPQRY_LIQ14, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_LIST, 80, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_LIST, 140);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_LIST, "I. Lq.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_FORM, 4, 1420, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_FORM, 140);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOLIQUIDAZ, MyGlb.PANEL_FORM, "Info Liquidazione");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_INFOLIQUIDAZ, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_INFOLIQUIDAZ, PPQRY_DUAL, "DECODE(~~NUMERO_LIQ~~, to_number(NULL), NULL, 'I')", "DUALINFOLIQU", 5, 99, 0, -13997);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOLIQUIDAZ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_LIST, 104, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_LIST, 68);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_FORM, 68);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_DATA1, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_DATA1, PPQRY_LIQ14, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_LIST, 176, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_LIST, 100);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_FORM, 4, 76, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_FORM, 100);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARI1, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_BENEFICIARI1, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_BENEFICIARI1, PPQRY_LIQ14, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_LIST, 296, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_FORM, 4, 100, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMERODOC, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMERODOC, PPQRY_LIQ14, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_LIST, 400, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_FORM, 4, 124, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_DDATADOC, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_DDATADOC, PPQRY_LIQ14, "C.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_LIST, 464, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_LIST, 88);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_LIST, "D. I. D.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_FORM, 4, 1468, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_FORM, 88);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DUALINFODOC, MyGlb.PANEL_FORM, "DUAL Info Doc");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_DUALINFODOC, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_DUALINFODOC, PPQRY_DUAL, "DECODE(~~ANNO_PROG~~, to_number(NULL), NULL, 'I')", "DUALINFODOC", 5, 99, 0, -13997);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_DUALINFODOC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_LIST, 488, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_LIST, "Scadenza");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_FORM, 4, 148, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA1, MyGlb.PANEL_FORM, "Scadenza");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_SCADENZA1, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_SCADENZA1, PPQRY_LIQ14, "C.D_SCADENZA", "D_SCADENZA", 6, 10, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_LIST, 552, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_FORM, 4, 172, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_QUIETANZA, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_QUIETANZA, PPQRY_LIQ14, "E.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_LIST, 672, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_IMPORTO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_IMPORTO, PPQRY_LIQ14, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_LIST, 752, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_RITENUTE, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_RITENUTE, PPQRY_LIQ14, "A.RITENUTE", "RITENUTE", 3, 14, 2, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_LIST, 832, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_FORM, 4, 268, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_CAPITOLO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_CAPITOLO, PPQRY_LIQ14, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_LIST, 956, 36, 28, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_LIST, "AR.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_FORM, 4, 292, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ARTICOLO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ARTICOLO, PPQRY_LIQ14, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_LIST, 984, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_FORM, 4, 316, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMEROIMP, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMEROIMP, PPQRY_LIQ14, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_LIST, 1040, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_FORM, 4, 340, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNOIMP, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNOIMP, PPQRY_LIQ14, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_LIST, 1080, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_FORM, 4, 364, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_SEDEDEL, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_SEDEDEL, PPQRY_LIQ14, "F.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_LIST, 1128, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_FORM, 4, 388, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMERODEL, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMERODEL, PPQRY_LIQ14, "F.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_LIST, 1176, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_FORM, 4, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNODEL, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNODEL, PPQRY_LIQ14, "F.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_LIST, 1212, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_LIST, 120);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_LIST, "I. I.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 1564, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_FORM, 120);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOIMPEGNO, MyGlb.PANEL_FORM, "Info Impegno");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_INFOIMPEGNO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_INFOIMPEGNO, PPQRY_DUAL, "DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I')", "DUALINFOIMPE", 5, 99, 0, -13997);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1236, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 436, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMEROSUBIMP, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMEROSUBIMP, PPQRY_LIQ14, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_LIST, 1292, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANN. SUB.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 460, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNOSUBIMP, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNOSUBIMP, PPQRY_LIQ14, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_LIST, 1332, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_LIST, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_LIST, "SEDE DEL 1");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_FORM, 4, 484, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_FORM, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL1, MyGlb.PANEL_FORM, "SD. DL. 1");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_SEDEDEL1, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_SEDEDEL1, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_SEDEDEL1, PPQRY_LIQ14, "G.SEDE_DEL", "LIQSEDEDEL1", 5, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_LIST, 1380, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_LIST, "NUM. DEL 1");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_FORM, 4, 508, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL1, MyGlb.PANEL_FORM, "NUM. DEL 1");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMERODEL1, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_NUMERODEL1, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMERODEL1, PPQRY_LIQ14, "G.NUMERO_DEL", "LIQNUMERDEL1", 1, 19, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_LIST, 1428, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_LIST, "ANNO DEL 1");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_FORM, 4, 532, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL1, MyGlb.PANEL_FORM, "AN. DL. 1");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNODEL1, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_ANNODEL1, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNODEL1, PPQRY_LIQ14, "G.ANNO_DEL", "LIQANNODEL1", 1, 19, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1464, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_LIST, 144);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_LIST, "I. S. I.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 1612, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_FORM, 144);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOSUBIMPEG, MyGlb.PANEL_FORM, "Info Sub Impegno");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_INFOSUBIMPEG, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_INFOSUBIMPEG, PPQRY_DUAL, "DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I')", "DUAINFSUBIMP", 5, 99, 0, -13997);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_LIST, 1488, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_LIST, "Bollo");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_FORM, 4, 556, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO1, MyGlb.PANEL_FORM, "Bollo");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_BOLLO1, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_BOLLO1, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_BOLLO1, PPQRY_LIQ14, "H.DESCRIZIONE", "LIQBOLLO", 5, 40, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_LIST, 1648, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_LIST, "Voce Ec.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_FORM, 4, 580, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_FORM, 68);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_VOCEEC, MyGlb.PANEL_FORM, "Voce Ec.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_VOCEEC, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_VOCEEC, PPQRY_LIQ14, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_LIST, 1704, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_LIST, 112);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_FORM, 4, 604, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_FORM, 112);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_CGU, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_CGU, PPQRY_LIQ14, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1752, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_FORM, 4, 628, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO1, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_TIPOVINCOLO1, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_TIPOVINCOLO1, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_TIPOVINCOLO1, PPQRY_LIQ14, "I.DESCRIZIONE", "LIQTIPOVINCO", 5, 50, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_LIST, 1892, 36, 172, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_LIST, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_LIST, "Ufficio");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_FORM, 4, 1108, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_FORM, 76);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO1, MyGlb.PANEL_FORM, "Ufficio");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_UFFICIO1, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_UFFICIO1, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_UFFICIO1, PPQRY_LIQ14, "J.DESCRIZIONE", "LIQUFFICIO", 5, 60, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_LIST, 2064, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_LIST, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_LIST, "Sede");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_FORM, 4, 652, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_FORM, 56);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SEDEDEL2, MyGlb.PANEL_FORM, "Sede");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_SEDEDEL2, -1, GRP_EMISMANUMAND_DELIBERA);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_SEDEDEL2, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_SEDEDEL2, PPQRY_LIQ14, "A.SEDE_DEL", "LIQSEDEDEL2", 5, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_LIST, 2112, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_LIST, "Numero");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_FORM, 4, 676, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODEL2, MyGlb.PANEL_FORM, "Numero");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMERODEL2, -1, GRP_EMISMANUMAND_DELIBERA);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_NUMERODEL2, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMERODEL2, PPQRY_LIQ14, "A.NUMERO_DEL", "LIQNUMERDEL2", 1, 19, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_LIST, 2164, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_LIST, "Anno");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_FORM, 4, 700, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODEL2, MyGlb.PANEL_FORM, "Anno");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNODEL2, -1, GRP_EMISMANUMAND_DELIBERA);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_ANNODEL2, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNODEL2, PPQRY_LIQ14, "A.ANNO_DEL", "LIQANNODEL2", 1, 19, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_LIST, 2204, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_LIST, "Unita Prop.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 724, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UNITAPROPONE, MyGlb.PANEL_FORM, "Unita Prop.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_UNITAPROPONE, -1, GRP_EMISMANUMAND_PROPOSTA);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_UNITAPROPONE, PPQRY_LIQ14, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_LIST, 2284, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 748, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMEROPROPOS, -1, GRP_EMISMANUMAND_PROPOSTA);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMEROPROPOS, PPQRY_LIQ14, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_LIST, 2336, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 772, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNOPROPOSTA, -1, GRP_EMISMANUMAND_PROPOSTA);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNOPROPOSTA, PPQRY_LIQ14, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_LIST, 2376, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_LIST, 100);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_LIST, "Diverso Beneficiario");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_FORM, 4, 1132, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_FORM, 100);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DIVERSBENEFI, MyGlb.PANEL_FORM, "Div. Beneficiario");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_DIVERSBENEFI, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_DIVERSBENEFI, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_DIVERSBENEFI, PPQRY_LIQ14, "K.RAGIONE_SOCIALE_ESTESA", "LIQDIVERBENE", 5, 60, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_LIST, 2584, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 796, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_FORM, 104);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMERODISTIN, -1, GRP_EMISMANUMAND_DISTINLIQUID);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMERODISTIN, PPQRY_LIQ14, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 6, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_LIST, 2664, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_LIST, "Anno");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 820, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNODISTINTA, -1, GRP_EMISMANUMAND_DISTINLIQUID);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNODISTINTA, PPQRY_LIQ14, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_LIST, 2716, 36, 100, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_LIST, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_LIST, "Piano Conti Int.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_FORM, 4, 1708, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_FORM, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_PIANOCONTINT, MyGlb.PANEL_FORM, "Piano Conti Int.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_PIANOCONTINT, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_PIANOCONTINT, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_PIANOCONTINT, PPQRY_LIQ14, "NVL(TO_CHAR ( A.COD_LIVELLO_5 ), A_GET_COD_RICL_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') || '000')", "PIANOCONTINT", 5, 99, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_LIST, 2816, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_LIST, "Cofog");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_FORM, 4, 1732, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICECOFOG, MyGlb.PANEL_FORM, "Cofog");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_CODICECOFOG, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_CODICECOFOG, PPQRY_LIQ14, "A.CODICE_COFOG", "LIQCODICCOFO", 1, 3, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_LIST, 2860, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Eu.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 1756, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Eu.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_CODICEEUROPE, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_CODICEEUROPE, PPQRY_LIQ14, "A.CODICE_EUROPEO", "LIQCODICEURO", 1, 1, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_LIST, 2912, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 844, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_FINANZIAMENT, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_FINANZIAMENT, PPQRY_LIQ14, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_LIST, 3004, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_LIST, 152);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_LIST, " ");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_FORM, 4, 1660, 584, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_FORM, 152);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_INFOFINANZIA, MyGlb.PANEL_FORM, " ");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_INFOFINANZIA, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_INFOFINANZIA, PPQRY_DUAL, "DECODE(~~FINANZIAMENTO~~, to_number(NULL), NULL, 'I')", "DUALINFOFINA", 5, 99, 0, -13997);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_INFOFINANZIA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, MyGlb.PANEL_LIST, 0, 0, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, MyGlb.PANEL_FORM, 40, 0, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQUIDALABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_LIQUIDALABEL, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, MyGlb.PANEL_LIST, 296, 0, 192, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, MyGlb.PANEL_FORM, 48, 8, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DOCUMENLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_DOCUMENLABEL, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, MyGlb.PANEL_LIST, 832, 0, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, MyGlb.PANEL_FORM, 56, 16, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CAPITOLOART, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_CAPITOLOART, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, MyGlb.PANEL_LIST, 984, 0, 252, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, MyGlb.PANEL_FORM, 64, 24, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_IMPEGNOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_IMPEGNOLABEL, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_LIST, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_LIST, "Numero Impegno");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_FORM, 4, 1204, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_FORM, 92);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROIMPEGN, MyGlb.PANEL_FORM, "Num. Impegno");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMEROIMPEGN, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_NUMEROIMPEGN, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMEROIMPEGN, PPQRY_LIQ14, "DECODE(~~PQRY_PARAMETRI341.ROWNAMEORDIN~~, '1', F.NUMERO_IMP, 1)", "LIQNUMERIMPE", 1, 19, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_LIST, "Anno Impegno");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_FORM, 4, 1204, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_FORM, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOIMPEGNO, MyGlb.PANEL_FORM, "Ann. Imp.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNOIMPEGNO, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_ANNOIMPEGNO, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNOIMPEGNO, PPQRY_LIQ14, "DECODE(~~PQRY_PARAMETRI341.ROWNAMEORDIN~~, '1', F.ANNO_IMP, 1)", "LIQANNOIMPEG", 1, 19, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, MyGlb.PANEL_LIST, 1236, 0, 252, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, MyGlb.PANEL_LIST, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, MyGlb.PANEL_FORM, 80, 40, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, MyGlb.PANEL_FORM, 0);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SUBIMPEGNQBE, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_SUBIMPEGNQBE, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_SUBIMPEGNQBE, -1, "", "SUBIMPEGNQBE", 0, 0, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_LIST, 2936, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_FORM, 4, 1252, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNOMAND, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNOMAND, PPQRY_LIQ14, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_LIST, 0, 36, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_LIST, 88);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_LIST, 2);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_LIST, "Old In Emissione");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_FORM, 4, 1276, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_FORM, 88);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_FORM, 2);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_OLDINEMISSIO, MyGlb.PANEL_FORM, "Old In Emissione");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_OLDINEMISSIO, -1, -1);
    PAN_EMISMANUMAND.SetFieldUnbound(PFL_EMISMANUMAND_OLDINEMISSIO, true);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_OLDINEMISSIO, PPQRY_LIQ14, "CASE WHEN NOT ((A.ANNO_MAND IS NULL)) THEN 'SI' ELSE 'NO' END", "LIQOLDINEMIS", 5, 99, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_LIST, 68);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_FORM, 4, 1276, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_FORM, 68);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_ANNOPROG, MyGlb.PANEL_FORM, "ANN. PROG");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_ANNOPROG, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_ANNOPROG, PPQRY_LIQ14, "C.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_LIST, 84);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_FORM, 4, 1276, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_FORM, 84);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROPROG, MyGlb.PANEL_FORM, "NUM. PROG");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMEROPROG, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMEROPROG, PPQRY_LIQ14, "C.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_LIST, 2960, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_LIST, 52);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_LIST, "UFFICIO");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_FORM, 4, 1324, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_UFFICIO, MyGlb.PANEL_FORM, "UFFICIO");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_UFFICIO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_UFFICIO, PPQRY_LIQ14, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_LIST, 3012, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_LIST, 40);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_LIST, "BOL.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_FORM, 4, 1348, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BOLLO, MyGlb.PANEL_FORM, "BOL.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_BOLLO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_BOLLO, PPQRY_LIQ14, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_LIST, 3052, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_LIST, "TIPO VINCOLO");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 1372, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_TIPOVINCOLO, MyGlb.PANEL_FORM, "TP. VINCOLO");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_TIPOVINCOLO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_TIPOVINCOLO, PPQRY_LIQ14, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_LIST, "BENEFIC.");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 1396, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_BENEFICIARIO, MyGlb.PANEL_FORM, "BENEFIC.");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_BENEFICIARIO, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_BENEFICIARIO, PPQRY_LIQ14, "A.BENEFICIARIO", "BENEFICIARIO", 2, 15, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_LIST, 2748, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_LIST, 28);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_LIST, "CIG");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_FORM, 4, 1708, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_FORM, 28);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_CIG, MyGlb.PANEL_FORM, "CIG");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_CIG, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_CIG, PPQRY_LIQ14, "A.CIG", "LIQCIG", 5, 15, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_LIST, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_LIST, "LIQ PARZ");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_FORM, 4, 1780, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_FORM, 60);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_LIQPARZ, MyGlb.PANEL_FORM, "LIQ PARZ");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_LIQPARZ, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_LIQPARZ, PPQRY_LIQ14, "A.LIQ_PARZ", "LIQPARZ", 5, 2, 0, -13997);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_LIQPARZ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISMANUMAND.SetValueListItem(PFL_EMISMANUMAND_LIQPARZ, (new IDVariant()), "Null", "", "", -1);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_LIST, 3028, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_LIST, 120);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_LIST, "Numero ");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_FORM, 4, 1708, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_FORM, 120);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_NUMEROCONTAB, MyGlb.PANEL_FORM, "Numero ");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_NUMEROCONTAB, -1, GRP_EMISMANUMAND_CONTABILE);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_NUMEROCONTAB, PPQRY_LIQ14, "A.NUMERO_CONTABILE", "LIQNUMERCONT", 5, 10, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_LIST, 3128, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_LIST, 104);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_LIST, "Data");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_FORM, 4, 1732, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_FORM, 104);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_DATACONTABIL, MyGlb.PANEL_FORM, "Data");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_DATACONTABIL, -1, GRP_EMISMANUMAND_CONTABILE);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_DATACONTABIL, PPQRY_LIQ14, "A.DATA_CONTABILE", "LIQDATACONTA", 6, 19, 0, -13997);
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_LIST, 3004, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_LIST, 68);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_LIST, "SCADENZA");
    PAN_EMISMANUMAND.SetRect(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_FORM, 4, 1780, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISMANUMAND.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_FORM, 68);
    PAN_EMISMANUMAND.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_EMISMANUMAND.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISMANUMAND_SCADENZA, MyGlb.PANEL_FORM, "SCADENZA");
    PAN_EMISMANUMAND.SetFieldPage(PFL_EMISMANUMAND_SCADENZA, -1, -1);
    PAN_EMISMANUMAND.SetFieldPanel(PFL_EMISMANUMAND_SCADENZA, PPQRY_LIQ14, "D.SCADENZA", "LIQQTNSCADEN", 6, 10, 0, -13997);
  }

  private void PAN_EMISMANUMAND_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISMANUMAND.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~NUMERO_LIQ~~, to_number(NULL), NULL, 'I') as DUALINFOLIQU, ");
    SQL.append("  DECODE(~~ANNO_PROG~~, to_number(NULL), NULL, 'I') as DUALINFODOC, ");
    SQL.append("  DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I') as DUALINFOIMPE, ");
    SQL.append("  DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I') as DUAINFSUBIMP, ");
    SQL.append("  DECODE(~~FINANZIAMENTO~~, to_number(NULL), NULL, 'I') as DUALINFOFINA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_EMISMANUMAND.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_EMISMANUMAND.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISMANUMAND.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_EMISMANUMAND.SetIMDB(IMDB, "PQRY_LIQ14", true);
    PAN_EMISMANUMAND.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as LIBERASOESES, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  C.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  C.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  E.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.RITENUTE as RITENUTE, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  F.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  F.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  F.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  G.SEDE_DEL as LIQSEDEDEL1, ");
    SQL.append("  G.NUMERO_DEL as LIQNUMERDEL1, ");
    SQL.append("  G.ANNO_DEL as LIQANNODEL1, ");
    SQL.append("  H.DESCRIZIONE as LIQBOLLO, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  I.DESCRIZIONE as LIQTIPOVINCO, ");
    SQL.append("  A.SEDE_DEL as LIQSEDEDEL2, ");
    SQL.append("  A.NUMERO_DEL as LIQNUMERDEL2, ");
    SQL.append("  A.ANNO_DEL as LIQANNODEL2, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  J.DESCRIZIONE as LIQUFFICIO, ");
    SQL.append("  K.RAGIONE_SOCIALE_ESTESA as LIQDIVERBENE, ");
    SQL.append("  DECODE(~~PQRY_PARAMETRI341.ROWNAMEORDIN~~, '1', F.NUMERO_IMP, 1) as LIQNUMERIMPE, ");
    SQL.append("  DECODE(~~PQRY_PARAMETRI341.ROWNAMEORDIN~~, '1', F.ANNO_IMP, 1) as LIQANNOIMPEG, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_MAND IS NULL)) THEN 'SI' ELSE 'NO' END as LIQOLDINEMIS, ");
    SQL.append("  C.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  C.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  A.UFFICIO as UFFICIO, ");
    SQL.append("  A.BOLLO as BOLLO, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.CIG as LIQCIG, ");
    SQL.append("  NVL(TO_CHAR ( A.COD_LIVELLO_5 ), A_GET_COD_RICL_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') || '000') as PIANOCONTINT, ");
    SQL.append("  A.CODICE_COFOG as LIQCODICCOFO, ");
    SQL.append("  A.CODICE_EUROPEO as LIQCODICEURO, ");
    SQL.append("  A.LIQ_PARZ as LIQPARZ, ");
    SQL.append("  A.NUMERO_CONTABILE as LIQNUMERCONT, ");
    SQL.append("  A.DATA_CONTABILE as LIQDATACONTA, ");
    SQL.append("  D.SCADENZA as LIQQTNSCADEN ");
    PAN_EMISMANUMAND.SetQuery(PPQRY_LIQ14, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  FAT C, ");
    SQL.append("  QTN D, ");
    SQL.append("  T02 E, ");
    SQL.append("  IMP F, ");
    SQL.append("  SUBIMP G, ");
    SQL.append("  T60 H, ");
    SQL.append("  VINCOLI I, ");
    SQL.append("  T53 J, ");
    SQL.append("  BEN K ");
    PAN_EMISMANUMAND.SetQuery(PPQRY_LIQ14, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (C.ANNO_PROG(+) = A.FAT_ANNO_PROG) ");
    SQL.append("and   (C.NUMERO_PROG(+) = A.FAT_NUMERO_PROG) ");
    SQL.append("and   (D.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (D.NUM_QUIETANZA(+) = A.NUM_QUIETANZA) ");
    SQL.append("and   (E.CODICE(+) = D.TIPO_QUIETANZA) ");
    SQL.append("and   (F.ANNO_IMP(+) = A.ANNO_IMP) ");
    SQL.append("and   (F.NUMERO_IMP(+) = A.NUMERO_IMP) ");
    SQL.append("and   (G.ANNO_SUBIMP(+) = A.ANNO_SUBIMP) ");
    SQL.append("and   (G.NUMERO_SUBIMP(+) = A.NUMERO_SUBIMP) ");
    SQL.append("and   (H.CODICE(+) = A.BOLLO) ");
    SQL.append("and   (I.CODICE(+) = A.TIPO_VINCOLO) ");
    SQL.append("and   (J.CODICE(+) = A.UFFICIO) ");
    SQL.append("and   (K.CODICE(+) = A.DIVERSO_BEN) ");
    SQL.append("and   (A.ANNO_LIQ <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.ANNO_MAND IS NULL)) ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   ((A.D_DATA_REG BETWEEN DECODE(~~PQRY_PARAMETRI341.ROWNAMDALIDA~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMETRI341.ROWNAMDALIDA~~) AND DECODE(~~PQRY_PARAMETRI341.ROWNAMDALIAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~PQRY_PARAMETRI341.ROWNAMDALIAL~~))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI341.ROWNAMNULIDA~~ IS NULL) OR A.NUMERO_LIQ >= ~~PQRY_PARAMETRI341.ROWNAMNULIDA~~) ");
    SQL.append("and   ((~~PQRY_PARAMETRI341.ROWNAMNULIAL~~ IS NULL) OR A.NUMERO_LIQ <= ~~PQRY_PARAMETRI341.ROWNAMNULIAL~~) ");
    SQL.append("and   ((NVL(C.D_SCADENZA, DECODE(~~PQRY_PARAMETRI341.ROWNAMSCADAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMETRI341.ROWNAMSCADAL~~)) BETWEEN DECODE(~~PQRY_PARAMETRI341.ROWNAMSCADAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMETRI341.ROWNAMSCADAL~~) AND DECODE(~~PQRY_PARAMETRI341.ROWNAMESCAAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~PQRY_PARAMETRI341.ROWNAMESCAAL~~))) ");
    SQL.append("and   (NVL(C.ANNO_PROG, 9999) = DECODE(~~PQRY_PARAMETRI341.RONASOLINODF~~, 'SI', 9999, NVL(C.ANNO_PROG, 9999))) ");
    PAN_EMISMANUMAND.SetQuery(PPQRY_LIQ14, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISMANUMAND.SetQuery(PPQRY_LIQ14, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISMANUMAND.SetQuery(PPQRY_LIQ14, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_EMISMANUMAND.SetQuery(PPQRY_LIQ14, 5, SQL, -1, "");
    PAN_EMISMANUMAND.SetQueryDB(PPQRY_LIQ14, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISMANUMAND.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISMANUMAND.Status() == 2)
    {
      int oldListQBE = PAN_EMISMANUMAND.iUseListQBE;
      PAN_EMISMANUMAND.iUseListQBE = 0;
      PAN_EMISMANUMAND.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISMANUMAND.PanelCommand(Glb.PCM_FIND);
      PAN_EMISMANUMAND.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "D4272165-5E59-46D4-BCEC-910466E31C1C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "Data Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 0, -9999, 84, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 8, 3, 248, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0, 100);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, "E78B6D3C-6EC6-421F-B97A-422EB6F8DE98");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, "Num. Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, MyGlb.PANEL_LIST, 208, -9999, 144, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, MyGlb.PANEL_FORM, 324, 3, 156, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 0, 101);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, "6DDA8B5C-64C4-45E4-AB5B-37F9F3E0D68C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, "Scadenza Pagamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, MyGlb.PANEL_LIST, 352, -9999, 208, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, MyGlb.PANEL_FORM, 532, 3, 240, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 0, 122);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "6A3D5A09-E917-4A0B-86CB-22A9E8881105");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 680, -9999, 136, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 8, 59, 316, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0, 74);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "7E6E5339-31B4-418D-8D7C-6666AA32E294");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "C8EB8BA2-E001-4EFD-A907-7C84C5E08B5F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, "717F53BC-1C01-470D-BC97-307D1D1887F0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, "Dal ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "38DDE1E4-DC7E-44C9-B784-9B5302F3B89C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "Al ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "51CDD8C4-3045-4328-B6AB-33F879591EF4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal  ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "62268C87-B606-41D2-A6BA-6A6E2F372DEE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al  ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, "BD6C92E9-9325-46E6-8C5C-9063483885AB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, "Solo Liquidazioni non di Fattura");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "8FFDAF72-2AC8-4019-B3F3-4D95136BB196");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, "75FEA3C4-C9BB-4533-AF43-D1D7F1EC062F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, "Numero");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, "EE2072F1-B986-498A-80B9-312E60E17FDB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, "4A426528-4402-4D7A-8294-6D02FFBB041E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, "Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "6B0016D9-16BF-4216-8E89-B008A1C4B41F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "Data ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, "5E1B5BE0-705C-437B-BE77-6755EF4137D5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, "Totale");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.VIS_ETICGRASRIGH);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, "01903F85-00B8-4B36-BA65-DDD8D8426436");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, "Mandato a Copertura");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, "Mandato a Copertura");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 12, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI341, "A.ROWNAMDALIDA", "ROWNAMDALIDA", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 144, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_PARAMETRI341, "A.ROWNAMDALIAL", "ROWNAMDALIAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, "Dal ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, 328, 28, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, "Dal ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL2, -1, GRP_PARAMETRI_NUMLIQUIDAZI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL2, PPQRY_PARAMETRI341, "A.ROWNAMNULIDA", "ROWNAMNULIDA", 1, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 280, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, "Al ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 412, 28, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, "Al ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL2, -1, GRP_PARAMETRI_NUMLIQUIDAZI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL2, PPQRY_PARAMETRI341, "A.ROWNAMNULIAL", "ROWNAMNULIAL", 1, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 352, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal  ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 536, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal  ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_SCADENPAGAME);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI341, "A.ROWNAMSCADAL", "ROWNAMSCADAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 456, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al  ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 660, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al  ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_SCADENPAGAME);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI341, "A.ROWNAMESCAAL", "ROWNAMESCAAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, "S. L. n. d. F.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, 560, 84, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, "Solo Liquidazioni non di Fattura");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLLIQNODIFA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLLIQNODIFA, PPQRY_PARAMETRI341, "A.RONASOLINODF", "RONASOLINODF", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLLIQNODIFA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLLIQNODIFA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 680, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 12, 84, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ORDINAMENTO, -1, GRP_PARAMETRI_ORDINAMENTO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ORDINAMENTO, PPQRY_PARAMETRI341, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("1")), "Per Impegno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("2")), "Per Beneficiario", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("3")), "Per Num. Liquidazione", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 12, 140, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERO, PPQRY_PARAMETRI341, "A.ROWNAMENUMER", "ROWNAMENUMER", 1, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_LIST, "Data");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, 140, 140, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA2, MyGlb.PANEL_FORM, "Data");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATA2, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATA2, PPQRY_PARAMETRI341, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_LIST, "Distinta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_FORM, 284, 140, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTA, MyGlb.PANEL_FORM, "Distinta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTINTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTINTA, PPQRY_PARAMETRI341, "A.ROWNAMNUMDIS", "ROWNAMNUMDIS", 1, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 404, 140, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATA, PPQRY_PARAMETRI341, "A.ROWNAMDATDIS", "ROWNAMDATDIS", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_LIST, 532, 132, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_FORM, 628, 140, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALINEMISS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTALINEMISS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTALINEMISS, -1, "", "TOTALINEMISS", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_LIST, "Mandato a Copertura");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_FORM, 332, 84, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_COPERTURA, MyGlb.PANEL_FORM, "Mandato a Copertura");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_COPERTURA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_COPERTURA, PPQRY_PARAMETRI341, "A.ROWNAMECOPER", "ROWNAMECOPER", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COPERTURA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_COPERTURA, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI341", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI341, IMDBDef15.PQRY_PARAMETRI341_RS, IMDBDef5.TBL_PARAMETRI301);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef5.FLD_PARAMETRI301_ROWNAMDALIAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL2, IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL2, IMDBDef5.FLD_PARAMETRI301_ROWNAMNULIAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI301_ROWNAMSCADAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI301_ROWNAMESCAAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLLIQNODIFA, IMDBDef5.FLD_PARAMETRI301_RONASOLINODF);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ORDINAMENTO, IMDBDef5.FLD_PARAMETRI301_ROWNAMEORDIN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERO, IMDBDef5.FLD_PARAMETRI301_ROWNAMENUMER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATA2, IMDBDef5.FLD_PARAMETRI301_ROWNAMEDATA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DISTINTA, IMDBDef5.FLD_PARAMETRI301_ROWNAMNUMDIS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATA, IMDBDef5.FLD_PARAMETRI301_ROWNAMDATDIS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_COPERTURA, IMDBDef5.FLD_PARAMETRI301_ROWNAMECOPER);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI301");
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
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_OnChangeSelection(NewVal, Final, Cancel);
  }
  
  public void OnChangeLocking(IDPanel SrcObj, IDVariant NewLocking, IDVariant Cancel)
  {
  }
  
  public void OnChangeStatus(IDPanel SrcObj, IDVariant OldStatus)
  {
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_AfterFind(CmdFind);
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
    if (SrcObj == PAN_EMISMANUMAND) PAN_EMISMANUMAND_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
