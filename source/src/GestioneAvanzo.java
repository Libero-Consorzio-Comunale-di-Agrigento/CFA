// **********************************************
// Gestione Avanzo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GestioneAvanzo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ESERCIZIO1 = 0;
  private static int PFL_PARAMETRI_SOLORIGHREGI = 1;
  private static int PFL_PARAMETRI_ETICLABEMODI = 2;

  private static int PPQRY_PARAMETRI655 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_PARAMETRI;
  OTabView TAB_TABBEDVIEW;
  private static int GRP_SPESA_IMPEGNO1 = 0;
  private static int GRP_SPESA_BILANCIO1 = 1;

  private static int PFL_SPESA_ESERCIZIO2 = 0;
  private static int PFL_SPESA_TIPORIGA1 = 1;
  private static int PFL_SPESA_CODICERIGA1 = 2;
  private static int PFL_SPESA_ES1 = 3;
  private static int PFL_SPESA_ANNOVAR1 = 4;
  private static int PFL_SPESA_TITOLO1 = 5;
  private static int PFL_SPESA_CAPITOORIGI1 = 6;
  private static int PFL_SPESA_ARTICOORIGI1 = 7;
  private static int PFL_SPESA_APRICAPIORI1 = 8;
  private static int PFL_SPESA_CAPDESCRIZI1 = 9;
  private static int PFL_SPESA_NUMEROIMPAC1 = 10;
  private static int PFL_SPESA_ANNOIMPACC1 = 11;
  private static int PFL_SPESA_INFOIMPEGNO = 12;
  private static int PFL_SPESA_IMPDESCRIZIO = 13;
  private static int PFL_SPESA_IMPORTVARIA1 = 14;
  private static int PFL_SPESA_CKGESTIAVAN1 = 15;
  private static int PFL_SPESA_IMPORTAVANZ1 = 16;
  private static int PFL_SPESA_IMPORTBILAN1 = 17;
  private static int PFL_SPESA_ESDESTINAZI1 = 18;
  private static int PFL_SPESA_CAPITODESTI1 = 19;
  private static int PFL_SPESA_ARTICODESTI1 = 20;
  private static int PFL_SPESA_APRICAPIBIL1 = 21;
  private static int PFL_SPESA_NOTE1 = 22;
  private static int PFL_SPESA_TIPOAVANZO1 = 23;
  private static int PFL_SPESA_DESCRIZIONU1 = 24;
  private static int PFL_SPESA_TIPOVINCOLO1 = 25;
  private static int PFL_SPESA_FINANZIAMEN1 = 26;
  private static int PFL_SPESA_OPERA1 = 27;
  private static int PFL_SPESA_RIGAAVANZO1 = 28;
  private static int PFL_SPESA_STATO1 = 29;
  private static int PFL_SPESA_IMPOAVANINI1 = 30;
  private static int PFL_SPESA_PRIMOANNO1 = 31;
  private static int PFL_SPESA_MODIFICABIL1 = 32;
  private static int PFL_SPESA_ORDINAMENTO2 = 33;
  private static int PFL_SPESA_SESSIONE1 = 34;
  private static int PFL_SPESA_DATAREG1 = 35;
  private static int PFL_SPESA_SOMMDIIMPAV1 = 36;
  private static int PFL_SPESA_SOMMDIIMPBI1 = 37;
  private static int PFL_SPESA_ETICHETSALD1 = 38;
  private static int PFL_SPESA_SALDO1 = 39;
  private static int PFL_SPESA_PROGRUO1 = 40;
  private static int PFL_SPESA_PROGRESSIVO1 = 41;

  private static int PPQRY_WRKGESTIAVA1 = 0;

  private static int PPQRY_CAP1 = 1;
  private static int PPQRY_DUAL1 = 2;
  private static int PPQRY_IMP = 3;
  private static int PPQRY_IMPUO = 4;
  private static int PPQRY_VINCOLI1 = 5;

  private static int PPQRY_TIPIAVANZO1 = 6;
  private static int PPQRY_FINANZIAMEN1 = 7;
  private static int PPQRY_OPERE1 = 8;


  IDPanel PAN_SPESA;
  private static int GRP_ENTRATA_ACCERTAMENTO = 0;
  private static int GRP_ENTRATA_BILANCIO = 1;

  private static int PFL_ENTRATA_ESERCIZIO = 0;
  private static int PFL_ENTRATA_TIPORIGA = 1;
  private static int PFL_ENTRATA_CODICERIGA = 2;
  private static int PFL_ENTRATA_ES = 3;
  private static int PFL_ENTRATA_ANNOVAR = 4;
  private static int PFL_ENTRATA_TITOLO = 5;
  private static int PFL_ENTRATA_CAPITOORIGIN = 6;
  private static int PFL_ENTRATA_ARTICOORIGIN = 7;
  private static int PFL_ENTRATA_APRICAPIORIG = 8;
  private static int PFL_ENTRATA_CAPDESCRIZIO = 9;
  private static int PFL_ENTRATA_NUMEROIMPACC = 10;
  private static int PFL_ENTRATA_ANNOIMPACC = 11;
  private static int PFL_ENTRATA_INFOACC = 12;
  private static int PFL_ENTRATA_ACCDESCRIZIO = 13;
  private static int PFL_ENTRATA_IMPORTVARIAZ = 14;
  private static int PFL_ENTRATA_CKGESTIAVANZ = 15;
  private static int PFL_ENTRATA_IMPORTAVANZO = 16;
  private static int PFL_ENTRATA_IMPORTBILANC = 17;
  private static int PFL_ENTRATA_ESDESTINAZIO = 18;
  private static int PFL_ENTRATA_CAPITODESTIN = 19;
  private static int PFL_ENTRATA_ARTICODESTIN = 20;
  private static int PFL_ENTRATA_APRICAPIBILA = 21;
  private static int PFL_ENTRATA_NOTE = 22;
  private static int PFL_ENTRATA_TIPOAVANZO = 23;
  private static int PFL_ENTRATA_DESCRIZIONUO = 24;
  private static int PFL_ENTRATA_TIPOVINCOLO = 25;
  private static int PFL_ENTRATA_FINANZIAMENT = 26;
  private static int PFL_ENTRATA_OPERA = 27;
  private static int PFL_ENTRATA_RIGAAVANZO = 28;
  private static int PFL_ENTRATA_STATO = 29;
  private static int PFL_ENTRATA_IMPOAVANINIZ = 30;
  private static int PFL_ENTRATA_PRIMOANNO = 31;
  private static int PFL_ENTRATA_MODIFICABILE = 32;
  private static int PFL_ENTRATA_ORDINAMENTO1 = 33;
  private static int PFL_ENTRATA_SESSIONE = 34;
  private static int PFL_ENTRATA_DATAREG = 35;
  private static int PFL_ENTRATA_SOMMDIIMPAVA = 36;
  private static int PFL_ENTRATA_SOMMDIIMPBIL = 37;
  private static int PFL_ENTRATA_ETICHETSALDO = 38;
  private static int PFL_ENTRATA_SALDO = 39;
  private static int PFL_ENTRATA_PROGRUO = 40;
  private static int PFL_ENTRATA_PROGRESSIVO = 41;

  private static int PPQRY_WRKGESTIAVAN = 0;

  private static int PPQRY_CAP = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_ACC = 3;
  private static int PPQRY_ACCUO = 4;
  private static int PPQRY_VINCOLI = 5;

  private static int PPQRY_TIPIAVANZO = 6;
  private static int PPQRY_FINANZIAMENT = 7;
  private static int PPQRY_OPERE = 8;


  IDPanel PAN_ENTRATA;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO16 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI656(IMDB);
    //
    //
    Init_PQRY_PARAMETRI655(IMDB);
    Init_PQRY_PARAMETRI655_RS(IMDB);
    Init_PQRY_WRKGESTIAVA1(IMDB);
    Init_PQRY_WRKGESTIAVAN(IMDB);
    Init_PQRY_NOTEFUNZIO16(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI656(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI656, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI656, "TBL_PARAMETRI656");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI656,IMDBDef4.FLD_PARAMETRI656_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI656,IMDBDef4.FLD_PARAMETRI656_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI656,IMDBDef4.FLD_PARAMETRI656_PARSOLRIGREG, "PARSOLRIGREG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI656,IMDBDef4.FLD_PARAMETRI656_PARSOLRIGREG,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI656,IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, "PARALOOUPCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI656,IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP,5,50,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI656, 0);
  }

  private static void Init_PQRY_PARAMETRI655(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI655, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI655, "PQRY_PARAMETRI655");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI655,IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI655,IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI655,IMDBDef12.PQSL_PARAMETRI655_PARSOLRIGREG, "PARSOLRIGREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI655,IMDBDef12.PQSL_PARAMETRI655_PARSOLRIGREG,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI655, 0);
  }

  private static void Init_PQRY_PARAMETRI655_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI655_RS, 2);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI655_RS, "PQRY_PARAMETRI655_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI655_RS,IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI655_RS,IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI655_RS,IMDBDef12.PQSL_PARAMETRI655_PARSOLRIGREG, "PARSOLRIGREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI655_RS,IMDBDef12.PQSL_PARAMETRI655_PARSOLRIGREG,5,2,0);
  }

  private static void Init_PQRY_WRKGESTIAVA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_WRKGESTIAVA1, 31);
    IMDB.set_TblCode(IMDBDef12.PQRY_WRKGESTIAVA1, "PQRY_WRKGESTIAVA1");
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ORDINAMENTO1, "ORDINAMENTO1");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ORDINAMENTO1,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, "TIPO_RIGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, "CODICE_RIGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA,5,50,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_TITOLO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE, "CAPITOLO_ORIGINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE, "ARTICOLO_ORIGINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_VARIAZIONE, "IMPORTO_VARIAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_VARIAZIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO, "CK_GESTIONE_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, "IMPORTO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO_INIZIALE, "IMPORTO_AVANZO_INIZIALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_BILANCIO, "IMPORTO_BILANCIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_BILANCIO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_E_S_DESTINAZIONE, "E_S_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_E_S_DESTINAZIONE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_DESTINAZIONE, "CAPITOLO_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_DESTINAZIONE,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_DESTINAZIONE, "ARTICOLO_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_DESTINAZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_STATO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_PRIMO_ANNO, "PRIMO_ANNO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_PRIMO_ANNO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_MODIFICABILE, "MODIFICABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_MODIFICABILE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_RIGAAVANZO, "RIGAAVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_RIGAAVANZO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_PROGRUO, "PROGRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_PROGRUO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVA1,IMDBDef12.PQSL_WRKGESTIAVA1_FINANZIAMENTO,1,5,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_WRKGESTIAVA1, 0);
  }

  private static void Init_PQRY_WRKGESTIAVAN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_WRKGESTIAVAN, 31);
    IMDB.set_TblCode(IMDBDef12.PQRY_WRKGESTIAVAN, "PQRY_WRKGESTIAVAN");
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ORDINAMENTO1, "ORDINAMENTO1");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ORDINAMENTO1,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_SESSIONE, "SESSIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, "TIPO_RIGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, "CODICE_RIGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA,5,50,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_TITOLO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE, "CAPITOLO_ORIGINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE, "ARTICOLO_ORIGINE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ANNO_IMPACC, "ANNO_IMPACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ANNO_IMPACC,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_NUMERO_IMPACC, "NUMERO_IMPACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_NUMERO_IMPACC,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ANNO_VAR, "ANNO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ANNO_VAR,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_VARIAZIONE, "IMPORTO_VARIAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_VARIAZIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO, "CK_GESTIONE_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, "IMPORTO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE, "IMPORTO_AVANZO_INIZIALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_BILANCIO, "IMPORTO_BILANCIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_BILANCIO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_E_S_DESTINAZIONE, "E_S_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_E_S_DESTINAZIONE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_DESTINAZIONE, "CAPITOLO_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_DESTINAZIONE,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_DESTINAZIONE, "ARTICOLO_DESTINAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_DESTINAZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_NOTE, "NOTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_NOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_STATO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_PRIMO_ANNO, "PRIMO_ANNO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_PRIMO_ANNO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_MODIFICABILE, "MODIFICABILE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_MODIFICABILE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_RIGAAVANZO, "RIGAAVANZO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_RIGAAVANZO,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_DATA_REG, "DATA_REG");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_PROGRUO, "PROGRUO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_PROGRUO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGESTIAVAN,IMDBDef12.PQSL_WRKGESTIAVAN_OPERA,1,5,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_WRKGESTIAVAN, 0);
  }

  private static void Init_PQRY_NOTEFUNZIO16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_NOTEFUNZIO16, 4);
    IMDB.set_TblCode(IMDBDef12.PQRY_NOTEFUNZIO16, "PQRY_NOTEFUNZIO16");
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_NOTEFUNZIO16,IMDBDef12.PQSL_NOTEFUNZIO16_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_NOTEFUNZIO16, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GestioneAvanzo(MyWebEntryPoint w, IMDBObj imdb)
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
  public GestioneAvanzo()
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
    FormIdx = MyGlb.FRM_GESTIOAVANZO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "BEEAC97F-E580-4FC4-AEE7-D95957B4930D";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 772;
    DesignHeight = 518;
    set_Caption(new IDVariant("Gestione Avanzo"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 772;
    Frames[1].Height = 492;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0650407;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 772;
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
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1934B28D-3707-4D5A-9EE7-1D588E6C9266");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 212, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 772;
    Frames[3].Height = 460;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.878261;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 772;
    Frames[4].Height = 404;
    Frames[4].Caption = "Tabbed View";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 404;
    TAB_TABBEDVIEW = new OTabView(this);
    Frames[4].Content = TAB_TABBEDVIEW;
    TAB_TABBEDVIEW.iGuid = "805078D5-80EA-49F0-879D-5FD4B039D75F";
    TAB_TABBEDVIEW.SetItemCount(2);
    TAB_TABBEDVIEW.Placement = 1;
    TAB_TABBEDVIEW.FrIndex = 4;
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[5].InTabbed = true;
    Frames[5].Caption = "Spesa";
    Frames[5].Parent = this;
    PAN_SPESA = new IDPanel(w, this, 5, "PAN_SPESA");
    Frames[5].Content = PAN_SPESA;
    PAN_SPESA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SPESA.VS = MainFrm.VisualStyleList;
    PAN_SPESA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AB1BE95E-B455-4438-B97B-495A72013E72");
    PAN_SPESA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2500, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SPESA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SPESA.InitStatus = 2;
    PAN_SPESA_Init();
    PAN_SPESA_InitFields();
    PAN_SPESA_InitQueries();
    TAB_TABBEDVIEW.SetItem(1, Frames[5], 0, "", "Spesa", "");
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[6].InTabbed = true;
    Frames[6].Caption = "Entrata";
    Frames[6].Parent = this;
    PAN_ENTRATA = new IDPanel(w, this, 6, "PAN_ENTRATA");
    Frames[6].Content = PAN_ENTRATA;
    PAN_ENTRATA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ENTRATA.VS = MainFrm.VisualStyleList;
    PAN_ENTRATA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CAB9A058-84E5-43A0-ABDB-7E8656E85B9D");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2500, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ENTRATA.InitStatus = 2;
    PAN_ENTRATA_Init();
    PAN_ENTRATA_InitFields();
    PAN_ENTRATA_InitQueries();
    TAB_TABBEDVIEW.SetItem(2, Frames[6], 0, "", "Entrata", "");
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[3].ChildFrame2 = Frames[7];
    Frames[7].Width = 772;
    Frames[7].Height = 56;
    Frames[7].FrHidden = true;
    Frames[7].Caption = "NOTE FUNZIONALITA";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 56;
    Frames[7].MinHeight = Frames[7].Height;
    Frames[7].MaxHeight = Frames[7].Height;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 7, "PAN_NOTEFUNZIONA");
    Frames[7].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CD45FA27-BC61-4D2C-BF48-DE4B03311302");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_ELIMINA9+BaseCmdLinIdx)
      {
        EliminaSpesa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMGESTAVA1+BaseCmdLinIdx)
      {
        StampaGestioneAvanzoSpesa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG192+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZAGGISPE2+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG192+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_IMPOSTAVANZ1+BaseCmdLinIdx)
      {
        ImpostaGestioneAvanzoSpesa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COPIAVASUBI1+BaseCmdLinIdx)
      {
        CopiaAvanzoSuBilancioSpesa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINA10+BaseCmdLinIdx)
      {
        EliminaEntrata();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STAMGESTAVAN+BaseCmdLinIdx)
      {
        StampaGestioneAvanzoEntrata();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG193+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZAGGIENT2+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG193+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_IMPOSTAVANZO+BaseCmdLinIdx)
      {
        ImpostaGestioneAvanzoEntrata();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COPIAVASUBIL+BaseCmdLinIdx)
      {
        CopiaAvanzoSuBilancioEntrata();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI656, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GESTIOAVANZO_PARAMETRI655();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_SPESA.UpdatePanel(MainFrm);
      PAN_ENTRATA.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_SPESA.FrIndex)
    {
      if (IdxFieldActived ==PFL_SPESA_APRICAPIORI1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_SPESA.FrIndex)
    {
      if (IdxFieldActived ==PFL_SPESA_APRICAPIBIL1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_ENTRATA.FrIndex)
    {
      if (IdxFieldActived ==PFL_ENTRATA_APRICAPIORIG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_ENTRATA.FrIndex)
    {
      if (IdxFieldActived ==PFL_ENTRATA_APRICAPIBILA) {
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
    return (obj instanceof GestioneAvanzo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GestioneAvanzo.class.getName() : (Glb.ClassWithPackage(GestioneAvanzo.class) ? GestioneAvanzo.class.getName().substring(GestioneAvanzo.class.getPackage().getName().length() + 1) : GestioneAvanzo.class.getName()));
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      PAN_SPESA.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_SPESA.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_SPESA.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ENTRATA.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_ENTRATA.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ENTRATA.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.CARICAGESTIONEAVANZO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, (new IDVariant()));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)>0)
      {
        PAN_SPESA.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_ENTRATA.set_Locked((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_SPESA.set_Locked((new IDVariant(0)).booleanValue());
        PAN_ENTRATA.set_Locked((new IDVariant(0)).booleanValue());
      }
      PAN_SPESA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SPESA.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ENTRATA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ENTRATA.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "Load", _e);
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.booleanValue())
      {
        if (new IDVariant(TAB_TABBEDVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_SPESA.FrIndex)), true))
        {
          if (IMDB.Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0).equals((new IDVariant("Origine")), true))
          {
            if (!(ControlliCapitoloOrigine(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_E_S, 0), IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0), IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0))))
            {
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TITOLO, 0, (new IDVariant()));
            }
          }
          else if (IMDB.Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0).equals((new IDVariant("Bilancio")), true))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_DESTINAZIONE, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_DESTINAZIONE, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
          }
        }
        else
        {
          if (IMDB.Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0).equals((new IDVariant("Origine")), true))
          {
            if (!(ControlliCapitoloOrigine(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_E_S, 0), IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0), IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0))))
            {
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TITOLO, 0, (new IDVariant()));
            }
          }
          else if (IMDB.Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0).equals((new IDVariant("Bilancio")), true))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_DESTINAZIONE, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_DESTINAZIONE, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
          }
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_UNITAORGANIZ)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = IDL.Add((new IDVariant("=")), IMDB.Value(IMDBDef7.PQRY_SO4ANAUNIORG, IMDBDef7.PQSL_SO4ANAUNIORG_SOANUNORCOUO, 0));
        if (new IDVariant(TAB_TABBEDVIEW.SelectedPageIndex()).equals((new IDVariant(PAN_SPESA.FrIndex)), true))
        {
          PAN_SPESA.PanelCommand(Glb.PCM_FIND);
        }
        else
        {
          PAN_ENTRATA.PanelCommand(Glb.PCM_FIND);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EndModal", _e);
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
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Annullare le modifiche in sospeso?"));
      if (ModificheInSospeso())
      {
        if (!(MainFrm.MessageConfirm(v_AVVISO)))
        {
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "Unload", _e);
    }
  }

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
      if (Column.equals((new IDVariant(PFL_PARAMETRI_ESERCIZIO1)), true) && FieldWasModified.booleanValue())
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CARICAGESTIONEAVANZO(IMDB.Value(IMDBDef12.PQRY_PARAMETRI655, IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, (new IDVariant()));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI655, IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          PAN_SPESA.set_Locked((new IDVariant(0)).booleanValue());
          PAN_ENTRATA.set_Locked((new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETSPES+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETENTR+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          PAN_SPESA.set_Locked((new IDVariant(-1)).booleanValue());
          PAN_ENTRATA.set_Locked((new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETSPES+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETENTR+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ParametriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Spesa On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SPESA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SPESA);
      // 
      // Spesa On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_CAPDESCRIZI1,(new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_CAPDESCRIZI1))).stringValue()); 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_NOTE1,(new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_NOTE1))).stringValue()); 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_TIPOAVANZO1,(new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_TIPOAVANZO1))).stringValue()); 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_IMPDESCRIZIO,(new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_IMPDESCRIZIO))).stringValue()); 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_TIPOVINCOLO1,(new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_TIPOVINCOLO1))).stringValue()); 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_FINANZIAMEN1,(new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_FINANZIAMEN1))).stringValue()); 
      PAN_SPESA.set_ToolTip(Glb.OBJ_FIELD,PFL_SPESA_OPERA1,(new IDVariant(PAN_SPESA.FieldText(PFL_SPESA_OPERA1))).stringValue()); 
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_MODIFICABILE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_STATO, 0).equals((new IDVariant("N")), true))
        {
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PRIMO_ANNO, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0).equals((new IDVariant("CAPS")), true))
          {
            PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PRIMO_ANNO, 0).equals((new IDVariant("SI")), true))
        {
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0).equals((new IDVariant("CAPS")), true))
          {
            PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
        else
        {
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_NOTE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0).equals((new IDVariant("VIMP")), true))
        {
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_OPERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_OPERA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_NOTE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_OPERA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_STATO, 0).equals((new IDVariant("P")), true))
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ANNOVAR1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_TITOLO1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_CAPITOORIGI1,new IDVariant(MyGlb.VIS_NORFIEINTLUN).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ARTICOORIGI1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_CAPDESCRIZI1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_NUMEROIMPAC1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ANNOIMPACC1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPDESCRIZIO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPORTVARIA1,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPORTAVANZ1,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPORTBILAN1,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_CAPITODESTI1,new IDVariant(MyGlb.VIS_NORFIEINTLUN).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ARTICODESTI1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_NOTE1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_TIPOAVANZO1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_DESCRIZIONU1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_TIPOVINCOLO1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_FINANZIAMEN1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_OPERA1,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      }
      else
      {
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ANNOVAR1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_TITOLO1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_CAPITOORIGI1,new IDVariant(MyGlb.VIS_NORFIEINLUBL).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ARTICOORIGI1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_CAPDESCRIZI1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_NUMEROIMPAC1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ANNOIMPACC1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPDESCRIZIO,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPORTVARIA1,new IDVariant(MyGlb.VIS_NORFIEIMPBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPORTAVANZ1,new IDVariant(MyGlb.VIS_NORFIEIMPBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_IMPORTBILAN1,new IDVariant(MyGlb.VIS_NORFIEIMPBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_CAPITODESTI1,new IDVariant(MyGlb.VIS_NORFIEINLUBL).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_ARTICODESTI1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_NOTE1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_TIPOAVANZO1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_DESCRIZIONU1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_TIPOVINCOLO1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_FINANZIAMEN1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_SPESA.set_VisualStyle(Glb.OBJ_FIELD,PFL_SPESA_OPERA1,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Spesa On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_SPESA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spesa On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_SESSIONE, 0, new IDVariant(MainFrm.PROGRESESSIO));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_MODIFICABILE, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PRIMO_ANNO, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_E_S, 0, (new IDVariant("S")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0, (new IDVariant("CAPS")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_STATO, 0, (new IDVariant("N")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_DATA_REG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_SPESA_CAPITOORIGI1)), true) || Column.equals((new IDVariant(PFL_SPESA_ARTICOORIGI1)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE, 0))) && FieldWasModified.booleanValue())
        {
          if (!(ControlliCapitoloOrigine(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_E_S, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE, 0))))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TITOLO, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_SPESA_CKGESTIAVAN1)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  GESTIONE_AVANZO A ");
          SQL.append("where (A.ESERCIZIO > " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO1 = (new IDVariant("Attenzione: Esistono registrazioni dell’avanzo relative alla variazione di impegno (o capitolo) "));
            IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO2 = (new IDVariant("<br/>Al salvataggio le registrazioni dell’anno successivo verranno cancellate per consentire il ricalcolo corretto."));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_AVVISO1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_NUMERO_IMPACC, 0),IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE, 0)))), (new IDVariant("/"))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ANNO_IMPACC, 0),IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE, 0)))), v_AVVISO2)); 
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0, GetImportoAvanzoPrec(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_VARIAZIONE, 0)));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO_INIZIALE, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_NOTE, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_NOTE, 0, GetNotePrec(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO, 0)));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO_INIZIALE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_SPESA_IMPORTAVANZ1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0),(new IDVariant(0))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO_INIZIALE, 0),(new IDVariant(0))), true)>0 && IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0).compareTo((new IDVariant("CAPS")), true)!=0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("L'importo Avanzo non può superare il valore iniziale"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO_INIZIALE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_SPESA_IMPORTBILAN1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_BILANCIO, 0),(new IDVariant(0))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_AVANZO, 0),(new IDVariant(0))), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("L'importo Bilancio non può superare l'importo Avanzo"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_IMPORTO_BILANCIO, 0, IDL.ToCurrency(PAN_SPESA.GetOrgValue(PFL_SPESA_IMPORTBILAN1)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_SPESA_CAPITODESTI1)), true) || Column.equals((new IDVariant(PFL_SPESA_ARTICODESTI1)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_DESTINAZIONE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_DESTINAZIONE, 0))))
        {
          if (MainFrm.CapitoloPresente(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), (new IDVariant("S")), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_DESTINAZIONE, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_DESTINAZIONE, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_E_S_DESTINAZIONE, 0, (new IDVariant("S")));
          }
          else
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_E_S_DESTINAZIONE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_DESTINAZIONE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_DESTINAZIONE, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_E_S_DESTINAZIONE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Spesa On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_SPESA_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spesa On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_SPESA.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETSPES+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETSPES+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Spesa On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_SPESA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C9;

    try
    {
      TransCount = 0;
      // 
      // Spesa On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          Cancel.set((new IDVariant(-1)));
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          new IDVariant(PAN_SPESA.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SPESA.SetFlags (Glb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (Command.equals((new IDVariant(64)), true))
      {
        if (UserOperation.booleanValue())
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.CARICAGESTIONEAVANZO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, (new IDVariant("S")));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
        }
      }
      if (Command.equals((new IDVariant(128)), true))
      {
        if (ControlliRigheSpesa())
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
          SQL.append("  A.TIPO_RIGA as TIPORIGA, ");
          SQL.append("  A.CODICE_RIGA as CODICERIGA, ");
          SQL.append("  A.E_S as ES, ");
          SQL.append("  A.CAPITOLO_ORIGINE as CAPITOORIGIN, ");
          SQL.append("  A.ARTICOLO_ORIGINE as ARTICOORIGIN, ");
          SQL.append("  A.ANNO_IMPACC as ANNOIMPACC, ");
          SQL.append("  A.NUMERO_IMPACC as NUMEROIMPACC, ");
          SQL.append("  A.ANNO_VAR as ANNOVAR, ");
          SQL.append("  A.IMPORTO_AVANZO as IMPORTAVANZO, ");
          SQL.append("  A.IMPORTO_BILANCIO as IMPORTBILANC, ");
          SQL.append("  A.E_S_DESTINAZIONE as ESDESTINAZIO, ");
          SQL.append("  A.CAPITOLO_DESTINAZIONE as CAPITODESTIN, ");
          SQL.append("  A.ARTICOLO_DESTINAZIONE as ARTICODESTIN, ");
          SQL.append("  A.TIPO_AVANZO as TIPOAVANZO, ");
          SQL.append("  A.NOTE as NOTE1, ");
          SQL.append("  A.STATO as STATO, ");
          SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
          SQL.append("  A.SESSIONE as SESSIONE1, ");
          SQL.append("  A.TITOLO as TITOLO, ");
          SQL.append("  A.IMPORTO_VARIAZIONE as IMPORTVARIAZ, ");
          SQL.append("  A.IMPORTO_AVANZO_INIZIALE as IMPOAVANINIZ, ");
          SQL.append("  A.PRIMO_ANNO as PRIMOANNO, ");
          SQL.append("  A.DATA_REG as DATAREG, ");
          SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
          SQL.append("  A.OPERA as OPERA, ");
          SQL.append("  A.FINANZIAMENTO as FINANZIAMENT ");
          SQL.append("from ");
          SQL.append("  WRK_GESTIONE_AVANZO A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI655, IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.CK_GESTIONE_AVANZO = 'SI') ");
          C9 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C9.EOF()) C9.MoveNext();
          while (!C9.EOF())
          {
            try
            {
              if (C9.Get("STATO").equals((new IDVariant("P")), true))
              {
                SQL = new StringBuffer();
                SQL.append("update GESTIONE_AVANZO set ");
                SQL.append("  ANNO_VAR = " + IDL.CSql(C9.Get("ANNOVAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  IMPORTO_AVANZO = " + IDL.CSql(C9.Get("IMPORTAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  IMPORTO_BILANCIO = " + IDL.CSql(C9.Get("IMPORTBILANC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  E_S_DESTINAZIONE = " + IDL.CSql(C9.Get("ESDESTINAZIO"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  CAPITOLO_DESTINAZIONE = " + IDL.CSql(C9.Get("CAPITODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  ARTICOLO_DESTINAZIONE = " + IDL.CSql(C9.Get("ARTICODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  NOTE = " + IDL.CSql(C9.Get("NOTE1"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TIPO_AVANZO = " + IDL.CSql(C9.Get("TIPOAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ), ");
                SQL.append("  FINANZIAMENTO = " + IDL.CSql(C9.Get("FINANZIAMENT"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  OPERA = " + IDL.CSql(C9.Get("OPERA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ESERCIZIO = " + IDL.CSql(C9.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C9.Get("TIPORIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C9.Get("CODICERIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (PROGRESSIVO = " + IDL.CSql(C9.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else
              {
                SQL = new StringBuffer();
                SQL.append("insert into GESTIONE_AVANZO ");
                SQL.append("( ");
                SQL.append("  ESERCIZIO, ");
                SQL.append("  TIPO_RIGA, ");
                SQL.append("  CODICE_RIGA, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  E_S, ");
                SQL.append("  CAPITOLO_ORIGINE, ");
                SQL.append("  ARTICOLO_ORIGINE, ");
                SQL.append("  ANNO_IMPACC, ");
                SQL.append("  NUMERO_IMPACC, ");
                SQL.append("  ANNO_VAR, ");
                SQL.append("  IMPORTO_AVANZO, ");
                SQL.append("  IMPORTO_BILANCIO, ");
                SQL.append("  E_S_DESTINAZIONE, ");
                SQL.append("  CAPITOLO_DESTINAZIONE, ");
                SQL.append("  ARTICOLO_DESTINAZIONE, ");
                SQL.append("  TIPO_AVANZO, ");
                SQL.append("  NOTE, ");
                SQL.append("  UTENTE_INSERIMENTO, ");
                SQL.append("  DATA_INSERIMENTO, ");
                SQL.append("  FINANZIAMENTO, ");
                SQL.append("  OPERA ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(C9.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("TIPORIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("CODICERIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  to_number(NULL), ");
                SQL.append("  " + IDL.CSql(C9.Get("ES"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("CAPITOORIGIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ARTICOORIGIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ANNOIMPACC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("NUMEROIMPACC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ANNOVAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("IMPORTAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("IMPORTBILANC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ESDESTINAZIO"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("CAPITODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ARTICODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("TIPOAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("NOTE1"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TRUNC( SYSDATE ), ");
                SQL.append("  " + IDL.CSql(C9.Get("FINANZIAMENT"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("OPERA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                SQL = new StringBuffer();
                SQL.append("delete from GESTIONE_AVANZO ");
                SQL.append("where (ESERCIZIO > " + IDL.CSql(C9.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C9.Get("TIPORIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C9.Get("CODICERIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
            catch (Exception e13)
            {
              MainFrm.set_AlertMessage(new IDVariant(e13.getMessage())); 
              return;
            }
            C9.MoveNext();
          }
          C9.Close();
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.CARICAGESTIONEAVANZO(IMDB.Value(IMDBDef12.PQRY_PARAMETRI655, IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, (new IDVariant("S")));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            PAN_SPESA.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaOnCommand", _e);
    }
  }

  // **********************************************************************
  // Spesa On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_SPESA_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spesa On Change Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_STATO, 0).equals((new IDVariant("NP")), true) || IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_MODIFICABILE, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINA9+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINA9+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Spesa After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_SPESA_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spesa After Commit Body
      // Corpo Procedura
      // 
      if (ModificheInSospeso())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Spesa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_SPESA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spesa After Find Body
      // Corpo Procedura
      // 
      if (ModificheInSospeso())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_SPESA.set_FieldText(PFL_SPESA_SALDO1, IDL.ToString(IDL.Sub(PAN_SPESA.GetFieldSum(PFL_SPESA_IMPORTAVANZ1), PAN_SPESA.GetFieldSum(PFL_SPESA_IMPORTBILAN1))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaAfterFind", _e);
    }
  }

  // **********************************************************************
  // Spesa Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_SPESA_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Spesa Before Insert Body
      // Corpo Procedura
      // 
      IDVariant v_VPROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(MAX(A.PROGRESSIVO), 0) + 1 as NUVAMAWGAP01 ");
      SQL.append("from ");
      SQL.append("  WRK_GESTIONE_AVANZO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.SESSIONE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_SESSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VPROGRESSIVO = QV.Get("NUVAMAWGAP01", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO, 0, new IDVariant(new IDVariant(v_VPROGRESSIVO),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SpesaBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Entrata On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ENTRATA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ENTRATA);
      // 
      // Entrata On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_CAPDESCRIZIO,(new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_CAPDESCRIZIO))).stringValue()); 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_NOTE,(new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_NOTE))).stringValue()); 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_TIPOAVANZO,(new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_TIPOAVANZO))).stringValue()); 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_ACCDESCRIZIO,(new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_ACCDESCRIZIO))).stringValue()); 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_TIPOVINCOLO,(new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_TIPOVINCOLO))).stringValue()); 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_FINANZIAMENT,(new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_FINANZIAMENT))).stringValue()); 
      PAN_ENTRATA.set_ToolTip(Glb.OBJ_FIELD,PFL_ENTRATA_OPERA,(new IDVariant(PAN_ENTRATA.FieldText(PFL_ENTRATA_OPERA))).stringValue()); 
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_MODIFICABILE, 0).equals((new IDVariant("SI")), true))
      {
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_STATO, 0).equals((new IDVariant("N")), true))
        {
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PRIMO_ANNO, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0).equals((new IDVariant("CAPE")), true))
          {
            PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PRIMO_ANNO, 0).equals((new IDVariant("SI")), true))
        {
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0).equals((new IDVariant("CAPE")), true))
          {
            PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
          else
          {
            PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          }
        }
        else
        {
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0).compareTo((new IDVariant("VACC")), true)!=0 || IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_VARIAZIONE, 0).compareTo((new IDVariant(0)), true)>=0))
        {
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_NOTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0).equals((new IDVariant("VACC")), true))
        {
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_OPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_NOTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_OPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_STATO, 0).equals((new IDVariant("P")), true))
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ANNOVAR,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_TITOLO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_CAPITOORIGIN,new IDVariant(MyGlb.VIS_NORFIEINTLUN).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ARTICOORIGIN,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_CAPDESCRIZIO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_NUMEROIMPACC,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ANNOIMPACC,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ACCDESCRIZIO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_IMPORTVARIAZ,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_IMPORTAVANZO,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_IMPORTBILANC,new IDVariant(MyGlb.VIS_NORFIECF4IMP).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_CAPITODESTIN,new IDVariant(MyGlb.VIS_NORFIEINTLUN).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ARTICODESTIN,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_NOTE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_TIPOAVANZO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_DESCRIZIONUO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_TIPOVINCOLO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_FINANZIAMENT,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_OPERA,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      }
      else
      {
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ANNOVAR,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_TITOLO,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_CAPITOORIGIN,new IDVariant(MyGlb.VIS_NORFIEINLUBL).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ARTICOORIGIN,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_CAPDESCRIZIO,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_NUMEROIMPACC,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ANNOIMPACC,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ACCDESCRIZIO,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_IMPORTVARIAZ,new IDVariant(MyGlb.VIS_NORFIEIMPBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_IMPORTAVANZO,new IDVariant(MyGlb.VIS_NORFIEIMPBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_IMPORTBILANC,new IDVariant(MyGlb.VIS_NORFIEIMPBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_CAPITODESTIN,new IDVariant(MyGlb.VIS_NORFIEINLUBL).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_ARTICODESTIN,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_NOTE,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_TIPOAVANZO,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_DESCRIZIONUO,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_TIPOVINCOLO,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_FINANZIAMENT,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
        PAN_ENTRATA.set_VisualStyle(Glb.OBJ_FIELD,PFL_ENTRATA_OPERA,new IDVariant(MyGlb.VIS_NORMAFIELBLU).intValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Entrata On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ENTRATA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_SESSIONE, 0, new IDVariant(MainFrm.PROGRESESSIO));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_MODIFICABILE, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PRIMO_ANNO, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO, 0, (new IDVariant("SI")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_E_S, 0, (new IDVariant("E")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0, (new IDVariant("CAPE")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_STATO, 0, (new IDVariant("N")));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_DATA_REG, 0, IDL.Today());
        }
      }
      if (Column.equals((new IDVariant(PFL_ENTRATA_CAPITOORIGIN)), true) || Column.equals((new IDVariant(PFL_ENTRATA_ARTICOORIGIN)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE, 0))) && FieldWasModified.booleanValue())
        {
          if (!(ControlliCapitoloOrigine(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_E_S, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE, 0))))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TITOLO, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_ENTRATA_CKGESTIAVANZ)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  GESTIONE_AVANZO A ");
          SQL.append("where (A.ESERCIZIO > " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO1 = (new IDVariant("Attenzione: Esistono registrazioni dell’avanzo relative alla variazione di accertamento (o capitolo) "));
            IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO2 = (new IDVariant("<br/>Al salvataggio le registrazioni dell’anno successivo verranno cancellate per consentire il ricalcolo corretto."));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_AVVISO1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_NUMERO_IMPACC, 0),IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE, 0)))), (new IDVariant("/"))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ANNO_IMPACC, 0),IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE, 0)))), v_AVVISO2)); 
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0, GetImportoAvanzoPrec(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_VARIAZIONE, 0)));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0));
          }
          if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_NOTE, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_NOTE, 0, GetNotePrec(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO, 0)));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_ENTRATA_IMPORTAVANZO)), true) && FieldWasModified.booleanValue())
      {
        // 
        // confronto il valore assoluto perché per l'entrata possono
        // esserci anche variazioni negative
        // 
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0).compareTo((new IDVariant("CAPE")), true)!=0)
        {
          if (IDL.Sign(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE, 0),(new IDVariant(0)))).compareTo(IDL.Sign(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0),(new IDVariant(0)))), true)!=0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("L'importo Avanzo deve avere lo stesso segno del valore iniziale"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE, 0));
          }
          else if (IDL.NullValue(IDL.Abs(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0)),(new IDVariant(0))).compareTo(IDL.NullValue(IDL.Abs(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE, 0)),(new IDVariant(0))), true)>0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("L'importo Avanzo non può superare il valore iniziale"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO_INIZIALE, 0));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_ENTRATA_IMPORTBILANC)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_BILANCIO, 0),(new IDVariant(0))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_AVANZO, 0),(new IDVariant(0))), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("L'importo Bilancio non può superare l'importo Avanzo"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_IMPORTO_BILANCIO, 0, IDL.ToCurrency(PAN_ENTRATA.GetOrgValue(PFL_ENTRATA_IMPORTBILANC)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_ENTRATA_CAPITODESTIN)), true) || Column.equals((new IDVariant(PFL_ENTRATA_ARTICODESTIN)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_DESTINAZIONE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_DESTINAZIONE, 0))))
        {
          if (MainFrm.CapitoloPresente(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), (new IDVariant("S")), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_DESTINAZIONE, 0), IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_DESTINAZIONE, 0)))
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_E_S_DESTINAZIONE, 0, (new IDVariant("S")));
          }
          else
          {
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_E_S_DESTINAZIONE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_DESTINAZIONE, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_DESTINAZIONE, 0, (new IDVariant()));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_E_S_DESTINAZIONE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Entrata On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_ENTRATA_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_ENTRATA.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETENTR+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETENTR+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Entrata On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ENTRATA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C9;

    try
    {
      TransCount = 0;
      // 
      // Entrata On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          Cancel.set((new IDVariant(-1)));
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          new IDVariant(PAN_ENTRATA.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_ENTRATA.SetFlags (Glb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (Command.equals((new IDVariant(64)), true))
      {
        if (UserOperation.booleanValue())
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.CARICAGESTIONEAVANZO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, (new IDVariant("E")));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
        }
      }
      if (Command.equals((new IDVariant(128)), true))
      {
        if (ControlliRigheEntrata())
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
          SQL.append("  A.TIPO_RIGA as TIPORIGA, ");
          SQL.append("  A.CODICE_RIGA as CODICERIGA, ");
          SQL.append("  A.E_S as ES, ");
          SQL.append("  A.CAPITOLO_ORIGINE as CAPITOORIGIN, ");
          SQL.append("  A.ARTICOLO_ORIGINE as ARTICOORIGIN, ");
          SQL.append("  A.ANNO_IMPACC as ANNOIMPACC, ");
          SQL.append("  A.NUMERO_IMPACC as NUMEROIMPACC, ");
          SQL.append("  A.ANNO_VAR as ANNOVAR, ");
          SQL.append("  A.IMPORTO_AVANZO as IMPORTAVANZO, ");
          SQL.append("  A.IMPORTO_BILANCIO as IMPORTBILANC, ");
          SQL.append("  A.E_S_DESTINAZIONE as ESDESTINAZIO, ");
          SQL.append("  A.CAPITOLO_DESTINAZIONE as CAPITODESTIN, ");
          SQL.append("  A.ARTICOLO_DESTINAZIONE as ARTICODESTIN, ");
          SQL.append("  A.TIPO_AVANZO as TIPOAVANZO, ");
          SQL.append("  A.NOTE as NOTE1, ");
          SQL.append("  A.STATO as STATO, ");
          SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
          SQL.append("  A.SESSIONE as SESSIONE1, ");
          SQL.append("  A.TITOLO as TITOLO, ");
          SQL.append("  A.IMPORTO_VARIAZIONE as IMPORTVARIAZ, ");
          SQL.append("  A.IMPORTO_AVANZO_INIZIALE as IMPOAVANINIZ, ");
          SQL.append("  A.PRIMO_ANNO as PRIMOANNO, ");
          SQL.append("  A.DATA_REG as DATAREG, ");
          SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
          SQL.append("  A.OPERA as OPERA, ");
          SQL.append("  A.FINANZIAMENTO as FINANZIAMENT ");
          SQL.append("from ");
          SQL.append("  WRK_GESTIONE_AVANZO A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI655, IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'E') ");
          SQL.append("and   (A.CK_GESTIONE_AVANZO = 'SI') ");
          C9 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C9.EOF()) C9.MoveNext();
          while (!C9.EOF())
          {
            try
            {
              if (C9.Get("STATO").equals((new IDVariant("P")), true))
              {
                SQL = new StringBuffer();
                SQL.append("update GESTIONE_AVANZO set ");
                SQL.append("  ANNO_VAR = " + IDL.CSql(C9.Get("ANNOVAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  IMPORTO_AVANZO = " + IDL.CSql(C9.Get("IMPORTAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  IMPORTO_BILANCIO = " + IDL.CSql(C9.Get("IMPORTBILANC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  E_S_DESTINAZIONE = " + IDL.CSql(C9.Get("ESDESTINAZIO"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  CAPITOLO_DESTINAZIONE = " + IDL.CSql(C9.Get("CAPITODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  ARTICOLO_DESTINAZIONE = " + IDL.CSql(C9.Get("ARTICODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  NOTE = " + IDL.CSql(C9.Get("NOTE1"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TIPO_AVANZO = " + IDL.CSql(C9.Get("TIPOAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  UTENTE_ULTIMO_AGG = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  DATA_ULTIMO_AGG = TRUNC( SYSDATE ), ");
                SQL.append("  FINANZIAMENTO = " + IDL.CSql(C9.Get("FINANZIAMENT"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  OPERA = " + IDL.CSql(C9.Get("OPERA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append("where (ESERCIZIO = " + IDL.CSql(C9.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C9.Get("TIPORIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C9.Get("CODICERIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (PROGRESSIVO = " + IDL.CSql(C9.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              else
              {
                SQL = new StringBuffer();
                SQL.append("insert into GESTIONE_AVANZO ");
                SQL.append("( ");
                SQL.append("  ESERCIZIO, ");
                SQL.append("  TIPO_RIGA, ");
                SQL.append("  CODICE_RIGA, ");
                SQL.append("  PROGRESSIVO, ");
                SQL.append("  E_S, ");
                SQL.append("  CAPITOLO_ORIGINE, ");
                SQL.append("  ARTICOLO_ORIGINE, ");
                SQL.append("  ANNO_IMPACC, ");
                SQL.append("  NUMERO_IMPACC, ");
                SQL.append("  ANNO_VAR, ");
                SQL.append("  IMPORTO_AVANZO, ");
                SQL.append("  IMPORTO_BILANCIO, ");
                SQL.append("  E_S_DESTINAZIONE, ");
                SQL.append("  CAPITOLO_DESTINAZIONE, ");
                SQL.append("  ARTICOLO_DESTINAZIONE, ");
                SQL.append("  TIPO_AVANZO, ");
                SQL.append("  NOTE, ");
                SQL.append("  UTENTE_INSERIMENTO, ");
                SQL.append("  DATA_INSERIMENTO, ");
                SQL.append("  FINANZIAMENTO, ");
                SQL.append("  OPERA ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(C9.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("TIPORIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("CODICERIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ES"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("CAPITOORIGIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ARTICOORIGIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ANNOIMPACC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("NUMEROIMPACC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ANNOVAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("IMPORTAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("IMPORTBILANC"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ESDESTINAZIO"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("CAPITODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("ARTICODESTIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("TIPOAVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("NOTE1"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TRUNC( SYSDATE ), ");
                SQL.append("  " + IDL.CSql(C9.Get("FINANZIAMENT"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C9.Get("OPERA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                SQL = new StringBuffer();
                SQL.append("delete from GESTIONE_AVANZO ");
                SQL.append("where (ESERCIZIO > " + IDL.CSql(C9.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C9.Get("TIPORIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C9.Get("CODICERIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
            catch (Exception e13)
            {
              MainFrm.set_AlertMessage(new IDVariant(e13.getMessage())); 
              return;
            }
            C9.MoveNext();
          }
          C9.Close();
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.CARICAGESTIONEAVANZO(IMDB.Value(IMDBDef12.PQRY_PARAMETRI655, IMDBDef12.PQSL_PARAMETRI655_PARAMESERCIZ, 0), MainFrm.PROGRESESSIO, (new IDVariant("E")));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            PAN_ENTRATA.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataOnCommand", _e);
    }
  }

  // **********************************************************************
  // Entrata On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_ENTRATA_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata On Change Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_STATO, 0).equals((new IDVariant("NP")), true) || IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_MODIFICABILE, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINA10+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINA10+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Entrata After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_ENTRATA_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata After Commit Body
      // Corpo Procedura
      // 
      if (ModificheInSospeso())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Entrata After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_ENTRATA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata After Find Body
      // Corpo Procedura
      // 
      if (ModificheInSospeso())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_ENTRATA.set_FieldText(PFL_ENTRATA_SALDO, IDL.ToString(IDL.Sub(PAN_ENTRATA.GetFieldSum(PFL_ENTRATA_IMPORTAVANZO), PAN_ENTRATA.GetFieldSum(PFL_ENTRATA_IMPORTBILANC))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataAfterFind", _e);
    }
  }

  // **********************************************************************
  // Entrata Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ENTRATA_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Entrata Before Insert Body
      // Corpo Procedura
      // 
      IDVariant v_VPROGRESSIVO = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(MAX(A.PROGRESSIVO), 0) + 1 as NUVAMAWGAP01 ");
      SQL.append("from ");
      SQL.append("  WRK_GESTIONE_AVANZO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.SESSIONE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_SESSIONE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VPROGRESSIVO = QV.Get("NUVAMAWGAP01", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO, 0, new IDVariant(new IDVariant(v_VPROGRESSIVO),IDVariant.DECIMAL));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EntrataBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Apri Info Impegno
  // **********************************************************************
  public int ApriInfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Impegno Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_NUMERO_IMPACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ANNO_IMPACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ANNO_IMPACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_NUMERO_IMPACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ApriInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo Spesa Origine
  // **********************************************************************
  public int SelezioneCapitoloSpesaOrigine ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Spesa Origine Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_STATO, 0).equals((new IDVariant("N")), true) && IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0, (new IDVariant("Origine")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SelezioneCapitoloSpesaOrigine", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo Spesa Bilancio
  // **********************************************************************
  public int SelezioneCapitoloSpesaBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Spesa Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0))) && IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0, (new IDVariant("Bilancio")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SelezioneCapitoloSpesaBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imposta Gestione Avanzo Spesa
  // **********************************************************************
  public int ImpostaGestioneAvanzoSpesa ()
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
      // Imposta Gestione Avanzo Spesa Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_SPESA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_SPESA.GotoFirst();
      while (!PAN_SPESA.RSEOF())
      {
        if (PAN_SPESA.IsRowSelected(I.intValue()))
        {
          if (C2.Get("MODIFICABILE").equals((new IDVariant("SI")), true))
          {
            IDVariant v_IMPOAVANPREC = null;
            v_IMPOAVANPREC = GetImportoAvanzoPrec(C2.Get("ESERCIZIO"), C2.Get("TIPO_RIGA"), C2.Get("CODICE_RIGA"), C2.Get("PROGRESSIVO"), C2.Get("IMPORTO_VARIAZIONE"));
            IDVariant v_NOTEPREC = null;
            v_NOTEPREC = GetNotePrec(C2.Get("ESERCIZIO"), C2.Get("TIPO_RIGA"), C2.Get("CODICE_RIGA"), C2.Get("PROGRESSIVO"));
            try
            {
              SQL = new StringBuffer();
              SQL.append("update WRK_GESTIONE_AVANZO set ");
              SQL.append("  CK_GESTIONE_AVANZO = 'SI', ");
              SQL.append("  IMPORTO_AVANZO = DECODE(WRK_GESTIONE_AVANZO.IMPORTO_AVANZO, to_number(NULL), " + IDL.CSql(v_IMPOAVANPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", WRK_GESTIONE_AVANZO.IMPORTO_AVANZO), ");
              SQL.append("  IMPORTO_AVANZO_INIZIALE = DECODE(WRK_GESTIONE_AVANZO.IMPORTO_AVANZO, to_number(NULL), " + IDL.CSql(v_IMPOAVANPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", WRK_GESTIONE_AVANZO.IMPORTO_AVANZO), ");
              SQL.append("  NOTE = DECODE(WRK_GESTIONE_AVANZO.NOTE, NULL, " + IDL.CSql(v_NOTEPREC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", WRK_GESTIONE_AVANZO.NOTE) ");
              SQL.append("where (ESERCIZIO = " + IDL.CSql(C2.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C2.Get("TIPO_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C2.Get("CODICE_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (PROGRESSIVO = " + IDL.CSql(C2.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e6)
            {
              MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
              return 0;
            }
            v_SELEZIONATO = (new IDVariant(-1));
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_SPESA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (v_SELEZIONATO.booleanValue())
      {
        PAN_SPESA.PanelCommand(Glb.PCM_REQUERY);
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stata selezionata nessuna riga modificabile."));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ImpostaGestioneAvanzoSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Copia Avanzo Su Bilancio Spesa
  // **********************************************************************
  public int CopiaAvanzoSuBilancioSpesa ()
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
      // Copia Avanzo Su Bilancio Spesa Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_SPESA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_SPESA.GotoFirst();
      while (!PAN_SPESA.RSEOF())
      {
        if (PAN_SPESA.IsRowSelected(I.intValue()))
        {
          if (C2.Get("MODIFICABILE").equals((new IDVariant("SI")), true) && !(IDL.IsNull(C2.Get("IMPORTO_AVANZO"))))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("update WRK_GESTIONE_AVANZO set ");
              SQL.append("  CK_GESTIONE_AVANZO = 'SI', ");
              SQL.append("  IMPORTO_BILANCIO = " + IDL.CSql(C2.Get("IMPORTO_AVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ESERCIZIO = " + IDL.CSql(C2.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C2.Get("TIPO_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C2.Get("CODICE_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (PROGRESSIVO = " + IDL.CSql(C2.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e6)
            {
              MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
              return 0;
            }
            v_SELEZIONATO = (new IDVariant(-1));
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_SPESA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (v_SELEZIONATO.booleanValue())
      {
        PAN_SPESA.PanelCommand(Glb.PCM_REQUERY);
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stata selezionata nessuna riga modificabile."));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "CopiaAvanzoSuBilancioSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Gestione Avanzo Spesa
  // **********************************************************************
  public int StampaGestioneAvanzoSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Gestione Avanzo Spesa Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI665, IMDBDef4.FLD_PARAMETRI665_PARAMPARTE, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_STAMGESTAVAN, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "StampaGestioneAvanzoSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Righe Spesa
  // **********************************************************************
  public boolean ControlliRigheSpesa ()
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
      // Controlli Righe Spesa Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      C2 = PAN_SPESA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_SPESA.GotoFirst();
      while (!PAN_SPESA.RSEOF())
      {
        if (C2.Get("CK_GESTIONE_AVANZO").equals((new IDVariant("SI")), true))
        {
          if (C2.Get("TIPO_RIGA").equals((new IDVariant("CAPE")), true) || C2.Get("TIPO_RIGA").equals((new IDVariant("CAPS")), true))
          {
            if (IDL.IsNull(C2.Get("CAPITOLO_ORIGINE")) || IDL.IsNull(C2.Get("ARTICOLO_ORIGINE")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Capitolo Obbligatorio sulle nuove righe non derivanti da Variazioni Impegni!"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
            if (IDL.IsNull(C2.Get("ANNO_VAR")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Anno Variazione Obbligatorio"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
            if (IDL.IsNull(C2.Get("TIPO_AVANZO")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Tipo Avanzo Obbligatorio"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
          }
          if (IDL.IsNull(C2.Get("IMPORTO_AVANZO")))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Importo Avanzo Obbligatorio!"));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
            return (new IDVariant(0)).booleanValue();
          }
          if (!(IDL.IsNull(C2.Get("IMPORTO_BILANCIO"))) || !(IDL.IsNull(C2.Get("CAPITOLO_DESTINAZIONE"))) || !(IDL.IsNull(C2.Get("ARTICOLO_DESTINAZIONE"))))
          {
            if (IDL.IsNull(C2.Get("IMPORTO_BILANCIO")) || IDL.IsNull(C2.Get("CAPITOLO_DESTINAZIONE")) || IDL.IsNull(C2.Get("ARTICOLO_DESTINAZIONE")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Importo Bilancio e Capitolo Bilancio devono essere entrambi valorizzati o entrambi nulli!"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_SPESA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ControlliRigheSpesa", _e);
      return false;
    }
  }

  // **********************************************************************
  // Elimina Spesa
  // **********************************************************************
  public int EliminaSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elimina Spesa Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Confermi la cancellazione della riga selezionata?"));
      if (!(MainFrm.MessageConfirm(v_AVVISO)))
      {
        return 0;
      }
      MainFrm.Cf4armDBObject.BeginTrans();
      try
      {
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GESTIONE_AVANZO ");
        SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_STATO, 0).equals((new IDVariant("P")), true))
        {
          SQL = new StringBuffer();
          SQL.append("delete from GESTIONE_AVANZO ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
      }
      catch (Exception e6)
      {
        MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      PAN_SPESA.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EliminaSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Acc
  // **********************************************************************
  public int ApriInfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Acc Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_NUMERO_IMPACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ANNO_IMPACC, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_NUMERO_IMPACC, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ANNO_IMPACC, 0));
        MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ApriInfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo Entrata Origine
  // **********************************************************************
  public int SelezioneCapitoloEntrataOrigine ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Entrata Origine Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_STATO, 0).equals((new IDVariant("N")), true) && IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0, (new IDVariant("Origine")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SelezioneCapitoloEntrataOrigine", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo Entrata Bilancio
  // **********************************************************************
  public int SelezioneCapitoloEntrataBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Entrata Bilancio Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0))) && IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CK_GESTIONE_AVANZO, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARALOOUPCAP, 0, (new IDVariant("Bilancio")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "SelezioneCapitoloEntrataBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imposta Gestione Avanzo Entrata
  // **********************************************************************
  public int ImpostaGestioneAvanzoEntrata ()
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
      // Imposta Gestione Avanzo Entrata Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_ENTRATA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ENTRATA.GotoFirst();
      while (!PAN_ENTRATA.RSEOF())
      {
        if (PAN_ENTRATA.IsRowSelected(I.intValue()))
        {
          if (C2.Get("MODIFICABILE").equals((new IDVariant("SI")), true))
          {
            IDVariant v_IMPOAVANPREC = null;
            v_IMPOAVANPREC = GetImportoAvanzoPrec(C2.Get("ESERCIZIO"), C2.Get("TIPO_RIGA"), C2.Get("CODICE_RIGA"), C2.Get("PROGRESSIVO"), C2.Get("IMPORTO_VARIAZIONE"));
            IDVariant v_NOTEPREC = null;
            v_NOTEPREC = GetNotePrec(C2.Get("ESERCIZIO"), C2.Get("TIPO_RIGA"), C2.Get("CODICE_RIGA"), C2.Get("PROGRESSIVO"));
            try
            {
              SQL = new StringBuffer();
              SQL.append("update WRK_GESTIONE_AVANZO set ");
              SQL.append("  CK_GESTIONE_AVANZO = 'SI', ");
              SQL.append("  IMPORTO_AVANZO = DECODE(WRK_GESTIONE_AVANZO.IMPORTO_AVANZO, to_number(NULL), " + IDL.CSql(v_IMPOAVANPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", WRK_GESTIONE_AVANZO.IMPORTO_AVANZO), ");
              SQL.append("  IMPORTO_AVANZO_INIZIALE = DECODE(WRK_GESTIONE_AVANZO.IMPORTO_AVANZO, to_number(NULL), " + IDL.CSql(v_IMPOAVANPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", WRK_GESTIONE_AVANZO.IMPORTO_AVANZO), ");
              SQL.append("  NOTE = DECODE(WRK_GESTIONE_AVANZO.NOTE, NULL, " + IDL.CSql(v_NOTEPREC, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", WRK_GESTIONE_AVANZO.NOTE) ");
              SQL.append("where (ESERCIZIO = " + IDL.CSql(C2.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C2.Get("TIPO_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C2.Get("CODICE_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (PROGRESSIVO = " + IDL.CSql(C2.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e6)
            {
              MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
              return 0;
            }
            v_SELEZIONATO = (new IDVariant(-1));
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ENTRATA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (v_SELEZIONATO.booleanValue())
      {
        PAN_ENTRATA.PanelCommand(Glb.PCM_REQUERY);
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stata selezionata nessuna riga modificabile."));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ImpostaGestioneAvanzoEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Copia Avanzo Su Bilancio Entrata
  // **********************************************************************
  public int CopiaAvanzoSuBilancioEntrata ()
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
      // Copia Avanzo Su Bilancio Entrata Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      C2 = PAN_ENTRATA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ENTRATA.GotoFirst();
      while (!PAN_ENTRATA.RSEOF())
      {
        if (PAN_ENTRATA.IsRowSelected(I.intValue()))
        {
          if (C2.Get("MODIFICABILE").equals((new IDVariant("SI")), true) && !(IDL.IsNull(C2.Get("IMPORTO_AVANZO"))) && IDL.NullValue(C2.Get("IMPORTO_AVANZO_INIZIALE"),(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0)
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("update WRK_GESTIONE_AVANZO set ");
              SQL.append("  CK_GESTIONE_AVANZO = 'SI', ");
              SQL.append("  IMPORTO_BILANCIO = " + IDL.CSql(C2.Get("IMPORTO_AVANZO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
              SQL.append("where (ESERCIZIO = " + IDL.CSql(C2.Get("ESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (TIPO_RIGA = " + IDL.CSql(C2.Get("TIPO_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (CODICE_RIGA = " + IDL.CSql(C2.Get("CODICE_RIGA"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (PROGRESSIVO = " + IDL.CSql(C2.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e6)
            {
              MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
              return 0;
            }
            v_SELEZIONATO = (new IDVariant(-1));
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ENTRATA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      if (v_SELEZIONATO.booleanValue())
      {
        PAN_ENTRATA.PanelCommand(Glb.PCM_REQUERY);
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è stata selezionata nessuna riga modificabile."));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "CopiaAvanzoSuBilancioEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa Gestione Avanzo Entrata
  // **********************************************************************
  public int StampaGestioneAvanzoEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Gestione Avanzo Entrata Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI665, IMDBDef4.FLD_PARAMETRI665_PARAMPARTE, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_STAMGESTAVAN, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "StampaGestioneAvanzoEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlli Righe Entrata
  // **********************************************************************
  public boolean ControlliRigheEntrata ()
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
      // Controlli Righe Entrata Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      C2 = PAN_ENTRATA.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ENTRATA.GotoFirst();
      while (!PAN_ENTRATA.RSEOF())
      {
        if (C2.Get("CK_GESTIONE_AVANZO").equals((new IDVariant("SI")), true))
        {
          if (C2.Get("TIPO_RIGA").equals((new IDVariant("CAPE")), true) || C2.Get("TIPO_RIGA").equals((new IDVariant("CAPS")), true))
          {
            if (IDL.IsNull(C2.Get("CAPITOLO_ORIGINE")) || IDL.IsNull(C2.Get("ARTICOLO_ORIGINE")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Capitolo Obbligatorio sulle nuove righe non derivanti da Variazioni Impegni!"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
            if (IDL.IsNull(C2.Get("ANNO_VAR")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Anno Variazione Obbligatorio"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
            if (IDL.IsNull(C2.Get("TIPO_AVANZO")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Tipo Avanzo Obbligatorio"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
          }
          if (!(IDL.IsNull(C2.Get("IMPORTO_BILANCIO"))) || !(IDL.IsNull(C2.Get("CAPITOLO_DESTINAZIONE"))) || !(IDL.IsNull(C2.Get("ARTICOLO_DESTINAZIONE"))))
          {
            if (IDL.IsNull(C2.Get("IMPORTO_BILANCIO")) || IDL.IsNull(C2.Get("CAPITOLO_DESTINAZIONE")) || IDL.IsNull(C2.Get("ARTICOLO_DESTINAZIONE")))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Importo Bilancio e Capitolo Bilancio devono essere entrambi valorizzati o entrambi nulli!"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Riga ")), IDL.ToString(I)), (new IDVariant("<BR/>"))), v_AVVISO)); 
              return (new IDVariant(0)).booleanValue();
            }
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ENTRATA.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ControlliRigheEntrata", _e);
      return false;
    }
  }

  // **********************************************************************
  // Elimina Entrata
  // **********************************************************************
  public int EliminaEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elimina Entrata Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Confermi la cancellazione della riga selezionata?"));
      if (!(MainFrm.MessageConfirm(v_AVVISO)))
      {
        return 0;
      }
      MainFrm.Cf4armDBObject.BeginTrans();
      try
      {
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GESTIONE_AVANZO ");
        SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        if (IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_STATO, 0).equals((new IDVariant("P")), true))
        {
          SQL = new StringBuffer();
          SQL.append("delete from GESTIONE_AVANZO ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (TIPO_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TIPO_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (CODICE_RIGA = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (PROGRESSIVO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_PROGRESSIVO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
      }
      catch (Exception e6)
      {
        MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
        MainFrm.Cf4armDBObject.RollbackTrans();
        return 0;
      }
      MainFrm.Cf4armDBObject.CommitTrans();
      PAN_ENTRATA.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "EliminaEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Get Importo Avanzo Prec
  // Esercizio:  - Input
  // Tipo Riga:  - Input
  // Codice Riga:  - Input
  // Progressivo - Input
  // Importo Variazione:  - Input
  // **********************************************************************
  public IDVariant GetImportoAvanzoPrec (IDVariant Esercizio, IDVariant TipoRiga, IDVariant CodiceRiga, IDVariant Progressivo, IDVariant ImportoVariazione)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Importo Avanzo Prec Body
      // Corpo Procedura
      // 
      IDVariant v_VESERCIZIO = null;
      v_VESERCIZIO = (new IDVariant());
      IDVariant v_IMPORTAVANZO = null;
      v_IMPORTAVANZO = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.ESERCIZIO) as MAXGESAVAESE ");
      SQL.append("from ");
      SQL.append("  GESTIONE_AVANZO A ");
      SQL.append("where (A.ESERCIZIO < " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(TipoRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(CodiceRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGRESSIVO = " + IDL.CSql(Progressivo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VESERCIZIO = QV.Get("MAXGESAVAESE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (IDL.IsNull(v_VESERCIZIO))
      {
        v_IMPORTAVANZO = new IDVariant(ImportoVariazione);
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(A.IMPORTO_AVANZO, 0) - NVL(A.IMPORTO_BILANCIO, 0) as NVGIA0NVGAIB ");
        SQL.append("from ");
        SQL.append("  GESTIONE_AVANZO A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(v_VESERCIZIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(TipoRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(CodiceRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROGRESSIVO = " + IDL.CSql(Progressivo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_IMPORTAVANZO = QV.Get("NVGIA0NVGAIB", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      return v_IMPORTAVANZO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "GetImportoAvanzoPrec", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Note Prec
  // Esercizio:  - Input
  // Tipo Riga:  - Input
  // Codice Riga:  - Input
  // Progressivo - Input
  // **********************************************************************
  public IDVariant GetNotePrec (IDVariant Esercizio, IDVariant TipoRiga, IDVariant CodiceRiga, IDVariant Progressivo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Note Prec Body
      // Corpo Procedura
      // 
      IDVariant v_VESERCIZIO = null;
      v_VESERCIZIO = (new IDVariant());
      IDVariant v_VNOTE = null;
      v_VNOTE = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MAX(A.ESERCIZIO) as MAXGESAVAESE ");
      SQL.append("from ");
      SQL.append("  GESTIONE_AVANZO A ");
      SQL.append("where (A.ESERCIZIO < " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(TipoRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(CodiceRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGRESSIVO = " + IDL.CSql(Progressivo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VESERCIZIO = QV.Get("MAXGESAVAESE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_VESERCIZIO)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.NOTE as GESTAVANNOTE ");
        SQL.append("from ");
        SQL.append("  GESTIONE_AVANZO A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(v_VESERCIZIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(TipoRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE_RIGA = " + IDL.CSql(CodiceRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROGRESSIVO = " + IDL.CSql(Progressivo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VNOTE = QV.Get("GESTAVANNOTE", IDVariant.STRING) ;
        }
        QV.Close();
      }
      return v_VNOTE;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "GetNotePrec", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Modifiche In Sospeso
  // **********************************************************************
  public boolean ModificheInSospeso ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifiche In Sospeso Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_GESTIONE_AVANZO A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CK_GESTIONE_AVANZO = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ModificheInSospeso", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlli Capitolo Origine
  // Esercizio:  - Input
  // Tipo Riga:  - Input
  // E S:  - Input
  // Capitolo:  - Input
  // Articolo:  - Input
  // **********************************************************************
  public boolean ControlliCapitoloOrigine (IDVariant Esercizio, IDVariant TipoRiga, IDVariant ES, IDVariant Capitolo, IDVariant Articolo)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlli Capitolo Origine Body
      // Corpo Procedura
      // 
      IDVariant v_VTITOLO = new IDVariant(0,IDVariant.STRING);
      if (MainFrm.CapitoloPresente(Esercizio, ES, Capitolo, Articolo))
      {
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  WRK_GESTIONE_AVANZO A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_RIGA = " + IDL.CSql(TipoRiga, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE_RIGA = TO_CHAR ( " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ) || LPAD(TO_CHAR ( " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), 2, SUBSTR('0', 1, 1))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A_GET_COD_RICL_CAP(" + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",1,'SI','MACRO') as AGCRCEESCA1S ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VTITOLO = QV.Get("AGCRCEESCA1S", IDVariant.STRING) ;
        }
        QV.Close();
        if (ES.equals((new IDVariant("S")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CAPITOLO_ORIGINE, 0, new IDVariant(Capitolo));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_ARTICOLO_ORIGINE, 0, new IDVariant(Articolo));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_CODICE_RIGA, 0, IDL.Add(IDL.ToString(Capitolo), IDL.FillLR(IDL.ToString(Articolo), (new IDVariant(2)), (new IDVariant("0")), true)));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVA1, IMDBDef12.PQSL_WRKGESTIAVA1_TITOLO, 0, new IDVariant(v_VTITOLO));
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CAPITOLO_ORIGINE, 0, new IDVariant(Capitolo));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_ARTICOLO_ORIGINE, 0, new IDVariant(Articolo));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_CODICE_RIGA, 0, IDL.Add(IDL.ToString(Capitolo), IDL.FillLR(IDL.ToString(Articolo), (new IDVariant(2)), (new IDVariant("0")), true)));
          IMDB.set_Value(IMDBDef12.PQRY_WRKGESTIAVAN, IMDBDef12.PQSL_WRKGESTIAVAN_TITOLO, 0, new IDVariant(v_VTITOLO));
        }
        // if (v_VCOUNT.equals((new IDVariant(0)), true))
        // {
        // }
        // else
        // {
          // IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          // v_AVVISO = (new IDVariant("Registrazione già presente per il Capitolo "));
          // MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, IDL.ToString(Capitolo)), (new IDVariant("/"))), IDL.ToString(Articolo))); 
          // return (new IDVariant(0)).booleanValue();
        // }
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "ControlliCapitoloOrigine", _e);
      return false;
    }
  }

  // **********************************************************************
  // Codice UO
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CodiceUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Codice UO Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_UNITAORGANIZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GestioneAvanzo", "CodiceUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GESTIOAVANZO_PARAMETRI655() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI655_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI656, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI656, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI655_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI655_RS, 0, IMDBDef4.TBL_PARAMETRI656, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI655_RS, 0, 0, IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARAMESERCIZ, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI655_RS, 1, 0, IMDBDef4.TBL_PARAMETRI656, IMDBDef4.FLD_PARAMETRI656_PARSOLRIGREG, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI656, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI656, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI656, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI655_RS, 0);
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

  private void TAB_TABBEDVIEW_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_SPESA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SPESA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SPESA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SPESA, Cancel);
    // Stub
  }

  private void PAN_SPESA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SPESA_APRICAPIORI1)
    {
      this.IdxPanelActived = this.PAN_SPESA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCapitoloSpesaOrigine();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SPESA_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_SPESA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SPESA_APRICAPIBIL1)
    {
      this.IdxPanelActived = this.PAN_SPESA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCapitoloSpesaBilancio();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SPESA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SPESA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SPESA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SPESA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ENTRATA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ENTRATA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ENTRATA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ENTRATA, Cancel);
    // Stub
  }

  private void PAN_ENTRATA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ENTRATA_APRICAPIORIG)
    {
      this.IdxPanelActived = this.PAN_ENTRATA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCapitoloEntrataOrigine();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ENTRATA_INFOACC)
    {
      this.IdxPanelActived = this.PAN_ENTRATA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ENTRATA_APRICAPIBILA)
    {
      this.IdxPanelActived = this.PAN_ENTRATA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCapitoloEntrataBilancio();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ENTRATA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ENTRATA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ENTRATA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ENTRATA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, "7992985D-CB8A-4EAD-97F0-D409E46A31CF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, "B401F35E-EAF6-40B2-82EE-243A3F004581");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, "Solo Righe Registrate");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, "B8591EEA-C1B0-4EC3-A63C-2A3AEB8F9E53");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, "DATI MODIFICATI");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, MyGlb.VIS_ETIGRAFONROS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO1, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO1, PPQRY_PARAMETRI655, "A.PARAMESERCIZ", "PARAMESERCIZ", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_LIST, 132);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_LIST, "Solo Righe Registrate");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_FORM, 148, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_FORM, 132);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLORIGHREGI, MyGlb.PANEL_FORM, "Solo Righe Registrate");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLORIGHREGI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLORIGHREGI, PPQRY_PARAMETRI655, "A.PARSOLRIGREG", "PARSOLRIGREG", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLORIGHREGI, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLORIGHREGI, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, MyGlb.PANEL_LIST, 316, 8, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, MyGlb.PANEL_FORM, 312, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICLABEMODI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICLABEMODI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICLABEMODI, -1, "", "ETICLABEMODI", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_Alignment(PFL_PARAMETRI_ETICLABEMODI, 2);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~PARAMESERCIZ~~) ");
    SQL.append("and   ((A.FASE_BILANCIO BETWEEN 0 AND 9)) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_PARAMETRI.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_PARAMETRI_ESERCIZIO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where ((A.FASE_BILANCIO BETWEEN 0 AND 9)) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_PARAMETRI.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_PARAMETRI_ESERCIZIO1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI655", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI655, IMDBDef12.PQRY_PARAMETRI655_RS, IMDBDef4.TBL_PARAMETRI656);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO1, IMDBDef4.FLD_PARAMETRI656_PARAMESERCIZ);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLORIGHREGI, IMDBDef4.FLD_PARAMETRI656_PARSOLRIGREG);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI656");
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

  private void PAN_SPESA_Init()
  {

    PAN_SPESA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SPESA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, "EB2FE401-3364-4419-B786-B529CDB5E45D");
    PAN_SPESA.set_Header(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, "Impegno");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, MyGlb.VIS_GROUPSTYLE);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, MyGlb.PANEL_LIST, 464, -9999, 308, 16, 0, 0);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, MyGlb.PANEL_FORM, 0, 51, 476, 433, 0, 0);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, 0, 51);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, 1, 13);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, 0, 4);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, 1, 4);
    PAN_SPESA.SetFlags(MyGlb.OBJ_GROUP, GRP_SPESA_IMPEGNO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, "B1DAD755-AF49-4626-928E-639A9F269288");
    PAN_SPESA.set_Header(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, "Bilancio");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, MyGlb.VIS_GROUPSTYLE);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, MyGlb.PANEL_LIST, 1156, -9999, 172, 16, 0, 0);
    PAN_SPESA.SetRect(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, MyGlb.PANEL_FORM, 0, 171, 212, 229, 0, 0);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, 0, 43);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, 1, 13);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, 0, 4);
    PAN_SPESA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, 1, 4);
    PAN_SPESA.SetFlags(MyGlb.OBJ_GROUP, GRP_SPESA_BILANCIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SPESA.SetSize(MyGlb.OBJ_FIELD, 42);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, "2010ABAE-3C1F-4666-933B-8B037F17E208");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, "ESERCIZIO");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, "CAA3570F-63C7-49D4-AA88-E1BB8FB396EA");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, "TIPO RIGA");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, "2D9DDA57-9834-439A-A657-0F833F95EBE0");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, "CODICE RIGA");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, "A5E922FB-4760-4A98-A4D5-D2AE52C620FC");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, "E S");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.VIS_NONNULLAFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, 0, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, "388AA43A-BBB9-4675-BBE2-522A72ACA22A");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, "Anno Variazione");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, "32E6C3D0-642E-4003-9EBD-15891E11B310");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, "Titolo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, "11615990-6B12-41E4-841B-2A3B751BF3CA");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, "Capitolo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.VIS_NORFIEINTLUN);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, "FF1AEC62-0B03-4640-8E04-3DAD6B7FD107");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, "Art.");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, "B0E98C00-597B-4E05-827D-7EC2EC6CB3EE");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, " ");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, "Scelta Capitolo");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.VIS_HYPELINKIMMA);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, "0788EE92-B7C0-4717-8F12-EBE84F1A3601");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, "Descrizione Capitolo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, "62D95509-AFEA-44A6-AD96-7F20DE5F700D");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, "Numero");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, "8D4B7E61-A0F8-4BC0-9A0F-614425E35B5F");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, "Anno");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, "B18F931C-5899-471B-A848-3ACFBD9E0DB4");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, " ");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, "A248830F-C4E3-48B1-9EA5-DE02BF682133");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, "Descrizione");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, "E7CEA995-6E52-4FB2-ABE9-8C3D0DB008F2");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, "Importo Variazione");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, "039CBFC5-5B26-4C5E-A8D3-A6530372E0CA");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, " ");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, "Gestione Avanzo");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.VIS_CHECKSTYLE);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, "DD6B719D-1683-4D49-A3E7-2D5AE3DE7C0E");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, "Avanzo ");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, "9999FAA0-A2C7-430B-B6D3-77E96AF0530A");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, "Assegnato Bilancio");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.VIS_NORFIECF4IMP);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, "965B9512-5DBD-46EB-8F61-828C5E723826");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, "E S DESTINAZIONE");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, "B8823467-8466-40ED-9DC4-490511924777");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, "Capitolo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.VIS_NORFIEINTLUN);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, "6C2EDB1E-884C-4D58-A0BC-7CA64520661A");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, "Art.");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, "13EF0036-7BF8-474D-9A95-209AB03BB881");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, " ");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, "Scelta Capitolo Bilancio");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.VIS_HYPELINKIMMA);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, "0E180637-2242-4CBB-9195-DE6986E57676");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, "Note");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, "84CD1272-7935-439E-A807-5DCA8D1FE900");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, "Tipo Avanzo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, "F5DEC339-0D97-4C2A-BCC0-0E97CE7FB24D");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, "Unità Organizzativa");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, "B7F81065-1D2B-4724-9E72-C1317B34A4ED");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, "Tipo Vincolo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, "5B20E5BA-BAE1-4287-B0FE-B7BC9143AA8C");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, "Finanziamento");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, "0649AD58-5167-426F-A86C-326DA3A71D25");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, "Opera");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.VIS_NORMALFIELDS);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, "53A9B220-600B-4AE4-93D1-468893F39281");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, "Riga Avanzo");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, "491C206F-AB15-4A4C-A4C8-F1D2BC28F4F5");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, "STATO");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, "1FBA3896-A8AF-486E-B466-E7E07A23C20C");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, "IMPORTO AVANZO INIZIALE");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, "0B1D4B9F-662B-4213-A1E5-5A7E424A755D");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, "PRIMO ANNO");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, "09ACB92D-20FA-43EE-8DA4-2F3E23C69121");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, "MODIFICABILE");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, "369D4A6A-8237-41ED-BA8D-373B6E6459DF");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, "Ordinamento 1");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, "F457C56E-C75F-494C-A55E-577401D83DC0");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, "SESSIONE");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, "7BE29EDB-ACBC-475A-B43F-F2B8C6068E77");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, "DATA REG");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, "0133656C-0553-4AE8-A17E-1BFB36F7E7E2");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, MyGlb.VIS_DISABIIMPORT);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SPESA.SetSumField(PFL_SPESA_SOMMDIIMPAV1, PFL_SPESA_IMPORTAVANZ1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, "9C02E80E-A131-4562-8911-CA0751E86D86");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, MyGlb.VIS_DISABIIMPORT);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SPESA.SetSumField(PFL_SPESA_SOMMDIIMPBI1, PFL_SPESA_IMPORTBILAN1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, "EE9551CE-E8F1-4CA0-8AF2-E6896870C52E");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, "Saldo:");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, MyGlb.VIS_VUOTONORMALE);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, "EE17173C-DD56-410D-A169-B07987FB460F");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, MyGlb.VIS_CAMPTOTADISA);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, "E9D87022-2FA9-4AAE-9181-2D45D7A4182F");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, "Progr UO");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.VIS_NORMFIELPADR);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SPESA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, "5CB144FF-3557-49D7-92B4-38694724823B");
    PAN_SPESA.set_Header(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, "PROGRESSIVO");
    PAN_SPESA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, "");
    PAN_SPESA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SPESA.SetFlags(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_SPESA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_LIST, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_LIST, "ESER.");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ESERCIZIO2, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ESERCIZIO2, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ESERCIZIO2, PPQRY_WRKGESTIAVA1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_LIST, 68);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_LIST, "TIPO RIGA");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_FORM, 156, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_FORM, 80);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPORIGA1, MyGlb.PANEL_FORM, "TIPO RIGA");
    PAN_SPESA.SetFieldPage(PFL_SPESA_TIPORIGA1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_TIPORIGA1, PPQRY_WRKGESTIAVA1, "A.TIPO_RIGA", "TIPO_RIGA", 5, 10, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_LIST, 4, 244, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_LIST, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_LIST, "CODICE RIGA");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_FORM, 4, 28, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CODICERIGA1, MyGlb.PANEL_FORM, "CODICE RIGA");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CODICERIGA1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CODICERIGA1, PPQRY_WRKGESTIAVA1, "A.CODICE_RIGA", "CODICE_RIGA", 5, 50, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_LIST, 24);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_LIST, "E S");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ES1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ES1, PPQRY_WRKGESTIAVA1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_LIST, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_LIST, "Anno Variazione");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_FORM, 372, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_FORM, 80);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOVAR1, MyGlb.PANEL_FORM, "Ann. Variaz.");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ANNOVAR1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ANNOVAR1, PPQRY_WRKGESTIAVA1, "A.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_LIST, 68, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_LIST, 52);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_LIST, "Titolo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_FORM, 4, 400, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_FORM, 52);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TITOLO1, MyGlb.PANEL_FORM, "Titolo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_TITOLO1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_TITOLO1, PPQRY_WRKGESTIAVA1, "A.TITOLO", "TITOLO", 5, 2, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_LIST, 120, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_LIST, 116);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_FORM, 196, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITOORIGI1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CAPITOORIGI1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CAPITOORIGI1, PPQRY_WRKGESTIAVA1, "A.CAPITOLO_ORIGINE", "CAPITOLO_ORIGINE", 3, 16, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_LIST, 228, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_LIST, 116);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_LIST, "Art.");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_FORM, 372, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICOORIGI1, MyGlb.PANEL_FORM, "Art.");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ARTICOORIGI1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ARTICOORIGI1, PPQRY_WRKGESTIAVA1, "A.ARTICOLO_ORIGINE", "ARTICOLO_ORIGINE", 1, 2, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_LIST, 260, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_LIST, 156);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_LIST, " ");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_FORM, 4, 352, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_FORM, 156);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIORI1, MyGlb.PANEL_FORM, " ");
    PAN_SPESA.SetFieldPage(PFL_SPESA_APRICAPIORI1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_APRICAPIORI1, PPQRY_DUAL1, "DECODE(~~STATO~~, 'N', 'A', NULL)", "APRICAPIORIG", 5, 99, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIORI1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_LIST, 284, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_FORM, 4, 316, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_FORM, 2);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPDESCRIZI1, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CAPDESCRIZI1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CAPDESCRIZI1, PPQRY_CAP1, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_LIST, 464, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_LIST, 104);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_LIST, "Numero");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_FORM, 196, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_FORM, 128);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_NUMEROIMPAC1, MyGlb.PANEL_FORM, "Numero");
    PAN_SPESA.SetFieldPage(PFL_SPESA_NUMEROIMPAC1, -1, GRP_SPESA_IMPEGNO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_NUMEROIMPAC1, PPQRY_WRKGESTIAVA1, "A.NUMERO_IMPACC", "NUMERO_IMPACC", 1, 5, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_LIST, 520, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_LIST, 88);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_LIST, "Anno");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ANNOIMPACC1, MyGlb.PANEL_FORM, "Anno");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ANNOIMPACC1, -1, GRP_SPESA_IMPEGNO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ANNOIMPACC1, PPQRY_WRKGESTIAVA1, "A.ANNO_IMPACC", "ANNO_IMPACC", 1, 4, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_LIST, 568, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_LIST, 112);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_LIST, " ");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 460, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_FORM, 112);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_INFOIMPEGNO, MyGlb.PANEL_FORM, " ");
    PAN_SPESA.SetFieldPage(PFL_SPESA_INFOIMPEGNO, -1, GRP_SPESA_IMPEGNO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_INFOIMPEGNO, PPQRY_IMP, "'I'", "INFOIMPEGNO", 5, 1, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_INFOIMPEGNO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_LIST, 592, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_FORM, 4, 424, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SPESA.SetFieldPage(PFL_SPESA_IMPDESCRIZIO, -1, GRP_SPESA_IMPEGNO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_IMPDESCRIZIO, PPQRY_IMP, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_LIST, 772, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_LIST, 136);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_LIST, "Importo Variazione");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTVARIA1, MyGlb.PANEL_FORM, "Imp. Variazione");
    PAN_SPESA.SetFieldPage(PFL_SPESA_IMPORTVARIA1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_IMPORTVARIA1, PPQRY_WRKGESTIAVA1, "A.IMPORTO_VARIAZIONE", "IMPORTO_VARIAZIONE", 3, 14, 2, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_LIST, 892, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_LIST, 48);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_LIST, " ");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_FORM, 332, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_FORM, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CKGESTIAVAN1, MyGlb.PANEL_FORM, " ");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CKGESTIAVAN1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CKGESTIAVAN1, PPQRY_WRKGESTIAVA1, "A.CK_GESTIONE_AVANZO", "CK_GESTIONE_AVANZO", 5, 2, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_CKGESTIAVAN1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_CKGESTIAVAN1, (new IDVariant()), "Null", "", "", -1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_LIST, 916, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_LIST, 112);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_LIST, "Avanzo ");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTAVANZ1, MyGlb.PANEL_FORM, "Avanzo ");
    PAN_SPESA.SetFieldPage(PFL_SPESA_IMPORTAVANZ1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_IMPORTAVANZ1, PPQRY_WRKGESTIAVA1, "A.IMPORTO_AVANZO", "IMPORTO_AVANZO", 3, 14, 2, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_LIST, 1036, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_LIST, 120);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_LIST, "Assegnato Bilancio");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPORTBILAN1, MyGlb.PANEL_FORM, "Asseg. Bilancio");
    PAN_SPESA.SetFieldPage(PFL_SPESA_IMPORTBILAN1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_IMPORTBILAN1, PPQRY_WRKGESTIAVA1, "A.IMPORTO_BILANCIO", "IMPORTO_BILANCIO", 3, 14, 2, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_LIST, 908, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_LIST, 108);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_LIST, "E S D.");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_FORM, 4, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ESDESTINAZI1, MyGlb.PANEL_FORM, "E S DESTIN.");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ESDESTINAZI1, -1, GRP_SPESA_BILANCIO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ESDESTINAZI1, PPQRY_WRKGESTIAVA1, "A.E_S_DESTINAZIONE", "E_S_DESTINAZIONE", 5, 1, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_LIST, 1156, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_LIST, 148);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_CAPITODESTI1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_CAPITODESTI1, -1, GRP_SPESA_BILANCIO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_CAPITODESTI1, PPQRY_WRKGESTIAVA1, "A.CAPITOLO_DESTINAZIONE", "CAPITOLO_DESTINAZIONE", 3, 16, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_LIST, 1264, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_LIST, 152);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_LIST, "Art.");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ARTICODESTI1, MyGlb.PANEL_FORM, "Art.");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ARTICODESTI1, -1, GRP_SPESA_BILANCIO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ARTICODESTI1, PPQRY_WRKGESTIAVA1, "A.ARTICOLO_DESTINAZIONE", "ARTICOLO_DESTINAZIONE", 1, 2, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_LIST, 1304, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_LIST, 160);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_LIST, " ");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_FORM, 4, 376, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_FORM, 160);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_APRICAPIBIL1, MyGlb.PANEL_FORM, " ");
    PAN_SPESA.SetFieldPage(PFL_SPESA_APRICAPIBIL1, -1, GRP_SPESA_BILANCIO1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_APRICAPIBIL1, PPQRY_DUAL1, "DECODE(~~CK_GESTIONE_AVANZO~~, 'SI', 'A', NULL)", "APRICAPIBILA", 5, 99, 0, -13997);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_SPESA.SetValueListItem(PFL_SPESA_APRICAPIBIL1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_LIST, 1328, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_LIST, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_FORM, 4, 268, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_FORM, 2);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_SPESA.SetFieldPage(PFL_SPESA_NOTE1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_NOTE1, PPQRY_WRKGESTIAVA1, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_LIST, 1508, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_LIST, 84);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_FORM, 4, 244, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_FORM, 96);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOAVANZO1, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_TIPOAVANZO1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_TIPOAVANZO1, PPQRY_WRKGESTIAVA1, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_LIST, 1688, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_LIST, 120);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_FORM, 4, 532, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_FORM, 120);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DESCRIZIONU1, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_SPESA.SetFieldPage(PFL_SPESA_DESCRIZIONU1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_DESCRIZIONU1, PPQRY_IMPUO, "DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1900, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_LIST, 124);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_FORM, 4, 640, 512, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_FORM, 124);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_FORM, 2);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_TIPOVINCOLO1, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_TIPOVINCOLO1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_TIPOVINCOLO1, PPQRY_VINCOLI1, "DECODE(A.TIPO_VINCOLO, to_number(NULL), '', TO_CHAR ( A.TIPO_VINCOLO ) || ' - ' || B.DESCRIZIONE)", "VINCTIPOVINC", 5, 99, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_LIST, 2100, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_LIST, 100);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 580, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_FORM, 100);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_FINANZIAMEN1, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_SPESA.SetFieldPage(PFL_SPESA_FINANZIAMEN1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_FINANZIAMEN1, PPQRY_WRKGESTIAVA1, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_LIST, 2300, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_LIST, 48);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_LIST, "Opera");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_FORM, 4, 556, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_FORM, 48);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_OPERA1, MyGlb.PANEL_FORM, "Opera");
    PAN_SPESA.SetFieldPage(PFL_SPESA_OPERA1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_OPERA1, PPQRY_WRKGESTIAVA1, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_LIST, 80);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_LIST, "Riga Avanzo");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_FORM, 4, 424, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_FORM, 80);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_RIGAAVANZO1, MyGlb.PANEL_FORM, "Riga Avanzo");
    PAN_SPESA.SetFieldPage(PFL_SPESA_RIGAAVANZO1, -1, -1);
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_RIGAAVANZO1, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_RIGAAVANZO1, PPQRY_WRKGESTIAVA1, "DECODE(A.STATO, 'P', 'SI', 'NO')", "RIGAAVANZO", 5, 99, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_LIST, 48);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_LIST, "STATO");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_FORM, 4, 424, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_FORM, 48);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_STATO1, MyGlb.PANEL_FORM, "STATO");
    PAN_SPESA.SetFieldPage(PFL_SPESA_STATO1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_STATO1, PPQRY_WRKGESTIAVA1, "A.STATO", "STATO", 5, 2, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_LIST, 164);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_LIST, "IMPORTO AVANZO INIZIALE");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_FORM, 4, 424, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_FORM, 164);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_IMPOAVANINI1, MyGlb.PANEL_FORM, "IMPORTO AVANZO INIZIALE");
    PAN_SPESA.SetFieldPage(PFL_SPESA_IMPOAVANINI1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_IMPOAVANINI1, PPQRY_WRKGESTIAVA1, "A.IMPORTO_AVANZO_INIZIALE", "IMPORTO_AVANZO_INIZIALE", 3, 14, 2, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_LIST, 80);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_LIST, "PRIMO ANNO");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_FORM, 4, 448, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_FORM, 80);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_PRIMOANNO1, MyGlb.PANEL_FORM, "PRIMO ANNO");
    PAN_SPESA.SetFieldPage(PFL_SPESA_PRIMOANNO1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_PRIMOANNO1, PPQRY_WRKGESTIAVA1, "A.PRIMO_ANNO", "PRIMO_ANNO", 5, 2, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_LIST, 1632, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_LIST, 92);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_LIST, "MODIFICABILE");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_FORM, 4, 424, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_FORM, 92);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_MODIFICABIL1, MyGlb.PANEL_FORM, "MODIFICABILE");
    PAN_SPESA.SetFieldPage(PFL_SPESA_MODIFICABIL1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_MODIFICABIL1, PPQRY_WRKGESTIAVA1, "A.MODIFICABILE", "MODIFICABILE", 5, 2, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_LIST, 92);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_LIST, "Ordinamento 1");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_FORM, 4, 424, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_FORM, 92);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_ORDINAMENTO2, MyGlb.PANEL_FORM, "Ordinamento 1");
    PAN_SPESA.SetFieldPage(PFL_SPESA_ORDINAMENTO2, -1, -1);
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_ORDINAMENTO2, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ORDINAMENTO2, PPQRY_WRKGESTIAVA1, "NVL(A.ANNO_VAR, 9999)", "ORDINAMENTO1", 1, 19, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_LIST, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_FORM, 4, 484, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_FORM, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_SESSIONE1, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_SPESA.SetFieldPage(PFL_SPESA_SESSIONE1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_SESSIONE1, PPQRY_WRKGESTIAVA1, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_LIST, 8, 44, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_LIST, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_LIST, "DATA REG");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_FORM, 12, 492, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_FORM, 64);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_DATAREG1, MyGlb.PANEL_FORM, "DATA REG");
    PAN_SPESA.SetFieldPage(PFL_SPESA_DATAREG1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_DATAREG1, PPQRY_WRKGESTIAVA1, "A.DATA_REG", "DATA_REG", 6, 10, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, MyGlb.PANEL_LIST, 916, 260, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, MyGlb.PANEL_LIST, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, MyGlb.PANEL_FORM, 916, 264, 120, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, MyGlb.PANEL_FORM, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPAV1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetFieldPage(PFL_SPESA_SOMMDIIMPAV1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_SOMMDIIMPAV1, -1, "", "SOMMDIIMPAV1", 0, 0, 0, -13997);
    PAN_SPESA.set_Alignment(PFL_SPESA_SOMMDIIMPAV1, 4);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, MyGlb.PANEL_LIST, 1036, 260, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, MyGlb.PANEL_LIST, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, MyGlb.PANEL_FORM, 924, 272, 120, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, MyGlb.PANEL_FORM, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SOMMDIIMPBI1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetFieldPage(PFL_SPESA_SOMMDIIMPBI1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_SOMMDIIMPBI1, -1, "", "SOMMDIIMPBI1", 0, 0, 0, -13997);
    PAN_SPESA.set_Alignment(PFL_SPESA_SOMMDIIMPBI1, 4);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, MyGlb.PANEL_LIST, 1164, 256, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, MyGlb.PANEL_LIST, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, MyGlb.PANEL_FORM, 1188, 272, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, MyGlb.PANEL_FORM, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_ETICHETSALD1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetFieldPage(PFL_SPESA_ETICHETSALD1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_ETICHETSALD1, -1, "", "ETICHETSALD1", 0, 0, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, MyGlb.PANEL_LIST, 1232, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, MyGlb.PANEL_LIST, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, MyGlb.PANEL_FORM, 1268, 276, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, MyGlb.PANEL_FORM, 0);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_SALDO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetFieldPage(PFL_SPESA_SALDO1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_SALDO1, -1, "", "SALDO1", 0, 0, 0, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_LIST, 60);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_LIST, "Progr UO");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_FORM, 4, 532, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_FORM, 60);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRUO1, MyGlb.PANEL_FORM, "Progr UO");
    PAN_SPESA.SetFieldPage(PFL_SPESA_PROGRUO1, -1, -1);
    PAN_SPESA.SetFieldUnbound(PFL_SPESA_PROGRUO1, true);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_PROGRUO1, PPQRY_WRKGESTIAVA1, "NVL(B.PROGR_UNITA_ORGANIZZATIVA, A_GET_UNITA_ORGANIZZATIVA(A.ESERCIZIO,'S',A.CAPITOLO_ORIGINE,A.ARTICOLO_ORIGINE,TRUNC( SYSDATE )))", "PROGRUO", 3, 28, 6, -13997);
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_SPESA.SetRect(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 532, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SPESA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_FORM, 88);
    PAN_SPESA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_SPESA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SPESA_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_SPESA.SetFieldPage(PFL_SPESA_PROGRESSIVO1, -1, -1);
    PAN_SPESA.SetFieldPanel(PFL_SPESA_PROGRESSIVO1, PPQRY_WRKGESTIAVA1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_SPESA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SPESA.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    PAN_SPESA.SetQuery(PPQRY_CAP1, 0, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_CAP1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(PPQRY_CAP1, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~STATO~~, 'N', 'A', NULL) as APRICAPIORIG, ");
    SQL.append("  DECODE(~~CK_GESTIONE_AVANZO~~, 'SI', 'A', NULL) as APRICAPIBILA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_SPESA.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO, ");
    SQL.append("  'I' as INFOIMPEGNO ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.CODICE(+) = A.TIPO_VINCOLO) ");
    SQL.append("and   (A.ANNO_IMP = ~~ANNO_IMPACC~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMPACC~~) ");
    PAN_SPESA.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(PPQRY_IMP, "IMP");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as IMPUOPROGRUN, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  WRK_GESTIONE_AVANZO B ");
    SQL.append("where (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~PROGRUO~~, -1)) ");
    SQL.append("and   (B.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("order by 2, 3 ");
    PAN_SPESA.SetQuery(PPQRY_IMPUO, 0, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_IMPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(PPQRY_IMPUO, "IMP");
    PAN_SPESA.SetQueryLKE(PPQRY_IMPUO, PFL_SPESA_PROGRUO1, "IMPUOPROGRUN");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as IMPUOPROGRUN, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  WRK_GESTIONE_AVANZO B ");
    SQL.append("where (B.ANNO_IMPACC = A.ANNO_IMP) ");
    SQL.append("and   (B.NUMERO_IMPACC = A.NUMERO_IMP) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("order by 2, 3 ");
    PAN_SPESA.SetQuery(PPQRY_IMPUO, 1, SQL, -1, "");
    PAN_SPESA.SetQueryHeaderColumn(PPQRY_IMPUO, "ORD1", "Ord1");
    PAN_SPESA.SetQueryHeaderColumn(PPQRY_IMPUO, "DESCRIZIONUO", "Descrizione UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(A.TIPO_VINCOLO, to_number(NULL), '', TO_CHAR ( A.TIPO_VINCOLO ) || ' - ' || B.DESCRIZIONE) as VINCTIPOVINC ");
    SQL.append("from ");
    SQL.append("  IMP A, ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.CODICE(+) = A.TIPO_VINCOLO) ");
    SQL.append("and   (A.ANNO_IMP = ~~ANNO_IMPACC~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMPACC~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'VIMP') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  DECODE(C.TIPO_VINCOLO, to_number(NULL), '', TO_CHAR ( C.TIPO_VINCOLO ) || ' - ' || D.DESCRIZIONE) ");
    SQL.append("from ");
    SQL.append("  CAP C, ");
    SQL.append("  VINCOLI D ");
    SQL.append("where (D.CODICE(+) = C.TIPO_VINCOLO) ");
    SQL.append("and   (C.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (C.E_S = ~~E_S~~) ");
    SQL.append("and   (C.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (C.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    PAN_SPESA.SetQuery(PPQRY_VINCOLI1, 0, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_VINCOLI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(PPQRY_VINCOLI1, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SPESA.SetQuery(PPQRY_TIPIAVANZO1, 0, SQL, PFL_SPESA_TIPOAVANZO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SPESA.SetQuery(PPQRY_TIPIAVANZO1, 1, SQL, PFL_SPESA_TIPOAVANZO1, "");
    PAN_SPESA.SetQueryDB(PPQRY_TIPIAVANZO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'VIMP') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.FINANZIAMENTO, ");
    SQL.append("  TO_CHAR ( B.FINANZIAMENTO ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  FINANZIAMENTI C ");
    SQL.append("where (B.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (C.CODICE(+) = B.FINANZIAMENTO) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.OPERA = NVL(~~OPERA~~, B.OPERA)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  F.FINANZIAMENTO, ");
    SQL.append("  TO_CHAR ( F.FINANZIAMENTO ) || ' - ' || G.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI D, ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI E, ");
    SQL.append("  PIANI_CRONOPROGRAMMI F, ");
    SQL.append("  FINANZIAMENTI G ");
    SQL.append("where (F.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (G.CODICE(+) = F.FINANZIAMENTO) ");
    SQL.append("and   (E.CRONOPROGRAMMA_ID = D.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.CRONOPROGRAMMA_ID = E.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.PROGRESSIVO_IMPUTAZIONE = E.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   (F.ESERCIZIO_PLUR = ~~ANNO_VAR~~) ");
    SQL.append("and   (E.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (E.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (D.CONFERMATO_RAG = 'SI') ");
    SQL.append("and   (D.OPERA = NVL(~~OPERA~~, D.OPERA)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_SPESA.SetQuery(PPQRY_FINANZIAMEN1, 0, SQL, PFL_SPESA_FINANZIAMEN1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (~~TIPO_RIGA~~ = 'VIMP') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.FINANZIAMENTO, ");
    SQL.append("  TO_CHAR ( B.FINANZIAMENTO ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  FINANZIAMENTI C ");
    SQL.append("where (C.CODICE(+) = B.FINANZIAMENTO) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.OPERA = NVL(~~OPERA~~, B.OPERA)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  F.FINANZIAMENTO, ");
    SQL.append("  TO_CHAR ( F.FINANZIAMENTO ) || ' - ' || G.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI D, ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI E, ");
    SQL.append("  PIANI_CRONOPROGRAMMI F, ");
    SQL.append("  FINANZIAMENTI G ");
    SQL.append("where (G.CODICE(+) = F.FINANZIAMENTO) ");
    SQL.append("and   (E.CRONOPROGRAMMA_ID = D.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.CRONOPROGRAMMA_ID = E.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.PROGRESSIVO_IMPUTAZIONE = E.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   (F.ESERCIZIO_PLUR = ~~ANNO_VAR~~) ");
    SQL.append("and   (E.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (E.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (D.CONFERMATO_RAG = 'SI') ");
    SQL.append("and   (D.OPERA = NVL(~~OPERA~~, D.OPERA)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_SPESA.SetQuery(PPQRY_FINANZIAMEN1, 1, SQL, PFL_SPESA_FINANZIAMEN1, "");
    PAN_SPESA.SetQueryDB(PPQRY_FINANZIAMEN1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'VIMP') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.OPERA, ");
    SQL.append("  TO_CHAR ( B.OPERA ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (B.OPERA = ~~OPERA~~) ");
    SQL.append("and   (C.CODICE(+) = B.OPERA) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.FINANZIAMENTO = NVL(~~FINANZIAMENTO~~, B.FINANZIAMENTO)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  D.OPERA, ");
    SQL.append("  TO_CHAR ( D.OPERA ) || ' - ' || G.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI D, ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI E, ");
    SQL.append("  PIANI_CRONOPROGRAMMI F, ");
    SQL.append("  OPERE G ");
    SQL.append("where (D.OPERA = ~~OPERA~~) ");
    SQL.append("and   (G.CODICE(+) = D.OPERA) ");
    SQL.append("and   (E.CRONOPROGRAMMA_ID = D.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.CRONOPROGRAMMA_ID = E.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.PROGRESSIVO_IMPUTAZIONE = E.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   (F.ESERCIZIO_PLUR = ~~ANNO_VAR~~) ");
    SQL.append("and   (E.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (E.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (D.CONFERMATO_RAG = 'SI') ");
    SQL.append("and   (F.FINANZIAMENTO = NVL(~~FINANZIAMENTO~~, F.FINANZIAMENTO)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_SPESA.SetQuery(PPQRY_OPERE1, 0, SQL, PFL_SPESA_OPERA1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (~~TIPO_RIGA~~ = 'VIMP') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.OPERA, ");
    SQL.append("  TO_CHAR ( B.OPERA ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (C.CODICE(+) = B.OPERA) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.FINANZIAMENTO = NVL(~~FINANZIAMENTO~~, B.FINANZIAMENTO)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  D.OPERA, ");
    SQL.append("  TO_CHAR ( D.OPERA ) || ' - ' || G.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI D, ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI E, ");
    SQL.append("  PIANI_CRONOPROGRAMMI F, ");
    SQL.append("  OPERE G ");
    SQL.append("where (G.CODICE(+) = D.OPERA) ");
    SQL.append("and   (E.CRONOPROGRAMMA_ID = D.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.CRONOPROGRAMMA_ID = E.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (F.PROGRESSIVO_IMPUTAZIONE = E.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   (F.ESERCIZIO_PLUR = ~~ANNO_VAR~~) ");
    SQL.append("and   (E.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (E.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (D.CONFERMATO_RAG = 'SI') ");
    SQL.append("and   (F.FINANZIAMENTO = NVL(~~FINANZIAMENTO~~, F.FINANZIAMENTO)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPS') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_SPESA.SetQuery(PPQRY_OPERE1, 1, SQL, PFL_SPESA_OPERA1, "");
    PAN_SPESA.SetQueryDB(PPQRY_OPERE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetIMDB(IMDB, "PQRY_WRKGESTIAVA1", true);
    PAN_SPESA.set_SetString(MyGlb.MASTER_ROWNAME, "WRK GESTIONE AVANZO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(A.ANNO_VAR, 9999) as ORDINAMENTO1, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.TIPO_RIGA as TIPO_RIGA, ");
    SQL.append("  A.CODICE_RIGA as CODICE_RIGA, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO_ORIGINE as CAPITOLO_ORIGINE, ");
    SQL.append("  A.ARTICOLO_ORIGINE as ARTICOLO_ORIGINE, ");
    SQL.append("  A.ANNO_IMPACC as ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC as NUMERO_IMPACC, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.IMPORTO_VARIAZIONE as IMPORTO_VARIAZIONE, ");
    SQL.append("  A.CK_GESTIONE_AVANZO as CK_GESTIONE_AVANZO, ");
    SQL.append("  A.IMPORTO_AVANZO as IMPORTO_AVANZO, ");
    SQL.append("  A.IMPORTO_AVANZO_INIZIALE as IMPORTO_AVANZO_INIZIALE, ");
    SQL.append("  A.IMPORTO_BILANCIO as IMPORTO_BILANCIO, ");
    SQL.append("  A.E_S_DESTINAZIONE as E_S_DESTINAZIONE, ");
    SQL.append("  A.CAPITOLO_DESTINAZIONE as CAPITOLO_DESTINAZIONE, ");
    SQL.append("  A.ARTICOLO_DESTINAZIONE as ARTICOLO_DESTINAZIONE, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.PRIMO_ANNO as PRIMO_ANNO, ");
    SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
    SQL.append("  DECODE(A.STATO, 'P', 'SI', 'NO') as RIGAAVANZO, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  NVL(B.PROGR_UNITA_ORGANIZZATIVA, A_GET_UNITA_ORGANIZZATIVA(A.ESERCIZIO,'S',A.CAPITOLO_ORIGINE,A.ARTICOLO_ORIGINE,TRUNC( SYSDATE ))) as PROGRUO, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO ");
    PAN_SPESA.SetQuery(PPQRY_WRKGESTIAVA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_GESTIONE_AVANZO A, ");
    SQL.append("  IMP B ");
    PAN_SPESA.SetQuery(PPQRY_WRKGESTIAVA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_IMP(+) = A.ANNO_IMPACC) ");
    SQL.append("and   (B.NUMERO_IMP(+) = A.NUMERO_IMPACC) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARAMETRI655.PARAMESERCIZ~~) ");
    SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~PQRY_PARAMETRI655.PARSOLRIGREG~~ IS NULL) OR A.STATO = 'P') ");
    PAN_SPESA.SetQuery(PPQRY_WRKGESTIAVA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESA.SetQuery(PPQRY_WRKGESTIAVA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SPESA.SetQuery(PPQRY_WRKGESTIAVA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 1, 6, 8, 9, 10, 11 ");
    PAN_SPESA.SetQuery(PPQRY_WRKGESTIAVA1, 5, SQL, -1, "");
    PAN_SPESA.SetQueryDB(PPQRY_WRKGESTIAVA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SPESA.SetMasterTable(0, "WRK_GESTIONE_AVANZO");
    PAN_SPESA.AddToSortList(PFL_SPESA_ORDINAMENTO2, true);
    PAN_SPESA.AddToSortList(PFL_SPESA_TITOLO1, true);
    PAN_SPESA.AddToSortList(PFL_SPESA_CAPITOORIGI1, true);
    PAN_SPESA.AddToSortList(PFL_SPESA_ARTICOORIGI1, true);
    PAN_SPESA.AddToSortList(PFL_SPESA_ANNOIMPACC1, true);
    PAN_SPESA.AddToSortList(PFL_SPESA_NUMEROIMPAC1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SPESA.Status() == 2)
    {
      int oldListQBE = PAN_SPESA.iUseListQBE;
      PAN_SPESA.iUseListQBE = 0;
      PAN_SPESA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SPESA.PanelCommand(Glb.PCM_FIND);
      PAN_SPESA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ENTRATA_Init()
  {

    PAN_ENTRATA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, "FD05DE91-735B-4C2B-A321-747AA1E161FB");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, "Accertamento");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, MyGlb.PANEL_LIST, 464, -9999, 308, 16, 0, 0);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 51, 476, 433, 0, 0);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, 0, 81);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, 1, 13);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, 0, 4);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, 1, 4);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_GROUP, GRP_ENTRATA_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, "EFBCC7DC-D3C5-4381-ACB2-9AF34C681A59");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, "Bilancio");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, MyGlb.VIS_GROUPSTYLE);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, MyGlb.PANEL_LIST, 1156, -9999, 172, 16, 0, 0);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, MyGlb.PANEL_FORM, 0, 171, 212, 229, 0, 0);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, 0, 43);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, 1, 13);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, 0, 4);
    PAN_ENTRATA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, 1, 4);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_GROUP, GRP_ENTRATA_BILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ENTRATA.SetSize(MyGlb.OBJ_FIELD, 42);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, "E05F97C3-BA8C-497B-B95B-D6A1941B221F");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, "ESERCIZIO");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, "9BA91841-C119-41D8-AA77-AF4A609F0D61");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, "TIPO RIGA");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, "8D7B8F60-DDB2-40A1-92AB-298CEF69215F");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, "CODICE RIGA");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, "A80B3956-4586-460B-82A0-693C8CE262D5");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, "E S");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, 0, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, "FDDE5075-30E9-4623-969B-CBB3DCBEEA36");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, "Anno Variazione");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, "71944040-655B-43A0-86A9-481917CD7699");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, "Titolo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, "13197F98-9102-48F1-8E54-32388AF97CC2");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, "Capitolo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.VIS_NORFIEINTLUN);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, "5DEDB4A1-A89C-4D5E-B6E6-31872BC17AEB");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, "Art.");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, "41760E1F-1C42-4550-982B-DDC9C8BFB9ED");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, " ");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, "Scelta Capitolo");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.VIS_HYPELINKIMMA);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, "DE829C06-1269-462C-BB72-19919D911697");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, "Descrizione Capitolo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, "B28F5678-8107-46A9-8070-01FD940F546D");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, "Numero");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, "65FE66D9-E673-4DFB-9453-0FF6C1C1C117");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, "Anno");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, "CB1D6781-14DE-4EF4-B4BC-C17FD7332DF7");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, " ");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, "82B18600-EC42-4E7F-88B8-1D8A51D7CBB8");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, "Descrizione");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, "B5971B2E-740C-4033-9BCC-DE78D445BFD7");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, "Importo Variazione");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, "B429C0DC-3D8C-4552-8820-6185527A99F4");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, " ");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, "Gestione Avanzo");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.VIS_CHECKSTYLE);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, "DB17B494-476D-4090-853A-9B6AD9E11673");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, "Avanzo ");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, "66BB0779-B539-4B03-83F8-121D770E8AA7");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, "Assegnato Bilancio");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.VIS_NORFIECF4IMP);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, "1EA9D081-C90C-43F5-8AAC-9E348626AE0F");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, "E S DESTINAZIONE");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, "B46E3D65-8903-4327-9065-D5BE5F2796DB");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, "Capitolo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.VIS_NORFIEINTLUN);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, "25A3F1F4-3C6A-4E59-956B-D12FBA0B4A53");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, "Art.");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, "607B1F2F-F80F-488E-9541-26532CF0842E");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, " ");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, "Scelta Capitolo Bilancio");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.VIS_HYPELINKIMMA);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, "4B41E476-A8BE-4B9A-90FC-735DAF45D8C5");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, "Note");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, "ABA88FFE-2AFA-4EF7-BD18-E4DD0362A380");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, "Tipo Avanzo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, "FFD32CA2-94AF-4E63-83C7-FAEE36CD10C6");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, "Unità Organizzativa");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, "03EF40FA-CB0D-4D71-ABA3-8FAF98BE1E4E");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, "Tipo Vincolo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, "8474DFA3-0F0A-4C09-8999-24AEBCB5EEA3");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, "Finanziamento");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, "CC16FA9A-AA5F-4B74-B6FA-CA5A604BF6F7");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, "Opera");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, "F48EAE41-3D50-43A6-979B-1C504A440767");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, "Riga Avanzo");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, "ACE03B09-DA42-43CD-937F-A8BA3056FBDE");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, "STATO");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, "07F7BEAE-E6A3-40E0-8BAF-BA0318794161");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, "IMPORTO AVANZO INIZIALE");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, "6CD5B989-A60B-47DC-8BCE-3280E0F316CE");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, "PRIMO ANNO");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, "89156AAB-3D2C-4A16-987E-86BFADDA723E");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, "MODIFICABILE");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, "364EBF96-D2A4-4225-AD46-A8A466E8E802");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, "Ordinamento 1");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, "90C73DE9-12AD-4EF6-BA32-2EB0B0253A9D");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, "SESSIONE");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, "C45DD4FF-B2B6-4A47-9C69-22C5718C0EB9");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, "DATA REG");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, "CCA45F2F-CF2E-449C-819F-4E71057BB4A2");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, MyGlb.VIS_DISABIIMPORT);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ENTRATA.SetSumField(PFL_ENTRATA_SOMMDIIMPAVA, PFL_ENTRATA_IMPORTAVANZO);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, "461D2C0B-EEB6-4947-9701-D3119D9C4530");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, MyGlb.VIS_DISABIIMPORT);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ENTRATA.SetSumField(PFL_ENTRATA_SOMMDIIMPBIL, PFL_ENTRATA_IMPORTBILANC);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, "6BE3D692-01BD-4356-AA9E-89C65F908E2F");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, "Saldo:");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, MyGlb.VIS_VUOTONORMALE);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, "79181E00-1B70-4144-83C6-3F29C9CDC90C");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.VIS_CAMPTOTADISA);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, "53657E04-A7A3-4B8C-B48A-D7369823B70F");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, "Progr UO");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.VIS_NORMFIELPADR);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ENTRATA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, "3070500F-3458-4A2C-8C34-3CD820A8C1B4");
    PAN_ENTRATA.set_Header(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, "PROGRESSIVO");
    PAN_ENTRATA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, "");
    PAN_ENTRATA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ENTRATA.SetFlags(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_ENTRATA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ESERCIZIO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ESERCIZIO, PPQRY_WRKGESTIAVAN, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_LIST, 68);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_LIST, "TIPO RIGA");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_FORM, 156, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_FORM, 80);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPORIGA, MyGlb.PANEL_FORM, "TIPO RIGA");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_TIPORIGA, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_TIPORIGA, PPQRY_WRKGESTIAVAN, "A.TIPO_RIGA", "TIPO_RIGA", 5, 10, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_LIST, 4, 244, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_LIST, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_LIST, "CODICE RIGA");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_FORM, 4, 28, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CODICERIGA, MyGlb.PANEL_FORM, "CODICE RIGA");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CODICERIGA, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CODICERIGA, PPQRY_WRKGESTIAVAN, "A.CODICE_RIGA", "CODICE_RIGA", 5, 50, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_LIST, 24);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_LIST, "E S");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ES, MyGlb.PANEL_FORM, "E S");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ES, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ES, PPQRY_WRKGESTIAVAN, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_LIST, "Anno Variazione");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_FORM, 372, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_FORM, 80);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOVAR, MyGlb.PANEL_FORM, "Ann. Variaz.");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ANNOVAR, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ANNOVAR, PPQRY_WRKGESTIAVAN, "A.ANNO_VAR", "ANNO_VAR", 1, 4, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_LIST, 68, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_LIST, 52);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_FORM, 4, 400, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_FORM, 52);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_TITOLO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_TITOLO, PPQRY_WRKGESTIAVAN, "A.TITOLO", "TITOLO", 5, 2, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_LIST, 120, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_LIST, 116);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_FORM, 196, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITOORIGIN, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CAPITOORIGIN, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CAPITOORIGIN, PPQRY_WRKGESTIAVAN, "A.CAPITOLO_ORIGINE", "CAPITOLO_ORIGINE", 3, 16, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_LIST, 228, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_LIST, 116);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_LIST, "Art.");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_FORM, 372, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICOORIGIN, MyGlb.PANEL_FORM, "Art.");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ARTICOORIGIN, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ARTICOORIGIN, PPQRY_WRKGESTIAVAN, "A.ARTICOLO_ORIGINE", "ARTICOLO_ORIGINE", 1, 2, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_LIST, 260, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_LIST, 156);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_LIST, " ");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_FORM, 4, 352, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_FORM, 156);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIORIG, MyGlb.PANEL_FORM, " ");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_APRICAPIORIG, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_APRICAPIORIG, PPQRY_DUAL, "DECODE(~~STATO~~, 'N', 'A', NULL)", "APRICAPIORIG", 5, 99, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIORIG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_LIST, 284, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 316, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CAPDESCRIZIO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_LIST, 464, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_LIST, "Numero");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_FORM, 196, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_FORM, 128);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_NUMEROIMPACC, MyGlb.PANEL_FORM, "Numero");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_NUMEROIMPACC, -1, GRP_ENTRATA_ACCERTAMENTO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_NUMEROIMPACC, PPQRY_WRKGESTIAVAN, "A.NUMERO_IMPACC", "NUMERO_IMPACC", 1, 5, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_LIST, 520, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_LIST, "Anno");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ANNOIMPACC, MyGlb.PANEL_FORM, "Anno");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ANNOIMPACC, -1, GRP_ENTRATA_ACCERTAMENTO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ANNOIMPACC, PPQRY_WRKGESTIAVAN, "A.ANNO_IMPACC", "ANNO_IMPACC", 1, 4, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_LIST, 568, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_LIST, 56);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_LIST, " ");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_FORM, 4, 424, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_FORM, 56);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_INFOACC, MyGlb.PANEL_FORM, " ");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_INFOACC, -1, GRP_ENTRATA_ACCERTAMENTO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_INFOACC, PPQRY_ACC, "'I'", "INFOACC", 5, 1, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_INFOACC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_LIST, 592, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_FORM, 4, 448, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ACCDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ACCDESCRIZIO, -1, GRP_ENTRATA_ACCERTAMENTO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ACCDESCRIZIO, PPQRY_ACC, "A.DESCRIZIONE", "ACCDESCRIZIO", 5, 140, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_LIST, 772, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_LIST, 136);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_LIST, "Importo Variazione");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTVARIAZ, MyGlb.PANEL_FORM, "Imp. Variazione");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_IMPORTVARIAZ, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_IMPORTVARIAZ, PPQRY_WRKGESTIAVAN, "A.IMPORTO_VARIAZIONE", "IMPORTO_VARIAZIONE", 3, 14, 2, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_LIST, 892, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_LIST, 48);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_LIST, " ");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_FORM, 332, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CKGESTIAVANZ, MyGlb.PANEL_FORM, " ");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CKGESTIAVANZ, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CKGESTIAVANZ, PPQRY_WRKGESTIAVAN, "A.CK_GESTIONE_AVANZO", "CK_GESTIONE_AVANZO", 5, 2, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_CKGESTIAVANZ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_CKGESTIAVANZ, (new IDVariant()), "Null", "", "", -1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_LIST, 916, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_LIST, 112);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_LIST, "Avanzo ");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTAVANZO, MyGlb.PANEL_FORM, "Avanzo ");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_IMPORTAVANZO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_IMPORTAVANZO, PPQRY_WRKGESTIAVAN, "A.IMPORTO_AVANZO", "IMPORTO_AVANZO", 3, 14, 2, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_LIST, 1036, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_LIST, 120);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_LIST, "Assegnato Bilancio");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPORTBILANC, MyGlb.PANEL_FORM, "Asseg. Bilancio");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_IMPORTBILANC, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_IMPORTBILANC, PPQRY_WRKGESTIAVAN, "A.IMPORTO_BILANCIO", "IMPORTO_BILANCIO", 3, 14, 2, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_LIST, 908, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_LIST, 108);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_LIST, "E S D.");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_FORM, 4, 172, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ESDESTINAZIO, MyGlb.PANEL_FORM, "E S DESTIN.");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ESDESTINAZIO, -1, GRP_ENTRATA_BILANCIO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ESDESTINAZIO, PPQRY_WRKGESTIAVAN, "A.E_S_DESTINAZIONE", "E_S_DESTINAZIONE", 5, 1, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_LIST, 1156, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_LIST, 148);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_FORM, 4, 196, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_CAPITODESTIN, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_CAPITODESTIN, -1, GRP_ENTRATA_BILANCIO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_CAPITODESTIN, PPQRY_WRKGESTIAVAN, "A.CAPITOLO_DESTINAZIONE", "CAPITOLO_DESTINAZIONE", 3, 16, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_LIST, 1264, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_LIST, 152);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_LIST, "Art.");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_FORM, 4, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ARTICODESTIN, MyGlb.PANEL_FORM, "Art.");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ARTICODESTIN, -1, GRP_ENTRATA_BILANCIO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ARTICODESTIN, PPQRY_WRKGESTIAVAN, "A.ARTICOLO_DESTINAZIONE", "ARTICOLO_DESTINAZIONE", 1, 2, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_LIST, 1304, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_LIST, 160);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_LIST, " ");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_FORM, 4, 376, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_FORM, 160);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_APRICAPIBILA, MyGlb.PANEL_FORM, " ");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_APRICAPIBILA, -1, GRP_ENTRATA_BILANCIO);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_APRICAPIBILA, PPQRY_DUAL, "DECODE(~~CK_GESTIONE_AVANZO~~, 'SI', DECODE(SIGN(~~IMPORTO_VARIAZIONE~~), -1, NULL, 'A'), NULL)", "APRICAPIBILA", 5, 99, 0, -13997);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ENTRATA.SetValueListItem(PFL_ENTRATA_APRICAPIBILA, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_LIST, 1328, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_LIST, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_LIST, "Note");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_FORM, 4, 268, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_FORM, 2);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_NOTE, MyGlb.PANEL_FORM, "Note");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_NOTE, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_NOTE, PPQRY_WRKGESTIAVAN, "A.NOTE", "NOTE", 5, 2000, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_LIST, 1508, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_FORM, 4, 244, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_FORM, 96);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_TIPOAVANZO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_TIPOAVANZO, PPQRY_WRKGESTIAVAN, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_LIST, 1688, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_LIST, 120);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 532, 628, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_FORM, 120);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DESCRIZIONUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_DESCRIZIONUO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_DESCRIZIONUO, PPQRY_ACCUO, "DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_LIST, 1900, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_LIST, 100);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_FORM, 4, 556, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_FORM, 100);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_TIPOVINCOLO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_TIPOVINCOLO, PPQRY_VINCOLI, "DECODE(A.TIPO_VINCOLO, to_number(NULL), '', TO_CHAR ( A.TIPO_VINCOLO ) || ' - ' || B.DESCRIZIONE)", "VINCTIPOVINC", 5, 99, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_LIST, 2100, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 580, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_FINANZIAMENT, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_FINANZIAMENT, PPQRY_WRKGESTIAVAN, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_LIST, 2300, 36, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_FORM, 4, 604, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_OPERA, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_OPERA, PPQRY_WRKGESTIAVAN, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_LIST, 80);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_LIST, "Riga Avanzo");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_FORM, 4, 424, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_FORM, 80);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_RIGAAVANZO, MyGlb.PANEL_FORM, "Riga Avanzo");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_RIGAAVANZO, -1, -1);
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_RIGAAVANZO, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_RIGAAVANZO, PPQRY_WRKGESTIAVAN, "DECODE(A.STATO, 'P', 'SI', 'NO')", "RIGAAVANZO", 5, 99, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_LIST, 48);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_LIST, "STATO");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_FORM, 4, 424, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_FORM, 48);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_STATO, MyGlb.PANEL_FORM, "STATO");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_STATO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_STATO, PPQRY_WRKGESTIAVAN, "A.STATO", "STATO", 5, 2, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_LIST, 0, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_LIST, 164);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_LIST, "IMPORTO AVANZO INIZIALE");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_FORM, 4, 424, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_FORM, 164);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_IMPOAVANINIZ, MyGlb.PANEL_FORM, "IMPORTO AVANZO INIZIALE");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_IMPOAVANINIZ, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_IMPOAVANINIZ, PPQRY_WRKGESTIAVAN, "A.IMPORTO_AVANZO_INIZIALE", "IMPORTO_AVANZO_INIZIALE", 3, 14, 2, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_LIST, 80);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_LIST, "PRIMO ANNO");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_FORM, 4, 448, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_FORM, 80);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PRIMOANNO, MyGlb.PANEL_FORM, "PRIMO ANNO");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_PRIMOANNO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_PRIMOANNO, PPQRY_WRKGESTIAVAN, "A.PRIMO_ANNO", "PRIMO_ANNO", 5, 2, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_LIST, 1632, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_LIST, 92);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_LIST, "MODIFICABILE");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_FORM, 4, 424, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_FORM, 92);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_MODIFICABILE, MyGlb.PANEL_FORM, "MODIFICABILE");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_MODIFICABILE, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_MODIFICABILE, PPQRY_WRKGESTIAVAN, "A.MODIFICABILE", "MODIFICABILE", 5, 2, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_LIST, 92);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_LIST, "Ordinamento 1");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_FORM, 4, 424, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_FORM, 92);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_ORDINAMENTO1, MyGlb.PANEL_FORM, "Ordinamento 1");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ORDINAMENTO1, -1, -1);
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_ORDINAMENTO1, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ORDINAMENTO1, PPQRY_WRKGESTIAVAN, "NVL(A.ANNO_VAR, 9999)", "ORDINAMENTO1", 1, 19, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_LIST, "SESSIONE");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_FORM, 4, 484, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_SESSIONE, MyGlb.PANEL_FORM, "SESSIONE");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_SESSIONE, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_SESSIONE, PPQRY_WRKGESTIAVAN, "A.SESSIONE", "SESSIONE", 3, 10, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_LIST, 1688, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_LIST, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_LIST, "DATA REG");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_FORM, 12, 492, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_FORM, 64);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_DATAREG, MyGlb.PANEL_FORM, "DATA REG");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_DATAREG, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_DATAREG, PPQRY_WRKGESTIAVAN, "A.DATA_REG", "DATA_REG", 6, 10, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, MyGlb.PANEL_LIST, 916, 260, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, MyGlb.PANEL_LIST, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, MyGlb.PANEL_FORM, 916, 264, 120, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, MyGlb.PANEL_FORM, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPAVA, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_SOMMDIIMPAVA, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_SOMMDIIMPAVA, -1, "", "SOMMDIIMPAVA", 0, 0, 0, -13997);
    PAN_ENTRATA.set_Alignment(PFL_ENTRATA_SOMMDIIMPAVA, 4);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, MyGlb.PANEL_LIST, 1036, 260, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, MyGlb.PANEL_LIST, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, MyGlb.PANEL_FORM, 924, 272, 120, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, MyGlb.PANEL_FORM, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SOMMDIIMPBIL, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_SOMMDIIMPBIL, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_SOMMDIIMPBIL, -1, "", "SOMMDIIMPBIL", 0, 0, 0, -13997);
    PAN_ENTRATA.set_Alignment(PFL_ENTRATA_SOMMDIIMPBIL, 4);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, MyGlb.PANEL_LIST, 1164, 256, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, MyGlb.PANEL_LIST, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, MyGlb.PANEL_FORM, 1188, 272, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, MyGlb.PANEL_FORM, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_ETICHETSALDO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_ETICHETSALDO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_ETICHETSALDO, -1, "", "ETICHETSALDO", 0, 0, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_LIST, 1232, 256, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_LIST, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_FORM, 1268, 276, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_FORM, 0);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_SALDO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_SALDO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_SALDO, -1, "", "SALDO", 0, 0, 0, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_LIST, 60);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_LIST, "Progr UO");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_FORM, 4, 532, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_FORM, 60);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRUO, MyGlb.PANEL_FORM, "Progr UO");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_PROGRUO, -1, -1);
    PAN_ENTRATA.SetFieldUnbound(PFL_ENTRATA_PROGRUO, true);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_PROGRUO, PPQRY_WRKGESTIAVAN, "NVL(B.PROGR_UNITA_ORGANIZZATIVA, A_GET_UNITA_ORGANIZZATIVA(A.ESERCIZIO,'S',A.CAPITOLO_ORIGINE,A.ARTICOLO_ORIGINE,TRUNC( SYSDATE )))", "PROGRUO", 3, 28, 6, -13997);
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_ENTRATA.SetRect(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 532, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ENTRATA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_ENTRATA.SetNumRow(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ENTRATA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ENTRATA_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_ENTRATA.SetFieldPage(PFL_ENTRATA_PROGRESSIVO, -1, -1);
    PAN_ENTRATA.SetFieldPanel(PFL_ENTRATA_PROGRESSIVO, PPQRY_WRKGESTIAVAN, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_ENTRATA_InitQueries()
  {
    StringBuffer SQL;

    PAN_ENTRATA.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.E_S = ~~E_S~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    PAN_ENTRATA.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~STATO~~, 'N', 'A', NULL) as APRICAPIORIG, ");
    SQL.append("  DECODE(~~CK_GESTIONE_AVANZO~~, 'SI', DECODE(SIGN(~~IMPORTO_VARIAZIONE~~), -1, NULL, 'A'), NULL) as APRICAPIBILA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_ENTRATA.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ACCDESCRIZIO, ");
    SQL.append("  'I' as INFOACC ");
    SQL.append("from ");
    SQL.append("  ACC A ");
    SQL.append("where (A.ANNO_ACC = ~~ANNO_IMPACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~NUMERO_IMPACC~~) ");
    PAN_ENTRATA.SetQuery(PPQRY_ACC, 0, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_ACC, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(PPQRY_ACC, "ACC");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as ACCUOPROGRUN, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  WRK_GESTIONE_AVANZO B ");
    SQL.append("where (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~PROGRUO~~, -1)) ");
    SQL.append("and   (B.ANNO_IMPACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_IMPACC = A.NUMERO_ACC) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.E_S = 'E') ");
    SQL.append("order by 2, 3 ");
    PAN_ENTRATA.SetQuery(PPQRY_ACCUO, 0, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_ACCUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(PPQRY_ACCUO, "ACC");
    PAN_ENTRATA.SetQueryLKE(PPQRY_ACCUO, PFL_ENTRATA_PROGRUO, "ACCUOPROGRUN");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) as ACCUOPROGRUN, ");
    SQL.append("  CASE WHEN (A.PROGR_UNITA_ORGANIZZATIVA IS NULL) THEN 0 ELSE 1 END as ORD1, ");
    SQL.append("  DECODE(A.PROGR_UNITA_ORGANIZZATIVA, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))) as DESCRIZIONUO ");
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  WRK_GESTIONE_AVANZO B ");
    SQL.append("where (B.ANNO_IMPACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_IMPACC = A.NUMERO_ACC) ");
    SQL.append("and   (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.E_S = 'E') ");
    SQL.append("order by 2, 3 ");
    PAN_ENTRATA.SetQuery(PPQRY_ACCUO, 1, SQL, -1, "");
    PAN_ENTRATA.SetQueryHeaderColumn(PPQRY_ACCUO, "ORD1", "Ord1");
    PAN_ENTRATA.SetQueryHeaderColumn(PPQRY_ACCUO, "DESCRIZIONUO", "Descrizione UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(A.TIPO_VINCOLO, to_number(NULL), '', TO_CHAR ( A.TIPO_VINCOLO ) || ' - ' || B.DESCRIZIONE) as VINCTIPOVINC ");
    SQL.append("from ");
    SQL.append("  ACC A, ");
    SQL.append("  VINCOLI B ");
    SQL.append("where (B.CODICE(+) = A.TIPO_VINCOLO) ");
    SQL.append("and   (A.ANNO_ACC = ~~ANNO_IMPACC~~) ");
    SQL.append("and   (A.NUMERO_ACC = ~~NUMERO_IMPACC~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'VACC') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  DECODE(C.TIPO_VINCOLO, to_number(NULL), '', TO_CHAR ( C.TIPO_VINCOLO ) || ' - ' || D.DESCRIZIONE) ");
    SQL.append("from ");
    SQL.append("  CAP C, ");
    SQL.append("  VINCOLI D ");
    SQL.append("where (D.CODICE(+) = C.TIPO_VINCOLO) ");
    SQL.append("and   (C.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (C.E_S = ~~E_S~~) ");
    SQL.append("and   (C.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (C.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    PAN_ENTRATA.SetQuery(PPQRY_VINCOLI, 0, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(PPQRY_VINCOLI, "ACC");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ENTRATA.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_ENTRATA_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ENTRATA.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_ENTRATA_TIPOAVANZO, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'VACC') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.FINANZIAMENTO, ");
    SQL.append("  TO_CHAR ( B.FINANZIAMENTO ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  FINANZIAMENTI C ");
    SQL.append("where (B.FINANZIAMENTO = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (C.CODICE(+) = B.FINANZIAMENTO) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.OPERA = NVL(~~OPERA~~, B.OPERA)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  E.FINANZIAMENTO_LIGHT, ");
    SQL.append("  TO_CHAR ( E.FINANZIAMENTO_LIGHT ) || ' - ' || F.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ESEACC D, ");
    SQL.append("  ACC E, ");
    SQL.append("  FINANZIAMENTI F ");
    SQL.append("where (E.FINANZIAMENTO_LIGHT = ~~FINANZIAMENTO~~) ");
    SQL.append("and   (F.CODICE(+) = E.FINANZIAMENTO_LIGHT) ");
    SQL.append("and   (E.ANNO_ACC = D.ANNO_ACC) ");
    SQL.append("and   (E.NUMERO_ACC = D.NUMERO_ACC) ");
    SQL.append("and   (D.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (D.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (D.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (NVL(E.OPERA_LIGHT, -1) = NVL(~~OPERA~~, NVL(E.OPERA_LIGHT, -1))) ");
    SQL.append("and   (NOT ((E.FINANZIAMENTO_LIGHT IS NULL))) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_ENTRATA.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_ENTRATA_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (~~TIPO_RIGA~~ = 'VACC') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.FINANZIAMENTO, ");
    SQL.append("  TO_CHAR ( B.FINANZIAMENTO ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  FINANZIAMENTI C ");
    SQL.append("where (C.CODICE(+) = B.FINANZIAMENTO) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.OPERA = NVL(~~OPERA~~, B.OPERA)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  E.FINANZIAMENTO_LIGHT, ");
    SQL.append("  TO_CHAR ( E.FINANZIAMENTO_LIGHT ) || ' - ' || F.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ESEACC D, ");
    SQL.append("  ACC E, ");
    SQL.append("  FINANZIAMENTI F ");
    SQL.append("where (F.CODICE(+) = E.FINANZIAMENTO_LIGHT) ");
    SQL.append("and   (E.ANNO_ACC = D.ANNO_ACC) ");
    SQL.append("and   (E.NUMERO_ACC = D.NUMERO_ACC) ");
    SQL.append("and   (D.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (D.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (D.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (NVL(E.OPERA_LIGHT, -1) = NVL(~~OPERA~~, NVL(E.OPERA_LIGHT, -1))) ");
    SQL.append("and   (NOT ((E.FINANZIAMENTO_LIGHT IS NULL))) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_ENTRATA.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_ENTRATA_FINANZIAMENT, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'VACC') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.OPERA, ");
    SQL.append("  TO_CHAR ( B.OPERA ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (B.OPERA = ~~OPERA~~) ");
    SQL.append("and   (C.CODICE(+) = B.OPERA) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.FINANZIAMENTO = NVL(~~FINANZIAMENTO~~, B.FINANZIAMENTO)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  E.OPERA_LIGHT, ");
    SQL.append("  TO_CHAR ( E.OPERA_LIGHT ) || ' - ' || F.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ESEACC D, ");
    SQL.append("  ACC E, ");
    SQL.append("  OPERE F ");
    SQL.append("where (E.OPERA_LIGHT = ~~OPERA~~) ");
    SQL.append("and   (F.CODICE(+) = E.OPERA_LIGHT) ");
    SQL.append("and   (E.ANNO_ACC = D.ANNO_ACC) ");
    SQL.append("and   (E.NUMERO_ACC = D.NUMERO_ACC) ");
    SQL.append("and   (D.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (D.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (D.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (NVL(E.FINANZIAMENTO_LIGHT, -1) = NVL(~~FINANZIAMENTO~~, NVL(E.FINANZIAMENTO_LIGHT, -1))) ");
    SQL.append("and   (NOT ((E.OPERA_LIGHT IS NULL))) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_ENTRATA.SetQuery(PPQRY_OPERE, 0, SQL, PFL_ENTRATA_OPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (~~TIPO_RIGA~~ = 'VACC') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.OPERA, ");
    SQL.append("  TO_CHAR ( B.OPERA ) || ' - ' || C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_FIN B, ");
    SQL.append("  OPERE C ");
    SQL.append("where (C.CODICE(+) = B.OPERA) ");
    SQL.append("and   (B.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (B.E_S = ~~E_S~~) ");
    SQL.append("and   (B.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (B.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (B.FINANZIAMENTO = NVL(~~FINANZIAMENTO~~, B.FINANZIAMENTO)) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  E.OPERA_LIGHT, ");
    SQL.append("  TO_CHAR ( E.OPERA_LIGHT ) || ' - ' || F.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  ESEACC D, ");
    SQL.append("  ACC E, ");
    SQL.append("  OPERE F ");
    SQL.append("where (F.CODICE(+) = E.OPERA_LIGHT) ");
    SQL.append("and   (E.ANNO_ACC = D.ANNO_ACC) ");
    SQL.append("and   (E.NUMERO_ACC = D.NUMERO_ACC) ");
    SQL.append("and   (D.ESERCIZIO = ~~ANNO_VAR~~) ");
    SQL.append("and   (D.CAPITOLO = ~~CAPITOLO_ORIGINE~~) ");
    SQL.append("and   (D.ARTICOLO = ~~ARTICOLO_ORIGINE~~) ");
    SQL.append("and   (NVL(E.FINANZIAMENTO_LIGHT, -1) = NVL(~~FINANZIAMENTO~~, NVL(E.FINANZIAMENTO_LIGHT, -1))) ");
    SQL.append("and   (NOT ((E.OPERA_LIGHT IS NULL))) ");
    SQL.append("and   (~~TIPO_RIGA~~ = 'CAPE') ");
    SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
    SQL.append("order by 1 ");
    PAN_ENTRATA.SetQuery(PPQRY_OPERE, 1, SQL, PFL_ENTRATA_OPERA, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetIMDB(IMDB, "PQRY_WRKGESTIAVAN", true);
    PAN_ENTRATA.set_SetString(MyGlb.MASTER_ROWNAME, "WRK GESTIONE AVANZO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(A.ANNO_VAR, 9999) as ORDINAMENTO1, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.SESSIONE as SESSIONE, ");
    SQL.append("  A.TIPO_RIGA as TIPO_RIGA, ");
    SQL.append("  A.CODICE_RIGA as CODICE_RIGA, ");
    SQL.append("  A.TITOLO as TITOLO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO_ORIGINE as CAPITOLO_ORIGINE, ");
    SQL.append("  A.ARTICOLO_ORIGINE as ARTICOLO_ORIGINE, ");
    SQL.append("  A.ANNO_IMPACC as ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC as NUMERO_IMPACC, ");
    SQL.append("  A.ANNO_VAR as ANNO_VAR, ");
    SQL.append("  A.IMPORTO_VARIAZIONE as IMPORTO_VARIAZIONE, ");
    SQL.append("  A.CK_GESTIONE_AVANZO as CK_GESTIONE_AVANZO, ");
    SQL.append("  A.IMPORTO_AVANZO as IMPORTO_AVANZO, ");
    SQL.append("  A.IMPORTO_AVANZO_INIZIALE as IMPORTO_AVANZO_INIZIALE, ");
    SQL.append("  A.IMPORTO_BILANCIO as IMPORTO_BILANCIO, ");
    SQL.append("  A.E_S_DESTINAZIONE as E_S_DESTINAZIONE, ");
    SQL.append("  A.CAPITOLO_DESTINAZIONE as CAPITOLO_DESTINAZIONE, ");
    SQL.append("  A.ARTICOLO_DESTINAZIONE as ARTICOLO_DESTINAZIONE, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.NOTE as NOTE, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.PRIMO_ANNO as PRIMO_ANNO, ");
    SQL.append("  A.MODIFICABILE as MODIFICABILE, ");
    SQL.append("  DECODE(A.STATO, 'P', 'SI', 'NO') as RIGAAVANZO, ");
    SQL.append("  A.DATA_REG as DATA_REG, ");
    SQL.append("  NVL(B.PROGR_UNITA_ORGANIZZATIVA, A_GET_UNITA_ORGANIZZATIVA(A.ESERCIZIO,'S',A.CAPITOLO_ORIGINE,A.ARTICOLO_ORIGINE,TRUNC( SYSDATE ))) as PROGRUO, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA ");
    PAN_ENTRATA.SetQuery(PPQRY_WRKGESTIAVAN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_GESTIONE_AVANZO A, ");
    SQL.append("  ACC B ");
    PAN_ENTRATA.SetQuery(PPQRY_WRKGESTIAVAN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_ACC(+) = A.ANNO_IMPACC) ");
    SQL.append("and   (B.NUMERO_ACC(+) = A.NUMERO_IMPACC) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_PARAMETRI655.PARAMESERCIZ~~) ");
    SQL.append("and   (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   ((~~PQRY_PARAMETRI655.PARSOLRIGREG~~ IS NULL) OR A.STATO = 'P') ");
    PAN_ENTRATA.SetQuery(PPQRY_WRKGESTIAVAN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATA.SetQuery(PPQRY_WRKGESTIAVAN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ENTRATA.SetQuery(PPQRY_WRKGESTIAVAN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 1, 6, 8, 9, 10, 11 ");
    PAN_ENTRATA.SetQuery(PPQRY_WRKGESTIAVAN, 5, SQL, -1, "");
    PAN_ENTRATA.SetQueryDB(PPQRY_WRKGESTIAVAN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ENTRATA.SetMasterTable(0, "WRK_GESTIONE_AVANZO");
    PAN_ENTRATA.AddToSortList(PFL_ENTRATA_ORDINAMENTO1, true);
    PAN_ENTRATA.AddToSortList(PFL_ENTRATA_TITOLO, true);
    PAN_ENTRATA.AddToSortList(PFL_ENTRATA_CAPITOORIGIN, true);
    PAN_ENTRATA.AddToSortList(PFL_ENTRATA_ARTICOORIGIN, true);
    PAN_ENTRATA.AddToSortList(PFL_ENTRATA_ANNOIMPACC, true);
    PAN_ENTRATA.AddToSortList(PFL_ENTRATA_NUMEROIMPACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ENTRATA.Status() == 2)
    {
      int oldListQBE = PAN_ENTRATA.iUseListQBE;
      PAN_ENTRATA.iUseListQBE = 0;
      PAN_ENTRATA.PanelCommand(Glb.PCM_SEARCH);
      PAN_ENTRATA.PanelCommand(Glb.PCM_FIND);
      PAN_ENTRATA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "699FB89B-A7A9-4A4C-8681-5D4DA970A28E");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "AEFF8955-4F4F-48D3-9800-17DB5FD021AD");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "D9EE3CC8-E49E-4A84-942D-178233F63955");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "06385CBC-DD35-4FA5-8372-D970AC089FED");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO16, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO16, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZIO16, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 8, 8, 756, 36, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO16, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO16", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO16, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO16, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_GESTIOAVANZO,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Descrizione') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO16, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO16, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO16, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO16, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO16, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SPESA) PAN_SPESA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_SPESA) PAN_SPESA_ValidateRow(Cancel);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_SPESA) PAN_SPESA_DynamicProperties();
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SPESA) PAN_SPESA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SPESA) PAN_SPESA_OnChangeRow();
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_OnChangeRow();
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
    if (SrcObj == PAN_SPESA) PAN_SPESA_OnChangeStatus(OldStatus);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_SPESA) PAN_SPESA_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SPESA) PAN_SPESA_BeforeInsert(Cancel);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_SPESA) PAN_SPESA_AfterFind(CmdFind);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_SPESA) PAN_SPESA_AfterCommit(RowUpdated, RowError);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SPESA) PAN_SPESA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ENTRATA) PAN_ENTRATA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TABBEDVIEW) TAB_TABBEDVIEW_Click(PreviousPage, Cancel);
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
