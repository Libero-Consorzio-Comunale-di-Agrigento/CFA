// **********************************************
// Mandati Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MandatiOrdinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DADATAADATA = 0;

  private static int PFL_PARAMETRI_ENTRATASPESA = 0;
  private static int PFL_PARAMETRI_ADATA = 1;
  private static int PFL_PARAMETRI_DADATA = 2;

  private static int PPQRY_PARAMETRI67 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_MANDATORDINA_ES = 0;
  private static int PFL_MANDATORDINA_NUMEROMAND = 1;
  private static int PFL_MANDATORDINA_ANNOMAND = 2;
  private static int PFL_MANDATORDINA_DDATAMAND = 3;
  private static int PFL_MANDATORDINA_NUMEROLIQ = 4;
  private static int PFL_MANDATORDINA_ANNOLIQ = 5;
  private static int PFL_MANDATORDINA_DDATAREG = 6;
  private static int PFL_MANDATORDINA_NUMERODISTIN = 7;
  private static int PFL_MANDATORDINA_ANNODISTINTA = 8;
  private static int PFL_MANDATORDINA_CAPITOLO = 9;
  private static int PFL_MANDATORDINA_ARTICOLO = 10;
  private static int PFL_MANDATORDINA_NUMEROIMP = 11;
  private static int PFL_MANDATORDINA_ANNOIMP = 12;
  private static int PFL_MANDATORDINA_NUMEROSUBIMP = 13;
  private static int PFL_MANDATORDINA_ANNOSUBIMP = 14;
  private static int PFL_MANDATORDINA_IMPORTO = 15;
  private static int PFL_MANDATORDINA_IMPORTOIVA = 16;
  private static int PFL_MANDATORDINA_IMPORTIVAIST = 17;
  private static int PFL_MANDATORDINA_RITENUTE = 18;
  private static int PFL_MANDATORDINA_BENEFICIARIO = 19;
  private static int PFL_MANDATORDINA_DIVERSOBEN = 20;
  private static int PFL_MANDATORDINA_NUMERODOC = 21;
  private static int PFL_MANDATORDINA_ANNODOC = 22;
  private static int PFL_MANDATORDINA_NUMQUIETANZA = 23;
  private static int PFL_MANDATORDINA_NUMQUIDIVBEN = 24;
  private static int PFL_MANDATORDINA_SEDEDEL = 25;
  private static int PFL_MANDATORDINA_NUMERODEL = 26;
  private static int PFL_MANDATORDINA_ANNODEL = 27;
  private static int PFL_MANDATORDINA_DESCRIZIONE = 28;
  private static int PFL_MANDATORDINA_CIG = 29;
  private static int PFL_MANDATORDINA_CAUSALE = 30;
  private static int PFL_MANDATORDINA_BOLLO = 31;
  private static int PFL_MANDATORDINA_NUMEROINC = 32;
  private static int PFL_MANDATORDINA_CODLIVELLO5 = 33;
  private static int PFL_MANDATORDINA_VISSTRRICDES = 34;
  private static int PFL_MANDATORDINA_CODICEEUROPE = 35;
  private static int PFL_MANDATORDINA_CODICECOFOG = 36;
  private static int PFL_MANDATORDINA_IMPORTNONSOG = 37;
  private static int PFL_MANDATORDINA_IMPNONSOGEUR = 38;
  private static int PFL_MANDATORDINA_IMPORTOPAGAM = 39;
  private static int PFL_MANDATORDINA_FATTORE = 40;
  private static int PFL_MANDATORDINA_CENTRO = 41;
  private static int PFL_MANDATORDINA_PIANOCONTI = 42;
  private static int PFL_MANDATORDINA_PROGRESSTESO = 43;
  private static int PFL_MANDATORDINA_DISTINTECNIC = 44;
  private static int PFL_MANDATORDINA_UFFICIO = 45;
  private static int PFL_MANDATORDINA_NUMEROCONTAB = 46;
  private static int PFL_MANDATORDINA_DATACONTABIL = 47;
  private static int PFL_MANDATORDINA_ANNOMANDCO = 48;
  private static int PFL_MANDATORDINA_NUMEROMANDCO = 49;
  private static int PFL_MANDATORDINA_ANNOMANCOINP = 50;
  private static int PFL_MANDATORDINA_NUMEMANCOINP = 51;
  private static int PFL_MANDATORDINA_ANNOMANCOINA = 52;
  private static int PFL_MANDATORDINA_NUMEMANCOINA = 53;
  private static int PFL_MANDATORDINA_ANNMANCOADRE = 54;
  private static int PFL_MANDATORDINA_NUMMANCOADRE = 55;
  private static int PFL_MANDATORDINA_ANNMANCOADCO = 56;
  private static int PFL_MANDATORDINA_NUMMANCOADCO = 57;
  private static int PFL_MANDATORDINA_ANNOMANDSP = 58;
  private static int PFL_MANDATORDINA_NUMEROMANDSP = 59;

  private static int PPQRY_ESTRMANDORDI = 0;

  private static int PPQRY_BEN = 1;
  private static int PPQRY_VISTBILAUO77 = 2;

  private static int PPQRY_BEN1 = 3;
  private static int PPQRY_BEN2 = 4;
  private static int PPQRY_T3 = 5;
  private static int PPQRY_T02 = 6;
  private static int PPQRY_T58 = 7;
  private static int PPQRY_T60 = 8;
  private static int PPQRY_CODTRANSEURO = 9;
  private static int PPQRY_COFOG = 10;
  private static int PPQRY_T53 = 11;


  IDPanel PAN_MANDATORDINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI213(IMDB);
    //
    //
    Init_PQRY_PARAMETRI67(IMDB);
    Init_PQRY_PARAMETRI67_RS(IMDB);
    Init_PQRY_ESTRMANDORDI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI213(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI213, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI213, "TBL_PARAMETRI213");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI213,IMDBDef6.FLD_PARAMETRI213_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI213,IMDBDef6.FLD_PARAMETRI213_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI213,IMDBDef6.FLD_PARAMETRI213_NOMEOGGDADAT, "NOMEOGGDADAT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI213,IMDBDef6.FLD_PARAMETRI213_NOMEOGGDADAT,6,10,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI213,IMDBDef6.FLD_PARAMETRI213_NOMEOGGEADAT, "NOMEOGGEADAT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI213,IMDBDef6.FLD_PARAMETRI213_NOMEOGGEADAT,6,10,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI213, 0);
  }

  private static void Init_PQRY_PARAMETRI67(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI67, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI67, "PQRY_PARAMETRI67");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI67,IMDBDef15.PQSL_PARAMETRI67_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI67,IMDBDef15.PQSL_PARAMETRI67_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI67,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGDADAT, "NOMEOGGDADAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI67,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGDADAT,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI67,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGEADAT, "NOMEOGGEADAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI67,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGEADAT,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI67, 0);
  }

  private static void Init_PQRY_PARAMETRI67_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI67_RS, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI67_RS, "PQRY_PARAMETRI67_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI67_RS,IMDBDef15.PQSL_PARAMETRI67_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI67_RS,IMDBDef15.PQSL_PARAMETRI67_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI67_RS,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGDADAT, "NOMEOGGDADAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI67_RS,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGDADAT,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI67_RS,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGEADAT, "NOMEOGGEADAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI67_RS,IMDBDef15.PQSL_PARAMETRI67_NOMEOGGEADAT,6,10,0);
  }

  private static void Init_PQRY_ESTRMANDORDI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ESTRMANDORDI, 60);
    IMDB.set_TblCode(IMDBDef15.PQRY_ESTRMANDORDI, "PQRY_ESTRMANDORDI");
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_E_S,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_LIQ,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_SUBIMP,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_DEL,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RITENUTE, "RITENUTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RITENUTE,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_DIVERSO_BEN, "DIVERSO_BEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_DIVERSO_BEN,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_BENEFICIARIO,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CIG, "CIG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CIG,5,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUM_QUIETANZA, "NUM_QUIETANZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUM_QUIETANZA,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAONQDB1, "REESMAONQDB1");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAONQDB1,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_BOLLO, "BOLLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_BOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_INC, "NUMERO_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_NUMERO_INC,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_COD_LIVELLO_5, "COD_LIVELLO_5");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_COD_LIVELLO_5,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CODICE_EUROPEO, "CODICE_EUROPEO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CODICE_EUROPEO,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CODICE_COFOG, "CODICE_COFOG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CODICE_COFOG,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_IVA, "IMPORTO_IVA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_IVA,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_IVA_IST, "IMPORTO_IVA_IST");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_IVA_IST,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_NON_SOG, "IMPORTO_NON_SOG");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_NON_SOG,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_NON_SOG_EURO, "IMPORTO_NON_SOG_EURO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_NON_SOG_EURO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_PAGAM, "IMPORTO_PAGAM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_IMPORTO_PAGAM,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_D_DATA_MAND,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_FATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_CENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORPICO, "REESMAORPICO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORPICO,5,4000,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORPRTE, "REESMAORPRTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORPRTE,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORDITE, "REESMAORDITE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORDITE,5,87,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECESTMAORUF, "RECESTMAORUF");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECESTMAORUF,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORAMC1, "REESMAORAMC1");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORAMC1,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNMC1, "REESMAORNMC1");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNMC1,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORAMCI, "REESMAORAMCI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORAMCI,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNMCI, "REESMAORNMCI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNMCI,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAOAMCAR, "REESMAOAMCAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAOAMCAR,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAONMCAR, "REESMAONMCAR");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAONMCAR,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAOAMCAC, "REESMAOAMCAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAOAMCAC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAONMCAC, "REESMAONMCAC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAONMCAC,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORANMS, "REESMAORANMS");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORANMS,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNUMS, "REESMAORNUMS");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNUMS,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORANDI, "REESMAORANDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORANDI,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNUDI, "REESMAORNUDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNUDI,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORANMC, "REESMAORANMC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORANMC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNUMC, "REESMAORNUMC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_REESMAORNUMC,3,38,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECNUMQUDIBE, "RECNUMQUDIBE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECNUMQUDIBE,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECONUMECONT, "RECONUMECONT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECONUMECONT,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECODATACONT, "RECODATACONT");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRMANDORDI,IMDBDef15.PQSL_ESTRMANDORDI_RECODATACONT,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ESTRMANDORDI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MandatiOrdinativi(MyWebEntryPoint w, IMDBObj imdb)
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
  public MandatiOrdinativi()
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
    FormIdx = MyGlb.FRM_MANDATORDINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "546BB879-5AA9-41C2-880F-2D397AF85C4B";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 6212;
    DesignHeight = 506;
    set_Caption(new IDVariant("Mandati Ordinativi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 6212;
    Frames[1].Height = 480;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.141667;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 6212;
    Frames[2].Height = 68;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 68;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 6212-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EC195F48-90BF-45C9-B68B-98FA4D0AD25D");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 76, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 6212;
    Frames[3].Height = 412;
    Frames[3].Caption = "Mandati/Ordinativi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 412;
    PAN_MANDATORDINA = new IDPanel(w, this, 3, "PAN_MANDATORDINA");
    Frames[3].Content = PAN_MANDATORDINA;
    PAN_MANDATORDINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_MANDATORDINA.VS = MainFrm.VisualStyleList;
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 6212-MyGlb.PAN_OFFS_X, 412-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F278C78E-6D6F-4A93-B588-37413BE94A4A");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5698, 316, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_MANDATORDINA.InitStatus = 1;
    PAN_MANDATORDINA_Init();
    PAN_MANDATORDINA_InitFields();
    PAN_MANDATORDINA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI213, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MANDATORDINA_PARAMETRI67();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_MANDATORDINA.UpdatePanel(MainFrm);
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
    return (obj instanceof MandatiOrdinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MandatiOrdinativi.class.getName() : (Glb.ClassWithPackage(MandatiOrdinativi.class) ? MandatiOrdinativi.class.getName().substring(MandatiOrdinativi.class.getPackage().getName().length() + 1) : MandatiOrdinativi.class.getName()));
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
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI67, IMDBDef15.PQSL_PARAMETRI67_NOMOGGENTSPE, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMETRI.set_Header(Glb.OBJ_GROUP,GRP_PARAMETRI_DADATAADATA,(new IDVariant("Data Mandati")).stringValue()); 
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROLIQ, (new IDVariant("Numero Liq.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOLIQ, (new IDVariant("Anno Liq.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROIMP, (new IDVariant("Numero Imp.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOIMP, (new IDVariant("Anno Imp.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_BENEFICIARIO, (new IDVariant("Beneficiario")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOMAND, (new IDVariant("Anno Mand.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROMAND, (new IDVariant("Numero Mand.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_DDATAMAND, (new IDVariant("Data Mand.")).stringValue());
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.set_Header(Glb.OBJ_GROUP,GRP_PARAMETRI_DADATAADATA,(new IDVariant("Data Ordinativi")).stringValue()); 
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROLIQ, (new IDVariant("Numero Pre.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOLIQ, (new IDVariant("Anno Pre.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROIMP, (new IDVariant("Numero Acc.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOIMP, (new IDVariant("Anno Acc.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_BENEFICIARIO, (new IDVariant("Debitore")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOMAND, (new IDVariant("Anno Ord.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROMAND, (new IDVariant("Numero Ord.")).stringValue());
        PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_DDATAMAND, (new IDVariant("Data Ord.")).stringValue());
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiOrdinativi", "ParametriOnUpdatingRow", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI213, IMDBDef6.FLD_PARAMETRI213_NOMEOGGDADAT, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI213, IMDBDef6.FLD_PARAMETRI213_NOMEOGGEADAT, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI213, IMDBDef6.FLD_PARAMETRI213_NOMOGGENTSPE, 0, (new IDVariant("S")));
      set_Caption((new IDVariant("Mandati/Ordinativi")));
      PAN_PARAMETRI.set_Header(Glb.OBJ_GROUP,GRP_PARAMETRI_DADATAADATA,(new IDVariant("Data Mandati")).stringValue()); 
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROLIQ, (new IDVariant("Numero Liq.")).stringValue());
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOLIQ, (new IDVariant("Anno Liq.")).stringValue());
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROIMP, (new IDVariant("Numero Imp.")).stringValue());
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOIMP, (new IDVariant("Anno Imp.")).stringValue());
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_BENEFICIARIO, (new IDVariant("Beneficiario")).stringValue());
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_ANNOMAND, (new IDVariant("Anno Mand.")).stringValue());
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_NUMEROMAND, (new IDVariant("Numero Mand.")).stringValue());
      PAN_MANDATORDINA.set_Header(Glb.OBJ_FIELD,PFL_MANDATORDINA_DDATAMAND, (new IDVariant("Data Mand.")).stringValue());
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_MANDATORDINA.SetFlags (Glb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MandatiOrdinativi", "Load", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void MANDATORDINA_PARAMETRI67() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI67_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI213, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI213, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI67_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI67_RS, 0, IMDBDef6.TBL_PARAMETRI213, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI67_RS, 0, 0, IMDBDef6.TBL_PARAMETRI213, IMDBDef6.FLD_PARAMETRI213_NOMOGGENTSPE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI67_RS, 1, 0, IMDBDef6.TBL_PARAMETRI213, IMDBDef6.FLD_PARAMETRI213_NOMEOGGDADAT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI67_RS, 2, 0, IMDBDef6.TBL_PARAMETRI213, IMDBDef6.FLD_PARAMETRI213_NOMEOGGEADAT, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI213, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI213, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI213, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI67_RS, 0);
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
  private void PAN_MANDATORDINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_MANDATORDINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_MANDATORDINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_MANDATORDINA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_MANDATORDINA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_MANDATORDINA);
    // Stub
  }

  private void PAN_MANDATORDINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_MANDATORDINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_MANDATORDINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_MANDATORDINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, "A5491D20-0496-4015-9FB9-DD289516D422");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, MyGlb.PANEL_FORM, 264, 11, 292, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, 0, 86);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DADATAADATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, "CF3BB380-45F3-46C3-AE9D-2F9CDC5A5E16");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, "Parte");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, "Descrivi il contenuto del campo");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, "776BE62F-7D4A-42B2-A196-593FA42F68DD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, "87B2976D-ED24-419B-B72E-204F5480F1E9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, 32, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ENTRATASPESA, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ENTRATASPESA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ENTRATASPESA, PPQRY_PARAMETRI67, "A.NOMOGGENTSPE", "NOMOGGENTSPE", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_LIST, "A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_FORM, 420, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ADATA, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ADATA, -1, GRP_PARAMETRI_DADATAADATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ADATA, PPQRY_PARAMETRI67, "A.NOMEOGGEADAT", "NOMEOGGEADAT", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_FORM, 268, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DADATA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DADATA, -1, GRP_PARAMETRI_DADATAADATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DADATA, PPQRY_PARAMETRI67, "A.NOMEOGGDADAT", "NOMEOGGDADAT", 6, 10, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI67", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI67, IMDBDef15.PQRY_PARAMETRI67_RS, IMDBDef6.TBL_PARAMETRI213);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ENTRATASPESA, IMDBDef6.FLD_PARAMETRI213_NOMOGGENTSPE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ADATA, IMDBDef6.FLD_PARAMETRI213_NOMEOGGEADAT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DADATA, IMDBDef6.FLD_PARAMETRI213_NOMEOGGDADAT);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI213");
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

  private void PAN_MANDATORDINA_Init()
  {

    PAN_MANDATORDINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_MANDATORDINA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_MANDATORDINA.SetSize(MyGlb.OBJ_FIELD, 60);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, "67AC4D9C-66D2-4885-93C1-31BADC7D14B9");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, "E S");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, "55A2908A-6747-45FB-8DC1-E93B522996A4");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, "Numero Mand.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, "62CB9A3F-6D1B-4E31-82F7-5CA13DD9B01C");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, "Anno Mand.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, "BA26ACBE-8007-4F28-B94D-A65481A4D739");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, "Datta Mand.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, "C28B8795-93C9-417B-A231-15D5C67F4B57");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, "Numero Liq.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, "FC25C224-A90C-4EB2-B176-9BFE53709951");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, "Anno Liq.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, "89498183-323E-40E5-A87E-24FA4DC13448");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, "Data Liq.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, "2B6C5D1B-B03F-4764-BCCB-226F7C8D1DDC");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, "Numero Distinta");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, "9F60052F-0B10-496A-8B27-6E3D477163D9");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, "Anno Distinta");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, "5BC7DA21-B86C-41A5-B9DB-04F1F2997840");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, "Capitolo");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, "D09C4093-999C-44DD-9BBC-B4F15598AEB3");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, "Articolo");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, "ED87D277-5AFF-42A2-9454-A2394626510C");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, "Numero Imp");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, "A23C876C-B5C1-4871-9D88-8A58A598CA73");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, "Anno Imp.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, "D8631D95-2687-4674-87D8-B86938A71004");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, "Numero SubImp.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, "7CA4ADC6-E540-4D53-996F-B44E2AFC77BE");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, "Anno SubImp.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, "31C76A66-A5F3-4802-AA88-A385D2364B11");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, "Importo");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, "E2A3D017-08B3-48E8-B7C7-938D20195D88");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, "Importo Iva");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, "79582EFC-8E75-4E8F-9572-15CE89F75A45");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, "di cui Iva Ist.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, "4E76422C-4588-493A-81F5-6A75E2DE4B63");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, "Ritenute");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, "C06C82B8-DC38-4423-B20F-172215B70743");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, "Beneficiario");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, "CA0E6E7D-DBE8-4CCC-96B7-D724453FF3C0");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, "Diverso Ben.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, "96A3BEB8-B0E9-4C93-B76B-178105D27069");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, "Numero Doc.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, "7BDB5850-86B7-4429-88DA-907CAF2A9438");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, "Data Doc.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, "B135710F-1B84-49E8-99F2-6ADBA98770DB");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, "Quietanza Beneficiario");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, "EF67B006-B3EF-4058-BF72-E30A7CBD7C60");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, "Quietanza Beneficiario Div.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, "F5FA035A-88AC-4334-9DCD-C0EC72A1821D");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, "Sede Del.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, "946A5C87-DF07-40BE-A6E8-8FCE34E68833");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, "Numero Del.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, "732EAFC0-882E-42C0-9E59-E4152C62E1CE");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, "Anno Del.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, "EB317718-1801-4197-9937-D2A7E1FBCE99");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, "Descrizione");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, "165CBDB4-E50B-4C4E-990F-45822999033B");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, "Cig");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, "2E454638-46FA-4F54-B7F5-F27DE8F26999");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, "Causale");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, "0A2BE334-75FE-46D8-9B5A-9D84052225CD");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, "Bollo");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, "477BCEC7-3713-4136-A39A-A7CCCC8CB1DD");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, "Numero Inc.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, "51FCC04D-8EB4-46CD-8904-7935C7C40FDE");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, "Cod. V Livello");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, "5D032EB5-CB67-4434-BDD3-F1D28986AE10");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, "Descrizione V Livello");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, "2533B6CF-59CE-4FDC-A543-B892B09D5480");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, "Codice Europeo");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, "1C2D12C2-813F-4AB0-969C-010B71C438FA");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, "Codice Cofog");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, "86014847-6F52-44E8-B509-9F8DAD5472B2");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, "Importo non sog.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, "AA044F34-5AEC-4885-9682-67CD755D8F6B");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, "Importo non sog.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, "5592A6DE-E4F7-45FE-9BD2-C99B5864F7D1");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, "Importo Pagam.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.VIS_NORFIECF4IMP);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, "BD5C0E77-3524-4AEF-85A7-2454E0BFA511");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, "Fattore");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, "ED8AB6D0-F16F-42D9-93D0-832C3A17B7B8");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, "Centro");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, "49318F79-64A5-46C9-B3FD-FD0C2047D289");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, "Piano dei conti");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, "07D24489-786C-40F8-A09D-B4969C5B9CCC");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, "Progr. Tesoriere");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, "131D78A2-559E-4F66-B627-0E6B1E12AD63");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, "Distinta");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, "7C827F95-792B-423A-9157-79FEB369B5B7");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, "Ufficio");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, "38A40B06-11E7-49EA-87FC-1080A3B60579");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, "Numero Contabile");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, "09BA1C0F-CE21-4775-8F09-EB2068DE57F1");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, "Data Contabile");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, "F53E9E6B-7169-4209-9AA1-DA59CEF6683F");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, "Anno Mand. Rit. Fisc.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, "44D07A0D-FF6B-4611-B315-7B304A57B6A6");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, "Numero Mand. Rit. Fisc.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, "873AFA89-1392-4360-B0F6-CCE0885EB778");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, "Anno Mand. Rit. Prev.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, "32689074-112E-4448-B1CF-47624EB7D830");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, "Numero Mand. Rit. Prev.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, "07AB0050-5C5B-4743-BB8D-CB99BAB6CED7");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, "Anno Mand. Rit. Inail.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, "598FF28E-1E29-4FD9-8C0C-A74896580B45");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, "Numero Mand. Rit. Inail.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, "D2F88863-9F38-4CE3-BAF5-967DACF81DA1");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, "Anno Mand. Rit. Add. Reg.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, "3B83129C-0914-4777-AD16-4821EC08BBC8");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, "Numero Mand. Rit. Add. Reg.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, "55BC9AAA-0A21-4933-ABDC-78075E914261");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, "Anno Mand. Rit. Add. Com.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, "6D46CD5E-E8BB-4156-BD71-B56D0E39D59A");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, "Numero Mand. Rit. Add. Com.");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, "231AA507-3DA2-49F6-8D08-7E2B66CEC278");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, "Anno Mand. SP/RC");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_MANDATORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, "2178DF27-0B91-4B06-8B48-8283B4DED7B4");
    PAN_MANDATORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, "Numero Mand. SP/RC");
    PAN_MANDATORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, "");
    PAN_MANDATORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.VIS_NORMALFIELDS);
    PAN_MANDATORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_MANDATORDINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_LIST, 24);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_LIST, "E S");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_FORM, 4, 4, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_FORM, 24);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ES, MyGlb.PANEL_FORM, "E S");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ES, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ES, PPQRY_ESTRMANDORDI, "A.E_S", "E_S", 12, 1, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_LIST, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_LIST, "Numero Mand.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_FORM, 4, 640, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_FORM, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMAND, MyGlb.PANEL_FORM, "Numero Mand.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROMAND, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROMAND, PPQRY_ESTRMANDORDI, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_LIST, 80, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_LIST, 76);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_LIST, "Anno Mand.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_FORM, 4, 616, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_FORM, 76);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMAND, MyGlb.PANEL_FORM, "Anno Mand.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOMAND, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOMAND, PPQRY_ESTRMANDORDI, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_LIST, 128, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_LIST, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_LIST, "Datta Mand.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_FORM, 4, 880, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_FORM, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAMAND, MyGlb.PANEL_FORM, "Datta Mand.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_DDATAMAND, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_DDATAMAND, PPQRY_ESTRMANDORDI, "A.D_DATA_MAND", "D_DATA_MAND", 6, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_LIST, 192, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_LIST, "Numero Liq.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 100, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_FORM, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero Liq.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROLIQ, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROLIQ, PPQRY_ESTRMANDORDI, "A.NUMERO_LIQ", "NUMERO_LIQ", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_LIST, 264, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_LIST, "Anno Liq.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_FORM, 4, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOLIQ, MyGlb.PANEL_FORM, "Anno Liq.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOLIQ, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOLIQ, PPQRY_ESTRMANDORDI, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_LIST, 312, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_LIST, 76);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_LIST, "Data Liq.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_FORM, 4, 316, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_FORM, 76);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DDATAREG, MyGlb.PANEL_FORM, "Data Liq.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_DDATAREG, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_DDATAREG, PPQRY_ESTRMANDORDI, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_LIST, 376, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_LIST, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero Distinta");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_FORM, 4, 1384, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_FORM, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero Distinta");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMERODISTIN, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMERODISTIN, PPQRY_ESTRMANDORDI, "A.NUMERO_DISTINTA", "REESMAORNUDI", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_LIST, 456, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_LIST, 96);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_LIST, "Anno Distinta");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_FORM, 4, 1360, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_FORM, 96);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno Distinta");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNODISTINTA, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNODISTINTA, PPQRY_ESTRMANDORDI, "A.ANNO_DISTINTA", "REESMAORANDI", 6, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_LIST, 520, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_CAPITOLO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_CAPITOLO, PPQRY_ESTRMANDORDI, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_LIST, 604, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ARTICOLO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ARTICOLO, PPQRY_ESTRMANDORDI, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_LIST, 656, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_LIST, "Numero Imp");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_FORM, 4, 148, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROIMP, MyGlb.PANEL_FORM, "Numero Imp");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROIMP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROIMP, PPQRY_ESTRMANDORDI, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_LIST, 728, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_FORM, 4, 124, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOIMP, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOIMP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOIMP, PPQRY_ESTRMANDORDI, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 776, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Numero SubImp.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 196, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero SubImp.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROSUBIMP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROSUBIMP, PPQRY_ESTRMANDORDI, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_LIST, 848, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno SubImp.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 172, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_FORM, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno SubImp.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOSUBIMP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOSUBIMP, PPQRY_ESTRMANDORDI, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_LIST, 912, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_FORM, 4, 340, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_IMPORTO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_IMPORTO, PPQRY_ESTRMANDORDI, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_LIST, 992, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_LIST, 84);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_LIST, "Importo Iva");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_FORM, 4, 760, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_FORM, 84);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOIVA, MyGlb.PANEL_FORM, "Importo Iva");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_IMPORTOIVA, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_IMPORTOIVA, PPQRY_ESTRMANDORDI, "A.IMPORTO_IVA", "IMPORTO_IVA", 3, 14, 2, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_LIST, 1072, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_LIST, 108);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_LIST, "di cui Iva Ist.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_FORM, 4, 784, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_FORM, 108);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTIVAIST, MyGlb.PANEL_FORM, "di cui Iva Ist.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_IMPORTIVAIST, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_IMPORTIVAIST, PPQRY_ESTRMANDORDI, "A.IMPORTO_IVA_IST", "IMPORTO_IVA_IST", 3, 14, 2, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_LIST, 1152, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_LIST, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_LIST, "Ritenute");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_FORM, 4, 364, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_FORM, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_RITENUTE, MyGlb.PANEL_FORM, "Ritenute");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_RITENUTE, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_RITENUTE, PPQRY_ESTRMANDORDI, "A.RITENUTE", "RITENUTE", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_LIST, 1232, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_LIST, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 448, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_FORM, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_BENEFICIARIO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_BENEFICIARIO, PPQRY_ESTRMANDORDI, "A.BENEFICIARIO", "BENEFICIARIO", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_LIST, 1432, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_LIST, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_LIST, "Diverso Ben.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_FORM, 4, 424, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_FORM, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DIVERSOBEN, MyGlb.PANEL_FORM, "Diverso Ben.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_DIVERSOBEN, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_DIVERSOBEN, PPQRY_ESTRMANDORDI, "A.DIVERSO_BEN", "DIVERSO_BEN", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_LIST, 1632, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_LIST, 84);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_LIST, "Numero Doc.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_FORM, 4, 496, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_FORM, 84);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODOC, MyGlb.PANEL_FORM, "Numero Doc.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMERODOC, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMERODOC, PPQRY_ESTRMANDORDI, "A.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_LIST, 1740, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_LIST, "Data Doc.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_FORM, 4, 472, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODOC, MyGlb.PANEL_FORM, "Data Doc.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNODOC, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNODOC, PPQRY_ESTRMANDORDI, "A.ANNO_DOC", "ANNO_DOC", 6, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_LIST, 1804, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_LIST, "Quietanza Beneficiario");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_FORM, 4, 544, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIETANZA, MyGlb.PANEL_FORM, "Quiet. Benefic.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMQUIETANZA, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMQUIETANZA, PPQRY_ESTRMANDORDI, "A.NUM_QUIETANZA", "NUM_QUIETANZA", 1, 2, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 2004, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_LIST, "Quietanza Beneficiario Div.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 4, 1456, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMQUIDIVBEN, MyGlb.PANEL_FORM, "Q. Benef. Div");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMQUIDIVBEN, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMQUIDIVBEN, PPQRY_ESTRMANDORDI, "A.NUM_QUIETANZA_DIV_BEN", "RECNUMQUDIBE", 1, 2, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_LIST, 2184, 36, 68, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_LIST, "Sede Del.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_FORM, 4, 268, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_FORM, 2);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_SEDEDEL, MyGlb.PANEL_FORM, "Sede Del.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_SEDEDEL, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_SEDEDEL, PPQRY_ESTRMANDORDI, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_LIST, 2252, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_LIST, "Numero Del.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_FORM, 4, 244, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMERODEL, MyGlb.PANEL_FORM, "Numero Del.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMERODEL, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMERODEL, PPQRY_ESTRMANDORDI, "A.NUMERO_DEL", "NUMERO_DEL", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_LIST, 2324, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_LIST, "Anno Del.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_FORM, 4, 220, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNODEL, MyGlb.PANEL_FORM, "Anno Del.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNODEL, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNODEL, PPQRY_ESTRMANDORDI, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 2372, 36, 354, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 388, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_DESCRIZIONE, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_DESCRIZIONE, PPQRY_ESTRMANDORDI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_LIST, 2726, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_LIST, 28);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_LIST, "Cig");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_FORM, 4, 520, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_FORM, 28);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CIG, MyGlb.PANEL_FORM, "Cig");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_CIG, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_CIG, PPQRY_ESTRMANDORDI, "A.CIG", "CIG", 5, 15, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_LIST, 2810, 36, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_LIST, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_FORM, 4, 568, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_CAUSALE, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_CAUSALE, PPQRY_ESTRMANDORDI, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_LIST, 3026, 36, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_LIST, 44);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_FORM, 4, 592, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_BOLLO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_BOLLO, PPQRY_ESTRMANDORDI, "A.BOLLO", "BOLLO", 1, 2, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_LIST, 3242, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_LIST, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_LIST, "Numero Inc.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_FORM, 4, 664, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_FORM, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROINC, MyGlb.PANEL_FORM, "Numero Inc.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROINC, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROINC, PPQRY_ESTRMANDORDI, "A.NUMERO_INC", "NUMERO_INC", 5, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_LIST, 3322, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. V Livello");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 688, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. V Livello");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_CODLIVELLO5, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_CODLIVELLO5, PPQRY_ESTRMANDORDI, "A.COD_LIVELLO_5", "COD_LIVELLO_5", 3, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_LIST, 3410, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_LIST, 220);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_LIST, "Descrizione V Livello");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_FORM, 4, 1264, 656, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_FORM, 220);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_FORM, 2);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_VISSTRRICDES, MyGlb.PANEL_FORM, "Descrizione V Livello");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_VISSTRRICDES, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_VISSTRRICDES, PPQRY_VISTBILAUO77, "A.DESCRIZIONE", "VIBIUO77VSRD", 5, 300, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_LIST, 3842, 36, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_LIST, "Codice Europeo");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 712, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICEEUROPE, MyGlb.PANEL_FORM, "Codice Europeo");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_CODICEEUROPE, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_CODICEEUROPE, PPQRY_ESTRMANDORDI, "A.CODICE_EUROPEO", "CODICE_EUROPEO", 1, 1, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_LIST, 4090, 36, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_LIST, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_LIST, "Codice Cofog");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_FORM, 4, 736, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_FORM, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CODICECOFOG, MyGlb.PANEL_FORM, "Codice Cofog");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_CODICECOFOG, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_CODICECOFOG, PPQRY_ESTRMANDORDI, "A.CODICE_COFOG", "CODICE_COFOG", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_LIST, 3244, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_LIST, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_LIST, "Importo non sog.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_FORM, 4, 808, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_FORM, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTNONSOG, MyGlb.PANEL_FORM, "Importo non sog.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_IMPORTNONSOG, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_IMPORTNONSOG, PPQRY_ESTRMANDORDI, "A.IMPORTO_NON_SOG", "IMPORTO_NON_SOG", 3, 14, 2, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_LIST, 4242, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_LIST, 148);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_LIST, "Importo non sog.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_FORM, 4, 832, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_FORM, 148);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPNONSOGEUR, MyGlb.PANEL_FORM, "Importo non sog.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_IMPNONSOGEUR, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_IMPNONSOGEUR, PPQRY_ESTRMANDORDI, "A.IMPORTO_NON_SOG_EURO", "IMPORTO_NON_SOG_EURO", 3, 14, 2, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_LIST, 4370, 36, 150, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_LIST, 108);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_LIST, "Importo Pagam.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_FORM, 4, 856, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_FORM, 108);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_IMPORTOPAGAM, MyGlb.PANEL_FORM, "Importo Pagam.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_IMPORTOPAGAM, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_IMPORTOPAGAM, PPQRY_ESTRMANDORDI, "A.IMPORTO_PAGAM", "IMPORTO_PAGAM", 3, 14, 2, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_LIST, 4338, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_FORM, 4, 904, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_FATTORE, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_FATTORE, PPQRY_ESTRMANDORDI, "A.FATTORE", "FATTORE", 5, 16, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_LIST, 4426, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_FORM, 4, 928, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_CENTRO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_CENTRO, PPQRY_ESTRMANDORDI, "A.CENTRO", "CENTRO", 5, 16, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_LIST, 4552, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_LIST, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_LIST, "Piano dei conti");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_FORM, 4, 952, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_FORM, 80);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_FORM, 2);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PIANOCONTI, MyGlb.PANEL_FORM, "Piano dei conti");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_PIANOCONTI, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_PIANOCONTI, PPQRY_ESTRMANDORDI, "A.PIANO_CONTI", "REESMAORPICO", 5, 4000, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_LIST, 4514, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_LIST, 120);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_LIST, "Progr. Tesoriere");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_FORM, 4, 1000, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_FORM, 120);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_PROGRESSTESO, MyGlb.PANEL_FORM, "Progr. Tesoriere");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_PROGRESSTESO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_PROGRESSTESO, PPQRY_ESTRMANDORDI, "A.PROGRESSIVO_TESO", "REESMAORPRTE", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_LIST, 4586, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_LIST, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_LIST, "Distinta");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_FORM, 4, 1024, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_FORM, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DISTINTECNIC, MyGlb.PANEL_FORM, "Distinta");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_DISTINTECNIC, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_DISTINTECNIC, PPQRY_ESTRMANDORDI, "A.DISTINTA_TECNICA", "REESMAORDITE", 5, 87, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_LIST, 4730, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_LIST, 56);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_FORM, 4, 1048, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_FORM, 56);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_UFFICIO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_UFFICIO, PPQRY_ESTRMANDORDI, "A.UFFICIO", "RECESTMAORUF", 1, 5, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 4858, 36, 88, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, "Numero Contabile");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 4, 1480, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, "Num. Cont.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROCONTAB, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROCONTAB, PPQRY_ESTRMANDORDI, "A.NUMERO_CONTABILE", "RECONUMECONT", 5, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 4946, 36, 64, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_LIST, "Data Contabile");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 4, 1504, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 88);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_DATACONTABIL, MyGlb.PANEL_FORM, "Dt. Contabile");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_DATACONTABIL, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_DATACONTABIL, PPQRY_ESTRMANDORDI, "A.DATA_CONTABILE", "RECODATACONT", 6, 10, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_LIST, 5010, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_LIST, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_LIST, "Anno Mand. Rit. Fisc.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_FORM, 4, 1408, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_FORM, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDCO, MyGlb.PANEL_FORM, "An. Mn. Rt. Fsc.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOMANDCO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOMANDCO, PPQRY_ESTRMANDORDI, "A.ANNO_MAND_CO", "REESMAORANMC", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_LIST, 5082, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_LIST, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_LIST, "Num. Mand Rit Fisc");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_FORM, 4, 1432, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_FORM, 112);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDCO, MyGlb.PANEL_FORM, "Num. Mand Rit Fisc");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROMANDCO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROMANDCO, PPQRY_ESTRMANDORDI, "A.NUMERO_MAND_CO", "REESMAORNUMC", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_LIST, 5154, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_LIST, 124);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_LIST, "Anno Mand. Rit. Prev.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_FORM, 4, 1072, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_FORM, 124);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINP, MyGlb.PANEL_FORM, "Anno Mand Rit Prev");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOMANCOINP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOMANCOINP, PPQRY_ESTRMANDORDI, "A.ANNO_MAND_CO_INPS", "REESMAORAMC1", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_LIST, 5226, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_LIST, 140);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_LIST, "Num. Mand Rit Prev");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_FORM, 4, 1096, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_FORM, 140);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINP, MyGlb.PANEL_FORM, "Numero Mand Rit Prev");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEMANCOINP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEMANCOINP, PPQRY_ESTRMANDORDI, "A.NUMERO_MAND_CO_INPS", "REESMAORNMC1", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_LIST, 5298, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_LIST, 128);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_LIST, "Anno Mand. Rit. Inail.");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_FORM, 4, 1120, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_FORM, 128);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANCOINA, MyGlb.PANEL_FORM, "Anno Mand. Rit. Inail.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOMANCOINA, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOMANCOINA, PPQRY_ESTRMANDORDI, "A.ANNO_MAND_CO_INAIL", "REESMAORAMCI", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_LIST, 5370, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_LIST, 144);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_LIST, "Num. Mand Rit Inail");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_FORM, 4, 1144, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_FORM, 144);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEMANCOINA, MyGlb.PANEL_FORM, "Numero Mand. Rit. Inail.");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEMANCOINA, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEMANCOINA, PPQRY_ESTRMANDORDI, "A.NUMERO_MAND_CO_INAIL", "REESMAORNMCI", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_LIST, 5442, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_LIST, 144);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_LIST, "Anno Mand Rit Add Reg");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_FORM, 4, 1168, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_FORM, 144);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADRE, MyGlb.PANEL_FORM, "Anno Mand Rit Add Reg");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNMANCOADRE, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNMANCOADRE, PPQRY_ESTRMANDORDI, "A.ANNO_MAND_CO_ADD_REG", "REESMAOAMCAR", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_LIST, 5514, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_LIST, 164);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_LIST, "Num. Mand Rit Add Reg");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_FORM, 4, 1192, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_FORM, 164);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADRE, MyGlb.PANEL_FORM, "Numero Mand Rit Add Reg");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMMANCOADRE, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMMANCOADRE, PPQRY_ESTRMANDORDI, "A.NUMERO_MAND_CO_ADD_REG", "REESMAONMCAR", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_LIST, 5586, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_LIST, 148);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_LIST, "Ann. Mnd. Rt. Ad. Com");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_FORM, 4, 1216, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_FORM, 148);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNMANCOADCO, MyGlb.PANEL_FORM, "Anno Mand Rit Add Com");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNMANCOADCO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNMANCOADCO, PPQRY_ESTRMANDORDI, "A.ANNO_MAND_CO_ADD_COM", "REESMAOAMCAC", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_LIST, 5658, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_LIST, 164);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_LIST, "Num. Mnd. Rt. Ad. Com");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_FORM, 4, 1240, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_FORM, 164);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMMANCOADCO, MyGlb.PANEL_FORM, "Numero Mand Rit Add Com");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMMANCOADCO, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMMANCOADCO, PPQRY_ESTRMANDORDI, "A.NUMERO_MAND_CO_ADD_COM", "REESMAONMCAC", 3, 38, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_LIST, 5730, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_LIST, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_LIST, "Anno Mand. SP/RC");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_FORM, 4, 1312, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_FORM, 92);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_ANNOMANDSP, MyGlb.PANEL_FORM, "Ann. Mnd. S. RC");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_ANNOMANDSP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_ANNOMANDSP, PPQRY_ESTRMANDORDI, "A.ANNO_MAND_SP", "REESMAORANMS", 1, 4, 0, -13997);
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_LIST, 5802, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_LIST, 108);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_LIST, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_LIST, "Numero Mand SP RC");
    PAN_MANDATORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_FORM, 4, 1336, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_MANDATORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_FORM, 108);
    PAN_MANDATORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_FORM, 1);
    PAN_MANDATORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_MANDATORDINA_NUMEROMANDSP, MyGlb.PANEL_FORM, "Num. Mand SP RC");
    PAN_MANDATORDINA.SetFieldPage(PFL_MANDATORDINA_NUMEROMANDSP, -1, -1);
    PAN_MANDATORDINA.SetFieldPanel(PFL_MANDATORDINA_NUMEROMANDSP, PPQRY_ESTRMANDORDI, "A.NUMERO_MAND_SP", "REESMAORNUMS", 3, 38, 0, -13997);
  }

  private void PAN_MANDATORDINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_MANDATORDINA.SetSize(MyGlb.OBJ_QUERY, 12);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as ROWNAMBENCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as ROWNAMBERASO, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PQRY_QTN1.QUIETANZANTE~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_MANDATORDINA.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATORDINA.SetMasterTable(PPQRY_BEN, "BEN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VIBIUO77VSRC, ");
    SQL.append("  A.DESCRIZIONE as VIBIUO77VSRD ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~COD_LIVELLO_5~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_VISTBILAUO77, 0, SQL, -1, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_VISTBILAUO77, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATORDINA.SetMasterTable(PPQRY_VISTBILAUO77, "VISTA_STRUTTURA_RICL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as BENRAGIOSOCI ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~BENEFICIARIO~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_BEN1, 0, SQL, PFL_MANDATORDINA_BENEFICIARIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as BENRAGIOSOCI ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_BEN1, 1, SQL, PFL_MANDATORDINA_BENEFICIARIO, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_BEN1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as BENRAGIOSOCI ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~DIVERSO_BEN~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_BEN2, 0, SQL, PFL_MANDATORDINA_DIVERSOBEN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE as BENRAGIOSOCI ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_BEN2, 1, SQL, PFL_MANDATORDINA_DIVERSOBEN, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_BEN2, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("where (A.CODICE = ~~NUM_QUIETANZA~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T3, 0, SQL, PFL_MANDATORDINA_NUMQUIETANZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T3, 1, SQL, PFL_MANDATORDINA_NUMQUIETANZA, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_T3, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    SQL.append("where (A.CODICE = ~~RECNUMQUDIBE~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T02, 0, SQL, PFL_MANDATORDINA_NUMQUIDIVBEN, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T02CODICE, ");
    SQL.append("  A.DESCRIZIONE as T02DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T02 A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T02, 1, SQL, PFL_MANDATORDINA_NUMQUIDIVBEN, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_T02, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T58, 0, SQL, PFL_MANDATORDINA_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T58, 1, SQL, PFL_MANDATORDINA_CAUSALE, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~BOLLO~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T60, 0, SQL, PFL_MANDATORDINA_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T60, 1, SQL, PFL_MANDATORDINA_BOLLO, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CODTRAEURCO1 ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.CODICE = ~~CODICE_EUROPEO~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAMETRI67.NOMOGGENTSPE~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_CODTRANSEURO, 0, SQL, PFL_MANDATORDINA_CODICEEUROPE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODTRAEURCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as CODTRAEURCO1 ");
    SQL.append("from ");
    SQL.append("  COD_TRANSAZIONI_EUROPEE A ");
    SQL.append("where (A.E_S = ~~PQRY_PARAMETRI67.NOMOGGENTSPE~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_CODTRANSEURO, 1, SQL, PFL_MANDATORDINA_CODICEEUROPE, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_CODTRANSEURO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COFOG as PROGRAMCOFOG, ");
    SQL.append("  GET_DESCR_COD_COFOG(A.COFOG,B.ESERCIZIO,B.E_S) as PRCOVISTRIDE ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI_COFOG A, ");
    SQL.append("  CAP B ");
    SQL.append("where (A.COFOG = ~~CODICE_COFOG~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (B.E_S = ~~PQRY_PARAMETRI67.NOMOGGENTSPE~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CODICE_STRUTTURA = A.PROGRAMMA) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_COFOG, 0, SQL, PFL_MANDATORDINA_CODICECOFOG, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.COFOG as PROGRAMCOFOG, ");
    SQL.append("  GET_DESCR_COD_COFOG(A.COFOG,B.ESERCIZIO,B.E_S) as PRCOVISTRIDE ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI_COFOG A, ");
    SQL.append("  CAP B ");
    SQL.append("where (B.ARTICOLO = ~~ARTICOLO~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (B.E_S = ~~PQRY_PARAMETRI67.NOMOGGENTSPE~~) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CODICE_STRUTTURA = A.PROGRAMMA) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_COFOG, 1, SQL, PFL_MANDATORDINA_CODICECOFOG, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_COFOG, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~RECESTMAORUF~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T53, 0, SQL, PFL_MANDATORDINA_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_T53, 1, SQL, PFL_MANDATORDINA_UFFICIO, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATORDINA.SetIMDB(IMDB, "PQRY_ESTRMANDORDI", true);
    PAN_MANDATORDINA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.RITENUTE as RITENUTE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DIVERSO_BEN as DIVERSO_BEN, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  A.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  A.CIG as CIG, ");
    SQL.append("  A.NUM_QUIETANZA as NUM_QUIETANZA, ");
    SQL.append("  A.NUM_QUIETANZA_DIV_BEN as REESMAONQDB1, ");
    SQL.append("  A.CAUSALE as CAUSALE, ");
    SQL.append("  A.BOLLO as BOLLO, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.NUMERO_INC as NUMERO_INC, ");
    SQL.append("  A.COD_LIVELLO_5 as COD_LIVELLO_5, ");
    SQL.append("  A.CODICE_EUROPEO as CODICE_EUROPEO, ");
    SQL.append("  A.CODICE_COFOG as CODICE_COFOG, ");
    SQL.append("  A.IMPORTO_IVA as IMPORTO_IVA, ");
    SQL.append("  A.IMPORTO_IVA_IST as IMPORTO_IVA_IST, ");
    SQL.append("  A.IMPORTO_NON_SOG as IMPORTO_NON_SOG, ");
    SQL.append("  A.IMPORTO_NON_SOG_EURO as IMPORTO_NON_SOG_EURO, ");
    SQL.append("  A.IMPORTO_PAGAM as IMPORTO_PAGAM, ");
    SQL.append("  A.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  A.FATTORE as FATTORE, ");
    SQL.append("  A.CENTRO as CENTRO, ");
    SQL.append("  A.PIANO_CONTI as REESMAORPICO, ");
    SQL.append("  A.PROGRESSIVO_TESO as REESMAORPRTE, ");
    SQL.append("  A.DISTINTA_TECNICA as REESMAORDITE, ");
    SQL.append("  A.UFFICIO as RECESTMAORUF, ");
    SQL.append("  A.ANNO_MAND_CO_INPS as REESMAORAMC1, ");
    SQL.append("  A.NUMERO_MAND_CO_INPS as REESMAORNMC1, ");
    SQL.append("  A.ANNO_MAND_CO_INAIL as REESMAORAMCI, ");
    SQL.append("  A.NUMERO_MAND_CO_INAIL as REESMAORNMCI, ");
    SQL.append("  A.ANNO_MAND_CO_ADD_REG as REESMAOAMCAR, ");
    SQL.append("  A.NUMERO_MAND_CO_ADD_REG as REESMAONMCAR, ");
    SQL.append("  A.ANNO_MAND_CO_ADD_COM as REESMAOAMCAC, ");
    SQL.append("  A.NUMERO_MAND_CO_ADD_COM as REESMAONMCAC, ");
    SQL.append("  A.ANNO_MAND_SP as REESMAORANMS, ");
    SQL.append("  A.NUMERO_MAND_SP as REESMAORNUMS, ");
    SQL.append("  A.ANNO_DISTINTA as REESMAORANDI, ");
    SQL.append("  A.NUMERO_DISTINTA as REESMAORNUDI, ");
    SQL.append("  A.ANNO_MAND_CO as REESMAORANMC, ");
    SQL.append("  A.NUMERO_MAND_CO as REESMAORNUMC, ");
    SQL.append("  A.NUM_QUIETANZA_DIV_BEN as RECNUMQUDIBE, ");
    SQL.append("  A.NUMERO_CONTABILE as RECONUMECONT, ");
    SQL.append("  A.DATA_CONTABILE as RECODATACONT ");
    PAN_MANDATORDINA.SetQuery(PPQRY_ESTRMANDORDI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESTRAZIONE_MANDATI_ORDINATIVI A ");
    PAN_MANDATORDINA.SetQuery(PPQRY_ESTRMANDORDI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~PQRY_PARAMETRI67.NOMOGGENTSPE~~) ");
    SQL.append("and   (A.D_DATA_MAND < ~~TBL_PARAMETRI213.NOMEOGGEADAT~~) ");
    SQL.append("and   (A.D_DATA_MAND >= ~~TBL_PARAMETRI213.NOMEOGGDADAT~~) ");
    PAN_MANDATORDINA.SetQuery(PPQRY_ESTRMANDORDI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDATORDINA.SetQuery(PPQRY_ESTRMANDORDI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_MANDATORDINA.SetQuery(PPQRY_ESTRMANDORDI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND ");
    PAN_MANDATORDINA.SetQuery(PPQRY_ESTRMANDORDI, 5, SQL, -1, "");
    PAN_MANDATORDINA.SetQueryDB(PPQRY_ESTRMANDORDI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_MANDATORDINA.SetMasterTable(0, "ESTRAZIONE_MANDATI_ORDINATIVI");
    PAN_MANDATORDINA.AddToSortList(PFL_MANDATORDINA_ANNOMAND, true);
    PAN_MANDATORDINA.AddToSortList(PFL_MANDATORDINA_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_MANDATORDINA.Status() == 2)
    {
      int oldListQBE = PAN_MANDATORDINA.iUseListQBE;
      PAN_MANDATORDINA.iUseListQBE = 0;
      PAN_MANDATORDINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_MANDATORDINA.PanelCommand(Glb.PCM_FIND);
      PAN_MANDATORDINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_MANDATORDINA) PAN_MANDATORDINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_MANDATORDINA) PAN_MANDATORDINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_MANDATORDINA) PAN_MANDATORDINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_MANDATORDINA) PAN_MANDATORDINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_MANDATORDINA) PAN_MANDATORDINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
