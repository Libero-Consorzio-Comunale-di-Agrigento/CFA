// **********************************************
// Liquidazioni Da Emettere In Mandato
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniDaEmettereInMandato extends MyWebForm implements Serializable
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
  private static int PFL_PARAMETRI_TIPOSCADENZA = 6;
  private static int PFL_PARAMETRI_SOLLIQNODIFA = 7;
  private static int PFL_PARAMETRI_SOLOGIAINEMI = 8;
  private static int PFL_PARAMETRI_ORDINAMENTO = 9;
  private static int PFL_PARAMETRI_TOTALE = 10;
  private static int PFL_PARAMETRI_UFFICIO = 11;
  private static int PFL_PARAMETRI_NUMERODISTIN = 12;
  private static int PFL_PARAMETRI_ANNODISTINTA = 13;

  private static int PPQRY_PARAMETRI300 = 0;

  private static int PPQRY_T01 = 1;
  private static int PPQRY_T53 = 2;


  IDPanel PAN_PARAMETRI;
  private static int GRP_LIQUIDAEMETT_DOCUMENTO = 0;
  private static int GRP_LIQUIDAEMETT_IMPEGNO = 1;
  private static int GRP_LIQUIDAEMETT_SUBIMPEGNO = 2;
  private static int GRP_LIQUIDAEMETT_DELIBERA = 3;
  private static int GRP_LIQUIDAEMETT_PROPOSTA = 4;
  private static int GRP_LIQUIDAEMETT_DISTINTALIQ = 5;
  private static int GRP_LIQUIDAEMETT_CONTABTESORE = 6;

  private static int PFL_LIQUIDAEMETT_EMISS = 0;
  private static int PFL_LIQUIDAEMETT_NUMEROLIQ = 1;
  private static int PFL_LIQUIDAEMETT_ANNOLIQ = 2;
  private static int PFL_LIQUIDAEMETT_INFOLIQUIDAZ = 3;
  private static int PFL_LIQUIDAEMETT_DATA = 4;
  private static int PFL_LIQUIDAEMETT_BENEFICIARIO = 5;
  private static int PFL_LIQUIDAEMETT_NUMERODOC = 6;
  private static int PFL_LIQUIDAEMETT_DDATADOC = 7;
  private static int PFL_LIQUIDAEMETT_INFODOC = 8;
  private static int PFL_LIQUIDAEMETT_SCADENZA1 = 9;
  private static int PFL_LIQUIDAEMETT_QUIETANZA = 10;
  private static int PFL_LIQUIDAEMETT_IMPORTO = 11;
  private static int PFL_LIQUIDAEMETT_RITENUTE = 12;
  private static int PFL_LIQUIDAEMETT_CAPITOLO = 13;
  private static int PFL_LIQUIDAEMETT_ARTICOLO = 14;
  private static int PFL_LIQUIDAEMETT_NUMEROIMP = 15;
  private static int PFL_LIQUIDAEMETT_ANNOIMP = 16;
  private static int PFL_LIQUIDAEMETT_SEDEDELIMP = 17;
  private static int PFL_LIQUIDAEMETT_NUMERODEL = 18;
  private static int PFL_LIQUIDAEMETT_ANNODEL1 = 19;
  private static int PFL_LIQUIDAEMETT_INFOIMPEGNO = 20;
  private static int PFL_LIQUIDAEMETT_NUMEROSUBIMP = 21;
  private static int PFL_LIQUIDAEMETT_ANNOSUBIMP = 22;
  private static int PFL_LIQUIDAEMETT_SEDEDELSUBIM = 23;
  private static int PFL_LIQUIDAEMETT_NUMERDELSUBI = 24;
  private static int PFL_LIQUIDAEMETT_ANNODELSUBIM = 25;
  private static int PFL_LIQUIDAEMETT_INFOSUBIMPEG = 26;
  private static int PFL_LIQUIDAEMETT_BOLLO = 27;
  private static int PFL_LIQUIDAEMETT_VOCEEC = 28;
  private static int PFL_LIQUIDAEMETT_CGU = 29;
  private static int PFL_LIQUIDAEMETT_TIPOVINCOLO = 30;
  private static int PFL_LIQUIDAEMETT_UFFICIO1 = 31;
  private static int PFL_LIQUIDAEMETT_SEDEDEL = 32;
  private static int PFL_LIQUIDAEMETT_NUMERODE = 33;
  private static int PFL_LIQUIDAEMETT_ANNODEL = 34;
  private static int PFL_LIQUIDAEMETT_UNITAPROPONE = 35;
  private static int PFL_LIQUIDAEMETT_NUMEROPROPOS = 36;
  private static int PFL_LIQUIDAEMETT_ANNOPROPOSTA = 37;
  private static int PFL_LIQUIDAEMETT_DIVERSBENEFI = 38;
  private static int PFL_LIQUIDAEMETT_NUMERODISTI1 = 39;
  private static int PFL_LIQUIDAEMETT_ANNODISTINT1 = 40;
  private static int PFL_LIQUIDAEMETT_PIANOCONTINT = 41;
  private static int PFL_LIQUIDAEMETT_CODICECOFOG = 42;
  private static int PFL_LIQUIDAEMETT_CODICEEUROPE = 43;
  private static int PFL_LIQUIDAEMETT_FINANZIAMENT = 44;
  private static int PFL_LIQUIDAEMETT_INFOFINANZIA = 45;
  private static int PFL_LIQUIDAEMETT_NUMEROCONTAB = 46;
  private static int PFL_LIQUIDAEMETT_DATACONTABIL = 47;
  private static int PFL_LIQUIDAEMETT_LIQUIDALABEL = 48;
  private static int PFL_LIQUIDAEMETT_DELIBERLABEL = 49;
  private static int PFL_LIQUIDAEMETT_PROPOSTLABEL = 50;
  private static int PFL_LIQUIDAEMETT_NUMEROIMPEGN = 51;
  private static int PFL_LIQUIDAEMETT_ANNOIMPEGNO = 52;
  private static int PFL_LIQUIDAEMETT_ANNOMAND = 53;
  private static int PFL_LIQUIDAEMETT_OLDINEMISSIO = 54;
  private static int PFL_LIQUIDAEMETT_ANNOPROG = 55;
  private static int PFL_LIQUIDAEMETT_NUMEROPROG = 56;
  private static int PFL_LIQUIDAEMETT_SCADENZA = 57;

  private static int PPQRY_LIQ15 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_LIQUIDAEMETT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI290(IMDB);
    Init_TBL_FINANZIAMEN5(IMDB);
    //
    //
    Init_PQRY_LIQ15(IMDB);
    Init_PQRY_PARAMETRI300(IMDB);
    Init_PQRY_PARAMETRI300_RS(IMDB);
    Init_QRY_FINANZIAME16(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI290(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI290, 13);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI290, "TBL_PARAMETRI290");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIDA, "ROWNAMDALIDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIDA,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIAL, "ROWNAMDALIAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIAL,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIDA, "ROWNAMNULIDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIDA,1,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIAL, "ROWNAMNULIAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIAL,1,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMSCADAL, "ROWNAMSCADAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMSCADAL,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMESCAAL, "ROWNAMESCAAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMESCAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMTIPSCA, "ROWNAMTIPSCA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMTIPSCA,1,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_RONASOLINODF, "RONASOLINODF");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_RONASOLINODF,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_RONASOGIINEM, "RONASOGIINEM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_RONASOGIINEM,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMEORDIN,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMEUFFIC,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMANNDIS, "ROWNAMANNDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI290,IMDBDef5.FLD_PARAMETRI290_ROWNAMNUMDIS,1,6,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI290, 0);
  }

  private static void Init_TBL_FINANZIAMEN5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_FINANZIAMEN5, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_FINANZIAMEN5, "TBL_FINANZIAMEN5");
    IMDB.set_FldCode(IMDBDef5.TBL_FINANZIAMEN5,IMDBDef5.FLD_FINANZIAMEN5_FINFINANZIAM, "FINFINANZIAM");
    IMDB.SetFldParams(IMDBDef5.TBL_FINANZIAMEN5,IMDBDef5.FLD_FINANZIAMEN5_FINFINANZIAM,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_FINANZIAMEN5,IMDBDef5.FLD_FINANZIAMEN5_FINIMPORTO, "FINIMPORTO");
    IMDB.SetFldParams(IMDBDef5.TBL_FINANZIAMEN5,IMDBDef5.FLD_FINANZIAMEN5_FINIMPORTO,3,14,2);
  }

  private static void Init_PQRY_LIQ15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ15, 50);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ15, "PQRY_LIQ15");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIBERASOESES, "LIBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_D_SCADENZA, "D_SCADENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_D_SCADENZA,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_RITENUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQSEDDELSUB, "LIQSEDDELSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQSEDDELSUB,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMDELSUB, "LIQNUMDELSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMDELSUB,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQANNDELSUB, "LIQANNDELSUB");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQANNDELSUB,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQBOLLO, "LIQBOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQBOLLO,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQTIPOVINCO, "LIQTIPOVINCO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQTIPOVINCO,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQSEDEDEL, "LIQSEDEDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQSEDEDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMERODE, "LIQNUMERODE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMERODE,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQANNODEL, "LIQANNODEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQANNODEL,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_DISTINTA,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQEMISS, "LIQEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQEMISS,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQUFFICIO, "LIQUFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQUFFICIO,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQDIVERBENE, "LIQDIVERBENE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQDIVERBENE,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMERIMPE, "LIQNUMERIMPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMERIMPE,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQANNOIMPEG, "LIQANNOIMPEG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQANNOIMPEG,1,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQOLDINEMIS, "LIQOLDINEMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQOLDINEMIS,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_PIANOCONTINT, "PIANOCONTINT");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_PIANOCONTINT,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQCODICCOFO, "LIQCODICCOFO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQCODICCOFO,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQCODICEURO, "LIQCODICEURO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQCODICEURO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMERCONT, "LIQNUMERCONT");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQNUMERCONT,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQDATACONTA, "LIQDATACONTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQDATACONTA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQQTNSCADEN, "LIQQTNSCADEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ15,IMDBDef14.PQSL_LIQ15_LIQQTNSCADEN,6,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ15, 0);
  }

  private static void Init_PQRY_PARAMETRI300(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI300, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI300, "PQRY_PARAMETRI300");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIDA, "ROWNAMDALIDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIDA,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIAL, "ROWNAMDALIAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIDA, "ROWNAMNULIDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIDA,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIAL, "ROWNAMNULIAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIAL,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMSCADAL, "ROWNAMSCADAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMSCADAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMESCAAL, "ROWNAMESCAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMESCAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMTIPSCA, "ROWNAMTIPSCA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMTIPSCA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_RONASOLINODF, "RONASOLINODF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_RONASOLINODF,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_RONASOGIINEM, "RONASOGIINEM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_RONASOGIINEM,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEORDIN,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEUFFIC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMANNDIS, "ROWNAMANNDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNUMDIS,1,6,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI300, 0);
  }

  private static void Init_PQRY_PARAMETRI300_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI300_RS, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI300_RS, "PQRY_PARAMETRI300_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIDA, "ROWNAMDALIDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIDA,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIAL, "ROWNAMDALIAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMDALIAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIDA, "ROWNAMNULIDA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIDA,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIAL, "ROWNAMNULIAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNULIAL,1,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMSCADAL, "ROWNAMSCADAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMSCADAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMESCAAL, "ROWNAMESCAAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMESCAAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMTIPSCA, "ROWNAMTIPSCA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMTIPSCA,1,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_RONASOLINODF, "RONASOLINODF");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_RONASOLINODF,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_RONASOGIINEM, "RONASOGIINEM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_RONASOGIINEM,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEORDIN,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMEUFFIC,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMANNDIS, "ROWNAMANNDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI300_RS,IMDBDef14.PQSL_PARAMETRI300_ROWNAMNUMDIS,1,6,0);
  }

  private static void Init_QRY_FINANZIAME16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.QRY_FINANZIAME16, 2);
    IMDB.set_TblCode(IMDBDef14.QRY_FINANZIAME16, "QRY_FINANZIAME16");
    IMDB.set_FldCode(IMDBDef14.QRY_FINANZIAME16,IMDBDef14.QSL_FINANZIAME16_FINFINANZIAM, "FINFINANZIAM");
    IMDB.SetFldParams(IMDBDef14.QRY_FINANZIAME16,IMDBDef14.QSL_FINANZIAME16_FINFINANZIAM,1,5,0);
    IMDB.set_FldCode(IMDBDef14.QRY_FINANZIAME16,IMDBDef14.QSL_FINANZIAME16_SOMMAIMPORTO, "SOMMAIMPORTO");
    IMDB.SetFldParams(IMDBDef14.QRY_FINANZIAME16,IMDBDef14.QSL_FINANZIAME16_SOMMAIMPORTO,3,28,6);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniDaEmettereInMandato(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniDaEmettereInMandato()
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
    FormIdx = MyGlb.FRM_LIQDAEMEINMA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "25E408E9-AB35-4117-8C19-0E60D742FE25";
    ResModeW = 2;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 562;
    set_Caption(new IDVariant("Liquidazioni Da Emettere In Mandato"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 536;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.283582;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 832;
    Frames[2].Height = 152;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 832;
    Frames[2].FixedHeight = 152;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 152-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "82D2CACC-1E80-4F44-9614-B75C73827DD0");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1004, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 832;
    Frames[3].Height = 384;
    Frames[3].Caption = "Liquidazioni Da Emettere";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 384;
    PAN_LIQUIDAEMETT = new IDPanel(w, this, 3, "PAN_LIQUIDAEMETT");
    Frames[3].Content = PAN_LIQUIDAEMETT;
    PAN_LIQUIDAEMETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAEMETT.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 384-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "875E42E0-AE6A-41A0-8CD8-CF0B395D2964");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3260, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAEMETT.InitStatus = 2;
    PAN_LIQUIDAEMETT_Init();
    PAN_LIQUIDAEMETT_InitFields();
    PAN_LIQUIDAEMETT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA8+BaseCmdLinIdx)
      {
        Salva();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI290, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQDAEMEINMA_PARAMETRI300();
      }
      PAN_LIQUIDAEMETT.UpdatePanel(MainFrm);
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
    return (obj instanceof LiquidazioniDaEmettereInMandato);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniDaEmettereInMandato.class.getName() : (Glb.ClassWithPackage(LiquidazioniDaEmettereInMandato.class) ? LiquidazioniDaEmettereInMandato.class.getName().substring(LiquidazioniDaEmettereInMandato.class.getPackage().getName().length() + 1) : LiquidazioniDaEmettereInMandato.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_UFFICIO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI300, IMDBDef14.PQSL_PARAMETRI300_ROWNAMEUFFIC, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI300, IMDBDef14.PQSL_PARAMETRI300_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "ParametriOnUpdatingRow", _e);
    }
  }

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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMANNOLIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_LIQ, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI3, IMDBDef5.FLD_PARAMETRI3_PARAMNUMELIQ, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_NUMERO_LIQ, 0));
      MainFrm.Show(MyGlb.FRM_INFOLIQUIDAZ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "ApriInfoLiquidazione", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "InfoVocePeg", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_NUMERO_IMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "InfoImpegno", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_NUMERO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_NUMERO_SUBIMP, 0));
        if (IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "InfoSubimpegno", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_FINANZIAMENTO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI33, IMDBDef1.FLD_PARAMETRI33_PARACODIFINA, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_FINANZIAMENTO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMFINAN1, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "InfoFinanziamento", _e);
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
    IDVariant v_TOTALE = new IDVariant(0,IDVariant.STRING);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      v_TOTALE = (new IDVariant("Totale in emissione: ", IDVariant.STRING));
      // 
      // Setta Importo Totale Body
      // Procedure Body
      // 
      C2 = PAN_LIQUIDAEMETT.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_LIQUIDAEMETT.GotoFirst();
      while (!PAN_LIQUIDAEMETT.RSEOF())
      {
        if (C2.Get("LIQEMISS").equals((new IDVariant("SI")), true))
        {
          v_TOTALEIMPORT = IDL.Add(v_TOTALEIMPORT, C2.Get("IMPORTO"));
        }
        PAN_LIQUIDAEMETT.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_PARAMETRI.set_FieldText(PFL_PARAMETRI_TOTALE, IDL.Add(v_TOTALE, IDL.Format(IDL.NullValue(v_TOTALEIMPORT,(new IDVariant(0))), (new IDVariant("###,###,###,##0.00")), MainFrm)).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "SettaImportoTotale", _e);
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
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, (Abilita.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "AbilitaDisabilitaRicerca", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Salva
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SEERRORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MESSAGGIO2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NUMERRORI = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;
    IDCachedRowSet C11;

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Finanziamento ", IDVariant.STRING));
      v_MESSAGGIO1 = (new IDVariant(" in anticipazione.", IDVariant.STRING));
      v_MESSAGGIO2 = (new IDVariant("Registrare ugualmente?", IDVariant.STRING));
      v_MESSAGGIO3 = (new IDVariant("Finanziamenti", IDVariant.STRING));
      // 
      // Salva Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.BeginTrans();
      // 
      // Controllo Codici Transazione Elementare
      // 
      C2 = PAN_LIQUIDAEMETT.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_LIQUIDAEMETT.GotoFirst();
      while (!PAN_LIQUIDAEMETT.RSEOF())
      {
        // 
        // Si passa da null a SI
        // 
        if ((C2.Get("LIQOLDINEMIS").equals((new IDVariant("NO")), true) && C2.Get("LIQEMISS").equals((new IDVariant("SI")), true)))
        {
          IDVariant v_STATOCTE = new IDVariant(0,IDVariant.STRING);
          try
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A_GET_ERRORE_COD_TRANS_LIQ(" + IDL.CSql(C2.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C2.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as AGEERCTLALNL ");
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
          catch (Exception e5)
          {
            MainFrm.set_AlertMessage(new IDVariant(e5.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_CANCEL);
            return 0;
          }
          if (!(IDL.IsNull(v_STATOCTE)))
          {
            MainFrm.set_AlertMessage((new IDVariant("Sono presenti liquidazioni con codici di transazione elementare non corretti"))); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_CANCEL);
            return 0;
          }
          if (!(IDL.IsNull(C2.Get("LIQQTNSCADEN"))) && C2.Get("LIQQTNSCADEN").compareTo(IDL.Today(), true)<0)
          {
            MainFrm.set_AlertMessage((new IDVariant("Sono presenti liquidazioni che hanno la quietanza scaduta"))); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_CANCEL);
            return 0;
          }
        }
        PAN_LIQUIDAEMETT.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      C11 = PAN_LIQUIDAEMETT.MasterRS();
      if (C11.size()>0) CurPos = C11.getRow(); else CurPos = 0;
      if (!C11.Bof()) PAN_LIQUIDAEMETT.GotoFirst();
      while (!PAN_LIQUIDAEMETT.RSEOF())
      {
        try
        {
          // 
          // Si passa da null a SI
          // 
          if ((C11.Get("LIQOLDINEMIS").equals((new IDVariant("NO")), true) && C11.Get("LIQEMISS").equals((new IDVariant("SI")), true)) && !(IDL.IsNull(C11.Get("FINANZIAMENTO"))))
          {
            SQL = new StringBuffer();
            SQL.append("update LIQ set ");
            SQL.append("  ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (ANNO_LIQ = " + IDL.CSql(C11.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C11.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            SALVA_FINAINSEVALU(C11.Get("FINANZIAMENTO"), C11.Get("IMPORTO"));
          }
          // 
          // Si passa da null a SI
          // 
          if ((C11.Get("LIQOLDINEMIS").equals((new IDVariant("NO")), true) && C11.Get("LIQEMISS").equals((new IDVariant("SI")), true)) && IDL.IsNull(C11.Get("FINANZIAMENTO")))
          {
            SQL = new StringBuffer();
            SQL.append("update LIQ set ");
            SQL.append("  ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (ANNO_LIQ = " + IDL.CSql(C11.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C11.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          if (C11.Get("LIQOLDINEMIS").equals((new IDVariant("SI")), true) && C11.Get("LIQEMISS").equals((new IDVariant("NO")), true))
          {
            SQL = new StringBuffer();
            SQL.append("update LIQ set ");
            SQL.append("  ANNO_MAND = to_number(NULL) ");
            SQL.append("where (ANNO_LIQ = " + IDL.CSql(C11.Get("ANNO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NUMERO_LIQ = " + IDL.CSql(C11.Get("NUMERO_LIQ"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
        }
        catch (Exception e16)
        {
          MainFrm.set_AlertMessage(new IDVariant(e16.getMessage())); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_CANCEL);
          SALVA_FINADELEROW4();
          return 0;
        }
        PAN_LIQUIDAEMETT.GotoNext();
      }
      if (CurPos>0) C11.absolute(CurPos);
      SALVA_FINANZIAME16();
      while (!IMDB.Eof(IMDBDef14.QRY_FINANZIAME16, 0))
      {
        IDVariant v_ERRORE = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CONTROLLODISPCASSAFIN(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef14.QRY_FINANZIAME16, IMDBDef14.QSL_FINANZIAME16_FINFINANZIAM, 0), (new IDVariant(0)), IMDB.Value(IMDBDef14.QRY_FINANZIAME16, IMDBDef14.QSL_FINANZIAME16_SOMMAIMPORTO, 0), v_ERRORE);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_CANCEL);
          SALVA_FINADELEROW1();
          return 0;
        }
        if (v_ERRORE.equals((new IDVariant(1)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Finanziamento ", IDVariant.STRING));
          v_SEERRORE = (new IDVariant(-1));
          v_MESSAGGIO = IDL.Add(IDL.Add(v_MESSAGGIO, ((v_MESSAGGIO.equals(v_SMS))?(new IDVariant("")):(new IDVariant(",")))), IDL.ToString(IMDB.Value(IMDBDef14.QRY_FINANZIAME16, IMDBDef14.QSL_FINANZIAME16_FINFINANZIAM, 0)));
          v_NUMERRORI = IDL.Add(v_NUMERRORI, (new IDVariant(1)));
        }
        IMDB.TblMoveNext(IMDBDef14.QRY_FINANZIAME16, 0);
      }
      if (v_SEERRORE.booleanValue())
      {
        v_MESSAGGIO = IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO, v_MESSAGGIO1), (new IDVariant("<BR/>"))), v_MESSAGGIO2);
        if (v_NUMERRORI.compareTo((new IDVariant(1)), true)>0)
        {
          v_MESSAGGIO = IDL.Replace(v_MESSAGGIO, (new IDVariant("Finanziamento")), v_MESSAGGIO3);
        }
        if (ConfermaSalvataggio(v_MESSAGGIO))
        {
          MainFrm.Cf4armDBObject.CommitTrans();
          PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_CANCEL);
          SALVA_FINADELEROW2();
          return 0;
        }
        else
        {
          MainFrm.Cf4armDBObject.RollbackTrans();
          PAN_LIQUIDAEMETT.SetModified(MainFrm);
          SALVA_FINADELEROW3();
          return 0;
        }
      }
      SALVA_FINADELEROWS();
      MainFrm.Cf4armDBObject.CommitTrans();
      PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_CANCEL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "Salva", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamenti: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void SALVA_FINAINSEVALU(IDVariant C11_FINANZIAMENTO, IDVariant C11_IMPORTO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef5.TBL_FINANZIAMEN5, 0);
    IMDB.set_Value(IMDBDef5.TBL_FINANZIAMEN5, IMDBDef5.FLD_FINANZIAMEN5_FINFINANZIAM, 0, C11_FINANZIAMENTO);
    IMDB.set_Value(IMDBDef5.TBL_FINANZIAMEN5, IMDBDef5.FLD_FINANZIAMEN5_FINIMPORTO, 0, C11_IMPORTO);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SALVA_FINADELEROW4() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAMEN5);
  }

  // **********************************************************************
  // Finanziamenti
  // Which data are you selecting?
  // **********************************************************************
  private void SALVA_FINANZIAME16() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.QRY_FINANZIAME16);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef5.TBL_FINANZIAMEN5, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_FINANZIAMEN5, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.TblLinkRow(IMDBDef1.TMP_RECORDSET, 0, IMDBDef5.TBL_FINANZIAMEN5, 0);
      IMDB.TblLinkField(IMDBDef1.TMP_RECORDSET, 0, 0, IMDBDef5.TBL_FINANZIAMEN5, IMDBDef5.FLD_FINANZIAMEN5_FINFINANZIAM, 0);
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 1, 0, IMDB.Value(IMDBDef5.TBL_FINANZIAMEN5, IMDBDef5.FLD_FINANZIAMEN5_FINIMPORTO, 0));
      IMDB.TblMoveNext(IMDBDef5.TBL_FINANZIAMEN5, 0);
      if (IMDB.Eof(IMDBDef5.TBL_FINANZIAMEN5, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_FINANZIAMEN5, 0);
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
              IMDB.TblAddNew(IMDBDef14.QRY_FINANZIAME16, 0);
              IMDB.set_Value(IMDBDef14.QRY_FINANZIAME16, 0, 0, AggrBuff[0]);
              IMDB.set_Value(IMDBDef14.QRY_FINANZIAME16, 1, 0, AggrBuff[1]);
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
    IMDB.TblMoveFirst(IMDBDef14.QRY_FINANZIAME16, 0);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SALVA_FINADELEROW1() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAMEN5);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SALVA_FINADELEROW2() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAMEN5);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SALVA_FINADELEROW3() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAMEN5);
  }

  // **********************************************************************
  // Finanziamenti: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void SALVA_FINADELEROWS() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FINANZIAMEN5);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_PROG, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_NUMERO_PROG, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_PROG, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_NUMERO_PROG, 0));
        MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "InfoDoc", _e);
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "ConfermaSalvataggio", _e);
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
      PAN_LIQUIDAEMETT.EnableSorting();
      PAN_LIQUIDAEMETT.ResetSortList();
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI300, IMDBDef14.PQSL_PARAMETRI300_ROWNAMEORDIN, 0).equals((new IDVariant("1")), true))
      {
        PAN_LIQUIDAEMETT.AddToSortList(PFL_LIQUIDAEMETT_ANNOIMP, (new IDVariant(-1)).booleanValue()); 
        PAN_LIQUIDAEMETT.AddToSortList(PFL_LIQUIDAEMETT_NUMEROIMP, (new IDVariant(-1)).booleanValue()); 
      }
      else
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI300, IMDBDef14.PQSL_PARAMETRI300_ROWNAMEORDIN, 0).equals((new IDVariant("2")), true))
        {
          PAN_LIQUIDAEMETT.AddToSortList(PFL_LIQUIDAEMETT_BENEFICIARIO, (new IDVariant(-1)).booleanValue()); 
        }
        else
        {
          PAN_LIQUIDAEMETT.AddToSortList(PFL_LIQUIDAEMETT_ANNOLIQ, (new IDVariant(-1)).booleanValue()); 
          PAN_LIQUIDAEMETT.AddToSortList(PFL_LIQUIDAEMETT_NUMEROLIQ, (new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "Ordinamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Liquidazioni Da Emettere On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUIDAEMETT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Emettere On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "LiquidazioniDaEmettereOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Emettere After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQUIDAEMETT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Emettere After Find Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI300, IMDBDef14.PQSL_PARAMETRI300_ROWNAMEORDIN, 0))))
      {
        SettaImportoTotale();
      }
      Ordinamento();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "LiquidazioniDaEmettereAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Emettere On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUIDAEMETT_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_LIQUIDAEMETT, Cancel);
      // 
      // Liquidazioni Da Emettere On Validate Row Event Body
      // Procedure Body
      // 
      SettaImportoTotale();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "LiquidazioniDaEmettereOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Emettere On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAEMETT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDAEMETT);
      // 
      // Liquidazioni Da Emettere On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_LIQUIDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAEMETT_BENEFICIARIO,IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_LIBERASOESES, 0).stringValue()); 
      PAN_LIQUIDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAEMETT_DIVERSBENEFI,IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_LIQDIVERBENE, 0).stringValue()); 
      PAN_LIQUIDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAEMETT_QUIETANZA,IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_DESCRIZIONE, 0).stringValue()); 
      PAN_LIQUIDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAEMETT_BOLLO,IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_LIQBOLLO, 0).stringValue()); 
      PAN_LIQUIDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAEMETT_UFFICIO1,IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_LIQUFFICIO, 0).stringValue()); 
      PAN_LIQUIDAEMETT.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDAEMETT_TIPOVINCOLO,IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_LIQTIPOVINCO, 0).stringValue()); 
      if (new IDVariant(PAN_LIQUIDAEMETT.Status()).equals((new IDVariant(3)), true))
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "LiquidazioniDaEmettereOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Da Emettere Emiss Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_LIQUIDAEMETT_EMISS_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Da Emettere Emiss Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_LIQEMISS, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_MAND, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_LIQ15, IMDBDef14.PQSL_LIQ15_ANNO_MAND, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "LiquidazioniDaEmettereEmissValidateEvent", _e);
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
      v_CAPTION = (new IDVariant("Liquidazioni da Emettere in Mandato", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_LIQUIDAEMETT.SetFieldValidation(PFL_LIQUIDAEMETT_EMISS, (new IDVariant(-1)).booleanValue()); 
      if (!(MainFrm.FINANZIAMENT.booleanValue()))
      {
        PAN_LIQUIDAEMETT.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAEMETT.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_LIQUIDAEMETT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_LIQUIDAEMETT.set_FixedCols((new IDVariant(4)).intValue());
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_LIQUIDAEMETT.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAEMETT.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIDAEMETT.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQUIDAEMETT.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("LiquidazioniDaEmettereInMandato", "OrdinamentoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void LIQDAEMEINMA_PARAMETRI300() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI300_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI290, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI290, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI300_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI300_RS, 0, IMDBDef5.TBL_PARAMETRI290, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 0, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIDA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 1, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 2, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIDA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 3, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 4, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMSCADAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 5, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMESCAAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 6, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMTIPSCA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 7, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_RONASOLINODF, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 8, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_RONASOGIINEM, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 9, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMEORDIN, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 10, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 11, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMANNDIS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI300_RS, 12, 0, IMDBDef5.TBL_PARAMETRI290, IMDBDef5.FLD_PARAMETRI290_ROWNAMNUMDIS, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI290, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI290, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI290, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI300_RS, 0);
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
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_ORDINAMENTO)
      {
        PFL_PARAMETRI_ORDINAMENTO_ValidateCell(Cancel);
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
  private void PAN_LIQUIDAEMETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAEMETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_LIQUIDAEMETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAEMETT_INFOLIQUIDAZ)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAEMETT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoLiquidazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAEMETT_INFODOC)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAEMETT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAEMETT_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAEMETT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAEMETT_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAEMETT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubimpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIDAEMETT_INFOFINANZIA)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAEMETT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIDAEMETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_LIQUIDAEMETT_EMISS)
      {
        PFL_LIQUIDAEMETT_EMISS_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAEMETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAEMETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDAEMETT_Init()
  {

    PAN_LIQUIDAEMETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAEMETT.SetSize(MyGlb.OBJ_GROUP, 7);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, "DC51B025-FF5A-47AA-A3E0-0071ECB9819C");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, "Documento");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, MyGlb.PANEL_LIST, 360, -9999, 192, 16, 0, 0);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, MyGlb.PANEL_FORM, 0, 75, 528, 1345, 0, 0);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, 0, 65);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, 1, 13);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, 0, 4);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, 1, 4);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, "F4FAE6A3-4655-462D-A6B1-E45CB0BD1BCD");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, "Impegno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, MyGlb.PANEL_LIST, 1036, -9999, 260, 16, 0, 0);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, MyGlb.PANEL_FORM, 0, 291, 560, 1225, 0, 0);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, 0, 51);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, 1, 13);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, 0, 4);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, 1, 4);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, "4B05D4FB-10C5-47F3-B5D0-C3AEA2D66838");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, "Sub-Impegno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, MyGlb.PANEL_LIST, 1296, -9999, 264, 16, 0, 0);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, MyGlb.PANEL_FORM, 0, 411, 584, 1153, 0, 0);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, 0, 77);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, 1, 13);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, 0, 4);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, 1, 4);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, "6432C713-17F6-4B89-B49C-D104A897E03A");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, "Delibera");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, MyGlb.PANEL_LIST, 2136, -9999, 132, 16, 0, 0);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, MyGlb.PANEL_FORM, 0, 627, 124, 97, 0, 0);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, 0, 47);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, 1, 13);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, 0, 4);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, 1, 4);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, "CFE1F2B4-1E24-4B9D-9A0F-F51D37BAAADE");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, "Proposta");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, MyGlb.PANEL_LIST, 2268, -9999, 192, 16, 0, 0);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, MyGlb.PANEL_FORM, 0, 699, 164, 97, 0, 0);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, 0, 51);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, 1, 13);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, 0, 4);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, 1, 4);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, "24D15C71-4609-49F7-9DB7-03C3DF319361");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, "Distinta Liq.");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, MyGlb.PANEL_LIST, 2668, -9999, 108, 16, 0, 0);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, MyGlb.PANEL_FORM, 0, 771, 156, 73, 0, 0);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, 0, 66);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, 1, 13);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, 0, 4);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, 1, 4);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_DISTINTALIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, "675281FE-C57E-4F8A-A49A-8237C2788F10");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, "Contabile Tesoreria");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, MyGlb.PANEL_LIST, 3088, -9999, 172, 16, 0, 0);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, MyGlb.PANEL_FORM, 0, 1659, 220, 73, 0, 0);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, 0, 110);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, 1, 13);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, 0, 4);
    PAN_LIQUIDAEMETT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, 1, 4);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAEMETT_CONTABTESORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAEMETT.SetSize(MyGlb.OBJ_FIELD, 58);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, "C316CE0D-58E7-4FF9-83E4-2E6053F85437");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, "Emiss.");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, "If (not (Is Null (LIQ ANNO MAND)), SI, NO)");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, "39190FAD-8C18-4A97-8235-470767C4BD91");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, "0D73D427-F1CC-4CFE-BF84-E7413A60A0DE");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, "DCE9E317-D622-41D2-ABC5-3AD3C50DD9EE");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, "Info Liquidazione");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.VIS_HYPLINIMLOU1);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, "26880FC3-2817-497D-B127-E5C9FA6172B5");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, "Data");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, "9E6F304B-8E31-43BD-9C0D-4A7E86FCF354");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, "Beneficiario");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, "B4579013-4CAE-4CC9-976F-BDDDEF9BCFF9");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, "227C035D-D25B-4C2C-90C7-B3F6B9475A0F");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, "Data");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, "63F90A90-75B9-42E2-8D85-2B5DDD122494");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, " ");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.VIS_HYPLINIMLOU1);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, "2B18ED42-4E19-4B85-87D9-3124D2ED80CA");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, "Scadenza");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, "Scadenza");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, "E15B7BF7-E166-4BC6-9736-FED4234E9812");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, "Quietanza");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, "Quietanza");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, "78B8C469-D09C-4DC2-A676-99AF4E8DA77D");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, "Importo");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, "Importo");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, "A3E69E07-AC43-4C21-A48C-DF58B1E6CDAD");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, "Ritenute");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, "Ritenute");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, "927B9653-2A35-4597-855B-3F500633F2AD");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, "Capitolo");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, "8B115DA2-0455-484E-9BAD-B244DFBFFDC9");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, "Art.");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, "87FAB9D4-7F34-4756-BB3B-0593C3E44BC7");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, "79F2CD24-5185-467A-A916-C7E340F7D5FF");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, "Anno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, "A0ED9511-0D39-49D1-A18B-FFCD7D19C11D");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, "Sede");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, "71E0CBA2-D34F-4B83-A7CE-673C2B5D15F5");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, "4BDC9953-C8CB-4C87-8BCB-F38C36C14263");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, "Anno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, "4E5E7DE3-D8D7-42BA-A730-1685690D765D");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, " ");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.VIS_HYPLINIMLOU1);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, "C3031EBC-4927-4EE1-BBC8-65DD904A303B");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, "DBDE581F-8415-4938-BF0C-B878E8397A80");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, "Anno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, "4640F706-E840-4161-97A8-25CF7D1878C0");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, "Sede");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, "20D903A5-AF4F-4637-9B0F-82B5BED93337");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, "27A0B78C-4BDE-48D4-814B-2C8CBD9DBB79");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, "Anno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, "8C06D485-B665-4C72-9656-4AFE40845354");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, " ");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.VIS_HYPLINIMLOU1);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, "28AA626B-4A97-4CC1-B412-2DC108298B6A");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, "Bollo");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, "Bollo");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, "14701814-B072-435B-8491-CF63AC44B05A");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, "Voce Ec.");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, "02A339DD-5220-43C1-99C6-27E81043DE7D");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, "Cgu");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, "Cgu");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, "702CEF82-5355-4FF1-840F-3FD165410CA1");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, "Tipo Vincolo");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, "Tipo Vincolo");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, "906FBAFD-73D0-4E90-BC7C-90CD0E8E3245");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, "Ufficio");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, "Ufficio");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, "7FB02024-0AC0-4E70-BFBB-A8F943A32040");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, "Sede");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, "52056A5D-6C4A-49D2-AF2C-08DD56ADB0CA");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, "48889221-EEC4-4BBF-AF9A-B6B8A74E4661");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, "Anno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, "80C5E5A8-EAA1-4E32-8808-7D015C8C935B");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, "Unità");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, "B91C2B01-2336-4C6D-9823-B77913961B33");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, "A8FA1A52-BF63-4FF5-807D-697E94CBA895");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, "Anno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, "19E620A9-0CE4-45D0-8B98-C1756D3AD098");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, "9FC7DAEC-C661-4CFE-9A79-0E6B2480A037");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, "FFBFFAF4-BF41-4C7A-A31E-B3D56246EBBE");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, "Anno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, "053607DD-D1E0-4404-978B-607A980FB8A8");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, "Piano Conti Int.");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, "Piano Conti Int.");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, "B54EFF33-D8A0-4762-9192-7A3A0A8A0170");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, "Cofog");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, "9DD07148-ED87-4DE0-980B-7C6D03CF92E0");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, "Cod. Eu.");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, "F75881BC-A37D-4DE4-BD3D-3B080CB2F850");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, "Finanziamento");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, "64CED6AB-8417-4E47-B5F7-49A283183C01");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, " ");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.VIS_HYLIIMNOBOVH);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, "4F88CC02-D351-47FA-B246-FA662C0A9C40");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, "Numero");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, "D29C4CE8-4191-4C7B-A3D9-9BAE4D1104F3");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, "Data");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, "311B17C0-DF30-4583-96AA-80434652FD94");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, "Liquidazione");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, "6415F28D-51E9-434A-899C-5353A97947C9");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, "Delibera");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, 0, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, "01098347-8B8F-4B65-BAB2-9C541FF22BDF");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, "Proposta");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, 0, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, "A06C2218-296E-4063-BE75-0AE79840B845");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, "Numero Impegno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, "If Equal (Row Name Ordinamento [Liquidazioni Da Emettere In Mandato - Parametri], Per Impegno, NUMERO IMP, Uno)");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, "D7EBF77C-5C2C-4C1C-B703-4F86D5F73CE5");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, "Anno Impegno");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, "If Equal (Row Name Ordinamento [Liquidazioni Da Emettere In Mandato - Parametri], Per Impegno, ANNO IMP, Uno)");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, "605B12B1-6A34-4897-B0ED-AB9B564D9857");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, "ANNO MAND");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, "659B1851-E91B-48B8-94C4-4409052B20F5");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, "Old In Emissione");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, "If (not (Is Null (LIQ ANNO MAND)), SI, NO)");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, "41F31D81-E552-44BB-95AD-ABE3570BDB54");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, "ANNO PROG");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, "D9F05637-0001-495D-874A-583D7EFF6E0B");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, "NUMERO PROG");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDAEMETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, "9DC1D79D-5F3F-44C3-BC7E-5D643DA1BCB0");
    PAN_LIQUIDAEMETT.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, "SCADENZA");
    PAN_LIQUIDAEMETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, "");
    PAN_LIQUIDAEMETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDAEMETT.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUIDAEMETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_LIST, 36);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_LIST, "Emiss.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_FORM, 4, 916, 468, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_FORM, 36);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_EMISS, MyGlb.PANEL_FORM, "Em.");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_EMISS, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_EMISS, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_EMISS, PPQRY_LIQ15, "CASE WHEN NOT ((A.ANNO_MAND IS NULL)) THEN 'SI' ELSE 'NO' END", "LIQEMISS", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_EMISS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_EMISS, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_LIST, 44, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_LIST, "NUM. LIQ");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMEROLIQ, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMEROLIQ, PPQRY_LIQ15, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_LIST, 88, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNOLIQ, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNOLIQ, PPQRY_LIQ15, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_LIST, 124, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_LIST, 140);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_LIST, "I. Lq.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_FORM, 4, 1324, 572, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_FORM, 140);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOLIQUIDAZ, MyGlb.PANEL_FORM, "Info Liquidazione");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, PPQRY_DUAL, "DECODE(~~NUMERO_LIQ~~, to_number(NULL), NULL, 'I')", "INFOLIQUIDAZ", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOLIQUIDAZ, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_LIST, 148, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_DATA, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_DATA, PPQRY_LIQ15, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_LIST, 220, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 76, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_BENEFICIARIO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_BENEFICIARIO, PPQRY_LIQ15, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 360, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_LIST, "Numero");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 4, 100, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODOC, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMERODOC, -1, GRP_LIQUIDAEMETT_DOCUMENTO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMERODOC, PPQRY_LIQ15, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 464, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_LIST, "Data");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 4, 124, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DDATADOC, MyGlb.PANEL_FORM, "Data");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_DDATADOC, -1, GRP_LIQUIDAEMETT_DOCUMENTO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_DDATADOC, PPQRY_LIQ15, "C.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_LIST, 528, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_LIST, " ");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_FORM, 4, 1372, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFODOC, MyGlb.PANEL_FORM, " ");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_INFODOC, -1, GRP_LIQUIDAEMETT_DOCUMENTO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_INFODOC, PPQRY_DUAL, "DECODE(~~ANNO_PROG~~, to_number(NULL), NULL, 'I')", "INFODOC", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFODOC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_LIST, 552, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_LIST, "Scadenza");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_FORM, 4, 148, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA1, MyGlb.PANEL_FORM, "Scadenza");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_SCADENZA1, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_SCADENZA1, PPQRY_LIQ15, "C.D_SCADENZA", "D_SCADENZA", 6, 10, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_LIST, 616, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_FORM, 4, 172, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_QUIETANZA, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_QUIETANZA, PPQRY_LIQ15, "E.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 720, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 4, 196, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_IMPORTO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_IMPORTO, PPQRY_LIQ15, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_LIST, 800, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_RITENUTE, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_RITENUTE, PPQRY_LIQ15, "A.RITENUTE", "RITENUTE", 3, 14, 2, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 880, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 4, 268, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_CAPITOLO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_CAPITOLO, PPQRY_LIQ15, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 1004, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 4, 292, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ARTICOLO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ARTICOLO, PPQRY_LIQ15, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_LIST, 1036, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_FORM, 4, 316, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMEROIMP, -1, GRP_LIQUIDAEMETT_IMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMEROIMP, PPQRY_LIQ15, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_LIST, 1092, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_FORM, 4, 340, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNOIMP, -1, GRP_LIQUIDAEMETT_IMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNOIMP, PPQRY_LIQ15, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_LIST, 1132, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_LIST, "Sede");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_FORM, 4, 364, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELIMP, MyGlb.PANEL_FORM, "Sede");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_SEDEDELIMP, -1, GRP_LIQUIDAEMETT_IMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_SEDEDELIMP, PPQRY_LIQ15, "F.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_LIST, 1180, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_LIST, "Numero");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_FORM, 4, 388, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMERODEL, -1, GRP_LIQUIDAEMETT_IMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMERODEL, PPQRY_LIQ15, "F.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_LIST, 1232, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_LIST, "Anno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_FORM, 4, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL1, MyGlb.PANEL_FORM, "Anno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNODEL1, -1, GRP_LIQUIDAEMETT_IMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNODEL1, PPQRY_LIQ15, "F.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_LIST, 1272, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_LIST, " ");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 1468, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_FORM, 120);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOIMPEGNO, MyGlb.PANEL_FORM, " ");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_INFOIMPEGNO, -1, GRP_LIQUIDAEMETT_IMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_INFOIMPEGNO, PPQRY_DUAL, "DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I')", "INFOIMPEGNO", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1296, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 436, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMEROSUBIMP, -1, GRP_LIQUIDAEMETT_SUBIMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMEROSUBIMP, PPQRY_LIQ15, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_LIST, 1352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 460, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNOSUBIMP, -1, GRP_LIQUIDAEMETT_SUBIMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNOSUBIMP, PPQRY_LIQ15, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_LIST, 1392, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_LIST, "Sede");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_FORM, 4, 484, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDELSUBIM, MyGlb.PANEL_FORM, "Sede");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_SEDEDELSUBIM, -1, GRP_LIQUIDAEMETT_SUBIMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_SEDEDELSUBIM, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_SEDEDELSUBIM, PPQRY_LIQ15, "G.SEDE_DEL", "LIQSEDDELSUB", 5, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_LIST, 1440, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_LIST, "Numero");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_FORM, 4, 508, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERDELSUBI, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMERDELSUBI, -1, GRP_LIQUIDAEMETT_SUBIMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_NUMERDELSUBI, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMERDELSUBI, PPQRY_LIQ15, "G.NUMERO_DEL", "LIQNUMDELSUB", 1, 19, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_LIST, 1496, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_LIST, "Anno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_FORM, 4, 532, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODELSUBIM, MyGlb.PANEL_FORM, "Anno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNODELSUBIM, -1, GRP_LIQUIDAEMETT_SUBIMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_ANNODELSUBIM, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNODELSUBIM, PPQRY_LIQ15, "G.ANNO_DEL", "LIQANNDELSUB", 1, 19, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1536, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_LIST, 144);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_LIST, " ");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_FORM, 4, 1516, 576, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_FORM, 144);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOSUBIMPEG, MyGlb.PANEL_FORM, " ");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_INFOSUBIMPEG, -1, GRP_LIQUIDAEMETT_SUBIMPEGNO);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_INFOSUBIMPEG, PPQRY_DUAL, "DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I')", "INFOSUBIMPEG", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOSUBIMPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_LIST, 1560, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_FORM, 4, 556, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_BOLLO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_BOLLO, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_BOLLO, PPQRY_LIQ15, "H.DESCRIZIONE", "LIQBOLLO", 5, 40, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_LIST, 1720, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_LIST, "Voce Ec.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_FORM, 4, 580, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_VOCEEC, MyGlb.PANEL_FORM, "Voce Ec.");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_VOCEEC, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_VOCEEC, PPQRY_LIQ15, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_LIST, 1776, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_FORM, 4, 604, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_CGU, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_CGU, PPQRY_LIQ15, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1824, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 628, 340, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_TIPOVINCOLO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_TIPOVINCOLO, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_TIPOVINCOLO, PPQRY_LIQ15, "I.DESCRIZIONE", "LIQTIPOVINCO", 5, 50, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_LIST, 1964, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_LIST, "Ufficio");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_FORM, 4, 1108, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_FORM, 76);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UFFICIO1, MyGlb.PANEL_FORM, "Ufficio");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_UFFICIO1, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_UFFICIO1, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_UFFICIO1, PPQRY_LIQ15, "J.DESCRIZIONE", "LIQUFFICIO", 5, 60, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_LIST, 2136, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_FORM, 4, 652, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_SEDEDEL, -1, GRP_LIQUIDAEMETT_DELIBERA);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_SEDEDEL, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_SEDEDEL, PPQRY_LIQ15, "A.SEDE_DEL", "LIQSEDEDEL", 5, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_LIST, 2184, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_LIST, "Num.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_FORM, 4, 676, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODE, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMERODE, -1, GRP_LIQUIDAEMETT_DELIBERA);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_NUMERODE, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMERODE, PPQRY_LIQ15, "A.NUMERO_DEL", "LIQNUMERODE", 1, 19, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_LIST, 2232, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_FORM, 4, 700, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNODEL, -1, GRP_LIQUIDAEMETT_DELIBERA);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_ANNODEL, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNODEL, PPQRY_LIQ15, "A.ANNO_DEL", "LIQANNODEL", 1, 19, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_LIST, 2268, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 724, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_UNITAPROPONE, MyGlb.PANEL_FORM, "Unità");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_UNITAPROPONE, -1, GRP_LIQUIDAEMETT_PROPOSTA);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_UNITAPROPONE, PPQRY_LIQ15, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_LIST, 2376, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 748, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMEROPROPOS, -1, GRP_LIQUIDAEMETT_PROPOSTA);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMEROPROPOS, PPQRY_LIQ15, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 2424, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 772, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNOPROPOSTA, -1, GRP_LIQUIDAEMETT_PROPOSTA);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNOPROPOSTA, PPQRY_LIQ15, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_LIST, 2460, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_LIST, "Diverso Beneficiario");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_FORM, 4, 1132, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DIVERSBENEFI, MyGlb.PANEL_FORM, "Div. Beneficiario");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_DIVERSBENEFI, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_DIVERSBENEFI, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_DIVERSBENEFI, PPQRY_LIQ15, "K.RAGIONE_SOCIALE_ESTESA", "LIQDIVERBENE", 5, 60, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_LIST, 2668, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_LIST, "Numero");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_FORM, 4, 796, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMERODISTI1, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMERODISTI1, -1, GRP_LIQUIDAEMETT_DISTINTALIQ);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMERODISTI1, PPQRY_LIQ15, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 6, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_LIST, 2736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_LIST, "Anno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_FORM, 4, 820, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNODISTINT1, MyGlb.PANEL_FORM, "Anno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNODISTINT1, -1, GRP_LIQUIDAEMETT_DISTINTALIQ);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNODISTINT1, PPQRY_LIQ15, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_LIST, 2776, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_LIST, "Piano Conti Int.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_FORM, 4, 1612, 600, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PIANOCONTINT, MyGlb.PANEL_FORM, "Piano Conti Int.");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_PIANOCONTINT, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_PIANOCONTINT, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_PIANOCONTINT, PPQRY_LIQ15, "NVL(TO_CHAR ( A.COD_LIVELLO_5 ), A_GET_COD_RICL_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') || '000')", "PIANOCONTINT", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_LIST, 2872, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_LIST, "Cofog");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_FORM, 4, 1660, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICECOFOG, MyGlb.PANEL_FORM, "Cofog");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_CODICECOFOG, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_CODICECOFOG, PPQRY_LIQ15, "A.CODICE_COFOG", "LIQCODICCOFO", 1, 3, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_LIST, 2920, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Eu.");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 1636, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Eu.");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_CODICEEUROPE, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_CODICEEUROPE, PPQRY_LIQ15, "A.CODICE_EUROPEO", "LIQCODICEURO", 1, 1, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_LIST, 2972, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 844, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_FINANZIAMENT, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_FINANZIAMENT, PPQRY_LIQ15, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_LIST, 3064, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_LIST, 152);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_LIST, " ");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_FORM, 4, 1564, 584, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_FORM, 152);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_INFOFINANZIA, MyGlb.PANEL_FORM, " ");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_INFOFINANZIA, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_INFOFINANZIA, PPQRY_DUAL, "DECODE(~~FINANZIAMENTO~~, to_number(NULL), NULL, 'I')", "INFOFINANZIA", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_LIQUIDAEMETT.SetValueListItem(PFL_LIQUIDAEMETT_INFOFINANZIA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_LIST, 3088, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_LIST, "Numero");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_FORM, 4, 1684, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_FORM, 120);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROCONTAB, MyGlb.PANEL_FORM, "Numero");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMEROCONTAB, -1, GRP_LIQUIDAEMETT_CONTABTESORE);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMEROCONTAB, PPQRY_LIQ15, "A.NUMERO_CONTABILE", "LIQNUMERCONT", 5, 10, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_LIST, 3172, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_LIST, "Data");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_FORM, 4, 1708, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DATACONTABIL, MyGlb.PANEL_FORM, "Data");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_DATACONTABIL, -1, GRP_LIQUIDAEMETT_CONTABTESORE);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_DATACONTABIL, PPQRY_LIQ15, "A.DATA_CONTABILE", "LIQDATACONTA", 6, 19, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, MyGlb.PANEL_LIST, 44, 0, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, MyGlb.PANEL_FORM, 40, 0, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_LIQUIDALABEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_LIQUIDALABEL, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, MyGlb.PANEL_LIST, 2136, 0, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, MyGlb.PANEL_FORM, 80, 40, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_DELIBERLABEL, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, MyGlb.PANEL_LIST, 2268, 0, 192, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, MyGlb.PANEL_FORM, 88, 48, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_PROPOSTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_PROPOSTLABEL, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_LIST, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_LIST, "Numero Impegno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_FORM, 4, 1204, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_FORM, 92);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROIMPEGN, MyGlb.PANEL_FORM, "Num. Impegno");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMEROIMPEGN, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_NUMEROIMPEGN, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMEROIMPEGN, PPQRY_LIQ15, "DECODE(~~PQRY_PARAMETRI300.ROWNAMEORDIN~~, '1', F.NUMERO_IMP, 1)", "LIQNUMERIMPE", 1, 19, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_LIST, "Anno Impegno");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_FORM, 4, 1204, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOIMPEGNO, MyGlb.PANEL_FORM, "Ann. Imp.");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNOIMPEGNO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_ANNOIMPEGNO, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNOIMPEGNO, PPQRY_LIQ15, "DECODE(~~PQRY_PARAMETRI300.ROWNAMEORDIN~~, '1', F.ANNO_IMP, 1)", "LIQANNOIMPEG", 1, 19, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_LIST, 2936, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_LIST, "ANNO MAND");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_FORM, 4, 1252, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOMAND, MyGlb.PANEL_FORM, "ANNO MAND");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNOMAND, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNOMAND, PPQRY_LIQ15, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_LIST, 0, 36, 424, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_LIST, "Old In Emissione");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_FORM, 4, 1276, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_OLDINEMISSIO, MyGlb.PANEL_FORM, "Old In Emissione");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_OLDINEMISSIO, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldUnbound(PFL_LIQUIDAEMETT_OLDINEMISSIO, true);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_OLDINEMISSIO, PPQRY_LIQ15, "CASE WHEN NOT ((A.ANNO_MAND IS NULL)) THEN 'SI' ELSE 'NO' END", "LIQOLDINEMIS", 5, 99, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_FORM, 4, 1276, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_ANNOPROG, MyGlb.PANEL_FORM, "ANN. PROG");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_ANNOPROG, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_ANNOPROG, PPQRY_LIQ15, "C.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_FORM, 4, 1276, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_NUMEROPROG, MyGlb.PANEL_FORM, "NUM. PROG");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_NUMEROPROG, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_NUMEROPROG, PPQRY_LIQ15, "C.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_LIST, 3260, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_LIST, "SCADENZA");
    PAN_LIQUIDAEMETT.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_FORM, 4, 1732, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAEMETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAEMETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAEMETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAEMETT_SCADENZA, MyGlb.PANEL_FORM, "SCADENZA");
    PAN_LIQUIDAEMETT.SetFieldPage(PFL_LIQUIDAEMETT_SCADENZA, -1, -1);
    PAN_LIQUIDAEMETT.SetFieldPanel(PFL_LIQUIDAEMETT_SCADENZA, PPQRY_LIQ15, "D.SCADENZA", "LIQQTNSCADEN", 6, 10, 0, -13997);
  }

  private void PAN_LIQUIDAEMETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAEMETT.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~NUMERO_LIQ~~, to_number(NULL), NULL, 'I') as INFOLIQUIDAZ, ");
    SQL.append("  DECODE(~~ANNO_PROG~~, to_number(NULL), NULL, 'I') as INFODOC, ");
    SQL.append("  DECODE(~~NUMERO_IMP~~, to_number(NULL), NULL, 'I') as INFOIMPEGNO, ");
    SQL.append("  DECODE(~~NUMERO_SUBIMP~~, to_number(NULL), NULL, 'I') as INFOSUBIMPEG, ");
    SQL.append("  DECODE(~~FINANZIAMENTO~~, to_number(NULL), NULL, 'I') as INFOFINANZIA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_LIQUIDAEMETT.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_LIQUIDAEMETT.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAEMETT.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_LIQUIDAEMETT.SetIMDB(IMDB, "PQRY_LIQ15", true);
    PAN_LIQUIDAEMETT.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
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
    SQL.append("  G.SEDE_DEL as LIQSEDDELSUB, ");
    SQL.append("  G.NUMERO_DEL as LIQNUMDELSUB, ");
    SQL.append("  G.ANNO_DEL as LIQANNDELSUB, ");
    SQL.append("  H.DESCRIZIONE as LIQBOLLO, ");
    SQL.append("  A.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  A.CODICE_GESTIONALE as CODICE_GESTIONALE, ");
    SQL.append("  I.DESCRIZIONE as LIQTIPOVINCO, ");
    SQL.append("  A.SEDE_DEL as LIQSEDEDEL, ");
    SQL.append("  A.NUMERO_DEL as LIQNUMERODE, ");
    SQL.append("  A.ANNO_DEL as LIQANNODEL, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_MAND IS NULL)) THEN 'SI' ELSE 'NO' END as LIQEMISS, ");
    SQL.append("  J.DESCRIZIONE as LIQUFFICIO, ");
    SQL.append("  K.RAGIONE_SOCIALE_ESTESA as LIQDIVERBENE, ");
    SQL.append("  DECODE(~~PQRY_PARAMETRI300.ROWNAMEORDIN~~, '1', F.NUMERO_IMP, 1) as LIQNUMERIMPE, ");
    SQL.append("  DECODE(~~PQRY_PARAMETRI300.ROWNAMEORDIN~~, '1', F.ANNO_IMP, 1) as LIQANNOIMPEG, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_MAND IS NULL)) THEN 'SI' ELSE 'NO' END as LIQOLDINEMIS, ");
    SQL.append("  C.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  C.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  NVL(TO_CHAR ( A.COD_LIVELLO_5 ), A_GET_COD_RICL_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO,4,'SI','MACRO') || '000') as PIANOCONTINT, ");
    SQL.append("  A.CODICE_COFOG as LIQCODICCOFO, ");
    SQL.append("  A.CODICE_EUROPEO as LIQCODICEURO, ");
    SQL.append("  A.NUMERO_CONTABILE as LIQNUMERCONT, ");
    SQL.append("  A.DATA_CONTABILE as LIQDATACONTA, ");
    SQL.append("  D.SCADENZA as LIQQTNSCADEN ");
    PAN_LIQUIDAEMETT.SetQuery(PPQRY_LIQ15, 0, SQL, -1, "");
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
    PAN_LIQUIDAEMETT.SetQuery(PPQRY_LIQ15, 1, SQL, -1, "");
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
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   (((~~PQRY_PARAMETRI300.ROWNAMDALIDA~~ IS NULL) OR A.D_DATA_REG >= ~~PQRY_PARAMETRI300.ROWNAMDALIDA~~)) ");
    SQL.append("and   (((~~PQRY_PARAMETRI300.ROWNAMDALIAL~~ IS NULL) OR A.D_DATA_REG <= ~~PQRY_PARAMETRI300.ROWNAMDALIAL~~)) ");
    SQL.append("and   ((~~PQRY_PARAMETRI300.ROWNAMNULIDA~~ IS NULL) OR A.NUMERO_LIQ >= ~~PQRY_PARAMETRI300.ROWNAMNULIDA~~) ");
    SQL.append("and   ((~~PQRY_PARAMETRI300.ROWNAMNULIAL~~ IS NULL) OR A.NUMERO_LIQ <= ~~PQRY_PARAMETRI300.ROWNAMNULIAL~~) ");
    SQL.append("and   (((C.D_SCADENZA BETWEEN ~~PQRY_PARAMETRI300.ROWNAMSCADAL~~ AND ~~PQRY_PARAMETRI300.ROWNAMESCAAL~~) AND (NOT ((~~PQRY_PARAMETRI300.ROWNAMSCADAL~~ IS NULL)) AND NOT ((~~PQRY_PARAMETRI300.ROWNAMESCAAL~~ IS NULL)))) OR ((~~PQRY_PARAMETRI300.ROWNAMSCADAL~~ IS NULL) OR (~~PQRY_PARAMETRI300.ROWNAMESCAAL~~ IS NULL))) ");
    SQL.append("and   ((NOT ((~~PQRY_PARAMETRI300.ROWNAMTIPSCA~~ IS NULL)) AND B.TIPO_PAGAMENTO = ~~PQRY_PARAMETRI300.ROWNAMTIPSCA~~) OR (~~PQRY_PARAMETRI300.ROWNAMTIPSCA~~ IS NULL)) ");
    SQL.append("and   (NVL(C.ANNO_PROG, 9999) = DECODE(~~PQRY_PARAMETRI300.RONASOLINODF~~, 'SI', 9999, NVL(C.ANNO_PROG, 9999))) ");
    SQL.append("and   ((NVL(A.ANNO_MAND, 0) * DECODE(~~PQRY_PARAMETRI300.RONASOGIINEM~~, 'SI', 1, 0)) = (~~TBL_DATISESSIONE.SESSIOESERCI~~ * DECODE(~~PQRY_PARAMETRI300.RONASOGIINEM~~, 'SI', 1, 0))) ");
    SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(~~PQRY_PARAMETRI300.ROWNAMEUFFIC~~, -1), -1, NVL(A.UFFICIO, -1), ~~PQRY_PARAMETRI300.ROWNAMEUFFIC~~)) ");
    SQL.append("and   (NVL(A.NUMERO_DISTINTA, -1) = NVL(~~PQRY_PARAMETRI300.ROWNAMNUMDIS~~, NVL(A.NUMERO_DISTINTA, -1))) ");
    SQL.append("and   (NVL(A.ANNO_DISTINTA, -1) = NVL(~~PQRY_PARAMETRI300.ROWNAMANNDIS~~, NVL(A.ANNO_DISTINTA, -1))) ");
    PAN_LIQUIDAEMETT.SetQuery(PPQRY_LIQ15, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAEMETT.SetQuery(PPQRY_LIQ15, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAEMETT.SetQuery(PPQRY_LIQ15, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAEMETT.SetQuery(PPQRY_LIQ15, 5, SQL, -1, "");
    PAN_LIQUIDAEMETT.SetQueryDB(PPQRY_LIQ15, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAEMETT.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAEMETT.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAEMETT.iUseListQBE;
      PAN_LIQUIDAEMETT.iUseListQBE = 0;
      PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAEMETT.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAEMETT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "EFDC7373-6EA0-4A29-A1BD-3F90CC7EE2E3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "Data Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 0, -9999, 84, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 8, 3, 240, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0, 100);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATALIQUIDAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, "9D2D8938-87B5-4D3D-88E8-A16041EDD498");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, "Num. Liquidazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, MyGlb.PANEL_LIST, 208, -9999, 144, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, MyGlb.PANEL_FORM, 316, 3, 148, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 0, 101);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMLIQUIDAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, "F3EAE7FE-AFF4-41EF-BFD2-CDBC7CAA0739");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, "Scadenza Pagamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, MyGlb.PANEL_LIST, 352, -9999, 208, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, MyGlb.PANEL_FORM, 512, 3, 240, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 0, 122);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_SCADENPAGAME, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "32427F59-B0E1-4595-9DC5-ACF732684E10");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 680, -9999, 136, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 8, 91, 332, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0, 74);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "D43B64A0-B78B-4C23-A185-DB41524C9A5B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "C745339C-F008-4E05-BBE1-DF22964D29EE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, "2A738A12-204A-4765-98CD-55ACBEF18090");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, "Dal ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "B1878091-1C7F-4080-A0EF-BF9344519065");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "Al ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "AA4AF279-69CA-4E04-A7EF-CE74FA9617CD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal  ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "35BB9F7B-2E3D-4586-B026-C912BF1A0AD3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al  ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, "696767B5-7437-4ADB-8473-BFBD65BB52DF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, "Tipo Scadenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.VIS_NORFIECFHELE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, "0CA09529-6473-40E5-8BDC-3D05FFE8D536");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, "Solo Liquidazioni non di Fattura");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, "D2196A32-CA55-49A5-90BE-07C708D12ACE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, "Solo già in Emissione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "14AF9F4C-C7CA-4B79-927A-3881C67DB2F4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, "8379DF26-15D0-4FB7-A1DB-1DEC15F2DF4A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, "Totale");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, MyGlb.VIS_ETICGRASRIGH);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "806D9AE6-404E-4D90-8FDE-6B2C817266EF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "0A29998B-9536-456C-9254-BB065570BAEA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "686FE27D-5F1A-4F9C-BEFE-BC0B3F7FAE66");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "/");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 12, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI300, "A.ROWNAMDALIDA", "ROWNAMDALIDA", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 136, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, GRP_PARAMETRI_DATALIQUIDAZ);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_PARAMETRI300, "A.ROWNAMDALIAL", "ROWNAMDALIAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_LIST, "Dal ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, 320, 28, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL2, MyGlb.PANEL_FORM, "Dal ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL2, -1, GRP_PARAMETRI_NUMLIQUIDAZI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL2, PPQRY_PARAMETRI300, "A.ROWNAMNULIDA", "ROWNAMNULIDA", 1, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 280, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_LIST, "Al ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 396, 28, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL2, MyGlb.PANEL_FORM, "Al ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL2, -1, GRP_PARAMETRI_NUMLIQUIDAZI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL2, PPQRY_PARAMETRI300, "A.ROWNAMNULIAL", "ROWNAMNULIAL", 1, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 352, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal  ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 516, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal  ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_SCADENPAGAME);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI300, "A.ROWNAMSCADAL", "ROWNAMSCADAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 456, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al  ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 640, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al  ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_SCADENPAGAME);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI300, "A.ROWNAMESCAAL", "ROWNAMESCAAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, 560, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, "Tp. Scad.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, 8, 64, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, "Tipo Scadenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOSCADENZA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOSCADENZA, PPQRY_PARAMETRI300, "A.ROWNAMTIPSCA", "ROWNAMTIPSCA", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_LIST, "S. L. n. d. F.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, 380, 64, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, 184);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLLIQNODIFA, MyGlb.PANEL_FORM, "Solo Liquidazioni non di Fattura");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLLIQNODIFA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLLIQNODIFA, PPQRY_PARAMETRI300, "A.RONASOLINODF", "RONASOLINODF", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLLIQNODIFA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLLIQNODIFA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_LIST, 640, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_LIST, "S. g. i. Ems.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_FORM, 596, 64, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_FORM, 132);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOGIAINEMI, MyGlb.PANEL_FORM, "Solo già in Emissione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOGIAINEMI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOGIAINEMI, PPQRY_PARAMETRI300, "A.RONASOGIINEM", "RONASOGIINEM", 5, 8, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOGIAINEMI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOGIAINEMI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 680, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 12, 116, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ORDINAMENTO, -1, GRP_PARAMETRI_ORDINAMENTO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ORDINAMENTO, PPQRY_PARAMETRI300, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("1")), "Per Impegno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("2")), "Per Beneficiario", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("3")), "Per Num. Liquidazione", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, MyGlb.PANEL_LIST, 408, 112, 236, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, MyGlb.PANEL_FORM, 580, 116, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTALE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTALE, -1, "", "TOTALE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 368, 92, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI300, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_LIST, "Distinta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 360, 116, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODISTIN, MyGlb.PANEL_FORM, "Distinta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODISTIN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODISTIN, PPQRY_PARAMETRI300, "A.ROWNAMNUMDIS", "ROWNAMNUMDIS", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_LIST, "/");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 472, 116, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 16);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODISTINTA, MyGlb.PANEL_FORM, "/");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODISTINTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODISTINTA, PPQRY_PARAMETRI300, "A.ROWNAMANNDIS", "ROWNAMANNDIS", 1, 4, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T01CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T01DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T01 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPSCA~~) ");
    SQL.append("and   (A.SE_PERSONALE = 'SI') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T01, 0, SQL, PFL_PARAMETRI_TIPOSCADENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T01CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T01DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T01 A ");
    SQL.append("where (A.SE_PERSONALE = 'SI') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T01, 1, SQL, PFL_PARAMETRI_TIPOSCADENZA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T01, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (-1 = ~~ROWNAMEUFFIC~~) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI300", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI300, IMDBDef14.PQRY_PARAMETRI300_RS, IMDBDef5.TBL_PARAMETRI290);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef5.FLD_PARAMETRI290_ROWNAMDALIAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL2, IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL2, IMDBDef5.FLD_PARAMETRI290_ROWNAMNULIAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI290_ROWNAMSCADAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI290_ROWNAMESCAAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOSCADENZA, IMDBDef5.FLD_PARAMETRI290_ROWNAMTIPSCA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLLIQNODIFA, IMDBDef5.FLD_PARAMETRI290_RONASOLINODF);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOGIAINEMI, IMDBDef5.FLD_PARAMETRI290_RONASOGIINEM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ORDINAMENTO, IMDBDef5.FLD_PARAMETRI290_ROWNAMEORDIN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI290_ROWNAMEUFFIC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODISTIN, IMDBDef5.FLD_PARAMETRI290_ROWNAMNUMDIS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODISTINTA, IMDBDef5.FLD_PARAMETRI290_ROWNAMANNDIS);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI290");
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
    if (SrcObj == PAN_LIQUIDAEMETT) PAN_LIQUIDAEMETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAEMETT) PAN_LIQUIDAEMETT_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAEMETT) PAN_LIQUIDAEMETT_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAEMETT) PAN_LIQUIDAEMETT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIDAEMETT) PAN_LIQUIDAEMETT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_LIQUIDAEMETT) PAN_LIQUIDAEMETT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_LIQUIDAEMETT) PAN_LIQUIDAEMETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
