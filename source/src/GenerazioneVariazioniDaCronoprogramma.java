// **********************************************
// Generazione Variazioni Da Cronoprogramma
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneVariazioniDaCronoprogramma extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_VARIAZIONI_CRONOPROGRI1 = 0;
  private static int PFL_VARIAZIONI_CODICESTRUT1 = 1;
  private static int PFL_VARIAZIONI_CODPIANOCON1 = 2;
  private static int PFL_VARIAZIONI_CAPITOLO1 = 3;
  private static int PFL_VARIAZIONI_ARTICOLO1 = 4;
  private static int PFL_VARIAZIONI_DUALINFOCAPI = 5;
  private static int PFL_VARIAZIONI_OPERA1 = 6;
  private static int PFL_VARIAZIONI_ESERCIZIPLU1 = 7;
  private static int PFL_VARIAZIONI_OPEREDESCRIZ = 8;
  private static int PFL_VARIAZIONI_FINANZFINANZ = 9;
  private static int PFL_VARIAZIONI_IMPORTO = 10;
  private static int PFL_VARIAZIONI_PROGREIMPUT1 = 11;
  private static int PFL_VARIAZIONI_FINANZIAMEN1 = 12;
  private static int PFL_VARIAZIONI_ANNOVAR = 13;
  private static int PFL_VARIAZIONI_ESERCIISCRIZ = 14;
  private static int PFL_VARIAZIONI_DESCTIPOVARI = 15;
  private static int PFL_VARIAZIONI_TIPOVAR = 16;
  private static int PFL_VARIAZIONI_NUMERORIGA = 17;
  private static int PFL_VARIAZIONI_IMPORTOPURO = 18;
  private static int PFL_VARIAZIONI_IMPORTOREISC = 19;

  private static int PPQRY_GENVARCRONO1 = 0;

  private static int PPQRY_DUAL2 = 1;
  private static int PPQRY_OPERE1 = 2;
  private static int PPQRY_FINANZIAMEN1 = 3;


  IDPanel PAN_VARIAZIONI;
  private static int GRP_VARIAZIMPSUB_IMPEGNO = 0;
  private static int GRP_VARIAZIMPSUB_SUBIMPEGNO = 1;

  private static int PFL_VARIAZIMPSUB_RAGGRUPPAMEN = 0;
  private static int PFL_VARIAZIMPSUB_OPERA = 1;
  private static int PFL_VARIAZIMPSUB_FINANZIAMENT = 2;
  private static int PFL_VARIAZIMPSUB_IMPORVARCRON = 3;
  private static int PFL_VARIAZIMPSUB_DESCRTIPOVAR = 4;
  private static int PFL_VARIAZIMPSUB_CAPITOLO = 5;
  private static int PFL_VARIAZIMPSUB_ARTICOLO = 6;
  private static int PFL_VARIAZIMPSUB_NUMEROIMP = 7;
  private static int PFL_VARIAZIMPSUB_ANNOIMP = 8;
  private static int PFL_VARIAZIMPSUB_DUALINFOIMPE = 9;
  private static int PFL_VARIAZIMPSUB_NUMEROSUBIMP = 10;
  private static int PFL_VARIAZIMPSUB_ANNOSUBIMP = 11;
  private static int PFL_VARIAZIMPSUB_DUALINFOSUB1 = 12;
  private static int PFL_VARIAZIMPSUB_IMPDESCRIZIO = 13;
  private static int PFL_VARIAZIMPSUB_IMPDAREISSTN = 14;
  private static int PFL_VARIAZIMPSUB_DISPONIBILIT = 15;
  private static int PFL_VARIAZIMPSUB_IMPORTVARIAZ = 16;
  private static int PFL_VARIAZIMPSUB_DISPIMPSUB = 17;
  private static int PFL_VARIAZIMPSUB_PROGRSESSION = 18;
  private static int PFL_VARIAZIMPSUB_NUMEROSUBIM1 = 19;
  private static int PFL_VARIAZIMPSUB_ANNOSUBIMP1 = 20;
  private static int PFL_VARIAZIMPSUB_CRONOPROGRID = 21;
  private static int PFL_VARIAZIMPSUB_PROGREIMPUTA = 22;
  private static int PFL_VARIAZIMPSUB_ESERCIZIPLUR = 23;
  private static int PFL_VARIAZIMPSUB_TIPOVARCRONO = 24;
  private static int PFL_VARIAZIMPSUB_ETICHETOTALE = 25;
  private static int PFL_VARIAZIMPSUB_ETICHETOTDIS = 26;
  private static int PFL_VARIAZIMPSUB_ETICHTOTDIS1 = 27;
  private static int PFL_VARIAZIMPSUB_CODICESTRUTT = 28;
  private static int PFL_VARIAZIMPSUB_CODPIANOCONT = 29;
  private static int PFL_VARIAZIMPSUB_ORDNUMEROSUB = 30;
  private static int PFL_VARIAZIMPSUB_ORDANNOSUBIM = 31;
  private static int PFL_VARIAZIMPSUB_IMPORTVARIMP = 32;

  private static int PPQRY_WRKGENVACRV1 = 0;

  private static int PPQRY_DUAL = 1;
  private static int PPQRY_DUAL1 = 2;
  private static int PPQRY_IMP = 3;
  private static int PPQRY_DISPIMPSUB = 4;
  private static int PPQRY_TIPIVARCRONO = 5;

  private static int PPQRY_OPERE = 6;
  private static int PPQRY_FINANZIAMENT = 7;


  IDPanel PAN_VARIAZIMPSUB;

  // Definition of Global Variables
  private IDVariant AGGIORGRUPPI = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_GENVARCRONO1(IMDB);
    Init_PQRY_WRKGENVACRV1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_GENVARCRONO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_GENVARCRONO1, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_GENVARCRONO1, "PQRY_GENVARCRONO1");
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_NUMERORIGA, "NUMERORIGA");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_NUMERORIGA,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRCRID, "REGEVACRCRID");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRCRID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRPRIM, "REGEVACRPRIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRPRIM,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRESPL, "REGEVACRESPL");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRESPL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRCOST, "REGEVACRCOST");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRCOST,5,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRCOPC, "REGEVACRCOPC");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRCOPC,5,4000,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRFI, "RECGENVACRFI");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRFI,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRCA, "RECGENVACRCA");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRCA,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRAR, "RECGENVACRAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACROP, "RECGENVACROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACROP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRANVA, "REGEVACRANVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRANVA,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRIM, "RECGENVACRIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRIM,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRESIS, "REGEVACRESIS");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRESIS,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRDE, "RECGENVACRDE");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRDE,5,50,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRTIVA, "REGEVACRTIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRTIVA,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRIMPU, "REGEVACRIMPU");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRIMPU,2,15,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRIMRE, "REGEVACRIMRE");
    IMDB.SetFldParams(IMDBDef12.PQRY_GENVARCRONO1,IMDBDef12.PQSL_GENVARCRONO1_REGEVACRIMRE,2,15,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_GENVARCRONO1, 0);
  }

  private static void Init_PQRY_WRKGENVACRV1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_WRKGENVACRV1, 26);
    IMDB.set_TblCode(IMDBDef12.PQRY_WRKGENVACRV1, "PQRY_WRKGENVACRV1");
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CODICESTRUTT, "CODICESTRUTT");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CODICESTRUTT,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CODPIANOCONT, "CODPIANOCONT");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CODPIANOCONT,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMP_DA_REISCR_STN, "IMP_DA_REISCR_STN");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMP_DA_REISCR_STN,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_RECORNUMSUBI, "RECORNUMSUBI");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_RECORNUMSUBI,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_RECOANNOSUBI, "RECOANNOSUBI");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_RECOANNOSUBI,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ORDNUMEROSUB, "ORDNUMEROSUB");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ORDNUMEROSUB,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ORDANNOSUBIM, "ORDANNOSUBIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ORDANNOSUBIM,1,19,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMPORTO_VARIAZIONE, "IMPORTO_VARIAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMPORTO_VARIAZIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMPORTVARIMP, "IMPORTVARIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMPORTVARIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_PROGR_SESSIONE, "PROGR_SESSIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_PROGR_SESSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_CRONOPROGRAMMA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_PROGRESSIVO_IMPUTAZIONE, "PROGRESSIVO_IMPUTAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_PROGRESSIVO_IMPUTAZIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ESERCIZIO_PLUR, "ESERCIZIO_PLUR");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_ESERCIZIO_PLUR,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_TIPO_VAR_CRONO, "TIPO_VAR_CRONO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_TIPO_VAR_CRONO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMPORTO_VAR_CRONO, "IMPORTO_VAR_CRONO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_IMPORTO_VAR_CRONO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_NUM_RIGA_VAR_CRONO, "NUM_RIGA_VAR_CRONO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_NUM_RIGA_VAR_CRONO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_RAGGRUPPAMEN, "RAGGRUPPAMEN");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKGENVACRV1,IMDBDef12.PQSL_WRKGENVACRV1_RAGGRUPPAMEN,5,809,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_WRKGENVACRV1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneVariazioniDaCronoprogramma(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneVariazioniDaCronoprogramma()
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
    FormIdx = MyGlb.FRM_GENEVARDACRO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6943B3A5-AD66-4D18-857F-6CD1F62159EC";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1144;
    DesignHeight = 402;
    set_Caption(new IDVariant("Generazione Variazioni da Cronoprogramma"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1144;
    Frames[1].Height = 376;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 376;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "A8C08B3D-232D-40C6-BE30-ED0E290859E6";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Variazioni";
    Frames[2].Parent = this;
    PAN_VARIAZIONI = new IDPanel(w, this, 2, "PAN_VARIAZIONI");
    Frames[2].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1144-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "66C2E098-4E9F-4F36-8E74-9AC7DD6565E5");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1096, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 2;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Variazioni", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Variazioni Imp./Sub.";
    Frames[3].Parent = this;
    PAN_VARIAZIMPSUB = new IDPanel(w, this, 3, "PAN_VARIAZIMPSUB");
    Frames[3].Content = PAN_VARIAZIMPSUB;
    PAN_VARIAZIMPSUB.set_GroupingEnabled(true);
    PAN_VARIAZIMPSUB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIMPSUB.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1144-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "172AF2D7-ED91-4E84-AAC7-61308C8E5CC2");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 876, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIMPSUB.InitStatus = 2;
    PAN_VARIAZIMPSUB_Init();
    PAN_VARIAZIMPSUB_InitFields();
    PAN_VARIAZIMPSUB_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Variazioni Imp./Sub.", "");
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG172+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZAGGMENU1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG172+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAVARIA6+BaseCmdLinIdx)
      {
        GenerazioneVariazioni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REGVARCOMGE1+BaseCmdLinIdx)
      {
        RegistraVariazioniComeGenerata();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESPANDI1+BaseCmdLinIdx)
      {
        Espandi();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_COMPRIMI1+BaseCmdLinIdx)
      {
        Comprimi();
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
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
      PAN_VARIAZIMPSUB.UpdatePanel(MainFrm);
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
    return (obj instanceof GenerazioneVariazioniDaCronoprogramma);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneVariazioniDaCronoprogramma.class.getName() : (Glb.ClassWithPackage(GenerazioneVariazioniDaCronoprogramma.class) ? GenerazioneVariazioniDaCronoprogramma.class.getName().substring(GenerazioneVariazioniDaCronoprogramma.class.getPackage().getName().length() + 1) : GenerazioneVariazioniDaCronoprogramma.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tab Change Page
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void TAB_TAB_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tab Change Page Body
      // Corpo Procedura
      // 
      if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_VARIAZIMPSUB.FrIndex)), true))
      {
        PAN_VARIAZIMPSUB.SetInput(-1, -1, 2);
        AGGIORGRUPPI = (new IDVariant(-1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "TabChangePage", _e);
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
      PAN_VARIAZIONI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_VAR_CRONO ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " OR DATA_INSERIMENTO < TRUNC( SYSDATE ) - 30) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_VAR_CRONO_VARIMP ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " OR DATA_INSERIMENTO < TRUNC( SYSDATE ) - 30) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      if (MainFrm.GENVARIMPSUB.equals((new IDVariant("SI")), true))
      {
        PAN_VARIAZIMPSUB.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_VARIAZIMPSUB.set_Visible((new IDVariant(0)).booleanValue());
      }
      PAN_VARIAZIMPSUB.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(0)).booleanValue())? Glb.PAN_FREEWHENHID : 0, Glb.PAN_FREEWHENHID); 
      PAN_VARIAZIMPSUB.SetCommandEnabled((new IDVariant(32768)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIMPSUB.set_ShowGroups((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIMPSUB.ResetGroupList();
      PAN_VARIAZIMPSUB.AddToGroupingList((new IDVariant(PFL_VARIAZIMPSUB_RAGGRUPPAMEN)).intValue(),(new IDVariant(-1)).booleanValue()); 
      PAN_VARIAZIMPSUB.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "Load", _e);
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
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_VAR_CRONO ");
      SQL.append("where (DATA_INSERIMENTO < TRUNC( SYSDATE ) - 30) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_VAR_CRONO_VARIMP ");
      SQL.append("where (DATA_INSERIMENTO < TRUNC( SYSDATE ) - 30) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "Unload", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIONI);
      // 
      // Variazioni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_OPEREDESCRIZ,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_OPEREDESCRIZ))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_FINANZFINANZ,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_FINANZFINANZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Change Selection
  // Evento notificato dal pannello quando in un pannello
  // con multi-selezione le righe selezionate cambiano.
  // Selected - Input
  // Final - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIONI_OnChangeSelection(IDVariant Selected, IDVariant Final, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Change Selection Body
      // Corpo Procedura
      // 
      if (Final.booleanValue())
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        C3 = PAN_VARIAZIONI.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_VARIAZIONI.GotoFirst();
        while (!PAN_VARIAZIONI.RSEOF())
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  WRK_GEN_VAR_CRONO A ");
          SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUM_RIGA = " + IDL.CSql(C3.Get("NUMERORIGA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (PAN_VARIAZIONI.IsRowSelected(I.intValue()) && v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_DISPTOTPURO = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_DISPTOTREISC = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_PRIMIMPEPURO = null;
            v_PRIMIMPEPURO = (new IDVariant(-1));
            IDVariant v_PRIMIMPEREIS = null;
            v_PRIMIMPEREIS = (new IDVariant(-1));
            IDVariant v_VCOUVARIMPPR = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("insert into WRK_GEN_VAR_CRONO ");
            SQL.append("( ");
            SQL.append("  PROGR_SESSIONE, ");
            SQL.append("  DATA_INSERIMENTO, ");
            SQL.append("  CRONOPROGRAMMA_ID, ");
            SQL.append("  PROGRESSIVO_IMPUTAZIONE, ");
            SQL.append("  FINANZIAMENTO, ");
            SQL.append("  IMPORTO, ");
            SQL.append("  ANNO_VAR, ");
            SQL.append("  CAPITOLO, ");
            SQL.append("  ARTICOLO, ");
            SQL.append("  CODICE_STRUTTURA, ");
            SQL.append("  ESERCIZIO_PLUR, ");
            SQL.append("  TITOLO, ");
            SQL.append("  TIPO_VAR_CRONO, ");
            SQL.append("  IMPORTO_PURO, ");
            SQL.append("  IMPORTO_REISC, ");
            SQL.append("  NUM_RIGA ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ), ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRCRID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRFI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRANVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRCA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRCOST"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC(TO_NUMBER(SUBSTR(" + IDL.CSql(C3.Get("REGEVACRCOPC"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 1, 1))), ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRTIVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRIMPU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("REGEVACRIMRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C3.Get("NUMERORIGA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            // 
            // Se presente almeno una variazione di crono associata
            // già a una variazione impegno non inserisco i dettagli
            // 
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  VAR_PIANI_CRONOPROGRAMMI A ");
            SQL.append("where (A.CRONOPROGRAMMA_ID = " + IDL.CSql(C3.Get("REGEVACRCRID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.PROGRESSIVO_IMPUTAZIONE = " + IDL.CSql(C3.Get("REGEVACRPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ESERCIZIO_PLUR = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.TIPO_VAR = " + IDL.CSql(C3.Get("REGEVACRTIVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NOT ((A.PROGR_VARIMP_PROVENIENZA IS NULL))) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUVARIMPPR = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (MainFrm.GENVARIMPSUB.equals((new IDVariant("SI")), true) && v_VCOUVARIMPPR.equals((new IDVariant(0)), true))
            {
              if (IDL.NullValue(C3.Get("REGEVACRIMPU"),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
              {
                v_DISPTOTPURO = GetDispReiscPuro((new IDVariant("NO")), C3.Get("REGEVACRESPL"), new IDVariant(C3.Get("RECGENVACRCA"),IDVariant.INTEGER), C3.Get("RECGENVACRAR"), C3.Get("RECGENVACROP"), C3.Get("RECGENVACRFI"));
              }
              if (IDL.NullValue(C3.Get("REGEVACRIMRE"),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
              {
                v_DISPTOTREISC = GetDispReiscPuro((new IDVariant("SI")), C3.Get("REGEVACRESPL"), new IDVariant(C3.Get("RECGENVACRCA"),IDVariant.INTEGER), C3.Get("RECGENVACRAR"), C3.Get("RECGENVACROP"), C3.Get("RECGENVACRFI"));
              }
              SQL = new StringBuffer();
              SQL.append("select distinct ");
              SQL.append("  A.NUMERO_IMP as NUMEROIMP, ");
              SQL.append("  A.ANNO_IMP as ANNOIMP, ");
              SQL.append("  0 as NUMEROSUBIMP, ");
              SQL.append("  0 as ANNOSUBIMP, ");
              SQL.append("  B.DISPONIBILITA as DISPONIBILIT, ");
              SQL.append("  K.IMP_DA_REISCR_STN as IMPDAREISSTN ");
              SQL.append("from ");
              SQL.append("  IMP_FIN A, ");
              SQL.append("  ESEIMP_FIN B, ");
              SQL.append("  IMP K ");
              SQL.append("where (K.ANNO_IMP = A.ANNO_IMP) ");
              SQL.append("and   (K.NUMERO_IMP = A.NUMERO_IMP) ");
              SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
              SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
              SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
              SQL.append("and   (B.OPERA = A.OPERA) ");
              SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C3.Get("RECGENVACRCA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.ARTICOLO = " + IDL.CSql(C3.Get("RECGENVACRAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.OPERA = " + IDL.CSql(C3.Get("RECGENVACROP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(C3.Get("RECGENVACRFI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (((NVL(" + IDL.CSql(C3.Get("REGEVACRIMPU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(K.IMP_DA_REISCR_STN, 'NO') = 'NO') OR (NVL(" + IDL.CSql(C3.Get("REGEVACRIMRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(K.IMP_DA_REISCR_STN, 'NO') = 'SI'))) ");
              SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
              SQL.append("UNION ");
              SQL.append("select ");
              SQL.append("  C.NUMERO_IMP, ");
              SQL.append("  C.ANNO_IMP, ");
              SQL.append("  C.NUMERO_SUBIMP, ");
              SQL.append("  C.ANNO_SUBIMP, ");
              SQL.append("  D.DISPONIBILITA, ");
              SQL.append("  E.IMP_DA_REISCR_STN ");
              SQL.append("from ");
              SQL.append("  SUBIMP_FIN C, ");
              SQL.append("  ESESUB_FIN D, ");
              SQL.append("  IMP E ");
              SQL.append("where (E.ANNO_IMP = C.ANNO_IMP) ");
              SQL.append("and   (E.NUMERO_IMP = C.NUMERO_IMP) ");
              SQL.append("and   (D.ESERCIZIO = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (D.ANNO_SUBIMP = C.ANNO_SUBIMP) ");
              SQL.append("and   (D.NUMERO_SUBIMP = C.NUMERO_SUBIMP) ");
              SQL.append("and   (D.FINANZIAMENTO = C.FINANZIAMENTO) ");
              SQL.append("and   (C.ANNO_SUBIMP = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (C.CAPITOLO = " + IDL.CSql(C3.Get("RECGENVACRCA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (C.ARTICOLO = " + IDL.CSql(C3.Get("RECGENVACRAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (E.OPERA = " + IDL.CSql(C3.Get("RECGENVACROP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (C.FINANZIAMENTO = " + IDL.CSql(C3.Get("RECGENVACRFI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (((NVL(" + IDL.CSql(C3.Get("REGEVACRIMPU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(E.IMP_DA_REISCR_STN, 'NO') = 'NO') OR (NVL(" + IDL.CSql(C3.Get("REGEVACRIMRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(E.IMP_DA_REISCR_STN, 'NO') = 'SI'))) ");
              SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = -1) ");
              SQL.append("UNION ");
              SQL.append("select ");
              SQL.append("  F.NUMERO_IMP, ");
              SQL.append("  F.ANNO_IMP, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  G.DISPONIBILITA, ");
              SQL.append("  F.IMP_DA_REISCR_STN ");
              SQL.append("from ");
              SQL.append("  IMP F, ");
              SQL.append("  ESEIMP G ");
              SQL.append("where (G.ESERCIZIO = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (G.ANNO_IMP = F.ANNO_IMP) ");
              SQL.append("and   (G.NUMERO_IMP = F.NUMERO_IMP) ");
              SQL.append("and   (F.ANNO_IMP = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (F.CAPITOLO = " + IDL.CSql(C3.Get("RECGENVACRCA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (F.ARTICOLO = " + IDL.CSql(C3.Get("RECGENVACRAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (F.OPERA_LIGHT = " + IDL.CSql(C3.Get("RECGENVACROP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (F.FINANZIAMENTO_LIGHT = " + IDL.CSql(C3.Get("RECGENVACRFI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (((NVL(" + IDL.CSql(C3.Get("REGEVACRIMPU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(F.IMP_DA_REISCR_STN, 'NO') = 'NO') OR (NVL(" + IDL.CSql(C3.Get("REGEVACRIMRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(F.IMP_DA_REISCR_STN, 'NO') = 'SI'))) ");
              SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
              SQL.append("UNION ");
              SQL.append("select ");
              SQL.append("  H.NUMERO_IMP, ");
              SQL.append("  H.ANNO_IMP, ");
              SQL.append("  H.NUMERO_SUBIMP, ");
              SQL.append("  H.ANNO_SUBIMP, ");
              SQL.append("  J.DISPONIBILITA, ");
              SQL.append("  I.IMP_DA_REISCR_STN ");
              SQL.append("from ");
              SQL.append("  SUBIMP H, ");
              SQL.append("  IMP I, ");
              SQL.append("  ESESUB J ");
              SQL.append("where (I.ANNO_IMP = H.ANNO_IMP) ");
              SQL.append("and   (I.NUMERO_IMP = H.NUMERO_IMP) ");
              SQL.append("and   (J.ESERCIZIO = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (J.ANNO_SUBIMP = H.ANNO_SUBIMP) ");
              SQL.append("and   (J.NUMERO_SUBIMP = H.NUMERO_SUBIMP) ");
              SQL.append("and   (H.ANNO_SUBIMP = " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (H.CAPITOLO = " + IDL.CSql(C3.Get("RECGENVACRCA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (H.ARTICOLO = " + IDL.CSql(C3.Get("RECGENVACRAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (I.OPERA_LIGHT = " + IDL.CSql(C3.Get("RECGENVACROP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (I.FINANZIAMENTO_LIGHT = " + IDL.CSql(C3.Get("RECGENVACRFI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (((NVL(" + IDL.CSql(C3.Get("REGEVACRIMPU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(I.IMP_DA_REISCR_STN, 'NO') = 'NO') OR (NVL(" + IDL.CSql(C3.Get("REGEVACRIMRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0) <> 0 AND NVL(I.IMP_DA_REISCR_STN, 'NO') = 'SI'))) ");
              SQL.append("and   (" + IDL.CSql(MainFrm.FINANZIAMENT, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " = 0) ");
              SQL.append("order by 5 desc, 2, 1, 4, 3 ");
              C8 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              C8.setColUnbound(3,true);
              C8.setColUnbound(4,true);
              if (!C8.EOF()) C8.MoveNext();
              while (!C8.EOF())
              {
                IDVariant v_IMPORTVARIAZ = null;
                v_IMPORTVARIAZ = (new IDVariant(0, IDVariant.DECIMAL));
                IDVariant v_DISPSUBIMP = null;
                v_DISPSUBIMP = (new IDVariant(0, IDVariant.DECIMAL));
                if (C8.Get("NUMEROSUBIMP").equals((new IDVariant(0)), true))
                {
                  v_DISPSUBIMP = GetDispReiscPuroSubimp(IDL.NullValue(C8.Get("IMPDAREISSTN"),(new IDVariant("NO"))), C8.Get("ANNOIMP"), C8.Get("NUMEROIMP"), C3.Get("REGEVACRESPL"), new IDVariant(C3.Get("RECGENVACRCA"),IDVariant.INTEGER), C3.Get("RECGENVACRAR"), C3.Get("RECGENVACROP"), C3.Get("RECGENVACRFI"));
                }
                if (IDL.NullValue(C8.Get("IMPDAREISSTN"),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
                {
                  if (v_DISPTOTPURO.compareTo(IDL.Mul(C3.Get("REGEVACRIMPU"), (new IDVariant(-1))), true)<=0)
                  {
                    v_IMPORTVARIAZ = IDL.Add((IDL.Mul(C8.Get("DISPONIBILIT"), (new IDVariant(-1)))), (IDL.Mul(v_DISPSUBIMP, (new IDVariant(-1)))));
                  }
                  else if (v_PRIMIMPEPURO.booleanValue() && C8.Get("NUMEROSUBIMP").equals((new IDVariant(0)), true))
                  {
                    v_IMPORTVARIAZ = new IDVariant(C3.Get("REGEVACRIMPU"));
                  }
                }
                else
                {
                  if (v_DISPTOTREISC.compareTo(IDL.Mul(C3.Get("REGEVACRIMRE"), (new IDVariant(-1))), true)<=0)
                  {
                    v_IMPORTVARIAZ = IDL.Add((IDL.Mul(C8.Get("DISPONIBILIT"), (new IDVariant(-1)))), (IDL.Mul(v_DISPSUBIMP, (new IDVariant(-1)))));
                  }
                  else if (v_PRIMIMPEREIS.booleanValue() && C8.Get("NUMEROSUBIMP").equals((new IDVariant(0)), true))
                  {
                    v_IMPORTVARIAZ = new IDVariant(C3.Get("REGEVACRIMRE"));
                  }
                }
                SQL = new StringBuffer();
                SQL.append("insert into WRK_GEN_VAR_CRONO_VARIMP ");
                SQL.append("( ");
                SQL.append("  PROGR_SESSIONE, ");
                SQL.append("  DATA_INSERIMENTO, ");
                SQL.append("  NUMERO_IMP, ");
                SQL.append("  ANNO_IMP, ");
                SQL.append("  NUMERO_SUBIMP, ");
                SQL.append("  ANNO_SUBIMP, ");
                SQL.append("  IMPORTO_VARIAZIONE, ");
                SQL.append("  CRONOPROGRAMMA_ID, ");
                SQL.append("  PROGRESSIVO_IMPUTAZIONE, ");
                SQL.append("  FINANZIAMENTO, ");
                SQL.append("  ESERCIZIO_PLUR, ");
                SQL.append("  CAPITOLO, ");
                SQL.append("  ARTICOLO, ");
                SQL.append("  OPERA, ");
                SQL.append("  TIPO_VAR_CRONO, ");
                SQL.append("  DISPONIBILITA, ");
                SQL.append("  IMPORTO_VAR_CRONO, ");
                SQL.append("  NUM_RIGA_VAR_CRONO, ");
                SQL.append("  IMPORTO_VAR_CRONO_PURO, ");
                SQL.append("  IMPORTO_VAR_CRONO_REISC ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  TRUNC( SYSDATE ), ");
                SQL.append("  " + IDL.CSql(C8.Get("NUMEROIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C8.Get("ANNOIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  DECODE(" + IDL.CSql(C8.Get("NUMEROSUBIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0, to_number(NULL), " + IDL.CSql(C8.Get("NUMEROSUBIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), ");
                SQL.append("  DECODE(" + IDL.CSql(C8.Get("ANNOSUBIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0, to_number(NULL), " + IDL.CSql(C8.Get("ANNOSUBIMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "), ");
                SQL.append("  " + IDL.CSql(v_IMPORTVARIAZ, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("REGEVACRCRID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("REGEVACRPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRFI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("REGEVACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRCA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("RECGENVACROP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("REGEVACRTIVA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C8.Get("DISPONIBILIT"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("RECGENVACRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("NUMERORIGA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("REGEVACRIMPU"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  " + IDL.CSql(C3.Get("REGEVACRIMRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                if (C8.Get("NUMEROSUBIMP").equals((new IDVariant(0)), true))
                {
                  if (C8.Get("IMPDAREISSTN").equals((new IDVariant("SI")), true))
                  {
                    v_PRIMIMPEREIS = (new IDVariant(0));
                  }
                  else
                  {
                    v_PRIMIMPEPURO = (new IDVariant(0));
                  }
                }
                C8.MoveNext();
              }
              C8.Close();
            }
          }
          else if (!(PAN_VARIAZIONI.IsRowSelected(I.intValue())))
          {
            SQL = new StringBuffer();
            SQL.append("delete from WRK_GEN_VAR_CRONO_VARIMP ");
            SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NUM_RIGA_VAR_CRONO = " + IDL.CSql(C3.Get("NUMERORIGA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            SQL = new StringBuffer();
            SQL.append("delete from WRK_GEN_VAR_CRONO ");
            SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NUM_RIGA = " + IDL.CSql(C3.Get("NUMERORIGA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_VARIAZIONI.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        PAN_VARIAZIMPSUB.PanelCommand(Glb.PCM_REQUERY);
        PAN_VARIAZIMPSUB.RefreshGrouping(true);
        PAN_VARIAZIMPSUB.RefreshLookup();
        PAN_VARIAZIONI.RefreshLookup();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniOnChangeSelection", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Show Multiple Selection
  // Evento notificato dal pannello quando cambia lo stato
  // della proprietà ShowMultipleSelection
  // New Value: True se la multiselezione verrà mostrata, False altrimenti; questo valore verrà assegnato automaticamente alla proprietà ShowMultipleSelection del pannello alla fine della gestione dell'evento, a meno che questo non sia stato cancellato. - Input
  // Cancel: E' un parametro di uscita che può essere impostato a True per impedire che venga cambiato lo stato di visualizzazione della multiselezione. - Input/Output
  // User Operation: True se l'evento è scattato a causa di una azione dell'utente, False altrimenti. - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnShowMultipleSelection(IDVariant NewValue, IDVariant Cancel, IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Show Multiple Selection Body
      // Corpo Procedura
      // 
      if (NewValue.equals((new IDVariant(0)), true) && UserOperation.booleanValue())
      {
        Cancel.set((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniOnShowMultipleSelection", _e);
    }
  }

  // **********************************************************************
  // Variazioni On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_VARIAZIMPSUB.Status()).equals((new IDVariant(1)), true))
      {
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GEN_VAR_CRONO ");
        SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GEN_VAR_CRONO_VARIMP ");
        SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Variazioni Imp./Sub. On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VARIAZIMPSUB_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Imp./Sub. On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_VARIAZIMPSUB_IMPORTVARIAZ)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_RECORNUMSUBI, 0),(new IDVariant(0))).equals((new IDVariant(0)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_IMPORTVARIMP, 0, IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_IMPORTO_VARIAZIONE, 0));
        }
        CalcolaTotali();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniImp./Sub.OnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Variazioni Imp./Sub. On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIMPSUB_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIMPSUB);
      // 
      // Variazioni Imp./Sub. On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPSUB_OPERA,(new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_OPERA))).stringValue()); 
      PAN_VARIAZIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPSUB_FINANZIAMENT,(new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_FINANZIAMENT))).stringValue()); 
      PAN_VARIAZIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPSUB_IMPDESCRIZIO,(new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_IMPDESCRIZIO))).stringValue()); 
      PAN_VARIAZIMPSUB.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPSUB_DESCRTIPOVAR,(new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DESCRTIPOVAR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniImp./Sub.OnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni Imp./Sub. After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_VARIAZIMPSUB_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Imp./Sub. After Find Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniImp./Sub.AfterFind", _e);
    }
  }

  // **********************************************************************
  // Variazioni Imp./Sub. After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_VARIAZIMPSUB_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Imp./Sub. After Commit Body
      // Corpo Procedura
      // 
      PAN_VARIAZIMPSUB.RefreshLookup();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniImp./Sub.AfterCommit", _e);
    }
  }

  // **********************************************************************
  // Variazioni Imp./Sub. On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_VARIAZIMPSUB_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Imp./Sub. On Change Row Body
      // Corpo Procedura
      // 
      if (AGGIORGRUPPI.booleanValue())
      {
        AGGIORGRUPPI = (new IDVariant(0));
        PAN_VARIAZIMPSUB.RD3ExpandGroup((new IDVariant(0)).intValue(),(new IDVariant(-1)).booleanValue()); 
        PAN_VARIAZIMPSUB.RefreshGrouping(true);
        PAN_VARIAZIMPSUB.RefreshLookup();
        PAN_VARIAZIMPSUB.set_ActualPosition(true, (new IDVariant(1)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "VariazioniImp./Sub.OnChangeRow", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_NUMERO_IMP, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_ANNO_IMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_NUMERO_IMP, 0));
      if (IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_ANNO_IMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "ApriInfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Subimpegno
  // **********************************************************************
  public int ApriInfoSubimpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Subimpegno Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_RECORNUMSUBI, 0),(new IDVariant(0))).equals((new IDVariant(0)), true))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_RECOANNOSUBI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_RECORNUMSUBI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      if (IMDB.Value(IMDBDef12.PQRY_WRKGENVACRV1, IMDBDef12.PQSL_WRKGENVACRV1_RECOANNOSUBI, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "ApriInfoSubimpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totali
  // **********************************************************************
  public int CalcolaTotali ()
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
      // Calcola Totali Body
      // Corpo Procedura
      // 
      IDVariant v_TOTDISP = null;
      v_TOTDISP = (new IDVariant(0, IDVariant.DECIMAL));
      // C2 = PAN_VARIAZIMPSUB.MasterRS();
      // if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      // if (!C2.Bof()) PAN_VARIAZIMPSUB.GotoFirst();
      // while (!PAN_VARIAZIMPSUB.RSEOF())
      // {
        // if (IDL.NullValue(C2.Get("NUMERO_SUBIMP"),(new IDVariant(0))).equals((new IDVariant(0)), true))
        // {
          // v_TOTDISP = IDL.Add(v_TOTDISP, C2.Get("IMPORTO_VARIAZIONE"));
        // }
      //   PAN_VARIAZIMPSUB.GotoNext();
      // }
      // if (CurPos>0) C2.absolute(CurPos);
      PAN_VARIAZIMPSUB.set_FieldText(PFL_VARIAZIMPSUB_ETICHTOTDIS1, IDL.Format(PAN_VARIAZIMPSUB.GetFieldSum(PFL_VARIAZIMPSUB_IMPORTVARIMP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_VARIAZIMPSUB.set_FieldText(PFL_VARIAZIMPSUB_ETICHETOTDIS, IDL.Format(PAN_VARIAZIMPSUB.GetFieldSum(PFL_VARIAZIMPSUB_DISPONIBILIT), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "CalcolaTotali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Disp Imp Sub
  // **********************************************************************
  public int DispImpSub ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disp Imp Sub Body
      // Corpo Procedura
      // 
      if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant("OK"))).compareTo((new IDVariant("OK")), true)!=0)
      {
        IDVariant v_AVVISO = null;
        v_AVVISO = (new IDVariant());
        if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).equals((new IDVariant("E1")), true))
        {
          IDVariant v_AVVISOE1 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE1 = (new IDVariant("Importo superiore alla disponibilità"));
          v_AVVISO = new IDVariant(v_AVVISOE1);
        }
        else if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).equals((new IDVariant("E2")), true))
        {
          IDVariant v_AVVISOE2 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE2 = (new IDVariant("L'importo della variazione del Cronoprogramma non è stato interamente distribuito su Impegni e Subimpegni"));
          v_AVVISO = new IDVariant(v_AVVISOE2);
        }
        else if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).equals((new IDVariant("E3")), true))
        {
          IDVariant v_AVVISOE3 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE3 = (new IDVariant("La somma degli importi Variazione indicati su Impegni e Subimpegni non è uguale all'importo della variazione del Cronoprogramma"));
          v_AVVISO = new IDVariant(v_AVVISOE3);
        }
        else if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).equals((new IDVariant("E4")), true))
        {
          IDVariant v_AVVISOE4 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE4 = (new IDVariant("La somma degli importi di Variazione indicati non porta a zero la Disponibilità di Impegni e Subimpegni"));
          v_AVVISO = new IDVariant(v_AVVISOE4);
        }
        else if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).equals((new IDVariant("W1")), true))
        {
          IDVariant v_AVVISOW1 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOW1 = (new IDVariant("L'importo della Variazione del Cronoprogramma è Negativo e maggiore della disponibilità di Impegni e Subimpegni"));
          v_AVVISO = new IDVariant(v_AVVISOW1);
        }
        else if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).equals((new IDVariant("E5")), true))
        {
          IDVariant v_AVVISOE5 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE5 = (new IDVariant("La somma degli importi dei subimpegni supera l'importo del relativo impegno"));
          v_AVVISO = new IDVariant(v_AVVISOE5);
        }
        else if (IDL.NullValue((new IDVariant(PAN_VARIAZIMPSUB.FieldText(PFL_VARIAZIMPSUB_DISPIMPSUB))),(new IDVariant(""))).equals((new IDVariant("E6")), true))
        {
          IDVariant v_AVVISOE6 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE6 = (new IDVariant("La variazione di Impegno o Subimpegno ha segno diverso della variazione di Crono"));
          v_AVVISO = new IDVariant(v_AVVISOE6);
        }
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "DispImpSub", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Espandi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Espandi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Espandi Body
      // Corpo Procedura
      // 
      PAN_VARIAZIMPSUB.RD3ExpandGroup((new IDVariant(0)).intValue(),(new IDVariant(-1)).booleanValue()); 
      PAN_VARIAZIMPSUB.RefreshGrouping(true);
      PAN_VARIAZIMPSUB.RefreshLookup();
      PAN_VARIAZIMPSUB.set_ActualPosition(true, (new IDVariant(1)).intValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "Espandi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Comprimi
  // **********************************************************************
  public int Comprimi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comprimi Body
      // Corpo Procedura
      // 
      PAN_VARIAZIMPSUB.RD3ExpandGroup((new IDVariant(0)).intValue(),(new IDVariant(0)).booleanValue()); 
      PAN_VARIAZIMPSUB.RefreshGrouping(true);
      PAN_VARIAZIMPSUB.RefreshLookup();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "Comprimi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Generazione Variazioni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GenerazioneVariazioni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C5;
    IDCachedRowSet C8;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNTSEL = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_GEN_VAR_CRONO A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNTSEL = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNTSEL.equals((new IDVariant(0)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non sono state selezionate variazioni da generare"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (MainFrm.GENVARIMPSUB.equals((new IDVariant("SI")), true))
      {
        C5 = PAN_VARIAZIMPSUB.MasterRS();
        if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
        if (!C5.Bof()) PAN_VARIAZIMPSUB.GotoFirst();
        while (!PAN_VARIAZIMPSUB.RSEOF())
        {
          IDVariant v_VCROVERDISVA = new IDVariant(0,IDVariant.STRING);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  CRONO_VERIFICA_DISP_VAR(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("CRONOPROGRAMMA_ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("PROGRESSIVO_IMPUTAZIONE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("FINANZIAMENTO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("ESERCIZIO_PLUR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("OPERA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("CAPITOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("ARTICOLO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("TIPO_VAR_CRONO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("ANNO_IMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("NUMERO_IMP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("RECOANNOSUBI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("RECORNUMSUBI"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CVDVSECPSRCI ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCROVERDISVA = QV.Get("CVDVSECPSRCI", IDVariant.STRING) ;
          }
          QV.Close();
          if (v_VCROVERDISVA.compareTo((new IDVariant("OK")), true)!=0)
          {
            IDVariant v_AVVISOANOMAL = new IDVariant(0,IDVariant.STRING);
            v_AVVISOANOMAL = (new IDVariant("Esistono Anomalie sul folder Variazioni Imp/Sub."));
            MainFrm.set_AlertMessage(v_AVVISOANOMAL); 
            return 0;
          }
          PAN_VARIAZIMPSUB.GotoNext();
        }
        if (CurPos>0) C5.absolute(CurPos);
      }
      // 
      // Controllo variazioni per ripianificazione
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CRONOPROGRAMMA_ID as CRONOPROGRID, ");
      SQL.append("  A.PROGRESSIVO_IMPUTAZIONE as PROGREIMPUTA, ");
      SQL.append("  A.ESERCIZIO_PLUR as ESERCIZIPLUR, ");
      SQL.append("  A.FINANZIAMENTO as FINANZIAMENT, ");
      SQL.append("  A.ANNO_VAR as ANNOVAR, ");
      SQL.append("  A.TIPO_VAR_CRONO as TIPOVARCRONO ");
      SQL.append("from ");
      SQL.append("  WRK_GEN_VAR_CRONO A, ");
      SQL.append("  TIPI_VAR_CRONOPROGRAMMI B ");
      SQL.append("where (B.CODICE = A.TIPO_VAR_CRONO) ");
      SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      C8 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C8.EOF()) C8.MoveNext();
      while (!C8.EOF())
      {
        IDVariant v_VCOUNTRIPIAN = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  GEN_VAR_CRONO A ");
        SQL.append("where (A.CRONOPROGRAMMA_ID = " + IDL.CSql(C8.Get("CRONOPROGRID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.PROGRESSIVO_IMPUTAZIONE = " + IDL.CSql(C8.Get("PROGREIMPUTA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO_PLUR <> " + IDL.CSql(C8.Get("ESERCIZIPLUR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(C8.Get("FINANZIAMENT"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_VAR = " + IDL.CSql(C8.Get("ANNOVAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_VAR = " + IDL.CSql(C8.Get("TIPOVARCRONO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NOT (EXISTS(");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  1 ");
        SQL.append("from ");
        SQL.append("  WRK_GEN_VAR_CRONO B ");
        SQL.append("where (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
        SQL.append("and   (B.PROGRESSIVO_IMPUTAZIONE = A.PROGRESSIVO_IMPUTAZIONE) ");
        SQL.append("and   (B.ESERCIZIO_PLUR = A.ESERCIZIO_PLUR) ");
        SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
        SQL.append("and   (B.ANNO_VAR = A.ANNO_VAR) ");
        SQL.append("and   (B.TIPO_VAR_CRONO = A.TIPO_VAR) ");
        SQL.append(")))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNTRIPIAN = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNTRIPIAN.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Le variazioni dello stesso tipo devono essere selezionate per tutti gli anni a parità di capitolo, finanziamento e opera"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        C8.MoveNext();
      }
      C8.Close();
      MainFrm.Show(MyGlb.FRM_LANGENVARCR1, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "GenerazioneVariazioni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo
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
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_GENVARCRONO1, IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRCA, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMESERCIZ, 0, IMDB.Value(IMDBDef12.PQRY_GENVARCRONO1, IMDBDef12.PQSL_GENVARCRONO1_REGEVACRESPL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef12.PQRY_GENVARCRONO1, IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRCA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef12.PQRY_GENVARCRONO1, IMDBDef12.PQSL_GENVARCRONO1_RECGENVACRAR, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Get Disp Reisc Puro
  // Reiscrizioni:  - Input
  // Esercizio Plur:  - Input
  // Capitolo:  - Input
  // Articolo:  - Input
  // Opera:  - Input
  // Finanziamento:  - Input
  // **********************************************************************
  public IDVariant GetDispReiscPuro (IDVariant Reiscrizioni, IDVariant EsercizioPlur, IDVariant Capitolo, IDVariant Articolo, IDVariant Opera, IDVariant Finanziamento)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Disp Reisc Puro Body
      // Corpo Procedura
      // 
      IDVariant v_VSUMDISPIMP = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VSUMDISPSUBI = new IDVariant(0,IDVariant.DECIMAL);
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(B.DISPONIBILITA), 0) as NUVASUESFID0 ");
        SQL.append("from ");
        SQL.append("  IMP_FIN A, ");
        SQL.append("  ESEIMP_FIN B, ");
        SQL.append("  IMP C ");
        SQL.append("where (C.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
        SQL.append("and   (B.OPERA = A.OPERA) ");
        SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.OPERA = " + IDL.CSql(Opera, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(Finanziamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NVL(C.IMP_DA_REISCR_STN, 'NO') = " + IDL.CSql(Reiscrizioni, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSUMDISPIMP = QV.Get("NUVASUESFID0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(B.DISPONIBILITA), 0) as NUVASUESFID0 ");
        SQL.append("from ");
        SQL.append("  SUBIMP_FIN A, ");
        SQL.append("  ESESUB_FIN B, ");
        SQL.append("  IMP C ");
        SQL.append("where (C.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ANNO_SUBIMP = A.ANNO_SUBIMP) ");
        SQL.append("and   (B.NUMERO_SUBIMP = A.NUMERO_SUBIMP) ");
        SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
        SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.OPERA = " + IDL.CSql(Opera, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(Finanziamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NVL(C.IMP_DA_REISCR_STN, 'NO') = " + IDL.CSql(Reiscrizioni, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSUMDISPSUBI = QV.Get("NUVASUESFID0", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(B.DISPONIBILITA), 0) as NULVASUESDI0 ");
        SQL.append("from ");
        SQL.append("  IMP A, ");
        SQL.append("  ESEIMP B ");
        SQL.append("where (B.ESERCIZIO = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.OPERA_LIGHT = " + IDL.CSql(Opera, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FINANZIAMENTO_LIGHT = " + IDL.CSql(Finanziamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NVL(A.IMP_DA_REISCR_STN, 'NO') = " + IDL.CSql(Reiscrizioni, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSUMDISPIMP = QV.Get("NULVASUESDI0", IDVariant.DECIMAL) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(B.DISPONIBILITA), 0) as NULVASUESDI0 ");
        SQL.append("from ");
        SQL.append("  SUBIMP A, ");
        SQL.append("  ESESUB B, ");
        SQL.append("  IMP C ");
        SQL.append("where (C.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ANNO_SUBIMP = A.ANNO_SUBIMP) ");
        SQL.append("and   (B.NUMERO_SUBIMP = A.NUMERO_SUBIMP) ");
        SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.OPERA_LIGHT = " + IDL.CSql(Opera, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.FINANZIAMENTO_LIGHT = " + IDL.CSql(Finanziamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NVL(C.IMP_DA_REISCR_STN, 'NO') = " + IDL.CSql(Reiscrizioni, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSUMDISPSUBI = QV.Get("NULVASUESDI0", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      return IDL.Add(v_VSUMDISPIMP, v_VSUMDISPSUBI);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "GetDispReiscPuro", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Get Disp Reisc Puro Subimp
  // Reiscrizioni:  - Input
  // Anno Imp:  - Input
  // Numero Imp:  - Input
  // Esercizio Plur:  - Input
  // Capitolo:  - Input
  // Articolo:  - Input
  // Opera:  - Input
  // Finanziamento:  - Input
  // **********************************************************************
  public IDVariant GetDispReiscPuroSubimp (IDVariant Reiscrizioni, IDVariant AnnoImp, IDVariant NumeroImp, IDVariant EsercizioPlur, IDVariant Capitolo, IDVariant Articolo, IDVariant Opera, IDVariant Finanziamento)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Get Disp Reisc Puro Subimp Body
      // Corpo Procedura
      // 
      IDVariant v_VSUMDISPSUBI = new IDVariant(0,IDVariant.DECIMAL);
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(B.DISPONIBILITA), 0) as NUVASUESFID0 ");
        SQL.append("from ");
        SQL.append("  SUBIMP_FIN A, ");
        SQL.append("  ESESUB_FIN B, ");
        SQL.append("  IMP C ");
        SQL.append("where (C.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ANNO_SUBIMP = A.ANNO_SUBIMP) ");
        SQL.append("and   (B.NUMERO_SUBIMP = A.NUMERO_SUBIMP) ");
        SQL.append("and   (B.FINANZIAMENTO = A.FINANZIAMENTO) ");
        SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.OPERA = " + IDL.CSql(Opera, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.FINANZIAMENTO = " + IDL.CSql(Finanziamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NVL(C.IMP_DA_REISCR_STN, 'NO') = " + IDL.CSql(Reiscrizioni, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSUMDISPSUBI = QV.Get("NUVASUESFID0", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  NVL(SUM(B.DISPONIBILITA), 0) as NULVASUESDI0 ");
        SQL.append("from ");
        SQL.append("  SUBIMP A, ");
        SQL.append("  ESESUB B, ");
        SQL.append("  IMP C ");
        SQL.append("where (C.ANNO_IMP = A.ANNO_IMP) ");
        SQL.append("and   (C.NUMERO_IMP = A.NUMERO_IMP) ");
        SQL.append("and   (B.ESERCIZIO = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (B.ANNO_SUBIMP = A.ANNO_SUBIMP) ");
        SQL.append("and   (B.NUMERO_SUBIMP = A.NUMERO_SUBIMP) ");
        SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(EsercizioPlur, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.OPERA_LIGHT = " + IDL.CSql(Opera, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (C.FINANZIAMENTO_LIGHT = " + IDL.CSql(Finanziamento, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(AnnoImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(NumeroImp, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (NVL(C.IMP_DA_REISCR_STN, 'NO') = " + IDL.CSql(Reiscrizioni, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VSUMDISPSUBI = QV.Get("NULVASUESDI0", IDVariant.DECIMAL) ;
        }
        QV.Close();
      }
      return v_VSUMDISPSUBI;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "GetDispReiscPuroSubimp", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Registra Variazioni Come Generata
  // **********************************************************************
  public int RegistraVariazioniComeGenerata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C6;

    try
    {
      TransCount = 0;
      // 
      // Registra Variazioni Come Generata Body
      // Corpo Procedura
      // 
      IDVariant v_VCOUNTSEL = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MEXAVVISO = new IDVariant(0,IDVariant.STRING);
      v_MEXAVVISO = (new IDVariant("Attenzione si sta Registrando come Generata la variazione, anche se nessuna variazione di Bilancio verrà effettivamente Generata. Vuoi Procedere Ugualmente?"));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  WRK_GEN_VAR_CRONO A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNTSEL = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNTSEL.equals((new IDVariant(0)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non sono state selezionate variazioni da registrare"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return 0;
      }
      if (MainFrm.MessageConfirm(v_MEXAVVISO))
      {
        IDVariant v_LOG = new IDVariant(0,IDVariant.STRING);
        v_LOG = (new IDVariant("Aggiornata VARIAZIONE_GENERATA a SI senza generare la Variazione di Bilancio"));
        // 
        //  
        // 
        MainFrm.Cf4armDBObject.BeginTrans();
        // 
        //  
        // 
        try
        {
          // 
          // Controllo variazioni per ripianificazione
          // 
          SQL = new StringBuffer();
          SQL.append("select distinct ");
          SQL.append("  A.CRONOPROGRAMMA_ID as CRONOPROGRID, ");
          SQL.append("  A.PROGRESSIVO_IMPUTAZIONE as PROGREIMPUTA, ");
          SQL.append("  A.ESERCIZIO_PLUR as ESERCIZIPLUR, ");
          SQL.append("  A.FINANZIAMENTO as FINANZIAMENT, ");
          SQL.append("  A.ANNO_VAR as ANNOVAR, ");
          SQL.append("  A.TIPO_VAR_CRONO as TIPOVARCRONO ");
          SQL.append("from ");
          SQL.append("  WRK_GEN_VAR_CRONO A, ");
          SQL.append("  TIPI_VAR_CRONOPROGRAMMI B ");
          SQL.append("where (B.CODICE = A.TIPO_VAR_CRONO) ");
          SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          C6 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C6.EOF()) C6.MoveNext();
          while (!C6.EOF())
          {
            SQL = new StringBuffer();
            SQL.append("update VAR_PIANI_CRONOPROGRAMMI set ");
            SQL.append("  VARIAZIONE_GENERATA = 'SI', ");
            SQL.append("  LOG = VAR_PIANI_CRONOPROGRAMMI.LOG || ' ' || TO_CHAR ( TRUNC( SYSDATE ),'dd/mm/yyyy') || ':' || ' ' || " + IDL.CSql(v_LOG, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (CRONOPROGRAMMA_ID = " + IDL.CSql(C6.Get("CRONOPROGRID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (PROGRESSIVO_IMPUTAZIONE = " + IDL.CSql(C6.Get("PROGREIMPUTA"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ESERCIZIO_PLUR = " + IDL.CSql(C6.Get("ESERCIZIPLUR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (FINANZIAMENTO = " + IDL.CSql(C6.Get("FINANZIAMENT"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (TIPO_VAR = " + IDL.CSql(C6.Get("TIPOVARCRONO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ANNO_VAR = " + IDL.CSql(C6.Get("ANNOVAR"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            C6.MoveNext();
          }
          C6.Close();
        }
        catch (Exception e7)
        {
          MainFrm.set_AlertMessage(new IDVariant(e7.getMessage())); 
          // 
          //  
          // 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        // 
        //  
        // 
        MainFrm.Cf4armDBObject.CommitTrans();
        PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneVariazioniDaCronoprogramma", "RegistraVariazioniComeGenerata", _e);
      return -1;
    }
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
  private void PAN_VARIAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIONI, Cancel);
    // Stub
  }

  private void PAN_VARIAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIONI_DUALINFOCAPI)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VARIAZIMPSUB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIMPSUB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIMPSUB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIMPSUB, Cancel);
    // Stub
  }

  private void PAN_VARIAZIMPSUB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIMPSUB_DUALINFOIMPE)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPSUB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPSUB_DUALINFOSUB1)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPSUB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoSubimpegno();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPSUB_DISPIMPSUB)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPSUB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      DispImpSub();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIMPSUB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAZIMPSUB_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIMPSUB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIMPSUB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, "A25B5E3A-B017-443C-AA57-E1FE5A8D7A38");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, "CRONOPROGRAMMA ID");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, "FF1AC3C5-7533-4D6F-8B42-A49E6E62F795");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, "Codice");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, "64AC29FA-B251-446E-9FFF-256FEFF9B97A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, "Cod. Piano Conti");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "1274F30C-B17F-4E0A-AFFF-186EDDF32803");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "Capitolo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, "67C13AC5-F82F-401E-91E2-8A7244BEB3F7");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, "Art.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, "4D8A3C79-2268-4163-A802-9565B5DE16E5");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, "648AFAFB-511E-4703-95D3-D919D7857A66");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, "OPERA");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, "010B85A3-25E9-4C7D-B165-644D2CDD7EED");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, "Anno");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, "9D62DF63-26D4-49AF-8C5B-7A52986377CE");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, "Opera/Progetto");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, "45EFF5A3-F77D-4C80-95A5-70C0618AC25D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, "Finanziamento");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, "Finanziamento");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "334B1892-4DBB-4F7A-A448-95C41566632C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, "CF74D3B6-71FD-4B00-93DD-46EAB844C86A");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, "PROGRESSIVO IMPUTAZIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, "2A1B57A4-F914-4AE0-B054-A7FA68965938");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, "FINANZIAMENTO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "EC28B0B8-80F4-4CEA-AEA6-680132188D9E");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "ANNO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, "7330FF9B-A8BA-4C92-94B3-62166BE53DAD");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, "ESERCIZIO ISCRIZIONE");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, "97AFB0C5-B8AE-4883-AD33-2F00ED97747F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, "54E38E5C-69E1-4ACB-9902-D0CA89DF21AB");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, "TIPO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, "55A426CA-8461-47D6-9BF4-7B3EE3F51FB8");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, "Progr.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, "76E97EA4-C173-45FC-9E07-E5298B4FFC5C");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, "IMPORTO PURO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, "7936E1F2-A404-40CE-8B8B-70F624732F42");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, "IMPORTO REISC");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_LIST, 116, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_LIST, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_FORM, 4, 28, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_FORM, 140);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CRONOPROGRI1, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CRONOPROGRI1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CRONOPROGRI1, PPQRY_GENVARCRONO1, "A.CRONOPROGRAMMA_ID", "REGEVACRCRID", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_LIST, "Codice");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODICESTRUT1, MyGlb.PANEL_FORM, "Codice");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODICESTRUT1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODICESTRUT1, PPQRY_GENVARCRONO1, "A.CODICE_STRUTTURA", "REGEVACRCOST", 5, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_LIST, 84, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_LIST, "Cod. Piano Conti");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_FORM, 4, 76, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CODPIANOCON1, MyGlb.PANEL_FORM, "Cod. Piano Conti");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CODPIANOCON1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CODPIANOCON1, PPQRY_GENVARCRONO1, "A.COD_PIANO_CONTI", "REGEVACRCOPC", 5, 4000, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 184, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 4, 100, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO1, PPQRY_GENVARCRONO1, "A.CAPITOLO", "RECGENVACRCA", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, 320, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO1, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO1, PPQRY_GENVARCRONO1, "A.ARTICOLO", "RECGENVACRAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_LIST, 352, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_FORM, 4, 148, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DUALINFOCAPI, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DUALINFOCAPI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DUALINFOCAPI, PPQRY_DUAL2, "'I'", "INFOCAPITOLO", 5, 1, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAPI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAPI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_DUALINFOCAPI, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_LIST, 360, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_LIST, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_LIST, "OPERA");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_FORM, 4, 172, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPERA1, MyGlb.PANEL_FORM, "OPERA");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OPERA1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OPERA1, PPQRY_GENVARCRONO1, "A.OPERA", "RECGENVACROP", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 372, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_LIST, "Anno");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 4, 304, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIZIPLU1, MyGlb.PANEL_FORM, "Anno");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESERCIZIPLU1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESERCIZIPLU1, PPQRY_GENVARCRONO1, "A.ESERCIZIO_PLUR", "REGEVACRESPL", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_LIST, 412, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_LIST, "Opera/Progetto");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_FORM, 4, 196, 628, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_OPEREDESCRIZ, MyGlb.PANEL_FORM, "Opera/Progetto");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_OPEREDESCRIZ, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_OPEREDESCRIZ, PPQRY_OPERE1, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "OPEREDESCRIZ", 5, 302, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_LIST, 612, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_LIST, 192);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_FORM, 4, 328, 628, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_FORM, 192);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZFINANZ, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZFINANZ, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZFINANZ, PPQRY_FINANZIAMEN1, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "FINANZFINANZ", 5, 302, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 812, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 232, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO, PPQRY_GENVARCRONO1, "A.IMPORTO", "RECGENVACRIM", 2, 15, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_LIST, 168);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_LIST, "PROGRESSIVO IMPUTAZIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_FORM, 4, 304, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_FORM, 168);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGREIMPUT1, MyGlb.PANEL_FORM, "PROGRESSIVO IMPUTAZIONE");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGREIMPUT1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGREIMPUT1, PPQRY_GENVARCRONO1, "A.PROGRESSIVO_IMPUTAZIONE", "REGEVACRPRIM", 3, 10, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_LIST, 720, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_LIST, "FINANZIAMENTO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_FORM, 4, 328, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_FINANZIAMEN1, MyGlb.PANEL_FORM, "FINANZIAMENTO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_FINANZIAMEN1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_FINANZIAMEN1, PPQRY_GENVARCRONO1, "A.FINANZIAMENTO", "RECGENVACRFI", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_LIST, "ANNO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 4, 376, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOVAR, MyGlb.PANEL_FORM, "ANNO VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOVAR, PPQRY_GENVARCRONO1, "A.ANNO_VAR", "REGEVACRANVA", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_LIST, 920, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_LIST, "ESERCIZIO ISCRIZIONE");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_FORM, 4, 376, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ESERCIISCRIZ, MyGlb.PANEL_FORM, "ESERCIZIO ISCRIZIONE");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ESERCIISCRIZ, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ESERCIISCRIZ, PPQRY_GENVARCRONO1, "A.ESERCIZIO_ISCRIZIONE", "REGEVACRESIS", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, 932, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, 4, 376, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_DESCTIPOVARI, MyGlb.PANEL_FORM, "Tp. Variaz.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_DESCTIPOVARI, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_DESCTIPOVARI, PPQRY_GENVARCRONO1, "A.DESCRIZIONE", "RECGENVACRDE", 5, 50, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_LIST, "TIPO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_FORM, 4, 400, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR, MyGlb.PANEL_FORM, "TIPO VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVAR, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVAR, PPQRY_GENVARCRONO1, "A.TIPO_VAR", "REGEVACRTIVA", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_LIST, 1044, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_LIST, "Progr.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_FORM, 4, 400, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMERORIGA, MyGlb.PANEL_FORM, "Progr.");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMERORIGA, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_NUMERORIGA, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMERORIGA, PPQRY_GENVARCRONO1, "ROWNUM", "NUMERORIGA", 1, 19, 0, -13997);
    PAN_VARIAZIONI.set_Mask(PFL_VARIAZIONI_NUMERORIGA, "0000");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_LIST, "IMPORTO PURO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_FORM, 4, 424, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOPURO, MyGlb.PANEL_FORM, "IMPORTO PURO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTOPURO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTOPURO, PPQRY_GENVARCRONO1, "A.IMPORTO_PURO", "REGEVACRIMPU", 2, 15, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_LIST, "IMPORTO REISC");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_FORM, 4, 448, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTOREISC, MyGlb.PANEL_FORM, "IMPORTO REISC");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTOREISC, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTOREISC, PPQRY_GENVARCRONO1, "A.IMPORTO_REISC", "REGEVACRIMRE", 2, 15, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOCAPITOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECGENVACRCA~~ IS NULL))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_DUAL2, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_DUAL2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_DUAL2, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~RECGENVACROP~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_OPERE1, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_OPERE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_OPERE1, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FINANZFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~RECGENVACRFI~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_FINANZIAMEN1, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_FINANZIAMEN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_FINANZIAMEN1, "FINANZIAMENTI");
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_GENVARCRONO1", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ROWNUM as NUMERORIGA, ");
    SQL.append("  A.CRONOPROGRAMMA_ID as REGEVACRCRID, ");
    SQL.append("  A.PROGRESSIVO_IMPUTAZIONE as REGEVACRPRIM, ");
    SQL.append("  A.ESERCIZIO_PLUR as REGEVACRESPL, ");
    SQL.append("  A.CODICE_STRUTTURA as REGEVACRCOST, ");
    SQL.append("  A.COD_PIANO_CONTI as REGEVACRCOPC, ");
    SQL.append("  A.FINANZIAMENTO as RECGENVACRFI, ");
    SQL.append("  A.CAPITOLO as RECGENVACRCA, ");
    SQL.append("  A.ARTICOLO as RECGENVACRAR, ");
    SQL.append("  A.OPERA as RECGENVACROP, ");
    SQL.append("  A.ANNO_VAR as REGEVACRANVA, ");
    SQL.append("  A.IMPORTO as RECGENVACRIM, ");
    SQL.append("  A.ESERCIZIO_ISCRIZIONE as REGEVACRESIS, ");
    SQL.append("  A.DESCRIZIONE as RECGENVACRDE, ");
    SQL.append("  A.TIPO_VAR as REGEVACRTIVA, ");
    SQL.append("  A.IMPORTO_PURO as REGEVACRIMPU, ");
    SQL.append("  A.IMPORTO_REISC as REGEVACRIMRE ");
    PAN_VARIAZIONI.SetQuery(PPQRY_GENVARCRONO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  GEN_VAR_CRONO A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_GENVARCRONO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_VAR = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_GENVARCRONO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_GENVARCRONO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_GENVARCRONO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE_STRUTTURA, ");
    SQL.append("  A.COD_PIANO_CONTI, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.OPERA, ");
    SQL.append("  A.FINANZIAMENTO, ");
    SQL.append("  A.TIPO_VAR, ");
    SQL.append("  A.ESERCIZIO_PLUR ");
    PAN_VARIAZIONI.SetQuery(PPQRY_GENVARCRONO1, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_GENVARCRONO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "GEN_VAR_CRONO");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CODICESTRUT1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CODPIANOCON1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CAPITOLO1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ARTICOLO1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_OPERA1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_FINANZIAMEN1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_TIPOVAR, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ESERCIZIPLU1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIONI.iUseListQBE;
      PAN_VARIAZIONI.iUseListQBE = 0;
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIAZIMPSUB_Init()
  {

    PAN_VARIAZIMPSUB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIMPSUB.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, "908557A3-C6A6-4220-A50A-98D2F8CCCC49");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, "Impegno");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, MyGlb.PANEL_FORM, 0, -21, 172, 169, 0, 0);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, 0, 51);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, 1, 13);
    PAN_VARIAZIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, 0, 4);
    PAN_VARIAZIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, 1, 4);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, "F9FBDFEA-A78D-4157-B636-9EEB83499A5F");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, "Sub Impegno");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, MyGlb.PANEL_LIST, 112, -9999, 112, 16, 0, 0);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, MyGlb.PANEL_FORM, 0, 27, 172, 145, 0, 0);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, 0, 75);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, 1, 13);
    PAN_VARIAZIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, 0, 4);
    PAN_VARIAZIMPSUB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, 1, 4);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAZIMPSUB_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAZIMPSUB.SetSize(MyGlb.OBJ_FIELD, 33);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, "0E3A0F97-EDF6-4B7B-B19D-974AA1D157B4");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, "Raggruppamento");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, "617281E2-4388-4709-878E-FF31FE176F0C");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, "Opera");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, "EDF79A64-E3DB-4364-A5F5-B014A75DE56E");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, "Finanziamento");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, "EC543E7C-7A99-452A-B69D-F859FF56D451");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, "Importo Variazione Crono");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, "135C90E3-F7DA-4EC5-A031-D1E527FD3422");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, "Tipo Var.");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, "CBF4CA09-4D64-4AEE-A501-4E45219E925A");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, "Capitolo");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, "05E1860C-0C32-4E39-83FA-A97A137109FD");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, "Art.");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, 0 | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, "0AEDBECC-0BC1-443C-B5EC-C814ABB75F65");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, "Numero");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, "6711F5C9-7D11-49DD-AE80-81F3CE201F18");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, "Anno");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, "1E8CB05A-1749-49FC-983B-8BCA484A3BB6");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, " ");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, "B3E991F3-DDA1-40B3-8288-8E1A81BC976F");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, "Numero");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, "067FE921-12E0-4DA7-BCB3-4EC53B29B08D");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, "Anno");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, "B77D498F-904C-40C0-A1ED-45ACB9FECFE1");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, " ");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, "78981465-A484-47F2-A782-5A497CA0AFCF");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, "Descrizione");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, "02DE99CE-DBE7-4BEE-A7A6-3EA40312DD3D");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, "Reisc. da Stn.");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.VIS_CHECKSTYLE);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, "B1161414-F4AD-48EA-8950-0184DBB18AA9");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, "Disponibilità");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, "AF1F13D1-5ACF-408A-8C57-33C09DA5D444");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, "Importo Variazione");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, "16E52ED3-2AB3-4533-B75D-51D8930D8F65");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, " ");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, "85192D16-A947-4D9C-A40D-2DAE94D67D74");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, "PROGR SESSIONE");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, "E51C5980-2AD2-4A43-BE28-7CD55CF8AC51");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, "NUMERO SUBIMP 1");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, "B945F338-83DB-4DF1-A96F-952CE7855BB1");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, "ANNO SUBIMP 1");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, "1A6D28D3-4EAB-41E3-B7ED-2F53E3E93C11");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, "CRONOPROGRAMMA ID");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, "1316F4AB-33FE-4332-BF2E-5217415853EF");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, "PROGRESSIVO IMPUTAZIONE");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, "36609F0C-4085-4873-9D7A-1DC2F073D169");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, "ESERCIZIO PLUR");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, "5F8E06C4-5741-44CB-9F11-4E4FE75ACE15");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, "TIPO VAR CRONO");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, "329BBBE5-C5C4-414A-A02C-FFE63201D68C");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, "Totale");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, "66A4F6E6-F155-4E36-A334-9EAB21C189F3");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, "0.0");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, "D112DFD3-BDB0-4A74-9DA6-D3E3C2D81BFB");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, "0.0");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, "A3CA4DB5-5AAC-4174-8E41-A2701FFB939B");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, "Codice Struttura");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, "CE39482B-AFCA-417E-AD54-1BFE093A76CC");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, "Cod Piano Conti");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, "01C0F3E9-C724-4177-9270-D071F8DCAC7A");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, "Ord NumeroSubimp");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, "990ECFFD-69FD-47FB-844D-C7300A517A74");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, "Ord Anno Subimp");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPSUB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, "7A9EE412-E6B1-42BF-962A-C6DA5D820A39");
    PAN_VARIAZIMPSUB.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, "Importo Var Imp");
    PAN_VARIAZIMPSUB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, "");
    PAN_VARIAZIMPSUB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPSUB.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VARIAZIMPSUB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_LIST, "Raggruppamento");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 4, 424, 544, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_RAGGRUPPAMEN, MyGlb.PANEL_FORM, "Raggruppamento");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_RAGGRUPPAMEN, -1, -1);
    SQL = new StringBuffer();
    SQL.append("LPAD(TO_CHAR ( A.NUM_RIGA_VAR_CRONO ), 4, SUBSTR('0', 1, 1)) || ' - ' || 'Opera' || ' ' || TO_CHAR ( A.OPERA ) || ' - ' || 'Finanziamento' || ' ' || TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || 'Capitolo' || ' ' || TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' - ' || 'Variazione di ' || ( ");
  SQL.append("select ");
  SQL.append("  C.DESCRIZIONE ");
  SQL.append("from ");
  SQL.append("  TIPI_VAR_CRONOPROGRAMMI C ");
  SQL.append("where (C.CODICE = A.TIPO_VAR_CRONO) ");
  SQL.append(") || ' ' || 'Importo' || ':' || ' ' || DECODE(NVL(A.IMPORTO_VAR_CRONO_PURO, 0), 0, '', 'Puro ' || LTRIM(TO_CHAR ( TO_CHAR ( A.IMPORTO_VAR_CRONO_PURO ),'999G999G999G990D00','NLS_NUMERIC_CHARACTERS = '',.''')) || '    ') || DECODE(NVL(A.IMPORTO_VAR_CRONO_REISC, 0), 0, '', 'Reiscrizioni ' || LTRIM(TO_CHAR ( TO_CHAR ( A.IMPORTO_VAR_CRONO_REISC ),'999G999G999G990D00','NLS_NUMERIC_CHARACTERS = '',.''')) || ' ')");
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_RAGGRUPPAMEN, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_RAGGRUPPAMEN, PPQRY_WRKGENVACRV1, SQL.toString(), "RAGGRUPPAMEN", 5, 809, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_FORM, 4, 268, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_FORM, 48);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_OPERA, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_OPERA, PPQRY_WRKGENVACRV1, "A.OPERA", "OPERA", 1, 5, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_LIST, 92, 36, 92, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 292, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_FINANZIAMENT, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_FINANZIAMENT, PPQRY_WRKGENVACRV1, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_LIST, 184, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_LIST, "Importo Variazione Crono");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_FORM, 4, 400, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORVARCRON, MyGlb.PANEL_FORM, "Imp. Variaz. Crono");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_IMPORVARCRON, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_IMPORVARCRON, PPQRY_WRKGENVACRV1, "A.IMPORTO_VAR_CRONO", "IMPORTO_VAR_CRONO", 3, 14, 2, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, 292, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, 248);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_LIST, "Tipo Var.");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, 4, 376, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, 248);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DESCRTIPOVAR, MyGlb.PANEL_FORM, "Tipo Var.");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_DESCRTIPOVAR, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_DESCRTIPOVAR, PPQRY_TIPIVARCRONO, "A.DESCRIZIONE", "TIPVARCRODES", 5, 50, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 368, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 4, 220, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_CAPITOLO, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_CAPITOLO, PPQRY_WRKGENVACRV1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 492, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 4, 244, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ARTICOLO, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ARTICOLO, PPQRY_WRKGENVACRV1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 4, 4, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_NUMEROIMP, -1, GRP_VARIAZIMPSUB_IMPEGNO);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_NUMEROIMP, PPQRY_WRKGENVACRV1, "A.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 52, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 4, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ANNOIMP, -1, GRP_VARIAZIMPSUB_IMPEGNO);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ANNOIMP, PPQRY_WRKGENVACRV1, "A.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_LIST, 92, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOIMPE, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_DUALINFOIMPE, -1, GRP_VARIAZIMPSUB_IMPEGNO);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_DUALINFOIMPE, PPQRY_DUAL, "'I'", "INFOIMPEGNO", 5, 1, 0, -13997);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DUALINFOIMPE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DUALINFOIMPE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DUALINFOIMPE, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_LIST, 112, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Numero");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 52, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_NUMEROSUBIMP, -1, GRP_VARIAZIMPSUB_SUBIMPEGNO);
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_NUMEROSUBIMP, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_NUMEROSUBIMP, PPQRY_WRKGENVACRV1, "CASE WHEN NVL(A.NUMERO_SUBIMP, 0) = 0 THEN to_number(NULL) ELSE A.NUMERO_SUBIMP END", "RECORNUMSUBI", 1, 19, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_LIST, 164, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 76, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ANNOSUBIMP, -1, GRP_VARIAZIMPSUB_SUBIMPEGNO);
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_ANNOSUBIMP, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ANNOSUBIMP, PPQRY_WRKGENVACRV1, "CASE WHEN NVL(A.ANNO_SUBIMP, 0) = 0 THEN to_number(NULL) ELSE A.ANNO_SUBIMP END", "RECOANNOSUBI", 1, 19, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_LIST, 204, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DUALINFOSUB1, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_DUALINFOSUB1, -1, GRP_VARIAZIMPSUB_SUBIMPEGNO);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_DUALINFOSUB1, PPQRY_DUAL1, "'I'", "INFOIMPEGNO", 5, 1, 0, -13997);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DUALINFOSUB1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DUALINFOSUB1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DUALINFOSUB1, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_LIST, 224, 36, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_FORM, 4, 340, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_IMPDESCRIZIO, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_IMPDESCRIZIO, PPQRY_IMP, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 584, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_LIST, "Reisc. da Stn.");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 4, 484, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPDAREISSTN, MyGlb.PANEL_FORM, "Reisc. da Stn.");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_IMPDAREISSTN, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_IMPDAREISSTN, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_IMPDAREISSTN, PPQRY_WRKGENVACRV1, "D.IMP_DA_REISCR_STN", "IMP_DA_REISCR_STN", 5, 2, 0, -13997);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_IMPDAREISSTN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_IMPDAREISSTN, (new IDVariant()), "Null", "", "", -1);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_LIST, 632, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 196, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_DISPONIBILIT, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_DISPONIBILIT, PPQRY_WRKGENVACRV1, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_LIST, 748, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_LIST, "Importo Variazione");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_FORM, 136);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIAZ, MyGlb.PANEL_FORM, "Importo Variazione");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_IMPORTVARIAZ, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_IMPORTVARIAZ, PPQRY_WRKGENVACRV1, "A.IMPORTO_VARIAZIONE", "IMPORTO_VARIAZIONE", 3, 14, 2, -13999);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_LIST, 856, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_FORM, 4, 316, 624, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_FORM, 116);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_DISPIMPSUB, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_DISPIMPSUB, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_DISPIMPSUB, PPQRY_DISPIMPSUB, "CRONO_VERIFICA_DISP_VAR(~~TBL_DATISESSIONE.SESSIOESERCI~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~CRONOPROGRAMMA_ID~~,~~PROGRESSIVO_IMPUTAZIONE~~,~~FINANZIAMENTO~~,~~ESERCIZIO_PLUR~~,~~OPERA~~,~~CAPITOLO~~,~~ARTICOLO~~,~~TIPO_VAR_CRONO~~,~~ANNO_IMP~~,~~NUMERO_IMP~~,~~RECOANNOSUBI~~,~~RECORNUMSUBI~~)", "DISPIMPSUB", 5, 99, 0, -13997);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("OK")), "Faccina Verde", "", "smileverde.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("E1")), "Faccina rossa (Errore 1)", "Importo superiore alla disponibilità", "smilerosso.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("E2")), "Faccina rossa (Errore 2)", "L'importo della variazione del Cronoprogramma non è stato interamente distribuito su Impegni e Subimpegni", "smilerosso.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("E3")), "Faccina rossa (Errore 3)", "La somma degli importi Variazione indicati su Impegni e Subimpegni non è uguale all'importo della variazione del Cronoprogramma", "smilerosso.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("E4")), "Faccina rossa (Errore 4)", "La somma degli importi di Variazione indicati non porta a zero la Disponibilità di Impegni e Subimpegni", "smilerosso.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("W1")), "Faccina gialla (Warning 1)", "L'importo della Variazione del Cronoprogramma è Negativo e maggiore della disponibilità di Impegni e Subimpegni", "smile_question.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("E5")), "Faccina rossa (Errore 5) ", "La somma degli importi dei subimpegni supera l'importo del relativo impegno", "smilerosso.gif", -1);
    PAN_VARIAZIMPSUB.SetValueListItem(PFL_VARIAZIMPSUB_DISPIMPSUB, (new IDVariant("E6")), "Faccina rossa (Errore 6)", "La variazione di Impegno o Subimpegno ha segno diverso della variazione di Crono", "smilerosso.gif", -1);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_LIST, "PROGR SESSIONE");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_FORM, 4, 124, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGRSESSION, MyGlb.PANEL_FORM, "PROGR SESSIONE");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_PROGRSESSION, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_PROGRSESSION, PPQRY_WRKGENVACRV1, "A.PROGR_SESSIONE", "PROGR_SESSIONE", 3, 10, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_LIST, "NUMERO SUBIMP 1");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 4, 124, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_NUMEROSUBIM1, MyGlb.PANEL_FORM, "NUM. SUBIMP 1");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_NUMEROSUBIM1, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_NUMEROSUBIM1, PPQRY_WRKGENVACRV1, "A.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_LIST, "ANNO SUBIMP 1");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 4, 124, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ANNOSUBIMP1, MyGlb.PANEL_FORM, "ANN. SUBIMP 1");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ANNOSUBIMP1, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ANNOSUBIMP1, PPQRY_WRKGENVACRV1, "A.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_LIST, 468, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_LIST, 140);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 220, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_FORM, 140);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CRONOPROGRID, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_CRONOPROGRID, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_CRONOPROGRID, PPQRY_WRKGENVACRV1, "A.CRONOPROGRAMMA_ID", "CRONOPROGRAMMA_ID", 3, 10, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_LIST, 468, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_LIST, 168);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_LIST, "PROGRESSIVO IMPUTAZIONE");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_FORM, 4, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_FORM, 168);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_PROGREIMPUTA, MyGlb.PANEL_FORM, "PROGRESSIVO IMPUTAZIONE");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_PROGREIMPUTA, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_PROGREIMPUTA, PPQRY_WRKGENVACRV1, "A.PROGRESSIVO_IMPUTAZIONE", "PROGRESSIVO_IMPUTAZIONE", 3, 10, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_LIST, "ESERCIZIO PLUR");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_FORM, 4, 316, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_FORM, 100);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ESERCIZIPLUR, MyGlb.PANEL_FORM, "ESERCIZIO PLUR");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ESERCIZIPLUR, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ESERCIZIPLUR, PPQRY_WRKGENVACRV1, "A.ESERCIZIO_PLUR", "ESERCIZIO_PLUR", 1, 4, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_LIST, "TIPO VAR CRONO");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_FORM, 4, 376, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_TIPOVARCRONO, MyGlb.PANEL_FORM, "TIPO VAR CRONO");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_TIPOVARCRONO, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_TIPOVARCRONO, PPQRY_WRKGENVACRV1, "A.TIPO_VAR_CRONO", "TIPO_VAR_CRONO", 1, 2, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, MyGlb.PANEL_LIST, 560, 240, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, MyGlb.PANEL_FORM, 548, 152, 64, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ETICHETOTALE, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_VARIAZIMPSUB.set_Alignment(PFL_VARIAZIMPSUB_ETICHETOTALE, 4);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, MyGlb.PANEL_LIST, 628, 240, 116, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, MyGlb.PANEL_FORM, 520, 108, 120, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHETOTDIS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ETICHETOTDIS, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ETICHETOTDIS, -1, "", "ETICHETOTDIS", 0, 0, 0, -13997);
    PAN_VARIAZIMPSUB.set_Alignment(PFL_VARIAZIMPSUB_ETICHETOTDIS, 4);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, MyGlb.PANEL_LIST, 744, 240, 112, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, MyGlb.PANEL_FORM, 528, 116, 120, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ETICHTOTDIS1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ETICHTOTDIS1, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ETICHTOTDIS1, -1, "", "ETICHTOTDIS1", 0, 0, 0, -13997);
    PAN_VARIAZIMPSUB.set_Alignment(PFL_VARIAZIMPSUB_ETICHTOTDIS1, 4);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_LIST, "Codice Struttura");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_FORM, 4, 424, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODICESTRUTT, MyGlb.PANEL_FORM, "Codice Struttura");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_CODICESTRUTT, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_CODICESTRUTT, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_CODICESTRUTT, PPQRY_WRKGENVACRV1, "A_GET_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO)", "CODICESTRUTT", 1, 19, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_LIST, 96);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_LIST, "Cod Piano Conti");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_FORM, 4, 424, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_FORM, 96);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_CODPIANOCONT, MyGlb.PANEL_FORM, "Cod Piano Conti");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_CODPIANOCONT, -1, -1);
    SQL = new StringBuffer();
    SQL.append("( ");
  SQL.append("select ");
  SQL.append("  DECODE(B.MACRO_LIV_5_STR, '0', B.MACRO_LIV_4_STR, B.MACRO_LIV_5_STR) ");
  SQL.append("from ");
  SQL.append("  VISTA_CODIFICHE_CAP B ");
  SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
  SQL.append("and   (B.E_S = 'S') ");
  SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
  SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
  SQL.append(")");
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_CODPIANOCONT, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_CODPIANOCONT, PPQRY_WRKGENVACRV1, SQL.toString(), "CODPIANOCONT", 5, 99, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_LIST, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_LIST, "Ord NumeroSubimp");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_FORM, 4, 424, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_FORM, 120);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDNUMEROSUB, MyGlb.PANEL_FORM, "Ord NumeroSubimp");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ORDNUMEROSUB, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_ORDNUMEROSUB, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ORDNUMEROSUB, PPQRY_WRKGENVACRV1, "NVL(A.NUMERO_SUBIMP, 0)", "ORDNUMEROSUB", 1, 19, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_LIST, "Ord Anno Subimp");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, 4, 424, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_ORDANNOSUBIM, MyGlb.PANEL_FORM, "Ord Anno Subimp");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_ORDANNOSUBIM, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_ORDANNOSUBIM, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_ORDANNOSUBIM, PPQRY_WRKGENVACRV1, "NVL(A.ANNO_SUBIMP, 0)", "ORDANNOSUBIM", 1, 19, 0, -13997);
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_LIST, 876, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_LIST, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_LIST, "Importo Var Imp");
    PAN_VARIAZIMPSUB.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_FORM, 4, 508, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPSUB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_FORM, 104);
    PAN_VARIAZIMPSUB.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPSUB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPSUB_IMPORTVARIMP, MyGlb.PANEL_FORM, "Importo Var Imp");
    PAN_VARIAZIMPSUB.SetFieldPage(PFL_VARIAZIMPSUB_IMPORTVARIMP, -1, -1);
    PAN_VARIAZIMPSUB.SetFieldUnbound(PFL_VARIAZIMPSUB_IMPORTVARIMP, true);
    PAN_VARIAZIMPSUB.SetFieldPanel(PFL_VARIAZIMPSUB_IMPORTVARIMP, PPQRY_WRKGENVACRV1, "DECODE(NVL(A.NUMERO_SUBIMP, 0), 0, A.IMPORTO_VARIAZIONE, 0)", "IMPORTVARIMP", 3, 28, 6, -13997);
  }

  private void PAN_VARIAZIMPSUB_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIMPSUB.SetSize(MyGlb.OBJ_QUERY, 8);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOIMPEGNO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~NUMERO_IMP~~ IS NULL))) ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPSUB.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOIMPEGNO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECORNUMSUBI~~ IS NULL))) ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_DUAL1, 0, SQL, -1, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPSUB.SetMasterTable(PPQRY_DUAL1, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~ANNO_IMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~NUMERO_IMP~~) ");
    SQL.append("and   (NVL(~~RECORNUMSUBI~~, 0) = 0) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SUBIMP B, ");
    SQL.append("  IMP C ");
    SQL.append("where (C.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (B.ANNO_SUBIMP = ~~RECOANNOSUBI~~) ");
    SQL.append("and   (B.NUMERO_SUBIMP = ~~RECORNUMSUBI~~) ");
    SQL.append("and   (NVL(~~RECORNUMSUBI~~, 0) <> 0) ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPSUB.SetMasterTable(PPQRY_IMP, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CRONO_VERIFICA_DISP_VAR(~~TBL_DATISESSIONE.SESSIOESERCI~~," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",~~CRONOPROGRAMMA_ID~~,~~PROGRESSIVO_IMPUTAZIONE~~,~~FINANZIAMENTO~~,~~ESERCIZIO_PLUR~~,~~OPERA~~,~~CAPITOLO~~,~~ARTICOLO~~,~~TIPO_VAR_CRONO~~,~~ANNO_IMP~~,~~NUMERO_IMP~~,~~RECOANNOSUBI~~,~~RECORNUMSUBI~~) as DISPIMPSUB ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~CRONOPROGRAMMA_ID~~ IS NULL))) ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_DISPIMPSUB, 0, SQL, -1, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_DISPIMPSUB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPSUB.SetMasterTable(PPQRY_DISPIMPSUB, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as TIPVARCRODES ");
    SQL.append("from ");
    SQL.append("  TIPI_VAR_CRONOPROGRAMMI A ");
    SQL.append("where (A.CODICE = ~~TIPO_VAR_CRONO~~) ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_TIPIVARCRONO, 0, SQL, -1, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_TIPIVARCRONO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPSUB.SetMasterTable(PPQRY_TIPIVARCRONO, "TIPI_VAR_CRONOPROGRAMMI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZOPERA ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_OPERE, 0, SQL, PFL_VARIAZIMPSUB_OPERA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as OPERECODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZOPERA ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_OPERE, 1, SQL, PFL_VARIAZIMPSUB_OPERA, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~FINANZIAMENTO~~) ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_VARIAZIMPSUB_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIFINANZ ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_VARIAZIMPSUB_FINANZIAMENT, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPSUB.SetIMDB(IMDB, "PQRY_WRKGENVACRV1", true);
    PAN_VARIAZIMPSUB.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',A.CAPITOLO,A.ARTICOLO) as CODICESTRUTT, ");
    SQL.append("  ( ");
    SQL.append("select ");
    SQL.append("  DECODE(B.MACRO_LIV_5_STR, '0', B.MACRO_LIV_4_STR, B.MACRO_LIV_5_STR) ");
    SQL.append("from ");
    SQL.append("  VISTA_CODIFICHE_CAP B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.E_S = 'S') ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append(") as CODPIANOCONT, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  D.IMP_DA_REISCR_STN as IMP_DA_REISCR_STN, ");
    SQL.append("  CASE WHEN NVL(A.NUMERO_SUBIMP, 0) = 0 THEN to_number(NULL) ELSE A.NUMERO_SUBIMP END as RECORNUMSUBI, ");
    SQL.append("  CASE WHEN NVL(A.ANNO_SUBIMP, 0) = 0 THEN to_number(NULL) ELSE A.ANNO_SUBIMP END as RECOANNOSUBI, ");
    SQL.append("  NVL(A.NUMERO_SUBIMP, 0) as ORDNUMEROSUB, ");
    SQL.append("  NVL(A.ANNO_SUBIMP, 0) as ORDANNOSUBIM, ");
    SQL.append("  A.IMPORTO_VARIAZIONE as IMPORTO_VARIAZIONE, ");
    SQL.append("  DECODE(NVL(A.NUMERO_SUBIMP, 0), 0, A.IMPORTO_VARIAZIONE, 0) as IMPORTVARIMP, ");
    SQL.append("  A.PROGR_SESSIONE as PROGR_SESSIONE, ");
    SQL.append("  A.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.CRONOPROGRAMMA_ID as CRONOPROGRAMMA_ID, ");
    SQL.append("  A.PROGRESSIVO_IMPUTAZIONE as PROGRESSIVO_IMPUTAZIONE, ");
    SQL.append("  A.ESERCIZIO_PLUR as ESERCIZIO_PLUR, ");
    SQL.append("  A.TIPO_VAR_CRONO as TIPO_VAR_CRONO, ");
    SQL.append("  A.IMPORTO_VAR_CRONO as IMPORTO_VAR_CRONO, ");
    SQL.append("  A.NUM_RIGA_VAR_CRONO as NUM_RIGA_VAR_CRONO, ");
    SQL.append("  LPAD(TO_CHAR ( A.NUM_RIGA_VAR_CRONO ), 4, SUBSTR('0', 1, 1)) || ' - ' || 'Opera' || ' ' || TO_CHAR ( A.OPERA ) || ' - ' || 'Finanziamento' || ' ' || TO_CHAR ( A.FINANZIAMENTO ) || ' - ' || 'Capitolo' || ' ' || TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) || ' - ' || 'Variazione di ' || ( ");
    SQL.append("select ");
    SQL.append("  C.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  TIPI_VAR_CRONOPROGRAMMI C ");
    SQL.append("where (C.CODICE = A.TIPO_VAR_CRONO) ");
    SQL.append(") || ' ' || 'Importo' || ':' || ' ' || DECODE(NVL(A.IMPORTO_VAR_CRONO_PURO, 0), 0, '', 'Puro ' || LTRIM(TO_CHAR ( TO_CHAR ( A.IMPORTO_VAR_CRONO_PURO ),'999G999G999G990D00','NLS_NUMERIC_CHARACTERS = '',.''')) || '    ') || DECODE(NVL(A.IMPORTO_VAR_CRONO_REISC, 0), 0, '', 'Reiscrizioni ' || LTRIM(TO_CHAR ( TO_CHAR ( A.IMPORTO_VAR_CRONO_REISC ),'999G999G999G990D00','NLS_NUMERIC_CHARACTERS = '',.''')) || ' ') as RAGGRUPPAMEN ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_WRKGENVACRV1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_GEN_VAR_CRONO_VARIMP A, ");
    SQL.append("  IMP D ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_WRKGENVACRV1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (D.ANNO_IMP = A.ANNO_IMP) ");
    SQL.append("and   (D.NUMERO_IMP = A.NUMERO_IMP) ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_WRKGENVACRV1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_WRKGENVACRV1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_WRKGENVACRV1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 25, 9, 8, 7, 13, 12 ");
    PAN_VARIAZIMPSUB.SetQuery(PPQRY_WRKGENVACRV1, 5, SQL, -1, "");
    PAN_VARIAZIMPSUB.SetQueryDB(PPQRY_WRKGENVACRV1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPSUB.SetMasterTable(0, "WRK_GEN_VAR_CRONO_VARIMP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIMPSUB.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIMPSUB.iUseListQBE;
      PAN_VARIAZIMPSUB.iUseListQBE = 0;
      PAN_VARIAZIMPSUB.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIMPSUB.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIMPSUB.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_OnChangeRow();
  }

  public void OnSelectingRow(IDPanel SrcObj)
  {
  }

  public void OnSorting(IDPanel SrcObj, IDVariant FldIdx, IDVariant Cancel)
  {
  }

  public void OnChangeSelection(IDPanel SrcObj, IDVariant NewVal, IDVariant Final, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnChangeSelection(NewVal, Final, Cancel);
  }
  
  public void OnChangeLocking(IDPanel SrcObj, IDVariant NewLocking, IDVariant Cancel)
  {
  }
  
  public void OnChangeStatus(IDPanel SrcObj, IDVariant OldStatus)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIAZIMPSUB) PAN_VARIAZIMPSUB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnShowMultipleSelection(NewValue, Cancel, UserOperation);
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
