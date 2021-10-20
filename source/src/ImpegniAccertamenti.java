// **********************************************
// Impegni Accertamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImpegniAccertamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_PARTE = 0;
  private static int PFL_PARAM_TUTTI = 1;
  private static int PFL_PARAM_SUBIMPEGNI = 2;

  private static int PPQRY_PARAM180 = 0;


  IDPanel PAN_PARAM;
  private static int PFL_IMPSUBRESIDU_ESERCIZIO1 = 0;
  private static int PFL_IMPSUBRESIDU_CAPITOLO1 = 1;
  private static int PFL_IMPSUBRESIDU_ARTICOLO1 = 2;
  private static int PFL_IMPSUBRESIDU_CAPDESCRIZI1 = 3;
  private static int PFL_IMPSUBRESIDU_DESCRIZIONU1 = 4;
  private static int PFL_IMPSUBRESIDU_LIVELLO2 = 5;
  private static int PFL_IMPSUBRESIDU_LIVELLO5IMP = 6;
  private static int PFL_IMPSUBRESIDU_MISSIONE = 7;
  private static int PFL_IMPSUBRESIDU_DESCRIMISSIO = 8;
  private static int PFL_IMPSUBRESIDU_PROGRAMMA = 9;
  private static int PFL_IMPSUBRESIDU_DESCRIPROGRA = 10;
  private static int PFL_IMPSUBRESIDU_NUMEROIMPEGN = 11;
  private static int PFL_IMPSUBRESIDU_ANNOIMPEGNO = 12;
  private static int PFL_IMPSUBRESIDU_ATTOIMPEGNO = 13;
  private static int PFL_IMPSUBRESIDU_DESCRIIMPEGN = 14;
  private static int PFL_IMPSUBRESIDU_NUMERIMPPROV = 15;
  private static int PFL_IMPSUBRESIDU_ANNOIMPPROVE = 16;
  private static int PFL_IMPSUBRESIDU_ANNOENTRPROV = 17;
  private static int PFL_IMPSUBRESIDU_REISCDASTANZ = 18;
  private static int PFL_IMPSUBRESIDU_CODICEBENEFI = 19;
  private static int PFL_IMPSUBRESIDU_DESCRIBENEFI = 20;
  private static int PFL_IMPSUBRESIDU_IMPORINIZIMP = 21;
  private static int PFL_IMPSUBRESIDU_IMPORATTUIMP = 22;
  private static int PFL_IMPSUBRESIDU_DISPONIBILI1 = 23;
  private static int PFL_IMPSUBRESIDU_DISPONEFFETT = 24;
  private static int PFL_IMPSUBRESIDU_NUMEROSUBIMP = 25;
  private static int PFL_IMPSUBRESIDU_ANNOSUBIMP = 26;
  private static int PFL_IMPSUBRESIDU_DESCRISUBIMP = 27;
  private static int PFL_IMPSUBRESIDU_NUMESUBIPROV = 28;
  private static int PFL_IMPSUBRESIDU_ANNOSUBIPROV = 29;
  private static int PFL_IMPSUBRESIDU_LIVELL5SUBIM = 30;
  private static int PFL_IMPSUBRESIDU_IMPOINIZSUBI = 31;
  private static int PFL_IMPSUBRESIDU_IMPOATTUSUBI = 32;
  private static int PFL_IMPSUBRESIDU_DISPSUBIMP = 33;
  private static int PFL_IMPSUBRESIDU_DISPEFFESUBI = 34;
  private static int PFL_IMPSUBRESIDU_NOTE1 = 35;
  private static int PFL_IMPSUBRESIDU_UNITAPROPON1 = 36;
  private static int PFL_IMPSUBRESIDU_NUMEROPROPO1 = 37;
  private static int PFL_IMPSUBRESIDU_ANNOPROPOST1 = 38;
  private static int PFL_IMPSUBRESIDU_SEDEDEL1 = 39;
  private static int PFL_IMPSUBRESIDU_NUMERODEL1 = 40;
  private static int PFL_IMPSUBRESIDU_ANNODEL1 = 41;
  private static int PFL_IMPSUBRESIDU_TIPOVINCOLO1 = 42;
  private static int PFL_IMPSUBRESIDU_DESCTIPOVIN1 = 43;
  private static int PFL_IMPSUBRESIDU_TIPOAVANZO1 = 44;
  private static int PFL_IMPSUBRESIDU_DESCTIPOAVA1 = 45;
  private static int PFL_IMPSUBRESIDU_TIPO = 46;

  private static int PPQRY_IMPSUBRESIDU = 0;

  private static int PPQRY_LOOKCAPIIMPE = 1;


  IDPanel PAN_IMPSUBRESIDU;
  private static int PFL_ACCRESIDUI_ESERCIZIO = 0;
  private static int PFL_ACCRESIDUI_CAPITOLO = 1;
  private static int PFL_ACCRESIDUI_ARTICOLO = 2;
  private static int PFL_ACCRESIDUI_CAPDESCRIZIO = 3;
  private static int PFL_ACCRESIDUI_PROGRUO = 4;
  private static int PFL_ACCRESIDUI_DESCRIZIONUO = 5;
  private static int PFL_ACCRESIDUI_LIVELLO1 = 6;
  private static int PFL_ACCRESIDUI_TIPOLOGIA = 7;
  private static int PFL_ACCRESIDUI_DECRIZTIPOLO = 8;
  private static int PFL_ACCRESIDUI_LIVELLO4 = 9;
  private static int PFL_ACCRESIDUI_LIVELLO5 = 10;
  private static int PFL_ACCRESIDUI_NUMEROACC = 11;
  private static int PFL_ACCRESIDUI_ANNOACC = 12;
  private static int PFL_ACCRESIDUI_ATTOACCERTAM = 13;
  private static int PFL_ACCRESIDUI_DESCRIACCERT = 14;
  private static int PFL_ACCRESIDUI_DEBITORE = 15;
  private static int PFL_ACCRESIDUI_RAGISOCIDEBI = 16;
  private static int PFL_ACCRESIDUI_IMPORTINIZIA = 17;
  private static int PFL_ACCRESIDUI_IMPORTATTUAL = 18;
  private static int PFL_ACCRESIDUI_DISPONIBILIT = 19;
  private static int PFL_ACCRESIDUI_NOTE = 20;
  private static int PFL_ACCRESIDUI_UNITAPROPONE = 21;
  private static int PFL_ACCRESIDUI_NUMEROPROPOS = 22;
  private static int PFL_ACCRESIDUI_ANNOPROPOSTA = 23;
  private static int PFL_ACCRESIDUI_SEDEDEL = 24;
  private static int PFL_ACCRESIDUI_NUMERODEL = 25;
  private static int PFL_ACCRESIDUI_ANNODEL = 26;
  private static int PFL_ACCRESIDUI_TIPOVINCOLO = 27;
  private static int PFL_ACCRESIDUI_DESCTIPOVINC = 28;
  private static int PFL_ACCRESIDUI_TIPOAVANZO = 29;
  private static int PFL_ACCRESIDUI_DESCTIPOAVAN = 30;

  private static int PPQRY_ACCRESIDUI = 0;

  private static int PPQRY_LOOKCAPIACCE = 1;


  IDPanel PAN_ACCRESIDUI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM188(IMDB);
    //
    //
    Init_PQRY_PARAM180(IMDB);
    Init_PQRY_PARAM180_RS(IMDB);
    Init_PQRY_IMPSUBRESIDU(IMDB);
    Init_PQRY_ACCRESIDUI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM188(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAM188, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAM188, "TBL_PARAM188");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM188,IMDBDef6.FLD_PARAM188_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM188,IMDBDef6.FLD_PARAM188_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM188,IMDBDef6.FLD_PARAM188_NOMEOGGETUTT, "NOMEOGGETUTT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM188,IMDBDef6.FLD_PARAM188_NOMEOGGETUTT,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM188,IMDBDef6.FLD_PARAM188_NOMEOGGESUBI, "NOMEOGGESUBI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM188,IMDBDef6.FLD_PARAM188_NOMEOGGESUBI,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAM188, 0);
  }

  private static void Init_PQRY_PARAM180(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAM180, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAM180, "PQRY_PARAM180");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAM180,IMDBDef15.PQSL_PARAM180_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAM180,IMDBDef15.PQSL_PARAM180_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAM180,IMDBDef15.PQSL_PARAM180_NOMEOGGETUTT, "NOMEOGGETUTT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAM180,IMDBDef15.PQSL_PARAM180_NOMEOGGETUTT,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAM180,IMDBDef15.PQSL_PARAM180_NOMEOGGESUBI, "NOMEOGGESUBI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAM180,IMDBDef15.PQSL_PARAM180_NOMEOGGESUBI,5,2,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAM180, 0);
  }

  private static void Init_PQRY_PARAM180_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAM180_RS, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAM180_RS, "PQRY_PARAM180_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAM180_RS,IMDBDef15.PQSL_PARAM180_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAM180_RS,IMDBDef15.PQSL_PARAM180_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAM180_RS,IMDBDef15.PQSL_PARAM180_NOMEOGGETUTT, "NOMEOGGETUTT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAM180_RS,IMDBDef15.PQSL_PARAM180_NOMEOGGETUTT,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAM180_RS,IMDBDef15.PQSL_PARAM180_NOMEOGGESUBI, "NOMEOGGESUBI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAM180_RS,IMDBDef15.PQSL_PARAM180_NOMEOGGESUBI,5,2,0);
  }

  private static void Init_PQRY_IMPSUBRESIDU(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_IMPSUBRESIDU, 46);
    IMDB.set_TblCode(IMDBDef15.PQRY_IMPSUBRESIDU, "PQRY_IMPSUBRESIDU");
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_UO, "DESCRIZIONE_UO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_UO,5,4000,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_LIVELLO_1, "LIVELLO_1");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_LIVELLO_1,5,4000,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_MISSIONE, "MISSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_MISSIONE,5,21,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_MISSIONE, "DESCRIZIONE_MISSIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_MISSIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_PROGRAMMA,5,21,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_PROGRAMMA, "DESCRIZIONE_PROGRAMMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_PROGRAMMA,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ATTO_IMPEGNO, "ATTO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ATTO_IMPEGNO,5,337,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_IMPEGNO, "DESCRIZIONE_IMPEGNO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_IMPEGNO,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_IMP_PROVENIENZA, "ANNO_IMP_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_IMP_PROVENIENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_IMP_PROVENIENZA, "NUMERO_IMP_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_IMP_PROVENIENZA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_REISCR_DA_STANZ, "REISCR_DA_STANZ");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_REISCR_DA_STANZ,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_ATTUALE_IMP, "IMPORTO_ATTUALE_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_ATTUALE_IMP,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_IMP, "DISP_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_IMP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_EFFETTIVA_IMP, "DISP_EFFETTIVA_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_EFFETTIVA_IMP,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_SUBIMP,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_SUBIMP,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_SUBIMP, "DESCRIZIONE_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_SUBIMP,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_SUBIMP_PROVENIENZA, "ANNO_SUBIMP_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_SUBIMP_PROVENIENZA,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_SUBIMP_PROVENIENZA, "NUMERO_SUBIMP_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_SUBIMP_PROVENIENZA,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_ATTUALE_SUBIMP, "IMPORTO_ATTUALE_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_ATTUALE_SUBIMP,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_SUBIMP, "DISP_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_SUBIMP,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_EFFETTIVA_SUBIMP, "DISP_EFFETTIVA_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DISP_EFFETTIVA_SUBIMP,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_TIPO,5,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_LIVELLO_5_IMP, "LIVELLO_5_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_LIVELLO_5_IMP,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_LIVELLO_5_SUBIMP, "LIVELLO_5_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_LIVELLO_5_SUBIMP,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_INIZIALE_IMP, "IMPORTO_INIZIALE_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_INIZIALE_IMP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_INIZIALE_SUBIMP, "IMPORTO_INIZIALE_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_IMPORTO_INIZIALE_SUBIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_NUMERO_PROPOSTA,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_CODICE_BENEFICIARIO, "CODICE_BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_CODICE_BENEFICIARIO,1,9,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_BENEFICIARIO, "DESCRIZIONE_BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_BENEFICIARIO,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_ENTRATA_PROVENIENZA, "ANNO_ENTRATA_PROVENIENZA");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_ANNO_ENTRATA_PROVENIENZA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_TIPO_VINCOLO, "DESCRIZIONE_TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_TIPO_VINCOLO,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_TIPO_AVANZO, "DESCRIZIONE_TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef15.PQRY_IMPSUBRESIDU,IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_TIPO_AVANZO,5,100,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_IMPSUBRESIDU, 0);
  }

  private static void Init_PQRY_ACCRESIDUI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ACCRESIDUI, 30);
    IMDB.set_TblCode(IMDBDef15.PQRY_ACCRESIDUI, "PQRY_ACCRESIDUI");
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_PROGR_UO, "PROGR_UO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_PROGR_UO,1,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_UO, "DESCRIZIONE_UO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_UO,5,4000,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_LIVELLO_4, "LIVELLO_4");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_LIVELLO_4,5,4000,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_TIPOLOGIA, "TIPOLOGIA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_TIPOLOGIA,5,21,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_TIPOLOGIA, "DESCRIZIONE_TIPOLOGIA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_TIPOLOGIA,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ATTO_ACCERTAMENTO, "ATTO_ACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ATTO_ACCERTAMENTO,5,337,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_ACCERTAMENTO, "DESCRIZIONE_ACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_ACCERTAMENTO,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_IMPORTO_ATTUALE, "IMPORTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_IMPORTO_ATTUALE,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ACCRESILIVE1, "ACCRESILIVE1");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ACCRESILIVE1,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_LIVELLO_5, "LIVELLO_5");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_LIVELLO_5,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_IMPORTO_INIZIALE, "IMPORTO_INIZIALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_IMPORTO_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NUMERO_PROPOSTA, "NUMERO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_NUMERO_PROPOSTA,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ANNO_PROPOSTA, "ANNO_PROPOSTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_ANNO_PROPOSTA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_UNITA_PROPONENTE, "UNITA_PROPONENTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_UNITA_PROPONENTE,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DEBITORE, "DEBITORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DEBITORE,1,9,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_RAGIONE_SOCIALE_DEBITORE, "RAGIONE_SOCIALE_DEBITORE");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_RAGIONE_SOCIALE_DEBITORE,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_TIPO_VINCOLO, "TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_TIPO_VINCOLO,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_TIPO_VINCOLO, "DESCRIZIONE_TIPO_VINCOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_TIPO_VINCOLO,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_TIPO_AVANZO, "DESCRIZIONE_TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef15.PQRY_ACCRESIDUI,IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_TIPO_AVANZO,5,100,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ACCRESIDUI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImpegniAccertamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImpegniAccertamenti()
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
    FormIdx = MyGlb.FRM_IMPEGNACCERT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6051121E-04E8-4E37-A540-0E1109BE39F2";
    ResModeW = 2;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 694;
    set_Caption(new IDVariant("Impegni Accertamenti"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 800;
    Frames[1].Height = 668;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0838323;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 800;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7B691A1F-519E-450D-8B32-980E60AE4CE8");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 228, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 800;
    Frames[3].Height = 612;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.48366;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 800;
    Frames[4].Height = 296;
    Frames[4].Caption = "Elenco Impegni/Subimpegni";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 296;
    PAN_IMPSUBRESIDU = new IDPanel(w, this, 4, "PAN_IMPSUBRESIDU");
    Frames[4].Content = PAN_IMPSUBRESIDU;
    PAN_IMPSUBRESIDU.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPSUBRESIDU.VS = MainFrm.VisualStyleList;
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "26E3C048-D4E9-4A26-923A-2274EDDD11F4");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 5084, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPSUBRESIDU.InitStatus = 1;
    PAN_IMPSUBRESIDU_Init();
    PAN_IMPSUBRESIDU_InitFields();
    PAN_IMPSUBRESIDU_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 800;
    Frames[5].Height = 316;
    Frames[5].Caption = "Elenco Accertamenti";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 316;
    PAN_ACCRESIDUI = new IDPanel(w, this, 5, "PAN_ACCRESIDUI");
    Frames[5].Content = PAN_ACCRESIDUI;
    PAN_ACCRESIDUI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCRESIDUI.VS = MainFrm.VisualStyleList;
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EEEF5994-757E-4BDA-9EF0-04F558AA320D");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 3492, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCRESIDUI.InitStatus = 1;
    PAN_ACCRESIDUI_Init();
    PAN_ACCRESIDUI_InitFields();
    PAN_ACCRESIDUI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAM188, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        IMPEGNACCERT_PARAM180();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_IMPSUBRESIDU.UpdatePanel(MainFrm);
      PAN_ACCRESIDUI.UpdatePanel(MainFrm);
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
    return (obj instanceof ImpegniAccertamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImpegniAccertamenti.class.getName() : (Glb.ClassWithPackage(ImpegniAccertamenti.class) ? ImpegniAccertamenti.class.getName().substring(ImpegniAccertamenti.class.getPackage().getName().length() + 1) : ImpegniAccertamenti.class.getName()));
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
      IMDB.set_Value(IMDBDef6.TBL_PARAM188, IMDBDef6.FLD_PARAM188_NOMEOGGETUTT, 0, (new IDVariant("T")));
      IMDB.set_Value(IMDBDef6.TBL_PARAM188, IMDBDef6.FLD_PARAM188_NOMEOGGESUBI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PARAM188, IMDBDef6.FLD_PARAM188_NOMOGGENTSPE, 0, (new IDVariant("S")));
      PAN_IMPSUBRESIDU.set_Visible((new IDVariant(-1)).booleanValue());
      PAN_ACCRESIDUI.set_Visible((new IDVariant(0)).booleanValue());
      PAN_IMPSUBRESIDU.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_ACCRESIDUI.Freezed = (new IDVariant(-1)).booleanValue();
      set_Caption((new IDVariant("Impegni/Accertamenti")));
      PAN_IMPSUBRESIDU.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_IMPSUBRESIDU.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_IMPSUBRESIDU.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_IMPSUBRESIDU.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ACCRESIDUI.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ACCRESIDUI.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ACCRESIDUI.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ACCRESIDUI.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAccertamenti", "Load", _e);
    }
  }

  // **********************************************************************
  // IMP SUB RESIDUI On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_IMPSUBRESIDU_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // IMP SUB RESIDUI On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_IMPSUBRESIDU.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_IMPSUBRESIDU.Freezed = (new IDVariant(0)).booleanValue();
        PAN_IMPSUBRESIDU_InitQueries();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAccertamenti", "IMPSUBRESIDUIOnCommand", _e);
    }
  }

  // **********************************************************************
  // IMP SUB RESIDUI On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPSUBRESIDU_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPSUBRESIDU);
      // 
      // IMP SUB RESIDUI On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_DESCRIZIONU1,IMDB.Value(IMDBDef15.PQRY_IMPSUBRESIDU, IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_UO, 0).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_DESCRIMISSIO,IMDB.Value(IMDBDef15.PQRY_IMPSUBRESIDU, IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_MISSIONE, 0).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_DESCRIPROGRA,IMDB.Value(IMDBDef15.PQRY_IMPSUBRESIDU, IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_PROGRAMMA, 0).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_DESCRIIMPEGN,IMDB.Value(IMDBDef15.PQRY_IMPSUBRESIDU, IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_IMPEGNO, 0).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_DESCRISUBIMP,IMDB.Value(IMDBDef15.PQRY_IMPSUBRESIDU, IMDBDef15.PQSL_IMPSUBRESIDU_DESCRIZIONE_SUBIMP, 0).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_NOTE1,IMDB.Value(IMDBDef15.PQRY_IMPSUBRESIDU, IMDBDef15.PQSL_IMPSUBRESIDU_NOTE, 0).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_CAPDESCRIZI1,(new IDVariant(PAN_IMPSUBRESIDU.FieldText(PFL_IMPSUBRESIDU_CAPDESCRIZI1))).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_DESCTIPOVIN1,(new IDVariant(PAN_IMPSUBRESIDU.FieldText(PFL_IMPSUBRESIDU_DESCTIPOVIN1))).stringValue()); 
      PAN_IMPSUBRESIDU.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPSUBRESIDU_DESCTIPOAVA1,(new IDVariant(PAN_IMPSUBRESIDU.FieldText(PFL_IMPSUBRESIDU_DESCTIPOAVA1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAccertamenti", "IMPSUBRESIDUIOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // ACC RESIDUI On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ACCRESIDUI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // ACC RESIDUI On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ACCRESIDUI.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ACCRESIDUI.Freezed = (new IDVariant(0)).booleanValue();
        PAN_ACCRESIDUI_InitQueries();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAccertamenti", "ACCRESIDUIOnCommand", _e);
    }
  }

  // **********************************************************************
  // ACC RESIDUI On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCRESIDUI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCRESIDUI);
      // 
      // ACC RESIDUI On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ACCRESIDUI.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCRESIDUI_DESCRIZIONUO,IMDB.Value(IMDBDef15.PQRY_ACCRESIDUI, IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_UO, 0).stringValue()); 
      PAN_ACCRESIDUI.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCRESIDUI_DECRIZTIPOLO,IMDB.Value(IMDBDef15.PQRY_ACCRESIDUI, IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_TIPOLOGIA, 0).stringValue()); 
      PAN_ACCRESIDUI.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCRESIDUI_DESCRIACCERT,IMDB.Value(IMDBDef15.PQRY_ACCRESIDUI, IMDBDef15.PQSL_ACCRESIDUI_DESCRIZIONE_ACCERTAMENTO, 0).stringValue()); 
      PAN_ACCRESIDUI.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCRESIDUI_NOTE,IMDB.Value(IMDBDef15.PQRY_ACCRESIDUI, IMDBDef15.PQSL_ACCRESIDUI_NOTE, 0).stringValue()); 
      PAN_ACCRESIDUI.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCRESIDUI_CAPDESCRIZIO,(new IDVariant(PAN_ACCRESIDUI.FieldText(PFL_ACCRESIDUI_CAPDESCRIZIO))).stringValue()); 
      PAN_ACCRESIDUI.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCRESIDUI_DESCTIPOVINC,(new IDVariant(PAN_ACCRESIDUI.FieldText(PFL_ACCRESIDUI_DESCTIPOVINC))).stringValue()); 
      PAN_ACCRESIDUI.set_ToolTip(Glb.OBJ_FIELD,PFL_ACCRESIDUI_DESCTIPOAVAN,(new IDVariant(PAN_ACCRESIDUI.FieldText(PFL_ACCRESIDUI_DESCTIPOAVAN))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAccertamenti", "ACCRESIDUIOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
      // 
      // Param On Validate Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PARAM180, IMDBDef15.PQSL_PARAM180_NOMOGGENTSPE, 0).equals((new IDVariant("S")), true))
      {
        PAN_IMPSUBRESIDU.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_ACCRESIDUI.set_Visible((new IDVariant(0)).booleanValue());
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_IMPSUBRESIDU.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ACCRESIDUI.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAccertamenti", "ParamOnValidateRow", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PARAM180, IMDBDef15.PQSL_PARAM180_NOMOGGENTSPE, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniAccertamenti", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void IMPEGNACCERT_PARAM180() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAM180_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM188, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAM188, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAM180_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAM180_RS, 0, IMDBDef6.TBL_PARAM188, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAM180_RS, 0, 0, IMDBDef6.TBL_PARAM188, IMDBDef6.FLD_PARAM188_NOMOGGENTSPE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAM180_RS, 1, 0, IMDBDef6.TBL_PARAM188, IMDBDef6.FLD_PARAM188_NOMEOGGETUTT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAM180_RS, 2, 0, IMDBDef6.TBL_PARAM188, IMDBDef6.FLD_PARAM188_NOMEOGGESUBI, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAM188, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAM188, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM188, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAM180_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IMPSUBRESIDU_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPSUBRESIDU, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPSUBRESIDU_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPSUBRESIDU, Cancel);
    // Stub
  }

  private void PAN_IMPSUBRESIDU_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPSUBRESIDU_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPSUBRESIDU_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPSUBRESIDU_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ACCRESIDUI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCRESIDUI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCRESIDUI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCRESIDUI, Cancel);
    // Stub
  }

  private void PAN_ACCRESIDUI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ACCRESIDUI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCRESIDUI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ACCRESIDUI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "F8A657E2-2513-46E7-A681-77744E20492A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Descrivi il contenuto del campo");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, "FBC7B16E-13D9-4BE7-B636-562F10D9A516");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, "Tutti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, "F4302CB3-88ED-4C62-BA4A-7AFB84E8FAC7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, "Subimpegni");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 8, 8, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM180, "A.NOMOGGENTSPE", "NOMOGGENTSPE", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_LIST, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_LIST, "Tutti");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_FORM, 196, 8, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_FORM, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TUTTI, MyGlb.PANEL_FORM, "Tutti");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TUTTI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TUTTI, PPQRY_PARAM180, "A.NOMEOGGETUTT", "NOMEOGGETUTT", 12, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TUTTI, (new IDVariant("T")), "Tutti", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TUTTI, (new IDVariant("S")), "Solo Competenza", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TUTTI, (new IDVariant("R")), "Solo Residui", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_LIST, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_LIST, "Subimpegni");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_FORM, 440, 8, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_FORM, 76);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SUBIMPEGNI, MyGlb.PANEL_FORM, "Subimpegni");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SUBIMPEGNI, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SUBIMPEGNI, PPQRY_PARAM180, "A.NOMEOGGESUBI", "NOMEOGGESUBI", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SUBIMPEGNI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SUBIMPEGNI, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM180", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM180, IMDBDef15.PQRY_PARAM180_RS, IMDBDef6.TBL_PARAM188);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef6.FLD_PARAM188_NOMOGGENTSPE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TUTTI, IMDBDef6.FLD_PARAM188_NOMEOGGETUTT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SUBIMPEGNI, IMDBDef6.FLD_PARAM188_NOMEOGGESUBI);
    PAN_PARAM.SetMasterTable(0, "PARAM188");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_IMPSUBRESIDU_Init()
  {

    PAN_IMPSUBRESIDU.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPSUBRESIDU.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPSUBRESIDU.SetSize(MyGlb.OBJ_FIELD, 47);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, "27873DA3-9DE4-43CD-8885-BB6657F521E2");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, "ESERCIZIO");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, "B9BD898E-8896-4279-B412-9E82D2C7A945");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, "Capitolo");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, "DF8E99CA-1CDB-4DC4-8ADC-FB6B22915124");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, "Articolo");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, "E9C75052-418A-4E58-86EB-51C20FA1177A");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, "Descrizione Capitolo");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, "337B689E-C689-431E-8990-D671D641663D");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, "Descr. UO");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, "93B28F47-8173-45A9-9F88-0D2F3299F84B");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, "Livello 1");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, "ADEC1411-1482-4BDD-8A78-E742F98C3334");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, "Cod. V liv. Impegno");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, "97597575-6816-4840-AA34-E2B78C13CA65");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, "Missione");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, "B8B93A14-4883-4F0C-8F10-0CDDEDBA0648");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, "Descrizione Missione");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, "0ED9368D-FC07-45EE-87C5-2C2290AD1F47");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, "Programma");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, "96C06A62-10CA-4E1D-BAC4-21BA42FD3841");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, "Descrizione Programma");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, "A276EF0A-8C09-4A81-BF51-C1CCAAA59173");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, "Numero Impegno");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, "E679A1F3-14D8-4191-A214-5B7DD67591F7");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, "Anno Impegno");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, "69B29529-56A2-4FA5-8F11-F8A27AD06620");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, "Atto Impegno");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, "A7910D4E-829B-4450-B0E1-660C611E1B9E");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, "Descrizione Impegno");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, "D40523D0-DAB3-4D54-BB5F-EC371FFC4177");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, "Numero Imp. Provenienza");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, "38BDB911-AEB7-4663-B90C-13F796036B1E");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, "Anno Imp. Provenienza");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, "BB33F513-2D14-4971-A612-408980D6D1D1");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, "Anno Entrata Provenienza");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, "6A0857A7-C384-4ACA-9F7B-2638F6F0A23A");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, "Reiscrizione da stanziamento");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, "DA1D8295-9C02-4C1E-BB0F-EA52FAEB9588");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, "Cod. Beneficiario");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, "5AF1EA97-5F09-4BD1-8098-98387509F3F1");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, "Ragione Sociale Beneficiario");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, "7A5B22E6-D7BF-4C7F-B4A2-DEBB3F812C8B");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, "Importo Iniziale Imp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, "447831B3-10FD-48BD-93A0-15E71AC9E50C");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, "Importo Attuale Imp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, "A12291E9-9E2F-4D63-B323-89E7A723F86D");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, "Disp. Imp.");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, "DAEC0776-21CB-4BD6-9469-518CC5D57BD8");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, "Disp. Effettiva Imp.");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, "717FFFD0-3A44-47F2-910D-9530C57404B4");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, "Numero Subimp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, "C5FF999F-D113-45D3-9BAC-F9A31990A0B8");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, "Anno Subimp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, "C9E7EE34-0576-48A7-BB3C-7FFD33B61866");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, "Descrizione Subimpegno");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, "9019A8EF-EAD1-4D05-BEAA-51D123FDA71F");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, "Num. Subimp Provenienza");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, "3218C11A-C329-4F79-A901-0EFA2ED3F219");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, "Anno Subimp Provenienza");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, "F9830236-FFE7-47CE-ACD0-B5CFF0019687");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, "Cod. V liv. Subimp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, "D21070C3-36EF-4932-A22A-23A25E587E41");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, "Importo Iniziale Subimp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, "E7A4D61B-4D99-4B98-9D82-BBBFE16FD201");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, "Imp. Attuale Subimp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, "F2DD114A-4DAA-406C-A9E5-C78D862F0355");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, "Disp. Subimp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, "C918CEEC-D94B-4954-BB41-7D5E07B49F6C");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, "Disp. Effettiva Subimp");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.VIS_NORFIECF4IMP);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, "69F1BBC0-E55B-41D5-BDAB-8E84ED6C2638");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, "Note");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, "A69B8081-3697-4163-9F14-08252578A5D0");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, "Unità Proponente");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, "CA2F3E2F-CAC0-4D3E-A4CF-49F2F7B45D27");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, "Numero Proposta");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, "BA2B1AD0-7993-4B77-ADEE-F3B4955456AF");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, "Anno Proposta");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, "3335B078-E80C-4B34-BDC9-9CEAB68FC946");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, "Sede Delibera");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, "67978A0D-6845-4289-B77F-931BACA990E0");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, "Numero Delibera");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, "2183CBC2-93B3-49B8-99BD-AF8F55989F36");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, "Anno Delibera");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, "49623BAE-99E7-47F6-AB67-6F6D33B5C7C7");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, "E95A4650-4A05-4823-9B15-084632B1AF55");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, "Descrizione Tipo Vincolo");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, "C48E3983-2B8D-44D7-99C0-5587688BD0C6");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, "Tipo Avanzo");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, "BBF430AE-83BD-4EB0-9E6A-B5074FA15A72");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, "Descrizione Tipo Avanzo");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_IMPSUBRESIDU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, "9D3704FC-89DD-47EE-8B06-0E079DC99586");
    PAN_IMPSUBRESIDU.set_Header(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, "TIPO");
    PAN_IMPSUBRESIDU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, "");
    PAN_IMPSUBRESIDU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPSUBRESIDU.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPSUBRESIDU_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_LIST, "ESER.");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ESERCIZIO1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ESERCIZIO1, PPQRY_IMPSUBRESIDU, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_FORM, 188, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_FORM, 80);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_CAPITOLO1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_CAPITOLO1, PPQRY_IMPSUBRESIDU, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_LIST, 116, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_LIST, "Art.");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_FORM, 364, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_FORM, 80);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ARTICOLO1, MyGlb.PANEL_FORM, "Articolo");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ARTICOLO1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ARTICOLO1, PPQRY_IMPSUBRESIDU, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_LIST, 148, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_FORM, 4, 532, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CAPDESCRIZI1, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_CAPDESCRIZI1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_CAPDESCRIZI1, PPQRY_LOOKCAPIIMPE, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_LIST, 360, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_LIST, "Descr. UO");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_FORM, 4, 28, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIZIONU1, MyGlb.PANEL_FORM, "Descr. UO");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCRIZIONU1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCRIZIONU1, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_UO", "DESCRIZIONE_UO", 5, 4000, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_LIST, 552, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_LIST, "Livello 1");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_FORM, 4, 52, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO2, MyGlb.PANEL_FORM, "Livello 1");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_LIVELLO2, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_LIVELLO2, PPQRY_IMPSUBRESIDU, "A.LIVELLO_1", "LIVELLO_1", 5, 4000, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_LIST, 608, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_LIST, 88);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_LIST, "Cod. V liv. Impegno");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_FORM, 4, 436, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_FORM, 88);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELLO5IMP, MyGlb.PANEL_FORM, "Cod V liv Imp.");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_LIVELLO5IMP, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_LIVELLO5IMP, PPQRY_IMPSUBRESIDU, "A.LIVELLO_5_IMP", "LIVELLO_5_IMP", 1, 10, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_LIST, 696, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_LIST, 64);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_LIST, "Missione");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_FORM, 4, 76, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_MISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_MISSIONE, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_MISSIONE, PPQRY_IMPSUBRESIDU, "A.MISSIONE", "MISSIONE", 5, 21, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_LIST, 756, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_LIST, "Descrizione Missione");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_FORM, 4, 100, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIMISSIO, MyGlb.PANEL_FORM, "Descrizione Missione");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCRIMISSIO, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCRIMISSIO, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_MISSIONE", "DESCRIZIONE_MISSIONE", 5, 140, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_LIST, 948, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_LIST, 84);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_FORM, 4, 124, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_PROGRAMMA, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_PROGRAMMA, PPQRY_IMPSUBRESIDU, "A.PROGRAMMA", "PROGRAMMA", 5, 21, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_LIST, 1024, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_LIST, 468);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_LIST, "Descrizione Programma");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_FORM, 4, 148, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIPROGRA, MyGlb.PANEL_FORM, "Descrizione Programma");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCRIPROGRA, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCRIPROGRA, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_PROGRAMMA", "DESCRIZIONE_PROGRAMMA", 5, 140, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1216, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_LIST, 80);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_LIST, "Numero Impegno");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_FORM, 188, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROIMPEGN, MyGlb.PANEL_FORM, "Num. Impegno");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_NUMEROIMPEGN, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_NUMEROIMPEGN, PPQRY_IMPSUBRESIDU, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1276, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_LIST, 64);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_LIST, "Anno Impegno");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPEGNO, MyGlb.PANEL_FORM, "Anno Impegno");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ANNOIMPEGNO, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ANNOIMPEGNO, PPQRY_IMPSUBRESIDU, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_LIST, 1344, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_LIST, 92);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_LIST, "Atto Impegno");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_FORM, 4, 196, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ATTOIMPEGNO, MyGlb.PANEL_FORM, "Atto Impegno");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ATTOIMPEGNO, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ATTOIMPEGNO, PPQRY_IMPSUBRESIDU, "A.ATTO_IMPEGNO", "ATTO_IMPEGNO", 5, 337, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_LIST, 1464, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_LIST, "Descrizione Impegno");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_FORM, 4, 220, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIIMPEGN, MyGlb.PANEL_FORM, "Descrizione Impegno");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCRIIMPEGN, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCRIIMPEGN, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_IMPEGNO", "DESCRIZIONE_IMPEGNO", 5, 140, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_LIST, 1656, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_LIST, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_LIST, "Numero Imp. Provenienza");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_FORM, 188, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERIMPPROV, MyGlb.PANEL_FORM, "Numero Imp. Provenienza");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_NUMERIMPPROV, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_NUMERIMPPROV, PPQRY_IMPSUBRESIDU, "A.NUMERO_IMP_PROVENIENZA", "NUMERO_IMP_PROVENIENZA", 1, 5, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1740, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_LIST, 144);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_LIST, "Anno Imp. Provenienza");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_FORM, 4, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOIMPPROVE, MyGlb.PANEL_FORM, "Ann. Imp Proven.");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ANNOIMPPROVE, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ANNOIMPPROVE, PPQRY_IMPSUBRESIDU, "A.ANNO_IMP_PROVENIENZA", "ANNO_IMP_PROVENIENZA", 1, 4, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_LIST, 1824, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_LIST, 172);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_LIST, "Anno Entrata Provenienza");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_FORM, 4, 568, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_FORM, 172);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOENTRPROV, MyGlb.PANEL_FORM, "Anno Entrata Provenienza");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ANNOENTRPROV, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ANNOENTRPROV, PPQRY_IMPSUBRESIDU, "A.ANNO_ENTRATA_PROVENIENZA", "ANNO_ENTRATA_PROVENIENZA", 1, 4, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_LIST, 1908, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_LIST, 108);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_LIST, "Reiscrizione da stanziamento");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_FORM, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_REISCDASTANZ, MyGlb.PANEL_FORM, "Reiscr. da stanziam.");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_REISCDASTANZ, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_REISCDASTANZ, PPQRY_IMPSUBRESIDU, "A.REISCR_DA_STANZ", "REISCR_DA_STANZ", 5, 2, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_LIST, 2012, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_LIST, 132);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_LIST, "Cod. Beneficiario");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_FORM, 4, 568, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_FORM, 132);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_CODICEBENEFI, MyGlb.PANEL_FORM, "Cod. Beneficiario");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_CODICEBENEFI, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_CODICEBENEFI, PPQRY_IMPSUBRESIDU, "A.CODICE_BENEFICIARIO", "CODICE_BENEFICIARIO", 1, 9, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_LIST, 2120, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_LIST, 164);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_LIST, "Ragione Sociale Beneficiario");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_FORM, 4, 568, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_FORM, 164);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRIBENEFI, MyGlb.PANEL_FORM, "Ragione Sociale Beneficiario");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCRIBENEFI, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCRIBENEFI, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_BENEFICIARIO", "DESCRIZIONE_BENEFICIARIO", 5, 60, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_LIST, 2428, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_LIST, 140);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_LIST, "Importo Iniziale Imp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_FORM, 4, 484, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_FORM, 140);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORINIZIMP, MyGlb.PANEL_FORM, "Importo Iniziale Imp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_IMPORINIZIMP, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_IMPORINIZIMP, PPQRY_IMPSUBRESIDU, "A.IMPORTO_INIZIALE_IMP", "IMPORTO_INIZIALE_IMP", 3, 14, 2, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_LIST, 2532, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_LIST, 140);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_LIST, "Importo Attuale Imp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_FORM, 188, 268, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_FORM, 152);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPORATTUIMP, MyGlb.PANEL_FORM, "Importo Attuale Imp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_IMPORATTUIMP, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_IMPORATTUIMP, PPQRY_IMPSUBRESIDU, "A.IMPORTO_ATTUALE_IMP", "IMPORTO_ATTUALE_IMP", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_LIST, 2636, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_LIST, 60);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_LIST, "Disp. Imp.");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_FORM, 340, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_FORM, 72);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONIBILI1, MyGlb.PANEL_FORM, "Disp. Imp.");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DISPONIBILI1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DISPONIBILI1, PPQRY_IMPSUBRESIDU, "A.DISP_IMP", "DISP_IMP", 3, 14, 2, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_LIST, 2740, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_LIST, 124);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_LIST, "Disp. Effettiva Imp.");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_FORM, 252, 124, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_FORM, 136);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPONEFFETT, MyGlb.PANEL_FORM, "Disp. Effettiva Imp.");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DISPONEFFETT, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DISPONEFFETT, PPQRY_IMPSUBRESIDU, "A.DISP_EFFETTIVA_IMP", "DISP_EFFETTIVA_IMP", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_LIST, 2828, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Numero Subimp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_FORM, 404, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_FORM, 120);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero Subimp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_NUMEROSUBIMP, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_NUMEROSUBIMP, PPQRY_IMPSUBRESIDU, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_LIST, 2888, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno Subimp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_FORM, 244, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno Subimp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ANNOSUBIMP, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ANNOSUBIMP, PPQRY_IMPSUBRESIDU, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_LIST, 2956, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_LIST, "Descrizione Subimpegno");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_FORM, 4, 292, 544, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_FORM, 144);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCRISUBIMP, MyGlb.PANEL_FORM, "Descrizione Subimpegno");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCRISUBIMP, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCRISUBIMP, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_SUBIMP", "DESCRIZIONE_SUBIMP", 5, 140, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_LIST, 3148, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_LIST, 184);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_LIST, "Num. Subimp Provenienza");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_FORM, 220, 316, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMESUBIPROV, MyGlb.PANEL_FORM, "Num. Subimp Provenienza");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_NUMESUBIPROV, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_NUMESUBIPROV, PPQRY_IMPSUBRESIDU, "A.NUMERO_SUBIMP_PROVENIENZA", "NUMERO_SUBIMP_PROVENIENZA", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_LIST, 3236, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_LIST, 164);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_LIST, "Anno Subimp Provenienza");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_FORM, 4, 316, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOSUBIPROV, MyGlb.PANEL_FORM, "Anno Subimp Provenienza");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ANNOSUBIPROV, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ANNOSUBIPROV, PPQRY_IMPSUBRESIDU, "A.ANNO_SUBIMP_PROVENIENZA", "ANNO_SUBIMP_PROVENIENZA", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_LIST, 3320, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_LIST, 112);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_LIST, "Cod. V liv. Subimp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_FORM, 4, 460, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_FORM, 112);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_LIVELL5SUBIM, MyGlb.PANEL_FORM, "Cod. V liv. Subimp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_LIVELL5SUBIM, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_LIVELL5SUBIM, PPQRY_IMPSUBRESIDU, "A.LIVELLO_5_SUBIMP", "LIVELLO_5_SUBIMP", 1, 10, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_LIST, 3432, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_LIST, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_LIST, "Imp. Iniziale Subimp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_FORM, 4, 508, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOINIZSUBI, MyGlb.PANEL_FORM, "Importo Iniziale Subimp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_IMPOINIZSUBI, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_IMPOINIZSUBI, PPQRY_IMPSUBRESIDU, "A.IMPORTO_INIZIALE_SUBIMP", "IMPORTO_INIZIALE_SUBIMP", 3, 14, 2, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_LIST, 3512, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_LIST, 164);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_LIST, "Imp. Attuale Subimp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_FORM, 4, 340, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_IMPOATTUSUBI, MyGlb.PANEL_FORM, "Imp. Attuale Subimp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_IMPOATTUSUBI, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_IMPOATTUSUBI, PPQRY_IMPSUBRESIDU, "A.IMPORTO_ATTUALE_SUBIMP", "IMPORTO_ATTUALE_SUBIMP", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_LIST, 3592, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_LIST, 84);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_LIST, "Disp. Subimp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_FORM, 220, 340, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_FORM, 96);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPSUBIMP, MyGlb.PANEL_FORM, "Disp. Subimp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DISPSUBIMP, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DISPSUBIMP, PPQRY_IMPSUBRESIDU, "A.DISP_SUBIMP", "DISP_SUBIMP", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_LIST, 3672, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_LIST, "Disp. Effettiva Subimp");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_FORM, 4, 364, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DISPEFFESUBI, MyGlb.PANEL_FORM, "Disp. Effettiva Subimp");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DISPEFFESUBI, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DISPEFFESUBI, PPQRY_IMPSUBRESIDU, "A.DISP_EFFETTIVA_SUBIMP", "DISP_EFFETTIVA_SUBIMP", 2, 15, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_LIST, 3760, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_LIST, 128);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_FORM, 4, 388, 448, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_FORM, 48);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_NOTE1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_NOTE1, PPQRY_IMPSUBRESIDU, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_LIST, 3952, 36, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_LIST, 112);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_LIST, "Unità Proponente");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_FORM, 4, 568, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_FORM, 120);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_UNITAPROPON1, MyGlb.PANEL_FORM, "Unità Proponente");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_UNITAPROPON1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_UNITAPROPON1, PPQRY_IMPSUBRESIDU, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_LIST, 4048, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_LIST, 120);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_LIST, "Numero Proposta");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_FORM, 4, 568, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_FORM, 120);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMEROPROPO1, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_NUMEROPROPO1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_NUMEROPROPO1, PPQRY_IMPSUBRESIDU, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 10, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_LIST, 4112, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_LIST, 104);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_LIST, "Anno Proposta");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_FORM, 4, 568, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_FORM, 104);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNOPROPOST1, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ANNOPROPOST1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ANNOPROPOST1, PPQRY_IMPSUBRESIDU, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_LIST, 4180, 36, 68, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_LIST, 60);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_LIST, "Sede Delibera");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_FORM, 4, 568, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_FORM, 60);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_FORM, 2);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_SEDEDEL1, MyGlb.PANEL_FORM, "Sede Delibera");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_SEDEDEL1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_SEDEDEL1, PPQRY_IMPSUBRESIDU, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_LIST, 4248, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_LIST, 80);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_LIST, "Numero Delibera");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_FORM, 4, 568, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_FORM, 80);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_NUMERODEL1, MyGlb.PANEL_FORM, "Num. Delib.");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_NUMERODEL1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_NUMERODEL1, PPQRY_IMPSUBRESIDU, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_LIST, 4312, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_LIST, 64);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_LIST, "Anno Delibera");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_FORM, 4, 568, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_FORM, 64);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_ANNODEL1, MyGlb.PANEL_FORM, "Ann. Del.");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_ANNODEL1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_ANNODEL1, PPQRY_IMPSUBRESIDU, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_LIST, 4380, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_LIST, 88);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_FORM, 4, 592, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_FORM, 88);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOVINCOLO1, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_TIPOVINCOLO1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_TIPOVINCOLO1, PPQRY_IMPSUBRESIDU, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_LIST, 4468, 36, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_LIST, 164);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_LIST, "Descrizione Tipo Vincolo");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_FORM, 4, 616, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_FORM, 164);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOVIN1, MyGlb.PANEL_FORM, "Descrizione Tipo Vincolo");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCTIPOVIN1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCTIPOVIN1, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_TIPO_VINCOLO", "DESCRIZIONE_TIPO_VINCOLO", 5, 50, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_LIST, 4696, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_LIST, 84);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_FORM, 4, 640, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_FORM, 84);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPOAVANZO1, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_TIPOAVANZO1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_TIPOAVANZO1, PPQRY_IMPSUBRESIDU, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_LIST, 4780, 36, 304, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_LIST, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_LIST, "Descrizione Tipo Avanzo");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_FORM, 4, 664, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_FORM, 160);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_DESCTIPOAVA1, MyGlb.PANEL_FORM, "Descrizione Tipo Avanzo");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_DESCTIPOAVA1, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_DESCTIPOAVA1, PPQRY_IMPSUBRESIDU, "A.DESCRIZIONE_TIPO_AVANZO", "DESCRIZIONE_TIPO_AVANZO", 5, 100, 0, -13997);
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_LIST, 372, 256, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_LIST, 48);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_IMPSUBRESIDU.SetRect(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_FORM, 220, 364, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPSUBRESIDU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_FORM, 48);
    PAN_IMPSUBRESIDU.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_IMPSUBRESIDU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPSUBRESIDU_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_IMPSUBRESIDU.SetFieldPage(PFL_IMPSUBRESIDU_TIPO, -1, -1);
    PAN_IMPSUBRESIDU.SetFieldPanel(PFL_IMPSUBRESIDU_TIPO, PPQRY_IMPSUBRESIDU, "A.TIPO", "TIPO", 5, 6, 0, -13997);
  }

  private void PAN_IMPSUBRESIDU_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPSUBRESIDU.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_IMPSUBRESIDU.SetQuery(PPQRY_LOOKCAPIIMPE, 0, SQL, -1, "");
    PAN_IMPSUBRESIDU.SetQueryDB(PPQRY_LOOKCAPIIMPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPSUBRESIDU.SetMasterTable(PPQRY_LOOKCAPIIMPE, "CAP");
    PAN_IMPSUBRESIDU.SetIMDB(IMDB, "PQRY_IMPSUBRESIDU", true);
    PAN_IMPSUBRESIDU.set_SetString(MyGlb.MASTER_ROWNAME, "IMP SUB RESIDUI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE_UO as DESCRIZIONE_UO, ");
    SQL.append("  A.LIVELLO_1 as LIVELLO_1, ");
    SQL.append("  A.MISSIONE as MISSIONE, ");
    SQL.append("  A.DESCRIZIONE_MISSIONE as DESCRIZIONE_MISSIONE, ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.DESCRIZIONE_PROGRAMMA as DESCRIZIONE_PROGRAMMA, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ATTO_IMPEGNO as ATTO_IMPEGNO, ");
    SQL.append("  A.DESCRIZIONE_IMPEGNO as DESCRIZIONE_IMPEGNO, ");
    SQL.append("  A.ANNO_IMP_PROVENIENZA as ANNO_IMP_PROVENIENZA, ");
    SQL.append("  A.NUMERO_IMP_PROVENIENZA as NUMERO_IMP_PROVENIENZA, ");
    SQL.append("  A.REISCR_DA_STANZ as REISCR_DA_STANZ, ");
    SQL.append("  A.IMPORTO_ATTUALE_IMP as IMPORTO_ATTUALE_IMP, ");
    SQL.append("  A.DISP_IMP as DISP_IMP, ");
    SQL.append("  A.DISP_EFFETTIVA_IMP as DISP_EFFETTIVA_IMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.DESCRIZIONE_SUBIMP as DESCRIZIONE_SUBIMP, ");
    SQL.append("  A.ANNO_SUBIMP_PROVENIENZA as ANNO_SUBIMP_PROVENIENZA, ");
    SQL.append("  A.NUMERO_SUBIMP_PROVENIENZA as NUMERO_SUBIMP_PROVENIENZA, ");
    SQL.append("  A.IMPORTO_ATTUALE_SUBIMP as IMPORTO_ATTUALE_SUBIMP, ");
    SQL.append("  A.DISP_SUBIMP as DISP_SUBIMP, ");
    SQL.append("  A.DISP_EFFETTIVA_SUBIMP as DISP_EFFETTIVA_SUBIMP, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.LIVELLO_5_IMP as LIVELLO_5_IMP, ");
    SQL.append("  A.LIVELLO_5_SUBIMP as LIVELLO_5_SUBIMP, ");
    SQL.append("  A.IMPORTO_INIZIALE_IMP as IMPORTO_INIZIALE_IMP, ");
    SQL.append("  A.IMPORTO_INIZIALE_SUBIMP as IMPORTO_INIZIALE_SUBIMP, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.CODICE_BENEFICIARIO as CODICE_BENEFICIARIO, ");
    SQL.append("  A.DESCRIZIONE_BENEFICIARIO as DESCRIZIONE_BENEFICIARIO, ");
    SQL.append("  A.ANNO_ENTRATA_PROVENIENZA as ANNO_ENTRATA_PROVENIENZA, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.DESCRIZIONE_TIPO_VINCOLO as DESCRIZIONE_TIPO_VINCOLO, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.DESCRIZIONE_TIPO_AVANZO as DESCRIZIONE_TIPO_AVANZO ");
    PAN_IMPSUBRESIDU.SetQuery(PPQRY_IMPSUBRESIDU, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  IMP_SUB_RESIDUI A ");
    PAN_IMPSUBRESIDU.SetQuery(PPQRY_IMPSUBRESIDU, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~PQRY_PARAM180.NOMOGGENTSPE~~ = 'S') ");
    SQL.append("and   ((~~PQRY_PARAM180.NOMEOGGESUBI~~ = 'SI') OR ((~~PQRY_PARAM180.NOMEOGGESUBI~~ = 'NO') AND A.TIPO = 'IMP')) ");
    SQL.append("and   ((~~PQRY_PARAM180.NOMEOGGETUTT~~ = 'T') OR ((~~PQRY_PARAM180.NOMEOGGETUTT~~ = 'S') AND A.ANNO_IMP = ~~TBL_DATISESSIONE.SESSIOESERCI~~) OR ((~~PQRY_PARAM180.NOMEOGGETUTT~~ = 'R') AND A.ANNO_IMP < ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    PAN_IMPSUBRESIDU.SetQuery(PPQRY_IMPSUBRESIDU, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPSUBRESIDU.SetQuery(PPQRY_IMPSUBRESIDU, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPSUBRESIDU.SetQuery(PPQRY_IMPSUBRESIDU, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP ");
    PAN_IMPSUBRESIDU.SetQuery(PPQRY_IMPSUBRESIDU, 5, SQL, -1, "");
    PAN_IMPSUBRESIDU.SetQueryDB(PPQRY_IMPSUBRESIDU, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPSUBRESIDU.SetMasterTable(0, "IMP_SUB_RESIDUI");
    PAN_IMPSUBRESIDU.AddToSortList(PFL_IMPSUBRESIDU_CAPITOLO1, true);
    PAN_IMPSUBRESIDU.AddToSortList(PFL_IMPSUBRESIDU_ARTICOLO1, true);
    PAN_IMPSUBRESIDU.AddToSortList(PFL_IMPSUBRESIDU_ANNOIMPEGNO, true);
    PAN_IMPSUBRESIDU.AddToSortList(PFL_IMPSUBRESIDU_NUMEROIMPEGN, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPSUBRESIDU.Status() == 2)
    {
      int oldListQBE = PAN_IMPSUBRESIDU.iUseListQBE;
      PAN_IMPSUBRESIDU.iUseListQBE = 0;
      PAN_IMPSUBRESIDU.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPSUBRESIDU.PanelCommand(Glb.PCM_FIND);
      PAN_IMPSUBRESIDU.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ACCRESIDUI_Init()
  {

    PAN_ACCRESIDUI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCRESIDUI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ACCRESIDUI.SetSize(MyGlb.OBJ_FIELD, 31);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, "3DA4428C-4BF4-46F9-BE55-1723FDB71634");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, "ESERCIZIO");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, 0, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, "922D3C17-ED22-45AA-8940-0E542A6123AD");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, "Capitolo");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, "F554669C-82C9-40CB-8A46-988FD647C4C5");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, "Art.");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, "0FAABA57-9D66-4246-9C68-1AAE56C534CC");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, "Descrizione Capitolo");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, "1AD31B61-A149-44C5-844C-97E4E78FD7BC");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, "PROGR UO");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.VIS_NORMFIELPADR);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, "12A5703C-82EC-4381-A8AF-26B1AC23A164");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, "Descr. UO");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, "5BDF69BF-1BAD-4392-9290-21620A29FDA9");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, "Titolo");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, "A7D8E17C-7B86-4384-94AF-7788B54114BD");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, "Tipologia");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, "7AD36765-60E4-4F7D-8BAB-1C6D21F6ACDD");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, "Decrizione Tipologia");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, "25B15BD3-22DC-41BA-817A-887809B3C806");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, "Categoria");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, "F810302A-609E-462D-9464-E75AA0BAE06C");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, "Cod. V liv.");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, "970CFA69-3E53-4890-A902-695B1A4143B2");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, "Numero Acc.");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, "43823F43-EE77-4860-B3E5-F623ECA39D2E");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, "Anno Acc.");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, "D792CB91-C172-4B75-825A-5935B4BF5DE6");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, "Atto Accertamento");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, "5794F3D9-E604-4700-A1E6-09668CAC0F34");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, "Descrizione Accertamento");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, "46E73A10-F94B-4DB2-B684-6B9ECAE9965B");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, "Cod. Debitore");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, "52B74F4F-8BDE-4BE3-96D5-E6BF8EB1AA45");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, "Ragione Sociale Debitore");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, "2697D04E-EB43-4BBC-9D94-49091481BAA1");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, "Importo Iniziale");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, "63FBA63A-9D1E-424F-8D48-05BF93795882");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, "Importo Attuale");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, "5B772A17-0B97-4C7F-8973-F36571733694");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, "Disponibilità");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, "FD330FB1-6AB2-46F2-A7BC-3E0E0261797E");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, "Note");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, "FA024728-015A-4BBD-A5FF-E6202017807C");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, "Unità Proponente");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, "F58C8EE0-02C8-4DF7-A160-9C120CDB94FE");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, "Numero Proposta");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, "65F6B4D2-F14E-4F4B-8873-2B78F8422176");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, "Anno Proposta");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, "F03BC4C9-994F-48BC-B6CA-0B61AF55A429");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, "Sede Delibera");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, "Descrivi il contenuto del campo");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, "1CA0FD07-D304-4389-A1FB-EC7254AE4781");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, "Numero Delibera");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, "4CF8AE8D-CABE-4CD8-BDC8-59895B4E4974");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, "Anno Delibera");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, "E3898672-7F87-4A0B-8540-7947E3CD80A4");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, "Tipo vincolo");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, "61E6AAD3-3713-4F6A-AD46-37AEB09D847A");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, "Descrizione Tipo Vincolo");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, "D0CA4281-B90A-4FC2-86AE-D44CF9F3282E");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, "Tipo Avanzo");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCRESIDUI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, "B3BDB0F7-CE55-4D0C-A1CD-ACF4EA88C469");
    PAN_ACCRESIDUI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, "Descrizione Tipo Avanzo");
    PAN_ACCRESIDUI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, "");
    PAN_ACCRESIDUI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCRESIDUI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_ACCRESIDUI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_ESERCIZIO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_ESERCIZIO, PPQRY_ACCRESIDUI, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_FORM, 188, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_CAPITOLO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_CAPITOLO, PPQRY_ACCRESIDUI, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_LIST, 116, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_FORM, 404, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_ARTICOLO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_ARTICOLO, PPQRY_ACCRESIDUI, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 148, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 412, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_CAPDESCRIZIO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_CAPDESCRIZIO, PPQRY_LOOKCAPIACCE, "A.DESCRIZIONE", "NOMOGGCAPDES", 5, 140, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_LIST, 384, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_LIST, 68);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_LIST, "PR. UO");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_PROGRUO, MyGlb.PANEL_FORM, "PROGR UO");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_PROGRUO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_PROGRUO, PPQRY_ACCRESIDUI, "A.PROGR_UO", "PROGR_UO", 1, 8, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_LIST, 340, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_LIST, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_LIST, "Descr. UO");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 52, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIZIONUO, MyGlb.PANEL_FORM, "Descr. UO");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_DESCRIZIONUO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_DESCRIZIONUO, PPQRY_ACCRESIDUI, "A.DESCRIZIONE_UO", "DESCRIZIONE_UO", 5, 4000, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_LIST, 536, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_LIST, 56);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_LIST, "Titolo");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_FORM, 4, 340, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_FORM, 56);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO1, MyGlb.PANEL_FORM, "Titolo");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_LIVELLO1, -1, -1);
    PAN_ACCRESIDUI.SetFieldUnbound(PFL_ACCRESIDUI_LIVELLO1, true);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_LIVELLO1, PPQRY_ACCRESIDUI, "SUBSTR(A.LIVELLO_4, 1, 1)", "ACCRESILIVE1", 5, 99, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_LIST, 592, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_LIST, 72);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_LIST, "Tipologia");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_FORM, 4, 100, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOLOGIA, MyGlb.PANEL_FORM, "Tipologia");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_TIPOLOGIA, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_TIPOLOGIA, PPQRY_ACCRESIDUI, "A.TIPOLOGIA", "TIPOLOGIA", 5, 21, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_LIST, 652, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_LIST, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_LIST, "Decrizione Tipologia");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_FORM, 4, 124, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DECRIZTIPOLO, MyGlb.PANEL_FORM, "Decrizione Tipologia");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_DECRIZTIPOLO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_DECRIZTIPOLO, PPQRY_ACCRESIDUI, "A.DESCRIZIONE_TIPOLOGIA", "DESCRIZIONE_TIPOLOGIA", 5, 140, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_LIST, 844, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_LIST, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_LIST, "Categoria");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_FORM, 4, 76, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO4, MyGlb.PANEL_FORM, "Categoria");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_LIVELLO4, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_LIVELLO4, PPQRY_ACCRESIDUI, "A.LIVELLO_4", "LIVELLO_4", 5, 4000, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_LIST, 908, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_LIST, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_LIST, "Cod. V liv.");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_FORM, 4, 364, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_FORM, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_LIVELLO5, MyGlb.PANEL_FORM, "Cod. V liv.");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_LIVELLO5, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_LIVELLO5, PPQRY_ACCRESIDUI, "A.LIVELLO_5", "LIVELLO_5", 1, 10, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_LIST, 1020, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_LIST, 80);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_LIST, "Numero Acc.");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROACC, MyGlb.PANEL_FORM, "Numero Acc.");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_NUMEROACC, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_NUMEROACC, PPQRY_ACCRESIDUI, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_LIST, 1072, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_LIST, "Anno Acc.");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOACC, MyGlb.PANEL_FORM, "Anno Acc.");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_ANNOACC, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_ANNOACC, PPQRY_ACCRESIDUI, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_LIST, 1112, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_LIST, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_LIST, "Atto Accertamento");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_FORM, 4, 196, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ATTOACCERTAM, MyGlb.PANEL_FORM, "Atto Accertamento");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_ATTOACCERTAM, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_ATTOACCERTAM, PPQRY_ACCRESIDUI, "A.ATTO_ACCERTAMENTO", "ATTO_ACCERTAMENTO", 5, 337, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_LIST, 1248, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_LIST, 176);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_LIST, "Descrizione Accertamento");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_FORM, 4, 220, 480, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCRIACCERT, MyGlb.PANEL_FORM, "Descrizione Accertamento");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_DESCRIACCERT, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_DESCRIACCERT, PPQRY_ACCRESIDUI, "A.DESCRIZIONE_ACCERTAMENTO", "DESCRIZIONE_ACCERTAMENTO", 5, 140, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_LIST, 1432, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_LIST, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_LIST, "Cod. Debitore");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_FORM, 4, 448, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_FORM, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DEBITORE, MyGlb.PANEL_FORM, "Cod Debit.");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_DEBITORE, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_DEBITORE, PPQRY_ACCRESIDUI, "A.DEBITORE", "DEBITORE", 1, 9, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_LIST, 1496, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_LIST, 168);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_LIST, "Ragione Sociale Debitore");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_FORM, 4, 448, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_FORM, 168);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_RAGISOCIDEBI, MyGlb.PANEL_FORM, "Ragione Sociale Debitore");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_RAGISOCIDEBI, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_RAGISOCIDEBI, PPQRY_ACCRESIDUI, "A.RAGIONE_SOCIALE_DEBITORE", "RAGIONE_SOCIALE_DEBITORE", 5, 60, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_LIST, 1804, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_LIST, 116);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_LIST, "Importo Iniziale");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_FORM, 4, 388, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_FORM, 116);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTINIZIA, MyGlb.PANEL_FORM, "Importo Iniziale");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_IMPORTINIZIA, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_IMPORTINIZIA, PPQRY_ACCRESIDUI, "A.IMPORTO_INIZIALE", "IMPORTO_INIZIALE", 3, 14, 2, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_LIST, 1908, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_LIST, 116);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_LIST, "Importo Attuale");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_FORM, 4, 244, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_IMPORTATTUAL, MyGlb.PANEL_FORM, "Importo Attuale");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_IMPORTATTUAL, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_IMPORTATTUAL, PPQRY_ACCRESIDUI, "A.IMPORTO_ATTUALE", "IMPORTO_ATTUALE", 2, 15, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_LIST, 2012, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_LIST, 96);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_FORM, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_DISPONIBILIT, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_DISPONIBILIT, PPQRY_ACCRESIDUI, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_LIST, 2116, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_LIST, 128);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_FORM, 4, 292, 448, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_FORM, 48);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_NOTE, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_NOTE, PPQRY_ACCRESIDUI, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_LIST, 2316, 36, 84, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità Proponente");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 448, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_FORM, 120);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_UNITAPROPONE, MyGlb.PANEL_FORM, "Unità Proponente");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_UNITAPROPONE, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_UNITAPROPONE, PPQRY_ACCRESIDUI, "A.UNITA_PROPONENTE", "UNITA_PROPONENTE", 5, 255, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_LIST, 2400, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_LIST, "Numero Proposta");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 448, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_FORM, 120);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_NUMEROPROPOS, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_NUMEROPROPOS, PPQRY_ACCRESIDUI, "A.NUMERO_PROPOSTA", "NUMERO_PROPOSTA", 1, 10, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 2468, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Anno Proposta");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 448, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_ANNOPROPOSTA, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_ANNOPROPOSTA, PPQRY_ACCRESIDUI, "A.ANNO_PROPOSTA", "ANNO_PROPOSTA", 1, 4, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_LIST, 2536, 36, 68, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_LIST, "Sede Delibera");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_FORM, 4, 448, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_FORM, 2);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_SEDEDEL, MyGlb.PANEL_FORM, "Sede Delibera");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_SEDEDEL, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_SEDEDEL, PPQRY_ACCRESIDUI, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_LIST, 2604, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_LIST, "Numero Delibera");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_FORM, 4, 448, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_NUMERODEL, MyGlb.PANEL_FORM, "Num. Delib.");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_NUMERODEL, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_NUMERODEL, PPQRY_ACCRESIDUI, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_LIST, 2668, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_LIST, "Anno Delibera");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_FORM, 4, 448, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_ANNODEL, MyGlb.PANEL_FORM, "Ann. Del.");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_ANNODEL, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_ANNODEL, PPQRY_ACCRESIDUI, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_LIST, 2732, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_LIST, 88);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo vincolo");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 448, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_FORM, 88);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo vincolo");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_TIPOVINCOLO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_TIPOVINCOLO, PPQRY_ACCRESIDUI, "A.TIPO_VINCOLO", "TIPO_VINCOLO", 1, 6, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_LIST, 2820, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_LIST, 164);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_LIST, "Descrizione Tipo Vincolo");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_FORM, 4, 472, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_FORM, 164);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOVINC, MyGlb.PANEL_FORM, "Descrizione Tipo Vincolo");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_DESCTIPOVINC, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_DESCTIPOVINC, PPQRY_ACCRESIDUI, "A.DESCRIZIONE_TIPO_VINCOLO", "DESCRIZIONE_TIPO_VINCOLO", 5, 50, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_LIST, 3060, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_FORM, 4, 496, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_TIPOAVANZO, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_TIPOAVANZO, PPQRY_ACCRESIDUI, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_LIST, 3144, 36, 348, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_LIST, 160);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_LIST, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_LIST, "Descrizione Tipo Avanzo");
    PAN_ACCRESIDUI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_FORM, 4, 520, 672, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCRESIDUI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_FORM, 160);
    PAN_ACCRESIDUI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_FORM, 1);
    PAN_ACCRESIDUI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCRESIDUI_DESCTIPOAVAN, MyGlb.PANEL_FORM, "Descrizione Tipo Avanzo");
    PAN_ACCRESIDUI.SetFieldPage(PFL_ACCRESIDUI_DESCTIPOAVAN, -1, -1);
    PAN_ACCRESIDUI.SetFieldPanel(PFL_ACCRESIDUI_DESCTIPOAVAN, PPQRY_ACCRESIDUI, "A.DESCRIZIONE_TIPO_AVANZO", "DESCRIZIONE_TIPO_AVANZO", 5, 100, 0, -13997);
  }

  private void PAN_ACCRESIDUI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCRESIDUI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as NOMOGGCAPDES ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.E_S = 'E') ");
    SQL.append("and   (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_ACCRESIDUI.SetQuery(PPQRY_LOOKCAPIACCE, 0, SQL, -1, "");
    PAN_ACCRESIDUI.SetQueryDB(PPQRY_LOOKCAPIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCRESIDUI.SetMasterTable(PPQRY_LOOKCAPIACCE, "CAP");
    PAN_ACCRESIDUI.SetIMDB(IMDB, "PQRY_ACCRESIDUI", true);
    PAN_ACCRESIDUI.set_SetString(MyGlb.MASTER_ROWNAME, "ACC RESIDUI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.PROGR_UO as PROGR_UO, ");
    SQL.append("  A.DESCRIZIONE_UO as DESCRIZIONE_UO, ");
    SQL.append("  A.LIVELLO_4 as LIVELLO_4, ");
    SQL.append("  A.TIPOLOGIA as TIPOLOGIA, ");
    SQL.append("  A.DESCRIZIONE_TIPOLOGIA as DESCRIZIONE_TIPOLOGIA, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ATTO_ACCERTAMENTO as ATTO_ACCERTAMENTO, ");
    SQL.append("  A.DESCRIZIONE_ACCERTAMENTO as DESCRIZIONE_ACCERTAMENTO, ");
    SQL.append("  A.IMPORTO_ATTUALE as IMPORTO_ATTUALE, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  SUBSTR(A.LIVELLO_4, 1, 1) as ACCRESILIVE1, ");
    SQL.append("  A.LIVELLO_5 as LIVELLO_5, ");
    SQL.append("  A.IMPORTO_INIZIALE as IMPORTO_INIZIALE, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.NUMERO_PROPOSTA as NUMERO_PROPOSTA, ");
    SQL.append("  A.ANNO_PROPOSTA as ANNO_PROPOSTA, ");
    SQL.append("  A.UNITA_PROPONENTE as UNITA_PROPONENTE, ");
    SQL.append("  A.DEBITORE as DEBITORE, ");
    SQL.append("  A.RAGIONE_SOCIALE_DEBITORE as RAGIONE_SOCIALE_DEBITORE, ");
    SQL.append("  A.TIPO_VINCOLO as TIPO_VINCOLO, ");
    SQL.append("  A.DESCRIZIONE_TIPO_VINCOLO as DESCRIZIONE_TIPO_VINCOLO, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.DESCRIZIONE_TIPO_AVANZO as DESCRIZIONE_TIPO_AVANZO ");
    PAN_ACCRESIDUI.SetQuery(PPQRY_ACCRESIDUI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ACC_RESIDUI A ");
    PAN_ACCRESIDUI.SetQuery(PPQRY_ACCRESIDUI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (~~PQRY_PARAM180.NOMOGGENTSPE~~ = 'E') ");
    SQL.append("and   ((~~PQRY_PARAM180.NOMEOGGETUTT~~ = 'T') OR ((~~PQRY_PARAM180.NOMEOGGETUTT~~ = 'S') AND A.ANNO_ACC = ~~TBL_DATISESSIONE.SESSIOESERCI~~) OR ((~~PQRY_PARAM180.NOMEOGGETUTT~~ = 'R') AND A.ANNO_ACC < ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    PAN_ACCRESIDUI.SetQuery(PPQRY_ACCRESIDUI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCRESIDUI.SetQuery(PPQRY_ACCRESIDUI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ACCRESIDUI.SetQuery(PPQRY_ACCRESIDUI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_ACCRESIDUI.SetQuery(PPQRY_ACCRESIDUI, 5, SQL, -1, "");
    PAN_ACCRESIDUI.SetQueryDB(PPQRY_ACCRESIDUI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCRESIDUI.SetMasterTable(0, "ACC_RESIDUI");
    PAN_ACCRESIDUI.AddToSortList(PFL_ACCRESIDUI_CAPITOLO, true);
    PAN_ACCRESIDUI.AddToSortList(PFL_ACCRESIDUI_ARTICOLO, true);
    PAN_ACCRESIDUI.AddToSortList(PFL_ACCRESIDUI_ANNOACC, true);
    PAN_ACCRESIDUI.AddToSortList(PFL_ACCRESIDUI_NUMEROACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCRESIDUI.Status() == 2)
    {
      int oldListQBE = PAN_ACCRESIDUI.iUseListQBE;
      PAN_ACCRESIDUI.iUseListQBE = 0;
      PAN_ACCRESIDUI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCRESIDUI.PanelCommand(Glb.PCM_FIND);
      PAN_ACCRESIDUI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IMPSUBRESIDU) PAN_IMPSUBRESIDU_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ACCRESIDUI) PAN_ACCRESIDUI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_IMPSUBRESIDU) PAN_IMPSUBRESIDU_ValidateRow(Cancel);
    if (SrcObj == PAN_ACCRESIDUI) PAN_ACCRESIDUI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_IMPSUBRESIDU) PAN_IMPSUBRESIDU_DynamicProperties();
    if (SrcObj == PAN_ACCRESIDUI) PAN_ACCRESIDUI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IMPSUBRESIDU) PAN_IMPSUBRESIDU_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ACCRESIDUI) PAN_ACCRESIDUI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPSUBRESIDU) PAN_IMPSUBRESIDU_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_ACCRESIDUI) PAN_ACCRESIDUI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IMPSUBRESIDU) PAN_IMPSUBRESIDU_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ACCRESIDUI) PAN_ACCRESIDUI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
