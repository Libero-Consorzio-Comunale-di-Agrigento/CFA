// **********************************************
// Elenco Accertamenti Fin
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoAccertamentiFin extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 0;
  private static int PFL_PARAMETRI_DAL = 1;

  private static int PPQRY_PARAMETRI466 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_ELENCOACCERT_CAPITOLO = 0;
  private static int PFL_ELENCOACCERT_ARTICOLO = 1;
  private static int PFL_ELENCOACCERT_NUMEROACC = 2;
  private static int PFL_ELENCOACCERT_ANNOACC = 3;
  private static int PFL_ELENCOACCERT_INFOACCERTAM = 4;
  private static int PFL_ELENCOACCERT_DEBITORE = 5;
  private static int PFL_ELENCOACCERT_RAGIONSOCIAL = 6;
  private static int PFL_ELENCOACCERT_IMPORTO = 7;
  private static int PFL_ELENCOACCERT_ORDINATIVI = 8;
  private static int PFL_ELENCOACCERT_DISPONIBILIT = 9;
  private static int PFL_ELENCOACCERT_DATA = 10;
  private static int PFL_ELENCOACCERT_DESCRIZIONE = 11;
  private static int PFL_ELENCOACCERT_SEDEDEL = 12;
  private static int PFL_ELENCOACCERT_NUMERODEL = 13;
  private static int PFL_ELENCOACCERT_ANNODEL = 14;
  private static int PFL_ELENCOACCERT_UNITAPROPONE = 15;
  private static int PFL_ELENCOACCERT_NUMEROPROPOS = 16;
  private static int PFL_ELENCOACCERT_ANNOPROPOSTA = 17;
  private static int PFL_ELENCOACCERT_CODLIVELLO5 = 18;
  private static int PFL_ELENCOACCERT_CODICEEUROPE = 19;
  private static int PFL_ELENCOACCERT_CAPITOLOART = 20;
  private static int PFL_ELENCOACCERT_ACCERTAMENTO = 21;
  private static int PFL_ELENCOACCERT_DELIBERA = 22;
  private static int PFL_ELENCOACCERT_PROPOSTA = 23;
  private static int PFL_ELENCOACCERT_ESERCIZIO = 24;

  private static int PPQRY_ESEAOPE1 = 0;


  IDPanel PAN_ELENCOACCERT;
  CIDREObj BUK_LIBRELENACCE;
  OBook BKW_LIBRELENACCE;
  //
  // Template Pages constants
  private static int BUK_LIBRELENACCE_MST_ELEACCBOOPAG = 1;
  private static int BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBRELENACCE_SPAN_CPTSLEAEAFPN = 3;
  private static int BUK_LIBRELENACCE_RPTBOX_PAGEHEADER = 4;
  private static int BUK_LIBRELENACCE_SPAN_ACCERDIENTRA = 5;
  private static int BUK_LIBRELENACCE_RPTBOX_PAGEBODY = 6;
  private static int BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_LIBRELENACCE_RPT_ELENACCEREPO = 8;
  private static int BUK_LIBRELENACCE_SEC_REPORTHEADER = 9;
  private static int BUK_LIBRELENACCE_SEC_PAGEHEADER = 10;
  private static int BUK_LIBRELENACCE_SEC_ESEOPECAGRHE = 11;
  private static int BUK_LIBRELENACCE_SEC_ESEOPEARGRHE = 12;
  private static int BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER = 13;
  private static int BUK_LIBRELENACCE_SPAN_IMPORTO = 14;
  private static int BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER = 15;
  private static int BUK_LIBRELENACCE_SPAN_ORDINATIVI = 16;
  private static int BUK_LIBRELENACCE_RPTBOX_DISPONHEADER = 17;
  private static int BUK_LIBRELENACCE_SPAN_DISPONIBILIT = 18;
  private static int BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE = 19;
  private static int BUK_LIBRELENACCE_SPAN_DATA = 20;
  private static int BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER = 21;
  private static int BUK_LIBRELENACCE_SPAN_ACCERTAMENTO = 22;
  private static int BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER = 23;
  private static int BUK_LIBRELENACCE_SPAN_DELIBERA = 24;
  private static int BUK_LIBRELENACCE_RPTBOX_VOCEPEG = 25;
  private static int BUK_LIBRELENACCE_SPAN_VOCEPEG = 26;
  private static int BUK_LIBRELENACCE_SEC_DETAIL = 27;
  private static int BUK_LIBRELENACCE_RPTBOX_IMPORTO = 28;
  private static int BUK_LIBRELENACCE_SPAN_VIACEIEAFEAB = 29;
  private static int BUK_LIBRELENACCE_RPTBOX_ORDINATIVI = 30;
  private static int BUK_LIBRELENACCE_SPAN_VAEEOOEAFEAB = 31;
  private static int BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT = 32;
  private static int BUK_LIBRELENACCE_SPAN_VAEEODEAFEAB = 33;
  private static int BUK_LIBRELENACCE_RPTBOX_DATAREG = 34;
  private static int BUK_LIBRELENACCE_SPAN_VAEADDDREAFE = 35;
  private static int BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO = 36;
  private static int BUK_LIBRELENACCE_SPAN_VIACEAEAFEAB = 37;
  private static int BUK_LIBRELENACCE_RPTBOX_DELIBERA = 38;
  private static int BUK_LIBRELENACCE_SPAN_VIACEDEAFEAB = 39;
  private static int BUK_LIBRELENACCE_SEC_DETAILDESCRI = 40;
  private static int BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE = 41;
  private static int BUK_LIBRELENACCE_SPAN_VIAEADEAFEAB = 42;
  private static int BUK_LIBRELENACCE_SEC_ESEOPEARGRFO = 43;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1 = 44;
  private static int BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA = 45;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1 = 46;
  private static int BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO = 47;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1 = 48;
  private static int BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD = 49;
  private static int BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO = 50;
  private static int BUK_LIBRELENACCE_SPAN_TOTALEARTICO = 51;
  private static int BUK_LIBRELENACCE_SEC_ESEOPECAGRFO = 52;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2 = 53;
  private static int BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA = 54;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2 = 55;
  private static int BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO = 56;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2 = 57;
  private static int BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD = 58;
  private static int BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1 = 59;
  private static int BUK_LIBRELENACCE_SPAN_TOTALECAPIT1 = 60;
  private static int BUK_LIBRELENACCE_SEC_PAGEFOOTER = 61;
  private static int BUK_LIBRELENACCE_SEC_REPORTFOOTER = 62;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO = 63;
  private static int BUK_LIBRELENACCE_SPAN_RFSVAEIEAFEA = 64;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT = 65;
  private static int BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF = 66;
  private static int BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI = 67;
  private static int BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF = 68;
  private static int BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO = 69;
  private static int BUK_LIBRELENACCE_SPAN_TOTALECAPITO = 70;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI468(IMDB);
    //
    //
    Init_PQRY_ESEAOPE1(IMDB);
    Init_PQRY_PARAMETRI466(IMDB);
    Init_PQRY_PARAMETRI466_RS(IMDB);
    Init_PQRY_VISTAACCELE5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI468(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI468, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI468, "TBL_PARAMETRI468");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMESERCIZ,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI468,IMDBDef6.FLD_PARAMETRI468_PARAMDAL,6,49,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI468, 0);
  }

  private static void Init_PQRY_ESEAOPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_ESEAOPE1, 21);
    IMDB.set_TblCode(IMDBDef17.PQRY_ESEAOPE1, "PQRY_ESEAOPE1");
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFICA, "ESEOPEESFICA");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFICA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIAR, "ESEOPEESFIAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESOPESFIANAC, "ESOPESFIANAC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESOPESFIANAC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESOPESFINUAC, "ESOPESFINUAC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESOPESFINUAC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEINFACC, "ESEOPEINFACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEINFACC,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACANDE, "ESEOPEACANDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACANDE,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACNUDE, "ESEOPEACNUDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACNUDE,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACSEDE, "ESEOPEACSEDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACSEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACDARE, "ESEOPEACDARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACDARE,1,7,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACCDES, "ESEOPEACCDES");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACCDES,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACCDEB, "ESEOPEACCDEB");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACCDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESOPBERASOEE, "ESOPBERASOEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESOPBERASOEE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEAOPEIMPOR, "ESEAOPEIMPOR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEAOPEIMPOR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACANPR, "ESEOPEACANPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACUNPR, "ESEOPEACUNPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACUNPR,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACNUPR, "ESEOPEACNUPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACNUPR,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIOR, "ESEOPEESFIOR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIOR,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIDI, "ESEOPEESFIDI");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIDI,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIES, "ESEOPEESFIES");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIES,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPACCOLI5, "ESEOPACCOLI5");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPACCOLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACCOEU, "ESEOPEACCOEU");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE1,IMDBDef17.PQSL_ESEAOPE1_ESEOPEACCOEU,1,1,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_ESEAOPE1, 0);
  }

  private static void Init_PQRY_PARAMETRI466(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI466, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI466, "PQRY_PARAMETRI466");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI466,IMDBDef17.PQSL_PARAMETRI466_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI466,IMDBDef17.PQSL_PARAMETRI466_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI466,IMDBDef17.PQSL_PARAMETRI466_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI466,IMDBDef17.PQSL_PARAMETRI466_PARAMDAL,6,49,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI466, 0);
  }

  private static void Init_PQRY_PARAMETRI466_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI466_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI466_RS, "PQRY_PARAMETRI466_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI466_RS,IMDBDef17.PQSL_PARAMETRI466_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI466_RS,IMDBDef17.PQSL_PARAMETRI466_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI466_RS,IMDBDef17.PQSL_PARAMETRI466_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI466_RS,IMDBDef17.PQSL_PARAMETRI466_PARAMDAL,6,49,0);
  }

  private static void Init_PQRY_VISTAACCELE5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_VISTAACCELE5, 19);
    IMDB.set_TblCode(IMDBDef17.PQRY_VISTAACCELE5, "PQRY_VISTAACCELE5");
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPCA, "VIACELESOPCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPAR, "VIACELESOPAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPAA, "VIACELESOPAA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPAA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPNA, "VIACELESOPNA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPNA,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACANDE, "VIACELACANDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACANDE,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACNUDE, "VIACELACNUDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACNUDE,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACSEDE, "VIACELACSEDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACSEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACELVOPEG, "VISACELVOPEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACELVOPEG,5,212,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELEACC, "VISACCELEACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELEACC,5,198,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACDDDR, "VIACELACDDDR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACDDDR,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELACD1, "VISACCELACD1");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELACD1,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELEDEL, "VISACCELEDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELEDEL,5,103,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELEIMP, "VISACCELEIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELEIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPOR, "VIACELESOPOR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPDI, "VIACELESOPDI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELESOPDI,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELACDE, "VISACCELACDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VISACCELACDE,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACANPR, "VIACELACANPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACUNPR, "VIACELACUNPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACUNPR,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACNUPR, "VIACELACNUPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE5,IMDBDef17.PQSL_VISTAACCELE5_VIACELACNUPR,1,4,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_VISTAACCELE5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoAccertamentiFin(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoAccertamentiFin()
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
    FormIdx = MyGlb.FRM_ELENCACCEFIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0AD0267C-49F6-4C51-8B4F-0941631FC29D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 816;
    DesignHeight = 422;
    set_Caption(new IDVariant("Elenco Accertamenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 816;
    Frames[1].Height = 396;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.131313;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 816;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A98C18E9-DB51-48E6-9788-0E9DD13F74D1");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 280, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 816;
    Frames[3].Height = 344;
    Frames[3].Caption = "Elenco Accertamenti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 344;
    PAN_ELENCOACCERT = new IDPanel(w, this, 3, "PAN_ELENCOACCERT");
    Frames[3].Content = PAN_ELENCOACCERT;
    PAN_ELENCOACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOACCERT.VS = MainFrm.VisualStyleList;
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 816-MyGlb.PAN_OFFS_X, 344-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBRELENACCE != null)
      PAN_ELENCOACCERT.SetBook(BUK_LIBRELENACCE);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AA5D7490-8F41-4164-BD02-7439DEBD72F6");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1516, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOACCERT.InitStatus = 1;
    PAN_ELENCOACCERT_Init();
    PAN_ELENCOACCERT_InitFields();
    PAN_ELENCOACCERT_InitQueries();
    BKW_LIBRELENACCE = new OBook(this);
    BUK_LIBRELENACCE = new CIDREObj(BKW_LIBRELENACCE);
    BKW_LIBRELENACCE.iGuid = "DC2FF768-9B5C-4AC6-9240-F8958F421C85";
    BKW_LIBRELENACCE.Code = "BUK_LIBRELENACCE";
    BKW_LIBRELENACCE.BookObj = BUK_LIBRELENACCE;
    BKW_LIBRELENACCE.InitDefMasks();
    BUK_LIBRELENACCE.InitBook(1, 3342337, "Libro Elenco Accertamenti", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRELENACCE.InitHTML();
    BUK_LIBRELENACCE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRELENACCE.Book.SetMainFrm(MainFrm);
    BUK_LIBRELENACCE.SetRTCGuid(0, "DC2FF768-9B5C-4AC6-9240-F8958F421C85");
    BUK_LIBRELENACCE.SetObjCode(0, "LIBRELENACCE");
    if (PAN_ELENCOACCERT != null)
      PAN_ELENCOACCERT.SetBook(BUK_LIBRELENACCE);
    BUK_LIBRELENACCE_MST_ELEACCBOOPAG_Init();
    BUK_LIBRELENACCE_RPT_ELENACCEREPO_Init();
    BUK_LIBRELENACCE_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_NUOVO22+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST10+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRISTAMPA4+BaseCmdLinIdx)
      {
        ApriStampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EXPORTCSV6+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG136+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG133+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG136+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOACC3+BaseCmdLinIdx)
      {
        ApriChiusuraAutomaticaAccertamenti();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI468, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCACCEFIN_PARAMETRI466();
      }
      PAN_ELENCOACCERT.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_LIBRELENACCE.UpdateBook();
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
    if (Code.equals("BUK_LIBRELENACCE")) return BUK_LIBRELENACCE;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoAccertamentiFin);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoAccertamentiFin.class.getName() : (Glb.ClassWithPackage(ElencoAccertamentiFin.class) ? ElencoAccertamentiFin.class.getName().substring(ElencoAccertamentiFin.class.getPackage().getName().length() + 1) : ElencoAccertamentiFin.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elenco Accertamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOACCERT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOACCERT);
      // 
      // Elenco Accertamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_DESCRIZIONE,IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESEOPEACCDES, 0).stringValue()); 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_RAGIONSOCIAL,(new IDVariant(PAN_ELENCOACCERT.FieldText(PFL_ELENCOACCERT_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "ElencoAccertamentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Accertamenti On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_ELENCOACCERT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Accertamenti On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_ELENCOACCERT.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET37+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET37+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "ElencoAccertamentiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Accertamenti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_ELENCOACCERT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Accertamenti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_ELENCOACCERT.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_ELENCOACCERT.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "ElencoAccertamentiOnCommandEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI468, IMDBDef6.FLD_PARAMETRI468_PARASOLOCOMP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI468, IMDBDef6.FLD_PARAMETRI468_PARAMDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef6.TBL_PARAMETRI468, IMDBDef6.FLD_PARAMETRI468_PARAMESERCIZ, 0), (new IDVariant(1)), (new IDVariant(1))));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_ELENCOACCERT.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOACCERT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO22+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST10+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO22+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST10+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOACCERT.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_CHIUAUTOPREN)), true) && Result.booleanValue())
      {
        PAN_ELENCOACCERT.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Stampa
  // **********************************************************************
  public int ApriStampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stampa Body
      // Procedure Body
      // 
      BUK_LIBRELENACCE.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_LIBRELENACCE.ReportRefreshQuery(BUK_LIBRELENACCE_RPT_ELENACCEREPO);
      BUK_LIBRELENACCE.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_LIBRELENACCE.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "ApriStampa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Export CSV
  // **********************************************************************
  public int ExportCSV ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Export CSV Body
      // Corpo Procedura
      // 
      PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      new IDVariant(PAN_ELENCOACCERT.ExportData((new IDVariant(-1)).booleanValue(),false)); 
      PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "ExportCSV", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Chiusura Automatica Accertamenti
  // **********************************************************************
  public int ApriChiusuraAutomaticaAccertamenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant I = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      I = (new IDVariant(1, IDVariant.INTEGER));
      // 
      // Apri Chiusura Automatica Accertamenti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMTIPCHI, 0, (new IDVariant("ACC")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI335, IMDBDef6.FLD_PARAMETRI335_ROWNAMDATREG, 0, IDL.Today());
      if ((new IDVariant(PAN_ELENCOACCERT.ShowMultipleSel())).equals((new IDVariant(-1)), true))
      {
        C3 = PAN_ELENCOACCERT.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_ELENCOACCERT.GotoFirst();
        while (!PAN_ELENCOACCERT.RSEOF())
        {
          if (PAN_ELENCOACCERT.IsRowSelected(I.intValue()))
          {
            APRCHIAUTACC_IMPACCSEINV1(C3.Get("ESEOPEESFIES"), C3.Get("ESEOPEESFICA"), C3.Get("ESEOPEESFIAR"), C3.Get("ESOPESFIANAC"), C3.Get("ESOPESFINUAC"), C3.Get("ESEOPEESFIDI"));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ELENCOACCERT.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
      }
      else
      {
        APRCHIAUTACC_IMPACCSEINVA();
      }
      MainFrm.Show(MyGlb.FRM_CHIUAUTOPREN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "ApriChiusuraAutomaticaAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTACC_IMPACCSEINV1(IDVariant C3_ESEOPEESFIES, IDVariant C3_ESEOPEESFICA, IDVariant C3_ESEOPEESFIAR, IDVariant C3_ESOPESFIANAC, IDVariant C3_ESOPESFINUAC, IDVariant C3_ESEOPEESFIDI) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_ESEOPEESFIES);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, C3_ESEOPEESFICA);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, C3_ESEOPEESFIAR);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_ESOPESFIANAC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_ESOPESFINUAC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, C3_ESEOPEESFIDI);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTACC_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIES, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFICA, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIAR, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESOPESFIANAC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESOPESFINUAC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIDI, 0));
  }

  // **********************************************************************
  // Apri Info Accertamento
  // **********************************************************************
  public int ApriInfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESOPESFINUAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESOPESFIANAC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "ApriInfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo
  // **********************************************************************
  public int Nuovo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARANUODAESP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMCAPITOL, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFICA, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMARTICOL, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESEOPEESFIAR, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      ((Accertamenti)MainFrm.GetForm(MyGlb.FRM_ACCERTAMENTI,0,true,this)).NUOVARIGA();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "Nuovo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Modifica
  // **********************************************************************
  public int Modifica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Modifica Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESOPESFIANAC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Residuo")));
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESOPESFIANAC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE1, IMDBDef17.PQSL_ESEAOPE1_ESOPESFINUAC, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFin", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELENCACCEFIN_PARAMETRI466() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI466_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI468, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI468, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI466_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI466_RS, 0, IMDBDef6.TBL_PARAMETRI468, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI466_RS, 0, 0, IMDBDef6.TBL_PARAMETRI468, IMDBDef6.FLD_PARAMETRI468_PARASOLOCOMP, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI466_RS, 1, 0, IMDBDef6.TBL_PARAMETRI468, IMDBDef6.FLD_PARAMETRI468_PARAMDAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI468, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI468, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI468, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI466_RS, 0);
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
  private void PAN_ELENCOACCERT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOACCERT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOACCERT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOACCERT, Cancel);
    // Stub
  }

  private void PAN_ELENCOACCERT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOACCERT_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_ELENCOACCERT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOACCERT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOACCERT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOACCERT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBRELENACCE_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBRELENACCE_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBRELENACCE_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_ESEOPECAGRHE)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_ESEOPEARGRHE)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_DETAILDESCRI)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_ESEOPEARGRFO)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ESEOPEARGRFO,"VISACCELEIMP")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ESEOPEARGRFO,"VIACELESOPOR")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ESEOPEARGRFO,"VIACELESOPDI")));
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_ESEOPECAGRFO)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ESEOPECAGRFO,"VISACCELEIMP")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ESEOPECAGRFO,"VIACELESOPOR")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_ESEOPECAGRFO,"VIACELESOPDI")));
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_LIBRELENACCE_SEC_REPORTFOOTER)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_RFSVAEIEAFEA, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_REPORTFOOTER,"VISACCELEIMP")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_REPORTFOOTER,"VIACELESOPOR")));
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_REPORTFOOTER,"VIACELESOPDI")));
    }
  }

  private void BUK_LIBRELENACCE_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBRELENACCE_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBRELENACCE_MST_ELEACCBOOPAG)
    {
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_CPTSLEAEAFPN, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENACCE.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENACCE.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBRELENACCE_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBRELENACCE_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBRELENACCE_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBRELENACCE_OnPreview()
  {
    PreviewBook = BKW_LIBRELENACCE;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOACCERT_Init()
  {

    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_FIELD, 25);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "79C2A673-8A8E-4D6E-A249-82E7C72904FF");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "CAPITOLO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "EB11FAF9-AE16-40DC-B243-3DE4F4DAAAC4");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "ARTICOLO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "5585A37E-DADD-4D37-9321-BC2B3DB9F80C");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "NUMERO ACC");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "7696949D-A966-4ABD-B780-128EAE890639");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "ANNO ACC");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "EB7045C4-0438-4EC5-BF1F-B50F148779DD");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "Info Accertamento");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "D48BA093-4D31-48E1-9CD3-2F5343A498A0");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "Debitore");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "BD3EEED3-7CA5-427C-896D-DFA59DA387E9");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, " ");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "55BB01FC-BA4A-4917-B262-B93B33F238D0");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "Importo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "65538FCC-4799-45B1-9F1B-F991FFC48051");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "Ordinativi");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "F7E0B5DB-E498-4D35-9FA8-C2E5647C588D");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "Disponibilità");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "54D151E0-05C7-4D53-ADA9-7D239E7B68C6");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "Data");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "E9954585-D462-4EAC-8FD6-2432980BDD10");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "Descrizione");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "D2D97BD9-0DCA-4B08-9C2F-D79A4A59B5E7");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "SEDE DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "D1269763-476F-4220-BB00-7B9FCDCCDC92");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "NUMERO DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "847F207B-2B57-4636-8E5F-C079971112D0");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "ANNO DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "380E8C7E-0BDD-4E2E-9C5E-9F2B86F8BE8E");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "1016DB42-A172-463E-A158-8DFBA76C7F3B");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "2E4CA93E-6BB1-4C03-90BB-C45F0330C95B");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "B3E5EE2A-4A87-423E-B91E-7306B24696F1");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "V livello");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "F44F08B6-7F22-4723-B1FE-C5BB9DE7510B");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "Cod. Europeo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "Brief description of field content.");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, "8BB8233F-85E2-44A3-8CC8-362CFADE065E");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, "Capitolo/Art.");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, "39BF7705-00A8-404C-BC61-6E7FF23925E5");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, "Accertamento");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, "60F297D4-4648-474E-9A46-764925C882C6");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, "Delibera");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, "A541046D-33B5-47A2-80B0-A8CB794F80E8");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, "Proposta");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "E031D562-F3FF-4223-9FE2-F37FFAAE1105");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, 0, -1);
  }

  private void PAN_ELENCOACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CAPITOLO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CAPITOLO, PPQRY_ESEAOPE1, "A.CAPITOLO", "ESEOPEESFICA", 3, 16, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ARTICOLO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ARTICOLO, PPQRY_ESEAOPE1, "A.ARTICOLO", "ESEOPEESFIAR", 1, 2, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 120, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROACC, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROACC, PPQRY_ESEAOPE1, "A.NUMERO_ACC", "ESOPESFINUAC", 1, 5, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 172, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOACC, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOACC, PPQRY_ESEAOPE1, "A.ANNO_ACC", "ESOPESFIANAC", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 216, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_LIST, "I. Ac.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 388, 532, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 100);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.PANEL_FORM, "Info Accertamento");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_INFOACCERTAM, -1, -1);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_INFOACCERTAM, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_INFOACCERTAM, PPQRY_ESEAOPE1, "DECODE(A.NUMERO_ACC, to_number(NULL), NULL, 'I')", "ESEOPEINFACC", 5, 99, 0, -13997);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_INFOACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 240, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 4, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DEBITORE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DEBITORE, PPQRY_ESEAOPE1, "B.DEBITORE", "ESEOPEACCDEB", 2, 15, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 300, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 436, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_RAGIONSOCIAL, PPQRY_ESEAOPE1, "C.RAGIONE_SOCIALE_ESTESA", "ESOPBERASOEE", 5, 60, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 500, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 4, 316, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_IMPORTO, -1, -1);
    PAN_ELENCOACCERT.SetFieldUnbound(PFL_ELENCOACCERT_IMPORTO, true);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_IMPORTO, PPQRY_ESEAOPE1, "A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES", "ESEAOPEIMPOR", 3, 28, 6, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 620, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, "Ordinativi");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 4, 1192, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, "Ordinativi");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ORDINATIVI, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ORDINATIVI, PPQRY_ESEAOPE1, "A.ORDINATIVI", "ESEOPEESFIOR", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 704, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 1216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DISPONIBILIT, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DISPONIBILIT, PPQRY_ESEAOPE1, "A.DISPONIBILITA", "ESEOPEESFIDI", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 800, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DATA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DATA, PPQRY_ESEAOPE1, "B.DATA_REG", "ESEOPEACDARE", 1, 7, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 864, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DESCRIZIONE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DESCRIZIONE, PPQRY_ESEAOPE1, "B.DESCRIZIONE", "ESEOPEACCDES", 5, 140, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1104, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_SEDEDEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_SEDEDEL, PPQRY_ESEAOPE1, "B.SEDE_DEL", "ESEOPEACSEDE", 5, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1140, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMERODEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMERODEL, PPQRY_ESEAOPE1, "B.NUMERO_DEL", "ESEOPEACNUDE", 1, 6, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1188, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNODEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNODEL, PPQRY_ESEAOPE1, "B.ANNO_DEL", "ESEOPEACANDE", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1224, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_UNITAPROPONE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_UNITAPROPONE, PPQRY_ESEAOPE1, "B.UNITA_PROPONENTE", "ESEOPEACUNPR", 5, 8, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1332, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PRP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROPROPOS, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROPROPOS, PPQRY_ESEAOPE1, "B.NUMERO_PROPOSTA", "ESEOPEACNUPR", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1372, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PRP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOPROPOSTA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOPROPOSTA, PPQRY_ESEAOPE1, "B.ANNO_PROPOSTA", "ESEOPEACANPR", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1408, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, "V livello");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 484, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, "V livello");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODLIVELLO5, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODLIVELLO5, PPQRY_ESEAOPE1, "B.COD_LIVELLO_5", "ESEOPACCOLI5", 3, 10, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1480, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod Eur.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 508, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODICEEUROPE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODICEEUROPE, PPQRY_ESEAOPE1, "B.CODICE_EUROPEO", "ESEOPEACCOEU", 1, 1, 0, -13997);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_CODICEEUROPE, (new IDVariant(1)), "1 - entrate destinate al finanziamento dei progetti comunitari", "", "", -1);
    PAN_ELENCOACCERT.SetValueListItem(PFL_ELENCOACCERT_CODICEEUROPE, (new IDVariant(2)), "2 - altre entrate", "", "", -1);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_FORM, 36, 68, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CAPITOLOART, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 120, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 44, 76, 180, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.PANEL_FORM, 3);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ACCERTAMENTO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_LIST, 1104, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_FORM, 52, 84, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DELIBERA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DELIBERA, -1, "", "DELIBERA", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_LIST, 1224, 0, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_LIST, 2);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_FORM, 60, 92, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_PROPOSTA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_PROPOSTA, -1, "", "PROPOSTA", 0, 0, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 388, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ESERCIZIO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ESERCIZIO, PPQRY_ESEAOPE1, "A.ESERCIZIO", "ESEOPEESFIES", 1, 4, 0, -13997);
  }

  private void PAN_ELENCOACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCOACCERT.SetIMDB(IMDB, "PQRY_ESEAOPE1", true);
    PAN_ELENCOACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "ESEA OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as ESEOPEESFICA, ");
    SQL.append("  A.ARTICOLO as ESEOPEESFIAR, ");
    SQL.append("  A.ANNO_ACC as ESOPESFIANAC, ");
    SQL.append("  A.NUMERO_ACC as ESOPESFINUAC, ");
    SQL.append("  DECODE(A.NUMERO_ACC, to_number(NULL), NULL, 'I') as ESEOPEINFACC, ");
    SQL.append("  B.ANNO_DEL as ESEOPEACANDE, ");
    SQL.append("  B.NUMERO_DEL as ESEOPEACNUDE, ");
    SQL.append("  B.SEDE_DEL as ESEOPEACSEDE, ");
    SQL.append("  B.DATA_REG as ESEOPEACDARE, ");
    SQL.append("  B.DESCRIZIONE as ESEOPEACCDES, ");
    SQL.append("  B.DEBITORE as ESEOPEACCDEB, ");
    SQL.append("  C.RAGIONE_SOCIALE_ESTESA as ESOPBERASOEE, ");
    SQL.append("  A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES as ESEAOPEIMPOR, ");
    SQL.append("  B.ANNO_PROPOSTA as ESEOPEACANPR, ");
    SQL.append("  B.UNITA_PROPONENTE as ESEOPEACUNPR, ");
    SQL.append("  B.NUMERO_PROPOSTA as ESEOPEACNUPR, ");
    SQL.append("  A.ORDINATIVI as ESEOPEESFIOR, ");
    SQL.append("  A.DISPONIBILITA as ESEOPEESFIDI, ");
    SQL.append("  A.ESERCIZIO as ESEOPEESFIES, ");
    SQL.append("  B.COD_LIVELLO_5 as ESEOPACCOLI5, ");
    SQL.append("  B.CODICE_EUROPEO as ESEOPEACCOEU ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEACC_FIN A, ");
    SQL.append("  ACC B, ");
    SQL.append("  BEN C ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (A.FINANZIAMENTO = DECODE(~~TBL_PARAMETRI468.PARAMFINANZI~~, -1, A.FINANZIAMENTO, ~~TBL_PARAMETRI468.PARAMFINANZI~~)) ");
    SQL.append("and   (A.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI468.PARAMARTICOL~~, -1), -1, A.ARTICOLO, ~~TBL_PARAMETRI468.PARAMARTICOL~~)) ");
    SQL.append("and   (A.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI468.PARAMCAPITOL~~, -1), -1, A.CAPITOLO, ~~TBL_PARAMETRI468.PARAMCAPITOL~~)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI468.PARAMESERCIZ~~) ");
    SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI468.PARAMDAL~~, B.D_DATA_REG)) ");
    SQL.append("and   ((A.ANNO_ACC = A.ESERCIZIO) OR (~~TBL_PARAMETRI468.PARASOLOCOMP~~ = 'NO')) ");
    SQL.append("and   (C.CODICE(+) = B.DEBITORE) ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE1, 5, SQL, -1, "");
    PAN_ELENCOACCERT.SetQueryDB(PPQRY_ESEAOPE1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOACCERT.SetMasterTable(0, "ESEACC_FIN");
    PAN_ELENCOACCERT.AddToSortList(PFL_ELENCOACCERT_ANNOACC, true);
    PAN_ELENCOACCERT.AddToSortList(PFL_ELENCOACCERT_NUMEROACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOACCERT.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOACCERT.iUseListQBE;
      PAN_ELENCOACCERT.iUseListQBE = 0;
      PAN_ELENCOACCERT.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOACCERT.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOACCERT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "89B1F7D0-383E-447D-A3F0-629730844252");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "CA6ABF0E-0585-4D37-BA05-E65508A3C038");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Sl. Cmp.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 4, 4, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCOMPETEN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI466, "A.PARASOLOCOMP", "PARASOLOCOMP", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCOMPETEN, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 40, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 152, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI466, "A.PARAMDAL", "PARAMDAL", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI466", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI466, IMDBDef17.PQRY_PARAMETRI466_RS, IMDBDef6.TBL_PARAMETRI468);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef6.FLD_PARAMETRI468_PARASOLOCOMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef6.FLD_PARAMETRI468_PARAMDAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI468");
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

  private void BUK_LIBRELENACCE_MST_ELEACCBOOPAG_Init()
  {
    BUK_LIBRELENACCE.InitMastro(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, "659F0A41-F77B-452D-8A46-DFE45553CFE0");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, "ELEACCBOOPAG");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, 17900, 400, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, "F6D0A390-6C5E-48A9-A54C-47835180B014");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, BUK_LIBRELENACCE_SPAN_CPTSLEAEAFPN, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_CPTSLEAEAFPN, "A4BF628B-C385-4E37-A12A-85959D097424");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_CPTSLEAEAFPN, "CPTSLEAEAFPN");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 800, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, "DFE4DAEA-E385-4B86-9EC7-FE047D9DCBF0");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Accertamenti di Entrata", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, "FDA0442F-CFC0-463C-8C5B-96311A615732");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, "ACCERDIENTRA");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEBODY, 1000, 2000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, "E10D2453-24E0-486D-B7A3-CB9C3BF256A2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, "8DFDFDF1-D0B3-492A-9C18-CFB35624E567");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery() { BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(true, true); }
  private void BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as VIACELESOPCA, ");
      SQL.append("  A.ARTICOLO as VIACELESOPAR, ");
      SQL.append("  A.ANNO_ACC as VIACELESOPAA, ");
      SQL.append("  A.NUMERO_ACC as VIACELESOPNA, ");
      SQL.append("  B.ANNO_DEL as VIACELACANDE, ");
      SQL.append("  B.NUMERO_DEL as VIACELACNUDE, ");
      SQL.append("  B.SEDE_DEL as VIACELACSEDE, ");
      SQL.append("  'Capitolo/Art. ' || CASE WHEN (A.CAPITOLO IS NULL) THEN NULL ELSE ' - ' || TO_CHAR ( A.CAPITOLO ) END || CASE WHEN (A.ARTICOLO IS NULL) THEN NULL ELSE ' / ' || TO_CHAR ( A.ARTICOLO ) END as VISACELVOPEG, ");
      SQL.append("  TO_CHAR ( A.NUMERO_ACC ) || CASE WHEN NOT ((A.ANNO_ACC IS NULL)) THEN ' / ' || TO_CHAR ( A.ANNO_ACC ) ELSE NULL END as VISACCELEACC, ");
      SQL.append("  B.D_DATA_REG as VIACELACDDDR, ");
      SQL.append("  B.DESCRIZIONE as VISACCELACD1, ");
      SQL.append("  B.SEDE_DEL || CASE WHEN NOT ((B.NUMERO_DEL IS NULL)) THEN ' - ' || TO_CHAR ( B.NUMERO_DEL ) || CASE WHEN NOT ((B.ANNO_DEL IS NULL)) THEN ' / ' || TO_CHAR ( B.ANNO_DEL ) ELSE NULL END ELSE CASE WHEN NOT ((B.ANNO_DEL IS NULL)) THEN ' / ' || TO_CHAR ( B.ANNO_DEL ) ELSE NULL END END as VISACCELEDEL, ");
      SQL.append("  A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES as VISACCELEIMP, ");
      SQL.append("  A.ORDINATIVI as VIACELESOPOR, ");
      SQL.append("  A.DISPONIBILITA as VIACELESOPDI, ");
      SQL.append("  B.DEBITORE as VISACCELACDE, ");
      SQL.append("  B.ANNO_PROPOSTA as VIACELACANPR, ");
      SQL.append("  B.UNITA_PROPONENTE as VIACELACUNPR, ");
      SQL.append("  B.NUMERO_PROPOSTA as VIACELACNUPR ");
      SQL.append("from ");
      SQL.append("  ESEA_OPE A, ");
      SQL.append("  ACC B, ");
      SQL.append("  BEN C ");
      SQL.append("where (B.ANNO_ACC = A.ANNO_ACC) ");
      SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
      SQL.append("and   (A.OPERA = DECODE(NVL(~~TBL_PARAMETRI468.PARAMOPERA~~, -1), -1, A.OPERA, ~~TBL_PARAMETRI468.PARAMOPERA~~)) ");
      SQL.append("and   (A.FINANZIAMENTO = DECODE(NVL(~~TBL_PARAMETRI468.PARAMFINANZI~~, -1), -1, A.FINANZIAMENTO, ~~TBL_PARAMETRI468.PARAMFINANZI~~)) ");
      SQL.append("and   (A.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI468.PARAMARTICOL~~, -1), -1, A.ARTICOLO, ~~TBL_PARAMETRI468.PARAMARTICOL~~)) ");
      SQL.append("and   (A.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI468.PARAMCAPITOL~~, -1), -1, A.CAPITOLO, ~~TBL_PARAMETRI468.PARAMCAPITOL~~)) ");
      SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI468.PARAMESERCIZ~~) ");
      SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI468.PARAMDAL~~, B.D_DATA_REG)) ");
      SQL.append("and   ((A.ANNO_ACC = A.ESERCIZIO) OR (~~TBL_PARAMETRI468.PARASOLOCOMP~~ = 'NO')) ");
      SQL.append("and   (C.CODICE(+) = B.DEBITORE) ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO, ");
      SQL.append("  A.ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC ");
      BUK_LIBRELENACCE.SetReportQuery(BUK_LIBRELENACCE_RPT_ELENACCEREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "32240F2C-C2A4-4166-8C0F-CA0305E29DFA");
      if (BUK_LIBRELENACCE.FindObjByID(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE) != null)
        BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, "VIACELESOPCA");
      if (BUK_LIBRELENACCE.FindObjByID(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE) != null)
        BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, "VIACELESOPAR");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBRELENACCE_RPT_ELENACCEREPO_Init()
  {
    BUK_LIBRELENACCE.InitReport(BUK_LIBRELENACCE_RPT_ELENACCEREPO, 196865);
    BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(true, false);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPT_ELENACCEREPO, "484B2DB8-1959-4F70-8D9C-E9FE27E0770C");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPT_ELENACCEREPO, "ELENACCEREPO");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_REPORTHEADER, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_REPORTHEADER, "9E5776E6-36AF-4E95-9F1A-EF50D54FA236");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_PAGEHEADER, BUK_LIBRELENACCE_RPTBOX_PAGEHEADER);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_PAGEHEADER, "7D327C6F-D12A-4A6D-BCE4-A6FA6A03ACD8");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "VIACELESOPCA");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, "5D3B9A2C-A396-4553-ACA4-7C53DD82B882");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, "ESEOPECAGRHE");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, 1600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VIACELESOPAR");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, "2FBF7957-1C43-4556-91F3-799EF0914846");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, "ESEOPEARGRHE");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, 7100, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, "73531027-C53C-4AEA-9C54-41273CA351D2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, BUK_LIBRELENACCE_SPAN_IMPORTO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_IMPORTO, "FF78392B-EB84-4067-8672-9C60DD88D65D");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, 9800, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, "3C7AFCA7-ECF3-4176-9131-D83C7598264B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, "ORDINAHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, BUK_LIBRELENACCE_SPAN_ORDINATIVI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Ordinativi", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ORDINATIVI, "7E13C99D-CF45-4EF0-8A95-19C7B89811A5");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ORDINATIVI, "ORDINATIVI");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, 12500, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, "343465C6-8E30-4BE0-B31C-68232A598E7B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, BUK_LIBRELENACCE_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DISPONIBILIT, "D31D6801-152F-42AB-923C-628C5A0DBA1F");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, 2700, 1100, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, "0479004D-D455-456A-962F-B947439E929A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, "DATAREGHEADE");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, BUK_LIBRELENACCE_SPAN_DATA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Data", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DATA, "BF5C6552-A780-4E48-8258-C1C01DFCAF7A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DATA, "DATA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, 400, 1100, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, "56A87E71-4B5E-41B7-8059-E848E112BB6D");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Accertamento", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, "4B75F7E5-3400-46CA-B7CF-8E0A2AB3130B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, 4400, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, "2867316E-40E4-4D3F-A148-10106DC0E225");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, "DELIBEHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, BUK_LIBRELENACCE_SPAN_DELIBERA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Delibera", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DELIBERA, "0DD498D1-AF42-44F7-8C7F-30919A0FD101");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DELIBERA, "DELIBERA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_VOCEPEG, 0, 200, 18800, 700, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, "8E533F34-8FE9-49F7-A5F3-E20F725F94D3");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, BUK_LIBRELENACCE_SPAN_VOCEPEG, MyGlb.VIS_HEADSENZBOR1, 5, 212, 0, 271319425, "Voce P E G", "::VISACELVOPEG", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VOCEPEG, "85820089-9D01-44EC-BB37-A23A9C5CC745");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_DETAIL, "6C4A419B-12F3-4E12-A9A9-3D727EDB98B2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_DETAIL, "DETAIL");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_IMPORTO, 7100, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_IMPORTO, "6D4098B8-FD1C-4A47-A8DC-570E669E4B93");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_IMPORTO, BUK_LIBRELENACCE_SPAN_VIACEIEAFEAB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "VISTA ACC UO UT SALDO INI + VISTA ACC UO UT VARIAZIONI + VISTA ACC UO UT VARIAZIONI RES", "::VISACCELEIMP", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACEIEAFEAB, "D6CADC41-76F2-4218-8B15-06731B377B85");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACEIEAFEAB, "VIACEIEAFEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, 9800, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, "77C1F8EA-7A84-4CD4-ABFE-1E5BF2DBE504");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, "ORDINATIVI");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, BUK_LIBRELENACCE_SPAN_VAEEOOEAFEAB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::VIACELESOPOR", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEEOOEAFEAB, "1DF248CB-006E-4960-B04D-595F5EC67488");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEEOOEAFEAB, "VAEEOOEAFEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, 12500, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, "99EE31FD-B4B8-4821-ADDB-6D910FD68B48");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, BUK_LIBRELENACCE_SPAN_VAEEODEAFEAB, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::VIACELESOPDI", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEEODEAFEAB, "E70523E7-438C-4A6D-80A2-9C8FB0657133");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEEODEAFEAB, "VAEEODEAFEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DATAREG, 2700, 100, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DATAREG, "A2BEF5DC-306A-400F-BCC0-3F565B732A8B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DATAREG, "DATAREG");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DATAREG, BUK_LIBRELENACCE_SPAN_VAEADDDREAFE, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::VIACELACDDDR", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEADDDREAFE, "8EB516D5-E05A-46CF-8A06-C10E74B8F649");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEADDDREAFE, "VAEADDDREAFE");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, 400, 100, 2200, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, "D9B0F158-B028-47BD-8149-2227D8E3D898");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, BUK_LIBRELENACCE_SPAN_VIACEAEAFEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "To String (VISTA ACC UO UT NUMERO ACC) +c barra con spazi +c To String (VISTA ACC UO UT ANNO ACC)", "::VISACCELEACC", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACEAEAFEAB, "95FBD98D-BEF4-418D-8294-08F35E07F102");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACEAEAFEAB, "VIACEAEAFEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DELIBERA, 4400, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DELIBERA, "B07F4E8F-5BDF-4245-9023-5CC90181D88B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DELIBERA, "DELIBERA");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DELIBERA, BUK_LIBRELENACCE_SPAN_VIACEDEAFEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 103, 0, 271384705, "VISTA ACC UO UT SEDE DEL +c trattino con spazi +c To String (VISTA ACC UO UT NUMERO DEL) +c barra con spazi +c To String (VISTA ACC UO UT ANNO DEL)", "::VISACCELEDEL", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIACEDEAFEAB, "9145D180-882A-4979-9CFD-C1B7DEA7CD00");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIACEDEAFEAB, "VIACEDEAFEAB");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_DETAILDESCRI, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_DETAILDESCRI, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_DETAILDESCRI, "5CEC4315-CF45-47B0-AC0F-221498072151");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_DETAILDESCRI, "DETAILDESCRI");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAILDESCRI, BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, 2700, 0, 12300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, "887F3F06-EDC0-43CB-970C-F457D253D832");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, BUK_LIBRELENACCE_SPAN_VIAEADEAFEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::VISACCELACD1", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIAEADEAFEAB, "59D8E357-D496-47D8-981E-E421D53FD72A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIAEADEAFEAB, "VIAEADEAFEAB");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VIACELESOPAR");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, "2D5056AF-AF71-4390-8E8B-185E94F3B9EA");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, "ESEOPEARGRFO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, "9974754B-1892-4F51-B57B-539645BAE5F4");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, "SUMOFIMPORT1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA, "15FF30DE-37CB-422E-A149-DF18E5A159D1");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA, "EOAGFSVAEIEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, "EEFA4695-9AA2-4273-98AA-A5B437498874");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, "SUMOFORDINA1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO, "FE0720FE-F6EB-4DF3-9357-B53EB78A9319");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO, "EOAGFSVAEEOO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, "E4346D13-481C-4894-841C-D7C3C3CF1524");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, "SUMOFDISPON1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD, "06590E1F-0F26-4F89-AE14-75124A8F748D");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD, "EOAGFSVAEEOD");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, "3A89B5F2-F092-4AFF-9ACF-1CE811B81939");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, BUK_LIBRELENACCE_SPAN_TOTALEARTICO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Articolo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALEARTICO, "DCDBFC6E-2447-44E3-BFB1-2A34257402DC");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VIACELESOPCA");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, "7D9DC400-73EE-49A6-8964-A8E4B0FE0408");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, "ESEOPECAGRFO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, "6869798D-FB54-4122-8B37-368F571AAD91");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, "SUMOFIMPORT2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA, "1EF274A1-135F-4F08-9520-9A94CFFDFF80");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA, "EOCGFSVAEIEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, "4B00F666-ED0E-468D-ACB8-1F558E09F545");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, "SUMOFORDINA2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO, "8CF57A12-63EE-477F-BDEC-F7B72D51D1B8");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO, "EOCGFSVAEEOO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, "8D914B97-3AAE-45AD-B470-A8B1981B146E");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, "SUMOFDISPON2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD, "6AC57D26-625D-4B97-9825-D4F6C1C86AAD");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD, "EOCGFSVAEEOD");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, "AF56AD7D-F456-4782-96A2-A81550476E93");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Capitolo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, "5902E26A-427B-4642-AD0C-8843277F2B90");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_PAGEFOOTER, BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_PAGEFOOTER, "33984138-4809-4A2E-89C3-3B3B4387AC13");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_REPORTFOOTER, "34745B72-E286-4FE7-99AB-47435A4A15BD");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, "37E33A28-A06B-4017-A793-3C38B8BE0737");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, "SUMOFIMPORTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, BUK_LIBRELENACCE_SPAN_RFSVAEIEAFEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEIEAFEA, "F2BEBD3C-3DE7-4AF4-AAF1-7CBAC8333CAC");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEIEAFEA, "RFSVAEIEAFEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, "D981BAD1-9988-43AA-957E-C977D83CD555");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, "SUMOFORDINAT");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF, "E0D297AD-4D89-4D1A-ABA0-EC89241C23BF");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF, "RFSVAEEOOEAF");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, "B5F4EAFD-8F45-4CC0-ACA7-A14A91626D71");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, "SUMOFDISPONI");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF, "E12F5892-2F3D-4716-83C8-3847AC1A4D58");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF, "RFSVAEEODEAF");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, "A426245E-A323-4336-8A51-46D1D760F865");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, BUK_LIBRELENACCE_SPAN_TOTALECAPITO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALECAPITO, "16A3897F-14EF-4750-BF10-59658ECC6F00");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, "VIACELESOPCA");
    BUK_LIBRELENACCE.AddReportGroup(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, "VIACELESOPAR");
    BUK_LIBRELENACCE_RPT_ELENACCEREPO_InitQuery(false, true);
  }

  private void BUK_LIBRELENACCE_InitLinks()
  {
    BUK_LIBRELENACCE.SetBoxNextBox(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_ELENCOACCERT) PAN_ELENCOACCERT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBRELENACCE) BUK_LIBRELENACCE_OnPreview();
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
