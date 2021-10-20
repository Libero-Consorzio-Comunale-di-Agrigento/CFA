// **********************************************
// Dettaglio Composizione Importi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DettaglioComposizioneImporti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DETTCOMPIMPO_IMPORTORIGIN = 0;
  private static int GRP_DETTCOMPIMPO_IMPOINIZESER = 1;
  private static int GRP_DETTCOMPIMPO_VARIANNINCOR = 2;
  private static int GRP_DETTCOMPIMPO_IMPORTATTUAL = 3;

  private static int PFL_DETTCOMPIMPO_ESERCIZIPLUR = 0;
  private static int PFL_DETTCOMPIMPO_FINANZIAMEN1 = 1;
  private static int PFL_DETTCOMPIMPO_FINANZDESCRI = 2;
  private static int PFL_DETTCOMPIMPO_IMPOORIGTOTA = 3;
  private static int PFL_DETTCOMPIMPO_IMPOORIGREIS = 4;
  private static int PFL_DETTCOMPIMPO_IMPOORIGPURO = 5;
  private static int PFL_DETTCOMPIMPO_ETILABINIES1 = 6;
  private static int PFL_DETTCOMPIMPO_IMPOINIZTOTA = 7;
  private static int PFL_DETTCOMPIMPO_IMPOINIZREIS = 8;
  private static int PFL_DETTCOMPIMPO_IMPOINIZPURO = 9;
  private static int PFL_DETTCOMPIMPO_ETILABINIESE = 10;
  private static int PFL_DETTCOMPIMPO_VARIANNOTOTA = 11;
  private static int PFL_DETTCOMPIMPO_VARIANNOREIS = 12;
  private static int PFL_DETTCOMPIMPO_VARIANNOSOSP = 13;
  private static int PFL_DETTCOMPIMPO_VARIANNOPURO = 14;
  private static int PFL_DETTCOMPIMPO_IMPOATTUTOTA = 15;
  private static int PFL_DETTCOMPIMPO_IMPOATTUREIS = 16;
  private static int PFL_DETTCOMPIMPO_IMPOATTUSOSP = 17;
  private static int PFL_DETTCOMPIMPO_IMPOATTUPURO = 18;

  private static int PPQRY_DUAL38 = 0;

  private static int PPQRY_FINANZIAMENT = 1;


  IDPanel PAN_DETTCOMPIMPO;
  private static int GRP_VISTOTFIOPCA_IMPEGNATO = 0;
  private static int GRP_VISTOTFIOPCA_PAGATO = 1;
  private static int GRP_VISTOTFIOPCA_DISPONIBILIT = 2;

  private static int PFL_VISTOTFIOPCA_ESERCIZIO = 0;
  private static int PFL_VISTOTFIOPCA_FINANZIAMENT = 1;
  private static int PFL_VISTOTFIOPCA_OPERA = 2;
  private static int PFL_VISTOTFIOPCA_ES = 3;
  private static int PFL_VISTOTFIOPCA_CAPITOLO = 4;
  private static int PFL_VISTOTFIOPCA_ARTICOLO = 5;
  private static int PFL_VISTOTFIOPCA_CODICE = 6;
  private static int PFL_VISTOTFIOPCA_DESCRIZIONE = 7;
  private static int PFL_VISTOTFIOPCA_IMPEGNTOTALE = 8;
  private static int PFL_VISTOTFIOPCA_IMPEREIDASTN = 9;
  private static int PFL_VISTOTFIOPCA_IMPEGNATPURO = 10;
  private static int PFL_VISTOTFIOPCA_PAGATOTOTALE = 11;
  private static int PFL_VISTOTFIOPCA_PAGAREIDASTN = 12;
  private static int PFL_VISTOTFIOPCA_PAGATOPURO = 13;
  private static int PFL_VISTOTFIOPCA_DISPONIBILIT = 14;
  private static int PFL_VISTOTFIOPCA_DISPOREISSTN = 15;
  private static int PFL_VISTOTFIOPCA_DISPONIBPURO = 16;
  private static int PFL_VISTOTFIOPCA_PREVISIONE = 17;
  private static int PFL_VISTOTFIOPCA_VARIAZIONI = 18;
  private static int PFL_VISTOTFIOPCA_PREVISIONATT = 19;
  private static int PFL_VISTOTFIOPCA_VARIAZIOPROV = 20;
  private static int PFL_VISTOTFIOPCA_ACCIMPRES = 21;
  private static int PFL_VISTOTFIOPCA_MANORDCOMP = 22;
  private static int PFL_VISTOTFIOPCA_MANORDRES = 23;
  private static int PFL_VISTOTFIOPCA_MANORD = 24;
  private static int PFL_VISTOTFIOPCA_SUBIMPEGNATO = 25;
  private static int PFL_VISTOTFIOPCA_LIQUIDATO = 26;
  private static int PFL_VISTOTFIOPCA_PREVISIOESIG = 27;
  private static int PFL_VISTOTFIOPCA_VARIAZIOESIG = 28;
  private static int PFL_VISTOTFIOPCA_PREVISISTANZ = 29;
  private static int PFL_VISTOTFIOPCA_VARIAZISTANZ = 30;
  private static int PFL_VISTOTFIOPCA_ACCIMPCOMESI = 31;
  private static int PFL_VISTOTFIOPCA_PAGAREIDAESI = 32;

  private static int PPQRY_VISTOTFIOPCA = 0;

  private static int PPQRY_CAMPICALCOLA = 1;


  IDPanel PAN_VISTOTFIOPCA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI514(IMDB);
    //
    //
    Init_PQRY_DUAL38(IMDB);
    Init_PQRY_VISTOTFIOPCA(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI514(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI514, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI514, "TBL_PARAMETRI514");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMCRONOID, "PARAMCRONOID");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMCRONOID,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAPROGIMPU, "PARAPROGIMPU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAPROGIMPU,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAESERPLUR, "PARAESERPLUR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAESERPLUR,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI514,IMDBDef3.FLD_PARAMETRI514_PARAMARTICOL,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI514, 0);
  }

  private static void Init_PQRY_DUAL38(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_DUAL38, 16);
    IMDB.set_TblCode(IMDBDef11.PQRY_DUAL38, "PQRY_DUAL38");
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_RECOESERPLUR, "RECOESERPLUR");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_RECOESERPLUR,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_RECORDFINANZ, "RECORDFINANZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_RECORDFINANZ,1,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOORIGTOTA, "IMPOORIGTOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOORIGTOTA,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOORIGREIS, "IMPOORIGREIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOORIGREIS,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOORIGPURO, "IMPOORIGPURO");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOORIGPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOINIZTOTA, "IMPOINIZTOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOINIZTOTA,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOINIZREIS, "IMPOINIZREIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOINIZREIS,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOINIZPURO, "IMPOINIZPURO");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOINIZPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOTOTA, "VARIANNOTOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOTOTA,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOREIS, "VARIANNOREIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOREIS,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOSOSP, "VARIANNOSOSP");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOSOSP,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOPURO, "VARIANNOPURO");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_VARIANNOPURO,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUTOTA, "IMPOATTUTOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUTOTA,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUREIS, "IMPOATTUREIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUREIS,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUSOSP, "IMPOATTUSOSP");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUSOSP,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUPURO, "IMPOATTUPURO");
    IMDB.SetFldParams(IMDBDef11.PQRY_DUAL38,IMDBDef11.PQSL_DUAL38_IMPOATTUPURO,3,28,6);
    IMDB.TblAddNew(IMDBDef11.PQRY_DUAL38, 0);
  }

  private static void Init_PQRY_VISTOTFIOPCA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_VISTOTFIOPCA, 29);
    IMDB.set_TblCode(IMDBDef11.PQRY_VISTOTFIOPCA, "PQRY_VISTOTFIOPCA");
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_CODICE,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE_ATT, "PREVISIONE_ATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE_ATT,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI_PROV, "VARIAZIONI_PROV");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI_PROV,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_RES, "ACC_IMP_RES");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_MAN_ORD_COMP, "MAN_ORD_COMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_MAN_ORD_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_MAN_ORD_RES, "MAN_ORD_RES");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_MAN_ORD_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_MAN_ORD, "MAN_ORD");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_MAN_ORD,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_SUBIMPEGNATO,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_LIQUIDATO,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE_ESIG, "PREVISIONE_ESIG");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE_ESIG,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI_ESIG, "VARIAZIONI_ESIG");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI_ESIG,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE_STANZ, "PREVISIONE_STANZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PREVISIONE_STANZ,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI_STANZ, "VARIAZIONI_STANZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_VARIAZIONI_STANZ,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_COMP, "ACC_IMP_COMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_COMP_ESIG, "ACC_IMP_COMP_ESIG");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_COMP_ESIG,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_COMP_STANZ, "ACC_IMP_COMP_STANZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_ACC_IMP_COMP_STANZ,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PAGATOTOTALE, "PAGATOTOTALE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PAGATOTOTALE,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PAGAREIDASTN, "PAGAREIDASTN");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PAGAREIDASTN,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PAGAREIDAESI, "PAGAREIDAESI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_PAGAREIDAESI,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISTOTFIOPCA,IMDBDef11.PQSL_VISTOTFIOPCA_DISPONIBILITA,2,15,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_VISTOTFIOPCA, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DettaglioComposizioneImporti(MyWebEntryPoint w, IMDBObj imdb)
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
  public DettaglioComposizioneImporti()
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
    FormIdx = MyGlb.FRM_DETTCOMPIMPO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "568E7625-23B2-44F8-B010-9C3254C34D74";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1040;
    DesignHeight = 350;
    set_Caption(new IDVariant("Dettaglio Composizione Importi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1040;
    Frames[1].Height = 324;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.617284;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1040;
    Frames[2].Height = 200;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Dettaglio Composizione Importi";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 200;
    PAN_DETTCOMPIMPO = new IDPanel(w, this, 2, "PAN_DETTCOMPIMPO");
    Frames[2].Content = PAN_DETTCOMPIMPO;
    PAN_DETTCOMPIMPO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTCOMPIMPO.VS = MainFrm.VisualStyleList;
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 200-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1ADEFC81-E134-4F65-81C0-2BD97CA16EA1");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2764, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTCOMPIMPO.InitStatus = 1;
    PAN_DETTCOMPIMPO_Init();
    PAN_DETTCOMPIMPO_InitFields();
    PAN_DETTCOMPIMPO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1040;
    Frames[3].Height = 124;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "VISTA TOT FIN OPE CAP";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 124;
    PAN_VISTOTFIOPCA = new IDPanel(w, this, 3, "PAN_VISTOTFIOPCA");
    Frames[3].Content = PAN_VISTOTFIOPCA;
    PAN_VISTOTFIOPCA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISTOTFIOPCA.VS = MainFrm.VisualStyleList;
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1040-MyGlb.PAN_OFFS_X, 124-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1F5C08B5-89BE-4CC6-8225-3C230A786549");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1028, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISTOTFIOPCA.InitStatus = 2;
    PAN_VISTOTFIOPCA_Init();
    PAN_VISTOTFIOPCA_InitFields();
    PAN_VISTOTFIOPCA_InitQueries();
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
      PAN_DETTCOMPIMPO.UpdatePanel(MainFrm);
      PAN_VISTOTFIOPCA.UpdatePanel(MainFrm);
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
    return (obj instanceof DettaglioComposizioneImporti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DettaglioComposizioneImporti.class.getName() : (Glb.ClassWithPackage(DettaglioComposizioneImporti.class) ? DettaglioComposizioneImporti.class.getName().substring(DettaglioComposizioneImporti.class.getPackage().getName().length() + 1) : DettaglioComposizioneImporti.class.getName()));
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
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_VISTOTFIOPCA.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_VISTOTFIOPCA.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DettaglioComposizioneImporti", "Load", _e);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTCOMPIMPO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTCOMPIMPO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTCOMPIMPO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTCOMPIMPO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTCOMPIMPO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DETTCOMPIMPO);
    // Stub
  }

  private void PAN_DETTCOMPIMPO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTCOMPIMPO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTCOMPIMPO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTCOMPIMPO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VISTOTFIOPCA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISTOTFIOPCA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISTOTFIOPCA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISTOTFIOPCA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISTOTFIOPCA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_VISTOTFIOPCA);
    // Stub
  }

  private void PAN_VISTOTFIOPCA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VISTOTFIOPCA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISTOTFIOPCA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VISTOTFIOPCA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DETTCOMPIMPO_Init()
  {

    PAN_DETTCOMPIMPO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTCOMPIMPO.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, "A10ECA22-F6DA-466A-BC13-3525945C92FB");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, "Importo Originale");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, MyGlb.PANEL_LIST, 0, -9999, 180, 16, 0, 0);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, MyGlb.PANEL_FORM, 8, 67, 252, 121, 0, 0);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, 0, 100);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, 1, 13);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, 0, 4);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, 1, 4);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTORIGIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, "E97D3804-DBB6-442A-B753-0AB156B03E17");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, "Importo Inizio Esercizio");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, MyGlb.PANEL_LIST, 0, -9999, 160, 16, 0, 0);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, MyGlb.PANEL_FORM, 264, 67, 252, 121, 0, 0);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, 0, 133);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, 1, 13);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, 0, 4);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, 1, 4);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPOINIZESER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, "B5C9A679-E66E-4098-99D0-39E439E1F1C3");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, "Variazioni Anno in Corso");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, MyGlb.PANEL_LIST, 0, -9999, 168, 16, 0, 0);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, MyGlb.PANEL_FORM, 520, 67, 252, 121, 0, 0);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, 0, 135);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, 1, 13);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, 0, 4);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, 1, 4);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_VARIANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, "50CFD416-7256-4B69-AAD2-29AE98704928");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, "Importo Attuale");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, MyGlb.VIS_GROUPSTYLE);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, MyGlb.PANEL_LIST, 0, -9999, 172, 16, 0, 0);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, MyGlb.PANEL_FORM, 776, 67, 252, 121, 0, 0);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, 0, 92);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, 1, 13);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, 0, 4);
    PAN_DETTCOMPIMPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, 1, 4);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_GROUP, GRP_DETTCOMPIMPO_IMPORTATTUAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DETTCOMPIMPO.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, "4431FF24-F1A4-434D-A1EE-13DF8017D3D6");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, "Anno Plur.");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, "05A1A623-4A17-46EE-8135-7F40EEFBE2CA");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, "Finanziamento");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, "Finanziamento");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.VIS_NORMFIELPADR);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, "DC63DF80-17B6-43D7-AE09-77B19FDE589E");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, "90324534-DF2D-416B-AFD6-6005F7399D40");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, "Totale");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, "445D3A92-FC8F-40F1-AB7D-628058F3B3FA");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, "F1F4E205-AAD9-4F86-9E1C-E6172455FAA9");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, "Puro");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, "3359EA1E-A84F-4399-A71E-2FE6CEB9D1F4");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, MyGlb.VIS_VUOTOGRASSET);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, "77552CCA-B30A-45C8-9641-68B7D1C9BE59");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, "Totale");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, "58F6DCB8-31F7-4E7E-A579-2C72C1E3329C");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, "3D829054-56DA-4A60-8F3F-D52A0D7DA656");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, "Puro");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, "D0E75B90-B42F-4E23-B72F-E1F65A8E4BA4");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, MyGlb.VIS_VUOTOGRASSET);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, "0A49A57A-2607-4C61-968D-2D5DFC797EE7");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, "Totale");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, "AE7059AE-9D6E-42AF-B884-3D6702FC5545");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, "A877E778-8A42-48EA-956D-542D09712825");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, "In Sospeso");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, "D492B037-F668-4C95-BC46-1211DAFE1DD3");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, "Puro");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, "607A05F1-4C8D-47AB-83C9-2E4FFAABB12C");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, "Totale");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, "8D472BF8-25E9-48EE-BD36-875A54F83DD0");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, "62DD36D3-5DA0-4E2B-B36B-20180ED68D39");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, "In Sospeso");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTCOMPIMPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, "0E006E93-6895-4454-957A-B299F56A931B");
    PAN_DETTCOMPIMPO.set_Header(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, "Puro");
    PAN_DETTCOMPIMPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, "");
    PAN_DETTCOMPIMPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DETTCOMPIMPO.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DETTCOMPIMPO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_LIST, 84);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Anno Plur.");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_FORM, 12, 20, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_FORM, 76);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Anno Plur.");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_ESERCIZIPLUR, -1, -1);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_ESERCIZIPLUR, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_ESERCIZIPLUR, PPQRY_DUAL38, "~~TBL_PARAMETRI514.PARAESERPLUR~~", "RECOESERPLUR", 1, 19, 0, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_LIST, 92);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_FORM, 156, 20, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZIAMEN1, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_FINANZIAMEN1, -1, -1);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_FINANZIAMEN1, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_FINANZIAMEN1, PPQRY_DUAL38, "~~TBL_PARAMETRI514.PARAMFINANZI~~", "RECORDFINANZ", 1, 19, 0, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_FORM, 328, 20, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZIAMENTI DESCRIZIONE");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_FINANZDESCRI, -1, -1);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_LIST, 148);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_LIST, "Totale");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_FORM, 80, 92, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_FORM, 44);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGTOTA, MyGlb.PANEL_FORM, "Totale");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOORIGTOTA, -1, GRP_DETTCOMPIMPO_IMPORTORIGIN);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOORIGTOTA, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOORIGTOTA, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_TOT_ORIG'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOORIGTOTA", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_LIST, 0, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_LIST, 180);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_LIST, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_FORM, 12, 116, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGREIS, MyGlb.PANEL_FORM, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOORIGREIS, -1, GRP_DETTCOMPIMPO_IMPORTORIGIN);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOORIGREIS, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOORIGREIS, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_REISC_ORIG'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOORIGREIS", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_LIST, 140);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_LIST, "Puro");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_FORM, 44, 140, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_FORM, 80);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOORIGPURO, MyGlb.PANEL_FORM, "Puro");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOORIGPURO, -1, GRP_DETTCOMPIMPO_IMPORTORIGIN);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOORIGPURO, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOORIGPURO, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_PURO_ORIG'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOORIGPURO", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, MyGlb.PANEL_LIST, 272, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, MyGlb.PANEL_LIST, 0);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, MyGlb.PANEL_FORM, 16, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, MyGlb.PANEL_FORM, 0);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIES1, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_ETILABINIES1, -1, GRP_DETTCOMPIMPO_IMPORTORIGIN);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_ETILABINIES1, -1, "", "ETILABINIES1", 0, 0, 0, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_LIST, 128);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_LIST, "Totale");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_FORM, 276, 92, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_FORM, 104);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZTOTA, MyGlb.PANEL_FORM, "Totale");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOINIZTOTA, -1, GRP_DETTCOMPIMPO_IMPOINIZESER);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOINIZTOTA, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOINIZTOTA, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_TOT_INI'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOINIZTOTA", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_LIST, 160);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_LIST, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_FORM, 268, 116, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZREIS, MyGlb.PANEL_FORM, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOINIZREIS, -1, GRP_DETTCOMPIMPO_IMPOINIZESER);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOINIZREIS, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOINIZREIS, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_REISC_INI'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOINIZREIS", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_LIST, 120);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_LIST, "Puro");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_FORM, 276, 140, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_FORM, 104);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOINIZPURO, MyGlb.PANEL_FORM, "Puro");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOINIZPURO, -1, GRP_DETTCOMPIMPO_IMPOINIZESER);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOINIZPURO, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOINIZPURO, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_PURO_INI'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOINIZPURO", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, MyGlb.PANEL_LIST, 264, 176, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, MyGlb.PANEL_LIST, 0);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, MyGlb.PANEL_FORM, 268, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, MyGlb.PANEL_FORM, 0);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_ETILABINIESE, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_ETILABINIESE, -1, GRP_DETTCOMPIMPO_IMPOINIZESER);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_ETILABINIESE, -1, "", "ETILABINIESE", 0, 0, 0, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_LIST, 136);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_LIST, "Totale");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_FORM, 524, 92, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOTOTA, MyGlb.PANEL_FORM, "Totale");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_VARIANNOTOTA, -1, GRP_DETTCOMPIMPO_VARIANNINCOR);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_VARIANNOTOTA, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_VARIANNOTOTA, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_TOT_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "VARIANNOTOTA", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_LIST, 168);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_LIST, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_FORM, 524, 116, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOREIS, MyGlb.PANEL_FORM, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_VARIANNOREIS, -1, GRP_DETTCOMPIMPO_VARIANNINCOR);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_VARIANNOREIS, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_VARIANNOREIS, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_REISC_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "VARIANNOREIS", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_LIST, 148);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_LIST, "In Sospeso");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_FORM, 524, 164, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOSOSP, MyGlb.PANEL_FORM, "In Sospeso");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_VARIANNOSOSP, -1, GRP_DETTCOMPIMPO_VARIANNINCOR);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_VARIANNOSOSP, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_VARIANNOSOSP, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_SOSP_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "VARIANNOSOSP", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_LIST, 124);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_LIST, "Puro");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_FORM, 532, 140, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_FORM, 104);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_VARIANNOPURO, MyGlb.PANEL_FORM, "Puro");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_VARIANNOPURO, -1, GRP_DETTCOMPIMPO_VARIANNINCOR);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_VARIANNOPURO, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_VARIANNOPURO, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_PURO_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "VARIANNOPURO", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_LIST, 140);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_LIST, "Totale");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_FORM, 780, 92, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUTOTA, MyGlb.PANEL_FORM, "Totale");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOATTUTOTA, -1, GRP_DETTCOMPIMPO_IMPORTATTUAL);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOATTUTOTA, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOATTUTOTA, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_TOT_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOATTUTOTA", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_LIST, 0, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_LIST, 172);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_LIST, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_FORM, 780, 116, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUREIS, MyGlb.PANEL_FORM, "Reiscrizioni da Stn");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOATTUREIS, -1, GRP_DETTCOMPIMPO_IMPORTATTUAL);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOATTUREIS, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOATTUREIS, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_REISC_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOATTUREIS", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_LIST, 152);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_LIST, "In Sospeso");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_FORM, 780, 164, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUSOSP, MyGlb.PANEL_FORM, "In Sospeso");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOATTUSOSP, -1, GRP_DETTCOMPIMPO_IMPORTATTUAL);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOATTUSOSP, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOATTUSOSP, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_SOSP_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOATTUSOSP", 3, 28, 6, -13997);
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_LIST, 132);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_LIST, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_LIST, "Puro");
    PAN_DETTCOMPIMPO.SetRect(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_FORM, 780, 140, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTCOMPIMPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_FORM, 112);
    PAN_DETTCOMPIMPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_FORM, 1);
    PAN_DETTCOMPIMPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTCOMPIMPO_IMPOATTUPURO, MyGlb.PANEL_FORM, "Puro");
    PAN_DETTCOMPIMPO.SetFieldPage(PFL_DETTCOMPIMPO_IMPOATTUPURO, -1, GRP_DETTCOMPIMPO_IMPORTATTUAL);
    PAN_DETTCOMPIMPO.SetFieldUnbound(PFL_DETTCOMPIMPO_IMPOATTUPURO, true);
    PAN_DETTCOMPIMPO.SetFieldPanel(PFL_DETTCOMPIMPO_IMPOATTUPURO, PPQRY_DUAL38, "GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_PURO_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")", "IMPOATTUPURO", 3, 28, 6, -13997);
  }

  private void PAN_DETTCOMPIMPO_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTCOMPIMPO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~RECORDFINANZ~~) ");
    PAN_DETTCOMPIMPO.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_DETTCOMPIMPO.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTCOMPIMPO.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    PAN_DETTCOMPIMPO.SetIMDB(IMDB, "PQRY_DUAL38", true);
    PAN_DETTCOMPIMPO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_PARAMETRI514.PARAESERPLUR~~ as RECOESERPLUR, ");
    SQL.append("  ~~TBL_PARAMETRI514.PARAMFINANZI~~ as RECORDFINANZ, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_TOT_ORIG'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOORIGTOTA, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_REISC_ORIG'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOORIGREIS, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_PURO_ORIG'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOORIGPURO, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_TOT_INI'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOINIZTOTA, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_REISC_INI'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOINIZREIS, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_PURO_INI'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOINIZPURO, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_TOT_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIANNOTOTA, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_REISC_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIANNOREIS, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_SOSP_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIANNOSOSP, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'VAR_PURO_ANNO'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as VARIANNOPURO, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_TOT_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOATTUTOTA, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_REISC_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOATTUREIS, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_SOSP_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOATTUSOSP, ");
    SQL.append("  GET_IMPORTI_PIANO_CRONO(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~TBL_PARAMETRI514.PARAMCRONOID~~,~~TBL_PARAMETRI514.PARAPROGIMPU~~,~~TBL_PARAMETRI514.PARAESERPLUR~~,~~TBL_PARAMETRI514.PARAMFINANZI~~,~~TBL_PARAMETRI514.PARAMOPERA~~,~~TBL_PARAMETRI514.PARAMCAPITOL~~,~~TBL_PARAMETRI514.PARAMARTICOL~~,'IMP_PURO_ATT'," + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as IMPOATTUPURO ");
    PAN_DETTCOMPIMPO.SetQuery(PPQRY_DUAL38, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_DETTCOMPIMPO.SetQuery(PPQRY_DUAL38, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTCOMPIMPO.SetQuery(PPQRY_DUAL38, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTCOMPIMPO.SetQuery(PPQRY_DUAL38, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTCOMPIMPO.SetQuery(PPQRY_DUAL38, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTCOMPIMPO.SetQuery(PPQRY_DUAL38, 5, SQL, -1, "");
    PAN_DETTCOMPIMPO.SetQueryDB(PPQRY_DUAL38, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTCOMPIMPO.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTCOMPIMPO.Status() == 2)
    {
      int oldListQBE = PAN_DETTCOMPIMPO.iUseListQBE;
      PAN_DETTCOMPIMPO.iUseListQBE = 0;
      PAN_DETTCOMPIMPO.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTCOMPIMPO.PanelCommand(Glb.PCM_FIND);
      PAN_DETTCOMPIMPO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VISTOTFIOPCA_Init()
  {

    PAN_VISTOTFIOPCA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISTOTFIOPCA.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, "07CB2FD9-DC07-4CAE-9A81-0BD6C5AE5BCB");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, "Impegnato");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, MyGlb.VIS_GROUPSTYLE);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, MyGlb.PANEL_LIST, 0, -9999, 920, 16, 0, 0);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, MyGlb.PANEL_FORM, 8, 7, 252, 97, 0, 0);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, 0, 63);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, 1, 13);
    PAN_VISTOTFIOPCA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, 0, 4);
    PAN_VISTOTFIOPCA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, 1, 4);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_IMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, "1F548F2C-709F-4B33-BC4F-D7E5F137A872");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, "Pagato");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, MyGlb.VIS_GROUPSTYLE);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, MyGlb.PANEL_LIST, 0, -9999, 148, 16, 0, 0);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, MyGlb.PANEL_FORM, 264, 7, 252, 97, 0, 0);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, 0, 40);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, 1, 13);
    PAN_VISTOTFIOPCA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, 0, 4);
    PAN_VISTOTFIOPCA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, 1, 4);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_PAGATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, "3A2E1CD5-2EAB-438C-844F-C53143CD3A32");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, "Disponibilità");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, MyGlb.VIS_GROUPSTYLE);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_LIST, 0, -9999, 792, 16, 0, 0);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_FORM, 520, 7, 256, 97, 0, 0);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, 0, 69);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, 1, 13);
    PAN_VISTOTFIOPCA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, 0, 4);
    PAN_VISTOTFIOPCA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, 1, 4);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_GROUP, GRP_VISTOTFIOPCA_DISPONIBILIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VISTOTFIOPCA.SetSize(MyGlb.OBJ_FIELD, 33);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, "4728485C-132F-4D36-800B-448815D0B2CE");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, "ESERCIZIO");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, 0, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, "304C35C6-7747-41AA-9840-5F114E4FCF00");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, "FINANZIAMENTO");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, 0, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, "5094739E-FADE-4F87-B7BC-4CE81A903CB6");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, "OPERA");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, 0, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, "FC0EF9C8-50B1-47B6-AC7C-D2EE27B912A9");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, "E S");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, 0, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, "A99928D1-E222-4BB5-8C39-5187637BBF0B");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, "CAPITOLO");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, 0, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, "5DF4B378-177A-490C-9C26-47176D03ABAF");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, "ARTICOLO");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, 0, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, "5C2CBCCF-2BC3-4270-A567-D198381BEDD8");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, "CODICE");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, "6D4974B7-BA89-449B-B821-EA43FAA69FF6");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, "DESCRIZIONE");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, 0, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, "1A334576-2173-4E47-95D1-BCBDD6A988B7");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, "Totale");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, "CF626F31-5D2D-4315-B67B-90BE86336AC0");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, "D4FA018C-78C2-4927-A877-0F2ED0FFAA21");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, "Puro");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, "FC77A01A-728C-4D0A-8FCF-F6501C289571");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, "Totale");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, "5735EEFD-189B-4EB3-BA69-13AE8660B3AF");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, "8B20E7D6-FC69-4473-84EB-FA7E0A1A5A8D");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, "Puro");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, "D02C8717-F34E-436D-A0BB-A284DED321DA");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, "Totale");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, "077F0F81-7FF6-4969-B3CA-220BA2609940");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, "4C8A7FA2-446C-4F0E-81DC-FE7F9894E494");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, "Puro");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, "9CA8E99B-0761-43A5-A281-0F0A7D0921D8");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, "PREVISIONE");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, "09F5CA4B-3B01-4277-AAE1-7C7C7AEE6CB2");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, "VARIAZIONI");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, "9ABAF8E6-A0CF-4BCD-A5A2-DF3BB586200C");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, "PREVISIONE ATT");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, "A85538B4-F1E5-4C00-8A0B-9DB353A2DC17");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, "VARIAZIONI PROV");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, "57B0DF92-8C2A-41AF-8497-A204774C8DF8");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, "ACC IMP RES");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, "29A1A58A-A422-4CAE-80B5-61BC4EC4E283");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, "MAN ORD COMP");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, "785A5C56-2744-4EC7-9083-6E69E07E1125");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, "MAN ORD RES");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, "51F56C75-2D81-4F2E-BDEF-E020ACCBC1C6");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, "MAN ORD");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, "9BA37691-18EE-4A9B-8486-40B882DD04F9");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, "SUBIMPEGNATO");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, "E1FC5408-0806-4FB8-8FE3-C53DB6A3CE91");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, "LIQUIDATO");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, "B0A68419-67A3-4D72-BE62-BB7C63DCF6EB");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, "PREVISIONE ESIG");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, "71A1A899-3685-4612-9754-48ED945E35FF");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, "VARIAZIONI ESIG");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, "E0E1488D-03A3-4498-9047-13BE0CAA29F2");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, "PREVISIONE STANZ");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, "CB0AB832-A3B5-48CD-83B1-BAD4957C4209");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, "VARIAZIONI STANZ");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, "0E266DA6-8716-4D47-B348-94C0EA32258B");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, "ACC IMP COMP ESIG");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VISTOTFIOPCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, "DCAA2EFB-6F54-42D8-808C-E2CC44C00CB3");
    PAN_VISTOTFIOPCA.set_Header(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, "Pagato Reiscr Da Esig");
    PAN_VISTOTFIOPCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, "");
    PAN_VISTOTFIOPCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.VIS_NORMFIELPADR);
    PAN_VISTOTFIOPCA.SetFlags(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VISTOTFIOPCA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_ESERCIZIO, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_ESERCIZIO, PPQRY_VISTOTFIOPCA, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_LIST, 40, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_LIST, "FINAN.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_FORM, 212, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_FORM, 72);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_FINANZIAMENT, MyGlb.PANEL_FORM, "FINANZ.");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_FINANZIAMENT, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_FINANZIAMENT, PPQRY_VISTOTFIOPCA, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_LIST, 88, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_LIST, 48);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_FORM, 340, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_FORM, 64);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_OPERA, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_OPERA, PPQRY_VISTOTFIOPCA, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_LIST, 136, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_LIST, 24);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_LIST, "E S");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_FORM, 468, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_FORM, 40);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ES, MyGlb.PANEL_FORM, "E S");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_ES, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_ES, PPQRY_VISTOTFIOPCA, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_LIST, 176, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_CAPITOLO, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_CAPITOLO, PPQRY_VISTOTFIOPCA, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_FORM, 212, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_FORM, 72);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_ARTICOLO, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_ARTICOLO, PPQRY_VISTOTFIOPCA, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_LIST, 264, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_LIST, "CODICE");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_FORM, 332, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_FORM, 64);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_CODICE, MyGlb.PANEL_FORM, "CODICE");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_CODICE, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_CODICE, PPQRY_VISTOTFIOPCA, "A.CODICE", "CODICE", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_LIST, 328, 36, 192, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_DESCRIZIONE, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_DESCRIZIONE, PPQRY_VISTOTFIOPCA, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_LIST, 848, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_LIST, 92);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_LIST, "Totale");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_FORM, 12, 32, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_FORM, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNTOTALE, MyGlb.PANEL_FORM, "Totale");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_IMPEGNTOTALE, -1, GRP_VISTOTFIOPCA_IMPEGNATO);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_IMPEGNTOTALE, PPQRY_VISTOTFIOPCA, "A.ACC_IMP_COMP", "ACC_IMP_COMP", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_LIST, 4, 364, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_LIST, 144);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_LIST, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_FORM, 12, 56, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_FORM, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEREIDASTN, MyGlb.PANEL_FORM, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_IMPEREIDASTN, -1, GRP_VISTOTFIOPCA_IMPEGNATO);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_IMPEREIDASTN, PPQRY_VISTOTFIOPCA, "A.ACC_IMP_COMP_STANZ", "ACC_IMP_COMP_STANZ", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_LIST, 136);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_LIST, "Puro");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_FORM, 56, 80, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_FORM, 68);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_IMPEGNATPURO, MyGlb.PANEL_FORM, "Puro");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_IMPEGNATPURO, -1, GRP_VISTOTFIOPCA_IMPEGNATO);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_IMPEGNATPURO, PPQRY_CAMPICALCOLA, "~~ACC_IMP_COMP~~ - ~~ACC_IMP_COMP_ESIG~~ - ~~ACC_IMP_COMP_STANZ~~", "IMPEGNATPURO", 2, 19, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_LIST, 44);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_LIST, "Totale");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_FORM, 336, 32, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_FORM, 44);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOTOTALE, MyGlb.PANEL_FORM, "Totale");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PAGATOTOTALE, -1, GRP_VISTOTFIOPCA_PAGATO);
    PAN_VISTOTFIOPCA.SetFieldUnbound(PFL_VISTOTFIOPCA_PAGATOTOTALE, true);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PAGATOTOTALE, PPQRY_VISTOTFIOPCA, "A_GET_TOT_FIN_OPE_CAP(~~TBL_PARAMETRI514.PARAESERPLUR~~,A.FINANZIAMENTO,A.OPERA,A.E_S,A.CAPITOLO,A.ARTICOLO,'IPT')", "PAGATOTOTALE", 3, 28, 6, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_LIST, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_LIST, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_FORM, 268, 56, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_FORM, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDASTN, MyGlb.PANEL_FORM, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PAGAREIDASTN, -1, GRP_VISTOTFIOPCA_PAGATO);
    PAN_VISTOTFIOPCA.SetFieldUnbound(PFL_VISTOTFIOPCA_PAGAREIDASTN, true);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PAGAREIDASTN, PPQRY_VISTOTFIOPCA, "A_GET_TOT_FIN_OPE_CAP(~~TBL_PARAMETRI514.PARAESERPLUR~~,A.FINANZIAMENTO,A.OPERA,A.E_S,A.CAPITOLO,A.ARTICOLO,'IPT_STN')", "PAGAREIDASTN", 3, 28, 6, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_LIST, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_LIST, "Puro");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_FORM, 268, 80, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_FORM, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGATOPURO, MyGlb.PANEL_FORM, "Puro");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PAGATOPURO, -1, GRP_VISTOTFIOPCA_PAGATO);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PAGATOPURO, PPQRY_CAMPICALCOLA, "~~PAGATOTOTALE~~ - ~~PAGAREIDAESI~~ - ~~PAGAREIDASTN~~", "PAGATOPURO", 3, 28, 6, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_LIST, 728, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_LIST, 96);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_LIST, "Totale");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_FORM, 552, 32, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_FORM, 88);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBILIT, MyGlb.PANEL_FORM, "Totale");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_DISPONIBILIT, -1, GRP_VISTOTFIOPCA_DISPONIBILIT);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_DISPONIBILIT, PPQRY_VISTOTFIOPCA, "A.DISPONIBILITA", "DISPONIBILITA", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_LIST, 0, 36, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_LIST, 172);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_LIST, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_FORM, 524, 56, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_FORM, 116);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPOREISSTN, MyGlb.PANEL_FORM, "Reiscrizioni da Stn");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_DISPOREISSTN, -1, GRP_VISTOTFIOPCA_DISPONIBILIT);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_DISPOREISSTN, PPQRY_CAMPICALCOLA, "~~PREVISIONE_STANZ~~ + ~~VARIAZIONI_STANZ~~ - ~~ACC_IMP_COMP_STANZ~~", "DISPOREISSTN", 2, 19, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_LIST, 140);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_LIST, "Puro");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_FORM, 568, 80, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_FORM, 72);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_DISPONIBPURO, MyGlb.PANEL_FORM, "Puro");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_DISPONIBPURO, -1, GRP_VISTOTFIOPCA_DISPONIBILIT);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_DISPONIBPURO, PPQRY_CAMPICALCOLA, "~~PREVISIONE_ATT~~ - ~~PREVISIONE_STANZ~~ - ~~PREVISIONE_ESIG~~ - ~~VARIAZIONI_STANZ~~ - ~~VARIAZIONI_ESIG~~ - ~~ACC_IMP_COMP~~ - ~~ACC_IMP_COMP_STANZ~~ - ~~ACC_IMP_COMP_ESIG~~", "DISPONIBPURO", 2, 19, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_LIST, 520, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_LIST, 76);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_LIST, "PREVISIONE");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_FORM, 616, 140, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONE, MyGlb.PANEL_FORM, "PREVISIONE");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PREVISIONE, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PREVISIONE, PPQRY_VISTOTFIOPCA, "A.PREVISIONE", "PREVISIONE", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_LIST, 592, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_LIST, 76);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_LIST, "VARIAZ.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_FORM, 68, 120, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_FORM, 88);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIONI, MyGlb.PANEL_FORM, "VARIAZIONI");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_VARIAZIONI, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_VARIAZIONI, PPQRY_VISTOTFIOPCA, "A.VARIAZIONI", "VARIAZIONI", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_LIST, 656, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_LIST, 100);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_LIST, "PREVISIONE ATT");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_FORM, 616, 164, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIONATT, MyGlb.PANEL_FORM, "PREVISIONE ATT");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PREVISIONATT, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PREVISIONATT, PPQRY_VISTOTFIOPCA, "A.PREVISIONE_ATT", "PREVISIONE_ATT", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_LIST, 792, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_LIST, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_LIST, "VARIAZ. PROV");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_FORM, 616, 188, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOPROV, MyGlb.PANEL_FORM, "VARIAZIONI PROV");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_VARIAZIOPROV, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_VARIAZIOPROV, PPQRY_VISTOTFIOPCA, "A.VARIAZIONI_PROV", "VARIAZIONI_PROV", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_LIST, 920, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_LIST, 80);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_LIST, "ACC IMP RES");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPRES, MyGlb.PANEL_FORM, "ACC IMP RES");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_ACCIMPRES, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_ACCIMPRES, PPQRY_VISTOTFIOPCA, "A.ACC_IMP_RES", "ACC_IMP_RES", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_LIST, 984, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_LIST, 96);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_LIST, "MN. ORD CMP.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_FORM, 212, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_FORM, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDCOMP, MyGlb.PANEL_FORM, "MAN ORD COMP");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_MANORDCOMP, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_MANORDCOMP, PPQRY_VISTOTFIOPCA, "A.MAN_ORD_COMP", "MAN_ORD_COMP", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_LIST, 1040, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_LIST, 84);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_LIST, "MAN ORD RES");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_FORM, 396, 148, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_FORM, 96);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORDRES, MyGlb.PANEL_FORM, "MAN ORD RES");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_MANORDRES, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_MANORDRES, PPQRY_VISTOTFIOPCA, "A.MAN_ORD_RES", "MAN_ORD_RES", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_LIST, 1104, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_LIST, 60);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_LIST, "MAN ORD");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_FORM, 4, 172, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_MANORD, MyGlb.PANEL_FORM, "MAN ORD");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_MANORD, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_MANORD, PPQRY_VISTOTFIOPCA, "A.MAN_ORD", "MAN_ORD", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_LIST, 1160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_LIST, 96);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_LIST, "SUB.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_FORM, 204, 172, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_FORM, 112);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_SUBIMPEGNATO, MyGlb.PANEL_FORM, "SUBIMPEGNATO");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_SUBIMPEGNATO, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_SUBIMPEGNATO, PPQRY_VISTOTFIOPCA, "A.SUBIMPEGNATO", "SUBIMPEGNATO", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_LIST, 1200, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_LIST, 72);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_LIST, "LIQUID.");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_FORM, 372, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_FORM, 88);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_LIQUIDATO, MyGlb.PANEL_FORM, "LIQUIDATO");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_LIQUIDATO, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_LIQUIDATO, PPQRY_VISTOTFIOPCA, "A.LIQUIDATO", "LIQUIDATO", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_LIST, 4, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_LIST, 144);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_LIST, "PREVISIONE ESIG");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_FORM, 4, 196, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISIOESIG, MyGlb.PANEL_FORM, "PREVISIONE ESIG");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PREVISIOESIG, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PREVISIOESIG, PPQRY_VISTOTFIOPCA, "A.PREVISIONE_ESIG", "PREVISIONE_ESIG", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_LIST, 4, 268, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_LIST, 144);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_LIST, "VARIAZIONI ESIG");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_FORM, 228, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_FORM, 120);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZIOESIG, MyGlb.PANEL_FORM, "VARIAZIONI ESIG");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_VARIAZIOESIG, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_VARIAZIOESIG, PPQRY_VISTOTFIOPCA, "A.VARIAZIONI_ESIG", "VARIAZIONI_ESIG", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_LIST, 4, 292, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_LIST, 144);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_LIST, "PREVISIONE STANZ");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PREVISISTANZ, MyGlb.PANEL_FORM, "PREVISIONE STANZ");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PREVISISTANZ, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PREVISISTANZ, PPQRY_VISTOTFIOPCA, "A.PREVISIONE_STANZ", "PREVISIONE_STANZ", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_LIST, 4, 316, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_LIST, 144);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_LIST, "VARIAZIONI STANZ");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_FORM, 224, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_VARIAZISTANZ, MyGlb.PANEL_FORM, "VARIAZIONI STANZ");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_VARIAZISTANZ, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_VARIAZISTANZ, PPQRY_VISTOTFIOPCA, "A.VARIAZIONI_STANZ", "VARIAZIONI_STANZ", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_LIST, 4, 340, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_LIST, 144);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_LIST, "ACC IMP COMP ESIG");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_FORM, 452, 216, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_FORM, 128);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_ACCIMPCOMESI, MyGlb.PANEL_FORM, "ACC IMP COMP ESIG");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_ACCIMPCOMESI, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_ACCIMPCOMESI, PPQRY_VISTOTFIOPCA, "A.ACC_IMP_COMP_ESIG", "ACC_IMP_COMP_ESIG", 2, 15, 0, -13997);
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_LIST, 132);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_LIST, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_LIST, "Pagato Reiscr Da Esig");
    PAN_VISTOTFIOPCA.SetRect(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_FORM, 4, 244, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISTOTFIOPCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_FORM, 132);
    PAN_VISTOTFIOPCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_FORM, 1);
    PAN_VISTOTFIOPCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISTOTFIOPCA_PAGAREIDAESI, MyGlb.PANEL_FORM, "Pagato Reiscr Da Esig");
    PAN_VISTOTFIOPCA.SetFieldPage(PFL_VISTOTFIOPCA_PAGAREIDAESI, -1, -1);
    PAN_VISTOTFIOPCA.SetFieldUnbound(PFL_VISTOTFIOPCA_PAGAREIDAESI, true);
    PAN_VISTOTFIOPCA.SetFieldPanel(PFL_VISTOTFIOPCA_PAGAREIDAESI, PPQRY_VISTOTFIOPCA, "A_GET_TOT_FIN_OPE_CAP(~~TBL_PARAMETRI514.PARAESERPLUR~~,A.FINANZIAMENTO,A.OPERA,A.E_S,A.CAPITOLO,A.ARTICOLO,'IPT_ESI')", "PAGAREIDAESI", 3, 28, 6, -13997);
  }

  private void PAN_VISTOTFIOPCA_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISTOTFIOPCA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~ACC_IMP_COMP~~ - ~~ACC_IMP_COMP_ESIG~~ - ~~ACC_IMP_COMP_STANZ~~ as IMPEGNATPURO, ");
    SQL.append("  ~~PAGATOTOTALE~~ - ~~PAGAREIDAESI~~ - ~~PAGAREIDASTN~~ as PAGATOPURO, ");
    SQL.append("  ~~PREVISIONE_STANZ~~ + ~~VARIAZIONI_STANZ~~ - ~~ACC_IMP_COMP_STANZ~~ as DISPOREISSTN, ");
    SQL.append("  ~~PREVISIONE_ATT~~ - ~~PREVISIONE_STANZ~~ - ~~PREVISIONE_ESIG~~ - ~~VARIAZIONI_STANZ~~ - ~~VARIAZIONI_ESIG~~ - ~~ACC_IMP_COMP~~ - ~~ACC_IMP_COMP_STANZ~~ - ~~ACC_IMP_COMP_ESIG~~ as DISPONIBPURO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_VISTOTFIOPCA.SetQuery(PPQRY_CAMPICALCOLA, 0, SQL, -1, "");
    PAN_VISTOTFIOPCA.SetQueryDB(PPQRY_CAMPICALCOLA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISTOTFIOPCA.SetMasterTable(PPQRY_CAMPICALCOLA, "DUAL");
    PAN_VISTOTFIOPCA.SetIMDB(IMDB, "PQRY_VISTOTFIOPCA", true);
    PAN_VISTOTFIOPCA.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA TOT FIN OPE CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.VARIAZIONI as VARIAZIONI, ");
    SQL.append("  A.PREVISIONE_ATT as PREVISIONE_ATT, ");
    SQL.append("  A.VARIAZIONI_PROV as VARIAZIONI_PROV, ");
    SQL.append("  A.ACC_IMP_RES as ACC_IMP_RES, ");
    SQL.append("  A.MAN_ORD_COMP as MAN_ORD_COMP, ");
    SQL.append("  A.MAN_ORD_RES as MAN_ORD_RES, ");
    SQL.append("  A.MAN_ORD as MAN_ORD, ");
    SQL.append("  A.SUBIMPEGNATO as SUBIMPEGNATO, ");
    SQL.append("  A.LIQUIDATO as LIQUIDATO, ");
    SQL.append("  A.PREVISIONE_ESIG as PREVISIONE_ESIG, ");
    SQL.append("  A.VARIAZIONI_ESIG as VARIAZIONI_ESIG, ");
    SQL.append("  A.PREVISIONE_STANZ as PREVISIONE_STANZ, ");
    SQL.append("  A.VARIAZIONI_STANZ as VARIAZIONI_STANZ, ");
    SQL.append("  A.ACC_IMP_COMP as ACC_IMP_COMP, ");
    SQL.append("  A.ACC_IMP_COMP_ESIG as ACC_IMP_COMP_ESIG, ");
    SQL.append("  A.ACC_IMP_COMP_STANZ as ACC_IMP_COMP_STANZ, ");
    SQL.append("  A_GET_TOT_FIN_OPE_CAP(~~TBL_PARAMETRI514.PARAESERPLUR~~,A.FINANZIAMENTO,A.OPERA,A.E_S,A.CAPITOLO,A.ARTICOLO,'IPT') as PAGATOTOTALE, ");
    SQL.append("  A_GET_TOT_FIN_OPE_CAP(~~TBL_PARAMETRI514.PARAESERPLUR~~,A.FINANZIAMENTO,A.OPERA,A.E_S,A.CAPITOLO,A.ARTICOLO,'IPT_STN') as PAGAREIDASTN, ");
    SQL.append("  A_GET_TOT_FIN_OPE_CAP(~~TBL_PARAMETRI514.PARAESERPLUR~~,A.FINANZIAMENTO,A.OPERA,A.E_S,A.CAPITOLO,A.ARTICOLO,'IPT_ESI') as PAGAREIDAESI, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA ");
    PAN_VISTOTFIOPCA.SetQuery(PPQRY_VISTOTFIOPCA, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_TOT_FIN_OPE_CAP A ");
    PAN_VISTOTFIOPCA.SetQuery(PPQRY_VISTOTFIOPCA, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI514.PARAESERPLUR~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI514.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI514.PARAMARTICOL~~) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~TBL_PARAMETRI514.PARAMFINANZI~~) ");
    SQL.append("and   (A.OPERA = ~~TBL_PARAMETRI514.PARAMOPERA~~) ");
    PAN_VISTOTFIOPCA.SetQuery(PPQRY_VISTOTFIOPCA, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISTOTFIOPCA.SetQuery(PPQRY_VISTOTFIOPCA, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISTOTFIOPCA.SetQuery(PPQRY_VISTOTFIOPCA, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISTOTFIOPCA.SetQuery(PPQRY_VISTOTFIOPCA, 5, SQL, -1, "");
    PAN_VISTOTFIOPCA.SetQueryDB(PPQRY_VISTOTFIOPCA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISTOTFIOPCA.SetMasterTable(0, "VISTA_TOT_FIN_OPE_CAP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISTOTFIOPCA.Status() == 2)
    {
      int oldListQBE = PAN_VISTOTFIOPCA.iUseListQBE;
      PAN_VISTOTFIOPCA.iUseListQBE = 0;
      PAN_VISTOTFIOPCA.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISTOTFIOPCA.PanelCommand(Glb.PCM_FIND);
      PAN_VISTOTFIOPCA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DETTCOMPIMPO) PAN_DETTCOMPIMPO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VISTOTFIOPCA) PAN_VISTOTFIOPCA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTCOMPIMPO) PAN_DETTCOMPIMPO_ValidateRow(Cancel);
    if (SrcObj == PAN_VISTOTFIOPCA) PAN_VISTOTFIOPCA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DETTCOMPIMPO) PAN_DETTCOMPIMPO_DynamicProperties();
    if (SrcObj == PAN_VISTOTFIOPCA) PAN_VISTOTFIOPCA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DETTCOMPIMPO) PAN_DETTCOMPIMPO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VISTOTFIOPCA) PAN_VISTOTFIOPCA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DETTCOMPIMPO) PAN_DETTCOMPIMPO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VISTOTFIOPCA) PAN_VISTOTFIOPCA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
