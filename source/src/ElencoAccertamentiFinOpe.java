// **********************************************
// Elenco Accertamenti Fin Ope
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoAccertamentiFinOpe extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SOLOCOMPETEN = 0;
  private static int PFL_PARAMETRI_DAL = 1;

  private static int PPQRY_PARAMETRI284 = 0;


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

  private static int PPQRY_ESEAOPE = 0;


  IDPanel PAN_ELENCOACCERT;
  CIDREObj BUK_LIBRELENACCE;
  OBook BKW_LIBRELENACCE;
  //
  // Template Pages constants
  private static int BUK_LIBRELENACCE_MST_ELEACCBOOPAG = 1;
  private static int BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBRELENACCE_SPAN_CPTSLEAEAFOP = 3;
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
  private static int BUK_LIBRELENACCE_SPAN_VIAEIEAFOEAB = 29;
  private static int BUK_LIBRELENACCE_RPTBOX_ORDINATIVI = 30;
  private static int BUK_LIBRELENACCE_SPAN_VAEEOOEAFOEA = 31;
  private static int BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT = 32;
  private static int BUK_LIBRELENACCE_SPAN_VAEEODEAFOEA = 33;
  private static int BUK_LIBRELENACCE_RPTBOX_DATAREG = 34;
  private static int BUK_LIBRELENACCE_SPAN_VAEADDREAFOE = 35;
  private static int BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO = 36;
  private static int BUK_LIBRELENACCE_SPAN_VIAEAEAFOEAB = 37;
  private static int BUK_LIBRELENACCE_RPTBOX_DELIBERA = 38;
  private static int BUK_LIBRELENACCE_SPAN_VIAEDEAFOEAB = 39;
  private static int BUK_LIBRELENACCE_SEC_DETAILDESCRI = 40;
  private static int BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE = 41;
  private static int BUK_LIBRELENACCE_SPAN_VAEADEAFOEAB = 42;
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
  private static int BUK_LIBRELENACCE_SPAN_RFSVAEIEAFOE = 64;
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
    Init_TBL_PARAMETRI464(IMDB);
    //
    //
    Init_PQRY_ESEAOPE(IMDB);
    Init_PQRY_PARAMETRI284(IMDB);
    Init_PQRY_PARAMETRI284_RS(IMDB);
    Init_PQRY_VISTAACCELE6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI464(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI464, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI464, "TBL_PARAMETRI464");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMFINANZI, "PARAMFINANZI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMFINANZI,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMESERCIZ,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI464,IMDBDef6.FLD_PARAMETRI464_PARAMDAL,6,49,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI464, 0);
  }

  private static void Init_PQRY_ESEAOPE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_ESEAOPE, 21);
    IMDB.set_TblCode(IMDBDef17.PQRY_ESEAOPE, "PQRY_ESEAOPE");
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPECAPIT, "ESEAOPECAPIT");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEARTIC, "ESEAOPEARTIC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEANNACC, "ESEOPEANNACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPENUMACC, "ESEOPENUMACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPENUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEINFACC, "ESEOPEINFACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEINFACC,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACANDE, "ESEOPEACANDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACANDE,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACNUDE, "ESEOPEACNUDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACNUDE,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACSEDE, "ESEOPEACSEDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACSEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACDARE, "ESEOPEACDARE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACDARE,1,7,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACCDES, "ESEOPEACCDES");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACCDES,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACCDEB, "ESEOPEACCDEB");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACCDEB,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESOPBERASOEE, "ESOPBERASOEE");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESOPBERASOEE,5,60,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEIMPOR, "ESEAOPEIMPOR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEIMPOR,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACANPR, "ESEOPEACANPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACUNPR, "ESEOPEACUNPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACUNPR,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACNUPR, "ESEOPEACNUPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACNUPR,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEORDIN, "ESEAOPEORDIN");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEORDIN,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEDISPO, "ESEAOPEDISPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEDISPO,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEESERC, "ESEAOPEESERC");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEAOPEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPACCOLI5, "ESEOPACCOLI5");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPACCOLI5,3,10,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACCOEU, "ESEOPEACCOEU");
    IMDB.SetFldParams(IMDBDef17.PQRY_ESEAOPE,IMDBDef17.PQSL_ESEAOPE_ESEOPEACCOEU,1,1,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_ESEAOPE, 0);
  }

  private static void Init_PQRY_PARAMETRI284(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI284, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI284, "PQRY_PARAMETRI284");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI284,IMDBDef17.PQSL_PARAMETRI284_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI284,IMDBDef17.PQSL_PARAMETRI284_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI284,IMDBDef17.PQSL_PARAMETRI284_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI284,IMDBDef17.PQSL_PARAMETRI284_PARAMDAL,6,49,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI284, 0);
  }

  private static void Init_PQRY_PARAMETRI284_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI284_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI284_RS, "PQRY_PARAMETRI284_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI284_RS,IMDBDef17.PQSL_PARAMETRI284_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI284_RS,IMDBDef17.PQSL_PARAMETRI284_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI284_RS,IMDBDef17.PQSL_PARAMETRI284_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI284_RS,IMDBDef17.PQSL_PARAMETRI284_PARAMDAL,6,49,0);
  }

  private static void Init_PQRY_VISTAACCELE6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_VISTAACCELE6, 19);
    IMDB.set_TblCode(IMDBDef17.PQRY_VISTAACCELE6, "PQRY_VISTAACCELE6");
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPCA, "VIACELESOPCA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPCA,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPAR, "VIACELESOPAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPAR,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPAA, "VIACELESOPAA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPAA,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPNA, "VIACELESOPNA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPNA,1,5,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACANDE, "VIACELACANDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACANDE,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACNUDE, "VIACELACNUDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACNUDE,1,6,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACSEDE, "VIACELACSEDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACSEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACELVOPEG, "VISACELVOPEG");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACELVOPEG,5,212,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELEACC, "VISACCELEACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELEACC,5,198,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACDDDR, "VIACELACDDDR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACDDDR,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELACD1, "VISACCELACD1");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELACD1,5,140,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELEDEL, "VISACCELEDEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELEDEL,5,103,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELEIMP, "VISACCELEIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELEIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPOR, "VIACELESOPOR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPOR,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPDI, "VIACELESOPDI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELESOPDI,3,14,2);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELACDE, "VISACCELACDE");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VISACCELACDE,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACANPR, "VIACELACANPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACUNPR, "VIACELACUNPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACUNPR,5,8,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACNUPR, "VIACELACNUPR");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELE6,IMDBDef17.PQSL_VISTAACCELE6_VIACELACNUPR,1,4,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_VISTAACCELE6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoAccertamentiFinOpe(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoAccertamentiFinOpe()
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
    FormIdx = MyGlb.FRM_ELEACCFINOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F6FB6DCB-2B20-464F-8ADD-1CD61B2816F5";
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CE6F4E7D-207C-4D45-B4CF-9E0703774D7D");
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
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0A291801-C0CF-4963-9D54-8FBC2B5D0223");
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
    BKW_LIBRELENACCE.iGuid = "087C77AD-15B1-4F31-8353-7F16C9714D2A";
    BKW_LIBRELENACCE.Code = "BUK_LIBRELENACCE";
    BKW_LIBRELENACCE.BookObj = BUK_LIBRELENACCE;
    BKW_LIBRELENACCE.InitDefMasks();
    BUK_LIBRELENACCE.InitBook(1, 3342337, "Libro Elenco Accertamenti", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRELENACCE.InitHTML();
    BUK_LIBRELENACCE.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRELENACCE.Book.SetMainFrm(MainFrm);
    BUK_LIBRELENACCE.SetRTCGuid(0, "087C77AD-15B1-4F31-8353-7F16C9714D2A");
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
      if (CmdIdx==MyGlb.CMD_NUOVO4+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST2+BaseCmdLinIdx)
      {
        Modifica();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRISTAMPA5+BaseCmdLinIdx)
      {
        ApriStampa();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EXPORTCSV1+BaseCmdLinIdx)
      {
        ExportCSV();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI73+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG134+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI73+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CHIUAUTOACCE+BaseCmdLinIdx)
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI464, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELEACCFINOPE_PARAMETRI284();
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
    return (obj instanceof ElencoAccertamentiFinOpe);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoAccertamentiFinOpe.class.getName() : (Glb.ClassWithPackage(ElencoAccertamentiFinOpe.class) ? ElencoAccertamentiFinOpe.class.getName().substring(ElencoAccertamentiFinOpe.class.getPackage().getName().length() + 1) : ElencoAccertamentiFinOpe.class.getName()));
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
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_DESCRIZIONE,IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPEACCDES, 0).stringValue()); 
      PAN_ELENCOACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENCOACCERT_RAGIONSOCIAL,(new IDVariant(PAN_ELENCOACCERT.FieldText(PFL_ELENCOACCERT_RAGIONSOCIAL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "ElencoAccertamentiOnDynamicPropertiesEvent", _e);
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
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET36+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add((new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET36+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        PAN_ELENCOACCERT.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, IDL.Add(IDL.Add((new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))), (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, IDPanel.RT_WIDTH, Glb.PANEL_LIST)))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
        PAN_ELENCOACCERT.set_ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_ELENCOACCERT.ObjRect(Glb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "ElencoAccertamentiOnChangeStatusEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "ElencoAccertamentiOnCommandEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI464, IMDBDef6.FLD_PARAMETRI464_PARASOLOCOMP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI464, IMDBDef6.FLD_PARAMETRI464_PARAMDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef6.TBL_PARAMETRI464, IMDBDef6.FLD_PARAMETRI464_PARAMESERCIZ, 0), (new IDVariant(1)), (new IDVariant(1))));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_ELENCOACCERT.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_ELENCOACCERT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(7)), true)<=0)
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO4+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO4+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      PAN_ELENCOACCERT.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "EndModalEvent", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "ApriStampa", _e);
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "ExportCSV", _e);
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
            APRCHIAUTACC_IMPACCSEINV1(C3.Get("ESEAOPEESERC"), C3.Get("ESEAOPECAPIT"), C3.Get("ESEAOPEARTIC"), C3.Get("ESEOPEANNACC"), C3.Get("ESEOPENUMACC"), C3.Get("ESEAOPEDISPO"));
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
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "ApriChiusuraAutomaticaAccertamenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTACC_IMPACCSEINV1(IDVariant C3_ESEAOPEESERC, IDVariant C3_ESEAOPECAPIT, IDVariant C3_ESEAOPEARTIC, IDVariant C3_ESEOPEANNACC, IDVariant C3_ESEOPENUMACC, IDVariant C3_ESEAOPEDISPO) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, C3_ESEAOPEESERC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, C3_ESEAOPECAPIT);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, C3_ESEAOPEARTIC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, C3_ESEOPEANNACC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, C3_ESEOPENUMACC);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, C3_ESEAOPEDISPO);
  }

  // **********************************************************************
  // Imp Acc Selezionati: Insert values
  // Why are you inserting this record?
  // **********************************************************************
  private void APRCHIAUTACC_IMPACCSEINVA() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_IMPACCSELEZI, 0);
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCESERCI, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEAOPEESERC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCCAPITO, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEAOPECAPIT, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCARTICO, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEAOPEARTIC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_ANNOIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPEANNACC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_NUMEROIMPACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPENUMACC, 0));
    IMDB.set_Value(IMDBDef6.TBL_IMPACCSELEZI, IMDBDef6.FLD_IMPACCSELEZI_IMPACCDISPON, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEAOPEDISPO, 0));
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPENUMACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPEANNACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "ApriInfoAccertamento", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMCAPITOL, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEAOPECAPIT, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMARTICOL, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEAOPEARTIC, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      ((Accertamenti)MainFrm.GetForm(MyGlb.FRM_ACCERTAMENTI,0,true,this)).NUOVARIGA();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "Nuovo", _e);
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
      if (IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPEANNACC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Accertamento")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARATIPOFORM, 0, (new IDVariant("Residuo")));
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMANNOACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPEANNACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI337, IMDBDef4.FLD_PARAMETRI337_PARAMNUMEACC, 0, IMDB.Value(IMDBDef17.PQRY_ESEAOPE, IMDBDef17.PQSL_ESEAOPE_ESEOPENUMACC, 0));
      MainFrm.Show(MyGlb.FRM_ACCERTAMENTI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoAccertamentiFinOpe", "Modifica", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void ELEACCFINOPE_PARAMETRI284() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI284_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI464, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI464, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI284_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI284_RS, 0, IMDBDef6.TBL_PARAMETRI464, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI284_RS, 0, 0, IMDBDef6.TBL_PARAMETRI464, IMDBDef6.FLD_PARAMETRI464_PARASOLOCOMP, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI284_RS, 1, 0, IMDBDef6.TBL_PARAMETRI464, IMDBDef6.FLD_PARAMETRI464_PARAMDAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI464, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI464, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI464, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI284_RS, 0);
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
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_RFSVAEIEAFOE, new IDVariant(BUK_LIBRELENACCE.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_LIBRELENACCE_SEC_REPORTFOOTER,"VISACCELEIMP")));
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
      BUK_LIBRELENACCE.set_SpanValue(BUK_LIBRELENACCE_SPAN_CPTSLEAEAFOP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENACCE.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRELENACCE.GetTotalPagesNumber()))))));
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
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "02B2880A-BFFB-4FD9-AC91-ADF5305E7269");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "CAPITOLO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "23069187-042C-4349-A1CD-104665419BC5");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "ARTICOLO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "E90F65B1-9D3A-47A7-A8F1-12A668EA5092");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "NUMERO ACC");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "0D9ED83D-CBA9-4826-BEA0-2093EBADDFF5");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "ANNO ACC");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "1FF73551-D67D-4C4D-AA26-FC29643612A3");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "Info Accertamento");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "A5ABEFCE-DF0D-4733-89E6-97B78B2BC7C7");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "Debitore");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "96DE3F93-75C7-417E-987C-ED3DE5D18686");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, " ");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.VIS_NOFINOBOVEHE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "A481533E-8030-4C68-9F77-E385DE16EA61");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "Importo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "E8560DA5-A5AC-45AF-8CBC-90A7B106068F");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "Ordinativi");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "1A4FBF29-4437-4057-AB6A-62F87896FA27");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "Disponibilità");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "A065511C-6AA9-4F9A-AB7D-BDA808D5A65C");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "Data");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "0D1A96A4-9E2D-443E-8CC0-2B5F739D6088");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "Descrizione");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "96293C4A-240E-4DA5-BE7E-1C440DABEDF4");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "SEDE DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "404C1D57-4269-4413-8E5D-4BCC184E9BBF");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "NUMERO DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "05A81929-DAE2-4BC3-93A2-431AD7DC39B7");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "ANNO DEL");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "4B1B766D-5A7A-43E3-BEE0-701DB13A124B");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "UNITA PROPONENTE");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "F6FECA30-F1F7-475F-8A0D-338BDBFAA5A1");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "NUMERO PROPOSTA");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "2E0D5A2F-00AA-4E5D-AE5D-3CC545AF3CC6");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "ANNO PROPOSTA");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "9D912E75-83E6-4DC0-8EE1-1A9B846B2765");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "V livello");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.VIS_INTE10NORFIE);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "11BBF6B9-03ED-4494-AEFA-6A7B8DB0D995");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "Cod. Europeo");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, "Brief description of field content.");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, "D2F4C8A9-A6D8-44F1-8431-140B24607932");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, "Capitolo/Art.");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, "1E4A81E7-E6E0-4AC8-AA65-AD296FE0F0EB");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, "Accertamento");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, "3F10BAF9-575A-4191-8107-7CC38A458F26");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, "Delibera");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, "785B356A-BF44-4F6E-A933-474AAE397003");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, "Proposta");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ELENCOACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "4292DBB7-2E56-4EAC-AA48-FC89AD75724F");
    PAN_ELENCOACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "ESERCIZIO");
    PAN_ELENCOACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, "");
    PAN_ELENCOACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ELENCOACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
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
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CAPITOLO, PPQRY_ESEAOPE, "A.CAPITOLO", "ESEAOPECAPIT", 3, 16, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ARTICOLO, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ARTICOLO, PPQRY_ESEAOPE, "A.ARTICOLO", "ESEAOPEARTIC", 1, 2, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 120, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_LIST, "NUM. ACC");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROACC, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROACC, PPQRY_ESEAOPE, "A.NUMERO_ACC", "ESEOPENUMACC", 1, 5, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 172, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 4, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOACC, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOACC, PPQRY_ESEAOPE, "A.ANNO_ACC", "ESEOPEANNACC", 1, 4, 0, -13997);
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
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_INFOACCERTAM, PPQRY_ESEAOPE, "DECODE(A.NUMERO_ACC, to_number(NULL), NULL, 'I')", "ESEOPEINFACC", 5, 99, 0, -13997);
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
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DEBITORE, PPQRY_ESEAOPE, "B.DEBITORE", "ESEOPEACCDEB", 2, 15, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 300, 36, 200, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_LIST, " ");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 436, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 52);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_RAGIONSOCIAL, MyGlb.PANEL_FORM, " ");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_RAGIONSOCIAL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_RAGIONSOCIAL, PPQRY_ESEAOPE, "C.RAGIONE_SOCIALE_ESTESA", "ESOPBERASOEE", 5, 60, 0, -13997);
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
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_IMPORTO, PPQRY_ESEAOPE, "A.SALDO_INI + A.VARIAZIONI + A.VARIAZIONI_RES", "ESEAOPEIMPOR", 3, 28, 6, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 620, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_LIST, "Ordinativi");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 4, 1192, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ORDINATIVI, MyGlb.PANEL_FORM, "Ordinativi");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ORDINATIVI, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ORDINATIVI, PPQRY_ESEAOPE, "A.ORDINATIVI", "ESEAOPEORDIN", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 704, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 1216, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DISPONIBILIT, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DISPONIBILIT, PPQRY_ESEAOPE, "A.DISPONIBILITA", "ESEAOPEDISPO", 3, 14, 2, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 800, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DATA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DATA, PPQRY_ESEAOPE, "B.DATA_REG", "ESEOPEACDARE", 1, 7, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 864, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 220, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_DESCRIZIONE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_DESCRIZIONE, PPQRY_ESEAOPE, "B.DESCRIZIONE", "ESEOPEACCDES", 5, 140, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1104, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 4, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_SEDEDEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_SEDEDEL, PPQRY_ESEAOPE, "B.SEDE_DEL", "ESEOPEACSEDE", 5, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1140, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMERODEL, MyGlb.PANEL_FORM, "NUM. DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMERODEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMERODEL, PPQRY_ESEAOPE, "B.NUMERO_DEL", "ESEOPEACNUDE", 1, 6, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1188, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 4, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNODEL, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNODEL, PPQRY_ESEAOPE, "B.ANNO_DEL", "ESEOPEACANDE", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1224, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 112);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_LIST, "UNITA PROPONENTE");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 132, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_UNITAPROPONE, MyGlb.PANEL_FORM, "UN. PROP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_UNITAPROPONE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_UNITAPROPONE, PPQRY_ESEAOPE, "B.UNITA_PROPONENTE", "ESEOPEACUNPR", 5, 8, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1332, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 108);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_LIST, "NUM. PROP.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 124, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_NUMEROPROPOS, MyGlb.PANEL_FORM, "NUM. PRP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_NUMEROPROPOS, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_NUMEROPROPOS, PPQRY_ESEAOPE, "B.NUMERO_PROPOSTA", "ESEOPEACNUPR", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1372, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 96);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_LIST, "ANN. PRP.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 124, 124, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_ANNOPROPOSTA, MyGlb.PANEL_FORM, "ANN. PRP.");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_ANNOPROPOSTA, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ANNOPROPOSTA, PPQRY_ESEAOPE, "B.ANNO_PROPOSTA", "ESEOPEACANPR", 1, 4, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1408, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_LIST, "V livello");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 484, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 88);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODLIVELLO5, MyGlb.PANEL_FORM, "V livello");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODLIVELLO5, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODLIVELLO5, PPQRY_ESEAOPE, "B.COD_LIVELLO_5", "ESEOPACCOLI5", 3, 10, 0, -13997);
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1480, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_LIST, "Cod Eur.");
    PAN_ELENCOACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 4, 508, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOACCERT_CODICEEUROPE, MyGlb.PANEL_FORM, "Cod. Europeo");
    PAN_ELENCOACCERT.SetFieldPage(PFL_ELENCOACCERT_CODICEEUROPE, -1, -1);
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_CODICEEUROPE, PPQRY_ESEAOPE, "B.CODICE_EUROPEO", "ESEOPEACCOEU", 1, 1, 0, -13997);
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
    PAN_ELENCOACCERT.SetFieldPanel(PFL_ELENCOACCERT_ESERCIZIO, PPQRY_ESEAOPE, "A.ESERCIZIO", "ESEAOPEESERC", 1, 4, 0, -13997);
  }

  private void PAN_ELENCOACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOACCERT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELENCOACCERT.SetIMDB(IMDB, "PQRY_ESEAOPE", true);
    PAN_ELENCOACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "ESEA OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as ESEAOPECAPIT, ");
    SQL.append("  A.ARTICOLO as ESEAOPEARTIC, ");
    SQL.append("  A.ANNO_ACC as ESEOPEANNACC, ");
    SQL.append("  A.NUMERO_ACC as ESEOPENUMACC, ");
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
    SQL.append("  A.ORDINATIVI as ESEAOPEORDIN, ");
    SQL.append("  A.DISPONIBILITA as ESEAOPEDISPO, ");
    SQL.append("  A.ESERCIZIO as ESEAOPEESERC, ");
    SQL.append("  B.COD_LIVELLO_5 as ESEOPACCOLI5, ");
    SQL.append("  B.CODICE_EUROPEO as ESEOPEACCOEU ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ESEA_OPE A, ");
    SQL.append("  ACC B, ");
    SQL.append("  BEN C ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.ANNO_ACC = A.ANNO_ACC) ");
    SQL.append("and   (B.NUMERO_ACC = A.NUMERO_ACC) ");
    SQL.append("and   (A.FINANZIAMENTO = DECODE(~~TBL_PARAMETRI464.PARAMFINANZI~~, -1, A.FINANZIAMENTO, ~~TBL_PARAMETRI464.PARAMFINANZI~~)) ");
    SQL.append("and   (A.OPERA = DECODE(~~TBL_PARAMETRI464.PARAMOPERA~~, -1, A.OPERA, ~~TBL_PARAMETRI464.PARAMOPERA~~)) ");
    SQL.append("and   (A.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI464.PARAMARTICOL~~, -1), -1, A.ARTICOLO, ~~TBL_PARAMETRI464.PARAMARTICOL~~)) ");
    SQL.append("and   (A.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI464.PARAMCAPITOL~~, -1), -1, A.CAPITOLO, ~~TBL_PARAMETRI464.PARAMCAPITOL~~)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI464.PARAMESERCIZ~~) ");
    SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI464.PARAMDAL~~, B.D_DATA_REG)) ");
    SQL.append("and   ((A.ANNO_ACC = A.ESERCIZIO) OR (~~TBL_PARAMETRI464.PARASOLOCOMP~~ = 'NO')) ");
    SQL.append("and   (C.CODICE(+) = B.DEBITORE) ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC ");
    PAN_ELENCOACCERT.SetQuery(PPQRY_ESEAOPE, 5, SQL, -1, "");
    PAN_ELENCOACCERT.SetQueryDB(PPQRY_ESEAOPE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOACCERT.SetMasterTable(0, "ESEA_OPE");
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
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "FA9302FF-1FC9-4C61-802B-C05A50672C02");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "01D4C957-0921-4AE5-809F-39E39470D76F");
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
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCOMPETEN, PPQRY_PARAMETRI284, "A.PARASOLOCOMP", "PARASOLOCOMP", 5, 49, 0, -13997);
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
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI284, "A.PARAMDAL", "PARAMDAL", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI284", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI284, IMDBDef17.PQRY_PARAMETRI284_RS, IMDBDef6.TBL_PARAMETRI464);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCOMPETEN, IMDBDef6.FLD_PARAMETRI464_PARASOLOCOMP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef6.FLD_PARAMETRI464_PARAMDAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI464");
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
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, "1264C44B-88FC-4EA0-8384-B85BCB9EB9D3");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, "ELEACCBOOPAG");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, 17900, 400, 2100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, "AA3F57E8-8C73-402D-A37E-750B47CD1574");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_NUMEROPAGINA, BUK_LIBRELENACCE_SPAN_CPTSLEAEAFOP, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_CPTSLEAEAFOP, "11AAA9CE-0223-4F55-8C30-ECC1D36BEDC1");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_CPTSLEAEAFOP, "CPTSLEAEAFOP");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 800, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, "CCD7432F-FDF1-4A05-A8F2-4A67586C7704");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_PAGEHEADER, BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Accertamenti di Entrata", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, "285C639C-45D3-4A19-AE20-BDB3E1AE1CA1");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ACCERDIENTRA, "ACCERDIENTRA");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEBODY, 1000, 2000, 19000, 21700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, "C63E5291-0CEF-4742-8061-2488DBCD5431");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_LIBRELENACCE.InitMastroBox(BUK_LIBRELENACCE_MST_ELEACCBOOPAG, BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER, "411A6A3F-D9E7-4EB9-91E3-B20F78110B67");
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
      SQL.append("and   (A.OPERA = DECODE(NVL(~~TBL_PARAMETRI464.PARAMOPERA~~, -1), -1, A.OPERA, ~~TBL_PARAMETRI464.PARAMOPERA~~)) ");
      SQL.append("and   (A.FINANZIAMENTO = DECODE(NVL(~~TBL_PARAMETRI464.PARAMFINANZI~~, -1), -1, A.FINANZIAMENTO, ~~TBL_PARAMETRI464.PARAMFINANZI~~)) ");
      SQL.append("and   (A.ARTICOLO = DECODE(NVL(~~TBL_PARAMETRI464.PARAMARTICOL~~, -1), -1, A.ARTICOLO, ~~TBL_PARAMETRI464.PARAMARTICOL~~)) ");
      SQL.append("and   (A.CAPITOLO = DECODE(NVL(~~TBL_PARAMETRI464.PARAMCAPITOL~~, -1), -1, A.CAPITOLO, ~~TBL_PARAMETRI464.PARAMCAPITOL~~)) ");
      SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI464.PARAMESERCIZ~~) ");
      SQL.append("and   (B.D_DATA_REG >= NVL(~~TBL_PARAMETRI464.PARAMDAL~~, B.D_DATA_REG)) ");
      SQL.append("and   ((A.ANNO_ACC = A.ESERCIZIO) OR (~~TBL_PARAMETRI464.PARASOLOCOMP~~ = 'NO')) ");
      SQL.append("and   (C.CODICE(+) = B.DEBITORE) ");
      SQL.append("order by ");
      SQL.append("  A.CAPITOLO, ");
      SQL.append("  A.ARTICOLO, ");
      SQL.append("  A.ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC ");
      BUK_LIBRELENACCE.SetReportQuery(BUK_LIBRELENACCE_RPT_ELENACCEREPO, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "2301EB08-A476-4382-8728-0BC5E2962F68");
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
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPT_ELENACCEREPO, "C1943556-95CF-4480-B861-3BB1C5C64FDF");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPT_ELENACCEREPO, "ELENACCEREPO");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_REPORTHEADER, 300, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_REPORTHEADER, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_REPORTHEADER, "AB358385-64F0-400F-A318-7C94F457935E");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_PAGEHEADER, BUK_LIBRELENACCE_RPTBOX_PAGEHEADER);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_PAGEHEADER, "D9B43DEF-2DD1-43DD-9012-267485D8C0BC");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, 300, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 11075585, "VIACELESOPCA");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, "FACFD4D0-B96C-4819-9AE8-8CE91FE55AC1");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPECAGRHE, "ESEOPECAGRHE");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, 1600, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VIACELESOPAR");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, "68085852-5657-496F-BF73-49C30852069A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, "ESEOPEARGRHE");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, 7100, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, "206D3C53-17B6-47C6-AE5D-676D5E527D18");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_IMPORTHEADER, BUK_LIBRELENACCE_SPAN_IMPORTO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Importo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_IMPORTO, "69D81DF2-9932-4FD3-B9BF-3F96194A4E86");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, 9800, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, "F35C6037-8A63-40D4-B360-28CD54C41869");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, "ORDINAHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ORDINAHEADER, BUK_LIBRELENACCE_SPAN_ORDINATIVI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Ordinativi", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ORDINATIVI, "0DFFA6FC-7782-40C2-B1A1-6876F0A8FB22");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ORDINATIVI, "ORDINATIVI");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, 12500, 1100, 2500, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, "2D714B3F-5C46-43EA-A676-FE85CD0D3C4E");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DISPONHEADER, BUK_LIBRELENACCE_SPAN_DISPONIBILIT, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Disponibilità", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DISPONIBILIT, "952E3223-9C40-4E45-A290-8133F8CFE5CE");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, 2700, 1100, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, "55C5F3DF-B824-4D83-938B-4DE95B28DD58");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, "DATAREGHEADE");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DATAREGHEADE, BUK_LIBRELENACCE_SPAN_DATA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Data", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DATA, "BC0FC481-9D8C-40FC-935E-5C39B9EB8D1F");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DATA, "DATA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, 400, 1100, 2200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, "A757DB56-8EA5-480D-9563-803829EB2E64");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ACCERTHEADER, BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Accertamento", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, "645D8E92-A908-47AF-9EC0-0B0E543D4F98");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, 4400, 1100, 2600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, "3D70E087-BD76-49FE-8F21-50E3D602B1AC");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, "DELIBEHEADER");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DELIBEHEADER, BUK_LIBRELENACCE_SPAN_DELIBERA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Delibera", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_DELIBERA, "D11BBAC0-3074-444A-8CA0-E22AC6E97C30");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_DELIBERA, "DELIBERA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRHE, BUK_LIBRELENACCE_RPTBOX_VOCEPEG, 0, 200, 18800, 700, 0, 1, 1, MyGlb.VIS_HEADSENZBOR1, 983041, 393, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, "802A46EA-A035-4E8E-83D5-324DED1E99A8");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_VOCEPEG, BUK_LIBRELENACCE_SPAN_VOCEPEG, MyGlb.VIS_HEADSENZBOR1, 5, 212, 0, 271319425, "Voce P E G", "::VISACELVOPEG", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VOCEPEG, "39EF2C69-FE9A-484F-AC42-D09A2C416E97");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VOCEPEG, "VOCEPEG");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_DETAIL, "E52AE764-E469-4C84-BDB8-870DFF833BE2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_DETAIL, "DETAIL");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_IMPORTO, 7100, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_IMPORTO, "0C1C94C2-7699-44C7-B4EA-6004FF929718");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_IMPORTO, BUK_LIBRELENACCE_SPAN_VIAEIEAFOEAB, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "VISTA ACC UO UT SALDO INI + VISTA ACC UO UT VARIAZIONI + VISTA ACC UO UT VARIAZIONI RES", "::VISACCELEIMP", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIAEIEAFOEAB, "EF44695B-6F58-4B84-A962-84D9D20CBE6A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIAEIEAFOEAB, "VIAEIEAFOEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, 9800, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, "2ED5D18B-1B98-4B10-9166-EB4059E54608");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, "ORDINATIVI");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ORDINATIVI, BUK_LIBRELENACCE_SPAN_VAEEOOEAFOEA, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::VIACELESOPOR", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEEOOEAFOEA, "145E21A5-1F9D-484D-B490-4E506A5A7B48");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEEOOEAFOEA, "VAEEOOEAFOEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, 12500, 100, 2500, 400, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, "903B7DBD-D701-4F40-8FFE-4311C2E8C9EF");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DISPONIBILIT, BUK_LIBRELENACCE_SPAN_VAEEODEAFOEA, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "Brief description of field content.", "::VIACELESOPDI", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEEODEAFOEA, "31B8623E-3079-4586-ABD8-62D8B5FD3616");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEEODEAFOEA, "VAEEODEAFOEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DATAREG, 2700, 100, 1600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DATAREG, "4565DB3A-7062-49DA-9DDF-C7939EFCC183");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DATAREG, "DATAREG");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DATAREG, BUK_LIBRELENACCE_SPAN_VAEADDREAFOE, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::VIACELACDDDR", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEADDREAFOE, "9C2E0E46-F7C9-4860-892B-C937ABCE4F91");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEADDREAFOE, "VAEADDREAFOE");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, 400, 100, 2200, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, "2A59EA12-6D27-4A5F-9EC7-5B69A91EC9E3");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_ACCERTAMENTO, BUK_LIBRELENACCE_SPAN_VIAEAEAFOEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 198, 0, 271384705, "To String (VISTA ACC UO UT NUMERO ACC) +c barra con spazi +c To String (VISTA ACC UO UT ANNO ACC)", "::VISACCELEACC", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIAEAEAFOEAB, "E4C7A047-F01F-4E90-92F4-9D5380B09C74");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIAEAEAFOEAB, "VIAEAEAFOEAB");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAIL, BUK_LIBRELENACCE_RPTBOX_DELIBERA, 4400, 100, 2600, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DELIBERA, "CFD4F61E-0F34-4E7F-A89B-538660CE94A7");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DELIBERA, "DELIBERA");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DELIBERA, BUK_LIBRELENACCE_SPAN_VIAEDEAFOEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 103, 0, 271384705, "VISTA ACC UO UT SEDE DEL +c trattino con spazi +c To String (VISTA ACC UO UT NUMERO DEL) +c barra con spazi +c To String (VISTA ACC UO UT ANNO DEL)", "::VISACCELEDEL", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VIAEDEAFOEAB, "8357458A-8E49-401D-9E9D-091B929D0E0B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VIAEDEAFOEAB, "VIAEDEAFOEAB");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_DETAILDESCRI, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 11075585, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_DETAILDESCRI, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_DETAILDESCRI, "91819F90-F0AE-4AA6-84D9-29D2545C1F42");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_DETAILDESCRI, "DETAILDESCRI");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_DETAILDESCRI, BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, 2700, 0, 12300, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, "2F807DF4-3E0B-4A7C-A0A4-886DD55A21D9");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_DESCRIZIONE, BUK_LIBRELENACCE_SPAN_VAEADEAFOEAB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::VISACCELACD1", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_VAEADEAFOEAB, "74B42A32-C80E-438E-8A7F-2DA8B55340FD");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_VAEADEAFOEAB, "VAEADEAFOEAB");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VIACELESOPAR");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, "759D04F3-8BFD-42AA-9CF3-EC1C387A1A57");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, "ESEOPEARGRFO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, "198283F0-03EE-433F-8D6D-195BF3C51897");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, "SUMOFIMPORT1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT1, BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA, "71A92240-CCCA-4C22-8ACB-3848546BE51A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOAGFSVAEIEA, "EOAGFSVAEIEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, "9A374EEF-7CE7-4FFF-96F0-8B8EC6FC7FFD");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, "SUMOFORDINA1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA1, BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO, "61D41E54-7682-4CF0-B5AE-EABE1E47192B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOO, "EOAGFSVAEEOO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, "BC6DECA0-5341-426D-BEE3-A1A1685FA68F");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, "SUMOFDISPON1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON1, BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD, "74071F66-E896-4876-8D24-95D579AF9062");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOAGFSVAEEOD, "EOAGFSVAEEOD");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPEARGRFO, BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, "BC3EA77F-5FA1-4407-BEC1-006C9036DDF2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALEARTICO, BUK_LIBRELENACCE_SPAN_TOTALEARTICO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Articolo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALEARTICO, "04AB29B2-FFE8-4DBD-8790-17D78A55A243");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALEARTICO, "TOTALEARTICO");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "VIACELESOPCA");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, "BFE2DDC9-A99E-4829-A6D4-6AC1A27D1843");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, "ESEOPECAGRFO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, "B741B959-6372-4268-BD8B-5A5943ED0474");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, "SUMOFIMPORT2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORT2, BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA, "551653D7-0BF3-4858-B325-47DDF92A00B8");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOCGFSVAEIEA, "EOCGFSVAEIEA");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, "F291733E-D243-414F-A90F-5BD774FBEDBD");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, "SUMOFORDINA2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINA2, BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO, "2D37CA22-2097-4E62-ABA7-9DCE38C18598");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOO, "EOCGFSVAEEOO");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, "156A9651-74D0-4ADF-ACB1-3304281D4B5F");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, "SUMOFDISPON2");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPON2, BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD, "4D4BD2F5-8071-405C-AF64-766DD0AE82B7");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_EOCGFSVAEEOD, "EOCGFSVAEEOD");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_ESEOPECAGRFO, BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, "7944E10E-F433-4ECA-A674-97154C0A5EC2");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALECAPIT1, BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Capitolo", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, "D008762A-CD58-43BE-B6F8-EA8F9091CB48");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_TOTALECAPIT1, "TOTALECAPIT1");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_PAGEFOOTER, BUK_LIBRELENACCE_RPTBOX_PAGEFOOTER);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_PAGEFOOTER, "9577746B-4589-413D-8D4E-07FFAEDB03BF");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIBRELENACCE.InitSection(BUK_LIBRELENACCE_RPT_ELENACCEREPO, BUK_LIBRELENACCE_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRELENACCE.SetSectionRendersInto(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_PAGEBODY);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SEC_REPORTFOOTER, "80F8F2EA-50C8-4CCE-826D-F66EFA43451B");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, 7100, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, "232ED5B5-5FF9-4ED8-885A-A8DE5A022A22");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, "SUMOFIMPORTO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFIMPORTO, BUK_LIBRELENACCE_SPAN_RFSVAEIEAFOE, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEIEAFOE, "6FD15066-52E4-4951-8910-35CA6219A534");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEIEAFOE, "RFSVAEIEAFOE");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, 9800, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, "736039C0-0D19-46D7-9B4E-760C14393788");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, "SUMOFORDINAT");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFORDINAT, BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF, "8D3EBABC-42FF-420D-9EF0-893499807071");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEEOOEAF, "RFSVAEEOOEAF");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, 12500, 0, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, "9E0F3FD9-F67A-4DDC-913E-488B870828D9");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, "SUMOFDISPONI");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_SUMOFDISPONI, BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF, "435267FD-B998-4CF5-8346-BCC18C71312A");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_SPAN_RFSVAEEODEAF, "RFSVAEEODEAF");
    BUK_LIBRELENACCE.InitReportBox(BUK_LIBRELENACCE_SEC_REPORTFOOTER, BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, 4500, 0, 2300, 400, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, "4B5666FC-5DE7-4483-B0E0-B5357760098E");
    BUK_LIBRELENACCE.SetObjCode(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, "TOTALECAPITO");
    BUK_LIBRELENACCE.InitBoxSpan(BUK_LIBRELENACCE_RPTBOX_TOTALECAPITO, BUK_LIBRELENACCE_SPAN_TOTALECAPITO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale Generale", 1);
    BUK_LIBRELENACCE.SetRTCGuid(BUK_LIBRELENACCE_SPAN_TOTALECAPITO, "F679EF0D-7C2F-432A-8697-6F5394BE1104");
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
