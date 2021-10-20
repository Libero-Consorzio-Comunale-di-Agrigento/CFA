// **********************************************
// Buono
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Buono extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int GRP_ESTREMI_FOOTER = 0;

  private static int PFL_ESTREMI_DATAEMISSION = 0;
  private static int PFL_ESTREMI_BENEFICIARIO = 1;
  private static int PFL_ESTREMI_NOTE1 = 2;
  private static int PFL_ESTREMI_ANNO = 3;
  private static int PFL_ESTREMI_UTENTE1 = 4;
  private static int PFL_ESTREMI_DATAREGISTR1 = 5;
  private static int PFL_ESTREMI_BUONO = 6;
  private static int PFL_ESTREMI_CODICE = 7;

  private static int PPQRY_BUONI1 = 0;


  IDPanel PAN_ESTREMI;
  private static int PFL_DETTAGLI_IMPORTO = 0;
  private static int PFL_DETTAGLI_DESCRIZIONE = 1;
  private static int PFL_DETTAGLI_RESBUONO = 2;
  private static int PFL_DETTAGLI_LIQTEC = 3;
  private static int PFL_DETTAGLI_CENTRO = 4;
  private static int PFL_DETTAGLI_FATTORE = 5;
  private static int PFL_DETTAGLI_NOTE2 = 6;
  private static int PFL_DETTAGLI_CHIUSO = 7;
  private static int PFL_DETTAGLI_FATTORDESCRI = 8;
  private static int PFL_DETTAGLI_DESCRICENTRO = 9;
  private static int PFL_DETTAGLI_DESCRIZIONE3 = 10;
  private static int PFL_DETTAGLI_SUBIMPDESCRI = 11;
  private static int PFL_DETTAGLI_SUBIMPEGNO = 12;
  private static int PFL_DETTAGLI_IMPEGNO = 13;
  private static int PFL_DETTAGLI_COMPDAL = 14;
  private static int PFL_DETTAGLI_AL = 15;
  private static int PFL_DETTAGLI_OFFERTA = 16;
  private static int PFL_DETTAGLI_DESTINAZIONE = 17;
  private static int PFL_DETTAGLI_VOCEECON = 18;
  private static int PFL_DETTAGLI_CGU = 19;
  private static int PFL_DETTAGLI_VOCIECONDESC = 20;
  private static int PFL_DETTAGLI_CODIGESTDESC = 21;
  private static int PFL_DETTAGLI_INTESTAZIONE = 22;
  private static int PFL_DETTAGLI_INTESTAZION1 = 23;
  private static int PFL_DETTAGLI_ANNOSUBIMP = 24;

  private static int PPQRY_BUONI4 = 0;

  private static int PPQRY_VOCIECONOMIC = 1;
  private static int PPQRY_CODICIGESTIO = 2;


  IDPanel PAN_DETTAGLI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI29(IMDB);
    //
    //
    Init_PQRY_BUONI1(IMDB);
    Init_PQRY_BUONI4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI29, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI29, "TBL_PARAMETRI29");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI29,IMDBDef2.FLD_PARAMETRI29_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI29,IMDBDef2.FLD_PARAMETRI29_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI29,IMDBDef2.FLD_PARAMETRI29_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI29,IMDBDef2.FLD_PARAMETRI29_ROWNAMENUMER,1,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI29, 0);
  }

  private static void Init_PQRY_BUONI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_BUONI1, 25);
    IMDB.set_TblCode(IMDBDef10.PQRY_BUONI1, "PQRY_BUONI1");
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NUMERO_BUONO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_CODICE,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_DATA_EM_BUONO, "DATA_EM_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_DATA_EM_BUONO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_SETTORE_OPERATIVO, "SETTORE_OPERATIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_SETTORE_OPERATIVO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_SERVIZIO_OPERATIVO, "SERVIZIO_OPERATIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_SERVIZIO_OPERATIVO,5,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_UTENTE, "UTENTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_UTENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_RECORDCODIC1, "RECORDCODIC1");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_RECORDCODIC1,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_DESCRIZIONE,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_FATTURATO, "FATTURATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_FATTURATO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_RECORDNOTE, "RECORDNOTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_RECORDNOTE,5,500,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_CHIUSO, "CHIUSO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_CHIUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_REBERASOESE1, "REBERASOESE1");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_REBERASOESE1,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_DATA_REGISTRAZIONE, "DATA_REGISTRAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI1,IMDBDef10.PQSL_BUONI1_DATA_REGISTRAZIONE,6,19,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_BUONI1, 0);
  }

  private static void Init_PQRY_BUONI4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_BUONI4, 37);
    IMDB.set_TblCode(IMDBDef10.PQRY_BUONI4, "PQRY_BUONI4");
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Buono_ANNO_BUONO, "Buono_ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Buono_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Buoni_NUMERO_BUONO, "Buoni_NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Buoni_NUMERO_BUONO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Buoni_CODICE, "Buoni_CODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Buoni_CODICE,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DATA_REGISTRAZIONE, "DATA_REGISTRAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DATA_REGISTRAZIONE,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_PROGRESSIVO_BUONO, "PROGRESSIVO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_PROGRESSIVO_BUONO,1,3,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECDETBUANSU, "RECDETBUANSU");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECDETBUANSU,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Dettagli_Buoni_DESCRIZIONE, "Dettagli_Buoni_DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_Dettagli_Buoni_DESCRIZIONE,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_FATTURATO, "FATTURATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_FATTURATO,3,28,6);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_LIQUIDATO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CENTRO, "CENTRO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CENTRO,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_FATTORE, "FATTORE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_FATTORE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NOTE,5,500,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CHIUSO, "CHIUSO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CHIUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_NUMERO_BUONO,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DATA_REG,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_UTENTE, "UTENTE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_UTENTE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DATA_EM_BUONO, "DATA_EM_BUONO");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DATA_EM_BUONO,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECOFATTDESC, "RECOFATTDESC");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECOFATTDESC,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECODESCCENT, "RECODESCCENT");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECODESCCENT,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECORDDESCR3, "RECORDDESCR3");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECORDDESCR3,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECORDIMPEGN,5,201,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECORSUBIMPE, "RECORSUBIMPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_RECORSUBIMPE,5,201,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_COMPETENZA_DAL, "COMPETENZA_DAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_COMPETENZA_DAL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_COMPETENZA_AL, "COMPETENZA_AL");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_COMPETENZA_AL,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_OFFERTA, "OFFERTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_OFFERTA,5,500,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DESTINAZIONE, "DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_DESTINAZIONE,5,500,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_VOCE_ECON, "VOCE_ECON");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_VOCE_ECON,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CODICE_GESTIONALE, "CODICE_GESTIONALE");
    IMDB.SetFldParams(IMDBDef10.PQRY_BUONI4,IMDBDef10.PQSL_BUONI4_CODICE_GESTIONALE,1,4,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_BUONI4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Buono(MyWebEntryPoint w, IMDBObj imdb)
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
  public Buono()
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
    FormIdx = MyGlb.FRM_BUONO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A6A3D4E6-760F-4041-AD02-247E0D014218";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 648;
    DesignHeight = 482;
    set_Caption(new IDVariant("Buono"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 648;
    Frames[1].Height = 456;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 456;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "3C1A2324-9AFA-49D5-BB68-4A0A4D277E98";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Estremi";
    Frames[2].Parent = this;
    PAN_ESTREMI = new IDPanel(w, this, 2, "PAN_ESTREMI");
    Frames[2].Content = PAN_ESTREMI;
    PAN_ESTREMI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTREMI.VS = MainFrm.VisualStyleList;
    PAN_ESTREMI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 648-MyGlb.PAN_OFFS_X, 456-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ED9AEF19-B82F-4160-A95D-3EDB6EF96EB6");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1256, 288, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTREMI.InitStatus = 2;
    PAN_ESTREMI_Init();
    PAN_ESTREMI_InitFields();
    PAN_ESTREMI_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Estremi", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Dettagli";
    Frames[3].Parent = this;
    PAN_DETTAGLI = new IDPanel(w, this, 3, "PAN_DETTAGLI");
    Frames[3].Content = PAN_DETTAGLI;
    PAN_DETTAGLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLI.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 648-MyGlb.PAN_OFFS_X, 456-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5CA5960F-366E-45AD-B65C-C46DFD521FAB");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5556, 338, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLI.InitStatus = 2;
    PAN_DETTAGLI_Init();
    PAN_DETTAGLI_InitFields();
    PAN_DETTAGLI_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Dettagli", "");
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
      PAN_ESTREMI.UpdatePanel(MainFrm);
      PAN_DETTAGLI.UpdatePanel(MainFrm);
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
    return (obj instanceof Buono);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Buono.class.getName() : (Glb.ClassWithPackage(Buono.class) ? Buono.class.getName().substring(Buono.class.getPackage().getName().length() + 1) : Buono.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tab Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_TAB_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Buono ", IDVariant.STRING));
      v_CAPTION1 = (new IDVariant("Beneficiario ", IDVariant.STRING));
      v_CAPTION2 = (new IDVariant(" - Data Emissione ", IDVariant.STRING));
      // 
      // Tab Change Page Event Body
      // Procedure Body
      // 
      PAN_DETTAGLI.set_FieldText(PFL_DETTAGLI_INTESTAZIONE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI29, IMDBDef2.FLD_PARAMETRI29_ROWNAMENUMER, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI29, IMDBDef2.FLD_PARAMETRI29_ROWNAMEANNO, 0))), v_CAPTION2), MainFrm.Datetostring(IMDB.Value(IMDBDef10.PQRY_BUONI1, IMDBDef10.PQSL_BUONI1_DATA_EM_BUONO, 0))).stringValue());
      PAN_DETTAGLI.set_FieldText(PFL_DETTAGLI_INTESTAZION1, IDL.Add(v_CAPTION1, IMDB.Value(IMDBDef10.PQRY_BUONI1, IMDBDef10.PQSL_BUONI1_REBERASOESE1, 0)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Buono", "TabChangePageEvent", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Buono", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Estremi After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ESTREMI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Buono", IDVariant.STRING));
      // 
      // Estremi After Find Event Body
      // Procedure Body
      // 
      PAN_ESTREMI.set_FieldText(PFL_ESTREMI_BUONO, IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI29, IMDBDef2.FLD_PARAMETRI29_ROWNAMENUMER, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI29, IMDBDef2.FLD_PARAMETRI29_ROWNAMEANNO, 0))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Buono", "EstremiAfterFindEvent", _e);
    }
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_TAB_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ESTREMI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTREMI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTREMI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTREMI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTREMI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ESTREMI);
    // Stub
  }

  private void PAN_ESTREMI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ESTREMI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTREMI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_BUONI1, IMDBDef10.PQSL_BUONI1_DATA_REGISTRAZIONE, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_BUONI1, IMDBDef10.PQSL_BUONI1_DATA_REGISTRAZIONE, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_ESTREMI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTAGLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DETTAGLI);
    // Stub
  }

  private void PAN_DETTAGLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESTREMI_Init()
  {

    PAN_ESTREMI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTREMI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, "6D349407-E778-4CD9-A0E5-614A12C2CE6B");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, "footer");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, MyGlb.PANEL_LIST, 0, -9999, 928, 0, 0, 0);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, MyGlb.PANEL_FORM, 20, 192, 536, 28, 0, 0);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, 0, 35);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, 1, 13);
    PAN_ESTREMI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, 0, 1);
    PAN_ESTREMI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, 1, 1);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_GROUP, GRP_ESTREMI_FOOTER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESTREMI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, "A25AB0A7-052D-41DF-8919-DC340FAC2B87");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, "Data emissione");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, "3347E0A0-90CA-45C1-820E-3B4497E585B0");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, "Beneficiario");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, "D6F30C55-3370-4C32-AAC9-181D721A512B");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, "Note");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, "A25267FB-C6CE-4A66-BCF4-EAD0792E2EA5");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, "Anno");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, "DBE6D685-E47B-4E1C-8521-6099FB1811E5");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, "Utente");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, "FF9B11C9-955B-48AC-A67B-E89E554BBBAF");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, "Data registrazione");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, "145F1B19-9870-4F1A-B803-F1D38E1DEC6E");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, MyGlb.VIS_ETICHEGRASSE);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ESTREMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, "B10EB17F-E9F5-494A-B1BA-C26F252B212D");
    PAN_ESTREMI.set_Header(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, "CODICE");
    PAN_ESTREMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, "");
    PAN_ESTREMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTREMI.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_ESTREMI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_LIST, 216, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_LIST, 92);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_LIST, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_LIST, "Data emissione");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_FORM, 4, 40, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_FORM, 96);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_FORM, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAEMISSION, MyGlb.PANEL_FORM, "Data emissione");
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_DATAEMISSION, -1, -1);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_DATAEMISSION, PPQRY_BUONI1, "A.DATA_EM_BUONO", "DATA_EM_BUONO", 6, 19, 0, -13997);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_LIST, 64);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_LIST, 2);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_FORM, 12, 64, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_FORM, 88);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_BENEFICIARIO, -1, -1);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_BENEFICIARIO, PPQRY_BUONI1, "C.RAGIONE_SOCIALE_ESTESA", "REBERASOESE1", 5, 60, 0, -13997);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_LIST, 448, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_LIST, 36);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_LIST, 2);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_FORM, 12, 88, 540, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_FORM, 88);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_FORM, 2);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_NOTE1, -1, -1);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_NOTE1, PPQRY_BUONI1, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_LIST, 76);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_FORM, 24, 196, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_FORM, 76);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_ANNO, -1, GRP_ESTREMI_FOOTER);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_ANNO, PPQRY_BUONI1, "A.ANNO_BUONO", "ANNO_BUONO", 1, 4, 0, -13997);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_LIST, 880, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_LIST, 48);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_FORM, 176, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_FORM, 52);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_UTENTE1, -1, GRP_ESTREMI_FOOTER);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_UTENTE1, PPQRY_BUONI1, "A.UTENTE", "UTENTE", 5, 8, 0, -13997);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_LIST, 120);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_LIST, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_LIST, "Data registrazione");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_FORM, 360, 196, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_FORM, 116);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_FORM, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_DATAREGISTR1, MyGlb.PANEL_FORM, "Data registrazione");
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_DATAREGISTR1, -1, GRP_ESTREMI_FOOTER);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_DATAREGISTR1, PPQRY_BUONI1, "A.DATA_REGISTRAZIONE", "DATA_REGISTRAZIONE", 6, 19, 0, -13997);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, MyGlb.PANEL_LIST, 12, 0, 336, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, MyGlb.PANEL_LIST, 0);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, MyGlb.PANEL_LIST, 2);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, MyGlb.PANEL_FORM, 16, 8, 536, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, MyGlb.PANEL_FORM, 0);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_BUONO, MyGlb.PANEL_FORM, 1);
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_BUONO, -1, -1);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_BUONO, -1, "", "BUONO", 0, 0, 0, -13997);
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_ESTREMI.SetRect(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_FORM, 460, 64, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTREMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_ESTREMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_ESTREMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTREMI_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_ESTREMI.SetFieldPage(PFL_ESTREMI_CODICE, -1, -1);
    PAN_ESTREMI.SetFieldPanel(PFL_ESTREMI_CODICE, PPQRY_BUONI1, "A.CODICE", "CODICE", 1, 6, 0, -13997);
  }

  private void PAN_ESTREMI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTREMI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTREMI.SetIMDB(IMDB, "PQRY_BUONI1", true);
    PAN_ESTREMI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_BUONO as ANNO_BUONO, ");
    SQL.append("  A.NUMERO_BUONO as NUMERO_BUONO, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DATA_EM_BUONO as DATA_EM_BUONO, ");
    SQL.append("  A.SETTORE_OPERATIVO as SETTORE_OPERATIVO, ");
    SQL.append("  A.SERVIZIO_OPERATIVO as SERVIZIO_OPERATIVO, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.UTENTE as UTENTE, ");
    SQL.append("  C.CODICE as RECORDCODIC1, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
    SQL.append("  B.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  B.PROGRESSIVO_BUONO as PROGRESSIVO_BUONO, ");
    SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  B.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  B.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  B.IMPORTO as IMPORTO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.LIQUIDATO as LIQUIDATO, ");
    SQL.append("  B.FATTURATO as FATTURATO, ");
    SQL.append("  B.CENTRO as CENTRO, ");
    SQL.append("  B.FATTORE as FATTORE, ");
    SQL.append("  B.NOTE as RECORDNOTE, ");
    SQL.append("  B.CHIUSO as CHIUSO, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as REBERASOESE1, ");
    SQL.append("  A.DATA_REGISTRAZIONE as DATA_REGISTRAZIONE ");
    PAN_ESTREMI.SetQuery(PPQRY_BUONI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BUONI A, ");
    SQL.append("  DETTAGLI_BUONI B, ");
    SQL.append("  BEN C, ");
    SQL.append("  COMPETENZE D ");
    PAN_ESTREMI.SetQuery(PPQRY_BUONI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_BUONO = B.ANNO_BUONO) ");
    SQL.append("and   (A.NUMERO_BUONO = B.NUMERO_BUONO) ");
    SQL.append("and   (A.CODICE = C.CODICE) ");
    SQL.append("and   (A.ANNO_BUONO = ~~TBL_PARAMETRI29.ROWNAMEANNO~~) ");
    SQL.append("and   (A.NUMERO_BUONO = ~~TBL_PARAMETRI29.ROWNAMENUMER~~) ");
    SQL.append("and   (RTRIM(A.SETTORE_OPERATIVO) LIKE RTRIM(SUBSTR(D.COMPETENZA, 1, 6))) ");
    SQL.append("and   (RTRIM(A.SERVIZIO_OPERATIVO) LIKE RTRIM(SUBSTR(D.COMPETENZA, -(1)))) ");
    SQL.append("and   (B.PROGRESSIVO_BUONO = 1) ");
    SQL.append("and   (D.OGGETTO = 'CAPSS') ");
    PAN_ESTREMI.SetQuery(PPQRY_BUONI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTREMI.SetQuery(PPQRY_BUONI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTREMI.SetQuery(PPQRY_BUONI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ESTREMI.SetQuery(PPQRY_BUONI1, 5, SQL, -1, "");
    PAN_ESTREMI.SetQueryDB(PPQRY_BUONI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ESTREMI.SetMasterTable(0, "BUONI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTREMI.Status() == 2)
    {
      int oldListQBE = PAN_ESTREMI.iUseListQBE;
      PAN_ESTREMI.iUseListQBE = 0;
      PAN_ESTREMI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTREMI.PanelCommand(Glb.PCM_FIND);
      PAN_ESTREMI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DETTAGLI_Init()
  {

    PAN_DETTAGLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGLI.SetSize(MyGlb.OBJ_FIELD, 25);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, "5CC421AD-7F18-4132-A6DC-799C1A68D0A2");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, "Importo");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, "62F60727-AF1C-41CB-B8B8-A2906E895447");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, "Descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, "8D0E6981-483D-4893-B5D6-86E9AB99F0F6");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, "Res. Buono");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, "CF34805A-EF4D-4EDA-B833-99C2C90A2A06");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, "Liq. tec.");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, "00B435B1-9F57-447A-8F21-2C8DD9C9F72F");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, "Centro");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, "A2EFC8AC-64F1-454F-A080-351D7B265713");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, "Fattore");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, "7546B668-B64F-4FD9-8FF0-EFB8CF0C8E9F");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, "Note");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, "0BE3795D-BAFC-48A7-A569-8D364E35BA2A");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, "Chiuso");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.VIS_CHECKSTYLE);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, "A19CBEDF-8501-42C2-AB39-EC2DCAFB30FE");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, "Fattore descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, "fattore descrizione");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, "309A949E-6292-473A-82BB-B289018B0C6E");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, "Descrizione Centro");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, "centri descrizione");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, "95E8A2BD-8276-4D13-9D02-B17F05F8A4F4");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, "DESCRIZIONE 3");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, "imp.descrizione");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, "0D684836-D6EA-432C-9A9F-669CE52B9C2E");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, "subimp.descrizione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, "sub_impegno_descrizione");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, "5043CC65-9378-43DF-8B73-AA38B7F0CB75");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, "Sub-impegno");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, "19558EB6-3FDF-492C-AEC8-4402B3E7CFC5");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, "Impegno");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, "62AE1084-77D5-41E5-BE94-BD6A4944E861");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, "Comp. dal");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, "33E6B5CD-C83E-45CE-BA01-2E747A37AD2E");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, "Al");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, "F2FEA863-B01E-47C2-905F-3B9EAB64442B");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, "Offerta");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, "2A21914D-B8CF-450F-A626-05497985194F");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, "Destinazione");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, "52096FE7-140B-4BCC-BA3C-C70DA46C7F60");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, "Voce Econ.");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, "5DD1A0B7-EB4C-4198-BDC3-16FF4B39B85F");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, "Cgu");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, "C87736C9-646C-4B9D-9991-D0B35006BB25");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, "2ADF9F84-CD49-46E0-8811-CF916B5A81AC");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, "CODICI GESTIONALI DESCRIZIONE");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, "C50336B3-6D1E-40A1-A2BB-C76B27F89184");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, MyGlb.VIS_ETICHEGRASSE);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, "728EDA4D-873C-4C37-8B8B-19A7FA338430");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, MyGlb.VIS_ETICHEGRASSE);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, "2D9B3076-C8D3-4104-9342-4D53554CB4E5");
    PAN_DETTAGLI.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_DETTAGLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, "");
    PAN_DETTAGLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_DETTAGLI.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_DETTAGLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_LIST, 924, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_FORM, 28, 168, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_IMPORTO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_IMPORTO, PPQRY_BUONI4, "B.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, 1004, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 492, 64, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, 4);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DESCRIZIONE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DESCRIZIONE, PPQRY_BUONI4, "B.DESCRIZIONE", "Dettagli_Buoni_DESCRIZIONE", 5, 2000, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_LIST, 1436, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_LIST, "Res. Buono");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_FORM, 192, 168, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_FORM, 72);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_RESBUONO, MyGlb.PANEL_FORM, "Res. Buono");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_RESBUONO, -1, -1);
    PAN_DETTAGLI.SetFieldUnbound(PFL_DETTAGLI_RESBUONO, true);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_RESBUONO, PPQRY_BUONI4, "B.IMPORTO - CASE WHEN (B.FATTURATO IS NULL) THEN 0 ELSE B.FATTURATO END", "FATTURATO", 3, 28, 6, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_LIST, 1516, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_LIST, 64);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_LIST, "Liq. tec.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_FORM, 360, 168, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_LIQTEC, MyGlb.PANEL_FORM, "Liq. tec.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_LIQTEC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_LIQTEC, PPQRY_BUONI4, "B.LIQUIDATO", "LIQUIDATO", 3, 14, 2, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, 1596, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, 28, 192, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CENTRO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CENTRO, PPQRY_BUONI4, "B.CENTRO", "CENTRO", 5, 8, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, 1648, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, 28, 216, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_FATTORE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_FATTORE, PPQRY_BUONI4, "B.FATTORE", "FATTORE", 5, 8, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_LIST, 1704, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_LIST, 36);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_LIST, "Note");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_FORM, 324, 240, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_FORM, 36);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_NOTE2, MyGlb.PANEL_FORM, "Note");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_NOTE2, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_NOTE2, PPQRY_BUONI4, "B.NOTE", "NOTE", 5, 500, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_LIST, 2136, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_LIST, 48);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_LIST, "Chiuso");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_FORM, 504, 240, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_FORM, 48);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CHIUSO, MyGlb.PANEL_FORM, "Chiuso");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CHIUSO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CHIUSO, PPQRY_BUONI4, "B.CHIUSO", "CHIUSO", 5, 2, 0, -13997);
    PAN_DETTAGLI.SetValueListItem(PFL_DETTAGLI_CHIUSO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DETTAGLI.SetValueListItem(PFL_DETTAGLI_CHIUSO, (new IDVariant()), "Null", "", "", -1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, 2700, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_LIST, "Fattore descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, 184, 216, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_FATTORDESCRI, MyGlb.PANEL_FORM, "Ftt. dsc.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_FATTORDESCRI, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_FATTORDESCRI, PPQRY_BUONI4, "E.DESCRIZIONE", "RECOFATTDESC", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_LIST, 3008, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_LIST, "Descrizione Centro");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_FORM, 184, 192, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRICENTRO, MyGlb.PANEL_FORM, "Dsc. Cnt.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DESCRICENTRO, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DESCRICENTRO, PPQRY_BUONI4, "D.DESCRIZIONE", "RECODESCCENT", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_LIST, 3316, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_LIST, "DESCRIZIONE 3");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_FORM, 192, 52, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_FORM, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESCRIZIONE3, MyGlb.PANEL_FORM, "DESCR. 3");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DESCRIZIONE3, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DESCRIZIONE3, PPQRY_BUONI4, "F.DESCRIZIONE", "RECORDDESCR3", 5, 140, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_LIST, 3672, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_LIST, 76);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_LIST, "subimp.descrizione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_FORM, 192, 76, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_FORM, 84);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPDESCRI, MyGlb.PANEL_FORM, "sub. descr.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_SUBIMPDESCRI, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_SUBIMPDESCRI, PPQRY_BUONI4, "G.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub-impegno");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_FORM, 0, 76, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_FORM, 84);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub-impegno");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_SUBIMPEGNO, -1, -1);
    PAN_DETTAGLI.SetFieldUnbound(PFL_DETTAGLI_SUBIMPEGNO, true);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_SUBIMPEGNO, PPQRY_BUONI4, "TO_CHAR ( B.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( B.ANNO_SUBIMP )", "RECORSUBIMPE", 5, 201, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_FORM, 0, 52, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_FORM, 84);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_IMPEGNO, -1, -1);
    PAN_DETTAGLI.SetFieldUnbound(PFL_DETTAGLI_IMPEGNO, true);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_IMPEGNO, PPQRY_BUONI4, "TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP )", "RECORDIMPEGN", 5, 201, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_LIST, 100);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_LIST, "Comp. dal");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_FORM, 16, 240, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_COMPDAL, MyGlb.PANEL_FORM, "Comp. dal");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_COMPDAL, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_COMPDAL, PPQRY_BUONI4, "B.COMPETENZA_DAL", "COMPETENZA_DAL", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, 92);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, 184, 240, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, 24);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_AL, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_AL, PPQRY_BUONI4, "B.COMPETENZA_AL", "COMPETENZA_AL", 6, 19, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_LIST, "Offerta");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_FORM, 28, 264, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_FORM, 56);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_OFFERTA, MyGlb.PANEL_FORM, "Offerta");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_OFFERTA, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_OFFERTA, PPQRY_BUONI4, "B.OFFERTA", "OFFERTA", 5, 500, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_LIST, "Destinazione");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_FORM, 0, 288, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_FORM, 84);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_DESTINAZIONE, MyGlb.PANEL_FORM, "Destinazione");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_DESTINAZIONE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_DESTINAZIONE, PPQRY_BUONI4, "B.DESTINAZIONE", "DESTINAZIONE", 5, 500, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_LIST, "Voce Econ.");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_FORM, 16, 312, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCEECON, MyGlb.PANEL_FORM, "Voce Econ.");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_VOCEECON, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_VOCEECON, PPQRY_BUONI4, "B.VOCE_ECON", "VOCE_ECON", 1, 2, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_LIST, 112);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_LIST, "Cgu");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_FORM, 40, 336, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_FORM, 44);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CGU, MyGlb.PANEL_FORM, "Cgu");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CGU, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CGU, PPQRY_BUONI4, "B.CODICE_GESTIONALE", "CODICE_GESTIONALE", 1, 4, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_LIST, 176);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_LIST, "VOCI ECONOMICHE DESCRIZIONE");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_FORM, 184, 312, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_FORM, 176);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_VOCIECONDESC, MyGlb.PANEL_FORM, "VC. ECONOMICHE DESCRIZIONE");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_VOCIECONDESC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_VOCIECONDESC, PPQRY_VOCIECONOMIC, "A.DESCRIZIONE", "VOCIECONDESC", 5, 140, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_LIST, 180);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_LIST, "CODICI GESTIONALI DESCRIZIONE");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_FORM, 184, 336, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_FORM, 180);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_CODIGESTDESC, MyGlb.PANEL_FORM, "COD. GESTIONALI DESCRIZIONE");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_CODIGESTDESC, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_CODIGESTDESC, PPQRY_CODICIGESTIO, "A.DESCRIZIONE", "CODIGESTDESC", 5, 200, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, MyGlb.PANEL_LIST, 24, 0, 516, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, MyGlb.PANEL_FORM, 88, 4, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_INTESTAZIONE, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_INTESTAZIONE, -1, "", "INTESTAZIONE", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, MyGlb.PANEL_LIST, 32, 8, 516, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, MyGlb.PANEL_FORM, 88, 28, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_INTESTAZION1, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_INTESTAZION1, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_INTESTAZION1, -1, "", "INTESTAZION1", 0, 0, 0, -13997);
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANNO SUBIMP");
    PAN_DETTAGLI.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 360, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_DETTAGLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLI_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_DETTAGLI.SetFieldPage(PFL_DETTAGLI_ANNOSUBIMP, -1, -1);
    PAN_DETTAGLI.SetFieldPanel(PFL_DETTAGLI_ANNOSUBIMP, PPQRY_BUONI4, "G.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
  }

  private void PAN_DETTAGLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as VOCIECONDESC ");
    SQL.append("from ");
    SQL.append("  VOCI_ECONOMICHE A ");
    SQL.append("where (A.CODICE = ~~VOCE_ECON~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    PAN_DETTAGLI.SetQuery(PPQRY_VOCIECONOMIC, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_VOCIECONOMIC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_VOCIECONOMIC, "VOCI_ECONOMICHE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CODIGESTDESC ");
    SQL.append("from ");
    SQL.append("  CODICI_GESTIONALI A ");
    SQL.append("where (A.CODICE = ~~CODICE_GESTIONALE~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    PAN_DETTAGLI.SetQuery(PPQRY_CODICIGESTIO, 0, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_CODICIGESTIO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(PPQRY_CODICIGESTIO, "CODICI_GESTIONALI");
    PAN_DETTAGLI.SetIMDB(IMDB, "PQRY_BUONI4", true);
    PAN_DETTAGLI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_BUONO as Buono_ANNO_BUONO, ");
    SQL.append("  A.NUMERO_BUONO as Buoni_NUMERO_BUONO, ");
    SQL.append("  A.CODICE as Buoni_CODICE, ");
    SQL.append("  A.DATA_REGISTRAZIONE as DATA_REGISTRAZIONE, ");
    SQL.append("  C.CODICE as CODICE, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
    SQL.append("  B.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  B.PROGRESSIVO_BUONO as PROGRESSIVO_BUONO, ");
    SQL.append("  B.ANNO_SUBIMP as RECDETBUANSU, ");
    SQL.append("  B.IMPORTO as IMPORTO, ");
    SQL.append("  B.DESCRIZIONE as Dettagli_Buoni_DESCRIZIONE, ");
    SQL.append("  B.IMPORTO - CASE WHEN (B.FATTURATO IS NULL) THEN 0 ELSE B.FATTURATO END as FATTURATO, ");
    SQL.append("  B.LIQUIDATO as LIQUIDATO, ");
    SQL.append("  B.CENTRO as CENTRO, ");
    SQL.append("  B.FATTORE as FATTORE, ");
    SQL.append("  B.NOTE as NOTE, ");
    SQL.append("  B.CHIUSO as CHIUSO, ");
    SQL.append("  B.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  B.ANNO_BUONO as ANNO_BUONO, ");
    SQL.append("  B.NUMERO_BUONO as NUMERO_BUONO, ");
    SQL.append("  B.DATA_REG as DATA_REG, ");
    SQL.append("  B.UTENTE as UTENTE, ");
    SQL.append("  A.DATA_EM_BUONO as DATA_EM_BUONO, ");
    SQL.append("  E.DESCRIZIONE as RECOFATTDESC, ");
    SQL.append("  D.DESCRIZIONE as RECODESCCENT, ");
    SQL.append("  F.DESCRIZIONE as RECORDDESCR3, ");
    SQL.append("  G.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  TO_CHAR ( B.NUMERO_IMP ) || ' / ' || TO_CHAR ( B.ANNO_IMP ) as RECORDIMPEGN, ");
    SQL.append("  TO_CHAR ( B.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( B.ANNO_SUBIMP ) as RECORSUBIMPE, ");
    SQL.append("  G.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  B.COMPETENZA_DAL as COMPETENZA_DAL, ");
    SQL.append("  B.COMPETENZA_AL as COMPETENZA_AL, ");
    SQL.append("  B.OFFERTA as OFFERTA, ");
    SQL.append("  B.DESTINAZIONE as DESTINAZIONE, ");
    SQL.append("  B.VOCE_ECON as VOCE_ECON, ");
    SQL.append("  B.CODICE_GESTIONALE as CODICE_GESTIONALE ");
    PAN_DETTAGLI.SetQuery(PPQRY_BUONI4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BUONI A, ");
    SQL.append("  DETTAGLI_BUONI B, ");
    SQL.append("  BEN C, ");
    SQL.append("  CENTRI D, ");
    SQL.append("  FATTORI E, ");
    SQL.append("  IMP F, ");
    SQL.append("  SUBIMP G ");
    PAN_DETTAGLI.SetQuery(PPQRY_BUONI4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CENTRO = D.CENTRO(+)) ");
    SQL.append("and   (B.FATTORE = E.FATTORE(+)) ");
    SQL.append("and   (B.ANNO_SUBIMP = G.ANNO_SUBIMP(+)) ");
    SQL.append("and   (B.NUMERO_SUBIMP = G.NUMERO_SUBIMP(+)) ");
    SQL.append("and   (A.ANNO_BUONO = B.ANNO_BUONO) ");
    SQL.append("and   (A.NUMERO_BUONO = B.NUMERO_BUONO) ");
    SQL.append("and   (A.CODICE = C.CODICE) ");
    SQL.append("and   (B.ANNO_IMP = F.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMP = F.NUMERO_IMP) ");
    SQL.append("and   (A.ANNO_BUONO = ~~TBL_PARAMETRI29.ROWNAMEANNO~~) ");
    SQL.append("and   (A.NUMERO_BUONO = ~~TBL_PARAMETRI29.ROWNAMENUMER~~) ");
    SQL.append("and   (B.PROGRESSIVO_BUONO = 1) ");
    PAN_DETTAGLI.SetQuery(PPQRY_BUONI4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLI.SetQuery(PPQRY_BUONI4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLI.SetQuery(PPQRY_BUONI4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLI.SetQuery(PPQRY_BUONI4, 5, SQL, -1, "");
    PAN_DETTAGLI.SetQueryDB(PPQRY_BUONI4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLI.SetMasterTable(0, "BUONI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLI.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLI.iUseListQBE;
      PAN_DETTAGLI.iUseListQBE = 0;
      PAN_DETTAGLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLI.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESTREMI) PAN_ESTREMI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTREMI) PAN_ESTREMI_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESTREMI) PAN_ESTREMI_DynamicProperties();
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTREMI) PAN_ESTREMI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESTREMI) PAN_ESTREMI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ESTREMI) PAN_ESTREMI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLI) PAN_DETTAGLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
