// **********************************************
// Generazione Impegni Da Esigibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneImpegniDaEsigibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_DELIBERA = 0;
  private static int PFL_PARS_NUMERODEL = 1;
  private static int PFL_PARS_ANNODEL = 2;
  private static int PFL_PARS_ANNOESIGIBI1 = 3;
  private static int PFL_PARS_PROGRUO = 4;
  private static int PFL_PARS_ETICHSCELDEL = 5;
  private static int PFL_PARS_ETICHINFODEL = 6;

  private static int PPQRY_PARS98 = 0;

  private static int PPQRY_VARCOM = 1;


  IDPanel PAN_PARS;
  private static int PFL_VARIAZIONI_CAPITOLO1 = 0;
  private static int PFL_VARIAZIONI_ARTICOLO = 1;
  private static int PFL_VARIAZIONI_INFOCAP = 2;
  private static int PFL_VARIAZIONI_NUMEROIMP1 = 3;
  private static int PFL_VARIAZIONI_ANNOIMP = 4;
  private static int PFL_VARIAZIONI_INFOIMP = 5;
  private static int PFL_VARIAZIONI_IMPDESCRIZI1 = 6;
  private static int PFL_VARIAZIONI_ANNOESIGIBI2 = 7;
  private static int PFL_VARIAZIONI_IMPORTO1 = 8;
  private static int PFL_VARIAZIONI_TIPOVARIAZI1 = 9;
  private static int PFL_VARIAZIONI_TIPOVAR1 = 10;
  private static int PFL_VARIAZIONI_PROGRESSIVO = 11;

  private static int PPQRY_VARCOM8 = 0;

  private static int PPQRY_IMP = 1;
  private static int PPQRY_T54 = 2;


  IDPanel PAN_VARIAZIONI;
  private static int PFL_VARIAZIMPEGN_CAPCODICSTRU = 0;
  private static int PFL_VARIAZIMPEGN_CODIPIANCONT = 1;
  private static int PFL_VARIAZIMPEGN_CAPITOLO = 2;
  private static int PFL_VARIAZIMPEGN_VARIMPARTICO = 3;
  private static int PFL_VARIAZIMPEGN_INFOCAPITOLO = 4;
  private static int PFL_VARIAZIMPEGN_NUMEROIMP = 5;
  private static int PFL_VARIAZIMPEGN_VARIMANNOIMP = 6;
  private static int PFL_VARIAZIMPEGN_INFOIMPEGNO = 7;
  private static int PFL_VARIAZIMPEGN_IMPDESCRIZIO = 8;
  private static int PFL_VARIAZIMPEGN_ANNOESIGIBIL = 9;
  private static int PFL_VARIAZIMPEGN_ANNOENTRATA = 10;
  private static int PFL_VARIAZIMPEGN_IMPORTO = 11;
  private static int PFL_VARIAZIMPEGN_VARIMPPROGRE = 12;
  private static int PFL_VARIAZIMPEGN_IMPPROUNIORG = 13;
  private static int PFL_VARIAZIMPEGN_TIPOVAR = 14;
  private static int PFL_VARIAZIMPEGN_TIPOVARIAZIO = 15;

  private static int PPQRY_VARIAZIMPEG4 = 0;

  private static int PPQRY_T55 = 1;


  IDPanel PAN_VARIAZIMPEGN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS33(IMDB);
    Init_TBL_VARIAZIMPEG5(IMDB);
    //
    //
    Init_PQRY_PARS98(IMDB);
    Init_PQRY_PARS98_RS(IMDB);
    Init_PQRY_VARCOM8(IMDB);
    Init_PQRY_VARIAZIMPEG4(IMDB);
    Init_PQRY_VARIAZIMPEG4_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS33(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS33, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS33, "TBL_PARS33");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMEOGGPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, "NOMEOGGEVBVI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS33,IMDBDef4.FLD_PARS33_NOMEOGGEVBVI,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS33, 0);
  }

  private static void Init_TBL_VARIAZIMPEG5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_VARIAZIMPEG5, 16);
    IMDB.set_TblCode(IMDBDef4.TBL_VARIAZIMPEG5, "TBL_VARIAZIMPEG5");
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_CODICE_STRUTTURA, "CODICE_STRUTTURA");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_CODICE_STRUTTURA,5,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA, "ANNO_ESIGIBILITA");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGANNENT, "NOMOGGANNENT");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGANNENT,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef4.TBL_VARIAZIMPEG5,IMDBDef4.FLD_VARIAZIMPEG5_ANNO_DEL,1,4,0);
  }

  private static void Init_PQRY_PARS98(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS98, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS98, "PQRY_PARS98");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98,IMDBDef13.PQSL_PARS98_NOMEOGGPROUO,1,8,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARS98, 0);
  }

  private static void Init_PQRY_PARS98_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARS98_RS, 5);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARS98_RS, "PQRY_PARS98_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, "NOMEOGGEDELI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMEOGGEDELI,5,255,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARS98_RS,IMDBDef13.PQSL_PARS98_NOMEOGGPROUO,1,8,0);
  }

  private static void Init_PQRY_VARCOM8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VARCOM8, 10);
    IMDB.set_TblCode(IMDBDef13.PQRY_VARCOM8, "PQRY_VARCOM8");
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORDARTICO, "RECORDARTICO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORDARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_INFOCAP, "INFOCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_INFOCAP,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECVARANNIMP, "RECVARANNIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECVARANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORNUMEIMP, "RECORNUMEIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORNUMEIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_INFOIMP, "INFOIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_INFOIMP,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECOANNOESIG, "RECOANNOESIG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECOANNOESIG,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECORDIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECVARTIPVAR, "RECVARTIPVAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECVARTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECOVARCPROG, "RECOVARCPROG");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARCOM8,IMDBDef13.PQSL_VARCOM8_RECOVARCPROG,3,10,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VARCOM8, 0);
  }

  private static void Init_PQRY_VARIAZIMPEG4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VARIAZIMPEG4, 15);
    IMDB.set_TblCode(IMDBDef13.PQRY_VARIAZIMPEG4, "PQRY_VARIAZIMPEG4");
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCACOST, "NOMOGGCACOST");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCACOST,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARART, "NOMOGGVARART");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARART,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_INFOCAPITOLO, "INFOCAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_INFOCAPITOLO,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGNUMIMP, "NOMOGGNUMIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVAANIM, "NOMOGGVAANIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVAANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_INFOIMPEGNO, "INFOIMPEGNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_INFOIMPEGNO,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGIMPDES, "NOMOGGIMPDES");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGIMPDES,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARPRO, "NOMOGGVARPRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOOGIMPRUNOR, "NOOGIMPRUNOR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOOGIMPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNENT, "NOMOGGANNENT");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNENT,1,4,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_VARIAZIMPEG4, 0);
  }

  private static void Init_PQRY_VARIAZIMPEG4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 15);
    IMDB.set_TblCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS, "PQRY_VARIAZIMPEG4_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCACOST, "NOMOGGCACOST");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCACOST,5,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCOPICO, "NOMOGGCOPICO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGCOPICO,9,500,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARART, "NOMOGGVARART");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARART,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_INFOCAPITOLO, "INFOCAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_INFOCAPITOLO,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGNUMIMP, "NOMOGGNUMIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVAANIM, "NOMOGGVAANIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVAANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_INFOIMPEGNO, "INFOIMPEGNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_INFOIMPEGNO,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGIMPDES, "NOMOGGIMPDES");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGIMPDES,5,140,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGEIMPO, "NOMEOGGEIMPO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGEIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNESI, "NOMOGGANNESI");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNESI,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARPRO, "NOMOGGVARPRO");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARPRO,3,10,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOOGIMPRUNOR, "NOOGIMPRUNOR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOOGIMPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNENT, "NOMOGGANNENT");
    IMDB.SetFldParams(IMDBDef13.PQRY_VARIAZIMPEG4_RS,IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGANNENT,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneImpegniDaEsigibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneImpegniDaEsigibilita()
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
    FormIdx = MyGlb.FRM_GENEIMPDAESI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FAC5B2E1-2AE9-49E1-B4AA-A5251ADE37F2";
    ResModeW = 2;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 770;
    set_Caption(new IDVariant("Generazione Impegni da Esigibilità"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 744;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.11828;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 844;
    Frames[2].Height = 88;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 88;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 88-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "88B4AC47-E622-47CC-B4E5-4DB341C01FA5");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 296, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 2;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 844;
    Frames[3].Height = 656;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.493902;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 844;
    Frames[4].Height = 324;
    Frames[4].Caption = "Variazioni";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 324;
    PAN_VARIAZIONI = new IDPanel(w, this, 4, "PAN_VARIAZIONI");
    Frames[4].Content = PAN_VARIAZIONI;
    PAN_VARIAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIONI.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AC15464A-C014-452C-8E17-6C9E5015D946");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 952, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIONI.InitStatus = 1;
    PAN_VARIAZIONI_Init();
    PAN_VARIAZIONI_InitFields();
    PAN_VARIAZIONI_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 844;
    Frames[5].Height = 332;
    Frames[5].Caption = "Variazioni";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 332;
    PAN_VARIAZIMPEGN = new IDPanel(w, this, 5, "PAN_VARIAZIMPEGN");
    Frames[5].Content = PAN_VARIAZIMPEGN;
    PAN_VARIAZIMPEGN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAZIMPEGN.VS = MainFrm.VisualStyleList;
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "380AE1F6-7E05-4BC6-93FD-1EC3F5AF1F93");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1016, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAZIMPEGN.InitStatus = 1;
    PAN_VARIAZIMPEGN_Init();
    PAN_VARIAZIMPEGN_InitFields();
    PAN_VARIAZIMPEGN_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG26+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG114+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG26+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAIMPEG1+BaseCmdLinIdx)
      {
        GenerazioneImpegni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOANOMA1+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_ELEANOIMPREI, 0, this);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG161+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FA5+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG161+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_GENERAIMPEG3+BaseCmdLinIdx)
      {
        GenerazioneImpegni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOANOMA2+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_ELEANOIMPREI, 0, this);
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARS33, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEIMPDAESI_PARS98();
      }
      if (IMDB.TblModified(IMDBDef4.TBL_VARIAZIMPEG5, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef13.PQRY_PARS98, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEIMPDAESI_VARIAZIMPEG4();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_VARIAZIONI.UpdatePanel(MainFrm);
      PAN_VARIAZIMPEGN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_ETICHSCELDEL) {
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
    return (obj instanceof GenerazioneImpegniDaEsigibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneImpegniDaEsigibilita.class.getName() : (Glb.ClassWithPackage(GenerazioneImpegniDaEsigibilita.class) ? GenerazioneImpegniDaEsigibilita.class.getName().substring(GenerazioneImpegniDaEsigibilita.class.getPackage().getName().length() + 1) : GenerazioneImpegniDaEsigibilita.class.getName()));
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
      PAN_VARIAZIONI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIMPEGN.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIMPEGN.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_VARIAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_VARIAZIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(Caption(), (new IDVariant(" "))), (new IDVariant("da"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0).equals((new IDVariant("VB")))? new IDVariant("Variazioni Bilancio") : IMDB.Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0).equals((new IDVariant("VI")))? new IDVariant("Variazioni Impegni") :  new IDVariant())));
      if (IMDB.Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0).equals((new IDVariant("VI")), true))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_NUMERODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ANNODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIAZIONI.set_Visible((new IDVariant(0)).booleanValue());
        PAN_VARIAZIMPEGN.set_Visible((new IDVariant(-1)).booleanValue());
        RiempiIMDB();
      }
      else
      {
        PAN_VARIAZIONI.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_VARIAZIMPEGN.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEDELI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMOGGANNESI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGPROUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0, new IDVariant());
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_PARGENIMDAES)), true))
        {
          if (IMDB.Value(IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGDAELA, 0).equals((new IDVariant("SI")), true))
          {
            IDVariant I = new IDVariant(0,IDVariant.INTEGER);
            IDVariant J = new IDVariant(0,IDVariant.INTEGER);
            IDVariant K = new IDVariant(0,IDVariant.INTEGER);
            K = (new IDVariant(0));
            IDVariant N = new IDVariant(0,IDVariant.INTEGER);
            N = (new IDVariant(0));
            IDVariant v_ANOMALIE = new IDVariant(0,IDVariant.STRING);
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.GENERAIMPDAESIGIBILITAVIMP(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef13.PQRY_PAR125, IMDBDef13.PQSL_PAR125_NOMEOGGEDELI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), I, J, K, N, v_ANOMALIE, IMDB.Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0));
            if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            }
            else
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("Inseriti "));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("\n"))), S), ((I.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(I)), (new IDVariant(" "))), (new IDVariant("Impegni"))):(new IDVariant("nessun Impegno")))), (new IDVariant(", "))), ((K.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(K)), (new IDVariant(" "))), (new IDVariant("Variazioni Impegni"))):(new IDVariant("nessuna Variazione Impegno")))), (new IDVariant(", "))), ((J.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(J)), (new IDVariant(" "))), (new IDVariant("SubImpegni"))):(new IDVariant("nessun Sub-Impegno")))), (new IDVariant(" e "))), ((N.compareTo((new IDVariant(0)), true)>0)?IDL.Add(IDL.Add(IDL.Add((new IDVariant("nr. ")), IDL.ToString(N)), (new IDVariant(" "))), (new IDVariant("Variazioni Sub-Impegni"))):(new IDVariant("nessuna Variazione Sub-Impegno")))), ((v_ANOMALIE.equals((new IDVariant())))?(new IDVariant("")):IDL.Add(IDL.Add((new IDVariant("\n")), (new IDVariant("\n"))), (new IDVariant("Controllare le Anomalie")))))); 
              if (IMDB.Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0).equals((new IDVariant("VB")), true))
              {
                PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
              }
              else
              {
                RiempiIMDB();
              }
            }
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_PARS_DELIBERA)), true) || Column.equals((new IDVariant(PFL_PARS_NUMERODEL)), true) || Column.equals((new IDVariant(PFL_PARS_ANNODEL)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0))))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0, IDL.Upper(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Delibera inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "ParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pars On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARS);
      // 
      // Pars On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, 0))))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "ParsOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Scelta Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARAMFILTRO, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARAANNOESIG, 0, IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNESI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI333, IMDBDef1.FLD_PARAMETRI333_PARPROUNIORG, 0, IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGPROUO, 0));
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "EtichettaSceltaDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Info Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0));
      MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "EtichettaInfoDel", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Variazioni On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_VARIAZIONI.Freezed = (new IDVariant(0)).booleanValue();
        PAN_VARIAZIONI_InitQueries();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_VARIAZIONI.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "VariazioniOnCommand", _e);
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
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_TIPOVARIAZI1,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_TIPOVARIAZI1))).stringValue()); 
      PAN_VARIAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIONI_IMPDESCRIZI1,(new IDVariant(PAN_VARIAZIONI.FieldText(PFL_VARIAZIONI_IMPDESCRIZI1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "VariazioniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Generazione Impegni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int GenerazioneImpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;
    IDCachedRowSet C14;

    try
    {
      TransCount = 0;
      // 
      // Generazione Impegni Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("delete from WRK_GEN_IMP_DAESIG ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Nessun record selezionato"));
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
      if (IMDB.Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0).equals((new IDVariant("VB")), true))
      {
        if (PAN_VARIAZIONI.ShowMultipleSel())
        {
          C4 = PAN_VARIAZIONI.MasterRS();
          if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
          if (!C4.Bof()) PAN_VARIAZIONI.GotoFirst();
          while (!PAN_VARIAZIONI.RSEOF())
          {
            if (PAN_VARIAZIONI.IsRowSelected(I.intValue()))
            {
              v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
              SQL = new StringBuffer();
              SQL.append("insert into WRK_GEN_IMP_DAESIG ");
              SQL.append("( ");
              SQL.append("  PROGR_SESSIONE, ");
              SQL.append("  PROGRESSIVO_VARIAZIONE, ");
              SQL.append("  DATA_INSERIMENTO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(C4.Get("RECOVARCPROG"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ) ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            I = IDL.Add(I, (new IDVariant(1)));
            PAN_VARIAZIONI.GotoNext();
          }
          if (CurPos>0) C4.absolute(CurPos);
          if (v_COUNT.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECOVARCPROG, 0)))
          {
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("insert into WRK_GEN_IMP_DAESIG ");
            SQL.append("( ");
            SQL.append("  PROGR_SESSIONE, ");
            SQL.append("  PROGRESSIVO_VARIAZIONE, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECOVARCPROG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
        }
      }
      else
      {
        if (PAN_VARIAZIMPEGN.ShowMultipleSel())
        {
          IMDB.TblMoveFirst (IMDBDef13.PQRY_VARIAZIMPEG4_RS, 0);
          while (!IMDB.Eof(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 0))
          {
            if (PAN_VARIAZIMPEGN.IsRowSelected(I.intValue()))
            {
              v_COUNT = IDL.Add(v_COUNT, (new IDVariant(1)));
              SQL = new StringBuffer();
              SQL.append("insert into WRK_GEN_IMP_DAESIG ");
              SQL.append("( ");
              SQL.append("  PROGR_SESSIONE, ");
              SQL.append("  PROGRESSIVO_VARIAZIONE, ");
              SQL.append("  DATA_INSERIMENTO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4_RS, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ) ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            I = IDL.Add(I, (new IDVariant(1)));
            IMDB.TblMoveNext(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 0);
          }
          if (v_COUNT.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARPRO, 0)))
          {
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("insert into WRK_GEN_IMP_DAESIG ");
            SQL.append("( ");
            SQL.append("  PROGR_SESSIONE, ");
            SQL.append("  PROGRESSIVO_VARIAZIONE, ");
            SQL.append("  DATA_INSERIMENTO ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
        }
      }
      IMDB.set_Value(IMDBDef4.TBL_PAR116, IMDBDef4.FLD_PAR116_NOMEOGGEVBVI, 0, IMDB.Value(IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEVBVI, 0));
      MainFrm.Show(MyGlb.FRM_PARGENIMDAES, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "GenerazioneImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Cap Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECORDCAPITO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECORDARTICO, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECORDCAPITO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECORDARTICO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Imp
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Imp Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECORNUMEIMP, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECVARANNIMP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECORNUMEIMP, 0));
      if (IMDB.Value(IMDBDef13.PQRY_VARCOM8, IMDBDef13.PQSL_VARCOM8_RECVARANNIMP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
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
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "InfoImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Riempi IMDB
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int RiempiIMDB ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Riempi IMDB Body
      // Corpo Procedura
      // 
      RIEMPIIMDB_VARIIMPEDELE();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CAPITOLO as VARIMPCAPITO, ");
      SQL.append("  A.ARTICOLO as VARIMPARTICO, ");
      SQL.append("  A.NUMERO_IMP as VARIMNUMEIMP, ");
      SQL.append("  A.ANNO_IMP as VARIMANNOIMP, ");
      SQL.append("  B.DESCRIZIONE as IMPDESCRIZIO, ");
      SQL.append("  ABS(A.IMPORTO) as VARIMPIMPORT, ");
      SQL.append("  A.ANNO_ESIGIBILITA as VARIANNOESIG, ");
      SQL.append("  A.PROGRESSIVO as VARIMPPROGRE, ");
      SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as IMPPROUNIORG, ");
      SQL.append("  A.TIPO_VAR as VARIMTIPOVAR, ");
      SQL.append("  A.ANNO_ENTRATA as VARIANNOENTR ");
      SQL.append("from ");
      SQL.append("  VARIMP A, ");
      SQL.append("  IMP B, ");
      SQL.append("  CAP C, ");
      SQL.append("  T55 D ");
      SQL.append("where (D.CODICE = A.TIPO_VAR) ");
      SQL.append("and   (D.MOTIVO IN ('EC', 'EA')) ");
      SQL.append("and   (C.ESERCIZIO = A.ANNO_VAR) ");
      SQL.append("and   (C.E_S = 'S') ");
      SQL.append("and   (C.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (C.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (B.ANNO_IMP = A.ANNO_IMP) ");
      SQL.append("and   (B.NUMERO_IMP = A.NUMERO_IMP) ");
      SQL.append("and   ((A.IMP_GENERATO IS NULL)) ");
      SQL.append("and   (A.IMPORTO < 0) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  E.CAPITOLO, ");
      SQL.append("  E.ARTICOLO, ");
      SQL.append("  E.NUMERO_IMP, ");
      SQL.append("  E.ANNO_IMP, ");
      SQL.append("  F.DESCRIZIONE, ");
      SQL.append("  ABS(E.IMPORTO), ");
      SQL.append("  E.ANNO_ESIGIBILITA, ");
      SQL.append("  E.PROGRESSIVO, ");
      SQL.append("  F.PROGR_UNITA_ORGANIZZATIVA, ");
      SQL.append("  E.TIPO_VAR, ");
      SQL.append("  E.ANNO_ENTRATA ");
      SQL.append("from ");
      SQL.append("  VARIMP E, ");
      SQL.append("  IMP F, ");
      SQL.append("  CAP G ");
      SQL.append("where (G.ESERCIZIO = E.ANNO_VAR) ");
      SQL.append("and   (G.E_S = 'S') ");
      SQL.append("and   (G.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (G.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (F.ANNO_IMP = E.ANNO_IMP) ");
      SQL.append("and   (F.NUMERO_IMP = E.NUMERO_IMP) ");
      SQL.append("and   ((E.IMP_GENERATO IS NULL)) ");
      SQL.append("and   (E.IMPORTO < 0) ");
      SQL.append("and   (E.ANNO_ESIGIBILITA < E.ANNO_IMP) ");
      SQL.append("and   (NOT ((F.ANNO_IMP_PROVENIENZA IS NULL))) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      C2.setColUnbound(6,true);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IDVariant v_VVARCOMPROGR = new IDVariant(0,IDVariant.DECIMAL);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.PROGRESSIVO) as MINVARCOPROG ");
        SQL.append("from ");
        SQL.append("  VARCOM A ");
        SQL.append("where (A.PROGRESSIVO_VARIMP = " + IDL.CSql(C2.Get("VARIMPPROGRE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVARCOMPROGR = QV.Get("MINVARCOPROG", IDVariant.DECIMAL) ;
        }
        QV.Close();
        IDVariant v_VVARCANNODEL = null;
        v_VVARCANNODEL = (new IDVariant());
        IDVariant v_VVARCNUMEDEL = null;
        v_VVARCNUMEDEL = (new IDVariant());
        IDVariant v_VVARCSEDEDEL = null;
        v_VVARCSEDEDEL = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.ANNO_DEL as VARCOANNODEL, ");
        SQL.append("  A.NUMERO_DEL as VARCONUMEDEL, ");
        SQL.append("  A.SEDE_DEL as VARCOSEDEDEL ");
        SQL.append("from ");
        SQL.append("  VARCOM A ");
        SQL.append("where (A.PROGRESSIVO = " + IDL.CSql(v_VVARCOMPROGR, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VVARCANNODEL = QV.Get("VARCOANNODEL", IDVariant.INTEGER) ;
          v_VVARCNUMEDEL = QV.Get("VARCONUMEDEL", IDVariant.INTEGER) ;
          v_VVARCSEDEDEL = QV.Get("VARCOSEDEDEL", IDVariant.STRING) ;
        }
        QV.Close();
        RIEMPIIMDB_VARIMPINSINT(C2.Get("VARIMPCAPITO"), C2.Get("VARIMPARTICO"), C2.Get("VARIMNUMEIMP"), C2.Get("VARIMANNOIMP"), C2.Get("IMPDESCRIZIO"), C2.Get("VARIMPIMPORT"), C2.Get("VARIMPPROGRE"), C2.Get("VARIANNOESIG"), C2.Get("IMPPROUNIORG"), C2.Get("VARIMTIPOVAR"), C2.Get("VARIANNOENTR"), v_VVARCSEDEDEL, v_VVARCNUMEDEL, v_VVARCANNODEL);
        C2.MoveNext();
      }
      C2.Close();
      PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "RiempiIMDB", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Variazioni Impegni: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void RIEMPIIMDB_VARIIMPEDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef4.TBL_VARIAZIMPEG5);
  }

  // **********************************************************************
  // Variazioni Impegni: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void RIEMPIIMDB_VARIMPINSINT(IDVariant C2_VARIMPCAPITO, IDVariant C2_VARIMPARTICO, IDVariant C2_VARIMNUMEIMP, IDVariant C2_VARIMANNOIMP, IDVariant C2_IMPDESCRIZIO, IDVariant C2_VARIMPIMPORT, IDVariant C2_VARIMPPROGRE, IDVariant C2_VARIANNOESIG, IDVariant C2_IMPPROUNIORG, IDVariant C2_VARIMTIPOVAR, IDVariant C2_VARIANNOENTR, IDVariant v_VVARCSEDEDEL, IDVariant v_VVARCNUMEDEL, IDVariant v_VVARCANNODEL) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef4.TBL_VARIAZIMPEG5, 0);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_CAPITOLO, 0, C2_VARIMPCAPITO);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ARTICOLO, 0, C2_VARIMPARTICO);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_IMP, 0, C2_VARIMNUMEIMP);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_IMP, 0, C2_VARIMANNOIMP);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_DESCRIZIONE, 0, C2_IMPDESCRIZIO);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_IMPORTO, 0, C2_VARIMPIMPORT);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_PROGRESSIVO, 0, C2_VARIMPPROGRE);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA, 0, C2_VARIANNOESIG);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA, 0, C2_IMPPROUNIORG);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGTIPVAR, 0, C2_VARIMTIPOVAR);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGANNENT, 0, C2_VARIANNOENTR);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_SEDE_DEL, 0, v_VVARCSEDEDEL);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_DEL, 0, v_VVARCNUMEDEL);
    IMDB.set_Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_DEL, 0, v_VVARCANNODEL);
  }

  // **********************************************************************
  // Variazioni Impegni On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAZIMPEGN);
      // 
      // Variazioni Impegni On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_TIPOVARIAZIO,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_TIPOVARIAZIO))).stringValue()); 
      PAN_VARIAZIMPEGN.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAZIMPEGN_IMPDESCRIZIO,(new IDVariant(PAN_VARIAZIMPEGN.FieldText(PFL_VARIAZIMPEGN_IMPDESCRIZIO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "VariazioniImpegniOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni Impegni On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Impegni On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_VARIAZIMPEGN.Freezed = (new IDVariant(0)).booleanValue();
        PAN_VARIAZIMPEGN_InitQueries();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_VARIAZIMPEGN.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "VariazioniImpegniOnCommand", _e);
    }
  }

  // **********************************************************************
  // Info Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGECAPI, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVARART, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGNUMIMP, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVAANIM, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGNUMIMP, 0));
      if (IMDB.Value(IMDBDef13.PQRY_VARIAZIMPEG4, IMDBDef13.PQSL_VARIAZIMPEG4_NOMOGGVAANIM, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFORES")));
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
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaEsigibilita", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENEIMPDAESI_PARS98() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARS98_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARS33, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARS33, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARS98_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARS98_RS, 0, IMDBDef4.TBL_PARS33, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS98_RS, 0, 0, IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGEDELI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS98_RS, 1, 0, IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS98_RS, 2, 0, IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMOGGANNDEL, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS98_RS, 3, 0, IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMOGGANNESI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARS98_RS, 4, 0, IMDBDef4.TBL_PARS33, IMDBDef4.FLD_PARS33_NOMEOGGPROUO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARS33, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARS33, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARS33, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARS98_RS, 0);
  }

  // **********************************************************************
  // Variazioni Impegni
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENEIMPDAESI_VARIAZIMPEG4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_VARIAZIMPEG4_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_VARIAZIMPEG5, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_VARIAZIMPEG5, 0))
    {
      if (IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA, 0).equals(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNESI, 0),IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA, 0)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA, 0),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGPROUO, 0),IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA, 0),(new IDVariant(-1)))), true))
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_SEDE_DEL, 0),(new IDVariant("X"))).equals(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMEOGGEDELI, 0),IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_SEDE_DEL, 0),(new IDVariant("X")))), true))
          {
            if (IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_DEL, 0),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGNUMDEL, 0),IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_DEL, 0),(new IDVariant(-1)))), true))
            {
              if (IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_DEL, 0),(new IDVariant(-1))).equals(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARS98, IMDBDef13.PQSL_PARS98_NOMOGGANNDEL, 0),IDL.NullValue(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_DEL, 0),(new IDVariant(-1)))), true))
              {
                IMDB.TblAddNew(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 0);
                IMDB.TblLinkRow(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 0, IMDBDef4.TBL_VARIAZIMPEG5, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 0, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_CODICE_STRUTTURA, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 1, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGCOPICO, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 2, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_CAPITOLO, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 3, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ARTICOLO, 0);
                IMDB.set_Value(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 4, 0, ((!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_CAPITOLO, 0))))?(new IDVariant("I")):(new IDVariant())));
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 5, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_IMP, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 6, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_IMP, 0);
                IMDB.set_Value(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 7, 0, ((!(IDL.IsNull(IMDB.Value(IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_IMP, 0))))?(new IDVariant("I")):(new IDVariant())));
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 8, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_DESCRIZIONE, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 9, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_IMPORTO, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 10, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 11, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_PROGRESSIVO, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 12, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 13, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGTIPVAR, 0);
                IMDB.TblLinkField(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 14, 0, IMDBDef4.TBL_VARIAZIMPEG5, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGANNENT, 0);
              }
            }
          }
        }
      }
      IMDB.TblMoveNext(IMDBDef4.TBL_VARIAZIMPEG5, 0);
      if (IMDB.Eof(IMDBDef4.TBL_VARIAZIMPEG5, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_VARIAZIMPEG5, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef13.PQRY_VARIAZIMPEG4_RS);
    IMDB.TblSortBy(IMDBDef13.PQRY_VARIAZIMPEG4_RS,2,true);
    IMDB.TblSortBy(IMDBDef13.PQRY_VARIAZIMPEG4_RS,3,true);
    IMDB.TblSortBy(IMDBDef13.PQRY_VARIAZIMPEG4_RS,6,true);
    IMDB.TblSortBy(IMDBDef13.PQRY_VARIAZIMPEG4_RS,5,true);
    IMDB.TblSortBy(IMDBDef13.PQRY_VARIAZIMPEG4_RS,10,true);
    IMDB.TblStartSort(IMDBDef13.PQRY_VARIAZIMPEG4_RS);
    IMDB.TblMoveFirst(IMDBDef13.PQRY_VARIAZIMPEG4_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICHSCELDEL)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaDel();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHINFODEL)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfoDel();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
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
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOCAP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIONI_INFOIMP)
    {
      this.IdxPanelActived = this.PAN_VARIAZIONI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImp();
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
  private void PAN_VARIAZIMPEGN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAZIMPEGN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAZIMPEGN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAZIMPEGN, Cancel);
    // Stub
  }

  private void PAN_VARIAZIMPEGN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_INFOCAPITOLO)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAZIMPEGN_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_VARIAZIMPEGN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAZIMPEGN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAZIMPEGN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAZIMPEGN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "D8D23687-9527-451D-898E-0D55EFB601AC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "Delibera");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "D533FF13-6BAC-412C-80AB-AA353E5F99EC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "-");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "D3E4EC87-2B77-42DC-B629-E4DCF1CBA89A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "811ED045-1470-45D5-8311-EAD6A281E029");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "Anno Esigibilità");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "D03923A1-B49C-418D-A110-BD575E68F01C");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "DFA4A3D0-99ED-419B-8579-2C05494787F3");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, "D6FB7CB0-8B90-484E-8A9E-6490C2D6F452");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, 0, "info.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 24, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 112);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARS.SetFieldPage(PFL_PARS_DELIBERA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DELIBERA, PPQRY_PARS98, "A.NOMEOGGEDELI", "NOMEOGGEDELI", 5, 255, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_LIST, "-");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 184, 4, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_NUMERODEL, MyGlb.PANEL_FORM, "-");
    PAN_PARS.SetFieldPage(PFL_PARS_NUMERODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_NUMERODEL, PPQRY_PARS98, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 6, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 248, 4, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNODEL, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNODEL, PPQRY_PARS98, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 96);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_LIST, "Ann. Esig.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 24, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 112);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ANNOESIGIBI1, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_PARS.SetFieldPage(PFL_PARS_ANNOESIGIBI1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ANNOESIGIBI1, PPQRY_PARS98, "A.NOMOGGANNESI", "NOMOGGANNESI", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 16, 52, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_PROGRUO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PROGRUO, PPQRY_PARS98, "A.NOMEOGGPROUO", "NOMEOGGPROUO", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 304, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 304, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHSCELDEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHSCELDEL, -1, "", "ETICHSCELDEL", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 312, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 324, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHINFODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHINFODEL, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHINFODEL, -1, "", "ETICHINFODEL", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VARPROUNIORG, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCUO ");
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("and   (~~TBL_PARS33.NOMEOGGEVBVI~~ = 'VB') ");
    SQL.append("group by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SUM(1), ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  VARIMP B, ");
    SQL.append("  IMP C ");
    SQL.append("where (C.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (C.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (NOT ((C.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("and   (~~TBL_PARS33.NOMEOGGEVBVI~~ = 'VI') ");
    SQL.append("group by ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("order by 3, 1 ");
    PAN_PARS.SetQuery(PPQRY_VARCOM, 0, SQL, PFL_PARS_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as VARPROUNIORG, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCUO ");
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    SQL.append("where (A.ESERCIZIO >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NOT ((A.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("and   (~~TBL_PARS33.NOMEOGGEVBVI~~ = 'VB') ");
    SQL.append("group by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SUM(1), ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("from ");
    SQL.append("  VARIMP B, ");
    SQL.append("  IMP C ");
    SQL.append("where (C.ANNO_IMP = B.ANNO_IMP) ");
    SQL.append("and   (C.NUMERO_IMP = B.NUMERO_IMP) ");
    SQL.append("and   (NOT ((C.PROGR_UNITA_ORGANIZZATIVA IS NULL))) ");
    SQL.append("and   (~~TBL_PARS33.NOMEOGGEVBVI~~ = 'VI') ");
    SQL.append("group by ");
    SQL.append("  C.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(C.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("order by 3, 1 ");
    PAN_PARS.SetQuery(PPQRY_VARCOM, 1, SQL, PFL_PARS_PROGRUO, "");
    PAN_PARS.SetQueryDB(PPQRY_VARCOM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS98", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS98, IMDBDef13.PQRY_PARS98_RS, IMDBDef4.TBL_PARS33);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DELIBERA, IMDBDef4.FLD_PARS33_NOMEOGGEDELI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_NUMERODEL, IMDBDef4.FLD_PARS33_NOMOGGNUMDEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNODEL, IMDBDef4.FLD_PARS33_NOMOGGANNDEL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ANNOESIGIBI1, IMDBDef4.FLD_PARS33_NOMOGGANNESI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PROGRUO, IMDBDef4.FLD_PARS33_NOMEOGGPROUO);
    PAN_PARS.SetMasterTable(0, "PARS33");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VARIAZIONI_Init()
  {

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "A14F18C0-C4A8-49E2-9CFF-698075A62EA2");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "Capitolo/Art.");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "D6C497DB-D179-4929-B99A-DC545F01A9F1");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.VIS_HEADNOBORLEF);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, "D01733DC-72AA-47EC-BF4B-C3D0054FA57F");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, "B94CA496-19C3-49BB-A63E-4AA0FD96B124");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, "Impegno");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "67D5D2EB-DD9D-4CBC-9BD6-1BF2423B69D3");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.VIS_HEADNOBORLEF);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, "F8D0AAFC-E40A-4963-A7FD-119FF1F3B7B0");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, " ");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, "2B032C48-2574-458F-873B-503F18AEB7B3");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, "Descrizione Impegno");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, "Descrizione Impegno");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, "0FF983C1-48D3-4BD4-A3C5-C1EB3F4D6B74");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, "Anno Esigibilità");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, "FB9FCFC2-1749-4DE9-B1A7-99B418E3681D");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, "Importo");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, "078EC45B-E77A-4D66-9F32-E2053CBCB205");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, "Tipo Variazione");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, "F90C496F-613B-4760-9924-59427818B6CA");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, "TIPO VAR");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.VIS_NONNULLAFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, 0, -1);
    PAN_VARIAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "6664DA9E-0115-4911-B3A9-F608CB78F605");
    PAN_VARIAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "PROGRESSIVO");
    PAN_VARIAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, "");
    PAN_VARIAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_VARIAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_CAPITOLO1, MyGlb.PANEL_FORM, "Capit. Art");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_CAPITOLO1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_CAPITOLO1, PPQRY_VARCOM8, "A.CAPITOLO", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 120, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ARTICOLO, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ARTICOLO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ARTICOLO, PPQRY_VARCOM8, "A.ARTICOLO", "RECORDARTICO", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, 144, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, 4, 52, 564, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, 56);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOCAP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOCAP, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFOCAP, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOCAP, PPQRY_VARCOM8, "CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END", "INFOCAP", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOCAP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOCAP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOCAP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_LIST, 168, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_LIST, "Impegno");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_FORM, 4, 76, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_NUMEROIMP1, MyGlb.PANEL_FORM, "Impegno");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_NUMEROIMP1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_NUMEROIMP1, PPQRY_VARCOM8, "A.NUMERO_IMP", "RECORNUMEIMP", 1, 5, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 228, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 4, 100, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOIMP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOIMP, PPQRY_VARCOM8, "A.ANNO_IMP", "RECVARANNIMP", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, 268, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, 4, 124, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, 60);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_INFOIMP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_INFOIMP, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_INFOIMP, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_INFOIMP, PPQRY_VARCOM8, "CASE WHEN NOT ((A.NUMERO_IMP IS NULL)) THEN 'I' ELSE NULL END", "INFOIMP", 5, 99, 0, -13997);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOIMP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOIMP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIONI.SetValueListItem(PFL_VARIAZIONI_INFOIMP, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_LIST, 292, 36, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_LIST, "Descrizione Impegno");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_FORM, 4, 196, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPDESCRIZI1, MyGlb.PANEL_FORM, "Descrizione Impegno");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPDESCRIZI1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPDESCRIZI1, PPQRY_IMP, "A.DESCRIZIONE", "IMPDESCRIZIO", 5, 140, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, 472, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, 4, 148, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, 112);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_ANNOESIGIBI2, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_ANNOESIGIBI2, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_ANNOESIGIBI2, PPQRY_VARCOM8, "A.ANNO_ESIGIBILITA", "RECOANNOESIG", 1, 4, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, 536, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, 4, 172, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_IMPORTO1, -1, -1);
    PAN_VARIAZIONI.SetFieldUnbound(PFL_VARIAZIONI_IMPORTO1, true);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_IMPORTO1, PPQRY_VARCOM8, "ABS(A.IMPORTO)", "RECORDIMPORT", 3, 28, 6, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_LIST, 644, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_LIST, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_FORM, 4, 232, 440, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_FORM, 76);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVARIAZI1, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVARIAZI1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVARIAZI1, PPQRY_T54, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "T54CODICE", 5, 142, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_LIST, "TIPO VAR");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, 4, 196, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, 64);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_TIPOVAR1, MyGlb.PANEL_FORM, "TIPO VAR");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_TIPOVAR1, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_TIPOVAR1, PPQRY_VARCOM8, "A.TIPO_VAR", "RECVARTIPVAR", 1, 2, 0, -13997);
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGRESSIVO");
    PAN_VARIAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 268, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIONI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_VARIAZIONI.SetFieldPage(PFL_VARIAZIONI_PROGRESSIVO, -1, -1);
    PAN_VARIAZIONI.SetFieldPanel(PFL_VARIAZIONI_PROGRESSIVO, PPQRY_VARCOM8, "A.PROGRESSIVO", "RECOVARCPROG", 3, 10, 0, -13997);
  }

  private void PAN_VARIAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIONI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as IMPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  IMP A ");
    SQL.append("where (A.ANNO_IMP = ~~RECVARANNIMP~~) ");
    SQL.append("and   (A.NUMERO_IMP = ~~RECORNUMEIMP~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_IMP, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_IMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_IMP, "IMP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T54CODICE ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~RECVARTIPVAR~~) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_T54, 0, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(PPQRY_T54, "T54");
    PAN_VARIAZIONI.SetIMDB(IMDB, "PQRY_VARCOM8", true);
    PAN_VARIAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as RECORDCAPITO, ");
    SQL.append("  A.ARTICOLO as RECORDARTICO, ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END as INFOCAP, ");
    SQL.append("  A.ANNO_IMP as RECVARANNIMP, ");
    SQL.append("  A.NUMERO_IMP as RECORNUMEIMP, ");
    SQL.append("  CASE WHEN NOT ((A.NUMERO_IMP IS NULL)) THEN 'I' ELSE NULL END as INFOIMP, ");
    SQL.append("  A.ANNO_ESIGIBILITA as RECOANNOESIG, ");
    SQL.append("  ABS(A.IMPORTO) as RECORDIMPORT, ");
    SQL.append("  A.TIPO_VAR as RECVARTIPVAR, ");
    SQL.append("  A.PROGRESSIVO as RECOVARCPROG ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM8, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VARCOM A ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM8, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NOT ((A.ANNO_ESIGIBILITA IS NULL))) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (NOT ((A.ANNO_IMP IS NULL)) AND NOT ((A.NUMERO_IMP IS NULL))) ");
    SQL.append("and   (NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.CODICE ");
    SQL.append("from ");
    SQL.append("  VISTA_RICLASSIFICAZIONI_CAP B ");
    SQL.append("where (B.E_S = A.E_S) ");
    SQL.append("and   (B.ESERCIZIO = A.ESERCIZIO) ");
    SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
    SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
    SQL.append("and   ((A.ESERCIZIO BETWEEN B.ESERCIZIO_INIZIO AND B.ESERCIZIO_SCADENZA)) ");
    SQL.append("and   (B.CODICE = DECODE(B.TITOLO, 1, A_GET_COD_FPV_DA_TIPI_RICL(A.ESERCIZIO,'1'), DECODE(B.TITOLO, 2, A_GET_COD_FPV_DA_TIPI_RICL(A.ESERCIZIO,'2'), -1))) ");
    SQL.append("and   (B.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append(")))) ");
    SQL.append("and   (A.ANNO_IMP <> A.ESERCIZIO AND NOT (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  VARIMP C ");
    SQL.append("where (C.PROGRESSIVO = A.PROGRESSIVO_VARIMP) ");
    SQL.append("and   (C.IMP_GENERATO = 'SI') ");
    SQL.append(")))) ");
    SQL.append("and   (A.ANNO_ESIGIBILITA = NVL(~~PQRY_PARS98.NOMOGGANNESI~~, A.ANNO_ESIGIBILITA)) ");
    SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~PQRY_PARS98.NOMEOGGPROUO~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
    SQL.append("and   (NVL(A.ANNO_DEL, -1) = NVL(~~PQRY_PARS98.NOMOGGANNDEL~~, NVL(A.ANNO_DEL, -1))) ");
    SQL.append("and   (NVL(A.NUMERO_DEL, -1) = NVL(~~PQRY_PARS98.NOMOGGNUMDEL~~, NVL(A.NUMERO_DEL, -1))) ");
    SQL.append("and   (NVL(A.SEDE_DEL, 'X') = NVL(~~PQRY_PARS98.NOMEOGGEDELI~~, NVL(A.SEDE_DEL, 'X'))) ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM8, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM8, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM8, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_IMP, ");
    SQL.append("  A.NUMERO_IMP, ");
    SQL.append("  A.ANNO_ESIGIBILITA ");
    PAN_VARIAZIONI.SetQuery(PPQRY_VARCOM8, 5, SQL, -1, "");
    PAN_VARIAZIONI.SetQueryDB(PPQRY_VARCOM8, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIONI.SetMasterTable(0, "VARCOM");
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_CAPITOLO1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ARTICOLO, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ANNOIMP, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_NUMEROIMP1, true);
    PAN_VARIAZIONI.AddToSortList(PFL_VARIAZIONI_ANNOESIGIBI2, true);
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

  private void PAN_VARIAZIMPEGN_Init()
  {

    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, "5A05F7BF-52E7-4126-AB3A-342FDAE51D28");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, "CAP CODICE STRUTTURA");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, "08A78180-63EC-499D-8D89-88413361E5B9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, "CODICE PIANO CONTI");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, "F663F8D7-2667-4515-B317-0D1543480297");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, "Capitolo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, "1D172FC8-F9F3-4434-9D19-6800BD553F43");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, " ");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, "538CE1CE-9E0A-4798-9EB8-A62FB34B9674");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, " ");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, "C580AD7F-7B60-4372-8F30-AD074A18D203");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, "Impegno");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, "0D0EF0D4-5FC9-46FF-81D5-FD852A09AF1D");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, " ");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.VIS_HEADNOBORLEF);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, "F5B3C0A1-4F57-47DE-A0FC-7401382A98E4");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, " ");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.VIS_HYPELINKIMMA);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, "B30B4A94-11AE-439B-9FDC-6DFA0052A7EF");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, "Descrizione Impegno");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, "D612FD06-A530-4F07-AFC5-8253AFC158AD");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, "Anno Esigibilità");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, "CA5F51F0-19BE-4899-8491-7F983A6E2442");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, "Anno Entrata");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, "93A66AE8-CBB3-4F87-8CC1-E5827D225758");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, "Importo");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, "E51368A6-6D10-464C-883D-69AE6B87A3A7");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, "VARIMP PROGRESSIVO");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, "C399ED13-B06C-4B04-A859-53B117130CD8");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, "IMP PROGR UNITA ORGANIZZATIVA");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, "51D59E81-3993-4DE6-A04A-08F822610699");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, "TIPO VAR");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.VIS_NORMFIELPADR);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAZIMPEGN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, "62D03025-12CD-4C72-9F17-A0122772B5C9");
    PAN_VARIAZIMPEGN.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAZIMPEGN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, "");
    PAN_VARIAZIMPEGN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAZIMPEGN.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_VARIAZIMPEGN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_LIST, 148);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_LIST, "CP. COD. STR.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPCODICSTRU, MyGlb.PANEL_FORM, "CAP COD. STRUTTURA");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CAPCODICSTRU, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CAPCODICSTRU, PPQRY_VARIAZIMPEG4, "A.CODICE_STRUTTURA", "NOMOGGCACOST", 5, 10, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_LIST, 4, 244, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_LIST, 2);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_LIST, "CODICE PIANO CONTI");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_FORM, 4, 28, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CODIPIANCONT, MyGlb.PANEL_FORM, "CODICE PIANO CONTI");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CODIPIANCONT, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CODIPIANCONT, PPQRY_VARIAZIMPEG4, "A.NOMOGGCOPICO", "NOMOGGCOPICO", 9, 500, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_CAPITOLO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_CAPITOLO, PPQRY_VARIAZIMPEG4, "A.CAPITOLO", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_LIST, 128, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_LIST, 116);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPARTICO, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_VARIMPARTICO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_VARIMPARTICO, PPQRY_VARIAZIMPEG4, "A.ARTICOLO", "NOMOGGVARART", 1, 2, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_LIST, 152, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_FORM, 4, 316, 588, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOCAPITOLO, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_INFOCAPITOLO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_INFOCAPITOLO, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_INFOCAPITOLO, PPQRY_VARIAZIMPEG4, "", "INFOCAPITOLO", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOCAPITOLO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOCAPITOLO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOCAPITOLO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 172, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_LIST, "Impegno");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_NUMEROIMP, MyGlb.PANEL_FORM, "Impegno");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_NUMEROIMP, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_NUMEROIMP, PPQRY_VARIAZIMPEG4, "A.NUMERO_IMP", "NOMOGGNUMIMP", 1, 5, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_LIST, 232, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMANNOIMP, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_VARIMANNOIMP, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_VARIMANNOIMP, PPQRY_VARIAZIMPEG4, "A.ANNO_IMP", "NOMOGGVAANIM", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 272, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 88);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_LIST, " ");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 4, 340, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 88);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_INFOIMPEGNO, MyGlb.PANEL_FORM, " ");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_INFOIMPEGNO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldUnbound(PFL_VARIAZIMPEGN_INFOIMPEGNO, true);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_INFOIMPEGNO, PPQRY_VARIAZIMPEG4, "", "INFOIMPEGNO", 5, 99, 0, -13997);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMPEGNO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMPEGNO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_VARIAZIMPEGN.SetValueListItem(PFL_VARIAZIMPEGN_INFOIMPEGNO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_LIST, 292, 36, 180, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione Impegno");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_FORM, 4, 148, 432, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione Impegno");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_IMPDESCRIZIO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_IMPDESCRIZIO, PPQRY_VARIAZIMPEG4, "A.DESCRIZIONE", "NOMOGGIMPDES", 5, 140, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_LIST, 472, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_LIST, 160);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_LIST, "Anno Esigibilità");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_FORM, 4, 196, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOESIGIBIL, MyGlb.PANEL_FORM, "Anno Esigibilità");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ANNOESIGIBIL, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ANNOESIGIBIL, PPQRY_VARIAZIMPEG4, "A.ANNO_ESIGIBILITA", "NOMOGGANNESI", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, 536, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, 84);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_LIST, "Anno Entrata");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, 4, 364, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, 84);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_ANNOENTRATA, MyGlb.PANEL_FORM, "Anno Entrata");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_ANNOENTRATA, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_ANNOENTRATA, PPQRY_VARIAZIMPEG4, "A.NOMOGGANNENT", "NOMOGGANNENT", 1, 4, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 600, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 112);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_IMPORTO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_IMPORTO, PPQRY_VARIAZIMPEG4, "A.IMPORTO", "NOMEOGGEIMPO", 3, 14, 2, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_LIST, 596, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_LIST, 136);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_LIST, "VAR. PROG.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_FORM, 4, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_VARIMPPROGRE, MyGlb.PANEL_FORM, "VAR. PROGRESSIVO");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_VARIMPPROGRE, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_VARIMPPROGRE, PPQRY_VARIAZIMPEG4, "A.PROGRESSIVO", "NOMOGGVARPRO", 3, 10, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_LIST, 596, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_LIST, 208);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_LIST, "I. P. U. OR.");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_FORM, 4, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_IMPPROUNIORG, MyGlb.PANEL_FORM, "IMP PR. UN. ORGANIZ.");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_IMPPROUNIORG, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_IMPPROUNIORG, PPQRY_VARIAZIMPEG4, "A.PROGR_UNITA_ORGANIZZATIVA", "NOOGIMPRUNOR", 1, 8, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, 600, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, 64);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_LIST, "TIPO VAR");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, 128);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVAR, MyGlb.PANEL_FORM, "TIPO VAR");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TIPOVAR, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TIPOVAR, PPQRY_VARIAZIMPEG4, "A.NOMOGGTIPVAR", "NOMOGGTIPVAR", 1, 2, 0, -13997);
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_LIST, 708, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_LIST, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_VARIAZIMPEGN.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 292, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAZIMPEGN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_FORM, 108);
    PAN_VARIAZIMPEGN.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAZIMPEGN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAZIMPEGN_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAZIMPEGN.SetFieldPage(PFL_VARIAZIMPEGN_TIPOVARIAZIO, -1, -1);
    PAN_VARIAZIMPEGN.SetFieldPanel(PFL_VARIAZIMPEGN_TIPOVARIAZIO, PPQRY_T55, "A.DESCRIZIONE", "T55DESCRIZIO", 5, 40, 0, -13997);
  }

  private void PAN_VARIAZIMPEGN_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAZIMPEGN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPVAR~~) ");
    PAN_VARIAZIMPEGN.SetQuery(PPQRY_T55, 0, SQL, -1, "");
    PAN_VARIAZIMPEGN.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAZIMPEGN.SetMasterTable(PPQRY_T55, "T55");
    PAN_VARIAZIMPEGN.SetIMDB(IMDB, "PQRY_VARIAZIMPEG4", true);
    PAN_VARIAZIMPEGN.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_VARIAZIMPEGN.SetQueryIMDB(PPQRY_VARIAZIMPEG4, IMDBDef13.PQRY_VARIAZIMPEG4_RS, IMDBDef4.TBL_VARIAZIMPEG5);
    JustLoaded = true;
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_CAPCODICSTRU, IMDBDef4.FLD_VARIAZIMPEG5_CODICE_STRUTTURA);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_CODIPIANCONT, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGCOPICO);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_CAPITOLO, IMDBDef4.FLD_VARIAZIMPEG5_CAPITOLO);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_VARIMPARTICO, IMDBDef4.FLD_VARIAZIMPEG5_ARTICOLO);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_NUMEROIMP, IMDBDef4.FLD_VARIAZIMPEG5_NUMERO_IMP);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_VARIMANNOIMP, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_IMP);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_IMPDESCRIZIO, IMDBDef4.FLD_VARIAZIMPEG5_DESCRIZIONE);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_ANNOESIGIBIL, IMDBDef4.FLD_VARIAZIMPEG5_ANNO_ESIGIBILITA);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_ANNOENTRATA, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGANNENT);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_IMPORTO, IMDBDef4.FLD_VARIAZIMPEG5_IMPORTO);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_VARIMPPROGRE, IMDBDef4.FLD_VARIAZIMPEG5_PROGRESSIVO);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_IMPPROUNIORG, IMDBDef4.FLD_VARIAZIMPEG5_PROGR_UNITA_ORGANIZZATIVA);
    PAN_VARIAZIMPEGN.SetFieldPrimaryIndex(PFL_VARIAZIMPEGN_TIPOVAR, IMDBDef4.FLD_VARIAZIMPEG5_NOMOGGTIPVAR);
    PAN_VARIAZIMPEGN.SetMasterTable(0, "VARIAZIMPEG5");
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_CAPITOLO, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_VARIMPARTICO, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_VARIMANNOIMP, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_NUMEROIMP, true);
    PAN_VARIAZIMPEGN.AddToSortList(PFL_VARIAZIMPEGN_ANNOESIGIBIL, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAZIMPEGN.Status() == 2)
    {
      int oldListQBE = PAN_VARIAZIMPEGN.iUseListQBE;
      PAN_VARIAZIMPEGN.iUseListQBE = 0;
      PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAZIMPEGN.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAZIMPEGN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_DynamicProperties();
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIAZIONI) PAN_VARIAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VARIAZIMPEGN) PAN_VARIAZIMPEGN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
