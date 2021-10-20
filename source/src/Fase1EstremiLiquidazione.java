// **********************************************
// Fase 1 Estremi Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Fase1EstremiLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARALIQUMULT_IMPEGNO = 0;
  private static int GRP_PARALIQUMULT_SUBIMPEGNO = 1;
  private static int GRP_PARALIQUMULT_PROVVEDIMENT = 2;

  private static int PFL_PARALIQUMULT_ESTRLIQULABE = 0;
  private static int PFL_PARALIQUMULT_NUMEROIMP = 1;
  private static int PFL_PARALIQUMULT_BARRIMPELABE = 2;
  private static int PFL_PARALIQUMULT_ANNOIMP = 3;
  private static int PFL_PARALIQUMULT_IMPDESCRIZIO = 4;
  private static int PFL_PARALIQUMULT_SCELTAIMPEGN = 5;
  private static int PFL_PARALIQUMULT_INFOIMPEGNO = 6;
  private static int PFL_PARALIQUMULT_IMPEGNOLABEL = 7;
  private static int PFL_PARALIQUMULT_NUMEROSUBIMP = 8;
  private static int PFL_PARALIQUMULT_BARSUBIMPLAB = 9;
  private static int PFL_PARALIQUMULT_ANNOSUBIMP = 10;
  private static int PFL_PARALIQUMULT_SUBIMPDESCRI = 11;
  private static int PFL_PARALIQUMULT_SCELTSUBIMPE = 12;
  private static int PFL_PARALIQUMULT_INFOSUBIMPEG = 13;
  private static int PFL_PARALIQUMULT_SUBIMPEGLABE = 14;
  private static int PFL_PARALIQUMULT_CAPITOLOART = 15;
  private static int PFL_PARALIQUMULT_BARVOCPEGLAB = 16;
  private static int PFL_PARALIQUMULT_CAPITOLO = 17;
  private static int PFL_PARALIQUMULT_ARTICOLO = 18;
  private static int PFL_PARALIQUMULT_INFOVOCEPEG = 19;
  private static int PFL_PARALIQUMULT_DELIBERLABEL = 20;
  private static int PFL_PARALIQUMULT_SEDEDEL = 21;
  private static int PFL_PARALIQUMULT_TRATDELILABE = 22;
  private static int PFL_PARALIQUMULT_NUMERODEL = 23;
  private static int PFL_PARALIQUMULT_BARRDELILABE = 24;
  private static int PFL_PARALIQUMULT_ANNODEL = 25;
  private static int PFL_PARALIQUMULT_SCELTADELIBE = 26;
  private static int PFL_PARALIQUMULT_INFODELIBERA = 27;
  private static int PFL_PARALIQUMULT_PROPOSTLABEL = 28;
  private static int PFL_PARALIQUMULT_UNITAPROPONE = 29;
  private static int PFL_PARALIQUMULT_TRATPROPLABE = 30;
  private static int PFL_PARALIQUMULT_NUMEROPROPOS = 31;
  private static int PFL_PARALIQUMULT_BARRPROPLABE = 32;
  private static int PFL_PARALIQUMULT_ANNOPROPOSTA = 33;
  private static int PFL_PARALIQUMULT_SCELTAPROPOS = 34;
  private static int PFL_PARALIQUMULT_INFOPROPOSTA = 35;
  private static int PFL_PARALIQUMULT_DESCRIZIONE = 36;
  private static int PFL_PARALIQUMULT_INEMISSIONE = 37;
  private static int PFL_PARALIQUMULT_VOCEECONOMIC = 38;
  private static int PFL_PARALIQUMULT_VOCIECONDESC = 39;
  private static int PFL_PARALIQUMULT_CGU = 40;
  private static int PFL_PARALIQUMULT_CODIGESTDESC = 41;
  private static int PFL_PARALIQUMULT_BOLLO = 42;
  private static int PFL_PARALIQUMULT_CIG = 43;
  private static int PFL_PARALIQUMULT_MOTIVESCLCIG = 44;
  private static int PFL_PARALIQUMULT_CUP = 45;
  private static int PFL_PARALIQUMULT_CODLIVELLO5 = 46;
  private static int PFL_PARALIQUMULT_VISSTRRICDES = 47;
  private static int PFL_PARALIQUMULT_CODICECOFOG = 48;
  private static int PFL_PARALIQUMULT_DESCRIZCOFOG = 49;
  private static int PFL_PARALIQUMULT_CODICEEUROPE = 50;
  private static int PFL_PARALIQUMULT_DATAREG = 51;
  private static int PFL_PARALIQUMULT_DESCRDAIMPEG = 52;
  private static int PFL_PARALIQUMULT_DESCRDADELIB = 53;
  private static int PFL_PARALIQUMULT_AVANTILABEL = 54;
  private static int PFL_PARALIQUMULT_TITOLO = 55;
  private static int PFL_PARALIQUMULT_CATEGORIA = 56;
  private static int PFL_PARALIQUMULT_CODINTERVENT = 57;
  private static int PFL_PARALIQUMULT_CODTERZI = 58;
  private static int PFL_PARALIQUMULT_RILECO = 59;
  private static int PFL_PARALIQUMULT_COMPDAL = 60;
  private static int PFL_PARALIQUMULT_COMPAL = 61;
  private static int PFL_PARALIQUMULT_FATTORE = 62;
  private static int PFL_PARALIQUMULT_CENTRO = 63;
  private static int PFL_PARALIQUMULT_TIPOVINCOLO = 64;
  private static int PFL_PARALIQUMULT_FINANZIAMENT = 65;

  private static int PPQRY_PARAMETRI343 = 0;

  private static int PPQRY_RICLASSIFICA = 1;
  private static int PPQRY_RICLASSIGEST = 2;
  private static int PPQRY_ESEIMP = 3;
  private static int PPQRY_ESESUB = 4;
  private static int PPQRY_CODLIVELLOV = 5;
  private static int PPQRY_COFOG = 6;

  private static int PPQRY_T60 = 7;
  private static int PPQRY_ATTRIBUTIOPI = 8;


  IDPanel PAN_PARALIQUMULT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VALCAP1(IMDB);
    Init_TBL_PARAMETFASE1(IMDB);
    Init_TBL_PARAOLDFASE1(IMDB);
    //
    //
    Init_PQRY_PARAMETRI343(IMDB);
    Init_PQRY_PARAMETRI343_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VALCAP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_VALCAP1, 1);
    IMDB.set_TblCode(IMDBDef5.TBL_VALCAP1, "TBL_VALCAP1");
    IMDB.set_FldCode(IMDBDef5.TBL_VALCAP1,IMDBDef5.FLD_VALCAP1_NOMOGGLIV4CA, "NOMOGGLIV4CA");
    IMDB.SetFldParams(IMDBDef5.TBL_VALCAP1,IMDBDef5.FLD_VALCAP1_NOMOGGLIV4CA,1,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_VALCAP1, 0);
  }

  private static void Init_TBL_PARAMETFASE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETFASE1, 7);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETFASE1, "TBL_PARAMETFASE1");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP, "PARAPRODAESP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETFASE1,IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETFASE1, 0);
  }

  private static void Init_TBL_PARAOLDFASE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAOLDFASE1, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAOLDFASE1, "TBL_PARAOLDFASE1");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAOLDFASE1,IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON,1,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAOLDFASE1, 0);
  }

  private static void Init_PQRY_PARAMETRI343(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI343, 35);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI343, "PQRY_PARAMETRI343");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR, "PARAMCATEGOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE, "PARAMCODINTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ, "PARAMCODTERZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMRILECO, "PARAMRILECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMRILECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMFATTORE, "PARAMFATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMFATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMCENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343,IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5,3,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI343, 0);
  }

  private static void Init_PQRY_PARAMETRI343_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI343_RS, 35);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI343_RS, "PQRY_PARAMETRI343_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL,5,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_D_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMINEMISS, "PARAMINEMISS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMINEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR, "PARAMCATEGOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE, "PARAMCODINTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ, "PARAMCODTERZ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMRILECO, "PARAMRILECO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMRILECO,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMFATTORE, "PARAMFATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMFATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMCENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI,1,9,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_MOTIVO_ESCLUSIONE_CIG, "MOTIVO_ESCLUSIONE_CIG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_MOTIVO_ESCLUSIONE_CIG,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CUP, "CUP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CUP,5,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG,1,3,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI343_RS,IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5,3,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Fase1EstremiLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public Fase1EstremiLiquidazione()
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
    FormIdx = MyGlb.FRM_FASE1ESTRLIQ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8AB10A46-4012-41AB-A7B6-B9DE3B1B8F58";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 732;
    DesignHeight = 570;
    set_Caption(new IDVariant("Fase 1 Estremi Liquidazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
    Frames[1].Height = 544;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Liquidazione Multipla";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 544;
    PAN_PARALIQUMULT = new IDPanel(w, this, 1, "PAN_PARALIQUMULT");
    Frames[1].Content = PAN_PARALIQUMULT;
    PAN_PARALIQUMULT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARALIQUMULT.VS = MainFrm.VisualStyleList;
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 544-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2064A712-A985-4BB6-BD00-3E47C136EDB0");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3224, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARALIQUMULT.InitStatus = 2;
    PAN_PARALIQUMULT_Init();
    PAN_PARALIQUMULT_InitFields();
    PAN_PARALIQUMULT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARALIQUMULT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FASE1ESTRLIQ_PARAMETRI343();
      }
      PAN_PARALIQUMULT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_SCELTAIMPEGN) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUO && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_SCELTSUBIMPE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_SCELTADELIBE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_SCELTAPROPOS) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEVOCECCOFI && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_VOCEECONOMIC) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECODGECOFI && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_CGU) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTARICLAS && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_CODLIVELLO5) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACOFOG && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_CODICECOFOG) {
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
    return (obj instanceof Fase1EstremiLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Fase1EstremiLiquidazione.class.getName() : (Glb.ClassWithPackage(Fase1EstremiLiquidazione.class) ? Fase1EstremiLiquidazione.class.getName().substring(Fase1EstremiLiquidazione.class.getPackage().getName().length() + 1) : Fase1EstremiLiquidazione.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Fase 1 - Estremi Liquidazione", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_DESCRDADELIB,(new IDVariant("Descrizione da Delibera")).stringValue()); 
      set_Caption(new IDVariant(v_CAPTION));
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP, 0),(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_PARALIQUMULT.PanelCommand(Glb.PCM_INSERT);
      }
      PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      if (MainFrm.SIOPEATTIARM.booleanValue())
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEVOCECCOFI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, 0, IMDB.Value(IMDBDef7.PQRY_VOCIECONOMI4, IMDBDef7.PQSL_VOCIECONOMI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECODGECOFI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, 0, IMDB.Value(IMDBDef7.PQRY_RICLASSIGEST, IMDBDef7.PQSL_RICLASSIGEST_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTARICLAS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC2, IMDBDef7.PQSL_VISTSTRURIC2_VISSTRRICCOD, 0),IDVariant.DECIMAL));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACOFOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG, 0, IMDB.Value(IMDBDef7.PQRY_VISTSTRURIC3, IMDBDef7.PQSL_VISTSTRURIC3_VISSTRRIPRCO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "EndModalEvent", _e);
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
      PAN_PARALIQUMULT.PanelCommand(Glb.PCM_UPDATE);
      if (!(Confirm.booleanValue()))
      {
        UNLOADEVENT_FATIMDBDELET();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // FAT IMDB: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_FATIMDBDELET() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_FATIMDB);
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARALIQUMULT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Liquidazione Multipla On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARALIQUMULT_NUMEROIMP)), true) || Column.equals((new IDVariant(PFL_PARALIQUMULT_ANNOIMP)), true))
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0), true)!=0 || IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0))))
          {
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)>0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Anno Impegno superiore all'esercizio", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0));
              Cancel.set((new IDVariant(-1)));
              return;
            }
            else
            {
              if (MainFrm.PossibileLiq(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), (new IDVariant()), (new IDVariant())).equals((new IDVariant(-1)), true))
              {
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0));
                Cancel.set((new IDVariant(-1)));
                return;
              }
              else
              {
                SettaValoriDaImpegno(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_D_DATA_REG, 0),IDL.Today()));
                if (MainFrm.FINANZIAMENT.booleanValue())
                {
                  SettaFinanziamento(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), (new IDVariant()), (new IDVariant()));
                }
                IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0));
                IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0, (new IDVariant()));
                SettaCIGCUP();
                // PAN_PARALIQUMULT.PanelCommand(Glb.PCM_UPDATE);
              }
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0));
            IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0, (new IDVariant()));
            SettaCIGCUP();
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARALIQUMULT_NUMEROSUBIMP)), true) || Column.equals((new IDVariant(PFL_PARALIQUMULT_ANNOSUBIMP)), true))
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0), true)!=0 || IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0))))
          {
            if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)>0)
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Anno Sub-Impegno superiore all'esercizio", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0));
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0));
              return;
            }
            else
            {
              if (MainFrm.PossibileLiq(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0)).equals((new IDVariant(-1)), true))
              {
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0));
                IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0));
                Cancel.set((new IDVariant(-1)));
                return;
              }
              else
              {
                SettaValoriDaSubImpegno(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_D_DATA_REG, 0),IDL.Today()));
                if (MainFrm.FINANZIAMENT.booleanValue())
                {
                  SettaFinanziamento(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0));
                }
                IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0));
                IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0));
                SettaCIGCUP();
                // PAN_PARALIQUMULT.PanelCommand(Glb.PCM_UPDATE);
              }
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0));
            IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0));
            SettaCIGCUP();
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARALIQUMULT_SEDEDEL)), true) || Column.equals((new IDVariant(PFL_PARALIQUMULT_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARALIQUMULT_ANNODEL)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0, new IDVariant(v_ANNODEL));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARALIQUMULT_UNITAPROPONE)), true) || Column.equals((new IDVariant(PFL_PARALIQUMULT_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_PARALIQUMULT_ANNOPROPOSTA)), true))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        v_UNITAPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, 0);
        v_NUMEROPROP = IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, 0);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, 0, new IDVariant(v_NUMEROPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, 0, new IDVariant(v_ANNOPROP));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARALIQUMULT_VOCEECONOMIC)), true))
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, 0).compareTo(IMDB.Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON, 0), true)!=0)
        {
          ProponiCguUnico();
          IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, 0));
        }
      }
      if (IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PARALIQUMULT_ANNOIMP)), true) || Column.equals((new IDVariant(PFL_PARALIQUMULT_NUMEROIMP)), true))
      {
        // IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_VALCAP1, IMDBDef5.FLD_VALCAP1_NOMOGGLIV4CA, 0, MainFrm.GetLiv4DaCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ParametriLiquidazioneMultiplaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARALIQUMULT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARALIQUMULT);
      // 
      // Parametri Liquidazione Multipla On Dynamic Properties Event Body
      // Procedure Body
      // 
      VisibilitàInfo();
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_DESCRIZIONE,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_DESCRIZIONE))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_VOCIECONDESC,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_VOCIECONDESC))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_CODIGESTDESC,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_CODIGESTDESC))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_IMPDESCRIZIO,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_IMPDESCRIZIO))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_SUBIMPDESCRI,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_SUBIMPDESCRI))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_MOTIVESCLCIG,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_MOTIVESCLCIG))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ParametriLiquidazioneMultiplaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARALIQUMULT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Liquidazione Multipla After Find Event Body
      // Procedure Body
      // 
      SettaOld();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ParametriLiquidazioneMultiplaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_PARALIQUMULT_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Liquidazione Multipla On Change Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_PARAPRODAESP, 0).equals((new IDVariant("SI")), true))
      {
        ProponiDaEsploratore();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ParametriLiquidazioneMultiplaOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Info Impegno
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("I")));
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Sub Impegno
  // **********************************************************************
  public int InfoSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Sub Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0));
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.UnloadForm(MyGlb.FRM_INFORSUBIMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "InfoSubImpegno", _e);
      return -1;
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "InfoDelibere", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
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
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
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
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Sub Impegno
  // **********************************************************************
  public int SceltaSubImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Sub Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMPROUNI, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SceltaSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Impegno
  // **********************************************************************
  public int ApriSceltaImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Impegno Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ApriSceltaImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Voce Economica
  // **********************************************************************
  public int SceltaVoceEconomica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Voce Economica Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMTITOLO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODINTE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCATEGOR, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI90, IMDBDef1.FLD_PARAMETRI90_PARAMCODTERZ, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ, 0));
      MainFrm.Show(MyGlb.FRM_SCEVOCECCOFI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SceltaVoceEconomica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Cgu
  // **********************************************************************
  public int SceltaCgu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Cgu Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMTITOLO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCATEGOR, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCODINTE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAMCODTERZ, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI80, IMDBDef1.FLD_PARAMETRI80_PARAVOCEECON, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, 0));
      MainFrm.Show(MyGlb.FRM_SCECODGECOFI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SceltaCgu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voci Bilancio
  // **********************************************************************
  public int InfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voci Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "InfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Livello 5
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaLivello5 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Livello 5 Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMOGGCOTIRI, 0, (new IDVariant("MACRO_5")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIVE, 0, (new IDVariant(2)));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS8, IMDBDef1.FLD_PARS8_NOMEOGGELIV4, 0, new IDVariant(IMDB.Value(IMDBDef5.TBL_VALCAP1, IMDBDef5.FLD_VALCAP1_NOMOGGLIV4CA, 0),IDVariant.DECIMAL));
      MainFrm.UnloadForm(MyGlb.FRM_SCELTARICLAS,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_SCELTARICLAS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ApriSceltaLivello5", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Cofog
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ApriSceltaCofog ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Cofog Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(MyGlb.FRM_SCELTACOFOG,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGETTES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARS78, IMDBDef1.FLD_PARS78_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACOFOG, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ApriSceltaCofog", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Old
  // **********************************************************************
  public int SettaOld ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Old Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0));
      IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SettaOld", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori Da Impegno
  // Anno Imp:  - Input
  // Numero Imp:  - Input
  // Data:  - Input
  // **********************************************************************
  public int SettaValoriDaImpegno (IDVariant AnnoImp, IDVariant NumeroImp, IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TIPOVINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RILECO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_COMPDAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_COMPAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_CGU = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TITOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CATEGORIA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODINTERVENT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODTERZI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Da Impegno Body
      // Procedure Body
      // 
      IDVariant v_VCOFOG = null;
      v_VCOFOG = (new IDVariant());
      IDVariant v_VLIVELLO5 = null;
      v_VLIVELLO5 = (new IDVariant());
      IDVariant v_VCODEUROPEO = null;
      v_VCODEUROPEO = (new IDVariant());
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
      SQL.append("  A.ARTICOLO as IMPARTICOLO, ");
      SQL.append("  A.VOCE_ECON as IMPVOCEECON, ");
      SQL.append("  A.TIPO_VINCOLO as IMPTIPOVINCO, ");
      SQL.append("  A.RILEVANTE_ECO as IMPRILEVAECO, ");
      SQL.append("  A.FATTORE as IMPFATTORE, ");
      SQL.append("  A.CENTRO as IMPCENTRO, ");
      SQL.append("  A.COMPETENZA_DAL as IMPCOMPETDAL, ");
      SQL.append("  A.COMPETENZA_AL as IMPCOMPETEAL, ");
      SQL.append("  A.CODICE_GESTIONALE as IMPCODICGEST, ");
      SQL.append("  B.TITOLO as CAPTITOLO, ");
      SQL.append("  B.CATEGORIA as CAPCATEGORIA, ");
      SQL.append("  B.COD_INTERVENTO as CAPCODINTERV, ");
      SQL.append("  B.COD_TERZI as CAPCODTERZI, ");
      SQL.append("  A.COD_LIVELLO_5 as IMPCODLIVEL5, ");
      SQL.append("  A.CODICE_COFOG as IMPCODICCOFO, ");
      SQL.append("  A.CODICE_EUROPEO as IMPCODICEURO ");
      SQL.append("from ");
      SQL.append("  IMP A, ");
      SQL.append("  CAP B ");
      SQL.append("where (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.E_S = 'S') ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPITOLO = QV.Get("IMPCAPITOLO", IDVariant.DECIMAL) ;
        v_ARTICOLO = QV.Get("IMPARTICOLO", IDVariant.INTEGER) ;
        v_VOCEECONOMIC = QV.Get("IMPVOCEECON", IDVariant.INTEGER) ;
        v_TIPOVINCOLO = QV.Get("IMPTIPOVINCO", IDVariant.INTEGER) ;
        v_RILECO = QV.Get("IMPRILEVAECO", IDVariant.STRING) ;
        v_FATTORE = QV.Get("IMPFATTORE", IDVariant.STRING) ;
        v_CENTRO = QV.Get("IMPCENTRO", IDVariant.STRING) ;
        v_COMPDAL = QV.Get("IMPCOMPETDAL", IDVariant.DATETIME) ;
        v_COMPAL = QV.Get("IMPCOMPETEAL", IDVariant.DATETIME) ;
        v_CGU = QV.Get("IMPCODICGEST", IDVariant.INTEGER) ;
        v_TITOLO = QV.Get("CAPTITOLO", IDVariant.INTEGER) ;
        v_CATEGORIA = QV.Get("CAPCATEGORIA", IDVariant.INTEGER) ;
        v_CODINTERVENT = QV.Get("CAPCODINTERV", IDVariant.INTEGER) ;
        v_CODTERZI = QV.Get("CAPCODTERZI", IDVariant.INTEGER) ;
        v_VLIVELLO5 = QV.Get("IMPCODLIVEL5", IDVariant.INTEGER) ;
        v_VCOFOG = QV.Get("IMPCODICCOFO", IDVariant.INTEGER) ;
        v_VCODEUROPEO = QV.Get("IMPCODICEURO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO, 0, new IDVariant(v_TITOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR, 0, new IDVariant(v_CATEGORIA));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE, 0, new IDVariant(v_CODINTERVENT));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ, 0, new IDVariant(v_CODTERZI));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        if (!(IDL.IsNull(v_VCOFOG)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG, 0, new IDVariant(v_VCOFOG));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG, 0, MainFrm.CofogUnicoCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), v_CAPITOLO, v_ARTICOLO));
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_EUROPEO, 0, new IDVariant(v_VCODEUROPEO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VLIVELLO5),IDVariant.DECIMAL));
        if (!(IDL.IsNull(v_CGU)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, 0, new IDVariant(v_CGU));
        }
        else
        {
          ProponiCguUnico();
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMRILECO, 0, new IDVariant(v_RILECO));
        if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPDAL, 0, new IDVariant(v_COMPDAL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPAL, 0, new IDVariant(v_COMPAL));
          if (!(IDL.IsNull(v_FATTORE)))
          {
            if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMFATTORE, 0, new IDVariant(v_FATTORE));
            }
          }
          if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
          {
            if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCENTRO, 0, new IDVariant(v_CENTRO));
            }
          }
        }
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC, 0, (new IDVariant()));
      if (!(IDL.IsNull(v_TIPOVINCOLO)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VINCOLI A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(v_TIPOVINCOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= " + IDL.CSql(Data, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          if (v_NUMREC.equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC, 0, new IDVariant(v_TIPOVINCOLO));
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SettaValoriDaImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Valori Da Sub Impegno
  // Anno Imp:  - Input
  // Numero Imp:  - Input
  // Anno Sub Imp:  - Input
  // Numero Sub Imp:  - Input
  // Data:  - Input
  // **********************************************************************
  public int SettaValoriDaSubImpegno (IDVariant AnnoImp, IDVariant NumeroImp, IDVariant AnnoSubImp, IDVariant NumeroSubImp, IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_ARTICOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_VOCEECONOMIC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGU = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TIPOVINCOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TITOLO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODINTERVENT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODTERZI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CATEGORIA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RILECO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FATTORE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CENTRO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_COMPDAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_COMPAL = new IDVariant(0,IDVariant.DATETIME);
    IDVariant v_ANNOIMPEGNO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMEROIMPEGN = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Setta Valori Da Sub Impegno Body
      // Procedure Body
      // 
      IDVariant v_VCOFOG = null;
      v_VCOFOG = (new IDVariant());
      IDVariant v_VLIVELLO5 = null;
      v_VLIVELLO5 = (new IDVariant());
      IDVariant v_VCODEUROPEO = null;
      v_VCODEUROPEO = (new IDVariant());
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as SUBIMPCAPITO, ");
      SQL.append("  A.ARTICOLO as SUBIMPARTICO, ");
      SQL.append("  A.ANNO_IMP as SUBIMANNOIMP, ");
      SQL.append("  A.NUMERO_IMP as SUBIMNUMEIMP, ");
      SQL.append("  C.VOCE_ECON as IMPVOCEECON, ");
      SQL.append("  C.TIPO_VINCOLO as IMPTIPOVINCO, ");
      SQL.append("  B.TITOLO as CAPTITOLO, ");
      SQL.append("  B.CATEGORIA as CAPCATEGORIA, ");
      SQL.append("  B.COD_INTERVENTO as CAPCODINTERV, ");
      SQL.append("  B.COD_TERZI as CAPCODTERZI, ");
      SQL.append("  NVL(A.RILEVANTE_ECO, C.RILEVANTE_ECO) as NUVASURIEIRE, ");
      SQL.append("  A.FATTORE as SUBIMPFATTOR, ");
      SQL.append("  A.CENTRO as SUBIMPCENTRO, ");
      SQL.append("  A.COMPETENZA_DAL as SUBIMCOMPDAL, ");
      SQL.append("  A.COMPETENZA_AL as SUBIMCOMPEAL, ");
      SQL.append("  NVL(A.CODICE_GESTIONALE, C.CODICE_GESTIONALE) as NUVASUCOGICG, ");
      SQL.append("  A.CODICE_COFOG as SUBICODICOFO, ");
      SQL.append("  A.COD_LIVELLO_5 as SUBICODLIVE5, ");
      SQL.append("  A.CODICE_EUROPEO as SUBICODIEURO ");
      SQL.append("from ");
      SQL.append("  SUBIMP A, ");
      SQL.append("  CAP B, ");
      SQL.append("  IMP C ");
      SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (C.ANNO_IMP = A.ANNO_IMP) ");
      SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
      SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.E_S = 'S') ");
      SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CAPITOLO = QV.Get("SUBIMPCAPITO", IDVariant.DECIMAL) ;
        v_ARTICOLO = QV.Get("SUBIMPARTICO", IDVariant.INTEGER) ;
        v_ANNOIMPEGNO = QV.Get("SUBIMANNOIMP", IDVariant.INTEGER) ;
        v_NUMEROIMPEGN = QV.Get("SUBIMNUMEIMP", IDVariant.INTEGER) ;
        v_VOCEECONOMIC = QV.Get("IMPVOCEECON", IDVariant.INTEGER) ;
        v_TIPOVINCOLO = QV.Get("IMPTIPOVINCO", IDVariant.INTEGER) ;
        v_TITOLO = QV.Get("CAPTITOLO", IDVariant.INTEGER) ;
        v_CATEGORIA = QV.Get("CAPCATEGORIA", IDVariant.INTEGER) ;
        v_CODINTERVENT = QV.Get("CAPCODINTERV", IDVariant.INTEGER) ;
        v_CODTERZI = QV.Get("CAPCODTERZI", IDVariant.INTEGER) ;
        v_RILECO = QV.Get("NUVASURIEIRE", IDVariant.STRING) ;
        v_FATTORE = QV.Get("SUBIMPFATTOR", IDVariant.STRING) ;
        v_CENTRO = QV.Get("SUBIMPCENTRO", IDVariant.STRING) ;
        v_COMPDAL = QV.Get("SUBIMCOMPDAL", IDVariant.DATETIME) ;
        v_COMPAL = QV.Get("SUBIMCOMPEAL", IDVariant.DATETIME) ;
        v_CGU = QV.Get("NUVASUCOGICG", IDVariant.INTEGER) ;
        v_VCOFOG = QV.Get("SUBICODICOFO", IDVariant.INTEGER) ;
        v_VLIVELLO5 = QV.Get("SUBICODLIVE5", IDVariant.INTEGER) ;
        v_VCODEUROPEO = QV.Get("SUBICODIEURO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, 0, new IDVariant(v_CAPITOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, 0, new IDVariant(v_ARTICOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0, new IDVariant(v_ANNOIMPEGNO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0, new IDVariant(v_NUMEROIMPEGN));
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0, new IDVariant(v_ANNOIMPEGNO));
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0, new IDVariant(v_NUMEROIMPEGN));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_VOCE_ECON, 0, new IDVariant(v_VOCEECONOMIC));
        if (!(IDL.IsNull(v_VCOFOG)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG, 0, new IDVariant(v_VCOFOG));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_COFOG, 0, MainFrm.CofogUnicoCap(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), v_CAPITOLO, v_ARTICOLO));
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_EUROPEO, 0, new IDVariant(v_VCODEUROPEO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_COD_LIVELLO_5, 0, new IDVariant(new IDVariant(v_VLIVELLO5),IDVariant.DECIMAL));
        if (!(IDL.IsNull(v_CGU)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, 0, new IDVariant(v_CGU));
        }
        else
        {
          ProponiCguUnico();
        }
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMTITOLO, 0, new IDVariant(v_TITOLO));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCATEGOR, 0, new IDVariant(v_CATEGORIA));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODINTE, 0, new IDVariant(v_CODINTERVENT));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCODTERZ, 0, new IDVariant(v_CODTERZI));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMRILECO, 0, new IDVariant(v_RILECO));
        if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPDAL, 0, new IDVariant(v_COMPDAL));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCOMPAL, 0, new IDVariant(v_COMPAL));
          if (!(IDL.IsNull(v_FATTORE)))
          {
            if (!(MainFrm.ControlloFattoreScaduto(v_FATTORE)))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMFATTORE, 0, new IDVariant(v_FATTORE));
            }
          }
          if (!(IDL.IsNull(v_CENTRO)) && MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
          {
            if (!(MainFrm.ControlloCentroScaduto(v_CENTRO)))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMCENTRO, 0, new IDVariant(v_CENTRO));
            }
          }
        }
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC, 0, (new IDVariant()));
      if (!(IDL.IsNull(v_TIPOVINCOLO)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  VINCOLI A ");
        SQL.append("where (A.CODICE = " + IDL.CSql(v_TIPOVINCOLO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA >= " + IDL.CSql(Data, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          if (v_NUMREC.equals((new IDVariant(1)), true))
          {
            IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARATIPOVINC, 0, new IDVariant(v_TIPOVINCOLO));
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SettaValoriDaSubImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Finanziamento
  // Anno Imp:  - Input
  // Numero Imp:  - Input
  // Anno Sub Imp:  - Input
  // Numero Sub Imp:  - Input
  // **********************************************************************
  public int SettaFinanziamento (IDVariant AnnoImp, IDVariant NumeroImp, IDVariant AnnoSubImp, IDVariant NumeroSubImp)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CODICEFIN = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Setta Finanziamento Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(AnnoSubImp)) && !(IDL.IsNull(NumeroSubImp)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINSUBFINFIN, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  SUBIMP_FIN A ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(AnnoSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(NumeroSubImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CODICEFIN = QV.Get("MINSUBFINFIN", IDVariant.INTEGER) ;
          v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NUMREC.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI, 0, new IDVariant(v_CODICEFIN));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI, 0, (new IDVariant()));
        }
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.FINANZIAMENTO) as MINIMPFINFIN, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  IMP_FIN A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CODICEFIN = QV.Get("MINIMPFINFIN", IDVariant.INTEGER) ;
          v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_NUMREC.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI, 0, new IDVariant(v_CODICEFIN));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_PARAMFINANZI, 0, (new IDVariant()));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SettaFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Cgu Unico
  // **********************************************************************
  public int ProponiCguUnico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CGU = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Proponi Cgu Unico Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(B.CODICE) as MINCODGESCOD ");
      SQL.append("from ");
      SQL.append("  RICLASSIFICAZIONI_GEST A, ");
      SQL.append("  CODICI_GESTIONALI B, ");
      SQL.append("  RICLASSIFICAZIONI C ");
      SQL.append("where (C.VOCE_ECON = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_VOCE_ECON, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.CODICE = A.CODICE_GESTIONALE) ");
      SQL.append("and   (A.PROGR_RICLASSIFICAZIONI = C.PROGRESSIVO) ");
      SQL.append("and   (B.E_S = C.E_S) ");
      SQL.append("and   (A.E_S = C.E_S) ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (C.TITOLO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMTITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (NVL(C.CATEGORIA, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCATEGOR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1)) ");
      SQL.append("and   (NVL(C.COD_INTERVENTO, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCODINTE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1)) ");
      SQL.append("and   (NVL(C.COD_TERZI, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCODTERZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1)) ");
      SQL.append("and   ((B.SCADENZA IS NULL) OR B.SCADENZA >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_CGU = QV.Get("MINCODGESCOD", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUMREC.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, 0, new IDVariant(v_CGU));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ProponiCguUnico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Descrizione da Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DescrizionedaImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Descrizione da Impegno Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0))))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as SUBIMPDESCRI ");
        SQL.append("from ");
        SQL.append("  SUBIMP A ");
        SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("SUBIMPDESCRI", IDVariant.STRING) ;
        }
        QV.Close();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("IMPDESCRIZIO", IDVariant.STRING) ;
        }
        QV.Close();
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE, 0, new IDVariant(v_DESCRIZIONE));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "DescrizionedaImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Descrizione da Delibera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int DescrizionedaDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Descrizione da Delibera Body
      // Procedure Body
      // 
      v_DESCRIZIONE = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as DELDESCRIZIO ");
      SQL.append("from ");
      SQL.append("  DEL A ");
      SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCRIZIONE = QV.Get("DELDESCRIZIO", IDVariant.STRING) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_DESCRIZIONE)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE, 0, new IDVariant(v_DESCRIZIONE));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "DescrizionedaDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Proponi Da Esploratore
  // **********************************************************************
  public int ProponiDaEsploratore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Proponi Da Esploratore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_NUMERO_IMP, 0));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_ANNO_SUBIMP, 0))))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_ANNO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0, IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_SUBIMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_SUBIMP, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_ANNO_IMP, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAOLDFASE1, IMDBDef5.FLD_PARAOLDFASE1_NUMERO_IMP, 0, (new IDVariant()));
      }
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_BOLLO, 0, IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_BOLLO, 0));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_D_DATA_REG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE, 0, IMDB.Value(IMDBDef5.TBL_PARAMETFASE1, IMDBDef5.FLD_PARAMETFASE1_DESCRIZIONE, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "ProponiDaEsploratore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Info
  // **********************************************************************
  public int VisibilitàInfo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Info Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0))))
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0))))
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_DESCRDAIMPEG,(new IDVariant("Descrizione da SubImpegno")).stringValue()); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_DESCRDAIMPEG,(new IDVariant("Descrizione da Impegno")).stringValue()); 
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0))))
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_SEDE_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_DEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_DEL, 0))))
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GESTIODELIBE.booleanValue() && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_UNITA_PROPONENTE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_PROPOSTA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_PROPOSTA, 0))))
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ARTICOLO, 0))))
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "VisibilitàInfo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Avanti
  // **********************************************************************
  public int Avanti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Avanti Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Impegno Obbligatorio", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_DESCRIZIONE, 0)))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Descrizione Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (MainFrm.GestioneSiope() && !(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CODICE_GESTIONALE, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Codice Gestionale obbligatorio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_FAS2ALTDATLI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "Avanti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta CIG CUP
  // **********************************************************************
  public int SettaCIGCUP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta CIG CUP Body
      // Corpo Procedura
      // 
      IDVariant v_CIGIMP = null;
      v_CIGIMP = (new IDVariant());
      IDVariant v_CUPIMP = null;
      v_CUPIMP = (new IDVariant());
      IDVariant v_CIGSUBIMP = null;
      v_CIGSUBIMP = (new IDVariant());
      IDVariant v_CUPSUBIMP = null;
      v_CUPSUBIMP = (new IDVariant());
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CIG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CUP, 0, (new IDVariant()));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0))))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CIG as SUBIMPCIG, ");
        SQL.append("  A.CUP as SUBIMPCUP ");
        SQL.append("from ");
        SQL.append("  SUBIMP A ");
        SQL.append("where (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_SUBIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CIGSUBIMP = QV.Get("SUBIMPCIG", IDVariant.STRING) ;
          v_CUPSUBIMP = QV.Get("SUBIMPCUP", IDVariant.STRING) ;
        }
        QV.Close();
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0))))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.CIG as IMPCIG, ");
          SQL.append("  A.CUP as IMPCUP ");
          SQL.append("from ");
          SQL.append("  IMP A ");
          SQL.append("where (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_NUMERO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_ANNO_IMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CIGIMP = QV.Get("IMPCIG", IDVariant.STRING) ;
            v_CUPIMP = QV.Get("IMPCUP", IDVariant.STRING) ;
          }
          QV.Close();
        }
      }
      if (!(IDL.IsNull(v_CIGSUBIMP)) || !(IDL.IsNull(v_CUPSUBIMP)))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CIG, 0, new IDVariant(v_CIGSUBIMP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CUP, 0, new IDVariant(v_CUPSUBIMP));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CIG, 0, new IDVariant(v_CIGIMP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI343, IMDBDef14.PQSL_PARAMETRI343_CUP, 0, new IDVariant(v_CUPIMP));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase1EstremiLiquidazione", "SettaCIGCUP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void FASE1ESTRLIQ_PARAMETRI343() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI343_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARALIQUMULT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARALIQUMULT, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI343_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI343_RS, 0, IMDBDef5.TBL_PARALIQUMULT, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 0, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CAPITOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 1, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ARTICOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 2, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_IMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 3, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_IMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 4, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_SUBIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 5, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_SUBIMP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 6, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 7, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 8, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_SEDE_DEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 9, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_DESCRIZIONE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 10, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_BOLLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 11, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ANNO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 12, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_UNITA_PROPONENTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 13, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_PROPOSTA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 14, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_VOCE_ECON, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 15, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 16, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CODICE_GESTIONALE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 17, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMINEMISS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 18, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMTITOLO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 19, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCATEGOR, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 20, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCODINTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 21, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCODTERZ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 22, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMRILECO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 23, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 24, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 25, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 26, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCENTRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 27, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARATIPOVINC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 28, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMFINANZI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 29, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CIG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 30, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_MOTIVO_ESCLUSIONE_CIG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 31, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CUP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 32, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CODICE_COFOG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 33, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CODICE_EUROPEO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI343_RS, 34, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_COD_LIVELLO_5, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARALIQUMULT, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARALIQUMULT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARALIQUMULT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI343_RS, 0);
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
  private void PAN_PARALIQUMULT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARALIQUMULT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARALIQUMULT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARALIQUMULT, Cancel);
    // Stub
  }

  private void PAN_PARALIQUMULT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARALIQUMULT_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_SCELTSUBIMPE)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_INFOSUBIMPEG)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSubImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_SCELTADELIBE)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_SCELTAPROPOS)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_VOCEECONOMIC)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaVoceEconomica();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_CGU)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCgu();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_CODLIVELLO5)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaLivello5();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_CODICECOFOG)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCofog();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_DESCRDAIMPEG)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DescrizionedaImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_DESCRDADELIB)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DescrizionedaDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_AVANTILABEL)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Avanti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARALIQUMULT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARALIQUMULT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARALIQUMULT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARALIQUMULT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARALIQUMULT_Init()
  {

    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, "6C7FC7EF-37CC-4AB4-BCA8-134782DE520A");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, "Impegno");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 356, 10, 0, 0);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, MyGlb.PANEL_FORM, 16, 50, 652, 38, 0, 0);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, 0, 51);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, 1, 13);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, 0, 2);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, 1, 2);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, "FDA718FF-2E6F-460B-B713-D1307F041A43");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, "Sub-Impegno");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 356, 10, 0, 0);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, MyGlb.PANEL_FORM, 16, 106, 652, 38, 0, 0);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, 0, 77);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, 1, 13);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, 0, 2);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, 1, 2);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, "1ED6852F-4923-4827-80C9-0317DCE2731A");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, "Provvedimento");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, MyGlb.PANEL_LIST, 320, -9999, 392, 10, 0, 0);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, MyGlb.PANEL_FORM, 16, 190, 652, 38, 0, 0);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, 0, 87);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, 1, 13);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, 0, 2);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, 1, 2);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_FIELD, 66);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, "DAAE0E5F-0624-4494-B02C-A69408EB86BC");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, "Estremi della Liquidazione");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, "603381AB-E2D3-4C1A-9CED-F293879F15BB");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, "NUMERO IMP");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, "ED55E7E2-AF90-4B06-A8D9-B96071C59606");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, "/");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, "9D8C441F-C4FC-4D9A-9A5A-1AE034937893");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, "ANNO IMP");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, "7BEB5548-B14E-40F2-A971-F26034C59D47");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, "IMP DESCRIZIONE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, "CDB01AD4-1D1A-46F7-BE67-6514A3283AF1");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, 0, "wsearch1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, "B37404DD-DB43-4AD7-BA0B-AAC3A8C35B91");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, 0, "info.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, "436EA72A-7B24-42B2-A669-CC6C3812EBE9");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, "C1AA9836-DDB2-4DBA-9E08-9FF17B009191");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, "47742228-816F-44AB-9DC7-0F080EF86998");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, "/");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, "F991AF08-C995-4F58-AF68-0A70FA791620");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, "671A09F1-AA1D-434E-8F4E-7224023576D7");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, "SUBIMP DESCRIZIONE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, "596E4A40-6CBD-45A3-AA59-6BFB20B10B76");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, 0, "wsearch1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, "2E0C480D-D64C-4FE9-957B-BDEB90DFD7F5");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, 0, "info.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, "11B44D3D-9928-41C0-8000-D0B6CC688448");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, "068822F5-E725-44DF-AF0F-341D3A5163A9");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, "Capitolo/Art.");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, "4D2AFF0A-112B-4BBA-ADE1-206DE5465B3F");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, "/");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, "7FD4F578-069F-42CA-A502-54B82728E368");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, "CAPITOLO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, "3A8A7B70-7C07-4F10-AB3F-526D13CD4918");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, "ARTICOLO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, "6168602E-13D6-4710-BB7D-EF5840DAA7EA");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, 0, "info.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, "C427C289-29EC-42E6-B2F3-54BD9E2841A8");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, "Delibera");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, "87B5872A-41E2-4ED0-822C-18187D1B13F6");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, "SEDE DEL");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, "2C54DF9E-D4D6-4640-816B-3A3C2643B38C");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, "-");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, "05B41673-00D3-4D45-BC17-60C793D90C08");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, "NUMERO DEL");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, "635BF3BD-D008-4E11-8647-366CA04CF352");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, "/");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, "B214F65F-13E6-49CB-80D6-74ABB7E61802");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, "ANNO DEL");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, "A871713B-CE27-4693-9961-773A311E3634");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, 0, "wsearch1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, "56363777-09F8-4B9E-B06D-261E3F589F54");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, 0, "info.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, "941A5B75-9383-4428-A67B-78782BE93ABE");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, "Proposta");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, "B5706497-9E33-4F0B-A09B-CC9E62442218");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, "E6CE7878-4890-4134-8D93-18932988181B");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, "-");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, "DC497D44-184C-41EA-BC8E-D41E55A02158");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, "1CADC5BE-467A-40A0-9D42-ABBB11D6EDAE");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, "/");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, "C3A3EB2E-EA42-4D18-AD1D-07C4BB9A36FD");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, "6DD49B26-CC5A-4D48-9045-CB71ABD2FCF4");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, 0, "wsearch1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, "66237A1E-F6B2-4953-A67E-497799A6D289");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, 0, "info.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, "E4D76D08-C7FC-4782-B040-F5B413EAE35C");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, "Descrizione");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, "9A005DE2-959E-4119-A070-59EEEF98B91E");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, "In Emissione");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, "D6C95B80-EAA4-4C7B-8AC9-B8AF4B40B661");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, "Voce Economica");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, "24DBFE83-EE51-427B-B855-1534B1E9729D");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, "8B4BE249-A8A7-4AA1-94DB-DC1A8501BBF6");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, "Cgu");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, "916F6AFD-CD23-452E-AEE3-00636C8CD0CD");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, "AEC3D6F0-BD5B-4489-BC81-0C6B4C26DA4B");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, "Bollo");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, "83E283C3-C12E-42E2-A610-C4A9791EAE03");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, "Cig");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, "C5455A57-15CB-4C6E-BBC7-8444B1A20DDD");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, "Esclusione Cig");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, "82473BD3-68D0-48BE-9480-8A33D082C4C6");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, "Cup");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, "9D24326A-C542-4D30-B3A5-87832724E4CA");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, "Cod. V livello");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, "88CECC42-5BB3-4A97-8E31-E76539A2E328");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, "8C9628A9-EBB8-486C-8BDB-739DB24A245A");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, "Cod. Cofog");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, "AA525F18-2BA5-476E-B64D-0F09823E1925");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, "DESCRIZIONE COFOG");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, "A88BB189-985E-42DC-8680-F2BE3705878A");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, "Cod. Europeo");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, "0476BF0C-6A01-41AC-8D33-30D35D61F4B4");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, "Data Reg.");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, "8EC775C2-5897-42DC-B9DF-502C36B5C797");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, 0, "Paste.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, "A20C3279-462A-44A6-B1AD-6FFC6C6F1E40");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, 0, "Paste2.GIF", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, "F907AA0E-0069-4DB2-B282-133480768C7B");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, "Avanti");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, 0, "button1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, "161DD994-6F76-441F-9DDA-72E4FCACB45E");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, "TITOLO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, "4DDCACF8-A187-4417-BC06-E169AAB3E54C");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, "CATEGORIA");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, "5B1505BB-0ED9-4CF7-99E0-8F41865A7B04");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, "COD INTERVENTO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, "04563611-91C6-4C15-8341-5488F36D0984");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, "COD TERZI");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, "4CEFD5E0-641B-48F5-91F6-4A5926FD114B");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, "RIL ECO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, "6AB30AFB-65A2-4EE6-B1E1-F30FCA3A5498");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, "COMP DAL");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, "4FBA249C-2BC7-422A-ACAD-A4652BEE6090");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, "COMP AL");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, "EA6D8763-25AB-400F-B511-2AF8790D81A1");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, "FATTORE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, "E5D57915-6E31-452E-B83D-C0B48F25FF3F");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, "CENTRO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, "DCC6CAEF-7242-410D-8497-2AEFC0E89C45");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, "TIPO VINCOLO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, "F35B2945-F601-4660-9BB5-4354F924D3E5");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, "FINANZIAMENTO");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.VIS_NORMFIELPADR);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARALIQUMULT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, MyGlb.PANEL_LIST, 24, 8, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, MyGlb.PANEL_FORM, 16, 8, 652, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ESTRLIQULABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ESTRLIQULABE, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ESTRLIQULABE, -1, "", "ESTRLIQULABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_LIST, "NM. I.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_FORM, 112, 64, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_NUMEROIMP, -1, GRP_PARALIQUMULT_IMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_NUMEROIMP, PPQRY_PARAMETRI343, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, MyGlb.PANEL_LIST, 20, 24, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, MyGlb.PANEL_FORM, 160, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRIMPELABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_BARRIMPELABE, -1, GRP_PARALIQUMULT_IMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_BARRIMPELABE, -1, "", "BARRIMPELABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_LIST, "AN. I.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_FORM, 180, 64, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ANNOIMP, -1, GRP_PARALIQUMULT_IMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ANNOIMP, PPQRY_PARAMETRI343, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_LIST, 100);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_LIST, "IMP DESCRIZIONE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_FORM, 220, 64, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_FORM, 100);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPDESCRIZIO, MyGlb.PANEL_FORM, "IMP DESCR.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_IMPDESCRIZIO, -1, GRP_PARALIQUMULT_IMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_IMPDESCRIZIO, PPQRY_ESEIMP, "B.DESCRIZIONE", "ESEIMIMPDESC", 5, 140, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, MyGlb.PANEL_FORM, 628, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SCELTAIMPEGN, -1, GRP_PARALIQUMULT_IMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, MyGlb.PANEL_LIST, 596, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, MyGlb.PANEL_FORM, 648, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INFOIMPEGNO, -1, GRP_PARALIQUMULT_IMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, MyGlb.PANEL_LIST, 12, 16, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, MyGlb.PANEL_FORM, 20, 64, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_IMPEGNOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_IMPEGNOLABEL, -1, GRP_PARALIQUMULT_IMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_IMPEGNOLABEL, -1, "", "IMPEGNOLABEL", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 280, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_LIST, "N. SB.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 112, 120, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_NUMEROSUBIMP, -1, GRP_PARALIQUMULT_SUBIMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_NUMEROSUBIMP, PPQRY_PARAMETRI343, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, MyGlb.PANEL_LIST, 28, 32, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, MyGlb.PANEL_FORM, 160, 120, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARSUBIMPLAB, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_BARSUBIMPLAB, -1, GRP_PARALIQUMULT_SUBIMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_BARSUBIMPLAB, -1, "", "BARSUBIMPLAB", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_LIST, 240, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_LIST, "A. SB.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_FORM, 180, 120, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ANNOSUBIMP, -1, GRP_PARALIQUMULT_SUBIMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ANNOSUBIMP, PPQRY_PARAMETRI343, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_LIST, "SUBIMP DESCRIZIONE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_FORM, 220, 120, 404, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPDESCRI, MyGlb.PANEL_FORM, "SUB. DESCRIZIONE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SUBIMPDESCRI, -1, GRP_PARALIQUMULT_SUBIMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SUBIMPDESCRI, PPQRY_ESESUB, "B.DESCRIZIONE", "ESESSUBIDESC", 5, 140, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, MyGlb.PANEL_LIST, 612, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, MyGlb.PANEL_FORM, 628, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTSUBIMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SCELTSUBIMPE, -1, GRP_PARALIQUMULT_SUBIMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SCELTSUBIMPE, -1, "", "SCELTSUBIMPE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, MyGlb.PANEL_FORM, 648, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOSUBIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INFOSUBIMPEG, -1, GRP_PARALIQUMULT_SUBIMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INFOSUBIMPEG, -1, "", "INFOSUBIMPEG", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, MyGlb.PANEL_LIST, 20, 24, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, MyGlb.PANEL_FORM, 20, 120, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SUBIMPEGLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SUBIMPEGLABE, -1, GRP_PARALIQUMULT_SUBIMPEGNO);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SUBIMPEGLABE, -1, "", "SUBIMPEGLABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, MyGlb.PANEL_LIST, 20, 24, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, MyGlb.PANEL_FORM, 16, 152, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLOART, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CAPITOLOART, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, MyGlb.PANEL_LIST, 28, 32, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, MyGlb.PANEL_FORM, 272, 152, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARVOCPEGLAB, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_BARVOCPEGLAB, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_BARVOCPEGLAB, -1, "", "BARVOCPEGLAB", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_LIST, 64, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_FORM, 112, 152, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CAPITOLO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CAPITOLO, PPQRY_PARAMETRI343, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_FORM, 292, 152, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_FORM, 72);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ARTICOLO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ARTICOLO, PPQRY_PARAMETRI343, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, MyGlb.PANEL_LIST, 604, 24, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, MyGlb.PANEL_FORM, 340, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INFOVOCEPEG, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, MyGlb.PANEL_LIST, 20, 24, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, MyGlb.PANEL_FORM, 20, 204, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DELIBERLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DELIBERLABEL, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DELIBERLABEL, -1, "", "DELIBERLABEL", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_LIST, 400, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_LIST, "SD. D.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_FORM, 112, 204, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_FORM, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SEDEDEL, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SEDEDEL, PPQRY_PARAMETRI343, "A.SEDE_DEL", "SEDE_DEL", 5, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, MyGlb.PANEL_LIST, 44, 48, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, MyGlb.PANEL_FORM, 160, 204, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_TRATDELILABE, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_TRATDELILABE, -1, "", "TRATDELILABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_LIST, 360, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_LIST, "NM. D.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_FORM, 180, 204, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_FORM, 88);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMERODEL, MyGlb.PANEL_FORM, "NUMERO DEL");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_NUMERODEL, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_NUMERODEL, PPQRY_PARAMETRI343, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, MyGlb.PANEL_LIST, 36, 40, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, MyGlb.PANEL_FORM, 228, 204, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRDELILABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_BARRDELILABE, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_BARRDELILABE, -1, "", "BARRDELILABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_LIST, "AN. D.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_FORM, 248, 204, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_FORM, 72);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ANNODEL, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ANNODEL, PPQRY_PARAMETRI343, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, MyGlb.PANEL_LIST, 620, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, MyGlb.PANEL_FORM, 284, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTADELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SCELTADELIBE, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SCELTADELIBE, -1, "", "SCELTADELIBE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, MyGlb.PANEL_LIST, 612, 32, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, MyGlb.PANEL_FORM, 304, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INFODELIBERA, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, MyGlb.PANEL_LIST, 28, 32, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, MyGlb.PANEL_FORM, 328, 204, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_PROPOSTLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_PROPOSTLABEL, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_PROPOSTLABEL, -1, "", "PROPOSTLABEL", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_LIST, 632, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_LIST, "U. PR.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_FORM, 392, 204, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_FORM, 112);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROPONENTE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_UNITAPROPONE, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_UNITAPROPONE, PPQRY_PARAMETRI343, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 8, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, MyGlb.PANEL_LIST, 52, 56, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, MyGlb.PANEL_FORM, 504, 204, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TRATPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_TRATPROPLABE, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_TRATPROPLABE, -1, "", "TRATPROPLABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_LIST, 672, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. PR.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_FORM, 524, 204, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_FORM, 108);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PROPOSTA");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_NUMEROPROPOS, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_NUMEROPROPOS, PPQRY_PARAMETRI343, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, MyGlb.PANEL_LIST, 44, 48, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, MyGlb.PANEL_FORM, 572, 204, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BARRPROPLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_BARRPROPLABE, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_BARRPROPLABE, -1, "", "BARRPROPLABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 592, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. PR.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 592, 204, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PROPOSTA");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ANNOPROPOSTA, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ANNOPROPOSTA, PPQRY_PARAMETRI343, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, MyGlb.PANEL_LIST, 628, 48, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, MyGlb.PANEL_FORM, 628, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCELTAPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SCELTAPROPOS, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SCELTAPROPOS, -1, "", "SCELTAPROPOS", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, MyGlb.PANEL_LIST, 620, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, MyGlb.PANEL_FORM, 648, 208, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INFOPROPOSTA, -1, GRP_PARALIQUMULT_PROVVEDIMENT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_LIST, 440, 36, 112, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_FORM, 32, 232, 608, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DESCRIZIONE, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DESCRIZIONE, PPQRY_PARAMETRI343, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_LIST, 952, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_LIST, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_LIST, "In Emiss.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_FORM, 28, 272, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INEMISSIONE, MyGlb.PANEL_FORM, "In Emissione");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INEMISSIONE, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INEMISSIONE, PPQRY_PARAMETRI343, "A.PARAMINEMISS", "PARAMINEMISS", 5, 2, 0, -13997);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_INEMISSIONE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_INEMISSIONE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_LIST, 712, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_LIST, 68);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_LIST, "Vc. Econ.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_FORM, 8, 296, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_FORM, 100);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCEECONOMIC, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_VOCEECONOMIC, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_VOCEECONOMIC, PPQRY_PARAMETRI343, "A.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_LIST, 176);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_LIST, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_FORM, 164, 296, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_FORM, 176);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VOCIECONDESC, MyGlb.PANEL_FORM, "VC. ECONOMICHE DESCRIZIONE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_VOCIECONDESC, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_VOCIECONDESC, PPQRY_RICLASSIFICA, "B.DESCRIZIONE", "RICVOCECODES", 5, 140, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_LIST, 912, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_LIST, 112);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_FORM, 76, 320, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_FORM, 32);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CGU, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CGU, PPQRY_PARAMETRI343, "A.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_LIST, 180);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_FORM, 164, 320, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_FORM, 180);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODIGESTDESC, MyGlb.PANEL_FORM, "COD. GESTIONALI DESCRIZIONE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CODIGESTDESC, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CODIGESTDESC, PPQRY_RICLASSIGEST, "B.DESCRIZIONE", "RICGESCOGEDE", 5, 200, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_LIST, 552, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_LIST, 40);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_FORM, 68, 344, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_FORM, 40);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_BOLLO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_BOLLO, PPQRY_PARAMETRI343, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_LIST, 28);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_FORM, 80, 368, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_FORM, 28);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CIG, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CIG, PPQRY_PARAMETRI343, "A.CIG", "CIG", 5, 15, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_LIST, 148);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_LIST, "Esclusione Cig");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_FORM, 248, 368, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_FORM, 88);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MOTIVESCLCIG, MyGlb.PANEL_FORM, "Esclusione Cig");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_MOTIVESCLCIG, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_MOTIVESCLCIG, PPQRY_PARAMETRI343, "A.MOTIVO_ESCLUSIONE_CIG", "MOTIVO_ESCLUSIONE_CIG", 5, 50, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_LIST, 32);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_LIST, "Cup");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_FORM, 472, 368, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_FORM, 32);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CUP, MyGlb.PANEL_FORM, "Cup");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CUP, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CUP, PPQRY_PARAMETRI343, "A.CUP", "CUP", 5, 15, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V livello");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_FORM, 12, 392, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_FORM, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V livello");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CODLIVELLO5, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CODLIVELLO5, PPQRY_PARAMETRI343, "A.COD_LIVELLO_5", "COD_LIVELLO_5", 3, 10, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_LIST, 220);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_LIST, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_FORM, 204, 392, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_FORM, 220);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_VISSTRRICDES, MyGlb.PANEL_FORM, "VISTA STRUTTURA RICL DESCRIZIONE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_VISSTRRICDES, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_VISSTRRICDES, PPQRY_CODLIVELLOV, "A.DESCRIZIONE", "VISSTRRICDES", 5, 300, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_LIST, "Cod. Cofog");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_FORM, 12, 416, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_FORM, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICECOFOG, MyGlb.PANEL_FORM, "Cod. Cofog");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CODICECOFOG, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CODICECOFOG, PPQRY_PARAMETRI343, "A.CODICE_COFOG", "CODICE_COFOG", 1, 3, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_LIST, 220);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_LIST, "DESCRIZIONE COFOG");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_FORM, 204, 416, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_FORM, 220);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRIZCOFOG, MyGlb.PANEL_FORM, "DESCRIZIONE COFOG");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DESCRIZCOFOG, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DESCRIZCOFOG, PPQRY_COFOG, "GET_DESCR_COD_COFOG(A.COFOG,~~TBL_DATISESSIONE.SESSIOESERCI~~,B.E_S)", "NOOGVISTRIDE", 5, 99, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod. Europeo");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_FORM, 12, 440, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_FORM, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CODICEEUROPE, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CODICEEUROPE, PPQRY_PARAMETRI343, "A.CODICE_EUROPEO", "CODICE_EUROPEO", 1, 1, 0, -13997);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_CODICEEUROPE, (new IDVariant(3)), "3 - spese finanziate dalla UE", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_CODICEEUROPE, (new IDVariant(4)), "4 - spese finanziate dallo Stato e correlate ai finanziamenti della UE", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_CODICEEUROPE, (new IDVariant(5)), "5 - spese finanziate dalla regione e correlate ai finanziamenti della UE", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_CODICEEUROPE, (new IDVariant(6)), "6 - spese finanziate da latri soggetti e correlate ai finanziamenti della UE", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_CODICEEUROPE, (new IDVariant(7)), "7 - spese finanziate da risorse proprie dell'ente e correlate ai finanziamenti della UE", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_CODICEEUROPE, (new IDVariant(8)), "8 - spese non correlate ai finanziamenti della UE", "", "", -1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_LIST, 752, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_LIST, 68);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_FORM, 488, 440, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_FORM, 64);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATAREG, MyGlb.PANEL_FORM, "Data Reg.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DATAREG, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DATAREG, PPQRY_PARAMETRI343, "A.D_DATA_REG", "D_DATA_REG", 6, 19, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, MyGlb.PANEL_FORM, 644, 232, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDAIMPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DESCRDAIMPEG, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DESCRDAIMPEG, -1, "", "DESCRDAIMPEG", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, MyGlb.PANEL_LIST, 260, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, MyGlb.PANEL_FORM, 644, 252, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESCRDADELIB, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DESCRDADELIB, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DESCRDADELIB, -1, "", "DESCRDADELIB", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_LIST, 596, 312, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_FORM, 564, 468, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_AVANTILABEL, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_AVANTILABEL, -1, "", "AVANTILABEL", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_LIST, "TITOLO");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_FORM, 4, 432, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_FORM, 48);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TITOLO, MyGlb.PANEL_FORM, "TITOLO");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_TITOLO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_TITOLO, PPQRY_PARAMETRI343, "A.PARAMTITOLO", "PARAMTITOLO", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_LIST, 68);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_LIST, "CATEG.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_FORM, 4, 456, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_FORM, 68);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CATEGORIA, MyGlb.PANEL_FORM, "CATEG.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CATEGORIA, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CATEGORIA, PPQRY_PARAMETRI343, "A.PARAMCATEGOR", "PARAMCATEGOR", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_LIST, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_LIST, "COD INTERVENTO");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_FORM, 4, 480, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_FORM, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODINTERVENT, MyGlb.PANEL_FORM, "COD INTERV.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CODINTERVENT, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CODINTERVENT, PPQRY_PARAMETRI343, "A.PARAMCODINTE", "PARAMCODINTE", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_LIST, 64);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_LIST, "COD TERZI");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_FORM, 4, 504, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_FORM, 64);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODTERZI, MyGlb.PANEL_FORM, "COD TER.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CODTERZI, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CODTERZI, PPQRY_PARAMETRI343, "A.PARAMCODTERZ", "PARAMCODTERZ", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_LIST, 48);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_LIST, "RIL ECO");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_FORM, 4, 528, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_FORM, 48);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_RILECO, MyGlb.PANEL_FORM, "RL. ECO");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_RILECO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_RILECO, PPQRY_PARAMETRI343, "A.PARAMRILECO", "PARAMRILECO", 5, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_LIST, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_LIST, "COMP DAL");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_FORM, 4, 552, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_FORM, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPDAL, MyGlb.PANEL_FORM, "CMP. DAL");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_COMPDAL, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_COMPDAL, PPQRY_PARAMETRI343, "A.PARAMCOMPDAL", "PARAMCOMPDAL", 6, 19, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_LIST, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_LIST, "COMP AL");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_FORM, 4, 576, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_FORM, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPAL, MyGlb.PANEL_FORM, "CMP. AL");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_COMPAL, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_COMPAL, PPQRY_PARAMETRI343, "A.PARAMCOMPAL", "PARAMCOMPAL", 6, 19, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, "FATTORE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, 4, 600, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, "FATTORE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_FATTORE, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_FATTORE, PPQRY_PARAMETRI343, "A.PARAMFATTORE", "PARAMFATTORE", 5, 16, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, "CENTRO");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, 4, 624, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, "CENTRO");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CENTRO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CENTRO, PPQRY_PARAMETRI343, "A.PARAMCENTRO", "PARAMCENTRO", 5, 16, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, "TIPO VINCOLO");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 648, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, "TP. VINCOLO");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_TIPOVINCOLO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_TIPOVINCOLO, PPQRY_PARAMETRI343, "A.PARATIPOVINC", "PARATIPOVINC", 1, 6, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_LIST, "FINANZ.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 432, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_FINANZIAMENT, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_FINANZIAMENT, PPQRY_PARAMETRI343, "A.PARAMFINANZI", "PARAMFINANZI", 1, 9, 0, -13997);
  }

  private void PAN_PARALIQUMULT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as RICVOCECODES ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI A, ");
    SQL.append("  VOCI_ECONOMICHE B ");
    SQL.append("where (A.VOCE_ECON = ~~VOCE_ECON~~) ");
    SQL.append("and   (B.CODICE = A.VOCE_ECON) ");
    SQL.append("and   (B.E_S = A.E_S) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NVL(A.TITOLO, -1) = NVL(~~PARAMTITOLO~~, -1)) ");
    SQL.append("and   (NVL(A.CATEGORIA, -1) = NVL(~~PARAMCATEGOR~~, -1)) ");
    SQL.append("and   (NVL(A.COD_INTERVENTO, -1) = NVL(~~PARAMCODINTE~~, -1)) ");
    SQL.append("and   (NVL(A.COD_TERZI, -1) = NVL(~~PARAMCODTERZ~~, -1)) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_RICLASSIFICA, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_RICLASSIFICA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_RICLASSIFICA, "RICLASSIFICAZIONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as RICGESCOGEDE ");
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
    SQL.append("and   (C.TITOLO = ~~PARAMTITOLO~~) ");
    SQL.append("and   (NVL(C.CATEGORIA, -1) = NVL(~~PARAMCATEGOR~~, -1)) ");
    SQL.append("and   (NVL(C.COD_INTERVENTO, -1) = NVL(~~PARAMCODINTE~~, -1)) ");
    SQL.append("and   (NVL(C.COD_TERZI, -1) = NVL(~~PARAMCODTERZ~~, -1)) ");
    SQL.append("and   (C.VOCE_ECON = ~~VOCE_ECON~~) ");
    SQL.append("and   ((B.SCADENZA IS NULL) OR B.SCADENZA >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_RICLASSIGEST, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_RICLASSIGEST, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_RICLASSIGEST, "RICLASSIFICAZIONI_GEST");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as ESEIMIMPDESC ");
    SQL.append("from ");
    SQL.append("  ESEIMP A, ");
    SQL.append("  IMP B ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    SQL.append("and   (B.ANNO_IMP(+) = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP(+) = A.NUMERO_IMP) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_ESEIMP, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_ESEIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_ESEIMP, "ESEIMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as ESESSUBIDESC ");
    SQL.append("from ");
    SQL.append("  ESESUB A, ");
    SQL.append("  SUBIMP B ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.ANNO_SUBIMP = ~~ANNO_SUBIMP~~) ");
    SQL.append("and   (A.NUMERO_SUBIMP = ~~NUMERO_SUBIMP~~) ");
    SQL.append("and   (B.ANNO_SUBIMP(+) = A.ANNO_SUBIMP) ");
    SQL.append("and   (B.NUMERO_SUBIMP(+) = A.NUMERO_SUBIMP) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_ESESUB, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_ESESUB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_ESESUB, "ESESUB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VISSTRRICDES ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO_5') ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.CODICE = ~~COD_LIVELLO_5~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_INIZIO, 0) <= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.ESERCIZIO_SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((NVL(~~TBL_VALCAP1.NOMOGGLIV4CA~~, 0) = 0 OR A.CODICE_PADRE = ~~TBL_VALCAP1.NOMOGGLIV4CA~~)) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_CODLIVELLOV, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_CODLIVELLOV, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_CODLIVELLOV, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_DESCR_COD_COFOG(A.COFOG,~~TBL_DATISESSIONE.SESSIOESERCI~~,B.E_S) as NOOGVISTRIDE ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI_COFOG A, ");
    SQL.append("  CAP B ");
    SQL.append("where (B.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CODICE_STRUTTURA = A.PROGRAMMA) ");
    SQL.append("and   (A.COFOG = ~~CODICE_COFOG~~) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_COFOG, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_COFOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_COFOG, "PROGRAMMI_COFOG");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    SQL.append("and   ((A.TIPO IS NULL) OR A.TIPO = 'F') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_T60, 0, SQL, PFL_PARALIQUMULT_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where ((A.TIPO IS NULL) OR A.TIPO = 'F') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_T60, 1, SQL, PFL_PARALIQUMULT_BOLLO, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.CODICE = ~~MOTIVO_ESCLUSIONE_CIG~~) ");
    SQL.append("and   (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_ATTRIBUTIOPI, 0, SQL, PFL_PARALIQUMULT_MOTIVESCLCIG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ATTRIOPICODI, ");
    SQL.append("  A.DESCRIZIONE as ATTRIOPIDESC ");
    SQL.append("from ");
    SQL.append("  ATTRIBUTI_OPI A ");
    SQL.append("where (A.TIPO = 'MOT_ESC_CIG') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_ATTRIBUTIOPI, 1, SQL, PFL_PARALIQUMULT_MOTIVESCLCIG, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_ATTRIBUTIOPI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetIMDB(IMDB, "PQRY_PARAMETRI343", true);
    PAN_PARALIQUMULT.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARALIQUMULT.SetQueryIMDB(PPQRY_PARAMETRI343, IMDBDef14.PQRY_PARAMETRI343_RS, IMDBDef5.TBL_PARALIQUMULT);
    JustLoaded = true;
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_NUMEROIMP, IMDBDef5.FLD_PARALIQUMULT_NUMERO_IMP);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_ANNOIMP, IMDBDef5.FLD_PARALIQUMULT_ANNO_IMP);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_NUMEROSUBIMP, IMDBDef5.FLD_PARALIQUMULT_NUMERO_SUBIMP);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_ANNOSUBIMP, IMDBDef5.FLD_PARALIQUMULT_ANNO_SUBIMP);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CAPITOLO, IMDBDef5.FLD_PARALIQUMULT_CAPITOLO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_ARTICOLO, IMDBDef5.FLD_PARALIQUMULT_ARTICOLO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_SEDEDEL, IMDBDef5.FLD_PARALIQUMULT_SEDE_DEL);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_NUMERODEL, IMDBDef5.FLD_PARALIQUMULT_NUMERO_DEL);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_ANNODEL, IMDBDef5.FLD_PARALIQUMULT_ANNO_DEL);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_UNITAPROPONE, IMDBDef5.FLD_PARALIQUMULT_UNITA_PROPONENTE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_NUMEROPROPOS, IMDBDef5.FLD_PARALIQUMULT_NUMERO_PROPOSTA);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_ANNOPROPOSTA, IMDBDef5.FLD_PARALIQUMULT_ANNO_PROPOSTA);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_DESCRIZIONE, IMDBDef5.FLD_PARALIQUMULT_DESCRIZIONE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_INEMISSIONE, IMDBDef5.FLD_PARALIQUMULT_PARAMINEMISS);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_VOCEECONOMIC, IMDBDef5.FLD_PARALIQUMULT_VOCE_ECON);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CGU, IMDBDef5.FLD_PARALIQUMULT_CODICE_GESTIONALE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_BOLLO, IMDBDef5.FLD_PARALIQUMULT_BOLLO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CIG, IMDBDef5.FLD_PARALIQUMULT_CIG);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_MOTIVESCLCIG, IMDBDef5.FLD_PARALIQUMULT_MOTIVO_ESCLUSIONE_CIG);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CUP, IMDBDef5.FLD_PARALIQUMULT_CUP);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CODLIVELLO5, IMDBDef5.FLD_PARALIQUMULT_COD_LIVELLO_5);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CODICECOFOG, IMDBDef5.FLD_PARALIQUMULT_CODICE_COFOG);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CODICEEUROPE, IMDBDef5.FLD_PARALIQUMULT_CODICE_EUROPEO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_DATAREG, IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_TITOLO, IMDBDef5.FLD_PARALIQUMULT_PARAMTITOLO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CATEGORIA, IMDBDef5.FLD_PARALIQUMULT_PARAMCATEGOR);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CODINTERVENT, IMDBDef5.FLD_PARALIQUMULT_PARAMCODINTE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CODTERZI, IMDBDef5.FLD_PARALIQUMULT_PARAMCODTERZ);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_RILECO, IMDBDef5.FLD_PARALIQUMULT_PARAMRILECO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_COMPDAL, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPDAL);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_COMPAL, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPAL);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_FATTORE, IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CENTRO, IMDBDef5.FLD_PARALIQUMULT_PARAMCENTRO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_TIPOVINCOLO, IMDBDef5.FLD_PARALIQUMULT_PARATIPOVINC);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_FINANZIAMENT, IMDBDef5.FLD_PARALIQUMULT_PARAMFINANZI);
    PAN_PARALIQUMULT.SetMasterTable(0, "PARALIQUMULT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARALIQUMULT.Status() == 2)
    {
      int oldListQBE = PAN_PARALIQUMULT.iUseListQBE;
      PAN_PARALIQUMULT.iUseListQBE = 0;
      PAN_PARALIQUMULT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARALIQUMULT.PanelCommand(Glb.PCM_FIND);
      PAN_PARALIQUMULT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_OnChangeRow();
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
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
